package com.squareup.cash.money.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.UiScope;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.views.home.MoneybotHomeScaffoldContentScope;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt$MoneybotHomeView$1$1$5$1$2$1$1;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$2$1$$ExternalSyntheticLambda0;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ boolean f$6;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda0(RealImageLoader realImageLoader, MoneyTabModel moneyTabModel, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, Function1 function1, Function0 function0, ElementBoundsRegistry elementBoundsRegistry, boolean z) {
        this.f$0 = realImageLoader;
        this.f$1 = moneyTabModel;
        this.f$2 = realScrollPerformanceTrackerFactory;
        this.f$3 = function1;
        this.f$4 = function0;
        this.f$5 = elementBoundsRegistry;
        this.f$6 = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MoneybotHomeViewModel.NextBestAction nextBestAction;
        int i = this.$r8$classId;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                RealImageLoader realImageLoader = (RealImageLoader) obj8;
                MoneyTabModel moneyTabModel = (MoneyTabModel) obj7;
                RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory = (RealScrollPerformanceTrackerFactory) obj6;
                Function0 function0 = (Function0) obj5;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj4;
                UiScope uiScope = (UiScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-530844381, new MoneyTabUIKt$$ExternalSyntheticLambda2(moneyTabModel, uiScope, realScrollPerformanceTrackerFactory, this.f$3, function0, elementBoundsRegistry, this.f$6, 0), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                MoneybotHomeScaffoldContentScope moneybotHomeScaffoldContentScope = (MoneybotHomeScaffoldContentScope) obj8;
                MoneybotHomeViewModel moneybotHomeViewModel = (MoneybotHomeViewModel) obj7;
                Density density = (Density) obj6;
                Animatable animatable = (Animatable) obj5;
                Set set = (Set) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    float f = moneybotHomeScaffoldContentScope.totalHeight;
                    PaddingValuesImpl paddingValuesImpl = moneybotHomeScaffoldContentScope.contentInsets;
                    float f2 = (f - paddingValuesImpl.top) - paddingValuesImpl.bottom;
                    MoneybotHomeViewModel.Content content = (MoneybotHomeViewModel.Content) moneybotHomeViewModel;
                    Loadable loadable = content.nba;
                    float f3 = ((Dp) ComparisonsKt___ComparisonsJvmKt.maxOf(new Dp(f2 - (!content.widgets.isEmpty() ? density.getFontScale() * 204.8f : RecyclerView.DECELERATION_RATE)), new Dp((!(loadable instanceof Loadable.Loaded) || ((Loadable.Loaded) loadable).value == null) ? 16.0f : density.getFontScale() * 220.0f))).value;
                    Dp dp = new Dp(f3);
                    boolean z = this.f$6;
                    boolean changed = gapComposer2.changed(z) | gapComposer2.changedInstance(animatable) | gapComposer2.changed(f3);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    String str = null;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MoneybotHomeViewKt$MoneybotHomeView$1$1$5$1$2$1$1(z, animatable, f3, null);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer2, dp, (Function2) rememberedValue);
                    Loadable loadable2 = content.nba;
                    Loadable.Loaded loaded = loadable2 instanceof Loadable.Loaded ? (Loadable.Loaded) loadable2 : null;
                    if (loaded != null && (nextBestAction = (MoneybotHomeViewModel.NextBestAction) loaded.value) != null) {
                        str = nextBestAction.nbaId;
                    }
                    if (z) {
                        f3 = ((Number) animatable.getValue()).floatValue();
                    }
                    boolean z2 = z && !CollectionsKt.contains(set, str);
                    boolean changedInstance = gapComposer2.changedInstance(set);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new DotGridKt$DotGrid$2$1$$ExternalSyntheticLambda0(2, set);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    MoneybotHomeViewKt.m3630NextBestActionDzVHIIc(loadable2, f3, this.f$3, z2, (Function1) rememberedValue2, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda0(MoneybotHomeScaffoldContentScope moneybotHomeScaffoldContentScope, MoneybotHomeViewModel moneybotHomeViewModel, Density density, boolean z, Animatable animatable, Function1 function1, Set set) {
        this.f$0 = moneybotHomeScaffoldContentScope;
        this.f$1 = moneybotHomeViewModel;
        this.f$2 = density;
        this.f$6 = z;
        this.f$4 = animatable;
        this.f$3 = function1;
        this.f$5 = set;
    }
}
