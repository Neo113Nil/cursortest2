package androidx.compose.ui.unit;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes.dex */
public final class Constraints {
    public final long value;

    public /* synthetic */ Constraints(long j) {
        this.value = j;
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m1017copyZbe2FdA(int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.createConstraints(i, i2, i3, i4);
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m1018copyZbe2FdA$default(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = m1027getMinWidthimpl(j);
        }
        if ((i5 & 2) != 0) {
            i2 = m1025getMaxWidthimpl(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m1026getMinHeightimpl(j);
        }
        if ((i5 & 8) != 0) {
            i4 = m1024getMaxHeightimpl(j);
        }
        return m1017copyZbe2FdA(i, i2, i3, i4);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1019equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m1020getHasBoundedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m1021getHasBoundedWidthimpl(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << Boxes$$ExternalSyntheticOutline1.m((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1)) != 0;
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m1022getHasFixedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m1023getHasFixedWidthimpl(long j) {
        int i = (int) (3 & j);
        int m = (1 << Boxes$$ExternalSyntheticOutline1.m((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1;
        int i2 = ((int) (j >> 2)) & m;
        int i3 = ((int) (j >> 33)) & m;
        return i2 == (i3 == 0 ? Integer.MAX_VALUE : i3 - 1);
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m1024getMaxHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m1025getMaxWidthimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int m = i2 & ((1 << Boxes$$ExternalSyntheticOutline1.m((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
        if (m == 0) {
            return Integer.MAX_VALUE;
        }
        return m - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m1026getMinHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m1027getMinWidthimpl(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << Boxes$$ExternalSyntheticOutline1.m((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m1028isZeroimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1029toStringimpl(long j) {
        int m1025getMaxWidthimpl = m1025getMaxWidthimpl(j);
        String valueOf = m1025getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(m1025getMaxWidthimpl);
        int m1024getMaxHeightimpl = m1024getMaxHeightimpl(j);
        String valueOf2 = m1024getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(m1024getMaxHeightimpl) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m1027getMinWidthimpl(j));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(m1026getMinHeightimpl(j));
        sb.append(", maxHeight = ");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, valueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Constraints) {
            return this.value == ((Constraints) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.value);
    }

    public final String toString() {
        return m1029toStringimpl(this.value);
    }
}
