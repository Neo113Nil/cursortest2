package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.ZoomValue;
import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.lifecycle.MutableLiveData;
import androidx.room.util.DBUtil;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CompletableDeferredImpl;
import radiography.internal.RenderTreeStringKt;

/* loaded from: classes3.dex */
public final class ZoomControl implements UseCaseCameraControl {
    public UseCaseCameraRequestControl _requestControl;
    public final Lazy _zoomState$delegate;
    public final Lazy defaultZoomState$delegate;
    public boolean isInitialized;
    public final float maxZoomRatio;
    public final float minZoomRatio;
    public CompletableDeferredImpl updateSignal;
    public final ZoomCompat zoomCompat;

    public ZoomControl(ZoomCompat zoomCompat) {
        this.zoomCompat = zoomCompat;
        this.minZoomRatio = zoomCompat.getMinZoomRatio();
        this.maxZoomRatio = zoomCompat.getMaxZoomRatio();
        final int i = 0;
        this.defaultZoomState$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.impl.ZoomControl$$ExternalSyntheticLambda0
            public final /* synthetic */ ZoomControl f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ZoomControl zoomControl = this.f$0;
                switch (i2) {
                    case 0:
                        return new ZoomValue(1.0f, zoomControl.minZoomRatio, zoomControl.maxZoomRatio);
                    default:
                        return new MutableLiveData((ZoomValue) zoomControl.defaultZoomState$delegate.getValue());
                }
            }
        });
        final int i2 = 1;
        this._zoomState$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.impl.ZoomControl$$ExternalSyntheticLambda0
            public final /* synthetic */ ZoomControl f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ZoomControl zoomControl = this.f$0;
                switch (i22) {
                    case 0:
                        return new ZoomValue(1.0f, zoomControl.minZoomRatio, zoomControl.maxZoomRatio);
                    default:
                        return new MutableLiveData((ZoomValue) zoomControl.defaultZoomState$delegate.getValue());
                }
            }
        });
    }

    public final ListenableFuture applyZoomState(ZoomValue zoomValue, boolean z, boolean z2) {
        zoomValue.getClass();
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        CompletableDeferredImpl completableDeferredImpl2 = this.updateSignal;
        if (completableDeferredImpl2 != null) {
            if (z) {
                CameraState$Type$EnumUnboxingLocalUtility.m("Cancelled due to another zoom value being set.", completableDeferredImpl2);
            } else {
                RenderTreeStringKt.propagateTo(completableDeferredImpl, completableDeferredImpl2);
            }
        }
        this.updateSignal = completableDeferredImpl;
        boolean isMainThread = Threads.isMainThread();
        Lazy lazy = this._zoomState$delegate;
        if (isMainThread) {
            ((MutableLiveData) lazy.getValue()).setValue(zoomValue);
        } else {
            ((MutableLiveData) lazy.getValue()).postValue(zoomValue);
        }
        UseCaseCameraRequestControl useCaseCameraRequestControl = this._requestControl;
        if (useCaseCameraRequestControl != null) {
            float zoomRatio = zoomValue.getZoomRatio();
            ZoomCompat zoomCompat = this.zoomCompat;
            RenderTreeStringKt.propagateTo(z2 ? zoomCompat.applyAsync(zoomRatio, useCaseCameraRequestControl) : zoomCompat.resetAsync(useCaseCameraRequestControl), completableDeferredImpl);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m("Camera is not active.", completableDeferredImpl);
        }
        return Futures.nonCancellationPropagating(DBUtil.getFuture(new StreamSharing$$ExternalSyntheticLambda1(completableDeferredImpl, 1)));
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        applyZoomState((ZoomValue) this.defaultZoomState$delegate.getValue(), true, true);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        ZoomValue zoomValue = (ZoomValue) ((MutableLiveData) this._zoomState$delegate.getValue()).getValue();
        if (zoomValue == null) {
            zoomValue = (ZoomValue) this.defaultZoomState$delegate.getValue();
        }
        applyZoomState(zoomValue, false, this.isInitialized || zoomValue.getZoomRatio() != 1.0f);
        this.isInitialized = true;
    }
}
