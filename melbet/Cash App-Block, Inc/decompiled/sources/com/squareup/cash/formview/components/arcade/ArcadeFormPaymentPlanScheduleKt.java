package com.squareup.cash.formview.components.arcade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ArcadeFormPaymentPlanScheduleKt {
    public static final void ArcadeFormPaymentPlanSchedule(FormBlocker.Element.PaymentPlanScheduleElement paymentPlanScheduleElement, Function1 function1, Modifier modifier, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1072276997);
        int i2 = (gapComposer.changedInstance(paymentPlanScheduleElement) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1819771206, new ErrorView$$ExternalSyntheticLambda1(paymentPlanScheduleElement, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) paymentPlanScheduleElement, function1, (Object) modifier2, i, 23);
        }
    }
}
