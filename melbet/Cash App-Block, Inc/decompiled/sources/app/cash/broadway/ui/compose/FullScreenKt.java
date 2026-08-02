package app.cash.broadway.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import bo.app.u4$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public abstract class FullScreenKt {
    public static final StaticProvidableCompositionLocal LocalFullScreenAggregator = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(9));

    public static final void FullScreen(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1145679427);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(2072528998, new FullScreenKt$$ExternalSyntheticLambda0(0), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Savers_androidKt$$ExternalSyntheticLambda0(i, 8);
        }
    }
}
