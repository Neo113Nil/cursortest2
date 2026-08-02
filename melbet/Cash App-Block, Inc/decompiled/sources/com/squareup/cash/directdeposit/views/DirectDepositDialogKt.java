package com.squareup.cash.directdeposit.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import app.cash.broadway.ui.compose.SecureScreenKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.local.views.toolbar.LocalToolbarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CopyCodeKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.viewmodels.DemandDepositDialogViewModel;
import com.squareup.cash.checks.ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSetupViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.mooncake.compose_ui.components.AlertDialogButton;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.screens.Redacted;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class DirectDepositDialogKt {

    /* renamed from: lambda$-51049168, reason: not valid java name */
    public static final ComposableLambdaImpl f377lambda$51049168 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(29), false, -51049168);

    /* renamed from: lambda$-941181467, reason: not valid java name */
    public static final ComposableLambdaImpl f381lambda$941181467 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(1), false, -941181467);
    public static final ComposableLambdaImpl lambda$1901909425 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(28), false, 1901909425);
    public static final ComposableLambdaImpl lambda$1279182420 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(19), false, 1279182420);

    /* renamed from: lambda$-1574784323, reason: not valid java name */
    public static final ComposableLambdaImpl f374lambda$1574784323 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(20), false, -1574784323);

    /* renamed from: lambda$-221567950, reason: not valid java name */
    public static final ComposableLambdaImpl f375lambda$221567950 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(21), false, -221567950);

    /* renamed from: lambda$-664146865, reason: not valid java name */
    public static final ComposableLambdaImpl f378lambda$664146865 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(22), false, -664146865);

    /* renamed from: lambda$-719376614, reason: not valid java name */
    public static final ComposableLambdaImpl f379lambda$719376614 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(23), false, -719376614);

    /* renamed from: lambda$-434240711, reason: not valid java name */
    public static final ComposableLambdaImpl f376lambda$434240711 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(24), false, -434240711);
    public static final ComposableLambdaImpl lambda$662175440 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(25), false, 662175440);

    /* renamed from: lambda$-894536444, reason: not valid java name */
    public static final ComposableLambdaImpl f380lambda$894536444 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(26), false, -894536444);
    public static final ComposableLambdaImpl lambda$1388652942 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(27), false, 1388652942);
    public static final ComposableLambdaImpl lambda$1143980412 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(28), false, 1143980412);

    public static final void CopyNumber(String str, Redacted redacted, String str2, Function0 function0, Composer composer, int i) {
        String str3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1266207670);
        int i2 = 2;
        int i3 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changedInstance(redacted) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startReplaceGroup(1349830822);
            float mo231toDpGaN1DYA = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium.spanStyle.fontSize);
            gapComposer.end(false);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1053011065, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, 29), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1299777766, new LocalToolbarKt$$ExternalSyntheticLambda0(redacted, mo231toDpGaN1DYA, i2), gapComposer);
            boolean z = (i3 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda10(22, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            str3 = str2;
            CopyCodeKt.CopyCode(rememberComposableLambda, rememberComposableLambda2, str3, null, null, null, (Function1) rememberedValue, gapComposer, (i3 & 896) | 54, 120);
        } else {
            str3 = str2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(str, redacted, str3, function0, i);
        }
    }

    public static final void DirectDepositDialog(DemandDepositDialogViewModel demandDepositDialogViewModel, Function1 function1, Composer composer, int i) {
        AlertDialogButton alertDialogButton;
        demandDepositDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1391439181);
        int i2 = (gapComposer.changedInstance(demandDepositDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = demandDepositDialogViewModel.title;
            boolean z = true;
            String str2 = demandDepositDialogViewModel.message;
            String str3 = demandDepositDialogViewModel.primaryButton.text;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda4(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AlertDialogButton alertDialogButton2 = new AlertDialogButton(str3, (Function0) rememberedValue);
            DemandDepositDialogViewModel.Button button = demandDepositDialogViewModel.secondaryButton;
            if (button == null) {
                gapComposer.startReplaceGroup(1635692114);
                gapComposer.end(false);
                alertDialogButton = null;
            } else {
                gapComposer.startReplaceGroup(1635692115);
                String str4 = button.text;
                if (i3 != 32) {
                    z = false;
                }
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda4(29, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                AlertDialogButton alertDialogButton3 = new AlertDialogButton(str4, (Function0) rememberedValue2);
                gapComposer.end(false);
                alertDialogButton = alertDialogButton3;
            }
            KeypadKt.AlertDialogContent(null, f377lambda$51049168, str, str2, alertDialogButton2, alertDialogButton, false, gapComposer, 48, 65);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DirectDepositDialogKt$$ExternalSyntheticLambda2(demandDepositDialogViewModel, function1, i);
        }
    }

    public static final void DirectDepositHome(DirectDepositSetupViewModel directDepositSetupViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        directDepositSetupViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-380928487);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(directDepositSetupViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SecureScreenKt.SecureScreen(true, gapComposer, 6);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(638920366, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(i3, function1, directDepositSetupViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(directDepositSetupViewModel, function1, i, 10);
        }
    }
}
