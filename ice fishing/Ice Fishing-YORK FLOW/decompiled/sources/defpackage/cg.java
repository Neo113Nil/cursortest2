package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class cg implements defpackage.pm1 {
    public final long ZpBGe2uQfcn8;

    public cg(long j) {
        this.ZpBGe2uQfcn8 = j;
        if (j != 16) {
            return;
        }
        defpackage.f80.ZpBGe2uQfcn8("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.pm1
    public final float ZpBGe2uQfcn8() {
        return defpackage.pf.JhCgjQRTAOCT(this.ZpBGe2uQfcn8);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cg) && defpackage.pf.fWTAfUmVKrZq(this.ZpBGe2uQfcn8, ((defpackage.cg) obj).ZpBGe2uQfcn8);
    }

    @Override // defpackage.pm1
    public final defpackage.vb fWTAfUmVKrZq() {
        return null;
    }

    @Override // defpackage.pm1
    public final long giKS3J6vZuNy() {
        return this.ZpBGe2uQfcn8;
    }

    public final int hashCode() {
        int i = defpackage.pf.P05cfTpS5W5L;
        return java.lang.Long.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return "ColorStyle(value=" + ((java.lang.Object) defpackage.pf.e6mdH7fiFuta(this.ZpBGe2uQfcn8)) + ')';
    }
}
