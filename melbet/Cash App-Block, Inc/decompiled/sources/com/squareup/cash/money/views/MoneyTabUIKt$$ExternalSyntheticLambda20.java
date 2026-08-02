package com.squareup.cash.money.views;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda1;
import androidx.compose.material.SwipeableKt$swipeable$3$4$1;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.molecule.PlatformKt;
import bo.app.g6$$ExternalSyntheticLambda11;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;
import com.squareup.cash.arcade.ColorUtilsKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleConfiguration;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda20 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ boolean f$10;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ boolean f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda20(Modifier modifier, FocusRequester focusRequester, boolean z, Shaker shaker, Function0 function0, boolean z2, TextFieldState textFieldState, RealCashVibrator realCashVibrator, boolean z3, ImmutableList immutableList, String str) {
        this.f$0 = modifier;
        this.f$2 = focusRequester;
        this.f$3 = z;
        this.f$4 = shaker;
        this.f$1 = function0;
        this.f$7 = z2;
        this.f$5 = textFieldState;
        this.f$6 = realCashVibrator;
        this.f$10 = z3;
        this.f$8 = immutableList;
        this.f$9 = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ElementBoundsRegistry elementBoundsRegistry;
        UiScope uiScope;
        int i;
        CardSchemeViewModel.Module.HeroTag activeHeroTag;
        CardSchemeViewModel.Module.HeroTag activeHeroTag2;
        CardSchemeViewModel.Module.HeroTag activeHeroTag3;
        long j;
        long j2;
        int i2 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Object obj3 = this.f$9;
        Object obj4 = this.f$8;
        Object obj5 = this.f$6;
        Object obj6 = this.f$5;
        Object obj7 = this.f$4;
        Object obj8 = this.f$2;
        Object obj9 = this.f$0;
        switch (i2) {
            case 0:
                Function1 function1 = (Function1) obj9;
                MoneyTabModel.Loaded loaded = (MoneyTabModel.Loaded) obj8;
                LazyListState lazyListState = (LazyListState) obj7;
                UiScope uiScope2 = (UiScope) obj6;
                ElementBoundsRegistry elementBoundsRegistry2 = (ElementBoundsRegistry) obj5;
                RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory = (RealScrollPerformanceTrackerFactory) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(CardTransitionKt.LocalCardRegistry);
                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(cardRegistry);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(29, function1, cardRegistry);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    gapComposer.startReplaceGroup(381557225);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                    Density density = (Density) gapComposer.consume(staticProvidableCompositionLocal);
                    boolean z = loaded.hasCard;
                    Boolean valueOf = Boolean.valueOf(z);
                    boolean z2 = this.f$3;
                    Object[] objArr = {valueOf, Boolean.valueOf(z2)};
                    boolean changedInstance = gapComposer.changedInstance(loaded) | gapComposer.changed(z2) | gapComposer.changed(density);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        elementBoundsRegistry = elementBoundsRegistry2;
                        rememberedValue2 = new g6$$ExternalSyntheticLambda11(loaded, z2, density, 7);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    } else {
                        elementBoundsRegistry = elementBoundsRegistry2;
                    }
                    float floatValue = ((Number) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer, 0)).floatValue();
                    gapComposer.end(false);
                    Object[] objArr2 = new Object[0];
                    SVGAndroidRenderer sVGAndroidRenderer = new SVGAndroidRenderer(floatValue, function0);
                    boolean changed2 = gapComposer.changed(function0) | gapComposer.changed(floatValue);
                    Function0 function02 = this.f$1;
                    boolean changed3 = changed2 | gapComposer.changed(function02);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        uiScope = uiScope2;
                        i = 0;
                        rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda28(function0, floatValue, function02, 0);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    } else {
                        uiScope = uiScope2;
                        i = 0;
                    }
                    CardNestedScrollExpander cardNestedScrollExpander = (CardNestedScrollExpander) SaverKt.m581rememberSaveable(objArr2, (Saver) sVGAndroidRenderer, (Function0) rememberedValue3, (Composer) gapComposer, i);
                    Boolean valueOf2 = Boolean.valueOf(z);
                    Boolean valueOf3 = Boolean.valueOf(z2);
                    boolean changed4 = gapComposer.changed(cardNestedScrollExpander) | gapComposer.changed(floatValue);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new SwipeableKt$swipeable$3$4$1.AnonymousClass1(cardNestedScrollExpander, floatValue, null, 4);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    Updater.LaunchedEffect(valueOf2, valueOf3, (Function2) rememberedValue4, gapComposer);
                    Object[] objArr3 = new Object[0];
                    ToolbarNestedScrollExpanderSaver toolbarNestedScrollExpanderSaver = new ToolbarNestedScrollExpanderSaver();
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda6(11);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    ToolbarNestedScrollExpander toolbarNestedScrollExpander = (ToolbarNestedScrollExpander) SaverKt.m581rememberSaveable(objArr3, (Saver) toolbarNestedScrollExpanderSaver, (Function0) rememberedValue5, (Composer) gapComposer, MLKEMEngine.KyberPolyBytes);
                    Object[] objArr4 = new Object[0];
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new MoneyTabUIKt$$ExternalSyntheticLambda6(12);
                        gapComposer.updateRememberedValue(rememberedValue6);
                    }
                    MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue6, gapComposer, 48);
                    Boolean valueOf4 = Boolean.valueOf(z);
                    boolean changed5 = gapComposer.changed(mutableState) | gapComposer.changed(lazyListState);
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    if (changed5 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new MoneyTabUIKt$MoneyTabLoaded$4$2$1(lazyListState, mutableState, null, 0);
                        gapComposer.updateRememberedValue(rememberedValue7);
                    }
                    Updater.LaunchedEffect(gapComposer, valueOf4, (Function2) rememberedValue7);
                    boolean z3 = ((cardRegistry == null || (activeHeroTag3 = cardRegistry.getActiveHeroTag()) == null || activeHeroTag3.isActivated) && (cardRegistry == null || (activeHeroTag = cardRegistry.getActiveHeroTag()) == null || !activeHeroTag.isLocked)) ? false : true;
                    float moneyTabHeroTagPeekOffset = (cardRegistry == null || (activeHeroTag2 = cardRegistry.getActiveHeroTag()) == null) ? 0.0f : HypeWelcomeUIKt.moneyTabHeroTagPeekOffset(activeHeroTag2.formFactor);
                    int mo230roundToPx0680j_4 = ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo230roundToPx0680j_4(moneyTabHeroTagPeekOffset);
                    toolbarNestedScrollExpander.getClass();
                    MoneyTabUIKt.MoneyTabScaffold(Expect_jvmKt.rememberComposableLambda(202117912, new TooltipKt$$ExternalSyntheticLambda2(6, loaded, cardRegistry, toolbarNestedScrollExpander, cardNestedScrollExpander, lazyListState, z3), gapComposer), Expect_jvmKt.rememberComposableLambda(2146089817, new MoneyTabUIKt$$ExternalSyntheticLambda32(toolbarNestedScrollExpander, loaded, uiScope, cardNestedScrollExpander, elementBoundsRegistry, function1, this.f$7), gapComposer), (int) (HypeWelcomeUIKt.isFullyExpanded(toolbarNestedScrollExpander) ? 0.0f : toolbarNestedScrollExpander._toolbarScrollDelta.getFloatValue()), HypeWelcomeUIKt.isFullyExpanded(toolbarNestedScrollExpander) ? 1.0f : 0.0f, Expect_jvmKt.rememberComposableLambda(-611929060, new MoneyTabUIKt$$ExternalSyntheticLambda33(loaded, cardNestedScrollExpander, toolbarNestedScrollExpander, lazyListState, moneyTabHeroTagPeekOffset, realScrollPerformanceTrackerFactory, coroutineScope), gapComposer), null, mo230roundToPx0680j_4, gapComposer, 24630);
                    Density density2 = (Density) gapComposer.consume(staticProvidableCompositionLocal);
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    MutableState rememberUpdatedState = Updater.rememberUpdatedState(Integer.valueOf(Arrangement$End$1.current(gapComposer).statusBars.getInsets$foundation_layout().top), gapComposer);
                    MutableState statusBarThreshold = MoneyTabUIKt.statusBarThreshold(gapComposer);
                    boolean changed6 = gapComposer.changed(loaded);
                    Object rememberedValue8 = gapComposer.rememberedValue();
                    if (changed6 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = Updater.derivedStateOf(new g6$$ExternalSyntheticLambda11(toolbarNestedScrollExpander, this.f$10, statusBarThreshold, 8));
                        gapComposer.updateRememberedValue(rememberedValue8);
                    }
                    State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) ((State) rememberedValue8).getValue()).booleanValue() ? 1.0f : 0.0f, null, null, null, gapComposer, 0, 30);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, Color.m675copywmQWz5c$default(((Number) animateFloatAsState.getValue()).floatValue(), colors.surface.money.background, 14), rectangleShapeKt$RectangleShape$1), 1.0f), density2.mo233toDpu2uoSUM(((Number) rememberUpdatedState.getValue()).intValue()));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
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
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Modifier modifier = (Modifier) obj9;
                FocusRequester focusRequester = (FocusRequester) obj8;
                final Shaker shaker = (Shaker) obj7;
                final TextFieldState textFieldState = (TextFieldState) obj6;
                final RealCashVibrator realCashVibrator = (RealCashVibrator) obj5;
                ImmutableList immutableList = (ImmutableList) obj4;
                final String str = (String) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(modifier, 1.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
                    Strings.getSizes(gapComposer2).getClass();
                    DefaultSizes.spacing.getClass();
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf5 = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf5, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    ModalKt.HorizontalDivider(0, 1, gapComposer2, null);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Strings.getSizes(gapComposer2).getClass();
                    Strings.getSizes(gapComposer2).getClass();
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(fillMaxWidth, 16.0f, 8.0f, 16.0f, 16.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
                    int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14, 1.0f, true);
                    final Function0 function03 = this.f$1;
                    final boolean z4 = this.f$7;
                    QuickPayViewKt.SheetTextFieldFocusKeyboardWrapper(m, focusRequester, Expect_jvmKt.rememberComposableLambda(-1150830895, new MoneyTabUIKt$$ExternalSyntheticLambda17(focusRequester, shaker, function03, z4, textFieldState, realCashVibrator, this.f$10, immutableList), gapComposer2), gapComposer2, MLKEMEngine.KyberPolyBytes, 0);
                    final boolean z5 = this.f$3;
                    if (z5) {
                        gapComposer2.startReplaceGroup(1566306760);
                        j = Strings.getColors(gapComposer2).component.button.prominent.background.f160default;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1566402023);
                        j = Strings.getColors(gapComposer2).component.button.prominent.background.disabled;
                        gapComposer2.end(false);
                    }
                    final long j3 = j;
                    if (z5) {
                        gapComposer2.startReplaceGroup(1566547630);
                        j2 = Strings.getColors(gapComposer2).component.button.prominent.text.f162default;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1566636941);
                        j2 = Strings.getColors(gapComposer2).component.button.prominent.text.disabled;
                        gapComposer2.end(false);
                    }
                    final long j4 = j2;
                    RippleConfiguration rippleConfiguration = new RippleConfiguration(Strings.getColors(gapComposer2).component.button.prominent.background.ripple, (Strings.getColors(gapComposer2).isLight ? ColorUtilsKt.lightAlphas : ColorUtilsKt.darkAlphas).component.buttonProminent);
                    Strings.getSizes(gapComposer2).getClass();
                    Object obj10 = DefaultSizes.border.entries;
                    final RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
                    Updater.CompositionLocalProvider(RippleKt.LocalRippleConfiguration.defaultProvidedValue$runtime(rippleConfiguration), Expect_jvmKt.rememberComposableLambda(571326528, new Function2() { // from class: com.squareup.cash.payments.views.composer.NoteInputKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj11, Object obj12) {
                            Composer composer3 = (Composer) obj11;
                            int intValue3 = ((Integer) obj12).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Modifier m275defaultMinSizeVpY3zN4 = SizeKt.m275defaultMinSizeVpY3zN4(Modifier.Companion.$$INSTANCE, 48.0f, 44.0f);
                                long j5 = j3;
                                RoundedCornerShape roundedCornerShape = m340RoundedCornerShape0680j_4;
                                Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(m275defaultMinSizeVpY3zN4, j5, roundedCornerShape), roundedCornerShape);
                                Object rememberedValue9 = gapComposer3.rememberedValue();
                                NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                if (rememberedValue9 == neverEqualPolicy2) {
                                    rememberedValue9 = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                                }
                                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue9;
                                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer3, 0, 15);
                                Role role = new Role(0);
                                Function0 function04 = function03;
                                boolean changed7 = gapComposer3.changed(function04);
                                boolean z6 = z4;
                                boolean changed8 = changed7 | gapComposer3.changed(z6);
                                TextFieldState textFieldState2 = textFieldState;
                                boolean changed9 = changed8 | gapComposer3.changed(textFieldState2);
                                Shaker shaker2 = shaker;
                                boolean changedInstance2 = changed9 | gapComposer3.changedInstance(shaker2);
                                RealCashVibrator realCashVibrator2 = realCashVibrator;
                                boolean changedInstance3 = changedInstance2 | gapComposer3.changedInstance(realCashVibrator2);
                                Object rememberedValue10 = gapComposer3.rememberedValue();
                                if (changedInstance3 || rememberedValue10 == neverEqualPolicy2) {
                                    rememberedValue10 = new ModalBottomSheetKt$$ExternalSyntheticLambda1(function04, z6, textFieldState2, shaker2, realCashVibrator2);
                                    gapComposer3.updateRememberedValue(rememberedValue10);
                                }
                                Modifier padding = SpacerKt.padding(ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl, m3400rippleYJYuY3k, true, null, role, (Function0) rememberedValue10, 8), new PaddingValuesImpl(24.0f, 10.0f, 24.0f, 10.0f));
                                boolean z7 = z5;
                                boolean changed10 = gapComposer3.changed(z7);
                                Object rememberedValue11 = gapComposer3.rememberedValue();
                                if (changed10 || rememberedValue11 == neverEqualPolicy2) {
                                    rememberedValue11 = new MoneyTabUIKt$$ExternalSyntheticLambda24(z7, 15);
                                    gapComposer3.updateRememberedValue(rememberedValue11);
                                }
                                Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(padding, false, (Function1) rememberedValue11), "note_input_continue_button");
                                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, 1)), Alignment.Companion.CenterVertically, gapComposer3, 54);
                                int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
                                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer3, testTag);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer3.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer3.startReusableNode();
                                if (gapComposer3.inserting) {
                                    gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                                } else {
                                    gapComposer3.useNode();
                                }
                                Updater.m576setimpl(gapComposer3, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer3, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer3, (Modifier) null, TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).button, j4, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                gapComposer3.end(true);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 56);
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda20(Function1 function1, Function0 function0, MoneyTabModel.Loaded loaded, boolean z, LazyListState lazyListState, UiScope uiScope, ElementBoundsRegistry elementBoundsRegistry, boolean z2, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, CoroutineScope coroutineScope, boolean z3) {
        this.f$0 = function1;
        this.f$1 = function0;
        this.f$2 = loaded;
        this.f$3 = z;
        this.f$4 = lazyListState;
        this.f$5 = uiScope;
        this.f$6 = elementBoundsRegistry;
        this.f$7 = z2;
        this.f$8 = realScrollPerformanceTrackerFactory;
        this.f$9 = coroutineScope;
        this.f$10 = z3;
    }
}
