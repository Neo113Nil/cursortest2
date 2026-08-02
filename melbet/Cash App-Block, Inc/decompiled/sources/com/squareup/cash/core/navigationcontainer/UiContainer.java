package com.squareup.cash.core.navigationcontainer;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.datastore.core.SimpleActor;
import androidx.room.RoomDatabase$closeBarrier$1;
import app.cash.broadway.Broadway;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.ui.UpdatesWindowFlags$Orientation;
import app.cash.broadway.ui.compose.ChromeConfigAggregator;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.broadway.ui.compose.FullScreenAggregator;
import app.cash.broadway.ui.compose.OrientationAggregator;
import app.cash.broadway.ui.compose.SecureScreenAggregator;
import app.cash.broadway.ui.compose.SpacesPagerInteractionManagerKt;
import app.cash.broadway.ui.compose.ToolbarConfig;
import app.cash.molecule.PlatformKt;
import app.cash.util.leakdetector.api.LeakDetector;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.views.RealAppMessageImageLoader;
import com.squareup.cash.appmessages.views.RealTooltipTargetLoadedCallbackRegistry;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.core.navigationcontainer.models.ContainerUiModel;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$TabTreatment;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.moneybot.views.shared.MoneybotToolbarSharedKey$Leading;
import com.squareup.cash.moneybot.views.shared.MoneybotToolbarSharedKey$Trailing;
import com.squareup.cash.offers.views.home.OffersHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.overlays.OverlayContextWrapper;
import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.storage.RealStorage$temp$1;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.MoneybotToolbarSharedElementConfig;
import com.squareup.cash.tabs.views.SharedToolbarSwipeGeometry;
import com.squareup.cash.tabs.views.SharedToolbarSwipePalette;
import com.squareup.cash.tabs.views.SharedToolbarSwipeScope;
import com.squareup.cash.ui.MainContainerDelegate$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.MainContainerDelegate$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.util.lifecycle.MinimumLifecycleOwner;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.internal.LaunchTracker$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class UiContainer extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Broadway broadway;
    public final WireAdapter containerErrorReporter;
    public final ParcelableSnapshotMutableState containerModel$delegate;
    public final boolean darkMode;
    public final ElementBoundsRegistry elementBoundsRegistry;
    public final List eventListeners;
    public final MainContainerDelegate$$ExternalSyntheticLambda0 eventReceiver;
    public final FullScreenAggregator fullScreenAggregator;
    public final AtomicReference fullScreenBackListener;
    public final AtomicReference fullScreenBackPressedDispatcher;
    public final ChromeConfigAggregator fullScreenConfigAggregator;
    public final RealImageLoader imageLoader;
    public final LeakDetector leakDetector;
    public final RealStorage$temp$1 onLocationReceived;
    public final RealStorage$temp$1 onLocationRemoved;
    public final RealStorage$temp$1 onSwipePageChanged;
    public final OrientationAggregator orientationAggregator;
    public final AtomicReference overlayBackListener;
    public final AtomicReference overlayBackPressedDispatcher;
    public final ChromeConfigAggregator overlayConfigAggregator;
    public final MainContainerDelegate$$ExternalSyntheticLambda1 overlayDismissRequested;
    public final MinimumLifecycleOwner parentLifecycle;
    public final ParcelableSnapshotMutableState requestedSwipePage$delegate;
    public final SecureScreenAggregator secureScreenAggregator;
    public final SplashScreenAnimationObserver splashScreenAnimationObserver;
    public final RealAppMessageImageLoader staticImageLoader;
    public final ParcelableSnapshotMutableState swipeActivePage$delegate;
    public final RealTooltipTargetLoadedCallbackRegistry tooltipTargetLoadedCallbackRegistry;
    public final ByteString.Companion uiDebugWrapper;
    public final RoomDatabase$closeBarrier$1 updateWindowFlags;
    public final ParcelableSnapshotMutableState windowFlagsDirty$delegate;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NavigationModel.Ready.Swipe.Page.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NavigationModel.Ready.Swipe.Page page = NavigationModel.Ready.Swipe.Page.SidePanel;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ChromeSystemIconColor.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ChromeSystemIconColor chromeSystemIconColor = ChromeSystemIconColor.STANDARD;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ChromeSystemIconColor chromeSystemIconColor2 = ChromeSystemIconColor.STANDARD;
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[UpdatesWindowFlags$Orientation.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiContainer(Broadway broadway, ElementBoundsRegistry elementBoundsRegistry, RealTooltipTargetLoadedCallbackRegistry realTooltipTargetLoadedCallbackRegistry, LeakDetector leakDetector, RealAppMessageImageLoader realAppMessageImageLoader, WireAdapter wireAdapter, SplashScreenAnimationObserver splashScreenAnimationObserver, List list, ByteString.Companion companion, RealImageLoader realImageLoader, OverlayContextWrapper overlayContextWrapper, MainContainerDelegate$$ExternalSyntheticLambda0 mainContainerDelegate$$ExternalSyntheticLambda0, RealStorage$temp$1 realStorage$temp$1, RealStorage$temp$1 realStorage$temp$12, RealStorage$temp$1 realStorage$temp$13, MainContainerDelegate$$ExternalSyntheticLambda1 mainContainerDelegate$$ExternalSyntheticLambda1, MinimumLifecycleOwner minimumLifecycleOwner, RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1) {
        super(overlayContextWrapper, null, 6, 0);
        this.broadway = broadway;
        this.elementBoundsRegistry = elementBoundsRegistry;
        this.tooltipTargetLoadedCallbackRegistry = realTooltipTargetLoadedCallbackRegistry;
        this.leakDetector = leakDetector;
        this.staticImageLoader = realAppMessageImageLoader;
        this.containerErrorReporter = wireAdapter;
        this.splashScreenAnimationObserver = splashScreenAnimationObserver;
        this.eventListeners = list;
        this.uiDebugWrapper = companion;
        this.imageLoader = realImageLoader;
        this.eventReceiver = mainContainerDelegate$$ExternalSyntheticLambda0;
        this.onLocationReceived = realStorage$temp$1;
        this.onLocationRemoved = realStorage$temp$12;
        this.onSwipePageChanged = realStorage$temp$13;
        this.overlayDismissRequested = mainContainerDelegate$$ExternalSyntheticLambda1;
        this.parentLifecycle = minimumLifecycleOwner;
        this.updateWindowFlags = roomDatabase$closeBarrier$1;
        this.fullScreenBackPressedDispatcher = new AtomicReference(null);
        this.overlayBackPressedDispatcher = new AtomicReference(null);
        this.fullScreenBackListener = new AtomicReference(null);
        this.overlayBackListener = new AtomicReference(null);
        this.containerModel$delegate = Updater.mutableStateOf$default(null);
        this.windowFlagsDirty$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
        this.swipeActivePage$delegate = Updater.mutableStateOf$default(null);
        this.requestedSwipePage$delegate = Updater.mutableStateOf$default(null);
        ChromeConfigAggregator chromeConfigAggregator = new ChromeConfigAggregator();
        chromeConfigAggregator.configChangedCallback = new UiContainer$$ExternalSyntheticLambda10(this, 0 == true ? 1 : 0);
        this.fullScreenConfigAggregator = chromeConfigAggregator;
        ChromeConfigAggregator chromeConfigAggregator2 = new ChromeConfigAggregator();
        chromeConfigAggregator2.configChangedCallback = new UiContainer$$ExternalSyntheticLambda10(this, 1);
        this.overlayConfigAggregator = chromeConfigAggregator2;
        FullScreenAggregator fullScreenAggregator = new FullScreenAggregator();
        fullScreenAggregator.enabledChangedCallback = new UiContainer$$ExternalSyntheticLambda10(this, 2);
        this.fullScreenAggregator = fullScreenAggregator;
        OrientationAggregator orientationAggregator = new OrientationAggregator();
        orientationAggregator.orientationChangedCallback = new UiContainer$$ExternalSyntheticLambda10(this, 3);
        this.orientationAggregator = orientationAggregator;
        SecureScreenAggregator secureScreenAggregator = new SecureScreenAggregator();
        secureScreenAggregator.enabledChangedCallback = new UiContainer$$ExternalSyntheticLambda10(this, 4);
        this.secureScreenAggregator = secureScreenAggregator;
        this.darkMode = (getResources().getConfiguration().uiMode & 48) == 32;
        setTag(R.id.consume_window_insets_tag, Boolean.FALSE);
    }

    public static final void Content$lambda$4$0$1$2$0$2$17$SwipeToolbar(ContainerUiModel containerUiModel, UiContainer uiContainer, Function0 function0, SharedToolbarSwipeGeometry sharedToolbarSwipeGeometry, SharedToolbarSwipePalette sharedToolbarSwipePalette, int i, int i2, Function0 function02, AnimatedContentScopeImpl animatedContentScopeImpl, SharedTransitionScope sharedTransitionScope, ToolbarConfig toolbarConfig, boolean z, GapComposer gapComposer) {
        GapComposer gapComposer2;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            SharedToolbarSwipeScope sharedToolbarSwipeScope = new SharedToolbarSwipeScope(function0, new PoolDescriptionKt$$ExternalSyntheticLambda3(function02, z), z, sharedToolbarSwipeGeometry, sharedToolbarSwipePalette, i < i2);
            gapComposer2 = gapComposer;
            gapComposer2.updateRememberedValue(sharedToolbarSwipeScope);
            rememberedValue = sharedToolbarSwipeScope;
        } else {
            gapComposer2 = gapComposer;
        }
        SharedToolbarSwipeScope sharedToolbarSwipeScope2 = (SharedToolbarSwipeScope) rememberedValue;
        TabToolbarInternalViewModel tabToolbarInternalViewModel = containerUiModel.chrome.tabToolbarViewModel;
        ElementBoundsRegistry elementBoundsRegistry = uiContainer.elementBoundsRegistry;
        MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig = toolbarConfig.moneybotSharedElementKeys != null ? new MoneybotToolbarSharedElementConfig(animatedContentScopeImpl, sharedTransitionScope, MoneybotToolbarSharedKey$Leading.INSTANCE, MoneybotToolbarSharedKey$Trailing.INSTANCE) : null;
        ToolbarConfig.SearchSharedElementKeys searchSharedElementKeys = toolbarConfig.searchSharedElementKeys;
        UiContainerKt.ContainerTabToolbar(toolbarConfig, tabToolbarInternalViewModel, elementBoundsRegistry, moneybotToolbarSharedElementConfig, searchSharedElementKeys != null ? new SimpleActor(animatedContentScopeImpl, sharedTransitionScope, searchSharedElementKeys.getSearchBoundsKey(), searchSharedElementKeys.getSearchIconKey()) : null, null, sharedToolbarSwipeScope2, gapComposer2, 1609736, 32);
    }

    public static boolean getTransparentNavBar(ContainerUiModel containerUiModel) {
        NavigationModel navigationModel = containerUiModel != null ? containerUiModel.navigation : null;
        NavigationModel.Ready ready = navigationModel instanceof NavigationModel.Ready ? (NavigationModel.Ready) navigationModel : null;
        if (ready == null) {
            return true;
        }
        if (ready.fullScreen.showTabs && containerUiModel.chrome.tabTreatment.equals(MainScreensViewModel$TabTreatment.Inline.INSTANCE)) {
            return true;
        }
        NavigationModel.Ready.OverlayLocation overlayLocation = ready.overlay;
        return (overlayLocation != null ? overlayLocation.screen : null) instanceof DialogScreen;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        String str;
        NavigationModel.Ready.FullScreenLocation fullScreenLocation;
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-858151373);
        final int i2 = 2;
        int i3 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        final int i4 = 1;
        final int i5 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            boolean booleanValue = ((Boolean) this.windowFlagsDirty$delegate.getValue()).booleanValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (booleanValue) {
                gapComposer.startReplaceGroup(-1542162640);
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new UiContainer$$ExternalSyntheticLambda10(this, 5);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.SideEffect((Function0) rememberedValue, gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1542071345);
                gapComposer.end(false);
            }
            ContainerUiModel containerUiModel = (ContainerUiModel) this.containerModel$delegate.getValue();
            if (containerUiModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                } else {
                    function2 = new Function2(this, i, i5) { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda16
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ UiContainer f$0;

                        {
                            this.$r8$classId = i5;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.$r8$classId;
                            UiContainer uiContainer = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    uiContainer.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                                case 1:
                                    uiContainer.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    uiContainer.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                NavigationModel navigationModel = containerUiModel.navigation;
                NavigationModel.Ready ready = navigationModel instanceof NavigationModel.Ready ? (NavigationModel.Ready) navigationModel : null;
                if (ready == null) {
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    } else {
                        function2 = new Function2(this, i, i4) { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda16
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ UiContainer f$0;

                            {
                                this.$r8$classId = i4;
                                this.f$0 = this;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i6 = this.$r8$classId;
                                UiContainer uiContainer = this.f$0;
                                Composer composer2 = (Composer) obj;
                                ((Integer) obj2).getClass();
                                switch (i6) {
                                    case 0:
                                        uiContainer.Content(composer2, Updater.updateChangedFlags(1));
                                        break;
                                    case 1:
                                        uiContainer.Content(composer2, Updater.updateChangedFlags(1));
                                        break;
                                    default:
                                        uiContainer.Content(composer2, Updater.updateChangedFlags(1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    }
                } else {
                    NavigationModel.Ready.FullScreenLocation fullScreenLocation2 = ready.fullScreen;
                    NavigationModel.Ready.OverlayLocation overlayLocation = ready.overlay;
                    ImmutableList immutableList = containerUiModel.chrome.tabs;
                    PersistentOrderedSet persistentOrderedSet = PersistentOrderedSet.EMPTY;
                    persistentOrderedSet.getClass();
                    PersistentOrderedSetBuilder persistentOrderedSetBuilder = new PersistentOrderedSetBuilder(persistentOrderedSet);
                    persistentOrderedSetBuilder.add(fullScreenLocation2.stateKey);
                    NavigationModel.Ready.Swipe swipe = ready.swipe;
                    if (swipe != null && (fullScreenLocation = swipe.location) != null && (str2 = fullScreenLocation.stateKey) != null) {
                        persistentOrderedSetBuilder.add(str2);
                    }
                    if (overlayLocation != null && (str = overlayLocation.stateKey) != null) {
                        persistentOrderedSetBuilder.add(str);
                    }
                    persistentOrderedSetBuilder.addAll(ready.statesToKeep);
                    PersistentOrderedSet persistentOrderedSet2 = persistentOrderedSetBuilder.builtSet;
                    PersistentHashMapBuilder persistentHashMapBuilder = persistentOrderedSetBuilder.hashMapBuilder;
                    if (persistentOrderedSet2 != null) {
                        PersistentHashMap persistentHashMap = persistentHashMapBuilder.builtMap;
                    } else {
                        PersistentHashMap persistentHashMap2 = persistentHashMapBuilder.builtMap;
                        PersistentOrderedSet persistentOrderedSet3 = new PersistentOrderedSet(persistentOrderedSetBuilder.firstElement, persistentOrderedSetBuilder.lastElement, persistentHashMapBuilder.build());
                        persistentOrderedSetBuilder.builtSet = persistentOrderedSet3;
                        persistentOrderedSet2 = persistentOrderedSet3;
                    }
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = UiContainerKt.LocalLegacySheetScope;
                    SaveableStateHolderImpl rememberSaveableStateHolder = SaverKt.rememberSaveableStateHolder(gapComposer);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LinkedHashSet();
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Set set = (Set) rememberedValue2;
                    boolean changedInstance2 = gapComposer.changedInstance(set) | gapComposer.changed(persistentOrderedSet2) | gapComposer.changedInstance(rememberSaveableStateHolder);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    int i6 = 6;
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new LaunchTracker$$ExternalSyntheticLambda0(i6, set, rememberSaveableStateHolder, persistentOrderedSet2);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Updater.SideEffect((Function0) rememberedValue3, gapComposer);
                    this.uiDebugWrapper.Content(Expect_jvmKt.rememberComposableLambda(1430178085, new UiContainer$$ExternalSyntheticLambda18(overlayLocation, this, immutableList, fullScreenLocation2, containerUiModel, rememberSaveableStateHolder, ready), gapComposer), gapComposer, 6);
                }
            }
            endRestartGroup.block = function2;
        }
        gapComposer.skipToGroupEnd();
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(this, i, i2) { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda16
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ UiContainer f$0;

                {
                    this.$r8$classId = i2;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.$r8$classId;
                    UiContainer uiContainer = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            uiContainer.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                        case 1:
                            uiContainer.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            uiContainer.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public final void StandardScreenContent(SharedTransitionScope sharedTransitionScope, NavigationModel.Ready.FullScreenLocation fullScreenLocation, ImmutableList immutableList, AnimatedContentScopeImpl animatedContentScopeImpl, CashComposeInsets cashComposeInsets, SaveableStateHolder saveableStateHolder, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2045980965);
        int i2 = i | (gapComposer.changed(sharedTransitionScope) ? 4 : 2) | (gapComposer.changedInstance(fullScreenLocation) ? 32 : 16) | (gapComposer.changedInstance(immutableList) ? 256 : 128) | (gapComposer.changedInstance(animatedContentScopeImpl) ? 2048 : 1024) | (gapComposer.changed(cashComposeInsets) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(saveableStateHolder) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(this) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            int i3 = i2 >> 3;
            HeartBeatInfoStorage$$ExternalSyntheticLambda0 access$asTransitionSpec = UiContainerKt.access$asTransitionSpec(this.broadway, immutableList, gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new FlowStarter$$ExternalSyntheticLambda0(5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AnimatedContentKt.AnimatedContent(fullScreenLocation, fillMaxSize, access$asTransitionSpec, null, null, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(1152286254, new OffersHomeViewKt$$ExternalSyntheticLambda2(animatedContentScopeImpl, cashComposeInsets, this, sharedTransitionScope, saveableStateHolder, 1), gapComposer), gapComposer, (i3 & 14) | 1769520, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetKt$$ExternalSyntheticLambda0(this, sharedTransitionScope, fullScreenLocation, immutableList, animatedContentScopeImpl, cashComposeInsets, saveableStateHolder, i);
        }
    }

    public final void SwipeableScreenContent(final SharedTransitionScope sharedTransitionScope, final NavigationModel.Ready.Swipe swipe, final PagerState pagerState, final NavigationModel.Ready.FullScreenLocation fullScreenLocation, final ImmutableList immutableList, final AnimatedContentScopeImpl animatedContentScopeImpl, final CashComposeInsets cashComposeInsets, final SaveableStateHolder saveableStateHolder, final Function2 function2, final ChromeConfigAggregator chromeConfigAggregator, final ChromeConfigAggregator chromeConfigAggregator2, Composer composer, final int i) {
        GapComposer gapComposer;
        Object realProfileManager$setPhoto$2;
        int i2;
        Versioned versioned;
        NavigationModel.Ready.FullScreenLocation fullScreenLocation2;
        NeverEqualPolicy neverEqualPolicy;
        Continuation continuation;
        final PagerState pagerState2;
        NavigationModel.Ready.Swipe swipe2 = swipe;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(971035423);
        int i3 = i | (gapComposer2.changed(sharedTransitionScope) ? 4 : 2) | (gapComposer2.changedInstance(swipe2) ? 32 : 16) | (gapComposer2.changed(pagerState) ? 256 : 128) | (gapComposer2.changedInstance(fullScreenLocation) ? 2048 : 1024) | (gapComposer2.changedInstance(immutableList) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changedInstance(animatedContentScopeImpl) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changed(cashComposeInsets) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changedInstance(saveableStateHolder) ? 8388608 : 4194304) | (gapComposer2.changedInstance(function2) ? 67108864 : 33554432) | (gapComposer2.changedInstance(chromeConfigAggregator) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer2.shouldExecute(i3 & 1, ((306783379 & i3) == 306783378 && ((((gapComposer2.changedInstance(chromeConfigAggregator2) ? (char) 4 : (char) 2) | '\b') | (gapComposer2.changedInstance(this) ? 32 : 16)) & 19) == 18) ? false : true)) {
            NavigationModel.Ready.FullScreenLocation fullScreenLocation3 = swipe2.location;
            Versioned versioned2 = swipe2.activePage;
            if (fullScreenLocation3 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Swipe location is required.");
                return;
            }
            final AbsoluteRoundedCornerShape displayRoundedCornerShapeOrNull = DensityUtilsKt.displayRoundedCornerShapeOrNull(this, gapComposer2);
            Object[] objArr = {fullScreenLocation3.stateKey};
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = new CardScene$$ExternalSyntheticLambda1(29);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer2, 48);
            Integer valueOf = Integer.valueOf(versioned2.version);
            int i4 = i3 & 896;
            boolean changedInstance = (i4 == 256) | gapComposer2.changedInstance(swipe2) | gapComposer2.changed(parcelableSnapshotMutableIntState);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            Continuation continuation2 = null;
            if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                i2 = i4;
                versioned = versioned2;
                fullScreenLocation2 = fullScreenLocation3;
                neverEqualPolicy = neverEqualPolicy2;
                realProfileManager$setPhoto$2 = new RealProfileManager$setPhoto$2(swipe2, pagerState, parcelableSnapshotMutableIntState, continuation2, 12);
                swipe2 = swipe2;
                continuation = null;
                pagerState2 = pagerState;
                gapComposer2.updateRememberedValue(realProfileManager$setPhoto$2);
            } else {
                i2 = i4;
                realProfileManager$setPhoto$2 = rememberedValue2;
                versioned = versioned2;
                continuation = null;
                pagerState2 = pagerState;
                fullScreenLocation2 = fullScreenLocation3;
                neverEqualPolicy = neverEqualPolicy2;
            }
            Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) realProfileManager$setPhoto$2);
            NavigationModel.Ready.Swipe.Page page = (NavigationModel.Ready.Swipe.Page) this.requestedSwipePage$delegate.getValue();
            boolean changedInstance2 = gapComposer2.changedInstance(this) | gapComposer2.changedInstance(swipe2) | (i2 == 256);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new UiContainer$SwipeableScreenContent$2$1(this, swipe2, pagerState2, continuation);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer2, page, (Function2) rememberedValue3);
            Object obj = versioned.value;
            boolean changedInstance3 = gapComposer2.changedInstance(swipe2) | (i2 == 256);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new EntitySyncerKt$hasSyncedFlow$1(swipe2, pagerState2, continuation, 17);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer2, obj, (Function2) rememberedValue4);
            boolean changedInstance4 = (i2 == 256) | gapComposer2.changedInstance(swipe2) | gapComposer2.changedInstance(this);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new UiContainer$SwipeableScreenContent$2$1(pagerState2, swipe2, this, continuation);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(gapComposer2, pagerState2, (Function2) rememberedValue5);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new SpacesPagerInteractionManagerImpl();
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            final SpacesPagerInteractionManagerImpl spacesPagerInteractionManagerImpl = (SpacesPagerInteractionManagerImpl) rememberedValue6;
            final boolean z = pagerState2.isScrollInProgress() && !animatedContentScopeImpl.$$delegate_0.getTransition().isRunning();
            final NavigationModel.Ready.FullScreenLocation fullScreenLocation4 = fullScreenLocation2;
            gapComposer = gapComposer2;
            Updater.CompositionLocalProvider(SpacesPagerInteractionManagerKt.getLocalSpacesPagerInteractionManager().defaultProvidedValue$runtime(spacesPagerInteractionManagerImpl), Expect_jvmKt.rememberComposableLambda(-788543521, new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    boolean z2 = false;
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                        if (z) {
                            fillMaxSize = fillMaxSize.then(ImageKt.m177backgroundbw27NRU(companion, ColorsDarkKt.colorsDark.semantic.background.subtle, ColorKt.RectangleShape));
                        }
                        Modifier modifier = fillMaxSize;
                        final AnimatedContentScopeImpl animatedContentScopeImpl2 = animatedContentScopeImpl;
                        if (!animatedContentScopeImpl2.$$delegate_0.getTransition().isRunning() && !((Boolean) spacesPagerInteractionManagerImpl.isPaused$delegate.getValue()).booleanValue()) {
                            z2 = true;
                        }
                        final PagerState pagerState3 = pagerState2;
                        final Shape shape = displayRoundedCornerShapeOrNull;
                        final NavigationModel.Ready.Swipe swipe3 = swipe;
                        final ChromeConfigAggregator chromeConfigAggregator3 = chromeConfigAggregator;
                        final CashComposeInsets cashComposeInsets2 = cashComposeInsets;
                        final ChromeConfigAggregator chromeConfigAggregator4 = chromeConfigAggregator2;
                        final UiContainer uiContainer = this;
                        final SharedTransitionScope sharedTransitionScope2 = sharedTransitionScope;
                        final NavigationModel.Ready.FullScreenLocation fullScreenLocation5 = fullScreenLocation;
                        final ImmutableList immutableList2 = immutableList;
                        final SaveableStateHolder saveableStateHolder2 = saveableStateHolder;
                        final Function2 function22 = function2;
                        final NavigationModel.Ready.FullScreenLocation fullScreenLocation6 = fullScreenLocation4;
                        PagerKt.m328HorizontalPager8jOkeI(pagerState3, modifier, null, null, 0, 8.0f, null, null, z2, null, null, null, Expect_jvmKt.rememberComposableLambda(1237381920, new Function4() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                final int intValue2 = ((Integer) obj5).intValue();
                                Composer composer3 = (Composer) obj6;
                                ((Integer) obj7).getClass();
                                ((PagerScopeImpl) obj4).getClass();
                                final PagerState pagerState4 = PagerState.this;
                                boolean z3 = pagerState4.getSettledPage() == intValue2;
                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                Shape shape2 = shape;
                                final Modifier clip = shape2 != null ? ClipKt.clip(SizeKt.fillMaxSize(companion2, 1.0f), shape2) : SizeKt.fillMaxSize(companion2, 1.0f);
                                ProvidedValue defaultProvidedValue$runtime = SpacesPagerInteractionManagerKt.LocalSpacesPagerPageVisible.defaultProvidedValue$runtime(Boolean.valueOf(z3));
                                final NavigationModel.Ready.Swipe swipe4 = swipe3;
                                final ChromeConfigAggregator chromeConfigAggregator5 = chromeConfigAggregator3;
                                final CashComposeInsets cashComposeInsets3 = cashComposeInsets2;
                                final ChromeConfigAggregator chromeConfigAggregator6 = chromeConfigAggregator4;
                                final UiContainer uiContainer2 = uiContainer;
                                final SharedTransitionScope sharedTransitionScope3 = sharedTransitionScope2;
                                final NavigationModel.Ready.FullScreenLocation fullScreenLocation7 = fullScreenLocation5;
                                final ImmutableList immutableList3 = immutableList2;
                                final AnimatedContentScopeImpl animatedContentScopeImpl3 = animatedContentScopeImpl2;
                                final SaveableStateHolder saveableStateHolder3 = saveableStateHolder2;
                                final Function2 function23 = function22;
                                final NavigationModel.Ready.FullScreenLocation fullScreenLocation8 = fullScreenLocation6;
                                Updater.CompositionLocalProvider(defaultProvidedValue$runtime, Expect_jvmKt.rememberComposableLambda(-2141554720, new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj8, Object obj9) {
                                        Composer composer4 = (Composer) obj8;
                                        int intValue3 = ((Integer) obj9).intValue();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, Modifier.this);
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
                                            Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                            Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                            Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                            Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                            NavigationModel.Ready.Swipe swipe5 = swipe4;
                                            int i5 = UiContainer.WhenMappings.$EnumSwitchMapping$0[((NavigationModel.Ready.Swipe.Page) swipe5.pages.get(intValue2)).ordinal()];
                                            CashComposeInsets cashComposeInsets4 = cashComposeInsets3;
                                            UiContainer uiContainer3 = uiContainer2;
                                            SharedTransitionScope sharedTransitionScope4 = sharedTransitionScope3;
                                            AnimatedContentScopeImpl animatedContentScopeImpl4 = animatedContentScopeImpl3;
                                            SaveableStateHolder saveableStateHolder4 = saveableStateHolder3;
                                            if (i5 == 1) {
                                                gapComposer4.startReplaceGroup(-1994735273);
                                                Updater.CompositionLocalProvider(ChromeConfigKt.LocalChromeToolbarConfigAggregator.defaultProvidedValue$runtime(chromeConfigAggregator5), Expect_jvmKt.rememberComposableLambda(-1007804386, new DateInputKt$$ExternalSyntheticLambda1(uiContainer3, sharedTransitionScope4, fullScreenLocation7, immutableList3, animatedContentScopeImpl4, cashComposeInsets4, saveableStateHolder4, function23, 6), gapComposer4), gapComposer4, 56);
                                                gapComposer4.end(false);
                                            } else {
                                                gapComposer4.startReplaceGroup(-1994177490);
                                                Updater.CompositionLocalProvider(new ProvidedValue[]{CashInsetsKt.LocalCashInsets.defaultProvidedValue$runtime(cashComposeInsets4), ChromeConfigKt.LocalChromeToolbarConfigAggregator.defaultProvidedValue$runtime(chromeConfigAggregator6)}, Expect_jvmKt.rememberComposableLambda(704591719, new BasicShieetKt$$ExternalSyntheticLambda0(uiContainer3, fullScreenLocation8, animatedContentScopeImpl4, sharedTransitionScope4, saveableStateHolder4, swipe5, pagerState4), gapComposer4), gapComposer4, 56);
                                                gapComposer4.end(false);
                                            }
                                            gapComposer4.end(true);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer3), composer3, 56);
                                return Unit.INSTANCE;
                            }
                        }, gapComposer3), gapComposer3, 196608, 24576, 16092);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 56);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(sharedTransitionScope, swipe, pagerState, fullScreenLocation, immutableList, animatedContentScopeImpl, cashComposeInsets, saveableStateHolder, function2, chromeConfigAggregator, chromeConfigAggregator2, i) { // from class: com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda51
                public final /* synthetic */ SharedTransitionScope f$1;
                public final /* synthetic */ ChromeConfigAggregator f$10;
                public final /* synthetic */ ChromeConfigAggregator f$11;
                public final /* synthetic */ NavigationModel.Ready.Swipe f$2;
                public final /* synthetic */ PagerState f$3;
                public final /* synthetic */ NavigationModel.Ready.FullScreenLocation f$4;
                public final /* synthetic */ ImmutableList f$5;
                public final /* synthetic */ AnimatedContentScopeImpl f$6;
                public final /* synthetic */ CashComposeInsets f$7;
                public final /* synthetic */ SaveableStateHolder f$8;
                public final /* synthetic */ Function2 f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1073741825);
                    UiContainer.this.SwipeableScreenContent(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public void setModel(ContainerUiModel containerUiModel) {
        containerUiModel.getClass();
        boolean transparentNavBar = getTransparentNavBar(containerUiModel);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.containerModel$delegate;
        if (transparentNavBar != getTransparentNavBar((ContainerUiModel) parcelableSnapshotMutableState.getValue())) {
            setWindowFlagsDirty(true);
        }
        parcelableSnapshotMutableState.setValue(containerUiModel);
    }

    public final void setWindowFlagsDirty(boolean z) {
        this.windowFlagsDirty$delegate.setValue(Boolean.valueOf(z));
    }
}
