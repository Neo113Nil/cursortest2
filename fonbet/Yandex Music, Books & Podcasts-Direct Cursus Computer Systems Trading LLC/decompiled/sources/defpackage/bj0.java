package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class bj0 extends a {
    public static final jyr n = btf.b(e1.G);
    public static final mo o = new mo(5);
    public final Choreographer d;
    public final Handler e;
    public boolean j;
    public boolean k;
    public final dj0 m;
    public final Object f = new Object();
    public final zx0 g = new zx0();
    public ArrayList h = new ArrayList();
    public ArrayList i = new ArrayList();
    public final aj0 l = new aj0(this);

    public bj0(Choreographer choreographer, Handler handler) {
        this.d = choreographer;
        this.e = handler;
        this.m = new dj0(choreographer, this);
    }

    public static final void J0(bj0 bj0Var) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (bj0Var.f) {
                zx0 zx0Var = bj0Var.g;
                runnable = (Runnable) (zx0Var.isEmpty() ? null : zx0Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (bj0Var.f) {
                    zx0 zx0Var2 = bj0Var.g;
                    runnable = (Runnable) (zx0Var2.isEmpty() ? null : zx0Var2.removeFirst());
                }
            }
            synchronized (bj0Var.f) {
                if (bj0Var.g.isEmpty()) {
                    z = false;
                    bj0Var.j = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // kotlinx.coroutines.a
    public final void F0(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.f) {
            this.g.addLast(runnable);
            if (!this.j) {
                this.j = true;
                this.e.post(this.l);
                if (!this.k) {
                    this.k = true;
                    this.d.postFrameCallback(this.l);
                }
            }
        }
    }
}
