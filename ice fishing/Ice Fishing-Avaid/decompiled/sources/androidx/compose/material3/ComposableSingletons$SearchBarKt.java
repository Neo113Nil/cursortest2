package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SearchBar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ComposableSingletons$SearchBarKt {
    public static final ComposableSingletons$SearchBarKt INSTANCE = new ComposableSingletons$SearchBarKt();
    private static Function2<Composer, Integer, Unit> lambda$1165377840 = ComposableLambdaKt.composableLambdaInstance(1165377840, false, new Function2() { // from class: androidx.compose.material3.ComposableSingletons$SearchBarKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_1165377840$lambda$0;
            lambda_1165377840$lambda$0 = ComposableSingletons$SearchBarKt.lambda_1165377840$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_1165377840$lambda$0;
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1464724888 = ComposableLambdaKt.composableLambdaInstance(1464724888, false, new Function2() { // from class: androidx.compose.material3.ComposableSingletons$SearchBarKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_1464724888$lambda$0;
            lambda_1464724888$lambda$0 = ComposableSingletons$SearchBarKt.lambda_1464724888$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_1464724888$lambda$0;
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1165377840$material3() {
        return lambda$1165377840;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1464724888$material3() {
        return lambda$1464724888;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1165377840$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:SearchBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1165377840, i, -1, "androidx.compose.material3.ComposableSingletons$SearchBarKt.lambda$1165377840.<anonymous> (SearchBar.kt:3062)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1464724888$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:SearchBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1464724888, i, -1, "androidx.compose.material3.ComposableSingletons$SearchBarKt.lambda$1464724888.<anonymous> (SearchBar.kt:3492)");
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
