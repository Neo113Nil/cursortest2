package app.cash.broadway.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import bo.app.b$$ExternalSyntheticLambda0;
import bo.app.u4$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import radiography.ViewStateRenderers$$ExternalSyntheticLambda5;

/* loaded from: classes.dex */
public abstract class SecureScreenKt {
    public static final StaticProvidableCompositionLocal LocalSecureScreenAggregator = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(11));

    public static final void SecureScreen(boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1916333107);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            SecureScreenAggregator secureScreenAggregator = (SecureScreenAggregator) gapComposer.consume(LocalSecureScreenAggregator);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new SecureScreenNode(z);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SecureScreenNode secureScreenNode = (SecureScreenNode) rememberedValue;
            boolean changedInstance = gapComposer.changedInstance(secureScreenNode) | ((i2 & 14) == 4);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new b$$ExternalSyntheticLambda0(secureScreenNode, z, 3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.SideEffect((Function0) rememberedValue2, gapComposer);
            boolean changedInstance2 = gapComposer.changedInstance(secureScreenAggregator) | gapComposer.changedInstance(secureScreenNode);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new RealBadger2$$ExternalSyntheticLambda0(8, secureScreenAggregator, secureScreenNode);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.DisposableEffect(secureScreenAggregator, secureScreenNode, (Function1) rememberedValue3, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ViewStateRenderers$$ExternalSyntheticLambda5(i, 1, z);
        }
    }
}
