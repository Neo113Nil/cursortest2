package androidx.compose.ui.unit;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class ConstraintsKt {
    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i, i2, i3, i4);
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    public static final int bitsNeedForSizeUnchecked(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m1030constrain4WqzIAM(long j, long j2) {
        int i = (int) (j2 >> 32);
        int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j);
        int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
        if (i < m1027getMinWidthimpl) {
            i = m1027getMinWidthimpl;
        }
        if (i <= m1025getMaxWidthimpl) {
            m1025getMaxWidthimpl = i;
        }
        int i2 = (int) (j2 & BodyPartID.bodyIdMax);
        int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j);
        int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
        if (i2 < m1026getMinHeightimpl) {
            i2 = m1026getMinHeightimpl;
        }
        if (i2 <= m1024getMaxHeightimpl) {
            m1024getMaxHeightimpl = i2;
        }
        return (m1025getMaxWidthimpl << 32) | (m1024getMaxHeightimpl & BodyPartID.bodyIdMax);
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m1031constrainN9IONVI(long j, long j2) {
        int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j);
        int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
        int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j);
        int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
        int m1027getMinWidthimpl2 = Constraints.m1027getMinWidthimpl(j2);
        if (m1027getMinWidthimpl2 < m1027getMinWidthimpl) {
            m1027getMinWidthimpl2 = m1027getMinWidthimpl;
        }
        if (m1027getMinWidthimpl2 > m1025getMaxWidthimpl) {
            m1027getMinWidthimpl2 = m1025getMaxWidthimpl;
        }
        int m1025getMaxWidthimpl2 = Constraints.m1025getMaxWidthimpl(j2);
        if (m1025getMaxWidthimpl2 >= m1027getMinWidthimpl) {
            m1027getMinWidthimpl = m1025getMaxWidthimpl2;
        }
        if (m1027getMinWidthimpl <= m1025getMaxWidthimpl) {
            m1025getMaxWidthimpl = m1027getMinWidthimpl;
        }
        int m1026getMinHeightimpl2 = Constraints.m1026getMinHeightimpl(j2);
        if (m1026getMinHeightimpl2 < m1026getMinHeightimpl) {
            m1026getMinHeightimpl2 = m1026getMinHeightimpl;
        }
        if (m1026getMinHeightimpl2 > m1024getMaxHeightimpl) {
            m1026getMinHeightimpl2 = m1024getMaxHeightimpl;
        }
        int m1024getMaxHeightimpl2 = Constraints.m1024getMaxHeightimpl(j2);
        if (m1024getMaxHeightimpl2 >= m1026getMinHeightimpl) {
            m1026getMinHeightimpl = m1024getMaxHeightimpl2;
        }
        if (m1026getMinHeightimpl <= m1024getMaxHeightimpl) {
            m1024getMaxHeightimpl = m1026getMinHeightimpl;
        }
        return Constraints(m1027getMinWidthimpl2, m1025getMaxWidthimpl, m1026getMinHeightimpl2, m1024getMaxHeightimpl);
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m1032constrainHeightK40F9xA(int i, long j) {
        int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j);
        int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
        if (i < m1026getMinHeightimpl) {
            i = m1026getMinHeightimpl;
        }
        return i > m1024getMaxHeightimpl ? m1024getMaxHeightimpl : i;
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m1033constrainWidthK40F9xA(int i, long j) {
        int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j);
        int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
        if (i < m1027getMinWidthimpl) {
            i = m1027getMinWidthimpl;
        }
        return i > m1025getMaxWidthimpl ? m1025getMaxWidthimpl : i;
    }

    public static final long createConstraints(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int bitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int bitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i6);
        if (bitsNeedForSizeUnchecked + bitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = bitsNeedForSizeUnchecked2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (bitsNeedForSizeUnchecked2 + 2)) | ((i8 & (~(i8 >> 31))) << (bitsNeedForSizeUnchecked2 + 33));
    }

    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m1034offsetNN6EwU(int i, int i2, long j) {
        int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j) + i;
        if (m1027getMinWidthimpl < 0) {
            m1027getMinWidthimpl = 0;
        }
        int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
        if (m1025getMaxWidthimpl != Integer.MAX_VALUE && (m1025getMaxWidthimpl = m1025getMaxWidthimpl + i) < 0) {
            m1025getMaxWidthimpl = 0;
        }
        int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j) + i2;
        if (m1026getMinHeightimpl < 0) {
            m1026getMinHeightimpl = 0;
        }
        int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
        return Constraints(m1027getMinWidthimpl, m1025getMaxWidthimpl, m1026getMinHeightimpl, (m1024getMaxHeightimpl == Integer.MAX_VALUE || (m1024getMaxHeightimpl = m1024getMaxHeightimpl + i2) >= 0) ? m1024getMaxHeightimpl : 0);
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m1035offsetNN6EwU$default(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m1034offsetNN6EwU(i, i2, j);
    }

    public static final void throwInvalidConstraintException(int i, int i2) {
        throw new IllegalArgumentException(Recorder$$ExternalSyntheticOutline2.m(i, i2, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static final Void throwInvalidConstraintsSizeException(int i) {
        throw new IllegalArgumentException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Can't represent a size of ", " in Constraints"));
    }
}
