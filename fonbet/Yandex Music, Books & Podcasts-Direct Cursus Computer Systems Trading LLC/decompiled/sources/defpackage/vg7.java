package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.CodecInfo;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.event.DecoderFallbackData;
import ru.yandex.video.m3.player.tracks.TrackType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class vg7 implements u9l {
    public final int a;
    public final wg7 b;
    public final LinkedHashMap c;

    public vg7(int i, ecg ecgVar) {
        ecgVar.getClass();
        this.a = i;
        this.b = ecgVar;
        TrackType trackType = TrackType.Audio;
        Pair pair = new Pair(trackType, new ug7(trackType));
        TrackType trackType2 = TrackType.Video;
        this.c = uah.g(pair, new Pair(trackType2, new ug7(trackType2)));
    }

    @Override // defpackage.u9l
    public final void J(mka mkaVar) {
        f(TrackType.Video, mkaVar);
    }

    @Override // defpackage.u9l
    public final void K(TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
        List<CodecInfo> codecsInfo;
        Object obj;
        trackType.getClass();
        str.getClass();
        Boolean bool = null;
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
            }
        }
        Boolean bool2 = bool;
        if (a(trackType).b != null) {
            e(trackType, false);
        }
        ug7 b = ug7.b(a(trackType), str, null, null, null, null, 0, 0, null, bool2, 509);
        this.c.put(trackType, b);
        if (b.a()) {
            e(trackType, true);
        }
        if (mediaCodecSelectorLog == null || str.equals(((CodecInfo) CollectionsKt.Q(mediaCodecSelectorLog.getCodecsInfo())).getName()) || trackType != TrackType.Video) {
            return;
        }
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
                new DecoderFallbackData(arrayList, codecInfo2);
                this.b.getClass();
                return;
            }
        }
        wvs.h("Collection contains no element matching the predicate.");
    }

    public final ug7 a(TrackType trackType) {
        ug7 ug7Var = (ug7) this.c.get(trackType);
        return ug7Var == null ? new ug7(trackType) : ug7Var;
    }

    public final void e(TrackType trackType, boolean z) {
        DecoderEventData decoderEventData;
        HashSet u0;
        HashSet u02;
        HashSet u03;
        String str;
        hg7 hg7Var;
        ug7 a = a(trackType);
        tvs tvsVar = a.k;
        if (tvsVar == null || (str = a.l) == null || (hg7Var = a.f) == null) {
            Timber.INSTANCE.e("Invalid decoder data " + a, new Object[0]);
            decoderEventData = null;
        } else {
            decoderEventData = quj.j(str, a.a, hg7Var, tvsVar, a.e, new ri0(1, a, z, false));
        }
        if (decoderEventData != null) {
            int D = ouj.D(a.c());
            if (D == 0) {
                Timber.INSTANCE.i("log decoder initialization " + trackType + ' ' + decoderEventData, new Object[0]);
                wg7 wg7Var = this.b;
                int i = this.a;
                ecg ecgVar = (ecg) wg7Var;
                ecgVar.getClass();
                trackType.getClass();
                yjj yjjVar = ecgVar.l;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    gag gagVar = (gag) it.next();
                    gagVar.getClass();
                    trackType.getClass();
                    if (trackType == TrackType.Video) {
                        gagVar.a.H("ListSdkDebugDataManager", "onDecoderInitialized trackType: " + trackType + " data: " + decoderEventData, null, new Object[0]);
                        gagVar.a(i, decoderEventData);
                    }
                }
            } else if (D == 1) {
                Timber.INSTANCE.i("log decoder reuse " + trackType + ' ' + decoderEventData, new Object[0]);
                wg7 wg7Var2 = this.b;
                int i2 = this.a;
                ecg ecgVar2 = (ecg) wg7Var2;
                ecgVar2.getClass();
                trackType.getClass();
                yjj yjjVar2 = ecgVar2.l;
                synchronized (yjjVar2.a) {
                    u02 = CollectionsKt.u0(yjjVar2.a);
                }
                Iterator it2 = u02.iterator();
                while (it2.hasNext()) {
                    gag gagVar2 = (gag) it2.next();
                    gagVar2.getClass();
                    trackType.getClass();
                    if (trackType == TrackType.Video) {
                        gagVar2.a.H("ListSdkDebugDataManager", "onDecoderReused trackType: " + trackType + " data: " + decoderEventData, null, new Object[0]);
                        gagVar2.a(i2, decoderEventData);
                    }
                }
            } else if (D == 2) {
                Timber.INSTANCE.i("log decoder discard " + trackType + ' ' + decoderEventData, new Object[0]);
                wg7 wg7Var3 = this.b;
                int i3 = this.a;
                ecg ecgVar3 = (ecg) wg7Var3;
                ecgVar3.getClass();
                trackType.getClass();
                yjj yjjVar3 = ecgVar3.l;
                synchronized (yjjVar3.a) {
                    u03 = CollectionsKt.u0(yjjVar3.a);
                }
                Iterator it3 = u03.iterator();
                while (it3.hasNext()) {
                    gag gagVar3 = (gag) it3.next();
                    gagVar3.getClass();
                    trackType.getClass();
                    if (trackType == TrackType.Video) {
                        gagVar3.a.H("ListSdkDebugDataManager", "onDecoderDiscarded trackType: " + trackType + " data: " + decoderEventData, null, new Object[0]);
                        gagVar3.a(i3, decoderEventData);
                    }
                }
            }
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.c;
            String str2 = a.l;
            tvs tvsVar2 = a.k;
            hg7 hg7Var2 = a.f;
            linkedHashMap.put(trackType, ug7.b(a, null, str2, null, tvsVar2, null, hg7Var2 != null ? hg7Var2.c() : 0, a.m, null, a.j, 33));
        }
    }

    public final void f(TrackType trackType, mka mkaVar) {
        LinkedHashMap linkedHashMap = this.c;
        ug7 ug7Var = (ug7) linkedHashMap.get(trackType);
        ug7 b = ug7.b(a(trackType), null, null, null, null, new bh3(ug7Var != null ? ug7Var.f : null, mkaVar), 0, 0, null, null, 991);
        linkedHashMap.put(trackType, b);
        if (b.a()) {
            e(trackType, true);
        }
    }

    @Override // defpackage.u9l
    public final void i(mka mkaVar) {
        f(TrackType.Audio, mkaVar);
    }

    @Override // defpackage.u9l
    public final void k(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        l(TrackType.Audio, isbVar, mediaCodecReuseLog);
    }

    public final void l(TrackType trackType, isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        if (a(trackType).d != null) {
            e(trackType, false);
        }
        ug7 b = ug7.b(a(trackType), null, null, isbVar, null, null, 0, 0, mediaCodecReuseLog, null, 759);
        this.c.put(trackType, b);
        if (b.a()) {
            e(trackType, true);
        }
    }

    @Override // defpackage.u9l
    public final void r(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        l(TrackType.Video, isbVar, mediaCodecReuseLog);
    }
}
