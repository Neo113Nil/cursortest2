package com.squareup.cash.core.navigationcontainer;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.SharedTransitionScopeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.datastore.core.SimpleActor;
import app.cash.broadway.ui.compose.ChromeConfigAggregator;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeConfigKt$$ExternalSyntheticLambda0;
import app.cash.broadway.ui.compose.ComposeUiViewKt;
import app.cash.broadway.ui.compose.SecureScreenKt;
import app.cash.broadway.ui.compose.ToolbarConfig;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.core.navigationcontainer.models.ContainerUiModel;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.moneybot.views.shared.MoneybotToolbarSharedKey$Leading;
import com.squareup.cash.moneybot.views.shared.MoneybotToolbarSharedKey$Trailing;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.support.screenshot.ScreenshotViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.MoneybotToolbarSharedElementConfig;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes.dex */
public final /* synthetic */ class UiContainer$$ExternalSyntheticLambda18 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ UiContainer f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ ContainerUiModel f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ UiContainer$$ExternalSyntheticLambda18(NavigationModel.Ready.OverlayLocation overlayLocation, UiContainer uiContainer, ImmutableList immutableList, NavigationModel.Ready.FullScreenLocation fullScreenLocation, ContainerUiModel containerUiModel, SaveableStateHolderImpl saveableStateHolderImpl, NavigationModel.Ready ready) {
        this.f$0 = overlayLocation;
        this.f$1 = uiContainer;
        this.f$2 = immutableList;
        this.f$3 = fullScreenLocation;
        this.f$4 = containerUiModel;
        this.f$5 = saveableStateHolderImpl;
        this.f$6 = ready;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$6;
        Object obj4 = this.f$5;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                final NavigationModel.Ready.OverlayLocation overlayLocation = (NavigationModel.Ready.OverlayLocation) obj7;
                ImmutableList immutableList = (ImmutableList) obj6;
                NavigationModel.Ready.FullScreenLocation fullScreenLocation = (NavigationModel.Ready.FullScreenLocation) obj5;
                final SaveableStateHolder saveableStateHolder = (SaveableStateHolder) obj4;
                NavigationModel.Ready ready = (NavigationModel.Ready) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
                    gapComposer.startReplaceGroup(1257036176);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    if (overlayLocation != null) {
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new Matcher$$ExternalSyntheticLambda9(18);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        m177backgroundbw27NRU = m177backgroundbw27NRU.then(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue));
                    }
                    gapComposer.end(false);
                    final UiContainer uiContainer = this.f$1;
                    SharedTransitionScopeKt.SharedTransitionLayout(m177backgroundbw27NRU, Expect_jvmKt.rememberComposableLambda(-44414743, new ChromeConfigKt$$ExternalSyntheticLambda0(uiContainer, immutableList, fullScreenLocation, this.f$4, overlayLocation, saveableStateHolder, ready, 1), gapComposer), gapComposer, 48, 0);
                    SharedTransitionScopeKt.SharedTransitionLayout(null, Expect_jvmKt.rememberComposableLambda(960887456, new Function3() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj8, Object obj9, Object obj10) {
                            final SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj8;
                            Composer composer2 = (Composer) obj9;
                            int intValue2 = ((Integer) obj10).intValue();
                            sharedTransitionScope.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer2).changed(sharedTransitionScope) ? 4 : 2;
                            }
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                Modifier fillMaxSize2 = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                if (rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new Matcher$$ExternalSyntheticLambda9(20);
                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                }
                                Function1 function1 = (Function1) rememberedValue2;
                                Object rememberedValue3 = gapComposer2.rememberedValue();
                                if (rememberedValue3 == neverEqualPolicy) {
                                    rememberedValue3 = new Matcher$$ExternalSyntheticLambda9(21);
                                    gapComposer2.updateRememberedValue(rememberedValue3);
                                }
                                final UiContainer uiContainer2 = uiContainer;
                                final SaveableStateHolder saveableStateHolder2 = saveableStateHolder;
                                AnimatedContentKt.AnimatedContent(NavigationModel.Ready.OverlayLocation.this, fillMaxSize2, function1, null, null, (Function1) rememberedValue3, Expect_jvmKt.rememberComposableLambda(-848430944, new Function4() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda30
                                    @Override // kotlin.jvm.functions.Function4
                                    public final Object invoke(Object obj11, Object obj12, Object obj13, Object obj14) {
                                        AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj11;
                                        NavigationModel.Ready.OverlayLocation overlayLocation2 = (NavigationModel.Ready.OverlayLocation) obj12;
                                        Composer composer3 = (Composer) obj13;
                                        ((Integer) obj14).getClass();
                                        animatedContentScopeImpl.getClass();
                                        if (overlayLocation2 == null) {
                                            return Unit.INSTANCE;
                                        }
                                        ProvidedValue defaultProvidedValue$runtime = ComposeUiViewKt.LocalInComposeContainer.defaultProvidedValue$runtime(Boolean.TRUE);
                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ChromeConfigKt.LocalChromeConfigAggregator;
                                        UiContainer uiContainer3 = UiContainer.this;
                                        Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, staticProvidableCompositionLocal.defaultProvidedValue$runtime(uiContainer3.overlayConfigAggregator), SecureScreenKt.LocalSecureScreenAggregator.defaultProvidedValue$runtime(uiContainer3.secureScreenAggregator), SheetKt.getLocalSheetInOverlayLayer().defaultProvidedValue$runtime(Boolean.FALSE)}, Expect_jvmKt.rememberComposableLambda(1385782240, new ScreenshotViewKt$$ExternalSyntheticLambda5(uiContainer3, overlayLocation2, animatedContentScopeImpl, sharedTransitionScope, saveableStateHolder2, 2), composer3), composer3, 56);
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer2), gapComposer2, 1769904, 24);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 48, 1);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                NavigationModel.Ready.Swipe swipe = (NavigationModel.Ready.Swipe) obj7;
                ChromeConfigAggregator chromeConfigAggregator = (ChromeConfigAggregator) obj6;
                ChromeConfigAggregator chromeConfigAggregator2 = (ChromeConfigAggregator) obj5;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj4;
                SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    int ordinal = ((NavigationModel.Ready.Swipe.Page) swipe.activePage.value).ordinal();
                    if (ordinal == 0) {
                        chromeConfigAggregator = chromeConfigAggregator2;
                    } else if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ToolbarConfig toolbarConfig = chromeConfigAggregator.getMergedConfig().toolbarConfig;
                    if (toolbarConfig == null) {
                        gapComposer2.startReplaceGroup(815445933);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(815445934);
                        TabToolbarInternalViewModel tabToolbarInternalViewModel = this.f$4.chrome.tabToolbarViewModel;
                        ElementBoundsRegistry elementBoundsRegistry = this.f$1.elementBoundsRegistry;
                        MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig = toolbarConfig.moneybotSharedElementKeys != null ? new MoneybotToolbarSharedElementConfig(animatedContentScopeImpl, sharedTransitionScope, MoneybotToolbarSharedKey$Leading.INSTANCE, MoneybotToolbarSharedKey$Trailing.INSTANCE) : null;
                        ToolbarConfig.SearchSharedElementKeys searchSharedElementKeys = toolbarConfig.searchSharedElementKeys;
                        UiContainerKt.ContainerTabToolbar(toolbarConfig, tabToolbarInternalViewModel, elementBoundsRegistry, moneybotToolbarSharedElementConfig, searchSharedElementKeys != null ? new SimpleActor(animatedContentScopeImpl, sharedTransitionScope, searchSharedElementKeys.getSearchBoundsKey(), searchSharedElementKeys.getSearchIconKey()) : null, BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.TopCenter), null, gapComposer2, 36872, 64);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ UiContainer$$ExternalSyntheticLambda18(NavigationModel.Ready.Swipe swipe, ChromeConfigAggregator chromeConfigAggregator, ChromeConfigAggregator chromeConfigAggregator2, ContainerUiModel containerUiModel, UiContainer uiContainer, AnimatedContentScopeImpl animatedContentScopeImpl, SharedTransitionScope sharedTransitionScope) {
        this.f$0 = swipe;
        this.f$2 = chromeConfigAggregator;
        this.f$3 = chromeConfigAggregator2;
        this.f$4 = containerUiModel;
        this.f$1 = uiContainer;
        this.f$5 = animatedContentScopeImpl;
        this.f$6 = sharedTransitionScope;
    }
}
