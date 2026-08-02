package androidx.compose.ui.semantics;

/* loaded from: classes3.dex */
public final class LiveRegionMode {
    public final int value;

    public /* synthetic */ LiveRegionMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m943boximpl(int i) {
        return new LiveRegionMode(i);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m944equalsimpl0(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LiveRegionMode) {
            return this.value == ((LiveRegionMode) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        int i = this.value;
        return i == 0 ? "Polite" : i == 1 ? "Assertive" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m945unboximpl() {
        return this.value;
    }
}
