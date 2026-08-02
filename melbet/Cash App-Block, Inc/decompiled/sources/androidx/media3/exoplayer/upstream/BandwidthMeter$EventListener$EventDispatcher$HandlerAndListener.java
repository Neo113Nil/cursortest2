package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* loaded from: classes3.dex */
public final class BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener {
    public final Handler handler;
    public final DefaultAnalyticsCollector listener;
    public boolean released;

    public BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener(Handler handler, DefaultAnalyticsCollector defaultAnalyticsCollector) {
        this.handler = handler;
        this.listener = defaultAnalyticsCollector;
    }
}
