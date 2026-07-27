package m8;

import com.google.android.gms.internal.ads.C2941aq;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class n implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final S0.l f39373n;

    /* renamed from: u, reason: collision with root package name */
    public volatile AtomicInteger f39374u = new AtomicInteger(0);

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f39375v;

    public n(q qVar, S0.l lVar) {
        this.f39375v = qVar;
        this.f39373n = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2941aq c2941aq;
        String str = "OkHttp " + ((i8.n) this.f39375v.f39388u.f40189u).f();
        q qVar = this.f39375v;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            qVar.f39390w.h();
            boolean z3 = false;
            try {
                try {
                } catch (Throwable th) {
                    C2941aq c2941aq2 = qVar.f39387n.f38195a;
                    c2941aq2.getClass();
                    C2941aq.j(c2941aq2, null, this, 3);
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f39373n.G(qVar.j());
                c2941aq = qVar.f39387n.f38195a;
                c2941aq.getClass();
            } catch (IOException e10) {
                e = e10;
                z3 = true;
                if (z3) {
                    s8.f fVar = s8.f.f40497a;
                    s8.f.f40497a.j(4, "Callback failure for " + q.a(qVar), e);
                } else {
                    ((M6.a) this.f39373n.f2797u).accept(e);
                }
                c2941aq = qVar.f39387n.f38195a;
                c2941aq.getClass();
                C2941aq.j(c2941aq, null, this, 3);
            } catch (Throwable th3) {
                th = th3;
                z3 = true;
                qVar.h();
                if (!z3) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.initCause(th);
                    ((M6.a) this.f39373n.f2797u).accept(iOException);
                }
                if (!(th instanceof InterruptedException)) {
                    throw th;
                }
                Thread.currentThread().interrupt();
                c2941aq = qVar.f39387n.f38195a;
                c2941aq.getClass();
                C2941aq.j(c2941aq, null, this, 3);
            }
            C2941aq.j(c2941aq, null, this, 3);
        } finally {
            currentThread.setName(name);
        }
    }
}
