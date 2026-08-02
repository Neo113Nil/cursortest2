package androidx.compose.ui.hapticfeedback;

/* loaded from: classes3.dex */
public final class HapticFeedbackType {
    public final int value;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m767equalsimpl0(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof HapticFeedbackType) {
            return this.value == ((HapticFeedbackType) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        int i = this.value;
        return i == 16 ? "Confirm" : i == 6 ? "ContextClick" : i == 13 ? "GestureEnd" : i == 23 ? "GestureThresholdActivate" : i == 3 ? "KeyboardTap" : i == 0 ? "LongPress" : i == 17 ? "Reject" : i == 27 ? "SegmentFrequentTick" : i == 26 ? "SegmentTick" : i == 9 ? "TextHandleMove" : i == 22 ? "ToggleOff" : i == 21 ? "ToggleOn" : i == 1 ? "VirtualKey" : "Invalid";
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m768unboximpl() {
        return this.value;
    }
}
