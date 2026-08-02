package defpackage;

import android.os.Looper;

/* loaded from: classes8.dex */
public final class qti0 {
    public final Looper a;
    public final zq60 b;
    public final sq60 c;
    public boolean d;

    public qti0(Looper looper) {
        zq60 zq60Var = new zq60();
        this.b = zq60Var;
        this.c = new sq60(zq60Var);
        z83.g(null, looper, Looper.myLooper());
        this.a = looper;
    }
}
