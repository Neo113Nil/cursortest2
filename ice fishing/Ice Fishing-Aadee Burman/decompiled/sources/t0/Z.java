package t0;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public int f40633a;

    /* renamed from: b, reason: collision with root package name */
    public int f40634b;

    /* renamed from: c, reason: collision with root package name */
    public int f40635c;

    /* renamed from: d, reason: collision with root package name */
    public int f40636d;

    /* renamed from: e, reason: collision with root package name */
    public int f40637e;

    public final boolean a() {
        int i = this.f40633a;
        int i6 = 2;
        if ((i & 7) != 0) {
            int i9 = this.f40636d;
            int i10 = this.f40634b;
            if (((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i11 = this.f40636d;
            int i12 = this.f40635c;
            if ((((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i13 = this.f40637e;
            int i14 = this.f40634b;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i15 = this.f40637e;
            int i16 = this.f40635c;
            if (i15 > i16) {
                i6 = 1;
            } else if (i15 != i16) {
                i6 = 4;
            }
            if ((i & (i6 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
