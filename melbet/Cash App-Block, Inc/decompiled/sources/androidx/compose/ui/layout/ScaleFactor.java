package androidx.compose.ui.layout;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class ScaleFactor {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        Float.floatToRawIntBits(Float.NaN);
        Float.floatToRawIntBits(Float.NaN);
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m857getScaleXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m858getScaleYimpl(long j) {
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }
}
