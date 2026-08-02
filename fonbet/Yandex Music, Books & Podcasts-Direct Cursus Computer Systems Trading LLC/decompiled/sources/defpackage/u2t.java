package defpackage;

import com.connectsdk.discovery.DiscoveryProvider;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.impl.TrackingEventType;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class u2t implements rgl {
    public final /* synthetic */ v2t a;

    public u2t(v2t v2tVar) {
        this.a = v2tVar;
    }

    @Override // defpackage.rgl
    public final void P(PlaybackException playbackException) {
        paw pawVar = this.a.p;
        if (pawVar != null) {
            pawVar.F(this);
        }
        paw pawVar2 = this.a.p;
        if (pawVar2 != null) {
            pawVar2.q(this.a.u);
        }
        v2t v2tVar = this.a;
        v2tVar.s = true;
        v2tVar.d();
        v2t v2tVar2 = this.a;
        ScheduledFuture scheduledFuture = v2tVar2.m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        v2tVar2.m = null;
        this.a.c();
        this.a.a.d();
        this.a.b.d();
        v2t v2tVar3 = this.a;
        q2t q2tVar = v2tVar3.j;
        v2tVar3.e(q2tVar != null ? q2t.a(q2tVar, TrackingEventType.PLAYER_ERROR, wgb.a(playbackException), null, 12) : null);
    }

    @Override // defpackage.rgl
    public final void a() {
        boolean z = this.a.a.a.get();
        v2t v2tVar = this.a;
        q2t q2tVar = v2tVar.j;
        if (z) {
            v2tVar.e(q2tVar != null ? q2t.a(q2tVar, TrackingEventType.PLAYER_PLAY, null, null, 14) : null);
        } else {
            v2tVar.e(q2tVar != null ? q2t.a(q2tVar, TrackingEventType.CONTENT_START, null, null, 14) : null);
        }
        v2t v2tVar2 = this.a;
        if (v2tVar2.l == null) {
            ScheduledExecutorService scheduledExecutorService = v2tVar2.h;
            s2t s2tVar = new s2t(v2tVar2, 0);
            long j = DiscoveryProvider.TIMEOUT;
            v2tVar2.l = y2x.W(scheduledExecutorService, s2tVar, j - (v2tVar2.a.a() % j), 60000L, TimeUnit.MILLISECONDS);
        }
        this.a.a();
        this.a.a.c();
        this.a.b.c();
        VhVideoData vhVideoData = this.a.q;
        if (vhVideoData == null || !vhVideoData.getMultiplex()) {
            return;
        }
        v2t v2tVar3 = this.a;
        if (v2tVar3.m != null || v2tVar3.p == null) {
            return;
        }
        v2tVar3.m = y2x.W(v2tVar3.h, new xlr(5, v2tVar3, new AtomicLong(v2tVar3.b.a())), 30000L, 30000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.rgl
    public final void f() {
        v2t v2tVar = this.a;
        q2t q2tVar = v2tVar.j;
        v2tVar.e(q2tVar != null ? q2t.a(q2tVar, TrackingEventType.PLAYER_PAUSE, null, null, 14) : null);
        this.a.d();
        this.a.c();
        this.a.a.d();
        this.a.b.d();
    }

    @Override // defpackage.rgl
    public final void i0() {
        v2t v2tVar = this.a;
        if (!v2tVar.s) {
            q2t q2tVar = v2tVar.j;
            v2tVar.e(q2tVar != null ? q2t.a(q2tVar, TrackingEventType.PLAYER_STOP, null, null, 14) : null);
            this.a.s = true;
        }
        this.a.d();
        v2t v2tVar2 = this.a;
        ScheduledFuture scheduledFuture = v2tVar2.m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        v2tVar2.m = null;
        this.a.c();
        this.a.a.d();
        this.a.b.d();
    }
}
