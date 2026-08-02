package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class igq implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mgq b;
    public final /* synthetic */ pgq c;

    public /* synthetic */ igq(mgq mgqVar, pgq pgqVar, int i) {
        this.a = i;
        this.b = mgqVar;
        this.c = pgqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        mgq mgqVar = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(1861972928, new igq(mgqVar, this.c, i2), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ybf ybfVar = mgqVar.k;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(1 & intValue2, (intValue2 & 3) != 2)) {
                    k4k k4kVar = (k4k) gld.M((xdr) ((sgq) ybfVar.getValue()).o.d, oq5Var2).getValue();
                    xdr xdrVar = ((sgq) ybfVar.getValue()).n;
                    boolean f = oq5Var2.f(xdrVar);
                    Object K = oq5Var2.K();
                    Object obj3 = gq5.a;
                    if (f || K == obj3) {
                        K = new p6o(xdrVar, 19);
                        oq5Var2.k0(K);
                    }
                    lvf a = ovf.a((pjc) K, oq5Var2);
                    j0q j0qVar = (j0q) ((sgq) ybfVar.getValue()).o.e;
                    tmb x = mgqVar.x();
                    Object obj4 = this.c;
                    boolean f2 = oq5Var2.f(obj4);
                    Object K2 = oq5Var2.K();
                    if (f2 || K2 == obj3) {
                        Object qbpVar = new qbp(0, obj4, pgq.class, "onBackClicked", "onBackClicked()V", 0, 20);
                        oq5Var2.k0(qbpVar);
                        K2 = qbpVar;
                    }
                    h9f h9fVar = (h9f) K2;
                    boolean f3 = oq5Var2.f(obj4);
                    Object K3 = oq5Var2.K();
                    if (f3 || K3 == obj3) {
                        Object qbpVar2 = new qbp(0, obj4, pgq.class, "onRefresh", "onRefresh()V", 0, 21);
                        oq5Var2.k0(qbpVar2);
                        K3 = qbpVar2;
                    }
                    h9f h9fVar2 = (h9f) K3;
                    boolean f4 = oq5Var2.f(obj4);
                    Object K4 = oq5Var2.K();
                    if (f4 || K4 == obj3) {
                        K4 = new qbp(0, obj4, pgq.class, "onRetry", "onRetry()V", 0, 22);
                        oq5Var2.k0(K4);
                    }
                    h9f h9fVar3 = (h9f) K4;
                    boolean f5 = oq5Var2.f(obj4);
                    Object K5 = oq5Var2.K();
                    if (f5 || K5 == obj3) {
                        Object lgqVar = new lgq(1, obj4, pgq.class, "onArtistClick", "onArtistClick(Lru/yandex/music/data/audio/Artist;)V", 0, 0);
                        oq5Var2.k0(lgqVar);
                        K5 = lgqVar;
                    }
                    h9f h9fVar4 = (h9f) K5;
                    boolean f6 = oq5Var2.f(obj4);
                    Object K6 = oq5Var2.K();
                    if (f6 || K6 == obj3) {
                        Object lgqVar2 = new lgq(1, obj4, pgq.class, "onArtistLongClick", "onArtistLongClick(Lru/yandex/music/data/audio/Artist;)V", 0, 1);
                        oq5Var2.k0(lgqVar2);
                        K6 = lgqVar2;
                    }
                    int i3 = lvf.f;
                    uwf.c(k4kVar, a, x, j0qVar, (Function0) h9fVar, (Function0) h9fVar2, (Function0) h9fVar3, (Function1) h9fVar4, (Function1) ((h9f) K6), oq5Var2, 576);
                    rzf.j(((sgq) ybfVar.getValue()).p, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
