package com.zennvvarroo.pealkkk;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zennvvarroo.pealkkk.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: NativeMainActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$NativeMainActivityKt {
    public static final ComposableSingletons$NativeMainActivityKt INSTANCE = new ComposableSingletons$NativeMainActivityKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f57lambda1 = ComposableLambdaKt.composableLambdaInstance(717280952, false, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ComposableSingletons$NativeMainActivityKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(717280952, i, -1, "com.zennvvarroo.pealkkk.ComposableSingletons$NativeMainActivityKt.lambda-1.<anonymous> (NativeMainActivity.kt:12)");
            }
            ZenvaroPeakAppKt.ZenvaroPeakApp(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f58lambda2 = ComposableLambdaKt.composableLambdaInstance(-2118134812, false, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ComposableSingletons$NativeMainActivityKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118134812, i, -1, "com.zennvvarroo.pealkkk.ComposableSingletons$NativeMainActivityKt.lambda-2.<anonymous> (NativeMainActivity.kt:11)");
                }
                ThemeKt.ZenvaroPeakTheme(ComposableSingletons$NativeMainActivityKt.INSTANCE.m6189getLambda1$app_release(), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6189getLambda1$app_release() {
        return f57lambda1;
    }

    /* renamed from: getLambda-2$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6190getLambda2$app_release() {
        return f58lambda2;
    }
}
