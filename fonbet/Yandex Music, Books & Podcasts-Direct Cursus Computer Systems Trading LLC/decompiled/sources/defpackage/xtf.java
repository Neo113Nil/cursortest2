package defpackage;

import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class xtf implements sdr {
    public final int a;
    public final int b;
    public final x6k c;
    public int d;

    public xtf(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = new x6k(yhn.m(Math.max(i4 - i3, 0), i4 + i2 + i3), ehv.h);
        this.d = i;
    }

    public final void a(int i) {
        if (i != this.d) {
            this.d = i;
            int i2 = this.a;
            int i3 = (i / i2) * i2;
            int i4 = this.b;
            this.c.setValue(yhn.m(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        return (IntRange) this.c.getValue();
    }
}
