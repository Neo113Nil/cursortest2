package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.compat.AndroidFrameInfo;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.impl.utils.Threads;
import androidx.lifecycle.MutableLiveData;
import app.cash.badging.backend.RealBadger2$clear$2;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$registerInBackground$1;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class LowLightBoostControl implements UseCaseCameraControl {
    public final MutableLiveData _lowLightBoostState;
    public UseCaseCameraRequestControl _requestControl;
    public CompletableDeferredImpl _updateSignal;
    public Deferred checkFrameRateJob;
    public boolean isLowLightBoostOn;
    public final boolean isLowLightBoostSupported;
    public final AtomicInteger lowLightBoostStateAtomic;
    public final State3AControl state3AControl;
    public final UseCaseThreads threads;

    public LowLightBoostControl(CameraMetadata cameraMetadata, State3AControl state3AControl, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
        state3AControl.getClass();
        useCaseThreads.getClass();
        comboRequestListener.getClass();
        this.state3AControl = state3AControl;
        this.threads = useCaseThreads;
        boolean z = false;
        if (cameraMetadata != null) {
            CameraMetadata.Companion.getClass();
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
            key.getClass();
            int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata).get(key);
            if (iArr == null ? false : ArraysKt___ArraysKt.contains(iArr, 6)) {
                z = true;
            }
        }
        this.isLowLightBoostSupported = z;
        this._lowLightBoostState = new MutableLiveData(-1);
        this.lowLightBoostStateAtomic = new AtomicInteger(-1);
        if (z) {
            comboRequestListener.addListener(new Request.Listener() { // from class: androidx.camera.camera2.impl.LowLightBoostControl.1
                @Override // androidx.camera.camera2.pipe.Request.Listener
                /* renamed from: onTotalCaptureResult-CcXjc1I */
                public final void mo18onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
                    if (Build.VERSION.SDK_INT >= 35) {
                        LowLightBoostControl lowLightBoostControl = LowLightBoostControl.this;
                        if (lowLightBoostControl._requestControl == null || !lowLightBoostControl.isLowLightBoostOn) {
                            return;
                        }
                        AndroidFrameMetadata androidFrameMetadata = androidFrameInfo.result;
                        CaptureResult.Key key2 = CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE;
                        key2.getClass();
                        Integer num = (Integer) androidFrameMetadata.get(key2);
                        if (num != null) {
                            lowLightBoostControl.setLiveDataValue(lowLightBoostControl._lowLightBoostState, num.intValue() != 1 ? 0 : 1);
                        }
                    }
                }
            }, useCaseThreads.sequentialExecutor);
        }
    }

    public final void onSessionConfigChanged(List list) {
        list.getClass();
        if (this.isLowLightBoostSupported) {
            if (list.isEmpty()) {
                this.checkFrameRateJob = JobKt.CompletableDeferred(Boolean.FALSE);
            } else {
                this.checkFrameRateJob = JobKt.async$default(this.threads.sequentialScope, null, null, new RealBadger2$clear$2(this, list, (Continuation) null, 2), 3);
            }
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        CompletableDeferredImpl completableDeferredImpl = this._updateSignal;
        if (completableDeferredImpl != null) {
            CameraState$Type$EnumUnboxingLocalUtility.m("There is a new enableLowLightBoost being set", completableDeferredImpl);
        }
        this._updateSignal = null;
        setLowLightBoostAsync(false, true);
    }

    public final void setLiveDataValue(MutableLiveData mutableLiveData, int i) {
        if (this.lowLightBoostStateAtomic.getAndSet(i) != i) {
            if (Threads.isMainThread()) {
                mutableLiveData.setValue(Integer.valueOf(i));
            } else {
                mutableLiveData.postValue(Integer.valueOf(i));
            }
        }
    }

    public final CompletableDeferredImpl setLowLightBoostAsync(boolean z, boolean z2) {
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "LowLightBoostControl#setLowLightBoostAsync: lowLightBoost = " + z);
        }
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        if (this.isLowLightBoostSupported) {
            JobKt.launch$default(this.threads.sequentialScope, null, null, new RealGcmRegistrar$registerInBackground$1((Continuation) null, this, completableDeferredImpl, z, z2), 3);
            return completableDeferredImpl;
        }
        completableDeferredImpl.completeExceptionally(new IllegalStateException("Low Light Boost is not supported!"));
        return completableDeferredImpl;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        if (this.isLowLightBoostOn) {
            if (useCaseCameraRequestControl != null) {
                setLowLightBoostAsync(true, false);
            } else {
                setLiveDataValue(this._lowLightBoostState, 0);
            }
        }
    }
}
