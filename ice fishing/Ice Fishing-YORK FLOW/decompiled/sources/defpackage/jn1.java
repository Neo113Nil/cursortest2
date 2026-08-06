package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jn1 {
    public final long ZpBGe2uQfcn8;
    public final long giKS3J6vZuNy;

    public jn1(long j, long j2) {
        this.ZpBGe2uQfcn8 = j;
        this.giKS3J6vZuNy = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.jn1)) {
            return false;
        }
        defpackage.jn1 jn1Var = (defpackage.jn1) obj;
        return defpackage.pf.fWTAfUmVKrZq(this.ZpBGe2uQfcn8, jn1Var.ZpBGe2uQfcn8) && defpackage.pf.fWTAfUmVKrZq(this.giKS3J6vZuNy, jn1Var.giKS3J6vZuNy);
    }

    public final int hashCode() {
        int i = defpackage.pf.P05cfTpS5W5L;
        return java.lang.Long.hashCode(this.giKS3J6vZuNy) + (java.lang.Long.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionColors(selectionHandleColor=");
        defpackage.pVQOaWB9QMo4.WmetiUbpKU9I(this.ZpBGe2uQfcn8, sb, ", selectionBackgroundColor=");
        sb.append((java.lang.Object) defpackage.pf.e6mdH7fiFuta(this.giKS3J6vZuNy));
        sb.append(')');
        return sb.toString();
    }
}
