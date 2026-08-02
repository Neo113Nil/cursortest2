package com.squareup.cash.profile.views.trustedcontact;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.InvestingContactViewModel;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.SecurityLockView$$ExternalSyntheticLambda1;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda11;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class InvestingContactViewKt {

    /* renamed from: lambda$-2063634026, reason: not valid java name */
    public static final ComposableLambdaImpl f634lambda$2063634026 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(9), false, -2063634026);

    /* renamed from: lambda$-1628280577, reason: not valid java name */
    public static final ComposableLambdaImpl f633lambda$1628280577 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(10), false, -1628280577);

    public static final void InvestingContact(InvestingContactViewModel investingContactViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2068375374);
        int i2 = (gapComposer.changedInstance(investingContactViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1858168611, new ErrorView$$ExternalSyntheticLambda0(function1, investingContactViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(modifier2, (Object) investingContactViewModel, function1, i, 29);
        }
    }
}
