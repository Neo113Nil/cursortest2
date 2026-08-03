package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SegmentedButton.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ComposableSingletons$SegmentedButtonKt {
    public static final ComposableSingletons$SegmentedButtonKt INSTANCE = new ComposableSingletons$SegmentedButtonKt();
    private static Function2<Composer, Integer, Unit> lambda$1863131183 = ComposableLambdaKt.composableLambdaInstance(1863131183, false, new Function2() { // from class: androidx.compose.material3.ComposableSingletons$SegmentedButtonKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_1863131183$lambda$0;
            lambda_1863131183$lambda$0 = ComposableSingletons$SegmentedButtonKt.lambda_1863131183$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_1863131183$lambda$0;
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1863131183$material3() {
        return lambda$1863131183;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1863131183$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C639@28125L12:SegmentedButton.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1863131183, i, -1, "androidx.compose.material3.ComposableSingletons$SegmentedButtonKt.lambda$1863131183.<anonymous> (SegmentedButton.kt:639)");
            }
            SegmentedButtonDefaults.INSTANCE.ActiveIcon(composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
