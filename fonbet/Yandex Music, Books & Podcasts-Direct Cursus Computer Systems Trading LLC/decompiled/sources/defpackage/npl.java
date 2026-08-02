package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.impl.TrackingEventType;
import ru.yandex.video.m3.player.PreparingParams;

/* loaded from: classes6.dex */
public final class npl implements ove {
    public final l1u a;

    public npl(paw pawVar, l1u l1uVar) {
        this.a = l1uVar;
    }

    @Override // defpackage.ove
    public final void D() {
        paw pawVar;
        l1u l1uVar = this.a;
        l1uVar.c.H("BasePlayerStrategy", "onBufferingEnd", null, new Object[0]);
        v2t v2tVar = l1uVar.l;
        if (v2tVar != null) {
            paw pawVar2 = v2tVar.p;
            if (pawVar2 != null && pawVar2.e() && (pawVar = v2tVar.p) != null && !pawVar.i()) {
                v2tVar.a();
                v2tVar.b.c();
            }
            synchronized (v2tVar.o) {
                v2tVar.o.set(false);
                v2tVar.d.d();
                v2tVar.c.d();
            }
        }
    }

    @Override // defpackage.ove
    public final void E() {
        l1u l1uVar = this.a;
        v2t v2tVar = l1uVar.l;
        if (v2tVar != null) {
            v2tVar.b();
        }
        l1uVar.c.H("BasePlayerStrategy", "onRelease", null, new Object[0]);
    }

    @Override // defpackage.ove
    public final void F(PreparingParams preparingParams, Map map) {
        l1u l1uVar = this.a;
        l1uVar.c.H("BasePlayerStrategy", "onPreparing", null, new Object[0]);
        v2t v2tVar = l1uVar.l;
        if (v2tVar != null) {
            v2tVar.b();
        }
    }

    @Override // defpackage.ove
    public final void G(VideoData videoData, boolean z) {
        l1u l1uVar = this.a;
        VhVideoData vhVideoData = (VhVideoData) videoData;
        if (vhVideoData.getShouldUseOttTracking() && l1uVar.l == null) {
            ujl ujlVar = new ujl();
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new lp7(7, Executors.defaultThreadFactory()));
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new lp7(8, Executors.defaultThreadFactory()));
            OkHttpClient okHttpClient = new OkHttpClient(new joj());
            Context context = l1uVar.f;
            e18 e18Var = l1uVar.g;
            b2c b2cVar = new b2c();
            newSingleThreadScheduledExecutor.getClass();
            newCachedThreadPool.getClass();
            context.getClass();
            e18Var.getClass();
            cke ckeVar = new cke(context);
            n4f n4fVar = new n4f();
            ihs ihsVar = new ihs(ujlVar);
            ihs ihsVar2 = new ihs(ujlVar);
            ihs ihsVar3 = new ihs(ujlVar);
            ihs ihsVar4 = new ihs(ujlVar);
            ihs ihsVar5 = new ihs(ujlVar);
            r2t r2tVar = new r2t(context, ckeVar, ujlVar, e18Var, new z23(context), new xiu(context), new wul(), b2cVar);
            lxj lxjVar = new lxj(okHttpClient, n4fVar, ckeVar.c());
            kc7 kc7Var = new kc7(context, "YandexPlayer.db", null, 1, 0);
            gs4 gs4Var = new gs4();
            gs4Var.a = n4fVar;
            gs4Var.b = lxjVar;
            gs4Var.c = kc7Var;
            gs4Var.d = newCachedThreadPool;
            gs4Var.e = new AtomicLong(0L);
            l1uVar.l = new v2t(ihsVar, ihsVar2, ihsVar3, ihsVar4, ihsVar5, r2tVar, gs4Var, newSingleThreadScheduledExecutor, newCachedThreadPool);
        }
        v2t v2tVar = l1uVar.l;
        if (v2tVar != null) {
            paw pawVar = l1uVar.a;
            v2tVar.p = pawVar;
            v2tVar.s = false;
            pawVar.I(v2tVar.t);
            pawVar.w(v2tVar.u);
            v2tVar.e.c();
        }
        v2t v2tVar2 = l1uVar.l;
        if (v2tVar2 != null) {
            paw pawVar2 = v2tVar2.p;
            pawVar2.getClass();
            v2tVar2.p = pawVar2;
            v2tVar2.q = vhVideoData;
            r2t r2tVar2 = v2tVar2.f;
            Ott.TrackingData trackingData = vhVideoData.getTrackingData();
            trackingData.getClass();
            Object obj = ozr.i;
            q2t q2tVar = new q2t(pawVar2, trackingData, r2tVar2.b, r2tVar2.c, r2tVar2.d, r2tVar2.e, r2tVar2.f, r2tVar2.g, r2tVar2.h, new j6e(pawVar2, lsq.q(r2tVar2.a, Integer.valueOf(pawVar2.l()))));
            q2tVar.h = v2tVar2.r;
            v2tVar2.j = q2tVar;
            y2x.s(new s2t(v2tVar2, 1), v2tVar2.i);
            v2tVar2.a.b();
            v2tVar2.b.b();
            v2tVar2.e.d();
            q2t q2tVar2 = v2tVar2.j;
            v2tVar2.e(q2tVar2 != null ? q2t.a(q2tVar2, TrackingEventType.VIDEO_START, null, null, 14) : null);
        }
        l1uVar.c.H("BasePlayerStrategy", "onPrepared", null, new Object[0]);
        if (l1uVar.e) {
            return;
        }
        paw pawVar3 = l1uVar.a;
        if (z) {
            pawVar3.d();
        } else {
            pawVar3.b();
        }
    }

    @Override // defpackage.ove
    public final void a() {
        l1u l1uVar = this.a;
        l1uVar.c.H("BasePlayerStrategy", "onResumePlayback", null, new Object[0]);
        l1uVar.d.set(0);
    }

    @Override // defpackage.ove
    public final void f() {
        this.a.c.H("BasePlayerStrategy", "onPausePlayback", null, new Object[0]);
    }

    @Override // defpackage.ove
    public final void w() {
        l1u l1uVar = this.a;
        l1uVar.c.H("BasePlayerStrategy", "onBufferingStart", null, new Object[0]);
        v2t v2tVar = l1uVar.l;
        if (v2tVar != null) {
            v2tVar.c();
            v2tVar.b.d();
            synchronized (v2tVar.o) {
                try {
                    v2tVar.o.set(true);
                    if (v2tVar.a.a.get()) {
                        v2tVar.n.incrementAndGet();
                        v2tVar.d.c();
                    } else {
                        v2tVar.c.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
