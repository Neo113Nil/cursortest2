package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class da1 extends defpackage.mi1 implements defpackage.y10 {
    public int GE9mJIPrb8gP;
    public final /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta;
    public final /* synthetic */ java.lang.Object fNwYGHIYeJcR;
    public final /* synthetic */ java.lang.Object h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da1(defpackage.ja1 ja1Var, java.lang.Object obj, defpackage.jp1 jp1Var, defpackage.kl klVar) {
        super(1, klVar);
        this.e6mdH7fiFuta = 1;
        this.Ns0WNyEWdPsk = ja1Var;
        this.fNwYGHIYeJcR = obj;
        this.h3m55N1URyyK = jp1Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        java.lang.Object obj2 = this.fNwYGHIYeJcR;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj3 = this.Ns0WNyEWdPsk;
        java.lang.Object obj4 = this.h3m55N1URyyK;
        switch (i) {
            case 0:
                return new defpackage.da1((defpackage.jp1) obj4, (defpackage.ja1) obj3, this.fNwYGHIYeJcR, (defpackage.kl) obj, 0).s0TASMVLSWD5(gs1Var);
            case 1:
                return new defpackage.da1((defpackage.ja1) obj3, obj2, (defpackage.jp1) obj4, (defpackage.kl) obj).s0TASMVLSWD5(gs1Var);
            default:
                return new defpackage.da1((defpackage.ww0) obj4, (defpackage.wo1) obj3, (defpackage.c20) obj2, (defpackage.kl) obj, 2).s0TASMVLSWD5(gs1Var);
        }
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj2 = this.fNwYGHIYeJcR;
        java.lang.Object obj3 = this.Ns0WNyEWdPsk;
        java.lang.Object obj4 = this.h3m55N1URyyK;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        switch (i) {
            case 0:
                defpackage.jp1 jp1Var = (defpackage.jp1) obj4;
                int i2 = this.GE9mJIPrb8gP;
                if (i2 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.d2 d2Var = new defpackage.d2((defpackage.ja1) obj3, obj2, jp1Var, null);
                    this.GE9mJIPrb8gP = 1;
                    if (defpackage.ok0.IJ0hOnjhPOri(d2Var, this) == tmVar) {
                        return tmVar;
                    }
                } else {
                    if (i2 != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                jp1Var.e6mdH7fiFuta();
                return gs1Var;
            case 1:
                defpackage.jp1 jp1Var2 = (defpackage.jp1) obj4;
                defpackage.ja1 ja1Var = (defpackage.ja1) obj3;
                int i3 = this.GE9mJIPrb8gP;
                if (i3 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    ja1Var.BHfvd2J71qpO();
                    defpackage.pw0 pw0Var = ja1Var.giKS3J6vZuNy;
                    ja1Var.h3m55N1URyyK = Long.MIN_VALUE;
                    ja1Var.IJ0hOnjhPOri(0.0f);
                    float f = obj2.equals(ja1Var.fWTAfUmVKrZq.getValue()) ? -4.0f : obj2.equals(pw0Var.getValue()) ? -5.0f : -3.0f;
                    jp1Var2.XntWc4eZSQ8j(obj2);
                    jp1Var2.gUjdnLbkVAaA(0L);
                    pw0Var.setValue(obj2);
                    ja1Var.IJ0hOnjhPOri(0.0f);
                    ja1Var.Ns0WNyEWdPsk(obj2);
                    jp1Var2.GE9mJIPrb8gP(f);
                    if (f == -3.0f) {
                        this.GE9mJIPrb8gP = 1;
                        if (defpackage.ja1.WmetiUbpKU9I(ja1Var, this) == tmVar) {
                            return tmVar;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                jp1Var2.e6mdH7fiFuta();
                return gs1Var;
            default:
                int i4 = this.GE9mJIPrb8gP;
                if (i4 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    this.GE9mJIPrb8gP = 1;
                    java.lang.Object WDYagTQQm9ns = ((defpackage.ww0) obj4).WDYagTQQm9ns((defpackage.wo1) obj3, (defpackage.c20) obj2, this);
                    return WDYagTQQm9ns == tmVar ? tmVar : WDYagTQQm9ns;
                }
                if (i4 == 1) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    return obj;
                }
                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da1(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, defpackage.kl klVar, int i) {
        super(1, klVar);
        this.e6mdH7fiFuta = i;
        this.h3m55N1URyyK = obj;
        this.Ns0WNyEWdPsk = obj2;
        this.fNwYGHIYeJcR = obj3;
    }
}
