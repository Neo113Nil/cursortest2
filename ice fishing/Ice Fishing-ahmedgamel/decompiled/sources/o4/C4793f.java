package o4;

import h.AbstractActivityC4551k;
import k2.n;
import w2.AbstractC5148a;
import w2.AbstractC5149b;

/* renamed from: o4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4793f extends AbstractC5149b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4551k f39577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f39578g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4799l f39579h;

    public /* synthetic */ C4793f(int i, AbstractActivityC4551k abstractActivityC4551k, InterfaceC4799l interfaceC4799l, m mVar) {
        this.f39576e = i;
        this.f39578g = mVar;
        this.f39579h = interfaceC4799l;
        this.f39577f = abstractActivityC4551k;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(n nVar) {
        switch (this.f39576e) {
            case 0:
                if (m.f39633z.isShowing()) {
                    m.f39633z.dismiss();
                }
                m.f();
                if (m.f39615g == 1) {
                    m.g(this.f39577f);
                    break;
                }
                break;
            default:
                if (m.f39633z.isShowing()) {
                    m.f39633z.dismiss();
                }
                this.f39578g.getClass();
                m.f();
                if (m.f39615g == 1) {
                    m.g(this.f39577f);
                    break;
                }
                break;
        }
    }

    @Override // k2.x
    public final void onAdLoaded(Object obj) {
        switch (this.f39576e) {
            case 0:
                AbstractC5148a abstractC5148a = (AbstractC5148a) obj;
                m mVar = this.f39578g;
                mVar.f39636c = abstractC5148a;
                abstractC5148a.c(new com.google.ads.mediation.d(this, 1));
                mVar.f39636c.d(this.f39577f);
                break;
            default:
                AbstractC5148a abstractC5148a2 = (AbstractC5148a) obj;
                m mVar2 = this.f39578g;
                mVar2.f39636c = abstractC5148a2;
                abstractC5148a2.c(new com.google.ads.mediation.d(this, 2));
                mVar2.f39636c.d(this.f39577f);
                break;
        }
    }
}
