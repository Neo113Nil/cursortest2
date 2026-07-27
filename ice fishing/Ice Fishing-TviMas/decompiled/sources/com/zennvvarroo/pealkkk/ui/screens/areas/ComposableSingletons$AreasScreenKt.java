package com.zennvvarroo.pealkkk.ui.screens.areas;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zennvvarroo.pealkkk.ui.components.CommonKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AreasScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$AreasScreenKt {
    public static final ComposableSingletons$AreasScreenKt INSTANCE = new ComposableSingletons$AreasScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f65lambda1 = ComposableLambdaKt.composableLambdaInstance(207743263, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.ComposableSingletons$AreasScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(207743263, i, -1, "com.zennvvarroo.pealkkk.ui.screens.areas.ComposableSingletons$AreasScreenKt.lambda-1.<anonymous> (AreasScreen.kt:33)");
            }
            CommonKt.ScreenHeader("Areas", "Rooms and storage zones.", composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m6213getLambda1$app_release() {
        return f65lambda1;
    }
}
