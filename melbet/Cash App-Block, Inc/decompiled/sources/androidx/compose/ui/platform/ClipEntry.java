package androidx.compose.ui.platform;

import android.content.ClipData;

/* loaded from: classes3.dex */
public final class ClipEntry {
    public final ClipData clipData;

    public ClipEntry(ClipData clipData) {
        this.clipData = clipData;
    }

    public final ClipData getClipData() {
        return this.clipData;
    }

    public final void getClipMetadata() {
        this.clipData.getDescription();
    }
}
