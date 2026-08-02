package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ui.ListYandexPlayerView;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class acg implements rue {
    public sea A;
    public boolean B;
    public boolean C;
    public final qdc a;
    public final String b;
    public final int c;
    public final xiu d;
    public final xiu e;
    public final ime f;
    public final s1 g;
    public final String h;
    public final Handler i;
    public paw j;
    public final wbg k;
    public final tbg l;
    public omr m;
    public ListYandexPlayerView n;
    public final yjj o;
    public imh p;
    public kyk q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final yjj u;
    public mmo v;
    public xbg w;
    public final ArrayList x;
    public Long y;
    public final i9g z;

    public acg(qdc qdcVar, String str, int i, xiu xiuVar, xiu xiuVar2, ime imeVar, s1 s1Var, n9g n9gVar) {
        s1Var.getClass();
        this.a = qdcVar;
        this.b = str;
        this.c = i;
        this.d = xiuVar;
        this.e = xiuVar2;
        this.f = imeVar;
        this.g = s1Var;
        String o = hrg.o("ListYandexPlayerImpl[", i, ']');
        this.h = o;
        Handler q = dvt.q(null);
        this.i = q;
        this.k = new wbg(this, q, qdcVar, o);
        this.l = new tbg(this, q, qdcVar, o);
        this.o = new yjj();
        yjj yjjVar = new yjj();
        this.u = yjjVar;
        yjjVar.a(n9gVar);
        this.x = new ArrayList();
        this.z = new i9g(qdcVar, o);
    }

    public final void a(r9g r9gVar) {
        r9gVar.getClass();
        this.a.H(this.h, "addObserver", r9gVar, new Object[0]);
        this.o.a(r9gVar);
        mmo mmoVar = this.v;
        if (mmoVar != null) {
            ((yjj) mmoVar.g).a(r9gVar);
        }
    }

    public final VideoData b(imh imhVar) {
        VideoData videoData;
        String P = y7g.P(imhVar);
        String str = imhVar.d;
        if (P != null) {
            if (str == null) {
                str = "unknown";
            }
            return p1g.u(P, str, new ybg(0, imhVar));
        }
        if (str == null || (videoData = (VideoData) this.d.p(str)) == null) {
            return null;
        }
        this.r = true;
        return videoData;
    }

    public final paw c() {
        Long l;
        HashSet u0;
        Object t7oVar;
        qdc qdcVar = this.a;
        String str = this.h;
        StringBuilder sb = new StringBuilder("item = ");
        imh imhVar = this.p;
        sb.append(imhVar != null ? imhVar.d : null);
        sb.append(" isWithEngine = ");
        sb.append(f());
        qdcVar.H(str, "detachEngine", sb.toString(), new Object[0]);
        paw pawVar = this.j;
        if (pawVar != null && pawVar.e()) {
            ngl.r(this.a, this.h, "detachEngine", "detachEngine while engine isPlaying", null, new Object[0], 8);
        }
        if (this.s) {
            ngl.r(this.a, this.h, "detachEngine", "detachEngine, but player willPlayWhenReady", null, new Object[0], 8);
        }
        paw pawVar2 = this.j;
        if (pawVar2 != null) {
            pawVar2.b();
        }
        if (this.t) {
            paw pawVar3 = this.j;
            l = pawVar3 != null ? Long.valueOf(pawVar3.getPosition()) : this.y;
        } else {
            l = this.y;
        }
        this.t = false;
        final PlaybackParameters e = a4g.e(false, new zbg(l, 0));
        paw pawVar4 = this.j;
        boolean d = Intrinsics.d(pawVar4 != null ? pawVar4.g() : null, eyn.a);
        mmo mmoVar = this.v;
        if (mmoVar != null) {
            ((yjj) mmoVar.g).b();
            ((paw) mmoVar.b).F((vxs) mmoVar.d);
        }
        this.v = null;
        this.w = new xbg() { // from class: obg
            @Override // defpackage.xbg
            public final void a(paw pawVar5) {
                String str2;
                VideoData b;
                acg acgVar = acg.this;
                String str3 = acgVar.h;
                qdc qdcVar2 = acgVar.a;
                imh imhVar2 = acgVar.p;
                PlaybackParameters playbackParameters = e;
                if (imhVar2 != null && (b = acgVar.b(imhVar2)) != null) {
                    qdcVar2.H(str3, "detachEngine", "Postponed prepare", new Object[0]);
                    pawVar5.y(b, playbackParameters);
                    return;
                }
                imh imhVar3 = acgVar.p;
                if (imhVar3 == null || (str2 = imhVar3.d) == null) {
                    return;
                }
                qdcVar2.H(str3, "detachEngine", "Postponed prepare contentId", new Object[0]);
                pawVar5.H(str2, playbackParameters);
            }
        };
        paw pawVar5 = this.j;
        omr omrVar = this.m;
        if (omrVar != null) {
            omrVar.d(null);
        }
        paw pawVar6 = this.j;
        if (pawVar6 != null) {
            pawVar6.F(this.k);
        }
        paw pawVar7 = this.j;
        if (pawVar7 != null) {
            pawVar7.q(this.l);
        }
        this.j = null;
        yjj yjjVar = this.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((p9g) next).d();
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
        iyn iynVar = d ? eyn.a : fyn.a;
        paw pawVar8 = this.j;
        if (pawVar8 != null) {
            pawVar8.r(iynVar);
        } else {
            this.x.add(new rbg(this, iynVar, d));
        }
        return pawVar5;
    }

    public final imh d() {
        y7g.Y(false, this.a);
        return this.p;
    }

    public final boolean e() {
        VideoData G;
        VideoData G2;
        imh imhVar = this.p;
        String P = imhVar != null ? y7g.P(imhVar) : null;
        paw pawVar = this.j;
        if (P == null) {
            if ((pawVar != null ? pawVar.n() : null) == null) {
                return false;
            }
            paw pawVar2 = this.j;
            String n = pawVar2 != null ? pawVar2.n() : null;
            imh imhVar2 = this.p;
            return Intrinsics.d(n, imhVar2 != null ? imhVar2.d : null);
        }
        if (((pawVar == null || (G2 = pawVar.G()) == null) ? null : G2.getManifestUrl()) == null) {
            return false;
        }
        paw pawVar3 = this.j;
        if (pawVar3 != null && (G = pawVar3.G()) != null) {
            r1 = G.getManifestUrl();
        }
        return Intrinsics.d(r1, P);
    }

    public final boolean f() {
        return this.j != null;
    }

    public final void g() {
        HashSet u0;
        Unit unit;
        Object t7oVar;
        int i = 0;
        y7g.Y(false, this.a);
        boolean z = this.s;
        this.s = false;
        this.a.H(this.h, "pause", "isWithEngine = " + f(), new Object[0]);
        yjj yjjVar = this.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((p9g) next).b(this, z);
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
        paw pawVar = this.j;
        if (pawVar != null) {
            pawVar.b();
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.x.add(new sbg(this, i));
            k();
        }
    }

    public final void h(r9g r9gVar) {
        r9gVar.getClass();
        this.a.H(this.h, "removeObserver", r9gVar, new Object[0]);
        this.o.e(r9gVar);
        mmo mmoVar = this.v;
        if (mmoVar != null) {
            ((yjj) mmoVar.g).e(r9gVar);
        }
    }

    public final void i(boolean z) {
        HashSet u0;
        Object t7oVar;
        y7g.Y(false, this.a);
        this.a.H(this.h, "setMuted", "setMuted " + z + " isWithEngine = " + f(), new Object[0]);
        i9g i9gVar = this.z;
        boolean z2 = i9gVar.c;
        i9gVar.c = z;
        boolean z3 = z2 != z;
        paw pawVar = this.j;
        if (pawVar != null) {
            i9gVar.a(pawVar);
        }
        if (z3) {
            yjj yjjVar = this.o;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((r9g) next).Q();
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

    public final void j() {
        HashSet u0;
        Object t7oVar;
        this.a.H(this.h, "startInternalLoading", "isInternalLoadingProceed=" + this.B + " isInnerPlayerLoadingProceed=" + this.C, new Object[0]);
        if (!this.B && !this.C) {
            this.a.H(this.h, "startInternalLoading", "notifyObservers", new Object[0]);
            yjj yjjVar = this.o;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((r9g) next).getClass();
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
        this.B = true;
    }

    public final void k() {
        HashSet u0;
        Object t7oVar;
        this.a.H(this.h, "stopInternalLoading", "isInternalLoadingProceed=" + this.B + " isInnerPlayerLoadingProceed=" + this.C, new Object[0]);
        if (this.B && !this.C) {
            this.a.H(this.h, "stopInternalLoading", "notifyObservers", new Object[0]);
            yjj yjjVar = this.o;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((r9g) next).getClass();
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
        this.B = false;
    }
}
