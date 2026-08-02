package Y0;

import h.AbstractActivityC4555k;
import y2.AbstractC5205a;
import y2.AbstractC5206b;

/* loaded from: classes.dex */
public final class h extends AbstractC5206b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4555k f3836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3837g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f3838h;

    public /* synthetic */ h(int i, o oVar, p pVar, AbstractActivityC4555k abstractActivityC4555k) {
        this.f3835e = i;
        this.f3837g = pVar;
        this.f3838h = oVar;
        this.f3836f = abstractActivityC4555k;
    }

    @Override // m2.x
    public final void onAdFailedToLoad(m2.n nVar) {
        switch (this.f3835e) {
            case 0:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                p.f();
                if (p.f3878g == 1) {
                    p.g(this.f3836f);
                    break;
                }
                break;
            default:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                this.f3837g.getClass();
                p.f();
                if (p.f3878g == 1) {
                    p.g(this.f3836f);
                    break;
                }
                break;
        }
    }

    @Override // m2.x
    public final void onAdLoaded(Object obj) {
        switch (this.f3835e) {
            case 0:
                AbstractC5205a abstractC5205a = (AbstractC5205a) obj;
                p pVar = this.f3837g;
                pVar.f3899c = abstractC5205a;
                abstractC5205a.c(new g(this, 0));
                pVar.f3899c.d(this.f3836f);
                break;
            default:
                AbstractC5205a abstractC5205a2 = (AbstractC5205a) obj;
                p pVar2 = this.f3837g;
                pVar2.f3899c = abstractC5205a2;
                abstractC5205a2.c(new g(this, 1));
                pVar2.f3899c.d(this.f3836f);
                break;
        }
    }
}
