package l3;

import com.google.android.gms.internal.ads.RunnableC3214fP;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class j implements l, e, d, b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38873n;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f38874u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC4673a f38875v;

    /* renamed from: w, reason: collision with root package name */
    public final m f38876w;

    public /* synthetic */ j(Executor executor, InterfaceC4673a interfaceC4673a, m mVar, int i) {
        this.f38873n = i;
        this.f38874u = executor;
        this.f38875v = interfaceC4673a;
        this.f38876w = mVar;
    }

    @Override // l3.l
    public final void a(m mVar) {
        switch (this.f38873n) {
            case 0:
                this.f38874u.execute(new RunnableC3214fP(this, mVar, 5, false));
                break;
            default:
                this.f38874u.execute(new RunnableC3214fP(this, mVar, 6, false));
                break;
        }
    }

    @Override // l3.e
    public void b(Object obj) {
        this.f38876w.l(obj);
    }

    @Override // l3.b
    public void c() {
        this.f38876w.m();
    }

    @Override // l3.d
    public void d(Exception exc) {
        this.f38876w.k(exc);
    }
}
