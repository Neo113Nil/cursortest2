package com.datadog.android.core.internal.persistence.file.batch;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.metrics.BatchClosedMetadata;
import com.datadog.android.core.internal.metrics.MetricsDispatcher;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.persistence.file.FileMover$delete$1;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.squareup.util.Strings;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class BatchFileOrchestrator implements FileOrchestrator {
    public final FilePersistenceConfig config;
    public final BatchFileFilter fileFilter;
    public final InternalLogger internalLogger;
    public long lastCleanupTimestamp;
    public long lastFileAccessTimestamp;
    public final MetricsDispatcher metricsDispatcher;
    public final AtomicInteger pendingFiles;
    public File previousFile;
    public long previousFileItemCount;
    public final long recentReadDelayMs;
    public final long recentWriteDelayMs;
    public final File rootDir;
    public final Strings timeProvider;

    public final class BatchFileFilter implements FileFilter {
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            if (file == null) {
                return false;
            }
            String name = file.getName();
            name.getClass();
            return StringsKt.toLongOrNull(10, name) != null;
        }
    }

    public BatchFileOrchestrator(File file, FilePersistenceConfig filePersistenceConfig, InternalLogger internalLogger, MetricsDispatcher metricsDispatcher, Strings strings) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        long j = filePersistenceConfig.recentDelayMs;
        internalLogger.getClass();
        metricsDispatcher.getClass();
        strings.getClass();
        this.rootDir = file;
        this.config = filePersistenceConfig;
        this.internalLogger = internalLogger;
        this.metricsDispatcher = metricsDispatcher;
        this.timeProvider = strings;
        this.pendingFiles = atomicInteger;
        this.fileFilter = new BatchFileFilter();
        double d = j;
        this.recentReadDelayMs = MathKt__MathJVMKt.roundToLong(1.05d * d);
        this.recentWriteDelayMs = MathKt__MathJVMKt.roundToLong(d * 0.95d);
    }

    public static File getMetadata(File file) {
        return new File(Recorder$$ExternalSyntheticOutline2.m$1(file.getPath(), "_metadata"));
    }

    public final long deleteFile(File file, boolean z) {
        InternalLogger internalLogger = this.internalLogger;
        if (!zzhk.existsSafe(file, internalLogger)) {
            return 0L;
        }
        long lengthSafe = zzhk.lengthSafe(file, internalLogger);
        if (!zzhk.deleteSafe(file, internalLogger)) {
            return 0L;
        }
        if (z) {
            this.metricsDispatcher.sendBatchDeletedMetric(file, RemovalReason.Purged.INSTANCE, this.pendingFiles.decrementAndGet());
        }
        return lengthSafe;
    }

    public final ArrayList deleteObsoleteFiles(List list) {
        this.timeProvider.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.config.oldFileThreshold;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            name.getClass();
            Long longOrNull = StringsKt.toLongOrNull(10, name);
            if ((longOrNull != null ? longOrNull.longValue() : 0L) < currentTimeMillis) {
                InternalLogger internalLogger = this.internalLogger;
                if (zzhk.deleteSafe(file, internalLogger)) {
                    this.metricsDispatcher.sendBatchDeletedMetric(file, RemovalReason.Purged.INSTANCE$2, this.pendingFiles.decrementAndGet());
                }
                if (zzhk.existsSafe(getMetadata(file), internalLogger)) {
                    zzhk.deleteSafe(getMetadata(file), internalLogger);
                }
                file = null;
            }
            if (file != null) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final File getMetadataFile(File file) {
        boolean areEqual = Intrinsics.areEqual(file.getParent(), this.rootDir.getPath());
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        if (!areEqual) {
            DBUtil.log$default(this.internalLogger, 2, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new ViewRegistryKt$buildView$1$2$1$1(9, file, this), null, 56);
        }
        String name = file.getName();
        name.getClass();
        if (StringsKt.toLongOrNull(10, name) != null) {
            return getMetadata(file);
        }
        DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 17), null, 56);
        return null;
    }

    public final File getReadableFile(Set set) {
        set.getClass();
        Object obj = null;
        if (!isRootDirValid()) {
            return null;
        }
        ArrayList deleteObsoleteFiles = deleteObsoleteFiles(CollectionsKt.sorted(listBatchFiles()));
        this.timeProvider.getClass();
        this.lastCleanupTimestamp = System.currentTimeMillis();
        this.pendingFiles.set(deleteObsoleteFiles.size());
        Iterator it = deleteObsoleteFiles.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            File file = (File) next;
            if (!set.contains(file) && !isFileRecent(file, this.recentReadDelayMs)) {
                obj = next;
                break;
            }
        }
        return (File) obj;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final File getRootDir() {
        if (isRootDirValid()) {
            return this.rootDir;
        }
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final File getWritableFile() {
        File file = null;
        if (!isRootDirValid()) {
            return null;
        }
        this.timeProvider.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.lastCleanupTimestamp;
        FilePersistenceConfig filePersistenceConfig = this.config;
        long j = filePersistenceConfig.cleanupFrequencyThreshold;
        InternalLogger internalLogger = this.internalLogger;
        if (currentTimeMillis > j) {
            ArrayList deleteObsoleteFiles = deleteObsoleteFiles(listBatchFiles());
            Iterator it = deleteObsoleteFiles.iterator();
            final long j2 = 0;
            while (it.hasNext()) {
                j2 += zzhk.lengthSafe((File) it.next(), internalLogger);
            }
            final long j3 = filePersistenceConfig.maxDiskSpace;
            final long j4 = j2 - j3;
            if (j4 > 0) {
                DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$freeSpaceIfNeeded$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return String.format(Locale.US, "Too much disk space used (%d/%d): cleaning up to free %d bytes…", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}, 3));
                    }
                }, null, 56);
                for (File file2 : CollectionsKt.sorted(deleteObsoleteFiles)) {
                    if (j4 > 0) {
                        j4 = (j4 - deleteFile(file2, true)) - deleteFile(getMetadata(file2), false);
                    }
                }
            }
            this.lastCleanupTimestamp = System.currentTimeMillis();
        }
        File file3 = (File) CollectionsKt.maxOrNull((Iterable) listBatchFiles());
        if (file3 != null) {
            File file4 = this.previousFile;
            long j5 = this.previousFileItemCount;
            if (Intrinsics.areEqual(file4, file3)) {
                boolean isFileRecent = isFileRecent(file3, this.recentWriteDelayMs);
                boolean z = zzhk.lengthSafe(file3, internalLogger) < filePersistenceConfig.maxBatchSize;
                boolean z2 = j5 < ((long) filePersistenceConfig.maxItemsPerBatch);
                if (isFileRecent && z && z2) {
                    this.previousFileItemCount = j5 + 1;
                    this.lastFileAccessTimestamp = System.currentTimeMillis();
                    file = file3;
                }
            }
        }
        if (file == null) {
            file = new File(this.rootDir, String.valueOf(System.currentTimeMillis()));
            File file5 = this.previousFile;
            long j6 = this.lastFileAccessTimestamp;
            if (file5 != null) {
                this.metricsDispatcher.sendBatchClosedMetric(file5, new BatchClosedMetadata(j6, this.previousFileItemCount));
            }
            this.previousFile = file;
            this.previousFileItemCount = 1L;
            this.lastFileAccessTimestamp = System.currentTimeMillis();
            this.pendingFiles.incrementAndGet();
        }
        return file;
    }

    public final boolean isFileRecent(File file, long j) {
        this.timeProvider.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String name = file.getName();
        name.getClass();
        Long longOrNull = StringsKt.toLongOrNull(name);
        return (longOrNull != null ? longOrNull.longValue() : 0L) >= currentTimeMillis - j;
    }

    public final boolean isRootDirValid() {
        boolean existsSafe = zzhk.existsSafe(this.rootDir, this.internalLogger);
        File file = this.rootDir;
        final int i = 0;
        final int i2 = 1;
        if (existsSafe) {
            if (!file.isDirectory()) {
                DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0(this) { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$1
                    public final /* synthetic */ BatchFileOrchestrator this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.this$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i2;
                        BatchFileOrchestrator batchFileOrchestrator = this.this$0;
                        switch (i3) {
                            case 0:
                                return String.format(Locale.US, "The provided root dir is not writable: %s", Arrays.copyOf(new Object[]{batchFileOrchestrator.rootDir.getPath()}, 1));
                            case 1:
                                return String.format(Locale.US, "The provided root file is not a directory: %s", Arrays.copyOf(new Object[]{batchFileOrchestrator.rootDir.getPath()}, 1));
                            default:
                                return String.format(Locale.US, "The provided root dir can't be created: %s", Arrays.copyOf(new Object[]{batchFileOrchestrator.rootDir.getPath()}, 1));
                        }
                    }
                }, null, 56);
                return false;
            }
            if (zzhk.canWriteSafe(this.rootDir, this.internalLogger)) {
                return true;
            }
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0(this) { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$1
                public final /* synthetic */ BatchFileOrchestrator this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = i;
                    BatchFileOrchestrator batchFileOrchestrator = this.this$0;
                    switch (i3) {
                        case 0:
                            return String.format(Locale.US, "The provided root dir is not writable: %s", Arrays.copyOf(new Object[]{batchFileOrchestrator.rootDir.getPath()}, 1));
                        case 1:
                            return String.format(Locale.US, "The provided root file is not a directory: %s", Arrays.copyOf(new Object[]{batchFileOrchestrator.rootDir.getPath()}, 1));
                        default:
                            return String.format(Locale.US, "The provided root dir can't be created: %s", Arrays.copyOf(new Object[]{batchFileOrchestrator.rootDir.getPath()}, 1));
                    }
                }
            }, null, 56);
            return false;
        }
        synchronized (file) {
            if (zzhk.existsSafe(this.rootDir, this.internalLogger)) {
                return true;
            }
            if (zzhk.mkdirsSafe(this.rootDir, this.internalLogger)) {
                return true;
            }
            final int i3 = 2;
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0(this) { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$1
                public final /* synthetic */ BatchFileOrchestrator this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i32 = i3;
                    BatchFileOrchestrator batchFileOrchestrator = this.this$0;
                    switch (i32) {
                        case 0:
                            return String.format(Locale.US, "The provided root dir is not writable: %s", Arrays.copyOf(new Object[]{batchFileOrchestrator.rootDir.getPath()}, 1));
                        case 1:
                            return String.format(Locale.US, "The provided root file is not a directory: %s", Arrays.copyOf(new Object[]{batchFileOrchestrator.rootDir.getPath()}, 1));
                        default:
                            return String.format(Locale.US, "The provided root dir can't be created: %s", Arrays.copyOf(new Object[]{batchFileOrchestrator.rootDir.getPath()}, 1));
                    }
                }
            }, null, 56);
            return false;
        }
    }

    public final List listBatchFiles() {
        File file = this.rootDir;
        file.getClass();
        BatchFileFilter batchFileFilter = this.fileFilter;
        batchFileFilter.getClass();
        InternalLogger internalLogger = this.internalLogger;
        internalLogger.getClass();
        File[] fileArr = (File[]) zzhk.safeCall(file, null, internalLogger, new BoundsAnimation$animate$1(batchFileFilter, 25));
        if (fileArr == null) {
            fileArr = new File[0];
        }
        return ArraysKt___ArraysKt.toList(fileArr);
    }
}
