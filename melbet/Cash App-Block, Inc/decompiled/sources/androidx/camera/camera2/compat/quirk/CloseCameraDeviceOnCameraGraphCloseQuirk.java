package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "Landroidx/camera/core/impl/Quirk;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements Quirk {
    public static final boolean isSamsungExynos7570Device;
    public static final boolean isSamsungExynos7870Device;
    public static final boolean isSamsungProblematicDevice;
    public static final boolean isSonyProblematicDevice;
    public static final boolean isXiaomiProblematicDevice;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ba, code lost:
    
        if (r0.equalsIgnoreCase("Samsung") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r2.equalsIgnoreCase("Xiaomi") != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0064, code lost:
    
        if (r0.equalsIgnoreCase("Sony") != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    static {
        boolean z;
        List<String> listOf;
        boolean z2;
        String str;
        int i;
        String str2 = Build.HARDWARE;
        isSamsungExynos7570Device = Intrinsics.areEqual(str2, "samsungexynos7570");
        isSamsungExynos7870Device = Intrinsics.areEqual(str2, "samsungexynos7870");
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        boolean z3 = false;
        if (!str3.equalsIgnoreCase("Xiaomi")) {
            String str4 = Build.BRAND;
            str4.getClass();
        }
        String str5 = Build.DEVICE;
        str5.getClass();
        String lowerCase = str5.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (ArraysKt___ArraysKt.contains(new String[]{"aurora", "houji"}, lowerCase)) {
            z = true;
            isXiaomiProblematicDevice = z;
            str3.getClass();
            if (!str3.equalsIgnoreCase("Sony")) {
                String str6 = Build.BRAND;
                str6.getClass();
            }
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"XQ-DQ", "SO", "A301SO"});
            if ((listOf instanceof Collection) || !listOf.isEmpty()) {
                for (String str7 : listOf) {
                    String str8 = Build.DEVICE;
                    str8.getClass();
                    if (StringsKt__StringsJVMKt.startsWith(str8, str7, true)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            isSonyProblematicDevice = z2;
            str = Build.MANUFACTURER;
            str.getClass();
            if (!str.equalsIgnoreCase("Samsung")) {
                String str9 = Build.BRAND;
                str9.getClass();
            }
            i = Build.VERSION.SDK_INT;
            if (i >= 31 && i <= 34) {
                z3 = true;
            }
            isSamsungProblematicDevice = z3;
        }
        z = false;
        isXiaomiProblematicDevice = z;
        str3.getClass();
        if (!str3.equalsIgnoreCase("Sony")) {
        }
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"XQ-DQ", "SO", "A301SO"});
        if (listOf instanceof Collection) {
        }
        while (r0.hasNext()) {
        }
        z2 = false;
        isSonyProblematicDevice = z2;
        str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
        }
        i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            z3 = true;
        }
        isSamsungProblematicDevice = z3;
    }
}
