package O0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2242a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2243b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2244c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2245d;

    public a(boolean z6, boolean z9, boolean z10, boolean z11) {
        this.f2242a = z6;
        this.f2243b = z9;
        this.f2244c = z10;
        this.f2245d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2242a == aVar.f2242a && this.f2243b == aVar.f2243b && this.f2244c == aVar.f2244c && this.f2245d == aVar.f2245d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z6 = this.f2242a;
        int i = z6;
        if (z6 != 0) {
            i = 1;
        }
        int i4 = i * 31;
        boolean z9 = this.f2243b;
        int i6 = z9;
        if (z9 != 0) {
            i6 = 1;
        }
        int i9 = (i4 + i6) * 31;
        boolean z10 = this.f2244c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        boolean z11 = this.f2245d;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f2242a + ", isValidated=" + this.f2243b + ", isMetered=" + this.f2244c + ", isNotRoaming=" + this.f2245d + ')';
    }
}
