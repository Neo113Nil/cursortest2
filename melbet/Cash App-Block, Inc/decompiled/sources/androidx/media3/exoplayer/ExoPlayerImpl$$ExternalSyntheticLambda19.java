package androidx.media3.exoplayer;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda19 implements ListenerSet.IterationFinishedEvent, ListenerSet.Event {
    public final /* synthetic */ ExoPlayerImpl f$0;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda19(ExoPlayerImpl exoPlayerImpl) {
        this.f$0 = exoPlayerImpl;
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((Player.Listener) obj).onEvents(this.f$0.wrappingPlayer, new Player.Events(flagSet));
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onAvailableCommandsChanged(this.f$0.availableCommands);
    }
}
