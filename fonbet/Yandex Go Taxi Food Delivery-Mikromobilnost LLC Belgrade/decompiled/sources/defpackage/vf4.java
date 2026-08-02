package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class vf4 implements e1k {
    public uzd a;
    public zq60 b;
    public final /* synthetic */ wf4 c;

    public vf4(wf4 wf4Var, uzd uzdVar, zq60 zq60Var) {
        this.c = wf4Var;
        this.a = uzdVar;
        this.b = zq60Var;
        if (zq60Var != null) {
            zq60Var.b(this);
        }
        uzd uzdVar2 = this.a;
        if (uzdVar2 != null) {
            uzdVar2.d(wf4Var.a());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z83.g(null, this.c.c, Looper.myLooper());
        zq60 zq60Var = this.b;
        if (zq60Var != null) {
            zq60Var.d(this);
        }
        this.b = null;
        this.a = null;
    }
}
