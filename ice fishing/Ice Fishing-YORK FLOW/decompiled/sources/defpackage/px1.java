package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class px1 extends defpackage.mi1 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public final /* synthetic */ defpackage.qx1 Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ px1(defpackage.qx1 qx1Var, defpackage.kl klVar, int i) {
        super(2, klVar);
        this.e6mdH7fiFuta = i;
        this.Ns0WNyEWdPsk = qx1Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.sm smVar = (defpackage.sm) obj;
        defpackage.kl klVar = (defpackage.kl) obj2;
        switch (i) {
        }
        return ((defpackage.px1) XntWc4eZSQ8j(klVar, smVar)).s0TASMVLSWD5(gs1Var);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.qx1 qx1Var = this.Ns0WNyEWdPsk;
        switch (i) {
            case 0:
                return new defpackage.px1(qx1Var, klVar, 0);
            default:
                return new defpackage.px1(qx1Var, klVar, 1);
        }
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.qx1 qx1Var = this.Ns0WNyEWdPsk;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        switch (i) {
            case 0:
                int i2 = this.GE9mJIPrb8gP;
                if (i2 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.u uVar = qx1Var.WDYagTQQm9ns;
                    this.GE9mJIPrb8gP = 1;
                    java.lang.Object JhCgjQRTAOCT = uVar.qjMheFZ0l9kA.JhCgjQRTAOCT(this);
                    if (JhCgjQRTAOCT != tmVar) {
                        JhCgjQRTAOCT = gs1Var;
                    }
                    if (JhCgjQRTAOCT == tmVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                break;
            default:
                int i3 = this.GE9mJIPrb8gP;
                if (i3 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.u uVar2 = qx1Var.WDYagTQQm9ns;
                    this.GE9mJIPrb8gP = 1;
                    java.lang.Object ZpBGe2uQfcn8 = uVar2.jjTN4uUnoyEn.ZpBGe2uQfcn8(this);
                    if (ZpBGe2uQfcn8 != tmVar) {
                        ZpBGe2uQfcn8 = gs1Var;
                    }
                    if (ZpBGe2uQfcn8 == tmVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                break;
        }
        return tmVar;
    }
}
