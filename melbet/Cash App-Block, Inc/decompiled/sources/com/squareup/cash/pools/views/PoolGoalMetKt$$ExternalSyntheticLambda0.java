package com.squareup.cash.pools.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.core.content.ContextCompat$Api26Impl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.molecule.PlatformKt;
import bo.app.g6$$ExternalSyntheticLambda11;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.maps.android.compose.GoogleMapKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.screens.InstrumentSelectionResult;
import com.squareup.cash.instruments.screens.WhichInstrument;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.offers.viewmodels.LegalTextViewModel;
import com.squareup.cash.offers.viewmodels.OfferDetailsSheetViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.views.details.OfferDetailsSheetKt;
import com.squareup.cash.offers.views.home.OfferTileKt;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksReceiptViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.viewmodels.DialogViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewModel;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4;
import com.squareup.cash.payments.views.UtilKt;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.payments.views.composer.Subject;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.payments.views.personalization.ActionMenuKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTileModel;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt;
import com.squareup.cash.pools.viewmodels.PoolDetailsViewModel;
import com.squareup.cash.pools.views.animation.GoalMetAnimationStateHolder;
import com.squareup.cash.pools.views.animation.GoalMetTimeline;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewModel;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.profile.viewmodels.Category$CategoryListHeader$ToggleHeader;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewModel;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.qrcodes.views.CameraXPreviewState;
import com.squareup.cash.qrcodes.views.CashtagQrScanView$$ExternalSyntheticLambda0;
import com.squareup.cash.qrcodes.views.CashtagQrScanViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.qrcodes.views.QrAddressScannerViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader;
import com.squareup.cash.savings.views.SavingsScreenHeaderKt;
import com.squareup.cash.savings.views.SavingsScreenViewKt;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolGoalMetKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ PoolGoalMetKt$$ExternalSyntheticLambda0(CameraXPreviewState cameraXPreviewState, Function1 function1, PaddingValues paddingValues, QrAddressScannerViewModel qrAddressScannerViewModel) {
        this.$r8$classId = 22;
        this.f$0 = cameraXPreviewState;
        this.f$1 = function1;
        this.f$2 = paddingValues;
        this.f$3 = qrAddressScannerViewModel;
    }

    private final Object invoke$com$squareup$cash$qrcodes$views$QrAddressScannerViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2) {
        CameraXPreviewState cameraXPreviewState = (CameraXPreviewState) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        PaddingValues paddingValues = (PaddingValues) this.f$2;
        QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) this.f$3;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new InfoSectionKt$$ExternalSyntheticLambda1(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CameraXPreviewKt.CameraXPreview(cameraXPreviewState, (Function1) rememberedValue, fillMaxSize2, gapComposer, MLKEMEngine.KyberPolyBytes);
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SpacerKt.padding(SizeKt.fillMaxSize(companion, 1.0f), paddingValues));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            boolean changed2 = gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CashtagQrScanView$$ExternalSyntheticLambda0(25, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-904892662, new CashtagQrScanViewKt$$ExternalSyntheticLambda4(cameraXPreviewState, 2), gapComposer), gapComposer, 1572918, 44);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(qrAddressScannerViewModel.qrScannerTitle, (Modifier) null, (Function2) null, "", gapComposer, 3072, 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Colors colors2 = ColorsLightKt.colorsLight;
            ArcadeThemeKt.ArcadeTheme(colors2, null, null, Expect_jvmKt.rememberComposableLambda(1611610902, new QrAddressScannerViewKt$$ExternalSyntheticLambda9(qrAddressScannerViewModel, 0), gapComposer), gapComposer, 3072, 6);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            ArcadeThemeKt.ArcadeTheme(colors2, null, null, Expect_jvmKt.rememberComposableLambda(1165453773, new CalloutKt$$ExternalSyntheticLambda0(4, function1, qrAddressScannerViewModel), gapComposer), gapComposer, 3072, 6);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$savings$views$SavingsScreenViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        RealImageLoader realImageLoader = (RealImageLoader) this.f$0;
        SavingsScreenViewModel savingsScreenViewModel = (SavingsScreenViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        MutableState mutableState = (MutableState) this.f$3;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        int i = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-363013788, new BasicShieetScope$$ExternalSyntheticLambda1(i, savingsScreenViewModel, function1, mutableState), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        Instrument instrument;
        Instrument instrument2;
        boolean z;
        Modifier modifier;
        Float f;
        boolean z2;
        Function1 function1;
        int i;
        Float f2;
        LinearGradient m132linearGradientmHitzGk;
        boolean z3;
        ConstraintSetForInlineDsl constraintSetForInlineDsl;
        MutableState mutableState;
        LinearGradient m132linearGradientmHitzGk2;
        long j;
        int i2 = this.$r8$classId;
        Modifier modifier2 = Modifier.Companion.$$INSTANCE;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Object obj3 = Composer.Companion.Empty;
        Object obj4 = this.f$0;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        switch (i2) {
            case 0:
                Modifier modifier3 = (Modifier) obj4;
                final GoalMetAnimationStateHolder goalMetAnimationStateHolder = (GoalMetAnimationStateHolder) obj7;
                List list = (List) obj6;
                GoalMetTimeline goalMetTimeline = (GoalMetTimeline) obj5;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier3, Color.m675copywmQWz5c$default(((Number) goalMetAnimationStateHolder.backgroundAlphaAnimatable.getValue()).floatValue(), Strings.getColors(gapComposer).semantic.background.f1047app, 14), rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    boolean changed = gapComposer.changed(goalMetAnimationStateHolder);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj3) {
                        final int i3 = 0;
                        rememberedValue = new Function1() { // from class: com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i4 = i3;
                                GoalMetAnimationStateHolder goalMetAnimationStateHolder2 = goalMetAnimationStateHolder;
                                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj8;
                                reusableGraphicsLayerScope.getClass();
                                switch (i4) {
                                    case 0:
                                        reusableGraphicsLayerScope.setScaleX(((Number) goalMetAnimationStateHolder2.titleScaleAnimatable.getValue()).floatValue());
                                        reusableGraphicsLayerScope.setScaleY(((Number) goalMetAnimationStateHolder2.titleScaleAnimatable.getValue()).floatValue());
                                        reusableGraphicsLayerScope.setAlpha(((Number) goalMetAnimationStateHolder2.titleAlphaAnimatable.getValue()).floatValue());
                                        break;
                                    default:
                                        reusableGraphicsLayerScope.setScaleX(((Number) goalMetAnimationStateHolder2.subtitleScaleAnimatable.getValue()).floatValue());
                                        reusableGraphicsLayerScope.setScaleY(((Number) goalMetAnimationStateHolder2.subtitleScaleAnimatable.getValue()).floatValue());
                                        reusableGraphicsLayerScope.setAlpha(((Number) goalMetAnimationStateHolder2.subtitleAlphaAnimatable.getValue()).floatValue());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3832, 0L, (Composer) gapComposer, ColorKt.graphicsLayer(modifier2, (Function1) rememberedValue), Strings.getTypography(gapComposer).pageTitle, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.pools_goal_met), (Map) null, (Function1) null, false);
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    SpacerKt.Spacer(gapComposer, SpacerKt.m298padding3ABfNKs(modifier2, 4.0f));
                    boolean changed2 = gapComposer.changed(goalMetAnimationStateHolder);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == obj3) {
                        final int i4 = 1;
                        rememberedValue2 = new Function1() { // from class: com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i42 = i4;
                                GoalMetAnimationStateHolder goalMetAnimationStateHolder2 = goalMetAnimationStateHolder;
                                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj8;
                                reusableGraphicsLayerScope.getClass();
                                switch (i42) {
                                    case 0:
                                        reusableGraphicsLayerScope.setScaleX(((Number) goalMetAnimationStateHolder2.titleScaleAnimatable.getValue()).floatValue());
                                        reusableGraphicsLayerScope.setScaleY(((Number) goalMetAnimationStateHolder2.titleScaleAnimatable.getValue()).floatValue());
                                        reusableGraphicsLayerScope.setAlpha(((Number) goalMetAnimationStateHolder2.titleAlphaAnimatable.getValue()).floatValue());
                                        break;
                                    default:
                                        reusableGraphicsLayerScope.setScaleX(((Number) goalMetAnimationStateHolder2.subtitleScaleAnimatable.getValue()).floatValue());
                                        reusableGraphicsLayerScope.setScaleY(((Number) goalMetAnimationStateHolder2.subtitleScaleAnimatable.getValue()).floatValue());
                                        reusableGraphicsLayerScope.setAlpha(((Number) goalMetAnimationStateHolder2.subtitleAlphaAnimatable.getValue()).floatValue());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3832, 0L, (Composer) gapComposer, ColorKt.graphicsLayer(modifier2, (Function1) rememberedValue2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.pools_yall_crushed_it), (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer, SpacerKt.m298padding3ABfNKs(modifier2, 48.0f));
                    Strings.getSizes(gapComposer).getClass();
                    PoolGoalMetKt.AvatarLayoutAnimation(list, OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(modifier2, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), false), goalMetTimeline, gapComposer, 0);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                KeypadKt.MooncakeSwitchScaffold((Modifier) obj4, (ComposableLambdaImpl) obj7, (ComposableLambdaImpl) obj6, (Function2) obj5, (Composer) obj, Updater.updateChangedFlags(433));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                OfferDetailsSheetKt.OfferDetailsSheet((Modifier) obj4, (OfferDetailsSheetViewModel.OfferDetails) obj7, (Function1) obj6, (Function5) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                OfferTileKt.OffersLegalText((Modifier) obj4, (LegalTextViewModel) obj7, (PaddingValuesImpl) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ShaderKt.OffersCategoriesSection((Modifier) obj4, (OffersHomeListItemViewModel.CategoryTilesSectionViewModel) obj7, (LazyGridState) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.PendingDirectDepositSheet((PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit.PendingDirectDepositSheetContent) obj7, (Function0) obj6, (Modifier) obj4, (RealSheetState) obj5, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.Destination((String) obj7, (PaychecksReceiptViewModel.Section.Row.Treatment) obj6, (Modifier) obj4, (String) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) obj4;
                State state = (State) obj7;
                MutableState mutableState2 = (MutableState) obj6;
                MutableState mutableState3 = (MutableState) obj5;
                InstrumentSelectionResult instrumentSelectionResult = (InstrumentSelectionResult) obj2;
                ((WhichInstrument) obj).getClass();
                if (instrumentSelectionResult != null && (str = instrumentSelectionResult.token) != null) {
                    List list2 = (List) state.getValue();
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                instrument2 = it.next();
                                if (Intrinsics.areEqual(((Instrument) instrument2).token, str)) {
                                }
                            } else {
                                instrument2 = 0;
                            }
                        }
                        instrument = instrument2;
                    } else {
                        instrument = null;
                    }
                    CashInstrumentType cashInstrumentType = str.equals("GOOGLE_PAY") ? CashInstrumentType.GOOGLE_PAY : instrument != null ? instrument.cashInstrumentType : CashInstrumentType.CASH_BALANCE;
                    Analytics analytics = paymentConfigurationPresenter.analytics;
                    String uuid = paymentConfigurationPresenter.paymentToken.toString();
                    uuid.getClass();
                    InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = ((PaymentRouterData) mutableState2.getValue()).instrumentRowModel;
                    CashInstrumentType cashInstrumentType2 = instrumentSelectionRowViewModel != null ? instrumentSelectionRowViewModel.cashInstrumentType : null;
                    InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2 = ((PaymentRouterData) mutableState2.getValue()).instrumentRowModel;
                    GoogleMapKt.logSelectedInstrument(analytics, cashInstrumentType, cashInstrumentType2, instrumentSelectionRowViewModel2 != null ? instrumentSelectionRowViewModel2.cashInstrumentType : null, Long.valueOf(paymentConfigurationPresenter.instrumentSelectionStartTimestamp), Long.valueOf(paymentConfigurationPresenter.clock.millis()), uuid, ExperienceType.BOTTOM_SHEET, paymentConfigurationPresenter.flowToken);
                }
                mutableState3.setValue(new InstrumentSelection(instrumentSelectionResult != null ? instrumentSelectionResult.token : null, instrumentSelectionResult != null ? instrumentSelectionResult.acceptedFeeAmount : null, (CashInstrumentType) null, 12));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                QuickPayViewKt.FrequencyButtons((Modifier) obj4, (Function1) obj7, (ImmutableList) obj6, (PaymentScheduleFrequency) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ErrorKt.Loading((Modifier) obj4, (Function0) obj7, (Function0) obj6, (PaymentConfigurationViewModel.Loading.LoadingStatus) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ErrorKt.RecipientRow((Modifier) obj4, (Function1) obj7, (Function1) obj6, (RecipientViewModel) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ErrorKt.SegmentedTitle((Function0) obj7, (String) obj6, (Subject) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(221575));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPersonRow((NearbyPerson) obj7, (Function0) obj6, (Function0) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                Text text = (Text) obj4;
                Function1 function12 = (Function1) obj7;
                PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu loadedPersonalizePaymentMenu = (PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu) obj6;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj5;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                Float valueOf = Float.valueOf(0.5f);
                Float valueOf2 = Float.valueOf(RecyclerView.DECELERATION_RATE);
                ?? r10 = (GapComposer) composer2;
                if (r10.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (text != null) {
                        r10.startReplaceGroup(2010895263);
                        boolean changed3 = r10.changed(function12) | r10.changedInstance(text);
                        Object rememberedValue3 = r10.rememberedValue();
                        if (changed3 || rememberedValue3 == obj3) {
                            rememberedValue3 = new LocalViewFactory$createUi$view$3$1$1$1(10, function12, text);
                            r10.updateRememberedValue(rememberedValue3);
                        }
                        modifier = SuspendingPointerInputFilterKt.pointerInput(modifier2, text, (PointerInputEventHandler) rememberedValue3);
                        z = false;
                        r10.end(false);
                    } else {
                        z = false;
                        r10.startReplaceGroup(2011074412);
                        r10.end(false);
                        modifier = modifier2;
                    }
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z);
                    int hashCode2 = Long.hashCode(r10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = r10.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(r10, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (r10.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    r10.startReusableNode();
                    if (r10.inserting) {
                        r10.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        r10.useNode();
                    }
                    Updater.m576setimpl(r10, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(r10, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(r10, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(r10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(r10, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(modifier2, 1.0f);
                    PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu.Personalization personalization = loadedPersonalizePaymentMenu.personalization;
                    DialogViewModel dialogViewModel = loadedPersonalizePaymentMenu.dialogModel;
                    UtilKt.TransitionalBackground(fillMaxSize2, personalization.chosenBackgroundIndex, personalization.availableBackgrounds, r10, 6);
                    if (loadedPersonalizePaymentMenu.showExpressivePaymentsUi) {
                        r10.startReplaceGroup(1924268330);
                        Modifier fillMaxSize3 = SizeKt.fillMaxSize(modifier2, 1.0f);
                        f = valueOf2;
                        m132linearGradientmHitzGk2 = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r5, new Pair[]{new Pair(valueOf2, new Color(Color.m675copywmQWz5c$default(0.5f, Color.Black, 14))), new Pair(valueOf, new Color(Color.Transparent))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                        BoxKt.Box(ImageKt.background$default(fillMaxSize3, m132linearGradientmHitzGk2, null, 6), r10, 6);
                        z2 = false;
                        r10.end(false);
                    } else {
                        f = valueOf2;
                        z2 = false;
                        r10.startReplaceGroup(1924577772);
                        r10.end(false);
                    }
                    if (text != null) {
                        r10.startReplaceGroup(1924629728);
                        i = 6;
                        f2 = f;
                        AlphaKt.PersonalizePaymentTextField(null, text, function12, loadedPersonalizePaymentMenu.shouldShakeOnInvalidEntry, r10, 0);
                        function1 = function12;
                        r10.end(z2);
                    } else {
                        function1 = function12;
                        i = 6;
                        f2 = f;
                        r10.startReplaceGroup(1924802956);
                        r10.end(z2);
                    }
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(BoxScopeInstance.INSTANCE.align(modifier2, Alignment.Companion.BottomCenter), 100.0f), 1.0f);
                    Pair pair = new Pair(f2, new Color(Color.Transparent));
                    long j2 = Color.Black;
                    m132linearGradientmHitzGk = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r4, new Pair[]{pair, new Pair(valueOf, new Color(Color.m675copywmQWz5c$default(0.5f, j2, 14))), new Pair(Float.valueOf(1.0f), new Color(Color.m675copywmQWz5c$default(0.8f, j2, 14)))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                    BoxKt.Box(ImageKt.background$default(fillMaxWidth, m132linearGradientmHitzGk, null, i), r10, 0);
                    Modifier fillMaxSize4 = SizeKt.fillMaxSize(modifier2, 1.0f);
                    if (dialogViewModel != null) {
                        r10.startReplaceGroup(1925368458);
                        Object rememberedValue4 = r10.rememberedValue();
                        if (rememberedValue4 == obj3) {
                            rememberedValue4 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(11);
                            r10.updateRememberedValue(rememberedValue4);
                        }
                        modifier2 = SemanticsModifierKt.clearAndSetSemantics(modifier2, (Function1) rememberedValue4);
                        z3 = false;
                        r10.end(false);
                    } else {
                        z3 = false;
                        r10.startReplaceGroup(1925439138);
                        r10.end(false);
                    }
                    Modifier then = fillMaxSize4.then(modifier2);
                    r10.startReplaceGroup(-1003410150);
                    r10.startReplaceGroup(212064437);
                    r10.end(z3);
                    Density density = (Density) r10.consume(CompositionLocalsKt.LocalDensity);
                    Object rememberedValue5 = r10.rememberedValue();
                    if (rememberedValue5 == obj3) {
                        rememberedValue5 = new Measurer2(density);
                        r10.updateRememberedValue(rememberedValue5);
                    }
                    Measurer2 measurer2 = (Measurer2) rememberedValue5;
                    Object rememberedValue6 = r10.rememberedValue();
                    if (rememberedValue6 == obj3) {
                        rememberedValue6 = new ConstraintLayoutScope();
                        r10.updateRememberedValue(rememberedValue6);
                    }
                    ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue6;
                    Object rememberedValue7 = r10.rememberedValue();
                    if (rememberedValue7 == obj3) {
                        rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
                        r10.updateRememberedValue(rememberedValue7);
                    }
                    MutableState mutableState4 = (MutableState) rememberedValue7;
                    Object rememberedValue8 = r10.rememberedValue();
                    if (rememberedValue8 == obj3) {
                        rememberedValue8 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                        r10.updateRememberedValue(rememberedValue8);
                    }
                    ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue8;
                    Object rememberedValue9 = r10.rememberedValue();
                    if (rememberedValue9 == obj3) {
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Unit.INSTANCE, NeverEqualPolicy.INSTANCE);
                        r10.updateRememberedValue(parcelableSnapshotMutableState);
                        rememberedValue9 = parcelableSnapshotMutableState;
                    }
                    MutableState mutableState5 = (MutableState) rememberedValue9;
                    boolean changedInstance = r10.changedInstance(measurer2) | r10.changed(EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    Object rememberedValue10 = r10.rememberedValue();
                    if (changedInstance || rememberedValue10 == obj3) {
                        rememberedValue10 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2(mutableState5, measurer2, constraintSetForInlineDsl2, mutableState4, 5);
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        mutableState = mutableState4;
                        r10.updateRememberedValue(rememberedValue10);
                    } else {
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        mutableState = mutableState4;
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue10;
                    Object rememberedValue11 = r10.rememberedValue();
                    if (rememberedValue11 == obj3) {
                        rememberedValue11 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3(mutableState, constraintSetForInlineDsl, 5);
                        r10.updateRememberedValue(rememberedValue11);
                    }
                    Function0 function0 = (Function0) rememberedValue11;
                    boolean changedInstance2 = r10.changedInstance(measurer2);
                    Object rememberedValue12 = r10.rememberedValue();
                    if (changedInstance2 || rememberedValue12 == obj3) {
                        rememberedValue12 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4(measurer2, 5);
                        r10.updateRememberedValue(rememberedValue12);
                    }
                    Function1 function13 = function1;
                    RulerKt.MultiMeasureLayout(SemanticsModifierKt.semantics(then, false, (Function1) rememberedValue12), Expect_jvmKt.rememberComposableLambda(1200550679, new AnimatedVisibilityKt$AnimatedVisibility$10(mutableState5, constraintLayoutScope, function0, loadedPersonalizePaymentMenu, delegatingSoftwareKeyboardController, function1), r10), measurePolicy, r10, 48);
                    r10.end(false);
                    if (dialogViewModel == null) {
                        r10.startReplaceGroup(1933050009);
                        r10.end(false);
                    } else {
                        r10.startReplaceGroup(1933050010);
                        String title = dialogViewModel.getTitle();
                        String message = dialogViewModel.getMessage();
                        String positiveButtonText = dialogViewModel.getPositiveButtonText();
                        String negativeButtonText = dialogViewModel.getNegativeButtonText();
                        boolean changedInstance3 = r10.changedInstance(dialogViewModel) | r10.changed(function13);
                        Object rememberedValue13 = r10.rememberedValue();
                        if (changedInstance3 || rememberedValue13 == obj3) {
                            rememberedValue13 = new OpenSourceKt$$ExternalSyntheticLambda11(8, dialogViewModel, function13);
                            r10.updateRememberedValue(rememberedValue13);
                        }
                        Function1 function14 = (Function1) rememberedValue13;
                        boolean changed4 = r10.changed(function13);
                        Object rememberedValue14 = r10.rememberedValue();
                        if (changed4 || rememberedValue14 == obj3) {
                            rememberedValue14 = new ActionMenuKt$$ExternalSyntheticLambda0(28, function13);
                            r10.updateRememberedValue(rememberedValue14);
                        }
                        Function0 function02 = (Function0) rememberedValue14;
                        boolean changed5 = r10.changed(function13);
                        Object rememberedValue15 = r10.rememberedValue();
                        if (changed5 || rememberedValue15 == obj3) {
                            rememberedValue15 = new ActionMenuKt$$ExternalSyntheticLambda0(29, function13);
                            r10.updateRememberedValue(rememberedValue15);
                        }
                        ArcadeModal2Kt.AlertDialog(title, message, positiveButtonText, negativeButtonText, function14, function02, (Function0) rememberedValue15, r10, 0);
                        r10.end(false);
                    }
                    r10.end(true);
                } else {
                    r10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                PoolsAppletTileKt.PoolsApplet((TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj7, (PoolsAppletTileModel) obj6, (AppletTile.AppletTileAppearance) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolCreateError((String) obj7, (String) obj6, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolDescriptiveInput((Function0) obj7, (Function0) obj6, (Modifier) obj4, (TextFieldState) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolDetailsErrorView((Function0) obj7, (Function0) obj6, (PoolDetailsViewModel.LoadingErrorType) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                Modifier modifier4 = (Modifier) obj4;
                PrepurchaseCardFAQViewModel.FAQSectionData fAQSectionData = (PrepurchaseCardFAQViewModel.FAQSectionData) obj7;
                SnapshotStateSet snapshotStateSet = (SnapshotStateSet) obj6;
                Function1 function15 = (Function1) obj5;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer3;
                if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(modifier4, 1.0f);
                    if (ImageKt.isSystemInDarkTheme(gapComposer2)) {
                        gapComposer2.startReplaceGroup(63462373);
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = colors.semantic.background.subtle;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(63546600);
                        Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = colors2.semantic.background.f1047app;
                        gapComposer2.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxWidth2, j, rectangleShapeKt$RectangleShape$1);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(m177backgroundbw27NRU2, 16.0f, 40.0f, 16.0f, 56.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    String str2 = fAQSectionData.title;
                    if (str2 == null) {
                        gapComposer2.startReplaceGroup(958354678);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(958354679);
                        TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).numeralSmall;
                        Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                        gapComposer2.end(false);
                    }
                    gapComposer2.startReplaceGroup(30922877);
                    Iterator it2 = fAQSectionData.items.iterator();
                    int i5 = 0;
                    while (true) {
                        boolean hasNext = it2.hasNext();
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        if (hasNext) {
                            Object next = it2.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            PrepurchaseCardFAQViewModel.FAQSectionData.FAQItem fAQItem = (PrepurchaseCardFAQViewModel.FAQSectionData.FAQItem) next;
                            if (fAQItem instanceof PrepurchaseCardFAQViewModel.FAQSectionData.FAQItem.Header) {
                                gapComposer2.startReplaceGroup(-1435183743);
                                if (i5 != 0) {
                                    gapComposer2.startReplaceGroup(-1435162353);
                                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1435107576);
                                    gapComposer2.end(false);
                                }
                                String str3 = ((PrepurchaseCardFAQViewModel.FAQSectionData.FAQItem.Header) fAQItem).title;
                                TextStyle textStyle2 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors4 == null) {
                                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors4.semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, textStyle2, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                                gapComposer2.end(false);
                            } else {
                                if (!(fAQItem instanceof PrepurchaseCardFAQViewModel.FAQSectionData.FAQItem.ExpandableItem)) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -1293223025, false);
                                }
                                gapComposer2.startReplaceGroup(-1434811526);
                                boolean contains = snapshotStateSet.contains(fAQItem);
                                Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth3, RecyclerView.DECELERATION_RATE, 16.0f, 1);
                                PrepurchaseCardFAQViewModel.FAQSectionData.FAQItem.ExpandableItem expandableItem = (PrepurchaseCardFAQViewModel.FAQSectionData.FAQItem.ExpandableItem) fAQItem;
                                String str4 = expandableItem.question;
                                String str5 = expandableItem.answer;
                                boolean changedInstance4 = gapComposer2.changedInstance(fAQItem) | gapComposer2.changed(contains);
                                Object rememberedValue16 = gapComposer2.rememberedValue();
                                if (changedInstance4 || rememberedValue16 == obj3) {
                                    rememberedValue16 = new g6$$ExternalSyntheticLambda11(contains, snapshotStateSet, expandableItem, 11);
                                    gapComposer2.updateRememberedValue(rememberedValue16);
                                }
                                LocaleToggleKt.FAQExpandableItem(0, gapComposer2, m300paddingVpY3zN4$default, str4, str5, (Function0) rememberedValue16, contains);
                                gapComposer2.end(false);
                            }
                            i5 = i6;
                        } else {
                            gapComposer2.end(false);
                            String str6 = fAQSectionData.disclosureMarkdownText;
                            if (str6 == null) {
                                gapComposer2.startReplaceGroup(959645859);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(959645860);
                                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                                TextStyle textStyle3 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                                Colors colors5 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors5 == null) {
                                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                long j3 = colors5.semantic.text.subtle;
                                boolean changed6 = gapComposer2.changed(function15);
                                Object rememberedValue17 = gapComposer2.rememberedValue();
                                if (changed6 || rememberedValue17 == obj3) {
                                    rememberedValue17 = new ScoreHomeKt$$ExternalSyntheticLambda8(function15, false, 11);
                                    gapComposer2.updateRememberedValue(rememberedValue17);
                                }
                                LazyDslKt.m304MarkdownTextpCuZGqc(str6, (Function2) rememberedValue17, m302paddingqDBjuR0$default, textStyle3, j3, null, null, null, 0, 0, 5, gapComposer2, 0, 992);
                                gapComposer2.end(false);
                            }
                            gapComposer2.end(true);
                        }
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Function1 function16 = (Function1) obj7;
                Modifier modifier5 = (Modifier) obj4;
                ScrollState scrollState = (ScrollState) obj6;
                PrepurchaseCardFAQViewModel prepurchaseCardFAQViewModel = (PrepurchaseCardFAQViewModel) obj5;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer4;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion2, 1.0f);
                    Colors colors6 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier m177backgroundbw27NRU3 = ImageKt.m177backgroundbw27NRU(fillMaxWidth4, colors6.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf3 = Integer.valueOf(hashCode4);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf3, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    Object rememberedValue18 = gapComposer3.rememberedValue();
                    if (rememberedValue18 == obj3) {
                        rememberedValue18 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer3.updateRememberedValue(rememberedValue18);
                    }
                    MutableState mutableState6 = (MutableState) rememberedValue18;
                    ChromeConfigKt.ChromeConfig(null, null, ((Boolean) mutableState6.getValue()).booleanValue() ? ChromeSystemIconColor.ALWAYS_LIGHT : ChromeSystemIconColor.STANDARD, null, null, null, null, gapComposer3, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed7 = gapComposer3.changed(function16);
                    Object rememberedValue19 = gapComposer3.rememberedValue();
                    if (changed7 || rememberedValue19 == obj3) {
                        rememberedValue19 = new PoolsListViewKt$$ExternalSyntheticLambda3(29, function16);
                        gapComposer3.updateRememberedValue(rememberedValue19);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue19, (Modifier) null, (Function3) null, gapComposer3, 54, 108);
                    Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(ImageKt.verticalScroll$default(OffsetKt.height(modifier5, IntrinsicSize.Max), scrollState, false, 14), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.CenterHorizontally, gapComposer3, 48);
                    int hashCode5 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth5);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                    LocaleToggleKt.OverviewSection(prepurchaseCardFAQViewModel.overviewData, function16, null, gapComposer3, 0);
                    Object rememberedValue20 = gapComposer3.rememberedValue();
                    if (rememberedValue20 == obj3) {
                        rememberedValue20 = new TabToolbarsKt$$ExternalSyntheticLambda10(5, mutableState6);
                        gapComposer3.updateRememberedValue(rememberedValue20);
                    }
                    LocaleToggleKt.FAQSection(prepurchaseCardFAQViewModel.faqSectionData, function16, RulerKt.onVisibilityChanged$default(companion2, 0L, 0.01f, (Function1) rememberedValue20, 5), gapComposer3, MLKEMEngine.KyberPolyBytes);
                    gapComposer3.end(true);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                LocaleToggleKt.LoadableButton((PrepurchaseCashCardPlanningViewModel.LoadableButton) obj7, (Function1) obj6, (ButtonProminence) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ChannelListViewKt.CategoryListHeader((Function1) obj7, (Category$CategoryListHeader$ToggleHeader) obj6, (String) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                return invoke$com$squareup$cash$qrcodes$views$QrAddressScannerViewKt$$ExternalSyntheticLambda4(obj, obj2);
            case 23:
                ((Integer) obj2).getClass();
                ContextCompat$Api26Impl.MessageReactionBar(Updater.updateChangedFlags(1), (Composer) obj, (Modifier) obj4, (List) obj6, (Function0) obj5, (Function1) obj7);
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                SelectPaymentPlanViewKt.SubmitButton((Function0) obj7, (String) obj6, (SelectPaymentPlanViewModel.ButtonState) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(3073));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                SelectPaymentPlanViewKt.SelectPaymentPlanView((SelectPaymentPlanViewModel) obj7, (Function1) obj6, (Modifier) obj4, (ScrollState) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                SavingsScreenHeaderKt.NoGoalHeader((SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader) obj7, (Modifier) obj4, (Shaker) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement = (SavingsScreenViewModel.Content.SavingsScreenElement) obj7;
                Shaker shaker = (Shaker) obj6;
                Function1 function17 = (Function1) obj5;
                Modifier modifier6 = (Modifier) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer5;
                if (gapComposer4.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    SavingsScreenViewKt.TransferButtons((SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons) savingsScreenElement, shaker, function17, modifier6, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                return invoke$com$squareup$cash$savings$views$SavingsScreenViewKt$$ExternalSyntheticLambda1(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                SavingsScreenViewKt.TransferButtons((SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons) obj7, (Shaker) obj6, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PoolGoalMetKt$$ExternalSyntheticLambda0(Modifier modifier, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    public /* synthetic */ PoolGoalMetKt$$ExternalSyntheticLambda0(SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader, Modifier modifier, Shaker shaker, Function1 function1, int i) {
        this.$r8$classId = 26;
        this.f$1 = savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader;
        this.f$0 = modifier;
        this.f$2 = shaker;
        this.f$3 = function1;
    }

    public /* synthetic */ PoolGoalMetKt$$ExternalSyntheticLambda0(SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement, Shaker shaker, Function1 function1, Modifier modifier) {
        this.$r8$classId = 27;
        this.f$1 = savingsScreenElement;
        this.f$2 = shaker;
        this.f$3 = function1;
        this.f$0 = modifier;
    }

    public /* synthetic */ PoolGoalMetKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Modifier modifier, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = modifier;
        this.f$3 = obj3;
    }

    public /* synthetic */ PoolGoalMetKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$0 = modifier;
    }

    public /* synthetic */ PoolGoalMetKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ PoolGoalMetKt$$ExternalSyntheticLambda0(Function1 function1, Modifier modifier, ScrollState scrollState, PrepurchaseCardFAQViewModel prepurchaseCardFAQViewModel) {
        this.$r8$classId = 19;
        this.f$1 = function1;
        this.f$0 = modifier;
        this.f$2 = scrollState;
        this.f$3 = prepurchaseCardFAQViewModel;
    }

    public /* synthetic */ PoolGoalMetKt$$ExternalSyntheticLambda0(Function1 function1, Function0 function0, Modifier modifier, List list, int i) {
        this.$r8$classId = 23;
        this.f$1 = function1;
        this.f$3 = function0;
        this.f$0 = modifier;
        this.f$2 = list;
    }
}
