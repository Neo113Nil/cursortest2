package androidx.compose.foundation.layout;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FlexBox.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u0003HÖ\u0081\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/layout/FlexWrap;", "", "bits", "", "constructor-impl", "(I)I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "equals", "", "other", "hashCode", "Companion", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@JvmInline
/* loaded from: classes.dex */
public final class FlexWrap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int bits;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexWrap m1018boximpl(int i) {
        return new FlexWrap(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1019constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1020equalsimpl(int i, Object obj) {
        return (obj instanceof FlexWrap) && i == ((FlexWrap) obj).getBits();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1021equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1022hashCodeimpl(int i) {
        return i;
    }

    public boolean equals(Object other) {
        return m1020equalsimpl(this.bits, other);
    }

    public int hashCode() {
        return m1022hashCodeimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getBits() {
        return this.bits;
    }

    private /* synthetic */ FlexWrap(int i) {
        this.bits = i;
    }

    public String toString() {
        return m1023toStringimpl(this.bits);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1023toStringimpl(int i) {
        if (i == 0) {
            return "NoWrap";
        }
        if (i == 1) {
            return "Wrap";
        }
        if (i == 2) {
            return "WrapReverse";
        }
        return "INVALID";
    }

    /* compiled from: FlexBox.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/layout/FlexWrap$Companion;", "", "<init>", "()V", "NoWrap", "Landroidx/compose/foundation/layout/FlexWrap;", "getNoWrap-7ziDAWk", "()I", "Wrap", "getWrap-7ziDAWk", "WrapReverse", "getWrapReverse-7ziDAWk", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNoWrap-7ziDAWk, reason: not valid java name */
        public final int m1025getNoWrap7ziDAWk() {
            return FlexWrap.m1019constructorimpl(0);
        }

        /* renamed from: getWrap-7ziDAWk, reason: not valid java name */
        public final int m1026getWrap7ziDAWk() {
            return FlexWrap.m1019constructorimpl(1);
        }

        /* renamed from: getWrapReverse-7ziDAWk, reason: not valid java name */
        public final int m1027getWrapReverse7ziDAWk() {
            return FlexWrap.m1019constructorimpl(2);
        }
    }
}
