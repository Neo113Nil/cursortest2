package app.cash.broadway.presenter.molecule;

import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import bo.app.u4$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class RenavigationKt {
    public static final StaticProvidableCompositionLocal LocalRenavigationDispatcher = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(3));

    public static final void RenavigationHandler(MoleculePresenter moleculePresenter, Function0 function0, Composer composer, int i) {
        int i2;
        moleculePresenter.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1960631405);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            RenavigationDispatcher renavigationDispatcher = (RenavigationDispatcher) gapComposer.consume(LocalRenavigationDispatcher);
            boolean changedInstance = gapComposer.changedInstance(renavigationDispatcher) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealBadger2$$ExternalSyntheticLambda0(4, renavigationDispatcher, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(renavigationDispatcher, (Function1) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(moleculePresenter, function0, i, 7);
        }
    }
}
