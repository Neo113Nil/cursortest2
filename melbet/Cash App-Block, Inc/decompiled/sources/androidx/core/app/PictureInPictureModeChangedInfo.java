package androidx.core.app;

import android.content.res.Configuration;

/* loaded from: classes3.dex */
public final class PictureInPictureModeChangedInfo {
    public final boolean isInPictureInPictureMode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PictureInPictureModeChangedInfo(boolean z, Configuration configuration) {
        this(z);
        configuration.getClass();
    }

    public final boolean isInPictureInPictureMode() {
        return this.isInPictureInPictureMode;
    }

    public PictureInPictureModeChangedInfo(boolean z) {
        this.isInPictureInPictureMode = z;
    }
}
