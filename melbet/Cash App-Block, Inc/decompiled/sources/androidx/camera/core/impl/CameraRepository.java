package androidx.camera.core.impl;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.media3.common.util.StuckPlayerDetector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CameraRepository implements InternalCameraPresenceListener {
    public StuckPlayerDetector mCameraFactory;
    public CallbackToFutureAdapter$Completer mDeinitCompleter;
    public CallbackToFutureAdapter$SafeFuture mDeinitFuture;
    public final Object mCamerasLock = new Object();
    public final LinkedHashMap mCameras = new LinkedHashMap();
    public final HashSet mReleasingCameras = new HashSet();

    public final CameraInternal getCamera(String str) {
        CameraInternal cameraInternal;
        synchronized (this.mCamerasLock) {
            try {
                cameraInternal = (CameraInternal) this.mCameras.get(str);
                if (cameraInternal == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cameraInternal;
    }

    public final LinkedHashSet getCameras() {
        LinkedHashSet linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new LinkedHashSet(this.mCameras.values());
        }
        return linkedHashSet;
    }

    public final void init(StuckPlayerDetector stuckPlayerDetector) {
        this.mCameraFactory = stuckPlayerDetector;
        synchronized (this.mCamerasLock) {
            try {
                for (String str : stuckPlayerDetector.getAvailableCameraIds()) {
                    StringUtilsKt.d("CameraRepository", "Added camera: " + str);
                    CameraInternal cameraInternal = (CameraInternal) this.mCameras.put(str, stuckPlayerDetector.getCamera(str));
                    if (cameraInternal != null) {
                        cameraInternal.release();
                    }
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }

    @Override // androidx.camera.core.impl.InternalCameraPresenceListener
    public final void onCamerasUpdated(List list) {
        HashSet hashSet;
        HashMap hashMap = new HashMap();
        synchronized (this.mCamerasLock) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.mCameras.keySet());
        }
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                hashMap.put(str, this.mCameraFactory.getCamera(str));
            }
            synchronized (this.mCamerasLock) {
                try {
                    HashSet hashSet2 = new HashSet(this.mCameras.keySet());
                    hashSet2.removeAll(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((CameraInternal) this.mCameras.get((String) it2.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it3 = ((ArrayList) list).iterator();
                    while (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        if (this.mCameras.containsKey(str2)) {
                            linkedHashMap.put(str2, (CameraInternal) this.mCameras.get(str2));
                        } else {
                            linkedHashMap.put(str2, (CameraInternal) hashMap.get(str2));
                        }
                    }
                    this.mCameras.clear();
                    this.mCameras.putAll(linkedHashMap);
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        CameraInternal cameraInternal = (CameraInternal) it4.next();
                        if (cameraInternal != null) {
                            cameraInternal.onRemoved();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (CameraUnavailableException e) {
            throw new CameraUpdateException("Failed to create CameraInternal", e);
        }
    }
}
