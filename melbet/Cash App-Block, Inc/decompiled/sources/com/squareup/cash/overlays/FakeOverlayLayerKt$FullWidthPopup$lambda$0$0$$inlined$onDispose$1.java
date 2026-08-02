package com.squareup.cash.overlays;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import androidx.camera.core.RotationProvider;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$$ExternalSyntheticLambda0;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavHostController;
import androidx.viewpager2.widget.CompositeOnPageChangeCallback;
import com.google.android.gms.maps.zzai;
import com.miteksystems.misnap.workflow.fragment.HelpFragment$$ExternalSyntheticLambda2;
import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException;
import com.squareup.cash.arcade.treehouse.RadioBinding$value$1;
import com.squareup.cash.card.onboarding.CardTextureState;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.investing.components.discovery.InvestingStockCarouselView;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$10$1;
import com.squareup.cash.moneybot.views.home.ParticleGridRenderer;
import com.squareup.cash.nearby.backend.NearbyAdvertisement;
import com.squareup.cash.nearby.backend.NearbyIdentifier;
import com.squareup.cash.nearby.backend.RealNearbyAdvertiser;
import com.squareup.cash.nearby.backend.RealNearbyManager;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.qrcodes.views.CameraXPreviewManager;
import com.squareup.cash.taptopay.backend.real.RealTagCommunication;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$EndBlockerSpan;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService;
import com.squareup.cash.threedsdataonly.presenters.ThreeDsPresenter;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.lifecycle.WindowBoundLifecycleOwner;
import com.stripe.android.uicore.navigation.KeyboardControllerKt$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1 implements DisposableEffectResult {
    public final /* synthetic */ Object $popupLayout$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $windowManager$inlined;

    public /* synthetic */ FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$popupLayout$inlined = obj;
        this.$windowManager$inlined = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        ScanCallback scanCallback;
        int i = this.$r8$classId;
        int i2 = 1;
        Object[] objArr = 0;
        Object obj = this.$windowManager$inlined;
        Object obj2 = this.$popupLayout$inlined;
        switch (i) {
            case 0:
                RadioBinding$value$1 radioBinding$value$1 = (RadioBinding$value$1) obj2;
                radioBinding$value$1.disposeComposition();
                try {
                    ((WindowManager) obj).removeViewImmediate(radioBinding$value$1);
                    return;
                } catch (NullPointerException unused) {
                    ViewParent parent = radioBinding$value$1.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(radioBinding$value$1);
                        return;
                    }
                    return;
                }
            case 1:
                ((GLSceneScope) obj2)._renderables.remove((Triple) obj);
                return;
            case 2:
                ((LifecycleOwner) obj2).getLifecycle().removeObserver((MenuHostHelper$$ExternalSyntheticLambda1) obj);
                return;
            case 3:
                ((ArrayList) ((InvestingStockCarouselView) obj2).stocksViewPager.mExternalPageChangeCallbacks.mCallbacks).remove((CompositeOnPageChangeCallback) obj);
                return;
            case 4:
                String sessionId = ((MoneybotChatPresenter.ChatSessionState) ((MutableState) obj2).getValue()).session.getSessionId();
                if (sessionId != null) {
                    MoneybotChatPresenter moneybotChatPresenter = (MoneybotChatPresenter) obj;
                    JobKt.launch$default(moneybotChatPresenter.scope, moneybotChatPresenter.ioContext, null, new MoneybotChatPresenter$models$10$1(moneybotChatPresenter, sessionId, objArr == true ? 1 : 0, i2), 2);
                    return;
                }
                return;
            case 5:
                ((Lifecycle) obj2).removeObserver((ParticleGridRenderer) obj);
                return;
            case 6:
                Timber.Forest forest = Timber.Forest;
                NearbyAdvertisement nearbyAdvertisement = (NearbyAdvertisement) obj2;
                forest.d("NEARBY: stopAdvertising " + nearbyAdvertisement.toUuid(), new Object[0]);
                RealNearbyAdvertiser realNearbyAdvertiser = ((RealNearbyManager) obj).nearbyAdvertiser;
                AdvertiseCallback advertiseCallback = (AdvertiseCallback) realNearbyAdvertiser.activeAdvertisements.remove(nearbyAdvertisement);
                if (advertiseCallback != null) {
                    forest.i("NEARBY - Stopping nearby advertisement for: " + nearbyAdvertisement.toUuid(), new Object[0]);
                    BluetoothLeAdvertiser bluetoothLeAdvertiser = realNearbyAdvertiser.bleManager.btAdvertiser;
                    if (bluetoothLeAdvertiser != null) {
                        bluetoothLeAdvertiser.stopAdvertising(advertiseCallback);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                RealNearbyAdvertiser realNearbyAdvertiser2 = ((RealNearbyManager) obj2).nearbyAdvertiser;
                NearbyIdentifier nearbyIdentifier = (NearbyIdentifier) obj;
                nearbyIdentifier.getClass();
                LinkedHashMap linkedHashMap = realNearbyAdvertiser2.listeners;
                linkedHashMap.remove(nearbyIdentifier);
                if (linkedHashMap.isEmpty()) {
                    RealBleManager realBleManager = realNearbyAdvertiser2.bleManager;
                    BluetoothLeScanner bluetoothLeScanner = realBleManager.btScanner;
                    if (bluetoothLeScanner != null && (scanCallback = (ScanCallback) realBleManager.scanCallbacks.remove("0000FC44-0000-1000-8000-00805F9B34FB")) != null) {
                        try {
                            Timber.Forest.i("NEARBY - BLE scan stopping", new Object[0]);
                            bluetoothLeScanner.stopScan(scanCallback);
                        } catch (Exception e) {
                            Timber.Forest.e("NEARBY - error stopping scan", new Object[0], e);
                        }
                    }
                    realNearbyAdvertiser2.isScanning = false;
                    return;
                }
                return;
            case 8:
                ((ChainingListenableFuture) obj2).cancel(true);
                CameraXPreviewManager cameraXPreviewManager = (CameraXPreviewManager) obj;
                RotationProvider.AnonymousClass1 anonymousClass1 = cameraXPreviewManager.orientationEventListener;
                anonymousClass1.disable();
                anonymousClass1.this$0 = null;
                cameraXPreviewManager.cameraLifecycleOwner.lifecycle.setCurrentState(Lifecycle.State.DESTROYED);
                return;
            case 9:
                RealTagCommunication realTagCommunication = (RealTagCommunication) ((MutableState) obj).getValue();
                if (realTagCommunication != null) {
                    realTagCommunication.closeInBackground();
                }
                ((zzai) ((CardLockPresenter) obj2).args).stopReadingCardPayment();
                return;
            case 10:
                ThreeDsPresenter threeDsPresenter = (ThreeDsPresenter) obj2;
                threeDsPresenter.spanTrackingService.onAction(new ThreeDsSpanAction$EndBlockerSpan(((Boolean) ((MutableState) obj).getValue()).booleanValue()));
                try {
                    if (threeDsPresenter.preInitializationEnabled) {
                        return;
                    }
                    RealThreeDsService realThreeDsService = threeDsPresenter.threeDsService;
                    try {
                        try {
                            ThreeDS2Service threeDS2Service = realThreeDsService.threeDsService;
                            if (threeDS2Service != null) {
                                threeDS2Service.cleanup(realThreeDsService.context);
                            }
                        } catch (SDKNotInitializedException e2) {
                            Timber.Forest forest2 = Timber.Forest;
                            forest2.tag("3DS");
                            forest2.w("3DS SDK was not initialized, no cleanup needed", new Object[0], e2);
                        }
                        return;
                    } catch (Exception e3) {
                        throw RealThreeDsService.asCashType(e3);
                    }
                } catch (Exception e4) {
                    Timber.Forest forest3 = Timber.Forest;
                    forest3.tag("3DS");
                    forest3.e("Failed to cleanup 3DS SDK!", new Object[0], e4);
                    return;
                }
            case 11:
                CardTextureState cardTextureState = (CardTextureState) obj2;
                if (Intrinsics.areEqual(cardTextureState, ((CardNuxState) obj).getCurrentTextureState())) {
                    return;
                }
                cardTextureState.destroyTextures();
                return;
            case 12:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((CardRegistry) obj2).sharedCardTransitionState;
                if (Intrinsics.areEqual(parcelableSnapshotMutableState.getValue(), (CardRegistry.SharedCardTransitionState) obj)) {
                    parcelableSnapshotMutableState.setValue(null);
                    return;
                }
                return;
            case 13:
                ((LifecycleOwner) obj2).getLifecycle().removeObserver((WindowBoundLifecycleOwner) obj);
                return;
            case 14:
                ((LifecycleOwner) obj2).getLifecycle().removeObserver((Lifecycle$$ExternalSyntheticLambda0) obj);
                return;
            case 15:
                ((NavHostController) obj2).removeOnDestinationChangedListener((HelpFragment$$ExternalSyntheticLambda2) obj);
                return;
            default:
                ((View) obj2).getViewTreeObserver().removeOnGlobalLayoutListener((KeyboardControllerKt$$ExternalSyntheticLambda2) obj);
                return;
        }
    }
}
