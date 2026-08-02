package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public final class pgl {
    public final ogl a;
    public final fsb b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public pgl(fsb fsbVar, ogl oglVar, sis sisVar, int i, Looper looper) {
        this.b = fsbVar;
        this.a = oglVar;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        vq1.A(!this.f);
        this.f = true;
        fsb fsbVar = this.b;
        synchronized (fsbVar) {
            if (!fsbVar.E && fsbVar.j.getThread().isAlive()) {
                fsbVar.h.c(14, this).b();
                return;
            }
            vq1.n0("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
