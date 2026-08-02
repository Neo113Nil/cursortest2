package coil3.disk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Trace;
import android.util.Log;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl;
import androidx.camera.camera2.impl.FlashControl;
import androidx.camera.camera2.impl.UseCaseCameraImpl;
import androidx.camera.camera2.impl.UseCaseCameraImpl$start$1$3;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.impl.UseCaseSurfaceManager;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.compat.CaptureSessionState;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.collection.MutableScatterSet;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.platform.AndroidAccessibilityManager;
import androidx.media3.ui.compose.state.PresentationState;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.paging.MulticastedPagingData;
import app.cash.badging.backend.RealBadger2;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.LocalAddBrandsPresenter;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter$models$2$1$1$WhenMappings;
import app.cash.local.presenters.pos.LocalPosBrandOnboardingPresenter;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.screens.app.LocalFulfillmentPickerScreen;
import app.cash.local.screens.app.LocalSchedulingDayTimePickerScreen;
import app.cash.local.views.instore.TableQrCodeCameraViewFinderState;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.redwood.treehouse.OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService;
import app.cash.redwood.treehouse.ViewContentCodeBinding;
import app.cash.sqldelight.db.QueryResult;
import app.cash.zipline.ZiplineScope;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import coil3.request.ViewTargetRequestDelegate;
import coil3.request.ViewTargetRequestManager;
import coil3.size.DimensionKt;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.internal.zznv;
import com.google.maps.android.compose.clustering.ComposeUiClusterRenderer;
import com.google.mlkit.vision.face.internal.zzm;
import com.mikepenz.markdown.model.MarkdownStateImpl;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.cash.RealBugReportSender;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.cdf.localclient.FulfillmentInstanceType;
import com.squareup.cash.cdf.localclient.FulfillmentVersion;
import com.squareup.cash.cdf.localclient.LocalClientFulfillmentFlowViewFulfillment;
import com.squareup.cash.cdf.localclient.LocalClientFulfillmentFlowViewScheduling;
import com.squareup.cash.cdf.localclient.LocalClientPOSOnboardingSheetView;
import com.squareup.cash.cdf.localclient.LocalClientTabViewBrandBrowser;
import com.squareup.cash.cdf.personalprofile.PersonalProfileSignOutConfirm;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.MainActivity$navigatorSwitcher$1;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import okio.BlackholeSink;
import okio.RealBufferedSink;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;
import timber.log.Timber;
import utils.StringUtilsKt;
import xyz.block.genie.state.StateBindingsKt;

/* loaded from: classes3.dex */
public final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiskLruCache$launchCleanup$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    private final Object invokeSuspend$app$cash$molecule$MoleculeKt$launchMolecule$3$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        boolean z = false;
        ((Ref$BooleanRef) this.this$0).element = false;
        synchronized (SnapshotKt.lock) {
            MutableScatterSet mutableScatterSet = SnapshotKt.globalSnapshot.modified;
            if (mutableScatterSet != null) {
                if (mutableScatterSet.isNotEmpty()) {
                    z = true;
                }
            }
        }
        if (z) {
            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new DiskLruCache$launchCleanup$1((DiskLruCache) obj2, continuation, 0);
            case 1:
                return new DiskLruCache$launchCleanup$1((SessionConfig) obj2, continuation, 1);
            case 2:
                return new DiskLruCache$launchCleanup$1(continuation, (DeferredUseCaseCameraRequestControl) obj2, 2);
            case 3:
                return new DiskLruCache$launchCleanup$1((FlashControl) obj2, continuation, 3);
            case 4:
                return new DiskLruCache$launchCleanup$1(continuation, (UseCaseCameraImpl) obj2, 4);
            case 5:
                return new DiskLruCache$launchCleanup$1((CaptureSessionState) obj2, continuation, 5);
            case 6:
                return new DiskLruCache$launchCleanup$1((Ref$ObjectRef) obj2, continuation, 6);
            case 7:
                return new DiskLruCache$launchCleanup$1((zzm) obj2, continuation, 7);
            case 8:
                return new DiskLruCache$launchCleanup$1((PlatformSelectionBehaviorsImpl) obj2, continuation, 8);
            case 9:
                return new DiskLruCache$launchCleanup$1((AndroidAccessibilityManager) obj2, continuation, 9);
            case 10:
                return new DiskLruCache$launchCleanup$1((TooltipStateImpl) obj2, continuation, 10);
            case 11:
                return new DiskLruCache$launchCleanup$1((PresentationState) obj2, continuation, 11);
            case 12:
                return new DiskLruCache$launchCleanup$1((MulticastedPagingData) obj2, continuation, 12);
            case 13:
                return new DiskLruCache$launchCleanup$1((Callable) obj2, continuation, 13);
            case 14:
                return new DiskLruCache$launchCleanup$1((RealBadger2) obj2, continuation, 14);
            case 15:
                return new DiskLruCache$launchCleanup$1((LocalAddBrandsPresenter) obj2, continuation, 15);
            case 16:
                return new DiskLruCache$launchCleanup$1((FulfillmentPickerPresenter) obj2, continuation, 16);
            case 17:
                return new DiskLruCache$launchCleanup$1((CardStudioPresenter) obj2, continuation, 17);
            case 18:
                return new DiskLruCache$launchCleanup$1((LocalPosBrandOnboardingPresenter) obj2, continuation, 18);
            case 19:
                return new DiskLruCache$launchCleanup$1((TableQrCodeCameraViewFinderState) obj2, continuation, 19);
            case 20:
                return new DiskLruCache$launchCleanup$1((Ref$BooleanRef) obj2, continuation, 20);
            case 21:
                return new DiskLruCache$launchCleanup$1((EndAppLockPresenter) obj2, continuation, 21);
            case 22:
                return new DiskLruCache$launchCleanup$1((OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService) obj2, continuation, 22);
            case 23:
                return new DiskLruCache$launchCleanup$1((ViewContentCodeBinding) obj2, continuation, 23);
            case 24:
                return new DiskLruCache$launchCleanup$1((ViewTargetRequestManager) obj2, continuation, 24);
            case 25:
                return new DiskLruCache$launchCleanup$1((ComposeUiClusterRenderer.InvalidatingComposeView) obj2, continuation, 25);
            case 26:
                return new DiskLruCache$launchCleanup$1((MarkdownStateImpl) obj2, continuation, 26);
            case 27:
                return new DiskLruCache$launchCleanup$1((PlacesAddressSearcher) obj2, continuation, 27);
            default:
                return new DiskLruCache$launchCleanup$1((RealBugReportSender) obj2, continuation, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((DiskLruCache$launchCleanup$1) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((DiskLruCache$launchCleanup$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((DiskLruCache$launchCleanup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((DiskLruCache$launchCleanup$1) create((File) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SessionConfig.ErrorListener errorListener;
        CompletableDeferredImpl completableDeferredImpl;
        Object obj2;
        String str;
        FulfillmentInstanceType fulfillmentInstanceType;
        int i = 1;
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                DiskLruCache diskLruCache = (DiskLruCache) this.this$0;
                synchronized (diskLruCache.lock) {
                    if (!diskLruCache.initialized || diskLruCache.closed) {
                        return Unit.INSTANCE;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        if ((diskLruCache.operationsSinceRewrite >= 2000 ? 1 : 0) != 0) {
                            diskLruCache.writeJournal();
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = new RealBufferedSink(new BlackholeSink());
                    }
                    return Unit.INSTANCE;
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SessionConfig sessionConfig = (SessionConfig) this.this$0;
                if (sessionConfig != null && (errorListener = sessionConfig.mErrorListener) != null) {
                    errorListener.onError(sessionConfig);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = ((DeferredUseCaseCameraRequestControl) this.this$0).impl;
                if (useCaseCameraRequestControlImpl != null) {
                    useCaseCameraRequestControlImpl.close();
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ImageCapture.ScreenFlash screenFlash = ((FlashControl) this.this$0)._screenFlash;
                if (screenFlash != null) {
                    screenFlash.clear();
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "screenFlashPostCapture: ScreenFlash.clear() invoked");
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((UseCaseCameraImpl) this.this$0).closed.getValue()) {
                    CameraGraphImpl graph = ((UseCaseCameraImpl) this.this$0).useCaseGraphContext.getGraph();
                    UseCaseGraphContext useCaseGraphContext = ((UseCaseCameraImpl) this.this$0).useCaseGraphContext;
                    GraphStateToCameraStateAdapter graphStateToCameraStateAdapter = useCaseGraphContext.graphStateToCameraStateAdapter;
                    CameraGraphImpl graph2 = useCaseGraphContext.getGraph();
                    graph2.getClass();
                    graphStateToCameraStateAdapter.cameraGraph = graph2;
                    CameraStateAdapter cameraStateAdapter = useCaseGraphContext.cameraStateAdapter;
                    CameraGraphImpl graph3 = useCaseGraphContext.getGraph();
                    graph3.getClass();
                    synchronized (cameraStateAdapter.lock) {
                        try {
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "Camera graph updated from " + cameraStateAdapter.currentGraph + " to " + graph3);
                            }
                            CameraInternal.State state = cameraStateAdapter.currentCameraInternalState;
                            CameraInternal.State state2 = CameraInternal.State.CLOSED;
                            if (state != state2) {
                                cameraStateAdapter.postCameraState(CameraInternal.State.CLOSING, null);
                                cameraStateAdapter.postCameraState(state2, null);
                            }
                            cameraStateAdapter.currentGraph = graph3;
                            cameraStateAdapter.currentCameraInternalState = state2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (graph.closed.getValue()) {
                        Handlers$$ExternalSyntheticBUOutline0.m("Cannot start ", graph, " after calling close()");
                        return null;
                    }
                    Trace.beginSection(graph + "#start");
                    StringBuilder sb = new StringBuilder("Starting ");
                    sb.append(graph);
                    Log.i("CXCP", sb.toString());
                    GraphProcessorImpl graphProcessorImpl = graph.graphListener;
                    graphProcessorImpl.getClass();
                    Log.d("CXCP", graphProcessorImpl + " onGraphStarting");
                    graphProcessorImpl._graphState.setValue(GraphState.GraphStateStarted.INSTANCE$1);
                    for (GraphStateToCameraStateAdapter graphStateToCameraStateAdapter2 : graphProcessorImpl.externalStateGraphListeners) {
                        graphStateToCameraStateAdapter2.cameraStateAdapter.onGraphStateUpdated(graphStateToCameraStateAdapter2.getCameraGraph(), GraphState.GraphStateStarted.INSTANCE$1);
                    }
                    Camera2CameraController camera2CameraController = graph.cameraController;
                    synchronized (camera2CameraController.lock) {
                        camera2CameraController.startLocked();
                    }
                    Trace.endSection();
                    Map map = (Map) ((UseCaseCameraImpl) this.this$0).useCaseGraphContext.surfaceToStreamMap$delegate.getValue();
                    UseCaseCameraImpl useCaseCameraImpl = (UseCaseCameraImpl) this.this$0;
                    SessionConfigAdapter sessionConfigAdapter = (SessionConfigAdapter) useCaseCameraImpl.sessionConfigAdapter$delegate.getValue();
                    SessionConfig sessionConfig2 = ((SessionConfig.ValidatingBuilder) sessionConfigAdapter.validatingBuilder$delegate.getValue()).isValid() ? (SessionConfig) sessionConfigAdapter.sessionConfig$delegate.getValue() : null;
                    if (sessionConfig2 != null) {
                        List unmodifiableList = Collections.unmodifiableList(sessionConfig2.mRepeatingCaptureConfig.mSurfaces);
                        unmodifiableList.getClass();
                        List surfaces = sessionConfig2.getSurfaces();
                        surfaces.getClass();
                        Iterator it = surfaces.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (!unmodifiableList.contains((DeferrableSurface) obj2)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        DeferrableSurface deferrableSurface = (DeferrableSurface) obj2;
                        if (deferrableSurface != null) {
                        }
                    }
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "Setting up Surfaces with UseCaseSurfaceManager");
                    }
                    if (((SessionConfig.ValidatingBuilder) ((SessionConfigAdapter) ((UseCaseCameraImpl) this.this$0).sessionConfigAdapter$delegate.getValue()).validatingBuilder$delegate.getValue()).isValid()) {
                        UseCaseSurfaceManager useCaseSurfaceManager = (UseCaseSurfaceManager) ((UseCaseCameraImpl) this.this$0).useCaseSurfaceManager$delegate.getValue();
                        useCaseSurfaceManager.getClass();
                        SessionConfigAdapter sessionConfigAdapter2 = (SessionConfigAdapter) ((UseCaseCameraImpl) this.this$0).sessionConfigAdapter$delegate.getValue();
                        sessionConfigAdapter2.getClass();
                        map.getClass();
                        synchronized (useCaseSurfaceManager.lock) {
                            try {
                                if (useCaseSurfaceManager.setupDeferred != null) {
                                    throw new IllegalStateException("Surfaces should only be set up once!");
                                }
                                if (useCaseSurfaceManager.stopDeferred != null) {
                                    throw new IllegalStateException("Surfaces being setup after stopped!");
                                }
                                if (useCaseSurfaceManager.configuredSurfaceMap != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                Object value = sessionConfigAdapter2.deferrableSurfaces$delegate.getValue();
                                value.getClass();
                                List list = (List) value;
                                try {
                                    StateBindingsKt.incrementAll(list);
                                    DeferredCoroutine async$default = JobKt.async$default(useCaseSurfaceManager.threads.scope, null, null, new NetworkFetcher$doFetch$fetchResult$1(sessionConfigAdapter2, useCaseSurfaceManager, list, map, graph, (Continuation) null, 1), 3);
                                    async$default.invokeOnCompletion(new OpenSourceKt$$ExternalSyntheticLambda6(list, i));
                                    useCaseSurfaceManager.setupDeferred = async$default;
                                    completableDeferredImpl = async$default;
                                } catch (DeferrableSurface.SurfaceClosedException e) {
                                    int i2 = 5;
                                    if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                                        Log.w("CXCP", "Failed to increment DeferrableSurfaces: Surfaces closed");
                                    }
                                    JobKt.launch$default(useCaseSurfaceManager.threads.scope, null, null, new RealBadger2$clear$2(sessionConfigAdapter2, e, continuation, i2), 3);
                                    completableDeferredImpl = JobKt.CompletableDeferred(Boolean.FALSE);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        completableDeferredImpl.invokeOnCompletion(UseCaseCameraImpl$start$1$3.INSTANCE);
                    } else if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                        Log.e("CXCP", "Unable to create capture session due to conflicting configurations");
                    }
                } else if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCamera is closed before starting the CameraGraph, skipping setup.");
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CaptureSessionState) this.this$0).finalizeOutputsIfAvailable(true);
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Ref$ObjectRef) this.this$0).element = null;
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((DialogHostKt$$ExternalSyntheticLambda0) ((zzm) this.this$0).zzc).invoke();
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.this$0;
                Context context = platformSelectionBehaviorsImpl.context;
                SelectedTextType selectedTextType = platformSelectionBehaviorsImpl.selectedTextType;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int ordinal = selectedTextType.ordinal();
                if (ordinal == 0) {
                    str = "edittext";
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str = "textview";
                }
                TextClassifier createTextClassificationSession = textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
                platformSelectionBehaviorsImpl.textClassificationSession = createTextClassificationSession;
                return createTextClassificationSession;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((TooltipStateImpl) this.this$0).dismiss();
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((PresentationState) this.this$0).getClass();
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MulticastedPagingData) this.this$0).getClass();
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((Callable) this.this$0).call();
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealBadger2 realBadger2 = (RealBadger2) this.this$0;
                LocalTabContentQueries localTabContentQueries = realBadger2.badgeQueries;
                QueryResult execute = localTabContentQueries.driver.execute(1606885845, "DELETE FROM badge\nWHERE clear_succeeded_at < ?", new BadgeQueries$$ExternalSyntheticLambda0(r2, DimensionKt.now(realBadger2.clock).minus(1L, (TemporalUnit) ChronoUnit.DAYS), localTabContentQueries));
                localTabContentQueries.notifyQueries(1606885845, new AvatarsKt$$ExternalSyntheticLambda2(9));
                return execute;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((LocalAddBrandsPresenter) this.this$0).analytics.track(new LocalClientTabViewBrandBrowser(), null);
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FulfillmentPickerPresenter fulfillmentPickerPresenter = (FulfillmentPickerPresenter) this.this$0;
                Analytics analytics = fulfillmentPickerPresenter.analytics;
                LocalFulfillmentPickerScreen localFulfillmentPickerScreen = fulfillmentPickerPresenter.screen;
                String str2 = localFulfillmentPickerScreen.brandToken;
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(fulfillmentPickerPresenter.sessionManager);
                FulfillmentVersion fulfillmentVersion = FulfillmentVersion.BX;
                switch (FulfillmentPickerPresenter$models$2$1$1$WhenMappings.$EnumSwitchMapping$0[localFulfillmentPickerScreen.selectedType.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        fulfillmentInstanceType = FulfillmentInstanceType.PICKUP;
                        break;
                    case 6:
                        fulfillmentInstanceType = FulfillmentInstanceType.DELIVERY;
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                analytics.track(new LocalClientFulfillmentFlowViewFulfillment(str2, activeAccountTokenOrNull, fulfillmentInstanceType), null);
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.this$0;
                Analytics analytics2 = (Analytics) cardStudioPresenter.analytics;
                String str3 = ((BrandSpot) cardStudioPresenter.cardStudioQueries).brandToken;
                LocalSchedulingDayTimePickerScreen localSchedulingDayTimePickerScreen = (LocalSchedulingDayTimePickerScreen) cardStudioPresenter.appConfig;
                analytics2.track(new LocalClientFulfillmentFlowViewScheduling(str3, localSchedulingDayTimePickerScreen.locationToken, localSchedulingDayTimePickerScreen.buyerToken, localSchedulingDayTimePickerScreen.checkoutFlowToken, CardStudioPresenter.access$getFulfillmentTypeForCdf(cardStudioPresenter)), null);
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalPosBrandOnboardingPresenter localPosBrandOnboardingPresenter = (LocalPosBrandOnboardingPresenter) this.this$0;
                Analytics analytics3 = localPosBrandOnboardingPresenter.analytics;
                POSBrandOnboarding pOSBrandOnboarding = localPosBrandOnboardingPresenter.onboarding;
                String str4 = pOSBrandOnboarding.title;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = pOSBrandOnboarding.body;
                analytics3.track(new LocalClientPOSOnboardingSheetView(str4, str5 != null ? str5 : "", Boolean.valueOf(pOSBrandOnboarding.how_it_works != null)), null);
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((TableQrCodeCameraViewFinderState) this.this$0).processImages$delegate.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 20:
                return invokeSuspend$app$cash$molecule$MoleculeKt$launchMolecule$3$1(obj);
            case 21:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) this.this$0;
                if (((RealAppLockState.InternalState) ((RealAppLockState) endAppLockPresenter.appLockState).stateFlow.getValue()).lockState instanceof RealAppLockState.LockState.Locked) {
                    RealAccountOutboundNavigator realAccountOutboundNavigator = (RealAccountOutboundNavigator) endAppLockPresenter.accountOutboundNavigator;
                    realAccountOutboundNavigator.analytics.track(new PersonalProfileSignOutConfirm(), null);
                    ((SignedInStateManager) realAccountOutboundNavigator.signedInStateManager).update(SignedInState.SIGNED_OUT);
                }
                ((MainActivity$navigatorSwitcher$1) endAppLockPresenter.navigatorSwitcher).unlock();
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService = (OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService) this.this$0;
                Object call = onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService.callHandler.call(onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService, 0, new Object[0]);
                call.getClass();
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ViewContentCodeBinding viewContentCodeBinding = (ViewContentCodeBinding) this.this$0;
                viewContentCodeBinding.contentSource = null;
                viewContentCodeBinding.treehouseUiOrNull = null;
                viewContentCodeBinding.eventBridge.idToElementMap = null;
                ((ZiplineScope) viewContentCodeBinding.serviceScope.this$0).close();
                JobKt.cancel(viewContentCodeBinding.bindingScope, (CancellationException) null);
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ViewTargetRequestManager viewTargetRequestManager = (ViewTargetRequestManager) this.this$0;
                ViewTargetRequestDelegate viewTargetRequestDelegate = viewTargetRequestManager.currentRequest;
                if (viewTargetRequestDelegate != null) {
                    viewTargetRequestDelegate.dispose();
                }
                viewTargetRequestManager.currentRequest = null;
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ComposeUiClusterRenderer.InvalidatingComposeView) this.this$0).invalidate();
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((MarkdownStateImpl) this.this$0).parseBlocking$multiplatform_markdown_renderer();
            case 27:
                PlacesAddressSearcher placesAddressSearcher = (PlacesAddressSearcher) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    Context context2 = placesAddressSearcher.context;
                    Context context3 = placesAddressSearcher.context;
                    ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(context3.getPackageName(), 128);
                    applicationInfo.getClass();
                    String string2 = applicationInfo.metaData.getString("com.google.android.geo.API_KEY");
                    if (((Boolean) placesAddressSearcher.newApiEnabled.invoke()).booleanValue()) {
                        string2.getClass();
                        try {
                            Places.zza(context3, string2, true);
                            placesAddressSearcher.apiClient = Places.createClient(context3);
                            placesAddressSearcher.sessionToken = null;
                            return Boolean.TRUE;
                        } catch (Error | RuntimeException e2) {
                            zznv.zzb(e2);
                            throw e2;
                        }
                    }
                    string2.getClass();
                    try {
                        Places.zza(context3, string2, false);
                        placesAddressSearcher.apiClient = Places.createClient(context3);
                        placesAddressSearcher.sessionToken = null;
                        return Boolean.TRUE;
                    } catch (Error | RuntimeException e3) {
                        zznv.zzb(e3);
                        throw e3;
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    Timber.Forest.e("Failed to load Places api key", new Object[0], e4);
                    return Boolean.FALSE;
                }
            default:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiskLruCache$launchCleanup$1(Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
