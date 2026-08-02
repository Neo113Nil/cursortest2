package defpackage;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class psb implements ExoPlayer {
    public final paw a;
    public final ExoPlayer b;
    public final iwe c;
    public final fau d;

    public psb(paw pawVar, ExoPlayer exoPlayer, iwe iweVar, fau fauVar) {
        exoPlayer.getClass();
        iweVar.getClass();
        fauVar.getClass();
        this.a = pawVar;
        this.b = exoPlayer;
        this.c = iweVar;
        this.d = fauVar;
    }

    @Override // defpackage.i8l
    public final int A() {
        return this.b.A();
    }

    @Override // defpackage.i8l
    public final void A0(List list) {
        list.getClass();
        this.b.A0(list);
    }

    @Override // defpackage.i8l
    public final void B() {
        this.b.B();
    }

    @Override // defpackage.i8l
    public final boolean B0() {
        return this.b.B0();
    }

    @Override // defpackage.i8l
    public final void C() {
        this.a.s(-9223372036854775807L);
    }

    @Override // defpackage.i8l
    public final boolean C0() {
        return this.b.C0();
    }

    @Override // defpackage.i8l
    public final void D(int i, boolean z) {
        this.b.D(i, z);
    }

    @Override // defpackage.i8l
    public final long D0() {
        return this.b.D0();
    }

    @Override // defpackage.i8l
    public final void E() {
        this.b.E();
    }

    @Override // defpackage.i8l
    public final void E0(int i) {
        this.b.E0(i);
    }

    @Override // defpackage.i8l
    public final void F(int i) {
        this.b.F(i);
    }

    @Override // defpackage.i8l
    public final void F0() {
        this.b.F0();
    }

    @Override // defpackage.i8l
    public final void G(int i, int i2, List list) {
        list.getClass();
        this.b.G(i, i2, list);
    }

    @Override // defpackage.i8l
    public final void G0() {
        this.b.G0();
    }

    @Override // defpackage.i8l
    public final void H(w0t w0tVar) {
        w0tVar.getClass();
        this.b.H(w0tVar);
    }

    @Override // defpackage.i8l
    public final hoh H0() {
        return this.b.H0();
    }

    @Override // defpackage.i8l
    public final void I(int i) {
        this.b.I(i);
    }

    @Override // defpackage.i8l
    public final void I0(List list) {
        list.getClass();
        this.b.I0(list);
    }

    @Override // defpackage.i8l
    public final void J(int i, int i2) {
        this.b.J(i, i2);
    }

    @Override // defpackage.i8l
    public final long J0() {
        return this.b.J0();
    }

    @Override // defpackage.i8l
    public final void K() {
        this.b.K();
    }

    @Override // defpackage.i8l
    public final void K0(List list, int i) {
        list.getClass();
        this.b.K0(list, i);
    }

    @Override // defpackage.i8l
    public final void L(boolean z) {
        paw pawVar = this.a;
        if (z) {
            pawVar.d();
        } else {
            pawVar.b();
        }
    }

    @Override // defpackage.i8l
    public final long L0() {
        return this.b.L0();
    }

    @Override // defpackage.i8l
    public final void M() {
        this.b.M();
    }

    @Override // defpackage.i8l
    public final onh M0() {
        return this.b.M0();
    }

    @Override // defpackage.i8l
    public final void N(int i) {
        this.b.N(i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void N0(int i) {
        this.b.N0(i);
    }

    @Override // defpackage.i8l
    public final e3t O() {
        return this.b.O();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void O0(boolean z) {
        this.b.O0(z);
    }

    @Override // defpackage.i8l
    public final void P(dv1 dv1Var, boolean z) {
        this.b.P(dv1Var, z);
    }

    @Override // defpackage.i8l
    public final boolean P0() {
        return this.b.P0();
    }

    @Override // defpackage.i8l
    public final void Q(hoh hohVar) {
        this.b.Q(hohVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void Q0(hap hapVar) {
        this.b.Q0(hapVar);
    }

    @Override // defpackage.i8l
    public final int R() {
        return this.b.R();
    }

    @Override // defpackage.i8l
    public final int R0() {
        return this.b.R0();
    }

    @Override // defpackage.i8l
    public final void S(boolean z) {
        this.b.S(z);
    }

    @Override // defpackage.i8l
    public final Object S0() {
        return this.b.S0();
    }

    @Override // defpackage.i8l
    public final void T(onh onhVar) {
        onhVar.getClass();
        this.b.T(onhVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void T0(wvh wvhVar) {
        wvhVar.getClass();
        this.b.T0(wvhVar);
    }

    @Override // defpackage.i8l
    public final int U() {
        return this.b.U();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void U0(wvh wvhVar) {
        this.b.U0(wvhVar);
    }

    @Override // defpackage.i8l
    public final sis V() {
        return this.b.V();
    }

    @Override // defpackage.i8l
    public final boolean V0(int i) {
        return this.b.V0(i);
    }

    @Override // defpackage.i8l
    public final void W(int i, onh onhVar) {
        onhVar.getClass();
        this.b.W(i, onhVar);
    }

    @Override // defpackage.i8l
    public final boolean W0() {
        return this.b.W0();
    }

    @Override // defpackage.i8l
    public final Looper X() {
        return this.b.X();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void X0(wvh wvhVar, long j) {
        this.b.X0(wvhVar, j);
    }

    @Override // defpackage.i8l
    public final void Y() {
        this.b.Y();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final q0t Y0() {
        return this.b.Y0();
    }

    @Override // defpackage.i8l
    public final w0t Z() {
        return this.b.Z();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int Z0(int i) {
        return this.b.Z0(i);
    }

    @Override // defpackage.i8l
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.i8l
    public final void a0(int i, long j, List list) {
        list.getClass();
        this.b.a0(i, j, list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void a1(ssm ssmVar) {
        this.b.a1(ssmVar);
    }

    @Override // defpackage.i8l
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.i8l
    public final void b0() {
        this.b.b0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void b1(d80 d80Var) {
        d80Var.getClass();
        this.b.b1(d80Var);
    }

    @Override // defpackage.i8l
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.i8l
    public final int c0() {
        return this.b.c0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void c1(d80 d80Var) {
        d80Var.getClass();
        this.b.c1(d80Var);
    }

    @Override // defpackage.i8l
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.i8l
    public final long d0() {
        return this.b.d0();
    }

    @Override // defpackage.i8l
    public final boolean d1() {
        return this.b.d1();
    }

    @Override // defpackage.i8l
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.i8l
    public final void e0(int i, long j) {
        this.b.e0(i, j);
    }

    @Override // defpackage.i8l
    public final boolean e1() {
        return this.b.e1();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof psb) {
            return Intrinsics.d(this.b, ((psb) obj).b);
        }
        return false;
    }

    @Override // defpackage.i8l
    public final boolean f() {
        return this.b.f();
    }

    @Override // defpackage.i8l
    public final d8l f0() {
        return this.b.f0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final uj7 f1() {
        return this.b.f1();
    }

    @Override // defpackage.i8l
    public final int g() {
        return this.b.g();
    }

    @Override // defpackage.i8l
    public final boolean g0() {
        return this.b.g0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int g1() {
        return this.b.g1();
    }

    @Override // defpackage.i8l
    public final long getDuration() {
        return this.b.getDuration();
    }

    @Override // defpackage.i8l
    public final float getVolume() {
        return this.b.getVolume();
    }

    @Override // defpackage.i8l
    public final void h(Surface surface) {
        this.d.h(surface);
        iwe iweVar = this.c;
        if (surface != null) {
            iweVar.c = 0;
        } else {
            iweVar.getClass();
        }
    }

    @Override // defpackage.i8l
    public final void h0(boolean z) {
        this.b.h0(z);
    }

    @Override // defpackage.i8l
    public final boolean h1() {
        return this.b.h1();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.i8l
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.i8l
    public final long i0() {
        return this.b.i0();
    }

    @Override // defpackage.i8l
    public final void j(SurfaceView surfaceView) {
        this.d.j(surfaceView);
        iwe iweVar = this.c;
        iweVar.b = surfaceView;
        if (surfaceView != null) {
            iweVar.c = 1;
        }
    }

    @Override // defpackage.i8l
    public final void j0(f8l f8lVar) {
        f8lVar.getClass();
        this.b.j0(f8lVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, defpackage.i8l
    public final pqb k() {
        return this.b.k();
    }

    @Override // defpackage.i8l
    public final int k0() {
        return this.b.k0();
    }

    @Override // defpackage.i8l
    public final sv6 l() {
        return this.b.l();
    }

    @Override // defpackage.i8l
    public final tcu l0() {
        return this.b.l0();
    }

    @Override // defpackage.i8l
    public final p0l m() {
        return this.b.m();
    }

    @Override // defpackage.i8l
    public final dv1 m0() {
        return this.b.m0();
    }

    @Override // defpackage.i8l
    public final void n(TextureView textureView) {
        this.d.n(textureView);
        iwe iweVar = this.c;
        iweVar.b = textureView;
        if (textureView != null) {
            iweVar.c = 3;
        }
    }

    @Override // defpackage.i8l
    public final p08 n0() {
        return this.b.n0();
    }

    @Override // defpackage.i8l
    public final long o() {
        return this.b.o();
    }

    @Override // defpackage.i8l
    public final void o0(int i, int i2) {
        this.b.o0(i, i2);
    }

    @Override // defpackage.i8l
    public final void p(TextureView textureView) {
        Integer num;
        this.d.p(textureView);
        iwe iweVar = this.c;
        iweVar.b = null;
        if (textureView == null || (num = (Integer) iweVar.c) == null || num.intValue() != 3) {
            return;
        }
        iweVar.c = null;
    }

    @Override // defpackage.i8l
    public final int p0() {
        return this.b.p0();
    }

    @Override // defpackage.i8l
    public final void q() {
        this.b.q();
    }

    @Override // defpackage.i8l
    public final void q0(int i) {
        this.b.q0(i);
    }

    @Override // defpackage.i8l
    public final void r(p0l p0lVar) {
        this.b.r(p0lVar);
    }

    @Override // defpackage.i8l
    public final long r0() {
        return this.b.r0();
    }

    @Override // defpackage.i8l
    public final void s(long j) {
        this.a.s(j);
    }

    @Override // defpackage.i8l
    public final long s0() {
        return this.b.s0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        this.b.setImageOutput(imageOutput);
    }

    @Override // defpackage.i8l
    public final void stop() {
        this.a.stop();
    }

    @Override // defpackage.i8l
    public final void t(float f) {
        this.a.t(f);
    }

    @Override // defpackage.i8l
    public final long t0() {
        return this.b.t0();
    }

    @Override // defpackage.i8l
    public final void u(float f) {
        this.a.u(f);
    }

    @Override // defpackage.i8l
    public final hoh u0() {
        return this.b.u0();
    }

    @Override // defpackage.i8l
    public final void v(SurfaceView surfaceView) {
        Integer num;
        this.d.v(surfaceView);
        iwe iweVar = this.c;
        iweVar.b = null;
        if (surfaceView == null || (num = (Integer) iweVar.c) == null || num.intValue() != 1) {
            return;
        }
        iweVar.c = null;
    }

    @Override // defpackage.i8l
    public final int v0() {
        return this.b.v0();
    }

    @Override // defpackage.i8l
    public final long w() {
        return this.b.w();
    }

    @Override // defpackage.i8l
    public final void w0(int i) {
        this.b.w0(i);
    }

    @Override // defpackage.i8l
    public final void x(onh onhVar, long j) {
        onhVar.getClass();
        this.b.x(onhVar, j);
    }

    @Override // defpackage.i8l
    public final void x0(f8l f8lVar) {
        f8lVar.getClass();
        this.b.x0(f8lVar);
    }

    @Override // defpackage.i8l
    public final void y() {
        this.b.y();
    }

    @Override // defpackage.i8l
    public final void y0(int i, int i2) {
        this.b.y0(i, i2);
    }

    @Override // defpackage.i8l
    public final void z(Surface surface) {
        this.d.z(surface);
        iwe iweVar = this.c;
        if (surface == null) {
            iweVar.getClass();
            return;
        }
        Integer num = (Integer) iweVar.c;
        if (num != null && num.intValue() == 0) {
            iweVar.c = null;
        }
    }

    @Override // defpackage.i8l
    public final void z0(int i, int i2, int i3) {
        this.b.z0(i, i2, i3);
    }

    @Override // defpackage.i8l
    public final hzk k() {
        return this.b.k();
    }
}
