package defpackage;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class kv6 implements ExoPlayer {
    public final AtomicBoolean A;
    public final AtomicBoolean B;
    public final w1f a;
    public final pjc b;
    public final p6o c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final sgl g;
    public final b7q h;
    public final zss i;
    public final jyr j;
    public final jyr k;
    public final eps l;
    public boolean m;
    public final tf6 n;
    public final rjq o;
    public final um6 p;
    public final tf6 q;
    public final xdr r;
    public Long s;
    public final xdr t;
    public final xdr u;
    public boolean v;
    public v2q w;
    public zu6 x;
    public volatile Long y;
    public v2q z;

    public kv6(w1f w1fVar, pjc pjcVar, p6o p6oVar, long j, boolean z, boolean z2, sgl sglVar, b7q b7qVar, zss zssVar, cte cteVar, kzp kzpVar, a aVar) {
        pjcVar.getClass();
        sglVar.getClass();
        b7qVar.getClass();
        aVar.getClass();
        this.a = w1fVar;
        this.b = pjcVar;
        this.c = p6oVar;
        this.d = j;
        this.e = z;
        this.f = z2;
        this.g = sglVar;
        this.h = b7qVar;
        this.i = zssVar;
        this.j = btf.b(new xu6(this, 0));
        this.k = btf.b(new xu6(this, 1));
        eps epsVar = new eps();
        epsVar.a = cteVar;
        epsVar.b = kzpVar;
        epsVar.e = new ArrayList();
        epsVar.f = new ArrayList();
        epsVar.g = btf.b(new jve(epsVar, 1));
        this.l = epsVar;
        tf6 e = gld.e(aVar);
        this.n = e;
        rjq rjqVar = new rjq(false);
        this.o = rjqVar;
        this.p = hld.s(rjqVar, aVar);
        this.q = gld.e(aVar);
        this.r = ydr.a(null);
        Float valueOf = Float.valueOf(1.0f);
        xdr a = ydr.a(valueOf);
        this.t = a;
        xdr a2 = ydr.a(valueOf);
        this.u = a2;
        this.y = z2 ? null : 0L;
        this.A = new AtomicBoolean(false);
        this.B = new AtomicBoolean(false);
        b7qVar.b(hag.I(tcl.class), true);
        ssg.a(3, "CrossfadingExoPlayerImpl", "init crossfade exo player", null);
        rjqVar.b(new xu6(this, 2));
        ox6.B(a2, e, new yu6(this, 0));
        ox6.B(a, e, new yu6(this, 1));
    }

    public static final zwf i1(kv6 kv6Var, v2q v2qVar, v2q v2qVar2) {
        kv6Var.getClass();
        return ywf.r(v2qVar.b(), v2qVar2.b(), kv6Var.k1().getDuration(), kv6Var.d, kv6Var.e);
    }

    @Override // defpackage.i8l
    public final int A() {
        return k1().A();
    }

    @Override // defpackage.i8l
    public final void A0(List list) {
        list.getClass();
        k1().A0(list);
    }

    @Override // defpackage.i8l
    public final void B() {
        k1().B();
    }

    @Override // defpackage.i8l
    public final boolean B0() {
        return k1().B0();
    }

    @Override // defpackage.i8l
    public final void C() {
        k1().C();
    }

    @Override // defpackage.i8l
    public final boolean C0() {
        return k1().C0();
    }

    @Override // defpackage.i8l
    public final void D(int i, boolean z) {
        k1().D(i, z);
    }

    @Override // defpackage.i8l
    public final long D0() {
        return k1().D0();
    }

    @Override // defpackage.i8l
    public final void E() {
        k1().E();
    }

    @Override // defpackage.i8l
    public final void E0(int i) {
        k1().E0(i);
    }

    @Override // defpackage.i8l
    public final void F(int i) {
        k1().F(i);
    }

    @Override // defpackage.i8l
    public final void F0() {
        k1().F0();
    }

    @Override // defpackage.i8l
    public final void G(int i, int i2, List list) {
        list.getClass();
        k1().G(i, i2, list);
    }

    @Override // defpackage.i8l
    public final void G0() {
        k1().G0();
    }

    @Override // defpackage.i8l
    public final void H(w0t w0tVar) {
        w0tVar.getClass();
        k1().H(w0tVar);
    }

    @Override // defpackage.i8l
    public final hoh H0() {
        hoh H0 = k1().H0();
        H0.getClass();
        return H0;
    }

    @Override // defpackage.i8l
    public final void I(int i) {
        k1().I(i);
    }

    @Override // defpackage.i8l
    public final void I0(List list) {
        list.getClass();
        k1().I0(list);
    }

    @Override // defpackage.i8l
    public final void J(int i, int i2) {
        k1().J(i, i2);
    }

    @Override // defpackage.i8l
    public final long J0() {
        return k1().J0();
    }

    @Override // defpackage.i8l
    public final void K() {
        k1().B();
    }

    @Override // defpackage.i8l
    public final void K0(List list, int i) {
        list.getClass();
        k1().K0(list, i);
    }

    @Override // defpackage.i8l
    public final void L(boolean z) {
        k1().L(z);
    }

    @Override // defpackage.i8l
    public final long L0() {
        return k1().L0();
    }

    @Override // defpackage.i8l
    public final void M() {
        k1().M();
    }

    @Override // defpackage.i8l
    public final onh M0() {
        return k1().M0();
    }

    @Override // defpackage.i8l
    public final void N(int i) {
        k1().N(i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void N0(int i) {
        k1().N0(i);
    }

    @Override // defpackage.i8l
    public final e3t O() {
        e3t O = k1().O();
        O.getClass();
        return O;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void O0(boolean z) {
        k1().O0(z);
    }

    @Override // defpackage.i8l
    public final void P(dv1 dv1Var, boolean z) {
        k1().P(dv1Var, z);
    }

    @Override // defpackage.i8l
    public final boolean P0() {
        return k1().W0();
    }

    @Override // defpackage.i8l
    public final void Q(hoh hohVar) {
        k1().Q(hohVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void Q0(hap hapVar) {
        k1().Q0(hapVar);
    }

    @Override // defpackage.i8l
    public final int R() {
        return k1().R();
    }

    @Override // defpackage.i8l
    public final int R0() {
        return k1().v0();
    }

    @Override // defpackage.i8l
    public final void S(boolean z) {
        k1().S(z);
    }

    @Override // defpackage.i8l
    public final Object S0() {
        return k1().S0();
    }

    @Override // defpackage.i8l
    public final void T(onh onhVar) {
        onhVar.getClass();
        k1().T(onhVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void T0(wvh wvhVar) {
        wvhVar.getClass();
        k1().T0(wvhVar);
    }

    @Override // defpackage.i8l
    public final int U() {
        return k1().U();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void U0(wvh wvhVar) {
        k1().U0(wvhVar);
    }

    @Override // defpackage.i8l
    public final sis V() {
        sis V = k1().V();
        V.getClass();
        return V;
    }

    @Override // defpackage.i8l
    public final boolean V0(int i) {
        return k1().V0(i);
    }

    @Override // defpackage.i8l
    public final void W(int i, onh onhVar) {
        onhVar.getClass();
        k1().W(i, onhVar);
    }

    @Override // defpackage.i8l
    public final boolean W0() {
        return k1().W0();
    }

    @Override // defpackage.i8l
    public final Looper X() {
        Looper X = k1().X();
        X.getClass();
        return X;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void X0(wvh wvhVar, long j) {
        k1().X0(wvhVar, j);
    }

    @Override // defpackage.i8l
    public final void Y() {
        k1().Y();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final q0t Y0() {
        q0t Y0 = k1().Y0();
        Y0.getClass();
        return Y0;
    }

    @Override // defpackage.i8l
    public final w0t Z() {
        w0t Z = k1().Z();
        Z.getClass();
        return Z;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int Z0(int i) {
        return k1().Z0(i);
    }

    @Override // defpackage.i8l
    public final void a() {
        eps epsVar = this.l;
        epsVar.getClass();
        mal.a();
        epsVar.k(epsVar.h().a.a);
        epsVar.c = eps.e(epsVar.h());
        lve lveVar = (lve) epsVar.d;
        if (lveVar != null) {
            epsVar.k(lveVar.a.a);
            epsVar.d = null;
        }
        this.A.set(false);
        this.B.set(false);
        gld.L(this.n, null);
        gld.L(this.q, null);
    }

    @Override // defpackage.i8l
    public final void a0(int i, long j, List list) {
        list.getClass();
        k1().a0(i, j, list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void a1(ssm ssmVar) {
        k1().a1(ssmVar);
    }

    @Override // defpackage.i8l
    public final void b() {
        k1().b();
        j1(false);
    }

    @Override // defpackage.i8l
    public final void b0() {
        k1().b0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void b1(d80 d80Var) {
        d80Var.getClass();
        eps epsVar = this.l;
        epsVar.getClass();
        ((ArrayList) epsVar.f).remove(d80Var);
        epsVar.h().a.a.f1().f.e(d80Var);
    }

    @Override // defpackage.i8l
    public final int c() {
        return k1().c();
    }

    @Override // defpackage.i8l
    public final int c0() {
        return k1().c0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void c1(d80 d80Var) {
        d80Var.getClass();
        eps epsVar = this.l;
        epsVar.getClass();
        ((ArrayList) epsVar.f).add(d80Var);
        uj7 f1 = epsVar.h().a.a.f1();
        f1.getClass();
        f1.f.a(d80Var);
    }

    @Override // defpackage.i8l
    public final void d() {
        k1().d();
    }

    @Override // defpackage.i8l
    public final long d0() {
        return k1().d0();
    }

    @Override // defpackage.i8l
    public final boolean d1() {
        return k1().d1();
    }

    @Override // defpackage.i8l
    public final boolean e() {
        return k1().e();
    }

    @Override // defpackage.i8l
    public final void e0(int i, long j) {
        k1().e0(i, j);
    }

    @Override // defpackage.i8l
    public final boolean e1() {
        return k1().h1();
    }

    @Override // defpackage.i8l
    public final boolean f() {
        return k1().f();
    }

    @Override // defpackage.i8l
    public final d8l f0() {
        d8l f0 = k1().f0();
        f0.getClass();
        return f0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final uj7 f1() {
        uj7 f1 = k1().f1();
        f1.getClass();
        return f1;
    }

    @Override // defpackage.i8l
    public final int g() {
        return k1().g();
    }

    @Override // defpackage.i8l
    public final boolean g0() {
        return k1().g0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int g1() {
        return k1().g1();
    }

    @Override // defpackage.i8l
    public final long getDuration() {
        return k1().getDuration();
    }

    @Override // defpackage.i8l
    public final float getVolume() {
        return k1().getVolume();
    }

    @Override // defpackage.i8l
    public final void h(Surface surface) {
        k1().h(surface);
    }

    @Override // defpackage.i8l
    public final void h0(boolean z) {
        k1().h0(z);
    }

    @Override // defpackage.i8l
    public final boolean h1() {
        return k1().h1();
    }

    @Override // defpackage.i8l
    public final boolean i() {
        return k1().i();
    }

    @Override // defpackage.i8l
    public final long i0() {
        return k1().i0();
    }

    @Override // defpackage.i8l
    public final void j(SurfaceView surfaceView) {
        k1().j(surfaceView);
    }

    @Override // defpackage.i8l
    public final void j0(f8l f8lVar) {
        f8lVar.getClass();
        eps epsVar = this.l;
        epsVar.getClass();
        ((ArrayList) epsVar.e).add(f8lVar);
        epsVar.h().a.a.j0(f8lVar);
    }

    public final void j1(boolean z) {
        eps epsVar = this.l;
        if (z) {
            epsVar.d();
        } else {
            epsVar.getClass();
            mal.a();
            ssg.a(3, "InternalPlayerManager", "clearOverlap " + ((Object) String.valueOf((lve) epsVar.d)) + ", args() ", null);
            lve lveVar = (lve) epsVar.d;
            if (lveVar != null) {
                if (lveVar.b != null) {
                    ssg.a(3, "InternalPlayerManager", "clearOverlap overlapPlayer.sourceHelperId != null, pause player and reset fade, args() ", null);
                    lveVar.a.a.L(false);
                } else {
                    ssg.a(3, "InternalPlayerManager", "clearOverlap stop and clear player, args() ", null);
                    epsVar.c();
                }
            }
        }
        f1d.s(1.0f, this.t, null);
        this.v = false;
        this.y = this.f ? null : 0L;
    }

    @Override // defpackage.i8l
    public final pqb k() {
        return k1().k();
    }

    @Override // defpackage.i8l
    public final int k0() {
        return k1().k0();
    }

    public final ExoPlayer k1() {
        return this.l.h().a.a;
    }

    @Override // defpackage.i8l
    public final sv6 l() {
        sv6 l = k1().l();
        l.getClass();
        return l;
    }

    @Override // defpackage.i8l
    public final tcu l0() {
        tcu l0 = k1().l0();
        l0.getClass();
        return l0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if ((r11 != null ? r11.c : null) == defpackage.gy1.e) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l1(iom iomVar) {
        long M;
        long M2;
        boolean z;
        kve kveVar;
        Object nveVar;
        kve kveVar2;
        qvs qvsVar;
        mal.a();
        boolean z2 = iomVar.c;
        boolean z3 = iomVar.d;
        u2q u2qVar = iomVar.a;
        int i = 1;
        int i2 = 0;
        if (((Number) this.u.getValue()).floatValue() != 1.0f || ((Number) this.t.getValue()).floatValue() != 1.0f) {
            if (this.v) {
                j1(false);
            }
            this.v = true;
        }
        this.m = z2;
        Continuation continuation = null;
        if (!z2) {
            u2q u2qVar2 = u2qVar != null ? u2qVar : null;
        }
        if (!this.A.getAndSet(true)) {
            ssg.a(3, "CrossfadingExoPlayerImpl", "initializing crossfade", null);
            ox6.B(zsd.P(zsd.C(zsd.I(new bv6(this, continuation, i)), -1), this.r, this.c, this.b, new av6(this, continuation, i2)), this.n, new yu6(this, 2));
        }
        u2q u2qVar3 = iomVar.a;
        v2q v2qVar = this.w;
        u2q u2qVar4 = v2qVar instanceof u2q ? (u2q) v2qVar : null;
        zu6 zu6Var = (u2qVar4 != null && u2qVar4.b.equals(u2qVar3.b) && u2qVar3.d) ? this.x : null;
        if (zu6Var != null) {
            M = zu6Var.a;
        } else {
            msa msaVar = nsa.b;
            M = yd5.M(0, ssa.MILLISECONDS);
        }
        long j = M;
        if (zu6Var != null) {
            M2 = zu6Var.b;
        } else {
            msa msaVar2 = nsa.b;
            M2 = yd5.M(0, ssa.MILLISECONDS);
        }
        long j2 = M2;
        eps epsVar = this.l;
        u2q u2qVar5 = iomVar.a;
        Long l = iomVar.b;
        epsVar.getClass();
        mve mveVar = mve.a;
        u2qVar5.getClass();
        mal.a();
        lve h = epsVar.h();
        lve lveVar = (lve) epsVar.d;
        kve kveVar3 = h.b;
        if (Intrinsics.d(kveVar3 != null ? kveVar3.a : null, u2qVar5)) {
            ssg.a(3, "InternalPlayerManager", hrg.q("swapPlayer already swapped, args(", String.valueOf(u2qVar5), ") "), null);
            lve e = eps.e(h);
            e.a.c.b = nua.a;
            epsVar.c = e;
            eps.n(epsVar.h().a, l);
            nveVar = new nve(kveVar3.b);
            z = z2;
        } else {
            if ((kveVar3 != null ? kveVar3.a : null) != null) {
                ssg.a(3, "InternalPlayerManager", hrg.q("swapPlayer unexpected state,clear current player, args(", String.valueOf(u2qVar5), ") "), null);
                lve e2 = eps.e(h);
                e2.a.c.b = nua.a;
                epsVar.c = e2;
                z = z2;
            } else {
                if (Intrinsics.d((lveVar == null || (kveVar2 = lveVar.b) == null) ? null : kveVar2.a, u2qVar5)) {
                    z = z2;
                    ssg.a(3, "InternalPlayerManager", hrg.q("swapPlayer do swap on preheated player, args(", String.valueOf(u2qVar5), ") "), null);
                    o4c o4cVar = lveVar.a;
                    o4cVar.c.b = nua.a;
                    kve kveVar4 = lveVar.b;
                    pqb k = o4cVar.a.k();
                    if (k != null) {
                        ssg.a(3, "InternalPlayerManager", "swapPlayer " + ((Object) ("player error after swapped " + k)) + ", args(" + String.valueOf(u2qVar5) + ") ", null);
                        lve e3 = eps.e(lveVar);
                        e3.a.a.stop();
                        epsVar.d = e3;
                    } else {
                        if (!eps.n(o4cVar, l) && kveVar4 != null) {
                            ExoPlayer exoPlayer = o4cVar.a;
                            if (exoPlayer.c() == 3) {
                                Long l2 = kveVar4.c;
                                if (l2 == null || l2.longValue() <= 0) {
                                    l2 = null;
                                }
                                exoPlayer.s(l2 != null ? l2.longValue() - 1 : 1L);
                                exoPlayer.s(l2 != null ? l2.longValue() : 0L);
                            }
                        }
                        epsVar.c = eps.e(lveVar);
                        epsVar.j(h, epsVar.h());
                        epsVar.h().a.a.L(false);
                        n4c n4cVar = epsVar.h().a.b;
                        n4cVar.j = 1.0f;
                        n4cVar.i = l4c.a;
                        lve e4 = eps.e(h);
                        e4.a.a.stop();
                        epsVar.d = e4;
                        nveVar = new nve(kveVar4.b);
                    }
                } else {
                    z = z2;
                    if (((lveVar == null || (kveVar = lveVar.b) == null) ? null : kveVar.a) != null) {
                        ssg.a(3, "InternalPlayerManager", hrg.q("swapPlayer Pre heat info contains another track, clear idle player, args(", String.valueOf(u2qVar5), ") "), null);
                        lve e5 = eps.e(lveVar);
                        o4c o4cVar2 = e5.a;
                        o4cVar2.c.b = nua.a;
                        o4cVar2.a.stop();
                        epsVar.d = e5;
                    } else {
                        eps.i("swapPlayer", String.valueOf(u2qVar5), new jve(epsVar, 0));
                    }
                }
            }
            nveVar = mveVar;
        }
        ExoPlayer k1 = k1();
        mal.a();
        if (!nveVar.equals(mveVar)) {
            if (!(nveVar instanceof nve)) {
                b6e.s();
                return;
            }
            boolean z4 = k1.M0() == null;
            boolean z5 = k1.c() == 1;
            boolean z6 = k1.k() != null;
            if (z4 || (z5 && !z6)) {
                ssg.a(7, "CrossfadingExoPlayerImpl", "Player is junk after swap: isEmptyMediaItem=" + z4 + ", isIdle=" + z5, null);
                nveVar = mveVar;
            }
        }
        if (nveVar instanceof nve) {
            ((nve) nveVar).a.F(iomVar.g, j, j2);
        } else {
            if (!nveVar.equals(mveVar)) {
                b6e.s();
                return;
            }
            k1().stop();
            k1().y();
            u2q u2qVar6 = iomVar.a;
            gy1 gy1Var = iomVar.e;
            vzg vzgVar = iomVar.f;
            boolean z7 = iomVar.g;
            u2qVar6.getClass();
            g7q g7qVar = (g7q) this.j.getValue();
            ncl nclVar = (ncl) this.k.getValue();
            g7qVar.getClass();
            zvs zvsVar = u2qVar6.b;
            msa msaVar3 = nsa.b;
            ssa ssaVar = ssa.MILLISECONDS;
            onh c = onh.c(v3g.X(zvsVar, gy1Var, yd5.M(0, ssaVar), yd5.M(0, ssaVar), z7, vzgVar, u2qVar6.a, u2qVar6.g).i);
            b7q b7qVar = this.h;
            zss zssVar = this.i;
            b7qVar.getClass();
            iaw iawVar = new iaw(b7qVar, g7qVar, nclVar, c, zssVar);
            ExoPlayer k12 = k1();
            Long l3 = iomVar.b;
            k12.X0(iawVar, l3 != null ? l3.longValue() : -9223372036854775807L);
            iawVar.F(iomVar.g, j, j2);
            k1().q();
        }
        if (this.e && ((Number) this.u.getValue()).floatValue() == 1.0f && ((Number) this.t.getValue()).floatValue() == 1.0f && z && z3) {
            tf6 tf6Var = this.q;
            qvs b = u2qVar.b();
            if (b != null) {
                long j3 = b.b;
                long j4 = b.a;
                qvsVar = qvs.a(b, ((j3 - j4) / 4) + j4, 0L, 0L, 13);
            } else {
                qvsVar = null;
            }
            zwf r = ywf.r(u2qVar.b(), qvsVar, k1().getDuration(), this.d, this.e);
            if (r != null) {
                saf.D(tf6Var.a, null);
                xdr xdrVar = this.t;
                Float valueOf = Float.valueOf(0.0f);
                xdrVar.getClass();
                xdrVar.m(null, valueOf);
                x97.y(tf6Var, null, null, new bv6(r, this, null, 0), 3).R(new at5(14, this));
            }
        }
        this.r.l(u2qVar);
        this.y = this.f ? null : 0L;
        if (this.B.getAndSet(true)) {
            return;
        }
        ssg.a(3, "CrossfadingExoPlayerImpl", "initializing player preheat", null);
        x97.y(this.n, null, null, new bv6(zsd.M0(zsd.Q(zsd.b0(this.b), zsd.b0(this.c), this.r, new ev6(this, null, 0)), new dv6(null, this)), (Continuation) null, this), 3);
    }

    @Override // defpackage.i8l
    public final p0l m() {
        p0l m = k1().m();
        m.getClass();
        return m;
    }

    @Override // defpackage.i8l
    public final dv1 m0() {
        dv1 m0 = k1().m0();
        m0.getClass();
        return m0;
    }

    @Override // defpackage.i8l
    public final void n(TextureView textureView) {
        k1().n(textureView);
    }

    @Override // defpackage.i8l
    public final p08 n0() {
        p08 n0 = k1().n0();
        n0.getClass();
        return n0;
    }

    @Override // defpackage.i8l
    public final long o() {
        return k1().o();
    }

    @Override // defpackage.i8l
    public final void o0(int i, int i2) {
        k1().o0(i, i2);
    }

    @Override // defpackage.i8l
    public final void p(TextureView textureView) {
        k1().p(textureView);
    }

    @Override // defpackage.i8l
    public final int p0() {
        return k1().p0();
    }

    @Override // defpackage.i8l
    public final void q() {
        k1().q();
    }

    @Override // defpackage.i8l
    public final void q0(int i) {
        k1().q0(i);
    }

    @Override // defpackage.i8l
    public final void r(p0l p0lVar) {
        k1().r(p0lVar);
    }

    @Override // defpackage.i8l
    public final long r0() {
        return k1().r0();
    }

    @Override // defpackage.i8l
    public final void s(long j) {
        k1().s(j);
        j1(j == 0);
    }

    @Override // defpackage.i8l
    public final long s0() {
        return k1().s0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        k1().setImageOutput(imageOutput);
    }

    @Override // defpackage.i8l
    public final void stop() {
        k1().stop();
        this.l.d();
    }

    @Override // defpackage.i8l
    public final void t(float f) {
        o4c o4cVar;
        eps epsVar = this.l;
        epsVar.getClass();
        mal.a();
        epsVar.h().a.a.t(f);
        lve lveVar = (lve) epsVar.d;
        if (lveVar == null || (o4cVar = lveVar.a) == null) {
            return;
        }
        o4cVar.a.t(f);
    }

    @Override // defpackage.i8l
    public final long t0() {
        return k1().t0();
    }

    @Override // defpackage.i8l
    public final void u(float f) {
        o4c o4cVar;
        eps epsVar = this.l;
        epsVar.getClass();
        mal.a();
        epsVar.h().a.a.u(f);
        lve lveVar = (lve) epsVar.d;
        if (lveVar == null || (o4cVar = lveVar.a) == null) {
            return;
        }
        o4cVar.a.u(f);
    }

    @Override // defpackage.i8l
    public final hoh u0() {
        hoh u0 = k1().u0();
        u0.getClass();
        return u0;
    }

    @Override // defpackage.i8l
    public final void v(SurfaceView surfaceView) {
        k1().v(surfaceView);
    }

    @Override // defpackage.i8l
    public final int v0() {
        return k1().v0();
    }

    @Override // defpackage.i8l
    public final long w() {
        return k1().w();
    }

    @Override // defpackage.i8l
    public final void w0(int i) {
        k1().w0(i);
    }

    @Override // defpackage.i8l
    public final void x(onh onhVar, long j) {
        onhVar.getClass();
        k1().x(onhVar, j);
    }

    @Override // defpackage.i8l
    public final void x0(f8l f8lVar) {
        f8lVar.getClass();
        eps epsVar = this.l;
        epsVar.getClass();
        ((ArrayList) epsVar.e).remove(f8lVar);
        epsVar.h().a.a.x0(f8lVar);
    }

    @Override // defpackage.i8l
    public final void y() {
        k1().y();
        this.l.d();
    }

    @Override // defpackage.i8l
    public final void y0(int i, int i2) {
        k1().y0(i, i2);
    }

    @Override // defpackage.i8l
    public final void z(Surface surface) {
        k1().z(surface);
    }

    @Override // defpackage.i8l
    public final void z0(int i, int i2, int i3) {
        k1().z0(i, i2, i3);
    }
}
