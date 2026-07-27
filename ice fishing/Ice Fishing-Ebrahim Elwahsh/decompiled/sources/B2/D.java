package B2;

import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.AbstractC3548lu;
import com.google.android.gms.internal.ads.C2839Wd;
import com.google.android.gms.internal.ads.C3093dO;
import com.google.android.gms.internal.ads.C3307hK;
import com.google.android.gms.internal.ads.C3648nm;
import com.google.android.gms.internal.ads.C3759pp;
import com.google.android.gms.internal.ads.C3932t0;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f153n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f154u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f155v;

    public /* synthetic */ D(int i, Object obj, boolean z8) {
        this.f153n = i;
        this.f155v = obj;
        this.f154u = z8;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z8 = this.f154u;
        Object obj = this.f155v;
        switch (this.f153n) {
            case 0:
                ((E) obj).d(z8, false);
                break;
            case 1:
                Q0.h hVar = (Q0.h) obj;
                hVar.getClass();
                N1.p.a();
                com.bumptech.glide.manager.n nVar = (com.bumptech.glide.manager.n) hVar.f2708b;
                boolean z9 = nVar.f23617n;
                nVar.f23617n = z8;
                if (z9 != z8) {
                    ((com.bumptech.glide.manager.m) nVar.f23618u).a(z8);
                    break;
                }
                break;
            case 2:
                ((C2839Wd) obj).y(z8);
                break;
            case 3:
                C3648nm c3648nm = (C3648nm) obj;
                ?? r02 = c3648nm.f33016w;
                if (r02 != 0) {
                    View A02 = r02.A0();
                    Map l9 = c3648nm.f33016w.l();
                    Map h9 = c3648nm.f33016w.h();
                    ImageView.ScaleType k6 = c3648nm.k();
                    c3648nm.f33007n.l(null, A02, l9, h9, this.f154u, k6, 0);
                    break;
                } else {
                    int i = t2.C.f40822b;
                    u2.i.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    break;
                }
            case 4:
                C3932t0 c3932t0 = (C3932t0) obj;
                c3932t0.getClass();
                String str = AbstractC3548lu.f32613a;
                C3093dO c3093dO = c3932t0.f34333b.f28243n;
                if (c3093dO.f30003A0 != z8) {
                    c3093dO.f30003A0 = z8;
                    C3307hK c3307hK = new C3307hK(z8);
                    C3759pp c3759pp = c3093dO.f30013G;
                    c3759pp.c(23, c3307hK);
                    c3759pp.d();
                    break;
                }
                break;
            default:
                p2.e eVar = (p2.e) obj;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    p2.e.p(eVar.f39768C, eVar.f39770E, z8, eVar.f39771F).k();
                    break;
                } catch (NullPointerException e6) {
                    eVar.f39766A.c(2027, System.currentTimeMillis() - currentTimeMillis, e6);
                }
        }
    }
}
