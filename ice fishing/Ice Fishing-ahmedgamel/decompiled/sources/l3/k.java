package l3;

import com.google.android.gms.internal.ads.RunnableC3214fP;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class k implements l, e, d, b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38877n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f38878u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f38879v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f38880w;

    public k(P1.f fVar, b bVar) {
        this.f38877n = 0;
        this.f38878u = new Object();
        this.f38879v = fVar;
        this.f38880w = bVar;
    }

    private final void e(m mVar) {
        if (mVar.i()) {
            synchronized (this.f38878u) {
                try {
                    if (((e) this.f38880w) == null) {
                        return;
                    }
                    this.f38879v.execute(new RunnableC3214fP(this, mVar, 9, false));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // l3.l
    public final void a(m mVar) {
        switch (this.f38877n) {
            case 0:
                if (mVar.f38884d) {
                    synchronized (this.f38878u) {
                        try {
                            if (((b) this.f38880w) != null) {
                                ((P1.f) this.f38879v).getClass();
                                synchronized (this.f38878u) {
                                    try {
                                        b bVar = (b) this.f38880w;
                                        if (bVar != null) {
                                            bVar.c();
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
                synchronized (this.f38878u) {
                }
                this.f38879v.execute(new RunnableC3214fP(this, mVar, 7, false));
                return;
            case 2:
                if (mVar.i() || mVar.f38884d) {
                    return;
                }
                synchronized (this.f38878u) {
                    try {
                        if (((d) this.f38880w) != null) {
                            this.f38879v.execute(new RunnableC3214fP(this, mVar, 8, false));
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                e(mVar);
                return;
            default:
                this.f38879v.execute(new RunnableC3214fP(this, mVar, 10, false));
                return;
        }
    }

    @Override // l3.e
    public void b(Object obj) {
        ((m) this.f38880w).l(obj);
    }

    @Override // l3.b
    public void c() {
        ((m) this.f38880w).m();
    }

    @Override // l3.d
    public void d(Exception exc) {
        ((m) this.f38880w).k(exc);
    }

    public k(Executor executor, c cVar) {
        this.f38877n = 1;
        this.f38878u = new Object();
        this.f38879v = executor;
        this.f38880w = cVar;
    }

    public k(Executor executor, d dVar) {
        this.f38877n = 2;
        this.f38878u = new Object();
        this.f38879v = executor;
        this.f38880w = dVar;
    }

    public k(Executor executor, e eVar) {
        this.f38877n = 3;
        this.f38878u = new Object();
        this.f38879v = executor;
        this.f38880w = eVar;
    }

    public k(Executor executor, g gVar, m mVar) {
        this.f38877n = 4;
        this.f38879v = executor;
        this.f38878u = gVar;
        this.f38880w = mVar;
    }
}
