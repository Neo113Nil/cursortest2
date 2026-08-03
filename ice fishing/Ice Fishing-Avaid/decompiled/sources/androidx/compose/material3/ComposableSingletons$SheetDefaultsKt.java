package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SheetDefaults.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ComposableSingletons$SheetDefaultsKt {
    public static final ComposableSingletons$SheetDefaultsKt INSTANCE = new ComposableSingletons$SheetDefaultsKt();
    private static Function2<Composer, Integer, Unit> lambda$1335949740 = ComposableLambdaKt.composableLambdaInstance(1335949740, false, new Function2() { // from class: androidx.compose.material3.ComposableSingletons$SheetDefaultsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_1335949740$lambda$0;
            lambda_1335949740$lambda$0 = ComposableSingletons$SheetDefaultsKt.lambda_1335949740$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_1335949740$lambda$0;
        }
    });

    /* renamed from: lambda$-2061828736, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f27lambda$2061828736 = ComposableLambdaKt.composableLambdaInstance(-2061828736, false, new Function2() { // from class: androidx.compose.material3.ComposableSingletons$SheetDefaultsKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda__2061828736$lambda$0;
            lambda__2061828736$lambda$0 = ComposableSingletons$SheetDefaultsKt.lambda__2061828736$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda__2061828736$lambda$0;
        }
    });

    /* renamed from: getLambda$-2061828736$material3, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2836getLambda$2061828736$material3() {
        return f27lambda$2061828736;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1335949740$material3() {
        return lambda$1335949740;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1335949740$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C151@7458L12:SheetDefaults.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1335949740, i, -1, "androidx.compose.material3.ComposableSingletons$SheetDefaultsKt.lambda$1335949740.<anonymous> (SheetDefaults.kt:151)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__2061828736$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C227@10534L12:SheetDefaults.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2061828736, i, -1, "androidx.compose.material3.ComposableSingletons$SheetDefaultsKt.lambda$-2061828736.<anonymous> (SheetDefaults.kt:227)");
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
