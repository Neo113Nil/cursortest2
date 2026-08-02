package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia;

/* loaded from: classes3.dex */
public final class PickVisualMediaRequest {
    public int maxItems;
    public ActivityResultContracts$PickVisualMedia.VisualMediaType mediaType;

    public final ActivityResultContracts$PickVisualMedia.VisualMediaType getMediaType() {
        return this.mediaType;
    }
}
