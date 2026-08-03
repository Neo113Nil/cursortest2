package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BasicEdgeToEdgeDialog.android.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ComposableSingletons$BasicEdgeToEdgeDialog_androidKt {
    public static final ComposableSingletons$BasicEdgeToEdgeDialog_androidKt INSTANCE = new ComposableSingletons$BasicEdgeToEdgeDialog_androidKt();
    private static Function2<Composer, Integer, Unit> lambda$453789431 = ComposableLambdaKt.composableLambdaInstance(453789431, false, new Function2() { // from class: androidx.compose.material3.internal.ComposableSingletons$BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_453789431$lambda$0;
            lambda_453789431$lambda$0 = ComposableSingletons$BasicEdgeToEdgeDialog_androidKt.lambda_453789431$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_453789431$lambda$0;
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$453789431$material3() {
        return lambda$453789431;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_453789431$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:BasicEdgeToEdgeDialog.android.kt#mqatfk");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(453789431, i, -1, "androidx.compose.material3.internal.ComposableSingletons$BasicEdgeToEdgeDialog_androidKt.lambda$453789431.<anonymous> (BasicEdgeToEdgeDialog.android.kt:316)");
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
