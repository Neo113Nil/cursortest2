package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import coil3.Extras;

/* loaded from: classes.dex */
public abstract class SplineBasedFloatDecayAnimationSpec_androidKt {
    public static final float platformFlingScrollFriction = ViewConfiguration.getScrollFriction();

    public static final DecayAnimationSpecImpl rememberSplineBasedDecay(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
        boolean changed = gapComposer.changed(density.getDensity());
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new DecayAnimationSpecImpl(new Extras.Key(density));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (DecayAnimationSpecImpl) rememberedValue;
    }
}
