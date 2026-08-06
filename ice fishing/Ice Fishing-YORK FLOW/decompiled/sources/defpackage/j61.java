package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class j61 {
    public boolean ZpBGe2uQfcn8;
    public final java.lang.Object giKS3J6vZuNy;

    public j61(java.lang.String str, boolean z) {
        this.ZpBGe2uQfcn8 = z;
        this.giKS3J6vZuNy = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object ZpBGe2uQfcn8(long j, long j2, defpackage.ll llVar) {
        defpackage.k91 k91Var;
        int i;
        long j3;
        if (llVar instanceof defpackage.k91) {
            k91Var = (defpackage.k91) llVar;
            int i2 = k91Var.Ns0WNyEWdPsk;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k91Var.Ns0WNyEWdPsk = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = k91Var.e6mdH7fiFuta;
                i = k91Var.Ns0WNyEWdPsk;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    j3 = 0;
                    if (this.ZpBGe2uQfcn8) {
                        defpackage.y91 y91Var = (defpackage.y91) this.giKS3J6vZuNy;
                        if (!y91Var.e6mdH7fiFuta) {
                            k91Var.P05cfTpS5W5L = j2;
                            k91Var.Ns0WNyEWdPsk = 1;
                            obj = y91Var.ZpBGe2uQfcn8(j2, k91Var);
                            defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                            if (obj == tmVar) {
                                return tmVar;
                            }
                        }
                        j3 = defpackage.jt1.JhCgjQRTAOCT(j2, j3);
                    }
                    return new defpackage.jt1(j3);
                }
                if (i != 1) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = k91Var.P05cfTpS5W5L;
                defpackage.b80.KrtOTfE6jiS2(obj);
                j3 = ((defpackage.jt1) obj).ZpBGe2uQfcn8;
                j3 = defpackage.jt1.JhCgjQRTAOCT(j2, j3);
                return new defpackage.jt1(j3);
            }
        }
        k91Var = new defpackage.k91(this, llVar);
        java.lang.Object obj2 = k91Var.e6mdH7fiFuta;
        i = k91Var.Ns0WNyEWdPsk;
        if (i != 0) {
        }
        j3 = ((defpackage.jt1) obj2).ZpBGe2uQfcn8;
        j3 = defpackage.jt1.JhCgjQRTAOCT(j2, j3);
        return new defpackage.jt1(j3);
    }

    public j61(defpackage.y91 y91Var, boolean z) {
        this.giKS3J6vZuNy = y91Var;
        this.ZpBGe2uQfcn8 = z;
    }
}
