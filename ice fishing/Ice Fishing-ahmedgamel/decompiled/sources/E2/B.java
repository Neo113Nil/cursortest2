package E2;

import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.AbstractC3182eu;
import com.google.android.gms.internal.ads.C2907Zd;
import com.google.android.gms.internal.ads.C3553lp;
import com.google.android.gms.internal.ads.C3873rm;
import com.google.android.gms.internal.ads.HN;
import com.google.android.gms.internal.ads.PN;
import com.google.android.gms.internal.ads.XJ;
import java.util.Map;
import r2.RunnableC4901f;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f715n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f716u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f717v;

    public /* synthetic */ B(int i, Object obj, boolean z6) {
        this.f715n = i;
        this.f717v = obj;
        this.f716u = z6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z6 = this.f716u;
        Object obj = this.f717v;
        switch (this.f715n) {
            case 0:
                ((C) obj).d(z6, false);
                break;
            case 1:
                Q0.h hVar = (Q0.h) obj;
                hVar.getClass();
                P1.p.a();
                com.bumptech.glide.manager.n nVar = (com.bumptech.glide.manager.n) hVar.f2473b;
                boolean z9 = nVar.f24248n;
                nVar.f24248n = z6;
                if (z9 != z6) {
                    ((com.bumptech.glide.manager.m) nVar.f24249u).a(z6);
                    break;
                }
                break;
            case 2:
                ((C2907Zd) obj).C(z6);
                break;
            case 3:
                C3873rm c3873rm = (C3873rm) obj;
                ?? r02 = c3873rm.f34512w;
                if (r02 != 0) {
                    View F02 = r02.F0();
                    Map g9 = c3873rm.f34512w.g();
                    Map n9 = c3873rm.f34512w.n();
                    ImageView.ScaleType k9 = c3873rm.k();
                    c3873rm.f34503n.n(null, F02, g9, n9, this.f716u, k9, 0);
                    break;
                } else {
                    int i = w2.z.f41712b;
                    x2.i.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    break;
                }
            case 4:
                S0.l lVar = (S0.l) obj;
                lVar.getClass();
                String str = AbstractC3182eu.f30782a;
                PN pn = ((HN) lVar.f2927v).f26036n;
                if (pn.f27582s0 != z6) {
                    pn.f27582s0 = z6;
                    XJ xj = new XJ(z6);
                    C3553lp c3553lp = pn.f27555G;
                    c3553lp.c(23, xj);
                    c3553lp.d();
                    break;
                }
                break;
            default:
                RunnableC4901f runnableC4901f = (RunnableC4901f) obj;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    RunnableC4901f.p(runnableC4901f.f40156C, runnableC4901f.f40158E, z6, runnableC4901f.f40159F).k();
                    break;
                } catch (NullPointerException e9) {
                    runnableC4901f.f40154A.c(2027, System.currentTimeMillis() - currentTimeMillis, e9);
                }
        }
    }
}
