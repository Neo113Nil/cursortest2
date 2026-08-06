package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class t70 implements m51 {
    public int EljAMC1QTz;
    public final fo0 OOA6hdeuvCS;

    public t70(int i) {
        int i2 = (i / 30) * 30;
        this.OOA6hdeuvCS = new fo0(o50.MZhzXH72(Math.max(i2 - 100, 0), i2 + 130), k61.EljAMC1QTz);
        this.EljAMC1QTz = i;
    }

    @Override // defpackage.m51
    public final Object getValue() {
        return (x20) this.OOA6hdeuvCS.getValue();
    }
}
