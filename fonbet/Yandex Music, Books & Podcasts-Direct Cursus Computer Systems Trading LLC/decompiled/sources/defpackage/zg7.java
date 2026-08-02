package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.CodecInfo;
import ru.yandex.video.m3.data.Decoder;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.event.DecoderFallbackData;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public final class zg7 implements u9l, sg7 {
    public final a a;
    public final ksa b;
    public final LinkedHashMap c;
    public boolean d;

    public zg7(a aVar, ksa ksaVar) {
        this.a = aVar;
        this.b = ksaVar;
        TrackType trackType = TrackType.Audio;
        Pair pair = new Pair(trackType, new xg7(trackType, ksaVar));
        TrackType trackType2 = TrackType.Video;
        this.c = uah.g(pair, new Pair(trackType2, new xg7(trackType2, ksaVar)));
    }

    @Override // defpackage.u9l
    public final void J(mka mkaVar) {
        m(TrackType.Video, mkaVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    @Override // defpackage.u9l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
        Boolean bool;
        xg7 b;
        List<CodecInfo> codecsInfo;
        Object obj;
        trackType.getClass();
        str.getClass();
        if (mediaCodecSelectorLog != null && (codecsInfo = mediaCodecSelectorLog.getCodecsInfo()) != null) {
            Iterator<T> it = codecsInfo.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.d(((CodecInfo) obj).getName(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            CodecInfo codecInfo = (CodecInfo) obj;
            if (codecInfo != null) {
                bool = Boolean.valueOf(codecInfo.getHardwareAccelerated());
                if (f(trackType).b != null) {
                    l(trackType, false);
                }
                b = xg7.b(f(trackType), str, null, null, null, null, 0, 0, null, bool, 1533);
                this.c.put(trackType, b);
                if (b.a()) {
                    l(trackType, true);
                }
                if (mediaCodecSelectorLog == null && !str.equals(((CodecInfo) CollectionsKt.Q(mediaCodecSelectorLog.getCodecsInfo())).getName()) && trackType == TrackType.Video) {
                    List<CodecInfo> codecsInfo2 = mediaCodecSelectorLog.getCodecsInfo();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : codecsInfo2) {
                        if (Intrinsics.d(((CodecInfo) obj2).getName(), str)) {
                            break;
                        } else {
                            arrayList.add(obj2);
                        }
                    }
                    for (CodecInfo codecInfo2 : mediaCodecSelectorLog.getCodecsInfo()) {
                        if (Intrinsics.d(codecInfo2.getName(), str)) {
                            DecoderFallbackData decoderFallbackData = new DecoderFallbackData(arrayList, codecInfo2);
                            a aVar = this.a;
                            cjb i = aVar.i();
                            bjb j = aVar.j();
                            boolean z = aVar.l;
                            if (z) {
                                x97.y(aVar.k, null, null, new oh3(j, (Continuation) null, aVar, decoderFallbackData, i, 6), 3);
                                return;
                            }
                            Event event = Event.VIDEO_DECODER_FALLBACK;
                            EventType eventType = EventType.EVENT;
                            aVar.g.getClass();
                            eventType.getClass();
                            ylr ylrVar = aVar.a;
                            if (!z) {
                                ylrVar.b(a.h(aVar, j, event, null, null, null, decoderFallbackData, i, 14));
                                return;
                            }
                            EventDefault h = a.h(aVar, j, event, null, null, null, decoderFallbackData, i, 14);
                            ylrVar.getClass();
                            ylrVar.c(h);
                            return;
                        }
                    }
                    wvs.h("Collection contains no element matching the predicate.");
                    return;
                }
                return;
            }
        }
        bool = null;
        if (f(trackType).b != null) {
        }
        b = xg7.b(f(trackType), str, null, null, null, null, 0, 0, null, bool, 1533);
        this.c.put(trackType, b);
        if (b.a()) {
        }
        if (mediaCodecSelectorLog == null) {
        }
    }

    @Override // defpackage.sg7
    public final Decoder a() {
        return f(TrackType.Audio).d();
    }

    @Override // defpackage.sg7
    public final Decoder e() {
        return f(TrackType.Video).d();
    }

    public final xg7 f(TrackType trackType) {
        xg7 xg7Var = (xg7) this.c.get(trackType);
        return xg7Var == null ? new xg7(trackType, this.b) : xg7Var;
    }

    @Override // defpackage.u9l
    public final void i(mka mkaVar) {
        m(TrackType.Audio, mkaVar);
    }

    @Override // defpackage.u9l
    public final void k(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        n(TrackType.Audio, isbVar, mediaCodecReuseLog);
    }

    public final void l(TrackType trackType, boolean z) {
        Event event;
        Event event2;
        Event event3;
        a aVar = this.a;
        ylr ylrVar = aVar.a;
        bs4 bs4Var = aVar.g;
        mm6 mm6Var = aVar.k;
        boolean z2 = aVar.l;
        xg7 f = f(trackType);
        DecoderEventData e = f.e(z, this.d, true);
        if (e != null) {
            int D = ouj.D(f.c());
            if (D == 0) {
                StringBuilder sb = new StringBuilder("log decoder initialization ");
                sb.append(trackType);
                sb.append(' ');
                sb.append(e);
                trackType.getClass();
                int i = djb.a[trackType.ordinal()];
                if (i == 1) {
                    event = Event.AUDIO_DECODER_INITIALIZED;
                } else if (i == 2) {
                    event = Event.VIDEO_DECODER_INITIALIZED;
                }
                Event event4 = event;
                cjb i2 = aVar.i();
                bjb j = aVar.j();
                if (z2) {
                    x97.y(mm6Var, null, null, new hjb(j, null, aVar, event4, e, i2, 1), 3);
                } else {
                    EventType eventType = EventType.EVENT;
                    bs4Var.getClass();
                    eventType.getClass();
                    if (z2) {
                        EventDefault h = a.h(aVar, j, event4, null, null, eventType, e, i2, 6);
                        ylrVar.getClass();
                        ylrVar.c(h);
                    } else {
                        ylrVar.b(a.h(aVar, j, event4, null, null, eventType, e, i2, 6));
                    }
                }
            } else if (D == 1) {
                StringBuilder sb2 = new StringBuilder("log decoder reuse ");
                sb2.append(trackType);
                sb2.append(' ');
                sb2.append(e);
                trackType.getClass();
                cjb i3 = aVar.i();
                int i4 = djb.a[trackType.ordinal()];
                if (i4 == 1) {
                    event2 = Event.AUDIO_DECODER_REUSED;
                } else if (i4 == 2) {
                    event2 = Event.VIDEO_DECODER_REUSED;
                }
                Event event5 = event2;
                bjb j2 = aVar.j();
                if (z2) {
                    x97.y(mm6Var, null, null, new hjb(j2, null, aVar, event5, e, i3, 2), 3);
                } else {
                    EventType eventType2 = EventType.EVENT;
                    bs4Var.getClass();
                    eventType2.getClass();
                    if (z2) {
                        EventDefault h2 = a.h(aVar, j2, event5, null, null, eventType2, e, i3, 6);
                        ylrVar.getClass();
                        ylrVar.c(h2);
                    } else {
                        ylrVar.b(a.h(aVar, j2, event5, null, null, eventType2, e, i3, 6));
                    }
                }
            } else if (D == 2) {
                StringBuilder sb3 = new StringBuilder("log decoder discard ");
                sb3.append(trackType);
                sb3.append(' ');
                sb3.append(e);
                trackType.getClass();
                cjb i5 = aVar.i();
                int i6 = djb.a[trackType.ordinal()];
                if (i6 == 1) {
                    event3 = Event.AUDIO_DECODER_DISCARDED;
                } else if (i6 == 2) {
                    event3 = Event.VIDEO_DECODER_DISCARDED;
                }
                Event event6 = event3;
                bjb j3 = aVar.j();
                if (z2) {
                    x97.y(mm6Var, null, null, new hjb(j3, null, aVar, event6, e, i5, 0), 3);
                } else {
                    EventType eventType3 = EventType.EVENT;
                    bs4Var.getClass();
                    eventType3.getClass();
                    if (z2) {
                        EventDefault h3 = a.h(aVar, j3, event6, null, null, eventType3, e, i5, 6);
                        ylrVar.getClass();
                        ylrVar.c(h3);
                    } else {
                        ylrVar.b(a.h(aVar, j3, event6, null, null, eventType3, e, i5, 6));
                    }
                }
            }
        }
        if (z) {
            String str = f.m;
            tvs tvsVar = f.l;
            hg7 hg7Var = f.f;
            this.c.put(trackType, xg7.b(f, null, str, null, tvsVar, null, hg7Var != null ? hg7Var.c() : 0, f.n, null, f.j, 1057));
        }
    }

    public final void m(TrackType trackType, mka mkaVar) {
        LinkedHashMap linkedHashMap = this.c;
        xg7 xg7Var = (xg7) linkedHashMap.get(trackType);
        xg7 b = xg7.b(f(trackType), null, null, null, null, new bh3(xg7Var != null ? xg7Var.f : null, mkaVar), 0, 0, null, null, 2015);
        linkedHashMap.put(trackType, b);
        if (b.a()) {
            l(trackType, true);
        }
    }

    public final void n(TrackType trackType, isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        if (f(trackType).d != null) {
            l(trackType, false);
        }
        xg7 b = xg7.b(f(trackType), null, null, isbVar, null, null, 0, 0, mediaCodecReuseLog, null, 1783);
        this.c.put(trackType, b);
        if (b.a()) {
            l(trackType, true);
        }
    }

    @Override // defpackage.u9l
    public final void r(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        n(TrackType.Video, isbVar, mediaCodecReuseLog);
    }
}
