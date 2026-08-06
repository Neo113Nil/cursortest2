package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class c61 implements defpackage.c70 {
    public final boolean ZpBGe2uQfcn8;
    public final long giKS3J6vZuNy;

    public c61(long j, boolean z) {
        this.ZpBGe2uQfcn8 = z;
        this.giKS3J6vZuNy = j;
    }

    @Override // defpackage.c70
    public final defpackage.wo ZpBGe2uQfcn8(defpackage.in0 in0Var) {
        return new defpackage.cp(in0Var, this.ZpBGe2uQfcn8, new defpackage.bp(1, this));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.c61)) {
            return false;
        }
        defpackage.c61 c61Var = (defpackage.c61) obj;
        if (this.ZpBGe2uQfcn8 == c61Var.ZpBGe2uQfcn8 && defpackage.or.giKS3J6vZuNy(Float.NaN, Float.NaN)) {
            return defpackage.pf.fWTAfUmVKrZq(this.giKS3J6vZuNy, c61Var.giKS3J6vZuNy);
        }
        return false;
    }

    @Override // defpackage.c70
    public final int hashCode() {
        int ZpBGe2uQfcn8 = defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(Float.NaN, java.lang.Boolean.hashCode(this.ZpBGe2uQfcn8) * 31, 961);
        int i = defpackage.pf.P05cfTpS5W5L;
        return java.lang.Long.hashCode(this.giKS3J6vZuNy) + ZpBGe2uQfcn8;
    }
}
