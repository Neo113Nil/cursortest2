package defpackage;

import com.yandex.passport.data.network.l;
import com.yandex.passport.sloth.ui.d;
import com.yandex.passport.sloth.ui.k;
import com.yandex.passport.sloth.ui.p;
import com.yandex.passport.sloth.ui.y1;
import com.yandex.plus.bdui.action.i;
import com.yandex.plus.bdui.plus.action.m;
import com.yandex.plus.bdui.plus.action.z;
import com.yandex.plus.bdui.query.e;
import com.yandex.plus.bdui.query.f;
import com.yandex.plus.log.api.b;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.data.RecoverDetails;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.data.SimpleDecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.event.AudioTrackChangeData;
import ru.yandex.video.m3.player.impl.tracking.event.AudioTrackData;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.ErrorPlayerData;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.StartPlayerData;
import ru.yandex.video.m3.player.impl.tracking.event.SubtitleTrackChangeData;
import ru.yandex.video.m3.player.impl.tracking.event.SubtitleTrackData;
import ru.yandex.video.m3.player.impl.tracking.event.VideoTrackChangeData;
import ru.yandex.video.m3.player.impl.tracking.event.VideoTrackData;
import ru.yandex.video.m3.player.tracking.LoadError;

/* loaded from: classes6.dex */
public final class fjb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjb(z zVar, m mVar, l lVar, e eVar, com.yandex.plus.bdui.document.e eVar2, i iVar, Continuation continuation) {
        super(2, continuation);
        this.j = 9;
        this.k = zVar;
        this.l = mVar;
        this.m = lVar;
        this.o = eVar;
        this.p = eVar2;
        this.n = iVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                fjb fjbVar = new fjb((bjb) this.l, continuation, (a) this.m, (AudioTrackData) this.o, (AudioTrackData) this.p, (cjb) this.n, 0);
                fjbVar.k = obj;
                return fjbVar;
            case 1:
                fjb fjbVar2 = new fjb((bjb) this.l, continuation, (a) this.m, (Event) this.o, (SimpleDecoderEventData) this.p, (cjb) this.n, 1);
                fjbVar2.k = obj;
                return fjbVar2;
            case 2:
                fjb fjbVar3 = new fjb((bjb) this.l, continuation, (a) this.m, (PlayerState) this.o, (LoadError) this.p, (cjb) this.n, 2);
                fjbVar3.k = obj;
                return fjbVar3;
            case 3:
                fjb fjbVar4 = new fjb((bjb) this.l, continuation, (a) this.m, (PlayerState) this.o, (String) this.p, (cjb) this.n, 3);
                fjbVar4.k = obj;
                return fjbVar4;
            case 4:
                fjb fjbVar5 = new fjb((bjb) this.l, continuation, (a) this.m, (cjb) this.n, (PlaybackException) this.o, (RecoverDetails) this.p);
                fjbVar5.k = obj;
                return fjbVar5;
            case 5:
                fjb fjbVar6 = new fjb((bjb) this.l, continuation, (a) this.m, (PlayerState) this.o, (Map) this.p, (cjb) this.n, 5);
                fjbVar6.k = obj;
                return fjbVar6;
            case 6:
                fjb fjbVar7 = new fjb((bjb) this.l, continuation, (a) this.m, (SubtitleTrackData) this.o, (SubtitleTrackData) this.p, (cjb) this.n, 6);
                fjbVar7.k = obj;
                return fjbVar7;
            case 7:
                fjb fjbVar8 = new fjb((bjb) this.l, continuation, (a) this.m, (VideoTrackData) this.o, (VideoTrackData) this.p, (cjb) this.n, 7);
                fjbVar8.k = obj;
                return fjbVar8;
            case 8:
                fjb fjbVar9 = new fjb((y1) this.l, (xpi) this.m, (d) this.o, (s7h) this.p, (k) this.n, continuation);
                fjbVar9.k = obj;
                return fjbVar9;
            default:
                return new fjb((z) this.k, (m) this.l, (l) this.m, (e) this.o, (com.yandex.plus.bdui.document.e) this.p, (i) this.n, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((fjb) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Object obj2 = this.p;
        Object obj3 = this.l;
        Object obj4 = this.n;
        Object obj5 = this.o;
        Object obj6 = this.m;
        switch (i) {
            case 0:
                cjb cjbVar = (cjb) obj4;
                a aVar = (a) obj6;
                AudioTrackData audioTrackData = (AudioTrackData) obj2;
                AudioTrackData audioTrackData2 = (AudioTrackData) obj5;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                bjb bjbVar = (bjb) obj3;
                try {
                    r7o r7oVar = z7o.b;
                    Event event = Event.SET_AUDIO_TRACK;
                    EventType eventType = EventType.EVENT;
                    aVar.g.getClass();
                    eventType.getClass();
                    boolean z = aVar.l;
                    ylr ylrVar = aVar.a;
                    if (z) {
                        EventDefault h = a.h(aVar, bjbVar, event, null, null, null, new AudioTrackChangeData(audioTrackData2, audioTrackData), cjbVar, 14);
                        ylrVar.getClass();
                        ylrVar.c(h);
                    } else {
                        ylrVar.b(a.h(aVar, bjbVar, event, null, null, null, new AudioTrackChangeData(audioTrackData2, audioTrackData), cjbVar, 14));
                    }
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                break;
            case 1:
                cjb cjbVar2 = (cjb) obj4;
                SimpleDecoderEventData simpleDecoderEventData = (SimpleDecoderEventData) obj2;
                a aVar2 = (a) obj6;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar2 = (bjb) obj3;
                try {
                    r7o r7oVar3 = z7o.b;
                    EventType eventType2 = EventType.EVENT;
                    aVar2.g.getClass();
                    eventType2.getClass();
                    boolean z2 = aVar2.l;
                    ylr ylrVar2 = aVar2.a;
                    if (z2) {
                        EventDefault h2 = a.h(aVar2, bjbVar2, (Event) obj5, null, null, eventType2, simpleDecoderEventData, cjbVar2, 6);
                        ylrVar2.getClass();
                        ylrVar2.c(h2);
                    } else {
                        ylrVar2.b(a.h(aVar2, bjbVar2, (Event) obj5, null, null, eventType2, simpleDecoderEventData, cjbVar2, 6));
                    }
                } catch (Throwable unused2) {
                    r7o r7oVar4 = z7o.b;
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar3 = (bjb) obj3;
                try {
                    r7o r7oVar5 = z7o.b;
                    a aVar3 = (a) obj6;
                    aVar3.q(bjbVar3, (PlayerState) obj5, bfg.t(aVar3.n, (LoadError) obj2), false, false, null, (cjb) obj4);
                } catch (Throwable unused3) {
                    r7o r7oVar6 = z7o.b;
                }
                break;
            case 3:
                cjb cjbVar3 = (cjb) obj4;
                String str = (String) obj2;
                a aVar4 = (a) obj6;
                PlayerState playerState = (PlayerState) obj5;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar4 = (bjb) obj3;
                try {
                    r7o r7oVar7 = z7o.b;
                    EventType eventType3 = EventType.ERROR;
                    aVar4.g.getClass();
                    eventType3.getClass();
                    boolean z3 = aVar4.l;
                    ylr ylrVar3 = aVar4.a;
                    if (z3) {
                        Event event2 = Event.NET_PERF_DISABLED;
                        EventDefault g = a.g((a) obj6, bjbVar4, event2.getEventName(), playerState.getVideoType(), eventType3, new ErrorPlayerData("NetPerfManager is not applied to ChunkDataSourceFactory. ClassName=" + str, event2.getEventName(), false, "", null, null, "CONFIG", a.e(playerState), null), cjbVar3, 2);
                        ylrVar3.getClass();
                        ylrVar3.c(g);
                    } else {
                        Event event3 = Event.NET_PERF_DISABLED;
                        ylrVar3.b(a.g((a) obj6, bjbVar4, event3.getEventName(), playerState.getVideoType(), eventType3, new ErrorPlayerData("NetPerfManager is not applied to ChunkDataSourceFactory. ClassName=" + str, event3.getEventName(), false, "", null, null, "CONFIG", a.e(playerState), null), cjbVar3, 2));
                    }
                } catch (Throwable unused4) {
                    r7o r7oVar8 = z7o.b;
                }
                break;
            case 4:
                cjb cjbVar4 = (cjb) obj4;
                RecoverDetails recoverDetails = (RecoverDetails) obj2;
                PlaybackException playbackException = (PlaybackException) obj5;
                a aVar5 = (a) obj6;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar5 = (bjb) obj3;
                try {
                    r7o r7oVar9 = z7o.b;
                    Event event4 = Event.RECOVER_STREAM_ERROR;
                    EventType eventType4 = EventType.EVENT;
                    bs4 bs4Var = aVar5.g;
                    ehv ehvVar = aVar5.e;
                    l4f l4fVar = aVar5.h;
                    bs4Var.getClass();
                    eventType4.getClass();
                    boolean z4 = aVar5.l;
                    ylr ylrVar4 = aVar5.a;
                    a aVar6 = (a) obj6;
                    if (z4) {
                        DefaultEventData defaultEventData = new DefaultEventData(null, 1, null);
                        ehvVar.getClass();
                        defaultEventData.setDetails(l4fVar.to(uah.e(new Pair("errorName", l4fVar.to(ehv.n(playbackException))), new Pair("recoverDetails", l4fVar.to(recoverDetails)))));
                        EventDefault h3 = a.h(aVar6, bjbVar5, event4, null, null, null, defaultEventData, cjbVar4, 14);
                        ylrVar4.getClass();
                        ylrVar4.c(h3);
                    } else {
                        DefaultEventData defaultEventData2 = new DefaultEventData(null, 1, null);
                        ehvVar.getClass();
                        defaultEventData2.setDetails(l4fVar.to(uah.e(new Pair("errorName", l4fVar.to(ehv.n(playbackException))), new Pair("recoverDetails", l4fVar.to(recoverDetails)))));
                        ylrVar4.b(a.h(aVar6, bjbVar5, event4, null, null, null, defaultEventData2, cjbVar4, 14));
                    }
                } catch (Throwable unused5) {
                    r7o r7oVar10 = z7o.b;
                }
                break;
            case 5:
                cjb cjbVar5 = (cjb) obj4;
                Map map = (Map) obj2;
                a aVar7 = (a) obj6;
                PlayerState playerState2 = (PlayerState) obj5;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar6 = (bjb) obj3;
                try {
                    r7o r7oVar11 = z7o.b;
                    Event event5 = Event.START;
                    EventType eventType5 = EventType.EVENT;
                    aVar7.g.getClass();
                    eventType5.getClass();
                    boolean z5 = aVar7.l;
                    ylr ylrVar5 = aVar7.a;
                    a aVar8 = (a) obj6;
                    if (z5) {
                        EventDefault h4 = a.h(aVar8, bjbVar6, event5, null, playerState2.getVideoType(), null, new StartPlayerData(map, a.e(playerState2), playerState2.getInitialBandwidthEstimates()), cjbVar5, 10);
                        ylrVar5.getClass();
                        ylrVar5.c(h4);
                    } else {
                        ylrVar5.b(a.h(aVar8, bjbVar6, event5, null, playerState2.getVideoType(), null, new StartPlayerData(map, a.e(playerState2), playerState2.getInitialBandwidthEstimates()), cjbVar5, 10));
                    }
                } catch (Throwable unused6) {
                    r7o r7oVar12 = z7o.b;
                }
                break;
            case 6:
                cjb cjbVar6 = (cjb) obj4;
                a aVar9 = (a) obj6;
                SubtitleTrackData subtitleTrackData = (SubtitleTrackData) obj2;
                SubtitleTrackData subtitleTrackData2 = (SubtitleTrackData) obj5;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar7 = (bjb) obj3;
                try {
                    r7o r7oVar13 = z7o.b;
                    Event event6 = Event.SET_TEXT_TRACK;
                    EventType eventType6 = EventType.EVENT;
                    aVar9.g.getClass();
                    eventType6.getClass();
                    boolean z6 = aVar9.l;
                    ylr ylrVar6 = aVar9.a;
                    if (z6) {
                        EventDefault h5 = a.h(aVar9, bjbVar7, event6, null, null, null, new SubtitleTrackChangeData(subtitleTrackData2, subtitleTrackData), cjbVar6, 14);
                        ylrVar6.getClass();
                        ylrVar6.c(h5);
                    } else {
                        ylrVar6.b(a.h(aVar9, bjbVar7, event6, null, null, null, new SubtitleTrackChangeData(subtitleTrackData2, subtitleTrackData), cjbVar6, 14));
                    }
                } catch (Throwable unused7) {
                    r7o r7oVar14 = z7o.b;
                }
                break;
            case 7:
                cjb cjbVar7 = (cjb) obj4;
                a aVar10 = (a) obj6;
                VideoTrackData videoTrackData = (VideoTrackData) obj2;
                VideoTrackData videoTrackData2 = (VideoTrackData) obj5;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar8 = (bjb) obj3;
                try {
                    r7o r7oVar15 = z7o.b;
                    Event event7 = Event.SET_VIDEO_TRACK;
                    EventType eventType7 = EventType.EVENT;
                    aVar10.g.getClass();
                    eventType7.getClass();
                    boolean z7 = aVar10.l;
                    ylr ylrVar7 = aVar10.a;
                    if (z7) {
                        EventDefault h6 = a.h(aVar10, bjbVar8, event7, null, null, null, new VideoTrackChangeData(videoTrackData2, videoTrackData), cjbVar7, 14);
                        ylrVar7.getClass();
                        ylrVar7.c(h6);
                    } else {
                        ylrVar7.b(a.h(aVar10, bjbVar8, event7, null, null, null, new VideoTrackChangeData(videoTrackData2, videoTrackData), cjbVar7, 14));
                    }
                } catch (Throwable unused8) {
                    r7o r7oVar16 = z7o.b;
                }
                break;
            case 8:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                y1 y1Var = (y1) obj3;
                zsd.r0(mm6Var, new ub7(12, y1Var.m, new p((xpi) obj6, (d) obj5, (s7h) obj2, (k) obj4, y1Var, (Continuation) null, 0)));
                break;
            default:
                l lVar = (l) obj6;
                i iVar = (i) obj4;
                e eVar = (e) obj5;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                z zVar = (z) this.k;
                boolean z8 = zVar.e;
                m mVar = (m) obj3;
                String str2 = mVar.f;
                b bVar = mVar.e;
                if (z8) {
                    com.yandex.plus.log.api.a aVar11 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar11)) {
                        bVar.c(aVar11, str2, "handleInner(); update content only");
                    }
                    lVar.getClass();
                    ((f) lVar.a).b(eVar);
                } else {
                    com.yandex.plus.log.api.a aVar12 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar12)) {
                        bVar.c(aVar12, str2, "handleInner(); load document");
                    }
                    lVar.getClass();
                    ((f) lVar.a).b(eVar);
                }
                super/*com.yandex.plus.bdui.plus.action.b*/.b(zVar, eVar, (com.yandex.plus.bdui.document.e) obj2, iVar);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fjb(bjb bjbVar, Continuation continuation, a aVar, Object obj, Object obj2, cjb cjbVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bjbVar;
        this.m = aVar;
        this.o = obj;
        this.p = obj2;
        this.n = cjbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjb(y1 y1Var, xpi xpiVar, d dVar, s7h s7hVar, k kVar, Continuation continuation) {
        super(2, continuation);
        this.j = 8;
        this.l = y1Var;
        this.m = xpiVar;
        this.o = dVar;
        this.p = s7hVar;
        this.n = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjb(bjb bjbVar, Continuation continuation, a aVar, cjb cjbVar, PlaybackException playbackException, RecoverDetails recoverDetails) {
        super(2, continuation);
        this.j = 4;
        this.l = bjbVar;
        this.m = aVar;
        this.n = cjbVar;
        this.o = playbackException;
        this.p = recoverDetails;
    }
}
