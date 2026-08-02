package androidx.room;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.contentcapture.ContentCaptureSession;
import androidx.camera.video.Recorder;
import androidx.collection.MutableScatterSet;
import androidx.compose.animation.EnterExitState;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusInvalidationManager;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TailModifierNode;
import androidx.core.view.WindowCompat$Api30Impl;
import androidx.core.view.WindowInsetsControllerCompat;
import app.cash.broadway.ui.UpdatesWindowFlags$Orientation;
import app.cash.broadway.ui.compose.ChromeConfigAggregator;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.broadway.ui.compose.FullScreenNode;
import app.cash.broadway.ui.compose.OrientationNode;
import app.cash.broadway.ui.compose.SecureScreenNode;
import app.cash.cdp.api.providers.OperatingSystemInfo;
import app.cash.cdp.backend.android.AndroidDeviceInfoProvider;
import app.cash.cdp.backend.android.AndroidOperatingSystemInfoProvider;
import app.cash.cdp.backend.android.CashApplicationInfoProvider;
import app.cash.molecule.PlatformKt;
import coil3.memory.MemoryCacheService;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.core.navigationcontainer.models.ContainerUiModel;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.featureflags.AmplitudeExperiments$DbSessionManagerDoubleWrite;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnforceSecurityScreens;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.session.backend.DoubleWriteExperimentForwarder;
import com.squareup.cash.session.backend.DoubleWriteExperimentSetupTeardown;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.ui.MainActivityDelegate;
import com.squareup.cash.ui.MainContainerDelegate;
import com.squareup.cash.ui.SandboxedActivityContext;
import com.squareup.cash.ui.WindowFlags;
import com.squareup.preferences.EnumPreference;
import com.squareup.preferences.StringPreference;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.DerivedStateFlow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.jvm.internal.ReflectKCallable;
import kotlin.reflect.jvm.internal.ReflectKParameter;
import kotlin.reflect.jvm.internal.UtilKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class RoomDatabase$closeBarrier$1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomDatabase$closeBarrier$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.getMergedConfig().enforceTransparentSystemNavigationBar, r10) == false) goto L94;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean m608requestFocus3ESFkO8;
        NodeChain nodeChain;
        UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation;
        int i;
        switch (this.$r8$classId) {
            case 0:
                RoomDatabase.access$onClosed((RoomDatabase) this.receiver);
                return Unit.INSTANCE;
            case 1:
                m608requestFocus3ESFkO8 = ((FocusableNode) this.receiver).focusTargetNode.m608requestFocus3ESFkO8(7);
                return Boolean.valueOf(m608requestFocus3ESFkO8);
            case 2:
                FocusInvalidationManager focusInvalidationManager = (FocusInvalidationManager) this.receiver;
                MutableScatterSet mutableScatterSet = focusInvalidationManager.focusTargetNodes;
                MutableScatterSet mutableScatterSet2 = focusInvalidationManager.focusEventNodes;
                FocusOwnerImpl focusOwnerImpl = focusInvalidationManager.focusOwner;
                FocusTargetNode activeFocusTargetNode = focusOwnerImpl.getActiveFocusTargetNode();
                if (activeFocusTargetNode == null) {
                    Object[] objArr = mutableScatterSet2.elements;
                    long[] jArr = mutableScatterSet2.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((j & 255) < 128) {
                                        ((FocusEventModifierNode) objArr[(i2 << 3) + i4]).onFocusEvent(FocusStateImpl.Inactive);
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                } else if (activeFocusTargetNode.isAttached()) {
                    if (mutableScatterSet.contains(activeFocusTargetNode)) {
                        activeFocusTargetNode.invalidateFocus$ui();
                    }
                    FocusStateImpl focusState$1 = activeFocusTargetNode.getFocusState$1();
                    if (!activeFocusTargetNode.getNode().isAttached()) {
                        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                    }
                    Modifier.Node node = activeFocusTargetNode.getNode();
                    LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(activeFocusTargetNode);
                    int i5 = 0;
                    while (requireLayoutNode != null) {
                        if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 5120) != 0) {
                            while (node != null) {
                                if ((node.getKindSet$ui() & 5120) != 0) {
                                    if ((node.getKindSet$ui() & 1024) != 0) {
                                        i5++;
                                    }
                                    if ((node instanceof FocusEventModifierNode) && mutableScatterSet2.contains(node)) {
                                        if (i5 <= 1) {
                                            ((FocusEventModifierNode) node).onFocusEvent(focusState$1);
                                        } else {
                                            ((FocusEventModifierNode) node).onFocusEvent(FocusStateImpl.ActiveParent);
                                        }
                                        mutableScatterSet2.remove(node);
                                    }
                                }
                                node = node.getParent$ui();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui();
                        node = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
                    }
                    Object[] objArr2 = mutableScatterSet2.elements;
                    long[] jArr2 = mutableScatterSet2.metadata;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        ((FocusEventModifierNode) objArr2[(i6 << 3) + i8]).onFocusEvent(FocusStateImpl.Inactive);
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 != 8) {
                                }
                            }
                            if (i6 != length2) {
                                i6++;
                            }
                        }
                    }
                }
                if (focusOwnerImpl.getActiveFocusTargetNode() == null || focusOwnerImpl.rootFocusNode.getFocusState$1() == FocusStateImpl.Inactive) {
                    focusOwnerImpl.clearOwnerFocus();
                }
                mutableScatterSet.clear();
                mutableScatterSet2.clear();
                focusInvalidationManager.isInvalidationScheduled = false;
                return Unit.INSTANCE;
            case 3:
                View view = (View) this.receiver;
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowCompat$Api30Impl.setImportantForContentCapture(view);
                }
                ContentCaptureSession contentCaptureSession = view.getContentCaptureSession();
                if (contentCaptureSession == null) {
                    return null;
                }
                return Recorder.AnonymousClass4.toContentCaptureSessionCompat(contentCaptureSession, view);
            case 4:
                return PlatformKt.appTokenOrNull((SessionManager) this.receiver);
            case 5:
                DoubleWriteExperimentSetupTeardown doubleWriteExperimentSetupTeardown = (DoubleWriteExperimentSetupTeardown) ((DoubleWriteExperimentForwarder) this.receiver).currentReader.get();
                return Boolean.valueOf(doubleWriteExperimentSetupTeardown != null ? ((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) doubleWriteExperimentSetupTeardown.featureFlagManager).currentValue(AmplitudeExperiments$DbSessionManagerDoubleWrite.INSTANCE)).enabled() : false);
            case 6:
                ((MainActivity) ((MainActivityDelegate) this.receiver)).finishAfterTransition();
                return Unit.INSTANCE;
            case 7:
                final MainActivity mainActivity = (MainActivity) ((MainActivityDelegate) this.receiver);
                SandboxedActivityContext sandboxedActivityContext = (SandboxedActivityContext) mainActivity.getSandboxedActivityContextFlow().getValue();
                WindowFlags windowFlags = mainActivity.windowFlags;
                windowFlags.isSecure = false;
                windowFlags.isLandscape = false;
                windowFlags.isLightStatusBar = false;
                windowFlags.isLightNavigationBar = false;
                windowFlags.enforceTransparentNavigationBar = false;
                windowFlags.isFullScreen = false;
                MainContainerDelegate mainContainerDelegate = mainActivity.mainContainerDelegate;
                if (mainContainerDelegate == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
                    throw null;
                }
                UiContainer uiContainer = mainContainerDelegate.container;
                if (uiContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("container");
                    throw null;
                }
                ChromeConfigAggregator chromeConfigAggregator = uiContainer.overlayConfigAggregator;
                boolean z = uiContainer.darkMode;
                ChromeConfigAggregator chromeConfigAggregator2 = uiContainer.fullScreenConfigAggregator;
                ChromeSystemIconColor chromeSystemIconColor = chromeConfigAggregator2.getMergedConfig().statusBarIconColor;
                int i9 = chromeSystemIconColor == null ? -1 : UiContainer.WhenMappings.$EnumSwitchMapping$1[chromeSystemIconColor.ordinal()];
                if (i9 != -1) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            windowFlags.isLightStatusBar = true;
                        } else {
                            if (i9 != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            if (!z) {
                                windowFlags.isLightStatusBar = true;
                            }
                        }
                    }
                } else if (!z) {
                    windowFlags.isLightStatusBar = true;
                }
                ChromeSystemIconColor chromeSystemIconColor2 = chromeConfigAggregator2.getMergedConfig().navigationBarIconColor;
                int i10 = chromeSystemIconColor2 == null ? -1 : UiContainer.WhenMappings.$EnumSwitchMapping$1[chromeSystemIconColor2.ordinal()];
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            windowFlags.isLightNavigationBar = true;
                        } else {
                            if (i10 != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            if (!z) {
                                windowFlags.isLightNavigationBar = true;
                            }
                        }
                    }
                } else if (!z) {
                    windowFlags.isLightNavigationBar = true;
                }
                if (!Intrinsics.areEqual(chromeConfigAggregator.getMergedConfig().enforceTransparentSystemNavigationBar, Boolean.FALSE)) {
                    if (!UiContainer.getTransparentNavBar((ContainerUiModel) uiContainer.containerModel$delegate.getValue())) {
                        Boolean bool = chromeConfigAggregator2.getMergedConfig().enforceTransparentSystemNavigationBar;
                        Boolean bool2 = Boolean.TRUE;
                        if (!Intrinsics.areEqual(bool, bool2)) {
                            break;
                        }
                    }
                    windowFlags.enforceTransparentNavigationBar = true;
                }
                ArrayList arrayList = uiContainer.secureScreenAggregator.nodes;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((SecureScreenNode) it.next()).isEnabled()) {
                                windowFlags.isSecure = true;
                            }
                        }
                    }
                }
                ArrayList arrayList2 = uiContainer.orientationAggregator.nodes;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((OrientationNode) next).getTargetVisibilityState() == EnterExitState.Visible) {
                        arrayList3.add(next);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    ((OrientationNode) it3.next()).getClass();
                    updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
                    UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation2 = UpdatesWindowFlags$Orientation.Landscape;
                } else {
                    updatesWindowFlags$Orientation = null;
                }
                if (updatesWindowFlags$Orientation == null) {
                    updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.None;
                }
                int ordinal = updatesWindowFlags$Orientation.ordinal();
                if (ordinal == 0) {
                    windowFlags.isLandscape = true;
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ArrayList arrayList4 = uiContainer.fullScreenAggregator.nodes;
                if (arrayList4 == null || !arrayList4.isEmpty()) {
                    Iterator it4 = arrayList4.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((FullScreenNode) it4.next()).getTargetVisibilityState() == EnterExitState.Visible) {
                                windowFlags.isFullScreen = true;
                            }
                        }
                    }
                }
                if (mainActivity.viewContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewContainer");
                    throw null;
                }
                boolean z2 = windowFlags.isLightStatusBar;
                boolean z3 = windowFlags.isLightNavigationBar;
                mainActivity.getClass();
                View decorView = mainActivity.getWindow().getDecorView();
                decorView.getClass();
                Window window = mainActivity.getWindow();
                MemoryCacheService memoryCacheService = new MemoryCacheService(decorView);
                int i11 = Build.VERSION.SDK_INT;
                Strings impl35 = i11 >= 35 ? new WindowInsetsControllerCompat.Impl35(window, memoryCacheService) : i11 >= 30 ? new WindowInsetsControllerCompat.Impl30(window, memoryCacheService) : new WindowInsetsControllerCompat.Impl26(window, memoryCacheService);
                impl35.setAppearanceLightNavigationBars(z3);
                impl35.setAppearanceLightStatusBars(z2);
                mainActivity.getWindow().setNavigationBarContrastEnforced(!windowFlags.enforceTransparentNavigationBar);
                if (windowFlags.isSecure) {
                    if (Intrinsics.areEqual(((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) sandboxedActivityContext.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$EnforceSecurityScreens.INSTANCE)).value, "ENFORCE") && !sandboxedActivityContext.disableSecureScreens) {
                        r6 = true;
                    }
                }
                mainActivity.getWindow().getDecorView().post(new Runnable() { // from class: com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = MainActivity.$r8$clinit;
                        MainActivity mainActivity2 = MainActivity.this;
                        if (mainActivity2.viewContainer == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewContainer");
                            throw null;
                        }
                        mainActivity2.getClass();
                        mainActivity2.getClass();
                        Window window2 = mainActivity2.getWindow();
                        if (r2) {
                            window2.addFlags(PKIFailureInfo.certRevoked);
                        } else {
                            window2.clearFlags(PKIFailureInfo.certRevoked);
                        }
                    }
                });
                if (!mainActivity.restoringState) {
                    mainActivity.setRequestedOrientation(!windowFlags.isLandscape ? 1 : 0);
                }
                Window window2 = mainActivity.getWindow();
                MemoryCacheService memoryCacheService2 = new MemoryCacheService(mainActivity.getWindow().getDecorView());
                int i12 = Build.VERSION.SDK_INT;
                Strings impl352 = i12 >= 35 ? new WindowInsetsControllerCompat.Impl35(window2, memoryCacheService2) : i12 >= 30 ? new WindowInsetsControllerCompat.Impl30(window2, memoryCacheService2) : new WindowInsetsControllerCompat.Impl26(window2, memoryCacheService2);
                if (windowFlags.isFullScreen) {
                    impl352.hide(1);
                } else {
                    impl352.show(1);
                }
                return Unit.INSTANCE;
            case 8:
                MainContainerDelegate mainContainerDelegate2 = ((MainActivity) ((MainActivityDelegate) this.receiver)).mainContainerDelegate;
                if (mainContainerDelegate2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
                    throw null;
                }
                Object value = ((DerivedStateFlow) mainContainerDelegate2.cashNavigator.navigator.remainingMessages).getValue();
                value.getClass();
                return ((NavigationModel.Ready) value).fullScreen.screen;
            case 9:
                return ((AndroidDeviceInfoProvider) this.receiver).getDeviceInfo();
            case 10:
                ((AndroidOperatingSystemInfoProvider) this.receiver).getClass();
                OperatingSystemInfo.Name name = OperatingSystemInfo.Name.ANDROID;
                Build.VERSION.RELEASE.getClass();
                return new OperatingSystemInfo();
            case 11:
                return ((CashApplicationInfoProvider) this.receiver).getApplicationInfo();
            case 12:
                return ((EnumPreference) this.receiver).get();
            case 13:
                StringPreference stringPreference = (StringPreference) this.receiver;
                return stringPreference.preferences.getString(stringPreference.key, null);
            default:
                ReflectKCallable reflectKCallable = (ReflectKCallable) this.receiver;
                reflectKCallable.getClass();
                List parameters = reflectKCallable.getParameters();
                int size = (reflectKCallable.isSuspend() ? 1 : 0) + parameters.size();
                List<ReflectKParameter> list = parameters;
                if ((list instanceof Collection) && list.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (ReflectKParameter reflectKParameter : list) {
                        if (reflectKParameter.getKind() == KParameter$Kind.VALUE || reflectKParameter.getKind() == KParameter$Kind.CONTEXT) {
                            i++;
                            if (i < 0) {
                                CollectionsKt__CollectionsKt.throwCountOverflow();
                                throw null;
                            }
                        }
                    }
                }
                int i13 = (i + 31) / 32;
                Object[] objArr3 = new Object[size + i13 + 1];
                for (ReflectKParameter reflectKParameter2 : list) {
                    if (reflectKParameter2.isOptional() && !UtilKt.isInlineClassType(reflectKParameter2.getType())) {
                        objArr3[reflectKParameter2.getIndex()] = UtilKt.defaultPrimitiveValue(ReflectJvmMapping.getJavaType(reflectKParameter2.getType()));
                    } else if (reflectKParameter2.isVararg()) {
                        objArr3[reflectKParameter2.getIndex()] = Room.defaultEmptyArray(reflectKParameter2.getType());
                    }
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    objArr3[size + i14] = 0;
                }
                return objArr3;
        }
    }
}
