package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kd {
    public long JhCgjQRTAOCT;
    public defpackage.hp ZpBGe2uQfcn8;
    public defpackage.id fWTAfUmVKrZq;
    public defpackage.sc0 giKS3J6vZuNy;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kd)) {
            return false;
        }
        defpackage.kd kdVar = (defpackage.kd) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, kdVar.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == kdVar.giKS3J6vZuNy && defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, kdVar.fWTAfUmVKrZq) && defpackage.ae1.ZpBGe2uQfcn8(this.JhCgjQRTAOCT, kdVar.JhCgjQRTAOCT);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.JhCgjQRTAOCT) + ((this.fWTAfUmVKrZq.hashCode() + ((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "DrawParams(density=" + this.ZpBGe2uQfcn8 + ", layoutDirection=" + this.giKS3J6vZuNy + ", canvas=" + this.fWTAfUmVKrZq + ", size=" + ((java.lang.Object) defpackage.ae1.JhCgjQRTAOCT(this.JhCgjQRTAOCT)) + ')';
    }
}
