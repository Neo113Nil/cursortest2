package com.onesignal.debug.internal.crash;

import android.os.Build;

/* loaded from: classes2.dex */
public final class f {
    public static final f INSTANCE = new f();
    public static final int MIN_SDK_VERSION = 26;
    private static boolean isSupported;

    static {
        isSupported = Build.VERSION.SDK_INT >= 26;
    }

    private f() {
    }

    public final boolean isSupported() {
        return isSupported;
    }

    public final void reset() {
        isSupported = Build.VERSION.SDK_INT >= 26;
    }

    public final void setSupported$com_onesignal_core(boolean z6) {
        isSupported = z6;
    }
}
