package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.TrackSelectionType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class waw implements zbl {
    public final cbw a;
    public final l1u b;

    public waw(cbw cbwVar, l1u l1uVar) {
        this.a = cbwVar;
        this.b = l1uVar;
    }

    @Override // defpackage.zbl
    public final void A(int i, int i2) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).A(i, i2);
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

    @Override // defpackage.zbl
    public final void B(long j, long j2) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).B(j, j2);
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

    @Override // defpackage.zbl
    public final void C() {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).C();
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

    @Override // defpackage.zbl
    public final void F(long j) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).F(j);
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

    @Override // defpackage.zbl
    public final void G(long j, TrackType trackType) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).G(j, trackType);
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

    @Override // defpackage.zbl
    public final void H(TrackType trackType, Integer num) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).H(trackType, num);
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

    @Override // defpackage.zbl
    public final void I(LoadError loadError) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).I(loadError);
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

    @Override // defpackage.zbl
    public final void J(mka mkaVar) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).J(mkaVar);
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

    @Override // defpackage.zbl
    public final void K(TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
        HashSet u0;
        Object t7oVar;
        trackType.getClass();
        str.getClass();
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).K(trackType, str, mediaCodecSelectorLog);
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

    @Override // defpackage.zbl
    public final void L(StartFromCacheInfo startFromCacheInfo) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).L(startFromCacheInfo);
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

    @Override // defpackage.zbl
    public final void M(LoadCanceled loadCanceled) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).M(loadCanceled);
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

    @Override // defpackage.zbl
    public final void N(int i) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).N(i);
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

    @Override // defpackage.zbl
    public final void O(long j) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).O(j);
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

    @Override // defpackage.zbl
    public final void Q(long j) {
        HashSet u0;
        HashSet u02;
        Object t7oVar;
        Object t7oVar2;
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).Q(j);
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
        yjj yjjVar2 = this.a.u;
        synchronized (yjjVar2.a) {
            u02 = CollectionsKt.u0(yjjVar2.a);
        }
        Iterator it2 = u02.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            try {
                r7o r7oVar3 = z7o.b;
                ((u9l) next2).Y(j);
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

    @Override // defpackage.zbl
    public final void R(String str, boolean z) {
        HashSet u0;
        Object t7oVar;
        str.getClass();
        if (z) {
            return;
        }
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).e0(str);
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.zbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S() {
        dws dwsVar;
        jsb jsbVar;
        jsb jsbVar2;
        dws dwsVar2;
        yjj yjjVar;
        HashSet u0;
        Object t7oVar;
        TrackVariant trackVariant;
        HashSet u02;
        Object t7oVar2;
        HashSet u03;
        Object t7oVar3;
        cbw cbwVar = this.a;
        if (cbwVar.f.b()) {
            return;
        }
        cbwVar.L = true;
        jsb jsbVar3 = cbwVar.I;
        if (jsbVar3 != null) {
            jsbVar3.e();
        }
        jsb jsbVar4 = cbwVar.K;
        if (jsbVar4 != null) {
            jsbVar4.e();
        }
        jsb jsbVar5 = cbwVar.J;
        if (jsbVar5 != null) {
            TrackVariant c = jsbVar5.c();
            isb b = jsbVar5.b();
            if (c != null && b != null) {
                dwsVar = new dws(c, b);
                jsbVar = cbwVar.J;
                if (jsbVar != null) {
                    jsbVar.e();
                }
                jsbVar2 = cbwVar.J;
                if (jsbVar2 != null) {
                    TrackVariant c2 = jsbVar2.c();
                    isb b2 = jsbVar2.b();
                    if (c2 != null && b2 != null) {
                        dwsVar2 = new dws(c2, b2);
                        if (dwsVar != null && dwsVar2 != null) {
                            if ((dwsVar.a instanceof TrackVariant.Adaptive) && (dwsVar2.a instanceof TrackVariant.Variant) && dwsVar.b.g < dwsVar2.b.g) {
                                cbwVar.d.a.C();
                                str strVar = cbwVar.e;
                                strVar.f = true;
                                strVar.c();
                            }
                            TrackVariant trackVariant2 = dwsVar.a;
                            trackVariant = dwsVar2.a;
                            if (!(trackVariant instanceof TrackVariant.Variant)) {
                                int i = ((isb) ((TrackVariant.Variant) trackVariant).getFormat()).g;
                                cbwVar.d.b.z(Integer.valueOf(i));
                                cbwVar.e.b(Integer.valueOf(i));
                                yjj yjjVar2 = cbwVar.u;
                                synchronized (yjjVar2.a) {
                                    u03 = CollectionsKt.u0(yjjVar2.a);
                                }
                                Iterator it = u03.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    try {
                                        r7o r7oVar = z7o.b;
                                        ((u9l) next).S(Integer.valueOf(i));
                                        t7oVar3 = Unit.a;
                                    } catch (Throwable th) {
                                        r7o r7oVar2 = z7o.b;
                                        t7oVar3 = new t7o(th);
                                    }
                                    Throwable a = z7o.a(t7oVar3);
                                    if (a != null) {
                                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                                    }
                                }
                            } else if ((trackVariant2 instanceof TrackVariant.Variant) && (trackVariant instanceof TrackVariant.Adaptive)) {
                                cbwVar.d.b.z(null);
                                cbwVar.e.b(null);
                                yjj yjjVar3 = cbwVar.u;
                                synchronized (yjjVar3.a) {
                                    u02 = CollectionsKt.u0(yjjVar3.a);
                                }
                                Iterator it2 = u02.iterator();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    try {
                                        r7o r7oVar3 = z7o.b;
                                        ((u9l) next2).S(null);
                                        t7oVar2 = Unit.a;
                                    } catch (Throwable th2) {
                                        r7o r7oVar4 = z7o.b;
                                        t7oVar2 = new t7o(th2);
                                    }
                                    Throwable a2 = z7o.a(t7oVar2);
                                    if (a2 != null) {
                                        Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                                    }
                                }
                            }
                        }
                        yjjVar = cbwVar.t;
                        synchronized (yjjVar.a) {
                            u0 = CollectionsKt.u0(yjjVar.a);
                        }
                        Iterator it3 = u0.iterator();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            try {
                                r7o r7oVar5 = z7o.b;
                                jsb jsbVar6 = cbwVar.I;
                                jsbVar6.getClass();
                                jsb jsbVar7 = cbwVar.K;
                                jsbVar7.getClass();
                                jsb jsbVar8 = cbwVar.J;
                                jsbVar8.getClass();
                                ((rgl) next3).o(jsbVar6, jsbVar7, jsbVar8);
                                t7oVar = Unit.a;
                            } catch (Throwable th3) {
                                r7o r7oVar6 = z7o.b;
                                t7oVar = new t7o(th3);
                            }
                            Throwable a3 = z7o.a(t7oVar);
                            if (a3 != null) {
                                Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
                            }
                        }
                        return;
                    }
                }
                dwsVar2 = null;
                if (dwsVar != null) {
                    if (dwsVar.a instanceof TrackVariant.Adaptive) {
                        cbwVar.d.a.C();
                        str strVar2 = cbwVar.e;
                        strVar2.f = true;
                        strVar2.c();
                    }
                    TrackVariant trackVariant22 = dwsVar.a;
                    trackVariant = dwsVar2.a;
                    if (!(trackVariant instanceof TrackVariant.Variant)) {
                    }
                }
                yjjVar = cbwVar.t;
                synchronized (yjjVar.a) {
                }
            }
        }
        dwsVar = null;
        jsbVar = cbwVar.J;
        if (jsbVar != null) {
        }
        jsbVar2 = cbwVar.J;
        if (jsbVar2 != null) {
        }
        dwsVar2 = null;
        if (dwsVar != null) {
        }
        yjjVar = cbwVar.t;
        synchronized (yjjVar.a) {
        }
    }

    @Override // defpackage.zbl
    public final void T(boolean z, float f) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).b0();
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

    @Override // defpackage.zbl
    public final void U(long j) {
        HashSet u0;
        Object t7oVar;
        if (this.a.B() == VideoType.LIVE) {
            j = Long.MIN_VALUE;
        }
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).m0(j);
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

    @Override // defpackage.zbl
    public final void V() {
        HashSet u0;
        HashSet u02;
        HashSet u03;
        Object t7oVar;
        TrackSelectionType trackSelectionType;
        TrackVariant c;
        Object t7oVar2;
        Object t7oVar3;
        Timber.INSTANCE.d("onBufferingEnd", new Object[0]);
        yjj yjjVar = this.a.v;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((ove) next).D();
                t7oVar3 = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar3 = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar3);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
        this.a.x.set(0);
        this.a.P();
        if (this.a.y.compareAndSet(false, true)) {
            this.a.i();
            yjj yjjVar2 = this.a.t;
            synchronized (yjjVar2.a) {
                u02 = CollectionsKt.u0(yjjVar2.a);
            }
            Iterator it2 = u02.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                try {
                    r7o r7oVar3 = z7o.b;
                    ((rgl) next2).v();
                    t7oVar2 = Unit.a;
                } catch (Throwable th2) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar2 = new t7o(th2);
                }
                Throwable a2 = z7o.a(t7oVar2);
                if (a2 != null) {
                    Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                }
            }
            yjj yjjVar3 = this.a.u;
            synchronized (yjjVar3.a) {
                u03 = CollectionsKt.u0(yjjVar3.a);
            }
            Iterator it3 = u03.iterator();
            while (it3.hasNext()) {
                Object next3 = it3.next();
                try {
                    r7o r7oVar5 = z7o.b;
                    u9l u9lVar = (u9l) next3;
                    jsb jsbVar = this.a.J;
                    if (jsbVar == null || (c = jsbVar.c()) == null) {
                        trackSelectionType = null;
                    } else if (c instanceof TrackVariant.Adaptive) {
                        trackSelectionType = TrackSelectionType.ADAPTIVE;
                    } else if (c instanceof TrackVariant.Disable) {
                        trackSelectionType = TrackSelectionType.DISABLE;
                    } else {
                        if (!(c instanceof TrackVariant.DownloadVariant ? true : c instanceof TrackVariant.PreferredTrackVariant ? true : c instanceof TrackVariant.Variant)) {
                            throw new x7j();
                        }
                        trackSelectionType = TrackSelectionType.FIXED;
                    }
                    ccl cclVar = this.a.M;
                    u9lVar.k0(new gfc(cclVar != null ? ((crb) cclVar).G.N() : null, trackSelectionType));
                    t7oVar = Unit.a;
                } catch (Throwable th3) {
                    r7o r7oVar6 = z7o.b;
                    t7oVar = new t7o(th3);
                }
                Throwable a3 = z7o.a(t7oVar);
                if (a3 != null) {
                    Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
                }
            }
        }
    }

    @Override // defpackage.zbl
    public final void W() {
        HashSet u0;
        Object t7oVar;
        Timber.INSTANCE.d("onBufferingStart", new Object[0]);
        yjj yjjVar = this.a.v;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((ove) next).w();
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
        this.a.x.incrementAndGet();
        this.a.Q();
    }

    @Override // defpackage.zbl
    public final void X(PlaybackException playbackException) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).n0(playbackException);
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

    @Override // defpackage.zbl
    public final void Y(PlaybackException playbackException) {
        playbackException.getClass();
        cbw cbwVar = this.a;
        cbwVar.R(playbackException, (PreparingParams) cbwVar.r.get(), new rgb(this.a.y.get(), this.a.Q));
    }

    @Override // defpackage.zbl
    public final void a() {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.v;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((ove) next).a();
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

    @Override // defpackage.zbl
    public final void b(String str) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).b(str);
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[SYNTHETIC] */
    @Override // defpackage.zbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, long j, long j2) {
        HashSet u0;
        int i2;
        long j3;
        long j4;
        Object t7oVar;
        Throwable a;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                i2 = i;
                j3 = j;
                j4 = j2;
                try {
                    ((u9l) next).c(i2, j3, j4);
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th2);
                    a = z7o.a(t7oVar);
                    if (a == null) {
                    }
                    i = i2;
                    j = j3;
                    j2 = j4;
                }
            } catch (Throwable th3) {
                th = th3;
                i2 = i;
                j3 = j;
                j4 = j2;
            }
            a = z7o.a(t7oVar);
            if (a == null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }

    @Override // defpackage.zbl
    public final void d(String str) {
        HashSet u0;
        Object t7oVar;
        str.getClass();
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).d(str);
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

    @Override // defpackage.zbl
    public final void e() {
        HashSet u0;
        Object t7oVar;
        this.a.Q = false;
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).e();
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

    @Override // defpackage.zbl
    public final void f() {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.v;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((ove) next).f();
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[SYNTHETIC] */
    @Override // defpackage.zbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j, long j2, String str) {
        HashSet u0;
        long j3;
        long j4;
        String str2;
        Object t7oVar;
        Throwable a;
        str.getClass();
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                j3 = j;
                j4 = j2;
                str2 = str;
            } catch (Throwable th) {
                th = th;
                j3 = j;
                j4 = j2;
                str2 = str;
            }
            try {
                ((u9l) next).g(j3, j4, str2);
                t7oVar = Unit.a;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th3);
                a = z7o.a(t7oVar);
                if (a == null) {
                }
                j = j3;
                j2 = j4;
                str = str2;
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

    @Override // defpackage.zbl
    public final void h(int i) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).h(i);
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

    @Override // defpackage.zbl
    public final void i(mka mkaVar) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).i(mkaVar);
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

    @Override // defpackage.zbl
    public final void j(int i, int i2) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).f0(v3g.o(i, i2));
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

    @Override // defpackage.zbl
    public final void k(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).k(isbVar, mediaCodecReuseLog);
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

    @Override // defpackage.zbl
    public final void l() {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).l();
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

    @Override // defpackage.zbl
    public final void m(iyn iynVar) {
        HashSet u0;
        Object t7oVar;
        iynVar.getClass();
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).m(iynVar);
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

    @Override // defpackage.zbl
    public final void n(boolean z) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).n(z);
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

    @Override // defpackage.zbl
    public final void onStop(boolean z) {
        HashSet u0;
        HashSet u02;
        Object t7oVar;
        Object t7oVar2;
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).i0();
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
        yjj yjjVar2 = this.a.u;
        synchronized (yjjVar2.a) {
            u02 = CollectionsKt.u0(yjjVar2.a);
        }
        Iterator it2 = u02.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            try {
                r7o r7oVar3 = z7o.b;
                ((u9l) next2).W(z);
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

    @Override // defpackage.zbl
    public final void p(LinkedHashMap linkedHashMap) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).p(linkedHashMap);
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

    @Override // defpackage.zbl
    public final void q() {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).q();
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

    @Override // defpackage.zbl
    public final void r(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).r(isbVar, mediaCodecReuseLog);
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

    @Override // defpackage.zbl
    public final void s(VideoType videoType, StreamType streamType) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).s(videoType, streamType);
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

    @Override // defpackage.zbl
    public final void t(long j, long j2) {
        HashSet u0;
        Object t7oVar;
        this.b.c.H("BasePlayerStrategy", "onSeek", null, new Object[0]);
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).t(j, j2);
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

    @Override // defpackage.zbl
    public final void u(TrackType trackType, String str) {
        HashSet u0;
        Object t7oVar;
        trackType.getClass();
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).u(trackType, str);
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

    @Override // defpackage.zbl
    public final void x(String str, boolean z) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).x(str, z);
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

    @Override // defpackage.zbl
    public final void y(DrmType drmType) {
        HashSet u0;
        Object t7oVar;
        drmType.getClass();
        yjj yjjVar = this.a.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).y(drmType);
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

    @Override // defpackage.zbl
    public final void z(long j) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((rgl) next).z(j);
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
