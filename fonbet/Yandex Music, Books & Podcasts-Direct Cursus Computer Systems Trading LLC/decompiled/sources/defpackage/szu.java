package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class szu implements n7q {
    public final e5q a;
    public final tyu b;
    public final nyn c;
    public final long d;
    public final xys e;
    public final noh f;
    public final boolean g;
    public final t0q h;
    public final h4q i;
    public final b3l j;
    public final boolean k;
    public final jzs l;
    public final eu7 m;
    public final boolean n;
    public final HashSet o;

    public szu(e5q e5qVar, tyu tyuVar, nyn nynVar, long j, xys xysVar, noh nohVar, boolean z, t0q t0qVar, h4q h4qVar, b3l b3lVar, boolean z2) {
        a0q a0qVar;
        xysVar.getClass();
        nohVar.getClass();
        this.a = e5qVar;
        this.b = tyuVar;
        this.c = nynVar;
        this.d = j;
        this.e = xysVar;
        this.f = nohVar;
        this.g = z;
        this.h = t0qVar;
        this.i = h4qVar;
        this.j = b3lVar;
        this.k = z2;
        eu7 eu7Var = tyuVar.a;
        this.l = (jzs) eu7Var.b();
        this.m = eu7Var;
        this.n = true;
        List j2 = j();
        HashSet hashSet = new HashSet();
        Iterator it = j2.iterator();
        while (it.hasNext()) {
            izs izsVar = ((jzs) it.next()).g;
            if (izsVar instanceof e6v) {
                a0qVar = ((e6v) izsVar).getEntity().getId();
            } else {
                if (!Intrinsics.d(izsVar, hzs.a)) {
                    b6e.s();
                    throw null;
                }
                a0qVar = null;
            }
            if (a0qVar != null) {
                hashSet.add(a0qVar);
            }
        }
        this.o = hashSet;
    }

    @Override // defpackage.n7q
    public final noh a() {
        return this.f;
    }

    @Override // defpackage.n7q
    public final mwk b() {
        return this.l;
    }

    @Override // defpackage.n7q
    public final b3l c() {
        return this.j;
    }

    @Override // defpackage.n7q
    public final boolean d() {
        return false;
    }

    @Override // defpackage.n7q
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szu)) {
            return false;
        }
        szu szuVar = (szu) obj;
        return this.a.equals(szuVar.a) && this.b.equals(szuVar.b) && this.c == szuVar.c && this.d == szuVar.d && Intrinsics.d(this.e, szuVar.e) && Intrinsics.d(this.f, szuVar.f) && this.g == szuVar.g && this.h.equals(szuVar.h) && this.i.equals(szuVar.i) && this.j.equals(szuVar.j) && this.k == szuVar.k;
    }

    @Override // defpackage.n7q
    public final h4q f() {
        return this.i;
    }

    @Override // defpackage.n7q
    public final u3q g() {
        return this.a;
    }

    public final int h() {
        return this.b.a.a.c(i());
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + eta.a((this.h.hashCode() + k5r.e((this.f.hashCode() + ((this.e.hashCode() + tlm.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31, 31, this.g)) * 31, this.i.a, 31)) * 31);
    }

    public final int i() {
        return this.b.a.b.a;
    }

    public final List j() {
        return this.b.a.a.a.getElements();
    }

    public final List k() {
        return this.b.a.a.a.f();
    }

    public final fyu l() {
        return (fyu) this.b.a.a.e.getValue();
    }

    public final gxc m() {
        e5q e5qVar = this.a;
        if (e5qVar instanceof u4q) {
            return ((u4q) e5qVar).b.c;
        }
        if (e5qVar instanceof s4q) {
            return ((s4q) e5qVar).b.c;
        }
        if (e5qVar instanceof w4q) {
            return ((w4q) e5qVar).b.c;
        }
        if (e5qVar instanceof d5q) {
            return ((d5q) e5qVar).b().b;
        }
        b6e.s();
        return null;
    }

    public final boolean n() {
        eu7 eu7Var = (eu7) this.b.g.getValue();
        if ((eu7Var != null ? (jzs) eu7Var.b() : null) == null) {
            int ordinal = hdg.W(this.a).ordinal();
            boolean z = this.g;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    b6e.s();
                    return false;
                }
                if (z) {
                    return false;
                }
            } else if (z || this.m.b.c) {
                return false;
            }
        }
        return true;
    }

    public final List o() {
        return this.b.a.a.b;
    }

    public final String toString() {
        return "WaveQueueState(playbackEntity=" + this.a + ", navigator=" + this.b + ", repeatMode=" + this.c + ", initialProgressOffsetMillis=" + this.d + ", initialTrackOrder=" + this.e + ", mediaOutputTarget=" + this.f + ", pendingSkip=" + this.g + ", initialFade=" + this.h + ", initialPlaybackSpeed=" + this.i + ", playableChangeReason=" + this.j + ", continuation=" + this.k + ")";
    }
}
