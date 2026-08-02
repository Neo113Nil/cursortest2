package app.cash.broadway.ui.compose;

import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.Updater$$ExternalSyntheticLambda0;
import bo.app.u4$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class DialogEventHandlerKt {
    public static final StaticProvidableCompositionLocal LocalDialogEventDispatcher = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(8));

    public static final void DialogEventHandler(Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(324771160);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            DialogEventDispatcher dialogEventDispatcher = (DialogEventDispatcher) gapComposer.consume(LocalDialogEventDispatcher);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new BasicTextKt$$ExternalSyntheticLambda1(i2, rememberUpdatedState);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean changedInstance = gapComposer.changedInstance(dialogEventDispatcher);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Recomposer$$ExternalSyntheticLambda4(21, dialogEventDispatcher, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.DisposableEffect(dialogEventDispatcher, function12, (Function1) rememberedValue2, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Updater$$ExternalSyntheticLambda0(i, function1);
        }
    }
}
