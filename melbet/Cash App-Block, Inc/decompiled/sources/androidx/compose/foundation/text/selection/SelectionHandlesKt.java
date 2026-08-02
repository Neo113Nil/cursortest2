package androidx.compose.foundation.text.selection;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class SelectionHandlesKt {
    public static final SemanticsPropertyKey SelectionHandleInfoKey = new SemanticsPropertyKey("SelectionHandleInfo");

    /* renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m442getAdjustedCoordinatesk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) - 1.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
