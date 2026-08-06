package defpackage;

/* loaded from: classes.dex */
public final class PAEGRtP0bX extends defpackage.abhbClRa implements java.util.RandomAccess {
    public final int AARZUJiTa;
    public final defpackage.abhbClRa adDC3e2L;
    public final int xiZrDbcSW0;

    public PAEGRtP0bX(defpackage.abhbClRa abhbclra, int i, int i2) {
        this.adDC3e2L = abhbclra;
        this.xiZrDbcSW0 = i;
        defpackage.ci0.SyNS6RMn(i, i2, abhbclra.IHQe1A4L2xu());
        this.AARZUJiTa = i2 - i;
    }

    @Override // defpackage.SyNS6RMn
    public final int IHQe1A4L2xu() {
        return this.AARZUJiTa;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        int i2 = this.AARZUJiTa;
        if (i < 0 || i >= i2) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.adDC3e2L.get(this.xiZrDbcSW0 + i);
    }

    @Override // defpackage.abhbClRa, java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.ci0.SyNS6RMn(i, i2, this.AARZUJiTa);
        int i3 = this.xiZrDbcSW0;
        return new defpackage.PAEGRtP0bX(this.adDC3e2L, i + i3, i3 + i2);
    }
}
