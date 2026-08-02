package app.cash.broadway.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import app.cash.broadway.ui.UpdatesWindowFlags$Orientation;
import bo.app.u4$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public abstract class OrientationKt {
    public static final StaticProvidableCompositionLocal LocalOrientationAggregator = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(10));

    public static final void Orientation(Composer composer, int i) {
        UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1618724095);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-1419677980, new FullScreenKt$$ExternalSyntheticLambda0(), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Savers_androidKt$$ExternalSyntheticLambda0(i);
        }
    }
}
