package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wo0 {
    public final boolean JhCgjQRTAOCT;
    public final defpackage.oq0 ZpBGe2uQfcn8;
    public final boolean fWTAfUmVKrZq;
    public final boolean giKS3J6vZuNy;

    public wo0(defpackage.oq0 oq0Var, boolean z, boolean z2) {
        if (!oq0Var.ZpBGe2uQfcn8 && z) {
            defpackage.h7.WDYagTQQm9ns(oq0Var.giKS3J6vZuNy().concat(" does not allow nullable values"));
            throw null;
        }
        this.ZpBGe2uQfcn8 = oq0Var;
        this.giKS3J6vZuNy = z;
        this.fWTAfUmVKrZq = z2;
        this.JhCgjQRTAOCT = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.wo0.class != obj.getClass()) {
            return false;
        }
        defpackage.wo0 wo0Var = (defpackage.wo0) obj;
        return this.giKS3J6vZuNy == wo0Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == wo0Var.fWTAfUmVKrZq && this.ZpBGe2uQfcn8.equals(wo0Var.ZpBGe2uQfcn8);
    }

    public final int hashCode() {
        return ((((this.ZpBGe2uQfcn8.hashCode() * 31) + (this.giKS3J6vZuNy ? 1 : 0)) * 31) + (this.fWTAfUmVKrZq ? 1 : 0)) * 31;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(defpackage.b41.ZpBGe2uQfcn8(defpackage.wo0.class).fWTAfUmVKrZq());
        sb.append(" Type: " + this.ZpBGe2uQfcn8);
        sb.append(" Nullable: " + this.giKS3J6vZuNy);
        if (this.fWTAfUmVKrZq) {
            sb.append(" DefaultValue: null");
        }
        return sb.toString();
    }
}
