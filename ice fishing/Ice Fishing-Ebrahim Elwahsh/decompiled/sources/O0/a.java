package O0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2340a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2341b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2342c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2343d;

    public a(boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f2340a = z8;
        this.f2341b = z9;
        this.f2342c = z10;
        this.f2343d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2340a == aVar.f2340a && this.f2341b == aVar.f2341b && this.f2342c == aVar.f2342c && this.f2343d == aVar.f2343d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z8 = this.f2340a;
        int i = z8;
        if (z8 != 0) {
            i = 1;
        }
        int i4 = i * 31;
        boolean z9 = this.f2341b;
        int i9 = z9;
        if (z9 != 0) {
            i9 = 1;
        }
        int i10 = (i4 + i9) * 31;
        boolean z10 = this.f2342c;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z11 = this.f2343d;
        return i12 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f2340a + ", isValidated=" + this.f2341b + ", isMetered=" + this.f2342c + ", isNotRoaming=" + this.f2343d + ')';
    }
}
