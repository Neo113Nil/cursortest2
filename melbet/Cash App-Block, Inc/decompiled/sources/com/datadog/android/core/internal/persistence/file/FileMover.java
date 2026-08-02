package com.datadog.android.core.internal.persistence.file;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.FilesKt__UtilsKt;

/* loaded from: classes4.dex */
public final class FileMover {
    public final InternalLogger internalLogger;

    public FileMover(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    public final boolean delete(File file) {
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        file.getClass();
        try {
            return FilesKt__UtilsKt.deleteRecursively(file);
        } catch (FileNotFoundException e) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 0), e, 48);
            return false;
        } catch (SecurityException e2) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 6), e2, 48);
            return false;
        }
    }
}
