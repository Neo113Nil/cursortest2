package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.DpCornerSize;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class ShapeTokens {
    public static final RoundedCornerShape CornerExtraExtraLarge = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(48.0f);
    public static final RoundedCornerShape CornerExtraLarge = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(28.0f);
    public static final RoundedCornerShape CornerExtraLargeIncreased = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f);
    public static final RoundedCornerShape CornerExtraSmall = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f);
    public static final RoundedCornerShape CornerLarge = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
    public static final RoundedCornerShape CornerLargeIncreased = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(20.0f);
    public static final RoundedCornerShape CornerMedium = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f);
    public static final RoundedCornerShape CornerSmall = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f);
    public static final DpCornerSize CornerValueNone;

    static {
        new DpCornerSize(48.0f);
        new DpCornerSize(28.0f);
        new DpCornerSize(32.0f);
        new DpCornerSize(4.0f);
        new DpCornerSize(16.0f);
        new DpCornerSize(20.0f);
        new DpCornerSize(12.0f);
        CornerValueNone = new DpCornerSize(RecyclerView.DECELERATION_RATE);
        new DpCornerSize(8.0f);
    }
}
