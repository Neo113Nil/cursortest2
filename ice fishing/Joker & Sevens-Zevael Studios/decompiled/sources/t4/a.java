package t4;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6518a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6519b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6520c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6521d;

    public a(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f6518a = z10;
        this.f6519b = z11;
        this.f6520c = z12;
        this.f6521d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6518a == aVar.f6518a && this.f6519b == aVar.f6519b && this.f6520c == aVar.f6520c && this.f6521d == aVar.f6521d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z10 = this.f6518a;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = i10 * 31;
        boolean z11 = this.f6519b;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f6520c;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.f6521d;
        return i15 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f6518a + ", isValidated=" + this.f6519b + ", isMetered=" + this.f6520c + ", isNotRoaming=" + this.f6521d + ')';
    }
}
