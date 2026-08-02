package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public final class TextUnitType {

    /* renamed from: type, reason: collision with root package name */
    public final long f861type;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1062equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1063toStringimpl(long j) {
        return m1062equalsimpl0(j, 0L) ? "Unspecified" : m1062equalsimpl0(j, 4294967296L) ? "Sp" : m1062equalsimpl0(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextUnitType) {
            return this.f861type == ((TextUnitType) obj).f861type;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f861type);
    }

    public final String toString() {
        return m1063toStringimpl(this.f861type);
    }
}
