package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import com.caverock.androidsvg.SVG;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.gms.maps.zzai;

/* loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda9 implements ListenerSet.Event, SynchronizationGuard$CriticalSection {
    public final /* synthetic */ int f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda9(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
        this.f$0 = i;
        this.f$1 = positionInfo;
        this.f$2 = positionInfo2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public Object execute() {
        zzai zzaiVar = (zzai) this.f$1;
        ((SVG) zzaiVar.zac).schedule((AutoValue_TransportContext) this.f$2, this.f$0 + 1, false);
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        Player.PositionInfo positionInfo = (Player.PositionInfo) this.f$1;
        Player.PositionInfo positionInfo2 = (Player.PositionInfo) this.f$2;
        Player.Listener listener = (Player.Listener) obj;
        listener.getClass();
        listener.onPositionDiscontinuity(this.f$0, positionInfo, positionInfo2);
    }

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda9(zzai zzaiVar, AutoValue_TransportContext autoValue_TransportContext, int i) {
        this.f$1 = zzaiVar;
        this.f$2 = autoValue_TransportContext;
        this.f$0 = i;
    }
}
