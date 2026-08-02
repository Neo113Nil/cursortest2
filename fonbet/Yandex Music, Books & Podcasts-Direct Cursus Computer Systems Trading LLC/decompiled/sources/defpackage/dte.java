package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.player.tracks.TrackType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class dte extends e80 {
    public final yjj a;
    public final nue b;
    public final HashSet c;
    public final HashSet d;
    public final HashSet e;
    public final List f;

    public dte(yjj yjjVar, nue nueVar) {
        yjjVar.getClass();
        nueVar.getClass();
        this.a = yjjVar;
        this.b = nueVar;
        this.c = vop.c(1, 7);
        this.d = vop.c(0, 2);
        this.e = vop.c(-9223372036854775807L, Long.MIN_VALUE);
        this.f = u75.h("REUSE_NOT_IMPLEMENTED", "WORKAROUND", "APP_OVERRIDE", "MIME_TYPE_CHANGED", "OPERATING_RATE_CHANGED", "INITIALIZATION_DATA_CHANGED", "MAX_INPUT_SIZE_EXCEEDED", "DRM_SESSION_CHANGED", "VIDEO_MAX_RESOLUTION_EXCEEDED", "VIDEO_RESOLUTION_CHANGED", "VIDEO_ROTATION_CHANGED", "VIDEO_COLOR_INFO_CHANGED", "AUDIO_CHANNEL_COUNT_CHANGED", "AUDIO_SAMPLE_RATE_CHANGED", "AUDIO_ENCODING_CHANGED");
    }

    @Override // defpackage.d80
    public final void I(c80 c80Var, String str) {
        HashSet u0;
        Object t7oVar;
        str.getClass();
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).d(str);
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

    @Override // defpackage.d80
    public final void L(c80 c80Var, String str, long j, long j2) {
        HashSet u0;
        Object t7oVar;
        str.getClass();
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                TrackType trackType = TrackType.Audio;
                nue nueVar = this.b;
                nueVar.getClass();
                trackType.getClass();
                ((zbl) next).K(trackType, str, (MediaCodecSelectorLog) nueVar.a.get(trackType));
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[SYNTHETIC] */
    @Override // defpackage.d80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(c80 c80Var, String str, long j, long j2) {
        HashSet u0;
        String str2;
        long j3;
        long j4;
        Object t7oVar;
        Throwable a;
        str.getClass();
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                zbl zblVar = (zbl) next;
                TrackType trackType = TrackType.Video;
                nue nueVar = this.b;
                nueVar.getClass();
                trackType.getClass();
                zblVar.K(trackType, str, (MediaCodecSelectorLog) nueVar.a.get(trackType));
                str2 = str;
                j3 = j;
                j4 = j2;
                try {
                    zblVar.g(j3, j4, str2);
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th2);
                    a = z7o.a(t7oVar);
                    if (a == null) {
                    }
                    j = j3;
                    j2 = j4;
                    str = str2;
                }
            } catch (Throwable th3) {
                th = th3;
                str2 = str;
                j3 = j;
                j4 = j2;
            }
            a = z7o.a(t7oVar);
            if (a == null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
            j = j3;
            j2 = j4;
            str = str2;
        }
    }

    @Override // defpackage.d80
    public final void R(c80 c80Var, ig7 ig7Var) {
        HashSet u0;
        Object t7oVar;
        ig7Var.getClass();
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).i(new mka(ig7Var));
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

    @Override // defpackage.d80
    public final void T(c80 c80Var, String str) {
        HashSet u0;
        Object t7oVar;
        str.getClass();
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).b(str);
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

    @Override // defpackage.d80
    public final void V(c80 c80Var, ig7 ig7Var) {
        HashSet u0;
        Object t7oVar;
        ig7Var.getClass();
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).J(new mka(ig7Var));
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

    @Override // defpackage.d80
    public final void Z(c80 c80Var, cfg cfgVar, boh bohVar) {
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        Object t7oVar2;
        if (!this.c.contains(Integer.valueOf(bohVar.a)) || this.e.contains(Long.valueOf(bohVar.f)) || this.e.contains(Long.valueOf(bohVar.g))) {
            return;
        }
        if (this.d.contains(Integer.valueOf(bohVar.b))) {
            yjj yjjVar = this.a;
            synchronized (yjjVar.a) {
                u02 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u02.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((zbl) next).B(bohVar.g - bohVar.f, cfgVar.d);
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
        yjj yjjVar2 = this.a;
        synchronized (yjjVar2.a) {
            u0 = CollectionsKt.u0(yjjVar2.a);
        }
        Iterator it2 = u0.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            try {
                r7o r7oVar3 = z7o.b;
                zbl zblVar = (zbl) next2;
                long j = cfgVar.e;
                int i = bohVar.b;
                zblVar.G(j, i != 1 ? i != 2 ? i != 3 ? null : TrackType.Subtitles : TrackType.Video : TrackType.Audio);
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

    public final MediaCodecReuseLog b(tg7 tg7Var) {
        String X;
        int i = tg7Var.d;
        MediaCodecReuseLog.DecoderReuseMethod decoderReuseMethod = i != 0 ? i != 1 ? i != 2 ? i != 3 ? MediaCodecReuseLog.DecoderReuseMethod.UNKNOWN : MediaCodecReuseLog.DecoderReuseMethod.NOOP : MediaCodecReuseLog.DecoderReuseMethod.RECONFIGURE : MediaCodecReuseLog.DecoderReuseMethod.FLUSH : MediaCodecReuseLog.DecoderReuseMethod.DISCARD;
        int i2 = tg7Var.e;
        if (i2 == 0) {
            X = "ZERO_INFO";
        } else {
            int i3 = 1;
            ArrayList arrayList = new ArrayList();
            for (String str : this.f) {
                if ((i2 & i3) > 0) {
                    arrayList.add(str);
                }
                i3 *= 2;
            }
            X = CollectionsKt.X(arrayList, StringUtils.COMMA, null, null, null, 62);
        }
        decoderReuseMethod.getClass();
        return new MediaCodecReuseLog(decoderReuseMethod, X, null);
    }

    @Override // defpackage.d80
    public final void c(c80 c80Var) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).C();
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

    @Override // defpackage.d80
    public final void d0(c80 c80Var, dsc dscVar, tg7 tg7Var) {
        HashSet u0;
        Object t7oVar;
        dscVar.getClass();
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).r(new isb(dscVar), tg7Var != null ? b(tg7Var) : null);
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

    @Override // defpackage.d80
    public final void k(c80 c80Var, u2i u2iVar) {
        HashSet u0;
        Object t7oVar;
        u2iVar.getClass();
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).getClass();
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

    @Override // defpackage.d80
    public final void l(c80 c80Var, Object obj) {
        HashSet u0;
        Object t7oVar;
        obj.getClass();
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).l();
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

    @Override // defpackage.d80
    public final void p(c80 c80Var, int i, int i2) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).j(i, i2);
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

    @Override // defpackage.d80
    public final void u(c80 c80Var, int i, int i2) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).A(i, i2);
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

    @Override // defpackage.d80
    public final void w(c80 c80Var, dsc dscVar, tg7 tg7Var) {
        HashSet u0;
        Object t7oVar;
        dscVar.getClass();
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).k(new isb(dscVar), tg7Var != null ? b(tg7Var) : null);
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
