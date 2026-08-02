package androidx.camera.camera2.pipe.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Permissions;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.video.Recorder;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Camera2MetadataCache implements Camera2MetadataProvider {
    public final ArrayMap cache;
    public final Recorder.AnonymousClass4 cameraMetadataConfig;
    public final Context cameraPipeContext;
    public final ArrayMap extensionCache;
    public final ArrayMap extensionCharacteristicsCache;
    public final Permissions permissions;
    public final Threads threads;
    public final SystemTimeSource timeSource;

    public Camera2MetadataCache(Context context, Threads threads, Permissions permissions, Recorder.AnonymousClass4 anonymousClass4, SystemTimeSource systemTimeSource) {
        threads.getClass();
        permissions.getClass();
        anonymousClass4.getClass();
        systemTimeSource.getClass();
        this.cameraPipeContext = context;
        this.threads = threads;
        this.permissions = permissions;
        this.cameraMetadataConfig = anonymousClass4;
        this.timeSource = systemTimeSource;
        this.cache = new ArrayMap();
        this.extensionCache = new ArrayMap();
        this.extensionCharacteristicsCache = new ArrayMap();
    }

    /* renamed from: access$createCameraExtensionMetadata-RzXb1QE, reason: not valid java name */
    public static final Camera2CameraExtensionMetadata m70access$createCameraExtensionMetadataRzXb1QE(Camera2MetadataCache camera2MetadataCache, String str, boolean z, int i) {
        String str2;
        camera2MetadataCache.timeSource.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) CameraId.m46toStringimpl(str)) + "#readCameraExtensionMetadata");
            try {
                Log.d("CXCP", "Loading extension metadata for " + ((Object) CameraId.m46toStringimpl(str)));
                CameraExtensionCharacteristics m73getCameraExtensionCharacteristicsEfqyGwQ = camera2MetadataCache.m73getCameraExtensionCharacteristicsEfqyGwQ(str);
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                Camera2CameraExtensionMetadata camera2CameraExtensionMetadata = new Camera2CameraExtensionMetadata(str, i, m73getCameraExtensionCharacteristicsEfqyGwQ, emptyMap);
                long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                if (!z) {
                    str2 = "";
                } else {
                    if (!z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = " (redacted)";
                }
                Log.i("CXCP", "Loaded extension metadata for " + ((Object) CameraId.m46toStringimpl(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(elapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
                return camera2CameraExtensionMetadata;
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to load extension metadata for " + ((Object) CameraId.m46toStringimpl(str)) + '!', th);
            }
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: access$createCameraMetadata-0r8Bogc, reason: not valid java name */
    public static final Camera2CameraMetadata m71access$createCameraMetadata0r8Bogc(Camera2MetadataCache camera2MetadataCache, String str, boolean z) {
        String str2;
        Throwable th;
        CameraCharacteristics cameraCharacteristics;
        Iterable iterable;
        Set plus;
        EmptyMap emptyMap;
        String str3;
        Recorder.AnonymousClass4 anonymousClass4 = camera2MetadataCache.cameraMetadataConfig;
        camera2MetadataCache.timeSource.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) CameraId.m46toStringimpl(str)) + "#readCameraMetadata");
            try {
                Log.d("CXCP", "Loading metadata for " + ((Object) CameraId.m46toStringimpl(str)));
                Object systemService = camera2MetadataCache.cameraPipeContext.getSystemService("camera");
                systemService.getClass();
                cameraCharacteristics = ((CameraManager) systemService).getCameraCharacteristics(str);
                cameraCharacteristics.getClass();
            } catch (Throwable th2) {
                th = th2;
                str2 = str;
            }
            try {
                if (Build.VERSION.SDK_INT < 32 || cameraCharacteristics.get(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP) == null) {
                    iterable = (Set) ((Map) anonymousClass4.this$0).get(new CameraId(str));
                } else {
                    Set set = (Set) ((Map) anonymousClass4.this$0).get(new CameraId(str));
                    if (set == null) {
                        set = EmptySet.INSTANCE;
                    }
                    iterable = SetsKt___SetsKt.plus(set, CameraCharacteristics.SENSOR_ORIENTATION);
                }
                plus = iterable == null ? (Set) anonymousClass4.val$audioErrorConsumer : SetsKt___SetsKt.plus((Set) anonymousClass4.val$audioErrorConsumer, iterable);
                emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                str2 = str;
            } catch (Throwable th3) {
                th = th3;
                str2 = str;
                throw new IllegalStateException("Failed to load metadata for " + ((Object) CameraId.m46toStringimpl(str2)) + '!', th);
            }
            try {
                Camera2CameraMetadata camera2CameraMetadata = new Camera2CameraMetadata(str2, cameraCharacteristics, camera2MetadataCache, emptyMap, plus);
                long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                if (!z) {
                    str3 = "";
                } else {
                    if (!z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str3 = " (redacted)";
                }
                Log.i("CXCP", "Loaded metadata for " + ((Object) CameraId.m46toStringimpl(str2)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(elapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str3);
                return camera2CameraMetadata;
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw new IllegalStateException("Failed to load metadata for " + ((Object) CameraId.m46toStringimpl(str2)) + '!', th);
            }
        } finally {
            Trace.endSection();
        }
    }

    public static final boolean access$isMetadataRedacted(Camera2MetadataCache camera2MetadataCache) {
        boolean z;
        Permissions permissions = camera2MetadataCache.permissions;
        permissions.getClass();
        if (Intrinsics.areEqual(Build.FINGERPRINT, "robolectric")) {
            z = true;
        } else {
            if (!permissions._hasCameraPermission) {
                Trace.beginSection("CXCP#checkCameraPermission");
                if (permissions.cameraPipeContext.checkSelfPermission("android.permission.CAMERA") == 0) {
                    permissions._hasCameraPermission = true;
                }
                Trace.endSection();
            }
            z = permissions._hasCameraPermission;
        }
        return !z;
    }

    /* renamed from: awaitCameraMetadata-EfqyGwQ, reason: not valid java name */
    public final CameraMetadata m72awaitCameraMetadataEfqyGwQ(String str) {
        CameraMetadata cameraMetadata;
        str.getClass();
        try {
            Trace.beginSection(((Object) CameraId.m46toStringimpl(str)) + "#awaitMetadata");
            synchronized (this.cache) {
                cameraMetadata = (CameraMetadata) this.cache.get(str);
                if (cameraMetadata == null) {
                    if (access$isMetadataRedacted(this)) {
                        cameraMetadata = m71access$createCameraMetadata0r8Bogc(this, str, true);
                    } else {
                        cameraMetadata = m71access$createCameraMetadata0r8Bogc(this, str, false);
                        this.cache.put(str, cameraMetadata);
                    }
                }
            }
            return cameraMetadata;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: getCameraExtensionCharacteristics-EfqyGwQ, reason: not valid java name */
    public final CameraExtensionCharacteristics m73getCameraExtensionCharacteristicsEfqyGwQ(String str) {
        synchronized (this.extensionCharacteristicsCache) {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.extensionCharacteristicsCache.get(str);
            if (cameraExtensionCharacteristics != null) {
                return cameraExtensionCharacteristics;
            }
            Log.d("CXCP", "Retrieving CameraExtensionCharacteristics for " + ((Object) CameraId.m46toStringimpl(str)));
            Object systemService = this.cameraPipeContext.getSystemService("camera");
            systemService.getClass();
            str.getClass();
            CameraExtensionCharacteristics cameraExtensionCharacteristics2 = ((CameraManager) systemService).getCameraExtensionCharacteristics(str);
            cameraExtensionCharacteristics2.getClass();
            return cameraExtensionCharacteristics2;
        }
    }
}
