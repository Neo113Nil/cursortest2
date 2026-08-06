package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class h00 {
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public final /* synthetic */ java.lang.Object giKS3J6vZuNy;

    public /* synthetic */ h00(int i, java.lang.Object obj) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = obj;
    }

    public final void ZpBGe2uQfcn8(java.lang.Object obj) {
        switch (this.ZpBGe2uQfcn8) {
            case 0:
                defpackage.j00 j00Var = (defpackage.j00) obj;
                if (j00Var == null) {
                    j00Var = new defpackage.j00(-3);
                }
                ((defpackage.n80) this.giKS3J6vZuNy).oCu53ZX2v4Ju(j00Var);
                return;
            default:
                defpackage.j00 j00Var2 = (defpackage.j00) obj;
                synchronized (defpackage.k00.fWTAfUmVKrZq) {
                    try {
                        defpackage.ud1 ud1Var = defpackage.k00.JhCgjQRTAOCT;
                        java.util.ArrayList arrayList = (java.util.ArrayList) ud1Var.get((java.lang.String) this.giKS3J6vZuNy);
                        if (arrayList == null) {
                            return;
                        }
                        ud1Var.remove((java.lang.String) this.giKS3J6vZuNy);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((defpackage.h00) arrayList.get(i)).ZpBGe2uQfcn8(j00Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
