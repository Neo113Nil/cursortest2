package r2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f6024a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f6024a == ((h) obj).f6024a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6024a);
    }

    public final String toString() {
        int i10 = this.f6024a;
        return i10 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i10 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i10 == 17 ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
