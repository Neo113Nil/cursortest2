package androidx.compose.ui.window;

import android.app.Activity;
import android.view.Window;
import androidx.activity.compose.ActivityResultLauncherHolder;
import androidx.activity.result.ActivityResultRegistry$register$2;
import androidx.camera.compose.SurfaceRequestScope;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.runtime.DisposableEffectResult;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.views.instore.TableQrCodeCameraViewFinderManager;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.algo.ScreenBasedAlgorithmAdapter;
import com.squareup.cash.R;
import com.squareup.cash.activity.presenters.ActivityFeedCallbackEvent$RefreshFeed;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.fidesmo.views.StepTurnAnimationQueue;
import com.squareup.cash.graphics.swampgl.EngineSurfaceTarget;
import com.squareup.cash.graphics.swampgl.EngineSurfaceViewTarget;
import com.squareup.cash.money.banners.presenters.KybBannerPresenter;
import com.squareup.cash.offers.backend.api.TrackingAction;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter;
import com.squareup.cash.payments.presenters.PersonalizePaymentRecipientPresenter;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$2$1$1$1;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter;
import com.squareup.cash.qrcodes.views.CameraXPreviewManager;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.StandaloneCoroutine;
import papa.InteractionResult;

/* loaded from: classes3.dex */
public final class AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    public final /* synthetic */ Object $popupLayout$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$popupLayout$inlined = obj;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        Window window;
        switch (this.$r8$classId) {
            case 0:
                PopupLayout popupLayout = (PopupLayout) this.$popupLayout$inlined;
                popupLayout.disposeComposition();
                popupLayout.setTag(R.id.view_tree_lifecycle_owner, null);
                popupLayout.windowManager.removeViewImmediate(popupLayout);
                return;
            case 1:
                ActivityResultRegistry$register$2 activityResultRegistry$register$2 = ((ActivityResultLauncherHolder) this.$popupLayout$inlined).launcher;
                if (activityResultRegistry$register$2 != null) {
                    activityResultRegistry$register$2.unregister();
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("Launcher has not been initialized");
                    return;
                }
            case 2:
                ((SurfaceRequestScope) this.$popupLayout$inlined).requestChannel.close(null);
                return;
            case 3:
                ((SeekableTransitionState) ((InteractionResult) this.$popupLayout$inlined)).setSnapshotStateObserver$animation_core(null);
                return;
            case 4:
                Transition transition = (Transition) this.$popupLayout$inlined;
                transition.onTransitionEnd$animation_core();
                transition.transitionState.transitionRemoved$animation_core();
                return;
            case 5:
                ((LazyLayoutItemContentFactory.CachedItemContent) this.$popupLayout$inlined)._content = null;
                return;
            case 6:
                LazyLayoutPrefetchState lazyLayoutPrefetchState = (LazyLayoutPrefetchState) this.$popupLayout$inlined;
                Response response = lazyLayoutPrefetchState.prefetchHandleProvider;
                if (response != null) {
                    response.intermediate = false;
                }
                lazyLayoutPrefetchState.prefetchHandleProvider = null;
                return;
            case 7:
                ((LazyLayoutPinnableItem) this.$popupLayout$inlined).isDisposed = true;
                return;
            case 8:
                ((TextFieldSelectionManager) this.$popupLayout$inlined).hideSelectionToolbar$foundation();
                return;
            case 9:
                SelectionManager selectionManager = (SelectionManager) this.$popupLayout$inlined;
                selectionManager.onRelease();
                selectionManager.hasFocus$delegate.setValue(Boolean.FALSE);
                return;
            case 10:
                CancellableContinuationImpl cancellableContinuationImpl = ((TooltipStateImpl) this.$popupLayout$inlined).job;
                if (cancellableContinuationImpl != null) {
                    cancellableContinuationImpl.cancel(null);
                    return;
                }
                return;
            case 11:
                DialogWrapper dialogWrapper = (DialogWrapper) this.$popupLayout$inlined;
                dialogWrapper.dismiss();
                dialogWrapper.dialogLayout.disposeComposition();
                return;
            case 12:
                ((TableQrCodeCameraViewFinderManager) this.$popupLayout$inlined).imageAnalysis.clearAnalyzer();
                return;
            case 13:
                ClusterManager clusterManager = (ClusterManager) this.$popupLayout$inlined;
                ScreenBasedAlgorithmAdapter screenBasedAlgorithmAdapter = clusterManager.mAlgorithm;
                ((ReentrantReadWriteLock) screenBasedAlgorithmAdapter.data).writeLock().lock();
                try {
                    screenBasedAlgorithmAdapter.clearItems();
                    screenBasedAlgorithmAdapter.unlock();
                    clusterManager.cluster();
                    return;
                } catch (Throwable th) {
                    screenBasedAlgorithmAdapter.unlock();
                    throw th;
                }
            case 14:
                StateFlowKt.emitOrThrow(((ActivityTabPresenter) this.$popupLayout$inlined).feedCallbackEvents, ActivityFeedCallbackEvent$RefreshFeed.INSTANCE);
                return;
            case 15:
                ((AfterpayAppletHomePresenter) this.$popupLayout$inlined).analytics.loggedImpressionEventHashes.clear();
                return;
            case 16:
                ((RealAfterpayAppletAnalytics) ((LocalPosCheckInPresenter) this.$popupLayout$inlined).launcher).loggedImpressionEventHashes.clear();
                return;
            case 17:
                CashTreehouseLayout cashTreehouseLayout = (CashTreehouseLayout) this.$popupLayout$inlined;
                cashTreehouseLayout.getClass();
                CashTreehouseLayout.updateState$default(cashTreehouseLayout, null, null, 1);
                return;
            case 18:
                ((WandScene) this.$popupLayout$inlined).dispose();
                return;
            case 19:
                Activity activity = (Activity) this.$popupLayout$inlined;
                if (activity == null || (window = activity.getWindow()) == null) {
                    return;
                }
                window.clearFlags(128);
                return;
            case 20:
                StandaloneCoroutine standaloneCoroutine = ((StepTurnAnimationQueue) this.$popupLayout$inlined).animationJob;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                    return;
                }
                return;
            case 21:
                EngineSurfaceTarget engineSurfaceTarget = (EngineSurfaceTarget) this.$popupLayout$inlined;
                if (engineSurfaceTarget != null) {
                    engineSurfaceTarget.destroyInternal();
                    return;
                }
                return;
            case 22:
                EngineSurfaceViewTarget engineSurfaceViewTarget = (EngineSurfaceViewTarget) this.$popupLayout$inlined;
                if (engineSurfaceViewTarget != null) {
                    engineSurfaceViewTarget.explicitlyDestroyed = true;
                    engineSurfaceViewTarget.destroyInternal();
                    return;
                }
                return;
            case 23:
                ((AndroidActivityFinisher) ((VerifyCheckDialogPresenter) this.$popupLayout$inlined).args).finish();
                return;
            case 24:
                RealOffersSearchPresenter realOffersSearchPresenter = (RealOffersSearchPresenter) this.$popupLayout$inlined;
                realOffersSearchPresenter.spanTracking = null;
                realOffersSearchPresenter.trackingManager.onAction(TrackingAction.TerminateTracking.INSTANCE);
                return;
            case 25:
                ((PersonalizePaymentRecipientPresenter) this.$popupLayout$inlined).musicPlayer.stop();
                return;
            case 26:
                ((CoreFlowRealSheetState) this.$popupLayout$inlined).settleWithVelocity = CoreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$2$1$1$1.INSTANCE;
                return;
            case 27:
                ((AndroidActivityFinisher) ((KybBannerPresenter) this.$popupLayout$inlined).kybRestrictionBannerPresenter).finish();
                return;
            case 28:
                ((CashQrScannerPresenter) this.$popupLayout$inlined).nfcPaymentsManager.disableReaderMode();
                return;
            default:
                ((CameraXPreviewManager) this.$popupLayout$inlined).imageAnalysis.clearAnalyzer();
                return;
        }
    }
}
