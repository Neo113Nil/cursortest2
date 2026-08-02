package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.CodecInfo;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.player.tracks.TrackType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class lg7 implements u9l {
    public final yjj a;
    public jg7 b = new jg7(null, null, null, 31);
    public jg7 c = new jg7(null, null, null, 31);

    public lg7(yjj yjjVar) {
        this.a = yjjVar;
    }

    @Override // defpackage.u9l
    public final void K(TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        Object t7oVar2;
        List<CodecInfo> codecsInfo;
        trackType.getClass();
        str.getClass();
        if (mediaCodecSelectorLog != null && (codecsInfo = mediaCodecSelectorLog.getCodecsInfo()) != null) {
            for (CodecInfo codecInfo : codecsInfo) {
                if (Intrinsics.d(codecInfo.getName(), str)) {
                }
            }
            wvs.h("Collection contains no element matching the predicate.");
            return;
        }
        codecInfo = null;
        if (trackType == TrackType.Video) {
            Boolean valueOf = codecInfo != null ? Boolean.valueOf(codecInfo.getHardwareAccelerated()) : null;
            Integer num = this.c.b;
            this.c = new jg7(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1), valueOf, 12);
            yjj yjjVar = this.a;
            synchronized (yjjVar.a) {
                u02 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u02.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    taw tawVar = (taw) next;
                    jg7 jg7Var = this.c;
                    tawVar.getClass();
                    jg7Var.getClass();
                    xdr xdrVar = tawVar.p;
                    xdrVar.getClass();
                    xdrVar.m(null, jg7Var);
                    t7oVar2 = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar2 = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar2);
                if (a != null) {
                    Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                }
            }
        }
        if (trackType == TrackType.Audio) {
            Boolean valueOf2 = codecInfo != null ? Boolean.valueOf(codecInfo.getHardwareAccelerated()) : null;
            Integer num2 = this.b.b;
            this.b = new jg7(str, Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1), valueOf2, 12);
            yjj yjjVar2 = this.a;
            synchronized (yjjVar2.a) {
                u0 = CollectionsKt.u0(yjjVar2.a);
            }
            Iterator it2 = u0.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                try {
                    r7o r7oVar3 = z7o.b;
                    taw tawVar2 = (taw) next2;
                    jg7 jg7Var2 = this.b;
                    tawVar2.getClass();
                    jg7Var2.getClass();
                    xdr xdrVar2 = tawVar2.q;
                    xdrVar2.getClass();
                    xdrVar2.m(null, jg7Var2);
                    t7oVar = Unit.a;
                } catch (Throwable th2) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar = new t7o(th2);
                }
                Throwable a2 = z7o.a(t7oVar);
                if (a2 != null) {
                    Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                }
            }
        }
    }

    @Override // defpackage.u9l
    public final void k(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        HashSet u0;
        Object t7oVar;
        jg7 jg7Var = this.b;
        Integer num = jg7Var.c;
        this.b = jg7.a(jg7Var, num != null ? Integer.valueOf(num.intValue() + 1) : null);
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                taw tawVar = (taw) next;
                jg7 jg7Var2 = this.b;
                tawVar.getClass();
                jg7Var2.getClass();
                xdr xdrVar = tawVar.q;
                xdrVar.getClass();
                xdrVar.m(null, jg7Var2);
                t7oVar = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
    }

    @Override // defpackage.u9l
    public final void r(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        HashSet u0;
        Object t7oVar;
        jg7 jg7Var = this.c;
        Integer num = jg7Var.c;
        this.c = jg7.a(jg7Var, num != null ? Integer.valueOf(num.intValue() + 1) : null);
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                taw tawVar = (taw) next;
                jg7 jg7Var2 = this.c;
                tawVar.getClass();
                jg7Var2.getClass();
                xdr xdrVar = tawVar.p;
                xdrVar.getClass();
                xdrVar.m(null, jg7Var2);
                t7oVar = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
    }
}
