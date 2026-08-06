package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fz0 {
    public static final defpackage.fz0 fWTAfUmVKrZq = new defpackage.fz0(0, false);
    public final boolean ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public fz0() {
        this.ZpBGe2uQfcn8 = false;
        this.giKS3J6vZuNy = 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fz0)) {
            return false;
        }
        defpackage.fz0 fz0Var = (defpackage.fz0) obj;
        return this.ZpBGe2uQfcn8 == fz0Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == fz0Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.giKS3J6vZuNy) + (java.lang.Boolean.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.ZpBGe2uQfcn8 + ", emojiSupportMatch=" + ((java.lang.Object) defpackage.tu.ZpBGe2uQfcn8(this.giKS3J6vZuNy)) + ')';
    }

    public fz0(int i, boolean z) {
        this.ZpBGe2uQfcn8 = z;
        this.giKS3J6vZuNy = i;
    }
}
