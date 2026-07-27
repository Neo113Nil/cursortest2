package N0;

import android.content.ClipData;
import android.content.pm.ApkChecksum;
import android.media.metrics.MediaMetricsManager;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ ApkChecksum e(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager f(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ ContentInfo.Builder n(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo p(Object obj) {
        return (ContentInfo) obj;
    }
}
