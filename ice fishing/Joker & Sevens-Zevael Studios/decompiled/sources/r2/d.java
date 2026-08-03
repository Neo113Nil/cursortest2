package r2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f6017a;

    public static String a(int i10) {
        return i10 == 1 ? "Hyphens.None" : i10 == 2 ? "Hyphens.Auto" : i10 == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f6017a == ((d) obj).f6017a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6017a);
    }

    public final String toString() {
        return a(this.f6017a);
    }
}
