package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.RequestMetadata;
import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class AndroidFrameInfo implements FrameInfo {
    public final AndroidFrameMetadata result;
    public final TotalCaptureResult totalCaptureResult;

    public AndroidFrameInfo(TotalCaptureResult totalCaptureResult, String str, RequestMetadata requestMetadata) {
        Map<String, CaptureResult> physicalCameraResults;
        totalCaptureResult.getClass();
        str.getClass();
        requestMetadata.getClass();
        this.totalCaptureResult = totalCaptureResult;
        this.result = new AndroidFrameMetadata(totalCaptureResult, str);
        try {
            Trace.beginSection("physicalCaptureResults");
            if (Build.VERSION.SDK_INT >= 31) {
                physicalCameraResults = Api31Compat.getPhysicalCameraTotalResults(totalCaptureResult);
                physicalCameraResults.getClass();
            } else {
                physicalCameraResults = totalCaptureResult.getPhysicalCameraResults();
            }
            if (physicalCameraResults != null && !physicalCameraResults.isEmpty()) {
                ArrayMap arrayMap = new ArrayMap(physicalCameraResults.size());
                for (Map.Entry<String, CaptureResult> entry : physicalCameraResults.entrySet()) {
                    String key = entry.getKey();
                    CameraId.m45constructorimpl(key);
                    arrayMap.put(new CameraId(key), new AndroidFrameMetadata(entry.getValue(), key));
                }
            }
            MapsKt__MapsKt.emptyMap();
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    public final AndroidFrameMetadata getMetadata() {
        return this.result;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameInfo(camera: ");
        AndroidFrameMetadata androidFrameMetadata = this.result;
        sb.append((Object) CameraId.m46toStringimpl(androidFrameMetadata.camera));
        sb.append(", frameNumber: ");
        sb.append(androidFrameMetadata.captureResult.getFrameNumber());
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        boolean equals = kClass.equals(reflectionFactory.getOrCreateKotlinClass(CaptureResult.class));
        TotalCaptureResult totalCaptureResult = this.totalCaptureResult;
        if (equals) {
            totalCaptureResult.getClass();
            return totalCaptureResult;
        }
        if (!kClass.equals(reflectionFactory.getOrCreateKotlinClass(TotalCaptureResult.class)) || totalCaptureResult == null) {
            return null;
        }
        return totalCaptureResult;
    }
}
