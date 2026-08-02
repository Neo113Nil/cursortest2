package m8;

import com.google.android.gms.internal.ads.C2964aq;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class m implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final S0.s f39530n;

    /* renamed from: u, reason: collision with root package name */
    public volatile AtomicInteger f39531u = new AtomicInteger(0);

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f39532v;

    public m(p pVar, S0.s sVar) {
        this.f39532v = pVar;
        this.f39530n = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2964aq c2964aq;
        String str = "OkHttp " + ((i8.n) this.f39532v.f39545u.f40491u).f();
        p pVar = this.f39532v;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            pVar.f39547w.h();
            boolean z6 = false;
            try {
                try {
                } catch (Throwable th) {
                    C2964aq c2964aq2 = pVar.f39544n.f38314a;
                    c2964aq2.getClass();
                    C2964aq.j(c2964aq2, null, this, 3);
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f39530n.l(pVar.j());
                c2964aq = pVar.f39544n.f38314a;
                c2964aq.getClass();
            } catch (IOException e10) {
                e = e10;
                z6 = true;
                if (z6) {
                    s8.f fVar = s8.f.f40554a;
                    s8.f.f40554a.j(4, "Callback failure for " + p.a(pVar), e);
                } else {
                    ((M6.a) this.f39530n.f2969u).accept(e);
                }
                c2964aq = pVar.f39544n.f38314a;
                c2964aq.getClass();
                C2964aq.j(c2964aq, null, this, 3);
            } catch (Throwable th3) {
                th = th3;
                z6 = true;
                pVar.h();
                if (!z6) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.initCause(th);
                    ((M6.a) this.f39530n.f2969u).accept(iOException);
                }
                if (!(th instanceof InterruptedException)) {
                    throw th;
                }
                Thread.currentThread().interrupt();
                c2964aq = pVar.f39544n.f38314a;
                c2964aq.getClass();
                C2964aq.j(c2964aq, null, this, 3);
            }
            C2964aq.j(c2964aq, null, this, 3);
        } finally {
            currentThread.setName(name);
        }
    }
}
