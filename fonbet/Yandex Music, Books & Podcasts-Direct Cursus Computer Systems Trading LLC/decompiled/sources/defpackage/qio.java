package defpackage;

import android.os.Handler;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class qio implements Runnable, Closeable {
    public final Handler a = dvt.p(null);
    public final long b;
    public boolean c;
    public final /* synthetic */ rio d;

    public qio(rio rioVar, long j) {
        this.d = rioVar;
        this.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = false;
        this.a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        rio rioVar = this.d;
        x0 x0Var = rioVar.g;
        x0Var.c0(x0Var.F(4, rioVar.k, vsn.g, rioVar.h));
        this.a.postDelayed(this, this.b);
    }
}
