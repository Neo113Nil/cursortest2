package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda4 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ VideoSize f$0;

    public /* synthetic */ ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda4(VideoSize videoSize) {
        this.f$0 = videoSize;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Player.Listener) obj).onVideoSizeChanged(this.f$0);
                break;
            default:
                VideoSize videoSize = this.f$0;
                ((AnalyticsListener) obj).onVideoSizeChanged(videoSize);
                int i = videoSize.width;
                break;
        }
    }
}
