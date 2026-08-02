package androidx.compose.ui.input.pointer;

/* loaded from: classes3.dex */
public final class PointerType {
    public final int value;

    public /* synthetic */ PointerType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerType m827boximpl(int i) {
        return new PointerType(i);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m828equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m829toStringimpl(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PointerType) {
            return this.value == ((PointerType) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m829toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m830unboximpl() {
        return this.value;
    }
}
