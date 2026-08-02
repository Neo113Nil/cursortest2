package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda0;
import androidx.camera.core.processing.util.AutoValue_OutConfig;
import androidx.room.TransactorKt;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class VirtualCameraAdapter implements UseCase.StateChangeCallback {
    public final HashSet mChildren;
    public final HashSet mChildrenConfigs;
    public final HashMap mChildrenConfigsMap;
    public final CameraInternal mParentCamera;
    public final ResolutionsMerger mResolutionsMerger;
    public final CameraInternal mSecondaryParentCamera;
    public final ResolutionsMerger mSecondaryResolutionsMerger;
    public final UseCaseConfigFactory mUseCaseConfigFactory;
    public final HashMap mChildrenEdges = new HashMap();
    public final HashMap mChildrenVirtualCameras = new HashMap();
    public final HashMap mChildrenActiveState = new HashMap();
    public final MetadataImageReader.AnonymousClass1 mParentMetadataCallback = new MetadataImageReader.AnonymousClass1(this);

    public VirtualCameraAdapter(CameraInternal cameraInternal, CameraInternal cameraInternal2, HashSet hashSet, UseCaseConfigFactory useCaseConfigFactory, StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1) {
        this.mParentCamera = cameraInternal;
        this.mSecondaryParentCamera = cameraInternal2;
        this.mUseCaseConfigFactory = useCaseConfigFactory;
        this.mChildren = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            hashMap.put(useCase, useCase.mergeConfigs(cameraInternal.getCameraInfoInternal(), null, useCase.getDefaultConfig(true, useCaseConfigFactory)));
        }
        this.mChildrenConfigsMap = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.mChildrenConfigs = hashSet2;
        this.mResolutionsMerger = new ResolutionsMerger(cameraInternal, hashSet2);
        if (this.mSecondaryParentCamera != null) {
            this.mSecondaryResolutionsMerger = new ResolutionsMerger(this.mSecondaryParentCamera, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            UseCase useCase2 = (UseCase) it2.next();
            this.mChildrenActiveState.put(useCase2, Boolean.FALSE);
            this.mChildrenVirtualCameras.put(useCase2, new VirtualCamera(cameraInternal, this, streamSharing$$ExternalSyntheticLambda1));
        }
    }

    public static void forceSetProvider(SurfaceEdge surfaceEdge, DeferrableSurface deferrableSurface, SessionConfig sessionConfig) {
        surfaceEdge.invalidate();
        try {
            Threads.checkMainThread();
            surfaceEdge.checkNotClosed();
            SurfaceEdge.SettableSurface settableSurface = surfaceEdge.mSettableSurface;
            Objects.requireNonNull(settableSurface);
            settableSurface.setProvider(deferrableSurface, new SurfaceEdge$$ExternalSyntheticLambda0(settableSurface, 0));
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            SessionConfig.ErrorListener errorListener = sessionConfig.mErrorListener;
            if (errorListener != null) {
                errorListener.onError(sessionConfig);
            }
        }
    }

    public static DeferrableSurface getChildSurface(UseCase useCase) {
        List surfaces = useCase instanceof ImageCapture ? useCase.mAttachedSessionConfig.getSurfaces() : Collections.unmodifiableList(useCase.mAttachedSessionConfig.mRepeatingCaptureConfig.mSurfaces);
        TransactorKt.checkState(null, surfaces.size() <= 1);
        if (surfaces.size() == 1) {
            return (DeferrableSurface) surfaces.get(0);
        }
        return null;
    }

    public final AutoValue_OutConfig calculateOutConfig(UseCase useCase, ResolutionsMerger resolutionsMerger, CameraInternal cameraInternal, SurfaceEdge surfaceEdge, int i, boolean z) {
        int sensorRotationDegrees = cameraInternal.getCameraInfo().getSensorRotationDegrees(i);
        boolean isMirrored = TransformUtils.isMirrored(surfaceEdge.mSensorToBufferTransform);
        UseCaseConfig useCaseConfig = (UseCaseConfig) this.mChildrenConfigsMap.get(useCase);
        Objects.requireNonNull(useCaseConfig);
        PreferredChildSize preferredChildSize = resolutionsMerger.getPreferredChildSize(useCaseConfig, surfaceEdge.mCropRect, TransformUtils.getRotationDegrees(surfaceEdge.mSensorToBufferTransform), z);
        Rect rect = preferredChildSize.cropRectBeforeScaling;
        Size size = preferredChildSize.childSizeToScale;
        int within360 = TransformUtils.within360((surfaceEdge.mRotationDegrees + cameraInternal.getCameraInfo().getSensorRotationDegrees(((ImageOutputConfig) useCase.mCurrentConfig).getTargetRotation(0))) - sensorRotationDegrees);
        return new AutoValue_OutConfig(UUID.randomUUID(), useCase instanceof Preview ? 1 : useCase instanceof ImageCapture ? 4 : 2, useCase instanceof ImageCapture ? 256 : 34, rect, TransformUtils.rotateSize(within360, size), within360, useCase.isMirroringRequired(cameraInternal) ^ isMirrored);
    }

    public final HashMap getSelectedChildSizes(SurfaceEdge surfaceEdge, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator it = this.mChildren.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            UseCaseConfig useCaseConfig = (UseCaseConfig) this.mChildrenConfigsMap.get(useCase);
            Objects.requireNonNull(useCaseConfig);
            Size size = this.mResolutionsMerger.getPreferredChildSize(useCaseConfig, surfaceEdge.mCropRect, TransformUtils.getRotationDegrees(surfaceEdge.mSensorToBufferTransform), z).originalSelectedChildSize;
            hashMap.put(useCase, size);
            StringUtilsKt.d("VirtualCameraAdapter", "Selected child size: " + size + ", useCase: " + useCase);
        }
        return hashMap;
    }

    public final SurfaceEdge getUseCaseEdge(UseCase useCase) {
        SurfaceEdge surfaceEdge = (SurfaceEdge) this.mChildrenEdges.get(useCase);
        Objects.requireNonNull(surfaceEdge);
        return surfaceEdge;
    }

    public final boolean isUseCaseActive(UseCase useCase) {
        Boolean bool = (Boolean) this.mChildrenActiveState.get(useCase);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseActive(UseCase useCase) {
        Threads.checkMainThread();
        if (isUseCaseActive(useCase)) {
            return;
        }
        this.mChildrenActiveState.put(useCase, Boolean.TRUE);
        DeferrableSurface childSurface = getChildSurface(useCase);
        if (childSurface != null) {
            forceSetProvider(getUseCaseEdge(useCase), childSurface, useCase.mAttachedSessionConfig);
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseInactive(UseCase useCase) {
        Threads.checkMainThread();
        if (isUseCaseActive(useCase)) {
            this.mChildrenActiveState.put(useCase, Boolean.FALSE);
            SurfaceEdge useCaseEdge = getUseCaseEdge(useCase);
            Threads.checkMainThread();
            useCaseEdge.checkNotClosed();
            useCaseEdge.mSettableSurface.close();
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseReset(UseCase useCase) {
        DeferrableSurface childSurface;
        Threads.checkMainThread();
        SurfaceEdge useCaseEdge = getUseCaseEdge(useCase);
        if (isUseCaseActive(useCase) && (childSurface = getChildSurface(useCase)) != null) {
            forceSetProvider(useCaseEdge, childSurface, useCase.mAttachedSessionConfig);
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseUpdated(UseCase useCase) {
        Threads.checkMainThread();
        if (isUseCaseActive(useCase)) {
            SurfaceEdge useCaseEdge = getUseCaseEdge(useCase);
            DeferrableSurface childSurface = getChildSurface(useCase);
            if (childSurface != null) {
                forceSetProvider(useCaseEdge, childSurface, useCase.mAttachedSessionConfig);
                return;
            }
            Threads.checkMainThread();
            useCaseEdge.checkNotClosed();
            useCaseEdge.mSettableSurface.close();
        }
    }

    public final void setChildrenEdges(HashMap hashMap, HashMap hashMap2) {
        HashMap hashMap3 = this.mChildrenEdges;
        hashMap3.clear();
        hashMap3.putAll(hashMap);
        for (Map.Entry entry : hashMap3.entrySet()) {
            UseCase useCase = (UseCase) entry.getKey();
            SurfaceEdge surfaceEdge = (SurfaceEdge) entry.getValue();
            useCase.setViewPortCropRect(surfaceEdge.mCropRect);
            useCase.setSensorToBufferTransformMatrix(surfaceEdge.mSensorToBufferTransform);
            SubtreeManager builder = surfaceEdge.mStreamSpec.toBuilder();
            Size size = (Size) hashMap2.get(useCase);
            if (size != null) {
                builder.contextForChildren = size;
            }
            useCase.updateSuggestedStreamSpec(builder.build(), null);
            useCase.notifyState();
        }
    }
}
