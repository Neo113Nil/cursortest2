package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ks0 implements defpackage.rb0 {
    public final defpackage.rb0 ZpBGe2uQfcn8;
    public final defpackage.ic1 giKS3J6vZuNy;

    public ks0(defpackage.rb0 rb0Var) {
        this.ZpBGe2uQfcn8 = rb0Var;
        this.giKS3J6vZuNy = new defpackage.ic1(rb0Var.giKS3J6vZuNy());
    }

    @Override // defpackage.rb0
    public final void ZpBGe2uQfcn8(defpackage.up0 up0Var, java.lang.Object obj) {
        if (obj != null) {
            up0Var.GE9mJIPrb8gP(this.ZpBGe2uQfcn8, obj);
        } else {
            up0Var.WmetiUbpKU9I(null);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && defpackage.ks0.class == obj.getClass() && this.ZpBGe2uQfcn8.equals(((defpackage.ks0) obj).ZpBGe2uQfcn8);
    }

    @Override // defpackage.rb0
    public final defpackage.hc1 giKS3J6vZuNy() {
        return this.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8.hashCode();
    }
}
