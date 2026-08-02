package androidx.compose.foundation.pager;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition$Start;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.UnionInsets;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.node.ComposeUiNode;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleConfiguration;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.common.composeui.CashWindowInsets;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.graphics.views.AnimationsKt;
import com.squareup.cash.graphics.views.effect.TortoiseCardEffectKt;
import com.squareup.cash.paymentpad.viewmodels.HomeViewModel;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewModel;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewKt;
import com.squareup.cash.payments.views.UtilKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class PagerKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$11;
    public final /* synthetic */ Object f$12;
    public final /* synthetic */ Object f$13;
    public final /* synthetic */ Object f$14;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ boolean f$8;

    public /* synthetic */ PagerKt$$ExternalSyntheticLambda6(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, Alignment.Horizontal horizontal, SnapFlingBehavior snapFlingBehavior, boolean z, NestedScrollConnection nestedScrollConnection, SnapPosition$Start snapPosition$Start, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = pagerState;
        this.f$1 = modifier;
        this.f$2 = paddingValues;
        this.f$3 = pageSize;
        this.f$6 = horizontal;
        this.f$7 = snapFlingBehavior;
        this.f$8 = z;
        this.f$11 = nestedScrollConnection;
        this.f$12 = snapPosition$Start;
        this.f$13 = androidEdgeEffectOverscrollEffect;
        this.f$14 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Function1 function1;
        int i = this.$r8$classId;
        Object obj4 = this.f$14;
        Object obj5 = this.f$13;
        Object obj6 = this.f$12;
        Object obj7 = this.f$11;
        Object obj8 = this.f$7;
        Object obj9 = this.f$6;
        Object obj10 = this.f$3;
        Object obj11 = this.f$2;
        Object obj12 = this.f$1;
        Object obj13 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                PagerKt.m330VerticalPager8jOkeI((PagerState) obj13, (Modifier) obj12, (PaddingValues) obj11, (PageSize) obj10, (Alignment.Horizontal) obj9, (SnapFlingBehavior) obj8, this.f$8, (NestedScrollConnection) obj7, (SnapPosition$Start) obj6, (AndroidEdgeEffectOverscrollEffect) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(100663297));
                return Unit.INSTANCE;
            default:
                PaymentPadTheme paymentPadTheme = (PaymentPadTheme) obj13;
                SplashScreenAnimationObserver splashScreenAnimationObserver = (SplashScreenAnimationObserver) obj12;
                HomeViewModel homeViewModel = (HomeViewModel) obj11;
                Function1 function12 = (Function1) obj10;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj9;
                UiScope uiScope = (UiScope) obj8;
                DynamicColorConfiguration dynamicColorConfiguration = (DynamicColorConfiguration) obj7;
                String str = (String) obj6;
                Painter painter = (Painter) obj5;
                String str2 = (String) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    int ordinal = paymentPadTheme.ordinal();
                    if (ordinal == 3) {
                        gapComposer.startReplaceGroup(-2133756084);
                        AnimationsKt.GlitterBackground(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    } else if (ordinal != 4) {
                        gapComposer.startReplaceGroup(-1721817593);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-2133753971);
                        TortoiseCardEffectKt.TortoiseBackground(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    }
                    splashScreenAnimationObserver.TranslationYObserver(gapComposer, 0);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    boolean changed = gapComposer.changed(splashScreenAnimationObserver);
                    Object rememberedValue = gapComposer.rememberedValue();
                    Object obj14 = Composer.Companion.Empty;
                    if (changed || rememberedValue == obj14) {
                        rememberedValue = new HomeViewKt$$ExternalSyntheticLambda10(splashScreenAnimationObserver, 0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier offset = OffsetKt.offset(fillMaxSize, (Function1) rememberedValue);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, offset);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(function0);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    boolean z = this.f$8;
                    if (z) {
                        obj3 = obj14;
                        function1 = function12;
                        gapComposer.startReplaceGroup(-931667553);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-935210760);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        long j = colors.component.titleBar.keypad.icon.pressed;
                        ProvidableCompositionLocal providableCompositionLocal = RippleKt.LocalRippleConfiguration;
                        RippleConfiguration rippleConfiguration = (RippleConfiguration) gapComposer.consume(providableCompositionLocal);
                        boolean changed2 = gapComposer.changed(rippleConfiguration);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue2 == obj14) {
                            rememberedValue2 = RippleConfiguration.m3399copyDxMtmZc$default(rippleConfiguration, j, null, 2);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        ProvidedValue defaultProvidedValue$runtime = providableCompositionLocal.defaultProvidedValue$runtime((RippleConfiguration) rememberedValue2);
                        obj3 = obj14;
                        function1 = function12;
                        Updater.CompositionLocalProvider(defaultProvidedValue$runtime, Expect_jvmKt.rememberComposableLambda(176779080, new DateInputKt$$ExternalSyntheticLambda1(homeViewModel, uiScope, dynamicColorConfiguration, function12, elementBoundsRegistry, str, painter, str2), gapComposer), gapComposer, 56);
                        gapComposer.end(false);
                    }
                    if (z) {
                        gapComposer.startReplaceGroup(-931622789);
                        TabToolbarsKt.SharedTabToolbarSpacer(6, 0, gapComposer, SizeKt.fillMaxWidth(companion, 1.0f));
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-931526689);
                        gapComposer.end(false);
                    }
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = CashInsetsKt.LocalCashInsets;
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer).systemBars;
                    ProvidableCompositionLocal providableCompositionLocal2 = CashInsetsKt.LocalCashInsets;
                    CashWindowInsets cashWindowInsets = ((CashComposeInsets) gapComposer.consume(providableCompositionLocal2)).floatingBottomNavigation;
                    CashWindowInsets cashWindowInsets2 = ((CashComposeInsets) gapComposer.consume(providableCompositionLocal2)).inlineBottomNavigation;
                    boolean changed3 = gapComposer.changed(androidWindowInsets) | gapComposer.changed(cashWindowInsets) | gapComposer.changed(cashWindowInsets2);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue3 == obj3) {
                        rememberedValue3 = new UnionInsets(new UnionInsets(androidWindowInsets, cashWindowInsets), cashWindowInsets2);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, Request$Priority$EnumUnboxingLocalUtility.m(1.0f, OffsetKt.consumeWindowInsets(SpacerKt.padding(companion, SpacerKt.asPaddingValues((WindowInsets) rememberedValue3, gapComposer)), Arrangement$End$1.current(gapComposer).systemBars), true));
                    HomeViewModel.Ready ready = (HomeViewModel.Ready) homeViewModel;
                    MainPaymentPadViewModel mainPaymentPadViewModel = ready.mainPaymentPad;
                    boolean z2 = ready.hapticsImprovementsEnabled;
                    boolean changed4 = gapComposer.changed(function1);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed4 || rememberedValue4 == obj3) {
                        rememberedValue4 = new UtilKt$$ExternalSyntheticLambda0(9, function1);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    MainPaymentPadViewKt.MainPaymentPad(mainPaymentPadViewModel, (Function1) rememberedValue4, z2, m, elementBoundsRegistry, gapComposer, 0, 0);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PagerKt$$ExternalSyntheticLambda6(PaymentPadTheme paymentPadTheme, SplashScreenAnimationObserver splashScreenAnimationObserver, boolean z, HomeViewModel homeViewModel, Function1 function1, ElementBoundsRegistry elementBoundsRegistry, UiScope uiScope, DynamicColorConfiguration dynamicColorConfiguration, String str, Painter painter, String str2) {
        this.f$0 = paymentPadTheme;
        this.f$1 = splashScreenAnimationObserver;
        this.f$8 = z;
        this.f$2 = homeViewModel;
        this.f$3 = function1;
        this.f$6 = elementBoundsRegistry;
        this.f$7 = uiScope;
        this.f$11 = dynamicColorConfiguration;
        this.f$12 = str;
        this.f$13 = painter;
        this.f$14 = str2;
    }
}
