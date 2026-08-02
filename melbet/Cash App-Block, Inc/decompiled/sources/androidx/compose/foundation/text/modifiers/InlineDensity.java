package androidx.compose.foundation.text.modifiers;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class InlineDensity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long Unspecified = m424constructorimpl(Float.NaN, Float.NaN);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m424constructorimpl(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m425toStringimpl(long j) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) + ')';
    }
}
