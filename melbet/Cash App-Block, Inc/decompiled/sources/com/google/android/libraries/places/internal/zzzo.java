package com.google.android.libraries.places.internal;

import android.os.Build;
import dalvik.system.VMStack;

/* loaded from: classes4.dex */
public final class zzzo extends zzzi {
    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            zzib.class.getName().equals(zzq());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
    }

    public static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
