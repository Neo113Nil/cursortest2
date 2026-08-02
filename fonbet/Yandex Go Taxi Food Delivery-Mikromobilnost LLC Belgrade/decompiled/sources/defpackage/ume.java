package defpackage;

import android.os.Build;

/* loaded from: classes15.dex */
public final class ume {
    public final rz10 a;

    public ume(rz10 rz10Var) {
        this.a = rz10Var;
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        this.a.getClass();
        return false;
    }
}
