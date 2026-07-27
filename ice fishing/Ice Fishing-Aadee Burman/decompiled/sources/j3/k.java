package j3;

import com.google.android.gms.internal.ads.RunnableC3191fP;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class k implements l, e, d, b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38365n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f38366u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f38367v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f38368w;

    public k(N1.f fVar, b bVar) {
        this.f38365n = 0;
        this.f38366u = new Object();
        this.f38367v = fVar;
        this.f38368w = bVar;
    }

    private final void b(m mVar) {
        if (mVar.i()) {
            synchronized (this.f38366u) {
                try {
                    if (((e) this.f38368w) == null) {
                        return;
                    }
                    this.f38367v.execute(new RunnableC3191fP(this, mVar, 9, false));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // j3.l
    public final void a(m mVar) {
        switch (this.f38365n) {
            case 0:
                if (mVar.f38372d) {
                    synchronized (this.f38366u) {
                        try {
                            if (((b) this.f38368w) != null) {
                                ((N1.f) this.f38367v).getClass();
                                synchronized (this.f38366u) {
                                    try {
                                        b bVar = (b) this.f38368w;
                                        if (bVar != null) {
                                            bVar.i();
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f38366u) {
                }
                this.f38367v.execute(new RunnableC3191fP(this, mVar, 7, false));
                return;
            case 2:
                if (mVar.i() || mVar.f38372d) {
                    return;
                }
                synchronized (this.f38366u) {
                    try {
                        if (((d) this.f38368w) != null) {
                            this.f38367v.execute(new RunnableC3191fP(this, mVar, 8, false));
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                b(mVar);
                return;
            default:
                this.f38367v.execute(new RunnableC3191fP(this, mVar, 10, false));
                return;
        }
    }

    @Override // j3.e
    public void h(Object obj) {
        ((m) this.f38368w).l(obj);
    }

    @Override // j3.b
    public void i() {
        ((m) this.f38368w).m();
    }

    @Override // j3.d
    public void k(Exception exc) {
        ((m) this.f38368w).k(exc);
    }

    public k(Executor executor, c cVar) {
        this.f38365n = 1;
        this.f38366u = new Object();
        this.f38367v = executor;
        this.f38368w = cVar;
    }

    public k(Executor executor, d dVar) {
        this.f38365n = 2;
        this.f38366u = new Object();
        this.f38367v = executor;
        this.f38368w = dVar;
    }

    public k(Executor executor, e eVar) {
        this.f38365n = 3;
        this.f38366u = new Object();
        this.f38367v = executor;
        this.f38368w = eVar;
    }

    public k(Executor executor, g gVar, m mVar) {
        this.f38365n = 4;
        this.f38367v = executor;
        this.f38366u = gVar;
        this.f38368w = mVar;
    }
}
