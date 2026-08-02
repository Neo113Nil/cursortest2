package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda3 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ List f$0;

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Player.Listener) obj).onCues(this.f$0);
                break;
            default:
                ((AnalyticsListener) obj).getClass();
                break;
        }
    }
}
