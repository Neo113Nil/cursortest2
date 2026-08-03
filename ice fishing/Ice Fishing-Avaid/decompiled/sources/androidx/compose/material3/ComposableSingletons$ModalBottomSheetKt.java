package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ModalBottomSheet.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ComposableSingletons$ModalBottomSheetKt {
    public static final ComposableSingletons$ModalBottomSheetKt INSTANCE = new ComposableSingletons$ModalBottomSheetKt();
    private static Function2<Composer, Integer, Unit> lambda$1121996006 = ComposableLambdaKt.composableLambdaInstance(1121996006, false, new Function2() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_1121996006$lambda$0;
            lambda_1121996006$lambda$0 = ComposableSingletons$ModalBottomSheetKt.lambda_1121996006$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_1121996006$lambda$0;
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1121996006$material3() {
        return lambda$1121996006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1121996006$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C103@5412L12:ModalBottomSheet.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1121996006, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda$1121996006.<anonymous> (ModalBottomSheet.kt:103)");
            }
            BottomSheetDefaults.INSTANCE.m2550DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
