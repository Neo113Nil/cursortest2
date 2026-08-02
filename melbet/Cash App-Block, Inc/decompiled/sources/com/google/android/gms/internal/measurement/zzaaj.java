package com.google.android.gms.internal.measurement;

import android.os.Build;
import com.google.android.gms.dynamite.zzf;
import dalvik.system.VMStack;

/* loaded from: classes.dex */
public final class zzaaj extends zzaad {
    public static final zzf zzc;

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            zzjx.class.getName().equals(zzq());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        zzc = new zzf(11);
    }

    public static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
