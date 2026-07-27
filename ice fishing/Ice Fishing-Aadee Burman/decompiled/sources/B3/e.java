package B3;

import android.content.ClipData;
import android.content.pm.ApkChecksum;
import android.media.metrics.MediaMetricsManager;
import android.view.ContentInfo;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ ApkChecksum f(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager g(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ ContentInfo.Builder o(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo q(Object obj) {
        return (ContentInfo) obj;
    }
}
