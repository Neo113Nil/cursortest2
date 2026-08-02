package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.compat.workaround.TargetAspectRatio;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.StandaloneCoroutine;
import radiography.internal.RenderTreeStringKt;

/* loaded from: classes3.dex */
public final class FocusMeteringControl implements UseCaseCameraControl, UseCaseManager.RunningUseCasesChangeListener {
    public UseCaseCameraRequestControl _requestControl;
    public StandaloneCoroutine autoCancelJob;
    public final ArrayList availableAeModes;
    public final ArrayList availableAfModes;
    public final CameraPipeCameraProperties cameraProperties;
    public CompletableDeferredImpl cancelSignal;
    public StandaloneCoroutine focusTimeoutJob;
    public final Integer maxAeRegionCount;
    public final Integer maxAfRegionCount;
    public final Integer maxAwbRegionCount;
    public final TargetAspectRatio meteringRegionCorrection;
    public Rational previewAspectRatio;
    public final State3AControl state3AControl;
    public final boolean supportsAutoFocusTrigger;
    public final UseCaseThreads threads;
    public CompletableDeferredImpl updateSignal;
    public final ZoomCompat zoomCompat;

    public FocusMeteringControl(CameraPipeCameraProperties cameraPipeCameraProperties, TargetAspectRatio targetAspectRatio, State3AControl state3AControl, UseCaseThreads useCaseThreads, ZoomCompat zoomCompat) {
        ArrayList arrayList;
        Object obj;
        cameraPipeCameraProperties.getClass();
        state3AControl.getClass();
        useCaseThreads.getClass();
        this.cameraProperties = cameraPipeCameraProperties;
        this.meteringRegionCorrection = targetAspectRatio;
        this.state3AControl = state3AControl;
        this.threads = useCaseThreads;
        this.zoomCompat = zoomCompat;
        CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        key.getClass();
        Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata;
        camera2CameraMetadata.getClass();
        Object obj2 = camera2CameraMetadata.get(key);
        this.maxAfRegionCount = (Integer) (obj2 == null ? r8 : obj2);
        CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_MAX_REGIONS_AE;
        key2.getClass();
        Camera2CameraMetadata camera2CameraMetadata2 = (Camera2CameraMetadata) cameraMetadata;
        camera2CameraMetadata2.getClass();
        Object obj3 = camera2CameraMetadata2.get(key2);
        this.maxAeRegionCount = (Integer) (obj3 == null ? r8 : obj3);
        CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_MAX_REGIONS_AWB;
        key3.getClass();
        Camera2CameraMetadata camera2CameraMetadata3 = (Camera2CameraMetadata) cameraMetadata;
        camera2CameraMetadata3.getClass();
        Object obj4 = camera2CameraMetadata3.get(key3);
        this.maxAwbRegionCount = (Integer) (obj4 != null ? obj4 : 0);
        CameraMetadata.Companion.getClass();
        this.supportsAutoFocusTrigger = CameraMetadata.Companion.getSupportsAutoFocusTrigger(cameraMetadata);
        CameraCharacteristics.Key key4 = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key4.getClass();
        int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata).get(key4);
        ArrayList arrayList2 = null;
        if (iArr != null) {
            arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                List list = AeMode.values;
                arrayList.add(AeMode.Companion.m40fromIntOrNullkQd0u18(i));
            }
        } else {
            arrayList = null;
        }
        this.availableAeModes = arrayList;
        CameraMetadata cameraMetadata2 = this.cameraProperties.metadata;
        CameraCharacteristics.Key key5 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key5.getClass();
        int[] iArr2 = (int[]) ((Camera2CameraMetadata) cameraMetadata2).get(key5);
        if (iArr2 != null) {
            ArrayList arrayList3 = new ArrayList(iArr2.length);
            for (int i2 : iArr2) {
                Iterator it = AfMode.values.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((AfMode) obj).value == i2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                arrayList3.add((AfMode) obj);
            }
            arrayList2 = arrayList3;
        }
        this.availableAfModes = arrayList2;
    }

    public final Rational getDefaultAspectRatio() {
        Rational rational = this.previewAspectRatio;
        if (rational != null) {
            return rational;
        }
        ZoomCompat zoomCompat = this.zoomCompat;
        return new Rational(zoomCompat.getCropSensorRegion().width(), zoomCompat.getCropSensorRegion().height());
    }

    @Override // androidx.camera.camera2.impl.UseCaseManager.RunningUseCasesChangeListener
    public final void onRunningUseCasesChanged(LinkedHashSet linkedHashSet) {
        Size attachedSurfaceResolution;
        this.previewAspectRatio = null;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if ((useCase instanceof Preview) && (attachedSurfaceResolution = ((Preview) useCase).getAttachedSurfaceResolution()) != null) {
                this.previewAspectRatio = new Rational(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
            }
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        this.previewAspectRatio = null;
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        UseCaseCameraRequestControl useCaseCameraRequestControl = this._requestControl;
        if (useCaseCameraRequestControl == null) {
            CameraState$Type$EnumUnboxingLocalUtility.m("Camera is not active.", completableDeferredImpl);
            return;
        }
        StandaloneCoroutine standaloneCoroutine = this.focusTimeoutJob;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        StandaloneCoroutine standaloneCoroutine2 = this.autoCancelJob;
        if (standaloneCoroutine2 != null) {
            standaloneCoroutine2.cancel(null);
        }
        CompletableDeferredImpl completableDeferredImpl2 = this.cancelSignal;
        if (completableDeferredImpl2 != null) {
            CameraState$Type$EnumUnboxingLocalUtility.m("Cancelled by another cancelFocusAndMetering()", completableDeferredImpl2);
        }
        this.cancelSignal = completableDeferredImpl;
        CompletableDeferredImpl completableDeferredImpl3 = this.updateSignal;
        if (completableDeferredImpl3 != null) {
            CameraState$Type$EnumUnboxingLocalUtility.m("Cancelled by cancelFocusAndMetering()", completableDeferredImpl3);
        }
        State3AControl state3AControl = this.state3AControl;
        synchronized (state3AControl.lock) {
            state3AControl._preferredFocusMode = null;
        }
        state3AControl.update();
        RenderTreeStringKt.propagateTo(useCaseCameraRequestControl.cancelFocusAndMeteringAsync(), completableDeferredImpl);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
    }
}
