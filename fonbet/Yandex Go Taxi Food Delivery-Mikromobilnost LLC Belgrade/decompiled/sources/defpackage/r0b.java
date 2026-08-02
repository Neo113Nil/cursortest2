package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class r0b {
    public final o1b0 a;
    public final n5t0 b;
    public final Looper c;
    public final k020 d;
    public x08 e;

    public r0b(o1b0 o1b0Var, n5t0 n5t0Var, Looper looper, k020 k020Var) {
        this.a = o1b0Var;
        this.b = n5t0Var;
        this.c = looper;
        this.d = k020Var;
        z83.g(null, looper, Looper.myLooper());
    }

    public final void a() {
        l020 C = this.d.C();
        try {
            C.B(this.a.b, true);
            C.s();
            ooc.g(C, null);
        } finally {
        }
    }
}
