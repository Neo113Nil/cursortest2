package defpackage;

/* loaded from: classes.dex */
public final class v40 extends defpackage.abhbClRa {
    public final int AARZUJiTa;
    public final defpackage.D2vUnMij adDC3e2L;
    public final int xiZrDbcSW0;

    public v40(defpackage.D2vUnMij d2vUnMij, int i, int i2) {
        this.adDC3e2L = d2vUnMij;
        this.xiZrDbcSW0 = i;
        defpackage.e90.JlrlGoKF(i, i2, d2vUnMij.IHQe1A4L2xu());
        this.AARZUJiTa = i2 - i;
    }

    @Override // defpackage.SyNS6RMn
    public final int IHQe1A4L2xu() {
        return this.AARZUJiTa;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        defpackage.e90.riuEU0zW4(i, this.AARZUJiTa);
        return this.adDC3e2L.get(this.xiZrDbcSW0 + i);
    }

    @Override // defpackage.abhbClRa, java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.e90.JlrlGoKF(i, i2, this.AARZUJiTa);
        int i3 = this.xiZrDbcSW0;
        return new defpackage.v40(this.adDC3e2L, i + i3, i3 + i2);
    }
}
