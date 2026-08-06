package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ov {
    public static final defpackage.ov giKS3J6vZuNy = new defpackage.ov(new defpackage.kp1((defpackage.vw) null, (defpackage.q70) (0 == true ? 1 : 0), (java.util.LinkedHashMap) (0 == true ? 1 : 0), 127));
    public final defpackage.kp1 ZpBGe2uQfcn8;

    public ov(defpackage.kp1 kp1Var) {
        this.ZpBGe2uQfcn8 = kp1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ov) && ((defpackage.ov) obj).ZpBGe2uQfcn8.equals(this.ZpBGe2uQfcn8);
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8.hashCode();
    }

    public final java.lang.String toString() {
        if (equals(giKS3J6vZuNy)) {
            return "EnterTransition.None";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnterTransition: \nFade - ");
        defpackage.vw vwVar = this.ZpBGe2uQfcn8.ZpBGe2uQfcn8;
        sb.append(vwVar != null ? vwVar.toString() : null);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - ");
        sb.append((java.lang.String) null);
        return sb.toString();
    }
}
