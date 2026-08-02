package androidx.camera.core.impl;

import android.graphics.Rect;
import android.util.Range;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.view.PreviewStreamStateObserver;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public interface CameraInfoInternal extends CameraInfo {
    void addSessionCaptureCallback(Executor executor, PreviewStreamStateObserver.AnonymousClass2 anonymousClass2);

    Set getAvailableCapabilities();

    Object getCameraCharacteristics();

    String getCameraId();

    Quirks getCameraQuirks();

    @Override // androidx.camera.core.CameraInfo
    default CameraSelector getCameraSelector() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new CameraFilter() { // from class: androidx.camera.core.impl.CameraInfoInternal$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                String cameraId = CameraInfoInternal.this.getCameraId();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CameraInfo cameraInfo = (CameraInfo) it.next();
                    TransactorKt.checkArgument(cameraInfo instanceof CameraInfoInternal);
                    if (((CameraInfoInternal) cameraInfo).getCameraId().equals(cameraId)) {
                        return Collections.singletonList(cameraInfo);
                    }
                }
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unable to find camera with id ", cameraId, " from list of available cameras."));
                return null;
            }
        });
        linkedHashSet.add(new LensFacingCameraFilter(getLensFacing()));
        return new CameraSelector(linkedHashSet);
    }

    EncoderProfilesProvider getEncoderProfilesProvider();

    default CameraInfoInternal getImplementation() {
        return this;
    }

    Rect getSensorRect();

    Set getSupportedDynamicRanges();

    List getSupportedHighSpeedResolutions();

    List getSupportedHighSpeedResolutionsFor(Range range);

    Set getSupportedOutputFormats();

    List getSupportedResolutions(int i);

    Timebase getTimebase();

    boolean isExternalCamera();

    boolean isHighSpeedSupported();

    boolean isPreviewStabilizationSupported();

    boolean isVideoStabilizationSupported();

    void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback);

    default void setCameraUseCaseAdapterProvider(n nVar) {
        nVar.getClass();
        UseCaseAdditionSimulator.cameraUseCaseAdapterProvider = nVar;
    }
}
