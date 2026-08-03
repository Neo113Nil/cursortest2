package com.createyourself.policy;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PolicyGate.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PolicyGateKt {
    public static final ComposableSingletons$PolicyGateKt INSTANCE = new ComposableSingletons$PolicyGateKt();

    /* renamed from: lambda$-588274274, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f38lambda$588274274 = ComposableLambdaKt.composableLambdaInstance(-588274274, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.createyourself.policy.ComposableSingletons$PolicyGateKt$lambda$-588274274$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            ComposerKt.sourceInformation(composer, "C420@14629L187:PolicyGate.kt#o805rc");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-588274274, i, -1, "com.createyourself.policy.ComposableSingletons$PolicyGateKt.lambda$-588274274.<anonymous> (PolicyGate.kt:420)");
            }
            TextKt.m4292TextNvy7gAk("Try again", null, 0L, null, 0L, null, FontWeight.INSTANCE.getBlack(), null, TextUnitKt.getSp(0), null, null, 0L, 0, false, 0, 0, null, null, composer, 102236166, 0, 261822);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-588274274$policy_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10369getLambda$588274274$policy_release() {
        return f38lambda$588274274;
    }
}
