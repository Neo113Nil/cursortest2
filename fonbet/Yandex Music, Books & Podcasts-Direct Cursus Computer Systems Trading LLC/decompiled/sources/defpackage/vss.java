package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.event.AudioTrackChangeData;
import ru.yandex.video.m3.player.impl.tracking.event.AudioTrackData;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.SubtitleTrackChangeData;
import ru.yandex.video.m3.player.impl.tracking.event.SubtitleTrackData;
import ru.yandex.video.m3.player.impl.tracking.event.VideoTrackChangeData;
import ru.yandex.video.m3.player.impl.tracking.event.VideoTrackData;
import ru.yandex.video.m3.player.tracks.TrackVariant;

/* loaded from: classes6.dex */
public final class vss implements uss {
    public final a a;
    public AudioTrackData b;
    public VideoTrackData c;
    public SubtitleTrackData d;

    public vss(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.uss, defpackage.rgl
    public final void o(nqs nqsVar, nqs nqsVar2, nqs nqsVar3) {
        AudioTrackData audioTrackData;
        bs4 bs4Var;
        boolean z;
        int i;
        SubtitleTrackData subtitleTrackData;
        VideoTrackData videoTrackData;
        AudioTrackData audioTrackData2;
        a aVar = this.a;
        ylr ylrVar = aVar.a;
        bs4 bs4Var2 = aVar.g;
        mm6 mm6Var = aVar.k;
        boolean z2 = aVar.l;
        nqsVar.getClass();
        nqsVar2.getClass();
        nqsVar3.getClass();
        jsb jsbVar = (jsb) nqsVar;
        TrackVariant c = jsbVar.c();
        isb b = jsbVar.b();
        AudioTrackData audioTrackData3 = (c == null || b == null) ? null : new AudioTrackData(b.b, c.getTitle(), b.h, b.d);
        jsb jsbVar2 = (jsb) nqsVar3;
        TrackVariant c2 = jsbVar2.c();
        isb b2 = jsbVar2.b();
        VideoTrackData videoTrackData2 = (c2 == null || b2 == null) ? null : new VideoTrackData(b2.b, c2 instanceof TrackVariant.Adaptive, c2.getTitle(), b2.h, b2.f, b2.g);
        jsb jsbVar3 = (jsb) nqsVar2;
        TrackVariant c3 = jsbVar3.c();
        isb b3 = jsbVar3.b();
        SubtitleTrackData subtitleTrackData2 = (c3 == null || b3 == null) ? null : new SubtitleTrackData(b3.b, c3.getTitle(), b3.d);
        if (audioTrackData3 == null || audioTrackData3.equals(this.b) || (audioTrackData2 = this.b) == null) {
            audioTrackData = audioTrackData3;
            bs4Var = bs4Var2;
            z = z2;
            i = 3;
            subtitleTrackData = subtitleTrackData2;
        } else {
            cjb i2 = aVar.i();
            bjb j = aVar.j();
            if (z2) {
                x97.y(mm6Var, null, null, new fjb(j, (Continuation) null, aVar, audioTrackData2, audioTrackData3, i2, 0), 3);
                audioTrackData = audioTrackData3;
                aVar = aVar;
                bs4Var = bs4Var2;
                z = z2;
                subtitleTrackData = subtitleTrackData2;
                i = 3;
            } else {
                AudioTrackData audioTrackData4 = audioTrackData3;
                SubtitleTrackData subtitleTrackData3 = subtitleTrackData2;
                Event event = Event.SET_AUDIO_TRACK;
                EventType eventType = EventType.EVENT;
                bs4Var2.getClass();
                eventType.getClass();
                if (z2) {
                    AudioTrackChangeData audioTrackChangeData = new AudioTrackChangeData(audioTrackData2, audioTrackData4);
                    aVar = aVar;
                    audioTrackData = audioTrackData4;
                    z = z2;
                    i = 3;
                    bs4Var = bs4Var2;
                    subtitleTrackData = subtitleTrackData3;
                    EventDefault h = a.h(aVar, j, event, null, null, null, audioTrackChangeData, i2, 14);
                    ylrVar.getClass();
                    ylrVar.c(h);
                } else {
                    audioTrackData = audioTrackData4;
                    aVar = aVar;
                    bs4Var = bs4Var2;
                    z = z2;
                    subtitleTrackData = subtitleTrackData3;
                    i = 3;
                    ylrVar.b(a.h(aVar, j, event, null, null, null, new AudioTrackChangeData(audioTrackData2, audioTrackData), i2, 14));
                }
            }
        }
        if (videoTrackData2 != null && !videoTrackData2.equals(this.c) && (videoTrackData = this.c) != null && (!videoTrackData2.getAuto() || !videoTrackData.getAuto())) {
            cjb i3 = aVar.i();
            bjb j2 = aVar.j();
            if (z) {
                a aVar2 = aVar;
                x97.y(mm6Var, null, null, new fjb(j2, (Continuation) null, aVar2, videoTrackData, videoTrackData2, i3, 7), i);
                aVar = aVar2;
            } else {
                a aVar3 = aVar;
                Event event2 = Event.SET_VIDEO_TRACK;
                EventType eventType2 = EventType.EVENT;
                bs4Var.getClass();
                eventType2.getClass();
                if (z) {
                    aVar = aVar3;
                    EventDefault h2 = a.h(aVar, j2, event2, null, null, null, new VideoTrackChangeData(videoTrackData, videoTrackData2), i3, 14);
                    ylrVar.getClass();
                    ylrVar.c(h2);
                } else {
                    aVar = aVar3;
                    ylrVar.b(a.h(aVar, j2, event2, null, null, null, new VideoTrackChangeData(videoTrackData, videoTrackData2), i3, 14));
                }
            }
        }
        if (!Intrinsics.d(subtitleTrackData, this.d) && this.c != null) {
            SubtitleTrackData subtitleTrackData4 = this.d;
            cjb i4 = aVar.i();
            bjb j3 = aVar.j();
            if (z) {
                x97.y(mm6Var, null, null, new fjb(j3, (Continuation) null, aVar, subtitleTrackData4, subtitleTrackData, i4, 6), i);
            } else {
                Event event3 = Event.SET_TEXT_TRACK;
                EventType eventType3 = EventType.EVENT;
                bs4Var.getClass();
                eventType3.getClass();
                if (z) {
                    EventDefault h3 = a.h(aVar, j3, event3, null, null, null, new SubtitleTrackChangeData(subtitleTrackData4, subtitleTrackData), i4, 14);
                    ylrVar.getClass();
                    ylrVar.c(h3);
                } else {
                    ylrVar.b(a.h(aVar, j3, event3, null, null, null, new SubtitleTrackChangeData(subtitleTrackData4, subtitleTrackData), i4, 14));
                }
            }
        }
        this.b = audioTrackData;
        this.c = videoTrackData2;
        this.d = subtitleTrackData;
    }
}
