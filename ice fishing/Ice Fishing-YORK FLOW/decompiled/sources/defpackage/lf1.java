package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lf1 extends defpackage.vb {
    public final long ZpBGe2uQfcn8;

    public lf1(long j) {
        this.ZpBGe2uQfcn8 = j;
    }

    @Override // defpackage.vb
    public final void ZpBGe2uQfcn8(float f, long j, defpackage.j2 j2Var) {
        j2Var.fWTAfUmVKrZq(1.0f);
        long j2 = this.ZpBGe2uQfcn8;
        if (f != 1.0f) {
            j2 = defpackage.pf.giKS3J6vZuNy(j2, defpackage.pf.JhCgjQRTAOCT(j2) * f);
        }
        j2Var.WDYagTQQm9ns(j2);
        if (((android.graphics.Shader) j2Var.fWTAfUmVKrZq) != null) {
            j2Var.P05cfTpS5W5L(null);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lf1) {
            return defpackage.pf.fWTAfUmVKrZq(this.ZpBGe2uQfcn8, ((defpackage.lf1) obj).ZpBGe2uQfcn8);
        }
        return false;
    }

    public final int hashCode() {
        int i = defpackage.pf.P05cfTpS5W5L;
        return java.lang.Long.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return "SolidColor(value=" + ((java.lang.Object) defpackage.pf.e6mdH7fiFuta(this.ZpBGe2uQfcn8)) + ')';
    }
}
