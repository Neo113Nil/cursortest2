package h3;

import B2.RunnableC0272f;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class j implements m, e, d, b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38209n;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f38210u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC4567a f38211v;

    /* renamed from: w, reason: collision with root package name */
    public final n f38212w;

    public /* synthetic */ j(Executor executor, InterfaceC4567a interfaceC4567a, n nVar, int i) {
        this.f38209n = i;
        this.f38210u = executor;
        this.f38211v = interfaceC4567a;
        this.f38212w = nVar;
    }

    @Override // h3.d
    public void B(Exception exc) {
        this.f38212w.k(exc);
    }

    @Override // h3.m
    public final void a(n nVar) {
        switch (this.f38209n) {
            case 0:
                this.f38210u.execute(new RunnableC0272f(this, nVar, 25, false));
                break;
            default:
                this.f38210u.execute(new RunnableC0272f(this, nVar, 26, false));
                break;
        }
    }

    @Override // h3.e
    public void l(Object obj) {
        this.f38212w.l(obj);
    }

    @Override // h3.b
    public void q() {
        this.f38212w.m();
    }
}
