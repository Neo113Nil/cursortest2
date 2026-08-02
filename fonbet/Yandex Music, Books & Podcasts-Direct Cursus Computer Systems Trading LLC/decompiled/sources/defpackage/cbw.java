package defpackage;

import android.content.Context;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.data.AdParameters;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.DecoderData;
import ru.yandex.video.m3.data.DrmParameters;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.PlayerAnalyticsData;
import ru.yandex.video.m3.data.RecoverDetails;
import ru.yandex.video.m3.data.RecoverDetailsKt;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.ExternalStalled;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class cbw implements paw {
    public final lfb A;
    public final waw B;
    public final mar C;
    public final mnn D;
    public final jyr E;
    public final Object F;
    public final b43 G;
    public volatile VideoData H;
    public volatile jsb I;
    public volatile jsb J;
    public volatile jsb K;
    public volatile boolean L;
    public volatile ccl M;
    public iyn N;
    public FullscreenDataBundle O;
    public final ConcurrentHashMap P;
    public volatile boolean Q;
    public final String a;
    public final int b;
    public final rdc c;
    public final e5 d;
    public final str e;
    public final g46 f;
    public final ujr g;
    public final olr h;
    public final u13 i;
    public final jsg j;
    public final jzi k;
    public final le3 l;
    public final g8c m;
    public final boolean n;
    public final tf6 o;
    public long p;
    public Future q;
    public final AtomicReference r;
    public final AtomicReference s;
    public final yjj t;
    public final yjj u;
    public final yjj v;
    public final AtomicInteger w;
    public final AtomicInteger x;
    public final AtomicBoolean y;
    public final l1u z;

    public cbw(String str, int i, c5p c5pVar, rdc rdcVar, tao taoVar, e5 e5Var, r0o r0oVar, olr olrVar, u13 u13Var, hjp hjpVar, jsg jsgVar, bt2 bt2Var, jzi jziVar, le3 le3Var, g8c g8cVar, boolean z, tf6 tf6Var) {
        str strVar = new str();
        g46 g46Var = new g46(c5pVar);
        ujr ujrVar = new ujr();
        taoVar.getClass();
        g8cVar.getClass();
        this.a = str;
        this.b = i;
        this.c = rdcVar;
        this.d = e5Var;
        this.e = strVar;
        this.f = g46Var;
        this.g = ujrVar;
        this.h = olrVar;
        this.i = u13Var;
        this.j = jsgVar;
        this.k = jziVar;
        this.l = le3Var;
        this.m = g8cVar;
        this.n = z;
        this.o = tf6Var;
        this.r = new AtomicReference(null);
        this.s = new AtomicReference();
        yjj yjjVar = new yjj();
        this.t = yjjVar;
        yjj yjjVar2 = new yjj();
        this.u = yjjVar2;
        yjj yjjVar3 = new yjj();
        this.v = yjjVar3;
        this.w = new AtomicInteger(0);
        this.x = new AtomicInteger(0);
        this.y = new AtomicBoolean(false);
        l1u l1uVar = new l1u(this, (Context) taoVar.a, (e18) taoVar.d, (ngl) taoVar.e, (v8h) taoVar.b, (g8c) taoVar.c);
        this.z = l1uVar;
        xq5 xq5Var = (xq5) r0oVar.c;
        lfb lfbVar = new lfb(xq5Var, l1uVar, g46Var, (h1b) r0oVar.d, r0oVar.b);
        this.A = lfbVar;
        this.B = new waw(this, l1uVar);
        mar marVar = new mar();
        marVar.t0(this);
        this.C = marVar;
        this.D = bt2Var.c("YandexPlayerImpl", new anf(50));
        this.E = btf.b(b8w.w);
        this.F = new Object();
        this.G = new b43(rre.f, 13);
        this.N = fyn.a;
        this.O = new FullscreenDataBundle(null, strVar.b, strVar.a, null);
        this.P = new ConcurrentHashMap();
        strVar.g = hjpVar;
        strVar.c();
        strVar.f = e5Var.a.t();
        strVar.c();
        Integer s = e5Var.b.s();
        if (s != null) {
            strVar.b(Integer.valueOf(s.intValue()));
        }
        yjjVar3.a(new tlr(this, olrVar));
        yjjVar3.a(new npl(this, l1uVar));
        yjjVar3.a(new qwe(this, yjjVar, yjjVar2));
        lfbVar.e = this;
        Iterator it = xq5Var.b.iterator();
        while (it.hasNext()) {
            I((rgl) it.next());
        }
    }

    public static boolean N(PlaybackStats playbackStats) {
        return (playbackStats.getVideoType() == VideoType.EVENT || playbackStats.getVideoType() == VideoType.LIVE) && playbackStats.getIsPlaying() && playbackStats.getLiveEdgePosition() - playbackStats.getPlaybackPosition() < 10000;
    }

    @Override // defpackage.paw
    public final PlaybackViewState A() {
        ccl cclVar = this.M;
        if (cclVar == null) {
            return new PlaybackViewState(false, null, null);
        }
        iwe iweVar = ((crb) cclVar).Q;
        View view = (View) iweVar.b;
        return new PlaybackViewState(view != null ? view.isAttachedToWindow() : false, (Integer) iweVar.c, null);
    }

    @Override // defpackage.paw
    public final VideoType B() {
        ccl cclVar = this.M;
        if (cclVar != null) {
            return ((crb) cclVar).i();
        }
        return null;
    }

    @Override // defpackage.paw
    public final nqs C() {
        jsb jsbVar = this.K;
        if (jsbVar == null || !this.L) {
            return null;
        }
        return jsbVar;
    }

    @Override // defpackage.paw
    public final String D() {
        return this.a;
    }

    @Override // defpackage.paw
    public final long E() {
        PlaybackStats d;
        ccl cclVar = this.M;
        if (cclVar == null || (d = ((crb) cclVar).d()) == null) {
            return -9223372036854775807L;
        }
        Long valueOf = N(d) ? Long.valueOf(d.getLiveOffset()) : null;
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.paw
    public final void F(rgl rglVar) {
        rglVar.getClass();
        this.t.e(rglVar);
    }

    @Override // defpackage.paw
    public final VideoData G() {
        return this.H;
    }

    @Override // defpackage.paw
    public final void H(String str, PlaybackParameters playbackParameters) {
        ExternalStalled externalStalled;
        str.getClass();
        playbackParameters.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Long startPosition = playbackParameters.getStartPosition();
        boolean autoPlay = playbackParameters.getAutoPlay();
        boolean disableAudioFromStart = playbackParameters.getDisableAudioFromStart();
        playbackParameters.getStartQualityConstraint();
        this.Q = playbackParameters.getAutoPlay();
        this.P.clear();
        Map<String, Object> additionalParameters = playbackParameters.getAdditionalParameters();
        if (additionalParameters != null) {
            this.P.putAll(additionalParameters);
        }
        PlayerAnalyticsData playerAnalyticsData = playbackParameters.getPlayerAnalyticsData();
        if (playerAnalyticsData != null && (externalStalled = playerAnalyticsData.getExternalStalled()) != null) {
            rvf.I(this.P, externalStalled);
        }
        AdParameters adParameters = playbackParameters.getAdParameters();
        String contentId = adParameters != null ? adParameters.getContentId() : null;
        f46 a = this.f.a(new eom(str, null, playbackParameters, 2));
        this.q = this.c.b.submit(new bhp(28, new zaw(this, str, startPosition, autoPlay, s7g.g(this.H == null, autoPlay, a.b, weo.R(this.d), new qas(str, contentId, startPosition, this, playbackParameters, 3)), playbackParameters, a, currentTimeMillis, disableAudioFromStart)));
    }

    @Override // defpackage.paw
    public final void I(rgl rglVar) {
        rglVar.getClass();
        this.t.a(rglVar);
    }

    @Override // defpackage.paw
    public final Object J() {
        return ((crb) M()).b(this);
    }

    public final void K(boolean z, PreparingParams preparingParams) {
        HashSet u0;
        int i;
        HashSet u02;
        HashSet u03;
        HashSet u04;
        Object t7oVar;
        Object t7oVar2;
        Object t7oVar3;
        Object t7oVar4;
        yjj yjjVar = this.v;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((ove) next).F(preparingParams, uah.o(this.P));
                t7oVar4 = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar4 = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar4);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
        PreparingParams copy = preparingParams.copy(new xaw(this, i));
        yjj yjjVar2 = this.u;
        synchronized (yjjVar2.a) {
            u02 = CollectionsKt.u0(yjjVar2.a);
        }
        Iterator it2 = u02.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            try {
                r7o r7oVar3 = z7o.b;
                ((u9l) next2).j(copy);
                t7oVar3 = Unit.a;
            } catch (Throwable th2) {
                r7o r7oVar4 = z7o.b;
                t7oVar3 = new t7o(th2);
            }
            Throwable a2 = z7o.a(t7oVar3);
            if (a2 != null) {
                Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
            }
        }
        yjj yjjVar3 = this.u;
        synchronized (yjjVar3.a) {
            u03 = CollectionsKt.u0(yjjVar3.a);
        }
        Iterator it3 = u03.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            try {
                r7o r7oVar5 = z7o.b;
                ((u9l) next3).S(this.d.b.s());
                t7oVar2 = Unit.a;
            } catch (Throwable th3) {
                r7o r7oVar6 = z7o.b;
                t7oVar2 = new t7o(th3);
            }
            Throwable a3 = z7o.a(t7oVar2);
            if (a3 != null) {
                Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
            }
        }
        yjj yjjVar4 = this.t;
        synchronized (yjjVar4.a) {
            u04 = CollectionsKt.u0(yjjVar4.a);
        }
        Iterator it4 = u04.iterator();
        while (it4.hasNext()) {
            Object next4 = it4.next();
            try {
                r7o r7oVar7 = z7o.b;
                ((rgl) next4).n(z);
                t7oVar = Unit.a;
            } catch (Throwable th4) {
                r7o r7oVar8 = z7o.b;
                t7oVar = new t7o(th4);
            }
            Throwable a4 = z7o.a(t7oVar);
            if (a4 != null) {
                Timber.INSTANCE.e(a4, "notifyObservers", new Object[0]);
            }
        }
    }

    public final void L() {
        try {
            r7o r7oVar = z7o.b;
            ccl cclVar = this.M;
            if (cclVar != null) {
                ux7 ux7Var = ((crb) cclVar).l;
                if (ux7Var == null) {
                    ux7Var = new fs7(22);
                }
                ux7Var.e(this);
            }
        } catch (Throwable unused) {
            r7o r7oVar2 = z7o.b;
        }
        ccl cclVar2 = this.M;
        if (cclVar2 != null) {
            waw wawVar = this.B;
            crb crbVar = (crb) cclVar2;
            wawVar.getClass();
            crbVar.h.getClass();
            crbVar.m.e(wawVar);
        }
        try {
            ccl cclVar3 = this.M;
            if (cclVar3 != null) {
                ((crb) cclVar3).l();
            }
        } catch (Throwable unused2) {
            r7o r7oVar3 = z7o.b;
        }
        this.M = null;
        this.I = null;
        this.J = null;
        this.K = null;
        fyn fynVar = fyn.a;
        this.N = fynVar;
        ccl cclVar4 = this.M;
        if (cclVar4 != null) {
            ((crb) cclVar4).o(fynVar);
        }
        this.C.u0();
        this.A.a();
        rdc rdcVar = this.c;
        rdcVar.getClass();
        rdcVar.shutdown();
    }

    public final synchronized ccl M() {
        ccl cclVar;
        cclVar = this.M;
        if (cclVar == null) {
            Object obj = this.i.get();
            crb crbVar = (crb) ((ccl) obj);
            crbVar.a(this.B);
            ux7 ux7Var = crbVar.l;
            if (ux7Var == null) {
                ux7Var = new fs7(22);
            }
            ux7Var.a(this);
            String str = this.a;
            str.getClass();
            crbVar.A = str;
            crbVar.o(this.N);
            this.M = crbVar;
            cclVar = (ccl) obj;
        }
        return cclVar;
    }

    public final void O(FullscreenDataBundle fullscreenDataBundle) {
        HashSet u0;
        Object t7oVar;
        l1u l1uVar = this.z;
        fullscreenDataBundle.getIsFullscreenExternal();
        l1uVar.getClass();
        yjj yjjVar = this.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).j0(fullscreenDataBundle);
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

    public final void P() {
        HashSet u0;
        Object t7oVar;
        Timber.INSTANCE.d("notifyLoadingFinished prepareStartCallCount=" + this.w.get() + " bufferingStartCallCount=" + this.x.get(), new Object[0]);
        if (this.x.get() + this.w.get() == 0) {
            yjj yjjVar = this.t;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((rgl) next).g0();
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

    public final void Q() {
        HashSet u0;
        HashSet u02;
        HashSet u03;
        Object t7oVar;
        Object t7oVar2;
        Object t7oVar3;
        Timber.INSTANCE.d("notifyLoadingStart prepareStartCallCount=" + this.w.get() + " bufferingStartCallCount=" + this.x.get(), new Object[0]);
        if (this.x.get() + this.w.get() == 1) {
            yjj yjjVar = this.t;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((rgl) next).U();
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
            StalledReason X = this.C.X();
            yjj yjjVar2 = this.u;
            synchronized (yjjVar2.a) {
                u02 = CollectionsKt.u0(yjjVar2.a);
            }
            Iterator it2 = u02.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                try {
                    r7o r7oVar3 = z7o.b;
                    ((u9l) next2).a0(this.C.r0());
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
            yjj yjjVar3 = this.u;
            synchronized (yjjVar3.a) {
                u03 = CollectionsKt.u0(yjjVar3.a);
            }
            Iterator it3 = u03.iterator();
            while (it3.hasNext()) {
                Object next3 = it3.next();
                try {
                    r7o r7oVar5 = z7o.b;
                    ((u9l) next3).d0(X);
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

    public final void R(PlaybackException playbackException, PreparingParams preparingParams, ltg ltgVar) {
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        HashSet u03;
        Object t7oVar2;
        Object t7oVar3;
        HashSet u04;
        HashSet u05;
        Object t7oVar4;
        Object t7oVar5;
        PlaybackException playbackException2 = playbackException != null ? playbackException : null;
        if (playbackException2 == null) {
            playbackException2 = new PlaybackException.ErrorGeneric(playbackException);
        }
        RecoverDetails RecoverDetails = RecoverDetailsKt.RecoverDetails(this.Q, new qqv(3, preparingParams, this));
        qld b = this.A.b(playbackException2, preparingParams, ltgVar);
        if (b instanceof sfb) {
            stop();
            yjj yjjVar = this.t;
            synchronized (yjjVar.a) {
                u04 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u04.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((rgl) next).P(playbackException2);
                    t7oVar5 = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar5 = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar5);
                if (a != null) {
                    Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                }
            }
            if (this.w.get() == 0 && this.x.get() == 1) {
                this.x.set(0);
                P();
            }
            yjj yjjVar2 = this.t;
            synchronized (yjjVar2.a) {
                u05 = CollectionsKt.u0(yjjVar2.a);
            }
            Iterator it2 = u05.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                try {
                    r7o r7oVar3 = z7o.b;
                    ((rgl) next2).n(false);
                    t7oVar4 = Unit.a;
                } catch (Throwable th2) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar4 = new t7o(th2);
                }
                Throwable a2 = z7o.a(t7oVar4);
                if (a2 != null) {
                    Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                }
            }
            return;
        }
        if (!(b instanceof ofb ? true : b instanceof qfb ? true : b instanceof pfb)) {
            if (b instanceof rfb) {
                yjj yjjVar3 = this.u;
                synchronized (yjjVar3.a) {
                    u0 = CollectionsKt.u0(yjjVar3.a);
                }
                Iterator it3 = u0.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    try {
                        r7o r7oVar5 = z7o.b;
                        ((u9l) next3).l0(playbackException2, ((rfb) b).p);
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
            return;
        }
        yjj yjjVar4 = this.u;
        synchronized (yjjVar4.a) {
            u02 = CollectionsKt.u0(yjjVar4.a);
        }
        Iterator it4 = u02.iterator();
        while (it4.hasNext()) {
            Object next4 = it4.next();
            try {
                r7o r7oVar7 = z7o.b;
                ((u9l) next4).q0(playbackException2, RecoverDetails);
                t7oVar3 = Unit.a;
            } catch (Throwable th4) {
                r7o r7oVar8 = z7o.b;
                t7oVar3 = new t7o(th4);
            }
            Throwable a4 = z7o.a(t7oVar3);
            if (a4 != null) {
                Timber.INSTANCE.e(a4, "notifyObservers", new Object[0]);
            }
        }
        yjj yjjVar5 = this.u;
        synchronized (yjjVar5.a) {
            u03 = CollectionsKt.u0(yjjVar5.a);
        }
        Iterator it5 = u03.iterator();
        while (it5.hasNext()) {
            Object next5 = it5.next();
            try {
                r7o r7oVar9 = z7o.b;
                ((u9l) next5).n0(playbackException2);
                t7oVar2 = Unit.a;
            } catch (Throwable th5) {
                r7o r7oVar10 = z7o.b;
                t7oVar2 = new t7o(th5);
            }
            Throwable a5 = z7o.a(t7oVar2);
            if (a5 != null) {
                Timber.INSTANCE.e(a5, "notifyObservers", new Object[0]);
            }
        }
    }

    public final void S(VideoData videoData) {
        HashSet u0;
        yjj yjjVar = this.t;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            ((rgl) it.next()).T(videoData);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(VideoData videoData, Long l, boolean z, String str, int i, boolean z2, boolean z3, boolean z4, DrmParameters drmParameters, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2, boolean z5, PlaybackParameters playbackParameters) {
        HashSet u0;
        Object t7oVar;
        Throwable a;
        HashSet u02;
        HashSet u03;
        Object t7oVar2;
        Object t7oVar3;
        playbackParameters.getClass();
        synchronized (this.F) {
            try {
                this.y.set(false);
                Long d = this.z.d(l, videoData);
                this.H = videoData;
                this.L = false;
                l1u l1uVar = this.z;
                if (l1uVar == null) {
                    l1uVar = null;
                }
                String k = str == null ? this.h.k(this.a, videoData, l1uVar != null ? l1uVar.a(videoData) : null, d.longValue(), z, i, z5) : str;
                this.l.getClass();
                k.getClass();
                if (this.M == null) {
                    this.M = M();
                }
                this.j.accept(null);
                ccl cclVar = this.M;
                if (cclVar != null) {
                    this.I = this.z.b(cclVar, TrackType.Audio, videoData);
                    this.K = this.z.b(cclVar, TrackType.Subtitles, videoData);
                    this.J = this.z.b(cclVar, TrackType.Video, videoData);
                    jsb jsbVar = this.I;
                    if (jsbVar != null) {
                        if (z2) {
                            jsbVar.d(new TrackVariant.Disable("", false, false));
                        } else {
                            jsbVar.d(new TrackVariant.PreferredTrackVariant(videoData.getAudioLanguage()));
                        }
                    }
                    jsb jsbVar2 = this.K;
                    if (jsbVar2 != null) {
                        jsbVar2.d(new TrackVariant.PreferredTrackVariant(videoData.getSubtitleLanguage()));
                    }
                    yjj yjjVar = this.u;
                    synchronized (yjjVar.a) {
                        u02 = CollectionsKt.u0(yjjVar.a);
                    }
                    Iterator it = u02.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        try {
                            r7o r7oVar = z7o.b;
                            ((u9l) next).c0(k);
                            t7oVar3 = Unit.a;
                        } catch (Throwable th) {
                            r7o r7oVar2 = z7o.b;
                            t7oVar3 = new t7o(th);
                        }
                        Throwable a2 = z7o.a(t7oVar3);
                        if (a2 != null) {
                            Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                        }
                    }
                    if (drmParameters != null) {
                        gom v = hag.v(this.m, drmParameters);
                        crb crbVar = (crb) cclVar;
                        crbVar.h.getClass();
                        crbVar.L = v;
                    } else {
                        gom e = this.z.e(videoData);
                        crb crbVar2 = (crb) cclVar;
                        crbVar2.h.getClass();
                        crbVar2.L = e;
                    }
                    crb crbVar3 = (crb) cclVar;
                    crbVar3.k(new yv7(k, d), ox6.k(new yuj(z3, z, z4, dataSourceParameters, dataSourceParameters2, playbackParameters, i, 1)));
                    psb b = crbVar3.b(this);
                    yjj yjjVar2 = this.t;
                    synchronized (yjjVar2.a) {
                        u03 = CollectionsKt.u0(yjjVar2.a);
                    }
                    Iterator it2 = u03.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        try {
                            r7o r7oVar3 = z7o.b;
                            ((rgl) next2).R(b);
                            t7oVar2 = Unit.a;
                        } catch (Throwable th2) {
                            r7o r7oVar4 = z7o.b;
                            t7oVar2 = new t7o(th2);
                        }
                        Throwable a3 = z7o.a(t7oVar2);
                        if (a3 != null) {
                            Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
                        }
                    }
                }
                yjj yjjVar3 = this.v;
                synchronized (yjjVar3.a) {
                    u0 = CollectionsKt.u0(yjjVar3.a);
                }
                Iterator it3 = u0.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    try {
                        r7o r7oVar5 = z7o.b;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        ((ove) next3).G(videoData, z);
                        t7oVar = Unit.a;
                    } catch (Throwable th4) {
                        th = th4;
                        r7o r7oVar6 = z7o.b;
                        t7oVar = new t7o(th);
                        a = z7o.a(t7oVar);
                        if (a == null) {
                        }
                    }
                    a = z7o.a(t7oVar);
                    if (a == null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                }
                O(this.O);
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0495 A[Catch: all -> 0x04c2, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x04c2, blocks: (B:113:0x03fd, B:117:0x0495, B:193:0x0402), top: B:112:0x03fd }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x049e A[Catch: all -> 0x034c, Exception -> 0x0351, TRY_ENTER, TRY_LEAVE, TryCatch #33 {Exception -> 0x0351, all -> 0x034c, blocks: (B:32:0x0342, B:33:0x0344, B:119:0x049e), top: B:5:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0408 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0402 A[Catch: all -> 0x04c2, TRY_LEAVE, TryCatch #12 {all -> 0x04c2, blocks: (B:113:0x03fd, B:117:0x0495, B:193:0x0402), top: B:112:0x03fd }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x023b  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r2v27, types: [g46] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(lxe lxeVar, Long l, boolean z, PreparingParams preparingParams, PlaybackParameters playbackParameters, int i, int i2, long j, String str, boolean z2, boolean z3, boolean z4, DrmParameters drmParameters) {
        PlaybackException playbackException;
        HashSet u0;
        HashSet u02;
        Object J;
        Object J2;
        Throwable cancellation;
        VideoData V;
        ?? r15;
        Throwable cancellation2;
        long j2;
        mnn mnnVar;
        PlaybackException playbackException2;
        boolean z5;
        HashSet u03;
        HashSet u04;
        Object J3;
        Object J4;
        AtomicInteger atomicInteger;
        Throwable cancellation3;
        VideoData V2;
        Throwable cancellation4;
        PreparingParams preparingParams2 = preparingParams;
        mnn mnnVar2 = this.D;
        boolean z6 = true;
        boolean z7 = false;
        try {
            if (!mnnVar2.e()) {
                try {
                } catch (PlaybackException e) {
                    playbackException = e;
                    z7 = true;
                } catch (Throwable th) {
                    th = th;
                }
                if (this.f.d()) {
                    throw new PlaybackException.ErrorPlayerReleased(System.currentTimeMillis() - this.p);
                }
                if (this.f.c(i)) {
                    throw new PlaybackException.ErrorPlayerRePrepared(i);
                }
                try {
                    this.f.e = false;
                    rvf.I(this.P, new o2c(System.currentTimeMillis() - j));
                    K(z, preparingParams2);
                    this.r.set(preparingParams2);
                    this.w.incrementAndGet();
                    Q();
                    if (lxeVar instanceof znf) {
                        try {
                            W(i);
                            try {
                                V = V(((znf) lxeVar).g);
                            } catch (Throwable th2) {
                                th = th2;
                                if (this.f.d()) {
                                    throw new PlaybackException.ErrorPlayerReleased(System.currentTimeMillis() - this.p);
                                }
                                if (this.f.c(i)) {
                                    throw new PlaybackException.ErrorPlayerRePrepared(i);
                                }
                                if (this.f.e) {
                                    throw new PlaybackException.ErrorPlayerStopped(i);
                                }
                                if (th instanceof PlaybackException) {
                                    throw th;
                                }
                                if (th instanceof CancellationException) {
                                    cancellation = new PlaybackException.Cancellation(th);
                                } else if (th instanceof ExecutionException) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        th = cause;
                                    }
                                    cancellation = new PlaybackException.ErrorPreparing(th);
                                } else {
                                    cancellation = new PlaybackException.ErrorPreparing(th);
                                }
                                throw cancellation;
                            }
                        } catch (PlaybackException e2) {
                            playbackException = e2;
                            if (!(playbackException instanceof PlaybackException.ErrorPlayerRePrepared)) {
                                z6 = playbackException instanceof PlaybackException.ErrorPlayerStopped;
                            }
                            if (z6) {
                                yjj yjjVar = this.t;
                                synchronized (yjjVar.d()) {
                                    u0 = CollectionsKt.u0(yjjVar.d());
                                }
                                Iterator it = u0.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    try {
                                        r7o r7oVar = z7o.b;
                                        ((rgl) next).n(false);
                                        J2 = Unit.a;
                                    } catch (Throwable th3) {
                                        r7o r7oVar2 = z7o.b;
                                        J2 = qgg.J(th3);
                                    }
                                    Throwable a = z7o.a(J2);
                                    if (a != null) {
                                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                                    }
                                }
                                yjj yjjVar2 = this.u;
                                synchronized (yjjVar2.d()) {
                                    u02 = CollectionsKt.u0(yjjVar2.d());
                                }
                                Iterator it2 = u02.iterator();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    try {
                                        r7o r7oVar3 = z7o.b;
                                        ((u9l) next2).n0(playbackException);
                                        J = Unit.a;
                                    } catch (Throwable th4) {
                                        r7o r7oVar4 = z7o.b;
                                        J = qgg.J(th4);
                                    }
                                    Throwable a2 = z7o.a(J);
                                    if (a2 != null) {
                                        Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                                    }
                                }
                            } else {
                                R(playbackException, preparingParams, sgb.q);
                            }
                            if (z7) {
                                return;
                            }
                            this.w.decrementAndGet();
                            P();
                            return;
                        }
                    } else {
                        if (!(lxeVar instanceof aof)) {
                            throw new x7j();
                        }
                        V = ((aof) lxeVar).g;
                    }
                    W(i);
                    try {
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                            r15 = preparingParams2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r15 = i;
                    }
                } catch (PlaybackException e3) {
                    playbackException = e3;
                    z7 = false;
                } catch (Throwable th7) {
                    th = th7;
                    z6 = false;
                    if (!z6) {
                    }
                    throw th;
                }
                if (!this.g.a(V.getManifestUrl())) {
                    throw new PlaybackException.ErrorPreparing.InvalidStreamUrl(new Throwable("В качестве streamUrl использована некорректная для воспроизведения ссылка. Подробнее: https://nda.ya.ru/t/J-AG3_CM5oCTgJ"));
                }
                S(V);
                try {
                    T(V, X(l), z, str, i2, z2, z3, z4, drmParameters, preparingParams2.getManifestDataSourceParameters(), preparingParams2.getChunkDataSourceParameters(), preparingParams2.getIsOffline(), playbackParameters);
                    this.w.decrementAndGet();
                    P();
                    return;
                } catch (Throwable th8) {
                    th = th8;
                    r15 = i;
                    if (this.f.d()) {
                        throw new PlaybackException.ErrorPlayerReleased(System.currentTimeMillis() - this.p);
                    }
                    if (this.f.c(r15)) {
                        throw new PlaybackException.ErrorPlayerRePrepared(r15);
                    }
                    if (this.f.e) {
                        throw new PlaybackException.ErrorPlayerStopped(r15);
                    }
                    if (th instanceof PlaybackException) {
                        throw th;
                    }
                    if (th instanceof CancellationException) {
                        cancellation2 = new PlaybackException.Cancellation(th);
                    } else if (th instanceof ExecutionException) {
                        Throwable cause2 = th.getCause();
                        if (cause2 != null) {
                            th = cause2;
                        }
                        cancellation2 = new PlaybackException.ErrorPreparing(th);
                    } else {
                        cancellation2 = new PlaybackException.ErrorPreparing(th);
                    }
                    throw cancellation2;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long nanoTime = System.nanoTime();
            String str2 = null;
            try {
                try {
                } catch (PlaybackException e4) {
                    e = e4;
                    mnnVar = mnnVar2;
                } catch (Throwable th9) {
                    th = th9;
                    mnnVar = mnnVar2;
                }
                try {
                } catch (PlaybackException e5) {
                    e = e5;
                    playbackException2 = e;
                    z5 = true;
                    try {
                        if (!(playbackException2 instanceof PlaybackException.ErrorPlayerRePrepared)) {
                        }
                        if (z6) {
                        }
                        if (!z5) {
                        }
                        long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
                        mnnVar.d(null, currentTimeMillis, Math.max(System.currentTimeMillis(), currentTimeMillis + nanoTime2), nanoTime2);
                    } catch (Throwable th10) {
                        th = th10;
                        j2 = currentTimeMillis;
                        z6 = z5;
                        if (!z6) {
                            try {
                                try {
                                    this.w.decrementAndGet();
                                    P();
                                } catch (Exception e6) {
                                    e = e6;
                                    str2 = e.getClass().getName() + ": " + e.getMessage();
                                    throw e;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                long nanoTime3 = (System.nanoTime() - nanoTime) / 1000000;
                                mnn mnnVar3 = mnnVar;
                                mnnVar3.d(str2, j2, Math.max(System.currentTimeMillis(), j2 + nanoTime3), nanoTime3);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    j2 = currentTimeMillis;
                    if (!z6) {
                    }
                    throw th;
                }
                if (this.f.d()) {
                    throw new PlaybackException.ErrorPlayerReleased(System.currentTimeMillis() - this.p);
                }
                if (this.f.c(i)) {
                    throw new PlaybackException.ErrorPlayerRePrepared(i);
                }
                try {
                    try {
                        this.f.e = false;
                        rvf.I(this.P, new o2c(System.currentTimeMillis() - j));
                        K(z, preparingParams2);
                        this.r.set(preparingParams2);
                        this.w.incrementAndGet();
                        Q();
                    } catch (PlaybackException e7) {
                        e = e7;
                        mnnVar = mnnVar2;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    mnnVar = mnnVar2;
                }
                try {
                    if (lxeVar instanceof znf) {
                        try {
                            W(i);
                            try {
                                V2 = V(((znf) lxeVar).g);
                            } catch (Throwable th14) {
                                th = th14;
                                if (this.f.d()) {
                                    throw new PlaybackException.ErrorPlayerReleased(System.currentTimeMillis() - this.p);
                                }
                                if (this.f.c(i)) {
                                    throw new PlaybackException.ErrorPlayerRePrepared(i);
                                }
                                if (this.f.e) {
                                    throw new PlaybackException.ErrorPlayerStopped(i);
                                }
                                if (th instanceof PlaybackException) {
                                    throw th;
                                }
                                if (th instanceof CancellationException) {
                                    cancellation3 = new PlaybackException.Cancellation(th);
                                } else if (th instanceof ExecutionException) {
                                    Throwable cause3 = th.getCause();
                                    if (cause3 != null) {
                                        th = cause3;
                                    }
                                    cancellation3 = new PlaybackException.ErrorPreparing(th);
                                } else {
                                    cancellation3 = new PlaybackException.ErrorPreparing(th);
                                }
                                throw cancellation3;
                            }
                        } catch (PlaybackException e8) {
                            playbackException2 = e8;
                            mnnVar = mnnVar2;
                            z5 = false;
                            if (!(playbackException2 instanceof PlaybackException.ErrorPlayerRePrepared)) {
                                z6 = playbackException2 instanceof PlaybackException.ErrorPlayerStopped;
                            }
                            if (z6) {
                                try {
                                    yjj yjjVar3 = this.t;
                                    synchronized (yjjVar3.d()) {
                                        u03 = CollectionsKt.u0(yjjVar3.d());
                                    }
                                    Iterator it3 = u03.iterator();
                                    while (it3.hasNext()) {
                                        Object next3 = it3.next();
                                        try {
                                            r7o r7oVar5 = z7o.b;
                                            ((rgl) next3).n(false);
                                            J4 = Unit.a;
                                        } catch (Throwable th15) {
                                            r7o r7oVar6 = z7o.b;
                                            J4 = qgg.J(th15);
                                        }
                                        Throwable a3 = z7o.a(J4);
                                        if (a3 != null) {
                                            Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
                                        }
                                    }
                                    yjj yjjVar4 = this.u;
                                    synchronized (yjjVar4.d()) {
                                        u04 = CollectionsKt.u0(yjjVar4.d());
                                    }
                                    Iterator it4 = u04.iterator();
                                    while (it4.hasNext()) {
                                        Object next4 = it4.next();
                                        try {
                                            r7o r7oVar7 = z7o.b;
                                            ((u9l) next4).n0(playbackException2);
                                            J3 = Unit.a;
                                        } catch (Throwable th16) {
                                            r7o r7oVar8 = z7o.b;
                                            J3 = qgg.J(th16);
                                        }
                                        Throwable a4 = z7o.a(J3);
                                        if (a4 != null) {
                                            Timber.INSTANCE.e(a4, "notifyObservers", new Object[0]);
                                        }
                                    }
                                } catch (Throwable th17) {
                                    th = th17;
                                    z6 = z5;
                                    j2 = currentTimeMillis;
                                    if (!z6) {
                                    }
                                    throw th;
                                }
                            } else {
                                R(playbackException2, preparingParams, sgb.q);
                            }
                            if (!z5) {
                                atomicInteger = this.w;
                                atomicInteger.decrementAndGet();
                                P();
                            }
                            long nanoTime22 = (System.nanoTime() - nanoTime) / 1000000;
                            mnnVar.d(null, currentTimeMillis, Math.max(System.currentTimeMillis(), currentTimeMillis + nanoTime22), nanoTime22);
                        }
                    } else {
                        if (!(lxeVar instanceof aof)) {
                            throw new x7j();
                        }
                        V2 = ((aof) lxeVar).g;
                    }
                    W(i);
                    try {
                        try {
                        } catch (Throwable th18) {
                            th = th18;
                            if (this.f.d()) {
                                throw new PlaybackException.ErrorPlayerReleased(System.currentTimeMillis() - this.p);
                            }
                            if (this.f.c(i)) {
                                throw new PlaybackException.ErrorPlayerRePrepared(i);
                            }
                            if (this.f.e) {
                                throw new PlaybackException.ErrorPlayerStopped(i);
                            }
                            if (th instanceof PlaybackException) {
                                throw th;
                            }
                            if (th instanceof CancellationException) {
                                cancellation4 = new PlaybackException.Cancellation(th);
                            } else if (th instanceof ExecutionException) {
                                Throwable cause4 = th.getCause();
                                if (cause4 != null) {
                                    th = cause4;
                                }
                                cancellation4 = new PlaybackException.ErrorPreparing(th);
                            } else {
                                cancellation4 = new PlaybackException.ErrorPreparing(th);
                            }
                            throw cancellation4;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                    }
                } catch (PlaybackException e9) {
                    e = e9;
                    playbackException2 = e;
                    z5 = false;
                    if (!(playbackException2 instanceof PlaybackException.ErrorPlayerRePrepared)) {
                    }
                    if (z6) {
                    }
                    if (!z5) {
                    }
                    long nanoTime222 = (System.nanoTime() - nanoTime) / 1000000;
                    mnnVar.d(null, currentTimeMillis, Math.max(System.currentTimeMillis(), currentTimeMillis + nanoTime222), nanoTime222);
                } catch (Throwable th20) {
                    th = th20;
                    j2 = currentTimeMillis;
                    z6 = false;
                    if (!z6) {
                    }
                    throw th;
                }
                if (!this.g.a(V2.getManifestUrl())) {
                    throw new PlaybackException.ErrorPreparing.InvalidStreamUrl(new Throwable("В качестве streamUrl использована некорректная для воспроизведения ссылка. Подробнее: https://nda.ya.ru/t/J-AG3_CM5oCTgJ"));
                }
                S(V2);
                mnnVar = mnnVar2;
                T(V2, X(l), z, str, i2, z2, z3, z4, drmParameters, preparingParams2.getManifestDataSourceParameters(), preparingParams2.getChunkDataSourceParameters(), preparingParams2.getIsOffline(), playbackParameters);
                atomicInteger = this.w;
                atomicInteger.decrementAndGet();
                P();
                long nanoTime2222 = (System.nanoTime() - nanoTime) / 1000000;
                mnnVar.d(null, currentTimeMillis, Math.max(System.currentTimeMillis(), currentTimeMillis + nanoTime2222), nanoTime2222);
            } catch (Exception e10) {
                e = e10;
                j2 = currentTimeMillis;
            } catch (Throwable th21) {
                th = th21;
                j2 = currentTimeMillis;
                long nanoTime32 = (System.nanoTime() - nanoTime) / 1000000;
                mnn mnnVar32 = mnnVar;
                mnnVar32.d(str2, j2, Math.max(System.currentTimeMillis(), j2 + nanoTime32), nanoTime32);
                throw th;
            }
        } catch (Throwable th22) {
            th = th22;
            z6 = z7;
            if (!z6) {
                this.w.decrementAndGet();
                P();
            }
            throw th;
        }
    }

    public final VideoData V(String str) {
        Future f = this.z.f(str);
        Future future = (Future) this.s.getAndSet(f);
        if (future != null) {
            future.cancel(true);
        }
        Object obj = f.get();
        obj.getClass();
        return (VideoData) obj;
    }

    public final void W(int i) {
        if (this.f.f) {
            throw new PlaybackException.ErrorPlayerReleased(System.currentTimeMillis() - this.p);
        }
        if (this.f.c(i)) {
            throw new PlaybackException.ErrorPlayerRePrepared(i);
        }
        if (this.f.e) {
            throw new PlaybackException.ErrorPlayerStopped(i);
        }
    }

    public final Long X(Long l) {
        HashSet u0;
        Object t7oVar;
        if (l == null || l.longValue() >= 0 || l.longValue() == -9223372036854775807L) {
            return l;
        }
        yjj yjjVar = this.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).q0(new PlaybackException.ErrorNegativeStartPosition(l.longValue()), RecoverDetailsKt.RecoverDetails(this.Q, new xaw(this, 3)));
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
        return -9223372036854775807L;
    }

    @Override // defpackage.paw
    public final void a() {
        Continuation continuation = null;
        if (this.n) {
            x97.y(this.o, this.G, null, new wzv(this, continuation, 6), 2).R(new xaw(this, 1));
            return;
        }
        Future future = this.q;
        if (future != null) {
            future.cancel(false);
        }
        this.q = null;
        this.c.submit(new bhp(27, this));
    }

    @Override // defpackage.paw
    public final void b() {
        HashSet u0;
        Object t7oVar;
        this.D.f(System.currentTimeMillis(), b8w.x);
        yjj yjjVar = this.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).V();
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
        this.Q = false;
        ccl cclVar = this.M;
        if (cclVar != null) {
            crb crbVar = (crb) cclVar;
            crbVar.h.getClass();
            crbVar.f.l(new uqb(crbVar, 15));
        }
    }

    @Override // defpackage.paw
    public final boolean c() {
        ccl cclVar = this.M;
        if (cclVar == null) {
            return false;
        }
        crb crbVar = (crb) cclVar;
        return ((Boolean) crbVar.f.l(new uqb(crbVar, 12))).booleanValue();
    }

    @Override // defpackage.paw
    public final void d() {
        HashSet u0;
        Object t7oVar;
        this.D.f(System.currentTimeMillis(), b8w.y);
        yjj yjjVar = this.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).Z();
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
        this.Q = true;
        ccl cclVar = this.M;
        if (cclVar != null) {
            ((crb) cclVar).j();
        }
    }

    @Override // defpackage.paw
    public final boolean e() {
        ccl cclVar = this.M;
        if (cclVar == null) {
            return false;
        }
        crb crbVar = (crb) cclVar;
        return ((Boolean) crbVar.f.l(new uqb(crbVar, 13))).booleanValue();
    }

    @Override // defpackage.paw
    public final nqs f() {
        jsb jsbVar = this.I;
        if (jsbVar == null || !this.L) {
            return null;
        }
        return jsbVar;
    }

    @Override // defpackage.paw
    public final iyn g() {
        ccl cclVar = this.M;
        if (cclVar == null) {
            return this.N;
        }
        Object obj = ((crb) cclVar).n.d.get();
        obj.getClass();
        return (iyn) obj;
    }

    @Override // defpackage.paw
    public final long getPosition() {
        bcl e;
        ccl cclVar = this.M;
        if (cclVar == null || (e = ((crb) cclVar).e()) == null) {
            return -1L;
        }
        return e.a;
    }

    @Override // defpackage.paw
    public final float getVolume() {
        ccl cclVar = this.M;
        if (cclVar == null) {
            return 1.0f;
        }
        crb crbVar = (crb) cclVar;
        return ((Number) crbVar.f.l(new uqb(crbVar, 11))).floatValue();
    }

    @Override // defpackage.paw
    public final float h() {
        ccl cclVar = this.M;
        if (cclVar == null) {
            return 0.0f;
        }
        crb crbVar = (crb) cclVar;
        return ((Number) crbVar.f.l(new uqb(crbVar, 5))).floatValue();
    }

    @Override // defpackage.paw
    public final boolean i() {
        ccl cclVar = this.M;
        if (cclVar == null) {
            return false;
        }
        crb crbVar = (crb) cclVar;
        return ((Boolean) crbVar.f.l(new uqb(crbVar, 14))).booleanValue();
    }

    @Override // defpackage.paw
    public final PlaybackStats j() {
        PlaybackStats d;
        DecoderData decoderData = (DecoderData) this.k.get();
        ccl cclVar = this.M;
        if (cclVar == null || (d = ((crb) cclVar).d()) == null) {
            return null;
        }
        return d.copy(new yaw(0, this, d, decoderData));
    }

    @Override // defpackage.paw
    public final void k() {
        ccl cclVar = this.M;
        if (cclVar != null) {
            ((crb) cclVar).p(true);
        }
        this.Q = false;
        this.f.e = true;
    }

    @Override // defpackage.paw
    public final int l() {
        return this.b;
    }

    @Override // defpackage.paw
    public final StreamType m() {
        ccl cclVar = this.M;
        if (cclVar == null) {
            return null;
        }
        crb crbVar = (crb) cclVar;
        return (StreamType) crbVar.f.l(new uqb(crbVar, 9));
    }

    @Override // defpackage.paw
    public final String n() {
        VideoData videoData = this.H;
        if (videoData != null) {
            l1u l1uVar = this.z;
            if (l1uVar == null) {
                l1uVar = null;
            }
            if (l1uVar != null) {
                return l1uVar.a(videoData);
            }
        }
        return null;
    }

    @Override // defpackage.paw
    public final long o() {
        ccl cclVar = this.M;
        if ((cclVar != null ? ((crb) cclVar).i() : null) == VideoType.LIVE) {
            return Long.MIN_VALUE;
        }
        ccl cclVar2 = this.M;
        if (cclVar2 == null) {
            return -1L;
        }
        Long valueOf = Long.valueOf(((crb) cclVar2).c());
        Long l = valueOf.longValue() != -9223372036854775807L ? valueOf : null;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // defpackage.paw
    public final void p(int i, int i2) {
        HashSet u0;
        Object t7oVar;
        str strVar = this.e;
        strVar.d = true;
        strVar.a = i;
        strVar.b = i2;
        strVar.c();
        FullscreenDataBundle copy = this.O.copy(new xaw(this, 2));
        this.O = copy;
        O(copy);
        yjj yjjVar = this.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).o0(v3g.o(i, i2));
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

    @Override // defpackage.paw
    public final void q(u9l u9lVar) {
        u9lVar.getClass();
        this.u.e(u9lVar);
    }

    @Override // defpackage.paw
    public final void r(iyn iynVar) {
        this.N = iynVar;
        ccl cclVar = this.M;
        if (cclVar != null) {
            ((crb) cclVar).o(iynVar);
        }
    }

    @Override // defpackage.paw
    public final void s(long j) {
        ccl cclVar = this.M;
        if (cclVar != null) {
            ((crb) cclVar).m(new bcl(new zf0(j, 6).s, 0));
        }
    }

    @Override // defpackage.paw
    public final void stop() {
        HashSet u0;
        Object t7oVar;
        this.D.f(System.currentTimeMillis(), b8w.z);
        str strVar = this.e;
        if (strVar.d && !strVar.c) {
            Timber.INSTANCE.w("SurfaceSizeProvider setSize was invoked, but it's unlinked to TrackSelector", new Object[0]);
        }
        yjj yjjVar = this.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).p0();
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
        this.Q = false;
        ccl cclVar = this.M;
        if (cclVar != null) {
            ((crb) cclVar).p(false);
        }
        this.f.e = true;
    }

    @Override // defpackage.paw
    public final void t(float f) {
        ccl cclVar = this.M;
        if (cclVar != null) {
            crb crbVar = (crb) cclVar;
            crbVar.f.l(new brb(crbVar, f, 1));
        }
    }

    @Override // defpackage.paw
    public final void u(float f) {
        ccl cclVar = this.M;
        if (cclVar != null) {
            ((crb) cclVar).n(true, f);
        }
    }

    @Override // defpackage.paw
    public final long v() {
        ccl cclVar = this.M;
        if (cclVar != null) {
            return ((crb) cclVar).h();
        }
        return -1L;
    }

    @Override // defpackage.paw
    public final void w(u9l u9lVar) {
        u9lVar.getClass();
        this.u.a(u9lVar);
    }

    @Override // defpackage.paw
    public final nqs x() {
        jsb jsbVar = this.J;
        if (jsbVar == null || !this.L) {
            return null;
        }
        return jsbVar;
    }

    @Override // defpackage.paw
    public final void y(VideoData videoData, PlaybackParameters playbackParameters) {
        f46 f46Var;
        boolean z;
        String str;
        ExternalStalled externalStalled;
        playbackParameters.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Long startPosition = playbackParameters.getStartPosition();
        boolean autoPlay = playbackParameters.getAutoPlay();
        boolean disableAudioFromStart = playbackParameters.getDisableAudioFromStart();
        playbackParameters.getStartQualityConstraint();
        this.Q = playbackParameters.getAutoPlay();
        this.P.clear();
        Map<String, Object> additionalParameters = playbackParameters.getAdditionalParameters();
        if (additionalParameters != null) {
            this.P.putAll(additionalParameters);
        }
        PlayerAnalyticsData playerAnalyticsData = playbackParameters.getPlayerAnalyticsData();
        if (playerAnalyticsData != null && (externalStalled = playerAnalyticsData.getExternalStalled()) != null) {
            rvf.I(this.P, externalStalled);
        }
        AdParameters adParameters = playbackParameters.getAdParameters();
        String contentId = adParameters != null ? adParameters.getContentId() : null;
        f46 a = this.f.a(new eom(null, videoData, playbackParameters, 1));
        l1u l1uVar = this.z;
        if (l1uVar == null) {
            l1uVar = null;
        }
        String a2 = l1uVar != null ? l1uVar.a(videoData) : null;
        if (this.g.a(videoData.getManifestUrl())) {
            String str2 = a2;
            f46Var = a;
            a2 = str2;
            z = autoPlay;
            str = this.h.k(this.a, videoData, str2, this.z.d(startPosition, videoData).longValue(), autoPlay, a.b, playbackParameters.getIsOffline());
        } else {
            f46Var = a;
            z = autoPlay;
            str = null;
        }
        String str3 = a2;
        String str4 = str;
        this.q = this.c.b.submit(new bhp(29, new abw(this, videoData, startPosition, z, s7g.g(this.H == null, z, f46Var.b, weo.R(this.d), new lt8(str3, contentId, videoData, startPosition, this, str4, playbackParameters, 5)), playbackParameters, f46Var, currentTimeMillis, str4, disableAudioFromStart)));
    }

    @Override // defpackage.paw
    public final long z() {
        ccl cclVar = this.M;
        if (cclVar == null) {
            return -1L;
        }
        Long valueOf = Long.valueOf(((crb) cclVar).c());
        if (valueOf.longValue() == -9223372036854775807L) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return -1L;
    }
}
