package com.squareup.cash.cashapppay.views;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.room.util.DBUtil;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import coil3.RealImageLoader;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.BlockerUiFactory;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.UiContainerKt$BottomSheet$1$sheetScope$1;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientCommerceArcadeMigrationCashAppPay;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public final class CashAppPayUiFactory implements BlockerUiFactory {
    public final FeatureFlagManager featureFlagManager;
    public final RealImageLoader imageLoader;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;

    public CashAppPayUiFactory(LocalizedMoneyFormatter.Factory factory, RealImageLoader realImageLoader, FeatureFlagManager featureFlagManager) {
        this.moneyFormatterFactory = factory;
        this.imageLoader = realImageLoader;
        this.featureFlagManager = featureFlagManager;
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        screen.getClass();
        context.getClass();
        boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$ClientCommerceArcadeMigrationCashAppPay.INSTANCE)).enabled();
        if (screen instanceof BlockersScreens.StatusInterstitialSheet) {
            return new UiFactory.LegacySheetComposeUi(new UiFactory.LegacySheetComposeUi.Config(11), CashAppPayStackedAvatarKt.f351lambda$1769166732);
        }
        if (screen instanceof BlockersScreens.StatusInterstitialScreen) {
            if (!enabled) {
                return new UiFactory.ComposeUi(CashAppPayStackedAvatarKt.lambda$1043669436);
            }
            StatusInterstitialScreen statusInterstitialScreen = new StatusInterstitialScreen(context);
            return new UiFactory.ViewUi(statusInterstitialScreen, statusInterstitialScreen);
        }
        final int i = 0;
        final int i2 = 1;
        if (screen instanceof BlockersScreens.CashAppPayGrantScreen) {
            return enabled ? new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.cashapppay.views.CashAppPayUiFactory$$ExternalSyntheticLambda0
                public final /* synthetic */ CashAppPayUiFactory f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3 = i;
                    CashAppPayUiFactory cashAppPayUiFactory = this.f$0;
                    switch (i3) {
                        case 0:
                            GrantViewModel grantViewModel = (GrantViewModel) obj;
                            Function1 function1 = (Function1) obj2;
                            Composer composer = (Composer) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            function1.getClass();
                            if (grantViewModel != null) {
                                GapComposer gapComposer = (GapComposer) composer;
                                gapComposer.startReplaceGroup(210399775);
                                GrantScreenKt.GrantScreenContent(grantViewModel, cashAppPayUiFactory.imageLoader, cashAppPayUiFactory.moneyFormatterFactory.create(MoneyFormatterConfig.STANDARD), function1, gapComposer, (intValue & 14) | ((intValue << 6) & 7168));
                                gapComposer.end(false);
                            } else {
                                GapComposer gapComposer2 = (GapComposer) composer;
                                gapComposer2.startReplaceGroup(210650596);
                                gapComposer2.end(false);
                            }
                            break;
                        default:
                            Function1 function12 = (Function1) obj2;
                            int intValue2 = ((Integer) obj4).intValue();
                            function12.getClass();
                            LegacyGrantSheetKt.LegacyGrantSheetContent((GrantViewModel) obj, function12, cashAppPayUiFactory.imageLoader, cashAppPayUiFactory.moneyFormatterFactory, null, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 16);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, true, 1574919710)) : new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.cashapppay.views.CashAppPayUiFactory$$ExternalSyntheticLambda0
                public final /* synthetic */ CashAppPayUiFactory f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3 = i2;
                    CashAppPayUiFactory cashAppPayUiFactory = this.f$0;
                    switch (i3) {
                        case 0:
                            GrantViewModel grantViewModel = (GrantViewModel) obj;
                            Function1 function1 = (Function1) obj2;
                            Composer composer = (Composer) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            function1.getClass();
                            if (grantViewModel != null) {
                                GapComposer gapComposer = (GapComposer) composer;
                                gapComposer.startReplaceGroup(210399775);
                                GrantScreenKt.GrantScreenContent(grantViewModel, cashAppPayUiFactory.imageLoader, cashAppPayUiFactory.moneyFormatterFactory.create(MoneyFormatterConfig.STANDARD), function1, gapComposer, (intValue & 14) | ((intValue << 6) & 7168));
                                gapComposer.end(false);
                            } else {
                                GapComposer gapComposer2 = (GapComposer) composer;
                                gapComposer2.startReplaceGroup(210650596);
                                gapComposer2.end(false);
                            }
                            break;
                        default:
                            Function1 function12 = (Function1) obj2;
                            int intValue2 = ((Integer) obj4).intValue();
                            function12.getClass();
                            LegacyGrantSheetKt.LegacyGrantSheetContent((GrantViewModel) obj, function12, cashAppPayUiFactory.imageLoader, cashAppPayUiFactory.moneyFormatterFactory, null, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 16);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, true, -1101129099));
        }
        if (screen instanceof BlockersScreens.CashAppPayGrantSheet) {
            return enabled ? new UiFactory.LegacySheetComposeUi(new ComposableLambdaImpl(new Function5(this) { // from class: com.squareup.cash.cashapppay.views.CashAppPayUiFactory$$ExternalSyntheticLambda2
                public final /* synthetic */ CashAppPayUiFactory f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function5
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3 = i;
                    CashAppPayUiFactory cashAppPayUiFactory = this.f$0;
                    switch (i3) {
                        case 0:
                            GrantViewModel grantViewModel = (GrantViewModel) obj2;
                            Function1 function1 = (Function1) obj3;
                            Composer composer = (Composer) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            ((UiContainerKt$BottomSheet$1$sheetScope$1) obj).getClass();
                            function1.getClass();
                            if (grantViewModel != null) {
                                GapComposer gapComposer = (GapComposer) composer;
                                gapComposer.startReplaceGroup(-793982206);
                                boolean z = (((intValue & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(function1)) || (intValue & MLKEMEngine.KyberPolyBytes) == 256;
                                Object rememberedValue = gapComposer.rememberedValue();
                                if (z || rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(22, function1);
                                    gapComposer.updateRememberedValue(rememberedValue);
                                }
                                DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
                                GrantSheetKt.GrantSheetContent(grantViewModel, cashAppPayUiFactory.imageLoader, cashAppPayUiFactory.moneyFormatterFactory.create(MoneyFormatterConfig.STANDARD), function1, gapComposer, ((intValue >> 3) & 14) | ((intValue << 3) & 7168));
                                gapComposer.end(false);
                            } else {
                                GapComposer gapComposer2 = (GapComposer) composer;
                                gapComposer2.startReplaceGroup(-793661232);
                                gapComposer2.end(false);
                            }
                            break;
                        default:
                            UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$1 = (UiContainerKt$BottomSheet$1$sheetScope$1) obj;
                            Function1 function12 = (Function1) obj3;
                            int intValue2 = ((Integer) obj5).intValue();
                            uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                            function12.getClass();
                            LegacyGrantSheetKt.LegacyGrantSheetContent((GrantViewModel) obj2, function12, cashAppPayUiFactory.imageLoader, cashAppPayUiFactory.moneyFormatterFactory, uiContainerKt$BottomSheet$1$sheetScope$1, (Composer) obj4, ((intValue2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((intValue2 << 12) & 57344), 0);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, true, 1105324434)) : new UiFactory.LegacySheetComposeUi(new UiFactory.LegacySheetComposeUi.Config(15), new ComposableLambdaImpl(new Function5(this) { // from class: com.squareup.cash.cashapppay.views.CashAppPayUiFactory$$ExternalSyntheticLambda2
                public final /* synthetic */ CashAppPayUiFactory f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function5
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3 = i2;
                    CashAppPayUiFactory cashAppPayUiFactory = this.f$0;
                    switch (i3) {
                        case 0:
                            GrantViewModel grantViewModel = (GrantViewModel) obj2;
                            Function1 function1 = (Function1) obj3;
                            Composer composer = (Composer) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            ((UiContainerKt$BottomSheet$1$sheetScope$1) obj).getClass();
                            function1.getClass();
                            if (grantViewModel != null) {
                                GapComposer gapComposer = (GapComposer) composer;
                                gapComposer.startReplaceGroup(-793982206);
                                boolean z = (((intValue & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(function1)) || (intValue & MLKEMEngine.KyberPolyBytes) == 256;
                                Object rememberedValue = gapComposer.rememberedValue();
                                if (z || rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(22, function1);
                                    gapComposer.updateRememberedValue(rememberedValue);
                                }
                                DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
                                GrantSheetKt.GrantSheetContent(grantViewModel, cashAppPayUiFactory.imageLoader, cashAppPayUiFactory.moneyFormatterFactory.create(MoneyFormatterConfig.STANDARD), function1, gapComposer, ((intValue >> 3) & 14) | ((intValue << 3) & 7168));
                                gapComposer.end(false);
                            } else {
                                GapComposer gapComposer2 = (GapComposer) composer;
                                gapComposer2.startReplaceGroup(-793661232);
                                gapComposer2.end(false);
                            }
                            break;
                        default:
                            UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$1 = (UiContainerKt$BottomSheet$1$sheetScope$1) obj;
                            Function1 function12 = (Function1) obj3;
                            int intValue2 = ((Integer) obj5).intValue();
                            uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                            function12.getClass();
                            LegacyGrantSheetKt.LegacyGrantSheetContent((GrantViewModel) obj2, function12, cashAppPayUiFactory.imageLoader, cashAppPayUiFactory.moneyFormatterFactory, uiContainerKt$BottomSheet$1$sheetScope$1, (Composer) obj4, ((intValue2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((intValue2 << 12) & 57344), 0);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, true, -774261079));
        }
        return null;
    }
}
