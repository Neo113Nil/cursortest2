package r2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f6044c = new s(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final s f6045d = new s(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f6046a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6047b;

    public s(int i10, boolean z10) {
        this.f6046a = i10;
        this.f6047b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f6046a == sVar.f6046a && this.f6047b == sVar.f6047b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6047b) + (Integer.hashCode(this.f6046a) * 31);
    }

    public final String toString() {
        return equals(f6044c) ? "TextMotion.Static" : equals(f6045d) ? "TextMotion.Animated" : "Invalid";
    }
}
