package O0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2154a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2155b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2156c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2157d;

    public a(boolean z3, boolean z6, boolean z9, boolean z10) {
        this.f2154a = z3;
        this.f2155b = z6;
        this.f2156c = z9;
        this.f2157d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2154a == aVar.f2154a && this.f2155b == aVar.f2155b && this.f2156c == aVar.f2156c && this.f2157d == aVar.f2157d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z3 = this.f2154a;
        int i = z3;
        if (z3 != 0) {
            i = 1;
        }
        int i6 = i * 31;
        boolean z6 = this.f2155b;
        int i9 = z6;
        if (z6 != 0) {
            i9 = 1;
        }
        int i10 = (i6 + i9) * 31;
        boolean z9 = this.f2156c;
        int i11 = z9;
        if (z9 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z10 = this.f2157d;
        return i12 + (z10 ? 1 : z10 ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f2154a + ", isValidated=" + this.f2155b + ", isMetered=" + this.f2156c + ", isNotRoaming=" + this.f2157d + ')';
    }
}
