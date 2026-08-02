package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;

/* loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda25 implements ListenerSet.Event, SimpleLottieValueCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda25(AnalyticsListener.EventTime eventTime, int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
        this.$r8$classId = 2;
        this.f$0 = i;
    }

    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
    public Object getValue(LottieFrameInfo lottieFrameInfo) {
        int i = this.$r8$classId;
        int i2 = this.f$0;
        switch (i) {
        }
        return Integer.valueOf(i2);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                ((Player.Listener) obj).onAudioSessionIdChanged(i2);
                break;
            case 1:
                ((Player.Listener) obj).onRepeatModeChanged(i2);
                break;
            default:
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.getClass();
                analyticsListener.onPositionDiscontinuity(i2);
                break;
        }
    }

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda25(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }
}
