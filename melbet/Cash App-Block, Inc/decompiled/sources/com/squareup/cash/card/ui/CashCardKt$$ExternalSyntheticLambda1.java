package com.squareup.cash.card.ui;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.unit.Dp;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.UpdatesWindowFlags$Orientation;
import app.cash.broadway.ui.compose.OrientationKt;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaho;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CardStudioExitDialogView;
import com.squareup.cash.card.onboarding.CardStudioExitDialogViewModel;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogView;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogViewModel;
import com.squareup.cash.card.onboarding.CardStudioView;
import com.squareup.cash.card.onboarding.CardStudioViewKt;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt;
import com.squareup.cash.card.onboarding.CardStyleItemViewKt;
import com.squareup.cash.card.onboarding.CardStyleItemViewModel;
import com.squareup.cash.card.onboarding.CardStylePickerViewModel;
import com.squareup.cash.card.onboarding.ConfirmExitDisclosureView;
import com.squareup.cash.card.onboarding.ConfirmExitDisclosureViewModel;
import com.squareup.cash.card.onboarding.DisclosureView;
import com.squareup.cash.card.onboarding.DisclosureViewKt;
import com.squareup.cash.card.onboarding.DisclosureViewModel;
import com.squareup.cash.card.onboarding.ProductDetailsPageViewModel;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.CardScreenBounds;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.card.spendinginsights.viewmodels.RecurringPaymentInfoViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel;
import com.squareup.cash.card.spendinginsights.views.RecurringPaymentInfoSheet;
import com.squareup.cash.cashapplite.viewmodels.LiteBalanceHomeViewModel;
import com.squareup.cash.cashapplite.viewmodels.PasskeySignatureBlockerViewModel;
import com.squareup.cash.cashapplite.views.KycAppletTileKt;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsRowViewModel$BusinessViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.LinkedBusinessDetailsViewModel;
import com.squareup.cash.cashapppay.settings.views.UnlinkResultViewKt;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CaptureCheckFaceKt;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CaptureCheckFaceViewModel;
import com.squareup.cash.checks.VerifyCheckDialogView;
import com.squareup.cash.checks.VerifyCheckDialogViewModel;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.payments.presenters.RecipientMapper;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final /* synthetic */ class CashCardKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ CashCardKt$$ExternalSyntheticLambda1(DisclosureViewModel disclosureViewModel, Function1 function1, ScrollState scrollState) {
        this.$r8$classId = 11;
        this.f$0 = disclosureViewModel;
        this.f$1 = function1;
        this.f$2 = scrollState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x05d3, code lost:
    
        if (r2 == r1) goto L166;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v44 */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i;
        ProductDetailsPageViewModel productDetailsPageViewModel;
        Object obj3;
        boolean z2;
        ?? r4;
        int i2 = this.$r8$classId;
        Object obj4 = Composer.Companion.Empty;
        int i3 = 17;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj5 = this.f$0;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                CashCardKt.BaseCashCard((Modifier) obj5, (CardTheme) obj7, (Function3) obj6, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int i4 = CardStudioExitDialogView.$r8$clinit;
                ((CardStudioExitDialogView) obj5).Content((CardStudioExitDialogViewModel) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                CanvasKt.CardStudioUndoDialog((CardStudioUndoDialogViewModel) obj7, (Function1) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int i5 = CardStudioUndoDialogView.$r8$clinit;
                ((CardStudioUndoDialogView) obj5).Content((CardStudioUndoDialogViewModel) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                CardStudioView cardStudioView = (CardStudioView) obj5;
                CardStudioViewModel.Content content = (CardStudioViewModel.Content) obj7;
                Function1 function1 = (Function1) obj6;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    CardStudioViewKt.CardStudio(OffsetKt.windowInsetsPadding(fillMaxSize, Arrangement$End$1.current(gapComposer).navigationBars), cardStudioView.screenTouchPoints, content, function1, cardStudioView.errorReporter, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ((CardStudioView) obj5).Content((CardStudioViewModel) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                CardStudioViewV2Kt.ThemedCardV2((Modifier) obj5, (CardStudioViewModelV2.Content) obj7, (Flow) obj6, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                CardStyleItemViewKt.CardStyleItem((Modifier) obj5, (CardStyleItemViewModel) obj7, (Function0) obj6, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 8:
                LazyListState lazyListState = (LazyListState) obj5;
                Function1 function12 = (Function1) obj7;
                CardStylePickerViewModel cardStylePickerViewModel = (CardStylePickerViewModel) obj6;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(273695029, new SectionKt$$ExternalSyntheticLambda2(i3, lazyListState, function12, cardStylePickerViewModel), gapComposer2), gapComposer2, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                int i6 = ConfirmExitDisclosureView.$r8$clinit;
                ((ConfirmExitDisclosureView) obj5).Content((ConfirmExitDisclosureViewModel) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                int i7 = DisclosureView.$r8$clinit;
                ((DisclosureView) obj5).Content((DisclosureViewModel) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                DisclosureViewModel disclosureViewModel = (DisclosureViewModel) obj5;
                Function1 function13 = (Function1) obj7;
                ScrollState scrollState = (ScrollState) obj6;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    TransactorKt.LoadableContent(disclosureViewModel, disclosureViewModel.isLoading, SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)), LoadingIndicatorPosition.CENTER, null, null, Expect_jvmKt.rememberComposableLambda(1460577980, new LocalViewFactory$$ExternalSyntheticLambda4(20, function13, scrollState), gapComposer3), gapComposer3, 1575936, 48);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                DisclosureViewKt.Disclosure((DisclosureViewModel) obj7, (Function1) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                CardScreenBounds cardScreenBounds = (CardScreenBounds) obj5;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj7;
                MutableState mutableState = (MutableState) obj6;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    int ordinal = ((ZoomLevel) mutableState.getValue()).ordinal();
                    if (ordinal == 0) {
                        z = true;
                    } else if (ordinal == 1) {
                        z = cardScreenBounds.isCentered;
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        z = false;
                    }
                    if (z) {
                        gapComposer4.startReplaceGroup(623733130);
                        composableLambdaImpl.invoke((Object) cardScreenBounds, mutableState.getValue(), (Object) gapComposer4, (Object) 0);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(623796556);
                        gapComposer4.end(false);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ProductDetailsPageViewModel productDetailsPageViewModel2 = (ProductDetailsPageViewModel) obj5;
                Function1 function14 = (Function1) obj7;
                MutableState mutableState2 = (MutableState) obj6;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                boolean shouldExecute = gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2);
                Applier applier = gapComposer5.applier;
                if (shouldExecute) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        i = 0;
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        i = 0;
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer5, i);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer5, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer5, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    String str = productDetailsPageViewModel2.pageTitle;
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer5.changed(function14);
                    Object rememberedValue = gapComposer5.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        productDetailsPageViewModel = productDetailsPageViewModel2;
                        rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(6, function14);
                        gapComposer5.updateRememberedValue(rememberedValue);
                    } else {
                        productDetailsPageViewModel = productDetailsPageViewModel2;
                    }
                    DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer5, 48, 108);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
                    int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, companion);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer5, composeUiNode$Companion$SetModifier$13, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer5, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer5), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer5, 0);
                    int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, verticalScroll$default);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer5, composeUiNode$Companion$SetModifier$13, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer5, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    float f = ((Dp) mutableState2.getValue()).value;
                    boolean changed2 = gapComposer5.changed(function14);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (!changed2) {
                        obj3 = obj4;
                        break;
                    } else {
                        obj3 = obj4;
                    }
                    rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda1(22, function14);
                    gapComposer5.updateRememberedValue(rememberedValue2);
                    ProductDetailsPageViewModel productDetailsPageViewModel3 = productDetailsPageViewModel;
                    HeroSectionKt.m3444ProductDetailsPageContentjIwJxvA(productDetailsPageViewModel3, null, false, f, (Function1) rememberedValue2, null, gapComposer5, 0, 38);
                    gapComposer5.end(true);
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (rememberedValue3 == obj3) {
                        rememberedValue3 = new CashCardKt$$ExternalSyntheticLambda0(29, mutableState2);
                        gapComposer5.updateRememberedValue(rememberedValue3);
                    }
                    HeroSectionKt.ProductDetailsPageOverlay(productDetailsPageViewModel3, function14, null, (Function1) rememberedValue3, gapComposer5, 3072);
                    gapComposer5.end(true);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                int i8 = RecurringPaymentInfoSheet.$r8$clinit;
                ((RecurringPaymentInfoSheet) obj5).Content((RecurringPaymentInfoViewModel) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                zzaho.SpendingInsightDetail((SpendingInsightDetailViewModel) obj7, (Function1) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ((P2PListView) obj5).Content((SpendingInsightsHomeViewModel) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                RecipientMapper.SpendingInsightsHome((SpendingInsightsHomeViewModel) obj7, (Function1) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                FullScreenActivityViewModel fullScreenActivityViewModel = (FullScreenActivityViewModel) obj5;
                Function1 function15 = (Function1) obj7;
                BorrowUiFactory borrowUiFactory = (BorrowUiFactory) obj6;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    AvatarsKt.FullScreenActivityView(fullScreenActivityViewModel, function15, borrowUiFactory.imageLoader, borrowUiFactory.vibrator, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                KycAppletTileKt.LiteBalanceHomeView((LiteBalanceHomeViewModel) obj7, (Function1) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                KycAppletTileKt.PasskeySignatureBlockerView((PasskeySignatureBlockerViewModel) obj7, (Function1) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                CashAppPaySettingsViewModel cashAppPaySettingsViewModel = (CashAppPaySettingsViewModel) obj5;
                Function1 function16 = (Function1) obj7;
                RealImageLoader realImageLoader = (RealImageLoader) obj6;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                boolean shouldExecute2 = gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2);
                Applier applier2 = gapComposer7.applier;
                if (shouldExecute2) {
                    Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(companion);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors3 = (Colors) gapComposer7.consume(staticProvidableCompositionLocal);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(navigationBarsPadding, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode4 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer7, fillMaxSize3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer7, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer7, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                    if (cashAppPaySettingsViewModel instanceof CashAppPaySettingsViewModel.Loading) {
                        gapComposer7.startReplaceGroup(1488339436);
                        Modifier fillMaxSize4 = SizeKt.fillMaxSize(companion, 1.0f);
                        Colors colors4 = (Colors) gapComposer7.consume(staticProvidableCompositionLocal);
                        if (colors4 == null) {
                            r4 = 0;
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                        } else {
                            r4 = 0;
                            gapComposer7.startReplaceGroup(-1762997739);
                            gapComposer7.end(false);
                        }
                        TransactorKt.LoadingPlaceholder(ImageKt.m177backgroundbw27NRU(fillMaxSize4, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), LoadingIndicatorPosition.CENTER, gapComposer7, 48, r4);
                        gapComposer7.end(r4);
                        z2 = true;
                    } else {
                        if (!(cashAppPaySettingsViewModel instanceof CashAppPaySettingsViewModel.Loaded)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, 602198680, false);
                        }
                        gapComposer7.startReplaceGroup(1488631766);
                        Modifier fillMaxSize5 = SizeKt.fillMaxSize(companion, 1.0f);
                        ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                        int hashCode5 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer7.currentCompositionLocalScope();
                        Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer7, fillMaxSize5);
                        gapComposer7.startReusableNode();
                        if (gapComposer7.inserting) {
                            gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer7.useNode();
                        }
                        Updater.m576setimpl(gapComposer7, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                        Updater.m576setimpl(gapComposer7, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer7, composeUiNode$Companion$SetModifier$17, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$12);
                        Updater.m576setimpl(gapComposer7, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                        String stringResource = Room.stringResource(gapComposer7, R.string.cash_app_pay_settings_title);
                        NavigationType navigationType2 = NavigationType.BACK;
                        boolean changed3 = gapComposer7.changed(function16);
                        Object rememberedValue4 = gapComposer7.rememberedValue();
                        if (changed3 || rememberedValue4 == obj4) {
                            rememberedValue4 = new GrantSheetKt$$ExternalSyntheticLambda4(15, function16);
                            gapComposer7.updateRememberedValue(rememberedValue4);
                        }
                        DBUtil.TitleBarSub(stringResource, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer7, 48, 108);
                        UnlinkResultViewKt.BusinessList(((CashAppPaySettingsViewModel.Loaded) cashAppPaySettingsViewModel).linkedBusinesses, realImageLoader, function16, gapComposer7, 0);
                        z2 = true;
                        gapComposer7.end(true);
                        gapComposer7.end(false);
                    }
                    gapComposer7.end(z2);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                UnlinkResultViewKt.BusinessList((List) obj5, (RealImageLoader) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                RealImageLoader realImageLoader2 = (RealImageLoader) obj5;
                LinkedBusinessDetailsViewModel linkedBusinessDetailsViewModel = (LinkedBusinessDetailsViewModel) obj7;
                Function1 function17 = (Function1) obj6;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2), Expect_jvmKt.rememberComposableLambda(470441656, new CaptureCheckFaceKt$$ExternalSyntheticLambda6(i3, (Object) linkedBusinessDetailsViewModel, (Object) function17), gapComposer8), gapComposer8, 56);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                UnlinkResultViewKt.LinkedBusinessRow((CashAppPaySettingsRowViewModel$BusinessViewModel) obj5, (RealImageLoader) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                CaptureCheckFaceViewModel captureCheckFaceViewModel = (CaptureCheckFaceViewModel) obj5;
                Function1 function18 = (Function1) obj7;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj6;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Modifier fillMaxSize6 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors5 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize6, colors5.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode6 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer9, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer9.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer9, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    if (captureCheckFaceViewModel instanceof CaptureCheckFaceViewModel.Loaded) {
                        gapComposer9.startReplaceGroup(1000997145);
                        UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
                        OrientationKt.Orientation(gapComposer9, 6);
                        gapComposer9.end(false);
                    } else {
                        gapComposer9.startReplaceGroup(1001113426);
                        gapComposer9.end(false);
                    }
                    boolean areEqual = Intrinsics.areEqual(captureCheckFaceViewModel, CaptureCheckFaceViewModel.Loading.INSTANCE);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (areEqual) {
                        gapComposer9.startReplaceGroup(-1491724843);
                        Modifier align = boxScopeInstance.align(SpacerKt.statusBarsPadding(companion), biasAlignment);
                        ((DefaultSizes) gapComposer9.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        ProgressCircularKt.ProgressCircular(0, 0, gapComposer9, SpacerKt.m298padding3ABfNKs(align, 16.0f));
                        gapComposer9.end(false);
                    } else if (Intrinsics.areEqual(captureCheckFaceViewModel, CaptureCheckFaceViewModel.CameraPermissionPermanentlyDenied.INSTANCE)) {
                        gapComposer9.startReplaceGroup(-1491717222);
                        CaptureCheckFaceKt.PermissionDeniedPermanentlyDialog(function18, gapComposer9, 0);
                        gapComposer9.end(false);
                    } else if (captureCheckFaceViewModel instanceof CaptureCheckFaceViewModel.Loaded.ShowMiSnap) {
                        gapComposer9.startReplaceGroup(-1491715064);
                        CaptureCheckFaceKt.ViewPort((CaptureCheckFaceViewModel.Loaded.ShowMiSnap) captureCheckFaceViewModel, function18, gapComposer9, 0);
                        gapComposer9.end(false);
                    } else {
                        if (!(captureCheckFaceViewModel instanceof CaptureCheckFaceViewModel.Loaded.FinalFrame)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer9, -1491725949, false);
                        }
                        gapComposer9.startReplaceGroup(-1491713092);
                        CaptureCheckFaceKt.ByteArrayImage(boxScopeInstance.align(companion, Alignment.Companion.Center), (CaptureCheckFaceViewModel.Loaded.FinalFrame) captureCheckFaceViewModel, realCashVibrator, gapComposer9, 0);
                        gapComposer9.end(false);
                    }
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                CaptureCheckFaceKt.ByteArrayImage((Modifier) obj5, (CaptureCheckFaceViewModel.Loaded.FinalFrame) obj7, (RealCashVibrator) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                int i9 = VerifyCheckDialogView.$r8$clinit;
                ((VerifyCheckDialogView) obj5).Content((VerifyCheckDialogViewModel) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                VisibleKt.ScalableAvatarImage((AvatarImage) obj7, (String) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CashCardKt$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ CashCardKt$$ExternalSyntheticLambda1(int i, int i2, Modifier modifier, Object obj, Object obj2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = modifier;
    }

    public /* synthetic */ CashCardKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
