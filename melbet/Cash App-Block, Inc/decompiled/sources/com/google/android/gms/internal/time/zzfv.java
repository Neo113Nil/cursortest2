package com.google.android.gms.internal.time;

import android.os.Build;
import dalvik.system.VMStack;

/* loaded from: classes4.dex */
public final class zzfv extends zzfp {
    public static final zzdg zzc;

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            zzbz.class.getName().equals(zzq());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        zzc = new zzdg(8);
    }

    public static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
