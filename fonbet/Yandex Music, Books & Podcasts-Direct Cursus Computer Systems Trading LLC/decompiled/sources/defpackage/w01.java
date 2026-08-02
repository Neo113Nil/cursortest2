package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class w01 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y01 b;
    public final /* synthetic */ f11 c;

    public /* synthetic */ w01(y01 y01Var, f11 f11Var, int i) {
        this.a = i;
        this.b = y01Var;
        this.c = f11Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        y01 y01Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(1796149861, new w01(y01Var, this.c, i2), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ybf ybfVar = y01Var.k;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(1 & intValue2, (intValue2 & 3) != 2)) {
                    lvf a = ovf.a(((m11) ybfVar.getValue()).o, oq5Var2);
                    k4k k4kVar = (k4k) szf.Q((xdr) ((m11) ybfVar.getValue()).p.d, oq5Var2).getValue();
                    mm1 A = y01Var.A();
                    j0q j0qVar = (j0q) ((m11) ybfVar.getValue()).p.e;
                    tmb x = y01Var.x();
                    f11 f11Var = this.c;
                    boolean f = oq5Var2.f(f11Var);
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (f || K == kjnVar) {
                        zy zyVar = new zy(0, f11Var, f11.class, "onBackClicked", "onBackClicked()V", 0, 14);
                        oq5Var2.k0(zyVar);
                        K = zyVar;
                    }
                    h9f h9fVar = (h9f) K;
                    boolean f2 = oq5Var2.f(f11Var);
                    Object K2 = oq5Var2.K();
                    if (f2 || K2 == kjnVar) {
                        K2 = new zy(0, f11Var, f11.class, "onRefresh", "onRefresh()V", 0, 15);
                        oq5Var2.k0(K2);
                    }
                    h9f h9fVar2 = (h9f) K2;
                    boolean f3 = oq5Var2.f(f11Var);
                    Object K3 = oq5Var2.K();
                    if (f3 || K3 == kjnVar) {
                        zy zyVar2 = new zy(0, f11Var, f11.class, "onRetry", "onRetry()V", 0, 16);
                        oq5Var2.k0(zyVar2);
                        K3 = zyVar2;
                    }
                    h9f h9fVar3 = (h9f) K3;
                    boolean f4 = oq5Var2.f(f11Var);
                    Object K4 = oq5Var2.K();
                    if (f4 || K4 == kjnVar) {
                        m5 m5Var = new m5(1, f11Var, f11.class, "onAlbumClick", "onAlbumClick(Lru/yandex/music/data/audio/Album;)V", 0, 12);
                        oq5Var2.k0(m5Var);
                        K4 = m5Var;
                    }
                    h9f h9fVar4 = (h9f) K4;
                    boolean f5 = oq5Var2.f(f11Var);
                    Object K5 = oq5Var2.K();
                    if (f5 || K5 == kjnVar) {
                        m5 m5Var2 = new m5(1, f11Var, f11.class, "onAlbumLongClick", "onAlbumLongClick(Lru/yandex/music/data/audio/Album;)V", 0, 13);
                        oq5Var2.k0(m5Var2);
                        K5 = m5Var2;
                    }
                    int i3 = lvf.f;
                    vwb.b(k4kVar, a, A, x, j0qVar, (Function0) h9fVar, (Function0) h9fVar2, (Function0) h9fVar3, (Function1) h9fVar4, (Function1) ((h9f) K5), oq5Var2, 4160);
                    rzf.j(((m11) ybfVar.getValue()).q, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
