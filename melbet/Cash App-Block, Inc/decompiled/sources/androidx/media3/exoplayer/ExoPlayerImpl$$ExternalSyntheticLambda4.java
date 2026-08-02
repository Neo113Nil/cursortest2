package androidx.media3.exoplayer;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda4 implements ListenerSet.Event, AccessibilityViewCommand {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda4(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Timeline timeline = ((PlaybackInfo) obj2).timeline;
                ((Player.Listener) obj).onTimelineChanged(i2);
                break;
            case 1:
                ((Player.Listener) obj).onMediaItemTransition((MediaItem) obj2, i2);
                break;
            default:
                ((AnalyticsListener) obj).onPlaybackStateChanged((AnalyticsListener.EventTime) obj2, i2);
                break;
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view) {
        ((SideSheetBehavior) this.f$0).setState(this.f$1);
        return true;
    }
}
