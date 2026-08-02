package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes8.dex */
public final class uti0 implements e1k {
    public final Handler a;
    public final Handler b;
    public sti0 c;
    public pti0 w;
    public final /* synthetic */ tig0 x;

    public uti0(tig0 tig0Var, sti0 sti0Var) {
        this.x = tig0Var;
        tje.e();
        this.c = sti0Var;
        this.a = new Handler();
        Handler handler = new Handler((Looper) tig0Var.b);
        this.b = handler;
        handler.post(new ssu(28, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        tje.e();
        this.c = null;
        this.b.post(new tti0(this, 0));
    }
}
