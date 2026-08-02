package androidx.camera.lifecycle;

import android.util.Range;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.RotationProvider;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bumptech.glide.GlideBuilder$1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class LifecycleCamera implements LifecycleObserver, Camera {
    public final CameraUseCaseAdapter mCameraUseCaseAdapter;
    public final LifecycleOwner mLifecycleOwner;
    public final Object mLock = new Object();
    public boolean mSuspended = false;
    public LegacySessionConfig mBoundSessionConfig = null;

    public LifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter, RotationProvider rotationProvider) {
        this.mLifecycleOwner = lifecycleOwner;
        this.mCameraUseCaseAdapter = cameraUseCaseAdapter;
        if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.attachUseCases();
        } else {
            cameraUseCaseAdapter.detachUseCases();
        }
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public final void bind(LegacySessionConfig legacySessionConfig) {
        synchronized (this.mLock) {
            try {
                LegacySessionConfig legacySessionConfig2 = this.mBoundSessionConfig;
                if (legacySessionConfig2 == null) {
                    this.mBoundSessionConfig = legacySessionConfig;
                } else {
                    boolean z = legacySessionConfig.isLegacy;
                    boolean z2 = legacySessionConfig2.isLegacy;
                    if (z) {
                        if (!z2) {
                            throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                        }
                        ArrayList arrayList = new ArrayList((List) this.mBoundSessionConfig.useCases);
                        arrayList.addAll((List) legacySessionConfig.useCases);
                        this.mBoundSessionConfig = new LegacySessionConfig(arrayList, (List) legacySessionConfig.effects);
                    } else {
                        if (z2) {
                            throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                        }
                        this.mBoundSessionConfig = legacySessionConfig;
                        CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
                        cameraUseCaseAdapter.removeUseCases((ArrayList) cameraUseCaseAdapter.getUseCases());
                    }
                }
                synchronized (this.mCameraUseCaseAdapter.mLock) {
                }
                CameraUseCaseAdapter cameraUseCaseAdapter2 = this.mCameraUseCaseAdapter;
                List list = (List) legacySessionConfig.effects;
                synchronized (cameraUseCaseAdapter2.mLock) {
                    cameraUseCaseAdapter2.mEffects = list;
                }
                synchronized (this.mCameraUseCaseAdapter.mLock) {
                }
                CameraUseCaseAdapter cameraUseCaseAdapter3 = this.mCameraUseCaseAdapter;
                Range range = (Range) legacySessionConfig.frameRateRange;
                synchronized (cameraUseCaseAdapter3.mLock) {
                    cameraUseCaseAdapter3.mFrameRate = range;
                }
                CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) getCameraInfo();
                cameraInfoInternal.getClass();
                ResolvedFeatureGroup resolveFeatureGroup$default = GlideBuilder$1.resolveFeatureGroup$default(legacySessionConfig, cameraInfoInternal);
                ((HandlerScheduledExecutorService) legacySessionConfig.featureSelectionListenerExecutor).execute(new Recorder$$ExternalSyntheticLambda15(6, resolveFeatureGroup$default, legacySessionConfig));
                this.mCameraUseCaseAdapter.addUseCases((List) legacySessionConfig.useCases, resolveFeatureGroup$default);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public final CameraControlInternal getCameraControl() {
        return this.mCameraUseCaseAdapter.mCameraInternal.mAdapterCameraControl;
    }

    @Override // androidx.camera.core.Camera
    public final CameraInfo getCameraInfo() {
        return this.mCameraUseCaseAdapter.mCameraInternal.mAdapterCameraInfo;
    }

    public final LifecycleOwner getLifecycleOwner() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.mLock) {
            lifecycleOwner = this.mLifecycleOwner;
        }
        return lifecycleOwner;
    }

    public final List getUseCases() {
        List unmodifiableList;
        synchronized (this.mLock) {
            unmodifiableList = Collections.unmodifiableList(this.mCameraUseCaseAdapter.getUseCases());
        }
        return unmodifiableList;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases((ArrayList) cameraUseCaseAdapter.getUseCases());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
        this.mCameraUseCaseAdapter.mCameraInternal.setActiveResumingMode(false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        this.mCameraUseCaseAdapter.mCameraInternal.setActiveResumingMode(true);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                if (!this.mSuspended) {
                    this.mCameraUseCaseAdapter.attachUseCases();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                if (!this.mSuspended) {
                    this.mCameraUseCaseAdapter.detachUseCases();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void suspend() {
        synchronized (this.mLock) {
            try {
                if (this.mSuspended) {
                    return;
                }
                onStop(this.mLifecycleOwner);
                this.mSuspended = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void unbindAll() {
        synchronized (this.mLock) {
            List useCases = this.mCameraUseCaseAdapter.getUseCases();
            this.mCameraUseCaseAdapter.removeUseCases((ArrayList) useCases);
            Iterator it = ((ArrayList) useCases).iterator();
            while (it.hasNext()) {
                UseCase useCase = (UseCase) it.next();
                if (useCase.isAutoRotationSupported()) {
                    synchronized (useCase.mRotationProviderLock) {
                    }
                }
            }
            this.mBoundSessionConfig = null;
        }
    }

    public final void unsuspend() {
        synchronized (this.mLock) {
            try {
                if (this.mSuspended) {
                    this.mSuspended = false;
                    if (this.mLifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        onStart(this.mLifecycleOwner);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
