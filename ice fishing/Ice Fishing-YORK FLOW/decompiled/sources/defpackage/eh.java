package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class eh {
    public final transient java.util.LinkedHashMap JhCgjQRTAOCT;
    public final java.util.LinkedHashMap WDYagTQQm9ns;
    public final java.util.ArrayList fWTAfUmVKrZq;
    public final android.os.Bundle oh71FJcDz6S2;
    public final java.util.LinkedHashMap ZpBGe2uQfcn8 = new java.util.LinkedHashMap();
    public final java.util.LinkedHashMap giKS3J6vZuNy = new java.util.LinkedHashMap();

    public eh() {
        new java.util.LinkedHashMap();
        this.fWTAfUmVKrZq = new java.util.ArrayList();
        this.JhCgjQRTAOCT = new java.util.LinkedHashMap();
        this.WDYagTQQm9ns = new java.util.LinkedHashMap();
        this.oh71FJcDz6S2 = new android.os.Bundle();
    }

    public final boolean ZpBGe2uQfcn8(int i, int i2, android.content.Intent intent) {
        java.lang.String str = (java.lang.String) this.ZpBGe2uQfcn8.get(java.lang.Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        if (this.JhCgjQRTAOCT.get(str) != null) {
            defpackage.p81.ZpBGe2uQfcn8();
            return false;
        }
        this.WDYagTQQm9ns.remove(str);
        this.oh71FJcDz6S2.putParcelable(str, new defpackage.Ux2tdpxXtKdg(intent, i2));
        return true;
    }
}
