package com.squareup.cash.common.messaging.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.messaging.viewmodels.FailureMessageFullScreenViewModel;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class FailureMessageFullScreenViewKt {

    /* renamed from: lambda$-1145824084, reason: not valid java name */
    public static final ComposableLambdaImpl f361lambda$1145824084 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(19), false, -1145824084);

    /* renamed from: lambda$-743144674, reason: not valid java name */
    public static final ComposableLambdaImpl f362lambda$743144674 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(17), false, -743144674);

    public static final void FailureMessageFullScreen(FailureMessageFullScreenViewModel failureMessageFullScreenViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-622789930);
        int i2 = (gapComposer.changedInstance(failureMessageFullScreenViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2053435541, new CaptureCheckFaceKt$$ExternalSyntheticLambda6(function1, failureMessageFullScreenViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2(modifier2, (Object) failureMessageFullScreenViewModel, function1, i, 3);
        }
    }
}
