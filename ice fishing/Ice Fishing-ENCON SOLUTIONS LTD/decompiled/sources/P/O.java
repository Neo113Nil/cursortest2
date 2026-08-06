package P;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public int f1293a;

    /* renamed from: b, reason: collision with root package name */
    public int f1294b;

    /* renamed from: c, reason: collision with root package name */
    public int f1295c;

    /* renamed from: d, reason: collision with root package name */
    public int f1296d;

    /* renamed from: e, reason: collision with root package name */
    public int f1297e;

    public final boolean a() {
        int i2 = this.f1293a;
        int i3 = 2;
        if ((i2 & 7) != 0) {
            int i4 = this.f1296d;
            int i5 = this.f1294b;
            if (((i4 > i5 ? 1 : i4 == i5 ? 2 : 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 112) != 0) {
            int i6 = this.f1296d;
            int i7 = this.f1295c;
            if ((((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 1792) != 0) {
            int i8 = this.f1297e;
            int i9 = this.f1294b;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 8) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 28672) != 0) {
            int i10 = this.f1297e;
            int i11 = this.f1295c;
            if (i10 > i11) {
                i3 = 1;
            } else if (i10 != i11) {
                i3 = 4;
            }
            if ((i2 & (i3 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
