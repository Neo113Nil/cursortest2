package com.datadog.android.core;

import android.content.Context;
import androidx.room.util.DBUtil;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.core.internal.NoOpInternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.internal.data.upload.DataUploader;
import com.datadog.android.core.internal.data.upload.UploadStatus;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.persistence.BatchData;
import com.datadog.android.core.internal.persistence.BatchId;
import com.datadog.android.core.internal.persistence.Storage;
import com.datadog.android.core.internal.utils.RuntimeUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/datadog/android/core/UploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "UploadNextBatchTask", "dd-sdk-android-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UploadWorker extends Worker {

    public final class UploadNextBatchTask implements Runnable {
        public final SdkFeature feature;
        public final InternalSdkCore sdkCore;
        public final LinkedList taskQueue;

        public UploadNextBatchTask(LinkedList linkedList, InternalSdkCore internalSdkCore, SdkFeature sdkFeature) {
            sdkFeature.getClass();
            this.taskQueue = linkedList;
            this.sdkCore = internalSdkCore;
            this.feature = sdkFeature;
        }

        @Override // java.lang.Runnable
        public final void run() {
            EmptySet emptySet = EmptySet.INSTANCE;
            InternalSdkCore internalSdkCore = this.sdkCore;
            DatadogContext datadogContext = internalSdkCore.getDatadogContext(emptySet);
            if (datadogContext == null) {
                return;
            }
            SdkFeature sdkFeature = this.feature;
            Storage storage = sdkFeature.storage;
            DataUploader dataUploader = sdkFeature.uploader;
            BatchData readNextBatch = storage.readNextBatch();
            if (readNextBatch != null) {
                BatchId batchId = readNextBatch.id;
                UploadStatus upload = dataUploader.upload(datadogContext, readNextBatch.data, readNextBatch.metadata, batchId);
                storage.confirmBatchRead(batchId, new RemovalReason.IntakeCode(upload.code), !upload.shouldRetry);
                if (upload instanceof UploadStatus.Success) {
                    LinkedList linkedList = this.taskQueue;
                    linkedList.offer(new UploadNextBatchTask(linkedList, internalSdkCore, sdkFeature));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result.Success doWork() {
        InternalSdkCore datadog = Datadog.getInstance(getInputData().getString("_dd.sdk.instanceName"));
        InternalSdkCore internalSdkCore = datadog instanceof InternalSdkCore ? datadog : null;
        if (internalSdkCore == null || (internalSdkCore instanceof NoOpInternalSdkCore)) {
            DBUtil.log$default(RuntimeUtilsKt.unboundInternalLogger, 5, InternalLogger.Target.USER, UploadWorker$doWork$1.INSTANCE, null, false, 56);
            return ListenableWorker.Result.success();
        }
        List<SdkFeature> allFeatures = internalSdkCore.getAllFeatures();
        ArrayList arrayList = new ArrayList();
        for (SdkFeature sdkFeature : allFeatures) {
            if (sdkFeature == null) {
                sdkFeature = null;
            }
            if (sdkFeature != null) {
                arrayList.add(sdkFeature);
            }
        }
        List shuffled = CollectionsKt__CollectionsJVMKt.shuffled(arrayList);
        LinkedList linkedList = new LinkedList();
        Iterator it = shuffled.iterator();
        while (it.hasNext()) {
            linkedList.offer(new UploadNextBatchTask(linkedList, internalSdkCore, (SdkFeature) it.next()));
        }
        while (!linkedList.isEmpty()) {
            UploadNextBatchTask uploadNextBatchTask = (UploadNextBatchTask) linkedList.poll();
            if (uploadNextBatchTask != null) {
                uploadNextBatchTask.run();
            }
        }
        return ListenableWorker.Result.success();
    }
}
