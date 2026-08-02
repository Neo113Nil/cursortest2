package androidx.camera.lifecycle;

import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.RotationProvider;
import androidx.camera.core.impl.AdapterCameraInternal;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.room.TransactorKt;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class LifecycleCameraRepository {
    public CameraCoordinatorAdapter mCameraCoordinator;
    public final Object mLock = new Object();
    public final HashMap mCameraMap = new HashMap();
    public final HashMap mLifecycleObserverMap = new HashMap();
    public final ArrayDeque mActiveLifecycleOwners = new ArrayDeque();

    public final class LifecycleCameraRepositoryObserver implements LifecycleObserver {
        public final LifecycleCameraRepository mLifecycleCameraRepository;
        public final LifecycleOwner mLifecycleOwner;

        public LifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner, LifecycleCameraRepository lifecycleCameraRepository) {
            this.mLifecycleOwner = lifecycleOwner;
            this.mLifecycleCameraRepository = lifecycleCameraRepository;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.unregisterLifecycle(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart(LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.setActive(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop(LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.setInactive(lifecycleOwner);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:4:0x0003, B:6:0x001f, B:9:0x0024, B:11:0x0030, B:12:0x0032, B:15:0x0035, B:20:0x0089, B:21:0x008c, B:23:0x009c, B:24:0x009f, B:28:0x00a2, B:29:0x00a7, B:32:0x003b, B:33:0x003c, B:34:0x003d, B:35:0x0041, B:37:0x0047, B:40:0x005e, B:43:0x0068, B:44:0x006a, B:51:0x0076, B:53:0x007a, B:57:0x007e, B:58:0x0085, B:64:0x0088, B:46:0x006b, B:49:0x0073, B:60:0x0071, B:14:0x0033), top: B:3:0x0003, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindToLifecycleCamera(LifecycleCamera lifecycleCamera, LegacySessionConfig legacySessionConfig, CameraCoordinatorAdapter cameraCoordinatorAdapter) {
        boolean z;
        int i;
        synchronized (this.mLock) {
            try {
                TransactorKt.checkArgument(!((List) legacySessionConfig.useCases).isEmpty());
                this.mCameraCoordinator = cameraCoordinatorAdapter;
                LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
                pruneStaleLifecycleCameras(lifecycleOwner);
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
                if (lifecycleCameraRepositoryObserver == null) {
                    return;
                }
                Set set = (Set) this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver);
                CameraCoordinatorAdapter cameraCoordinatorAdapter2 = this.mCameraCoordinator;
                try {
                    if (cameraCoordinatorAdapter2 != null) {
                        synchronized (cameraCoordinatorAdapter2.lock) {
                            i = cameraCoordinatorAdapter2.concurrentMode;
                        }
                        if (i != 2) {
                        }
                        lifecycleCamera.bind(legacySessionConfig);
                        if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                            setActive(lifecycleOwner);
                        }
                        return;
                    }
                    lifecycleCamera.bind(legacySessionConfig);
                    if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    }
                    return;
                } catch (CameraUseCaseAdapter.CameraException e) {
                    throw new IllegalArgumentException(e);
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera2 = (LifecycleCamera) this.mCameraMap.get((AutoValue_LifecycleCameraRepository_Key) it.next());
                    lifecycleCamera2.getClass();
                    if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.getUseCases().isEmpty()) {
                        synchronized (lifecycleCamera2.mLock) {
                            LegacySessionConfig legacySessionConfig2 = lifecycleCamera2.mBoundSessionConfig;
                            z = legacySessionConfig2 == null ? false : legacySessionConfig2.isLegacy;
                        }
                        if (z || legacySessionConfig.isLegacy) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                        }
                        lifecycleCamera2.unbindAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final LifecycleCamera createLifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter, RotationProvider rotationProvider) {
        synchronized (this.mLock) {
            try {
                TransactorKt.checkArgument("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.mCameraMap.get(new AutoValue_LifecycleCameraRepository_Key(System.identityHashCode(lifecycleOwner), cameraUseCaseAdapter.mCameraIdentifier)) == null);
                LifecycleCamera lifecycleCamera = new LifecycleCamera(lifecycleOwner, cameraUseCaseAdapter, rotationProvider);
                if (((ArrayList) cameraUseCaseAdapter.getUseCases()).isEmpty()) {
                    lifecycleCamera.suspend();
                }
                if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    return lifecycleCamera;
                }
                registerCamera(lifecycleCamera);
                return lifecycleCamera;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final LifecycleCameraRepositoryObserver getLifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.mLifecycleObserverMap.keySet()) {
                    if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.mLifecycleOwner)) {
                        return lifecycleCameraRepositoryObserver;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean hasUseCaseBound(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
                if (lifecycleCameraRepositoryObserver == null) {
                    return false;
                }
                Iterator it = ((Set) this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.mCameraMap.get((AutoValue_LifecycleCameraRepository_Key) it.next());
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.getUseCases().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void pruneStaleLifecycleCameras(LifecycleOwner lifecycleOwner) {
        HashMap hashMap;
        AdapterCameraInternal adapterCameraInternal;
        LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
        if (lifecycleCameraRepositoryObserver == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Set set = (Set) this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver);
        Objects.requireNonNull(set);
        Iterator it = set.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.mCameraMap;
            if (!hasNext) {
                break;
            }
            AutoValue_LifecycleCameraRepository_Key autoValue_LifecycleCameraRepository_Key = (AutoValue_LifecycleCameraRepository_Key) it.next();
            LifecycleCamera lifecycleCamera = (LifecycleCamera) hashMap.get(autoValue_LifecycleCameraRepository_Key);
            if (lifecycleCamera != null) {
                CameraUseCaseAdapter cameraUseCaseAdapter = lifecycleCamera.mCameraUseCaseAdapter;
                if (cameraUseCaseAdapter.mCameraInternal.mCameraInternal.isRemoved() || ((adapterCameraInternal = cameraUseCaseAdapter.mSecondaryCameraInternal) != null && adapterCameraInternal.mCameraInternal.isRemoved())) {
                    hashSet.add(autoValue_LifecycleCameraRepository_Key);
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        StringUtilsKt.w("LifecycleCameraRepository", "Removing " + hashSet.size() + " stale LifecycleCamera(s).");
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            LifecycleCamera lifecycleCamera2 = (LifecycleCamera) hashMap.get((AutoValue_LifecycleCameraRepository_Key) it2.next());
            Objects.requireNonNull(lifecycleCamera2);
            unregisterCamera(lifecycleCamera2);
        }
    }

    public final void registerCamera(LifecycleCamera lifecycleCamera) {
        synchronized (this.mLock) {
            try {
                LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
                AutoValue_LifecycleCameraRepository_Key autoValue_LifecycleCameraRepository_Key = new AutoValue_LifecycleCameraRepository_Key(System.identityHashCode(lifecycleOwner), lifecycleCamera.mCameraUseCaseAdapter.mCameraIdentifier);
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
                Set hashSet = lifecycleCameraRepositoryObserver != null ? (Set) this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver) : new HashSet();
                hashSet.add(autoValue_LifecycleCameraRepository_Key);
                this.mCameraMap.put(autoValue_LifecycleCameraRepository_Key, lifecycleCamera);
                if (lifecycleCameraRepositoryObserver == null) {
                    LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver2 = new LifecycleCameraRepositoryObserver(lifecycleOwner, this);
                    this.mLifecycleObserverMap.put(lifecycleCameraRepositoryObserver2, hashSet);
                    lifecycleOwner.getLifecycle().addObserver(lifecycleCameraRepositoryObserver2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setActive(LifecycleOwner lifecycleOwner) {
        int i;
        synchronized (this.mLock) {
            try {
                if (hasUseCaseBound(lifecycleOwner)) {
                    if (this.mActiveLifecycleOwners.isEmpty()) {
                        this.mActiveLifecycleOwners.push(lifecycleOwner);
                    } else {
                        CameraCoordinatorAdapter cameraCoordinatorAdapter = this.mCameraCoordinator;
                        if (cameraCoordinatorAdapter != null) {
                            synchronized (cameraCoordinatorAdapter.lock) {
                                i = cameraCoordinatorAdapter.concurrentMode;
                            }
                            if (i != 2) {
                            }
                        }
                        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) this.mActiveLifecycleOwners.peek();
                        if (!lifecycleOwner.equals(lifecycleOwner2)) {
                            suspendUseCases(lifecycleOwner2);
                            this.mActiveLifecycleOwners.remove(lifecycleOwner);
                            this.mActiveLifecycleOwners.push(lifecycleOwner);
                        }
                    }
                    unsuspendUseCases(lifecycleOwner);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setInactive(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                this.mActiveLifecycleOwners.remove(lifecycleOwner);
                suspendUseCases(lifecycleOwner);
                if (!this.mActiveLifecycleOwners.isEmpty()) {
                    unsuspendUseCases((LifecycleOwner) this.mActiveLifecycleOwners.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void suspendUseCases(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
                if (lifecycleCameraRepositoryObserver == null) {
                    return;
                }
                Iterator it = ((Set) this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.mCameraMap.get((AutoValue_LifecycleCameraRepository_Key) it.next());
                    lifecycleCamera.getClass();
                    lifecycleCamera.suspend();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Set] */
    public final void unbindAll(HashSet hashSet) {
        HashSet hashSet2 = hashSet;
        synchronized (this.mLock) {
            if (hashSet == null) {
                try {
                    hashSet2 = this.mCameraMap.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.mCameraMap.get((AutoValue_LifecycleCameraRepository_Key) it.next());
                if (lifecycleCamera != null) {
                    lifecycleCamera.unbindAll();
                    setInactive(lifecycleCamera.getLifecycleOwner());
                }
            }
        }
    }

    public final void unregisterCamera(LifecycleCamera lifecycleCamera) {
        synchronized (this.mLock) {
            try {
                LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
                AutoValue_LifecycleCameraRepository_Key autoValue_LifecycleCameraRepository_Key = new AutoValue_LifecycleCameraRepository_Key(System.identityHashCode(lifecycleOwner), lifecycleCamera.mCameraUseCaseAdapter.mCameraIdentifier);
                this.mCameraMap.remove(autoValue_LifecycleCameraRepository_Key);
                HashSet hashSet = new HashSet();
                for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.mLifecycleObserverMap.keySet()) {
                    if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.mLifecycleOwner)) {
                        Set set = (Set) this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver);
                        set.remove(autoValue_LifecycleCameraRepository_Key);
                        if (set.isEmpty()) {
                            hashSet.add(lifecycleCameraRepositoryObserver.mLifecycleOwner);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    unregisterLifecycle((LifecycleOwner) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void unregisterLifecycle(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
                if (lifecycleCameraRepositoryObserver == null) {
                    return;
                }
                setInactive(lifecycleOwner);
                Iterator it = ((Set) this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver)).iterator();
                while (it.hasNext()) {
                    this.mCameraMap.remove((AutoValue_LifecycleCameraRepository_Key) it.next());
                }
                this.mLifecycleObserverMap.remove(lifecycleCameraRepositoryObserver);
                lifecycleCameraRepositoryObserver.mLifecycleOwner.getLifecycle().removeObserver(lifecycleCameraRepositoryObserver);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void unsuspendUseCases(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                Iterator it = ((Set) this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(lifecycleOwner))).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.mCameraMap.get((AutoValue_LifecycleCameraRepository_Key) it.next());
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.getUseCases().isEmpty()) {
                        lifecycleCamera.unsuspend();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
