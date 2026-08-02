package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.location.LocationRequest;
import android.media.MediaDrm;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.os.VibratorManager;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class xbm {
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException b(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static /* bridge */ /* synthetic */ LocationRequest d(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent f(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager g(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ PlaybackMetrics.Builder k() {
        return new PlaybackMetrics.Builder();
    }

    public static /* bridge */ /* synthetic */ VibratorManager l(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* bridge */ /* synthetic */ boolean x(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
