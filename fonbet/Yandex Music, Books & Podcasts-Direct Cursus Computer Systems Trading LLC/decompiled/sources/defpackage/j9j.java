package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class j9j implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9j b;

    public /* synthetic */ j9j(k9j k9jVar, int i) {
        this.a = i;
        this.b = k9jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.a;
        k9j k9jVar = this.b;
        int i3 = 1;
        switch (i2) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-1758214906, new j9j(k9jVar, i3), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ybf ybfVar = k9jVar.k;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        l9j l9jVar = new l9j((xbc) k9jVar.o.getValue(), (v9j) ybfVar.getValue(), (i35) k9jVar.n.getValue(), k9jVar.p, (j35) k9jVar.m.getValue());
                        oq5Var2.k0(l9jVar);
                        K = l9jVar;
                    }
                    l9j l9jVar2 = (l9j) K;
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        int ordinal = k9jVar.A().ordinal();
                        if (ordinal == 0) {
                            i = R.string.collection_audiobooks_postponed_audiobooks;
                        } else if (ordinal != 1) {
                            b6e.s();
                            break;
                        } else {
                            i = R.string.collection_podcasts_your_subscriptions;
                        }
                        K2 = Integer.valueOf(i);
                        oq5Var2.k0(K2);
                    }
                    p1g.d(l9jVar2, ((Number) K2).intValue(), oq5Var2, 48);
                    rzf.j(((v9j) ybfVar.getValue()).v, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
