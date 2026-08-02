package defpackage;

import android.os.Looper;

/* loaded from: classes10.dex */
public final class yyc0 {
    public final xyc0 a;
    public final wyc0 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public yyc0(wyc0 wyc0Var, xyc0 xyc0Var, a9z0 a9z0Var, int i, Looper looper) {
        this.b = wyc0Var;
        this.a = xyc0Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        d6z.x(!this.f);
        this.f = true;
        this.b.sendMessage(this);
    }

    public final void c(Object obj) {
        d6z.x(!this.f);
        this.d = obj;
    }

    public final void d(int i) {
        d6z.x(!this.f);
        this.c = i;
    }
}
