package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;

/* loaded from: classes3.dex */
public final /* synthetic */ class MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f$0;
    public final /* synthetic */ Pair f$1;
    public final /* synthetic */ LoadEventInfo f$2;
    public final /* synthetic */ MediaLoadData f$3;

    public /* synthetic */ MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.$r8$classId = i;
        this.f$0 = forwardingEventListener;
        this.f$1 = pair;
        this.f$2 = loadEventInfo;
        this.f$3 = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MediaLoadData mediaLoadData = this.f$3;
        LoadEventInfo loadEventInfo = this.f$2;
        Pair pair = this.f$1;
        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f$0;
        switch (i) {
            case 0:
                ((DefaultAnalyticsCollector) MediaSourceList.this.eventListener).onLoadCanceled(((Integer) pair.first).intValue(), (MediaSource$MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
                break;
            default:
                ((DefaultAnalyticsCollector) MediaSourceList.this.eventListener).onLoadCompleted(((Integer) pair.first).intValue(), (MediaSource$MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
                break;
        }
    }
}
