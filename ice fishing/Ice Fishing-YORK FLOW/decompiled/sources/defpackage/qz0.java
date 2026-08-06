package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class qz0 {
    public static final defpackage.ng1 ZpBGe2uQfcn8 = new defpackage.ng1(defpackage.pj.s0TASMVLSWD5);

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ZpBGe2uQfcn8(defpackage.cg0 cg0Var, defpackage.e2 e2Var, defpackage.ll llVar) {
        defpackage.oz0 oz0Var;
        int i;
        if (llVar instanceof defpackage.oz0) {
            oz0Var = (defpackage.oz0) llVar;
            int i2 = oz0Var.e6mdH7fiFuta;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oz0Var.e6mdH7fiFuta = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = oz0Var.P05cfTpS5W5L;
                i = oz0Var.e6mdH7fiFuta;
                if (i == 0) {
                    if (i != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return;
                    } else {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        defpackage.h7.JhCgjQRTAOCT();
                        return;
                    }
                }
                defpackage.b80.KrtOTfE6jiS2(obj);
                if (!cg0Var.WDYagTQQm9ns.s0TASMVLSWD5) {
                    defpackage.h7.w7APNrr0aGRc("establishTextInputSession called from an unattached node");
                    return;
                }
                defpackage.ov0 qjMheFZ0l9kA = defpackage.la0.qjMheFZ0l9kA(cg0Var);
                defpackage.ay0 ay0Var = (defpackage.ay0) defpackage.la0.UmgHb6n58gfG(cg0Var).jjTN4uUnoyEn;
                ay0Var.getClass();
                if (defpackage.h0.Jkfc0NcwyPL8(ay0Var, ZpBGe2uQfcn8) != null) {
                    defpackage.p81.ZpBGe2uQfcn8();
                    return;
                } else {
                    oz0Var.e6mdH7fiFuta = 1;
                    giKS3J6vZuNy(qjMheFZ0l9kA, e2Var, oz0Var);
                    return;
                }
            }
        }
        oz0Var = new defpackage.oz0(llVar);
        java.lang.Object obj2 = oz0Var.P05cfTpS5W5L;
        i = oz0Var.e6mdH7fiFuta;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void giKS3J6vZuNy(defpackage.ov0 ov0Var, defpackage.c20 c20Var, defpackage.ll llVar) {
        defpackage.pz0 pz0Var;
        int i;
        if (llVar instanceof defpackage.pz0) {
            pz0Var = (defpackage.pz0) llVar;
            int i2 = pz0Var.e6mdH7fiFuta;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pz0Var.e6mdH7fiFuta = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = pz0Var.P05cfTpS5W5L;
                i = pz0Var.e6mdH7fiFuta;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    pz0Var.e6mdH7fiFuta = 1;
                    ((defpackage.u) ov0Var).BXaznwstz2U0(c20Var, pz0Var);
                    return;
                } else if (i == 1) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.h7.JhCgjQRTAOCT();
                    return;
                } else if (i != 2) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.h7.JhCgjQRTAOCT();
                    return;
                }
            }
        }
        pz0Var = new defpackage.pz0(llVar);
        java.lang.Object obj2 = pz0Var.P05cfTpS5W5L;
        i = pz0Var.e6mdH7fiFuta;
        if (i != 0) {
        }
    }
}
