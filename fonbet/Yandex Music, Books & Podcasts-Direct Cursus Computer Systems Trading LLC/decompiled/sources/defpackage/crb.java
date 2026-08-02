package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.DelegatePrepareParams;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.RepeatMode$Fixed;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.network.NetworkType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class crb implements ccl, aw6, tue {
    public String A;
    public final au1 B;
    public final vqb C;
    public final knm D;
    public boolean E;
    public yde F;
    public final ybr G;
    public final z0j H;
    public final ive I;
    public final s3t J;
    public final tis K;
    public gom L;
    public final ris M;
    public final h4b N;
    public final c38 O;
    public final nnd P;
    public final iwe Q;
    public mmr R;
    public final ExoPlayer a;
    public final cwh b;
    public final ct7 c;
    public final mkv d;
    public final cbh e;
    public final le3 f;
    public final cl2 g;
    public final gsa h;
    public final fau i;
    public final nue j;
    public final Looper k;
    public final axh l;
    public final yjj m;
    public final tsb n;
    public final wa6 o;
    public final hqb p;
    public final boolean q;
    public final ozk r;
    public final yjj s;
    public final veg t;
    public final qk2 u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final jmr y;
    public final wa6 z;

    public crb(ExoPlayer exoPlayer, cwh cwhVar, ct7 ct7Var, mkv mkvVar, cbh cbhVar, le3 le3Var, cl2 cl2Var, gsa gsaVar, fau fauVar, nue nueVar, Looper looper, axh axhVar, lnm lnmVar, wa6 wa6Var, mnn mnnVar, ozk ozkVar, yjj yjjVar, veg vegVar, qk2 qk2Var, boolean z, boolean z2, boolean z3, jmr jmrVar, wa6 wa6Var2) {
        yjj yjjVar2 = new yjj();
        tsb tsbVar = new tsb(exoPlayer, le3Var, yjjVar2);
        hqb hqbVar = new hqb(yjjVar2);
        exoPlayer.getClass();
        ct7Var.getClass();
        Handler handler = (Handler) le3Var.b;
        fauVar.getClass();
        nueVar.getClass();
        this.a = exoPlayer;
        this.b = cwhVar;
        this.c = ct7Var;
        this.d = mkvVar;
        this.e = cbhVar;
        this.f = le3Var;
        this.g = cl2Var;
        this.h = gsaVar;
        this.i = fauVar;
        this.j = nueVar;
        this.k = looper;
        this.l = axhVar;
        this.m = yjjVar2;
        this.n = tsbVar;
        this.o = wa6Var;
        this.p = hqbVar;
        this.q = true;
        this.r = ozkVar;
        this.s = yjjVar;
        this.t = vegVar;
        this.u = qk2Var;
        this.v = z;
        this.w = z2;
        this.x = z3;
        this.y = jmrVar;
        this.z = wa6Var2;
        this.A = "";
        au1 au1Var = new au1(exoPlayer);
        this.B = au1Var;
        vqb vqbVar = new vqb(this);
        this.C = vqbVar;
        knm knmVar = lnmVar != null ? new knm(exoPlayer, lnmVar) : null;
        this.D = knmVar;
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        qsnVar.getClass();
        this.F = qsnVar;
        ybr ybrVar = new ybr(yjjVar2, looper);
        this.G = ybrVar;
        z0j z0jVar = new z0j(mnnVar);
        this.H = z0jVar;
        this.I = new ive(gsaVar, yjjVar2, au1Var);
        this.J = new s3t(gsaVar, ct7Var, yjjVar2);
        this.K = new tis(exoPlayer, this, yjjVar2, ct7Var, au1Var, z0jVar);
        Looper X = exoPlayer.X();
        X.getClass();
        X.getClass();
        new Handler(X);
        this.M = new ris();
        h4b h4bVar = new h4b(yjjVar2);
        this.N = h4bVar;
        this.O = new c38();
        this.P = new nnd(yjjVar2);
        this.Q = new iwe(14, false);
        le3Var.l(new sqb(this));
        a(vqbVar);
        if (knmVar != null) {
            a(knmVar);
        }
        cl2Var.e(handler, h4bVar);
        if (qk2Var != null) {
            qk2Var.a.a(qk2Var);
            cl2Var.e(handler, qk2Var);
        }
        cl2Var.b = ybrVar;
    }

    public final void a(zbl zblVar) {
        zblVar.getClass();
        this.h.getClass();
        this.m.a(zblVar);
    }

    public final psb b(paw pawVar) {
        psb psbVar;
        synchronized (this) {
            psbVar = new psb(pawVar, this.a, this.Q, this.i);
        }
        return psbVar;
    }

    public final long c() {
        return ((Number) this.f.l(new uqb(this, 2))).longValue();
    }

    public final PlaybackStats d() {
        return (PlaybackStats) this.f.l(new uqb(this, 6));
    }

    public final bcl e() {
        return (bcl) this.f.l(new uqb(this, 7));
    }

    public final wj7 f(TrackType trackType) {
        int i = wqb.a[trackType.ordinal()];
        if (i == 1) {
            return g(2);
        }
        if (i == 2) {
            return g(1);
        }
        if (i == 3) {
            return g(3);
        }
        if (i == 4) {
            return g(0);
        }
        b6e.s();
        return null;
    }

    public final wj7 g(int i) {
        return new wj7(this.c, i, new yqb(this, i, 1), new xqb(this, 3), new uqb(this, 8), this.w);
    }

    public final long h() {
        return ((Number) this.f.l(new qs6(29, this.K.h, this))).longValue();
    }

    public final VideoType i() {
        return (VideoType) this.f.l(new uqb(this, 10));
    }

    public final void j() {
        Object t7oVar;
        try {
            this.f.l(new zqb(this));
        } catch (PlaybackException e) {
            yjj yjjVar = this.m;
            synchronized (yjjVar.a) {
                Iterator it = CollectionsKt.u0(yjjVar.a).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ((zbl) next).Y(e);
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
    }

    public final void k(yv7 yv7Var, DelegatePrepareParams delegatePrepareParams) {
        HashSet u0;
        HashSet u02;
        Object t7oVar;
        int i;
        Object t7oVar2;
        String str = yv7Var.a;
        Long l = yv7Var.b;
        DataSourceParameters manifestDataSourceParameters = delegatePrepareParams.getManifestDataSourceParameters();
        DataSourceParameters chunkDataSourceParameters = delegatePrepareParams.getChunkDataSourceParameters();
        int i2 = 0;
        if (delegatePrepareParams.getPreferredH264()) {
            this.E = true;
            yde ydeVar = this.c.d().m;
            ydeVar.getClass();
            this.F = ydeVar;
            ct7 ct7Var = this.c;
            us7 a = ct7Var.a();
            a.m = yde.w(new String[]{"video/avc"});
            ct7Var.k(new a(a));
        } else if (this.E) {
            this.E = false;
            ct7 ct7Var2 = this.c;
            us7 a2 = ct7Var2.a();
            String[] strArr = (String[]) this.F.toArray(new String[0]);
            a2.m = yde.w((String[]) Arrays.copyOf(strArr, strArr.length));
            ct7Var2.k(new a(a2));
        }
        yjj yjjVar = this.s;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                mzk mzkVar = (mzk) this.r.get();
                ((rq5) next).getClass();
                mzkVar.getClass();
                t7oVar2 = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar2 = new t7o(th);
            }
            Throwable a3 = z7o.a(t7oVar2);
            if (a3 != null) {
                Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
            }
        }
        qk2 qk2Var = this.u;
        if (qk2Var != null) {
            yjj yjjVar2 = this.m;
            yjjVar2.getClass();
            synchronized (yjjVar2.a) {
                u02 = CollectionsKt.u0(yjjVar2.a);
            }
            Iterator it2 = u02.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                try {
                    r7o r7oVar3 = z7o.b;
                    zbl zblVar = (zbl) next2;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    NetworkType[] values = NetworkType.values();
                    int length = values.length;
                    for (int i3 = i2; i3 < length; i3++) {
                        String networkTypeName = values[i3].getNetworkTypeName();
                        sk2 sk2Var = qk2Var.b;
                        sk2Var.getClass();
                        networkTypeName.getClass();
                        long j = sk2Var.a.getLong(networkTypeName, -1L);
                        Long valueOf = j == -1 ? null : Long.valueOf(j);
                        if (valueOf != null) {
                            linkedHashMap.put(networkTypeName, valueOf);
                        }
                    }
                    zblVar.p(linkedHashMap);
                    t7oVar = Unit.a;
                    r7o r7oVar4 = z7o.b;
                } catch (Throwable th2) {
                    r7o r7oVar5 = z7o.b;
                    t7oVar = new t7o(th2);
                }
                Throwable a4 = z7o.a(t7oVar);
                if (a4 != null) {
                    i = 0;
                    Timber.INSTANCE.e(a4, "notifyObservers", new Object[0]);
                } else {
                    i = 0;
                }
                i2 = i;
            }
        }
        this.f.l(new ec8(delegatePrepareParams, this, str, l, manifestDataSourceParameters, chunkDataSourceParameters, 2));
    }

    public final void l() {
        this.h.getClass();
        vqb vqbVar = this.C;
        Future future = vqbVar.a;
        if (future != null) {
            future.cancel(false);
        }
        vqbVar.a = null;
        vqbVar.b = 0L;
        this.i.a();
        this.m.b();
        cl2 cl2Var = this.g;
        cl2Var.f(this.N);
        qk2 qk2Var = this.u;
        if (qk2Var != null) {
            cl2Var.a.f(qk2Var);
            l2j l2jVar = qk2Var.a;
            l2jVar.getClass();
            l2jVar.a.e(qk2Var);
        }
        knm knmVar = this.D;
        if (knmVar != null) {
            knmVar.v();
            knmVar.d = false;
        }
        cbh cbhVar = this.e;
        if (cbhVar.a) {
            cbhVar.shutdownNow();
        }
        this.f.l(new uqb(this, 16));
    }

    public final void m(bcl bclVar) {
        Object t7oVar;
        bclVar.getClass();
        this.h.getClass();
        try {
            if (bclVar.b != -1) {
                this.f.l(new arb(bclVar, this));
            }
        } catch (dbe e) {
            this.h.getClass();
            PlaybackException.ErrorSeekPosition errorSeekPosition = new PlaybackException.ErrorSeekPosition(e);
            yjj yjjVar = this.m;
            synchronized (yjjVar.a) {
                Iterator it = CollectionsKt.u0(yjjVar.a).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ((zbl) next).Y(errorSeekPosition);
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
    }

    public final void n(boolean z, float f) {
        HashSet u0;
        Object t7oVar;
        this.f.l(new brb(this, f, 0));
        yjj yjjVar = this.m;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).T(z, f);
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

    public final void o(iyn iynVar) {
        HashSet u0;
        Object t7oVar;
        iynVar.getClass();
        tsb tsbVar = this.n;
        tsbVar.getClass();
        xqn xqnVar = new xqn();
        xqnVar.a = iynVar;
        int i = 0;
        if (iynVar instanceof RepeatMode$Fixed) {
            RepeatMode$Fixed repeatMode$Fixed = (RepeatMode$Fixed) iynVar;
            xqnVar.a = RepeatMode$Fixed.copy$default(repeatMode$Fixed, 0, 0, repeatMode$Fixed.getCount() == 0, 1, null);
        }
        if (Intrinsics.d(tsbVar.d.get(), xqnVar.a)) {
            return;
        }
        tsbVar.d.set(xqnVar.a);
        tsbVar.b.l(new ssb(i, tsbVar, xqnVar));
        yjj yjjVar = tsbVar.c;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).m((iyn) xqnVar.a);
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

    public final void p(boolean z) {
        HashSet u0;
        Object t7oVar;
        this.h.getClass();
        yjj yjjVar = this.m;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).onStop(z);
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
        this.f.l(new si2(this, z, 2));
        this.h.getClass();
    }
}
