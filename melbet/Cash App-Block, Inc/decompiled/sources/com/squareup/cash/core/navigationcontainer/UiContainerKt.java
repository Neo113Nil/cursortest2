package com.squareup.cash.core.navigationcontainer;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda10;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Recomposer$recompositionRunner$2;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidGraphicsContext;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.graphics.Insets;
import androidx.datastore.core.SimpleActor;
import androidx.glance.session.SessionWorkerKt$runSession$snapshotMonitor$1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.Broadway;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.PresenterlessUi;
import app.cash.broadway.ui.ScreenLifecycleOwnerContextWrapper;
import app.cash.broadway.ui.Ui;
import app.cash.broadway.ui.UiFactory;
import app.cash.broadway.ui.UpdatesWindowFlags$Orientation;
import app.cash.broadway.ui.UpdatesWindowFlags$TabConfig;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.DialogEventDispatcher;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.broadway.ui.compose.FullScreenKt;
import app.cash.broadway.ui.compose.OrientationKt;
import app.cash.broadway.ui.compose.SecureScreenKt;
import app.cash.broadway.ui.compose.ToolbarConfig;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import app.cash.util.leakdetector.api.LeakDetector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.memory.MemoryCacheService;
import com.google.android.gms.tasks.zzr;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda4;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.InAppNotificationModel;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.appmessages.views.RealAppMessageImageLoader;
import com.squareup.cash.appmessages.views.RealTooltipTargetLoadedCallbackRegistry;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeContextWrapper;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.BlockersThemer;
import com.squareup.cash.blockers.views.RegisterAliasViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda2;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.common.ui.ColorModelsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.LegacySheetConfig;
import com.squareup.cash.core.navigationcontainer.api.PresenterElement;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$Tab;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$TabTreatment;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.EventListener;
import com.squareup.cash.core.views.BottomNavigationKt;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.fidesmo.views.ScanningShapePulseKt$$ExternalSyntheticLambda2;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.screens.AccentedScreen;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.sheet.UserDismissMode;
import com.squareup.cash.support.screenshot.ScreenshotViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.MoneybotToolbarSharedElementConfig;
import com.squareup.cash.tabs.views.SharedToolbarSwipeScope;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStateListener;
import com.squareup.cash.ui.DialogResultListener;
import com.squareup.cash.ui.FullScreen;
import com.squareup.cash.ui.LandscapeOrientation;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.cash.ui.OnTransitionListener;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.OverridesSystemBars;
import com.squareup.cash.ui.SecureScreen;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.util.lifecycle.MinimumLifecycleOwner;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.thing.Thing;
import com.squareup.workflow1.Workflows;
import com.stripe.android.model.parsers.WalletJsonParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.StateFlow;
import okio.Path;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.internal.LaunchTracker$$ExternalSyntheticLambda0;
import papa.internal.Perfs$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public abstract class UiContainerKt {
    public static final StaticProvidableCompositionLocal LocalLegacySheetScope = new StaticProvidableCompositionLocal(new Moneys$$ExternalSyntheticLambda0(7));

    public static final void ArcadeTabs(final ElementBoundsRegistry elementBoundsRegistry, final Function1 function1, final Function1 function12, final NavigationModel.Ready.FullScreenLocation fullScreenLocation, final ImmutableList immutableList, final UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig, final SplashScreenAnimationObserver splashScreenAnimationObserver, final float f, Modifier modifier, Composer composer, final int i) {
        final Modifier modifier2;
        GapComposer gapComposer;
        long j;
        long j2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(939230200);
        int i2 = (gapComposer2.changedInstance(elementBoundsRegistry) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(fullScreenLocation) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(immutableList) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? gapComposer2.changed(updatesWindowFlags$TabConfig) : gapComposer2.changedInstance(updatesWindowFlags$TabConfig) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changed(splashScreenAnimationObserver) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changed(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer2.changed(modifier2) ? 67108864 : 33554432;
        } else {
            modifier2 = modifier;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            Modifier alpha = AlphaKt.alpha(SpacerKt.navigationBarsPadding(modifier2), f);
            boolean z = ((i2 & 896) == 256) | ((i2 & 29360128) == 8388608);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new UiContainerKt$$ExternalSyntheticLambda12(function12, f, 0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier onPlaced = RulerKt.onPlaced(alpha, (Function1) rememberedValue);
            boolean z2 = (i2 & 3670016) == 1048576;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new HomeViewKt$$ExternalSyntheticLambda10(splashScreenAnimationObserver, 1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Modifier offset = OffsetKt.offset(onPlaced, (Function1) rememberedValue2);
            Iterator it = immutableList.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    gapComposer = gapComposer2;
                    i3 = -1;
                    break;
                } else {
                    gapComposer = gapComposer2;
                    if (((Boolean) ((MainScreensViewModel$Tab) it.next()).getScreenMatcher().invoke(fullScreenLocation.screen)).booleanValue()) {
                        break;
                    }
                    i3++;
                    gapComposer2 = gapComposer;
                }
            }
            long j3 = updatesWindowFlags$TabConfig != null ? updatesWindowFlags$TabConfig.itemForegroundSelectedColor : Color.Unspecified;
            if (updatesWindowFlags$TabConfig != null) {
                j = j3;
                j2 = updatesWindowFlags$TabConfig.itemForegroundUnselectedColor;
            } else {
                j = j3;
                j2 = Color.Unspecified;
            }
            Workflows.m4003ArcadeBottomNavigationbogVsAg(offset, immutableList, Integer.valueOf(i3), !(updatesWindowFlags$TabConfig != null), j, j2, function1, elementBoundsRegistry, gapComposer, ((i2 << 21) & 29360128) | ((i2 >> 9) & 112) | ((i2 << 15) & 3670016));
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    UiContainerKt.ArcadeTabs(ElementBoundsRegistry.this, function1, function12, fullScreenLocation, immutableList, updatesWindowFlags$TabConfig, splashScreenAnimationObserver, f, modifier2, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void AttachUiModelReceivedSideEffect(Object obj, Screen screen, List list, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-76277152);
        int i2 = (gapComposer.changedInstance(obj) ? 4 : 2) | i | (gapComposer.changedInstance(screen) ? 32 : 16) | (gapComposer.changedInstance(list) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new AtomicReference(new Object());
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AtomicReference atomicReference = (AtomicReference) rememberedValue;
            if (Intrinsics.areEqual(obj, atomicReference.get())) {
                gapComposer.startReplaceGroup(-334574558);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-334714864);
                boolean changedInstance = gapComposer.changedInstance(atomicReference) | gapComposer.changedInstance(obj) | gapComposer.changedInstance(list) | gapComposer.changedInstance(screen);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    RegisterAliasViewKt$$ExternalSyntheticLambda17 registerAliasViewKt$$ExternalSyntheticLambda17 = new RegisterAliasViewKt$$ExternalSyntheticLambda17(atomicReference, obj, list, screen, 1);
                    gapComposer.updateRememberedValue(registerAliasViewKt$$ExternalSyntheticLambda17);
                    rememberedValue2 = registerAliasViewKt$$ExternalSyntheticLambda17;
                }
                Updater.SideEffect((Function0) rememberedValue2, gapComposer);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashApp$$ExternalSyntheticLambda4(obj, screen, list, i, 5);
        }
    }

    public static final void BottomSheet(LegacySheetConfig legacySheetConfig, BottomSheetStateListener bottomSheetStateListener, Function0 function0, Function0 function02, Function2 function2, Composer composer, int i) {
        int i2;
        Function0 function03;
        Function2 function22;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(70197657);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer2.changed(legacySheetConfig) : gapComposer2.changedInstance(legacySheetConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(bottomSheetStateListener) ? 32 : 16;
        }
        SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = null;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function03 = function0;
            i2 |= gapComposer2.changedInstance(function03) ? 2048 : 1024;
        } else {
            function03 = function0;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            function22 = function2;
            i2 |= gapComposer2.changedInstance(function22) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            function22 = function2;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer2).systemBars;
            if (legacySheetConfig == null || legacySheetConfig.getInitialHeightPx() == null) {
                gapComposer2.startReplaceGroup(-389863433);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-390270680);
                Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                int i4 = androidWindowInsets.getInsets$foundation_layout().bottom;
                int i5 = androidWindowInsets.getInsets$foundation_layout().top;
                legacySheetConfig.getInitialHeightPx().getClass();
                sheetPeekPosition$FixedHeight = new SheetPeekPosition$FixedHeight(6, (((r12.intValue() + i4) + i5) / density.getDensity()) + 16.0f, false);
                gapComposer2.end(false);
            }
            SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight2 = sheetPeekPosition$FixedHeight;
            RealSheetState rememberLegacySheetState = SheetStateKt.rememberLegacySheetState(legacySheetConfig != null ? legacySheetConfig.getUserDismissMode() : UserDismissMode.All, gapComposer2);
            gapComposer = gapComposer2;
            SheetKt.Sheet(function02, null, rememberLegacySheetState, sheetPeekPosition$FixedHeight2, null, false, null, Expect_jvmKt.rememberComposableLambda(-1312200400, new SwipeToDismissKt$$ExternalSyntheticLambda2(legacySheetConfig, rememberLegacySheetState, function03, bottomSheetStateListener, function22, 7), gapComposer2), gapComposer, ((i3 >> 12) & 14) | 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(legacySheetConfig, bottomSheetStateListener, function0, function02, function2, i, 23);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContainerTabToolbar(final ToolbarConfig toolbarConfig, TabToolbarInternalViewModel tabToolbarInternalViewModel, final ElementBoundsRegistry elementBoundsRegistry, MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig, SimpleActor simpleActor, Modifier modifier, SharedToolbarSwipeScope sharedToolbarSwipeScope, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        SharedToolbarSwipeScope sharedToolbarSwipeScope2;
        Modifier modifier3;
        SharedToolbarSwipeScope sharedToolbarSwipeScope3;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1199479408);
        int i4 = i | (gapComposer.changedInstance(toolbarConfig) ? 4 : 2) | (gapComposer.changedInstance(tabToolbarInternalViewModel) ? 32 : 16) | (gapComposer.changedInstance(elementBoundsRegistry) ? 256 : 128) | (gapComposer.changedInstance(moneybotToolbarSharedElementConfig) ? 2048 : 1024) | (gapComposer.changedInstance(simpleActor) ? 16384 : PKIFailureInfo.certRevoked);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            sharedToolbarSwipeScope2 = sharedToolbarSwipeScope;
            i3 |= gapComposer.changed(sharedToolbarSwipeScope2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            final int i7 = 0;
            final int i8 = 1;
            if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                sharedToolbarSwipeScope3 = sharedToolbarSwipeScope2;
            } else {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier modifier5 = i5 != 0 ? companion : modifier2;
                DynamicColorConfiguration dynamicColorConfiguration = null;
                final SharedToolbarSwipeScope sharedToolbarSwipeScope4 = i6 != 0 ? null : sharedToolbarSwipeScope2;
                TabToolbarInternalViewModel tabToolbarInternalViewModel2 = toolbarConfig.toolbarInternalModel;
                TabToolbarInternalViewModel tabToolbarInternalViewModel3 = tabToolbarInternalViewModel2 == null ? tabToolbarInternalViewModel : tabToolbarInternalViewModel2;
                Modifier then = toolbarConfig.moneybotSharedElementKeys != null ? modifier5.then(SpacerKt.m302paddingqDBjuR0$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, 10.0f, RecyclerView.DECELERATION_RATE, 10)) : modifier5;
                ToolbarConfig.ColorConfiguration colorConfiguration = toolbarConfig.colorConfiguration;
                if (colorConfiguration == null) {
                    gapComposer.startReplaceGroup(437578069);
                    gapComposer.end(false);
                    modifier4 = modifier5;
                } else {
                    gapComposer.startReplaceGroup(437578070);
                    modifier4 = modifier5;
                    dynamicColorConfiguration = TransactorKt.m1173invokeRGew2ao(colorConfiguration.m1201getText0d7_KjU(), colorConfiguration.m1200getIcon0d7_KjU(), colorConfiguration.m1199getDeselectedIcon0d7_KjU(), gapComposer, 0);
                    gapComposer.end(false);
                }
                if (dynamicColorConfiguration == null) {
                    gapComposer.startReplaceGroup(-1648447573);
                    dynamicColorConfiguration = TransactorKt.m1173invokeRGew2ao(0L, 0L, 0L, gapComposer, 7);
                } else {
                    gapComposer.startReplaceGroup(-1648453370);
                }
                gapComposer.end(false);
                DynamicColorConfiguration dynamicColorConfiguration2 = dynamicColorConfiguration;
                TabToolbarsKt.TabToolbar(then, tabToolbarInternalViewModel3, dynamicColorConfiguration2, toolbarConfig.useIconColorAroundProfile, Expect_jvmKt.rememberComposableLambda(-169236644, new Function3() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda54
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i9 = i7;
                        ToolbarConfig toolbarConfig2 = toolbarConfig;
                        switch (i9) {
                            case 0:
                                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                titleBarActionScope.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                    for (final ToolbarConfig.Action action : toolbarConfig2.startActions) {
                                        final TitleBarActionScope titleBarActionScope2 = titleBarActionScope;
                                        final int i10 = 1;
                                        final SharedToolbarSwipeScope sharedToolbarSwipeScope5 = sharedToolbarSwipeScope4;
                                        final ElementBoundsRegistry elementBoundsRegistry2 = elementBoundsRegistry;
                                        TabToolbarsKt.m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope5, 0L, Expect_jvmKt.rememberComposableLambda(-964131235, new Function4() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function4
                                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                                int i11 = i10;
                                                ElementBoundsRegistry elementBoundsRegistry3 = elementBoundsRegistry2;
                                                SharedToolbarSwipeScope sharedToolbarSwipeScope6 = sharedToolbarSwipeScope5;
                                                ToolbarConfig.Action action2 = action;
                                                switch (i11) {
                                                    case 0:
                                                        Modifier modifier6 = (Modifier) obj4;
                                                        Composer composer3 = (Composer) obj6;
                                                        int intValue2 = ((Integer) obj7).intValue();
                                                        modifier6.getClass();
                                                        if ((intValue2 & 6) == 0) {
                                                            intValue2 |= ((GapComposer) composer3).changed(modifier6) ? 4 : 2;
                                                        }
                                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                                        if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 131) != 130)) {
                                                            Painter painter = action2.icon;
                                                            String str = action2.label;
                                                            Function0 function0 = action2.onClick;
                                                            Modifier swipeToolbarControl = TabToolbarsKt.swipeToolbarControl(modifier6, sharedToolbarSwipeScope6, false, gapComposer3, (intValue2 & 14) | MLKEMEngine.KyberPolyBytes);
                                                            int i12 = ToolbarConfig.Action.$r8$clinit;
                                                            TransactorKt.IconAction(titleBarActionScope2, painter, str, function0, UiContainerKt.toolbarActionModifier(swipeToolbarControl, action2, elementBoundsRegistry3, gapComposer3), null, gapComposer3, Painter.$stable << 3, 16);
                                                        } else {
                                                            gapComposer3.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Modifier modifier7 = (Modifier) obj4;
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue3 = ((Integer) obj7).intValue();
                                                        modifier7.getClass();
                                                        if ((intValue3 & 6) == 0) {
                                                            intValue3 |= ((GapComposer) composer4).changed(modifier7) ? 4 : 2;
                                                        }
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 131) != 130)) {
                                                            Painter painter2 = action2.icon;
                                                            String str2 = action2.label;
                                                            Function0 function02 = action2.onClick;
                                                            Modifier swipeToolbarControl2 = TabToolbarsKt.swipeToolbarControl(modifier7, sharedToolbarSwipeScope6, true, gapComposer4, (intValue3 & 14) | MLKEMEngine.KyberPolyBytes);
                                                            int i13 = ToolbarConfig.Action.$r8$clinit;
                                                            TransactorKt.IconAction(titleBarActionScope2, painter2, str2, function02, UiContainerKt.toolbarActionModifier(swipeToolbarControl2, action2, elementBoundsRegistry3, gapComposer4), null, gapComposer4, Painter.$stable << 3, 16);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer2), gapComposer2, MLKEMEngine.KyberPolyBytes, 2);
                                        titleBarActionScope = titleBarActionScope2;
                                    }
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                final TitleBarActionScope titleBarActionScope3 = (TitleBarActionScope) obj;
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                titleBarActionScope3.getClass();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((GapComposer) composer3).changed(titleBarActionScope3) ? 4 : 2;
                                }
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    for (final ToolbarConfig.Action action2 : toolbarConfig2.endActions) {
                                        final int i11 = 0;
                                        final SharedToolbarSwipeScope sharedToolbarSwipeScope6 = sharedToolbarSwipeScope4;
                                        final ElementBoundsRegistry elementBoundsRegistry3 = elementBoundsRegistry;
                                        TabToolbarsKt.m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope6, 0L, Expect_jvmKt.rememberComposableLambda(865075102, new Function4() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function4
                                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                                int i112 = i11;
                                                ElementBoundsRegistry elementBoundsRegistry32 = elementBoundsRegistry3;
                                                SharedToolbarSwipeScope sharedToolbarSwipeScope62 = sharedToolbarSwipeScope6;
                                                ToolbarConfig.Action action22 = action2;
                                                switch (i112) {
                                                    case 0:
                                                        Modifier modifier6 = (Modifier) obj4;
                                                        Composer composer32 = (Composer) obj6;
                                                        int intValue22 = ((Integer) obj7).intValue();
                                                        modifier6.getClass();
                                                        if ((intValue22 & 6) == 0) {
                                                            intValue22 |= ((GapComposer) composer32).changed(modifier6) ? 4 : 2;
                                                        }
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 131) != 130)) {
                                                            Painter painter = action22.icon;
                                                            String str = action22.label;
                                                            Function0 function0 = action22.onClick;
                                                            Modifier swipeToolbarControl = TabToolbarsKt.swipeToolbarControl(modifier6, sharedToolbarSwipeScope62, false, gapComposer32, (intValue22 & 14) | MLKEMEngine.KyberPolyBytes);
                                                            int i12 = ToolbarConfig.Action.$r8$clinit;
                                                            TransactorKt.IconAction(titleBarActionScope3, painter, str, function0, UiContainerKt.toolbarActionModifier(swipeToolbarControl, action22, elementBoundsRegistry32, gapComposer32), null, gapComposer32, Painter.$stable << 3, 16);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Modifier modifier7 = (Modifier) obj4;
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue3 = ((Integer) obj7).intValue();
                                                        modifier7.getClass();
                                                        if ((intValue3 & 6) == 0) {
                                                            intValue3 |= ((GapComposer) composer4).changed(modifier7) ? 4 : 2;
                                                        }
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 131) != 130)) {
                                                            Painter painter2 = action22.icon;
                                                            String str2 = action22.label;
                                                            Function0 function02 = action22.onClick;
                                                            Modifier swipeToolbarControl2 = TabToolbarsKt.swipeToolbarControl(modifier7, sharedToolbarSwipeScope62, true, gapComposer4, (intValue3 & 14) | MLKEMEngine.KyberPolyBytes);
                                                            int i13 = ToolbarConfig.Action.$r8$clinit;
                                                            TransactorKt.IconAction(titleBarActionScope3, painter2, str2, function02, UiContainerKt.toolbarActionModifier(swipeToolbarControl2, action22, elementBoundsRegistry32, gapComposer4), null, gapComposer4, Painter.$stable << 3, 16);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), gapComposer3, MLKEMEngine.KyberPolyBytes, 2);
                                    }
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), Expect_jvmKt.rememberComposableLambda(1659969693, new Function3() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda54
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i9 = i8;
                        ToolbarConfig toolbarConfig2 = toolbarConfig;
                        switch (i9) {
                            case 0:
                                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                titleBarActionScope.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                    for (final ToolbarConfig.Action action : toolbarConfig2.startActions) {
                                        final TitleBarActionScope titleBarActionScope2 = titleBarActionScope;
                                        final int i10 = 1;
                                        final SharedToolbarSwipeScope sharedToolbarSwipeScope5 = sharedToolbarSwipeScope4;
                                        final ElementBoundsRegistry elementBoundsRegistry2 = elementBoundsRegistry;
                                        TabToolbarsKt.m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope5, 0L, Expect_jvmKt.rememberComposableLambda(-964131235, new Function4() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function4
                                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                                int i112 = i10;
                                                ElementBoundsRegistry elementBoundsRegistry32 = elementBoundsRegistry2;
                                                SharedToolbarSwipeScope sharedToolbarSwipeScope62 = sharedToolbarSwipeScope5;
                                                ToolbarConfig.Action action22 = action;
                                                switch (i112) {
                                                    case 0:
                                                        Modifier modifier6 = (Modifier) obj4;
                                                        Composer composer32 = (Composer) obj6;
                                                        int intValue22 = ((Integer) obj7).intValue();
                                                        modifier6.getClass();
                                                        if ((intValue22 & 6) == 0) {
                                                            intValue22 |= ((GapComposer) composer32).changed(modifier6) ? 4 : 2;
                                                        }
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 131) != 130)) {
                                                            Painter painter = action22.icon;
                                                            String str = action22.label;
                                                            Function0 function0 = action22.onClick;
                                                            Modifier swipeToolbarControl = TabToolbarsKt.swipeToolbarControl(modifier6, sharedToolbarSwipeScope62, false, gapComposer32, (intValue22 & 14) | MLKEMEngine.KyberPolyBytes);
                                                            int i12 = ToolbarConfig.Action.$r8$clinit;
                                                            TransactorKt.IconAction(titleBarActionScope2, painter, str, function0, UiContainerKt.toolbarActionModifier(swipeToolbarControl, action22, elementBoundsRegistry32, gapComposer32), null, gapComposer32, Painter.$stable << 3, 16);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Modifier modifier7 = (Modifier) obj4;
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue3 = ((Integer) obj7).intValue();
                                                        modifier7.getClass();
                                                        if ((intValue3 & 6) == 0) {
                                                            intValue3 |= ((GapComposer) composer4).changed(modifier7) ? 4 : 2;
                                                        }
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 131) != 130)) {
                                                            Painter painter2 = action22.icon;
                                                            String str2 = action22.label;
                                                            Function0 function02 = action22.onClick;
                                                            Modifier swipeToolbarControl2 = TabToolbarsKt.swipeToolbarControl(modifier7, sharedToolbarSwipeScope62, true, gapComposer4, (intValue3 & 14) | MLKEMEngine.KyberPolyBytes);
                                                            int i13 = ToolbarConfig.Action.$r8$clinit;
                                                            TransactorKt.IconAction(titleBarActionScope2, painter2, str2, function02, UiContainerKt.toolbarActionModifier(swipeToolbarControl2, action22, elementBoundsRegistry32, gapComposer4), null, gapComposer4, Painter.$stable << 3, 16);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer2), gapComposer2, MLKEMEngine.KyberPolyBytes, 2);
                                        titleBarActionScope = titleBarActionScope2;
                                    }
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                final TitleBarActionScope titleBarActionScope3 = (TitleBarActionScope) obj;
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                titleBarActionScope3.getClass();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((GapComposer) composer3).changed(titleBarActionScope3) ? 4 : 2;
                                }
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    for (final ToolbarConfig.Action action2 : toolbarConfig2.endActions) {
                                        final int i11 = 0;
                                        final SharedToolbarSwipeScope sharedToolbarSwipeScope6 = sharedToolbarSwipeScope4;
                                        final ElementBoundsRegistry elementBoundsRegistry3 = elementBoundsRegistry;
                                        TabToolbarsKt.m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope6, 0L, Expect_jvmKt.rememberComposableLambda(865075102, new Function4() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function4
                                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                                int i112 = i11;
                                                ElementBoundsRegistry elementBoundsRegistry32 = elementBoundsRegistry3;
                                                SharedToolbarSwipeScope sharedToolbarSwipeScope62 = sharedToolbarSwipeScope6;
                                                ToolbarConfig.Action action22 = action2;
                                                switch (i112) {
                                                    case 0:
                                                        Modifier modifier6 = (Modifier) obj4;
                                                        Composer composer32 = (Composer) obj6;
                                                        int intValue22 = ((Integer) obj7).intValue();
                                                        modifier6.getClass();
                                                        if ((intValue22 & 6) == 0) {
                                                            intValue22 |= ((GapComposer) composer32).changed(modifier6) ? 4 : 2;
                                                        }
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 131) != 130)) {
                                                            Painter painter = action22.icon;
                                                            String str = action22.label;
                                                            Function0 function0 = action22.onClick;
                                                            Modifier swipeToolbarControl = TabToolbarsKt.swipeToolbarControl(modifier6, sharedToolbarSwipeScope62, false, gapComposer32, (intValue22 & 14) | MLKEMEngine.KyberPolyBytes);
                                                            int i12 = ToolbarConfig.Action.$r8$clinit;
                                                            TransactorKt.IconAction(titleBarActionScope3, painter, str, function0, UiContainerKt.toolbarActionModifier(swipeToolbarControl, action22, elementBoundsRegistry32, gapComposer32), null, gapComposer32, Painter.$stable << 3, 16);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Modifier modifier7 = (Modifier) obj4;
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue3 = ((Integer) obj7).intValue();
                                                        modifier7.getClass();
                                                        if ((intValue3 & 6) == 0) {
                                                            intValue3 |= ((GapComposer) composer4).changed(modifier7) ? 4 : 2;
                                                        }
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 131) != 130)) {
                                                            Painter painter2 = action22.icon;
                                                            String str2 = action22.label;
                                                            Function0 function02 = action22.onClick;
                                                            Modifier swipeToolbarControl2 = TabToolbarsKt.swipeToolbarControl(modifier7, sharedToolbarSwipeScope62, true, gapComposer4, (intValue3 & 14) | MLKEMEngine.KyberPolyBytes);
                                                            int i13 = ToolbarConfig.Action.$r8$clinit;
                                                            TransactorKt.IconAction(titleBarActionScope3, painter2, str2, function02, UiContainerKt.toolbarActionModifier(swipeToolbarControl2, action22, elementBoundsRegistry32, gapComposer4), null, gapComposer4, Painter.$stable << 3, 16);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), gapComposer3, MLKEMEngine.KyberPolyBytes, 2);
                                    }
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), Expect_jvmKt.rememberComposableLambda(-2040213600, new CheckDepositAmountKt$$ExternalSyntheticLambda6(26, toolbarConfig, sharedToolbarSwipeScope4), gapComposer), toolbarConfig.onEvent, elementBoundsRegistry, simpleActor, moneybotToolbarSharedElementConfig, sharedToolbarSwipeScope4, toolbarConfig.showMoneybotTooltip, gapComposer, ((i3 << 18) & 234881024) | 1075535872 | ((i3 << 15) & 1879048192), 8 | ((i3 >> 9) & 14) | ((i3 >> 15) & 112), 0);
                gapComposer = gapComposer;
                sharedToolbarSwipeScope3 = sharedToolbarSwipeScope4;
                modifier3 = modifier4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ToastKt$$ExternalSyntheticLambda3(toolbarConfig, tabToolbarInternalViewModel, elementBoundsRegistry, moneybotToolbarSharedElementConfig, simpleActor, modifier3, sharedToolbarSwipeScope3, i, i2);
                return;
            }
            return;
        }
        sharedToolbarSwipeScope2 = sharedToolbarSwipeScope;
        final int i72 = 0;
        final int i82 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void FabTab(Function1 function1, Function1 function12, Function1 function13, float f, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1450199189);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function13) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            function13.invoke(Insets.NONE);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            MutableState collectIsPressedAsState = Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer, 6);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.brand;
            long j2 = Color.Black;
            long m689lerpjxsXWHM = ColorKt.m689lerpjxsXWHM(0.12f, j, j2);
            String stringResource = Room.stringResource(gapComposer, R.string.core_container_tab_payment);
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SizeKt.fillMaxWidth(modifier, 1.0f));
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier alpha = AlphaKt.alpha(SpacerKt.m302paddingqDBjuR0$default(navigationBarsPadding, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new UiContainerKt$$ExternalSyntheticLambda12(function12, f, 1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier onPlaced = RulerKt.onPlaced(alpha, (Function1) rememberedValue2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onPlaced);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            int i3 = i2;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 64.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f));
            if (((Boolean) collectIsPressedAsState.getValue()).booleanValue()) {
                j = m689lerpjxsXWHM;
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j, ColorKt.RectangleShape);
            Role role = new Role(0);
            boolean z2 = (i3 & 14) == 4;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(20, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU, mutableInteractionSourceImpl, null, false, stringResource, role, (Function0) rememberedValue3, 4);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Trace.m1191Iconww6aTOc(Icons.NavigationLogoUsd, stringResource, (Modifier) null, j2, gapComposer, 3078, 4);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScanningShapePulseKt$$ExternalSyntheticLambda2(function1, function12, function13, f, modifier, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FloatingTabs(final ElementBoundsRegistry elementBoundsRegistry, final Function1 function1, final Function1 function12, final NavigationModel.Ready.FullScreenLocation fullScreenLocation, final ImmutableList immutableList, final UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig, final boolean z, final boolean z2, final float f, final Modifier modifier, final SplashScreenAnimationObserver splashScreenAnimationObserver, final SharedTransitionScope sharedTransitionScope, final AnimatedVisibilityScope animatedVisibilityScope, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        AnimatedVisibilityScope animatedVisibilityScope2;
        GapComposer gapComposer;
        int i4;
        boolean z4;
        boolean changed;
        Object rememberedValue;
        int i5;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1113574771);
        int i6 = (gapComposer2.changedInstance(elementBoundsRegistry) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if ((i & 3072) == 0) {
            i6 |= gapComposer2.changedInstance(fullScreenLocation) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= gapComposer2.changedInstance(immutableList) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i6 |= (262144 & i) == 0 ? gapComposer2.changed(updatesWindowFlags$TabConfig) : gapComposer2.changedInstance(updatesWindowFlags$TabConfig) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            z3 = z;
            i6 |= gapComposer2.changed(z3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            z3 = z;
        }
        if ((i & 12582912) == 0) {
            i6 |= gapComposer2.changed(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i6 |= gapComposer2.changed(f) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i6 |= gapComposer2.changed(modifier) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (gapComposer2.changed(splashScreenAnimationObserver) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer2.changed(sharedTransitionScope) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            animatedVisibilityScope2 = animatedVisibilityScope;
            i3 |= gapComposer2.changedInstance(animatedVisibilityScope2) ? 256 : 128;
        } else {
            animatedVisibilityScope2 = animatedVisibilityScope;
        }
        int i7 = i3;
        if (gapComposer2.shouldExecute(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            Iterator it = immutableList.iterator();
            int i8 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i8 = -1;
                    break;
                }
                Iterator it2 = it;
                if (((Boolean) ((MainScreensViewModel$Tab) it.next()).getScreenMatcher().invoke(fullScreenLocation.screen)).booleanValue()) {
                    break;
                }
                i8++;
                it = it2;
            }
            MainScreensViewModel$Tab mainScreensViewModel$Tab = (MainScreensViewModel$Tab) CollectionsKt.getOrNull(i8, immutableList);
            if (z2 && mainScreensViewModel$Tab != null) {
                if (mainScreensViewModel$Tab.getSupportsFlatTabs()) {
                    i4 = i6;
                    z4 = true;
                    Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                    int i9 = i4;
                    Modifier alpha = AlphaKt.alpha(SpacerKt.m302paddingqDBjuR0$default(SpacerKt.navigationBarsPadding(modifier), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), f);
                    changed = gapComposer2.changed(density) | ((i9 & 234881024) == 67108864);
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!changed || rememberedValue == Composer.Companion.Empty) {
                        i5 = i8;
                        rememberedValue = new ThumbNode$$ExternalSyntheticLambda0(density, function12, f, 6);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    } else {
                        i5 = i8;
                    }
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(RulerKt.onPlaced(alpha, (Function1) rememberedValue), RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    long j7 = updatesWindowFlags$TabConfig == null ? updatesWindowFlags$TabConfig.backgroundColor : Color.Unspecified;
                    if (updatesWindowFlags$TabConfig == null) {
                        j = j7;
                        j2 = updatesWindowFlags$TabConfig.itemBackgroundSelectedColor;
                    } else {
                        j = j7;
                        j2 = Color.Unspecified;
                    }
                    if (updatesWindowFlags$TabConfig == null) {
                        j3 = j2;
                        j4 = updatesWindowFlags$TabConfig.itemForegroundSelectedColor;
                    } else {
                        j3 = j2;
                        j4 = Color.Unspecified;
                    }
                    if (updatesWindowFlags$TabConfig == null) {
                        j5 = j4;
                        j6 = updatesWindowFlags$TabConfig.itemForegroundUnselectedColor;
                    } else {
                        j5 = j4;
                        j6 = Color.Unspecified;
                    }
                    gapComposer = gapComposer2;
                    BottomNavigationKt.m3507BottomNavigation225kfQQ(m302paddingqDBjuR0$default, immutableList, z3, Integer.valueOf(i5), z4, j, j3, j5, j6, function1, elementBoundsRegistry, sharedTransitionScope, animatedVisibilityScope2, splashScreenAnimationObserver, gapComposer, ((i9 >> 12) & 896) | ((i9 >> 9) & 112) | ((i9 << 24) & 1879048192), (i9 & 14) | (i7 & 112) | (i7 & 896) | ((i7 << 9) & 7168));
                }
            }
            i4 = i6;
            z4 = false;
            Density density2 = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            int i92 = i4;
            Modifier alpha2 = AlphaKt.alpha(SpacerKt.m302paddingqDBjuR0$default(SpacerKt.navigationBarsPadding(modifier), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), f);
            changed = gapComposer2.changed(density2) | ((i92 & 234881024) == 67108864);
            rememberedValue = gapComposer2.rememberedValue();
            if (changed) {
            }
            i5 = i8;
            rememberedValue = new ThumbNode$$ExternalSyntheticLambda0(density2, function12, f, 6);
            gapComposer2.updateRememberedValue(rememberedValue);
            Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(RulerKt.onPlaced(alpha2, (Function1) rememberedValue), RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            if (updatesWindowFlags$TabConfig == null) {
            }
            if (updatesWindowFlags$TabConfig == null) {
            }
            if (updatesWindowFlags$TabConfig == null) {
            }
            if (updatesWindowFlags$TabConfig == null) {
            }
            gapComposer = gapComposer2;
            BottomNavigationKt.m3507BottomNavigation225kfQQ(m302paddingqDBjuR0$default2, immutableList, z3, Integer.valueOf(i5), z4, j, j3, j5, j6, function1, elementBoundsRegistry, sharedTransitionScope, animatedVisibilityScope2, splashScreenAnimationObserver, gapComposer, ((i92 >> 12) & 896) | ((i92 >> 9) & 112) | ((i92 << 24) & 1879048192), (i92 & 14) | (i7 & 112) | (i7 & 896) | ((i7 << 9) & 7168));
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    UiContainerKt.FloatingTabs(ElementBoundsRegistry.this, function1, function12, fullScreenLocation, immutableList, updatesWindowFlags$TabConfig, z, z2, f, modifier, splashScreenAnimationObserver, sharedTransitionScope, animatedVisibilityScope, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void InAppNotification(RealAppMessageImageLoader realAppMessageImageLoader, Function1 function1, InAppNotificationModel inAppNotificationModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1749475445);
        int i2 = i | (gapComposer.changedInstance(realAppMessageImageLoader) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(inAppNotificationModel) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.statusBarsPadding(Modifier.Companion.$$INSTANCE), 16.0f, 30.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            boolean changedInstance = gapComposer.changedInstance(realAppMessageImageLoader) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Recomposer$$ExternalSyntheticLambda4(28, realAppMessageImageLoader, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean changedInstance2 = gapComposer.changedInstance(inAppNotificationModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new StorageLinkQueries$$ExternalSyntheticLambda8(inAppNotificationModel, 9);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function12, null, (Function1) rememberedValue2, gapComposer, 0, 2);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashApp$$ExternalSyntheticLambda4(realAppMessageImageLoader, function1, inAppNotificationModel, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ScreenContent(final Broadway broadway, final NavigationModel.Ready.Location location, final AnimatedVisibilityScope animatedVisibilityScope, final SharedTransitionScope sharedTransitionScope, final SaveableStateHolder saveableStateHolder, final boolean z, final AtomicReference atomicReference, final Function1 function1, final Function1 function12, final WireAdapter wireAdapter, final LeakDetector leakDetector, final AtomicReference atomicReference2, final List list, final LifecycleOwner lifecycleOwner, boolean z2, Function6 function6, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        GapComposer gapComposer;
        final boolean z3;
        final Function6 function62;
        boolean z4;
        final Function6 function63;
        Context context;
        UiFactory.ScreenUi screenUi;
        Context context2;
        List list2;
        Iterator it;
        Context context3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2068387278);
        int i5 = i | (gapComposer2.changedInstance(broadway) ? 4 : 2) | (gapComposer2.changedInstance(location) ? 32 : 16) | (gapComposer2.changedInstance(animatedVisibilityScope) ? 256 : 128) | (gapComposer2.changed(sharedTransitionScope) ? 2048 : 1024);
        boolean changedInstance = gapComposer2.changedInstance(saveableStateHolder);
        int i6 = PKIFailureInfo.certRevoked;
        int i7 = i5 | (changedInstance ? 16384 : 8192) | (gapComposer2.changed(z) ? 131072 : 65536) | (gapComposer2.changedInstance(atomicReference) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changedInstance(function1) ? 8388608 : 4194304) | (gapComposer2.changedInstance(function12) ? 67108864 : 33554432) | (gapComposer2.changed(wireAdapter) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i8 = i2 | (gapComposer2.changedInstance(leakDetector) ? 4 : 2) | (gapComposer2.changedInstance(atomicReference2) ? 32 : 16) | (gapComposer2.changedInstance(list) ? 256 : 128) | (gapComposer2.changedInstance(lifecycleOwner) ? 2048 : 1024);
        int i9 = i3 & 16384;
        if (i9 != 0) {
            i4 = i8 | 24576;
        } else {
            if (gapComposer2.changed(z2)) {
                i6 = 16384;
            }
            i4 = i8 | i6;
        }
        int i10 = i3 & 32768;
        if (i10 != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= gapComposer2.changedInstance(function6) ? 131072 : 65536;
        }
        if (gapComposer2.shouldExecute(i7 & 1, ((i7 & 306783379) == 306783378 && (74899 & i4) == 74898) ? false : true)) {
            boolean z5 = i9 != 0 ? true : z2;
            if (i10 != 0) {
                z4 = z5;
                function63 = ComposableSingletons$UiContainerKt.f364lambda$857445803;
            } else {
                z4 = z5;
                function63 = function6;
            }
            Context context4 = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            boolean changed = gapComposer2.changed(context4) | gapComposer2.changed(location.getStateKey());
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                CoroutineScope scope = location.getScope();
                zzr zzrVar = new zzr(scope, (CoroutineScope) JobKt.plus(scope.getCoroutineContext(), JobKt.MainScope()));
                Screen screen = location.getScreen();
                NavigationModel.Ready.FullScreenLocation fullScreenLocation = location instanceof NavigationModel.Ready.FullScreenLocation ? (NavigationModel.Ready.FullScreenLocation) location : null;
                Object obj = fullScreenLocation != null ? fullScreenLocation.result : null;
                context4.getClass();
                Object obj2 = context4;
                while (!(obj2 instanceof Thing.HasThing) && (obj2 instanceof ContextWrapper)) {
                    obj2 = ((ContextWrapper) obj2).getBaseContext();
                    obj2.getClass();
                }
                com.squareup.cash.ui.UiContainer uiContainer = ((Thing.HasThing) obj2).getThing().rootContainer;
                uiContainer.getClass();
                screen.getClass();
                boolean z6 = uiContainer instanceof View;
                com.squareup.cash.ui.UiContainer uiContainer2 = uiContainer;
                if (z6) {
                    uiContainer2 = Thing.Companion.thing((View) uiContainer).rootContainer;
                }
                ScreenLifecycleOwnerContextWrapper screenLifecycleOwnerContextWrapper = new ScreenLifecycleOwnerContextWrapper(new Thing.ThingContextWrapper(context4, new Thing(uiContainer2, obj)), zzrVar);
                gapComposer2.updateRememberedValue(screenLifecycleOwnerContextWrapper);
                rememberedValue = screenLifecycleOwnerContextWrapper;
            }
            Context context5 = (Context) rememberedValue;
            Object consume = gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalView);
            consume.getClass();
            ViewGroup viewGroup = (ViewGroup) consume;
            boolean changed2 = gapComposer2.changed(location.getStateKey()) | gapComposer2.changed(context5);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                Screen screen2 = location.getScreen();
                List list3 = broadway.uiFactories;
                screen2.getClass();
                context5.getClass();
                Iterator it2 = broadway.themers.iterator();
                Context context6 = context5;
                while (it2.hasNext()) {
                    switch (((BlockersThemer) it2.next()).$r8$classId) {
                        case 0:
                            context2 = context6;
                            list2 = list3;
                            it = it2;
                            context3 = context5;
                            context2.getClass();
                            if (screen2 instanceof BlockersScreens) {
                                context2 = new ArcadeContextWrapper(ThemeHelpersKt.overrideTheme(context2, new StorageLinkQueries$$ExternalSyntheticLambda8(screen2, 3)), new ColorModelsKt$$ExternalSyntheticLambda0((BlockersScreens) screen2, 5));
                                break;
                            } else {
                                break;
                            }
                        default:
                            context6.getClass();
                            AccentedScreen accentedScreen = screen2 instanceof AccentedScreen ? (AccentedScreen) screen2 : null;
                            ColorModel accentColor = accentedScreen != null ? accentedScreen.getAccentColor() : null;
                            if (accentColor != null) {
                                list2 = list3;
                                it = it2;
                                context3 = context5;
                                context2 = new ArcadeContextWrapper(context6, new ColorModelsKt$$ExternalSyntheticLambda0(accentColor, 0));
                                break;
                            } else {
                                context2 = context6;
                                list2 = list3;
                                it = it2;
                                context3 = context5;
                                break;
                            }
                    }
                    it2 = it;
                    context6 = context2;
                    list3 = list2;
                    context5 = context3;
                }
                Context context7 = context6;
                List<UiFactory> list4 = list3;
                context = context5;
                Iterator it3 = list4.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        screenUi = ((UiFactory) it3.next()).createUi(screen2, context7, viewGroup);
                        if (screenUi != null) {
                        }
                    } else {
                        screenUi = null;
                    }
                }
                if (screenUi == null) {
                    String prettyName = screen2.prettyName();
                    if (prettyName == null) {
                        prettyName = Reflection.factory.getOrCreateKotlinClass(screen2.getClass()).getSimpleName();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to create a UI for " + prettyName + ".");
                    sb.append("\n  Tried:");
                    for (UiFactory uiFactory : list4) {
                        sb.append("\n   * ");
                        sb.append(uiFactory.getClass().getName());
                    }
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                gapComposer2.updateRememberedValue(screenUi);
                rememberedValue2 = screenUi;
            } else {
                context = context5;
            }
            final UiFactory.ScreenUi screenUi2 = (UiFactory.ScreenUi) rememberedValue2;
            Unit unit = Unit.INSTANCE;
            boolean changedInstance2 = ((i7 & 29360128) == 8388608) | gapComposer2.changedInstance(location) | gapComposer2.changedInstance(list) | ((i7 & 234881024) == 67108864);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                HeartBeatInfoStorage$$ExternalSyntheticLambda0 heartBeatInfoStorage$$ExternalSyntheticLambda0 = new HeartBeatInfoStorage$$ExternalSyntheticLambda0(function1, location, list, function12, 4);
                gapComposer2.updateRememberedValue(heartBeatInfoStorage$$ExternalSyntheticLambda0);
                rememberedValue3 = heartBeatInfoStorage$$ExternalSyntheticLambda0;
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue3, gapComposer2);
            final boolean z7 = z4;
            gapComposer = gapComposer2;
            final Context context8 = context;
            saveableStateHolder.SaveableStateProvider(location.getStateKey(), Expect_jvmKt.rememberComposableLambda(1329961293, new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda52
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer2 = (Composer) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        Object rememberedValue4 = gapComposer3.rememberedValue();
                        Object obj5 = Composer.Companion.Empty;
                        if (rememberedValue4 == obj5) {
                            rememberedValue4 = new OnBackPressedDispatcher(new Perfs$$ExternalSyntheticLambda0(4));
                            gapComposer3.updateRememberedValue(rememberedValue4);
                        }
                        OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) rememberedValue4;
                        final AnimatedVisibilityScope animatedVisibilityScope2 = AnimatedVisibilityScope.this;
                        Object value = animatedVisibilityScope2.getTransition().targetState$delegate.getValue();
                        EnterExitState enterExitState = EnterExitState.Visible;
                        final boolean z8 = z7;
                        if (value == enterExitState && z8) {
                            gapComposer3.startReplaceGroup(-196108023);
                            Unit unit2 = Unit.INSTANCE;
                            Object obj6 = atomicReference;
                            boolean changedInstance3 = gapComposer3.changedInstance(obj6) | gapComposer3.changedInstance(onBackPressedDispatcher);
                            Object rememberedValue5 = gapComposer3.rememberedValue();
                            if (changedInstance3 || rememberedValue5 == obj5) {
                                rememberedValue5 = new Recomposer$$ExternalSyntheticLambda4(26, obj6, onBackPressedDispatcher);
                                gapComposer3.updateRememberedValue(rememberedValue5);
                            }
                            Updater.DisposableEffect(unit2, (Function1) rememberedValue5, gapComposer3);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-195850475);
                            gapComposer3.end(false);
                        }
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.LocalSaveableStateRegistry;
                        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) gapComposer3.consume(staticProvidableCompositionLocal);
                        boolean changed3 = gapComposer3.changed(saveableStateRegistry);
                        Object rememberedValue6 = gapComposer3.rememberedValue();
                        if (changed3 || rememberedValue6 == obj5) {
                            rememberedValue6 = new ScreenLifecycle((Bundle) (saveableStateRegistry != null ? saveableStateRegistry.consumeRestored("view-state") : null), onBackPressedDispatcher);
                            gapComposer3.updateRememberedValue(rememberedValue6);
                        }
                        final ScreenLifecycle screenLifecycle = (ScreenLifecycle) rememberedValue6;
                        boolean changedInstance4 = gapComposer3.changedInstance(saveableStateRegistry) | gapComposer3.changedInstance(screenLifecycle);
                        final boolean z9 = z;
                        boolean changed4 = changedInstance4 | gapComposer3.changed(z9);
                        Object rememberedValue7 = gapComposer3.rememberedValue();
                        if (changed4 || rememberedValue7 == obj5) {
                            rememberedValue7 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    ((DisposableEffectScope) obj7).getClass();
                                    SaveableStateRegistry saveableStateRegistry2 = SaveableStateRegistry.this;
                                    ScreenLifecycle screenLifecycle2 = screenLifecycle;
                                    return new BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1(6, saveableStateRegistry2 != null ? saveableStateRegistry2.registerProvider("view-state", new BasicTextFieldKt$$ExternalSyntheticLambda10(screenLifecycle2, z9)) : null, screenLifecycle2);
                                }
                            };
                            gapComposer3.updateRememberedValue(rememberedValue7);
                        }
                        Updater.DisposableEffect(saveableStateRegistry, screenLifecycle, (Function1) rememberedValue7, gapComposer3);
                        Object obj7 = lifecycleOwner;
                        boolean changed5 = gapComposer3.changed(obj7) | gapComposer3.changed(screenLifecycle);
                        Object rememberedValue8 = gapComposer3.rememberedValue();
                        if (changed5 || rememberedValue8 == obj5) {
                            rememberedValue8 = new MinimumLifecycleOwner(CollectionsKt__CollectionsKt.listOf((Object[]) new LifecycleOwner[]{obj7, screenLifecycle}));
                            gapComposer3.updateRememberedValue(rememberedValue8);
                        }
                        MinimumLifecycleOwner minimumLifecycleOwner = (MinimumLifecycleOwner) rememberedValue8;
                        final NavigationModel.Ready.Location location2 = location;
                        boolean changed6 = gapComposer3.changed(location2.getStateKey());
                        Object rememberedValue9 = gapComposer3.rememberedValue();
                        if (changed6 || rememberedValue9 == obj5) {
                            rememberedValue9 = new DialogEventDispatcher();
                            gapComposer3.updateRememberedValue(rememberedValue9);
                        }
                        final DialogEventDispatcher dialogEventDispatcher = (DialogEventDispatcher) rememberedValue9;
                        if (location2 instanceof NavigationModel.Ready.FullScreenLocation) {
                            gapComposer3.startReplaceGroup(-1697353723);
                            Object[] objArr = {((NavigationModel.Ready.FullScreenLocation) location2).stateKey};
                            Object rememberedValue10 = gapComposer3.rememberedValue();
                            if (rememberedValue10 == obj5) {
                                rememberedValue10 = new Moneys$$ExternalSyntheticLambda0(6);
                                gapComposer3.updateRememberedValue(rememberedValue10);
                            }
                            Object obj8 = (Set) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue10, gapComposer3, 48);
                            boolean changedInstance5 = gapComposer3.changedInstance(location2) | gapComposer3.changedInstance(obj8) | gapComposer3.changedInstance(dialogEventDispatcher);
                            Object rememberedValue11 = gapComposer3.rememberedValue();
                            if (changedInstance5 || rememberedValue11 == obj5) {
                                rememberedValue11 = new LaunchTracker$$ExternalSyntheticLambda0(5, location2, obj8, dialogEventDispatcher);
                                gapComposer3.updateRememberedValue(rememberedValue11);
                            }
                            Updater.SideEffect((Function0) rememberedValue11, gapComposer3);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-1696838627);
                            gapComposer3.end(false);
                        }
                        ProvidedValue defaultProvidedValue$runtime = AndroidCompositionLocals_androidKt.LocalContext.defaultProvidedValue$runtime(context8);
                        ProvidedValue defaultProvidedValue$runtime2 = UiScopeKt.LocalContainerAnimatedVisibilityScope.defaultProvidedValue$runtime(animatedVisibilityScope2);
                        ProvidedValue defaultProvidedValue$runtime3 = UiScopeKt.LocalContainerSharedTransitionScope.defaultProvidedValue$runtime(sharedTransitionScope);
                        ProvidedValue defaultProvidedValue$runtime4 = DialogEventHandlerKt.LocalDialogEventDispatcher.defaultProvidedValue$runtime(dialogEventDispatcher);
                        ProvidedValue defaultProvidedValue$runtime5 = LocalLifecycleOwnerKt.LocalLifecycleOwner.defaultProvidedValue$runtime(minimumLifecycleOwner);
                        ProvidedValue defaultProvidedValue$runtime6 = LocalOnBackPressedDispatcherOwner.LocalOnBackPressedDispatcherOwner.defaultProvidedValue$runtime(screenLifecycle);
                        Object consume2 = gapComposer3.consume(staticProvidableCompositionLocal);
                        consume2.getClass();
                        SaveableStateRegistry saveableStateRegistry2 = (SaveableStateRegistry) consume2;
                        if (z9) {
                            gapComposer3.startReplaceGroup(-1345335707);
                            boolean changed7 = gapComposer3.changed(saveableStateRegistry2);
                            Object rememberedValue12 = gapComposer3.rememberedValue();
                            if (changed7 || rememberedValue12 == obj5) {
                                rememberedValue12 = new ValidatingSaveableStateRegistry(saveableStateRegistry2);
                                gapComposer3.updateRememberedValue(rememberedValue12);
                            }
                            saveableStateRegistry2 = (ValidatingSaveableStateRegistry) rememberedValue12;
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-1345260036);
                            gapComposer3.end(false);
                        }
                        ProvidedValue[] providedValueArr = {defaultProvidedValue$runtime, defaultProvidedValue$runtime2, defaultProvidedValue$runtime3, defaultProvidedValue$runtime4, defaultProvidedValue$runtime5, defaultProvidedValue$runtime6, staticProvidableCompositionLocal.defaultProvidedValue$runtime(saveableStateRegistry2), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().defaultProvidedValue$runtime(screenLifecycle)};
                        final UiFactory.ScreenUi screenUi3 = screenUi2;
                        final Function6 function64 = function63;
                        final AtomicReference atomicReference3 = atomicReference2;
                        final List list5 = list;
                        final WireAdapter wireAdapter2 = wireAdapter;
                        final LeakDetector leakDetector2 = leakDetector;
                        Updater.CompositionLocalProvider(providedValueArr, Expect_jvmKt.rememberComposableLambda(1310108813, new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda2
                            /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
                            @Override // kotlin.jvm.functions.Function2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj9, Object obj10) {
                                Object composeConfig;
                                Composer composer3 = (Composer) obj9;
                                int intValue2 = ((Integer) obj10).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    final UiFactory.ScreenUi screenUi4 = UiFactory.ScreenUi.this;
                                    boolean z10 = screenUi4 instanceof UiFactory.ViewUi;
                                    BottomSheetStateListener bottomSheetStateListener = null;
                                    if (z10) {
                                        KeyEvent.Callback callback = ((UiFactory.ViewUi) screenUi4).view;
                                        BottomSheetConfig bottomSheetConfig = callback instanceof BottomSheetConfig ? (BottomSheetConfig) callback : null;
                                        if (bottomSheetConfig != null) {
                                            composeConfig = new LegacySheetConfig.ViewConfig(bottomSheetConfig, callback instanceof OutsideTapCloses);
                                            if (z10) {
                                                KeyEvent.Callback callback2 = ((UiFactory.ViewUi) screenUi4).view;
                                                if (callback2 instanceof BottomSheetStateListener) {
                                                    bottomSheetStateListener = (BottomSheetStateListener) callback2;
                                                }
                                            }
                                            BottomSheetStateListener bottomSheetStateListener2 = bottomSheetStateListener;
                                            final NavigationModel.Ready.Location location3 = location2;
                                            final AnimatedVisibilityScope animatedVisibilityScope3 = animatedVisibilityScope2;
                                            final boolean z11 = z8;
                                            final AtomicReference atomicReference4 = atomicReference3;
                                            final ScreenLifecycle screenLifecycle2 = screenLifecycle;
                                            final DialogEventDispatcher dialogEventDispatcher2 = dialogEventDispatcher;
                                            final List list6 = list5;
                                            final WireAdapter wireAdapter3 = wireAdapter2;
                                            final LeakDetector leakDetector3 = leakDetector2;
                                            function64.invoke(composeConfig, bottomSheetStateListener2, null, Expect_jvmKt.rememberComposableLambda(253301029, new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda15
                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Type inference failed for: r3v14 */
                                                /* JADX WARN: Type inference failed for: r3v2 */
                                                /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj11, Object obj12) {
                                                    ?? r3;
                                                    Object obj13;
                                                    List list7;
                                                    boolean z12;
                                                    boolean z13;
                                                    Object obj14;
                                                    boolean z14;
                                                    Object obj15;
                                                    Composer composer4 = (Composer) obj11;
                                                    int intValue3 = ((Integer) obj12).intValue();
                                                    BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                                                    final int i11 = 0;
                                                    GapComposer gapComposer5 = (GapComposer) composer4;
                                                    boolean shouldExecute = gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                                                    Applier applier = gapComposer5.applier;
                                                    if (shouldExecute) {
                                                        final UiFactory.ScreenUi screenUi5 = UiFactory.ScreenUi.this;
                                                        boolean z15 = screenUi5 instanceof UiFactory.ComposeUi;
                                                        Modifier modifier = Modifier.Companion.$$INSTANCE;
                                                        final NavigationModel.Ready.Location location4 = location3;
                                                        final List list8 = list6;
                                                        Path.Companion companion = PresenterElement.Key;
                                                        Object obj16 = Composer.Companion.Empty;
                                                        if (z15) {
                                                            gapComposer5.startReplaceGroup(-166498726);
                                                            boolean changed8 = gapComposer5.changed(location4.getStateKey()) | gapComposer5.changed(location4.getScope());
                                                            Object rememberedValue13 = gapComposer5.rememberedValue();
                                                            Object obj17 = rememberedValue13;
                                                            if (changed8 || rememberedValue13 == obj16) {
                                                                Object obj18 = (PresenterElement) location4.getScope().getCoroutineContext().get(companion);
                                                                gapComposer5.updateRememberedValue(obj18);
                                                                obj17 = obj18;
                                                            }
                                                            final PresenterElement presenterElement = (PresenterElement) obj17;
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                            int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                                                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, modifier);
                                                            ComposeUiNode.Companion.getClass();
                                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                                            if (applier == null) {
                                                                Updater.invalidApplier();
                                                                throw null;
                                                            }
                                                            gapComposer5.startReusableNode();
                                                            if (gapComposer5.inserting) {
                                                                gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                                                            } else {
                                                                gapComposer5.useNode();
                                                            }
                                                            Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                            Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                            Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                            Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                            Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                                            presenterElement.getClass();
                                                            Presenter.Binding binding = presenterElement.binding;
                                                            if (binding == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                throw null;
                                                            }
                                                            StateFlow models = binding.getModels();
                                                            models.getClass();
                                                            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                                                            gapComposer5.startMovableGroup(2106530429, gapComposer5.joinKey(models, emptyCoroutineContext));
                                                            MutableState collectAsState = Updater.collectAsState(models, emptyCoroutineContext, gapComposer5, 0);
                                                            gapComposer5.end(false);
                                                            Function4 function4 = ((UiFactory.ComposeUi) screenUi5).content;
                                                            Object value2 = collectAsState.getValue();
                                                            boolean changedInstance6 = gapComposer5.changedInstance(presenterElement) | gapComposer5.changedInstance(list8) | gapComposer5.changedInstance(location4);
                                                            Object rememberedValue14 = gapComposer5.rememberedValue();
                                                            Object obj19 = rememberedValue14;
                                                            if (changedInstance6 || rememberedValue14 == obj16) {
                                                                Object obj20 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda26
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj21) {
                                                                        int i12 = i11;
                                                                        NavigationModel.Ready.Location location5 = location4;
                                                                        List<EventListener> list9 = list8;
                                                                        PresenterElement presenterElement2 = presenterElement;
                                                                        switch (i12) {
                                                                            case 0:
                                                                                obj21.getClass();
                                                                                presenterElement2.sendEvent(obj21);
                                                                                for (EventListener eventListener : list9) {
                                                                                    Screen screen3 = location5.getScreen();
                                                                                    eventListener.getClass();
                                                                                    screen3.getClass();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                obj21.getClass();
                                                                                presenterElement2.sendEvent(obj21);
                                                                                for (EventListener eventListener2 : list9) {
                                                                                    Screen screen4 = location5.getScreen();
                                                                                    eventListener2.getClass();
                                                                                    screen4.getClass();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                gapComposer5.updateRememberedValue(obj20);
                                                                obj19 = obj20;
                                                            }
                                                            function4.invoke(value2, (Function1) obj19, gapComposer5, 0);
                                                            UiContainerKt.AttachUiModelReceivedSideEffect(collectAsState.getValue(), location4.getScreen(), list8, gapComposer5, 0);
                                                            gapComposer5.end(true);
                                                            gapComposer5.end(false);
                                                        } else if (screenUi5 instanceof UiFactory.LegacySheetComposeUi) {
                                                            gapComposer5.startReplaceGroup(-165624185);
                                                            boolean changed9 = gapComposer5.changed(location4.getStateKey()) | gapComposer5.changed(location4.getScope());
                                                            Object rememberedValue15 = gapComposer5.rememberedValue();
                                                            Object obj21 = rememberedValue15;
                                                            if (changed9 || rememberedValue15 == obj16) {
                                                                Object obj22 = (PresenterElement) location4.getScope().getCoroutineContext().get(companion);
                                                                gapComposer5.updateRememberedValue(obj22);
                                                                obj21 = obj22;
                                                            }
                                                            final PresenterElement presenterElement2 = (PresenterElement) obj21;
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                            int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                                                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, modifier);
                                                            ComposeUiNode.Companion.getClass();
                                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                            if (applier == null) {
                                                                Updater.invalidApplier();
                                                                throw null;
                                                            }
                                                            gapComposer5.startReusableNode();
                                                            if (gapComposer5.inserting) {
                                                                gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                                                            } else {
                                                                gapComposer5.useNode();
                                                            }
                                                            Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                                            Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                            Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                            Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                            Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                                            presenterElement2.getClass();
                                                            Presenter.Binding binding2 = presenterElement2.binding;
                                                            if (binding2 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                throw null;
                                                            }
                                                            Object value3 = Updater.collectAsState(binding2.getModels(), null, gapComposer5, 1).getValue();
                                                            ComposableLambdaImpl composableLambdaImpl = ((UiFactory.LegacySheetComposeUi) screenUi5).content;
                                                            gapComposer5.startReplaceGroup(851296309);
                                                            Object consume3 = gapComposer5.consume(UiContainerKt.LocalLegacySheetScope);
                                                            consume3.getClass();
                                                            Object obj23 = (UiContainerKt$BottomSheet$1$sheetScope$1) consume3;
                                                            boolean changedInstance7 = gapComposer5.changedInstance(presenterElement2) | gapComposer5.changedInstance(list8) | gapComposer5.changedInstance(location4);
                                                            Object rememberedValue16 = gapComposer5.rememberedValue();
                                                            if (changedInstance7 || rememberedValue16 == obj16) {
                                                                z14 = true;
                                                                final boolean z16 = true ? 1 : 0;
                                                                Object obj24 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda26
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj212) {
                                                                        int i12 = z16;
                                                                        NavigationModel.Ready.Location location5 = location4;
                                                                        List<EventListener> list9 = list8;
                                                                        PresenterElement presenterElement22 = presenterElement2;
                                                                        switch (i12) {
                                                                            case 0:
                                                                                obj212.getClass();
                                                                                presenterElement22.sendEvent(obj212);
                                                                                for (EventListener eventListener : list9) {
                                                                                    Screen screen3 = location5.getScreen();
                                                                                    eventListener.getClass();
                                                                                    screen3.getClass();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                obj212.getClass();
                                                                                presenterElement22.sendEvent(obj212);
                                                                                for (EventListener eventListener2 : list9) {
                                                                                    Screen screen4 = location5.getScreen();
                                                                                    eventListener2.getClass();
                                                                                    screen4.getClass();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                gapComposer5.updateRememberedValue(obj24);
                                                                obj15 = obj24;
                                                            } else {
                                                                z14 = true;
                                                                obj15 = rememberedValue16;
                                                            }
                                                            composableLambdaImpl.invoke(obj23, value3, obj15, (Object) gapComposer5, (Object) 0);
                                                            gapComposer5.end(false);
                                                            UiContainerKt.AttachUiModelReceivedSideEffect(value3, location4.getScreen(), list8, gapComposer5, 0);
                                                            gapComposer5.end(z14);
                                                            gapComposer5.end(false);
                                                        } else {
                                                            if (!(screenUi5 instanceof UiFactory.ViewUi)) {
                                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, -1390836591, false);
                                                            }
                                                            gapComposer5.startReplaceGroup(-164492468);
                                                            UiFactory.ViewUi viewUi = (UiFactory.ViewUi) screenUi5;
                                                            KeyEvent.Callback callback3 = viewUi.view;
                                                            int i12 = 6;
                                                            if (callback3 instanceof LandscapeOrientation) {
                                                                gapComposer5.startReplaceGroup(-1390784998);
                                                                UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
                                                                OrientationKt.Orientation(gapComposer5, 6);
                                                                r3 = 0;
                                                            } else {
                                                                r3 = 0;
                                                                gapComposer5.startReplaceGroup(-164611043);
                                                            }
                                                            gapComposer5.end(r3);
                                                            if (callback3 instanceof FullScreen) {
                                                                gapComposer5.startReplaceGroup(-1390782155);
                                                                FullScreenKt.FullScreen(gapComposer5, 6);
                                                            } else {
                                                                gapComposer5.startReplaceGroup(-164558467);
                                                            }
                                                            gapComposer5.end(r3);
                                                            if (callback3 instanceof SecureScreen) {
                                                                gapComposer5.startReplaceGroup(-1390780393);
                                                                SecureScreenKt.SecureScreen(true, gapComposer5, 6);
                                                            } else {
                                                                gapComposer5.startReplaceGroup(-164501923);
                                                            }
                                                            gapComposer5.end(r3);
                                                            if (callback3 instanceof OverridesSystemBars) {
                                                                gapComposer5.startReplaceGroup(-164453377);
                                                                ChromeConfigKt.ChromeConfig(!((OverridesSystemBars) callback3).isLightSystemBars(), (Boolean) null, gapComposer5, (int) r3, 14);
                                                                gapComposer5.end(r3);
                                                            } else {
                                                                gapComposer5.startReplaceGroup(-164363043);
                                                                gapComposer5.end(r3);
                                                            }
                                                            Ui ui = viewUi.ui;
                                                            OnBackListener onBackListener = ui instanceof OnBackListener ? (OnBackListener) ui : null;
                                                            if (onBackListener == null) {
                                                                onBackListener = callback3 instanceof OnBackListener ? (OnBackListener) callback3 : null;
                                                            }
                                                            AnimatedVisibilityScope animatedVisibilityScope4 = animatedVisibilityScope3;
                                                            if (onBackListener != null && animatedVisibilityScope4.getTransition().targetState$delegate.getValue() == EnterExitState.Visible && z11) {
                                                                gapComposer5.startReplaceGroup(-163965809);
                                                                Unit unit3 = Unit.INSTANCE;
                                                                AtomicReference atomicReference5 = atomicReference4;
                                                                boolean changedInstance8 = gapComposer5.changedInstance(atomicReference5) | gapComposer5.changedInstance(onBackListener);
                                                                Object rememberedValue17 = gapComposer5.rememberedValue();
                                                                Object obj25 = rememberedValue17;
                                                                if (changedInstance8 || rememberedValue17 == obj16) {
                                                                    Object recomposer$$ExternalSyntheticLambda4 = new Recomposer$$ExternalSyntheticLambda4(27, atomicReference5, onBackListener);
                                                                    gapComposer5.updateRememberedValue(recomposer$$ExternalSyntheticLambda4);
                                                                    obj25 = recomposer$$ExternalSyntheticLambda4;
                                                                }
                                                                Updater.DisposableEffect(unit3, (Function1) obj25, gapComposer5);
                                                                gapComposer5.end(false);
                                                            } else {
                                                                gapComposer5.startReplaceGroup(-163706339);
                                                                gapComposer5.end(false);
                                                            }
                                                            OnTransitionListener onTransitionListener = callback3 instanceof OnTransitionListener ? (OnTransitionListener) callback3 : null;
                                                            if (onTransitionListener != null) {
                                                                gapComposer5.startReplaceGroup(-163559709);
                                                                EnterExitState enterExitState2 = (EnterExitState) animatedVisibilityScope4.getTransition().transitionState.getCurrentState();
                                                                EnterExitState enterExitState3 = (EnterExitState) animatedVisibilityScope4.getTransition().targetState$delegate.getValue();
                                                                if (enterExitState2 == EnterExitState.Visible) {
                                                                    gapComposer5.startReplaceGroup(-163341314);
                                                                    boolean changedInstance9 = gapComposer5.changedInstance(onTransitionListener);
                                                                    Object rememberedValue18 = gapComposer5.rememberedValue();
                                                                    if (changedInstance9 || rememberedValue18 == obj16) {
                                                                        z13 = false;
                                                                        Object uiContainerKt$ScreenContent$2$2$1$4$1 = new UiContainerKt$ScreenContent$2$2$1$4$1(onTransitionListener, null, 0);
                                                                        gapComposer5.updateRememberedValue(uiContainerKt$ScreenContent$2$2$1$4$1);
                                                                        obj14 = uiContainerKt$ScreenContent$2$2$1$4$1;
                                                                    } else {
                                                                        z13 = false;
                                                                        obj14 = rememberedValue18;
                                                                    }
                                                                    Updater.LaunchedEffect(gapComposer5, enterExitState2, (Function2) obj14);
                                                                    gapComposer5.end(z13);
                                                                } else {
                                                                    gapComposer5.startReplaceGroup(-163188515);
                                                                    gapComposer5.end(false);
                                                                }
                                                                if (enterExitState3 == EnterExitState.PostExit) {
                                                                    gapComposer5.startReplaceGroup(-163114239);
                                                                    boolean changedInstance10 = gapComposer5.changedInstance(onTransitionListener);
                                                                    Object rememberedValue19 = gapComposer5.rememberedValue();
                                                                    Object obj26 = rememberedValue19;
                                                                    if (changedInstance10 || rememberedValue19 == obj16) {
                                                                        Object uiContainerKt$ScreenContent$2$2$1$4$12 = new UiContainerKt$ScreenContent$2$2$1$4$1(onTransitionListener, null, 1);
                                                                        gapComposer5.updateRememberedValue(uiContainerKt$ScreenContent$2$2$1$4$12);
                                                                        obj26 = uiContainerKt$ScreenContent$2$2$1$4$12;
                                                                    }
                                                                    Updater.LaunchedEffect(gapComposer5, enterExitState3, (Function2) obj26);
                                                                    z12 = false;
                                                                    gapComposer5.end(false);
                                                                } else {
                                                                    z12 = false;
                                                                    gapComposer5.startReplaceGroup(-162964323);
                                                                    gapComposer5.end(false);
                                                                }
                                                                gapComposer5.end(z12);
                                                            } else {
                                                                gapComposer5.startReplaceGroup(-162950435);
                                                                gapComposer5.end(false);
                                                            }
                                                            CashComposeInsets cashComposeInsets = (CashComposeInsets) gapComposer5.consume(CashInsetsKt.LocalCashInsets);
                                                            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.LocalDensity;
                                                            Density density = (Density) gapComposer5.consume(staticProvidableCompositionLocal2);
                                                            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                                                            AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer5).statusBars;
                                                            AndroidWindowInsets androidWindowInsets2 = Arrangement$End$1.current(gapComposer5).navigationBars;
                                                            Object rememberedValue20 = gapComposer5.rememberedValue();
                                                            Object obj27 = rememberedValue20;
                                                            if (rememberedValue20 == obj16) {
                                                                obj27 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer5);
                                                            }
                                                            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj27;
                                                            Object rememberedValue21 = gapComposer5.rememberedValue();
                                                            Object obj28 = rememberedValue21;
                                                            if (rememberedValue21 == obj16) {
                                                                obj28 = Boxes$$ExternalSyntheticOutline1.m(Integer.MAX_VALUE, gapComposer5);
                                                            }
                                                            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj28;
                                                            Modifier fillMaxWidth = location4.getScreen() instanceof BottomSheetScreen ? SizeKt.fillMaxWidth(modifier, 1.0f) : modifier;
                                                            Object rememberedValue22 = gapComposer5.rememberedValue();
                                                            Object obj29 = rememberedValue22;
                                                            if (rememberedValue22 == obj16) {
                                                                Object colorModelsKt$$ExternalSyntheticLambda0 = new ColorModelsKt$$ExternalSyntheticLambda0(parcelableSnapshotMutableIntState2, i12);
                                                                gapComposer5.updateRememberedValue(colorModelsKt$$ExternalSyntheticLambda0);
                                                                obj29 = colorModelsKt$$ExternalSyntheticLambda0;
                                                            }
                                                            Modifier layout = ValueInsets.layout(fillMaxWidth, (Function3) obj29);
                                                            if (parcelableSnapshotMutableIntState.getIntValue() > 0) {
                                                                gapComposer5.startReplaceGroup(-160204951);
                                                                modifier = SizeKt.m277height3ABfNKs(modifier, parcelableSnapshotMutableIntState.getIntValue() / ((Density) gapComposer5.consume(staticProvidableCompositionLocal2)).getDensity());
                                                                gapComposer5.end(false);
                                                            } else {
                                                                gapComposer5.startReplaceGroup(-160085849);
                                                                gapComposer5.end(false);
                                                            }
                                                            Modifier then = layout.then(modifier);
                                                            boolean changedInstance11 = gapComposer5.changedInstance(screenUi5);
                                                            final ScreenLifecycle screenLifecycle3 = screenLifecycle2;
                                                            boolean changedInstance12 = changedInstance11 | gapComposer5.changedInstance(screenLifecycle3);
                                                            final DialogEventDispatcher dialogEventDispatcher3 = dialogEventDispatcher2;
                                                            boolean changedInstance13 = changedInstance12 | gapComposer5.changedInstance(dialogEventDispatcher3) | gapComposer5.changedInstance(location4) | gapComposer5.changedInstance(list8);
                                                            final WireAdapter wireAdapter4 = wireAdapter3;
                                                            boolean changedInstance14 = changedInstance13 | gapComposer5.changedInstance(wireAdapter4);
                                                            Object rememberedValue23 = gapComposer5.rememberedValue();
                                                            if (changedInstance14 || rememberedValue23 == obj16) {
                                                                obj13 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda30
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj30) {
                                                                        ((Context) obj30).getClass();
                                                                        UiFactory.ViewUi viewUi2 = (UiFactory.ViewUi) UiFactory.ScreenUi.this;
                                                                        View view = viewUi2.view;
                                                                        ScreenLifecycle screenLifecycle4 = screenLifecycle3;
                                                                        DBUtil.set(view, screenLifecycle4);
                                                                        screenLifecycle4.getClass();
                                                                        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, screenLifecycle4);
                                                                        if (view instanceof DialogResultListener) {
                                                                            StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(view, 7);
                                                                            DialogEventDispatcher dialogEventDispatcher4 = dialogEventDispatcher3;
                                                                            dialogEventDispatcher4.getClass();
                                                                            dialogEventDispatcher4.eventListeners.add(storageLinkQueries$$ExternalSyntheticLambda8);
                                                                        }
                                                                        AbstractComposeView abstractComposeView = view instanceof AbstractComposeView ? (AbstractComposeView) view : null;
                                                                        if (abstractComposeView != null) {
                                                                            abstractComposeView.setViewCompositionStrategy(new MemoryCacheService(screenLifecycle4));
                                                                        }
                                                                        NavigationModel.Ready.Location location5 = location4;
                                                                        UiContainerKt.launchUiBindingIfNeeded(location5.getScope(), viewUi2, location5.getScreen(), list8, wireAdapter4);
                                                                        if (view.isAttachedToWindow()) {
                                                                            view.requestApplyInsets();
                                                                        } else {
                                                                            view.addOnAttachStateChangeListener(new AndroidGraphicsContext.AnonymousClass2(view, 3));
                                                                        }
                                                                        if (!(location5.getScreen() instanceof OnlyOneOverlayTreatment)) {
                                                                            Context context9 = view.getContext();
                                                                            context9.getClass();
                                                                            StableSystemBarsInsetsView stableSystemBarsInsetsView = new StableSystemBarsInsetsView(context9);
                                                                            stableSystemBarsInsetsView.addView(view);
                                                                            return stableSystemBarsInsetsView;
                                                                        }
                                                                        StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda82 = new StorageLinkQueries$$ExternalSyntheticLambda8(parcelableSnapshotMutableIntState, 8);
                                                                        Context context10 = view.getContext();
                                                                        context10.getClass();
                                                                        IntrinsicHeightReportingView intrinsicHeightReportingView = new IntrinsicHeightReportingView(context10, storageLinkQueries$$ExternalSyntheticLambda82);
                                                                        intrinsicHeightReportingView.addView(view);
                                                                        return intrinsicHeightReportingView;
                                                                    }
                                                                };
                                                                list7 = list8;
                                                                gapComposer5.updateRememberedValue(obj13);
                                                            } else {
                                                                obj13 = rememberedValue23;
                                                                list7 = list8;
                                                            }
                                                            Function1 function13 = (Function1) obj13;
                                                            LeakDetector leakDetector4 = leakDetector3;
                                                            boolean changedInstance15 = gapComposer5.changedInstance(leakDetector4);
                                                            Object rememberedValue24 = gapComposer5.rememberedValue();
                                                            Object obj30 = rememberedValue24;
                                                            if (changedInstance15 || rememberedValue24 == obj16) {
                                                                Object storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(leakDetector4, 6);
                                                                gapComposer5.updateRememberedValue(storageLinkQueries$$ExternalSyntheticLambda8);
                                                                obj30 = storageLinkQueries$$ExternalSyntheticLambda8;
                                                            }
                                                            Function1 function14 = (Function1) obj30;
                                                            boolean changed10 = gapComposer5.changed(cashComposeInsets) | gapComposer5.changed(androidWindowInsets) | gapComposer5.changed(androidWindowInsets2) | gapComposer5.changed(density) | gapComposer5.changedInstance(location4) | gapComposer5.changedInstance(screenUi5) | gapComposer5.changedInstance(list7) | gapComposer5.changedInstance(wireAdapter4);
                                                            Object rememberedValue25 = gapComposer5.rememberedValue();
                                                            if (changed10 || rememberedValue25 == obj16) {
                                                                Object uiContainerKt$$ExternalSyntheticLambda32 = new UiContainerKt$$ExternalSyntheticLambda32(cashComposeInsets, androidWindowInsets, androidWindowInsets2, density, location4, screenUi5, list7, wireAdapter4, parcelableSnapshotMutableIntState2);
                                                                gapComposer5.updateRememberedValue(uiContainerKt$$ExternalSyntheticLambda32);
                                                                rememberedValue25 = uiContainerKt$$ExternalSyntheticLambda32;
                                                            }
                                                            AndroidView_androidKt.AndroidView(function13, then, null, function14, (Function1) rememberedValue25, gapComposer5, 0, 4);
                                                            gapComposer5.end(false);
                                                        }
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, gapComposer4), gapComposer4, 3072);
                                        }
                                        composeConfig = null;
                                        if (z10) {
                                        }
                                        BottomSheetStateListener bottomSheetStateListener22 = bottomSheetStateListener;
                                        final NavigationModel.Ready.Location location32 = location2;
                                        final AnimatedVisibilityScope animatedVisibilityScope32 = animatedVisibilityScope2;
                                        final boolean z112 = z8;
                                        final AtomicReference atomicReference42 = atomicReference3;
                                        final ScreenLifecycle screenLifecycle22 = screenLifecycle;
                                        final DialogEventDispatcher dialogEventDispatcher22 = dialogEventDispatcher;
                                        final List list62 = list5;
                                        final WireAdapter wireAdapter32 = wireAdapter2;
                                        final LeakDetector leakDetector32 = leakDetector2;
                                        function64.invoke(composeConfig, bottomSheetStateListener22, null, Expect_jvmKt.rememberComposableLambda(253301029, new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda15
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r3v14 */
                                            /* JADX WARN: Type inference failed for: r3v2 */
                                            /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj11, Object obj12) {
                                                ?? r3;
                                                Object obj13;
                                                List list7;
                                                boolean z12;
                                                boolean z13;
                                                Object obj14;
                                                boolean z14;
                                                Object obj15;
                                                Composer composer4 = (Composer) obj11;
                                                int intValue3 = ((Integer) obj12).intValue();
                                                BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                                                final int i11 = 0;
                                                GapComposer gapComposer5 = (GapComposer) composer4;
                                                boolean shouldExecute = gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                                                Applier applier = gapComposer5.applier;
                                                if (shouldExecute) {
                                                    final UiFactory.ScreenUi screenUi5 = UiFactory.ScreenUi.this;
                                                    boolean z15 = screenUi5 instanceof UiFactory.ComposeUi;
                                                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                                                    final NavigationModel.Ready.Location location4 = location32;
                                                    final List list8 = list62;
                                                    Path.Companion companion = PresenterElement.Key;
                                                    Object obj16 = Composer.Companion.Empty;
                                                    if (z15) {
                                                        gapComposer5.startReplaceGroup(-166498726);
                                                        boolean changed8 = gapComposer5.changed(location4.getStateKey()) | gapComposer5.changed(location4.getScope());
                                                        Object rememberedValue13 = gapComposer5.rememberedValue();
                                                        Object obj17 = rememberedValue13;
                                                        if (changed8 || rememberedValue13 == obj16) {
                                                            Object obj18 = (PresenterElement) location4.getScope().getCoroutineContext().get(companion);
                                                            gapComposer5.updateRememberedValue(obj18);
                                                            obj17 = obj18;
                                                        }
                                                        final PresenterElement presenterElement = (PresenterElement) obj17;
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                        int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, modifier);
                                                        ComposeUiNode.Companion.getClass();
                                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                                        if (applier == null) {
                                                            Updater.invalidApplier();
                                                            throw null;
                                                        }
                                                        gapComposer5.startReusableNode();
                                                        if (gapComposer5.inserting) {
                                                            gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                                                        } else {
                                                            gapComposer5.useNode();
                                                        }
                                                        Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                        Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                        Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                        Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                                        presenterElement.getClass();
                                                        Presenter.Binding binding = presenterElement.binding;
                                                        if (binding == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                            throw null;
                                                        }
                                                        StateFlow models = binding.getModels();
                                                        models.getClass();
                                                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                                                        gapComposer5.startMovableGroup(2106530429, gapComposer5.joinKey(models, emptyCoroutineContext));
                                                        MutableState collectAsState = Updater.collectAsState(models, emptyCoroutineContext, gapComposer5, 0);
                                                        gapComposer5.end(false);
                                                        Function4 function4 = ((UiFactory.ComposeUi) screenUi5).content;
                                                        Object value2 = collectAsState.getValue();
                                                        boolean changedInstance6 = gapComposer5.changedInstance(presenterElement) | gapComposer5.changedInstance(list8) | gapComposer5.changedInstance(location4);
                                                        Object rememberedValue14 = gapComposer5.rememberedValue();
                                                        Object obj19 = rememberedValue14;
                                                        if (changedInstance6 || rememberedValue14 == obj16) {
                                                            Object obj20 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda26
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj212) {
                                                                    int i12 = i11;
                                                                    NavigationModel.Ready.Location location5 = location4;
                                                                    List<EventListener> list9 = list8;
                                                                    PresenterElement presenterElement22 = presenterElement;
                                                                    switch (i12) {
                                                                        case 0:
                                                                            obj212.getClass();
                                                                            presenterElement22.sendEvent(obj212);
                                                                            for (EventListener eventListener : list9) {
                                                                                Screen screen3 = location5.getScreen();
                                                                                eventListener.getClass();
                                                                                screen3.getClass();
                                                                            }
                                                                            break;
                                                                        default:
                                                                            obj212.getClass();
                                                                            presenterElement22.sendEvent(obj212);
                                                                            for (EventListener eventListener2 : list9) {
                                                                                Screen screen4 = location5.getScreen();
                                                                                eventListener2.getClass();
                                                                                screen4.getClass();
                                                                            }
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer5.updateRememberedValue(obj20);
                                                            obj19 = obj20;
                                                        }
                                                        function4.invoke(value2, (Function1) obj19, gapComposer5, 0);
                                                        UiContainerKt.AttachUiModelReceivedSideEffect(collectAsState.getValue(), location4.getScreen(), list8, gapComposer5, 0);
                                                        gapComposer5.end(true);
                                                        gapComposer5.end(false);
                                                    } else if (screenUi5 instanceof UiFactory.LegacySheetComposeUi) {
                                                        gapComposer5.startReplaceGroup(-165624185);
                                                        boolean changed9 = gapComposer5.changed(location4.getStateKey()) | gapComposer5.changed(location4.getScope());
                                                        Object rememberedValue15 = gapComposer5.rememberedValue();
                                                        Object obj21 = rememberedValue15;
                                                        if (changed9 || rememberedValue15 == obj16) {
                                                            Object obj22 = (PresenterElement) location4.getScope().getCoroutineContext().get(companion);
                                                            gapComposer5.updateRememberedValue(obj22);
                                                            obj21 = obj22;
                                                        }
                                                        final PresenterElement presenterElement2 = (PresenterElement) obj21;
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                        int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                                                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, modifier);
                                                        ComposeUiNode.Companion.getClass();
                                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                        if (applier == null) {
                                                            Updater.invalidApplier();
                                                            throw null;
                                                        }
                                                        gapComposer5.startReusableNode();
                                                        if (gapComposer5.inserting) {
                                                            gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                                                        } else {
                                                            gapComposer5.useNode();
                                                        }
                                                        Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                        Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                        Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                        Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                                        presenterElement2.getClass();
                                                        Presenter.Binding binding2 = presenterElement2.binding;
                                                        if (binding2 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                            throw null;
                                                        }
                                                        Object value3 = Updater.collectAsState(binding2.getModels(), null, gapComposer5, 1).getValue();
                                                        ComposableLambdaImpl composableLambdaImpl = ((UiFactory.LegacySheetComposeUi) screenUi5).content;
                                                        gapComposer5.startReplaceGroup(851296309);
                                                        Object consume3 = gapComposer5.consume(UiContainerKt.LocalLegacySheetScope);
                                                        consume3.getClass();
                                                        Object obj23 = (UiContainerKt$BottomSheet$1$sheetScope$1) consume3;
                                                        boolean changedInstance7 = gapComposer5.changedInstance(presenterElement2) | gapComposer5.changedInstance(list8) | gapComposer5.changedInstance(location4);
                                                        Object rememberedValue16 = gapComposer5.rememberedValue();
                                                        if (changedInstance7 || rememberedValue16 == obj16) {
                                                            z14 = true;
                                                            final int z16 = true ? 1 : 0;
                                                            Object obj24 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda26
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj212) {
                                                                    int i12 = z16;
                                                                    NavigationModel.Ready.Location location5 = location4;
                                                                    List<EventListener> list9 = list8;
                                                                    PresenterElement presenterElement22 = presenterElement2;
                                                                    switch (i12) {
                                                                        case 0:
                                                                            obj212.getClass();
                                                                            presenterElement22.sendEvent(obj212);
                                                                            for (EventListener eventListener : list9) {
                                                                                Screen screen3 = location5.getScreen();
                                                                                eventListener.getClass();
                                                                                screen3.getClass();
                                                                            }
                                                                            break;
                                                                        default:
                                                                            obj212.getClass();
                                                                            presenterElement22.sendEvent(obj212);
                                                                            for (EventListener eventListener2 : list9) {
                                                                                Screen screen4 = location5.getScreen();
                                                                                eventListener2.getClass();
                                                                                screen4.getClass();
                                                                            }
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer5.updateRememberedValue(obj24);
                                                            obj15 = obj24;
                                                        } else {
                                                            z14 = true;
                                                            obj15 = rememberedValue16;
                                                        }
                                                        composableLambdaImpl.invoke(obj23, value3, obj15, (Object) gapComposer5, (Object) 0);
                                                        gapComposer5.end(false);
                                                        UiContainerKt.AttachUiModelReceivedSideEffect(value3, location4.getScreen(), list8, gapComposer5, 0);
                                                        gapComposer5.end(z14);
                                                        gapComposer5.end(false);
                                                    } else {
                                                        if (!(screenUi5 instanceof UiFactory.ViewUi)) {
                                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, -1390836591, false);
                                                        }
                                                        gapComposer5.startReplaceGroup(-164492468);
                                                        UiFactory.ViewUi viewUi = (UiFactory.ViewUi) screenUi5;
                                                        KeyEvent.Callback callback3 = viewUi.view;
                                                        int i12 = 6;
                                                        if (callback3 instanceof LandscapeOrientation) {
                                                            gapComposer5.startReplaceGroup(-1390784998);
                                                            UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
                                                            OrientationKt.Orientation(gapComposer5, 6);
                                                            r3 = 0;
                                                        } else {
                                                            r3 = 0;
                                                            gapComposer5.startReplaceGroup(-164611043);
                                                        }
                                                        gapComposer5.end(r3);
                                                        if (callback3 instanceof FullScreen) {
                                                            gapComposer5.startReplaceGroup(-1390782155);
                                                            FullScreenKt.FullScreen(gapComposer5, 6);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-164558467);
                                                        }
                                                        gapComposer5.end(r3);
                                                        if (callback3 instanceof SecureScreen) {
                                                            gapComposer5.startReplaceGroup(-1390780393);
                                                            SecureScreenKt.SecureScreen(true, gapComposer5, 6);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-164501923);
                                                        }
                                                        gapComposer5.end(r3);
                                                        if (callback3 instanceof OverridesSystemBars) {
                                                            gapComposer5.startReplaceGroup(-164453377);
                                                            ChromeConfigKt.ChromeConfig(!((OverridesSystemBars) callback3).isLightSystemBars(), (Boolean) null, gapComposer5, (int) r3, 14);
                                                            gapComposer5.end(r3);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-164363043);
                                                            gapComposer5.end(r3);
                                                        }
                                                        Ui ui = viewUi.ui;
                                                        OnBackListener onBackListener = ui instanceof OnBackListener ? (OnBackListener) ui : null;
                                                        if (onBackListener == null) {
                                                            onBackListener = callback3 instanceof OnBackListener ? (OnBackListener) callback3 : null;
                                                        }
                                                        AnimatedVisibilityScope animatedVisibilityScope4 = animatedVisibilityScope32;
                                                        if (onBackListener != null && animatedVisibilityScope4.getTransition().targetState$delegate.getValue() == EnterExitState.Visible && z112) {
                                                            gapComposer5.startReplaceGroup(-163965809);
                                                            Unit unit3 = Unit.INSTANCE;
                                                            AtomicReference atomicReference5 = atomicReference42;
                                                            boolean changedInstance8 = gapComposer5.changedInstance(atomicReference5) | gapComposer5.changedInstance(onBackListener);
                                                            Object rememberedValue17 = gapComposer5.rememberedValue();
                                                            Object obj25 = rememberedValue17;
                                                            if (changedInstance8 || rememberedValue17 == obj16) {
                                                                Object recomposer$$ExternalSyntheticLambda4 = new Recomposer$$ExternalSyntheticLambda4(27, atomicReference5, onBackListener);
                                                                gapComposer5.updateRememberedValue(recomposer$$ExternalSyntheticLambda4);
                                                                obj25 = recomposer$$ExternalSyntheticLambda4;
                                                            }
                                                            Updater.DisposableEffect(unit3, (Function1) obj25, gapComposer5);
                                                            gapComposer5.end(false);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-163706339);
                                                            gapComposer5.end(false);
                                                        }
                                                        OnTransitionListener onTransitionListener = callback3 instanceof OnTransitionListener ? (OnTransitionListener) callback3 : null;
                                                        if (onTransitionListener != null) {
                                                            gapComposer5.startReplaceGroup(-163559709);
                                                            EnterExitState enterExitState2 = (EnterExitState) animatedVisibilityScope4.getTransition().transitionState.getCurrentState();
                                                            EnterExitState enterExitState3 = (EnterExitState) animatedVisibilityScope4.getTransition().targetState$delegate.getValue();
                                                            if (enterExitState2 == EnterExitState.Visible) {
                                                                gapComposer5.startReplaceGroup(-163341314);
                                                                boolean changedInstance9 = gapComposer5.changedInstance(onTransitionListener);
                                                                Object rememberedValue18 = gapComposer5.rememberedValue();
                                                                if (changedInstance9 || rememberedValue18 == obj16) {
                                                                    z13 = false;
                                                                    Object uiContainerKt$ScreenContent$2$2$1$4$1 = new UiContainerKt$ScreenContent$2$2$1$4$1(onTransitionListener, null, 0);
                                                                    gapComposer5.updateRememberedValue(uiContainerKt$ScreenContent$2$2$1$4$1);
                                                                    obj14 = uiContainerKt$ScreenContent$2$2$1$4$1;
                                                                } else {
                                                                    z13 = false;
                                                                    obj14 = rememberedValue18;
                                                                }
                                                                Updater.LaunchedEffect(gapComposer5, enterExitState2, (Function2) obj14);
                                                                gapComposer5.end(z13);
                                                            } else {
                                                                gapComposer5.startReplaceGroup(-163188515);
                                                                gapComposer5.end(false);
                                                            }
                                                            if (enterExitState3 == EnterExitState.PostExit) {
                                                                gapComposer5.startReplaceGroup(-163114239);
                                                                boolean changedInstance10 = gapComposer5.changedInstance(onTransitionListener);
                                                                Object rememberedValue19 = gapComposer5.rememberedValue();
                                                                Object obj26 = rememberedValue19;
                                                                if (changedInstance10 || rememberedValue19 == obj16) {
                                                                    Object uiContainerKt$ScreenContent$2$2$1$4$12 = new UiContainerKt$ScreenContent$2$2$1$4$1(onTransitionListener, null, 1);
                                                                    gapComposer5.updateRememberedValue(uiContainerKt$ScreenContent$2$2$1$4$12);
                                                                    obj26 = uiContainerKt$ScreenContent$2$2$1$4$12;
                                                                }
                                                                Updater.LaunchedEffect(gapComposer5, enterExitState3, (Function2) obj26);
                                                                z12 = false;
                                                                gapComposer5.end(false);
                                                            } else {
                                                                z12 = false;
                                                                gapComposer5.startReplaceGroup(-162964323);
                                                                gapComposer5.end(false);
                                                            }
                                                            gapComposer5.end(z12);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-162950435);
                                                            gapComposer5.end(false);
                                                        }
                                                        CashComposeInsets cashComposeInsets = (CashComposeInsets) gapComposer5.consume(CashInsetsKt.LocalCashInsets);
                                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.LocalDensity;
                                                        Density density = (Density) gapComposer5.consume(staticProvidableCompositionLocal2);
                                                        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                                                        AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer5).statusBars;
                                                        AndroidWindowInsets androidWindowInsets2 = Arrangement$End$1.current(gapComposer5).navigationBars;
                                                        Object rememberedValue20 = gapComposer5.rememberedValue();
                                                        Object obj27 = rememberedValue20;
                                                        if (rememberedValue20 == obj16) {
                                                            obj27 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer5);
                                                        }
                                                        final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj27;
                                                        Object rememberedValue21 = gapComposer5.rememberedValue();
                                                        Object obj28 = rememberedValue21;
                                                        if (rememberedValue21 == obj16) {
                                                            obj28 = Boxes$$ExternalSyntheticOutline1.m(Integer.MAX_VALUE, gapComposer5);
                                                        }
                                                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj28;
                                                        Modifier fillMaxWidth = location4.getScreen() instanceof BottomSheetScreen ? SizeKt.fillMaxWidth(modifier, 1.0f) : modifier;
                                                        Object rememberedValue22 = gapComposer5.rememberedValue();
                                                        Object obj29 = rememberedValue22;
                                                        if (rememberedValue22 == obj16) {
                                                            Object colorModelsKt$$ExternalSyntheticLambda0 = new ColorModelsKt$$ExternalSyntheticLambda0(parcelableSnapshotMutableIntState2, i12);
                                                            gapComposer5.updateRememberedValue(colorModelsKt$$ExternalSyntheticLambda0);
                                                            obj29 = colorModelsKt$$ExternalSyntheticLambda0;
                                                        }
                                                        Modifier layout = ValueInsets.layout(fillMaxWidth, (Function3) obj29);
                                                        if (parcelableSnapshotMutableIntState.getIntValue() > 0) {
                                                            gapComposer5.startReplaceGroup(-160204951);
                                                            modifier = SizeKt.m277height3ABfNKs(modifier, parcelableSnapshotMutableIntState.getIntValue() / ((Density) gapComposer5.consume(staticProvidableCompositionLocal2)).getDensity());
                                                            gapComposer5.end(false);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-160085849);
                                                            gapComposer5.end(false);
                                                        }
                                                        Modifier then = layout.then(modifier);
                                                        boolean changedInstance11 = gapComposer5.changedInstance(screenUi5);
                                                        final ScreenLifecycle screenLifecycle3 = screenLifecycle22;
                                                        boolean changedInstance12 = changedInstance11 | gapComposer5.changedInstance(screenLifecycle3);
                                                        final DialogEventDispatcher dialogEventDispatcher3 = dialogEventDispatcher22;
                                                        boolean changedInstance13 = changedInstance12 | gapComposer5.changedInstance(dialogEventDispatcher3) | gapComposer5.changedInstance(location4) | gapComposer5.changedInstance(list8);
                                                        final WireAdapter wireAdapter4 = wireAdapter32;
                                                        boolean changedInstance14 = changedInstance13 | gapComposer5.changedInstance(wireAdapter4);
                                                        Object rememberedValue23 = gapComposer5.rememberedValue();
                                                        if (changedInstance14 || rememberedValue23 == obj16) {
                                                            obj13 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda30
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj30) {
                                                                    ((Context) obj30).getClass();
                                                                    UiFactory.ViewUi viewUi2 = (UiFactory.ViewUi) UiFactory.ScreenUi.this;
                                                                    View view = viewUi2.view;
                                                                    ScreenLifecycle screenLifecycle4 = screenLifecycle3;
                                                                    DBUtil.set(view, screenLifecycle4);
                                                                    screenLifecycle4.getClass();
                                                                    view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, screenLifecycle4);
                                                                    if (view instanceof DialogResultListener) {
                                                                        StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(view, 7);
                                                                        DialogEventDispatcher dialogEventDispatcher4 = dialogEventDispatcher3;
                                                                        dialogEventDispatcher4.getClass();
                                                                        dialogEventDispatcher4.eventListeners.add(storageLinkQueries$$ExternalSyntheticLambda8);
                                                                    }
                                                                    AbstractComposeView abstractComposeView = view instanceof AbstractComposeView ? (AbstractComposeView) view : null;
                                                                    if (abstractComposeView != null) {
                                                                        abstractComposeView.setViewCompositionStrategy(new MemoryCacheService(screenLifecycle4));
                                                                    }
                                                                    NavigationModel.Ready.Location location5 = location4;
                                                                    UiContainerKt.launchUiBindingIfNeeded(location5.getScope(), viewUi2, location5.getScreen(), list8, wireAdapter4);
                                                                    if (view.isAttachedToWindow()) {
                                                                        view.requestApplyInsets();
                                                                    } else {
                                                                        view.addOnAttachStateChangeListener(new AndroidGraphicsContext.AnonymousClass2(view, 3));
                                                                    }
                                                                    if (!(location5.getScreen() instanceof OnlyOneOverlayTreatment)) {
                                                                        Context context9 = view.getContext();
                                                                        context9.getClass();
                                                                        StableSystemBarsInsetsView stableSystemBarsInsetsView = new StableSystemBarsInsetsView(context9);
                                                                        stableSystemBarsInsetsView.addView(view);
                                                                        return stableSystemBarsInsetsView;
                                                                    }
                                                                    StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda82 = new StorageLinkQueries$$ExternalSyntheticLambda8(parcelableSnapshotMutableIntState, 8);
                                                                    Context context10 = view.getContext();
                                                                    context10.getClass();
                                                                    IntrinsicHeightReportingView intrinsicHeightReportingView = new IntrinsicHeightReportingView(context10, storageLinkQueries$$ExternalSyntheticLambda82);
                                                                    intrinsicHeightReportingView.addView(view);
                                                                    return intrinsicHeightReportingView;
                                                                }
                                                            };
                                                            list7 = list8;
                                                            gapComposer5.updateRememberedValue(obj13);
                                                        } else {
                                                            obj13 = rememberedValue23;
                                                            list7 = list8;
                                                        }
                                                        Function1 function13 = (Function1) obj13;
                                                        LeakDetector leakDetector4 = leakDetector32;
                                                        boolean changedInstance15 = gapComposer5.changedInstance(leakDetector4);
                                                        Object rememberedValue24 = gapComposer5.rememberedValue();
                                                        Object obj30 = rememberedValue24;
                                                        if (changedInstance15 || rememberedValue24 == obj16) {
                                                            Object storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(leakDetector4, 6);
                                                            gapComposer5.updateRememberedValue(storageLinkQueries$$ExternalSyntheticLambda8);
                                                            obj30 = storageLinkQueries$$ExternalSyntheticLambda8;
                                                        }
                                                        Function1 function14 = (Function1) obj30;
                                                        boolean changed10 = gapComposer5.changed(cashComposeInsets) | gapComposer5.changed(androidWindowInsets) | gapComposer5.changed(androidWindowInsets2) | gapComposer5.changed(density) | gapComposer5.changedInstance(location4) | gapComposer5.changedInstance(screenUi5) | gapComposer5.changedInstance(list7) | gapComposer5.changedInstance(wireAdapter4);
                                                        Object rememberedValue25 = gapComposer5.rememberedValue();
                                                        if (changed10 || rememberedValue25 == obj16) {
                                                            Object uiContainerKt$$ExternalSyntheticLambda32 = new UiContainerKt$$ExternalSyntheticLambda32(cashComposeInsets, androidWindowInsets, androidWindowInsets2, density, location4, screenUi5, list7, wireAdapter4, parcelableSnapshotMutableIntState2);
                                                            gapComposer5.updateRememberedValue(uiContainerKt$$ExternalSyntheticLambda32);
                                                            rememberedValue25 = uiContainerKt$$ExternalSyntheticLambda32;
                                                        }
                                                        AndroidView_androidKt.AndroidView(function13, then, null, function14, (Function1) rememberedValue25, gapComposer5, 0, 4);
                                                        gapComposer5.end(false);
                                                    }
                                                } else {
                                                    gapComposer5.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer4), gapComposer4, 3072);
                                    } else if (screenUi4 instanceof UiFactory.LegacySheetComposeUi) {
                                        composeConfig = new LegacySheetConfig.ComposeConfig(((UiFactory.LegacySheetComposeUi) screenUi4).config);
                                        if (z10) {
                                        }
                                        BottomSheetStateListener bottomSheetStateListener222 = bottomSheetStateListener;
                                        final NavigationModel.Ready.Location location322 = location2;
                                        final AnimatedVisibilityScope animatedVisibilityScope322 = animatedVisibilityScope2;
                                        final boolean z1122 = z8;
                                        final AtomicReference atomicReference422 = atomicReference3;
                                        final ScreenLifecycle screenLifecycle222 = screenLifecycle;
                                        final DialogEventDispatcher dialogEventDispatcher222 = dialogEventDispatcher;
                                        final List list622 = list5;
                                        final WireAdapter wireAdapter322 = wireAdapter2;
                                        final LeakDetector leakDetector322 = leakDetector2;
                                        function64.invoke(composeConfig, bottomSheetStateListener222, null, Expect_jvmKt.rememberComposableLambda(253301029, new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda15
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r3v14 */
                                            /* JADX WARN: Type inference failed for: r3v2 */
                                            /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj11, Object obj12) {
                                                ?? r3;
                                                Object obj13;
                                                List list7;
                                                boolean z12;
                                                boolean z13;
                                                Object obj14;
                                                boolean z14;
                                                Object obj15;
                                                Composer composer4 = (Composer) obj11;
                                                int intValue3 = ((Integer) obj12).intValue();
                                                BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                                                final int i11 = 0;
                                                GapComposer gapComposer5 = (GapComposer) composer4;
                                                boolean shouldExecute = gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                                                Applier applier = gapComposer5.applier;
                                                if (shouldExecute) {
                                                    final UiFactory.ScreenUi screenUi5 = UiFactory.ScreenUi.this;
                                                    boolean z15 = screenUi5 instanceof UiFactory.ComposeUi;
                                                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                                                    final NavigationModel.Ready.Location location4 = location322;
                                                    final List list8 = list622;
                                                    Path.Companion companion = PresenterElement.Key;
                                                    Object obj16 = Composer.Companion.Empty;
                                                    if (z15) {
                                                        gapComposer5.startReplaceGroup(-166498726);
                                                        boolean changed8 = gapComposer5.changed(location4.getStateKey()) | gapComposer5.changed(location4.getScope());
                                                        Object rememberedValue13 = gapComposer5.rememberedValue();
                                                        Object obj17 = rememberedValue13;
                                                        if (changed8 || rememberedValue13 == obj16) {
                                                            Object obj18 = (PresenterElement) location4.getScope().getCoroutineContext().get(companion);
                                                            gapComposer5.updateRememberedValue(obj18);
                                                            obj17 = obj18;
                                                        }
                                                        final PresenterElement presenterElement = (PresenterElement) obj17;
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                        int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, modifier);
                                                        ComposeUiNode.Companion.getClass();
                                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                                        if (applier == null) {
                                                            Updater.invalidApplier();
                                                            throw null;
                                                        }
                                                        gapComposer5.startReusableNode();
                                                        if (gapComposer5.inserting) {
                                                            gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                                                        } else {
                                                            gapComposer5.useNode();
                                                        }
                                                        Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                        Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                        Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                        Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                                        presenterElement.getClass();
                                                        Presenter.Binding binding = presenterElement.binding;
                                                        if (binding == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                            throw null;
                                                        }
                                                        StateFlow models = binding.getModels();
                                                        models.getClass();
                                                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                                                        gapComposer5.startMovableGroup(2106530429, gapComposer5.joinKey(models, emptyCoroutineContext));
                                                        MutableState collectAsState = Updater.collectAsState(models, emptyCoroutineContext, gapComposer5, 0);
                                                        gapComposer5.end(false);
                                                        Function4 function4 = ((UiFactory.ComposeUi) screenUi5).content;
                                                        Object value2 = collectAsState.getValue();
                                                        boolean changedInstance6 = gapComposer5.changedInstance(presenterElement) | gapComposer5.changedInstance(list8) | gapComposer5.changedInstance(location4);
                                                        Object rememberedValue14 = gapComposer5.rememberedValue();
                                                        Object obj19 = rememberedValue14;
                                                        if (changedInstance6 || rememberedValue14 == obj16) {
                                                            Object obj20 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda26
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj212) {
                                                                    int i12 = i11;
                                                                    NavigationModel.Ready.Location location5 = location4;
                                                                    List<EventListener> list9 = list8;
                                                                    PresenterElement presenterElement22 = presenterElement;
                                                                    switch (i12) {
                                                                        case 0:
                                                                            obj212.getClass();
                                                                            presenterElement22.sendEvent(obj212);
                                                                            for (EventListener eventListener : list9) {
                                                                                Screen screen3 = location5.getScreen();
                                                                                eventListener.getClass();
                                                                                screen3.getClass();
                                                                            }
                                                                            break;
                                                                        default:
                                                                            obj212.getClass();
                                                                            presenterElement22.sendEvent(obj212);
                                                                            for (EventListener eventListener2 : list9) {
                                                                                Screen screen4 = location5.getScreen();
                                                                                eventListener2.getClass();
                                                                                screen4.getClass();
                                                                            }
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer5.updateRememberedValue(obj20);
                                                            obj19 = obj20;
                                                        }
                                                        function4.invoke(value2, (Function1) obj19, gapComposer5, 0);
                                                        UiContainerKt.AttachUiModelReceivedSideEffect(collectAsState.getValue(), location4.getScreen(), list8, gapComposer5, 0);
                                                        gapComposer5.end(true);
                                                        gapComposer5.end(false);
                                                    } else if (screenUi5 instanceof UiFactory.LegacySheetComposeUi) {
                                                        gapComposer5.startReplaceGroup(-165624185);
                                                        boolean changed9 = gapComposer5.changed(location4.getStateKey()) | gapComposer5.changed(location4.getScope());
                                                        Object rememberedValue15 = gapComposer5.rememberedValue();
                                                        Object obj21 = rememberedValue15;
                                                        if (changed9 || rememberedValue15 == obj16) {
                                                            Object obj22 = (PresenterElement) location4.getScope().getCoroutineContext().get(companion);
                                                            gapComposer5.updateRememberedValue(obj22);
                                                            obj21 = obj22;
                                                        }
                                                        final PresenterElement presenterElement2 = (PresenterElement) obj21;
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                        int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                                                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, modifier);
                                                        ComposeUiNode.Companion.getClass();
                                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                        if (applier == null) {
                                                            Updater.invalidApplier();
                                                            throw null;
                                                        }
                                                        gapComposer5.startReusableNode();
                                                        if (gapComposer5.inserting) {
                                                            gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                                                        } else {
                                                            gapComposer5.useNode();
                                                        }
                                                        Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                        Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                        Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                        Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                                        presenterElement2.getClass();
                                                        Presenter.Binding binding2 = presenterElement2.binding;
                                                        if (binding2 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                            throw null;
                                                        }
                                                        Object value3 = Updater.collectAsState(binding2.getModels(), null, gapComposer5, 1).getValue();
                                                        ComposableLambdaImpl composableLambdaImpl = ((UiFactory.LegacySheetComposeUi) screenUi5).content;
                                                        gapComposer5.startReplaceGroup(851296309);
                                                        Object consume3 = gapComposer5.consume(UiContainerKt.LocalLegacySheetScope);
                                                        consume3.getClass();
                                                        Object obj23 = (UiContainerKt$BottomSheet$1$sheetScope$1) consume3;
                                                        boolean changedInstance7 = gapComposer5.changedInstance(presenterElement2) | gapComposer5.changedInstance(list8) | gapComposer5.changedInstance(location4);
                                                        Object rememberedValue16 = gapComposer5.rememberedValue();
                                                        if (changedInstance7 || rememberedValue16 == obj16) {
                                                            z14 = true;
                                                            final int z16 = true ? 1 : 0;
                                                            Object obj24 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda26
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj212) {
                                                                    int i12 = z16;
                                                                    NavigationModel.Ready.Location location5 = location4;
                                                                    List<EventListener> list9 = list8;
                                                                    PresenterElement presenterElement22 = presenterElement2;
                                                                    switch (i12) {
                                                                        case 0:
                                                                            obj212.getClass();
                                                                            presenterElement22.sendEvent(obj212);
                                                                            for (EventListener eventListener : list9) {
                                                                                Screen screen3 = location5.getScreen();
                                                                                eventListener.getClass();
                                                                                screen3.getClass();
                                                                            }
                                                                            break;
                                                                        default:
                                                                            obj212.getClass();
                                                                            presenterElement22.sendEvent(obj212);
                                                                            for (EventListener eventListener2 : list9) {
                                                                                Screen screen4 = location5.getScreen();
                                                                                eventListener2.getClass();
                                                                                screen4.getClass();
                                                                            }
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer5.updateRememberedValue(obj24);
                                                            obj15 = obj24;
                                                        } else {
                                                            z14 = true;
                                                            obj15 = rememberedValue16;
                                                        }
                                                        composableLambdaImpl.invoke(obj23, value3, obj15, (Object) gapComposer5, (Object) 0);
                                                        gapComposer5.end(false);
                                                        UiContainerKt.AttachUiModelReceivedSideEffect(value3, location4.getScreen(), list8, gapComposer5, 0);
                                                        gapComposer5.end(z14);
                                                        gapComposer5.end(false);
                                                    } else {
                                                        if (!(screenUi5 instanceof UiFactory.ViewUi)) {
                                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, -1390836591, false);
                                                        }
                                                        gapComposer5.startReplaceGroup(-164492468);
                                                        UiFactory.ViewUi viewUi = (UiFactory.ViewUi) screenUi5;
                                                        KeyEvent.Callback callback3 = viewUi.view;
                                                        int i12 = 6;
                                                        if (callback3 instanceof LandscapeOrientation) {
                                                            gapComposer5.startReplaceGroup(-1390784998);
                                                            UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
                                                            OrientationKt.Orientation(gapComposer5, 6);
                                                            r3 = 0;
                                                        } else {
                                                            r3 = 0;
                                                            gapComposer5.startReplaceGroup(-164611043);
                                                        }
                                                        gapComposer5.end(r3);
                                                        if (callback3 instanceof FullScreen) {
                                                            gapComposer5.startReplaceGroup(-1390782155);
                                                            FullScreenKt.FullScreen(gapComposer5, 6);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-164558467);
                                                        }
                                                        gapComposer5.end(r3);
                                                        if (callback3 instanceof SecureScreen) {
                                                            gapComposer5.startReplaceGroup(-1390780393);
                                                            SecureScreenKt.SecureScreen(true, gapComposer5, 6);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-164501923);
                                                        }
                                                        gapComposer5.end(r3);
                                                        if (callback3 instanceof OverridesSystemBars) {
                                                            gapComposer5.startReplaceGroup(-164453377);
                                                            ChromeConfigKt.ChromeConfig(!((OverridesSystemBars) callback3).isLightSystemBars(), (Boolean) null, gapComposer5, (int) r3, 14);
                                                            gapComposer5.end(r3);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-164363043);
                                                            gapComposer5.end(r3);
                                                        }
                                                        Ui ui = viewUi.ui;
                                                        OnBackListener onBackListener = ui instanceof OnBackListener ? (OnBackListener) ui : null;
                                                        if (onBackListener == null) {
                                                            onBackListener = callback3 instanceof OnBackListener ? (OnBackListener) callback3 : null;
                                                        }
                                                        AnimatedVisibilityScope animatedVisibilityScope4 = animatedVisibilityScope322;
                                                        if (onBackListener != null && animatedVisibilityScope4.getTransition().targetState$delegate.getValue() == EnterExitState.Visible && z1122) {
                                                            gapComposer5.startReplaceGroup(-163965809);
                                                            Unit unit3 = Unit.INSTANCE;
                                                            AtomicReference atomicReference5 = atomicReference422;
                                                            boolean changedInstance8 = gapComposer5.changedInstance(atomicReference5) | gapComposer5.changedInstance(onBackListener);
                                                            Object rememberedValue17 = gapComposer5.rememberedValue();
                                                            Object obj25 = rememberedValue17;
                                                            if (changedInstance8 || rememberedValue17 == obj16) {
                                                                Object recomposer$$ExternalSyntheticLambda4 = new Recomposer$$ExternalSyntheticLambda4(27, atomicReference5, onBackListener);
                                                                gapComposer5.updateRememberedValue(recomposer$$ExternalSyntheticLambda4);
                                                                obj25 = recomposer$$ExternalSyntheticLambda4;
                                                            }
                                                            Updater.DisposableEffect(unit3, (Function1) obj25, gapComposer5);
                                                            gapComposer5.end(false);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-163706339);
                                                            gapComposer5.end(false);
                                                        }
                                                        OnTransitionListener onTransitionListener = callback3 instanceof OnTransitionListener ? (OnTransitionListener) callback3 : null;
                                                        if (onTransitionListener != null) {
                                                            gapComposer5.startReplaceGroup(-163559709);
                                                            EnterExitState enterExitState2 = (EnterExitState) animatedVisibilityScope4.getTransition().transitionState.getCurrentState();
                                                            EnterExitState enterExitState3 = (EnterExitState) animatedVisibilityScope4.getTransition().targetState$delegate.getValue();
                                                            if (enterExitState2 == EnterExitState.Visible) {
                                                                gapComposer5.startReplaceGroup(-163341314);
                                                                boolean changedInstance9 = gapComposer5.changedInstance(onTransitionListener);
                                                                Object rememberedValue18 = gapComposer5.rememberedValue();
                                                                if (changedInstance9 || rememberedValue18 == obj16) {
                                                                    z13 = false;
                                                                    Object uiContainerKt$ScreenContent$2$2$1$4$1 = new UiContainerKt$ScreenContent$2$2$1$4$1(onTransitionListener, null, 0);
                                                                    gapComposer5.updateRememberedValue(uiContainerKt$ScreenContent$2$2$1$4$1);
                                                                    obj14 = uiContainerKt$ScreenContent$2$2$1$4$1;
                                                                } else {
                                                                    z13 = false;
                                                                    obj14 = rememberedValue18;
                                                                }
                                                                Updater.LaunchedEffect(gapComposer5, enterExitState2, (Function2) obj14);
                                                                gapComposer5.end(z13);
                                                            } else {
                                                                gapComposer5.startReplaceGroup(-163188515);
                                                                gapComposer5.end(false);
                                                            }
                                                            if (enterExitState3 == EnterExitState.PostExit) {
                                                                gapComposer5.startReplaceGroup(-163114239);
                                                                boolean changedInstance10 = gapComposer5.changedInstance(onTransitionListener);
                                                                Object rememberedValue19 = gapComposer5.rememberedValue();
                                                                Object obj26 = rememberedValue19;
                                                                if (changedInstance10 || rememberedValue19 == obj16) {
                                                                    Object uiContainerKt$ScreenContent$2$2$1$4$12 = new UiContainerKt$ScreenContent$2$2$1$4$1(onTransitionListener, null, 1);
                                                                    gapComposer5.updateRememberedValue(uiContainerKt$ScreenContent$2$2$1$4$12);
                                                                    obj26 = uiContainerKt$ScreenContent$2$2$1$4$12;
                                                                }
                                                                Updater.LaunchedEffect(gapComposer5, enterExitState3, (Function2) obj26);
                                                                z12 = false;
                                                                gapComposer5.end(false);
                                                            } else {
                                                                z12 = false;
                                                                gapComposer5.startReplaceGroup(-162964323);
                                                                gapComposer5.end(false);
                                                            }
                                                            gapComposer5.end(z12);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-162950435);
                                                            gapComposer5.end(false);
                                                        }
                                                        CashComposeInsets cashComposeInsets = (CashComposeInsets) gapComposer5.consume(CashInsetsKt.LocalCashInsets);
                                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.LocalDensity;
                                                        Density density = (Density) gapComposer5.consume(staticProvidableCompositionLocal2);
                                                        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                                                        AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer5).statusBars;
                                                        AndroidWindowInsets androidWindowInsets2 = Arrangement$End$1.current(gapComposer5).navigationBars;
                                                        Object rememberedValue20 = gapComposer5.rememberedValue();
                                                        Object obj27 = rememberedValue20;
                                                        if (rememberedValue20 == obj16) {
                                                            obj27 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer5);
                                                        }
                                                        final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj27;
                                                        Object rememberedValue21 = gapComposer5.rememberedValue();
                                                        Object obj28 = rememberedValue21;
                                                        if (rememberedValue21 == obj16) {
                                                            obj28 = Boxes$$ExternalSyntheticOutline1.m(Integer.MAX_VALUE, gapComposer5);
                                                        }
                                                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj28;
                                                        Modifier fillMaxWidth = location4.getScreen() instanceof BottomSheetScreen ? SizeKt.fillMaxWidth(modifier, 1.0f) : modifier;
                                                        Object rememberedValue22 = gapComposer5.rememberedValue();
                                                        Object obj29 = rememberedValue22;
                                                        if (rememberedValue22 == obj16) {
                                                            Object colorModelsKt$$ExternalSyntheticLambda0 = new ColorModelsKt$$ExternalSyntheticLambda0(parcelableSnapshotMutableIntState2, i12);
                                                            gapComposer5.updateRememberedValue(colorModelsKt$$ExternalSyntheticLambda0);
                                                            obj29 = colorModelsKt$$ExternalSyntheticLambda0;
                                                        }
                                                        Modifier layout = ValueInsets.layout(fillMaxWidth, (Function3) obj29);
                                                        if (parcelableSnapshotMutableIntState.getIntValue() > 0) {
                                                            gapComposer5.startReplaceGroup(-160204951);
                                                            modifier = SizeKt.m277height3ABfNKs(modifier, parcelableSnapshotMutableIntState.getIntValue() / ((Density) gapComposer5.consume(staticProvidableCompositionLocal2)).getDensity());
                                                            gapComposer5.end(false);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-160085849);
                                                            gapComposer5.end(false);
                                                        }
                                                        Modifier then = layout.then(modifier);
                                                        boolean changedInstance11 = gapComposer5.changedInstance(screenUi5);
                                                        final ScreenLifecycle screenLifecycle3 = screenLifecycle222;
                                                        boolean changedInstance12 = changedInstance11 | gapComposer5.changedInstance(screenLifecycle3);
                                                        final DialogEventDispatcher dialogEventDispatcher3 = dialogEventDispatcher222;
                                                        boolean changedInstance13 = changedInstance12 | gapComposer5.changedInstance(dialogEventDispatcher3) | gapComposer5.changedInstance(location4) | gapComposer5.changedInstance(list8);
                                                        final WireAdapter wireAdapter4 = wireAdapter322;
                                                        boolean changedInstance14 = changedInstance13 | gapComposer5.changedInstance(wireAdapter4);
                                                        Object rememberedValue23 = gapComposer5.rememberedValue();
                                                        if (changedInstance14 || rememberedValue23 == obj16) {
                                                            obj13 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda30
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj30) {
                                                                    ((Context) obj30).getClass();
                                                                    UiFactory.ViewUi viewUi2 = (UiFactory.ViewUi) UiFactory.ScreenUi.this;
                                                                    View view = viewUi2.view;
                                                                    ScreenLifecycle screenLifecycle4 = screenLifecycle3;
                                                                    DBUtil.set(view, screenLifecycle4);
                                                                    screenLifecycle4.getClass();
                                                                    view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, screenLifecycle4);
                                                                    if (view instanceof DialogResultListener) {
                                                                        StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(view, 7);
                                                                        DialogEventDispatcher dialogEventDispatcher4 = dialogEventDispatcher3;
                                                                        dialogEventDispatcher4.getClass();
                                                                        dialogEventDispatcher4.eventListeners.add(storageLinkQueries$$ExternalSyntheticLambda8);
                                                                    }
                                                                    AbstractComposeView abstractComposeView = view instanceof AbstractComposeView ? (AbstractComposeView) view : null;
                                                                    if (abstractComposeView != null) {
                                                                        abstractComposeView.setViewCompositionStrategy(new MemoryCacheService(screenLifecycle4));
                                                                    }
                                                                    NavigationModel.Ready.Location location5 = location4;
                                                                    UiContainerKt.launchUiBindingIfNeeded(location5.getScope(), viewUi2, location5.getScreen(), list8, wireAdapter4);
                                                                    if (view.isAttachedToWindow()) {
                                                                        view.requestApplyInsets();
                                                                    } else {
                                                                        view.addOnAttachStateChangeListener(new AndroidGraphicsContext.AnonymousClass2(view, 3));
                                                                    }
                                                                    if (!(location5.getScreen() instanceof OnlyOneOverlayTreatment)) {
                                                                        Context context9 = view.getContext();
                                                                        context9.getClass();
                                                                        StableSystemBarsInsetsView stableSystemBarsInsetsView = new StableSystemBarsInsetsView(context9);
                                                                        stableSystemBarsInsetsView.addView(view);
                                                                        return stableSystemBarsInsetsView;
                                                                    }
                                                                    StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda82 = new StorageLinkQueries$$ExternalSyntheticLambda8(parcelableSnapshotMutableIntState, 8);
                                                                    Context context10 = view.getContext();
                                                                    context10.getClass();
                                                                    IntrinsicHeightReportingView intrinsicHeightReportingView = new IntrinsicHeightReportingView(context10, storageLinkQueries$$ExternalSyntheticLambda82);
                                                                    intrinsicHeightReportingView.addView(view);
                                                                    return intrinsicHeightReportingView;
                                                                }
                                                            };
                                                            list7 = list8;
                                                            gapComposer5.updateRememberedValue(obj13);
                                                        } else {
                                                            obj13 = rememberedValue23;
                                                            list7 = list8;
                                                        }
                                                        Function1 function13 = (Function1) obj13;
                                                        LeakDetector leakDetector4 = leakDetector322;
                                                        boolean changedInstance15 = gapComposer5.changedInstance(leakDetector4);
                                                        Object rememberedValue24 = gapComposer5.rememberedValue();
                                                        Object obj30 = rememberedValue24;
                                                        if (changedInstance15 || rememberedValue24 == obj16) {
                                                            Object storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(leakDetector4, 6);
                                                            gapComposer5.updateRememberedValue(storageLinkQueries$$ExternalSyntheticLambda8);
                                                            obj30 = storageLinkQueries$$ExternalSyntheticLambda8;
                                                        }
                                                        Function1 function14 = (Function1) obj30;
                                                        boolean changed10 = gapComposer5.changed(cashComposeInsets) | gapComposer5.changed(androidWindowInsets) | gapComposer5.changed(androidWindowInsets2) | gapComposer5.changed(density) | gapComposer5.changedInstance(location4) | gapComposer5.changedInstance(screenUi5) | gapComposer5.changedInstance(list7) | gapComposer5.changedInstance(wireAdapter4);
                                                        Object rememberedValue25 = gapComposer5.rememberedValue();
                                                        if (changed10 || rememberedValue25 == obj16) {
                                                            Object uiContainerKt$$ExternalSyntheticLambda32 = new UiContainerKt$$ExternalSyntheticLambda32(cashComposeInsets, androidWindowInsets, androidWindowInsets2, density, location4, screenUi5, list7, wireAdapter4, parcelableSnapshotMutableIntState2);
                                                            gapComposer5.updateRememberedValue(uiContainerKt$$ExternalSyntheticLambda32);
                                                            rememberedValue25 = uiContainerKt$$ExternalSyntheticLambda32;
                                                        }
                                                        AndroidView_androidKt.AndroidView(function13, then, null, function14, (Function1) rememberedValue25, gapComposer5, 0, 4);
                                                        gapComposer5.end(false);
                                                    }
                                                } else {
                                                    gapComposer5.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer4), gapComposer4, 3072);
                                    } else {
                                        if (!(screenUi4 instanceof UiFactory.ComposeUi)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        composeConfig = null;
                                        if (z10) {
                                        }
                                        BottomSheetStateListener bottomSheetStateListener2222 = bottomSheetStateListener;
                                        final NavigationModel.Ready.Location location3222 = location2;
                                        final AnimatedVisibilityScope animatedVisibilityScope3222 = animatedVisibilityScope2;
                                        final boolean z11222 = z8;
                                        final AtomicReference atomicReference4222 = atomicReference3;
                                        final ScreenLifecycle screenLifecycle2222 = screenLifecycle;
                                        final DialogEventDispatcher dialogEventDispatcher2222 = dialogEventDispatcher;
                                        final List list6222 = list5;
                                        final WireAdapter wireAdapter3222 = wireAdapter2;
                                        final LeakDetector leakDetector3222 = leakDetector2;
                                        function64.invoke(composeConfig, bottomSheetStateListener2222, null, Expect_jvmKt.rememberComposableLambda(253301029, new Function2() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda15
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r3v14 */
                                            /* JADX WARN: Type inference failed for: r3v2 */
                                            /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj11, Object obj12) {
                                                ?? r3;
                                                Object obj13;
                                                List list7;
                                                boolean z12;
                                                boolean z13;
                                                Object obj14;
                                                boolean z14;
                                                Object obj15;
                                                Composer composer4 = (Composer) obj11;
                                                int intValue3 = ((Integer) obj12).intValue();
                                                BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                                                final int i11 = 0;
                                                GapComposer gapComposer5 = (GapComposer) composer4;
                                                boolean shouldExecute = gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                                                Applier applier = gapComposer5.applier;
                                                if (shouldExecute) {
                                                    final UiFactory.ScreenUi screenUi5 = UiFactory.ScreenUi.this;
                                                    boolean z15 = screenUi5 instanceof UiFactory.ComposeUi;
                                                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                                                    final NavigationModel.Ready.Location location4 = location3222;
                                                    final List list8 = list6222;
                                                    Path.Companion companion = PresenterElement.Key;
                                                    Object obj16 = Composer.Companion.Empty;
                                                    if (z15) {
                                                        gapComposer5.startReplaceGroup(-166498726);
                                                        boolean changed8 = gapComposer5.changed(location4.getStateKey()) | gapComposer5.changed(location4.getScope());
                                                        Object rememberedValue13 = gapComposer5.rememberedValue();
                                                        Object obj17 = rememberedValue13;
                                                        if (changed8 || rememberedValue13 == obj16) {
                                                            Object obj18 = (PresenterElement) location4.getScope().getCoroutineContext().get(companion);
                                                            gapComposer5.updateRememberedValue(obj18);
                                                            obj17 = obj18;
                                                        }
                                                        final PresenterElement presenterElement = (PresenterElement) obj17;
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                        int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, modifier);
                                                        ComposeUiNode.Companion.getClass();
                                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                                        if (applier == null) {
                                                            Updater.invalidApplier();
                                                            throw null;
                                                        }
                                                        gapComposer5.startReusableNode();
                                                        if (gapComposer5.inserting) {
                                                            gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                                                        } else {
                                                            gapComposer5.useNode();
                                                        }
                                                        Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                        Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                        Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                        Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                                        presenterElement.getClass();
                                                        Presenter.Binding binding = presenterElement.binding;
                                                        if (binding == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                            throw null;
                                                        }
                                                        StateFlow models = binding.getModels();
                                                        models.getClass();
                                                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                                                        gapComposer5.startMovableGroup(2106530429, gapComposer5.joinKey(models, emptyCoroutineContext));
                                                        MutableState collectAsState = Updater.collectAsState(models, emptyCoroutineContext, gapComposer5, 0);
                                                        gapComposer5.end(false);
                                                        Function4 function4 = ((UiFactory.ComposeUi) screenUi5).content;
                                                        Object value2 = collectAsState.getValue();
                                                        boolean changedInstance6 = gapComposer5.changedInstance(presenterElement) | gapComposer5.changedInstance(list8) | gapComposer5.changedInstance(location4);
                                                        Object rememberedValue14 = gapComposer5.rememberedValue();
                                                        Object obj19 = rememberedValue14;
                                                        if (changedInstance6 || rememberedValue14 == obj16) {
                                                            Object obj20 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda26
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj212) {
                                                                    int i12 = i11;
                                                                    NavigationModel.Ready.Location location5 = location4;
                                                                    List<EventListener> list9 = list8;
                                                                    PresenterElement presenterElement22 = presenterElement;
                                                                    switch (i12) {
                                                                        case 0:
                                                                            obj212.getClass();
                                                                            presenterElement22.sendEvent(obj212);
                                                                            for (EventListener eventListener : list9) {
                                                                                Screen screen3 = location5.getScreen();
                                                                                eventListener.getClass();
                                                                                screen3.getClass();
                                                                            }
                                                                            break;
                                                                        default:
                                                                            obj212.getClass();
                                                                            presenterElement22.sendEvent(obj212);
                                                                            for (EventListener eventListener2 : list9) {
                                                                                Screen screen4 = location5.getScreen();
                                                                                eventListener2.getClass();
                                                                                screen4.getClass();
                                                                            }
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer5.updateRememberedValue(obj20);
                                                            obj19 = obj20;
                                                        }
                                                        function4.invoke(value2, (Function1) obj19, gapComposer5, 0);
                                                        UiContainerKt.AttachUiModelReceivedSideEffect(collectAsState.getValue(), location4.getScreen(), list8, gapComposer5, 0);
                                                        gapComposer5.end(true);
                                                        gapComposer5.end(false);
                                                    } else if (screenUi5 instanceof UiFactory.LegacySheetComposeUi) {
                                                        gapComposer5.startReplaceGroup(-165624185);
                                                        boolean changed9 = gapComposer5.changed(location4.getStateKey()) | gapComposer5.changed(location4.getScope());
                                                        Object rememberedValue15 = gapComposer5.rememberedValue();
                                                        Object obj21 = rememberedValue15;
                                                        if (changed9 || rememberedValue15 == obj16) {
                                                            Object obj22 = (PresenterElement) location4.getScope().getCoroutineContext().get(companion);
                                                            gapComposer5.updateRememberedValue(obj22);
                                                            obj21 = obj22;
                                                        }
                                                        final PresenterElement presenterElement2 = (PresenterElement) obj21;
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                        int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                                                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, modifier);
                                                        ComposeUiNode.Companion.getClass();
                                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                        if (applier == null) {
                                                            Updater.invalidApplier();
                                                            throw null;
                                                        }
                                                        gapComposer5.startReusableNode();
                                                        if (gapComposer5.inserting) {
                                                            gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                                                        } else {
                                                            gapComposer5.useNode();
                                                        }
                                                        Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                        Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                        Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                        Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                                        presenterElement2.getClass();
                                                        Presenter.Binding binding2 = presenterElement2.binding;
                                                        if (binding2 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                            throw null;
                                                        }
                                                        Object value3 = Updater.collectAsState(binding2.getModels(), null, gapComposer5, 1).getValue();
                                                        ComposableLambdaImpl composableLambdaImpl = ((UiFactory.LegacySheetComposeUi) screenUi5).content;
                                                        gapComposer5.startReplaceGroup(851296309);
                                                        Object consume3 = gapComposer5.consume(UiContainerKt.LocalLegacySheetScope);
                                                        consume3.getClass();
                                                        Object obj23 = (UiContainerKt$BottomSheet$1$sheetScope$1) consume3;
                                                        boolean changedInstance7 = gapComposer5.changedInstance(presenterElement2) | gapComposer5.changedInstance(list8) | gapComposer5.changedInstance(location4);
                                                        Object rememberedValue16 = gapComposer5.rememberedValue();
                                                        if (changedInstance7 || rememberedValue16 == obj16) {
                                                            z14 = true;
                                                            final int z16 = true ? 1 : 0;
                                                            Object obj24 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda26
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj212) {
                                                                    int i12 = z16;
                                                                    NavigationModel.Ready.Location location5 = location4;
                                                                    List<EventListener> list9 = list8;
                                                                    PresenterElement presenterElement22 = presenterElement2;
                                                                    switch (i12) {
                                                                        case 0:
                                                                            obj212.getClass();
                                                                            presenterElement22.sendEvent(obj212);
                                                                            for (EventListener eventListener : list9) {
                                                                                Screen screen3 = location5.getScreen();
                                                                                eventListener.getClass();
                                                                                screen3.getClass();
                                                                            }
                                                                            break;
                                                                        default:
                                                                            obj212.getClass();
                                                                            presenterElement22.sendEvent(obj212);
                                                                            for (EventListener eventListener2 : list9) {
                                                                                Screen screen4 = location5.getScreen();
                                                                                eventListener2.getClass();
                                                                                screen4.getClass();
                                                                            }
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer5.updateRememberedValue(obj24);
                                                            obj15 = obj24;
                                                        } else {
                                                            z14 = true;
                                                            obj15 = rememberedValue16;
                                                        }
                                                        composableLambdaImpl.invoke(obj23, value3, obj15, (Object) gapComposer5, (Object) 0);
                                                        gapComposer5.end(false);
                                                        UiContainerKt.AttachUiModelReceivedSideEffect(value3, location4.getScreen(), list8, gapComposer5, 0);
                                                        gapComposer5.end(z14);
                                                        gapComposer5.end(false);
                                                    } else {
                                                        if (!(screenUi5 instanceof UiFactory.ViewUi)) {
                                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, -1390836591, false);
                                                        }
                                                        gapComposer5.startReplaceGroup(-164492468);
                                                        UiFactory.ViewUi viewUi = (UiFactory.ViewUi) screenUi5;
                                                        KeyEvent.Callback callback3 = viewUi.view;
                                                        int i12 = 6;
                                                        if (callback3 instanceof LandscapeOrientation) {
                                                            gapComposer5.startReplaceGroup(-1390784998);
                                                            UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
                                                            OrientationKt.Orientation(gapComposer5, 6);
                                                            r3 = 0;
                                                        } else {
                                                            r3 = 0;
                                                            gapComposer5.startReplaceGroup(-164611043);
                                                        }
                                                        gapComposer5.end(r3);
                                                        if (callback3 instanceof FullScreen) {
                                                            gapComposer5.startReplaceGroup(-1390782155);
                                                            FullScreenKt.FullScreen(gapComposer5, 6);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-164558467);
                                                        }
                                                        gapComposer5.end(r3);
                                                        if (callback3 instanceof SecureScreen) {
                                                            gapComposer5.startReplaceGroup(-1390780393);
                                                            SecureScreenKt.SecureScreen(true, gapComposer5, 6);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-164501923);
                                                        }
                                                        gapComposer5.end(r3);
                                                        if (callback3 instanceof OverridesSystemBars) {
                                                            gapComposer5.startReplaceGroup(-164453377);
                                                            ChromeConfigKt.ChromeConfig(!((OverridesSystemBars) callback3).isLightSystemBars(), (Boolean) null, gapComposer5, (int) r3, 14);
                                                            gapComposer5.end(r3);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-164363043);
                                                            gapComposer5.end(r3);
                                                        }
                                                        Ui ui = viewUi.ui;
                                                        OnBackListener onBackListener = ui instanceof OnBackListener ? (OnBackListener) ui : null;
                                                        if (onBackListener == null) {
                                                            onBackListener = callback3 instanceof OnBackListener ? (OnBackListener) callback3 : null;
                                                        }
                                                        AnimatedVisibilityScope animatedVisibilityScope4 = animatedVisibilityScope3222;
                                                        if (onBackListener != null && animatedVisibilityScope4.getTransition().targetState$delegate.getValue() == EnterExitState.Visible && z11222) {
                                                            gapComposer5.startReplaceGroup(-163965809);
                                                            Unit unit3 = Unit.INSTANCE;
                                                            AtomicReference atomicReference5 = atomicReference4222;
                                                            boolean changedInstance8 = gapComposer5.changedInstance(atomicReference5) | gapComposer5.changedInstance(onBackListener);
                                                            Object rememberedValue17 = gapComposer5.rememberedValue();
                                                            Object obj25 = rememberedValue17;
                                                            if (changedInstance8 || rememberedValue17 == obj16) {
                                                                Object recomposer$$ExternalSyntheticLambda4 = new Recomposer$$ExternalSyntheticLambda4(27, atomicReference5, onBackListener);
                                                                gapComposer5.updateRememberedValue(recomposer$$ExternalSyntheticLambda4);
                                                                obj25 = recomposer$$ExternalSyntheticLambda4;
                                                            }
                                                            Updater.DisposableEffect(unit3, (Function1) obj25, gapComposer5);
                                                            gapComposer5.end(false);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-163706339);
                                                            gapComposer5.end(false);
                                                        }
                                                        OnTransitionListener onTransitionListener = callback3 instanceof OnTransitionListener ? (OnTransitionListener) callback3 : null;
                                                        if (onTransitionListener != null) {
                                                            gapComposer5.startReplaceGroup(-163559709);
                                                            EnterExitState enterExitState2 = (EnterExitState) animatedVisibilityScope4.getTransition().transitionState.getCurrentState();
                                                            EnterExitState enterExitState3 = (EnterExitState) animatedVisibilityScope4.getTransition().targetState$delegate.getValue();
                                                            if (enterExitState2 == EnterExitState.Visible) {
                                                                gapComposer5.startReplaceGroup(-163341314);
                                                                boolean changedInstance9 = gapComposer5.changedInstance(onTransitionListener);
                                                                Object rememberedValue18 = gapComposer5.rememberedValue();
                                                                if (changedInstance9 || rememberedValue18 == obj16) {
                                                                    z13 = false;
                                                                    Object uiContainerKt$ScreenContent$2$2$1$4$1 = new UiContainerKt$ScreenContent$2$2$1$4$1(onTransitionListener, null, 0);
                                                                    gapComposer5.updateRememberedValue(uiContainerKt$ScreenContent$2$2$1$4$1);
                                                                    obj14 = uiContainerKt$ScreenContent$2$2$1$4$1;
                                                                } else {
                                                                    z13 = false;
                                                                    obj14 = rememberedValue18;
                                                                }
                                                                Updater.LaunchedEffect(gapComposer5, enterExitState2, (Function2) obj14);
                                                                gapComposer5.end(z13);
                                                            } else {
                                                                gapComposer5.startReplaceGroup(-163188515);
                                                                gapComposer5.end(false);
                                                            }
                                                            if (enterExitState3 == EnterExitState.PostExit) {
                                                                gapComposer5.startReplaceGroup(-163114239);
                                                                boolean changedInstance10 = gapComposer5.changedInstance(onTransitionListener);
                                                                Object rememberedValue19 = gapComposer5.rememberedValue();
                                                                Object obj26 = rememberedValue19;
                                                                if (changedInstance10 || rememberedValue19 == obj16) {
                                                                    Object uiContainerKt$ScreenContent$2$2$1$4$12 = new UiContainerKt$ScreenContent$2$2$1$4$1(onTransitionListener, null, 1);
                                                                    gapComposer5.updateRememberedValue(uiContainerKt$ScreenContent$2$2$1$4$12);
                                                                    obj26 = uiContainerKt$ScreenContent$2$2$1$4$12;
                                                                }
                                                                Updater.LaunchedEffect(gapComposer5, enterExitState3, (Function2) obj26);
                                                                z12 = false;
                                                                gapComposer5.end(false);
                                                            } else {
                                                                z12 = false;
                                                                gapComposer5.startReplaceGroup(-162964323);
                                                                gapComposer5.end(false);
                                                            }
                                                            gapComposer5.end(z12);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-162950435);
                                                            gapComposer5.end(false);
                                                        }
                                                        CashComposeInsets cashComposeInsets = (CashComposeInsets) gapComposer5.consume(CashInsetsKt.LocalCashInsets);
                                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.LocalDensity;
                                                        Density density = (Density) gapComposer5.consume(staticProvidableCompositionLocal2);
                                                        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                                                        AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer5).statusBars;
                                                        AndroidWindowInsets androidWindowInsets2 = Arrangement$End$1.current(gapComposer5).navigationBars;
                                                        Object rememberedValue20 = gapComposer5.rememberedValue();
                                                        Object obj27 = rememberedValue20;
                                                        if (rememberedValue20 == obj16) {
                                                            obj27 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer5);
                                                        }
                                                        final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj27;
                                                        Object rememberedValue21 = gapComposer5.rememberedValue();
                                                        Object obj28 = rememberedValue21;
                                                        if (rememberedValue21 == obj16) {
                                                            obj28 = Boxes$$ExternalSyntheticOutline1.m(Integer.MAX_VALUE, gapComposer5);
                                                        }
                                                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj28;
                                                        Modifier fillMaxWidth = location4.getScreen() instanceof BottomSheetScreen ? SizeKt.fillMaxWidth(modifier, 1.0f) : modifier;
                                                        Object rememberedValue22 = gapComposer5.rememberedValue();
                                                        Object obj29 = rememberedValue22;
                                                        if (rememberedValue22 == obj16) {
                                                            Object colorModelsKt$$ExternalSyntheticLambda0 = new ColorModelsKt$$ExternalSyntheticLambda0(parcelableSnapshotMutableIntState2, i12);
                                                            gapComposer5.updateRememberedValue(colorModelsKt$$ExternalSyntheticLambda0);
                                                            obj29 = colorModelsKt$$ExternalSyntheticLambda0;
                                                        }
                                                        Modifier layout = ValueInsets.layout(fillMaxWidth, (Function3) obj29);
                                                        if (parcelableSnapshotMutableIntState.getIntValue() > 0) {
                                                            gapComposer5.startReplaceGroup(-160204951);
                                                            modifier = SizeKt.m277height3ABfNKs(modifier, parcelableSnapshotMutableIntState.getIntValue() / ((Density) gapComposer5.consume(staticProvidableCompositionLocal2)).getDensity());
                                                            gapComposer5.end(false);
                                                        } else {
                                                            gapComposer5.startReplaceGroup(-160085849);
                                                            gapComposer5.end(false);
                                                        }
                                                        Modifier then = layout.then(modifier);
                                                        boolean changedInstance11 = gapComposer5.changedInstance(screenUi5);
                                                        final ScreenLifecycle screenLifecycle3 = screenLifecycle2222;
                                                        boolean changedInstance12 = changedInstance11 | gapComposer5.changedInstance(screenLifecycle3);
                                                        final DialogEventDispatcher dialogEventDispatcher3 = dialogEventDispatcher2222;
                                                        boolean changedInstance13 = changedInstance12 | gapComposer5.changedInstance(dialogEventDispatcher3) | gapComposer5.changedInstance(location4) | gapComposer5.changedInstance(list8);
                                                        final WireAdapter wireAdapter4 = wireAdapter3222;
                                                        boolean changedInstance14 = changedInstance13 | gapComposer5.changedInstance(wireAdapter4);
                                                        Object rememberedValue23 = gapComposer5.rememberedValue();
                                                        if (changedInstance14 || rememberedValue23 == obj16) {
                                                            obj13 = new Function1() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda30
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj30) {
                                                                    ((Context) obj30).getClass();
                                                                    UiFactory.ViewUi viewUi2 = (UiFactory.ViewUi) UiFactory.ScreenUi.this;
                                                                    View view = viewUi2.view;
                                                                    ScreenLifecycle screenLifecycle4 = screenLifecycle3;
                                                                    DBUtil.set(view, screenLifecycle4);
                                                                    screenLifecycle4.getClass();
                                                                    view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, screenLifecycle4);
                                                                    if (view instanceof DialogResultListener) {
                                                                        StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(view, 7);
                                                                        DialogEventDispatcher dialogEventDispatcher4 = dialogEventDispatcher3;
                                                                        dialogEventDispatcher4.getClass();
                                                                        dialogEventDispatcher4.eventListeners.add(storageLinkQueries$$ExternalSyntheticLambda8);
                                                                    }
                                                                    AbstractComposeView abstractComposeView = view instanceof AbstractComposeView ? (AbstractComposeView) view : null;
                                                                    if (abstractComposeView != null) {
                                                                        abstractComposeView.setViewCompositionStrategy(new MemoryCacheService(screenLifecycle4));
                                                                    }
                                                                    NavigationModel.Ready.Location location5 = location4;
                                                                    UiContainerKt.launchUiBindingIfNeeded(location5.getScope(), viewUi2, location5.getScreen(), list8, wireAdapter4);
                                                                    if (view.isAttachedToWindow()) {
                                                                        view.requestApplyInsets();
                                                                    } else {
                                                                        view.addOnAttachStateChangeListener(new AndroidGraphicsContext.AnonymousClass2(view, 3));
                                                                    }
                                                                    if (!(location5.getScreen() instanceof OnlyOneOverlayTreatment)) {
                                                                        Context context9 = view.getContext();
                                                                        context9.getClass();
                                                                        StableSystemBarsInsetsView stableSystemBarsInsetsView = new StableSystemBarsInsetsView(context9);
                                                                        stableSystemBarsInsetsView.addView(view);
                                                                        return stableSystemBarsInsetsView;
                                                                    }
                                                                    StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda82 = new StorageLinkQueries$$ExternalSyntheticLambda8(parcelableSnapshotMutableIntState, 8);
                                                                    Context context10 = view.getContext();
                                                                    context10.getClass();
                                                                    IntrinsicHeightReportingView intrinsicHeightReportingView = new IntrinsicHeightReportingView(context10, storageLinkQueries$$ExternalSyntheticLambda82);
                                                                    intrinsicHeightReportingView.addView(view);
                                                                    return intrinsicHeightReportingView;
                                                                }
                                                            };
                                                            list7 = list8;
                                                            gapComposer5.updateRememberedValue(obj13);
                                                        } else {
                                                            obj13 = rememberedValue23;
                                                            list7 = list8;
                                                        }
                                                        Function1 function13 = (Function1) obj13;
                                                        LeakDetector leakDetector4 = leakDetector3222;
                                                        boolean changedInstance15 = gapComposer5.changedInstance(leakDetector4);
                                                        Object rememberedValue24 = gapComposer5.rememberedValue();
                                                        Object obj30 = rememberedValue24;
                                                        if (changedInstance15 || rememberedValue24 == obj16) {
                                                            Object storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(leakDetector4, 6);
                                                            gapComposer5.updateRememberedValue(storageLinkQueries$$ExternalSyntheticLambda8);
                                                            obj30 = storageLinkQueries$$ExternalSyntheticLambda8;
                                                        }
                                                        Function1 function14 = (Function1) obj30;
                                                        boolean changed10 = gapComposer5.changed(cashComposeInsets) | gapComposer5.changed(androidWindowInsets) | gapComposer5.changed(androidWindowInsets2) | gapComposer5.changed(density) | gapComposer5.changedInstance(location4) | gapComposer5.changedInstance(screenUi5) | gapComposer5.changedInstance(list7) | gapComposer5.changedInstance(wireAdapter4);
                                                        Object rememberedValue25 = gapComposer5.rememberedValue();
                                                        if (changed10 || rememberedValue25 == obj16) {
                                                            Object uiContainerKt$$ExternalSyntheticLambda32 = new UiContainerKt$$ExternalSyntheticLambda32(cashComposeInsets, androidWindowInsets, androidWindowInsets2, density, location4, screenUi5, list7, wireAdapter4, parcelableSnapshotMutableIntState2);
                                                            gapComposer5.updateRememberedValue(uiContainerKt$$ExternalSyntheticLambda32);
                                                            rememberedValue25 = uiContainerKt$$ExternalSyntheticLambda32;
                                                        }
                                                        AndroidView_androidKt.AndroidView(function13, then, null, function14, (Function1) rememberedValue25, gapComposer5, 0, 4);
                                                        gapComposer5.end(false);
                                                    }
                                                } else {
                                                    gapComposer5.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer4), gapComposer4, 3072);
                                    }
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer3), gapComposer3, 56);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, ((i7 >> 6) & 896) | 48);
            function62 = function63;
            z3 = z4;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            z3 = z2;
            function62 = function6;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(location, animatedVisibilityScope, sharedTransitionScope, saveableStateHolder, z, atomicReference, function1, function12, wireAdapter, leakDetector, atomicReference2, list, lifecycleOwner, z3, function62, i, i2, i3) { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda53
                public final /* synthetic */ NavigationModel.Ready.Location f$1;
                public final /* synthetic */ LeakDetector f$10;
                public final /* synthetic */ AtomicReference f$11;
                public final /* synthetic */ List f$12;
                public final /* synthetic */ LifecycleOwner f$13;
                public final /* synthetic */ boolean f$14;
                public final /* synthetic */ Function6 f$15;
                public final /* synthetic */ int f$17;
                public final /* synthetic */ int f$18;
                public final /* synthetic */ AnimatedVisibilityScope f$2;
                public final /* synthetic */ SharedTransitionScope f$3;
                public final /* synthetic */ SaveableStateHolder f$4;
                public final /* synthetic */ boolean f$5;
                public final /* synthetic */ AtomicReference f$6;
                public final /* synthetic */ Function1 f$7;
                public final /* synthetic */ Function1 f$8;
                public final /* synthetic */ WireAdapter f$9;

                {
                    this.f$17 = i2;
                    this.f$18 = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(this.f$17);
                    UiContainerKt.ScreenContent(Broadway.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, (Composer) obj3, updateChangedFlags, updateChangedFlags2, this.f$18);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Tabs(final ElementBoundsRegistry elementBoundsRegistry, final Function1 function1, Function1 function12, Function1 function13, final NavigationModel.Ready.FullScreenLocation fullScreenLocation, final MainScreensViewModel$TabTreatment mainScreensViewModel$TabTreatment, final ImmutableList immutableList, final boolean z, final boolean z2, final UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig, final SplashScreenAnimationObserver splashScreenAnimationObserver, final float f, final Modifier modifier, SharedTransitionScope sharedTransitionScope, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        NavigationModel.Ready.FullScreenLocation fullScreenLocation2;
        GapComposer gapComposer;
        MainScreensViewModel$TabTreatment mainScreensViewModel$TabTreatment2;
        final SharedTransitionScope sharedTransitionScope2;
        final AnimatedVisibilityScope animatedVisibilityScope2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        RecomposeScopeImpl recomposeScopeImpl;
        final Function1 function14 = function12;
        final Function1 function15 = function13;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1221878453);
        int i6 = i | (gapComposer2.changedInstance(elementBoundsRegistry) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        boolean changedInstance = gapComposer2.changedInstance(fullScreenLocation);
        int i7 = PKIFailureInfo.certRevoked;
        int i8 = i6 | (changedInstance ? 16384 : 8192) | (gapComposer2.changedInstance(mainScreensViewModel$TabTreatment) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(immutableList) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changed(z) ? 8388608 : 4194304) | (gapComposer2.changed(z2) ? 67108864 : 33554432) | (gapComposer2.changed(updatesWindowFlags$TabConfig) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changed(splashScreenAnimationObserver) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(f) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        int i9 = i4;
        int i10 = i3 & PKIFailureInfo.certRevoked;
        if (i10 != 0) {
            i5 = i9 | 3072;
        } else {
            int i11 = i9;
            if ((i2 & 3072) == 0) {
                i11 |= gapComposer2.changed(sharedTransitionScope) ? 2048 : 1024;
            }
            i5 = i11;
        }
        int i12 = i3 & 16384;
        if (i12 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (gapComposer2.changedInstance(animatedVisibilityScope)) {
                i7 = 16384;
            }
            i5 |= i7;
            if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378 || (i5 & 9363) != 9362)) {
                fullScreenLocation2 = fullScreenLocation;
                gapComposer = gapComposer2;
                mainScreensViewModel$TabTreatment2 = mainScreensViewModel$TabTreatment;
                gapComposer.skipToGroupEnd();
                sharedTransitionScope2 = sharedTransitionScope;
                animatedVisibilityScope2 = animatedVisibilityScope;
            } else {
                sharedTransitionScope2 = i10 != 0 ? null : sharedTransitionScope;
                animatedVisibilityScope2 = i12 != 0 ? null : animatedVisibilityScope;
                Insets insets = Insets.NONE;
                if (f <= RecyclerView.DECELERATION_RATE) {
                    function15.invoke(insets);
                    function14.invoke(insets);
                    RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        final int i13 = 0;
                        function2 = new Function2(elementBoundsRegistry, function1, function14, function15, fullScreenLocation, mainScreensViewModel$TabTreatment, immutableList, z, z2, updatesWindowFlags$TabConfig, splashScreenAnimationObserver, f, modifier, sharedTransitionScope2, animatedVisibilityScope2, i, i2, i3, i13) { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda6
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ ElementBoundsRegistry f$0;
                            public final /* synthetic */ Function1 f$1;
                            public final /* synthetic */ SplashScreenAnimationObserver f$10;
                            public final /* synthetic */ float f$11;
                            public final /* synthetic */ Modifier f$12;
                            public final /* synthetic */ SharedTransitionScope f$13;
                            public final /* synthetic */ AnimatedVisibilityScope f$14;
                            public final /* synthetic */ int f$16;
                            public final /* synthetic */ int f$17;
                            public final /* synthetic */ Function1 f$2;
                            public final /* synthetic */ Function1 f$3;
                            public final /* synthetic */ NavigationModel.Ready.FullScreenLocation f$4;
                            public final /* synthetic */ MainScreensViewModel$TabTreatment f$5;
                            public final /* synthetic */ ImmutableList f$6;
                            public final /* synthetic */ boolean f$7;
                            public final /* synthetic */ boolean f$8;
                            public final /* synthetic */ UpdatesWindowFlags$TabConfig f$9;

                            {
                                this.$r8$classId = i13;
                                this.f$16 = i2;
                                this.f$17 = i3;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (this.$r8$classId) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int updateChangedFlags = Updater.updateChangedFlags(3457);
                                        int updateChangedFlags2 = Updater.updateChangedFlags(this.f$16);
                                        UiContainerKt.Tabs(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, (Composer) obj, updateChangedFlags, updateChangedFlags2, this.f$17);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int updateChangedFlags3 = Updater.updateChangedFlags(3457);
                                        int updateChangedFlags4 = Updater.updateChangedFlags(this.f$16);
                                        UiContainerKt.Tabs(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, (Composer) obj, updateChangedFlags3, updateChangedFlags4, this.f$17);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        recomposeScopeImpl = endRestartGroup2;
                        recomposeScopeImpl.block = function2;
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(mainScreensViewModel$TabTreatment, MainScreensViewModel$TabTreatment.Floating.INSTANCE)) {
                    gapComposer2.startReplaceGroup(1699148057);
                    int i14 = i8 >> 3;
                    int i15 = (i8 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | (i14 & 7168) | (57344 & (i8 >> 6)) | ((i8 >> 12) & 458752) | (3670016 & i14) | (i14 & 29360128);
                    int i16 = i5 << 21;
                    int i17 = i5 >> 6;
                    SharedTransitionScope sharedTransitionScope3 = sharedTransitionScope2;
                    AnimatedVisibilityScope animatedVisibilityScope3 = animatedVisibilityScope2;
                    FloatingTabs(elementBoundsRegistry, function1, function12, fullScreenLocation, immutableList, updatesWindowFlags$TabConfig, z, z2, f, modifier, splashScreenAnimationObserver, sharedTransitionScope3, animatedVisibilityScope3, gapComposer2, i15 | (234881024 & i16) | (i16 & 1879048192), (i5 & 14) | (i17 & 112) | (i17 & 896));
                    sharedTransitionScope2 = sharedTransitionScope3;
                    animatedVisibilityScope2 = animatedVisibilityScope3;
                    gapComposer2.end(false);
                    function15 = function13;
                    fullScreenLocation2 = fullScreenLocation;
                    function14 = function12;
                    gapComposer = gapComposer2;
                    mainScreensViewModel$TabTreatment2 = mainScreensViewModel$TabTreatment;
                } else {
                    Function1 function16 = function12;
                    if (Intrinsics.areEqual(mainScreensViewModel$TabTreatment, MainScreensViewModel$TabTreatment.Inline.INSTANCE)) {
                        gapComposer2.startReplaceGroup(1699167555);
                        int i18 = i5 << 18;
                        mainScreensViewModel$TabTreatment2 = mainScreensViewModel$TabTreatment;
                        function15 = function13;
                        ArcadeTabs(elementBoundsRegistry, function1, function15, fullScreenLocation, immutableList, updatesWindowFlags$TabConfig, splashScreenAnimationObserver, f, modifier, gapComposer2, (i8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | MLKEMEngine.KyberPolyBytes | ((i8 >> 3) & 7168) | ((i8 >> 6) & 57344) | ((i8 >> 12) & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024));
                        fullScreenLocation2 = fullScreenLocation;
                        gapComposer = gapComposer2;
                        gapComposer.end(false);
                    } else {
                        fullScreenLocation2 = fullScreenLocation;
                        gapComposer = gapComposer2;
                        mainScreensViewModel$TabTreatment2 = mainScreensViewModel$TabTreatment;
                        function15 = function13;
                        if (Intrinsics.areEqual(mainScreensViewModel$TabTreatment2, MainScreensViewModel$TabTreatment.Hidden.INSTANCE)) {
                            gapComposer.startReplaceGroup(1135000722);
                            gapComposer.end(false);
                            function15.invoke(insets);
                            function16.invoke(insets);
                        } else {
                            if (!Intrinsics.areEqual(mainScreensViewModel$TabTreatment2, MainScreensViewModel$TabTreatment.LiteFab.INSTANCE)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1699147424, false);
                            }
                            gapComposer.startReplaceGroup(1135134890);
                            if (immutableList == null || !immutableList.isEmpty()) {
                                Iterator<E> it = immutableList.iterator();
                                while (it.hasNext()) {
                                    MainScreensViewModel$Tab mainScreensViewModel$Tab = (MainScreensViewModel$Tab) it.next();
                                    if (mainScreensViewModel$Tab.getTooltipTarget() == MainScreensViewModel$Tab.TooltipTarget.Money && ((Boolean) mainScreensViewModel$Tab.getScreenMatcher().invoke(fullScreenLocation2.screen)).booleanValue()) {
                                        gapComposer.startReplaceGroup(1135302569);
                                        int i19 = i5 << 6;
                                        int i20 = ((i8 >> 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | (i19 & 7168) | (i19 & 57344);
                                        Function1 function17 = function16;
                                        FabTab(function1, function17, function15, f, modifier, gapComposer, i20);
                                        function14 = function17;
                                        gapComposer.end(false);
                                        break;
                                    }
                                    function16 = function16;
                                }
                            }
                            function14 = function16;
                            gapComposer.startReplaceGroup(1135561388);
                            gapComposer.end(false);
                            function15.invoke(insets);
                            function14.invoke(insets);
                            gapComposer.end(false);
                        }
                    }
                    function14 = function16;
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                final int i21 = 1;
                final Function1 function18 = function15;
                final NavigationModel.Ready.FullScreenLocation fullScreenLocation3 = fullScreenLocation2;
                final MainScreensViewModel$TabTreatment mainScreensViewModel$TabTreatment3 = mainScreensViewModel$TabTreatment2;
                function2 = new Function2(elementBoundsRegistry, function1, function14, function18, fullScreenLocation3, mainScreensViewModel$TabTreatment3, immutableList, z, z2, updatesWindowFlags$TabConfig, splashScreenAnimationObserver, f, modifier, sharedTransitionScope2, animatedVisibilityScope2, i, i2, i3, i21) { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda6
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ ElementBoundsRegistry f$0;
                    public final /* synthetic */ Function1 f$1;
                    public final /* synthetic */ SplashScreenAnimationObserver f$10;
                    public final /* synthetic */ float f$11;
                    public final /* synthetic */ Modifier f$12;
                    public final /* synthetic */ SharedTransitionScope f$13;
                    public final /* synthetic */ AnimatedVisibilityScope f$14;
                    public final /* synthetic */ int f$16;
                    public final /* synthetic */ int f$17;
                    public final /* synthetic */ Function1 f$2;
                    public final /* synthetic */ Function1 f$3;
                    public final /* synthetic */ NavigationModel.Ready.FullScreenLocation f$4;
                    public final /* synthetic */ MainScreensViewModel$TabTreatment f$5;
                    public final /* synthetic */ ImmutableList f$6;
                    public final /* synthetic */ boolean f$7;
                    public final /* synthetic */ boolean f$8;
                    public final /* synthetic */ UpdatesWindowFlags$TabConfig f$9;

                    {
                        this.$r8$classId = i21;
                        this.f$16 = i2;
                        this.f$17 = i3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.$r8$classId) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int updateChangedFlags = Updater.updateChangedFlags(3457);
                                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$16);
                                UiContainerKt.Tabs(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, (Composer) obj, updateChangedFlags, updateChangedFlags2, this.f$17);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int updateChangedFlags3 = Updater.updateChangedFlags(3457);
                                int updateChangedFlags4 = Updater.updateChangedFlags(this.f$16);
                                UiContainerKt.Tabs(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, (Composer) obj, updateChangedFlags3, updateChangedFlags4, this.f$17);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                recomposeScopeImpl = endRestartGroup;
                recomposeScopeImpl.block = function2;
                return;
            }
            return;
        }
        if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378 || (i5 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TooltipAppMessage(ElementBoundsRegistry elementBoundsRegistry, RealTooltipTargetLoadedCallbackRegistry realTooltipTargetLoadedCallbackRegistry, Function1 function1, TooltipAppMessageViewModel tooltipAppMessageViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-380925015);
        int i2 = (gapComposer.changedInstance(elementBoundsRegistry) ? 4 : 2) | i | (gapComposer.changedInstance(realTooltipTargetLoadedCallbackRegistry) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(tooltipAppMessageViewModel) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean changedInstance = gapComposer.changedInstance(elementBoundsRegistry) | gapComposer.changedInstance(realTooltipTargetLoadedCallbackRegistry) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MoleculeKt$$ExternalSyntheticLambda1(6, elementBoundsRegistry, realTooltipTargetLoadedCallbackRegistry, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean changedInstance2 = gapComposer.changedInstance(tooltipAppMessageViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new StorageLinkQueries$$ExternalSyntheticLambda8(tooltipAppMessageViewModel, 10);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function12, null, (Function1) rememberedValue2, gapComposer, 0, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScreenshotViewKt$$ExternalSyntheticLambda0(elementBoundsRegistry, realTooltipTargetLoadedCallbackRegistry, function1, tooltipAppMessageViewModel, i);
        }
    }

    public static final HeartBeatInfoStorage$$ExternalSyntheticLambda0 access$asTransitionSpec(Broadway broadway, ImmutableList immutableList, Composer composer) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer);
        }
        ref$ObjectRef.element = (MutableFloatState) rememberedValue;
        return new HeartBeatInfoStorage$$ExternalSyntheticLambda0(broadway, (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity), ref$ObjectRef, immutableList, 3);
    }

    public static final void launchUiBindingIfNeeded(CoroutineScope coroutineScope, UiFactory.ViewUi viewUi, Screen screen, List list, WireAdapter wireAdapter) {
        StandaloneCoroutine launch$default;
        boolean isCancelled = JobKt.getJob(coroutineScope.getCoroutineContext()).isCancelled();
        View view = viewUi.view;
        Job job = (Job) view.getTag(R.id.core_container_screen_job_tag);
        boolean z = (job == null || job.isCancelled()) ? false : true;
        if (job == null || !(isCancelled || z)) {
            if (job != null) {
                job.cancel(null);
            }
            Ui ui = viewUi.ui;
            PresenterElement presenterElement = (PresenterElement) coroutineScope.getCoroutineContext().get(PresenterElement.Key);
            boolean z2 = ui instanceof PresenterlessUi;
            if (z2 && presenterElement != null) {
                a$$ExternalSyntheticBUOutline0.m$1("Presenter provided, but view is presenterless");
                return;
            }
            if (z2) {
                launch$default = JobKt.launch$default(coroutineScope, null, null, new SessionWorkerKt$runSession$snapshotMonitor$1(4), 3);
            } else {
                if (ui == null && presenterElement != null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Presenter provided, but view does not implement Ui");
                    return;
                }
                if (ui == null || presenterElement == null) {
                    wireAdapter.getClass();
                    screen.getClass();
                    view.getClass();
                    ((ErrorReporter) wireAdapter.adapter).report(new MissingPresenter(screen, view), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    launch$default = JobKt.launch$default(coroutineScope, null, null, new SessionWorkerKt$runSession$snapshotMonitor$1(5), 3);
                } else {
                    launch$default = JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new Recomposer$recompositionRunner$2(ui, presenterElement, list, screen, (Continuation) null), 1);
                }
            }
            view.setTag(R.id.core_container_screen_job_tag, launch$default);
        }
    }

    public static final Insets scaleInsets(Insets insets, float f) {
        float coerceIn = RangesKt___RangesKt.coerceIn(f, RecyclerView.DECELERATION_RATE, 1.0f);
        return Insets.of(Math.round(insets.left * coerceIn), Math.round(insets.top * coerceIn), Math.round(insets.right * coerceIn), Math.round(insets.bottom * coerceIn));
    }

    public static final Modifier toolbarActionModifier(Modifier modifier, ToolbarConfig.Action action, ElementBoundsRegistry elementBoundsRegistry, GapComposer gapComposer) {
        Modifier tabToolbarIconTonalBackground;
        ElementBoundsRegistry.Element element = action.getElement();
        int ordinal = action.getBackground().ordinal();
        if (ordinal == 0) {
            gapComposer.startReplaceGroup(1154898604);
            tabToolbarIconTonalBackground = TabToolbarsKt.tabToolbarIconTonalBackground(gapComposer);
            gapComposer.end(false);
        } else {
            if (ordinal != 1) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1154896092, false);
            }
            gapComposer.startReplaceGroup(1154901077);
            gapComposer.end(false);
            tabToolbarIconTonalBackground = Modifier.Companion.$$INSTANCE;
        }
        return (element == null || elementBoundsRegistry == null) ? modifier.then(tabToolbarIconTonalBackground) : modifier.then(tabToolbarIconTonalBackground).then(WalletJsonParser.provideBounds(elementBoundsRegistry, element));
    }

    public static final Parcelable validate(Parcelable parcelable, boolean z) {
        if (!z) {
            return parcelable;
        }
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        Parcel obtain2 = Parcel.obtain();
        obtain2.getClass();
        obtain2.unmarshall(marshall, 0, marshall.length);
        obtain2.setDataPosition(0);
        Parcelable readParcelable = obtain2.readParcelable(UiContainer.class.getClassLoader());
        readParcelable.getClass();
        if (readParcelable instanceof Bundle) {
            ((Bundle) readParcelable).setClassLoader(UiContainer.class.getClassLoader());
        }
        obtain2.recycle();
        return readParcelable;
    }
}
