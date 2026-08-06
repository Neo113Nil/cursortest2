package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class bs0 {
    public boolean JhCgjQRTAOCT;
    public final defpackage.n80 WDYagTQQm9ns = new defpackage.n80(11);
    public final defpackage.y91 ZpBGe2uQfcn8;
    public defpackage.hp fWTAfUmVKrZq;
    public final defpackage.c20 giKS3J6vZuNy;

    public bs0(defpackage.y91 y91Var, defpackage.c20 c20Var, defpackage.hp hpVar) {
        this.ZpBGe2uQfcn8 = y91Var;
        this.giKS3J6vZuNy = c20Var;
        this.fWTAfUmVKrZq = hpVar;
    }

    public static void ZpBGe2uQfcn8(defpackage.vz0 vz0Var) {
        java.util.List list = vz0Var.ZpBGe2uQfcn8;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.c01) list.get(i)).ZpBGe2uQfcn8();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object giKS3J6vZuNy(defpackage.c20 c20Var, defpackage.ll llVar) {
        defpackage.as0 as0Var;
        int i;
        if (llVar instanceof defpackage.as0) {
            as0Var = (defpackage.as0) llVar;
            int i2 = as0Var.GE9mJIPrb8gP;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                as0Var.GE9mJIPrb8gP = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = as0Var.P05cfTpS5W5L;
                i = as0Var.GE9mJIPrb8gP;
                defpackage.kl klVar = null;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    this.JhCgjQRTAOCT = true;
                    defpackage.JhCgjQRTAOCT jhCgjQRTAOCT = new defpackage.JhCgjQRTAOCT(this, c20Var, klVar, 18);
                    as0Var.GE9mJIPrb8gP = 1;
                    defpackage.jm jmVar = as0Var.oh71FJcDz6S2;
                    jmVar.getClass();
                    defpackage.vh1 vh1Var = new defpackage.vh1(as0Var, jmVar);
                    java.lang.Object frSwwKIlbUhK = defpackage.b80.frSwwKIlbUhK(vh1Var, vh1Var, jhCgjQRTAOCT);
                    defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (frSwwKIlbUhK == tmVar) {
                        return tmVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                this.JhCgjQRTAOCT = false;
                return defpackage.gs1.ZpBGe2uQfcn8;
            }
        }
        as0Var = new defpackage.as0(this, llVar);
        java.lang.Object obj2 = as0Var.P05cfTpS5W5L;
        i = as0Var.GE9mJIPrb8gP;
        defpackage.kl klVar2 = null;
        if (i != 0) {
        }
        this.JhCgjQRTAOCT = false;
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
