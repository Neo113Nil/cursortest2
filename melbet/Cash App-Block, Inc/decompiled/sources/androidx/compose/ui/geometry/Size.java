package androidx.compose.ui.geometry;

import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class Size {
    public final long packedValue;

    public /* synthetic */ Size(long j) {
        this.packedValue = j;
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static long m638copyxjbvk4A$default(float f, float f2, int i, long j) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        }
        return (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m639equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m640getHeightimpl(long j) {
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m641getMaxDimensionimpl(long j) {
        return Math.max(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m642getMinDimensionimpl(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m643getWidthimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m644isEmptyimpl(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= RecyclerView.DECELERATION_RATE) | (Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) <= RecyclerView.DECELERATION_RATE);
    }

    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m645times7Ah8Wj8(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) * f;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m646toStringimpl(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j >> 32))) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Size) {
            return this.packedValue == ((Size) obj).packedValue;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final String toString() {
        return m646toStringimpl(this.packedValue);
    }
}
