package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.quasar.glagol.impl.ConversationImpl;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.ExtendedStalledReason;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.RecoverDetails;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.TargetFormat;
import ru.yandex.video.m3.data.TrackSelectionType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.AbrPreferences;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.data.IgnoredErrorData;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.data.RendererEventData;
import ru.yandex.video.m3.player.impl.tracking.data.SimpleDecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.data.StalledStuckEventData;
import ru.yandex.video.m3.player.impl.tracking.errors.ErrorNoSupportedTracksForRenderer;
import ru.yandex.video.m3.player.impl.tracking.event.CanPlayData;
import ru.yandex.video.m3.player.impl.tracking.event.DebugReportData;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.ErrorPlayerData;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.LoadCancelData;
import ru.yandex.video.m3.player.impl.tracking.event.LoggingStalledReason;
import ru.yandex.video.m3.player.impl.tracking.event.PlaybackState;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveState;
import ru.yandex.video.m3.player.impl.tracking.event.SeekEventData;
import ru.yandex.video.m3.player.impl.tracking.event.StartPlayerData;
import ru.yandex.video.m3.player.impl.tracking.event.VideoConfigData;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class z2t implements rgl, u9l, nlr, uss, qgu {
    public final a a;
    public final oer b;
    public final par c;
    public final ScheduledExecutorService d;
    public final zg7 e;
    public final uss f;
    public final AtomicBoolean g;
    public final rgu h;
    public final bt2 i;
    public final boolean j;
    public final d1 k;
    public paw l;
    public volatile Object m;
    public volatile Object n;
    public boolean o;
    public boolean p;
    public final LinkedHashMap q;
    public StalledReason r;
    public boolean s;
    public boolean t;
    public volatile boolean u;
    public n0l v;
    public final nq0 w;
    public final chs x;

    public z2t(rdr rdrVar, a aVar, oer oerVar, par parVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, zg7 zg7Var, AtomicBoolean atomicBoolean, rgu rguVar, bt2 bt2Var, boolean z, d1 d1Var) {
        vss vssVar = new vss(aVar);
        scheduledExecutorService.getClass();
        scheduledExecutorService2.getClass();
        atomicBoolean.getClass();
        rguVar.getClass();
        d1Var.getClass();
        this.a = aVar;
        this.b = oerVar;
        this.c = parVar;
        this.d = scheduledExecutorService;
        this.e = zg7Var;
        this.f = vssVar;
        this.g = atomicBoolean;
        this.h = rguVar;
        this.i = bt2Var;
        this.j = z;
        this.k = d1Var;
        c5b c5bVar = c5b.a;
        this.m = c5bVar;
        this.n = c5bVar;
        this.q = new LinkedHashMap();
        this.r = StalledReason.INIT;
        this.s = rdrVar != null ? rdrVar.b : false;
        this.t = rdrVar != null ? rdrVar.a : false;
        nq0 nq0Var = new nq0(this, scheduledExecutorService2);
        this.w = nq0Var;
        this.x = new chs();
        y2x.Z(scheduledExecutorService2, new k9l(nq0Var, 2));
    }

    @Override // defpackage.rgl
    public final void A(int i, int i2) {
        this.f.A(i, i2);
    }

    @Override // defpackage.u9l
    public final void B(long j, long j2) {
        oer oerVar = this.b;
        synchronized (oerVar) {
            oerVar.l.offer(new Pair(Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    @Override // defpackage.rgl
    public final void C() {
        this.f.C();
    }

    @Override // defpackage.rgl
    public final void D() {
        this.f.D();
    }

    @Override // defpackage.rgl
    public final void E() {
        this.f.E();
    }

    @Override // defpackage.u9l
    public final void F(long j) {
        this.b.p = Long.valueOf(j);
    }

    @Override // defpackage.u9l
    public final void G(long j, TrackType trackType) {
        this.e.getClass();
    }

    @Override // defpackage.u9l
    public final void H(TrackType trackType, Integer num) {
        chs chsVar = this.x;
        chsVar.getClass();
        chsVar.a("TrackingObserver", "onLoadCanceled", "trackType: " + trackType + " quality: " + num, new Object[0]);
        PlayerState a = this.b.a();
        a aVar = this.a;
        aVar.getClass();
        cjb i = aVar.i();
        bjb j = aVar.j();
        boolean z = aVar.l;
        if (z) {
            x97.y(aVar.k, null, null, new jjb(j, (Continuation) null, aVar, a, trackType, num, i), 3);
            return;
        }
        Event event = Event.LOAD_CANCELED;
        EventType eventType = EventType.EVENT;
        aVar.g.getClass();
        eventType.getClass();
        ylr ylrVar = aVar.a;
        if (!z) {
            PlayerAliveState.Companion.getClass();
            ylrVar.b(a.h(aVar, j, event, null, null, null, new LoadCancelData(l9l.a(a), trackType, num), i, 14));
        } else {
            PlayerAliveState.Companion.getClass();
            EventDefault h = a.h(aVar, j, event, null, null, null, new LoadCancelData(l9l.a(a), trackType, num), i, 14);
            ylrVar.getClass();
            ylrVar.c(h);
        }
    }

    @Override // defpackage.u9l
    public final void I(LoadError loadError) {
        chs chsVar = this.x;
        chsVar.getClass();
        chsVar.a("TrackingObserver", "onLoadError", "loadError: " + loadError, new Object[0]);
        PlayerState a = this.b.a();
        a aVar = this.a;
        aVar.getClass();
        chs chsVar2 = aVar.p;
        chsVar2.getClass();
        chsVar2.a("[EventTrackerImpl]", "onLoadError", "loadError=" + loadError, new Object[0]);
        cjb i = aVar.i();
        bjb j = aVar.j();
        if (aVar.l) {
            x97.y(aVar.k, null, null, new fjb(j, (Continuation) null, aVar, a, loadError, i, 2), 3);
        } else {
            aVar.q(j, a, bfg.t(aVar.n, loadError), false, false, null, i);
        }
    }

    @Override // defpackage.u9l
    public final void J(mka mkaVar) {
        oer oerVar = this.b;
        oerVar.getClass();
        oerVar.o = new bh3(oerVar.o, mkaVar);
        this.e.J(mkaVar);
    }

    @Override // defpackage.u9l
    public final void K(TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
        trackType.getClass();
        str.getClass();
        this.q.put(trackType, str);
        this.e.K(trackType, str, mediaCodecSelectorLog);
    }

    @Override // defpackage.u9l
    public final void L(StartFromCacheInfo startFromCacheInfo) {
        if (startFromCacheInfo.getAudioCachePositionMs() == null || startFromCacheInfo.getVideoCachePositionMs() == null) {
            return;
        }
        a aVar = this.a;
        chs chsVar = aVar.p;
        boolean z = aVar.l;
        chsVar.getClass();
        chsVar.a("[EventTrackerImpl]", "onStartFromCacheInfoReady", null, new Object[0]);
        cjb i = aVar.i();
        bjb j = aVar.j();
        if (z) {
            x97.y(aVar.k, null, null, new oh3(j, (Continuation) null, aVar, startFromCacheInfo, i, 5), 3);
            return;
        }
        Event event = Event.CACHE_INFO_READY;
        EventType eventType = EventType.EVENT;
        aVar.g.getClass();
        eventType.getClass();
        ylr ylrVar = aVar.a;
        n0l n0lVar = j.a;
        if (!z) {
            ylrVar.b(a.h(aVar, j, event, null, null, null, new CanPlayData(null, n0lVar, startFromCacheInfo), i, 14));
            return;
        }
        EventDefault h = a.h(aVar, j, event, null, null, null, new CanPlayData(null, n0lVar, startFromCacheInfo), i, 14);
        ylrVar.getClass();
        ylrVar.c(h);
    }

    @Override // defpackage.u9l
    public final void M(LoadCanceled loadCanceled) {
        Object t7oVar;
        Object t7oVar2;
        a aVar = this.a;
        l4f l4fVar = aVar.h;
        cjb i = aVar.i();
        bjb j = aVar.j();
        boolean z = aVar.l;
        if (z) {
            x97.y(aVar.k, null, null, new oh3(j, (Continuation) null, aVar, i, loadCanceled, 3), 3);
            return;
        }
        Event event = Event.LOAD_CANCELED;
        EventType eventType = EventType.EVENT;
        aVar.g.getClass();
        eventType.getClass();
        ylr ylrVar = aVar.a;
        if (!z) {
            try {
                r7o r7oVar = z7o.b;
                t7oVar = l4fVar.to(loadCanceled);
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            ylrVar.b(a.h(aVar, j, event, null, null, null, new DefaultEventData((String) (t7oVar instanceof t7o ? null : t7oVar)), i, 14));
            return;
        }
        try {
            r7o r7oVar3 = z7o.b;
            t7oVar2 = l4fVar.to(loadCanceled);
        } catch (Throwable th2) {
            r7o r7oVar4 = z7o.b;
            t7oVar2 = new t7o(th2);
        }
        EventDefault h = a.h(aVar, j, event, null, null, null, new DefaultEventData((String) (t7oVar2 instanceof t7o ? null : t7oVar2)), i, 14);
        ylrVar.getClass();
        ylrVar.c(h);
    }

    @Override // defpackage.u9l
    public final void N(int i) {
        this.e.getClass();
    }

    @Override // defpackage.rgl
    public final void O(long j) {
        this.f.O(j);
    }

    @Override // defpackage.rgl
    public final void P(PlaybackException playbackException) {
        chs chsVar = this.x;
        chsVar.getClass();
        chsVar.a("TrackingObserver", "onPlaybackError", String.valueOf(playbackException), new Object[0]);
        t0(false);
        v0();
        oer oerVar = this.b;
        oerVar.getClass();
        oerVar.m = PlaybackState.PAUSE;
        x0();
        boolean z = this.j;
        a aVar = this.a;
        if (z) {
            y2t y2tVar = new y2t(this, 0);
            l4f l4fVar = aVar.h;
            boolean z2 = aVar.l;
            aVar.f.getClass();
            if (gos.t(playbackException).equals("UNSUPPORTED_ENV")) {
                cjb i = aVar.i();
                bjb j = aVar.j();
                if (z2) {
                    x97.y(aVar.k, null, null, new oh3(j, (Continuation) null, aVar, y2tVar, i, 4), 3);
                    aVar = aVar;
                } else {
                    Event event = Event.DEBUG_REPORT;
                    EventType eventType = EventType.EVENT;
                    aVar.g.getClass();
                    eventType.getClass();
                    ylr ylrVar = aVar.a;
                    if (z2) {
                        aVar = aVar;
                        EventDefault h = a.h(aVar, j, event, null, null, null, new DebugReportData(l4fVar.to(y2tVar.invoke())), i, 14);
                        ylrVar.getClass();
                        ylrVar.c(h);
                    } else {
                        aVar = aVar;
                        ylrVar.b(a.h(aVar, j, event, null, null, null, new DebugReportData(l4fVar.to(y2tVar.invoke())), i, 14));
                    }
                }
            }
        }
        aVar.o(oerVar.a(), playbackException, r0(playbackException));
    }

    @Override // defpackage.rgl
    public final void Q(long j) {
        this.f.Q(j);
    }

    @Override // defpackage.rgl
    public final void R(psb psbVar) {
        this.f.R(psbVar);
    }

    @Override // defpackage.u9l
    public final void S(Integer num) {
        this.e.getClass();
    }

    @Override // defpackage.rgl
    public final void T(VideoData videoData) {
        this.f.T(videoData);
    }

    @Override // defpackage.rgl
    public final void U() {
        this.f.U();
    }

    @Override // defpackage.u9l
    public final void V() {
        this.e.getClass();
    }

    @Override // defpackage.u9l
    public final void W(boolean z) {
        a aVar = this.a;
        chs chsVar = aVar.p;
        chsVar.getClass();
        chsVar.a("[EventTrackerImpl]", "onStop", null, new Object[0]);
        cjb i = aVar.i();
        bjb j = aVar.j();
        boolean z2 = aVar.l;
        if (z2) {
            x97.y(aVar.k, null, null, new njb(j, null, aVar, z, i), 3);
        } else {
            Event event = Event.STOP;
            EventType eventType = EventType.EVENT;
            aVar.g.getClass();
            eventType.getClass();
            ylr ylrVar = aVar.a;
            if (z2) {
                EventDefault h = a.h(aVar, j, event, null, null, null, new DefaultEventData("{\"keepDecoders\":" + z + '}'), i, 14);
                ylrVar.getClass();
                ylrVar.c(h);
            } else {
                ylrVar.b(a.h(aVar, j, event, null, null, null, new DefaultEventData("{\"keepDecoders\":" + z + '}'), i, 14));
            }
        }
        w0();
        nq0 nq0Var = this.w;
        y2x.Z((ScheduledExecutorService) nq0Var.f, new k9l(nq0Var, 3));
        this.e.d = z;
    }

    @Override // defpackage.nlr
    public final void X(PlaybackException playbackException) {
        this.a.n(this.b.a(), playbackException, false, null);
    }

    @Override // defpackage.u9l
    public final void Y(long j) {
        this.e.getClass();
    }

    @Override // defpackage.u9l
    public final void Z() {
        this.e.getClass();
    }

    @Override // defpackage.rgl
    public final void a() {
        paw pawVar;
        chs chsVar = this.x;
        chsVar.getClass();
        StringBuilder sb = new StringBuilder("isWatchEverStarted=");
        sb.append(this.o);
        sb.append(" player?.isPlayingAd()=");
        paw pawVar2 = this.l;
        sb.append(pawVar2 != null ? Boolean.valueOf(pawVar2.i()) : null);
        chsVar.a("TrackingObserver", "onResumePlayback", sb.toString(), new Object[0]);
        chsVar.getClass();
        StringBuilder sb2 = new StringBuilder("isWatchEverStarted=");
        sb2.append(this.o);
        sb2.append(" player?.isPlayingAd()=");
        paw pawVar3 = this.l;
        sb2.append(pawVar3 != null ? Boolean.valueOf(pawVar3.i()) : null);
        chsVar.a("TrackingObserver", "maybeSendStart", sb2.toString(), new Object[0]);
        boolean z = this.o;
        oer oerVar = this.b;
        if (!z && ((pawVar = this.l) == null || !pawVar.i())) {
            chsVar.getClass();
            chsVar.a("TrackingObserver", "maybeSendStart", "send Start", new Object[0]);
            PlayerState a = oerVar.a();
            a aVar = this.a;
            aVar.getClass();
            boolean z2 = aVar.l;
            LinkedHashMap linkedHashMap = this.q;
            linkedHashMap.getClass();
            chs chsVar2 = aVar.p;
            chsVar2.getClass();
            chsVar2.a("[EventTrackerImpl]", "onStart", null, new Object[0]);
            cjb i = aVar.i();
            bjb j = aVar.j();
            if (z2) {
                x97.y(aVar.k, null, null, new fjb(j, (Continuation) null, aVar, a, linkedHashMap, i, 5), 3);
            } else {
                Event event = Event.START;
                EventType eventType = EventType.EVENT;
                aVar.g.getClass();
                eventType.getClass();
                ylr ylrVar = aVar.a;
                if (z2) {
                    EventDefault h = a.h(aVar, j, event, null, a.getVideoType(), null, new StartPlayerData(linkedHashMap, a.e(a), a.getInitialBandwidthEstimates()), i, 10);
                    ylrVar.getClass();
                    ylrVar.c(h);
                } else {
                    ylrVar.b(a.h(aVar, j, event, null, a.getVideoType(), null, new StartPlayerData(linkedHashMap, a.e(a), a.getInitialBandwidthEstimates()), i, 10));
                }
            }
            this.o = true;
        }
        paw pawVar4 = this.l;
        if (pawVar4 == null || !pawVar4.i()) {
            s0();
            oerVar.getClass();
            oerVar.m = PlaybackState.PLAY;
            this.o = true;
        }
        x0();
    }

    @Override // defpackage.u9l
    public final void a0(ExtendedStalledReason extendedStalledReason) {
        par parVar = this.c;
        parVar.getClass();
        parVar.g = extendedStalledReason;
    }

    @Override // defpackage.u9l
    public final void b(String str) {
        TrackType trackType = TrackType.Video;
        if (str == null) {
            str = "unknown";
        }
        this.a.m(trackType, new SimpleDecoderEventData(str));
    }

    @Override // defpackage.rgl
    public final void b0() {
        x0();
    }

    @Override // defpackage.u9l
    public final void c(int i, long j, long j2) {
        this.e.getClass();
    }

    @Override // defpackage.u9l
    public final void c0(String str) {
        n0l n0lVar;
        kfg kfgVar;
        kfg kfgVar2;
        chs chsVar = this.x;
        chsVar.getClass();
        Continuation continuation = null;
        chsVar.a("TrackingObserver", "onLoadSource", null, new Object[0]);
        n0l n0lVar2 = this.v;
        if (n0lVar2 instanceof l0l) {
            l0l l0lVar = (l0l) n0lVar2;
            paw pawVar = this.l;
            VideoData G = pawVar != null ? pawVar.G() : null;
            String str2 = l0lVar.a;
            n0lVar = new l0l(l0lVar.c, l0lVar.i, l0lVar.b, str2, l0lVar.e, str, G, l0lVar.h, l0lVar.d);
        } else if (n0lVar2 instanceof m0l) {
            m0l m0lVar = (m0l) n0lVar2;
            VideoData videoData = m0lVar.a;
            String str3 = m0lVar.b;
            n0lVar = new m0l(m0lVar.d, m0lVar.i, m0lVar.c, str3, m0lVar.f, str, videoData, m0lVar.h, m0lVar.e);
        } else {
            if (n0lVar2 != null) {
                b6e.s();
                return;
            }
            n0lVar = null;
        }
        this.v = n0lVar;
        a aVar = this.a;
        chs chsVar2 = aVar.p;
        chsVar2.getClass();
        chsVar2.a("[EventTrackerImpl]", "onLoadSource", null, new Object[0]);
        cjb i = aVar.i();
        bjb j = aVar.j();
        if (aVar.l) {
            x97.y(aVar.k, null, null, new kjb(j, continuation, aVar, i, 0), 3);
        } else {
            Event event = Event.LOAD_SOURCE;
            EventType eventType = EventType.EVENT;
            aVar.g.getClass();
            eventType.getClass();
            boolean z = aVar.l;
            ylr ylrVar = aVar.a;
            n0l n0lVar3 = j.a;
            if (z) {
                if (n0lVar3 != null) {
                    fs7 fs7Var = aVar.i;
                    VideoData i2 = n0lVar3.i();
                    fs7Var.getClass();
                    kfgVar2 = new kfg(n0lVar3, new LinkedHashMap(fs7.B(i2)), aVar.h.to(new VideoConfigData(n0lVar3).getConfig()));
                } else {
                    kfgVar2 = null;
                }
                EventDefault h = a.h(aVar, j, event, null, null, null, men.E(kfgVar2), i, 14);
                ylrVar.getClass();
                ylrVar.c(h);
            } else {
                if (n0lVar3 != null) {
                    fs7 fs7Var2 = aVar.i;
                    VideoData i3 = n0lVar3.i();
                    fs7Var2.getClass();
                    kfgVar = new kfg(n0lVar3, new LinkedHashMap(fs7.B(i3)), aVar.h.to(new VideoConfigData(n0lVar3).getConfig()));
                } else {
                    kfgVar = null;
                }
                ylrVar.b(a.h(aVar, j, event, null, null, null, men.E(kfgVar), i, 14));
            }
        }
        oer oerVar = this.b;
        oerVar.getClass();
        oerVar.t = null;
    }

    @Override // defpackage.u9l
    public final void d(String str) {
        str.getClass();
        this.a.m(TrackType.Audio, new SimpleDecoderEventData(str));
    }

    @Override // defpackage.u9l
    public final void d0(StalledReason stalledReason) {
        stalledReason.getClass();
        chs chsVar = this.x;
        chsVar.getClass();
        chsVar.a("TrackingObserver", "onLoadingStart", "stalledReason = " + stalledReason, new Object[0]);
        this.r = stalledReason;
        this.s = true;
        if (this.t) {
            u0(stalledReason);
        }
        v0();
    }

    @Override // defpackage.rgl
    public final void e() {
        chs chsVar = this.x;
        chsVar.getClass();
        chsVar.a("TrackingObserver", "onPlaybackEnded", null, new Object[0]);
        v0();
        oer oerVar = this.b;
        oerVar.getClass();
        oerVar.m = PlaybackState.END;
        x0();
        PlayerState a = oerVar.a();
        a aVar = this.a;
        aVar.getClass();
        chs chsVar2 = aVar.p;
        chsVar2.getClass();
        chsVar2.a("[EventTrackerImpl]", "onEnd", null, new Object[0]);
        cjb i = aVar.i();
        bjb j = aVar.j();
        boolean z = aVar.l;
        if (z) {
            x97.y(aVar.k, null, null, new ejb(j, null, aVar, a, i, 5), 3);
            return;
        }
        EventType eventType = EventType.EVENT;
        aVar.g.getClass();
        eventType.getClass();
        ylr ylrVar = aVar.a;
        if (!z) {
            ylrVar.b(a.g(aVar, j, "End", a.getVideoType(), null, a.e(a), i, 10));
            return;
        }
        EventDefault g = a.g(aVar, j, "End", a.getVideoType(), null, a.e(a), i, 10);
        ylrVar.getClass();
        ylrVar.c(g);
    }

    @Override // defpackage.u9l
    public final void e0(String str) {
        str.getClass();
        chs chsVar = this.x;
        chsVar.getClass();
        chsVar.a("TrackingObserver", "onNetPerfDisabled", null, new Object[0]);
        PlayerState a = this.b.a();
        a aVar = this.a;
        aVar.getClass();
        chs chsVar2 = aVar.p;
        chsVar2.getClass();
        chsVar2.a("[EventTrackerImpl]", "onNetPerfDisabled", "className=".concat(str), new Object[0]);
        cjb i = aVar.i();
        bjb j = aVar.j();
        boolean z = aVar.l;
        if (z) {
            x97.y(aVar.k, null, null, new fjb(j, (Continuation) null, aVar, a, str, i, 3), 3);
            return;
        }
        EventType eventType = EventType.ERROR;
        aVar.g.getClass();
        eventType.getClass();
        ylr ylrVar = aVar.a;
        if (!z) {
            Event event = Event.NET_PERF_DISABLED;
            ylrVar.b(a.g(aVar, j, event.getEventName(), a.getVideoType(), eventType, new ErrorPlayerData("NetPerfManager is not applied to ChunkDataSourceFactory. ClassName=".concat(str), event.getEventName(), false, "", null, null, "CONFIG", a.e(a), null), i, 2));
        } else {
            Event event2 = Event.NET_PERF_DISABLED;
            EventDefault g = a.g(aVar, j, event2.getEventName(), a.getVideoType(), eventType, new ErrorPlayerData("NetPerfManager is not applied to ChunkDataSourceFactory. ClassName=".concat(str), event2.getEventName(), false, "", null, null, "CONFIG", a.e(a), null), i, 2);
            ylrVar.getClass();
            ylrVar.c(g);
        }
    }

    @Override // defpackage.rgl
    public final void f() {
        chs chsVar = this.x;
        chsVar.getClass();
        chsVar.a("TrackingObserver", "onPausePlayback", null, new Object[0]);
        oer oerVar = this.b;
        oerVar.getClass();
        oerVar.m = PlaybackState.PAUSE;
        x0();
        v0();
    }

    @Override // defpackage.u9l
    public final void f0(Size size) {
        this.e.getClass();
    }

    @Override // defpackage.u9l
    public final void g(long j, long j2, String str) {
        str.getClass();
        this.e.getClass();
    }

    @Override // defpackage.rgl
    public final void g0() {
        chs chsVar = this.x;
        chsVar.getClass();
        StringBuilder sb = new StringBuilder("player?.isPlaying()=");
        paw pawVar = this.l;
        sb.append(pawVar != null ? Boolean.valueOf(pawVar.e()) : null);
        sb.append(" player.isPlaying()=");
        paw pawVar2 = this.l;
        sb.append(pawVar2 != null ? Boolean.valueOf(pawVar2.e()) : null);
        sb.append("  player.isPlayingAd()=");
        paw pawVar3 = this.l;
        sb.append(pawVar3 != null ? Boolean.valueOf(pawVar3.i()) : null);
        sb.append(" willPlayWhenReady=");
        sb.append(this.t);
        chsVar.a("TrackingObserver", "onLoadingFinished", sb.toString(), new Object[0]);
        this.s = false;
        w0();
        if (this.t) {
            paw pawVar4 = this.l;
            if (pawVar4 == null || !pawVar4.i()) {
                s0();
            }
        }
    }

    @Override // defpackage.u9l
    public final void h(int i) {
        this.e.getClass();
    }

    @Override // defpackage.rgl
    public final void h0(VideoData videoData) {
        this.f.h0(videoData);
    }

    @Override // defpackage.u9l
    public final void i(mka mkaVar) {
        this.e.i(mkaVar);
    }

    @Override // defpackage.rgl
    public final void i0() {
        this.f.i0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e3  */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v1, types: [ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData] */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // defpackage.u9l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(PreparingParams preparingParams) {
        PreparingParams preparingParams2;
        n0l n0lVar;
        n0l n0lVar2;
        AtomicBoolean atomicBoolean;
        preparingParams.getClass();
        String contentId = preparingParams.getContentId();
        VideoData videoData = preparingParams.getVideoData();
        ?? r14 = 0;
        VideoConfigData videoConfigData = null;
        if (videoData != null) {
            Long startPosition = preparingParams.getStartPosition();
            int sourceIndex = preparingParams.getSourceIndex();
            boolean autoPlay = preparingParams.getAutoPlay();
            String adContentId = preparingParams.getAdContentId();
            AbrPreferences abrPreferences = preparingParams.getAbrPreferences();
            preparingParams.getStartQualityConstraint();
            n0lVar = new m0l(Integer.valueOf(sourceIndex), null, startPosition, contentId, adContentId, preparingParams.getExpandedManifestUrl(), videoData, abrPreferences, autoPlay);
        } else {
            if (contentId == null) {
                StringBuilder sb = new StringBuilder("Either contentId or videoData must be not null in ");
                preparingParams2 = preparingParams;
                sb.append(preparingParams2);
                Timber.INSTANCE.e(sb.toString(), new Object[0]);
                n0lVar = null;
                this.v = n0lVar;
                boolean isFirstEverStart = preparingParams2.getIsFirstEverStart();
                boolean autoPlay2 = preparingParams2.getAutoPlay();
                chs chsVar = this.x;
                chsVar.getClass();
                chsVar.a("TrackingObserver", "onPlaybackInitialization", chsVar + ' ' + Thread.currentThread().getName(), new Object[0]);
                chsVar.getClass();
                chsVar.a("TrackingObserver", "onPlaybackInitialization", "onInitialization isFirstEverStart=" + isFirstEverStart + " autoPlay=" + autoPlay2, new Object[0]);
                nq0 nq0Var = this.w;
                y2x.Z((ScheduledExecutorService) nq0Var.f, new k9l(nq0Var, 1));
                n0lVar2 = this.v;
                a aVar = this.a;
                if (n0lVar2 == null) {
                    aVar.n(this.b.a(), new RuntimeException() { // from class: ru.yandex.video.m3.player.impl.tracking.TrackingObserver$MissingPlaybackOptionsException
                        public static final int $stable = 0;
                    }, false, null);
                }
                atomicBoolean = this.g;
                if (atomicBoolean.get()) {
                    chs chsVar2 = aVar.p;
                    l4f l4fVar = aVar.h;
                    boolean z = aVar.l;
                    chsVar2.getClass();
                    chsVar2.a("[EventTrackerImpl]", "onSetSource", null, new Object[0]);
                    cjb i = aVar.i();
                    bjb j = aVar.j();
                    if (z) {
                        x97.y(aVar.k, null, null, new kjb(j, r14, aVar, i, 1), 3);
                    } else {
                        Event event = Event.SET_SOURCE;
                        EventType eventType = EventType.EVENT;
                        aVar.g.getClass();
                        eventType.getClass();
                        ylr ylrVar = aVar.a;
                        n0l n0lVar3 = j.a;
                        if (z) {
                            if (n0lVar3 != null) {
                                videoConfigData = new VideoConfigData(n0lVar3);
                                videoConfigData.setDetails(l4fVar.to(videoConfigData.getConfig()));
                            }
                            EventDefault h = a.h(aVar, j, event, null, null, null, men.E(videoConfigData), i, 14);
                            ylrVar.getClass();
                            ylrVar.c(h);
                        } else {
                            if (n0lVar3 != null) {
                                VideoConfigData videoConfigData2 = new VideoConfigData(n0lVar3);
                                videoConfigData2.setDetails(l4fVar.to(videoConfigData2.getConfig()));
                                r14 = videoConfigData2;
                            }
                            ylrVar.b(a.h(aVar, j, event, null, null, null, men.E(r14), i, 14));
                        }
                    }
                } else {
                    aVar.getClass();
                    d1 d1Var = this.k;
                    d1Var.getClass();
                    chs chsVar3 = aVar.p;
                    chsVar3.getClass();
                    chsVar3.a("[EventTrackerImpl]", "onCreatePlayer", "vsid=".concat(aVar.b.b), new Object[0]);
                    cjb i2 = aVar.i();
                    xqn xqnVar = new xqn();
                    bjb j2 = aVar.j();
                    if (aVar.l) {
                        x97.y(aVar.k, null, null, new xg(xqnVar, aVar, j2, i2, d1Var, (Continuation) null, 7), 3);
                    } else {
                        LinkedHashMap k = a.k();
                        xqnVar.a = k;
                        aVar.l(j2, k, i2, d1Var);
                    }
                    atomicBoolean.set(false);
                }
                if (this.s || !autoPlay2) {
                }
                d0(StalledReason.SET_SOURCE);
                return;
            }
            Long startPosition2 = preparingParams.getStartPosition();
            int sourceIndex2 = preparingParams.getSourceIndex();
            boolean autoPlay3 = preparingParams.getAutoPlay();
            String adContentId2 = preparingParams.getAdContentId();
            AbrPreferences abrPreferences2 = preparingParams.getAbrPreferences();
            preparingParams.getStartQualityConstraint();
            n0lVar = new l0l(Integer.valueOf(sourceIndex2), null, startPosition2, contentId, adContentId2, preparingParams.getExpandedManifestUrl(), null, abrPreferences2, autoPlay3);
        }
        preparingParams2 = preparingParams;
        this.v = n0lVar;
        boolean isFirstEverStart2 = preparingParams2.getIsFirstEverStart();
        boolean autoPlay22 = preparingParams2.getAutoPlay();
        chs chsVar4 = this.x;
        chsVar4.getClass();
        chsVar4.a("TrackingObserver", "onPlaybackInitialization", chsVar4 + ' ' + Thread.currentThread().getName(), new Object[0]);
        chsVar4.getClass();
        chsVar4.a("TrackingObserver", "onPlaybackInitialization", "onInitialization isFirstEverStart=" + isFirstEverStart2 + " autoPlay=" + autoPlay22, new Object[0]);
        nq0 nq0Var2 = this.w;
        y2x.Z((ScheduledExecutorService) nq0Var2.f, new k9l(nq0Var2, 1));
        n0lVar2 = this.v;
        a aVar2 = this.a;
        if (n0lVar2 == null) {
        }
        atomicBoolean = this.g;
        if (atomicBoolean.get()) {
        }
        if (this.s) {
        }
    }

    @Override // defpackage.u9l
    public final void j0(FullscreenDataBundle fullscreenDataBundle) {
        fullscreenDataBundle.getClass();
        this.e.getClass();
    }

    @Override // defpackage.u9l
    public final void k(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        this.e.k(isbVar, mediaCodecReuseLog);
    }

    @Override // defpackage.u9l
    public final void k0(gfc gfcVar) {
        StartFromCacheInfo startFromCacheInfo = gfcVar.a;
        chs chsVar = this.x;
        chsVar.getClass();
        chsVar.a("TrackingObserver", "onReadyForFirstPlayback", "isWatchEverStarted=" + this.o + " firstPlaybackInfo=" + gfcVar, new Object[0]);
        if (this.o) {
            return;
        }
        a aVar = this.a;
        aVar.getClass();
        boolean z = aVar.l;
        chs chsVar2 = aVar.p;
        chsVar2.getClass();
        chsVar2.a("[EventTrackerImpl]", "onCanPlay", null, new Object[0]);
        cjb i = aVar.i();
        bjb j = aVar.j();
        if (z) {
            x97.y(aVar.k, null, null, new oh3(j, (Continuation) null, aVar, gfcVar, i, 2), 3);
            return;
        }
        Event event = Event.CAN_PLAY;
        EventType eventType = EventType.EVENT;
        aVar.g.getClass();
        eventType.getClass();
        ylr ylrVar = aVar.a;
        TrackSelectionType trackSelectionType = gfcVar.b;
        n0l n0lVar = j.a;
        if (!z) {
            ylrVar.b(a.h(aVar, j, event, null, null, null, new CanPlayData(trackSelectionType, n0lVar, startFromCacheInfo), i, 14));
            return;
        }
        EventDefault h = a.h(aVar, j, event, null, null, null, new CanPlayData(trackSelectionType, n0lVar, startFromCacheInfo), i, 14);
        ylrVar.getClass();
        ylrVar.c(h);
    }

    @Override // defpackage.rgl
    public final void l() {
        this.f.l();
    }

    @Override // defpackage.u9l
    public final void l0(PlaybackException playbackException, String str) {
        this.a.n(this.b.a(), playbackException, false, new IgnoredErrorData(str, false, 2, null));
    }

    @Override // defpackage.rgl
    public final void m(iyn iynVar) {
        iynVar.getClass();
        oer oerVar = this.b;
        oerVar.getClass();
        g8c g8cVar = oerVar.s;
        g8cVar.getClass();
        g8cVar.a = g8c.l(iynVar);
        x0();
    }

    @Override // defpackage.rgl
    public final void m0(long j) {
        this.f.m0(j);
    }

    @Override // defpackage.rgl
    public final void n(boolean z) {
        t0(z);
    }

    @Override // defpackage.u9l
    public final void n0(PlaybackException playbackException) {
        chs chsVar = this.x;
        chsVar.getClass();
        chsVar.a("TrackingObserver", "onPlayerWillTryRecoverAfterError", String.valueOf(playbackException), new Object[0]);
        this.a.n(this.b.a(), playbackException, false, r0(playbackException));
    }

    @Override // defpackage.rgl
    public final void o(nqs nqsVar, nqs nqsVar2, nqs nqsVar3) {
        nqsVar.getClass();
        nqsVar2.getClass();
        nqsVar3.getClass();
        if (!this.o && !this.p) {
            TrackVariant c = ((jsb) nqsVar3).c();
            TrackVariant.Adaptive adaptive = c instanceof TrackVariant.Adaptive ? (TrackVariant.Adaptive) c : null;
            r0t trackSelectionInitializationError = adaptive != null ? adaptive.getTrackSelectionInitializationError() : null;
            if (trackSelectionInitializationError != null) {
                this.p = true;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                TargetFormat targetFormat = trackSelectionInitializationError.b;
                if (targetFormat != null) {
                    linkedHashMap.put("targetFormat", targetFormat);
                }
                linkedHashMap.put("allFormats", trackSelectionInitializationError.c);
                linkedHashMap.put("selectedFormats", trackSelectionInitializationError.d);
                this.a.n(this.b.a(), new PlaybackException.TrackSelectionInitialization(trackSelectionInitializationError.a, linkedHashMap), false, null);
            }
        }
        this.f.o(nqsVar, nqsVar2, nqsVar3);
    }

    @Override // defpackage.u9l
    public final void o0(Size size) {
        this.e.getClass();
    }

    @Override // defpackage.u9l
    public final void p(LinkedHashMap linkedHashMap) {
        oer oerVar = this.b;
        oerVar.getClass();
        oerVar.q = linkedHashMap;
    }

    @Override // defpackage.u9l
    public final void p0() {
        oer oerVar = this.b;
        if (oerVar.t == null) {
            oerVar.t = oerVar.a();
        }
    }

    @Override // defpackage.rgl
    public final void q() {
        oer oerVar = this.b;
        g8c g8cVar = oerVar.s;
        Integer num = (Integer) g8cVar.a;
        g8cVar.a = Integer.valueOf((num != null ? num.intValue() : 0) + 1);
        PlayerState a = oerVar.a();
        a aVar = this.a;
        aVar.getClass();
        boolean z = aVar.l;
        chs chsVar = aVar.p;
        chsVar.getClass();
        chsVar.a("[EventTrackerImpl]", "onRepeat", "Loop", new Object[0]);
        cjb i = aVar.i();
        bjb j = aVar.j();
        if (z) {
            x97.y(aVar.k, null, null, new ejb(j, null, aVar, a, i, 6), 3);
            return;
        }
        EventType eventType = EventType.EVENT;
        aVar.g.getClass();
        eventType.getClass();
        ylr ylrVar = aVar.a;
        if (!z) {
            ylrVar.b(a.g(aVar, j, "Loop", a.getVideoType(), null, a.e(a), i, 10));
            return;
        }
        EventDefault g = a.g(aVar, j, "Loop", a.getVideoType(), null, a.e(a), i, 10);
        ylrVar.getClass();
        ylrVar.c(g);
    }

    @Override // defpackage.u9l
    public final void q0(PlaybackException playbackException, RecoverDetails recoverDetails) {
        recoverDetails.getClass();
        chs chsVar = this.x;
        chsVar.getClass();
        chsVar.a("TrackingObserver", "onPlayerWillTryRecoverAfterError", String.valueOf(playbackException), new Object[0]);
        a aVar = this.a;
        aVar.getClass();
        ehv ehvVar = aVar.e;
        l4f l4fVar = aVar.h;
        chs chsVar2 = aVar.p;
        chsVar2.getClass();
        chsVar2.a("[EventTrackerImpl]", "onRecoverStreamError", null, new Object[0]);
        cjb i = aVar.i();
        bjb j = aVar.j();
        boolean z = aVar.l;
        if (z) {
            x97.y(aVar.k, null, null, new fjb(j, (Continuation) null, aVar, i, playbackException, recoverDetails), 3);
            return;
        }
        Event event = Event.RECOVER_STREAM_ERROR;
        EventType eventType = EventType.EVENT;
        aVar.g.getClass();
        eventType.getClass();
        ylr ylrVar = aVar.a;
        if (!z) {
            DefaultEventData defaultEventData = new DefaultEventData(null, 1, null);
            ehvVar.getClass();
            defaultEventData.setDetails(l4fVar.to(uah.e(new Pair("errorName", l4fVar.to(ehv.n(playbackException))), new Pair("recoverDetails", l4fVar.to(recoverDetails)))));
            ylrVar.b(a.h(aVar, j, event, null, null, null, defaultEventData, i, 14));
            return;
        }
        DefaultEventData defaultEventData2 = new DefaultEventData(null, 1, null);
        ehvVar.getClass();
        defaultEventData2.setDetails(l4fVar.to(uah.e(new Pair("errorName", l4fVar.to(ehv.n(playbackException))), new Pair("recoverDetails", l4fVar.to(recoverDetails)))));
        EventDefault h = a.h(aVar, j, event, null, null, null, defaultEventData2, i, 14);
        ylrVar.getClass();
        ylrVar.c(h);
    }

    @Override // defpackage.u9l
    public final void r(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        this.e.r(isbVar, mediaCodecReuseLog);
    }

    public final DefaultEventData r0(Throwable th) {
        xg7 xg7Var;
        String str;
        if (th instanceof PlaybackException.ErrorInRenderer) {
            zg7 zg7Var = this.e;
            if (zg7Var == null) {
                zg7Var = null;
            }
            if (zg7Var != null) {
                TrackType trackType = ((PlaybackException.ErrorInRenderer) th).getTrackType();
                int i = trackType == null ? -1 : yg7.a[trackType.ordinal()];
                if ((i == 1 || i == 2) && (xg7Var = (xg7) zg7Var.c.get(trackType)) != null) {
                    tvs tvsVar = xg7Var.l;
                    if (tvsVar == null || (str = xg7Var.m) == null || xg7Var.f == null) {
                        ngl.r(xg7Var.k, "DecoderUsageObserverImpl", "getRendererData", "Invalid renderer data " + xg7Var, null, new Object[0], 8);
                        return null;
                    }
                    isb isbVar = (isb) tvsVar;
                    String str2 = isbVar.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    return new RendererEventData(str, str2, new Integer[]{Integer.valueOf(isbVar.f), Integer.valueOf(isbVar.g)});
                }
            }
        } else if (th instanceof PlaybackException.ErrorStalledStuck) {
            return new StalledStuckEventData(((PlaybackException.ErrorStalledStuck) th).getLoadControlState());
        }
        return null;
    }

    @Override // defpackage.u9l
    public final void s(VideoType videoType, StreamType streamType) {
        this.e.getClass();
    }

    public final void s0() {
        if (!((Collection) this.m).isEmpty()) {
            chs chsVar = this.x;
            chsVar.getClass();
            chsVar.a("TrackingObserver", "scheduleWatchEvents", "WatchEvents already scheduled", new Object[0]);
            return;
        }
        if (this.u) {
            chs chsVar2 = this.x;
            chsVar2.getClass();
            chsVar2.a("TrackingObserver", "scheduleWatchEvents", "TrackingObserver already released", new Object[0]);
            return;
        }
        PlayerState a = this.b.a();
        chs chsVar3 = this.x;
        chsVar3.getClass();
        chsVar3.a("TrackingObserver", "scheduleWatchEvents", "watched=" + a.getWatchedTime(), new Object[0]);
        long watchedTime = a.getWatchedTime();
        Pair[] pairArr = {new Pair(Long.valueOf(((long) ConversationImpl.INCORRECT_TOKEN) - watchedTime), new y2t(this, 1)), new Pair(Long.valueOf(((long) 10000) - watchedTime), new y2t(this, 2)), new Pair(Long.valueOf(((long) 20000) - watchedTime), new y2t(this, 3))};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            if (((Number) pair.a).longValue() >= 0) {
                arrayList.add(pair);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            chs chsVar4 = this.x;
            chsVar4.getClass();
            chsVar4.a("TrackingObserver", "scheduleWatchEvents", "schedule event 4, 10 and 20 sec events on scheduler delay=" + ((Number) pair2.a).longValue(), new Object[0]);
            arrayList2.add(y2x.X(this.d, new ti(8, (Function0) pair2.b), ((Number) pair2.a).longValue()));
        }
        long j = 30000;
        ScheduledFuture W = y2x.W(this.d, new bhp(15, this), j - (watchedTime % j), 30000L, TimeUnit.MILLISECONDS);
        chs chsVar5 = this.x;
        chsVar5.getClass();
        chsVar5.a("TrackingObserver", "scheduleWatchEvents", "schedule event 30 sec event on scheduler", new Object[0]);
        this.m = CollectionsKt.h0(arrayList2, W);
    }

    @Override // defpackage.rgl
    public final void t(long j, long j2) {
        w0();
        a aVar = this.a;
        cjb i = aVar.i();
        bjb j3 = aVar.j();
        boolean z = aVar.l;
        if (z) {
            x97.y(aVar.k, null, null, new ljb(j3, null, aVar, j, j2, i), 3);
        } else {
            Event event = Event.SEEK;
            EventType eventType = EventType.EVENT;
            aVar.g.getClass();
            eventType.getClass();
            ylr ylrVar = aVar.a;
            if (z) {
                EventDefault g = a.g(aVar, j3, event.getEventName(), null, null, new SeekEventData(j, j2), i, 10);
                ylrVar.getClass();
                ylrVar.c(g);
            } else {
                ylrVar.b(a.g(aVar, j3, event.getEventName(), null, null, new SeekEventData(j, j2), i, 10));
            }
        }
        if (this.s && this.t) {
            StalledReason stalledReason = StalledReason.SEEK;
            this.r = stalledReason;
            u0(stalledReason);
        }
    }

    public final void t0(boolean z) {
        par parVar = this.c;
        if (z != parVar.f || parVar.e == -1) {
            parVar.f = z;
            parVar.e = z ? SystemClock.elapsedRealtime() : -1L;
        }
        boolean z2 = this.t;
        chs chsVar = this.x;
        if (z2 == z) {
            chsVar.getClass();
            chsVar.a("TrackingObserver", "setPlayWhenReady", "onWillPlayWhenReadyPossiblyChanged willPlayWhenReady hasn't changed. It is still " + this.t, new Object[0]);
            return;
        }
        chsVar.getClass();
        chsVar.a("TrackingObserver", "setPlayWhenReady", "onWillPlayWhenReadyChanged willPlayWhenReady=" + z + " isLoading=" + this.s, new Object[0]);
        this.t = z;
        if (this.s) {
            if (z) {
                u0(this.r);
            } else {
                w0();
                this.r = StalledReason.OTHER;
            }
        }
    }

    @Override // defpackage.u9l
    public final void u(TrackType trackType, String str) {
        trackType.getClass();
        int i = x2t.a[trackType.ordinal()];
        Throwable audio = i != 1 ? i != 2 ? null : new ErrorNoSupportedTracksForRenderer.Audio(str) : new ErrorNoSupportedTracksForRenderer.Video(str);
        if (audio != null) {
            this.a.n(this.b.a(), audio, true, r0(audio));
        }
    }

    public final void u0(StalledReason stalledReason) {
        long j;
        ArrayList arrayList;
        ArrayList arrayList2;
        nar narVar;
        Object obj;
        stalledReason.getClass();
        int i = 0;
        if (!((Collection) this.n).isEmpty()) {
            chs chsVar = this.x;
            chsVar.getClass();
            chsVar.a("TrackingObserver", "startStalled", "stalled already started", new Object[0]);
            return;
        }
        boolean z = this.u;
        chs chsVar2 = this.x;
        if (z) {
            chsVar2.getClass();
            chsVar2.a("TrackingObserver", "startStalled", "TrackingObserver already released", new Object[0]);
            return;
        }
        chsVar2.getClass();
        chsVar2.a("TrackingObserver", "startStalled", "stalledReason = " + stalledReason + " thread=" + Thread.currentThread(), new Object[0]);
        par parVar = this.c;
        LoggingStalledReason H = men.H(stalledReason);
        synchronized (parVar) {
            try {
                H.getClass();
                parVar.b = H;
                parVar.c = SystemClock.elapsedRealtime();
                int i2 = oar.a[H.ordinal()];
                Object obj2 = null;
                boolean z2 = true;
                int i3 = 4;
                if (i2 == 1 || i2 == 2) {
                    j = 0;
                    Long[] lArr = bow.o;
                    arrayList = new ArrayList(4);
                    while (i < 4) {
                        long longValue = lArr[i].longValue();
                        if (longValue == 0) {
                            long millis = TimeUnit.SECONDS.toMillis(longValue);
                            au1 au1Var = parVar.a;
                            Long l = (Long) au1Var.c;
                            au1Var.c = obj2;
                            arrayList2 = arrayList;
                            narVar = new nar(H, millis, parVar.d, l, null, parVar.g, 16);
                        } else {
                            arrayList2 = arrayList;
                            narVar = new nar(H, TimeUnit.SECONDS.toMillis(longValue), parVar.d, null, null, parVar.g, 24);
                        }
                        arrayList2.add(narVar);
                        i++;
                        arrayList = arrayList2;
                        obj2 = null;
                    }
                } else {
                    Long[] lArr2 = bow.o;
                    arrayList = new ArrayList(4);
                    while (i < i3) {
                        ArrayList arrayList3 = arrayList;
                        arrayList3.add(new nar(H, TimeUnit.SECONDS.toMillis(lArr2[i].longValue()), parVar.d, null, null, parVar.g, 24));
                        i++;
                        arrayList = arrayList3;
                        i3 = i3;
                        z2 = z2;
                    }
                    j = 0;
                }
            } finally {
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Object next = it.next();
            if (((nar) next).b == j) {
                obj = next;
                break;
            }
        }
        nar narVar2 = (nar) obj;
        if (narVar2 != null) {
            this.a.p(this.b.a(), narVar2);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((nar) obj3).b > j) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList(v75.o(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            nar narVar3 = (nar) it2.next();
            arrayList5.add(y2x.X(this.d, new xlr(6, this, narVar3), narVar3.b));
        }
        this.n = arrayList5;
        v0();
        oer oerVar = this.b;
        oerVar.getClass();
        oerVar.m = PlaybackState.BUFFERING;
        oerVar.r = stalledReason;
        oerVar.n++;
        oerVar.b.c();
        x0();
    }

    @Override // defpackage.rgl
    public final void v() {
        this.f.v();
    }

    public final void v0() {
        chs chsVar = this.x;
        chsVar.getClass();
        chsVar.a("TrackingObserver", "stopScheduleWatchEvents", "STOP scheduleWatchEvents", new Object[0]);
        int i = 0;
        for (Object obj : (Iterable) this.m) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            Future future = (Future) obj;
            chs chsVar2 = this.x;
            chsVar2.getClass();
            chsVar2.a("TrackingObserver", "stopScheduleWatchEvents", "STOP " + i, new Object[0]);
            if (future != null) {
                future.cancel(false);
            }
            i = i2;
        }
        this.m = c5b.a;
    }

    @Override // defpackage.rgl
    public final void w() {
        this.f.w();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void w0() {
        nar narVar;
        long j;
        LoggingStalledReason loggingStalledReason;
        Long l;
        boolean isEmpty = this.n.isEmpty();
        chs chsVar = this.x;
        if (isEmpty) {
            chsVar.getClass();
            chsVar.a("TrackingObserver", "stopStalled", "stalled already stopped", new Object[0]);
            return;
        }
        chsVar.getClass();
        chsVar.a("TrackingObserver", "stopStalled", null, new Object[0]);
        for (Future future : (Iterable) this.n) {
            if (future != null) {
                future.cancel(false);
            }
        }
        this.n = c5b.a;
        par parVar = this.c;
        synchronized (parVar) {
            try {
                LoggingStalledReason loggingStalledReason2 = parVar.b;
                if (loggingStalledReason2 != null) {
                    int i = oar.a[loggingStalledReason2.ordinal()];
                    if (i == 1 || i == 2) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - parVar.c;
                        au1 au1Var = parVar.a;
                        long j2 = au1Var.b;
                        au1Var.b = 0L;
                        j = elapsedRealtime + j2;
                    } else {
                        j = SystemClock.elapsedRealtime() - parVar.c;
                    }
                    if (parVar.e != -1) {
                        loggingStalledReason = loggingStalledReason2;
                        l = Long.valueOf(SystemClock.elapsedRealtime() - parVar.e);
                    } else {
                        loggingStalledReason = loggingStalledReason2;
                        l = null;
                    }
                    nar narVar2 = new nar(loggingStalledReason, j, parVar.d, null, l, parVar.g, 8);
                    parVar.b = null;
                    parVar.c = 0L;
                    parVar.e = -1L;
                    parVar.d++;
                    narVar = narVar2;
                } else {
                    narVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (narVar != null) {
            a aVar = this.a;
            PlayerState a = this.b.a();
            aVar.getClass();
            chs chsVar2 = aVar.p;
            chsVar2.getClass();
            chsVar2.a("[EventTrackerImpl]", "onStalledEnd", "stalledState=" + narVar, new Object[0]);
            cjb i2 = aVar.i();
            bjb j3 = aVar.j();
            if (aVar.l) {
                x97.y(aVar.k, null, null, new mjb(j3, null, aVar, a, narVar, i2, 1), 3);
            } else {
                Event event = Event.STALLED_END;
                EventType eventType = EventType.EVENT;
                aVar.g.getClass();
                eventType.getClass();
                boolean z = aVar.l;
                ylr ylrVar = aVar.a;
                if (z) {
                    EventDefault c = a.c(aVar, j3, event, a, narVar, i2);
                    ylrVar.getClass();
                    ylrVar.c(c);
                } else {
                    ylrVar.b(a.c(aVar, j3, event, a, narVar, i2));
                }
            }
            oer oerVar = this.b;
            boolean z2 = this.t;
            oerVar.r = null;
            oerVar.m = z2 ? PlaybackState.PLAY : PlaybackState.PAUSE;
            oerVar.b.d();
        }
        x0();
    }

    @Override // defpackage.u9l
    public final void x(String str, boolean z) {
        this.e.getClass();
    }

    public final void x0() {
        nq0 nq0Var = this.w;
        y2x.Z((ScheduledExecutorService) nq0Var.f, new k9l(nq0Var, 4));
    }

    @Override // defpackage.u9l
    public final void y(DrmType drmType) {
        drmType.getClass();
        this.e.getClass();
    }

    @Override // defpackage.rgl
    public final void z(long j) {
        this.f.z(j);
    }
}
