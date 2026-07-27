package C2;

import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.AbstractC3159eu;
import com.google.android.gms.internal.ads.C2884Zd;
import com.google.android.gms.internal.ads.C3530lp;
import com.google.android.gms.internal.ads.C3797qm;
import com.google.android.gms.internal.ads.HN;
import com.google.android.gms.internal.ads.PN;
import com.google.android.gms.internal.ads.XJ;
import java.util.Map;
import p2.RunnableC4830e;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f255n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f256u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f257v;

    public /* synthetic */ C(int i, Object obj, boolean z3) {
        this.f255n = i;
        this.f257v = obj;
        this.f256u = z3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = this.f256u;
        Object obj = this.f257v;
        switch (this.f255n) {
            case 0:
                ((D) obj).d(z3, false);
                break;
            case 1:
                Q0.h hVar = (Q0.h) obj;
                hVar.getClass();
                N1.p.a();
                com.bumptech.glide.manager.o oVar = (com.bumptech.glide.manager.o) hVar.f2638b;
                boolean z6 = oVar.f23463n;
                oVar.f23463n = z3;
                if (z6 != z3) {
                    ((com.bumptech.glide.manager.n) oVar.f23464u).a(z3);
                    break;
                }
                break;
            case 2:
                ((C2884Zd) obj).D(z3);
                break;
            case 3:
                C3797qm c3797qm = (C3797qm) obj;
                ?? r02 = c3797qm.f33412w;
                if (r02 != 0) {
                    View H02 = r02.H0();
                    Map g4 = c3797qm.f33412w.g();
                    Map n9 = c3797qm.f33412w.n();
                    ImageView.ScaleType k9 = c3797qm.k();
                    c3797qm.f33403n.n(null, H02, g4, n9, this.f256u, k9, 0);
                    break;
                } else {
                    int i = u2.z.f41319b;
                    v2.i.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    break;
                }
            case 4:
                S0.l lVar = (S0.l) obj;
                lVar.getClass();
                String str = AbstractC3159eu.f29993a;
                PN pn = ((HN) lVar.f2798v).f25264n;
                if (pn.f26808x0 != z3) {
                    pn.f26808x0 = z3;
                    XJ xj = new XJ(z3);
                    C3530lp c3530lp = pn.f26776G;
                    c3530lp.c(23, xj);
                    c3530lp.d();
                    break;
                }
                break;
            default:
                RunnableC4830e runnableC4830e = (RunnableC4830e) obj;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    RunnableC4830e.p(runnableC4830e.f39700C, runnableC4830e.f39702E, z3, runnableC4830e.f39703F).k();
                    break;
                } catch (NullPointerException e9) {
                    runnableC4830e.f39698A.c(2027, System.currentTimeMillis() - currentTimeMillis, e9);
                }
        }
    }
}
