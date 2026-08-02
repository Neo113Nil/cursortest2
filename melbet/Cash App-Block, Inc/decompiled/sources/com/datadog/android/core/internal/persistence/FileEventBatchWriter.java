package com.datadog.android.core.internal.persistence;

import androidx.room.util.DBUtil;
import app.cash.trifle.KeyHandle$keyPair$2;
import app.cash.zipline.loader.ZiplineLoader;
import com.android.volley.toolbox.HurlStack;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.core.internal.persistence.file.FileWriter;
import com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter;
import com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes4.dex */
public final class FileEventBatchWriter implements EventBatchWriter {
    public final Lazy batchFile$delegate;
    public final ZiplineLoader batchWriteEventListener;
    public final FileWriter eventsWriter;
    public final FileOrchestrator fileOrchestrator;
    public final FilePersistenceConfig filePersistenceConfig;
    public final InternalLogger internalLogger;

    public FileEventBatchWriter(FileOrchestrator fileOrchestrator, PlainBatchFileReaderWriter plainBatchFileReaderWriter, PlainFileReaderWriter plainFileReaderWriter, FilePersistenceConfig filePersistenceConfig, ZiplineLoader ziplineLoader, InternalLogger internalLogger) {
        plainBatchFileReaderWriter.getClass();
        plainFileReaderWriter.getClass();
        filePersistenceConfig.getClass();
        internalLogger.getClass();
        this.fileOrchestrator = fileOrchestrator;
        this.eventsWriter = plainBatchFileReaderWriter;
        this.filePersistenceConfig = filePersistenceConfig;
        this.batchWriteEventListener = ziplineLoader;
        this.internalLogger = internalLogger;
        this.batchFile$delegate = LazyKt.lazy(new KeyHandle$keyPair$2(this, 14));
    }

    @Override // com.datadog.android.api.storage.EventBatchWriter
    public final boolean write(RawBatchEvent rawBatchEvent, int i) {
        byte[] bArr = rawBatchEvent.data;
        if (i == 0) {
            throw null;
        }
        Lazy lazy = this.batchFile$delegate;
        File file = (File) lazy.getValue();
        File file2 = (File) lazy.getValue();
        if (file2 != null) {
            this.fileOrchestrator.getMetadataFile(file2);
        }
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (file == null) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), FileEventBatchWriter$write$1.INSTANCE, null, 56);
            return false;
        }
        if (bArr.length == 0) {
            return true;
        }
        int length = bArr.length;
        if (length > this.filePersistenceConfig.maxItemSize) {
            DBUtil.log$default(this.internalLogger, 5, target, new FileEventBatchWriter$checkEventSize$1(length, this, 0), null, false, 56);
            return false;
        }
        if (!this.eventsWriter.writeData(file, rawBatchEvent, true)) {
            return false;
        }
        int length2 = bArr.length;
        ZiplineLoader ziplineLoader = this.batchWriteEventListener;
        HurlStack hurlStack = (HurlStack) ziplineLoader.embeddedFetcher;
        String str = (String) ziplineLoader.concurrentDownloadsSemaphore;
        hurlStack.getClass();
        str.getClass();
        hurlStack.sendBenchmarkUploads(str, "android.benchmark.bytes_written");
        return true;
    }
}
