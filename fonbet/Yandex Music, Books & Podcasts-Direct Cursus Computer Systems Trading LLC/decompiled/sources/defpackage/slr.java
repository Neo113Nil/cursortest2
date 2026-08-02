package defpackage;

import android.app.Application;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.ViewPortState;
import ru.yandex.video.m3.data.dto.ExternalStalled;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.PlaybackState;
import ru.yandex.video.m3.player.report.DebugReportReason;
import ru.yandex.video.m3.player.utils.network.NetworkType;

/* loaded from: classes6.dex */
public final class slr implements olr {
    public final ksa A;
    public final rgu A0;
    public final z8h B;
    public final fs7 B0;
    public final boolean C;
    public final rlr C0;
    public paw D;
    public final nur D0;
    public z2t E;
    public final au1 E0;
    public rdr F;
    public qku G;
    public a H;
    public par I;
    public zg7 J;
    public qlr K;
    public LinkedHashMap L;
    public final ScheduledExecutorService X;
    public final wqr Y;
    public final tf6 Z;
    public final i9w a;
    public final y9w b;
    public final ehv c;
    public final gos d;
    public final bs4 e;
    public final mzr f;
    public final ujl g;
    public final cke h;
    public final rc i;
    public final q08 j;
    public final Set k;
    public final List l;
    public final List m;
    public final String n;
    public final String o;
    public final ylr p;
    public final ScheduledExecutorService q;
    public final l4f r;
    public final l2j s;
    public final dyc t;
    public final xgd u;
    public final ver v;
    public boolean v0;
    public final bt2 w;
    public final bnd w0;
    public final wa6 x;
    public final bnd x0;
    public final c5p y;
    public final AtomicBoolean y0;
    public final d1 z;
    public final mvt z0;

    public slr(i9w i9wVar, y9w y9wVar, ehv ehvVar, gos gosVar, bs4 bs4Var, mzr mzrVar, ujl ujlVar, cke ckeVar, rc rcVar, q08 q08Var, LinkedHashSet linkedHashSet, List list, List list2, String str, String str2, Map map, ylr ylrVar, ScheduledExecutorService scheduledExecutorService, l4f l4fVar, l2j l2jVar, dyc dycVar, xgd xgdVar, ver verVar, bt2 bt2Var, wa6 wa6Var, c5p c5pVar, d1 d1Var, ksa ksaVar, z8h z8hVar, boolean z) {
        Map b;
        list.getClass();
        list2.getClass();
        scheduledExecutorService.getClass();
        l4fVar.getClass();
        d1Var.getClass();
        this.a = i9wVar;
        this.b = y9wVar;
        this.c = ehvVar;
        this.d = gosVar;
        this.e = bs4Var;
        this.f = mzrVar;
        this.g = ujlVar;
        this.h = ckeVar;
        this.i = rcVar;
        this.j = q08Var;
        this.k = linkedHashSet;
        this.l = list;
        this.m = list2;
        this.n = str;
        this.o = str2;
        this.p = ylrVar;
        this.q = scheduledExecutorService;
        this.r = l4fVar;
        this.s = l2jVar;
        this.t = dycVar;
        this.u = xgdVar;
        this.v = verVar;
        this.w = bt2Var;
        this.x = wa6Var;
        this.y = c5pVar;
        this.z = d1Var;
        this.A = ksaVar;
        this.B = z8hVar;
        this.C = z;
        this.X = Executors.newSingleThreadScheduledExecutor(new lp7(6, Executors.defaultThreadFactory()));
        wqr n = a4g.n();
        this.Y = n;
        b43 b43Var = new b43(rre.f, 12);
        dq7 dq7Var = ca8.a;
        this.Z = gld.e(e.c(n, mn7.d).plus(b43Var));
        int i = 17;
        boolean z2 = false;
        this.w0 = new bnd(i, z2);
        this.x0 = new bnd(i, z2);
        this.y0 = new AtomicBoolean(true);
        this.z0 = new mvt(15);
        this.A0 = new rgu(dycVar);
        this.B0 = fs7.b;
        this.C0 = new rlr(this);
        this.D0 = new nur();
        this.E0 = new au1(5);
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            this.L = linkedHashMap;
        }
        if (!d1Var.b.b || (b = tah.b(new Pair("aaExperimentTestValue", Boolean.TRUE))) == null) {
            return;
        }
        if (this.L == null) {
            this.L = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = this.L;
        if (linkedHashMap2 != null) {
            linkedHashMap2.putAll(b);
        }
    }

    @Override // defpackage.olr
    public final void a() {
        b(true);
    }

    public final void b(boolean z) {
        rdr rdrVar;
        ver verVar;
        paw pawVar;
        z2t z2tVar = this.E;
        Continuation continuation = null;
        if (z2tVar != null) {
            oer oerVar = z2tVar.b;
            if (oerVar.t == null) {
                oerVar.t = oerVar.a();
            }
            chs chsVar = z2tVar.x;
            chsVar.getClass();
            chsVar.a("TrackingObserver", "release", "isPlayerDestroying=" + z + " thread=" + Thread.currentThread(), new Object[0]);
            z2tVar.u = true;
            rdrVar = new rdr(z2tVar.t, z2tVar.s);
            if (z) {
                rdrVar = null;
            }
            z2tVar.w0();
            z2tVar.v0();
            nq0 nq0Var = z2tVar.w;
            y2x.Z((ScheduledExecutorService) nq0Var.f, new k9l(nq0Var, 0));
            if (z) {
                bt2 bt2Var = z2tVar.i;
                DebugReportReason debugReportReason = DebugReportReason.ON_PLAYER_RELEASE;
                bt2Var.getClass();
                debugReportReason.getClass();
                if (!(bt2Var instanceof bt2)) {
                    bt2Var = null;
                }
                if (bt2Var != null) {
                    bt2Var.b(debugReportReason);
                }
                a aVar = z2tVar.a;
                PlayerState a = z2tVar.b.a();
                aVar.getClass();
                chs chsVar2 = aVar.p;
                chsVar2.getClass();
                chsVar2.a("[EventTrackerImpl]", "onDestroyPlayer", null, new Object[0]);
                cjb i = aVar.i();
                bjb j = aVar.j();
                if (aVar.l) {
                    x97.y(aVar.k, null, null, new ejb(j, null, aVar, a, i, 4), 3);
                } else {
                    Event event = Event.DESTROY_PLAYER;
                    EventType eventType = EventType.EVENT;
                    aVar.g.getClass();
                    eventType.getClass();
                    boolean z2 = aVar.l;
                    ylr ylrVar = aVar.a;
                    if (z2) {
                        EventDefault h = a.h(aVar, j, event, null, a.getVideoType(), null, a.e(a), i, 10);
                        ylrVar.getClass();
                        ylrVar.c(h);
                    } else {
                        ylrVar.b(a.h(aVar, j, event, null, a.getVideoType(), null, a.e(a), i, 10));
                    }
                }
            }
            rgu rguVar = z2tVar.h;
            rguVar.getClass();
            rguVar.b.e(z2tVar);
            paw pawVar2 = z2tVar.l;
            if (pawVar2 != null) {
                pawVar2.F(z2tVar);
            }
            paw pawVar3 = z2tVar.l;
            if (pawVar3 != null) {
                pawVar3.q(z2tVar);
            }
        } else {
            rdrVar = null;
        }
        this.F = rdrVar;
        this.E = null;
        qku qkuVar = this.G;
        if (qkuVar != null && (pawVar = this.D) != null) {
            pawVar.F(qkuVar);
        }
        this.G = null;
        if (z) {
            this.v0 = true;
            paw pawVar4 = this.D;
            if (pawVar4 != null) {
                pawVar4.q(this.t);
                pawVar4.q(this.C0);
                pawVar4.q((qst) this.D0.b);
            }
            xgd xgdVar = this.u;
            rgu rguVar2 = this.A0;
            rguVar2.getClass();
            synchronized (xgdVar.g) {
                bbv bbvVar = (bbv) xgdVar.f;
                bbvVar.getClass();
                synchronized (bbvVar.b) {
                    bbvVar.a.remove(rguVar2);
                }
                xgdVar.e();
            }
            dyc dycVar = this.t;
            rgu rguVar3 = this.A0;
            rguVar3.getClass();
            dycVar.b.e(rguVar3);
            qlr qlrVar = this.K;
            if (qlrVar != null && (verVar = this.v) != null) {
                verVar.V(qlrVar);
            }
            this.f.a();
            x97.y(this.Z, null, null, new glp(this, continuation, 16), 3);
        }
    }

    @Override // defpackage.olr
    public final void f(paw pawVar, Map map, boolean z) {
        b(false);
        if (this.D == null) {
            pawVar.w(this.t);
            pawVar.w(this.C0);
            pawVar.w((qst) this.D0.b);
        }
        this.D = pawVar;
        par parVar = this.I;
        if (parVar == null) {
            parVar = new par(this.g, this.E0);
        }
        par parVar2 = parVar;
        this.I = parVar2;
        au1 au1Var = this.E0;
        Object obj = map != null ? map.get(ExternalStalled.key) : null;
        au1Var.c = obj instanceof Long ? (Long) obj : null;
        if (map != null) {
            Object obj2 = map.get("EXTRA_INTERNAL_STALLED_KEY");
            Long l = obj2 instanceof Long ? (Long) obj2 : null;
            this.E0.b = l != null ? l.longValue() : 0L;
        }
        qku qkuVar = new qku(pawVar, new ihs(this.g));
        this.G = qkuVar;
        pawVar.I(qkuVar);
        String str = this.n;
        String D = pawVar.D();
        wt0 b = this.h.b();
        o08 o08Var = this.j.get();
        String j = this.i.j();
        List list = this.l;
        List list2 = this.m;
        if (map != null) {
            if (this.L == null) {
                this.L = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.L;
            if (linkedHashMap != null) {
                linkedHashMap.putAll(map);
            }
        }
        LinkedHashMap linkedHashMap2 = this.L;
        String str2 = this.o;
        int l2 = pawVar.l();
        String f = this.h.b.f();
        D.getClass();
        b.getClass();
        o08Var.getClass();
        list.getClass();
        list2.getClass();
        n2t n2tVar = new n2t(str, D, b, ot0.T(o08Var), j, !list.isEmpty() ? CollectionsKt.X(list, ";", null, null, null, 62) : null, list2, linkedHashMap2, str2, null, l2, this.k, f);
        a aVar = this.H;
        if (aVar != null) {
            aVar.b = n2tVar;
        }
        if (aVar == null) {
            aVar = new a(this.p, n2tVar, this.a, this.b, this.c, this.d, this.e, this.r, this.B0, this.y, this.Z, this.z.b.v, new kgk(24, this));
            this.H = aVar;
        }
        a aVar2 = aVar;
        if (this.v0) {
            Object obj3 = map != null ? map.get("releaseTimestamp") : null;
            Long l3 = obj3 instanceof Long ? (Long) obj3 : null;
            aVar2.o(new PlayerState(0L, null, false, 0L, null, 0L, null, null, null, null, null, null, 0, 0L, null, null, PlaybackState.END, null, null, null, false, null, NetworkType.NETWORK_TYPE_UNKNOWN, null, null, null, null, null, null, 0L, 0L, ViewPortState.DEFAULT, 1.0d, 1.0d, null, null, false, null, null, new PlaybackViewState(false, null, null), null, null, null), new PlaybackException.ErrorPlayerReleased(System.currentTimeMillis() - (l3 != null ? l3.longValue() : 0L)), null);
            return;
        }
        zg7 zg7Var = this.J;
        if (zg7Var == null) {
            zg7Var = new zg7(aVar2, this.A);
            wa6 wa6Var = this.x;
            if (wa6Var != null) {
                wa6Var.accept(zg7Var);
            }
            this.J = zg7Var;
        }
        xgd xgdVar = this.u;
        rgu rguVar = this.A0;
        rguVar.getClass();
        synchronized (xgdVar.g) {
            try {
                bbv bbvVar = (bbv) xgdVar.f;
                bbvVar.getClass();
                synchronized (bbvVar.b) {
                    bbvVar.a.add(rguVar);
                }
                if (!xgdVar.b) {
                    Application application = (Application) xgdVar.d;
                    if (application != null) {
                        application.registerActivityLifecycleCallbacks((uf2) xgdVar.e);
                    }
                    xgdVar.b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        dyc dycVar = this.t;
        rgu rguVar2 = this.A0;
        rguVar2.getClass();
        dycVar.b.a(rguVar2);
        if (this.K == null) {
            qlr qlrVar = new qlr(this);
            ver verVar = this.v;
            if (verVar != null) {
                verVar.U(qlrVar);
            }
            this.K = qlrVar;
        }
        this.f.start();
        ujl ujlVar = this.g;
        oer oerVar = new oer(pawVar, ujlVar, new ihs(ujlVar), qkuVar, new j6e(pawVar, this.f), this.s, this.z0, this.t, this.w0, this.D0, this.A0, this.x0);
        rdr rdrVar = this.F;
        ScheduledExecutorService scheduledExecutorService = this.q;
        ScheduledExecutorService scheduledExecutorService2 = this.X;
        scheduledExecutorService2.getClass();
        AtomicBoolean atomicBoolean = this.y0;
        rgu rguVar3 = this.A0;
        bt2 bt2Var = this.w;
        if (bt2Var == null) {
            bt2Var = s7j.a;
        }
        bt2 bt2Var2 = bt2Var;
        d1 d1Var = this.z;
        z2t z2tVar = new z2t(rdrVar, aVar2, oerVar, parVar2, scheduledExecutorService, scheduledExecutorService2, zg7Var, atomicBoolean, rguVar3, bt2Var2, d1Var.b.y, d1Var);
        pawVar.I(z2tVar);
        pawVar.w(z2tVar);
        z2tVar.l = pawVar;
        rguVar3.getClass();
        rguVar3.b.a(z2tVar);
        this.E = z2tVar;
    }

    @Override // defpackage.olr
    public final nlr g() {
        return this.E;
    }

    @Override // defpackage.olr
    public final String k(String str, VideoData videoData, String str2, long j, boolean z, int i, boolean z2) {
        str.getClass();
        return this.B.b(str, videoData, str2, i);
    }

    @Override // defpackage.olr
    public final Map o() {
        return this.L;
    }

    @Override // defpackage.olr
    public final void stop() {
        b(false);
    }
}
