package defpackage;

import com.squareup.moshi.Moshi;
import com.ybsdk.api.e;
import com.ybsdk.common.repositiories.auth.b;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.w;

/* loaded from: classes3.dex */
public final class rbg implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ rbg(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                ru01 ru01Var = (ru01) ((h9g) tw51Var).y1.get();
                q5z.h(ru01Var);
                return ru01Var;
            case 1:
                h9g h9gVar = (h9g) tw51Var;
                uu01 uu01Var = h9gVar.j;
                return new tu01(h9gVar);
            case 2:
                h9g h9gVar2 = (h9g) tw51Var;
                uu01 uu01Var2 = h9gVar2.j;
                return new eg01((b041) h9gVar2.x1.get());
            case 3:
                return ((h9g) tw51Var).z();
            case 4:
                j3h h = ((h9g) tw51Var).h();
                q5z.h(h);
                return h;
            case 5:
                x8g x8gVar = ((h9g) tw51Var).v;
                return new s421((gff) x8gVar.X.get(), (b) x8gVar.Y.get(), (sw51) x8gVar.p.get(), (wop0) x8gVar.r0.get(), 11);
            case 6:
                h9g h9gVar3 = (h9g) tw51Var;
                j3h j3hVar = (j3h) h9gVar3.E.get();
                x8g x8gVar2 = h9gVar3.v;
                b bVar = (b) x8gVar2.Y.get();
                ppp0 ppp0Var = (ppp0) x8gVar2.w.get();
                ike ikeVar = ((nbp0) x8gVar2.u.get()).a;
                q5z.i(ikeVar);
                return new w(bVar, ikeVar, j3hVar, ppp0Var);
            case 7:
                Moshi moshi = (Moshi) ((h9g) tw51Var).v.k.get();
                q5z.h(moshi);
                return moshi;
            case 8:
                return new ku01((e) ((h9g) tw51Var).v.p1.get());
            case 9:
                awa0 awa0Var = (awa0) ((h9g) tw51Var).v.w0.get();
                q5z.h(awa0Var);
                return awa0Var;
            case 10:
                AppAnalyticsReporter r = ((h9g) tw51Var).r();
                q5z.h(r);
                return r;
            case 11:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 12:
                return new eg01((ab1) ((h9g) tw51Var).v.b1.get());
            case 13:
                rp41 rp41Var = (rp41) ((h9g) tw51Var).p0.get();
                q5z.h(rp41Var);
                return rp41Var;
            case 14:
                return ((h9g) tw51Var).A();
            case 15:
                dj51 dj51Var = (dj51) ((h9g) tw51Var).v.P1.get();
                q5z.h(dj51Var);
                return dj51Var;
            case 16:
                return new hay(18, (q960) ((h9g) tw51Var).v.V0.get());
            case 17:
                return ((h9g) tw51Var).B();
            case 18:
                return new me1((a1b0) ((h9g) tw51Var).v.n.get(), 5);
            case 19:
                return new x7r0((com.ybsdk.persistence.b) ((h9g) tw51Var).v.h0.get());
            default:
                return new ji41(3, ((h9g) tw51Var).c);
        }
    }
}
