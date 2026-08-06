package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class t6 implements android.window.OnBackInvokedCallback {
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public final /* synthetic */ java.lang.Object giKS3J6vZuNy;

    public /* synthetic */ t6(int i, java.lang.Object obj) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = obj;
    }

    public final void onBackInvoked() {
        int i = this.ZpBGe2uQfcn8;
        java.lang.Object obj = this.giKS3J6vZuNy;
        switch (i) {
            case 0:
                defpackage.n10 n10Var = (defpackage.n10) obj;
                if (n10Var != null) {
                    n10Var.ZpBGe2uQfcn8();
                    break;
                }
                break;
            default:
                ((defpackage.dt0) obj).ZpBGe2uQfcn8();
                break;
        }
    }
}
