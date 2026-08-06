package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class w71 implements defpackage.z71 {
    public final defpackage.ti1 JhCgjQRTAOCT;
    public final defpackage.n80 ZpBGe2uQfcn8;
    public android.os.Bundle fWTAfUmVKrZq;
    public boolean giKS3J6vZuNy;

    public w71(defpackage.n80 n80Var, defpackage.ru1 ru1Var) {
        n80Var.getClass();
        this.ZpBGe2uQfcn8 = n80Var;
        this.JhCgjQRTAOCT = new defpackage.ti1(new defpackage.l3(25, ru1Var));
    }

    @Override // defpackage.z71
    public final android.os.Bundle ZpBGe2uQfcn8() {
        android.os.Bundle GE9mJIPrb8gP = defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(new defpackage.bw0[0], 0));
        android.os.Bundle bundle = this.fWTAfUmVKrZq;
        if (bundle != null) {
            GE9mJIPrb8gP.putAll(bundle);
        }
        for (java.util.Map.Entry entry : ((defpackage.x71) this.JhCgjQRTAOCT.getValue()).giKS3J6vZuNy.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.os.Bundle ZpBGe2uQfcn8 = ((defpackage.ah) ((defpackage.s71) entry.getValue()).giKS3J6vZuNy.WDYagTQQm9ns).ZpBGe2uQfcn8();
            if (!ZpBGe2uQfcn8.isEmpty()) {
                str.getClass();
                GE9mJIPrb8gP.putBundle(str, ZpBGe2uQfcn8);
            }
        }
        this.giKS3J6vZuNy = false;
        return GE9mJIPrb8gP;
    }

    public final void giKS3J6vZuNy() {
        if (this.giKS3J6vZuNy) {
            return;
        }
        android.os.Bundle gUjdnLbkVAaA = this.ZpBGe2uQfcn8.gUjdnLbkVAaA("androidx.lifecycle.internal.SavedStateHandlesProvider");
        android.os.Bundle GE9mJIPrb8gP = defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(new defpackage.bw0[0], 0));
        android.os.Bundle bundle = this.fWTAfUmVKrZq;
        if (bundle != null) {
            GE9mJIPrb8gP.putAll(bundle);
        }
        if (gUjdnLbkVAaA != null) {
            GE9mJIPrb8gP.putAll(gUjdnLbkVAaA);
        }
        this.fWTAfUmVKrZq = GE9mJIPrb8gP;
        this.giKS3J6vZuNy = true;
    }
}
