package j$.time.temporal;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ m(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.l
    public final Temporal c(Temporal temporal) {
        switch (this.a) {
            case 0:
                int e = temporal.e(a.DAY_OF_WEEK);
                int i = this.b;
                if (e == i) {
                    return temporal;
                }
                return temporal.l(e - i >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int e2 = temporal.e(a.DAY_OF_WEEK);
                int i2 = this.b;
                if (e2 == i2) {
                    return temporal;
                }
                return temporal.a(i2 - e2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }
}
