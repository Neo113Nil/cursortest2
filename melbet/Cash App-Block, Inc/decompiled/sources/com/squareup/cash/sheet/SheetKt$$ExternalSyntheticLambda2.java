package com.squareup.cash.sheet;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.broadway.ui.compose.UiScopeKt;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewModel;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda32;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.paymentpad.viewmodels.HomeViewModel;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final /* synthetic */ class SheetKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda2(RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, Function1 function1, HomeViewModel homeViewModel, boolean z, PaymentPadTheme paymentPadTheme, SplashScreenAnimationObserver splashScreenAnimationObserver, ElementBoundsRegistry elementBoundsRegistry, UiScope uiScope) {
        this.f$0 = realImageLoader;
        this.f$1 = realCashVibrator;
        this.f$2 = function1;
        this.f$3 = homeViewModel;
        this.f$5 = z;
        this.f$4 = paymentPadTheme;
        this.f$6 = splashScreenAnimationObserver;
        this.f$7 = elementBoundsRegistry;
        this.f$8 = uiScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$8;
        Object obj4 = this.f$7;
        Object obj5 = this.f$6;
        Object obj6 = this.f$4;
        Object obj7 = this.f$3;
        Object obj8 = this.f$2;
        Object obj9 = this.f$1;
        Object obj10 = this.f$0;
        switch (i) {
            case 0:
                RealSheetState realSheetState = (RealSheetState) obj10;
                Function0 function0 = (Function0) obj9;
                SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = (SheetPeekPosition$FixedHeight) obj8;
                Modifier modifier = (Modifier) obj7;
                AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) obj6;
                String str = (String) obj5;
                SheetTopCornerBehavior sheetTopCornerBehavior = (SheetTopCornerBehavior) obj4;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    BasicShieetKt.BasicShieet(realSheetState, function0, sheetPeekPosition$FixedHeight, modifier, animatedVisibilityScope, (SharedTransitionScope) gapComposer.consume(UiScopeKt.LocalContainerSharedTransitionScope), Expect_jvmKt.rememberComposableLambda(-1221983488, new SheetKt$$ExternalSyntheticLambda4(this.f$5, str, sheetTopCornerBehavior, composableLambdaImpl, (CoroutineScope) rememberedValue, realSheetState), gapComposer), gapComposer, 1572864);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                EarningsHeaderKt.LoadedHeader((EarningsHeaderViewModel.HeaderViewModel.Loaded) obj10, (ComposableLambdaImpl) obj3, (MoneyFormatter) obj8, (MoneyFormatter) obj6, (Function0) obj9, (Function0) obj5, (Function0) obj4, this.f$5, (Modifier) obj7, (Composer) obj, Updater.updateChangedFlags(49));
                break;
            default:
                RealImageLoader realImageLoader = (RealImageLoader) obj10;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj9;
                Function1 function1 = (Function1) obj8;
                HomeViewModel homeViewModel = (HomeViewModel) obj7;
                PaymentPadTheme paymentPadTheme = (PaymentPadTheme) obj6;
                SplashScreenAnimationObserver splashScreenAnimationObserver = (SplashScreenAnimationObserver) obj5;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj4;
                UiScope uiScope = (UiScope) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator)}, Expect_jvmKt.rememberComposableLambda(2031283716, new MoneyTabUIKt$$ExternalSyntheticLambda32(function1, homeViewModel, this.f$5, paymentPadTheme, splashScreenAnimationObserver, elementBoundsRegistry, uiScope), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda2(EarningsHeaderViewModel.HeaderViewModel.Loaded loaded, ComposableLambdaImpl composableLambdaImpl, MoneyFormatter moneyFormatter, MoneyFormatter moneyFormatter2, Function0 function0, Function0 function02, Function0 function03, boolean z, Modifier modifier, int i) {
        this.f$0 = loaded;
        this.f$8 = composableLambdaImpl;
        this.f$2 = moneyFormatter;
        this.f$4 = moneyFormatter2;
        this.f$1 = function0;
        this.f$6 = function02;
        this.f$7 = function03;
        this.f$5 = z;
        this.f$3 = modifier;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda2(RealSheetState realSheetState, Function0 function0, SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight, Modifier modifier, AnimatedVisibilityScope animatedVisibilityScope, boolean z, String str, SheetTopCornerBehavior sheetTopCornerBehavior, ComposableLambdaImpl composableLambdaImpl) {
        this.f$0 = realSheetState;
        this.f$1 = function0;
        this.f$2 = sheetPeekPosition$FixedHeight;
        this.f$3 = modifier;
        this.f$4 = animatedVisibilityScope;
        this.f$5 = z;
        this.f$6 = str;
        this.f$7 = sheetTopCornerBehavior;
        this.f$8 = composableLambdaImpl;
    }
}
