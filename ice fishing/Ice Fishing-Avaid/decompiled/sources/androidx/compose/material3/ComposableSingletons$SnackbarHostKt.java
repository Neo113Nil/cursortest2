package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ComposableSingletons$SnackbarHostKt {
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();

    /* renamed from: lambda$-1548712596, reason: not valid java name */
    private static Function3<SnackbarData, Composer, Integer, Unit> f28lambda$1548712596 = ComposableLambdaKt.composableLambdaInstance(-1548712596, false, new Function3() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit lambda__1548712596$lambda$0;
            lambda__1548712596$lambda$0 = ComposableSingletons$SnackbarHostKt.lambda__1548712596$lambda$0((SnackbarData) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return lambda__1548712596$lambda$0;
        }
    });

    /* renamed from: getLambda$-1548712596$material3, reason: not valid java name */
    public final Function3<SnackbarData, Composer, Integer, Unit> m2837getLambda$1548712596$material3() {
        return f28lambda$1548712596;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1548712596$lambda$0(SnackbarData snackbarData, Composer composer, int i) {
        SnackbarData snackbarData2;
        int i2;
        ComposerKt.sourceInformation(composer, "CN(it)219@9383L12:SnackbarHost.kt#uh7d8r");
        if ((i & 6) == 0) {
            snackbarData2 = snackbarData;
            i2 = i | (composer.changed(snackbarData2) ? 4 : 2);
        } else {
            snackbarData2 = snackbarData;
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1548712596, i2, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda$-1548712596.<anonymous> (SnackbarHost.kt:219)");
            }
            SnackbarKt.m4061SnackbarsDKtq54(snackbarData2, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i2 & 14, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
