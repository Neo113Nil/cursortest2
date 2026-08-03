package d1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1568a;

    public static String a(int i10) {
        return i10 == 1 ? "Next" : i10 == 2 ? "Previous" : i10 == 3 ? "Left" : i10 == 4 ? "Right" : i10 == 5 ? "Up" : i10 == 6 ? "Down" : i10 == 7 ? "Enter" : i10 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f1568a == ((b) obj).f1568a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1568a);
    }

    public final String toString() {
        return a(this.f1568a);
    }
}
