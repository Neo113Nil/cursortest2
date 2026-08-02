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
public final class avj implements paw {
    public final AtomicBoolean A;
    public final l1u B;
    public final lfb C;
    public final vuj D;
    public final mar E;
    public final jyr F;
    public final jyr G;
    public volatile VideoData H;
    public volatile jsb I;
    public volatile jsb J;
    public volatile jsb K;
    public volatile boolean L;
    public volatile ccl M;
    public iyn N;
    public FullscreenDataBundle O;
    public final ConcurrentHashMap P;
    public final chs Q;
    public volatile boolean R;
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
    public final boolean k;
    public final jzi l;
    public final le3 m;
    public final g8c n;
    public final boolean o;
    public final tf6 p;
    public final gcl q;
    public final boolean r;
    public volatile long s;
    public final AtomicReference t;
    public final AtomicReference u;
    public final yjj v;
    public final yjj w;
    public final yjj x;
    public final AtomicInteger y;
    public final AtomicInteger z;

    public avj(String str, int i, c5p c5pVar, rdc rdcVar, tao taoVar, e5 e5Var, r0o r0oVar, olr olrVar, u13 u13Var, hjp hjpVar, jsg jsgVar, boolean z, jzi jziVar, le3 le3Var, d1 d1Var, g8c g8cVar, boolean z2, tf6 tf6Var, gcl gclVar, boolean z3) {
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
        this.k = z;
        this.l = jziVar;
        this.m = le3Var;
        this.n = g8cVar;
        this.o = z2;
        this.p = tf6Var;
        this.q = gclVar;
        this.r = z3;
        this.t = new AtomicReference();
        this.u = new AtomicReference(null);
        yjj yjjVar = new yjj();
        this.v = yjjVar;
        yjj yjjVar2 = new yjj();
        this.w = yjjVar2;
        yjj yjjVar3 = new yjj();
        this.x = yjjVar3;
        this.y = new AtomicInteger(0);
        this.z = new AtomicInteger(0);
        this.A = new AtomicBoolean(false);
        l1u l1uVar = new l1u(this, (Context) taoVar.a, (e18) taoVar.d, (ngl) taoVar.e, (v8h) taoVar.b, (g8c) taoVar.c);
        l1uVar.e = z;
        this.B = l1uVar;
        xq5 xq5Var = (xq5) r0oVar.c;
        lfb lfbVar = new lfb(xq5Var, l1uVar, g46Var, (h1b) r0oVar.d, r0oVar.b);
        this.C = lfbVar;
        this.D = new vuj(this, l1uVar);
        mar marVar = new mar();
        marVar.t0(this);
        this.E = marVar;
        this.F = btf.b(xuj.t);
        this.G = btf.b(xuj.s);
        this.N = fyn.a;
        this.O = new FullscreenDataBundle(null, strVar.b, strVar.a, null);
        this.P = new ConcurrentHashMap();
        this.Q = new chs();
        if (rdcVar.b.getMaximumPoolSize() > 1) {
            xq0.x("singleThreadExecutorService was specified incorrectly!");
            throw null;
        }
        strVar.g = hjpVar;
        strVar.c();
        strVar.f = e5Var.a.t();
        strVar.c();
        Integer s = e5Var.b.s();
        if (s != null) {
            strVar.b(Integer.valueOf(s.intValue()));
        }
        lfbVar.e = this;
        Iterator it = xq5Var.b.iterator();
        while (it.hasNext()) {
            I((rgl) it.next());
        }
        yjjVar3.a(new tlr(this, olrVar));
        yjjVar3.a(new npl(this, l1uVar));
        yjjVar3.a(new qwe(this, yjjVar, yjjVar2));
    }

    public static boolean Q(PlaybackStats playbackStats) {
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
        if (cclVar == null) {
            return -9223372036854775807L;
        }
        crb crbVar = (crb) cclVar;
        Long valueOf = Long.valueOf(((Number) crbVar.f.l(new uqb(crbVar, 4))).longValue());
        ccl cclVar2 = this.M;
        if (!((cclVar2 == null || (d = ((crb) cclVar2).d()) == null) ? false : Q(d))) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.paw
    public final void F(rgl rglVar) {
        rglVar.getClass();
        this.v.e(rglVar);
    }

    @Override // defpackage.paw
    public final VideoData G() {
        return this.H;
    }

    @Override // defpackage.paw
    public final void H(final String str, final PlaybackParameters playbackParameters) {
        ExternalStalled externalStalled;
        str.getClass();
        playbackParameters.getClass();
        if (this.f.f) {
            return;
        }
        final f46 a = this.f.a(new eom(str, null, playbackParameters, 2));
        chs chsVar = this.Q;
        chsVar.getClass();
        chsVar.a("YP:OpYandexPlayerImpl", "prepare", "Called by contentId " + str + " indices=" + a + " playerIndex=" + this.b, new Object[0]);
        final long currentTimeMillis = System.currentTimeMillis();
        final Long startPosition = playbackParameters.getStartPosition();
        final boolean autoPlay = playbackParameters.getAutoPlay();
        final boolean disableAudioFromStart = playbackParameters.getDisableAudioFromStart();
        playbackParameters.getStartQualityConstraint();
        this.R = playbackParameters.getAutoPlay();
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
        final PreparingParams g = s7g.g(this.H == null, autoPlay, a.b, weo.R(this.d), new ii(str, adParameters != null ? adParameters.getContentId() : null, startPosition, this, playbackParameters));
        Future future = (Future) this.t.getAndSet(a0(new Runnable() { // from class: tuj
            @Override // java.lang.Runnable
            public final void run() {
                znf znfVar = new znf(str);
                f46 f46Var = a;
                avj.this.X(znfVar, startPosition, autoPlay, g, currentTimeMillis, f46Var.a, f46Var.b, null, disableAudioFromStart, playbackParameters);
            }
        }));
        if (future != null) {
            future.cancel(true);
        }
    }

    @Override // defpackage.paw
    public final void I(rgl rglVar) {
        rglVar.getClass();
        this.v.a(rglVar);
    }

    @Override // defpackage.paw
    public final Object J() {
        return ((crb) N()).b(this);
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
        yjj yjjVar = this.x;
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
        PreparingParams copy = preparingParams.copy(new wuj(this, i));
        yjj yjjVar2 = this.w;
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
        yjj yjjVar3 = this.w;
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
        yjj yjjVar4 = this.v;
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
            vuj vujVar = this.D;
            crb crbVar = (crb) cclVar2;
            vujVar.getClass();
            crbVar.h.getClass();
            crbVar.m.e(vujVar);
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
        this.E.u0();
        this.C.a();
        rdc rdcVar = this.c;
        rdcVar.getClass();
        rdcVar.shutdown();
    }

    public final void M() {
        HashSet u0;
        Object t7oVar;
        this.s = System.currentTimeMillis();
        this.P.put("releaseTimestamp", Long.valueOf(this.s));
        yjj yjjVar = this.x;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((ove) next).E();
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
        L();
    }

    public final synchronized ccl N() {
        ccl cclVar;
        cclVar = this.M;
        if (cclVar == null) {
            Object obj = this.i.get();
            crb crbVar = (crb) ((ccl) obj);
            crbVar.a(this.D);
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

    public final void O() {
        HashSet u0;
        Object t7oVar;
        g46 g46Var = this.f;
        g46Var.getClass();
        if (g46Var.e || g46Var.f) {
            return;
        }
        yjj yjjVar = this.w;
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
        this.R = false;
        ccl cclVar = this.M;
        if (cclVar != null) {
            crb crbVar = (crb) cclVar;
            crbVar.h.getClass();
            crbVar.f.l(new uqb(crbVar, 15));
        }
    }

    public final void P() {
        HashSet u0;
        Object t7oVar;
        g46 g46Var = this.f;
        g46Var.getClass();
        if (g46Var.e || g46Var.f) {
            U(new PlaybackException.ErrorNoPrepare(), null, qgb.q);
            return;
        }
        yjj yjjVar = this.w;
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
        this.R = true;
        ccl cclVar = this.M;
        if (cclVar != null) {
            ((crb) cclVar).j();
        }
    }

    public final void R(FullscreenDataBundle fullscreenDataBundle) {
        HashSet u0;
        Object t7oVar;
        l1u l1uVar = this.B;
        fullscreenDataBundle.getIsFullscreenExternal();
        l1uVar.getClass();
        yjj yjjVar = this.w;
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

    public final void S() {
        HashSet u0;
        Object t7oVar;
        chs chsVar = this.Q;
        chsVar.getClass();
        chsVar.a("YP:OpYandexPlayerImpl", "notifyLoadingFinished", "notifyLoadingFinished prepareStartCallCount=" + this.y.get() + " bufferingStartCallCount=" + this.z.get(), new Object[0]);
        if (this.z.get() + this.y.get() == 0) {
            yjj yjjVar = this.v;
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

    public final void T() {
        HashSet u0;
        HashSet u02;
        HashSet u03;
        Object t7oVar;
        Object t7oVar2;
        Object t7oVar3;
        chs chsVar = this.Q;
        chsVar.getClass();
        chsVar.a("YP:OpYandexPlayerImpl", "notifyLoadingStart", "notifyLoadingStart prepareStartCallCount=" + this.y.get() + " bufferingStartCallCount=" + this.z.get(), new Object[0]);
        if (this.z.get() + this.y.get() == 1) {
            yjj yjjVar = this.v;
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
            StalledReason X = this.E.X();
            yjj yjjVar2 = this.w;
            synchronized (yjjVar2.a) {
                u02 = CollectionsKt.u0(yjjVar2.a);
            }
            Iterator it2 = u02.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                try {
                    r7o r7oVar3 = z7o.b;
                    ((u9l) next2).a0(this.E.r0());
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
            yjj yjjVar3 = this.w;
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

    public final void U(PlaybackException playbackException, PreparingParams preparingParams, ltg ltgVar) {
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
        RecoverDetails RecoverDetails = RecoverDetailsKt.RecoverDetails(this.R, new afg(12, preparingParams, this));
        qld b = this.C.b(playbackException2, preparingParams, ltgVar);
        if (b instanceof sfb) {
            this.f.e = true;
            ccl cclVar = this.M;
            if (cclVar != null) {
                ((crb) cclVar).p(false);
            }
            yjj yjjVar = this.v;
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
            if (this.y.get() == 0 && this.z.get() == 1) {
                this.z.set(0);
                S();
            }
            yjj yjjVar2 = this.v;
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
                yjj yjjVar3 = this.w;
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
        yjj yjjVar4 = this.w;
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
        yjj yjjVar5 = this.w;
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

    public final void V(VideoData videoData) {
        HashSet u0;
        yjj yjjVar = this.v;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            ((rgl) it.next()).T(videoData);
        }
    }

    public final void W(VideoData videoData, Long l, boolean z, String str, int i, int i2, boolean z2, PlaybackParameters playbackParameters) {
        Long l2;
        Object obj;
        String str2;
        boolean z3;
        VideoData videoData2;
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        HashSet u03;
        Object t7oVar2;
        Object t7oVar3;
        chs chsVar = this.Q;
        chsVar.getClass();
        chsVar.a("YP:OpYandexPlayerImpl", "prepareDelegate", "Started with prepareIndex=" + i2 + " sourceIndex=" + i + " playerIndex=" + this.b, new Object[0]);
        if (this.r && this.f.c(i2)) {
            chs chsVar2 = this.Q;
            chsVar2.getClass();
            ngl.r(chsVar2, "YP:OpYandexPlayerImpl", "prepareDelegate", "It is NotActualPrepare. RETURN. prepareIndex=" + i2 + " playerIndex=" + this.b, null, new Object[0], 8);
            return;
        }
        boolean prepareWithoutInitCodecs = playbackParameters.getPrepareWithoutInitCodecs();
        boolean preferredH264 = playbackParameters.getPreferredH264();
        DrmParameters drmParameters = playbackParameters.getDrmParameters();
        DataSourceParameters manifestDataSourceParameters = playbackParameters.getManifestDataSourceParameters();
        DataSourceParameters chunkDataSourceParameters = playbackParameters.getChunkDataSourceParameters();
        boolean isOffline = playbackParameters.getIsOffline();
        if (Thread.currentThread().isInterrupted()) {
            b6e.h();
            return;
        }
        this.A.set(false);
        Long d = this.B.d(l, videoData);
        this.H = videoData;
        this.L = false;
        l1u l1uVar = this.B;
        if (l1uVar == null) {
            l1uVar = null;
        }
        String a = l1uVar != null ? l1uVar.a(videoData) : null;
        if (str == null) {
            obj = null;
            l2 = d;
            str2 = this.h.k(this.a, videoData, a, d.longValue(), z, i, isOffline);
        } else {
            l2 = d;
            obj = null;
            str2 = str;
        }
        this.m.getClass();
        str2.getClass();
        if (this.M == null) {
            this.M = N();
        }
        this.j.accept(obj);
        ccl cclVar = this.M;
        if (cclVar != null) {
            this.I = this.B.b(cclVar, TrackType.Audio, videoData);
            this.K = this.B.b(cclVar, TrackType.Subtitles, videoData);
            this.J = this.B.b(cclVar, TrackType.Video, videoData);
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
            yjj yjjVar = this.w;
            synchronized (yjjVar.a) {
                u02 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u02.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((u9l) next).c0(str2);
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
                gom v = hag.v(this.n, drmParameters);
                crb crbVar = (crb) cclVar;
                crbVar.h.getClass();
                crbVar.L = v;
            } else {
                gom e = this.B.e(videoData);
                crb crbVar2 = (crb) cclVar;
                crbVar2.h.getClass();
                crbVar2.L = e;
            }
            videoData2 = videoData;
            z3 = z;
            crb crbVar3 = (crb) cclVar;
            crbVar3.k(new yv7(str2, l2), ox6.k(new yuj(prepareWithoutInitCodecs, z, preferredH264, manifestDataSourceParameters, chunkDataSourceParameters, playbackParameters, i, 0)));
            psb b = crbVar3.b(this);
            yjj yjjVar2 = this.v;
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
        } else {
            z3 = z;
            videoData2 = videoData;
        }
        if (Thread.currentThread().isInterrupted()) {
            b6e.h();
            return;
        }
        if (this.k) {
            if (z3) {
                P();
            } else {
                O();
            }
        }
        yjj yjjVar3 = this.x;
        synchronized (yjjVar3.a) {
            u0 = CollectionsKt.u0(yjjVar3.a);
        }
        Iterator it3 = u0.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            try {
                r7o r7oVar5 = z7o.b;
                ((ove) next3).G(videoData2, z3);
                t7oVar = Unit.a;
            } catch (Throwable th3) {
                r7o r7oVar6 = z7o.b;
                t7oVar = new t7o(th3);
            }
            Throwable a4 = z7o.a(t7oVar);
            if (a4 != null) {
                Timber.INSTANCE.e(a4, "notifyObservers", new Object[0]);
            }
        }
        R(this.O);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02c3 A[Catch: Exception -> 0x02bf, TRY_LEAVE, TryCatch #24 {Exception -> 0x02bf, blocks: (B:123:0x02b9, B:114:0x02c3), top: B:122:0x02b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(lxe lxeVar, Long l, boolean z, PreparingParams preparingParams, long j, int i, int i2, String str, boolean z2, PlaybackParameters playbackParameters) {
        Throwable th;
        Object[] objArr;
        boolean z3;
        Exception exc;
        PlaybackException playbackException;
        Throwable th2;
        CancellationException cancellationException;
        Object[] objArr2;
        HashSet u0;
        HashSet u02;
        Object t7oVar;
        Object t7oVar2;
        VideoData videoData;
        try {
            try {
                chs chsVar = this.Q;
                chsVar.getClass();
                chsVar.a("YP:OpYandexPlayerImpl", "prepareInExecutor", "Started with prepareIndex=" + i + " sourceIndex=" + i2 + " playerIndex=" + this.b, new Object[0]);
                this.f.e = false;
                rvf.I(this.P, new o2c(System.currentTimeMillis() - j));
                K(z, preparingParams);
                this.u.set(preparingParams);
                this.y.incrementAndGet();
                z3 = true;
                try {
                    T();
                } catch (InterruptedException unused) {
                    objArr2 = null;
                } catch (CancellationException e) {
                    cancellationException = e;
                    objArr = null;
                } catch (ExecutionException e2) {
                    th2 = e2;
                    objArr = null;
                } catch (PlaybackException e3) {
                    playbackException = e3;
                    objArr = null;
                } catch (Exception e4) {
                    exc = e4;
                    objArr = null;
                } catch (Throwable th3) {
                    th = th3;
                    objArr = null;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                if (z3) {
                    try {
                        this.y.decrementAndGet();
                    } catch (Exception e5) {
                        this.Q.b("prepareInExecutor", e5, new Object[0]);
                        throw th;
                    }
                }
                if (objArr == null) {
                    throw th;
                }
                S();
                throw th;
            }
        } catch (InterruptedException unused2) {
            objArr2 = null;
            z3 = false;
        } catch (CancellationException e6) {
            cancellationException = e6;
            objArr = null;
            z3 = false;
        } catch (ExecutionException e7) {
            th2 = e7;
            objArr = null;
            z3 = false;
        } catch (PlaybackException e8) {
            playbackException = e8;
            objArr = null;
            z3 = false;
        } catch (Exception e9) {
            exc = e9;
            objArr = null;
            z3 = false;
        } catch (Throwable th5) {
            th = th5;
            objArr = null;
            z3 = false;
        }
        try {
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException();
            }
            if (lxeVar instanceof znf) {
                videoData = Y(((znf) lxeVar).g);
            } else {
                if (!(lxeVar instanceof aof)) {
                    throw new x7j();
                }
                videoData = ((aof) lxeVar).g;
            }
            VideoData videoData2 = videoData;
            chs chsVar2 = this.Q;
            chsVar2.getClass();
            chsVar2.a("YP:OpYandexPlayerImpl", "prepareInExecutor", "VideoData resolved with prepareIndex=" + i + " sourceIndex=" + i2 + " playerIndex=" + this.b, new Object[0]);
            if (!this.g.a(videoData2.getManifestUrl())) {
                throw new PlaybackException.ErrorPreparing.InvalidStreamUrl(new Throwable("В качестве streamUrl использована некорректная для воспроизведения ссылка. Подробнее: https://nda.ya.ru/t/J-AG3_CM5oCTgJ"));
            }
            V(videoData2);
            W(videoData2, b0(l), z, str, i2, i, z2, playbackParameters);
            try {
                this.y.decrementAndGet();
                S();
            } catch (Exception e10) {
                this.Q.b("prepareInExecutor", e10, new Object[0]);
            }
        } catch (InterruptedException unused3) {
            objArr2 = 1;
            try {
                PlaybackException errorPlayerReleased = this.f.f ? new PlaybackException.ErrorPlayerReleased(System.currentTimeMillis() - this.s) : this.f.e ? new PlaybackException.ErrorPlayerStopped(i) : new PlaybackException.ErrorPlayerRePrepared(i);
                yjj yjjVar = this.v;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ((rgl) next).n(false);
                        t7oVar2 = Unit.a;
                    } catch (Throwable th6) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar2 = new t7o(th6);
                    }
                    Throwable a = z7o.a(t7oVar2);
                    if (a != null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                }
                yjj yjjVar2 = this.w;
                synchronized (yjjVar2.a) {
                    u02 = CollectionsKt.u0(yjjVar2.a);
                }
                Iterator it2 = u02.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    try {
                        r7o r7oVar3 = z7o.b;
                        ((u9l) next2).n0(errorPlayerReleased);
                        t7oVar = Unit.a;
                    } catch (Throwable th7) {
                        r7o r7oVar4 = z7o.b;
                        t7oVar = new t7o(th7);
                    }
                    Throwable a2 = z7o.a(t7oVar);
                    if (a2 != null) {
                        Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                    }
                }
                if (z3) {
                    try {
                        this.y.decrementAndGet();
                    } catch (Exception e11) {
                        this.Q.b("prepareInExecutor", e11, new Object[0]);
                        return;
                    }
                }
                if (objArr2 != null) {
                    S();
                }
            } catch (Throwable th8) {
                th = th8;
                objArr = objArr2;
                th = th;
                if (z3) {
                }
                if (objArr == null) {
                }
            }
        } catch (CancellationException e12) {
            cancellationException = e12;
            objArr = 1;
            U(new PlaybackException.Cancellation(cancellationException), preparingParams, sgb.q);
            if (z3) {
                try {
                    this.y.decrementAndGet();
                } catch (Exception e13) {
                    objArr = new Object[0];
                    this.Q.b("prepareInExecutor", e13, objArr);
                }
            }
            if (objArr != null) {
                S();
            }
        } catch (ExecutionException e14) {
            th2 = e14;
            objArr = 1;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            U(new PlaybackException.ErrorPreparing(th2), preparingParams, sgb.q);
            if (z3) {
                try {
                    this.y.decrementAndGet();
                } catch (Exception e15) {
                    objArr = new Object[0];
                    this.Q.b("prepareInExecutor", e15, objArr);
                }
            }
            if (objArr != null) {
                S();
            }
        } catch (PlaybackException e16) {
            playbackException = e16;
            objArr = 1;
            U(playbackException, preparingParams, sgb.q);
            if (z3) {
                try {
                    this.y.decrementAndGet();
                } catch (Exception e17) {
                    objArr = new Object[0];
                    this.Q.b("prepareInExecutor", e17, objArr);
                }
            }
            if (objArr != null) {
                S();
            }
        } catch (Exception e18) {
            exc = e18;
            objArr = 1;
            U(new PlaybackException.ErrorPreparing(exc), preparingParams, sgb.q);
            if (z3) {
                try {
                    this.y.decrementAndGet();
                } catch (Exception e19) {
                    objArr = new Object[0];
                    this.Q.b("prepareInExecutor", e19, objArr);
                }
            }
            if (objArr != null) {
                S();
            }
        } catch (Throwable th9) {
            th = th9;
            objArr = 1;
            if (z3) {
            }
            if (objArr == null) {
            }
        }
    }

    public final VideoData Y(String str) {
        if (Thread.currentThread().isInterrupted()) {
            b6e.h();
            return null;
        }
        try {
            Object obj = this.B.f(str).get();
            obj.getClass();
            return (VideoData) obj;
        } catch (Exception e) {
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException();
            }
            throw e;
        }
    }

    public final void Z(boolean z) {
        str strVar = this.e;
        if (strVar.d && !strVar.c) {
            this.Q.b("stop", "SurfaceSizeProvider setSize was invoked, but it's unlinked to TrackSelector", new Object[0]);
        }
        if (this.f.b()) {
            return;
        }
        Future future = (Future) this.t.getAndSet(null);
        if (future != null) {
            future.cancel(true);
        }
        a0(new dy1(this, z, 3));
    }

    @Override // defpackage.paw
    public final void a() {
        if (this.f.f) {
            return;
        }
        Continuation continuation = null;
        Future future = (Future) this.t.getAndSet(null);
        if (future != null) {
            future.cancel(true);
        }
        if (this.o) {
            x97.y(this.p, (fm6) this.F.getValue(), null, new rlg(this, continuation, 18), 2).R(new wuj(this, 1));
        } else {
            a0(new suj(this, 0));
        }
    }

    public final Future a0(Runnable runnable) {
        if (this.f.f) {
            return null;
        }
        return y2x.Z(this.c, runnable);
    }

    @Override // defpackage.paw
    public final void b() {
        if (this.f.b()) {
            return;
        }
        a0(new suj(this, 2));
    }

    public final Long b0(Long l) {
        HashSet u0;
        Object t7oVar;
        if (l == null || l.longValue() >= 0 || l.longValue() == -9223372036854775807L) {
            return l;
        }
        yjj yjjVar = this.w;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((u9l) next).q0(new PlaybackException.ErrorNegativeStartPosition(l.longValue()), RecoverDetailsKt.RecoverDetails(this.R, new wuj(this, 3)));
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
        if (this.f.b()) {
            U(new PlaybackException.ErrorNoPrepare(), null, qgb.q);
        } else {
            a0(new suj(this, 1));
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
        DecoderData decoderData = (DecoderData) this.l.get();
        ccl cclVar = this.M;
        if (cclVar == null || (d = ((crb) cclVar).d()) == null) {
            return null;
        }
        return d.copy(new lma(15, this, d, decoderData));
    }

    @Override // defpackage.paw
    public final void k() {
        Z(true);
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
            l1u l1uVar = this.B;
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
        FullscreenDataBundle copy = this.O.copy(new wuj(this, 2));
        this.O = copy;
        R(copy);
        yjj yjjVar = this.w;
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
        this.w.e(u9lVar);
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
            ((crb) cclVar).m(new bcl(new zf0(j, 4).s, 0));
        }
    }

    @Override // defpackage.paw
    public final void stop() {
        Z(false);
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
        this.w.a(u9lVar);
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
    public final void y(final VideoData videoData, final PlaybackParameters playbackParameters) {
        ExternalStalled externalStalled;
        playbackParameters.getClass();
        if (this.f.f) {
            return;
        }
        final f46 a = this.f.a(new eom(null, videoData, playbackParameters, 1));
        chs chsVar = this.Q;
        chsVar.getClass();
        chsVar.a("YP:OpYandexPlayerImpl", "prepare", "Called by videoData indices=" + a + " playerIndex=" + this.b + " v=" + videoData, new Object[0]);
        final long currentTimeMillis = System.currentTimeMillis();
        final Long startPosition = playbackParameters.getStartPosition();
        final boolean autoPlay = playbackParameters.getAutoPlay();
        boolean isOffline = playbackParameters.getIsOffline();
        final boolean disableAudioFromStart = playbackParameters.getDisableAudioFromStart();
        playbackParameters.getStartQualityConstraint();
        this.R = playbackParameters.getAutoPlay();
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
        l1u l1uVar = this.B;
        if (l1uVar == null) {
            l1uVar = null;
        }
        String a2 = l1uVar != null ? l1uVar.a(videoData) : null;
        String k = this.g.a(videoData.getManifestUrl()) ? this.h.k(this.a, videoData, a2, this.B.d(startPosition, videoData).longValue(), autoPlay, a.b, isOffline) : null;
        final PreparingParams g = s7g.g(this.H == null, autoPlay, a.b, weo.R(this.d), new lt8(a2, contentId, videoData, startPosition, this, k, playbackParameters, 3));
        final String str = k;
        Future future = (Future) this.t.getAndSet(a0(new Runnable() { // from class: uuj
            @Override // java.lang.Runnable
            public final void run() {
                aof aofVar = new aof(videoData);
                f46 f46Var = a;
                avj.this.X(aofVar, startPosition, autoPlay, g, currentTimeMillis, f46Var.a, f46Var.b, str, disableAudioFromStart, playbackParameters);
            }
        }));
        if (future != null) {
            future.cancel(true);
        }
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
