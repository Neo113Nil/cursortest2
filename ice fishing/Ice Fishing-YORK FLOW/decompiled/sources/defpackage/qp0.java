package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qp0 {
    public java.lang.Object WDYagTQQm9ns;
    public int ZpBGe2uQfcn8;
    public java.lang.Object oh71FJcDz6S2;
    public java.lang.Object giKS3J6vZuNy = new defpackage.o50[32];
    public java.lang.Object fWTAfUmVKrZq = new float[32];
    public java.lang.Object JhCgjQRTAOCT = new byte[32];

    public qp0() {
        defpackage.zn0 zn0Var = defpackage.n81.ZpBGe2uQfcn8;
        this.WDYagTQQm9ns = new defpackage.zn0();
        this.oh71FJcDz6S2 = new defpackage.zn0();
    }

    public defpackage.mp0 ZpBGe2uQfcn8(java.lang.String str) {
        defpackage.kp0 kp0Var;
        str.getClass();
        defpackage.ti1 ti1Var = (defpackage.ti1) this.oh71FJcDz6S2;
        if (ti1Var == null || (kp0Var = (defpackage.kp0) ti1Var.getValue()) == null) {
            return null;
        }
        int i = defpackage.np0.e6mdH7fiFuta;
        android.net.Uri parse = android.net.Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        android.os.Bundle JhCgjQRTAOCT = kp0Var.JhCgjQRTAOCT(parse, (java.util.LinkedHashMap) this.JhCgjQRTAOCT);
        if (JhCgjQRTAOCT == null) {
            return null;
        }
        return new defpackage.mp0((defpackage.np0) this.giKS3J6vZuNy, JhCgjQRTAOCT, kp0Var.fNwYGHIYeJcR, kp0Var.giKS3J6vZuNy(parse), false);
    }
}
