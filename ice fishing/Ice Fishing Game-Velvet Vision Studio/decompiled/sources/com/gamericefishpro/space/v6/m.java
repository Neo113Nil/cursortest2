package com.gamericefishpro.space.v6;

import android.content.Context;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final String a;

    static {
        String strD = com.gamericefishpro.space.l6.q.d("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(strD, "tagWithPrefix(\"WakeLocks\")");
        a = strD;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strU = com.gamericefishpro.space.m5.a.u("WorkManager: ", tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strU);
        synchronized (n.a) {
        }
        Intrinsics.checkNotNullExpressionValue(wakeLock, "wakeLock");
        return wakeLock;
    }
}
