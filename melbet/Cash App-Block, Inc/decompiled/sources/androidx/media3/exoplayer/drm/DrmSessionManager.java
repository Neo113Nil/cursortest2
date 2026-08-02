package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* loaded from: classes3.dex */
public interface DrmSessionManager {
    public static final AnonymousClass1 DRM_UNSUPPORTED = new AnonymousClass1();

    /* renamed from: androidx.media3.exoplayer.drm.DrmSessionManager$1, reason: invalid class name */
    public final class AnonymousClass1 implements DrmSessionManager {
        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public final Toolbar.AnonymousClass1 acquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format2) {
            if (format2.drmInitData == null) {
                return null;
            }
            return new Toolbar.AnonymousClass1(new DrmSession$DrmSessionException(new UnsupportedDrmException(), 6001));
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public final int getCryptoType(Format format2) {
            return format2.drmInitData != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public final void setPlayer(Looper looper, PlayerId playerId) {
        }
    }

    Toolbar.AnonymousClass1 acquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format2);

    int getCryptoType(Format format2);

    default void prepare() {
    }

    default void release() {
    }

    void setPlayer(Looper looper, PlayerId playerId);
}
