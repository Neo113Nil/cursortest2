package androidx.compose.animation;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class SingleValueAnimationKt {
    public static final SpringSpec colorDefaultSpring = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7);

    /* renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final State m153animateColorAsStateeuL9pac(long j, FiniteAnimationSpec finiteAnimationSpec, String str, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = colorDefaultSpring;
        }
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(Color.m679getColorSpaceimpl(j));
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            TwoWayConverterImpl twoWayConverterImpl = new TwoWayConverterImpl(CrossfadeKt$Crossfade$3$1.INSTANCE$9, new BoundsAnimation$animate$1(Color.m679getColorSpaceimpl(j), 1));
            gapComposer.updateRememberedValue(twoWayConverterImpl);
            rememberedValue = twoWayConverterImpl;
        }
        return AnimateAsStateKt.animateValueAsState(new Color(j), (TwoWayConverterImpl) rememberedValue, finiteAnimationSpec2, null, str2, null, gapComposer, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
