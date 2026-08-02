package defpackage;

/* loaded from: classes10.dex */
public final class z6u {
    public final int a;

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z6u) {
            return this.a == ((z6u) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 16 ? "Confirm" : i == 6 ? "ContextClick" : i == 13 ? "GestureEnd" : i == 23 ? "GestureThresholdActivate" : i == 3 ? "KeyboardTap" : i == 0 ? "LongPress" : i == 17 ? "Reject" : i == 27 ? "SegmentFrequentTick" : i == 26 ? "SegmentTick" : i == 9 ? "TextHandleMove" : i == 22 ? "ToggleOff" : i == 21 ? "ToggleOn" : i == 1 ? "VirtualKey" : "Invalid";
    }
}
