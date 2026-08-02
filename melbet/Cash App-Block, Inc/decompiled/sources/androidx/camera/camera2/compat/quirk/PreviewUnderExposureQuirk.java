package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/PreviewUnderExposureQuirk;", "Landroidx/camera/core/impl/Quirk;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreviewUnderExposureQuirk implements Quirk {
    public static final PreviewUnderExposureQuirk INSTANCE = new PreviewUnderExposureQuirk();
    public static final boolean isTclDevice = StringsKt__StringsJVMKt.equals(Build.BRAND, "TCL", true);
}
