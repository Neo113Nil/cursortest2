package t0;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public int f40686a;

    /* renamed from: b, reason: collision with root package name */
    public int f40687b;

    /* renamed from: c, reason: collision with root package name */
    public int f40688c;

    /* renamed from: d, reason: collision with root package name */
    public int f40689d;

    /* renamed from: e, reason: collision with root package name */
    public int f40690e;

    public final boolean a() {
        int i = this.f40686a;
        int i4 = 2;
        if ((i & 7) != 0) {
            int i6 = this.f40689d;
            int i9 = this.f40687b;
            if (((i6 > i9 ? 1 : i6 == i9 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i10 = this.f40689d;
            int i11 = this.f40688c;
            if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i12 = this.f40690e;
            int i13 = this.f40687b;
            if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i14 = this.f40690e;
            int i15 = this.f40688c;
            if (i14 > i15) {
                i4 = 1;
            } else if (i14 != i15) {
                i4 = 4;
            }
            if ((i & (i4 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
