package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;

/* loaded from: classes.dex */
public abstract class OverscrollKt {
    public static final DynamicProvidableCompositionLocal LocalOverscrollFactory = new DynamicProvidableCompositionLocal(new ScrollState$$ExternalSyntheticLambda4(23));

    public static final AndroidEdgeEffectOverscrollEffect rememberOverscrollEffect(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(282942128);
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = (AndroidEdgeEffectOverscrollFactory) gapComposer.consume(LocalOverscrollFactory);
        if (androidEdgeEffectOverscrollFactory == null) {
            gapComposer.end(false);
            return null;
        }
        boolean changed = gapComposer.changed(androidEdgeEffectOverscrollFactory);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = new AndroidEdgeEffectOverscrollEffect(androidEdgeEffectOverscrollFactory.context, androidEdgeEffectOverscrollFactory.density, androidEdgeEffectOverscrollFactory.glowColor, androidEdgeEffectOverscrollFactory.glowDrawPadding);
            gapComposer.updateRememberedValue(androidEdgeEffectOverscrollEffect);
            rememberedValue = androidEdgeEffectOverscrollEffect;
        }
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2 = (AndroidEdgeEffectOverscrollEffect) rememberedValue;
        gapComposer.end(false);
        return androidEdgeEffectOverscrollEffect2;
    }
}
