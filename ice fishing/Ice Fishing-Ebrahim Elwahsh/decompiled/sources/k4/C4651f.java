package k4;

import h.AbstractActivityC4553l;
import k2.C4643n;
import v2.AbstractC5123a;
import v2.AbstractC5124b;

/* renamed from: k4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4651f extends AbstractC5124b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4553l f38753f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f38754g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4657l f38755h;

    public /* synthetic */ C4651f(int i, AbstractActivityC4553l abstractActivityC4553l, InterfaceC4657l interfaceC4657l, m mVar) {
        this.f38752e = i;
        this.f38754g = mVar;
        this.f38755h = interfaceC4657l;
        this.f38753f = abstractActivityC4553l;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(C4643n c4643n) {
        switch (this.f38752e) {
            case 0:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                m.f();
                if (m.f38791g == 1) {
                    m.g(this.f38753f);
                    break;
                }
                break;
            default:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                this.f38754g.getClass();
                m.f();
                if (m.f38791g == 1) {
                    m.g(this.f38753f);
                    break;
                }
                break;
        }
    }

    @Override // k2.x
    public final void onAdLoaded(Object obj) {
        switch (this.f38752e) {
            case 0:
                AbstractC5123a abstractC5123a = (AbstractC5123a) obj;
                m mVar = this.f38754g;
                mVar.f38812c = abstractC5123a;
                abstractC5123a.c(new com.google.ads.mediation.d(this, 1));
                mVar.f38812c.d(this.f38753f);
                break;
            default:
                AbstractC5123a abstractC5123a2 = (AbstractC5123a) obj;
                m mVar2 = this.f38754g;
                mVar2.f38812c = abstractC5123a2;
                abstractC5123a2.c(new com.google.ads.mediation.d(this, 2));
                mVar2.f38812c.d(this.f38753f);
                break;
        }
    }
}
