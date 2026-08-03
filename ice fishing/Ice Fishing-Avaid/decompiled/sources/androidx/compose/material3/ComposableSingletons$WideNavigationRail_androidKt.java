package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: WideNavigationRail.android.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ComposableSingletons$WideNavigationRail_androidKt {
    public static final ComposableSingletons$WideNavigationRail_androidKt INSTANCE = new ComposableSingletons$WideNavigationRail_androidKt();
    private static Function2<Composer, Integer, Unit> lambda$2011757776 = ComposableLambdaKt.composableLambdaInstance(2011757776, false, new Function2() { // from class: androidx.compose.material3.ComposableSingletons$WideNavigationRail_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_2011757776$lambda$0;
            lambda_2011757776$lambda$0 = ComposableSingletons$WideNavigationRail_androidKt.lambda_2011757776$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_2011757776$lambda$0;
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2011757776$material3() {
        return lambda$2011757776;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_2011757776$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:WideNavigationRail.android.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2011757776, i, -1, "androidx.compose.material3.ComposableSingletons$WideNavigationRail_androidKt.lambda$2011757776.<anonymous> (WideNavigationRail.android.kt:185)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
