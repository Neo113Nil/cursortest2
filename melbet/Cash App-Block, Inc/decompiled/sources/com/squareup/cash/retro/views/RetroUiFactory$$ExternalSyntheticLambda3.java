package com.squareup.cash.retro.views;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.util.TypedValueCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ArcadePaymentPlanDataBlocker;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewModel;
import com.squareup.cash.qrcodes.viewmodels.CashQrScannerViewModel;
import com.squareup.cash.qrcodes.viewmodels.CashQrShortcutsOnboardingViewModel;
import com.squareup.cash.qrcodes.viewmodels.CashtagQrScanViewModel;
import com.squareup.cash.qrcodes.viewmodels.QrCodeProfileViewModel;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.qrcodes.views.CameraXPreviewState;
import com.squareup.cash.qrcodes.views.CashQrCameraXScannerView;
import com.squareup.cash.qrcodes.views.CashQrCameraXScannerView$$ExternalSyntheticLambda2;
import com.squareup.cash.qrcodes.views.CashQrShortcutsOnboardingView;
import com.squareup.cash.qrcodes.views.CashtagQrScanView;
import com.squareup.cash.qrcodes.views.CashtagQrScanView$$ExternalSyntheticLambda0;
import com.squareup.cash.qrcodes.views.CashtagQrScanViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.qrcodes.views.QrCodeProfileView;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository;
import com.squareup.cash.savings.applets.presenters.SavingsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.savings.applets.presenters.SavingsAppletTilePresenter$MetroFactory;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.savings.applets.views.SavingsAppletTile;
import com.squareup.cash.savings.viewmodels.CellDefaultViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.cash.savings.views.SavingsScreenHeaderKt;
import com.squareup.cash.savings.views.SavingsScreenViewKt;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.protos.franklin.api.Region;
import com.squareup.util.cash.Cashtags;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class RetroUiFactory$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ RetroUiFactory$$ExternalSyntheticLambda3(PaymentPlanSummaryViewModel.BottomSheetData bottomSheetData, Function1 function1, PaddingValues paddingValues) {
        this.$r8$classId = 16;
        this.f$0 = bottomSheetData;
        this.f$2 = function1;
        this.f$1 = paddingValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v13 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r11;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        int i2 = 10;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                RetroUiFactory retroUiFactory = (RetroUiFactory) obj5;
                final PaymentPlanSummaryViewModel paymentPlanSummaryViewModel = (PaymentPlanSummaryViewModel) obj4;
                final Function1 function1 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) retroUiFactory.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ArcadePaymentPlanDataBlocker.INSTANCE)).enabled()) {
                        gapComposer.startReplaceGroup(-212308918);
                        final int i3 = 0;
                        ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-894153380, new Function2() { // from class: com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                int i4 = i3;
                                Composer composer2 = (Composer) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                switch (i4) {
                                    case 0:
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            PaymentPlanSummaryKt.PaymentPlanSummary(paymentPlanSummaryViewModel, function1, null, null, gapComposer2, 0);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            PaymentPlanSummaryViewKt.PaymentPlanSummaryView(paymentPlanSummaryViewModel, function1, null, null, gapComposer3, 0);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), gapComposer, 3072, 7);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-212205564);
                        final int i4 = 1;
                        ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1205484479, new Function2() { // from class: com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                int i42 = i4;
                                Composer composer2 = (Composer) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                switch (i42) {
                                    case 0:
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            PaymentPlanSummaryKt.PaymentPlanSummary(paymentPlanSummaryViewModel, function1, null, null, gapComposer2, 0);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            PaymentPlanSummaryViewKt.PaymentPlanSummaryView(paymentPlanSummaryViewModel, function1, null, null, gapComposer3, 0);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), gapComposer, 6);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Function1 function12 = (Function1) obj3;
                PromotionsReferralsHomeViewModel promotionsReferralsHomeViewModel = (PromotionsReferralsHomeViewModel) obj5;
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), null, SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, 16.0f, 1), Expect_jvmKt.rememberComposableLambda(-1090840711, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(i2, function12), gapComposer2), null, Expect_jvmKt.rememberComposableLambda(-947980465, new SheetKt$$ExternalSyntheticLambda5(7, promotionsReferralsHomeViewModel, realImageLoader, function12), gapComposer2), gapComposer2, 200064, 18);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                NotificationManagerCompat.Api23Impl.ActivePromotionSectionList((PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.ActivePromotionsSectionViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                NotificationManagerCompat.Api26Impl.AvailablePromotionSectionList((PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.AvailablePromotionsSectionViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                CameraXPreviewKt.CameraXPreview((CameraXPreviewState) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ((CashQrCameraXScannerView) obj5).Content((CashQrScannerViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                CameraXPreviewState cameraXPreviewState = (CameraXPreviewState) obj5;
                Function1 function13 = (Function1) obj3;
                CashQrScannerViewModel cashQrScannerViewModel = (CashQrScannerViewModel) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    ChromeConfigKt.ChromeConfig(null, null, null, Boolean.TRUE, null, null, null, gapComposer3, 3072, 119);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    boolean changed = gapComposer3.changed(function13);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    Object obj6 = rememberedValue;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        InfoSectionKt$$ExternalSyntheticLambda1 infoSectionKt$$ExternalSyntheticLambda1 = new InfoSectionKt$$ExternalSyntheticLambda1(13, function13);
                        gapComposer3.updateRememberedValue(infoSectionKt$$ExternalSyntheticLambda1);
                        obj6 = infoSectionKt$$ExternalSyntheticLambda1;
                    }
                    CameraXPreviewKt.CameraXPreview(cameraXPreviewState, (Function1) obj6, fillMaxSize3, gapComposer3, MLKEMEngine.KyberPolyBytes);
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(companion, 1.0f));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, systemBarsPadding);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1215522455, new CashQrCameraXScannerView$$ExternalSyntheticLambda2(cashQrScannerViewModel, function13, 1), gapComposer3);
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed2 = gapComposer3.changed(function13);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    Object obj7 = rememberedValue2;
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        CashtagQrScanView$$ExternalSyntheticLambda0 cashtagQrScanView$$ExternalSyntheticLambda0 = new CashtagQrScanView$$ExternalSyntheticLambda0(17, function13);
                        gapComposer3.updateRememberedValue(cashtagQrScanView$$ExternalSyntheticLambda0);
                        obj7 = cashtagQrScanView$$ExternalSyntheticLambda0;
                    }
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj7, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1145331246, new CashtagQrScanViewKt$$ExternalSyntheticLambda4(cameraXPreviewState, 1), gapComposer3), gapComposer3, 1572918, 44);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                    if (cashQrScannerViewModel.hideSegmentedControl) {
                        gapComposer3.startReplaceGroup(1264990892);
                        ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        CameraXPreviewKt.CameraXPreviewOverlay(48, 0, gapComposer3, SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), null);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                        EmptyChatKt.ProfileHeader(CameraXPreviewKt.f644lambda$726325451, (Modifier) null, (Function2) null, CameraXPreviewKt.f641lambda$2046943342, gapComposer3, 3078, 6);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1265801635);
                        if (cashQrScannerViewModel.showShareScanToggle) {
                            r11 = 0;
                            gapComposer3.startReplaceGroup(1267294099);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(1265832418);
                            Object rememberedValue3 = gapComposer3.rememberedValue();
                            Object obj8 = rememberedValue3;
                            if (rememberedValue3 == neverEqualPolicy) {
                                obj8 = Boxes$$ExternalSyntheticOutline1.m(cashQrScannerViewModel.showUpdatedSharingUi ? 1 : 0, gapComposer3);
                            }
                            ArcadeThemeKt.ArcadeTheme(ColorsLightKt.colorsLight, null, null, Expect_jvmKt.rememberComposableLambda(345207609, new RetroUiFactory$$ExternalSyntheticLambda3(7, cashQrScannerViewModel, (ParcelableSnapshotMutableIntState) obj8, function13), gapComposer3), gapComposer3, 3072, 6);
                            r11 = 0;
                            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                            gapComposer3.end(false);
                        }
                        EmptyChatKt.ProfileHeader(Room.stringResource(gapComposer3, R.string.profile_scan_qr_code_to_pay), (Modifier) null, (Function2) null, "", gapComposer3, 3072, 6);
                        DBUtil.SpacerBetweenSectionLarge(r11, 1, gapComposer3, null);
                        ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        CameraXPreviewKt.CameraXPreviewOverlay(r11, 2, gapComposer3, SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), null);
                        gapComposer3.end(r11);
                    }
                    gapComposer3.end(true);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                CashQrScannerViewModel cashQrScannerViewModel2 = (CashQrScannerViewModel) obj5;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj4;
                Function1 function14 = (Function1) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    int intValue5 = parcelableSnapshotMutableIntState.getIntValue();
                    boolean changed3 = gapComposer4.changed(cashQrScannerViewModel2.showUpdatedSharingUi);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new CardTransitionKt$$ExternalSyntheticLambda4(4, cashQrScannerViewModel2, function14, parcelableSnapshotMutableIntState);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    Function1 function15 = (Function1) rememberedValue4;
                    boolean changed4 = gapComposer4.changed(cashQrScannerViewModel2.showUpdatedSharingUi);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new UtilsKt$$ExternalSyntheticLambda0(cashQrScannerViewModel2, 29);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    ModalKt.SegmentedControl(intValue5, function15, fillMaxWidth, (Function1) rememberedValue5, gapComposer4, MLKEMEngine.KyberPolyBytes, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                int i5 = CashQrShortcutsOnboardingView.$r8$clinit;
                ((CashQrShortcutsOnboardingView) obj5).Content((CashQrShortcutsOnboardingViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                int i6 = CashtagQrScanView.$r8$clinit;
                ((CashtagQrScanView) obj5).Content((CashtagQrScanViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                CameraXPreviewKt.CashtagQrScanner((CashtagQrScanViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                int i7 = QrCodeProfileView.$r8$clinit;
                ((QrCodeProfileView) obj5).Content((QrCodeProfileViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                CameraXPreviewKt.QrCodeProfile((QrCodeProfileViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                String str = (String) obj5;
                String str2 = (String) obj4;
                Region region = (Region) obj3;
                Composer composer5 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(companion, 1.0f), 20.0f, 64.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer5, 54);
                    int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, m299paddingVpY3zN4);
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
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    if (str == null) {
                        str = re$$ExternalSyntheticOutline0.m(gapComposer5, -227699427, R.string.empty_view_title, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-227699706);
                        gapComposer5.end(false);
                    }
                    String str3 = str;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3834, 0L, (Composer) gapComposer5, (Modifier) null, ((Typography) gapComposer5.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    if (str2 == null) {
                        gapComposer5.startReplaceGroup(-227691831);
                        str2 = new MessageFormat(Room.stringResource(gapComposer5, R.string.empty_view_message)).format(zzel$EnumUnboxingLocalUtility.m(1, "cashtag_symbol", Moneys.symbol(Cashtags.guessCashtagCurrency(region))));
                        str2.getClass();
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(-227692606);
                        gapComposer5.end(false);
                    }
                    AnnotatedString annotatedString = new AnnotatedString(str2);
                    TextStyle textStyle = ((Typography) gapComposer5.consume(staticProvidableCompositionLocal)).bodyMedium;
                    Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    KeypadKt.m3650TextPdH14aY(0, 0, 3, 0, 0, 0, 3826, colors3.semantic.text.subtle, (Composer) gapComposer5, (Modifier) null, annotatedString, textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                PaymentPlanSummaryKt.TimelineSection((PaymentPlanSummaryViewModel.TimelineSection) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                PaymentPlanSummaryKt.PurchasesSection((PaymentPlanSummaryViewModel.PurchasesSection) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                PaymentPlanSummaryViewModel.BottomSheetData bottomSheetData = (PaymentPlanSummaryViewModel.BottomSheetData) obj5;
                Function1 function16 = (Function1) obj3;
                PaddingValues paddingValues = (PaddingValues) obj4;
                Composer composer6 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean changed5 = gapComposer6.changed(function16);
                    Object rememberedValue6 = gapComposer6.rememberedValue();
                    if (changed5 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(10, function16);
                        gapComposer6.updateRememberedValue(rememberedValue6);
                    }
                    PaymentPlanSummaryViewKt.PaymentPlanSummaryViewBottomSheetContent(bottomSheetData, (Function0) rememberedValue6, SpacerKt.padding(SizeKt.fillMaxWidth(companion, 1.0f), paddingValues), gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                PaymentPlanSummaryViewKt.LabeledLinkView((PaymentPlanSummaryViewModel.LabeledLink) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                PaymentPlanSummaryViewKt.PaymentPlanSummaryViewBottomSheetContent((PaymentPlanSummaryViewModel.BottomSheetData) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                SelectPaymentPlanViewKt.SelectPaymentPlanInfoSheet((Modifier) obj5, (SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                SelectPaymentPlanViewKt.SelectPaymentPlanOptionsConfigSheet((Modifier) obj5, (SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                TypedValueCompat.InstalledUI((SavingsAppletTileViewModel.Installed) obj5, (AppletTile.AppletTileAppearance) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                SavingsAppletTilePresenter$MetroFactory savingsAppletTilePresenter$MetroFactory = ((SavingsAppletTilePresenter$Factory$Impl) obj5).delegateFactory;
                Analytics analytics = (Analytics) savingsAppletTilePresenter$MetroFactory.analytics.invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) savingsAppletTilePresenter$MetroFactory.moneyAnalyticsService.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) savingsAppletTilePresenter$MetroFactory.moneyFormatterFactory.invoke();
                RealSavingsAppletTileRepository realSavingsAppletTileRepository = (RealSavingsAppletTileRepository) savingsAppletTilePresenter$MetroFactory.repository.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) savingsAppletTilePresenter$MetroFactory.stringManager.invoke();
                RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) savingsAppletTilePresenter$MetroFactory.familyProfileManager.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) savingsAppletTilePresenter$MetroFactory.routerFactory.invoke();
                RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) savingsAppletTilePresenter$MetroFactory.moneyNavigatorHelper.invoke();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) savingsAppletTilePresenter$MetroFactory.featureFlagManager.invoke();
                PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl = (PromotedAppletTilePresenter$Factory$Impl) savingsAppletTilePresenter$MetroFactory.promotedAppletTilePresenterFactory.invoke();
                analytics.getClass();
                moneyAnalyticsService.getClass();
                factory.getClass();
                realSavingsAppletTileRepository.getClass();
                androidStringManager.getClass();
                realFamilyProfileManager.getClass();
                realRouter$Factory$Impl.getClass();
                realMoneyNavigatorHelper.getClass();
                featureFlagManager.getClass();
                promotedAppletTilePresenter$Factory$Impl.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new PoolsListPresenter(analytics, moneyAnalyticsService, factory, realSavingsAppletTileRepository, navigator, androidStringManager, realFamilyProfileManager, realRouter$Factory$Impl, realMoneyNavigatorHelper, featureFlagManager, promotedAppletTilePresenter$Factory$Impl)), coroutineScope, (LifecycleOwner) obj4);
                return new SavingsAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), ((RealSavingsAppletTileRepository) obj3).uninstallationSectionId, new ScoreAppletViewsModule$$ExternalSyntheticLambda1(start$default, 3));
            case 23:
                ((Integer) obj2).getClass();
                ButtonGroupKt.ButtonGroup((SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                ButtonGroupKt.TransferInPicker((AmountPickerViewModel.Ready) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                ButtonGroupKt.GoalFolderList((SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ButtonGroupKt.SavingsCellDefault((CellDefaultViewModel) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                SavingsScreenHeaderKt.GoalFooter((SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                ((P2PListView) obj5).Content((SavingsScreenViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                SavingsScreenViewKt.Disclosure((SavingsScreenViewModel.Content.SavingsScreenElement.Disclosure) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ RetroUiFactory$$ExternalSyntheticLambda3(Modifier modifier, Object obj, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = modifier;
    }

    public /* synthetic */ RetroUiFactory$$ExternalSyntheticLambda3(CameraXPreviewState cameraXPreviewState, Function1 function1, CashQrScannerViewModel cashQrScannerViewModel) {
        this.$r8$classId = 6;
        this.f$0 = cameraXPreviewState;
        this.f$2 = function1;
        this.f$1 = cashQrScannerViewModel;
    }

    public /* synthetic */ RetroUiFactory$$ExternalSyntheticLambda3(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ RetroUiFactory$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ RetroUiFactory$$ExternalSyntheticLambda3(Function1 function1, PromotionsReferralsHomeViewModel promotionsReferralsHomeViewModel, RealImageLoader realImageLoader) {
        this.$r8$classId = 1;
        this.f$2 = function1;
        this.f$0 = promotionsReferralsHomeViewModel;
        this.f$1 = realImageLoader;
    }
}
