package androidx.camera.camera2.impl;

import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Api35Compat;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.impl.utils.Threads;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.lifecycle.MutableLiveData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.Deferred;
import radiography.internal.RenderTreeStringKt;
import squareup.cash.earnings.EarningsTimeFrame;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class TorchControl implements UseCaseCameraControl {
    public UseCaseCameraRequestControl _requestControl;
    public final MutableLiveData _torchState;
    public final MutableLiveData _torchStrength;
    public CompletableDeferredImpl _updateTorchStateSignal;
    public CompletableDeferredImpl _updateTorchStrengthSignal;
    public final int defaultTorchStrength;
    public final boolean hasFlashUnit;
    public final boolean isTorchStrengthSupported;
    public final State3AControl state3AControl;
    public TorchMode torchMode;

    public final class TorchMode {
        public final int value;

        public /* synthetic */ TorchMode(int i) {
            this.value = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof TorchMode) {
                return this.value == ((TorchMode) obj).value;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.value);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TorchMode(value=", this.value, ')');
        }
    }

    public TorchControl(CameraPipeCameraProperties cameraPipeCameraProperties, State3AControl state3AControl, UseCaseThreads useCaseThreads) {
        cameraPipeCameraProperties.getClass();
        state3AControl.getClass();
        useCaseThreads.getClass();
        this.state3AControl = state3AControl;
        this.hasFlashUnit = EarningsTimeFrame.TimeFrame.isFlashAvailable$default(cameraPipeCameraProperties);
        boolean z = false;
        this._torchState = new MutableLiveData(0);
        CameraMetadata.Companion companion = CameraMetadata.Companion;
        CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
        companion.getClass();
        cameraMetadata.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && Api35Compat.isTorchStrengthSupported(cameraMetadata)) {
            z = true;
        }
        this.isTorchStrengthSupported = z;
        int defaultTorchStrengthLevel = i >= 35 ? Api35Compat.getDefaultTorchStrengthLevel(cameraMetadata) : 1;
        this.defaultTorchStrength = defaultTorchStrengthLevel;
        if (i >= 35) {
            Api35Compat.getMaxTorchStrengthLevel(cameraMetadata);
        }
        this._torchStrength = new MutableLiveData(Integer.valueOf(defaultTorchStrengthLevel));
    }

    public static CompletableDeferredImpl setTorchAsync$default(TorchControl torchControl, boolean z, int i) {
        return torchControl.m36setTorchAsyncOup_wC0$camera_camera2(z ? 1 : 0, (i & 2) != 0, false);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        CompletableDeferredImpl completableDeferredImpl = this._updateTorchStateSignal;
        if (completableDeferredImpl != null) {
            CameraState$Type$EnumUnboxingLocalUtility.m("There is a new enableTorch being set", completableDeferredImpl);
        }
        this._updateTorchStateSignal = null;
        CompletableDeferredImpl completableDeferredImpl2 = this._updateTorchStrengthSignal;
        if (completableDeferredImpl2 != null) {
            CameraState$Type$EnumUnboxingLocalUtility.m("There is a new torch strength being set", completableDeferredImpl2);
        }
        this._updateTorchStrengthSignal = null;
        if (this.torchMode != null) {
            m37updateTorchStateRaJ5uN0(0);
            setTorchAsync$default(this, false, 6);
            this.torchMode = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r2.intValue() == 1) goto L11;
     */
    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        if (this.torchMode != null) {
            Integer num = (Integer) this._torchState.getValue();
            boolean z = num != null;
            setTorchAsync$default(this, z, 4);
        }
    }

    /* renamed from: setTorchAsync-Oup_wC0$camera_camera2, reason: not valid java name */
    public final CompletableDeferredImpl m36setTorchAsyncOup_wC0$camera_camera2(int i, boolean z, boolean z2) {
        int i2;
        Deferred mo33setTorchOffAsyncMtizInI;
        State3AControl state3AControl = this.state3AControl;
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            StringBuilder sb = new StringBuilder("TorchControl#setTorchAsync: torch mode = ");
            sb.append((Object) ("TorchMode(value=" + i + ')'));
            Log.d("CXCP", sb.toString());
        }
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        if (!z2 && !this.hasFlashUnit) {
            completableDeferredImpl.completeExceptionally(new IllegalStateException("No flash unit"));
            return completableDeferredImpl;
        }
        UseCaseCameraRequestControl useCaseCameraRequestControl = this._requestControl;
        if (useCaseCameraRequestControl == null) {
            CameraState$Type$EnumUnboxingLocalUtility.m("Camera is not active.", completableDeferredImpl);
            return completableDeferredImpl;
        }
        m37updateTorchStateRaJ5uN0(i);
        CompletableDeferredImpl completableDeferredImpl2 = this._updateTorchStateSignal;
        if (z) {
            if (completableDeferredImpl2 != null) {
                CameraState$Type$EnumUnboxingLocalUtility.m("There is a new enableTorch being set", completableDeferredImpl2);
            }
            this._updateTorchStateSignal = null;
        } else if (completableDeferredImpl2 != null) {
            RenderTreeStringKt.propagateTo(completableDeferredImpl, completableDeferredImpl2);
        }
        this._updateTorchStateSignal = completableDeferredImpl;
        int i3 = 1;
        Integer num = i == 0 ? null : 1;
        synchronized (state3AControl.lock) {
            state3AControl._preferredAeMode = num;
        }
        state3AControl.update();
        List list = AeMode.values;
        AeMode m40fromIntOrNullkQd0u18 = AeMode.Companion.m40fromIntOrNullkQd0u18(state3AControl.getFinalSupportedAeMode());
        if (m40fromIntOrNullkQd0u18 != null) {
            i2 = m40fromIntOrNullkQd0u18.value;
        } else {
            if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                Log.w("CXCP", "TorchControl#setTorchAsync: Failed to convert ae mode of value " + state3AControl.getFinalSupportedAeMode() + " with AeMode.fromIntOrNull, fallback to AeMode.ON");
            }
            i2 = 1;
        }
        if (i == 0) {
            mo33setTorchOffAsyncMtizInI = useCaseCameraRequestControl.mo33setTorchOffAsyncMtizInI(i2);
        } else {
            if (i == 1) {
                Integer num2 = (Integer) this._torchStrength.getValue();
                if (num2 != null) {
                    updateTorchStrengthLevelAsync(num2.intValue());
                }
            } else {
                updateTorchStrengthLevelAsync(this.defaultTorchStrength);
            }
            mo33setTorchOffAsyncMtizInI = useCaseCameraRequestControl.setTorchOnAsync();
        }
        BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda1 = new BorderKt$$ExternalSyntheticLambda1(6);
        mo33setTorchOffAsyncMtizInI.getClass();
        mo33setTorchOffAsyncMtizInI.invokeOnCompletion(new MenuKt$$ExternalSyntheticLambda0(i3, mo33setTorchOffAsyncMtizInI, completableDeferredImpl, borderKt$$ExternalSyntheticLambda1));
        return completableDeferredImpl;
    }

    /* renamed from: updateTorchState-RaJ5uN0, reason: not valid java name */
    public final void m37updateTorchStateRaJ5uN0(int i) {
        this.torchMode = new TorchMode(i);
        int i2 = i != 1 ? 0 : 1;
        boolean isMainThread = Threads.isMainThread();
        MutableLiveData mutableLiveData = this._torchState;
        if (isMainThread) {
            mutableLiveData.setValue(Integer.valueOf(i2));
        } else {
            mutableLiveData.postValue(Integer.valueOf(i2));
        }
    }

    public final void updateTorchStrengthLevelAsync(int i) {
        Deferred parametersAsync$default;
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        if (Build.VERSION.SDK_INT < 35 || !this.isTorchStrengthSupported) {
            completableDeferredImpl.completeExceptionally(new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return;
        }
        CompletableDeferredImpl completableDeferredImpl2 = this._updateTorchStrengthSignal;
        if (completableDeferredImpl2 != null) {
            if (completableDeferredImpl2 != null) {
                CameraState$Type$EnumUnboxingLocalUtility.m("There is a new torch strength being set", completableDeferredImpl2);
            }
            this._updateTorchStrengthSignal = null;
        }
        this._updateTorchStrengthSignal = completableDeferredImpl;
        completableDeferredImpl.invokeOnCompletion(new ObjectList$$ExternalSyntheticLambda0(this, 2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        androidx.camera.camera2.compat.Api35Compat.setFlashStrengthLevel(linkedHashMap, i);
        UseCaseCameraRequestControl useCaseCameraRequestControl = this._requestControl;
        if (useCaseCameraRequestControl == null || (parametersAsync$default = UseCaseCameraRequestControl.setParametersAsync$default(useCaseCameraRequestControl, linkedHashMap)) == null) {
            CameraState$Type$EnumUnboxingLocalUtility.m("Camera is not active.", completableDeferredImpl);
        } else {
            RenderTreeStringKt.propagateTo(parametersAsync$default, completableDeferredImpl);
        }
    }
}
