package com.squareup.cash.bitcoin.views.map;

import android.content.Context;
import android.content.res.Configuration;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.graphics.shadow.BlurKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.DistanceAndFlags;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.applet.boost.BitcoinBoostWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonsWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.disabled.DependentBitcoinDisabledViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.disclosure.BitcoinHomeDisclosureWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoryViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.graph.BitcoinHomeGraphWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.map.BitcoinMapCardWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.news.BitcoinHomeNewsWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.pendingidv.BitcoinHomePendingIdvWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendReceiveBottomSheetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.dependents.BitcoinDependentWelcomeViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinSellerMarkerLocation;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinCardUpsellViewModel;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinLandingViewModel;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinInstrumentRecommendationViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.applet.boost.BitcoinBoostWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.buttons.BitcoinTradeButtonsWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.disclosure.BitcoinDisclosureWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.education.BitcoinStoriesWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.graph.BitcoinGraphWidgetKt;
import com.squareup.cash.bitcoin.views.applet.idv.BitcoinPendingIdvWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.onramp.BitcoinOnRampWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendRestrictionViewKt;
import com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsViewKt;
import com.squareup.cash.bitcoin.views.applet.statsandsettings.BitcoinSettingsWidgetViewKt;
import com.squareup.cash.bitcoin.views.compose.CopyCheckIconState;
import com.squareup.cash.bitcoin.views.dependents.BitcoinDependentWelcomeScreenView;
import com.squareup.cash.bitcoin.views.limits.BitcoinLimitsLoadingView;
import com.squareup.cash.bitcoin.views.paidinbitcoin.PainInBitcoinUpsellViewKt;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsContentKt;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsViewKt;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmDialogViewModel;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetViewModel;
import com.squareup.cash.blockers.actions.views.BlockerActionConfirmDialogView;
import com.squareup.cash.blockers.views.AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.views.CashMapViewKt;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinMapViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ BitcoinMapViewKt$$ExternalSyntheticLambda0(RealImageLoader realImageLoader, BitcoinTransferViewModel bitcoinTransferViewModel, Function1 function1) {
        this.$r8$classId = 23;
        this.f$2 = realImageLoader;
        this.f$3 = bitcoinTransferViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        StaticProvidableCompositionLocal staticProvidableCompositionLocal;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$1;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj3;
                BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal2);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    long j = colors.semantic.background.f1047app;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, j, rectangleShapeKt$RectangleShape$1));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-678870403, new CashtagViewKt$$ExternalSyntheticLambda10(bitcoinMapViewModel, 20), gapComposer);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
                        rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(0, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    } else {
                        staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
                    }
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = staticProvidableCompositionLocal;
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-89182568, new ShiftListViewKt$$ExternalSyntheticLambda11(function1, mutableState, 1), gapComposer), gapComposer, 1572918, 44);
                    Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxSize(companion, 1.0f), true);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    UiCallbackModel uiCallbackModel = bitcoinMapViewModel.cashMapUiModel;
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal3);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.subtle, rectangleShapeKt$RectangleShape$1);
                    CashMapViewModel cashMapViewModel = (CashMapViewModel) uiCallbackModel.model;
                    List list = bitcoinMapViewModel.filteredLocations.locations;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new BitcoinClusterItem((BitcoinSellerMarkerLocation) it.next()));
                    }
                    CashMapViewKt.CashMapView(m177backgroundbw27NRU, arrayList, cashMapViewModel, BitcoinMapViewKt.lambda$1227850913, BitcoinMapViewKt.f263lambda$1075104440, null, null, null, null, null, null, false, false, uiCallbackModel.onEvent, gapComposer, 221184, 0, 16328);
                    GapComposer gapComposer2 = gapComposer;
                    gapComposer2.end(true);
                    if (bitcoinMapViewModel.showPayButton) {
                        gapComposer2.startReplaceGroup(1035773344);
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal4 = ArcadeThemeKt.LocalSizes;
                        ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal4)).getClass();
                        DefaultSizes.spacing.getClass();
                        ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal4)).getClass();
                        Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 32.0f, 16.0f);
                        ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                        boolean changed2 = gapComposer2.changed(function1);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(4, function1);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, m299paddingVpY3zN4, buttonProminence, false, false, null, BitcoinMapViewKt.lambda$1547491831, gapComposer2, 1573248, 56);
                        gapComposer2 = gapComposer2;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1036160875);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                BitcoinBoostWidgetViewKt.BitcoinBoostWidgetView((BitcoinBoostWidgetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                BitcoinTradeButtonsWidgetViewKt.BitcoinTradeButtonsWidgetView((BitcoinTradeButtonsWidgetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ShaderKt.DependentBitcoinDisabledWidget((DependentBitcoinDisabledViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                BitcoinDisclosureWidgetViewKt.BitcoinDisclosureWidgetView((BitcoinHomeDisclosureWidgetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                BitcoinStoriesWidgetViewKt.StoryTile((Modifier) obj3, (Function0) obj5, (BitcoinStoryViewModel) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                BitcoinGraphWidgetKt.BitcoinGraphWidget((BitcoinHomeGraphWidgetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                BitcoinPendingIdvWidgetViewKt.BitcoinPendingIdvWidgetView((BitcoinHomePendingIdvWidgetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ShadowKt.BitcoinMapWidgetView((BitcoinMapCardWidgetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                TileMode.BitcoinNewsWidgetView((BitcoinHomeNewsWidgetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                BitcoinOnRampWidgetViewKt.BitcoinOnRampWidgetView((BitcoinOnRampWidgetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                BitcoinSendRestrictionViewKt.BitcoinSendReceiveContent((BitcoinSendReceiveBottomSheetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                BitcoinStackingToolsViewKt.BitcoinStackingToolsView((BitcoinStackingToolsViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                BitcoinSettingsWidgetViewKt.BitcoinSettingsWidgetView((BitcoinSettingsWidgetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                BitcoinSettingsWidgetViewKt.StatsAndSettingsOption((BitcoinSettingsWidgetOption) obj3, (Modifier) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                BlurKt.CopyCheckIcon((Modifier) obj3, (CopyCheckIconState) obj5, (String) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                int i2 = BitcoinDependentWelcomeScreenView.$r8$clinit;
                ((BitcoinDependentWelcomeScreenView) obj5).Content((BitcoinDependentWelcomeViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                int i3 = BitcoinLimitsLoadingView.$r8$clinit;
                ((BitcoinLimitsLoadingView) obj5).Content((Unit) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                BitcoinMapViewKt.BitcoinLocationContent((BitcoinLocationViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                PainInBitcoinUpsellViewKt.PaidInBitcoinLandingContent((PaidInBitcoinLandingViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                PainInBitcoinUpsellViewKt.PaidInBitcoinUpsell((PaidInBitcoinCardUpsellViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                BitcoinPerformanceDetailsContentKt.BitcoinPerformanceDetailsContentFooter((String) obj3, (Function2) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                BitcoinPerformanceDetailsViewKt.InfoItemBottomSheet((BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                RealImageLoader realImageLoader = (RealImageLoader) obj5;
                BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(1409666950, new SetPinViewKt$$ExternalSyntheticLambda2(bitcoinTransferViewModel, function12), gapComposer3), gapComposer3, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                DistanceAndFlags.Content((Modifier) obj5, (BitcoinInstrumentRecommendationViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                int i4 = BlockerActionConfirmDialogView.$r8$clinit;
                ((BlockerActionConfirmDialogView) obj5).Content((BlockerActionConfirmDialogViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                MeasureScopeWithLayoutNodeKt.Main((Modifier) obj5, (BlockerActionConfirmSheetViewModel.Main.Original) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                MeasureScopeWithLayoutNodeKt.VariantC((Modifier) obj5, (BlockerActionConfirmSheetViewModel.Main.VariantC) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                BlockerActionConfirmSheetViewModel blockerActionConfirmSheetViewModel = (BlockerActionConfirmSheetViewModel) obj5;
                Modifier modifier = (Modifier) obj4;
                Function1 function13 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (!gapComposer4.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                    gapComposer4.skipToGroupEnd();
                } else if (blockerActionConfirmSheetViewModel instanceof BlockerActionConfirmSheetViewModel.Main) {
                    gapComposer4.startReplaceGroup(1003550867);
                    BlockerActionConfirmSheetViewModel.Main main = (BlockerActionConfirmSheetViewModel.Main) blockerActionConfirmSheetViewModel;
                    if (main instanceof BlockerActionConfirmSheetViewModel.Main.Original) {
                        gapComposer4.startReplaceGroup(-1630194270);
                        MeasureScopeWithLayoutNodeKt.Main(modifier, (BlockerActionConfirmSheetViewModel.Main.Original) blockerActionConfirmSheetViewModel, function13, gapComposer4, 0);
                        gapComposer4.end(false);
                    } else if (main instanceof BlockerActionConfirmSheetViewModel.Main.VariantA) {
                        gapComposer4.startReplaceGroup(-1630191482);
                        MeasureScopeWithLayoutNodeKt.VariantA(modifier, (BlockerActionConfirmSheetViewModel.Main.VariantA) blockerActionConfirmSheetViewModel, function13, gapComposer4, 0);
                        gapComposer4.end(false);
                    } else {
                        if (!(main instanceof BlockerActionConfirmSheetViewModel.Main.VariantC)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, -1630195377, false);
                        }
                        gapComposer4.startReplaceGroup(-1630188538);
                        MeasureScopeWithLayoutNodeKt.VariantC(modifier, (BlockerActionConfirmSheetViewModel.Main.VariantC) blockerActionConfirmSheetViewModel, function13, gapComposer4, 0);
                        gapComposer4.end(false);
                    }
                    gapComposer4.end(false);
                } else if (Intrinsics.areEqual(blockerActionConfirmSheetViewModel, BlockerActionConfirmSheetViewModel.LoadingSubmit.INSTANCE)) {
                    gapComposer4.startReplaceGroup(-1630183385);
                    TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(modifier, ((Configuration) gapComposer4.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f), LoadingIndicatorPosition.CENTER, gapComposer4, 48, 0);
                    gapComposer4.end(false);
                } else {
                    if (!Intrinsics.areEqual(blockerActionConfirmSheetViewModel, BlockerActionConfirmSheetViewModel.SubmitSuccess.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, -1630197121, false);
                    }
                    gapComposer4.startReplaceGroup(-1630173755);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(modifier, ((Configuration) gapComposer4.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f);
                    Context context = (Context) gapComposer4.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    boolean changed3 = gapComposer4.changed(function13);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(15, function13);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth2, context, null, 0, 0L, 0L, false, (Function0) rememberedValue3, false, gapComposer4, MLKEMEngine.KyberPolyBytes, 376);
                    gapComposer4.end(false);
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                MeasureScopeWithLayoutNodeKt.VariantA((Modifier) obj5, (BlockerActionConfirmSheetViewModel.Main.VariantA) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BitcoinMapViewKt$$ExternalSyntheticLambda0(Modifier modifier, Object obj, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = obj;
        this.f$1 = function1;
        this.f$3 = modifier;
    }

    public /* synthetic */ BitcoinMapViewKt$$ExternalSyntheticLambda0(BlockerActionConfirmSheetViewModel blockerActionConfirmSheetViewModel, Modifier modifier, Function1 function1) {
        this.$r8$classId = 28;
        this.f$2 = blockerActionConfirmSheetViewModel;
        this.f$3 = modifier;
        this.f$1 = function1;
    }

    public /* synthetic */ BitcoinMapViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    public /* synthetic */ BitcoinMapViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$1 = function1;
    }

    public /* synthetic */ BitcoinMapViewKt$$ExternalSyntheticLambda0(Function1 function1, BitcoinMapViewModel bitcoinMapViewModel, MutableState mutableState) {
        this.$r8$classId = 0;
        this.f$1 = function1;
        this.f$2 = bitcoinMapViewModel;
        this.f$3 = mutableState;
    }
}
