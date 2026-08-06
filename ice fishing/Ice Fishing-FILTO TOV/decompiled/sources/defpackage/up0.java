package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class up0 {
    public int EljAMC1QTz;
    public int OOA6hdeuvCS;
    public long AvO7iQsrTN = 0;
    public long encWxUiV2 = vp0.GWasM1elztuh;
    public long mOu10nynGul = 0;

    public abstract void EDwNPVYuViP0(long j, float f, hv hvVar);

    public final void ES6ysExf() {
        this.OOA6hdeuvCS = o50.encWxUiV2((int) (this.AvO7iQsrTN >> 32), eg.JFJ3QoxA(this.encWxUiV2), eg.encWxUiV2(this.encWxUiV2));
        this.EljAMC1QTz = o50.encWxUiV2((int) (this.AvO7iQsrTN & 4294967295L), eg.mOu10nynGul(this.encWxUiV2), eg.AvO7iQsrTN(this.encWxUiV2));
        int i = this.OOA6hdeuvCS;
        long j = this.AvO7iQsrTN;
        this.mOu10nynGul = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public int JFXS9W1rB5s4() {
        return (int) (this.AvO7iQsrTN >> 32);
    }

    public final void Qd9Q8OZgvOo4(long j) {
        if (eg.Yi7zF1RB1(this.encWxUiV2, j)) {
            return;
        }
        this.encWxUiV2 = j;
        ES6ysExf();
    }

    public int ZCWXqiC0() {
        return (int) (this.AvO7iQsrTN & 4294967295L);
    }

    public final void dcDmLGVhzWm(long j) {
        if (b30.GWasM1elztuh(this.AvO7iQsrTN, j)) {
            return;
        }
        this.AvO7iQsrTN = j;
        ES6ysExf();
    }

    public Object encWxUiV2() {
        return null;
    }

    public abstract int mqNvfisv7(iK7aQfvhG ik7aqfvhg);
}
