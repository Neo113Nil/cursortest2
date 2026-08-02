package defpackage;

import ru.yandex.video.m3.model.config.mediasource.LivePlaybackConfig;

/* loaded from: classes6.dex */
public final class xvh {
    public final LivePlaybackConfig a;
    public final veg b;

    public xvh(LivePlaybackConfig livePlaybackConfig, veg vegVar) {
        this.a = livePlaybackConfig;
        this.b = vegVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xvh.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        xvh xvhVar = (xvh) obj;
        return this.a.equals(xvhVar.a) && this.b.equals(xvhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + k5r.e(k5r.e(k5r.e(k5r.e(Boolean.hashCode(false) * 31, 31, false), 31, false), 31, false), 31, false)) * 31);
    }

    public final String toString() {
        return "MediaSourceConfig(validateDashRangeRequests=false, interruptPendingRequests=false, requestCMAFSegments=false, livePlaybackConfig=" + this.a + ", loadErrorHandlingConfig=" + this.b + ", experimentalAllowGzipSubtitles=false, experimentalPreloadLiveDashEnabled=false)";
    }
}
