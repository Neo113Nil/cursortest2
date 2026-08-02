package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileExtKt$readTextSafe$1;
import com.datadog.android.core.internal.persistence.file.FileMover$delete$1;
import com.squareup.cash.clientroutes.ClientRoute;
import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class zzhk {
    public static final boolean canReadSafe(File file, InternalLogger internalLogger) {
        internalLogger.getClass();
        Boolean bool = Boolean.FALSE;
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        try {
            bool = Boolean.valueOf(file.canRead());
        } catch (SecurityException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 4), e, 48);
        } catch (Exception e2) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 5), e2, 48);
        }
        return bool.booleanValue();
    }

    public static final boolean canWriteSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        Boolean bool = Boolean.FALSE;
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        try {
            bool = Boolean.valueOf(file.canWrite());
        } catch (SecurityException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 4), e, 48);
        } catch (Exception e2) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 5), e2, 48);
        }
        return bool.booleanValue();
    }

    public static final boolean deleteSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        Boolean bool = Boolean.FALSE;
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        try {
            bool = Boolean.valueOf(file.delete());
        } catch (SecurityException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 4), e, 48);
        } catch (Exception e2) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 5), e2, 48);
        }
        return bool.booleanValue();
    }

    public static final boolean existsSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        Boolean bool = Boolean.FALSE;
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        try {
            bool = Boolean.valueOf(file.exists());
        } catch (SecurityException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 4), e, 48);
        } catch (Exception e2) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 5), e2, 48);
        }
        return bool.booleanValue();
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLocalBrandProfileQrOrdering.deepLinkSpecs;
    }

    public static final boolean isDirectorySafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        Boolean bool = Boolean.FALSE;
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        try {
            bool = Boolean.valueOf(file.isDirectory());
        } catch (SecurityException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 4), e, 48);
        } catch (Exception e2) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 5), e2, 48);
        }
        return bool.booleanValue();
    }

    public static final long lengthSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        Long l = 0L;
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        try {
            l = Long.valueOf(file.length());
        } catch (SecurityException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 4), e, 48);
        } catch (Exception e2) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 5), e2, 48);
        }
        return l.longValue();
    }

    public static final File[] listFilesSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        try {
            return file.listFiles();
        } catch (SecurityException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 4), e, 48);
            return null;
        } catch (Exception e2) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 5), e2, 48);
            return null;
        }
    }

    public static final boolean mkdirsSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        Boolean bool = Boolean.FALSE;
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        try {
            bool = Boolean.valueOf(file.mkdirs());
        } catch (SecurityException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 4), e, 48);
        } catch (Exception e2) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 5), e2, 48);
        }
        return bool.booleanValue();
    }

    public static final String readTextSafe(File file, Charset charset, InternalLogger internalLogger) {
        charset.getClass();
        internalLogger.getClass();
        if (existsSafe(file, internalLogger) && canReadSafe(file, internalLogger)) {
            return (String) safeCall(file, null, internalLogger, new FileExtKt$readTextSafe$1(0, charset));
        }
        return null;
    }

    public static final Object safeCall(File file, Boolean bool, InternalLogger internalLogger, Function1 function1) {
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        try {
            return function1.invoke(file);
        } catch (SecurityException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 4), e, 48);
            return bool;
        } catch (Exception e2) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, 5), e2, 48);
            return bool;
        }
    }
}
