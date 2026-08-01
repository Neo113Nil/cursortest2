package com.onesignal.common.threading;

import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class d {
    public static final d INSTANCE = new d();
    private static volatile boolean useBackgroundThreading;

    private d() {
    }

    public final boolean getUseBackgroundThreading() {
        return useBackgroundThreading;
    }

    public final void setUseBackgroundThreading(boolean z3) {
        useBackgroundThreading = z3;
    }

    public final void updateUseBackgroundThreading(boolean z3, String source) {
        h.e(source, "source");
        boolean z6 = useBackgroundThreading;
        useBackgroundThreading = z3;
        if (z6 != z3) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignal: ThreadingMode changed to useBackgroundThreading=" + z3 + " (source=" + source + ')', null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: ThreadingMode unchanged (useBackgroundThreading=" + z3 + ", source=" + source + ')', null, 2, null);
    }
}
