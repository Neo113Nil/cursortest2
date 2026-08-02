package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class him implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jim b;
    public final /* synthetic */ zit c;

    public /* synthetic */ him(jim jimVar, zit zitVar, int i) {
        this.a = i;
        this.b = jimVar;
        this.c = zitVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(204250981, new him(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    jim jimVar = this.b;
                    String str = (String) jimVar.n.getValue();
                    String str2 = (String) jimVar.o.getValue();
                    List list = (List) jimVar.m.getValue();
                    boolean h = oq5Var2.h(jimVar);
                    Object K = oq5Var2.K();
                    Object obj3 = gq5.a;
                    if (h || K == obj3) {
                        K = new iim(jimVar, 4);
                        oq5Var2.k0(K);
                    }
                    Function0 function02 = (Function0) K;
                    Object obj4 = this.c;
                    boolean h2 = oq5Var2.h(obj4);
                    Object K2 = oq5Var2.K();
                    if (h2 || K2 == obj3) {
                        Object bmlVar = new bml(1, obj4, zit.class, "onItemClick", "onItemClick(Lru/yandex/music/data/universalentities/UniversalDomainEntity;)V", 0, 11);
                        oq5Var2.k0(bmlVar);
                        K2 = bmlVar;
                    }
                    Function1 function1 = (Function1) ((h9f) K2);
                    boolean h3 = oq5Var2.h(obj4);
                    Object K3 = oq5Var2.K();
                    if (h3 || K3 == obj3) {
                        Object bmlVar2 = new bml(1, obj4, zit.class, "onItemLongClick", "onItemLongClick(Lru/yandex/music/data/universalentities/UniversalDomainEntity;)V", 0, 12);
                        oq5Var2.k0(bmlVar2);
                        K3 = bmlVar2;
                    }
                    Function1 function12 = (Function1) ((h9f) K3);
                    Object obj5 = (uhb) jimVar.l.getValue();
                    if (obj5 == null) {
                        oq5Var2.Z(-1127243260);
                        oq5Var2.p(false);
                        function0 = null;
                    } else {
                        oq5Var2.Z(-1127243259);
                        boolean h4 = oq5Var2.h(obj5) | oq5Var2.h(jimVar);
                        Object K4 = oq5Var2.K();
                        if (h4 || K4 == obj3) {
                            K4 = new iik(21, obj5, jimVar);
                            oq5Var2.k0(K4);
                        }
                        function0 = (Function0) K4;
                        oq5Var2.p(false);
                    }
                    ezf.l(str, str2, list, function02, function1, function12, function0, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
