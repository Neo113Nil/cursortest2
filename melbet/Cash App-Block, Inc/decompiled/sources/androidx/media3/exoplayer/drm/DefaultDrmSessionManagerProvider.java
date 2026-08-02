package androidx.media3.exoplayer.drm;

import androidx.camera.video.Recorder;
import androidx.media3.common.MediaItem;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class DefaultDrmSessionManagerProvider {
    public Object lock;

    public DefaultDrmSessionManagerProvider() {
        this.lock = new Object();
    }

    public static DefaultDrmSessionManager createManager(MediaItem.DrmConfiguration drmConfiguration) {
        new Recorder.AnonymousClass4(28);
        drmConfiguration.getClass();
        new HashMap();
        throw null;
    }

    public DefaultDrmSessionManagerProvider(Object obj) {
        this.lock = obj;
    }
}
