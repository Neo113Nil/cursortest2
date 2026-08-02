package androidx.camera.lifecycle;

import android.os.Trace;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.CameraInternal;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.common.util.StuckPlayerDetector;
import com.stripe.hcaptcha.HCaptcha;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class ProcessCameraProvider {
    public static final ProcessCameraProvider sAppInstance = new ProcessCameraProvider(new HCaptcha(2));
    public final HCaptcha lifecycleCameraProvider;

    public ProcessCameraProvider(HCaptcha hCaptcha) {
        this.lifecycleCameraProvider = hCaptcha;
    }

    public final LifecycleCamera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCase... useCaseArr) {
        int i;
        lifecycleOwner.getClass();
        cameraSelector.getClass();
        HCaptcha hCaptcha = this.lifecycleCameraProvider;
        UseCase[] useCaseArr2 = (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length);
        Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("CX:bindToLifecycle"));
        try {
            CameraX cameraX = (CameraX) hCaptcha.onFailureListeners;
            if (cameraX != null) {
                StuckPlayerDetector stuckPlayerDetector = cameraX.mCameraFactory;
                if (stuckPlayerDetector == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                CameraCoordinatorAdapter cameraCoordinatorAdapter = (CameraCoordinatorAdapter) stuckPlayerDetector.period;
                synchronized (cameraCoordinatorAdapter.lock) {
                    i = cameraCoordinatorAdapter.concurrentMode;
                }
            } else {
                i = 0;
            }
            if (i == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            HCaptcha.access$setCameraOperatingMode(hCaptcha, 1);
            return HCaptcha.bindToLifecycleInternal$default(hCaptcha, lifecycleOwner, cameraSelector, new LegacySessionConfig(ArraysKt___ArraysKt.filterNotNull(useCaseArr2), EmptyList.INSTANCE));
        } finally {
            Trace.endSection();
        }
    }

    public final ArrayList getAvailableCameraInfos() {
        HCaptcha hCaptcha = this.lifecycleCameraProvider;
        Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("CX:getAvailableCameraInfos"));
        try {
            ArrayList arrayList = new ArrayList();
            CameraX cameraX = (CameraX) hCaptcha.onFailureListeners;
            cameraX.getClass();
            Iterator it = cameraX.mCameraRepository.getCameras().iterator();
            while (it.hasNext()) {
                CameraInfo cameraInfo = ((CameraInternal) it.next()).getCameraInfo();
                cameraInfo.getClass();
                arrayList.add(cameraInfo);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    public final void unbindAll() {
        this.lifecycleCameraProvider.unbindAll();
    }

    public final LifecycleCamera bindToLifecycle(AppCompatActivity appCompatActivity, CameraSelector cameraSelector, UseCaseGroup useCaseGroup) {
        int i;
        HCaptcha hCaptcha = this.lifecycleCameraProvider;
        Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("CX:bindToLifecycle-UseCaseGroup"));
        try {
            CameraX cameraX = (CameraX) hCaptcha.onFailureListeners;
            if (cameraX != null) {
                StuckPlayerDetector stuckPlayerDetector = cameraX.mCameraFactory;
                if (stuckPlayerDetector != null) {
                    CameraCoordinatorAdapter cameraCoordinatorAdapter = (CameraCoordinatorAdapter) stuckPlayerDetector.period;
                    synchronized (cameraCoordinatorAdapter.lock) {
                        i = cameraCoordinatorAdapter.concurrentMode;
                    }
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            } else {
                i = 0;
            }
            if (i != 2) {
                HCaptcha.access$setCameraOperatingMode(hCaptcha, 1);
                List list = (List) useCaseGroup.mUseCases;
                list.getClass();
                List list2 = (List) useCaseGroup.mEffects;
                list2.getClass();
                return HCaptcha.bindToLifecycleInternal$default(hCaptcha, appCompatActivity, cameraSelector, new LegacySessionConfig(list, list2));
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }
}
