package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class cgs {
    public static final long a;

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        a = j;
    }
}
