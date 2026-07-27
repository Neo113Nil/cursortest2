package o4;

import h.AbstractActivityC4551k;
import k2.n;
import w2.AbstractC5148a;
import w2.AbstractC5149b;

/* renamed from: o4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4793f extends AbstractC5149b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4798k f39576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4551k f39577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4799l f39578g;

    public C4793f(AbstractActivityC4551k abstractActivityC4551k, InterfaceC4798k interfaceC4798k, C4799l c4799l) {
        this.f39578g = c4799l;
        this.f39576e = interfaceC4798k;
        this.f39577f = abstractActivityC4551k;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(n nVar) {
        if (C4799l.f39630z.isShowing()) {
            C4799l.f39630z.dismiss();
        }
        this.f39578g.getClass();
        C4799l.f();
        if (C4799l.f39612g == 1) {
            C4799l.g(this.f39577f);
        }
    }

    @Override // k2.x
    public final void onAdLoaded(Object obj) {
        AbstractC5148a abstractC5148a = (AbstractC5148a) obj;
        C4799l c4799l = this.f39578g;
        c4799l.f39633c = abstractC5148a;
        abstractC5148a.c(new com.google.ads.mediation.d(this));
        c4799l.f39633c.d(this.f39577f);
    }
}
