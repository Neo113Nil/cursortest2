package j3;

import com.google.android.gms.internal.ads.RunnableC3191fP;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class j implements l, e, d, b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38361n;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f38362u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC4604a f38363v;

    /* renamed from: w, reason: collision with root package name */
    public final m f38364w;

    public /* synthetic */ j(Executor executor, InterfaceC4604a interfaceC4604a, m mVar, int i) {
        this.f38361n = i;
        this.f38362u = executor;
        this.f38363v = interfaceC4604a;
        this.f38364w = mVar;
    }

    @Override // j3.l
    public final void a(m mVar) {
        switch (this.f38361n) {
            case 0:
                this.f38362u.execute(new RunnableC3191fP(this, mVar, 5, false));
                break;
            default:
                this.f38362u.execute(new RunnableC3191fP(this, mVar, 6, false));
                break;
        }
    }

    @Override // j3.e
    public void h(Object obj) {
        this.f38364w.l(obj);
    }

    @Override // j3.b
    public void i() {
        this.f38364w.m();
    }

    @Override // j3.d
    public void k(Exception exc) {
        this.f38364w.k(exc);
    }
}
