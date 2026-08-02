package app.cash.broadway.presenter.molecule;

import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import bo.app.u4$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class SwipeKt {
    public static final StaticProvidableCompositionLocal LocalSwipeCallbackDispatcher = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(4));

    public static final void SwipeHandler(MoleculePresenter moleculePresenter, Function1 function1, Composer composer, int i) {
        int i2;
        moleculePresenter.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2094813828);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            SwipeCallbackDispatcher swipeCallbackDispatcher = (SwipeCallbackDispatcher) gapComposer.consume(LocalSwipeCallbackDispatcher);
            if (swipeCallbackDispatcher == null) {
                gapComposer.startReplaceGroup(-723791197);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-723791196);
                boolean changedInstance = gapComposer.changedInstance(swipeCallbackDispatcher) | ((i2 & 112) == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new RealBadger2$$ExternalSyntheticLambda0(5, swipeCallbackDispatcher, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.DisposableEffect(swipeCallbackDispatcher, (Function1) rememberedValue, gapComposer);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(moleculePresenter, function1, i, 8);
        }
    }
}
