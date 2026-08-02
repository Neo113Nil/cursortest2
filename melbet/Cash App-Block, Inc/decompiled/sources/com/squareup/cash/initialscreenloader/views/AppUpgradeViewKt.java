package com.squareup.cash.initialscreenloader.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.util.DBUtil;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.globalsearch.views.GlobalSearchCellKt$$ExternalSyntheticLambda6;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda4;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.initialscreenloader.viewmodels.AppUpgradeViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class AppUpgradeViewKt {

    /* renamed from: lambda$-1963635724, reason: not valid java name */
    public static final ComposableLambdaImpl f437lambda$1963635724 = new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(7), false, -1963635724);

    /* renamed from: lambda$-1415858489, reason: not valid java name */
    public static final ComposableLambdaImpl f436lambda$1415858489 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(18), false, -1415858489);
    public static final ComposableLambdaImpl lambda$776655304 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(19), false, 776655304);

    /* renamed from: lambda$-1351300441, reason: not valid java name */
    public static final ComposableLambdaImpl f435lambda$1351300441 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(20), false, -1351300441);
    public static final ComposableLambdaImpl lambda$841213352 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(21), false, 841213352);

    /* renamed from: lambda$-2058599152, reason: not valid java name */
    public static final ComposableLambdaImpl f438lambda$2058599152 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(22), false, -2058599152);
    public static final ComposableLambdaImpl lambda$84885009 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(23), false, 84885009);

    /* renamed from: lambda$-415131408, reason: not valid java name */
    public static final ComposableLambdaImpl f439lambda$415131408 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(24), false, -415131408);
    public static final ComposableLambdaImpl lambda$1728352753 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(25), false, 1728352753);
    public static final ComposableLambdaImpl lambda$1017673517 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(26), false, 1017673517);
    public static final ComposableLambdaImpl lambda$609649902 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(27), false, 609649902);
    public static final ComposableLambdaImpl lambda$1185035021 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(28), false, 1185035021);
    public static final ComposableLambdaImpl lambda$777011406 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(29), false, 777011406);

    public static final void AppUpdateModal(AppUpgradeViewModel appUpgradeViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        appUpgradeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1917593222);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(appUpgradeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = appUpgradeViewModel.title;
            String str2 = appUpgradeViewModel.message;
            String str3 = appUpgradeViewModel.positiveButtonText;
            String str4 = appUpgradeViewModel.negativeButtonText;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda0(10);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer2, 48, 1);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1149650587, new CashMapViewKt$$ExternalSyntheticLambda15(str, str2, function1, str3, str4, 1), gapComposer2), gapComposer, 3072, 7);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AppUpgradeViewKt$$ExternalSyntheticLambda2(appUpgradeViewModel, function1, i, 0);
        }
    }

    public static final void AppUpgradeRequired(AppUpgradeViewModel appUpgradeViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        appUpgradeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1985303070);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(appUpgradeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorView$$ExternalSyntheticLambda4(29, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1289815373, new SkipPaymentView$$ExternalSyntheticLambda1(5, appUpgradeViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AppUpgradeViewKt$$ExternalSyntheticLambda2(appUpgradeViewModel, function1, i, 1);
        }
    }

    public static final void GenericErrorModal(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1964254125);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1331594616, new NfcNotAvailableKt$$ExternalSyntheticLambda0(9, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 18, false);
        }
    }

    public static final void InitiateSessionFailedModal(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2130041354);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-618294847, new NfcNotAvailableKt$$ExternalSyntheticLambda0(10, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 19, false);
        }
    }

    public static final void ScenarioPlanErrorModal(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-788366189);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1881056098, new NfcNotAvailableKt$$ExternalSyntheticLambda0(11, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 20, false);
        }
    }
}
