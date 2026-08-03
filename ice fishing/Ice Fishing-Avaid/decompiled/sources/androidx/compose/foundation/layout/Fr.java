package androidx.compose.foundation.layout;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* compiled from: Grid.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/Fr;", "", "value", "", "constructor-impl", "(F)F", "getValue", "()F", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "equals", "", "other", "hashCode", "", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@JvmInline
/* loaded from: classes.dex */
public final class Fr {
    private final float value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Fr m1069boximpl(float f) {
        return new Fr(f);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m1070constructorimpl(float f) {
        return f;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1071equalsimpl(float f, Object obj) {
        return (obj instanceof Fr) && Float.compare(f, ((Fr) obj).m1075unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1072equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1073hashCodeimpl(float f) {
        return Float.floatToIntBits(f);
    }

    public boolean equals(Object other) {
        return m1071equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m1073hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m1075unboximpl() {
        return this.value;
    }

    private /* synthetic */ Fr(float f) {
        this.value = f;
    }

    public final float getValue() {
        return this.value;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1074toStringimpl(float f) {
        return f + ".fr";
    }

    public String toString() {
        return m1074toStringimpl(this.value);
    }
}
