package defpackage;

/* loaded from: classes4.dex */
public final class lap implements ohm {
    public final float a;
    public final int b;
    public final int c;

    public lap(int i, float f, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ohm
    public final long a(aqe aqeVar, long j, xof xofVar, long j2) {
        aqeVar.getClass();
        xofVar.getClass();
        int i = aqeVar.a;
        int i2 = aqeVar.c;
        int b = ouj.b(i2, i, 2, i);
        int i3 = (i2 - i) - (this.c * 2);
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = (int) (j2 >> 32);
        int i5 = (i3 - i4) / 2;
        int i6 = i5 >= 0 ? i5 : 0;
        return xv.t((b - (i4 / 2)) + yhn.d(eeh.b(this.a), -i6, i6), (aqeVar.b - ((int) (4294967295L & j2))) - this.b);
    }
}
