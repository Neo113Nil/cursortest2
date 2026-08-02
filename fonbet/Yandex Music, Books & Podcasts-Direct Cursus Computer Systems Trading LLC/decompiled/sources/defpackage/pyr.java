package defpackage;

import android.os.Build;

/* loaded from: classes5.dex */
public abstract class pyr {
    public static final String a;

    static {
        String str = Build.FINGERPRINT;
        str.getClass();
        a = str.substring(0, Math.min(str.length(), 128));
    }
}
