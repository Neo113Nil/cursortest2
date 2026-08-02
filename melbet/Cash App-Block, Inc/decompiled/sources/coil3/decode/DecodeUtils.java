package coil3.decode;

import coil3.size.Dimension;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.util.IntPair;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class DecodeUtils {
    /* renamed from: computeDstSize-sEdh43o, reason: not valid java name */
    public static final long m1455computeDstSizesEdh43o(int i, int i2, Size size, Scale scale, Size size2) {
        int i3;
        int i4;
        if (!Intrinsics.areEqual(size, Size.ORIGINAL)) {
            i = toPx(size.width, scale);
            i2 = toPx(size.height, scale);
        }
        Dimension dimension = size2.width;
        Dimension dimension2 = size2.height;
        if ((dimension instanceof Dimension.Pixels) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i4 = ((Dimension.Pixels) dimension).px)) {
            i = i4;
        }
        if ((dimension2 instanceof Dimension.Pixels) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i3 = ((Dimension.Pixels) dimension2).px)) {
            i2 = i3;
        }
        return IntPair.m1474constructorimpl(i, i2);
    }

    public static final double computeSizeMultiplier(int i, int i2, int i3, int i4, Scale scale, Size size) {
        double max;
        double d = i;
        double d2 = i3 / d;
        double d3 = i2;
        double d4 = i4 / d3;
        int ordinal = scale.ordinal();
        if (ordinal == 0) {
            max = Math.max(d2, d4);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0.0d;
            }
            max = Math.min(d2, d4);
        }
        if (size.width instanceof Dimension.Pixels) {
            double d5 = ((Dimension.Pixels) r9).px / d;
            if (max > d5) {
                max = d5;
            }
        }
        if (size.height instanceof Dimension.Pixels) {
            double d6 = ((Dimension.Pixels) r9).px / d3;
            if (max > d6) {
                return d6;
            }
        }
        return max;
    }

    public static int toPx(Dimension dimension, Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).px;
        }
        int ordinal = scale.ordinal();
        if (ordinal == 0) {
            return PKIFailureInfo.systemUnavail;
        }
        if (ordinal == 1) {
            return Integer.MAX_VALUE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }
}
