package androidx.camera.camera2.compat.quirk;

import kotlin.Metadata;
import retrofit2.DefaultMethodSupport;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;", "Landroidx/camera/camera2/compat/quirk/CaptureIntentPreviewQuirk;", "retrofit2/DefaultMethodSupport", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean workaroundByCaptureIntentPreview() {
        return DefaultMethodSupport.isSamsungM55();
    }
}
