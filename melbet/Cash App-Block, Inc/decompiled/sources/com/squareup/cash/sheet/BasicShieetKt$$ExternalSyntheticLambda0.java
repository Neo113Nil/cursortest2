package com.squareup.cash.sheet;

import androidx.camera.core.AspectRatio;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.ValueInsets;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.TooltipKt$TooltipBox$3;
import androidx.compose.material3.TooltipKt$animateTooltip$2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.intl.Locale_jvmAndAndroidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.BirthdayViewModel;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CharacterLimitTransformation;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.downloadmanager.android.AndroidDownloadManager$Factory$Impl;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormDetailRowKt$$ExternalSyntheticLambda4;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.moneybot.views.home.MoneyHomeScaffoldSlot;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentEntrypointButtonViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayViewEvent;
import com.squareup.cash.payments.viewmodels.QuickPayViewModel;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4;
import com.squareup.cash.payments.views.composer.SelectRecipientKt$SearchTextField$1$1;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPeekPosition$FixedHeight;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.scrubbing.DateScrubber;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.PrepurchaseCardData;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewModel;
import com.squareup.cash.work.webview.views.WorkWebViewKt;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.uicore.FormInsets;
import com.stripe.android.uicore.IconStyle;
import com.stripe.android.uicore.SectionStyle;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeShapes;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda2;
import com.stripe.android.uicore.StripeTypography;
import com.stripe.android.uicore.image.StripeImageKt$$ExternalSyntheticLambda2;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class BasicShieetKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(RoundedCornerShape roundedCornerShape, MutableInteractionSourceImpl mutableInteractionSourceImpl, FocusRequester focusRequester, TextFieldState textFieldState, String str, Function0 function0, Function1 function1) {
        this.$r8$classId = 13;
        this.f$0 = roundedCornerShape;
        this.f$2 = mutableInteractionSourceImpl;
        this.f$3 = focusRequester;
        this.f$4 = textFieldState;
        this.f$5 = str;
        this.f$1 = function0;
        this.f$6 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ComposableLambdaImpl composableLambdaImpl;
        ConstraintSetForInlineDsl constraintSetForInlineDsl;
        MutableState mutableState;
        boolean z;
        int max;
        boolean z2;
        int i2 = this.$r8$classId;
        int i3 = 13;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = Composer.Companion.Empty;
        Object obj4 = this.f$6;
        Object obj5 = this.f$5;
        Object obj6 = this.f$4;
        Object obj7 = this.f$3;
        Object obj8 = this.f$2;
        Object obj9 = this.f$1;
        Object obj10 = this.f$0;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                BasicShieetKt.BasicShieet((RealSheetState) obj10, (Function0) obj9, (SheetPeekPosition$FixedHeight) obj8, (Modifier) obj7, (AnimatedVisibilityScope) obj6, (SharedTransitionScope) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(1572865));
                return Unit.INSTANCE;
            case 1:
                LazyListState lazyListState = (LazyListState) obj10;
                PaddingValues paddingValues = (PaddingValues) obj9;
                ActivityEmbeddedViewModel activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj8;
                Function1 function1 = (Function1) obj7;
                Function3 function3 = (Function3) obj6;
                Function2 function2 = (Function2) obj5;
                Function3 function32 = (Function3) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changedInstance = gapComposer.changedInstance(activityEmbeddedViewModel) | gapComposer.changed(function1) | gapComposer.changed(function3) | gapComposer.changed((Object) null) | gapComposer.changed((Object) null) | gapComposer.changed(function2) | gapComposer.changed(function32);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == obj3) {
                        rememberedValue = new OverlayKt$$ExternalSyntheticLambda3(activityEmbeddedViewModel, function1, function3, function2, function32, 9);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.LazyColumn(null, lazyListState, paddingValues, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 0, 505);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                BankAccountLinkingViewModel bankAccountLinkingViewModel = (BankAccountLinkingViewModel) obj10;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj9;
                Function1 function12 = (Function1) obj8;
                Shaker shaker = (Shaker) obj7;
                FocusRequester focusRequester = (FocusRequester) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                MutableState mutableState3 = (MutableState) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Strings.LoadableFullScreenContent(bankAccountLinkingViewModel, bankAccountLinkingViewModel.loading, SpacerKt.imePadding(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1))), null, null, Expect_jvmKt.rememberComposableLambda(2011002427, new SsnViewKt$$ExternalSyntheticLambda7(delegatingSoftwareKeyboardController, function12, shaker, focusRequester, mutableState2, mutableState3), gapComposer2), gapComposer2, 196608, 24);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                BirthdayViewModel birthdayViewModel = (BirthdayViewModel) obj10;
                Shaker shaker2 = (Shaker) obj9;
                FocusRequester focusRequester2 = (FocusRequester) obj8;
                Function1 function13 = (Function1) obj7;
                MutableState mutableState4 = (MutableState) obj6;
                DateScrubber dateScrubber = (DateScrubber) obj5;
                MutableState mutableState5 = (MutableState) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        i = 0;
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        i = 0;
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier imePadding = SpacerKt.imePadding(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, i);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, imePadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer3, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                    Countries.PageHeader(birthdayViewModel.title, (Modifier) null, (Function2) null, birthdayViewModel.description, gapComposer3, 0, 6);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (rememberedValue2 == obj3) {
                        rememberedValue2 = new TouchRecorder();
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    TouchRecorder touchRecorder = (TouchRecorder) rememberedValue2;
                    Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(1480318245, new DateInputKt$$ExternalSyntheticLambda1(shaker2, focusRequester2, birthdayViewModel, function13, mutableState4, touchRecorder, dateScrubber, mutableState5), gapComposer3), gapComposer3, 392, 2);
                    SpacerKt.Spacer(gapComposer3, new LayoutWeightElement(1.0f, true));
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(18948302, new ComposeDialogKt$$ExternalSyntheticLambda12(touchRecorder, birthdayViewModel, function13, mutableState4, 16), gapComposer3), gapComposer3, 24576, 15);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ((UiContainer) obj10).StandardScreenContent((SharedTransitionScope) obj5, (NavigationModel.Ready.FullScreenLocation) obj9, (ImmutableList) obj8, (AnimatedContentScopeImpl) obj7, (CashComposeInsets) obj6, (SaveableStateHolder) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                UiContainer uiContainer = (UiContainer) obj10;
                NavigationModel.Ready.FullScreenLocation fullScreenLocation = (NavigationModel.Ready.FullScreenLocation) obj9;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj8;
                SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj5;
                SaveableStateHolder saveableStateHolder = (SaveableStateHolder) obj7;
                NavigationModel.Ready.Swipe swipe = (NavigationModel.Ready.Swipe) obj6;
                PagerState pagerState = (PagerState) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    UiContainerKt.ScreenContent(uiContainer.broadway, fullScreenLocation, animatedContentScopeImpl, sharedTransitionScope, saveableStateHolder, false, uiContainer.fullScreenBackPressedDispatcher, uiContainer.onLocationReceived, uiContainer.onLocationRemoved, uiContainer.containerErrorReporter, uiContainer.leakDetector, uiContainer.fullScreenBackListener, uiContainer.eventListeners, uiContainer.parentLifecycle, swipe.pages.get(((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue()) != NavigationModel.Ready.Swipe.Page.MainTabs, null, gapComposer4, 0, 0, 32768);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ArcadeModal2Kt.AlertDialog((String) obj10, (String) obj8, (String) obj7, (String) obj6, (Function1) obj5, (Function0) obj9, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AddFavoritesViewKt.FavoritesList((Modifier) obj7, (Function1) obj10, (Function1) obj8, (Function0) obj9, (Function0) obj6, (String) obj5, (List) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                String str = (String) obj10;
                BlockerAction blockerAction = (BlockerAction) obj9;
                ListUnorderedState listUnorderedState = (ListUnorderedState) obj8;
                String str2 = (String) obj7;
                Function1 function14 = (Function1) obj6;
                String str3 = (String) obj5;
                Function2 function22 = (Function2) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i4 = 1;
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (!gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    gapComposer5.skipToGroupEnd();
                } else if (str == null && blockerAction == null) {
                    gapComposer5.startReplaceGroup(848688772);
                    ListUnorderedKt.ListUnordered((Modifier) null, listUnorderedState, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-50028622, new PoolToastKt$$ExternalSyntheticLambda0(i4, (Serializable) str3, (Object) function22, (Object) str2), gapComposer5), gapComposer5, 196608, 29);
                    gapComposer5.end(false);
                } else {
                    int i5 = 0;
                    gapComposer5.startReplaceGroup(849110217);
                    if (str == null) {
                        gapComposer5.startReplaceGroup(849211896);
                        gapComposer5.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer5.startReplaceGroup(849211897);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-719318241, new ArcadeFormDetailRowKt$$ExternalSyntheticLambda4(i5, str, function22), gapComposer5);
                        gapComposer5.end(false);
                        composableLambdaImpl = rememberComposableLambda;
                    }
                    CellDefaultAccessory.Label label = blockerAction != null ? new CellDefaultAccessory.Label(str2, 2) : new CellDefaultAccessory.Label(str2, 0);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(830520149, new ArcadeFormDetailRowKt$$ExternalSyntheticLambda4(1, str3, function22), gapComposer5);
                    boolean changedInstance2 = gapComposer5.changedInstance(blockerAction) | gapComposer5.changed(function14);
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == obj3) {
                        rememberedValue3 = new GrantSheetKt$$ExternalSyntheticLambda11(blockerAction, function14);
                        gapComposer5.updateRememberedValue(rememberedValue3);
                    }
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda2, null, (Function0) rememberedValue3, false, false, composableLambdaImpl, null, 0L, label, null, gapComposer5, 6, 1466);
                    gapComposer5.end(false);
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                AspectRatio.ContactInput((Modifier) obj7, (Function1) obj10, (Function1) obj8, (Function0) obj9, (String) obj6, (SearchBarKeyboardState) obj5, (String) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                Function2 function23 = (Function2) obj10;
                PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj8;
                LazyListState lazyListState2 = (LazyListState) obj7;
                Function1 function15 = (Function1) obj6;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj5;
                SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
                Constraints constraints = (Constraints) obj2;
                subcomposeMeasureScope.getClass();
                Placeable mo833measureBRTryo0 = ((Measurable) CollectionsKt.single(subcomposeMeasureScope.subcompose(MoneyHomeScaffoldSlot.TitleBar, new ComposableLambdaImpl(new OverlaysKt$$ExternalSyntheticLambda1((ComposableLambdaImpl) obj4, 19), true, -1205373993)))).mo833measureBRTryo0(constraints.value);
                Measurable measurable = (Measurable) CollectionsKt.single(subcomposeMeasureScope.subcompose(MoneyHomeScaffoldSlot.Composer, new ComposableLambdaImpl(new OverlaysKt$$ExternalSyntheticLambda1((ComposableLambdaImpl) obj9, 20), true, 377827292)));
                long j = constraints.value;
                Placeable mo833measureBRTryo02 = measurable.mo833measureBRTryo0(j);
                int mo230roundToPx0680j_4 = subcomposeMeasureScope.mo230roundToPx0680j_4(62.0f) + mo833measureBRTryo02.height;
                Placeable mo833measureBRTryo03 = function23 != null ? ((Measurable) CollectionsKt.single(subcomposeMeasureScope.subcompose(MoneyHomeScaffoldSlot.ComposerBackground, new ComposableLambdaImpl(new ToastKt$$ExternalSyntheticLambda11(20, function23), true, 974961659)))).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(constraints.value, 0, 0, mo230roundToPx0680j_4, mo230roundToPx0680j_4, 3)) : null;
                Placeable mo833measureBRTryo04 = ((Measurable) CollectionsKt.single(subcomposeMeasureScope.subcompose(MoneyHomeScaffoldSlot.Content, new ComposableLambdaImpl(new BasicShieetKt$$ExternalSyntheticLambda0(subcomposeMeasureScope, mo833measureBRTryo0, mo833measureBRTryo02, paddingValuesImpl, lazyListState2, function15, boxWithConstraintsScopeImpl, 11), true, 116332745)))).mo833measureBRTryo0(j);
                return MeasureScope.layout$default(subcomposeMeasureScope, mo833measureBRTryo04.width, mo833measureBRTryo04.height, new BankingConfigQueries$$ExternalSyntheticLambda0(mo833measureBRTryo04, mo833measureBRTryo0, mo833measureBRTryo03, mo833measureBRTryo02, 23));
            case 11:
                SubcomposeMeasureScope subcomposeMeasureScope2 = (SubcomposeMeasureScope) obj10;
                Placeable placeable = (Placeable) obj9;
                Placeable placeable2 = (Placeable) obj8;
                PaddingValuesImpl paddingValuesImpl2 = (PaddingValuesImpl) obj7;
                LazyListState lazyListState3 = (LazyListState) obj6;
                Function1 function16 = (Function1) obj5;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl2 = (BoxWithConstraintsScopeImpl) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    OffsetKt.BoxWithConstraints(SizeKt.fillMaxSize(companion, 1.0f), null, false, Expect_jvmKt.rememberComposableLambda(-162536929, new StripeImageKt$$ExternalSyntheticLambda2(subcomposeMeasureScope2, placeable, placeable2, paddingValuesImpl2, lazyListState3, function16, boxWithConstraintsScopeImpl2, 3), gapComposer6), gapComposer6, 3078, 6);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                final QuickPayViewModel.Ready ready = (QuickPayViewModel.Ready) obj10;
                final Function1 function17 = (Function1) obj9;
                final RealCashVibrator realCashVibrator = (RealCashVibrator) obj8;
                final TouchRecorder touchRecorder2 = (TouchRecorder) obj7;
                final MutableState mutableState6 = (MutableState) obj6;
                final DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj5;
                final RealImageLoader realImageLoader = (RealImageLoader) obj4;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(function0);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors3 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    gapComposer7.startReplaceGroup(-1003410150);
                    gapComposer7.startReplaceGroup(212064437);
                    gapComposer7.end(false);
                    Density density = (Density) gapComposer7.consume(CompositionLocalsKt.LocalDensity);
                    Object rememberedValue4 = gapComposer7.rememberedValue();
                    if (rememberedValue4 == obj3) {
                        rememberedValue4 = new Measurer2(density);
                        gapComposer7.updateRememberedValue(rememberedValue4);
                    }
                    Measurer2 measurer2 = (Measurer2) rememberedValue4;
                    Object rememberedValue5 = gapComposer7.rememberedValue();
                    if (rememberedValue5 == obj3) {
                        rememberedValue5 = new ConstraintLayoutScope();
                        gapComposer7.updateRememberedValue(rememberedValue5);
                    }
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue5;
                    Object rememberedValue6 = gapComposer7.rememberedValue();
                    if (rememberedValue6 == obj3) {
                        rememberedValue6 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer7.updateRememberedValue(rememberedValue6);
                    }
                    MutableState mutableState7 = (MutableState) rememberedValue6;
                    Object rememberedValue7 = gapComposer7.rememberedValue();
                    if (rememberedValue7 == obj3) {
                        rememberedValue7 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                        gapComposer7.updateRememberedValue(rememberedValue7);
                    }
                    ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue7;
                    Object rememberedValue8 = gapComposer7.rememberedValue();
                    if (rememberedValue8 == obj3) {
                        Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Unit.INSTANCE, NeverEqualPolicy.INSTANCE);
                        gapComposer7.updateRememberedValue(parcelableSnapshotMutableState);
                        rememberedValue8 = parcelableSnapshotMutableState;
                    }
                    final MutableState mutableState8 = (MutableState) rememberedValue8;
                    boolean changedInstance3 = gapComposer7.changedInstance(measurer2) | gapComposer7.changed(EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    Object rememberedValue9 = gapComposer7.rememberedValue();
                    if (changedInstance3 || rememberedValue9 == obj3) {
                        rememberedValue9 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2(mutableState8, measurer2, constraintSetForInlineDsl2, mutableState7, 0);
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        mutableState = mutableState7;
                        gapComposer7.updateRememberedValue(rememberedValue9);
                    } else {
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        mutableState = mutableState7;
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue9;
                    Object rememberedValue10 = gapComposer7.rememberedValue();
                    if (rememberedValue10 == obj3) {
                        rememberedValue10 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3(mutableState, constraintSetForInlineDsl, 0);
                        gapComposer7.updateRememberedValue(rememberedValue10);
                    }
                    final Function0 function02 = (Function0) rememberedValue10;
                    boolean changedInstance4 = gapComposer7.changedInstance(measurer2);
                    Object rememberedValue11 = gapComposer7.rememberedValue();
                    if (changedInstance4 || rememberedValue11 == obj3) {
                        z = false;
                        rememberedValue11 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4(measurer2, 0);
                        gapComposer7.updateRememberedValue(rememberedValue11);
                    } else {
                        z = false;
                    }
                    RulerKt.MultiMeasureLayout(SemanticsModifierKt.semantics(systemBarsPadding, z, (Function1) rememberedValue11), Expect_jvmKt.rememberComposableLambda(1200550679, new Function2() { // from class: com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj11, Object obj12) {
                            QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$5 quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$5;
                            TextStyle textStyle;
                            Composer composer8 = (Composer) obj11;
                            if ((((Number) obj12).intValue() & 3) == 2) {
                                GapComposer gapComposer8 = (GapComposer) composer8;
                                if (gapComposer8.getSkipping()) {
                                    gapComposer8.skipToGroupEnd();
                                    return Unit.INSTANCE;
                                }
                            }
                            MutableState.this.setValue(Unit.INSTANCE);
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            constraintLayoutScope2.getClass();
                            constraintLayoutScope2.reset();
                            GapComposer gapComposer9 = (GapComposer) composer8;
                            gapComposer9.startReplaceGroup(-519658700);
                            Applier applier = gapComposer9.applier;
                            QuickPayViewModel.Ready ready2 = ready;
                            final boolean z3 = ready2.isAmountError;
                            PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel = ready2.personalizePaymentButtonState;
                            String str4 = ready2.note;
                            boolean changed = gapComposer9.changed(str4);
                            Object rememberedValue12 = gapComposer9.rememberedValue();
                            Object obj13 = Composer.Companion.Empty;
                            if (changed || rememberedValue12 == obj13) {
                                rememberedValue12 = Updater.mutableStateOf$default(str4);
                                gapComposer9.updateRememberedValue(rememberedValue12);
                            }
                            MutableState mutableState9 = (MutableState) rememberedValue12;
                            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(ready2.currencyCode, null, false, 0, 14);
                            String str5 = ready2.rawAmount;
                            Function1 function18 = function17;
                            boolean changed2 = gapComposer9.changed(function18);
                            RealCashVibrator realCashVibrator2 = realCashVibrator;
                            boolean changedInstance5 = changed2 | gapComposer9.changedInstance(realCashVibrator2);
                            Object rememberedValue13 = gapComposer9.rememberedValue();
                            if (changedInstance5 || rememberedValue13 == obj13) {
                                rememberedValue13 = new VerifyCheckDepositPresenter$models$3$2(26, function18, realCashVibrator2);
                                gapComposer9.updateRememberedValue(rememberedValue13);
                            }
                            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, str5, (Function1) rememberedValue13, gapComposer9, 0);
                            boolean changed3 = gapComposer9.changed(rememberAmountDisplayState);
                            Object rememberedValue14 = gapComposer9.rememberedValue();
                            if (changed3 || rememberedValue14 == obj13) {
                                rememberedValue14 = new AmountDisplayKeypadListener(rememberAmountDisplayState);
                                gapComposer9.updateRememberedValue(rememberedValue14);
                            }
                            AmountDisplayKeypadListener amountDisplayKeypadListener = (AmountDisplayKeypadListener) rememberedValue14;
                            ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) constraintLayoutScope2.createRefs().mClientFragmentManager;
                            ConstrainedLayoutReference createRef = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef2 = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef3 = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef4 = constraintLayoutScope3.createRef();
                            final FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer9.consume(CompositionLocalsKt.LocalFocusManager);
                            Object rememberedValue15 = gapComposer9.rememberedValue();
                            if (rememberedValue15 == obj13) {
                                rememberedValue15 = QuickPayViewKt$QuickPay$1$1$1$1$1.INSTANCE;
                                gapComposer9.updateRememberedValue(rememberedValue15);
                            }
                            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                            Modifier constrainAs = ConstraintLayoutScope.constrainAs(companion2, createRef, (Function1) rememberedValue15);
                            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer9, 0);
                            int hashCode3 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer9.currentCompositionLocalScope();
                            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer9, constrainAs);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer9.startReusableNode();
                            if (gapComposer9.inserting) {
                                gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer9.useNode();
                            }
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                            Updater.m576setimpl(gapComposer9, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                            Updater.m576setimpl(gapComposer9, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                            Integer valueOf = Integer.valueOf(hashCode3);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                            Updater.m576setimpl(gapComposer9, valueOf, composeUiNode$Companion$SetModifier$13);
                            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                            Updater.m575reconcileimpl(gapComposer9, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                            Updater.m576setimpl(gapComposer9, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                            QuickPayViewKt.Toolbar(ready2.toolbarWithAvatarViewModel, ready2.isBusinessIconEnabled, function18, gapComposer9, 0);
                            ModalKt.HorizontalDivider(6, 0, gapComposer9, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion2, 16.0f, 16.0f);
                            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer9, 48);
                            int hashCode4 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer9.currentCompositionLocalScope();
                            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer9, m299paddingVpY3zN4);
                            gapComposer9.startReusableNode();
                            if (gapComposer9.inserting) {
                                gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer9.useNode();
                            }
                            Updater.m576setimpl(gapComposer9, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer9, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer9, composeUiNode$Companion$SetModifier$13, gapComposer9, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer9, materializeModifier4, composeUiNode$Companion$SetModifier$14, 1.0f, true);
                            String str6 = (String) mutableState9.getValue();
                            String str7 = ready2.noteHint;
                            Versioned versioned = ready2.shouldRequestNoteFocus;
                            boolean changed4 = gapComposer9.changed(mutableState9) | gapComposer9.changed(function18);
                            Object rememberedValue16 = gapComposer9.rememberedValue();
                            if (changed4 || rememberedValue16 == obj13) {
                                rememberedValue16 = new VerifyCheckDepositPresenter$models$3$2(24, function18, mutableState9);
                                gapComposer9.updateRememberedValue(rememberedValue16);
                            }
                            QuickPayViewKt.NoteInputView(m, str6, str7, 0, false, (Function1) rememberedValue16, versioned, gapComposer9, 0, 24);
                            GapComposer gapComposer10 = gapComposer9;
                            if (personalizePaymentEntrypointButtonViewModel.show) {
                                gapComposer10.startReplaceGroup(-492238266);
                                quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$5 = this;
                                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController3 = delegatingSoftwareKeyboardController2;
                                ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1043979774, new TooltipKt$TooltipBox$3(6, delegatingSoftwareKeyboardController3, function18, ready2), gapComposer10);
                                boolean z4 = personalizePaymentEntrypointButtonViewModel.showTooltip;
                                MutableState mutableState10 = mutableState6;
                                boolean changed5 = gapComposer10.changed(mutableState10);
                                Object rememberedValue17 = gapComposer10.rememberedValue();
                                if (changed5 || rememberedValue17 == obj13) {
                                    rememberedValue17 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(0, mutableState10);
                                    gapComposer10.updateRememberedValue(rememberedValue17);
                                }
                                AlphaKt.Tooltip(null, rememberComposableLambda3, z4, (Function0) rememberedValue17, Expect_jvmKt.rememberComposableLambda(-873539451, new ButtonKt$Button$2.AnonymousClass1(16, delegatingSoftwareKeyboardController3, function18), gapComposer10), gapComposer10, 24624);
                                gapComposer10.end(false);
                            } else {
                                quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$5 = this;
                                gapComposer10.startReplaceGroup(-491185010);
                                gapComposer10.end(false);
                            }
                            gapComposer10.end(true);
                            ModalKt.HorizontalDivider(6, 0, gapComposer10, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = ready2.instrumentSelectionRowViewModel;
                            if (instrumentSelectionRowViewModel == null) {
                                gapComposer10.startReplaceGroup(268316942);
                                gapComposer10.end(false);
                            } else {
                                gapComposer10.startReplaceGroup(268316943);
                                boolean changed6 = gapComposer10.changed(function18);
                                Object rememberedValue18 = gapComposer10.rememberedValue();
                                if (changed6 || rememberedValue18 == obj13) {
                                    rememberedValue18 = new QuickPayViewKt$QuickPay$1$1$1$2$2$1$1(0, function18);
                                    gapComposer10.updateRememberedValue(rememberedValue18);
                                }
                                InstrumentAvatarUtilsKt.InstrumentSelectionRow(instrumentSelectionRowViewModel, (Function0) rememberedValue18, realImageLoader, null, gapComposer10, 0);
                                gapComposer10 = gapComposer10;
                                ModalKt.HorizontalDivider(6, 0, gapComposer10, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                                gapComposer10.end(false);
                            }
                            gapComposer10.end(true);
                            boolean changed7 = gapComposer10.changed(createRef) | gapComposer10.changed(createRef3);
                            Object rememberedValue19 = gapComposer10.rememberedValue();
                            if (changed7 || rememberedValue19 == obj13) {
                                rememberedValue19 = new QuickPayViewKt$QuickPay$1$1$1$3$1(createRef, createRef3, 0);
                                gapComposer10.updateRememberedValue(rememberedValue19);
                            }
                            GapComposer gapComposer11 = gapComposer10;
                            ConnectionPoolKt.m1177AmountDisplaykNX22eY(rememberAmountDisplayState, ConstraintLayoutScope.constrainAs(companion2, createRef2, (Function1) rememberedValue19), Strings.getColors(gapComposer10).semantic.text.prominent, 0L, 0, 0, gapComposer11, 0, 56);
                            boolean changed8 = gapComposer11.changed(createRef4);
                            Object rememberedValue20 = gapComposer11.rememberedValue();
                            if (changed8 || rememberedValue20 == obj13) {
                                rememberedValue20 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef4, 0);
                                gapComposer11.updateRememberedValue(rememberedValue20);
                            }
                            Modifier constrainAs2 = ConstraintLayoutScope.constrainAs(companion2, createRef3, (Function1) rememberedValue20);
                            boolean changedInstance6 = gapComposer11.changedInstance(amountDisplayKeypadListener);
                            Object rememberedValue21 = gapComposer11.rememberedValue();
                            if (changedInstance6 || rememberedValue21 == obj13) {
                                rememberedValue21 = new ConvertFromJavaKt$$Lambda$4(amountDisplayKeypadListener, 6);
                                gapComposer11.updateRememberedValue(rememberedValue21);
                            }
                            Function0 function03 = (Function0) rememberedValue21;
                            boolean changedInstance7 = gapComposer11.changedInstance(focusOwnerImpl) | gapComposer11.changedInstance(amountDisplayKeypadListener);
                            Object rememberedValue22 = gapComposer11.rememberedValue();
                            if (changedInstance7 || rememberedValue22 == obj13) {
                                rememberedValue22 = new VerifyCheckDepositPresenter$models$3$2(25, focusOwnerImpl, amountDisplayKeypadListener);
                                gapComposer11.updateRememberedValue(rememberedValue22);
                            }
                            KeypadViewModel keypadViewModel = new KeypadViewModel(null, false, function03, (Function1) rememberedValue22, 3);
                            if (((Density) gapComposer11.consume(CompositionLocalsKt.LocalDensity)).getFontScale() > 1.0f) {
                                gapComposer11.startReplaceGroup(-515151301);
                                textStyle = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer11).keypadNumbers, 0L, Room.getSp(16), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
                                gapComposer11.end(false);
                            } else {
                                gapComposer11.startReplaceGroup(-515057774);
                                textStyle = Strings.getTypography(gapComposer11).keypadNumbers;
                                gapComposer11.end(false);
                            }
                            RelationUtil.m1189KeypadViewww6aTOc(constrainAs2, keypadViewModel, textStyle, Strings.getColors(gapComposer11).semantic.text.standard, gapComposer11, 0, 0);
                            Object rememberedValue23 = gapComposer11.rememberedValue();
                            if (rememberedValue23 == obj13) {
                                rememberedValue23 = QuickPayViewKt$QuickPay$1$1$1$1$1.INSTANCE$1;
                                gapComposer11.updateRememberedValue(rememberedValue23);
                            }
                            Modifier constrainAs3 = ConstraintLayoutScope.constrainAs(companion2, createRef4, (Function1) rememberedValue23);
                            final Function1 function19 = function17;
                            final TouchRecorder touchRecorder3 = touchRecorder2;
                            final QuickPayViewModel.Ready ready3 = ready;
                            final RealCashVibrator realCashVibrator3 = realCashVibrator;
                            Strings.TouchRecordingLayout(touchRecorder2, constrainAs3, Expect_jvmKt.rememberComposableLambda(-74494333, new Function2() { // from class: com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj14, Object obj15) {
                                    Composer composer9 = (Composer) obj14;
                                    int intValue8 = ((Number) obj15).intValue();
                                    GapComposer gapComposer12 = (GapComposer) composer9;
                                    if (gapComposer12.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                                        ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                        QuickPayViewModel.Ready ready4 = ready3;
                                        ready4.getClass();
                                        boolean changedInstance8 = gapComposer12.changedInstance(focusOwnerImpl) | gapComposer12.changedInstance(ready4) | gapComposer12.changed(z3) | gapComposer12.changedInstance(realCashVibrator3) | gapComposer12.changed(function19) | gapComposer12.changedInstance(touchRecorder3);
                                        Object rememberedValue24 = gapComposer12.rememberedValue();
                                        if (changedInstance8 || rememberedValue24 == Composer.Companion.Empty) {
                                            final FocusOwnerImpl focusOwnerImpl2 = focusOwnerImpl;
                                            final QuickPayViewModel.Ready ready5 = ready3;
                                            final TouchRecorder touchRecorder4 = touchRecorder3;
                                            final RealCashVibrator realCashVibrator4 = realCashVibrator3;
                                            final Function1 function110 = function19;
                                            final boolean z5 = z3;
                                            Function0 function04 = new Function0() { // from class: com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$8$1$1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    FocusOwnerImpl.this.clearFocus(false);
                                                    ready5.getClass();
                                                    if (z5) {
                                                        RealCashVibrator realCashVibrator5 = realCashVibrator4;
                                                        if (realCashVibrator5 != null) {
                                                            realCashVibrator5.error();
                                                        }
                                                    } else {
                                                        function110.invoke(new QuickPayViewEvent.PrimaryButtonClick(CollectionsKt.toList(touchRecorder4.lastGesture)));
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer12.updateRememberedValue(function04);
                                            rememberedValue24 = function04;
                                        }
                                        coil3.size.SizeKt.Button((Function0) rememberedValue24, fillMaxWidth, buttonProminence, false, true, null, Expect_jvmKt.rememberComposableLambda(413328310, new TooltipKt$animateTooltip$2(ready4, 7), gapComposer12), gapComposer12, 1573296, 40);
                                    } else {
                                        gapComposer12.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer11), gapComposer11, 392, 0);
                            gapComposer11.end(false);
                            return Unit.INSTANCE;
                        }
                    }, gapComposer7), measurePolicy, gapComposer7, 48);
                    gapComposer7.end(z);
                    if (((Boolean) mutableState6.getValue()).booleanValue()) {
                        gapComposer7.startReplaceGroup(865520099);
                        AlphaKt.Alpha(SizeKt.fillMaxSize(companion, 1.0f), gapComposer7, 6);
                        gapComposer7.end(z);
                    } else {
                        gapComposer7.startReplaceGroup(865575837);
                        gapComposer7.end(z);
                    }
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj10;
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj8;
                FocusRequester focusRequester3 = (FocusRequester) obj7;
                TextFieldState textFieldState = (TextFieldState) obj6;
                String str4 = (String) obj5;
                Function0 function03 = (Function0) obj9;
                Function1 function18 = (Function1) obj4;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    BasicTextFieldKt.BasicTextField(textFieldState, TestTagKt.testTag(FocusTraversalKt.focusRequester(IndicationKt.indication(ClipKt.clip(ImageKt.m177backgroundbw27NRU(SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, 1), 1.0f), 36.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getColors(gapComposer8).component.searchField.background.f214default, roundedCornerShape), roundedCornerShape), mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer8, 0, 15)), focusRequester3), "select_recipient_search_bar"), false, false, new CharacterLimitTransformation(500, null), TextStyle.m994copyp1EtxEg$default(Strings.getCurrentTextStyle(gapComposer8), Strings.getCurrentTextColor(gapComposer8), 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), new KeyboardOptions(0, (Boolean) null, 0, 3, (Boolean) null, 119), null, TextFieldLineLimits.SingleLine.INSTANCE, null, new SolidColor(Strings.getColors(gapComposer8).component.input.cursor), null, new SelectRecipientKt$SearchTextField$1$1(str4, textFieldState, function03, function18), null, gapComposer8, 102260736, 0, 22156);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                Locale_jvmAndAndroidKt.CoreFlowBasicShieet((CoreFlowRealSheetState) obj10, (Function0) obj9, (CoreFlowSheetPeekPosition$FixedHeight) obj8, (Modifier) obj7, (AnimatedVisibilityScope) obj6, (SharedTransitionScope) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(1572865));
                return Unit.INSTANCE;
            case 15:
                Function3 function33 = (Function3) obj10;
                WindowInsets windowInsets = (WindowInsets) obj9;
                BasicShieetScope basicShieetScope = (BasicShieetScope) obj8;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj7;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj6;
                AnimatedCornerShape animatedCornerShape = (AnimatedCornerShape) obj5;
                SubcomposeMeasureScope subcomposeMeasureScope3 = (SubcomposeMeasureScope) obj;
                subcomposeMeasureScope3.getClass();
                Measurable measurable2 = (Measurable) CollectionsKt.single(subcomposeMeasureScope3.subcompose("handle", new ComposableLambdaImpl(new StripeThemeKt$$ExternalSyntheticLambda2((ComposableLambdaImpl) obj4, 3), true, -1640276754)));
                long j2 = ((Constraints) obj2).value;
                Placeable mo833measureBRTryo05 = measurable2.mo833measureBRTryo0(j2);
                Placeable mo833measureBRTryo06 = function33 != null ? ((Measurable) CollectionsKt.single(subcomposeMeasureScope3.subcompose("collapsed", new ComposableLambdaImpl(new StripeThemeKt$$ExternalSyntheticLambda2(composableLambdaImpl2, 4), true, -1814428104)))).mo833measureBRTryo0(j2) : null;
                int top = windowInsets.getTop(subcomposeMeasureScope3);
                int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j2);
                RealSheetState realSheetState = basicShieetScope.state;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = realSheetState.contentHeightPx$delegate;
                Integer num = (Integer) parcelableSnapshotMutableState2.getValue();
                int roundToInt = (num == null ? realSheetState.getPeekPosition() == null : num.intValue() < m1024getMaxHeightimpl - top) ? 0 : MathKt__MathJVMKt.roundToInt(realSheetState.getExpandProgress() * top);
                int i6 = mo833measureBRTryo05.height;
                if (i6 >= roundToInt) {
                    roundToInt = i6;
                }
                Placeable mo833measureBRTryo07 = ((Measurable) CollectionsKt.single(subcomposeMeasureScope3.subcompose("content", new ComposableLambdaImpl(new BasicShieetScope$$ExternalSyntheticLambda16(composableLambdaImpl3, SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, subcomposeMeasureScope3.mo233toDpu2uoSUM(roundToInt), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 0), true, -301974593)))).mo833measureBRTryo0(j2);
                int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j2);
                if (Constraints.m1022getHasFixedHeightimpl(j2)) {
                    max = Constraints.m1024getMaxHeightimpl(j2);
                } else {
                    max = Math.max(mo833measureBRTryo07.height, Math.max(mo833measureBRTryo05.height, mo833measureBRTryo06 != null ? mo833measureBRTryo06.height : 0));
                }
                long j3 = (m1025getMaxWidthimpl << 32) | (max & BodyPartID.bodyIdMax);
                if (!subcomposeMeasureScope3.isLookingAhead()) {
                    if (!Constraints.m1020getHasBoundedHeightimpl(j2)) {
                        a$$ExternalSyntheticBUOutline0.m$1("SheetContainer() can't have an infinite max height");
                        return null;
                    }
                    int i7 = mo833measureBRTryo07.height;
                    if (i7 > m1024getMaxHeightimpl) {
                        i7 = m1024getMaxHeightimpl;
                    }
                    parcelableSnapshotMutableState2.setValue(Integer.valueOf(i7));
                    realSheetState.collapsedHeightPx$delegate.setValue(mo833measureBRTryo06 != null ? Integer.valueOf(mo833measureBRTryo06.height) : null);
                    realSheetState.viewportHeightPx$delegate.setValue(Integer.valueOf(m1024getMaxHeightimpl));
                }
                return MeasureScope.layout$default(subcomposeMeasureScope3, (int) (j3 >> 32), (int) (j3 & BodyPartID.bodyIdMax), new SliderKt$$ExternalSyntheticLambda3(basicShieetScope, mo833measureBRTryo07, mo833measureBRTryo05, mo833measureBRTryo06, animatedCornerShape, subcomposeMeasureScope3, 10));
            case 16:
                String str5 = (String) obj10;
                Function1 function19 = (Function1) obj8;
                FocusRequester focusRequester4 = (FocusRequester) obj7;
                Function1 function110 = (Function1) obj6;
                Function0 function04 = (Function0) obj9;
                String str6 = (String) obj5;
                Function2 function24 = (Function2) obj4;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 20.0f, RecyclerView.DECELERATION_RATE, 11);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer9, 48);
                    int hashCode3 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer9, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer9.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    KeypadKt.m3644MooncakeSearchTextFieldj30j4ZQ(str5, function19, FocusTraversalKt.focusRequester(Request$Priority$EnumUnboxingLocalUtility.m(gapComposer9, materializeModifier3, ComposeUiNode.Companion.SetModifier, 1.0f, true), focusRequester4), function110, function04, null, 0L, false, str6, gapComposer9, 0);
                    if (function24 == null) {
                        gapComposer9.startReplaceGroup(-923947779);
                        z2 = false;
                    } else {
                        z2 = false;
                        gapComposer9.startReplaceGroup(-999636092);
                        function24.invoke(gapComposer9, 0);
                    }
                    gapComposer9.end(z2);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                MessageFileKt.MessageActivity((ChatContentViewModel.MessageViewModel) obj10, (SupportActivityItemLoader) obj9, (RealImageLoader) obj8, (Function1) obj6, (Modifier) obj7, (Function1) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                MessageFileKt.MessageImage((ChatContentViewModel.MessageViewModel) obj10, (Function1) obj8, (Function1) obj6, (Function0) obj9, (Modifier) obj7, (Function1) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                UtilsKt.PrepurchaseCardButtons((CardSchemeViewModel.Module.HeroCard) obj10, (Modifier) obj7, (CardSchemeViewModel.Module.Accessory.Button) obj8, (CardSchemeViewModel.Module.Accessory.Button) obj6, (PrepurchaseCardData.Toggle) obj5, (Function0) obj9, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                WorkWebViewModel workWebViewModel = (WorkWebViewModel) obj10;
                Function1 function111 = (Function1) obj9;
                WebViewProvider webViewProvider = (WebViewProvider) obj8;
                String str7 = (String) obj7;
                AndroidDownloadManager$Factory$Impl androidDownloadManager$Factory$Impl = (AndroidDownloadManager$Factory$Impl) obj6;
                MutableState mutableState9 = (MutableState) obj5;
                MutableState mutableState10 = (MutableState) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (!gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    gapComposer10.skipToGroupEnd();
                } else if (Intrinsics.areEqual(workWebViewModel, WorkWebViewModel.OtkInitializing.INSTANCE)) {
                    gapComposer10.startReplaceGroup(2066905570);
                    WorkWebViewKt.WorkWebViewLoading(gapComposer10, 0);
                    gapComposer10.end(false);
                } else if (workWebViewModel instanceof WorkWebViewModel.LoadUrl) {
                    gapComposer10.startReplaceGroup(2066907537);
                    String str8 = ((WorkWebViewModel.LoadUrl) workWebViewModel).url;
                    boolean booleanValue = ((Boolean) mutableState9.getValue()).booleanValue();
                    boolean booleanValue2 = ((Boolean) mutableState10.getValue()).booleanValue();
                    Object rememberedValue12 = gapComposer10.rememberedValue();
                    if (rememberedValue12 == obj3) {
                        rememberedValue12 = new HeroTagViewKt$$ExternalSyntheticLambda7(12, mutableState9);
                        gapComposer10.updateRememberedValue(rememberedValue12);
                    }
                    Function1 function112 = (Function1) rememberedValue12;
                    Object rememberedValue13 = gapComposer10.rememberedValue();
                    if (rememberedValue13 == obj3) {
                        rememberedValue13 = new HeroTagViewKt$$ExternalSyntheticLambda7(i3, mutableState10);
                        gapComposer10.updateRememberedValue(rememberedValue13);
                    }
                    WorkWebViewKt.WorkWebViewContent(str8, booleanValue, booleanValue2, function112, (Function1) rememberedValue13, function111, webViewProvider, str7, androidDownloadManager$Factory$Impl, gapComposer10, 27648);
                    gapComposer10.end(false);
                } else if (workWebViewModel instanceof WorkWebViewModel.ShowError) {
                    gapComposer10.startReplaceGroup(2066920645);
                    WorkWebViewModel.ShowError showError = (WorkWebViewModel.ShowError) workWebViewModel;
                    WorkWebViewKt.WorkWebViewError(showError.message, showError.canRetry, function111, gapComposer10, 0);
                    gapComposer10.end(false);
                } else {
                    if (!Intrinsics.areEqual(workWebViewModel, WorkWebViewModel.ErrorUrl.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer10, 2066904915, false);
                    }
                    gapComposer10.startReplaceGroup(2066924005);
                    WorkWebViewKt.WorkWebViewInvalidUrl(gapComposer10, 0);
                    gapComposer10.end(false);
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                StripeThemeKt.StripeTheme((StripeColors) obj10, (StripeShapes) obj9, (StripeTypography) obj8, (SectionStyle) obj7, (FormInsets) obj6, (IconStyle) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(12582913));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(Modifier modifier, Function1 function1, Function1 function12, Function0 function0, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$3 = modifier;
        this.f$0 = function1;
        this.f$2 = function12;
        this.f$1 = function0;
        this.f$4 = obj;
        this.f$5 = obj2;
        this.f$6 = obj3;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(BankAccountLinkingViewModel bankAccountLinkingViewModel, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, Shaker shaker, FocusRequester focusRequester, MutableState mutableState, MutableState mutableState2) {
        this.$r8$classId = 2;
        this.f$0 = bankAccountLinkingViewModel;
        this.f$1 = delegatingSoftwareKeyboardController;
        this.f$2 = function1;
        this.f$3 = shaker;
        this.f$4 = focusRequester;
        this.f$5 = mutableState;
        this.f$6 = mutableState2;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(BirthdayViewModel birthdayViewModel, Shaker shaker, FocusRequester focusRequester, Function1 function1, MutableState mutableState, DateScrubber dateScrubber, MutableState mutableState2) {
        this.$r8$classId = 3;
        this.f$0 = birthdayViewModel;
        this.f$1 = shaker;
        this.f$2 = focusRequester;
        this.f$3 = function1;
        this.f$4 = mutableState;
        this.f$5 = dateScrubber;
        this.f$6 = mutableState2;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(UiContainer uiContainer, SharedTransitionScope sharedTransitionScope, NavigationModel.Ready.FullScreenLocation fullScreenLocation, ImmutableList immutableList, AnimatedContentScopeImpl animatedContentScopeImpl, CashComposeInsets cashComposeInsets, SaveableStateHolder saveableStateHolder, int i) {
        this.$r8$classId = 4;
        this.f$0 = uiContainer;
        this.f$5 = sharedTransitionScope;
        this.f$1 = fullScreenLocation;
        this.f$2 = immutableList;
        this.f$3 = animatedContentScopeImpl;
        this.f$4 = cashComposeInsets;
        this.f$6 = saveableStateHolder;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(UiContainer uiContainer, NavigationModel.Ready.FullScreenLocation fullScreenLocation, AnimatedContentScopeImpl animatedContentScopeImpl, SharedTransitionScope sharedTransitionScope, SaveableStateHolder saveableStateHolder, NavigationModel.Ready.Swipe swipe, PagerState pagerState) {
        this.$r8$classId = 5;
        this.f$0 = uiContainer;
        this.f$1 = fullScreenLocation;
        this.f$2 = animatedContentScopeImpl;
        this.f$5 = sharedTransitionScope;
        this.f$3 = saveableStateHolder;
        this.f$4 = swipe;
        this.f$6 = pagerState;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(ChatContentViewModel.MessageViewModel messageViewModel, SupportActivityItemLoader supportActivityItemLoader, RealImageLoader realImageLoader, Function1 function1, Modifier modifier, Function1 function12, Function1 function13, int i) {
        this.$r8$classId = 17;
        this.f$0 = messageViewModel;
        this.f$1 = supportActivityItemLoader;
        this.f$2 = realImageLoader;
        this.f$4 = function1;
        this.f$3 = modifier;
        this.f$5 = function12;
        this.f$6 = function13;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(ChatContentViewModel.MessageViewModel messageViewModel, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, Function1 function13, Function1 function14, int i) {
        this.$r8$classId = 18;
        this.f$0 = messageViewModel;
        this.f$2 = function1;
        this.f$4 = function12;
        this.f$1 = function0;
        this.f$3 = modifier;
        this.f$5 = function13;
        this.f$6 = function14;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(CardSchemeViewModel.Module.HeroCard heroCard, Modifier modifier, CardSchemeViewModel.Module.Accessory.Button button, CardSchemeViewModel.Module.Accessory.Button button2, PrepurchaseCardData.Toggle toggle, Function0 function0, Function1 function1, int i) {
        this.$r8$classId = 19;
        this.f$0 = heroCard;
        this.f$3 = modifier;
        this.f$2 = button;
        this.f$4 = button2;
        this.f$5 = toggle;
        this.f$1 = function0;
        this.f$6 = function1;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = composableLambdaImpl;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = obj7;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(String str, String str2, String str3, String str4, Function1 function1, Function0 function0, Function0 function02, int i) {
        this.$r8$classId = 6;
        this.f$0 = str;
        this.f$2 = str2;
        this.f$3 = str3;
        this.f$4 = str4;
        this.f$5 = function1;
        this.f$1 = function0;
        this.f$6 = function02;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(String str, Function1 function1, FocusRequester focusRequester, Function1 function12, Function0 function0, String str2, Function2 function2) {
        this.$r8$classId = 16;
        this.f$0 = str;
        this.f$2 = function1;
        this.f$3 = focusRequester;
        this.f$4 = function12;
        this.f$1 = function0;
        this.f$5 = str2;
        this.f$6 = function2;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(Function2 function2, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, PaddingValuesImpl paddingValuesImpl, LazyListState lazyListState, Function1 function1, BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl) {
        this.$r8$classId = 10;
        this.f$0 = function2;
        this.f$6 = composableLambdaImpl;
        this.f$1 = composableLambdaImpl2;
        this.f$2 = paddingValuesImpl;
        this.f$3 = lazyListState;
        this.f$4 = function1;
        this.f$5 = boxWithConstraintsScopeImpl;
    }

    public /* synthetic */ BasicShieetKt$$ExternalSyntheticLambda0(Function3 function3, ValueInsets valueInsets, BasicShieetScope basicShieetScope, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, AnimatedCornerShape animatedCornerShape) {
        this.$r8$classId = 15;
        this.f$0 = function3;
        this.f$1 = valueInsets;
        this.f$2 = basicShieetScope;
        this.f$6 = composableLambdaImpl;
        this.f$3 = composableLambdaImpl2;
        this.f$4 = composableLambdaImpl3;
        this.f$5 = animatedCornerShape;
    }
}
