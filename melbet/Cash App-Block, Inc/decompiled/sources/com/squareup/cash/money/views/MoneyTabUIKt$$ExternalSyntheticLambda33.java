package com.squareup.cash.money.views;

import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.investing.components.custom.order.PriceWidgetState;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.TypesJVMKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda33 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ float f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda33(MoneyTabModel.Loaded loaded, CardNestedScrollExpander cardNestedScrollExpander, ToolbarNestedScrollExpander toolbarNestedScrollExpander, LazyListState lazyListState, float f, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, CoroutineScope coroutineScope) {
        this.f$0 = loaded;
        this.f$1 = cardNestedScrollExpander;
        this.f$2 = toolbarNestedScrollExpander;
        this.f$3 = lazyListState;
        this.f$4 = f;
        this.f$5 = realScrollPerformanceTrackerFactory;
        this.f$6 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$6;
        Object obj4 = this.f$5;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                MoneyTabModel.Loaded loaded = (MoneyTabModel.Loaded) obj8;
                CardNestedScrollExpander cardNestedScrollExpander = (CardNestedScrollExpander) obj7;
                ToolbarNestedScrollExpander toolbarNestedScrollExpander = (ToolbarNestedScrollExpander) obj6;
                LazyListState lazyListState = (LazyListState) obj5;
                RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory = (RealScrollPerformanceTrackerFactory) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    Object obj9 = Composer.Companion.Empty;
                    if (rememberedValue == obj9) {
                        rememberedValue = AnimatableKt.Animatable(loaded.showCardPeekAnimation ? 0.1f : 1.0f, 0.01f);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Animatable animatable = (Animatable) rememberedValue;
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer.changedInstance(animatable);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == obj9) {
                        rememberedValue2 = new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, null, 7);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
                    ProvidableCompositionLocal providableCompositionLocal = CashInsetsKt.LocalCashInsets;
                    float mo264calculateBottomPaddingD9Ej5fM = SpacerKt.asPaddingValues(((CashComposeInsets) gapComposer.consume(providableCompositionLocal)).floatingBottomNavigation, gapComposer).mo264calculateBottomPaddingD9Ej5fM() + SpacerKt.asPaddingValues(((CashComposeInsets) gapComposer.consume(providableCompositionLocal)).inlineBottomNavigation, gapComposer).mo264calculateBottomPaddingD9Ej5fM();
                    if (Dp.m1037equalsimpl0(mo264calculateBottomPaddingD9Ej5fM, RecyclerView.DECELERATION_RATE)) {
                        gapComposer.startReplaceGroup(-2136632447);
                        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                        mo264calculateBottomPaddingD9Ej5fM = SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).navigationBars, gapComposer).mo264calculateBottomPaddingD9Ej5fM();
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-2136504634);
                        gapComposer.end(false);
                    }
                    gapComposer.startReplaceGroup(346727569);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier alpha = AlphaKt.alpha(SizeKt.fillMaxSize(companion, 1.0f), ((Number) animatable.getValue()).floatValue());
                    if (loaded.attachScrollLogging) {
                        gapComposer.startReplaceGroup(346729597);
                        Modifier trackScrollPerformance = realScrollPerformanceTrackerFactory.trackScrollPerformance(PerformanceMeasureScrollPerformance.Element.MONEY_MAIN, lazyListState, ((View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView)).getDisplay().getRefreshRate(), coroutineScope);
                        gapComposer.end(false);
                        alpha = alpha.then(trackScrollPerformance);
                    }
                    gapComposer.end(false);
                    Modifier testTag = TestTagKt.testTag(alpha.then(loaded.hasCard ? NestedScrollModifierKt.nestedScroll(NestedScrollModifierKt.nestedScroll(companion, cardNestedScrollExpander, null), toolbarNestedScrollExpander, null) : NestedScrollModifierKt.nestedScroll(companion, toolbarNestedScrollExpander, null)), "applet_grid");
                    PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, this.f$4, RecyclerView.DECELERATION_RATE, mo264calculateBottomPaddingD9Ej5fM, 5);
                    boolean changed = gapComposer.changed(toolbarNestedScrollExpander) | gapComposer.changedInstance(loaded) | gapComposer.changed(cardNestedScrollExpander);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed || rememberedValue3 == obj9) {
                        rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda39(0, loaded, cardNestedScrollExpander, toolbarNestedScrollExpander);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    LazyDslKt.LazyColumn(testTag, lazyListState, m297PaddingValuesa9UjIt4$default, null, null, null, false, null, (Function1) rememberedValue3, gapComposer, 0, 504);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                CustomOrderKt.PriceWidget((TypesJVMKt) obj8, (GraphState) obj7, (PriceWidgetState) obj6, (Function1) obj5, this.f$4, (ColorModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda33(TypesJVMKt typesJVMKt, GraphState graphState, PriceWidgetState priceWidgetState, Function1 function1, float f, ColorModel colorModel, Modifier modifier, int i) {
        this.f$0 = typesJVMKt;
        this.f$1 = graphState;
        this.f$2 = priceWidgetState;
        this.f$3 = function1;
        this.f$4 = f;
        this.f$5 = colorModel;
        this.f$6 = modifier;
    }
}
