package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class el1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fl1 b;
    public final /* synthetic */ ml1 c;

    public /* synthetic */ el1(fl1 fl1Var, ml1 ml1Var, int i) {
        this.a = i;
        this.b = fl1Var;
        this.c = ml1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kjn kjnVar;
        int i = this.a;
        fl1 fl1Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(335773689, new el1(fl1Var, this.c, i2), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ybf ybfVar = fl1Var.j;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(1 & intValue2, (intValue2 & 3) != 2)) {
                    lvf a = ovf.a(((em1) ybfVar.getValue()).q, oq5Var2);
                    int i3 = lvf.f;
                    ml1 ml1Var = this.c;
                    fl1Var.A(ml1Var, a, oq5Var2, 64);
                    k4k k4kVar = (k4k) gld.M((xdr) ((em1) ybfVar.getValue()).r.d, oq5Var2).getValue();
                    j0q j0qVar = (j0q) ((em1) ybfVar.getValue()).r.e;
                    boolean f = oq5Var2.f(ml1Var);
                    Object K = oq5Var2.K();
                    kjn kjnVar2 = gq5.a;
                    if (f || K == kjnVar2) {
                        kjnVar = kjnVar2;
                        oi1 oi1Var = new oi1(0, ml1Var, ml1.class, "onBackClicked", "onBackClicked()V", 0, 6);
                        oq5Var2.k0(oi1Var);
                        K = oi1Var;
                    } else {
                        kjnVar = kjnVar2;
                    }
                    h9f h9fVar = (h9f) K;
                    boolean f2 = oq5Var2.f(ml1Var);
                    Object K2 = oq5Var2.K();
                    if (f2 || K2 == kjnVar) {
                        oi1 oi1Var2 = new oi1(0, ml1Var, ml1.class, "onRefresh", "onRefresh()V", 0, 7);
                        oq5Var2.k0(oi1Var2);
                        K2 = oi1Var2;
                    }
                    h9f h9fVar2 = (h9f) K2;
                    boolean f3 = oq5Var2.f(ml1Var);
                    Object K3 = oq5Var2.K();
                    if (f3 || K3 == kjnVar) {
                        oi1 oi1Var3 = new oi1(0, ml1Var, ml1.class, "onRetry", "onRetry()V", 0, 8);
                        oq5Var2.k0(oi1Var3);
                        K3 = oi1Var3;
                    }
                    h9f h9fVar3 = (h9f) K3;
                    boolean f4 = oq5Var2.f(ml1Var);
                    Object K4 = oq5Var2.K();
                    if (f4 || K4 == kjnVar) {
                        le0 le0Var = new le0(2, ml1Var, ml1.class, "onTrackClick", "onTrackClick(Lru/yandex/music/data/audio/Track;I)V", 0, 2);
                        oq5Var2.k0(le0Var);
                        K4 = le0Var;
                    }
                    h9f h9fVar4 = (h9f) K4;
                    boolean f5 = oq5Var2.f(ml1Var);
                    Object K5 = oq5Var2.K();
                    if (f5 || K5 == kjnVar) {
                        le0 le0Var2 = new le0(2, ml1Var, ml1.class, "onTrackOverflowClick", "onTrackOverflowClick(Lru/yandex/music/data/audio/Track;I)V", 0, 3);
                        oq5Var2.k0(le0Var2);
                        K5 = le0Var2;
                    }
                    h9f h9fVar5 = (h9f) K5;
                    boolean f6 = oq5Var2.f(ml1Var);
                    Object K6 = oq5Var2.K();
                    if (f6 || K6 == kjnVar) {
                        oi1 oi1Var4 = new oi1(0, ml1Var, ml1.class, "onPlayButtonClick", "onPlayButtonClick()V", 0, 9);
                        oq5Var2.k0(oi1Var4);
                        K6 = oi1Var4;
                    }
                    xl1.a(k4kVar, a, fl1Var.x(), j0qVar, (Function0) h9fVar, (Function0) h9fVar2, (Function0) h9fVar3, (Function2) h9fVar4, (Function2) h9fVar5, (Function0) ((h9f) K6), ml1Var, oq5Var2, 576);
                    rzf.j(((em1) ybfVar.getValue()).s, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
