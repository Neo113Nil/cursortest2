package com.datadog.android.core.internal.data.upload;

import coil3.svg.internal.AndroidSvg;
import com.android.volley.toolbox.HurlStack;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.ContextProvider;
import com.datadog.android.core.internal.configuration.DataUploadConfiguration;
import com.datadog.android.core.internal.data.upload.UploadStatus;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.net.info.NetworkInfoProvider;
import com.datadog.android.core.internal.persistence.BatchData;
import com.datadog.android.core.internal.persistence.BatchId;
import com.datadog.android.core.internal.persistence.Storage;
import com.datadog.android.core.internal.system.SystemInfo;
import com.datadog.android.core.internal.system.SystemInfoProvider;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.collections.EmptySet;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes4.dex */
public final class DataUploadRunnable implements Runnable {
    public final HurlStack benchmarkUploads;
    public final ContextProvider contextProvider;
    public final DataUploader dataUploader;
    public final String featureName;
    public final InternalLogger internalLogger;
    public final int maxBatchesPerJob;
    public final NetworkInfoProvider networkInfoProvider;
    public final Storage storage;
    public final SystemInfoProvider systemInfoProvider;
    public final ScheduledThreadPoolExecutor threadPoolExecutor;
    public final AndroidSvg uploadSchedulerStrategy;

    public DataUploadRunnable(String str, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, Storage storage, DataUploader dataUploader, ContextProvider contextProvider, NetworkInfoProvider networkInfoProvider, SystemInfoProvider systemInfoProvider, AndroidSvg androidSvg, int i, InternalLogger internalLogger) {
        HurlStack hurlStack = new HurlStack(24);
        str.getClass();
        storage.getClass();
        dataUploader.getClass();
        contextProvider.getClass();
        networkInfoProvider.getClass();
        systemInfoProvider.getClass();
        internalLogger.getClass();
        this.featureName = str;
        this.threadPoolExecutor = scheduledThreadPoolExecutor;
        this.storage = storage;
        this.dataUploader = dataUploader;
        this.contextProvider = contextProvider;
        this.networkInfoProvider = networkInfoProvider;
        this.systemInfoProvider = systemInfoProvider;
        this.uploadSchedulerStrategy = androidSvg;
        this.maxBatchesPerJob = i;
        this.internalLogger = internalLogger;
        this.benchmarkUploads = hurlStack;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UploadStatus uploadStatus;
        Throwable th;
        DataUploadConfiguration dataUploadConfiguration;
        Object obj;
        Long l;
        long min;
        Object putIfAbsent;
        int i = this.networkInfoProvider.getLatestNetworkInfo().connectivity;
        String str = this.featureName;
        int i2 = 0;
        if (i != 1) {
            SystemInfo latestSystemInfo = this.systemInfoProvider.getLatestSystemInfo();
            if ((latestSystemInfo.batteryFullOrCharging || latestSystemInfo.onExternalPowerSource || latestSystemInfo.batteryLevel > 10) && !latestSystemInfo.powerSaveMode) {
                DatadogContext context = this.contextProvider.getContext(EmptySet.INSTANCE);
                int i3 = this.maxBatchesPerJob;
                do {
                    HurlStack hurlStack = this.benchmarkUploads;
                    hurlStack.getClass();
                    str.getClass();
                    hurlStack.sendBenchmarkUploads(str, "android.benchmark.upload_count");
                    i3--;
                    Storage storage = this.storage;
                    BatchData readNextBatch = storage.readNextBatch();
                    if (readNextBatch != null) {
                        BatchId batchId = readNextBatch.id;
                        List list = readNextBatch.data;
                        uploadStatus = this.dataUploader.upload(context, list, readNextBatch.metadata, batchId);
                        if (uploadStatus instanceof UploadStatus.Success) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                int length = ((RawBatchEvent) it.next()).data.length;
                            }
                            hurlStack.sendBenchmarkUploads(str, "android.benchmark.bytes_uploaded");
                        }
                        storage.confirmBatchRead(batchId, uploadStatus instanceof UploadStatus.RequestCreationError ? RemovalReason.Purged.INSTANCE$1 : new RemovalReason.IntakeCode(uploadStatus.code), !uploadStatus.shouldRetry);
                    } else {
                        uploadStatus = null;
                    }
                    if (uploadStatus != null) {
                        i2++;
                    }
                    if (i3 <= 0) {
                        break;
                    }
                } while (uploadStatus instanceof UploadStatus.Success);
                Integer valueOf = uploadStatus == null ? Integer.valueOf(uploadStatus.code) : null;
                th = uploadStatus != null ? uploadStatus.throwable : null;
                AndroidSvg androidSvg = this.uploadSchedulerStrategy;
                dataUploadConfiguration = (DataUploadConfiguration) androidSvg.svg;
                str.getClass();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) androidSvg.renderOptions;
                obj = concurrentHashMap.get(str);
                if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = Long.valueOf(dataUploadConfiguration.defaultDelayMs)))) != null) {
                    obj = putIfAbsent;
                }
                l = (Long) obj;
                if (i2 > 0 || th != null || valueOf == null || valueOf.intValue() != 202) {
                    min = !(th instanceof IOException) ? 60000L : Math.min(dataUploadConfiguration.maxDelayMs, MathKt__MathJVMKt.roundToLong(l.longValue() * 1.1d));
                } else {
                    min = dataUploadConfiguration.minDelayMs;
                }
                long j = min;
                concurrentHashMap.put(str, Long.valueOf(j));
                this.threadPoolExecutor.remove(this);
                zzho.scheduleSafe(this.threadPoolExecutor, str.concat(": data upload"), j, this.internalLogger, this);
            }
        }
        uploadStatus = null;
        if (uploadStatus == null) {
        }
        if (uploadStatus != null) {
        }
        AndroidSvg androidSvg2 = this.uploadSchedulerStrategy;
        dataUploadConfiguration = (DataUploadConfiguration) androidSvg2.svg;
        str.getClass();
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) androidSvg2.renderOptions;
        obj = concurrentHashMap2.get(str);
        if (obj == null) {
            obj = putIfAbsent;
        }
        l = (Long) obj;
        if (i2 > 0) {
        }
        if (!(th instanceof IOException)) {
        }
        long j2 = min;
        concurrentHashMap2.put(str, Long.valueOf(j2));
        this.threadPoolExecutor.remove(this);
        zzho.scheduleSafe(this.threadPoolExecutor, str.concat(": data upload"), j2, this.internalLogger, this);
    }
}
