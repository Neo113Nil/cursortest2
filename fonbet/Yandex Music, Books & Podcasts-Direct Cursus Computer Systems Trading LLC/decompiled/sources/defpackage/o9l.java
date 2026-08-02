package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.impl.tracking.event.PlaybackState;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveState;

/* loaded from: classes6.dex */
public final class o9l {
    public static final n9l j = new n9l(new m9l(true, 1, 10), new m9l(false, 5, 30));
    public final m9l a;
    public final kgk b;
    public final ybg c;
    public ScheduledExecutorService d;
    public final long e;
    public final long f;
    public final ArrayList g;
    public ScheduledFuture h;
    public volatile boolean i;

    public o9l(m9l m9lVar, kgk kgkVar, ybg ybgVar) {
        long j2;
        m9lVar.getClass();
        long j3 = m9lVar.a;
        this.a = m9lVar;
        this.b = kgkVar;
        this.c = ybgVar;
        boolean z = m9lVar.c;
        long j4 = m9lVar.b;
        if (z) {
            j2 = j3 / 2;
        } else {
            j4 -= j3;
            j2 = j3 / 2;
        }
        long j5 = j4 - j2;
        this.e = TimeUnit.SECONDS.toMillis(j5);
        this.f = (long) (r5.toMillis(j3) * 0.8d);
        this.g = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r2 != (r3 != null ? r3.getState() : null)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(PlayerAliveState playerAliveState) {
        PlayerAliveState playerAliveState2 = (PlayerAliveState) CollectionsKt.Z(this.g);
        long timestamp = playerAliveState2 != null ? playerAliveState2.getTimestamp() : 0L;
        long timestamp2 = playerAliveState.getTimestamp() - timestamp;
        if (!this.g.isEmpty() && timestamp2 < this.f) {
            PlaybackState state = playerAliveState.getState();
            PlayerAliveState playerAliveState3 = (PlayerAliveState) CollectionsKt.Z(this.g);
        }
        this.g.add(playerAliveState);
        if (this.h != null && !this.i) {
            ScheduledExecutorService scheduledExecutorService = this.d;
            if (scheduledExecutorService == null) {
                Intrinsics.j("scheduledExecutorService");
                throw null;
            }
            b(scheduledExecutorService);
        }
        if (Math.max(playerAliveState.getTimestamp(), timestamp) - ((PlayerAliveState) CollectionsKt.Q(this.g)).getTimestamp() >= this.e) {
            this.c.invoke(CollectionsKt.w0(this.g));
            this.g.clear();
        }
    }

    public final void b(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.d = scheduledExecutorService;
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        dyg dygVar = new dyg(16, this);
        m9l m9lVar = this.a;
        this.h = y2x.W(scheduledExecutorService, dygVar, (m9lVar.c && this.h == null) ? 0L : m9lVar.a, m9lVar.a, TimeUnit.SECONDS);
    }
}
