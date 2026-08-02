package androidx.camera.camera2.pipe.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraBackendId;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Api30Compat;
import androidx.camera.camera2.pipe.compat.Camera2Backend;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCache;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;

/* loaded from: classes3.dex */
public final class CameraDevicesImpl {
    public final CameraBackendsImpl cameraBackends;

    public CameraDevicesImpl(CameraBackendsImpl cameraBackendsImpl) {
        cameraBackendsImpl.getClass();
        this.cameraBackends = cameraBackendsImpl;
    }

    /* renamed from: awaitCameraIds-SeavPBo$default, reason: not valid java name */
    public static ArrayList m92awaitCameraIdsSeavPBo$default(CameraDevicesImpl cameraDevicesImpl) {
        ArrayList arrayList;
        Camera2DeviceCache camera2DeviceCache = cameraDevicesImpl.m95getCameraBackendSeavPBo().camera2DeviceCache;
        synchronized (camera2DeviceCache.lock) {
            arrayList = camera2DeviceCache.openableCameras;
        }
        if (arrayList == null) {
            arrayList = camera2DeviceCache.readCameraIds();
        }
        if (arrayList == null) {
            Log.w("CXCP", "Failed to load cameraIds from " + ((Object) CameraBackendId.m41toStringimpl("CXCP-Camera2")));
        }
        return arrayList;
    }

    /* renamed from: awaitCameraMetadata-FpsL5FU$default, reason: not valid java name */
    public static CameraMetadata m93awaitCameraMetadataFpsL5FU$default(CameraDevicesImpl cameraDevicesImpl, String str) {
        cameraDevicesImpl.getClass();
        str.getClass();
        return cameraDevicesImpl.m95getCameraBackendSeavPBo().camera2MetadataCache.m72awaitCameraMetadataEfqyGwQ(str);
    }

    /* renamed from: awaitConcurrentCameraIds-SeavPBo$default, reason: not valid java name */
    public static Set m94awaitConcurrentCameraIdsSeavPBo$default(CameraDevicesImpl cameraDevicesImpl) {
        Camera2DeviceCache camera2DeviceCache = cameraDevicesImpl.m95getCameraBackendSeavPBo().camera2DeviceCache;
        if (Build.VERSION.SDK_INT < 30) {
            camera2DeviceCache.getClass();
            return EmptySet.INSTANCE;
        }
        synchronized (camera2DeviceCache.lock) {
        }
        CameraManager cameraManager = (CameraManager) camera2DeviceCache.cameraManager.get();
        try {
            cameraManager.getClass();
            Set concurrentCameraIds = Api30Compat.getConcurrentCameraIds(cameraManager);
            Log.d("CXCP", "Loaded ConcurrentCameraIdsSet " + concurrentCameraIds);
            Set<Set> set = concurrentCameraIds;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
            for (Set<String> set2 : set) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                for (String str : set2) {
                    CameraId.m45constructorimpl(str);
                    arrayList2.add(new CameraId(str));
                }
                arrayList.add(CollectionsKt.toSet(arrayList2));
            }
            return CollectionsKt.toSet(arrayList);
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getConcurrentStreamingCameraIds", e);
            return null;
        }
    }

    /* renamed from: getCameraBackend-SeavPBo, reason: not valid java name */
    public final Camera2Backend m95getCameraBackendSeavPBo() {
        CameraBackendsImpl cameraBackendsImpl = this.cameraBackends;
        try {
            Trace.beginSection("getCameraBackend");
            cameraBackendsImpl.f1default.getClass();
            Camera2Backend m91getSG3A4s8 = cameraBackendsImpl.m91getSG3A4s8("CXCP-Camera2");
            if (m91getSG3A4s8 != null) {
                return m91getSG3A4s8;
            }
            throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) CameraBackendId.m41toStringimpl("CXCP-Camera2"))).toString());
        } finally {
            Trace.endSection();
        }
    }
}
