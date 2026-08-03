package y1;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j0 extends yc.u {

    /* renamed from: s, reason: collision with root package name */
    public static final ac.m f8558s = bc.a0.y(f0.f8513m);

    /* renamed from: t, reason: collision with root package name */
    public static final sc.b f8559t = new sc.b(1);

    /* renamed from: i, reason: collision with root package name */
    public final Choreographer f8560i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f8561j;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8566o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8567p;

    /* renamed from: r, reason: collision with root package name */
    public final m0.n1 f8569r;

    /* renamed from: k, reason: collision with root package name */
    public final Object f8562k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final bc.k f8563l = new bc.k();

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f8564m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f8565n = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final i0 f8568q = new i0(this);

    public j0(Choreographer choreographer, Handler handler) {
        this.f8560i = choreographer;
        this.f8561j = handler;
        this.f8569r = new m0.n1(choreographer, this);
    }

    public static final void z(j0 j0Var) {
        Runnable runnable;
        boolean z10;
        do {
            synchronized (j0Var.f8562k) {
                bc.k kVar = j0Var.f8563l;
                runnable = (Runnable) (kVar.isEmpty() ? null : kVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (j0Var.f8562k) {
                    bc.k kVar2 = j0Var.f8563l;
                    runnable = (Runnable) (kVar2.isEmpty() ? null : kVar2.removeFirst());
                }
            }
            synchronized (j0Var.f8562k) {
                if (j0Var.f8563l.isEmpty()) {
                    z10 = false;
                    j0Var.f8566o = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // yc.u
    public final void w(fc.i iVar, Runnable runnable) {
        synchronized (this.f8562k) {
            this.f8563l.addLast(runnable);
            if (!this.f8566o) {
                this.f8566o = true;
                this.f8561j.post(this.f8568q);
                if (!this.f8567p) {
                    this.f8567p = true;
                    this.f8560i.postFrameCallback(this.f8568q);
                }
            }
        }
    }
}
