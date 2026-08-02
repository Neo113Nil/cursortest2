package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewFreezeAfterHighSpeedRecordingQuirk;", "Landroidx/camera/core/impl/Quirk;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreviewFreezeAfterHighSpeedRecordingQuirk implements Quirk {
    public static final PreviewFreezeAfterHighSpeedRecordingQuirk INSTANCE = new PreviewFreezeAfterHighSpeedRecordingQuirk();
    public static final boolean isPixelPhone;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith(r0, "Pixel", true) != false) goto L8;
     */
    static {
        boolean z = true;
        if (StringsKt__StringsJVMKt.equals(Build.BRAND, "google", true)) {
            String str = Build.MODEL;
            str.getClass();
        }
        z = false;
        isPixelPhone = z;
    }
}
