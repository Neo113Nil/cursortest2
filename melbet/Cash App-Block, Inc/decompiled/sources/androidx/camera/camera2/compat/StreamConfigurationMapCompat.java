package androidx.camera.camera2.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.compat.workaround.OutputSizesCorrector;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class StreamConfigurationMapCompat {
    public final LinkedHashMap cachedFormatOutputSizes;
    public final BiometricPrompt impl;
    public final OutputSizesCorrector outputSizesCorrector;

    public StreamConfigurationMapCompat(StreamConfigurationMap streamConfigurationMap, OutputSizesCorrector outputSizesCorrector) {
        outputSizesCorrector.getClass();
        this.outputSizesCorrector = outputSizesCorrector;
        this.cachedFormatOutputSizes = new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        this.impl = Build.VERSION.SDK_INT >= 34 ? new StreamConfigurationMapCompatApi34Impl(streamConfigurationMap, 5) : new BiometricPrompt(streamConfigurationMap, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r3.equalsIgnoreCase("Motorola") != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Size[] getOutputSizes(int i) {
        Collection<?> collection;
        Size[] sizeArr;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.cachedFormatOutputSizes;
        Size[] sizeArr2 = null;
        if (linkedHashMap.containsKey(valueOf)) {
            Size[] sizeArr3 = (Size[]) linkedHashMap.get(Integer.valueOf(i));
            if (sizeArr3 != null) {
                return (Size[]) sizeArr3.clone();
            }
            return null;
        }
        try {
            sizeArr2 = this.impl.getOutputSizes(i);
        } catch (Throwable th) {
            StringUtilsKt.w("StreamConfigurationMapCompat", "Failed to get output sizes for " + i, th);
        }
        if (sizeArr2 == null || sizeArr2.length == 0) {
            StringUtilsKt.w("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
            return sizeArr2;
        }
        OutputSizesCorrector outputSizesCorrector = this.outputSizesCorrector;
        outputSizesCorrector.getClass();
        sizeArr2.getClass();
        ArrayList mutableList = ArraysKt___ArraysKt.toMutableList(sizeArr2);
        if (outputSizesCorrector.extraSupportedOutputSizeQuirk != null) {
            if (i == 34) {
                String str = Build.MANUFACTURER;
                str.getClass();
                if (!str.equalsIgnoreCase("Motorola")) {
                    String str2 = Build.BRAND;
                    str2.getClass();
                }
                if ("moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                    sizeArr = new Size[]{new Size(1440, 1080), new Size(960, 720)};
                    if (sizeArr.length != 0) {
                        CollectionsKt__MutableCollectionsKt.addAll(mutableList, sizeArr);
                    }
                }
            }
            sizeArr = new Size[0];
            if (sizeArr.length != 0) {
            }
        }
        CameraMetadata cameraMetadata = outputSizesCorrector.cameraMetadata;
        if (cameraMetadata != null && outputSizesCorrector.excludedSupportedSizesQuirk != null) {
            String str3 = ((Camera2CameraMetadata) cameraMetadata).camera;
            str3.getClass();
            if (FullscreenAdViewKt.isOnePlus6$camera_camera2()) {
                collection = (str3.equals("0") && i == 256) ? CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(4160, 3120), new Size(4000, 3000)}) : EmptyList.INSTANCE;
            } else if (FullscreenAdViewKt.isOnePlus6T$camera_camera2()) {
                collection = (str3.equals("0") && i == 256) ? CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(4160, 3120), new Size(4000, 3000)}) : EmptyList.INSTANCE;
            } else if (FullscreenAdViewKt.isHuaweiP20Lite$camera_camera2()) {
                collection = (str3.equals("0") && (i == 34 || i == 35)) ? CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(720, 720), new Size(400, 400)}) : EmptyList.INSTANCE;
            } else if (FullscreenAdViewKt.isSamsungJ7PrimeApi27Above$camera_camera2()) {
                if (!str3.equals("0")) {
                    if (str3.equals("1") && (i == 34 || i == 35)) {
                        collection = CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(3264, 2448), new Size(3264, 1836), new Size(2448, 2448), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080)});
                    }
                    collection = EmptyList.INSTANCE;
                } else if (i != 34) {
                    if (i == 35) {
                        collection = CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080)});
                    }
                    collection = EmptyList.INSTANCE;
                } else {
                    collection = CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080)});
                }
            } else if (FullscreenAdViewKt.isSamsungJ7Api27Above$camera_camera2()) {
                if (!str3.equals("0")) {
                    if (str3.equals("1") && (i == 34 || i == 35)) {
                        collection = CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(2576, 1932), new Size(2560, 1440), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080)});
                    }
                    collection = EmptyList.INSTANCE;
                } else if (i != 34) {
                    if (i == 35) {
                        collection = CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080)});
                    }
                    collection = EmptyList.INSTANCE;
                } else {
                    collection = CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080)});
                }
            } else if (FullscreenAdViewKt.isRedmiNote9Pro$camera_camera2()) {
                collection = (str3.equals("0") && i == 256) ? CollectionsKt__CollectionsJVMKt.listOf(new Size(9280, 6944)) : EmptyList.INSTANCE;
            } else if (FullscreenAdViewKt.isSamsungA05s$camera_camera2()) {
                collection = i == 35 ? CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(3840, 2160), new Size(3264, 2448), new Size(3200, 2400), new Size(2688, 1512), new Size(2592, 1944), new Size(2592, 1940), new Size(1920, 1440)}) : EmptyList.INSTANCE;
            } else if (FullscreenAdViewKt.isNokia7Plus$camera_camera2()) {
                collection = i == 35 ? CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(4032, 3024), new Size(4000, 3000), new Size(3264, 2448), new Size(3200, 2400), new Size(3024, 3024), new Size(2976, 2976), new Size(2448, 2448)}) : EmptyList.INSTANCE;
            } else if (FullscreenAdViewKt.isSamsungZFold4$camera_camera2()) {
                collection = (str3.equals("1") && i == 35) ? CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(1280, 720), new Size(1920, 1080), new Size(2304, 1296), new Size(640, 360), new Size(EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 144), new Size(2336, 1080), new Size(2400, 1080), new Size(1920, 824), new Size(1088, 1088), new Size(1728, 1728), new Size(2736, 2736), new Size(NewHope.SENDA_BYTES, 712)}) : EmptyList.INSTANCE;
            } else {
                StringUtilsKt.w("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                collection = EmptyList.INSTANCE;
            }
            Collection<?> collection2 = collection;
            if (!collection2.isEmpty()) {
                mutableList.removeAll(collection2);
            }
        }
        if (mutableList.isEmpty()) {
            StringUtilsKt.w("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        Size[] sizeArr4 = (Size[]) mutableList.toArray(new Size[0]);
        linkedHashMap.put(Integer.valueOf(i), sizeArr4);
        return (Size[]) sizeArr4.clone();
    }
}
