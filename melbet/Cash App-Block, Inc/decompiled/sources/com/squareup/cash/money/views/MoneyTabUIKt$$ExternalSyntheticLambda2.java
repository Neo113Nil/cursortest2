package com.squareup.cash.money.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.common.viewmodels.NextAvailableCashTag;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.cash.wallet.views.CardTransitionKt$cardBottomNavFadeInOut$1$1;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MoneyTabModel f$0;
    public final /* synthetic */ UiScope f$1;
    public final /* synthetic */ RealScrollPerformanceTrackerFactory f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ Function0 f$4;
    public final /* synthetic */ ElementBoundsRegistry f$5;
    public final /* synthetic */ boolean f$6;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda2(MoneyTabModel moneyTabModel, UiScope uiScope, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, Function1 function1, Function0 function0, ElementBoundsRegistry elementBoundsRegistry, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = moneyTabModel;
        this.f$1 = uiScope;
        this.f$2 = realScrollPerformanceTrackerFactory;
        this.f$3 = function1;
        this.f$4 = function0;
        this.f$5 = elementBoundsRegistry;
        this.f$6 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Modifier.Companion companion;
        Modifier modifier;
        float f;
        MutableState mutableState;
        boolean z;
        UiScope uiScope;
        boolean z2;
        ElementBoundsRegistry elementBoundsRegistry;
        NeverEqualPolicy neverEqualPolicy;
        float f2;
        int i;
        CoroutineScope coroutineScope;
        boolean z3;
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1167443182, new MoneyTabUIKt$$ExternalSyntheticLambda2(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, 1), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    final MutableState cardQuickFadeInOut = CardTransitionKt.cardQuickFadeInOut(0, 1, gapComposer2);
                    MutableState transitionType = CardTransitionKt.getTransitionType(gapComposer2);
                    Float valueOf = Float.valueOf(1.0f);
                    boolean changed = gapComposer2.changed(transitionType);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy2) {
                        rememberedValue = new CardTransitionKt$cardBottomNavFadeInOut$1$1(transitionType, null, 0);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    final MutableState produceState = Updater.produceState(gapComposer2, valueOf, (Function2) rememberedValue);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    final Colors colors2 = colors;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = CashInsetsKt.LocalCashInsets;
                    final float mo264calculateBottomPaddingD9Ej5fM = SpacerKt.asPaddingValues(((CashComposeInsets) gapComposer2.consume(staticProvidableCompositionLocal)).inlineBottomNavigation, gapComposer2).mo264calculateBottomPaddingD9Ej5fM();
                    float mo264calculateBottomPaddingD9Ej5fM2 = SpacerKt.asPaddingValues(((CashComposeInsets) gapComposer2.consume(staticProvidableCompositionLocal)).floatingBottomNavigation, gapComposer2).mo264calculateBottomPaddingD9Ej5fM() + mo264calculateBottomPaddingD9Ej5fM;
                    Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                    boolean changed2 = gapComposer2.changed(mo264calculateBottomPaddingD9Ej5fM2) | gapComposer2.changed(density);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy2) {
                        rememberedValue2 = Integer.valueOf(density.mo230roundToPx0680j_4(mo264calculateBottomPaddingD9Ej5fM2));
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    int intValue3 = ((Number) rememberedValue2).intValue();
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                    final MoneyTabModel moneyTabModel = this.f$0;
                    boolean changedInstance = gapComposer2.changedInstance(moneyTabModel) | gapComposer2.changed(colors2) | gapComposer2.changed(cardQuickFadeInOut) | gapComposer2.changed(mo264calculateBottomPaddingD9Ej5fM) | gapComposer2.changed(produceState);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy2) {
                        companion = companion2;
                        modifier = fillMaxSize;
                        obj3 = new Function1() { // from class: com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                float f3;
                                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj4;
                                layoutNodeDrawScope.getClass();
                                boolean z4 = MoneyTabModel.this instanceof MoneyTabModel.Loaded;
                                Colors colors3 = colors2;
                                float f4 = mo264calculateBottomPaddingD9Ej5fM;
                                if (z4) {
                                    f3 = f4;
                                } else {
                                    long j = colors3.surface.money.background;
                                    float floatValue = ((Number) cardQuickFadeInOut.getValue()).floatValue();
                                    CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
                                    f3 = f4;
                                    DrawScope.m747drawRectnJ9OG0$default(layoutNodeDrawScope, j, 0L, Size.m638copyxjbvk4A$default(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - canvasDrawScope.mo230roundToPx0680j_4(f4), 1, canvasDrawScope.mo753getSizeNHjbRc()), floatValue, null, null, 0, 114);
                                }
                                layoutNodeDrawScope.drawContent();
                                CanvasDrawScope canvasDrawScope2 = layoutNodeDrawScope.canvasDrawScope;
                                long j2 = colors3.semantic.background.f1047app;
                                float floatValue2 = ((Number) produceState.getValue()).floatValue();
                                long m638copyxjbvk4A$default = Size.m638copyxjbvk4A$default(RecyclerView.DECELERATION_RATE, layoutNodeDrawScope.mo236toPx0680j_4(f3), 1, canvasDrawScope2.mo753getSizeNHjbRc());
                                float intBitsToFloat = Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - layoutNodeDrawScope.mo236toPx0680j_4(f3);
                                DrawScope.m747drawRectnJ9OG0$default(layoutNodeDrawScope, j2, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax), m638copyxjbvk4A$default, floatValue2, null, null, 0, 112);
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer2.updateRememberedValue(obj3);
                    } else {
                        companion = companion2;
                        obj3 = rememberedValue3;
                        modifier = fillMaxSize;
                    }
                    Modifier drawWithContent = ClipKt.drawWithContent(modifier, (Function1) obj3);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, drawWithContent);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Object[] objArr = new Object[0];
                    boolean changedInstance2 = gapComposer2.changedInstance(moneyTabModel);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == neverEqualPolicy2) {
                        rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda5(moneyTabModel, 0);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue4, gapComposer2, 0);
                    Object[] objArr2 = new Object[0];
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy2) {
                        rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda6(0);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    MutableState mutableState3 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue5, gapComposer2, 48);
                    boolean z4 = moneyTabModel instanceof MoneyTabModel.Loaded;
                    UiScope uiScope2 = this.f$1;
                    Function1 function1 = this.f$3;
                    ElementBoundsRegistry elementBoundsRegistry2 = this.f$5;
                    boolean z5 = this.f$6;
                    if (z4) {
                        gapComposer2.startReplaceGroup(-1797857180);
                        mutableState2.setValue(Boolean.FALSE);
                        Modifier testTag = TestTagKt.testTag(companion, "money_tab");
                        MoneyTabModel.Loaded loaded = (MoneyTabModel.Loaded) moneyTabModel;
                        z2 = z5;
                        boolean z6 = loaded.showCardPeekAnimation;
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (rememberedValue6 == neverEqualPolicy2) {
                            rememberedValue6 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        }
                        CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue6;
                        f = mo264calculateBottomPaddingD9Ej5fM2;
                        Function0 function0 = this.f$4;
                        boolean changed3 = gapComposer2.changed(function0) | gapComposer2.changed(mutableState3);
                        Object rememberedValue7 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue7 == neverEqualPolicy2) {
                            coroutineScope = coroutineScope2;
                            z3 = false;
                            rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda7(function0, mutableState3, 0);
                            gapComposer2.updateRememberedValue(rememberedValue7);
                        } else {
                            coroutineScope = coroutineScope2;
                            z3 = false;
                        }
                        Function0 function02 = (Function0) rememberedValue7;
                        elementBoundsRegistry = elementBoundsRegistry2;
                        mutableState = mutableState3;
                        z = z4;
                        neverEqualPolicy = neverEqualPolicy2;
                        f2 = 1.0f;
                        MoneyTabUIKt.MoneyTabLoaded(uiScope2, testTag, loaded, z6, this.f$2, coroutineScope, intValue3, function1, function02, elementBoundsRegistry, z2, gapComposer2, 48);
                        gapComposer2 = gapComposer2;
                        uiScope = uiScope2;
                        gapComposer2.end(z3);
                    } else {
                        f = mo264calculateBottomPaddingD9Ej5fM2;
                        mutableState = mutableState3;
                        z = z4;
                        uiScope = uiScope2;
                        z2 = z5;
                        elementBoundsRegistry = elementBoundsRegistry2;
                        neverEqualPolicy = neverEqualPolicy2;
                        f2 = 1.0f;
                        if (!(moneyTabModel instanceof MoneyTabModel.Loading)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -1166375109, false);
                        }
                        gapComposer2.startReplaceGroup(-1166346787);
                        gapComposer2.end(false);
                        mutableState2.setValue(Boolean.TRUE);
                    }
                    AnimatedContentKt.AnimatedVisibility(((Boolean) mutableState2.getValue()).booleanValue(), (Modifier) null, (EnterTransitionImpl) null, EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(0, 67, new CubicBezierEasing(0.25f, 0.1f, 0.25f, f2), 1), 2), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1985377360, new MoneyTabUIKt$$ExternalSyntheticLambda8(moneyTabModel, uiScope, function1, elementBoundsRegistry, z2), gapComposer2), (Composer) gapComposer2, 199680, 22);
                    MoneyTabModel.Loaded loaded2 = z ? (MoneyTabModel.Loaded) moneyTabModel : null;
                    NextAvailableCashTag nextAvailableCashTag = loaded2 != null ? loaded2.nextAvailableCashTag : null;
                    Object rememberedValue8 = gapComposer2.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = Updater.mutableStateOf$default(new Offset(0L));
                        gapComposer2.updateRememberedValue(rememberedValue8);
                    }
                    MutableState mutableState4 = (MutableState) rememberedValue8;
                    Object rememberedValue9 = gapComposer2.rememberedValue();
                    if (rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer2.updateRememberedValue(rememberedValue9);
                    }
                    MutableState mutableState5 = (MutableState) rememberedValue9;
                    GapComposer gapComposer3 = gapComposer2;
                    State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState5.getValue()).booleanValue() ? 0.85f : f2, AnimatableKt.tween$default(100, 0, EasingFunctionsKt.EaseInOut, 2), "badge-scale", null, gapComposer3, 3072, 20);
                    boolean z7 = ((Boolean) mutableState.getValue()).booleanValue() && nextAvailableCashTag != null;
                    Modifier cardToolbarFadeInOut = CardTransitionKt.cardToolbarFadeInOut(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomEnd), gapComposer3);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal2)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal2)).getClass();
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(cardToolbarFadeInOut, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, f + 16.0f, 3);
                    Object rememberedValue10 = gapComposer3.rememberedValue();
                    if (rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new MoneyTabUIKt$$ExternalSyntheticLambda9(0, mutableState4);
                        gapComposer3.updateRememberedValue(rememberedValue10);
                    }
                    Modifier offset = OffsetKt.offset(m302paddingqDBjuR0$default, (Function1) rememberedValue10);
                    boolean changed4 = gapComposer3.changed(animateFloatAsState);
                    Object rememberedValue11 = gapComposer3.rememberedValue();
                    if (changed4 || rememberedValue11 == neverEqualPolicy) {
                        i = 0;
                        rememberedValue11 = new MoneyTabUIKt$$ExternalSyntheticLambda10(animateFloatAsState, i);
                        gapComposer3.updateRememberedValue(rememberedValue11);
                    } else {
                        i = 0;
                    }
                    Modifier graphicsLayer = ColorKt.graphicsLayer(offset, (Function1) rememberedValue11);
                    Unit unit = Unit.INSTANCE;
                    Object rememberedValue12 = gapComposer3.rememberedValue();
                    if (rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new MoneyTabUIKt$MoneyTabUI$1$1$1$2$5$1(i, mutableState5);
                        gapComposer3.updateRememberedValue(rememberedValue12);
                    }
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(graphicsLayer, unit, (PointerInputEventHandler) rememberedValue12);
                    Object rememberedValue13 = gapComposer3.rememberedValue();
                    if (rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new MoneyTabUIKt$MoneyTabUI$1$1$1$2$5$1(3, mutableState4);
                        gapComposer3.updateRememberedValue(rememberedValue13);
                    }
                    AnimatedContentKt.AnimatedVisibility(z7, SuspendingPointerInputFilterKt.pointerInput(pointerInput, unit, (PointerInputEventHandler) rememberedValue13), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1970474105, new MoneyTabUIKt$$ExternalSyntheticLambda11(0, (Object) nextAvailableCashTag, (Object) function1), gapComposer3), (Composer) gapComposer3, 200064, 16);
                    gapComposer3.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
