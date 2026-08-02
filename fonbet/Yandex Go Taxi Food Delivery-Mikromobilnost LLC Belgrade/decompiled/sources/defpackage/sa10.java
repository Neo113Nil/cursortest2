package defpackage;

import android.media.MediaDescription;
import android.media.browse.MediaBrowser;

/* loaded from: classes10.dex */
public abstract class sa10 {
    public static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
        return mediaItem.getDescription();
    }

    public static int b(MediaBrowser.MediaItem mediaItem) {
        return mediaItem.getFlags();
    }
}
