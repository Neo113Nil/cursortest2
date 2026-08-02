package defpackage;

import androidx.fragment.app.o;
import androidx.fragment.app.y;
import kotlin.coroutines.Continuation;
import ru.yandex.music.bullfinch.BullfinchActivity;
import ru.yandex.music.concert.location_selector.ConcertLocationSelectorActivity;
import ru.yandex.music.gdpr.GdprScreenActivity;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;

/* loaded from: classes3.dex */
public final class wj3 extends otc {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wj3(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.otc
    public final o a(ClassLoader classLoader, String str) {
        Continuation continuation = null;
        switch (this.b) {
            case 0:
                classLoader.getClass();
                str.getClass();
                BullfinchActivity bullfinchActivity = (BullfinchActivity) this.c;
                int i = BullfinchActivity.x;
                if (!str.equals(((Class) bullfinchActivity.w.getValue()).getName())) {
                    o a = super.a(classLoader, str);
                    a.getClass();
                    return a;
                }
                ik3 ik3Var = (ik3) bullfinchActivity.v.getValue();
                vdr O = pd.O();
                l18 l18Var = l18.b;
                bdt I = hag.I(cce.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                cce cceVar = (cce) qdcVar.C(I);
                bdt I2 = hag.I(q8r.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                hk3 hk3Var = new hk3(O, cceVar, (q8r) qdcVar2.C(I2));
                ik3Var.getClass();
                e00 e00Var = ik3Var.a;
                bdt I3 = hag.I(xj3.class);
                qdc qdcVar3 = e00Var.a;
                qdcVar3.getClass();
                return new gk3(hk3Var, (xj3) qdcVar3.C(I3));
            case 1:
                classLoader.getClass();
                str.getClass();
                ConcertLocationSelectorActivity concertLocationSelectorActivity = (ConcertLocationSelectorActivity) this.c;
                if (str.equals(concertLocationSelectorActivity.Z.getName())) {
                    return new uw5(((ax5) concertLocationSelectorActivity.Y.getValue()).a);
                }
                o a2 = super.a(classLoader, str);
                a2.getClass();
                return a2;
            case 2:
                classLoader.getClass();
                str.getClass();
                k56 k56Var = (k56) this.c;
                if (!str.equals(i56.class.getName())) {
                    o a3 = super.a(classLoader, str);
                    a3.getClass();
                    return a3;
                }
                e00 e00Var2 = k56Var.a;
                Object obj = e00Var2.b;
                pu0 t = pd.t(new qzm[0]);
                bdt I4 = hag.I(e56.class);
                qdc qdcVar4 = e00Var2.a;
                qdcVar4.getClass();
                return new i56(t, (e56) qdcVar4.C(I4));
            case 3:
                classLoader.getClass();
                str.getClass();
                mcb mcbVar = (mcb) this.c;
                if (str.equals(wcb.class.getName())) {
                    e00 e00Var3 = mcbVar.a;
                    e00Var3.getClass();
                    return new wcb(e00Var3);
                }
                o a4 = super.a(classLoader, str);
                a4.getClass();
                return a4;
            case 4:
                return o.instantiate(((y) this.c).x.b, str, null);
            case 5:
                classLoader.getClass();
                str.getClass();
                GdprScreenActivity gdprScreenActivity = (GdprScreenActivity) this.c;
                int i2 = GdprScreenActivity.x;
                if (!str.equals(((Class) gdprScreenActivity.w.getValue()).getName())) {
                    o a5 = super.a(classLoader, str);
                    a5.getClass();
                    return a5;
                }
                e00 e00Var4 = ((q2d) gdprScreenActivity.v.getValue()).a;
                bdt I5 = hag.I(pu0.class);
                qdc qdcVar5 = e00Var4.a;
                qdcVar5.getClass();
                pu0 pu0Var = (pu0) qdcVar5.C(I5);
                bdt I6 = hag.I(w1d.class);
                qdc qdcVar6 = e00Var4.a;
                qdcVar6.getClass();
                return new c2d(pu0Var, (w1d) qdcVar6.C(I6));
            case 6:
                classLoader.getClass();
                str.getClass();
                if (!str.equals(sfe.class.getName())) {
                    o a6 = super.a(classLoader, str);
                    a6.getClass();
                    return a6;
                }
                age ageVar = (age) this.c;
                zfe zfeVar = ageVar.a;
                e00 e00Var5 = ageVar.b;
                bdt I7 = hag.I(nfe.class);
                qdc qdcVar7 = e00Var5.a;
                qdcVar7.getClass();
                return new sfe(zfeVar, (nfe) qdcVar7.C(I7));
            case 7:
                classLoader.getClass();
                str.getClass();
                MainScreenActivity mainScreenActivity = (MainScreenActivity) this.c;
                if (str.equals(((Class) mainScreenActivity.P0.getValue()).getName())) {
                    return new d16(((e26) mainScreenActivity.O0.getValue()).a);
                }
                o a7 = super.a(classLoader, str);
                a7.getClass();
                return a7;
            default:
                classLoader.getClass();
                str.getClass();
                TariffPaywallActivity tariffPaywallActivity = (TariffPaywallActivity) this.c;
                int i3 = TariffPaywallActivity.z;
                if (!str.equals(((Class) tariffPaywallActivity.x.getValue()).getName())) {
                    o a8 = super.a(classLoader, str);
                    a8.getClass();
                    return a8;
                }
                w8m w8mVar = (w8m) tariffPaywallActivity.w.getValue();
                String name = ((lik) tariffPaywallActivity.y.getValue()).a.name();
                w6s w6sVar = new w6s(tariffPaywallActivity, 2);
                w8mVar.getClass();
                name.getClass();
                ly4 ly4Var = w8mVar.b;
                bdt I8 = hag.I(fik.class);
                qdc qdcVar8 = ly4Var.a;
                qdcVar8.getClass();
                fik fikVar = (fik) qdcVar8.C(I8);
                t8m t8mVar = (t8m) fikVar.d.getValue();
                dik dikVar = new dik(new hv0(fikVar, continuation, 21), !((Boolean) fikVar.c.invoke()).booleanValue(), name, new hpj(23));
                cjk cjkVar = new cjk(new wn5(new tt5(29, fikVar), 264991165, true));
                suh suhVar = new suh(7, fikVar, w6sVar);
                t8mVar.getClass();
                return new jik(t8mVar.a, suhVar, cjkVar, dikVar);
        }
    }
}
