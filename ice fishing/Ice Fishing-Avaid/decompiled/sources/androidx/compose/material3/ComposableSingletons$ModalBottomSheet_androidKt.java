package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ComposableSingletons$ModalBottomSheet_androidKt {
    public static final ComposableSingletons$ModalBottomSheet_androidKt INSTANCE = new ComposableSingletons$ModalBottomSheet_androidKt();

    /* renamed from: lambda$-91331245, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f24lambda$91331245 = ComposableLambdaKt.composableLambdaInstance(-91331245, false, new Function2() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda__91331245$lambda$0;
            lambda__91331245$lambda$0 = ComposableSingletons$ModalBottomSheet_androidKt.lambda__91331245$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda__91331245$lambda$0;
        }
    });

    /* renamed from: getLambda$-91331245$material3, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2832getLambda$91331245$material3() {
        return f24lambda$91331245;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__91331245$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:ModalBottomSheet.android.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-91331245, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda$-91331245.<anonymous> (ModalBottomSheet.android.kt:278)");
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
