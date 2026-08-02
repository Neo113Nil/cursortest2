package androidx.camera.viewfinder.core.impl.quirk;

import android.os.Build;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes3.dex */
public abstract class DeviceQuirks {
    public static final Quirks QUIRKS;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if ("OP4E75L1".equalsIgnoreCase(android.os.Build.DEVICE) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if ("Q706F".equalsIgnoreCase(android.os.Build.DEVICE) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if ("Q2Q".equalsIgnoreCase(r3) == false) goto L11;
     */
    static {
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        if (Build.VERSION.SDK_INT < 33) {
            String str = Build.MANUFACTURER;
            if ("SAMSUNG".equalsIgnoreCase(str)) {
                String str2 = Build.DEVICE;
                if (!"F2Q".equalsIgnoreCase(str2)) {
                }
                createListBuilder.add(SurfaceViewStretchedQuirk.INSTANCE);
            }
            if ("OPPO".equalsIgnoreCase(str)) {
            }
            if ("LENOVO".equalsIgnoreCase(str)) {
            }
        }
        if ("XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL)) {
            createListBuilder.add(SurfaceViewNotCroppedByParentQuirk.INSTANCE);
        }
        QUIRKS = new Quirks(CollectionsKt__CollectionsJVMKt.build(createListBuilder));
    }
}
