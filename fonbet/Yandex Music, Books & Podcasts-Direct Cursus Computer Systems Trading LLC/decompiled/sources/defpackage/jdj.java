package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class jdj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ldj b;

    public /* synthetic */ jdj(ldj ldjVar, int i) {
        this.a = i;
        this.b = ldjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = 1;
        switch (this.a) {
            case 0:
                ldj ldjVar = this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(1835775730, new jdj(ldjVar, i2), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ldj ldjVar2 = this.b;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        xbc xbcVar = (xbc) ldjVar2.o.getValue();
                        udj udjVar = (udj) ldjVar2.k.getValue();
                        dw4 dw4Var = (dw4) ldjVar2.n.getValue();
                        n7b n7bVar = ldjVar2.p;
                        ew4 ew4Var = (ew4) ldjVar2.m.getValue();
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        mdj mdjVar = new mdj(xbcVar, udjVar, dw4Var, n7bVar, ew4Var, (g0l) qdcVar.C(I), ldjVar2.d(), ldjVar2.getO(), ldjVar2.A());
                        oq5Var2.k0(mdjVar);
                        K = mdjVar;
                    }
                    mdj mdjVar2 = (mdj) K;
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        int ordinal = ldjVar2.A().ordinal();
                        if (ordinal == 0) {
                            i = R.string.collection_audiobooks_postponed_chapters;
                        } else if (ordinal != 1) {
                            b6e.s();
                            break;
                        } else {
                            i = R.string.collection_selected_episodes_title;
                        }
                        K2 = Integer.valueOf(i);
                        oq5Var2.k0(K2);
                    }
                    lsq.d(mdjVar2, ((Number) K2).intValue(), oq5Var2, 48);
                    rzf.j(((udj) ldjVar2.k.getValue()).v, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
