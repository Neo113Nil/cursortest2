package com.onesignal.inAppMessages.internal.triggers.impl;

import java.util.Timer;
import java.util.TimerTask;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void scheduleTrigger(TimerTask timerTask, String str, long j3) {
        j.e(str, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("scheduleTrigger: " + str + " delay: " + j3, null, 2, null);
        new Timer("trigger_timer:".concat(str)).schedule(timerTask, j3);
    }
}
