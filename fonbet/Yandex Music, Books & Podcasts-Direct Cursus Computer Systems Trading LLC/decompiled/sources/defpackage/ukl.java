package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ukl implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sdr b;
    public final /* synthetic */ jub c;
    public final /* synthetic */ mm6 d;
    public final /* synthetic */ na0 e;
    public final /* synthetic */ drh f;

    public /* synthetic */ ukl(sdr sdrVar, jub jubVar, mm6 mm6Var, na0 na0Var, drh drhVar, int i) {
        this.a = i;
        this.b = sdrVar;
        this.c = jubVar;
        this.d = mm6Var;
        this.e = na0Var;
        this.f = drhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    jil jilVar = (jil) this.b.getValue();
                    final jub jubVar = this.c;
                    boolean h = oq5Var.h(jubVar);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (h || K == kjnVar) {
                        kef kefVar = new kef(1, jubVar, jub.class, "onCastClick", "onCastClick(Lcom/yandex/music/shared/cast/picker/api/model/CastTypeSupport;)Z", 0, 27);
                        oq5Var.k0(kefVar);
                        K = kefVar;
                    }
                    h9f h9fVar = (h9f) K;
                    boolean h2 = oq5Var.h(jubVar);
                    Object K2 = oq5Var.K();
                    if (h2 || K2 == kjnVar) {
                        msj msjVar = new msj(0, jubVar, jub.class, "onQueueClick", "onQueueClick()V", 0, 11);
                        oq5Var.k0(msjVar);
                        K2 = msjVar;
                    }
                    h9f h9fVar2 = (h9f) K2;
                    boolean h3 = oq5Var.h(jubVar);
                    Object K3 = oq5Var.K();
                    if (h3 || K3 == kjnVar) {
                        kef kefVar2 = new kef(1, jubVar, jub.class, "onContextClick", "onContextClick(Lcom/yandex/music/shared/player/screen/common/api/ui/models/NavigationContextEntity;)V", 0, 28);
                        oq5Var.k0(kefVar2);
                        K3 = kefVar2;
                    }
                    h9f h9fVar3 = (h9f) K3;
                    boolean h4 = oq5Var.h(jubVar);
                    final mm6 mm6Var = this.d;
                    boolean h5 = h4 | oq5Var.h(mm6Var);
                    final na0 na0Var = this.e;
                    boolean f = h5 | oq5Var.f(na0Var);
                    Object K4 = oq5Var.K();
                    if (f || K4 == kjnVar) {
                        final int i = 0;
                        K4 = new Function0() { // from class: xkl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i) {
                                    case 0:
                                        r0.c(wjb.MiniplayerScreen, (pkl) jubVar.b().c.getValue());
                                        x97.y(mm6Var, null, null, new gll(na0Var, null, 1), 3);
                                        break;
                                    default:
                                        r0.c(wjb.MiniplayerScreen, (pkl) jubVar.b().c.getValue());
                                        x97.y(mm6Var, null, null, new gll(na0Var, null, 3), 3);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K4);
                    }
                    tt0.m(jilVar, (Function0) K4, (Function1) h9fVar, (Function0) h9fVar2, (Function1) h9fVar3, this.f, null, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    pd.b(new qzm[0], true, ild.C(-870513150, new ukl(this.b, this.c, this.d, this.e, this.f, 0), oq5Var2), oq5Var2, 432, 0);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    pd.b(new qzm[0], true, ild.C(-2004982255, new ukl(this.b, this.c, this.d, this.e, this.f, 3), oq5Var3), oq5Var3, 432, 0);
                } else {
                    oq5Var3.S();
                }
                break;
            default:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    jil jilVar2 = (jil) this.b.getValue();
                    final jub jubVar2 = this.c;
                    boolean h6 = oq5Var4.h(jubVar2);
                    Object K5 = oq5Var4.K();
                    kjn kjnVar2 = gq5.a;
                    if (h6 || K5 == kjnVar2) {
                        kef kefVar3 = new kef(1, jubVar2, jub.class, "onCastClick", "onCastClick(Lcom/yandex/music/shared/cast/picker/api/model/CastTypeSupport;)Z", 0, 29);
                        oq5Var4.k0(kefVar3);
                        K5 = kefVar3;
                    }
                    h9f h9fVar4 = (h9f) K5;
                    boolean h7 = oq5Var4.h(jubVar2);
                    Object K6 = oq5Var4.K();
                    if (h7 || K6 == kjnVar2) {
                        msj msjVar2 = new msj(0, jubVar2, jub.class, "onQueueClick", "onQueueClick()V", 0, 12);
                        oq5Var4.k0(msjVar2);
                        K6 = msjVar2;
                    }
                    h9f h9fVar5 = (h9f) K6;
                    boolean h8 = oq5Var4.h(jubVar2);
                    Object K7 = oq5Var4.K();
                    if (h8 || K7 == kjnVar2) {
                        bml bmlVar = new bml(1, jubVar2, jub.class, "onContextClick", "onContextClick(Lcom/yandex/music/shared/player/screen/common/api/ui/models/NavigationContextEntity;)V", 0, 0);
                        oq5Var4.k0(bmlVar);
                        K7 = bmlVar;
                    }
                    h9f h9fVar6 = (h9f) K7;
                    boolean h9 = oq5Var4.h(jubVar2);
                    final mm6 mm6Var2 = this.d;
                    boolean h10 = h9 | oq5Var4.h(mm6Var2);
                    final na0 na0Var2 = this.e;
                    boolean f2 = h10 | oq5Var4.f(na0Var2);
                    Object K8 = oq5Var4.K();
                    if (f2 || K8 == kjnVar2) {
                        final int i2 = 1;
                        K8 = new Function0() { // from class: xkl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i2) {
                                    case 0:
                                        r0.c(wjb.MiniplayerScreen, (pkl) jubVar2.b().c.getValue());
                                        x97.y(mm6Var2, null, null, new gll(na0Var2, null, 1), 3);
                                        break;
                                    default:
                                        r0.c(wjb.MiniplayerScreen, (pkl) jubVar2.b().c.getValue());
                                        x97.y(mm6Var2, null, null, new gll(na0Var2, null, 3), 3);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var4.k0(K8);
                    }
                    tt0.m(jilVar2, (Function0) K8, (Function1) h9fVar4, (Function0) h9fVar5, (Function1) h9fVar6, this.f, null, oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                break;
        }
        return Unit.a;
    }
}
