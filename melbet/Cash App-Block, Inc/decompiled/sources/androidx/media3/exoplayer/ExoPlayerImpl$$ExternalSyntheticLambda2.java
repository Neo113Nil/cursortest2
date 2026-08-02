package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda2 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda2(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = this.f$0;
        Player.Listener listener = (Player.Listener) obj;
        switch (i) {
            case 0:
                listener.onShuffleModeEnabledChanged(z);
                break;
            default:
                listener.onSkipSilenceEnabledChanged(z);
                break;
        }
    }
}
