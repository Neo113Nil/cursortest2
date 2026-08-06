package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vw {
    public final defpackage.kq1 ZpBGe2uQfcn8;

    public vw(defpackage.kq1 kq1Var) {
        this.ZpBGe2uQfcn8 = kq1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.vw) {
            return java.lang.Float.compare(0.0f, 0.0f) == 0 && this.ZpBGe2uQfcn8.equals(((defpackage.vw) obj).ZpBGe2uQfcn8);
        }
        return false;
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8.hashCode() + (java.lang.Float.hashCode(0.0f) * 31);
    }

    public final java.lang.String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.ZpBGe2uQfcn8 + ')';
    }
}
