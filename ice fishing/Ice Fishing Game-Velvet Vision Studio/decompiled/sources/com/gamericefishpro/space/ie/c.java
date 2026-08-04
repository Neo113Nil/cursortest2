package com.gamericefishpro.space.ie;

import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void scheduleTrigger(TimerTask timerTask, String triggerId, long j) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        com.gamericefishpro.space.od.b.debug$default("scheduleTrigger: " + triggerId + " delay: " + j, null, 2, null);
        new Timer(com.gamericefishpro.space.m5.a.u("trigger_timer:", triggerId)).schedule(timerTask, j);
    }
}
