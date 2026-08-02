package androidx.camera.camera2.pipe.compat;

import android.os.Build;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.StrictMode;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes3.dex */
public final class Camera2Quirks {
    public static final Map SHOULD_WAIT_FOR_REPEATING_DEVICE_MAP = MapsKt__MapsJVMKt.mapOf(new Pair("Google", ArraysKt___ArraysKt.toSet(new String[]{"oriole", "raven", "bluejay", "panther", "cheetah", "lynx"})));
    public static final Map SM8150_DEVICES = MapsKt__MapsKt.mapOf(new Pair("google", ArraysKt___ArraysKt.toSet(new String[]{"pixel 4", "pixel 4 xl"})), new Pair("samsung", SetsKt__SetsJVMKt.setOf("sm-g770f")));
    public final Camera2MetadataProvider metadataProvider;
    public final StrictMode strictMode;

    public Camera2Quirks(Camera2MetadataProvider camera2MetadataProvider, StrictMode strictMode) {
        camera2MetadataProvider.getClass();
        strictMode.getClass();
        this.metadataProvider = camera2MetadataProvider;
        this.strictMode = strictMode;
    }

    /* renamed from: shouldCloseCameraBeforeCreatingCaptureSession-EfqyGwQ$camera_camera2_pipe, reason: not valid java name */
    public final boolean m74x552c1673(String str) {
        boolean z;
        str.getClass();
        this.strictMode.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            CameraMetadata.Companion companion = CameraMetadata.Companion;
            CameraMetadata m72awaitCameraMetadataEfqyGwQ = ((Camera2MetadataCache) this.metadataProvider).m72awaitCameraMetadataEfqyGwQ(str);
            companion.getClass();
            if (CameraMetadata.Companion.isHardwareLevelLegacy(m72awaitCameraMetadataEfqyGwQ)) {
                z = true;
                return !z || (!"motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && str.equals("1"));
            }
        }
        z = false;
        if (z) {
        }
    }
}
