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

    public final void setUseBackgroundThreading(boolean z6) {
        useBackgroundThreading = z6;
    }

    public final void updateUseBackgroundThreading(boolean z6, String source) {
        h.e(source, "source");
        boolean z9 = useBackgroundThreading;
        useBackgroundThreading = z6;
        if (z9 != z6) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignal: ThreadingMode changed to useBackgroundThreading=" + z6 + " (source=" + source + ')', null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: ThreadingMode unchanged (useBackgroundThreading=" + z6 + ", source=" + source + ')', null, 2, null);
    }
}
