package app.cash.broadway.ui.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.SharedTransitionScopeKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.core.graphics.Insets;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.UpdatesWindowFlags$TabConfig;
import app.cash.broadway.ui.compose.ChromeConfig$Merged;
import app.cash.broadway.ui.compose.ChromeConfigAggregator;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ComposeUiViewKt;
import app.cash.broadway.ui.compose.FullScreenKt;
import app.cash.broadway.ui.compose.OrientationKt;
import app.cash.broadway.ui.compose.SecureScreenKt;
import app.cash.broadway.ui.compose.ToolbarConfig;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.u4$$ExternalSyntheticLambda1;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage$$ExternalSyntheticLambda0;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.InAppNotificationModel;
import com.squareup.cash.appmessages.TooltipAppMessageViewEvent;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.appmessages.views.RealAppMessageImageLoader;
import com.squareup.cash.appmessages.views.RealTooltipTargetLoadedCallbackRegistry;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CashWindowInsets;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import com.squareup.cash.core.navigationcontainer.models.ContainerUiModel;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewEvent;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$TabTreatment;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$1$1;
import com.squareup.cash.support.screenshot.ScreenshotViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.SharedToolbarSwipeGeometry;
import com.squareup.cash.tabs.views.SharedToolbarSwipePalette;
import com.squareup.cash.ui.CashInsets;
import com.squareup.cash.ui.MainContainerDelegate$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.util.Strings;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes.dex */
public final /* synthetic */ class ChromeConfigKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ ChromeConfigKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = obj7;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig;
        Boolean bool;
        Boolean bool2;
        Float f;
        ToolbarConfig toolbarConfig;
        final ChromeConfigNode chromeConfigNode;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj4 = this.f$6;
        Object obj5 = this.f$5;
        Object obj6 = this.f$4;
        Object obj7 = this.f$3;
        Object obj8 = this.f$2;
        Object obj9 = this.f$1;
        Object obj10 = this.f$0;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig2 = (UpdatesWindowFlags$TabConfig) obj10;
                final ChromeSystemIconColor chromeSystemIconColor = (ChromeSystemIconColor) obj9;
                final ChromeSystemIconColor chromeSystemIconColor2 = (ChromeSystemIconColor) obj8;
                Boolean bool3 = (Boolean) obj7;
                Boolean bool4 = (Boolean) obj6;
                ToolbarConfig toolbarConfig2 = (ToolbarConfig) obj5;
                Float f2 = (Float) obj4;
                UiScope uiScope = (UiScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    final EnterExitState enterExitState = (EnterExitState) uiScope.$$delegate_0.getTransition().targetState$delegate.getValue();
                    final ChromeConfigAggregator chromeConfigAggregator = (ChromeConfigAggregator) gapComposer.consume(ChromeConfigKt.LocalChromeConfigAggregator);
                    final ChromeConfigAggregator chromeConfigAggregator2 = (ChromeConfigAggregator) gapComposer.consume(ChromeConfigKt.LocalChromeToolbarConfigAggregator);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        ChromeConfigNode chromeConfigNode2 = new ChromeConfigNode(enterExitState, updatesWindowFlags$TabConfig2, chromeSystemIconColor, chromeSystemIconColor2, bool3, bool4, toolbarConfig2, f2);
                        updatesWindowFlags$TabConfig = updatesWindowFlags$TabConfig2;
                        bool = bool3;
                        bool2 = bool4;
                        f = f2;
                        gapComposer.updateRememberedValue(chromeConfigNode2);
                        rememberedValue = chromeConfigNode2;
                    } else {
                        updatesWindowFlags$TabConfig = updatesWindowFlags$TabConfig2;
                        bool = bool3;
                        bool2 = bool4;
                        f = f2;
                    }
                    ChromeConfigNode chromeConfigNode3 = (ChromeConfigNode) rememberedValue;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ChromeConfigNode(enterExitState, null, null, null, null, null, toolbarConfig2, null);
                        toolbarConfig = toolbarConfig2;
                        gapComposer.updateRememberedValue(rememberedValue2);
                    } else {
                        toolbarConfig = toolbarConfig2;
                    }
                    final ChromeConfigNode chromeConfigNode4 = (ChromeConfigNode) rememberedValue2;
                    boolean changedInstance = gapComposer.changedInstance(chromeConfigNode3) | gapComposer.changed(enterExitState.ordinal()) | gapComposer.changedInstance(updatesWindowFlags$TabConfig) | gapComposer.changed(chromeSystemIconColor == null ? -1 : chromeSystemIconColor.ordinal()) | gapComposer.changed(chromeSystemIconColor2 == null ? -1 : chromeSystemIconColor2.ordinal()) | gapComposer.changed(bool) | gapComposer.changed(bool2) | gapComposer.changedInstance(toolbarConfig) | gapComposer.changed(f) | gapComposer.changedInstance(chromeConfigNode4);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        final Float f3 = f;
                        final Boolean bool5 = bool2;
                        final Boolean bool6 = bool;
                        final ToolbarConfig toolbarConfig3 = toolbarConfig;
                        chromeConfigNode = chromeConfigNode3;
                        final UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig3 = updatesWindowFlags$TabConfig;
                        rememberedValue3 = new Function0() { // from class: app.cash.broadway.ui.compose.ChromeConfigKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ChromeConfigNode chromeConfigNode5 = ChromeConfigNode.this;
                                EnterExitState enterExitState2 = enterExitState;
                                UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig4 = updatesWindowFlags$TabConfig3;
                                ChromeSystemIconColor chromeSystemIconColor3 = chromeSystemIconColor;
                                ChromeSystemIconColor chromeSystemIconColor4 = chromeSystemIconColor2;
                                Boolean bool7 = bool6;
                                Boolean bool8 = bool5;
                                ToolbarConfig toolbarConfig4 = toolbarConfig3;
                                chromeConfigNode5.update(enterExitState2, updatesWindowFlags$TabConfig4, chromeSystemIconColor3, chromeSystemIconColor4, bool7, bool8, toolbarConfig4, f3);
                                chromeConfigNode4.update(enterExitState2, null, null, null, null, null, toolbarConfig4, null);
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue3);
                    } else {
                        chromeConfigNode = chromeConfigNode3;
                    }
                    Updater.SideEffect((Function0) rememberedValue3, gapComposer);
                    boolean changedInstance2 = gapComposer.changedInstance(chromeConfigAggregator) | gapComposer.changedInstance(chromeConfigNode);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new Function1() { // from class: app.cash.broadway.ui.compose.ChromeConfigKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                int i4 = i3;
                                final ChromeConfigNode chromeConfigNode5 = chromeConfigNode;
                                final ChromeConfigAggregator chromeConfigAggregator3 = chromeConfigAggregator;
                                DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj11;
                                switch (i4) {
                                    case 0:
                                        disposableEffectScope.getClass();
                                        chromeConfigAggregator3.getClass();
                                        chromeConfigNode5.getClass();
                                        chromeConfigAggregator3.nodes.add(chromeConfigNode5);
                                        Function0 function0 = chromeConfigAggregator3.configChangedCallback;
                                        chromeConfigNode5.configChangedCallback = function0;
                                        if (function0 != null) {
                                            function0.invoke();
                                        }
                                        final int i5 = 0;
                                        return new DisposableEffectResult() { // from class: app.cash.broadway.ui.compose.ChromeConfigKt$ChromeConfig$lambda$2$3$0$$inlined$onDispose$1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public final void dispose() {
                                                int i6 = i5;
                                                ChromeConfigNode chromeConfigNode6 = chromeConfigNode5;
                                                ChromeConfigAggregator chromeConfigAggregator4 = chromeConfigAggregator3;
                                                switch (i6) {
                                                    case 0:
                                                        chromeConfigAggregator4.getClass();
                                                        chromeConfigNode6.getClass();
                                                        chromeConfigAggregator4.nodes.remove(chromeConfigNode6);
                                                        chromeConfigNode6.configChangedCallback = null;
                                                        Function0 function02 = chromeConfigAggregator4.configChangedCallback;
                                                        if (function02 != null) {
                                                            function02.invoke();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (chromeConfigAggregator4 != null) {
                                                            chromeConfigNode6.getClass();
                                                            chromeConfigAggregator4.nodes.remove(chromeConfigNode6);
                                                            chromeConfigNode6.configChangedCallback = null;
                                                            Function0 function03 = chromeConfigAggregator4.configChangedCallback;
                                                            if (function03 != null) {
                                                                function03.invoke();
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                    default:
                                        disposableEffectScope.getClass();
                                        if (chromeConfigAggregator3 != null) {
                                            chromeConfigNode5.getClass();
                                            chromeConfigAggregator3.nodes.add(chromeConfigNode5);
                                            Function0 function02 = chromeConfigAggregator3.configChangedCallback;
                                            chromeConfigNode5.configChangedCallback = function02;
                                            if (function02 != null) {
                                                function02.invoke();
                                            }
                                        }
                                        final int i6 = 1;
                                        return new DisposableEffectResult() { // from class: app.cash.broadway.ui.compose.ChromeConfigKt$ChromeConfig$lambda$2$3$0$$inlined$onDispose$1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public final void dispose() {
                                                int i62 = i6;
                                                ChromeConfigNode chromeConfigNode6 = chromeConfigNode5;
                                                ChromeConfigAggregator chromeConfigAggregator4 = chromeConfigAggregator3;
                                                switch (i62) {
                                                    case 0:
                                                        chromeConfigAggregator4.getClass();
                                                        chromeConfigNode6.getClass();
                                                        chromeConfigAggregator4.nodes.remove(chromeConfigNode6);
                                                        chromeConfigNode6.configChangedCallback = null;
                                                        Function0 function022 = chromeConfigAggregator4.configChangedCallback;
                                                        if (function022 != null) {
                                                            function022.invoke();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (chromeConfigAggregator4 != null) {
                                                            chromeConfigNode6.getClass();
                                                            chromeConfigAggregator4.nodes.remove(chromeConfigNode6);
                                                            chromeConfigNode6.configChangedCallback = null;
                                                            Function0 function03 = chromeConfigAggregator4.configChangedCallback;
                                                            if (function03 != null) {
                                                                function03.invoke();
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                }
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    Updater.DisposableEffect(chromeConfigAggregator, chromeConfigNode, (Function1) rememberedValue4, gapComposer);
                    boolean changedInstance3 = gapComposer.changedInstance(chromeConfigAggregator2) | gapComposer.changedInstance(chromeConfigNode4);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new Function1() { // from class: app.cash.broadway.ui.compose.ChromeConfigKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                int i4 = i2;
                                final ChromeConfigNode chromeConfigNode5 = chromeConfigNode4;
                                final ChromeConfigAggregator chromeConfigAggregator3 = chromeConfigAggregator2;
                                DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj11;
                                switch (i4) {
                                    case 0:
                                        disposableEffectScope.getClass();
                                        chromeConfigAggregator3.getClass();
                                        chromeConfigNode5.getClass();
                                        chromeConfigAggregator3.nodes.add(chromeConfigNode5);
                                        Function0 function0 = chromeConfigAggregator3.configChangedCallback;
                                        chromeConfigNode5.configChangedCallback = function0;
                                        if (function0 != null) {
                                            function0.invoke();
                                        }
                                        final int i5 = 0;
                                        return new DisposableEffectResult() { // from class: app.cash.broadway.ui.compose.ChromeConfigKt$ChromeConfig$lambda$2$3$0$$inlined$onDispose$1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public final void dispose() {
                                                int i62 = i5;
                                                ChromeConfigNode chromeConfigNode6 = chromeConfigNode5;
                                                ChromeConfigAggregator chromeConfigAggregator4 = chromeConfigAggregator3;
                                                switch (i62) {
                                                    case 0:
                                                        chromeConfigAggregator4.getClass();
                                                        chromeConfigNode6.getClass();
                                                        chromeConfigAggregator4.nodes.remove(chromeConfigNode6);
                                                        chromeConfigNode6.configChangedCallback = null;
                                                        Function0 function022 = chromeConfigAggregator4.configChangedCallback;
                                                        if (function022 != null) {
                                                            function022.invoke();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (chromeConfigAggregator4 != null) {
                                                            chromeConfigNode6.getClass();
                                                            chromeConfigAggregator4.nodes.remove(chromeConfigNode6);
                                                            chromeConfigNode6.configChangedCallback = null;
                                                            Function0 function03 = chromeConfigAggregator4.configChangedCallback;
                                                            if (function03 != null) {
                                                                function03.invoke();
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                    default:
                                        disposableEffectScope.getClass();
                                        if (chromeConfigAggregator3 != null) {
                                            chromeConfigNode5.getClass();
                                            chromeConfigAggregator3.nodes.add(chromeConfigNode5);
                                            Function0 function02 = chromeConfigAggregator3.configChangedCallback;
                                            chromeConfigNode5.configChangedCallback = function02;
                                            if (function02 != null) {
                                                function02.invoke();
                                            }
                                        }
                                        final int i6 = 1;
                                        return new DisposableEffectResult() { // from class: app.cash.broadway.ui.compose.ChromeConfigKt$ChromeConfig$lambda$2$3$0$$inlined$onDispose$1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public final void dispose() {
                                                int i62 = i6;
                                                ChromeConfigNode chromeConfigNode6 = chromeConfigNode5;
                                                ChromeConfigAggregator chromeConfigAggregator4 = chromeConfigAggregator3;
                                                switch (i62) {
                                                    case 0:
                                                        chromeConfigAggregator4.getClass();
                                                        chromeConfigNode6.getClass();
                                                        chromeConfigAggregator4.nodes.remove(chromeConfigNode6);
                                                        chromeConfigNode6.configChangedCallback = null;
                                                        Function0 function022 = chromeConfigAggregator4.configChangedCallback;
                                                        if (function022 != null) {
                                                            function022.invoke();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (chromeConfigAggregator4 != null) {
                                                            chromeConfigNode6.getClass();
                                                            chromeConfigAggregator4.nodes.remove(chromeConfigNode6);
                                                            chromeConfigNode6.configChangedCallback = null;
                                                            Function0 function03 = chromeConfigAggregator4.configChangedCallback;
                                                            if (function03 != null) {
                                                                function03.invoke();
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                }
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    Updater.DisposableEffect(chromeConfigAggregator2, chromeConfigNode4, (Function1) rememberedValue5, gapComposer);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                final UiContainer uiContainer = (UiContainer) obj10;
                final ImmutableList immutableList = (ImmutableList) obj9;
                NavigationModel.Ready.FullScreenLocation fullScreenLocation = (NavigationModel.Ready.FullScreenLocation) obj8;
                final ContainerUiModel containerUiModel = (ContainerUiModel) obj7;
                ContainerUiModel.Chrome chrome = containerUiModel.chrome;
                final NavigationModel.Ready.OverlayLocation overlayLocation = (NavigationModel.Ready.OverlayLocation) obj6;
                final SaveableStateHolder saveableStateHolder = (SaveableStateHolder) obj5;
                final NavigationModel.Ready ready = (NavigationModel.Ready) obj4;
                final SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                sharedTransitionScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(sharedTransitionScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    HeartBeatInfoStorage$$ExternalSyntheticLambda0 access$asTransitionSpec = UiContainerKt.access$asTransitionSpec(uiContainer.broadway, immutableList, gapComposer2);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    boolean changed = gapComposer2.changed(access$asTransitionSpec) | gapComposer2.changedInstance(uiContainer);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new Recomposer$$ExternalSyntheticLambda4(25, access$asTransitionSpec, uiContainer);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    Function1 function1 = (Function1) rememberedValue6;
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new Matcher$$ExternalSyntheticLambda9(19);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    AnimatedContentKt.AnimatedContent(fullScreenLocation, fillMaxSize, function1, null, null, (Function1) rememberedValue7, Expect_jvmKt.rememberComposableLambda(1060931378, new Function4() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj11, Object obj12, Object obj13, Object obj14) {
                            final AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj11;
                            final NavigationModel.Ready.FullScreenLocation fullScreenLocation2 = (NavigationModel.Ready.FullScreenLocation) obj12;
                            Composer composer3 = (Composer) obj13;
                            ((Integer) obj14).getClass();
                            animatedContentScopeImpl.getClass();
                            fullScreenLocation2.getClass();
                            ProvidedValue defaultProvidedValue$runtime = ComposeUiViewKt.LocalInComposeContainer.defaultProvidedValue$runtime(Boolean.TRUE);
                            ProvidedValue defaultProvidedValue$runtime2 = ComposeUiViewKt.LocalOverlayActive.defaultProvidedValue$runtime(Boolean.valueOf(NavigationModel.Ready.OverlayLocation.this != null));
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ChromeConfigKt.LocalChromeConfigAggregator;
                            final UiContainer uiContainer2 = uiContainer;
                            ProvidedValue[] providedValueArr = {defaultProvidedValue$runtime, defaultProvidedValue$runtime2, staticProvidableCompositionLocal.defaultProvidedValue$runtime(uiContainer2.fullScreenConfigAggregator), FullScreenKt.LocalFullScreenAggregator.defaultProvidedValue$runtime(uiContainer2.fullScreenAggregator), OrientationKt.LocalOrientationAggregator.defaultProvidedValue$runtime(uiContainer2.orientationAggregator), SecureScreenKt.LocalSecureScreenAggregator.defaultProvidedValue$runtime(uiContainer2.secureScreenAggregator)};
                            final ImmutableList immutableList2 = immutableList;
                            final SharedTransitionScope sharedTransitionScope2 = sharedTransitionScope;
                            final SaveableStateHolder saveableStateHolder2 = saveableStateHolder;
                            final NavigationModel.Ready ready2 = ready;
                            final ContainerUiModel containerUiModel2 = containerUiModel;
                            Updater.CompositionLocalProvider(providedValueArr, Expect_jvmKt.rememberComposableLambda(1602063346, new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda32
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj15, Object obj16) {
                                    float floatValue;
                                    float floatValue2;
                                    final ComposableLambdaImpl composableLambdaImpl;
                                    boolean z;
                                    Object obj17;
                                    NavigationModel.Ready.Swipe swipe;
                                    ContainerUiModel containerUiModel3;
                                    UiContainer uiContainer3;
                                    boolean z2;
                                    NavigationModel.Ready.Swipe swipe2 = ready2.swipe;
                                    Composer composer4 = (Composer) obj15;
                                    int intValue3 = ((Integer) obj16).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer4;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        final NavigationModel.Ready.FullScreenLocation fullScreenLocation3 = NavigationModel.Ready.FullScreenLocation.this;
                                        boolean z3 = !(fullScreenLocation3.screen instanceof InitialScreenPlaceholder);
                                        boolean changed2 = gapComposer3.changed(z3);
                                        Object rememberedValue8 = gapComposer3.rememberedValue();
                                        Object obj18 = Composer.Companion.Empty;
                                        if (changed2 || rememberedValue8 == obj18) {
                                            rememberedValue8 = new u4$$ExternalSyntheticLambda1(z3, 1);
                                            gapComposer3.updateRememberedValue(rememberedValue8);
                                        }
                                        Strings.ReportDrawnWhen((Function0) rememberedValue8, gapComposer3, 0);
                                        Boolean valueOf = Boolean.valueOf(z3);
                                        boolean changed3 = gapComposer3.changed(z3);
                                        final UiContainer uiContainer4 = uiContainer2;
                                        boolean changedInstance4 = changed3 | gapComposer3.changedInstance(uiContainer4) | gapComposer3.changedInstance(fullScreenLocation3);
                                        Object rememberedValue9 = gapComposer3.rememberedValue();
                                        if (changedInstance4 || rememberedValue9 == obj18) {
                                            rememberedValue9 = new UiContainer$Content$2$1$2$3$1$2$1(z3, uiContainer4, fullScreenLocation3, null);
                                            gapComposer3.updateRememberedValue(rememberedValue9);
                                        }
                                        Updater.LaunchedEffect(gapComposer3, valueOf, (Function2) rememberedValue9);
                                        boolean z4 = fullScreenLocation3.showTabs;
                                        final AnimatedContentScopeImpl animatedContentScopeImpl2 = animatedContentScopeImpl;
                                        final SharedTransitionScope sharedTransitionScope3 = sharedTransitionScope2;
                                        final SaveableStateHolder saveableStateHolder3 = saveableStateHolder2;
                                        if (z4) {
                                            final ImmutableList immutableList3 = immutableList2;
                                            if (!immutableList3.isEmpty()) {
                                                gapComposer3.startReplaceGroup(1394591459);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion);
                                                ComposeUiNode.Companion.getClass();
                                                Function0 function0 = ComposeUiNode.Companion.Constructor;
                                                if (gapComposer3.applier == null) {
                                                    Updater.invalidApplier();
                                                    throw null;
                                                }
                                                gapComposer3.startReusableNode();
                                                if (gapComposer3.inserting) {
                                                    gapComposer3.createNode(function0);
                                                } else {
                                                    gapComposer3.useNode();
                                                }
                                                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                                Object rememberedValue10 = gapComposer3.rememberedValue();
                                                Insets insets = Insets.NONE;
                                                if (rememberedValue10 == obj18) {
                                                    rememberedValue10 = Updater.mutableStateOf$default(insets);
                                                    gapComposer3.updateRememberedValue(rememberedValue10);
                                                }
                                                final MutableState mutableState = (MutableState) rememberedValue10;
                                                Object rememberedValue11 = gapComposer3.rememberedValue();
                                                if (rememberedValue11 == obj18) {
                                                    rememberedValue11 = Updater.mutableStateOf$default(insets);
                                                    gapComposer3.updateRememberedValue(rememberedValue11);
                                                }
                                                final MutableState mutableState2 = (MutableState) rememberedValue11;
                                                Object obj19 = (Insets) mutableState.getValue();
                                                Object obj20 = (Insets) mutableState2.getValue();
                                                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = UiContainerKt.LocalLegacySheetScope;
                                                boolean changed4 = gapComposer3.changed(obj19) | gapComposer3.changed(obj20);
                                                Object rememberedValue12 = gapComposer3.rememberedValue();
                                                if (changed4 || rememberedValue12 == obj18) {
                                                    rememberedValue12 = CashInsets.Companion.of(new Pair(CashInsets.Type.FloatingBottomNavigation, obj19), new Pair(CashInsets.Type.InlineBottomNavigation, obj20));
                                                    gapComposer3.updateRememberedValue(rememberedValue12);
                                                }
                                                CashInsets cashInsets = (CashInsets) rememberedValue12;
                                                Object rememberedValue13 = gapComposer3.rememberedValue();
                                                if (rememberedValue13 == obj18) {
                                                    rememberedValue13 = new CashComposeInsets();
                                                    gapComposer3.updateRememberedValue(rememberedValue13);
                                                }
                                                final CashComposeInsets cashComposeInsets = (CashComposeInsets) rememberedValue13;
                                                cashComposeInsets.getClass();
                                                cashInsets.getClass();
                                                CashWindowInsets cashWindowInsets = cashComposeInsets.cashFloatingBottomNavigation;
                                                cashWindowInsets.getClass();
                                                cashWindowInsets.insets$delegate.setValue(cashInsets.get(cashWindowInsets.f1116type));
                                                CashWindowInsets cashWindowInsets2 = cashComposeInsets.cashInlineBottomNavigation;
                                                cashWindowInsets2.getClass();
                                                cashWindowInsets2.insets$delegate.setValue(cashInsets.get(cashWindowInsets2.f1116type));
                                                ChromeConfigAggregator chromeConfigAggregator3 = uiContainer4.fullScreenConfigAggregator;
                                                RealImageLoader realImageLoader = uiContainer4.imageLoader;
                                                ChromeConfig$Merged mergedConfig = chromeConfigAggregator3.getMergedConfig();
                                                Boolean bool7 = mergedConfig.bottomNavigationVisible;
                                                Boolean bool8 = Boolean.FALSE;
                                                if (Intrinsics.areEqual(bool7, bool8)) {
                                                    floatValue = RecyclerView.DECELERATION_RATE;
                                                } else {
                                                    Float f4 = mergedConfig.bottomNavigationVisibilityPercent;
                                                    floatValue = f4 != null ? f4.floatValue() : 1.0f;
                                                }
                                                ChromeConfig$Merged mergedConfig2 = uiContainer4.overlayConfigAggregator.getMergedConfig();
                                                if (Intrinsics.areEqual(mergedConfig2.bottomNavigationVisible, bool8)) {
                                                    floatValue2 = RecyclerView.DECELERATION_RATE;
                                                } else {
                                                    Float f5 = mergedConfig2.bottomNavigationVisibilityPercent;
                                                    floatValue2 = f5 != null ? f5.floatValue() : 1.0f;
                                                }
                                                final float coerceIn = RangesKt___RangesKt.coerceIn(Math.min(floatValue, floatValue2), RecyclerView.DECELERATION_RATE, 1.0f);
                                                Object rememberedValue14 = gapComposer3.rememberedValue();
                                                if (rememberedValue14 == obj18) {
                                                    rememberedValue14 = Updater.mutableStateOf$default(swipe2);
                                                    gapComposer3.updateRememberedValue(rememberedValue14);
                                                }
                                                MutableState mutableState3 = (MutableState) rememberedValue14;
                                                if (animatedContentScopeImpl2.$$delegate_0.getTransition().targetState$delegate.getValue() != EnterExitState.PostExit) {
                                                    mutableState3.setValue(swipe2);
                                                }
                                                NavigationModel.Ready.Swipe swipe3 = (NavigationModel.Ready.Swipe) mutableState3.getValue();
                                                final ContainerUiModel containerUiModel4 = containerUiModel2;
                                                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(231769855, new UiContainer$$ExternalSyntheticLambda34(uiContainer4, containerUiModel4, fullScreenLocation3, immutableList3, coerceIn, mutableState, mutableState2), gapComposer3);
                                                if (swipe3 == null) {
                                                    gapComposer3.startReplaceGroup(-1617834759);
                                                    uiContainer4.StandardScreenContent(sharedTransitionScope3, fullScreenLocation3, immutableList3, animatedContentScopeImpl2, cashComposeInsets, saveableStateHolder3, gapComposer3, 0);
                                                    rememberComposableLambda.invoke((Object) gapComposer3, (Object) 6);
                                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(438286254, new ScreenshotViewKt$$ExternalSyntheticLambda0(uiContainer4, containerUiModel4, animatedContentScopeImpl2, sharedTransitionScope3, 1), gapComposer3), gapComposer3, 56);
                                                    gapComposer3.end(false);
                                                    z2 = false;
                                                } else {
                                                    Versioned versioned = swipe3.activePage;
                                                    List list = swipe3.pages;
                                                    gapComposer3.startReplaceGroup(-1615276763);
                                                    boolean changed5 = gapComposer3.changed(list);
                                                    Object rememberedValue15 = gapComposer3.rememberedValue();
                                                    if (changed5 || rememberedValue15 == obj18) {
                                                        rememberedValue15 = Integer.valueOf(list.indexOf(NavigationModel.Ready.Swipe.Page.MainTabs));
                                                        gapComposer3.updateRememberedValue(rememberedValue15);
                                                    }
                                                    final int intValue4 = ((Number) rememberedValue15).intValue();
                                                    if (intValue4 == -1) {
                                                        a$$ExternalSyntheticBUOutline0.m$1("Swipe pages must include a MainTabs page.");
                                                        return null;
                                                    }
                                                    int indexOf = list.indexOf(versioned.value);
                                                    boolean changedInstance5 = gapComposer3.changedInstance(swipe3);
                                                    Object rememberedValue16 = gapComposer3.rememberedValue();
                                                    if (changedInstance5 || rememberedValue16 == obj18) {
                                                        rememberedValue16 = new RealBrazeManager$$ExternalSyntheticLambda0(swipe3, 14);
                                                        gapComposer3.updateRememberedValue(rememberedValue16);
                                                    }
                                                    final DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(indexOf, (Function0) rememberedValue16, gapComposer3, 0, 2);
                                                    Object rememberedValue17 = gapComposer3.rememberedValue();
                                                    if (rememberedValue17 == obj18) {
                                                        rememberedValue17 = new SeekableTransitionState(versioned.value);
                                                        gapComposer3.updateRememberedValue(rememberedValue17);
                                                    }
                                                    SeekableTransitionState seekableTransitionState = (SeekableTransitionState) rememberedValue17;
                                                    final Transition rememberTransition = AnimatableKt.rememberTransition(seekableTransitionState, null, gapComposer3, 8, 2);
                                                    ContainerUiModel.Chrome chrome2 = containerUiModel4.chrome;
                                                    boolean z5 = chrome2.sharedToolbarEnabled;
                                                    boolean z6 = chrome2.navTransitionsEnabled;
                                                    Object rememberedValue18 = gapComposer3.rememberedValue();
                                                    if (rememberedValue18 == obj18) {
                                                        ChromeConfigAggregator chromeConfigAggregator4 = new ChromeConfigAggregator();
                                                        composableLambdaImpl = rememberComposableLambda;
                                                        z = z5;
                                                        chromeConfigAggregator4.configChangedCallback = new UiContainer$$ExternalSyntheticLambda10(uiContainer4, 6);
                                                        gapComposer3.updateRememberedValue(chromeConfigAggregator4);
                                                        obj17 = chromeConfigAggregator4;
                                                    } else {
                                                        composableLambdaImpl = rememberComposableLambda;
                                                        z = z5;
                                                        obj17 = rememberedValue18;
                                                    }
                                                    final ChromeConfigAggregator chromeConfigAggregator5 = (ChromeConfigAggregator) obj17;
                                                    Object rememberedValue19 = gapComposer3.rememberedValue();
                                                    Object obj21 = rememberedValue19;
                                                    if (rememberedValue19 == obj18) {
                                                        ChromeConfigAggregator chromeConfigAggregator6 = new ChromeConfigAggregator();
                                                        chromeConfigAggregator6.configChangedCallback = new UiContainer$$ExternalSyntheticLambda10(uiContainer4, 7);
                                                        gapComposer3.updateRememberedValue(chromeConfigAggregator6);
                                                        obj21 = chromeConfigAggregator6;
                                                    }
                                                    final ChromeConfigAggregator chromeConfigAggregator7 = (ChromeConfigAggregator) obj21;
                                                    if (z6) {
                                                        gapComposer3.startReplaceGroup(-1614406872);
                                                        boolean changed6 = gapComposer3.changed(rememberPagerState) | gapComposer3.changedInstance(seekableTransitionState) | gapComposer3.changedInstance(swipe3);
                                                        Object rememberedValue20 = gapComposer3.rememberedValue();
                                                        if (changed6 || rememberedValue20 == obj18) {
                                                            rememberedValue20 = new RealProfileManager$setPhoto$2(rememberPagerState, seekableTransitionState, swipe3, null, 11);
                                                            swipe = swipe3;
                                                            gapComposer3.updateRememberedValue(rememberedValue20);
                                                        } else {
                                                            swipe = swipe3;
                                                        }
                                                        Updater.LaunchedEffect(gapComposer3, rememberPagerState, (Function2) rememberedValue20);
                                                        gapComposer3.end(false);
                                                    } else {
                                                        swipe = swipe3;
                                                        gapComposer3.startReplaceGroup(-1612286906);
                                                        gapComposer3.end(false);
                                                    }
                                                    final NavigationModel.Ready.Swipe swipe4 = swipe;
                                                    Updater.CompositionLocalProvider(UiScopeKt.LocalSwipeTransition.defaultProvidedValue$runtime(rememberTransition), Expect_jvmKt.rememberComposableLambda(-1488719881, new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda39
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj22, Object obj23) {
                                                            Composer composer5 = (Composer) obj22;
                                                            int intValue5 = ((Integer) obj23).intValue();
                                                            GapComposer gapComposer4 = (GapComposer) composer5;
                                                            if (gapComposer4.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                                UiContainer.this.SwipeableScreenContent(sharedTransitionScope3, swipe4, rememberPagerState, fullScreenLocation3, immutableList3, animatedContentScopeImpl2, cashComposeInsets, saveableStateHolder3, !containerUiModel4.chrome.navTransitionsEnabled ? composableLambdaImpl : null, chromeConfigAggregator5, chromeConfigAggregator7, gapComposer4, 1073741824);
                                                            } else {
                                                                gapComposer4.skipToGroupEnd();
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }, gapComposer3), gapComposer3, 56);
                                                    if (z) {
                                                        gapComposer3.startReplaceGroup(-1611222211);
                                                        containerUiModel3 = containerUiModel4;
                                                        uiContainer3 = uiContainer4;
                                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-811195447, new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda40
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj22, Object obj23) {
                                                                SharedTransitionScope sharedTransitionScope4;
                                                                int i4;
                                                                AnimatedContentScopeImpl animatedContentScopeImpl3;
                                                                boolean z7;
                                                                boolean z8;
                                                                List list2 = NavigationModel.Ready.Swipe.this.pages;
                                                                Composer composer5 = (Composer) obj22;
                                                                int intValue5 = ((Integer) obj23).intValue();
                                                                GapComposer gapComposer4 = (GapComposer) composer5;
                                                                if (gapComposer4.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                                    boolean changed7 = gapComposer4.changed(list2);
                                                                    Object rememberedValue21 = gapComposer4.rememberedValue();
                                                                    Object obj24 = Composer.Companion.Empty;
                                                                    if (changed7 || rememberedValue21 == obj24) {
                                                                        rememberedValue21 = Integer.valueOf(list2.indexOf(NavigationModel.Ready.Swipe.Page.SidePanel));
                                                                        gapComposer4.updateRememberedValue(rememberedValue21);
                                                                    }
                                                                    int intValue6 = ((Number) rememberedValue21).intValue();
                                                                    Float valueOf2 = Float.valueOf(RecyclerView.DECELERATION_RATE);
                                                                    Integer valueOf3 = Integer.valueOf(intValue6);
                                                                    boolean changed8 = gapComposer4.changed(intValue6);
                                                                    PagerState pagerState = rememberPagerState;
                                                                    boolean changed9 = changed8 | gapComposer4.changed(pagerState);
                                                                    Object rememberedValue22 = gapComposer4.rememberedValue();
                                                                    if (changed9 || rememberedValue22 == obj24) {
                                                                        rememberedValue22 = new MoneyTabUIKt$MoneyTabLoaded$1$1(intValue6, pagerState, (Continuation) null);
                                                                        gapComposer4.updateRememberedValue(rememberedValue22);
                                                                    }
                                                                    MutableState produceState = Updater.produceState(valueOf2, pagerState, valueOf3, (Function2) rememberedValue22, gapComposer4, 6);
                                                                    Object rememberedValue23 = gapComposer4.rememberedValue();
                                                                    if (rememberedValue23 == obj24) {
                                                                        rememberedValue23 = new SharedToolbarSwipeGeometry();
                                                                        gapComposer4.updateRememberedValue(rememberedValue23);
                                                                    }
                                                                    SharedToolbarSwipeGeometry sharedToolbarSwipeGeometry = (SharedToolbarSwipeGeometry) rememberedValue23;
                                                                    Object rememberedValue24 = gapComposer4.rememberedValue();
                                                                    if (rememberedValue24 == obj24) {
                                                                        rememberedValue24 = new SharedToolbarSwipePalette();
                                                                        gapComposer4.updateRememberedValue(rememberedValue24);
                                                                    }
                                                                    SharedToolbarSwipePalette sharedToolbarSwipePalette = (SharedToolbarSwipePalette) rememberedValue24;
                                                                    boolean changed10 = gapComposer4.changed(pagerState) | gapComposer4.changed(intValue6);
                                                                    Object rememberedValue25 = gapComposer4.rememberedValue();
                                                                    if (changed10 || rememberedValue25 == obj24) {
                                                                        rememberedValue25 = new UiContainer$$ExternalSyntheticLambda52(pagerState, intValue6);
                                                                        gapComposer4.updateRememberedValue(rememberedValue25);
                                                                    }
                                                                    Function0 function02 = (Function0) rememberedValue25;
                                                                    boolean changed11 = gapComposer4.changed(produceState) | gapComposer4.changed(function02);
                                                                    Object rememberedValue26 = gapComposer4.rememberedValue();
                                                                    if (changed11 || rememberedValue26 == obj24) {
                                                                        rememberedValue26 = new ArcadeModal2Kt$$ExternalSyntheticLambda2(8, produceState, function02);
                                                                        gapComposer4.updateRememberedValue(rememberedValue26);
                                                                    }
                                                                    Function0 function03 = (Function0) rememberedValue26;
                                                                    Object rememberedValue27 = gapComposer4.rememberedValue();
                                                                    if (rememberedValue27 == obj24) {
                                                                        rememberedValue27 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(produceState, 22));
                                                                        gapComposer4.updateRememberedValue(rememberedValue27);
                                                                    }
                                                                    State state = (State) rememberedValue27;
                                                                    Object rememberedValue28 = gapComposer4.rememberedValue();
                                                                    if (rememberedValue28 == obj24) {
                                                                        rememberedValue28 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(produceState, 23));
                                                                        gapComposer4.updateRememberedValue(rememberedValue28);
                                                                    }
                                                                    State state2 = (State) rememberedValue28;
                                                                    Object rememberedValue29 = gapComposer4.rememberedValue();
                                                                    if (rememberedValue29 == obj24) {
                                                                        rememberedValue29 = Updater.mutableStateOf$default(null);
                                                                        gapComposer4.updateRememberedValue(rememberedValue29);
                                                                    }
                                                                    MutableState mutableState4 = (MutableState) rememberedValue29;
                                                                    Object rememberedValue30 = gapComposer4.rememberedValue();
                                                                    if (rememberedValue30 == obj24) {
                                                                        rememberedValue30 = Updater.mutableStateOf$default(null);
                                                                        gapComposer4.updateRememberedValue(rememberedValue30);
                                                                    }
                                                                    MutableState mutableState5 = (MutableState) rememberedValue30;
                                                                    ToolbarConfig toolbarConfig4 = chromeConfigAggregator5.getMergedConfig().toolbarConfig;
                                                                    if (toolbarConfig4 != null) {
                                                                        mutableState4.setValue(toolbarConfig4);
                                                                    }
                                                                    ToolbarConfig toolbarConfig5 = chromeConfigAggregator7.getMergedConfig().toolbarConfig;
                                                                    if (toolbarConfig5 != null) {
                                                                        mutableState5.setValue(toolbarConfig5);
                                                                    }
                                                                    Modifier align = BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.TopCenter);
                                                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                                                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                                                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                                                                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, align);
                                                                    ComposeUiNode.Companion.getClass();
                                                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                                                    if (gapComposer4.applier == null) {
                                                                        Updater.invalidApplier();
                                                                        throw null;
                                                                    }
                                                                    gapComposer4.startReusableNode();
                                                                    if (gapComposer4.inserting) {
                                                                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                                                    } else {
                                                                        gapComposer4.useNode();
                                                                    }
                                                                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                                                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                                    Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                                                    boolean booleanValue = ((Boolean) state.getValue()).booleanValue();
                                                                    ContainerUiModel containerUiModel5 = containerUiModel4;
                                                                    UiContainer uiContainer5 = uiContainer4;
                                                                    int i5 = intValue4;
                                                                    AnimatedContentScopeImpl animatedContentScopeImpl4 = animatedContentScopeImpl2;
                                                                    SharedTransitionScope sharedTransitionScope5 = sharedTransitionScope3;
                                                                    if (booleanValue) {
                                                                        gapComposer4.startReplaceGroup(944977701);
                                                                        ToolbarConfig toolbarConfig6 = (ToolbarConfig) mutableState4.getValue();
                                                                        if (toolbarConfig6 == null) {
                                                                            gapComposer4.startReplaceGroup(-770462340);
                                                                            z8 = false;
                                                                            gapComposer4.end(false);
                                                                            sharedTransitionScope4 = sharedTransitionScope5;
                                                                            i4 = intValue6;
                                                                            animatedContentScopeImpl3 = animatedContentScopeImpl4;
                                                                        } else {
                                                                            z8 = false;
                                                                            gapComposer4.startReplaceGroup(-770462339);
                                                                            sharedTransitionScope4 = sharedTransitionScope5;
                                                                            i4 = intValue6;
                                                                            animatedContentScopeImpl3 = animatedContentScopeImpl4;
                                                                            UiContainer.Content$lambda$4$0$1$2$0$2$17$SwipeToolbar(containerUiModel5, uiContainer5, function03, sharedToolbarSwipeGeometry, sharedToolbarSwipePalette, i4, i5, function02, animatedContentScopeImpl3, sharedTransitionScope4, toolbarConfig6, false, gapComposer4);
                                                                            gapComposer4 = gapComposer4;
                                                                            gapComposer4.end(false);
                                                                        }
                                                                        gapComposer4.end(z8);
                                                                    } else {
                                                                        sharedTransitionScope4 = sharedTransitionScope5;
                                                                        i4 = intValue6;
                                                                        animatedContentScopeImpl3 = animatedContentScopeImpl4;
                                                                        gapComposer4.startReplaceGroup(-770321165);
                                                                        gapComposer4.end(false);
                                                                    }
                                                                    if (((Boolean) state2.getValue()).booleanValue()) {
                                                                        gapComposer4.startReplaceGroup(944985956);
                                                                        ToolbarConfig toolbarConfig7 = (ToolbarConfig) mutableState5.getValue();
                                                                        if (toolbarConfig7 == null) {
                                                                            gapComposer4.startReplaceGroup(-770206435);
                                                                            z7 = false;
                                                                            gapComposer4.end(false);
                                                                        } else {
                                                                            z7 = false;
                                                                            gapComposer4.startReplaceGroup(-770206434);
                                                                            GapComposer gapComposer5 = gapComposer4;
                                                                            UiContainer.Content$lambda$4$0$1$2$0$2$17$SwipeToolbar(containerUiModel5, uiContainer5, function03, sharedToolbarSwipeGeometry, sharedToolbarSwipePalette, i4, i5, function02, animatedContentScopeImpl3, sharedTransitionScope4, toolbarConfig7, true, gapComposer5);
                                                                            gapComposer4 = gapComposer5;
                                                                            gapComposer4.end(false);
                                                                        }
                                                                        gapComposer4.end(z7);
                                                                    } else {
                                                                        gapComposer4.startReplaceGroup(-770066221);
                                                                        gapComposer4.end(false);
                                                                    }
                                                                    gapComposer4.end(true);
                                                                } else {
                                                                    gapComposer4.skipToGroupEnd();
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, gapComposer3), gapComposer3, 56);
                                                        gapComposer3.end(false);
                                                    } else {
                                                        gapComposer3.startReplaceGroup(-1604243553);
                                                        containerUiModel3 = containerUiModel4;
                                                        uiContainer3 = uiContainer4;
                                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1139059502, new UiContainer$$ExternalSyntheticLambda18(swipe4, chromeConfigAggregator5, chromeConfigAggregator7, containerUiModel4, uiContainer4, animatedContentScopeImpl2, sharedTransitionScope3), gapComposer3), gapComposer3, 56);
                                                        gapComposer3.end(false);
                                                    }
                                                    if (z6) {
                                                        gapComposer3.startReplaceGroup(-1601735932);
                                                        final ContainerUiModel containerUiModel5 = containerUiModel3;
                                                        final UiContainer uiContainer5 = uiContainer3;
                                                        z2 = false;
                                                        SharedTransitionScopeKt.SharedTransitionLayout(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter), Expect_jvmKt.rememberComposableLambda(-909877880, new Function3() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda42
                                                            @Override // kotlin.jvm.functions.Function3
                                                            public final Object invoke(Object obj22, Object obj23, Object obj24) {
                                                                final SharedTransitionScope sharedTransitionScope4 = (SharedTransitionScope) obj22;
                                                                Composer composer5 = (Composer) obj23;
                                                                int intValue5 = ((Integer) obj24).intValue();
                                                                sharedTransitionScope4.getClass();
                                                                if ((intValue5 & 6) == 0) {
                                                                    intValue5 |= ((GapComposer) composer5).changed(sharedTransitionScope4) ? 4 : 2;
                                                                }
                                                                GapComposer gapComposer4 = (GapComposer) composer5;
                                                                if (gapComposer4.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                                                                    Object rememberedValue21 = gapComposer4.rememberedValue();
                                                                    if (rememberedValue21 == Composer.Companion.Empty) {
                                                                        rememberedValue21 = new FlowStarter$$ExternalSyntheticLambda0(6);
                                                                        gapComposer4.updateRememberedValue(rememberedValue21);
                                                                    }
                                                                    Function1 function12 = (Function1) rememberedValue21;
                                                                    final UiContainer uiContainer6 = uiContainer5;
                                                                    final ContainerUiModel containerUiModel6 = containerUiModel5;
                                                                    final Transition transition = Transition.this;
                                                                    final NavigationModel.Ready.FullScreenLocation fullScreenLocation4 = fullScreenLocation3;
                                                                    final ImmutableList immutableList4 = immutableList3;
                                                                    final float f6 = coerceIn;
                                                                    final MutableState mutableState4 = mutableState;
                                                                    final MutableState mutableState5 = mutableState2;
                                                                    AnimatedContentKt.AnimatedContent(transition, null, function12, null, null, Expect_jvmKt.rememberComposableLambda(-17845710, new Function4() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda57
                                                                        @Override // kotlin.jvm.functions.Function4
                                                                        public final Object invoke(Object obj25, Object obj26, Object obj27, Object obj28) {
                                                                            ContainerUiModel.Chrome chrome3 = containerUiModel6.chrome;
                                                                            AnimatedContentScopeImpl animatedContentScopeImpl3 = (AnimatedContentScopeImpl) obj25;
                                                                            NavigationModel.Ready.Swipe.Page page = (NavigationModel.Ready.Swipe.Page) obj26;
                                                                            Composer composer6 = (Composer) obj27;
                                                                            int intValue6 = ((Integer) obj28).intValue();
                                                                            animatedContentScopeImpl3.getClass();
                                                                            page.getClass();
                                                                            NavigationModel.Ready.Swipe.Page page2 = NavigationModel.Ready.Swipe.Page.MainTabs;
                                                                            Transition transition2 = transition;
                                                                            SharedTransitionScope sharedTransitionScope5 = sharedTransitionScope4;
                                                                            if (page == page2) {
                                                                                GapComposer gapComposer5 = (GapComposer) composer6;
                                                                                gapComposer5.startReplaceGroup(934526777);
                                                                                Modifier align = BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.BottomCenter);
                                                                                UiContainer uiContainer7 = UiContainer.this;
                                                                                ElementBoundsRegistry elementBoundsRegistry = uiContainer7.elementBoundsRegistry;
                                                                                MainContainerDelegate$$ExternalSyntheticLambda0 mainContainerDelegate$$ExternalSyntheticLambda0 = uiContainer7.eventReceiver;
                                                                                boolean z7 = chrome3.flatTabs && !transition2.isRunning();
                                                                                UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig4 = uiContainer7.fullScreenConfigAggregator.getMergedConfig().tabConfig;
                                                                                MainScreensViewModel$TabTreatment mainScreensViewModel$TabTreatment = chrome3.tabTreatment;
                                                                                SplashScreenAnimationObserver splashScreenAnimationObserver = uiContainer7.splashScreenAnimationObserver;
                                                                                Object rememberedValue22 = gapComposer5.rememberedValue();
                                                                                NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                                                                if (rememberedValue22 == neverEqualPolicy2) {
                                                                                    rememberedValue22 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(2, mutableState4);
                                                                                    gapComposer5.updateRememberedValue(rememberedValue22);
                                                                                }
                                                                                Function1 function13 = (Function1) rememberedValue22;
                                                                                Object rememberedValue23 = gapComposer5.rememberedValue();
                                                                                if (rememberedValue23 == neverEqualPolicy2) {
                                                                                    rememberedValue23 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(3, mutableState5);
                                                                                    gapComposer5.updateRememberedValue(rememberedValue23);
                                                                                }
                                                                                UiContainerKt.Tabs(elementBoundsRegistry, mainContainerDelegate$$ExternalSyntheticLambda0, function13, (Function1) rememberedValue23, fullScreenLocation4, mainScreensViewModel$TabTreatment, immutableList4, false, z7, updatesWindowFlags$TabConfig4, splashScreenAnimationObserver, f6, align, sharedTransitionScope5, animatedContentScopeImpl3, gapComposer5, 3456, (intValue6 << 12) & 57344, 0);
                                                                                gapComposer5.end(false);
                                                                            } else if (page == NavigationModel.Ready.Swipe.Page.SidePanel) {
                                                                                GapComposer gapComposer6 = (GapComposer) composer6;
                                                                                gapComposer6.startReplaceGroup(935761693);
                                                                                ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(590295617, new EarningsHomeKt$$ExternalSyntheticLambda2(4, transition2, sharedTransitionScope5, animatedContentScopeImpl3), gapComposer6), gapComposer6, 3072, 6);
                                                                                gapComposer6.end(false);
                                                                            } else {
                                                                                GapComposer gapComposer7 = (GapComposer) composer6;
                                                                                gapComposer7.startReplaceGroup(937133040);
                                                                                gapComposer7.end(false);
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    }, gapComposer4), gapComposer4, 196992, 13);
                                                                } else {
                                                                    gapComposer4.skipToGroupEnd();
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, gapComposer3), gapComposer3, 48, 0);
                                                        gapComposer3.end(false);
                                                    } else {
                                                        z2 = false;
                                                        gapComposer3.startReplaceGroup(-1598535802);
                                                        gapComposer3.end(false);
                                                    }
                                                    gapComposer3.end(z2);
                                                }
                                                gapComposer3.end(true);
                                                gapComposer3.end(z2);
                                            }
                                        }
                                        gapComposer3.startReplaceGroup(1393115580);
                                        UiContainerKt.ScreenContent(uiContainer4.broadway, fullScreenLocation3, animatedContentScopeImpl2, sharedTransitionScope3, saveableStateHolder3, false, uiContainer4.fullScreenBackPressedDispatcher, uiContainer4.onLocationReceived, uiContainer4.onLocationRemoved, uiContainer4.containerErrorReporter, uiContainer4.leakDetector, uiContainer4.fullScreenBackListener, uiContainer4.eventListeners, uiContainer4.parentLifecycle, false, null, gapComposer3, 0, 0, 49152);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer3), composer3, 56);
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 1769520, 24);
                    RealAppMessageImageLoader realAppMessageImageLoader = uiContainer.staticImageLoader;
                    InAppNotificationModel inAppNotificationModel = fullScreenLocation.showTabs ? chrome.inAppNotification : InAppNotificationModel.NotAvailable.INSTANCE;
                    boolean changedInstance4 = gapComposer2.changedInstance(uiContainer);
                    Object rememberedValue8 = gapComposer2.rememberedValue();
                    if (changedInstance4 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda26
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                int i4 = i3;
                                UiContainer uiContainer2 = uiContainer;
                                switch (i4) {
                                    case 0:
                                        AppMessageViewEvent appMessageViewEvent = (AppMessageViewEvent) obj11;
                                        appMessageViewEvent.getClass();
                                        uiContainer2.eventReceiver.invoke(new MainScreensViewEvent.InAppNotificationEvent(appMessageViewEvent));
                                        break;
                                    default:
                                        TooltipAppMessageViewEvent tooltipAppMessageViewEvent = (TooltipAppMessageViewEvent) obj11;
                                        tooltipAppMessageViewEvent.getClass();
                                        uiContainer2.eventReceiver.invoke(new MainScreensViewEvent.TooltipAppMessageEvent(tooltipAppMessageViewEvent));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer2.updateRememberedValue(rememberedValue8);
                    }
                    UiContainerKt.InAppNotification(realAppMessageImageLoader, (Function1) rememberedValue8, inAppNotificationModel, gapComposer2, 0);
                    ElementBoundsRegistry elementBoundsRegistry = uiContainer.elementBoundsRegistry;
                    RealTooltipTargetLoadedCallbackRegistry realTooltipTargetLoadedCallbackRegistry = uiContainer.tooltipTargetLoadedCallbackRegistry;
                    TooltipAppMessageViewModel tooltipAppMessageViewModel = chrome.tooltipAppMessage;
                    if (tooltipAppMessageViewModel == null) {
                        tooltipAppMessageViewModel = TooltipAppMessageViewModel.Loading.INSTANCE;
                    }
                    TooltipAppMessageViewModel tooltipAppMessageViewModel2 = tooltipAppMessageViewModel;
                    boolean changedInstance5 = gapComposer2.changedInstance(uiContainer);
                    Object rememberedValue9 = gapComposer2.rememberedValue();
                    if (changedInstance5 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda26
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                int i4 = i2;
                                UiContainer uiContainer2 = uiContainer;
                                switch (i4) {
                                    case 0:
                                        AppMessageViewEvent appMessageViewEvent = (AppMessageViewEvent) obj11;
                                        appMessageViewEvent.getClass();
                                        uiContainer2.eventReceiver.invoke(new MainScreensViewEvent.InAppNotificationEvent(appMessageViewEvent));
                                        break;
                                    default:
                                        TooltipAppMessageViewEvent tooltipAppMessageViewEvent = (TooltipAppMessageViewEvent) obj11;
                                        tooltipAppMessageViewEvent.getClass();
                                        uiContainer2.eventReceiver.invoke(new MainScreensViewEvent.TooltipAppMessageEvent(tooltipAppMessageViewEvent));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer2.updateRememberedValue(rememberedValue9);
                    }
                    UiContainerKt.TooltipAppMessage(elementBoundsRegistry, realTooltipTargetLoadedCallbackRegistry, (Function1) rememberedValue9, tooltipAppMessageViewModel2, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
