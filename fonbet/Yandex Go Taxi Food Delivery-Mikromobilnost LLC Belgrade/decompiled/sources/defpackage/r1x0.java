package defpackage;

import android.os.Build;

/* loaded from: classes8.dex */
public abstract class r1x0 {
    public static final String a;

    static {
        String str = Build.FINGERPRINT;
        a = str.substring(0, Math.min(str.length(), 128));
    }
}
