package androidx.camera.camera2.adapter;

import android.util.Log;
import androidx.camera.camera2.impl.UseCaseCameraImpl;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$3;
import com.fillr.n;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.coroutines.JobKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CameraInternalAdapter implements CameraInternal {
    public final CameraControlInternal cameraController;
    public final String cameraId;
    public final CameraInfoInternal cameraInfo;
    public final CameraStateAdapter cameraStateAdapter;
    public CameraConfig coreCameraConfig;
    public final int debugId;
    public final AtomicBoolean isRemoved;
    public final UseCaseThreads threads;
    public final UseCaseManager useCaseManager;

    public CameraInternalAdapter(n.a aVar, UseCaseManager useCaseManager, CameraInfoInternal cameraInfoInternal, CameraControlInternal cameraControlInternal, UseCaseThreads useCaseThreads, CameraStateAdapter cameraStateAdapter) {
        aVar.getClass();
        useCaseManager.getClass();
        cameraInfoInternal.getClass();
        cameraControlInternal.getClass();
        useCaseThreads.getClass();
        cameraStateAdapter.getClass();
        this.useCaseManager = useCaseManager;
        this.cameraInfo = cameraInfoInternal;
        this.cameraController = cameraControlInternal;
        this.threads = useCaseThreads;
        this.cameraStateAdapter = cameraStateAdapter;
        String str = aVar.b;
        this.cameraId = str;
        CameraConfigs.DefaultCameraConfig defaultCameraConfig = CameraConfigs.DEFAULT_CAMERA_CONFIG;
        defaultCameraConfig.getClass();
        this.coreCameraConfig = defaultCameraConfig;
        AtomicInt atomicInt = CameraInternalAdapterKt.cameraAdapterIds;
        atomicInt.getClass();
        this.debugId = AtomicInt.FU.incrementAndGet(atomicInt);
        this.isRemoved = AtomicFU.atomic(false);
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "Created " + this + " for " + ((Object) CameraId.m46toStringimpl(str)));
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void attachUseCases(Collection collection) {
        collection.getClass();
        this.useCaseManager.attach(CollectionsKt.toList(collection));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void detachUseCases(ArrayList arrayList) {
        this.useCaseManager.detach(CollectionsKt.toList(arrayList));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraControlInternal getCameraControlInternal() {
        return this.cameraController;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraInfoInternal getCameraInfoInternal() {
        return this.cameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final Observable getCameraState() {
        return this.cameraStateAdapter.cameraInternalState;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraConfig getExtendedConfig() {
        return this.coreCameraConfig;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final boolean isRemoved() {
        return this.isRemoved.getValue();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void onRemoved() {
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", this + " received removed signal. Cleaning up.");
        }
        if (this.isRemoved.compareAndSet()) {
            JobKt.launch$default(this.threads.scope, null, null, new CameraInternalAdapter$release$1(this, null, 1), 3);
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseActive(UseCase useCase) {
        this.useCaseManager.activate(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseInactive(UseCase useCase) {
        UseCaseManager useCaseManager = this.useCaseManager;
        useCaseManager.getClass();
        synchronized (useCaseManager.lock) {
            if (useCaseManager.activeUseCases.remove(useCase)) {
                useCaseManager.refreshRunningUseCases();
            }
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseReset(UseCase useCase) {
        UseCaseManager useCaseManager = this.useCaseManager;
        useCaseManager.getClass();
        synchronized (useCaseManager.lock) {
            if (useCaseManager.attachedUseCases.contains(useCase)) {
                useCaseManager.refreshAttachedUseCases(useCaseManager.attachedUseCases);
            }
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseUpdated(UseCase useCase) {
        UseCaseManager useCaseManager = this.useCaseManager;
        useCaseManager.getClass();
        synchronized (useCaseManager.lock) {
            if (useCaseManager.attachedUseCases.contains(useCase)) {
                useCaseManager.refreshRunningUseCases();
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final ListenableFuture release() {
        return DBUtil.getFuture(new StreamSharing$$ExternalSyntheticLambda1(JobKt.launch$default(this.threads.scope, null, null, new CameraInternalAdapter$release$1(this, null, 0), 3), 1));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setActiveResumingMode(boolean z) {
        UseCaseManager useCaseManager = this.useCaseManager;
        synchronized (useCaseManager.lock) {
            useCaseManager.activeResumeEnabled = z;
            UseCaseCameraImpl camera = useCaseManager.getCamera();
            if (camera != null) {
                JobKt.launch$default(camera.threads.sequentialScope, null, null, new RealBadger2$scheduleBadgeClearingWork$3((Continuation) null, camera, z), 3);
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setExtendedConfig(CameraConfig cameraConfig) {
        CameraConfig cameraConfig2;
        if (cameraConfig == null) {
            cameraConfig2 = CameraConfigs.DEFAULT_CAMERA_CONFIG;
            cameraConfig2.getClass();
        } else {
            cameraConfig2 = cameraConfig;
        }
        this.coreCameraConfig = cameraConfig2;
        if (cameraConfig != null) {
            cameraConfig.getSessionProcessor();
        }
        synchronized (this.useCaseManager.lock) {
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setPrimary(boolean z) {
        UseCaseManager useCaseManager = this.useCaseManager;
        synchronized (useCaseManager.lock) {
            useCaseManager.isPrimary = z;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInternalAdapter<");
        sb.append((Object) CameraId.m46toStringimpl(this.cameraId));
        sb.append('(');
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.debugId, ")>", sb);
    }
}
