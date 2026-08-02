package com.squareup.cash.cashapppay.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.core.navigationcontainer.UiContainerKt$BottomSheet$1$sheetScope$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class LegacyGrantSheetKt {
    public static final void LegacyGrantSheet(Modifier modifier, GrantViewModel.Main main, Function1 function1, MoneyFormatter moneyFormatter, Composer composer, int i) {
        int i2;
        main.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-695781807);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(main) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(moneyFormatter) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-479236980, new VerifyCheckDepositKt$$ExternalSyntheticLambda14(modifier, main, moneyFormatter, function1, 17), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(i, 24, modifier, main, function1, moneyFormatter, false);
        }
    }

    public static final void LegacyGrantSheetContent(final GrantViewModel grantViewModel, final Function1 function1, final RealImageLoader realImageLoader, final LocalizedMoneyFormatter.Factory factory, UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$1, Composer composer, final int i, final int i2) {
        int i3;
        final UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$12;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        function1.getClass();
        realImageLoader.getClass();
        factory.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-468542034);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(grantViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(factory) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= gapComposer.changedInstance(uiContainerKt$BottomSheet$1$sheetScope$1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            final UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$13 = i4 != 0 ? null : uiContainerKt$BottomSheet$1$sheetScope$1;
            if (grantViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    function2 = new Function2() { // from class: com.squareup.cash.cashapppay.views.LegacyGrantSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    LegacyGrantSheetKt.LegacyGrantSheetContent(grantViewModel, function1, realImageLoader, factory, uiContainerKt$BottomSheet$1$sheetScope$13, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    LegacyGrantSheetKt.LegacyGrantSheetContent(grantViewModel, function1, realImageLoader, factory, uiContainerKt$BottomSheet$1$sheetScope$13, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$14 = uiContainerKt$BottomSheet$1$sheetScope$13;
            uiContainerKt$BottomSheet$1$sheetScope$12 = uiContainerKt$BottomSheet$1$sheetScope$14;
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1457420969, new AvatarsKt$$ExternalSyntheticLambda4(realImageLoader, grantViewModel, function1, uiContainerKt$BottomSheet$1$sheetScope$14, factory, 17), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
            uiContainerKt$BottomSheet$1$sheetScope$12 = uiContainerKt$BottomSheet$1$sheetScope$1;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i6 = 1;
            function2 = new Function2() { // from class: com.squareup.cash.cashapppay.views.LegacyGrantSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i6) {
                        case 0:
                            ((Integer) obj2).getClass();
                            LegacyGrantSheetKt.LegacyGrantSheetContent(grantViewModel, function1, realImageLoader, factory, uiContainerKt$BottomSheet$1$sheetScope$12, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            LegacyGrantSheetKt.LegacyGrantSheetContent(grantViewModel, function1, realImageLoader, factory, uiContainerKt$BottomSheet$1$sheetScope$12, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }
}
