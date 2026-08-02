package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.core.view.DisplayCompat;
import kotlin.Metadata;
import squareup.cash.earnings.EarningTool;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;", "Landroidx/camera/camera2/compat/quirk/CaptureIntentPreviewQuirk;", "Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;", "Tool", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, SurfaceProcessingQuirk {
    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean workaroundByCaptureIntentPreview() {
        return EarningTool.Tool.isBluStudioX10() || EarningTool.Tool.isItelW6004() || EarningTool.Tool.isVivo1805() || EarningTool.Tool.isPositivoTwist2Pro();
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final boolean workaroundBySurfaceProcessing() {
        if (EarningTool.Tool.isBluStudioX10() || EarningTool.Tool.isItelW6004() || EarningTool.Tool.isVivo1805() || EarningTool.Tool.isPositivoTwist2Pro()) {
            return true;
        }
        return ("pixel 4 xl".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT == 29) || EarningTool.Tool.isMotoE13() || EarningTool.Tool.isSamsungTabA8() || EarningTool.Tool.isSamsungA53() || DisplayCompat.isUniSocChipsetDevice();
    }
}
