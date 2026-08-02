package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class SelectionMagnifierKt {
    public static final SpringSpec MagnifierSpringSpec;
    public static final long OffsetDisplacementThreshold;
    public static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);
    public static final TwoWayConverterImpl UnspecifiedSafeOffsetVectorConverter = new TwoWayConverterImpl(new SaversKt$$ExternalSyntheticLambda2(7), new SaversKt$$ExternalSyntheticLambda2(8));

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & BodyPartID.bodyIdMax);
        OffsetDisplacementThreshold = floatToRawIntBits;
        MagnifierSpringSpec = new SpringSpec(new Offset(floatToRawIntBits), 3);
    }
}
