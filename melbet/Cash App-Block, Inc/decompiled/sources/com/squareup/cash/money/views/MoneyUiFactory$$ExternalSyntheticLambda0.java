package com.squareup.cash.money.views;

import android.content.Context;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.media3.ui.SubtitleViewUtils;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.framework.FrameworkSQLiteProgram;
import androidx.tracing.Trace;
import app.cash.local.views.LocalViewFactory;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.android.gms.dynamite.zzb;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.components.accountswitcher.BadgeTitleKt;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountViewModel;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel;
import com.squareup.cash.advertising.views.AdUiFactory;
import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewModel;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewModel;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CaptureCheckFaceKt;
import com.squareup.cash.checks.CaptureCheckFaceViewModel;
import com.squareup.cash.checks.CheckDepositUiFactory;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.core.navigationcontainer.api.scrim.ScrimScreen;
import com.squareup.cash.earnings.views.EarningsUiFactory;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewModel;
import com.squareup.cash.earningstracker.views.EarningsTrackerViewKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotTopControlsTransition;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.views.FidesmoUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.booklet.MoneyTabBookletViewModel;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewModel;
import com.squareup.cash.onboarding.accountpicker.views.AccountPickerViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.onboarding.viewmodels.OnboardingLandingViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksActivityListViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paymentpad.viewmodels.HomeViewModel;
import com.squareup.cash.paymentpad.views.HomeViewKt;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewModel;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewModel;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.views.SupportViewFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentViewModel;
import com.squareup.cash.taptopay.views.TapToPayKt;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.threedsdataonly.viewmodels.ThreeDsViewModel;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewModel$WalletScheme;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CardScreenId;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final /* synthetic */ class MoneyUiFactory$$ExternalSyntheticLambda0 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MoneyUiFactory$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        AccountViewModel accountViewModel;
        int i2;
        int i3 = this.$r8$classId;
        int i4 = 9;
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i5 = 2;
        int i6 = 1;
        Object obj5 = this.f$0;
        switch (i3) {
            case 0:
                MoneyUiFactory moneyUiFactory = (MoneyUiFactory) obj5;
                MoneyTabModel moneyTabModel = (MoneyTabModel) obj;
                Function1 function1 = (Function1) obj2;
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                moneyTabModel.getClass();
                function1.getClass();
                if ((intValue & 6) == 0) {
                    i = ((intValue & 8) == 0 ? ((GapComposer) composer).changed(moneyTabModel) : ((GapComposer) composer).changedInstance(moneyTabModel) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Trace.valuesState((FeatureFlagManager) moneyUiFactory.featureFlagManager, AmplitudeExperiments$MoneybotTopControlsTransition.INSTANCE);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Updater.CompositionLocalProvider(new ProvidedValue[]{CardTransitionKt.getLocalCardRegistry().defaultProvidedValue$runtime((CardRegistry) moneyUiFactory.cardRegistry), CardTransitionKt.getLocalCardScreenId().defaultProvidedValue$runtime(CardScreenId.Money)}, Expect_jvmKt.rememberComposableLambda(-758983393, new MoneyUiFactory$$ExternalSyntheticLambda1(moneyUiFactory, moneyTabModel, function1, Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1), 0), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                AndroidParagraphIntrinsics androidParagraphIntrinsics = (AndroidParagraphIntrinsics) obj5;
                TypefaceResult m997resolveDPcqOEQ = androidParagraphIntrinsics.fontFamilyResolver.m997resolveDPcqOEQ((FontFamily) obj, (FontWeight) obj2, ((FontStyle) obj3).value, ((FontSynthesis) obj4).value);
                if (m997resolveDPcqOEQ instanceof TypefaceResult.Immutable) {
                    Object obj6 = ((TypefaceResult.Immutable) m997resolveDPcqOEQ).value;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                Recorder.AnonymousClass3 anonymousClass3 = new Recorder.AnonymousClass3(m997resolveDPcqOEQ, androidParagraphIntrinsics.resolvedTypefaces);
                androidParagraphIntrinsics.resolvedTypefaces = anonymousClass3;
                return anonymousClass3.getTypeface();
            case 2:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((SupportSQLiteQuery) obj5).bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 3:
                AdUiFactory adUiFactory = (AdUiFactory) obj5;
                FullscreenAdViewModel fullscreenAdViewModel = (FullscreenAdViewModel) obj;
                Function1 function12 = (Function1) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                fullscreenAdViewModel.getClass();
                function12.getClass();
                FullscreenAdViewKt.FullscreenAd(fullscreenAdViewModel, function12, adUiFactory.imageLoader, (Flow) adUiFactory.activityEvents, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 4:
                BenefitsLeafletViewModel benefitsLeafletViewModel = (BenefitsLeafletViewModel) obj;
                Function1 function13 = (Function1) obj2;
                int intValue3 = ((Integer) obj4).intValue();
                benefitsLeafletViewModel.getClass();
                function13.getClass();
                BenefitsLeafletViewKt.BenefitsLeaflet(((RetroUiFactory) obj5).imageLoader, benefitsLeafletViewModel, function13, (Composer) obj3, (intValue3 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                return Unit.INSTANCE;
            case 5:
                AdUiFactory adUiFactory2 = (AdUiFactory) obj5;
                BugReportingViewModel bugReportingViewModel = (BugReportingViewModel) obj;
                Function1 function14 = (Function1) obj2;
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                bugReportingViewModel.getClass();
                function14.getClass();
                Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(adUiFactory2.imageLoader), Expect_jvmKt.rememberComposableLambda(1428045139, new BulletinTileKt$$ExternalSyntheticLambda9(adUiFactory2, bugReportingViewModel, function14, 23), composer2), composer2, 56);
                return Unit.INSTANCE;
            case 6:
                Function1 function15 = (Function1) obj2;
                Composer composer3 = (Composer) obj3;
                ((Integer) obj4).getClass();
                function15.getClass();
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-161660796, new CashCardKt$$ExternalSyntheticLambda1(19, (FullScreenActivityViewModel) obj, function15, (BorrowUiFactory) obj5), composer3), composer3, 3072, 7);
                return Unit.INSTANCE;
            case 7:
                CaptureCheckFaceViewModel captureCheckFaceViewModel = (CaptureCheckFaceViewModel) obj;
                Function1 function16 = (Function1) obj2;
                int intValue4 = ((Integer) obj4).intValue();
                captureCheckFaceViewModel.getClass();
                function16.getClass();
                CaptureCheckFaceKt.CaptureCheckFace(captureCheckFaceViewModel, function16, (RealCashVibrator) ((CheckDepositUiFactory) obj5).vibrator, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 8:
                AcceptableScrim acceptableScrim = (AcceptableScrim) obj5;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj;
                ScrimScreen scrimScreen = (ScrimScreen) obj2;
                Composer composer4 = (Composer) obj3;
                ((Integer) obj4).getClass();
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                animatedContentScopeImpl.getClass();
                AnimatedVisibilityScope animatedVisibilityScope = animatedContentScopeImpl.$$delegate_0;
                if (animatedVisibilityScope.getTransition().transitionState.getCurrentState() == animatedVisibilityScope.getTransition().targetState$delegate.getValue()) {
                    GapComposer gapComposer2 = (GapComposer) composer4;
                    gapComposer2.startReplaceGroup(-2013997035);
                    boolean changedInstance = gapComposer2.changedInstance(acceptableScrim) | gapComposer2.changedInstance(scrimScreen);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new RealGcmRegistrar$unregister$2(acceptableScrim, scrimScreen, continuation, 17);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer2, "setCurrentState", (Function2) rememberedValue2);
                    gapComposer2.end(false);
                } else {
                    GapComposer gapComposer3 = (GapComposer) composer4;
                    gapComposer3.startReplaceGroup(-2013900935);
                    gapComposer3.end(false);
                }
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (scrimScreen == null) {
                    GapComposer gapComposer4 = (GapComposer) composer4;
                    gapComposer4.startReplaceGroup(-2013844980);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer4.end(true);
                    gapComposer4.end(false);
                } else if (scrimScreen instanceof ScrimScreen.SwitchFullAccountLoadingScrimScreen) {
                    GapComposer gapComposer5 = (GapComposer) composer4;
                    gapComposer5.startReplaceGroup(-2013588548);
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), ColorKt.Color(ThemeHelpersKt.themeInfo((Context) gapComposer5.consume(AndroidCompositionLocals_androidKt.LocalContext)).colorPalette.background), ColorKt.RectangleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    FullAccount account = ((ScrimScreen.SwitchFullAccountLoadingScrimScreen) scrimScreen).getAccount();
                    if (account != null) {
                        gapComposer5.startReplaceGroup(1331781634);
                        accountViewModel = zzb.toAccountViewModel(account, null);
                        Object rememberedValue3 = gapComposer5.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = (RealImageLoader) acceptableScrim.activeImageLoader.invoke();
                            gapComposer5.updateRememberedValue(rememberedValue3);
                        }
                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime((RealImageLoader) rememberedValue3), Expect_jvmKt.rememberComposableLambda(1692937479, new ComposerKt$$ExternalSyntheticLambda0(accountViewModel, i4), gapComposer5), gapComposer5, 56);
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(1332095261);
                        BadgeTitleKt.SwitchAccountLoadingContent(gapComposer5, 0);
                        gapComposer5.end(false);
                    }
                    gapComposer5.end(true);
                    gapComposer5.end(false);
                } else {
                    if (!(scrimScreen instanceof ScrimScreen.ManagedAccountSwitchScrimScreen)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer4, -757699640, false);
                    }
                    GapComposer gapComposer6 = (GapComposer) composer4;
                    gapComposer6.startReplaceGroup(-2012787942);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 9:
                EarningsUiFactory earningsUiFactory = (EarningsUiFactory) obj5;
                EarningsTrackerViewModel earningsTrackerViewModel = (EarningsTrackerViewModel) obj;
                Function1 function17 = (Function1) obj2;
                int intValue5 = ((Integer) obj4).intValue();
                earningsTrackerViewModel.getClass();
                function17.getClass();
                EarningsTrackerViewKt.EarningsTrackerView(earningsTrackerViewModel, function17, earningsUiFactory.imageLoader, earningsUiFactory.moneyFormatterFactory, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 10:
                FidesmoProvisioningViewModel fidesmoProvisioningViewModel = (FidesmoProvisioningViewModel) obj;
                Function1 function18 = (Function1) obj2;
                Composer composer5 = (Composer) obj3;
                ((Integer) obj4).getClass();
                fidesmoProvisioningViewModel.getClass();
                function18.getClass();
                Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(((ScoreUiFactory) obj5).imageLoader), Expect_jvmKt.rememberComposableLambda(1476160312, new FidesmoUiFactory$$ExternalSyntheticLambda1(fidesmoProvisioningViewModel, function18, r11 ? 1 : 0), composer5), composer5, 56);
                return Unit.INSTANCE;
            case 11:
                BorrowUiFactory borrowUiFactory = (BorrowUiFactory) obj5;
                GlobalSearchViewModel globalSearchViewModel = (GlobalSearchViewModel) obj;
                Function1 function19 = (Function1) obj2;
                int intValue6 = ((Integer) obj4).intValue();
                globalSearchViewModel.getClass();
                function19.getClass();
                QuickAccessBarKt.GlobalSearch(null, borrowUiFactory.imageLoader, borrowUiFactory.vibrator, globalSearchViewModel, function19, (Composer) obj3, (intValue6 << 9) & 64512);
                return Unit.INSTANCE;
            case 12:
                LocalViewFactory localViewFactory = (LocalViewFactory) obj5;
                FullScreenActivityViewModel fullScreenActivityViewModel = (FullScreenActivityViewModel) obj;
                Function1 function110 = (Function1) obj2;
                int intValue7 = ((Integer) obj4).intValue();
                fullScreenActivityViewModel.getClass();
                function110.getClass();
                AvatarsKt.FullScreenActivityView(fullScreenActivityViewModel, function110, localViewFactory.imageLoader, (RealCashVibrator) localViewFactory.featureFlagManager, (Composer) obj3, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 13:
                InviteContactsViewModel inviteContactsViewModel = (InviteContactsViewModel) obj;
                Function1 function111 = (Function1) obj2;
                int intValue8 = ((Integer) obj4).intValue();
                inviteContactsViewModel.getClass();
                function111.getClass();
                InviteErrorDialogKt.InviteContactsView(((ScoreUiFactory) obj5).imageLoader, inviteContactsViewModel, function111, null, (Composer) obj3, (intValue8 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                return Unit.INSTANCE;
            case 14:
                MoneyTabBookletViewModel moneyTabBookletViewModel = (MoneyTabBookletViewModel) obj;
                Function1 function112 = (Function1) obj2;
                Composer composer6 = (Composer) obj3;
                ((Integer) obj4).getClass();
                moneyTabBookletViewModel.getClass();
                function112.getClass();
                Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(((ScoreUiFactory) obj5).imageLoader), Expect_jvmKt.rememberComposableLambda(1008823166, new MoneyTabBookletKt$$ExternalSyntheticLambda0(moneyTabBookletViewModel, function112), composer6), composer6, 56);
                return Unit.INSTANCE;
            case 15:
                Function1 function113 = (Function1) obj2;
                Composer composer7 = (Composer) obj3;
                ((Integer) obj4).getClass();
                function113.getClass();
                Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(((ScoreUiFactory) obj5).imageLoader), Expect_jvmKt.rememberComposableLambda(-463700628, new AccountPickerViewKt$$ExternalSyntheticLambda1((AccountPickerViewModel) obj, function113, i5, r11 ? (byte) 1 : (byte) 0), composer7), composer7, 56);
                return Unit.INSTANCE;
            case 16:
                OnboardingLandingViewModel onboardingLandingViewModel = (OnboardingLandingViewModel) obj;
                Function1 function114 = (Function1) obj2;
                int intValue9 = ((Integer) obj4).intValue();
                onboardingLandingViewModel.getClass();
                function114.getClass();
                zzafd.OnboardingLandingView(onboardingLandingViewModel, function114, ((ScoreUiFactory) obj5).imageLoader, (Composer) obj3, intValue9 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 17:
                PaychecksActivityListViewModel paychecksActivityListViewModel = (PaychecksActivityListViewModel) obj;
                Function1 function115 = (Function1) obj2;
                int intValue10 = ((Integer) obj4).intValue();
                paychecksActivityListViewModel.getClass();
                function115.getClass();
                HelpSheetViewKt.PaychecksActivityList(paychecksActivityListViewModel, function115, ((ScoreUiFactory) obj5).imageLoader, (Composer) obj3, intValue10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 18:
                BitcoinUiFactory bitcoinUiFactory = (BitcoinUiFactory) obj5;
                HomeViewModel homeViewModel = (HomeViewModel) obj;
                Function1 function116 = (Function1) obj2;
                int intValue11 = ((Integer) obj4).intValue();
                homeViewModel.getClass();
                function116.getClass();
                GapComposer gapComposer7 = (GapComposer) ((Composer) obj3);
                Object rememberedValue4 = gapComposer7.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = Trace.valuesState((FeatureFlagManager) bitcoinUiFactory.featureFlagManager, AmplitudeExperiments$MoneybotTopControlsTransition.INSTANCE);
                    gapComposer7.updateRememberedValue(rememberedValue4);
                }
                HomeViewKt.HomeView(homeViewModel, function116, bitcoinUiFactory.imageLoader, (RealCashVibrator) bitcoinUiFactory.vibrator, (ElementBoundsRegistry) bitcoinUiFactory.cashScreenBrightness, (SplashScreenAnimationObserver) bitcoinUiFactory.mapEngineProvider, ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) Updater.collectAsState((StateFlow) rememberedValue4, null, gapComposer7, 1).getValue()).enabled(), gapComposer7, intValue11 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 19:
                ScoreUiFactory scoreUiFactory = (ScoreUiFactory) obj5;
                PrepurchaseCardFAQViewModel prepurchaseCardFAQViewModel = (PrepurchaseCardFAQViewModel) obj;
                Function1 function117 = (Function1) obj2;
                Composer composer8 = (Composer) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                prepurchaseCardFAQViewModel.getClass();
                function117.getClass();
                if ((intValue12 & 6) == 0) {
                    i2 = (((GapComposer) composer8).changed(prepurchaseCardFAQViewModel) ? 4 : 2) | intValue12;
                } else {
                    i2 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i2 |= ((GapComposer) composer8).changedInstance(function117) ? 32 : 16;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(463178612, new ErrorView$$ExternalSyntheticLambda0(i6, (Object) prepurchaseCardFAQViewModel, (Object) function117), gapComposer8), gapComposer8, 56);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                PromotionsReferralsHomeViewModel promotionsReferralsHomeViewModel = (PromotionsReferralsHomeViewModel) obj;
                Function1 function118 = (Function1) obj2;
                int intValue13 = ((Integer) obj4).intValue();
                promotionsReferralsHomeViewModel.getClass();
                function118.getClass();
                PromotionsTitleBarKt.PromotionsReferralsHomeView(promotionsReferralsHomeViewModel, ((ScoreUiFactory) obj5).imageLoader, function118, (Composer) obj3, ((intValue13 << 3) & 896) | (intValue13 & 14));
                return Unit.INSTANCE;
            case 21:
                Function1 function119 = (Function1) obj2;
                Composer composer9 = (Composer) obj3;
                ((Integer) obj4).getClass();
                function119.getClass();
                Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(((LocalViewFactory) obj5).imageLoader), Expect_jvmKt.rememberComposableLambda(239048344, new SupportViewFactory$$ExternalSyntheticLambda1((ScreenshotReviewViewModel) obj, function119, r11 ? 1 : 0, r11 ? (byte) 1 : (byte) 0), composer9), composer9, 56);
                return Unit.INSTANCE;
            case 22:
                TapToPayPaymentViewModel tapToPayPaymentViewModel = (TapToPayPaymentViewModel) obj;
                Function1 function120 = (Function1) obj2;
                int intValue14 = ((Integer) obj4).intValue();
                tapToPayPaymentViewModel.getClass();
                function120.getClass();
                TapToPayKt.TapToPayPayment(tapToPayPaymentViewModel, function120, ((ScoreUiFactory) obj5).imageLoader, null, (Composer) obj3, intValue14 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 23:
                Function1 function121 = (Function1) obj2;
                int intValue15 = ((Integer) obj4).intValue();
                function121.getClass();
                SubtitleViewUtils.ThreeDsView((ThreeDsViewModel) obj, function121, ((ScoreUiFactory) obj5).imageLoader, (Composer) obj3, intValue15 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            default:
                LocalViewFactory localViewFactory2 = (LocalViewFactory) obj5;
                WalletHomeViewModel$WalletScheme walletHomeViewModel$WalletScheme = (WalletHomeViewModel$WalletScheme) obj;
                Function1 function122 = (Function1) obj2;
                Composer composer10 = (Composer) obj3;
                ((Integer) obj4).getClass();
                walletHomeViewModel$WalletScheme.getClass();
                function122.getClass();
                Updater.CompositionLocalProvider(new ProvidedValue[]{CardTransitionKt.getLocalCardRegistry().defaultProvidedValue$runtime((CardRegistry) localViewFactory2.featureFlagManager), CardTransitionKt.getLocalCardScreenId().defaultProvidedValue$runtime(CardScreenId.Wallet)}, Expect_jvmKt.rememberComposableLambda(641426094, new TaxReturnsView$$ExternalSyntheticLambda1(28, localViewFactory2, walletHomeViewModel$WalletScheme, function122), composer10), composer10, 56);
                return Unit.INSTANCE;
        }
    }
}
