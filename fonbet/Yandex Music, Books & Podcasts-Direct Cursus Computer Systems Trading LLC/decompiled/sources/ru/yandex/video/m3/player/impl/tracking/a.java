package ru.yandex.video.m3.player.impl.tracking;

import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ajb;
import defpackage.b6e;
import defpackage.bjb;
import defpackage.bs4;
import defpackage.bte;
import defpackage.c5p;
import defpackage.chs;
import defpackage.cjb;
import defpackage.d1;
import defpackage.djb;
import defpackage.e5b;
import defpackage.eeh;
import defpackage.ehv;
import defpackage.fjb;
import defpackage.fs7;
import defpackage.g6e;
import defpackage.gjb;
import defpackage.gos;
import defpackage.i5f;
import defpackage.i6e;
import defpackage.i9w;
import defpackage.ii;
import defpackage.ijb;
import defpackage.jjb;
import defpackage.jr4;
import defpackage.jyr;
import defpackage.k1j;
import defpackage.kgk;
import defpackage.l4f;
import defpackage.m2;
import defpackage.men;
import defpackage.mjb;
import defpackage.mm6;
import defpackage.n0l;
import defpackage.n2t;
import defpackage.nar;
import defpackage.quj;
import defpackage.rvr;
import defpackage.tf6;
import defpackage.tqn;
import defpackage.u1;
import defpackage.u75;
import defpackage.uwf;
import defpackage.w3f;
import defpackage.wcu;
import defpackage.wt0;
import defpackage.x3f;
import defpackage.x97;
import defpackage.xqn;
import defpackage.y9w;
import defpackage.ylr;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.data.exception.network.e;
import ru.yandex.video.m3.playback.features.CodecsInfo;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.data.SimpleDecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.ErrorPlayerData;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.EventsLabel;
import ru.yandex.video.m3.player.impl.tracking.event.LoggingStalledReason;
import ru.yandex.video.m3.player.impl.tracking.event.NetworkRequestErrorPlayerData;
import ru.yandex.video.m3.player.impl.tracking.event.StalledData;
import ru.yandex.video.m3.player.impl.tracking.event.StateBasedEventData;
import ru.yandex.video.m3.player.impl.tracking.event.VideoConfigData;
import ru.yandex.video.m3.player.tracking.FullscreenInfo;
import ru.yandex.video.m3.player.tracks.TrackType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class a implements ajb {
    public static final List q = u75.h("avc", "hevc", "vp9", "av1", "av01");
    public final ylr a;
    public n2t b;
    public final i9w c;
    public final y9w d;
    public final ehv e;
    public final gos f;
    public final bs4 g;
    public final l4f h;
    public final fs7 i;
    public final c5p j;
    public final mm6 k;
    public final boolean l;
    public final kgk m;
    public final k1j n;
    public final x3f o;
    public final chs p;

    public a(ylr ylrVar, n2t n2tVar, i9w i9wVar, y9w y9wVar, ehv ehvVar, gos gosVar, bs4 bs4Var, l4f l4fVar, fs7 fs7Var, c5p c5pVar, tf6 tf6Var, boolean z, kgk kgkVar) {
        e eVar = new e();
        w3f w3fVar = x3f.d;
        w3fVar.getClass();
        i5f r = quj.r(w3fVar, rvr.y0);
        l4fVar.getClass();
        fs7Var.getClass();
        tf6Var.getClass();
        this.a = ylrVar;
        this.b = n2tVar;
        this.c = i9wVar;
        this.d = y9wVar;
        this.e = ehvVar;
        this.f = gosVar;
        this.g = bs4Var;
        this.h = l4fVar;
        this.i = fs7Var;
        this.j = c5pVar;
        this.k = tf6Var;
        this.l = z;
        this.m = kgkVar;
        this.n = eVar;
        this.o = r;
        this.p = new chs();
    }

    public static final boolean b(a aVar, PlaybackException playbackException) {
        if (playbackException instanceof PlaybackException.ErrorQueryingDecoders ? true : playbackException instanceof PlaybackException.ErrorNoSecureDecoder ? true : playbackException instanceof PlaybackException.ErrorNoDecoder ? true : playbackException instanceof PlaybackException.ErrorInstantiatingDecoder ? true : playbackException instanceof PlaybackException.ErrorSubtitleNoDecoder) {
            return true;
        }
        return playbackException instanceof PlaybackException.ErrorInRenderer;
    }

    public static final EventDefault c(a aVar, bjb bjbVar, Event event, PlayerState playerState, nar narVar, cjb cjbVar) {
        aVar.getClass();
        return h(aVar, bjbVar, event, narVar.a, playerState.getVideoType(), null, new StalledData(playerState.isMuted(), Integer.valueOf((int) playerState.getRemainingBufferedTime()), playerState.getCurrentVideo(), Float.valueOf(narVar.b / 1000.0f), narVar.d != null ? Float.valueOf(r1.longValue() / 1000.0f) : null, playerState.getCurrentPosition() != null ? Float.valueOf(r11.longValue() / 1000.0f) : null, Integer.valueOf(eeh.b(playerState.getWatchedTime() / 1000.0f)), Integer.valueOf(narVar.c), narVar.e != null ? Float.valueOf(r14.longValue() / 1000.0f) : null, narVar.f), cjbVar, 8);
    }

    public static final void d(a aVar, bjb bjbVar, Event event, PlayerState playerState, cjb cjbVar) {
        aVar.getClass();
        EventType eventType = EventType.EVENT;
        aVar.g.getClass();
        eventType.getClass();
        boolean z = aVar.l;
        ylr ylrVar = aVar.a;
        if (!z) {
            ylrVar.b(h(aVar, bjbVar, event, null, playerState.getVideoType(), null, e(playerState), cjbVar, 10));
            return;
        }
        EventDefault h = h(aVar, bjbVar, event, null, playerState.getVideoType(), null, e(playerState), cjbVar, 10);
        ylrVar.getClass();
        ylrVar.c(h);
    }

    public static StateBasedEventData e(PlayerState playerState) {
        Float valueOf = playerState.getDuration() != null ? Float.valueOf(r0.longValue() / 1000.0f) : null;
        int b = eeh.b(playerState.getWatchedTime() / 1000.0f);
        Float valueOf2 = playerState.getCurrentPosition() != null ? Float.valueOf(r3.longValue() / 1000.0f) : null;
        boolean isMuted = playerState.isMuted();
        FullscreenInfo fullscreenInfo = playerState.getFullscreenInfo();
        Boolean isFullscreenExternal = fullscreenInfo != null ? fullscreenInfo.getIsFullscreenExternal() : null;
        FullscreenInfo fullscreenInfo2 = playerState.getFullscreenInfo();
        return new StateBasedEventData(valueOf, valueOf2, Integer.valueOf(b), isMuted, isFullscreenExternal, fullscreenInfo2 != null ? fullscreenInfo2.getIsFullscreenInternal() : null, playerState.getLoopIndex(), Float.valueOf(playerState.getRemainingBufferedTime() / 1000.0f));
    }

    public static /* synthetic */ EventDefault g(a aVar, bjb bjbVar, String str, VideoType videoType, EventType eventType, DefaultEventData defaultEventData, cjb cjbVar, int i) {
        if ((i & 8) != 0) {
            eventType = EventType.EVENT;
        }
        return aVar.f(bjbVar, str, null, videoType, eventType, defaultEventData, cjbVar);
    }

    public static EventDefault h(a aVar, bjb bjbVar, Event event, LoggingStalledReason loggingStalledReason, VideoType videoType, EventType eventType, DefaultEventData defaultEventData, cjb cjbVar, int i) {
        if ((i & 2) != 0) {
            loggingStalledReason = null;
        }
        if ((i & 4) != 0) {
            videoType = null;
        }
        if ((i & 8) != 0) {
            eventType = EventType.EVENT;
        }
        aVar.c.getClass();
        event.getClass();
        return aVar.f(bjbVar, event.getEventName(), loggingStalledReason, videoType, eventType, defaultEventData, cjbVar);
    }

    public static LinkedHashMap k() {
        Object obj;
        Map map = (Map) jr4.a.getValue();
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Iterator it = q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (StringsKt.M((CharSequence) entry.getKey(), (String) obj, false)) {
                    break;
                }
            }
            if (obj != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final EventDefault f(bjb bjbVar, String str, LoggingStalledReason loggingStalledReason, VideoType videoType, EventType eventType, DefaultEventData defaultEventData, cjb cjbVar) {
        LoggingStalledReason loggingStalledReason2;
        ru.yandex.video.m3.player.impl.tracking.event.VideoType videoType2;
        String str2;
        String str3;
        String b;
        ru.yandex.video.m3.player.impl.tracking.event.VideoType videoType3;
        bjbVar.getClass();
        str.getClass();
        eventType.getClass();
        defaultEventData.getClass();
        cjbVar.getClass();
        this.d.getClass();
        String q2 = y9w.q(eventType);
        n2t n2tVar = this.b;
        String str4 = n2tVar.a;
        wt0 wt0Var = n2tVar.c;
        String str5 = n2tVar.b;
        int i = n2tVar.k;
        long j = cjbVar.a;
        String str6 = n2tVar.i;
        if (str6 == null) {
            str6 = wt0Var.a;
        }
        String str7 = str6;
        String str8 = wt0Var.b;
        String valueOf = String.valueOf(wt0Var.c);
        ru.yandex.video.m3.player.impl.tracking.event.VideoType.Companion.getClass();
        int i2 = videoType == null ? -1 : wcu.a[videoType.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                videoType3 = ru.yandex.video.m3.player.impl.tracking.event.VideoType.VOD;
            } else if (i2 == 2) {
                videoType3 = ru.yandex.video.m3.player.impl.tracking.event.VideoType.EVENT;
            } else {
                if (i2 != 3) {
                    b6e.s();
                    return null;
                }
                videoType3 = ru.yandex.video.m3.player.impl.tracking.event.VideoType.LIVE;
            }
            loggingStalledReason2 = loggingStalledReason;
            videoType2 = videoType3;
        } else {
            loggingStalledReason2 = loggingStalledReason;
            videoType2 = null;
        }
        EventsLabel eventsLabel = new EventsLabel(str7, str8, valueOf, videoType2, loggingStalledReason2);
        n0l n0lVar = bjbVar.a;
        String e = n0lVar != null ? n0lVar.e() : null;
        n2t n2tVar2 = this.b;
        LinkedHashMap linkedHashMap = n2tVar2.n;
        String str9 = n2tVar2.e;
        String str10 = n2tVar2.f;
        List list = n2tVar2.g;
        String d = n0lVar != null ? n0lVar.d() : null;
        String b2 = n0lVar != null ? n0lVar.b() : null;
        Boolean valueOf2 = (n0lVar == null || (b = n0lVar.b()) == null) ? null : Boolean.valueOf(!StringsKt.U(b));
        Map map = this.b.h;
        Integer valueOf3 = Integer.valueOf(cjbVar.b);
        DrmType drmType = this.b.j;
        if (drmType != null) {
            int i3 = djb.b[drmType.ordinal()];
            if (i3 == 1) {
                str3 = "none";
            } else if (i3 == 2) {
                str3 = "widevine";
            } else if (i3 == 3) {
                str3 = "playready";
            } else if (i3 == 4) {
                str3 = "clearkey";
            } else {
                if (i3 != 5) {
                    b6e.s();
                    return null;
                }
                str3 = "other";
            }
            str2 = str3;
        } else {
            str2 = null;
        }
        return new EventDefault(str4, str5, i, str, j, eventsLabel, q2, e, linkedHashMap, str9, str10, list, d, b2, valueOf2, map, defaultEventData, valueOf3, str2, this.b.m, n0lVar != null ? n0lVar.f() : null);
    }

    public final cjb i() {
        return new cjb(System.currentTimeMillis(), ((AtomicInteger) this.j.b).getAndIncrement());
    }

    public final bjb j() {
        return new bjb((n0l) this.m.invoke());
    }

    public final void l(bjb bjbVar, Map map, cjb cjbVar, d1 d1Var) {
        VideoConfigData.Config config;
        VideoConfigData videoConfigData;
        n0l n0lVar = bjbVar.a;
        if (n0lVar != null) {
            videoConfigData = new VideoConfigData(n0lVar);
            config = videoConfigData.getConfig();
        } else {
            config = null;
            videoConfigData = null;
        }
        DefaultEventData E = men.E(videoConfigData);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(DeviceService.KEY_CONFIG, config);
        linkedHashMap.put("videoCodecs", map);
        l4f l4fVar = this.h;
        E.setDetails(l4fVar.to(linkedHashMap));
        Event event = Event.CREATE_PLAYER;
        EventType eventType = EventType.EVENT;
        this.g.getClass();
        eventType.getClass();
        ylr ylrVar = this.a;
        boolean z = this.l;
        if (z) {
            EventDefault h = h(this, bjbVar, event, null, null, null, E, cjbVar, 14);
            ylrVar.getClass();
            ylrVar.c(h);
        } else {
            ylrVar.b(h(this, bjbVar, event, null, null, null, E, cjbVar, 14));
        }
        bte bteVar = d1Var.f;
        m2 m2Var = d1Var.e;
        m2 m2Var2 = d1Var.d;
        x3f x3fVar = this.o;
        x3fVar.getClass();
        String c = x3fVar.c(bte.Companion.serializer(), bteVar);
        Type type = new EventTrackerImpl$onCreatePlayerInternal$$inlined$from$1().getType();
        type.getClass();
        if (((Map) l4fVar.a(c, type)) == null) {
            e5b.a.getClass();
        }
        String str = d1Var.c;
        List list = d1Var.a;
        str.getClass();
        list.getClass();
        u1 u1Var = new u1(null, 1, null);
        bjb j = j();
        mm6 mm6Var = this.k;
        if (z) {
            x97.y(mm6Var, null, null, new gjb(j, null, this, d1Var, u1Var, 0), 3);
        } else if (z) {
            EventDefault g = g(this, j, quj.P(m2Var2), null, null, u1Var, i(), 10);
            ylrVar.getClass();
            ylrVar.c(g);
        } else {
            ylrVar.b(g(this, j, quj.P(m2Var2), null, null, u1Var, i(), 10));
        }
        bjb j2 = j();
        if (z) {
            x97.y(mm6Var, null, null, new gjb(j2, null, this, d1Var, u1Var, 1), 3);
        } else {
            if (!z) {
                ylrVar.b(g(this, j2, quj.P(m2Var), null, null, u1Var, i(), 10));
                return;
            }
            EventDefault g2 = g(this, j2, quj.P(m2Var), null, null, u1Var, i(), 10);
            ylrVar.getClass();
            ylrVar.c(g2);
        }
    }

    public final void m(TrackType trackType, SimpleDecoderEventData simpleDecoderEventData) {
        Event event;
        trackType.getClass();
        int i = djb.a[trackType.ordinal()];
        if (i == 1) {
            event = Event.AUDIO_DECODER_RELEASED;
        } else if (i != 2) {
            return;
        } else {
            event = Event.VIDEO_DECODER_RELEASED;
        }
        Event event2 = event;
        cjb i2 = i();
        bjb j = j();
        boolean z = this.l;
        if (z) {
            x97.y(this.k, null, null, new fjb(j, (Continuation) null, this, event2, simpleDecoderEventData, i2, 1), 3);
            return;
        }
        EventType eventType = EventType.EVENT;
        this.g.getClass();
        eventType.getClass();
        ylr ylrVar = this.a;
        if (!z) {
            ylrVar.b(h(this, j, event2, null, null, eventType, simpleDecoderEventData, i2, 6));
            return;
        }
        EventDefault h = h(this, j, event2, null, null, eventType, simpleDecoderEventData, i2, 6);
        ylrVar.getClass();
        ylrVar.c(h);
    }

    public final void n(PlayerState playerState, Throwable th, boolean z, DefaultEventData defaultEventData) {
        chs chsVar = this.p;
        chsVar.getClass();
        chsVar.a("[EventTrackerImpl]", "onError", "throwable=" + th, new Object[0]);
        cjb i = i();
        bjb j = j();
        if (!this.l) {
            q(j, playerState, th, false, z, defaultEventData, i);
        } else {
            x97.y(this.k, null, null, new ijb(j, null, this, playerState, th, z, defaultEventData, i), 3);
        }
    }

    public final void o(PlayerState playerState, PlaybackException playbackException, DefaultEventData defaultEventData) {
        chs chsVar = this.p;
        chsVar.getClass();
        chsVar.a("[EventTrackerImpl]", "onFatalError", "throwable=" + playbackException, new Object[0]);
        cjb i = i();
        bjb j = j();
        if (!this.l) {
            q(j, playerState, playbackException, true, b(this, playbackException), defaultEventData, i);
        } else {
            x97.y(this.k, null, null, new jjb(j, null, this, playbackException, playerState, defaultEventData, i, 0), 3);
        }
    }

    public final void p(PlayerState playerState, nar narVar) {
        narVar.getClass();
        chs chsVar = this.p;
        chsVar.getClass();
        chsVar.a("[EventTrackerImpl]", "onStalled", "stalledState=" + narVar, new Object[0]);
        cjb i = i();
        bjb j = j();
        boolean z = this.l;
        if (z) {
            x97.y(this.k, null, null, new mjb(j, null, this, playerState, narVar, i, 0), 3);
            return;
        }
        Event event = Event.STALLED;
        EventType eventType = EventType.EVENT;
        this.g.getClass();
        eventType.getClass();
        ylr ylrVar = this.a;
        if (!z) {
            ylrVar.b(c(this, j, event, playerState, narVar, i));
            return;
        }
        EventDefault c = c(this, j, event, playerState, narVar, i);
        ylrVar.getClass();
        ylrVar.c(c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(bjb bjbVar, PlayerState playerState, Throwable th, boolean z, boolean z2, DefaultEventData defaultEventData, cjb cjbVar) {
        NetworkRequestException networkRequestException;
        String str;
        DefaultEventData errorPlayerData;
        String str2;
        String str3;
        chs chsVar = this.p;
        chsVar.getClass();
        chsVar.a("[EventTrackerImpl]", "reportError", "isFatal=" + z + " sendAvailableDecoders=" + z2, new Object[0]);
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        if (th instanceof NetworkRequestException) {
            networkRequestException = (NetworkRequestException) th;
        } else {
            if (th instanceof PlaybackException) {
                PlaybackException playbackException = (PlaybackException) th;
                k1j k1jVar = this.n;
                k1jVar.getClass();
                xqn xqnVar = new xqn();
                xqn xqnVar2 = new xqn();
                xqn xqnVar3 = new xqn();
                tqn tqnVar = new tqn();
                if (playbackException instanceof PlaybackException.ErrorConnection) {
                    xqnVar.a = Integer.valueOf(((PlaybackException.ErrorConnection) playbackException).getResponseCode());
                    if (playbackException.getCause() instanceof i6e) {
                        Throwable cause = playbackException.getCause();
                        i6e i6eVar = cause instanceof i6e ? (i6e) cause : null;
                        if (i6eVar != null) {
                            xqnVar2.a = i6eVar.b.a.toString();
                            List list = (List) i6eVar.e.get("xRequestId");
                            xqnVar3.a = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                        }
                    }
                } else {
                    if (playbackException instanceof PlaybackException.ErrorConnectionSSLHandshake ? true : playbackException instanceof PlaybackException.ErrorNoInternetConnection) {
                        if (playbackException.getCause() instanceof g6e) {
                            Throwable cause2 = playbackException.getCause();
                            g6e g6eVar = cause2 instanceof g6e ? (g6e) cause2 : null;
                            if (g6eVar != null) {
                                xqnVar2.a = g6eVar.b.a.toString();
                            }
                        }
                    } else if (playbackException instanceof PlaybackException.ErrorPreparing) {
                        Throwable cause3 = playbackException.getCause();
                        if (cause3 instanceof ManifestLoadingException) {
                            ManifestLoadingException manifestLoadingException = (ManifestLoadingException) cause3;
                            Integer valueOf = Integer.valueOf(NetworkRequestException.RESOURCE_NOT_FOUND);
                            xqn xqnVar4 = new xqn();
                            xqn xqnVar5 = new xqn();
                            tqn tqnVar2 = new tqn();
                            xqn xqnVar6 = new xqn();
                            xqnVar6.a = manifestLoadingException.getMessage();
                            if (manifestLoadingException instanceof ManifestLoadingException.Forbidden) {
                                xqnVar4.a = Integer.valueOf(NetworkRequestException.EXPIRED_SIGNATURE);
                            } else if (manifestLoadingException instanceof ManifestLoadingException.NotFound) {
                                xqnVar4.a = valueOf;
                            } else if (manifestLoadingException instanceof ManifestLoadingException.PaymentRequired) {
                                xqnVar4.a = 402;
                                xqnVar6.a = "PAYMENT_REQUIRED. " + ((String) xqnVar6.a);
                                tqnVar2.a = true;
                            } else if (manifestLoadingException instanceof ManifestLoadingException.ForbiddenByLicense) {
                                xqnVar4.a = Integer.valueOf(UibcKeyCode.TV_KEYCODE_REWIND);
                                xqnVar6.a = "FORBIDDEN_BY_LICENSE. " + ((String) xqnVar6.a);
                                tqnVar2.a = true;
                            } else if (manifestLoadingException instanceof ManifestLoadingException.UserProfileNotCreated) {
                                xqnVar4.a = Integer.valueOf(UibcKeyCode.TV_KEYCODE_FORWARD);
                                xqnVar6.a = "USER_PROFILE_NOT_CREATED. " + ((String) xqnVar6.a);
                                tqnVar2.a = true;
                            } else if (manifestLoadingException instanceof ManifestLoadingException.CommunicationError) {
                                xqnVar4.a = 503;
                                xqnVar6.a = "BLACKBOX_NOT_AVAILABLE. " + ((String) xqnVar6.a);
                                tqnVar2.a = true;
                            } else if (manifestLoadingException instanceof ManifestLoadingException.ForbiddenByModeration) {
                                xqnVar4.a = valueOf;
                                tqnVar2.a = true;
                            } else if (manifestLoadingException instanceof ManifestLoadingException.InvalidRegion) {
                                xqnVar4.a = null;
                                xqnVar6.a = "invalid_region " + ((String) xqnVar6.a);
                                tqnVar2.a = true;
                            } else if (manifestLoadingException instanceof ManifestLoadingException.SubscriptionNotFoundError) {
                                xqnVar4.a = null;
                                tqnVar2.a = true;
                            } else if (manifestLoadingException instanceof ManifestLoadingException.UnknownError) {
                                xqnVar4.a = null;
                            } else {
                                xqnVar4.a = null;
                                tqnVar2.a = true;
                            }
                            Throwable cause4 = manifestLoadingException.getCause();
                            if (cause4 instanceof ManifestLoadingException.UnknownError.GenericError) {
                                ManifestLoadingException.UnknownError.GenericError genericError = (ManifestLoadingException.UnknownError.GenericError) cause4;
                                xqnVar5.a = genericError.getRequestUrl();
                                xqnVar4.a = Integer.valueOf(genericError.getCode());
                            }
                            networkRequestException = ((e) k1jVar).a(uwf.a(new ru.yandex.video.m3.data.exception.network.a(xqnVar4, xqnVar5, xqnVar6, manifestLoadingException, tqnVar2)));
                        }
                    }
                }
                networkRequestException = ((e) k1jVar).a(uwf.a(new ii(xqnVar, xqnVar2, xqnVar3, playbackException, tqnVar, 28)));
            }
            networkRequestException = null;
        }
        Throwable th2 = networkRequestException != null ? networkRequestException : th;
        this.e.getClass();
        String n = ehv.n(th2);
        EventType eventType = z ? EventType.FATAL_ERROR : EventType.ERROR;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        this.f.getClass();
        String t = gos.t(th2);
        if (networkRequestException != null) {
            NetworkRequestException networkRequestException2 = networkRequestException;
            errorPlayerData = new NetworkRequestErrorPlayerData(message, r(networkRequestException.getDetails$video_player_internalRelease(), th), networkRequestException.getResourceType(), networkRequestException2.getRequestId(), networkRequestException2.getRequestUrl(), t, networkRequestException2.getResponseCode(), z, stringWriter2, e(playerState));
            str2 = n;
        } else {
            String str4 = message;
            l4f l4fVar = this.h;
            if (z2) {
                jyr jyrVar = jr4.a;
                l4fVar.getClass();
                Map map = (Map) jr4.a.getValue();
                if (map == null) {
                    map = e5b.a;
                    map.getClass();
                }
                Map map2 = (Map) jr4.b.getValue();
                if (map2 == null) {
                    map2 = e5b.a;
                    map2.getClass();
                }
                try {
                    str3 = l4fVar.to(new CodecsInfo(map, map2, null == true ? 1 : 0));
                } catch (Exception e) {
                    Timber.INSTANCE.e(e);
                    str3 = "{\"serializationFailed\": true}";
                }
                str = str3;
            } else {
                str = null;
            }
            PlaybackException.ErrorInRenderer errorInRenderer = th instanceof PlaybackException.ErrorInRenderer ? (PlaybackException.ErrorInRenderer) th : null;
            errorPlayerData = new ErrorPlayerData(str4, n, z, stringWriter2, str, errorInRenderer != null ? errorInRenderer.getDiagnosticInfo() : null, t, e(playerState), r(l4fVar.to(defaultEventData), th));
            str2 = n;
        }
        DefaultEventData defaultEventData2 = errorPlayerData;
        this.g.getClass();
        eventType.getClass();
        boolean z3 = this.l;
        ylr ylrVar = this.a;
        if (!z3) {
            ylrVar.b(g(this, bjbVar, str2, playerState.getVideoType(), eventType, defaultEventData2, cjbVar, 2));
            return;
        }
        EventDefault g = g(this, bjbVar, str2, playerState.getVideoType(), eventType, defaultEventData2, cjbVar, 2);
        ylrVar.getClass();
        ylrVar.c(g);
    }

    public final String r(String str, Throwable th) {
        Map<String, Object> map;
        PlaybackException playbackException = th instanceof PlaybackException ? (PlaybackException) th : null;
        if (playbackException == null || (map = playbackException.getDetails()) == null) {
            AdException adException = th instanceof AdException ? (AdException) th : null;
            Map<String, Object> details = adException != null ? adException.getDetails() : null;
            if (details == null) {
                return str;
            }
            map = details;
        }
        l4f l4fVar = this.h;
        if (str == null) {
            return l4fVar.to(map);
        }
        try {
            return l4fVar.to(new EventTrackerImpl$DetailsHelper(map, str));
        } catch (Exception e) {
            Timber.INSTANCE.e("Error when serializing " + str + ": " + e, new Object[0]);
            return l4fVar.to(map);
        }
    }
}
