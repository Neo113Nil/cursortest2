package androidx.compose.material3;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FloatingToolbar.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u0003HÖ\u0081\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u000f"}, d2 = {"Landroidx/compose/material3/FloatingToolbarHorizontalFabPosition;", "", "value", "", "constructor-impl", "(I)I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "equals", "", "other", "hashCode", "Companion", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@JvmInline
/* loaded from: classes.dex */
public final class FloatingToolbarHorizontalFabPosition {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Start = m3228constructorimpl(0);
    private static final int End = m3228constructorimpl(1);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatingToolbarHorizontalFabPosition m3227boximpl(int i) {
        return new FloatingToolbarHorizontalFabPosition(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3228constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3229equalsimpl(int i, Object obj) {
        return (obj instanceof FloatingToolbarHorizontalFabPosition) && i == ((FloatingToolbarHorizontalFabPosition) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3230equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3231hashCodeimpl(int i) {
        return i;
    }

    public boolean equals(Object other) {
        return m3229equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m3231hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    /* compiled from: FloatingToolbar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/FloatingToolbarHorizontalFabPosition$Companion;", "", "<init>", "()V", "Start", "Landroidx/compose/material3/FloatingToolbarHorizontalFabPosition;", "getStart-EdPuMIg", "()I", "I", "End", "getEnd-EdPuMIg", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getStart-EdPuMIg, reason: not valid java name */
        public final int m3235getStartEdPuMIg() {
            return FloatingToolbarHorizontalFabPosition.Start;
        }

        /* renamed from: getEnd-EdPuMIg, reason: not valid java name */
        public final int m3234getEndEdPuMIg() {
            return FloatingToolbarHorizontalFabPosition.End;
        }
    }

    private /* synthetic */ FloatingToolbarHorizontalFabPosition(int i) {
        this.value = i;
    }

    public String toString() {
        return m3232toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3232toStringimpl(int i) {
        return m3230equalsimpl0(i, Start) ? "FloatingToolbarHorizontalFabPosition.Start" : "FloatingToolbarHorizontalFabPosition.End";
    }
}
