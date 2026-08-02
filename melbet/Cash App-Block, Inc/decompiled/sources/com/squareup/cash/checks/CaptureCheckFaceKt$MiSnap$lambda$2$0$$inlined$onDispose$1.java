package com.squareup.cash.checks;

import androidx.activity.compose.ComposePredictiveBackHandler;
import androidx.activity.compose.internal.BackHandlerDispatcherCompat;
import androidx.camera.core.RotationProvider;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.RendererHolder;
import androidx.media3.ui.compose.PlayerSurfaceKt$PlayerSurfaceInternal$5$1$1$listener$1;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda4;
import androidx.paging.Pager$pageFetcher$2;
import app.cash.broadway.presenter.molecule.RenavigationDispatcher;
import app.cash.broadway.presenter.molecule.SwipeCallbackDispatcher;
import app.cash.broadway.ui.compose.FullScreenAggregator;
import app.cash.broadway.ui.compose.FullScreenNode;
import app.cash.broadway.ui.compose.OrientationAggregator;
import app.cash.broadway.ui.compose.OrientationNode;
import app.cash.broadway.ui.compose.SecureScreenAggregator;
import app.cash.broadway.ui.compose.SecureScreenNode;
import app.cash.local.views.instore.TableQrCodeCameraViewFinderManager;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.web.delegates.RealWebViewBlockerCookieManager;
import com.squareup.cash.blockers.web.delegates.WebViewBlockerCookieManager;
import com.squareup.cash.blockers.web.presenters.WebViewBlockerPresenter;
import com.squareup.cash.card.onboarding.CardStudioViewKt$CardStudio$3$1$observer$1;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.card.onboarding.core.instancing.InstancedCardBatch;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.protos.franklin.api.WebviewBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1 implements DisposableEffectResult {
    public final /* synthetic */ Object $miSnapView$delegate$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $viewLifecycleOwner$inlined;

    public /* synthetic */ CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$miSnapView$delegate$inlined = obj;
        this.$viewLifecycleOwner$inlined = obj2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        int i = this.$r8$classId;
        Object obj = this.$viewLifecycleOwner$inlined;
        Object obj2 = this.$miSnapView$delegate$inlined;
        switch (i) {
            case 0:
                MiSnapView miSnapView = (MiSnapView) ((MutableState) obj2).getValue();
                MiSnapView.setTorchEnabled$default(miSnapView, false, null, 2, null);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
                miSnapView.w.removeObservers(lifecycleOwner);
                miSnapView.y.removeObservers(lifecycleOwner);
                miSnapView.x.removeObservers(lifecycleOwner);
                break;
            case 1:
                ((BackHandlerDispatcherCompat) obj2).removeHandler((ComposePredictiveBackHandler) obj);
                break;
            case 2:
                ((InfiniteTransition) obj2)._animations.remove((InfiniteTransition.TransitionAnimationState) obj);
                break;
            case 3:
                ((Transition) obj2)._animations.remove((Transition.TransitionAnimationState) obj);
                break;
            case 4:
                ((LazySaveableStateHolder) obj2).previouslyComposedKeys.plusAssign(obj);
                break;
            case 5:
                MutableState mutableState = (MutableState) obj2;
                PressInteraction.Press press = (PressInteraction.Press) mutableState.getValue();
                if (press != null) {
                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj;
                    if (mutableInteractionSourceImpl != null) {
                        mutableInteractionSourceImpl.tryEmit(cancel);
                    }
                    mutableState.setValue(null);
                    break;
                }
                break;
            case 6:
                ((TextLinkScope) obj2).annotators.remove((Function1) obj);
                break;
            case 7:
                PlayerSurfaceKt$PlayerSurfaceInternal$5$1$1$listener$1 playerSurfaceKt$PlayerSurfaceInternal$5$1$1$listener$1 = (PlayerSurfaceKt$PlayerSurfaceInternal$5$1$1$listener$1) obj2;
                if (playerSurfaceKt$PlayerSurfaceInternal$5$1$1$listener$1 != null) {
                    ((ExoPlayerImpl) ((ExoPlayer) obj)).removeListener(playerSurfaceKt$PlayerSurfaceInternal$5$1$1$listener$1);
                    break;
                }
                break;
            case 8:
                ((NavBackStackEntry) obj2).impl.lifecycle.removeObserver((DialogHostKt$$ExternalSyntheticLambda4) obj);
                break;
            case 9:
                Iterator it = ((List) ((State) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((ComposeNavigator) obj).getState().markTransitionComplete((NavBackStackEntry) it.next());
                }
                break;
            case 10:
                RenavigationDispatcher renavigationDispatcher = (RenavigationDispatcher) obj2;
                Function0 function0 = (Function0) obj;
                renavigationDispatcher.getClass();
                function0.getClass();
                if (Intrinsics.areEqual(renavigationDispatcher.handler, function0)) {
                    renavigationDispatcher.handler = null;
                    break;
                } else {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Cannot unregister a renavigation handler that has not been registered in ", renavigationDispatcher.name, "."));
                    break;
                }
            case 11:
                SwipeCallbackDispatcher swipeCallbackDispatcher = (SwipeCallbackDispatcher) obj2;
                Function1 function1 = (Function1) obj;
                function1.getClass();
                if (Intrinsics.areEqual(swipeCallbackDispatcher.handle, function1)) {
                    swipeCallbackDispatcher.handle = null;
                    break;
                } else {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Cannot unregister a SwipeHandler that has not been registered in ", swipeCallbackDispatcher.name, "."));
                    break;
                }
            case 12:
                FullScreenAggregator fullScreenAggregator = (FullScreenAggregator) obj2;
                FullScreenNode fullScreenNode = (FullScreenNode) obj;
                fullScreenAggregator.getClass();
                fullScreenNode.getClass();
                fullScreenAggregator.nodes.remove(fullScreenNode);
                fullScreenNode.enabledChangedCallback = null;
                Function0 function02 = fullScreenAggregator.enabledChangedCallback;
                if (function02 != null) {
                    function02.invoke();
                    break;
                }
                break;
            case 13:
                OrientationAggregator orientationAggregator = (OrientationAggregator) obj2;
                OrientationNode orientationNode = (OrientationNode) obj;
                orientationAggregator.getClass();
                orientationNode.getClass();
                orientationAggregator.nodes.remove(orientationNode);
                orientationNode.orientationChangedCallback = null;
                Function0 function03 = orientationAggregator.orientationChangedCallback;
                if (function03 != null) {
                    function03.invoke();
                    break;
                }
                break;
            case 14:
                SecureScreenAggregator secureScreenAggregator = (SecureScreenAggregator) obj2;
                SecureScreenNode secureScreenNode = (SecureScreenNode) obj;
                secureScreenAggregator.getClass();
                secureScreenNode.getClass();
                secureScreenAggregator.nodes.remove(secureScreenNode);
                secureScreenNode.enabledChangedCallback = null;
                Function0 function04 = secureScreenAggregator.enabledChangedCallback;
                if (function04 != null) {
                    function04.invoke();
                    break;
                }
                break;
            case 15:
                ((ChainingListenableFuture) obj2).cancel(true);
                TableQrCodeCameraViewFinderManager tableQrCodeCameraViewFinderManager = (TableQrCodeCameraViewFinderManager) obj;
                tableQrCodeCameraViewFinderManager.imageAnalysis.clearAnalyzer();
                tableQrCodeCameraViewFinderManager.analyzerExecutor.shutdownNow();
                RotationProvider.AnonymousClass1 anonymousClass1 = tableQrCodeCameraViewFinderManager.orientationEventListener;
                anonymousClass1.disable();
                anonymousClass1.this$0 = null;
                tableQrCodeCameraViewFinderManager.cameraLifecycleOwner.lifecycle.setCurrentState(Lifecycle.State.DESTROYED);
                break;
            case 16:
                ((LifecycleOwner) obj).getLifecycle().removeObserver((MenuHostHelper$$ExternalSyntheticLambda1) obj2);
                break;
            case 17:
                BlockersScreens.WebViewBlockerScreen webViewBlockerScreen = (BlockersScreens.WebViewBlockerScreen) obj2;
                List list = webViewBlockerScreen.cookies;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (Intrinsics.areEqual(((WebviewBlocker.CookieField) obj3).session_only, Boolean.TRUE)) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    WebviewBlocker.CookieField cookieField = (WebviewBlocker.CookieField) it2.next();
                    WebViewBlockerCookieManager webViewBlockerCookieManager = ((WebViewBlockerPresenter) obj).webBlockerCookieManager;
                    String str = webViewBlockerScreen.url;
                    String str2 = cookieField.name + "=; domain=" + cookieField.domain + "; path=" + cookieField.path + "; Max-Age=0;";
                    str.getClass();
                    ((RealWebViewBlockerCookieManager) webViewBlockerCookieManager).cookieManager.setCookie(str, str2);
                }
                break;
            case 18:
                ((Lifecycle) obj2).removeObserver((CardStudioViewKt$CardStudio$3$1$observer$1) obj);
                break;
            case 19:
                ((Lifecycle) obj2).removeObserver((CardStudioViewKt$CardStudio$3$1$observer$1) obj);
                break;
            case 20:
                ((Lifecycle) obj2).removeObserver((HeatRenderer) obj);
                break;
            case 21:
                ((CardScene) obj2).dispose();
                ((Engine) obj).shutdown();
                break;
            case 22:
                CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) obj2;
                LinkedHashMap linkedHashMap = cardDesignLibraryScene.tagGeometries;
                JobSupport jobSupport = cardDesignLibraryScene.animationJob;
                if (jobSupport != null) {
                    jobSupport.cancel(null);
                }
                Job job = cardDesignLibraryScene.renderJob;
                if (job != null) {
                    job.cancel(null);
                }
                InstancedCardBatch instancedCardBatch = cardDesignLibraryScene.instancedBatch;
                if (instancedCardBatch != null) {
                    instancedCardBatch.dispose();
                }
                cardDesignLibraryScene.instancedBatch = null;
                cardDesignLibraryScene.disposeTagPools();
                Iterator it3 = linkedHashMap.values().iterator();
                while (it3.hasNext()) {
                    ((MeshGeometry) it3.next()).dispose();
                }
                linkedHashMap.clear();
                cardDesignLibraryScene.tagScales.clear();
                JWECryptoParts jWECryptoParts = cardDesignLibraryScene.backgroundPlane;
                Job job2 = (Job) jWECryptoParts.authenticationTag;
                if (job2 != null) {
                    job2.cancel(null);
                }
                jWECryptoParts.authenticationTag = null;
                ((GLLauncher) jWECryptoParts.header).launch(new Pager$pageFetcher$2(jWECryptoParts, null, 5));
                RendererHolder rendererHolder = cardDesignLibraryScene.perCardShadowAtlas;
                int i2 = cardDesignLibraryScene.miniCardShadowDepthProgram;
                cardDesignLibraryScene.perCardShadowAtlas = null;
                cardDesignLibraryScene.perCardShadowAtlasAllocatedSize = 0;
                cardDesignLibraryScene.miniCardShadowDepthProgram = 0;
                cardDesignLibraryScene.miniCardShadowProgramLinkFailed = false;
                if (rendererHolder != null || i2 != 0) {
                    cardDesignLibraryScene.engine.launch(new Scene.AnonymousClass1(rendererHolder, i2, (Continuation) null));
                }
                ((Engine) obj).shutdown();
                break;
            case 23:
                if (((HeartScene) obj2) == null) {
                    ((HeartScene) obj).dispose();
                    break;
                }
                break;
            case 24:
                if (((MiniCardScene) obj2) == null) {
                    ((MiniCardScene) obj).dispose();
                    break;
                }
                break;
            case 25:
                if (((WandScene) obj2) == null) {
                    ((WandScene) obj).dispose();
                    break;
                }
                break;
            case 26:
                AtomicReference atomicReference = (AtomicReference) obj2;
                OnBackListener onBackListener = (OnBackListener) obj;
                while (!atomicReference.compareAndSet(onBackListener, null) && atomicReference.get() == onBackListener) {
                }
            case 27:
                ((ElementBoundsRegistry) obj2).set((ElementBoundsRegistry.Element) obj, null);
                break;
            case 28:
                ((LifecycleOwner) obj).getLifecycle().removeObserver((MenuHostHelper$$ExternalSyntheticLambda1) obj2);
                break;
            default:
                ((GLSceneScope) obj2)._lights.remove((LightStateImpl) obj);
                break;
        }
    }

    public /* synthetic */ CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver, int i) {
        this.$r8$classId = i;
        this.$viewLifecycleOwner$inlined = lifecycleOwner;
        this.$miSnapView$delegate$inlined = lifecycleEventObserver;
    }
}
