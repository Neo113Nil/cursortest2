package com.datadog.android.core.internal.persistence.file;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.FilesKt__FileReadWriteKt;

/* loaded from: classes4.dex */
public final class PlainFileReaderWriter implements FileWriter {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public final InternalLogger internalLogger;

    public PlainFileReaderWriter(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    public static void lockFileAndWriteData(File file, boolean z, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file, z);
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            lock.getClass();
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                lock.release();
            }
        } finally {
        }
    }

    public final Object readData(File file) {
        byte[] bArr = EMPTY_BYTE_ARRAY;
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        try {
            if (!file.exists()) {
                DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 11), null, 56);
                return bArr;
            }
            if (!file.isDirectory()) {
                return FilesKt__FileReadWriteKt.readBytes(file);
            }
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 12), null, 56);
            return bArr;
        } catch (IOException e) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 13), e, 48);
            return bArr;
        } catch (SecurityException e2) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 14), e2, 48);
            return bArr;
        }
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileWriter
    public final boolean writeData(File file, Object obj, boolean z) {
        byte[] bArr = (byte[]) obj;
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        file.getClass();
        bArr.getClass();
        try {
            lockFileAndWriteData(file, z, bArr);
            return true;
        } catch (IOException e) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 15), e, 48);
            return false;
        } catch (SecurityException e2) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 16), e2, 48);
            return false;
        }
    }
}
