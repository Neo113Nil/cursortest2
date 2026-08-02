package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fyk implements gyk {
    public final PlaybackCommand$QueueLaunch a;
    public final List b;

    public fyk(PlaybackCommand$QueueLaunch playbackCommand$QueueLaunch, List list) {
        list.getClass();
        this.a = playbackCommand$QueueLaunch;
        this.b = list;
        if (list.isEmpty()) {
            su4.s(2, null, "PlaybackCommandsBatch.WithQueueLaunch afterLaunch must be not empty", null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyk)) {
            return false;
        }
        fyk fykVar = (fyk) obj;
        return this.a.equals(fykVar.a) && Intrinsics.d(this.b, fykVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithQueueLaunch(beforeLaunch=null, launch=" + this.a + ", afterLaunch=" + this.b + ")";
    }
}
