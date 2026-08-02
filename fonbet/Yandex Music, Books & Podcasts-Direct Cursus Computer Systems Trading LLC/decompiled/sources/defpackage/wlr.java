package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.player.PreparingParams;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class wlr implements ExoPlayer {
    public final xrb a;
    public final apo b;
    public final Handler c;
    public final tvh d;
    public final bl2 e;
    public final iwe f;
    public final zg g;

    public wlr(xrb xrbVar, apo apoVar, Handler handler, tvh tvhVar, bl2 bl2Var, iwe iweVar, zg zgVar) {
        iweVar.getClass();
        this.a = xrbVar;
        this.b = apoVar;
        this.c = handler;
        this.d = tvhVar;
        this.e = bl2Var;
        this.f = iweVar;
        this.g = zgVar;
    }

    @Override // defpackage.i8l
    public final int A() {
        return this.a.A();
    }

    @Override // defpackage.i8l
    public final void A0(List list) {
        list.getClass();
        this.a.A0(list);
    }

    @Override // defpackage.i8l
    public final void B() {
        this.a.D1();
    }

    @Override // defpackage.i8l
    public final boolean B0() {
        this.a.N1();
        return false;
    }

    @Override // defpackage.i8l
    public final void C() {
        this.a.C();
    }

    @Override // defpackage.i8l
    public final boolean C0() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.G;
    }

    @Override // defpackage.i8l
    public final void D(int i, boolean z) {
        this.a.N1();
    }

    @Override // defpackage.i8l
    public final long D0() {
        return this.a.D0();
    }

    @Override // defpackage.i8l
    public final void E() {
        this.a.N1();
    }

    @Override // defpackage.i8l
    public final void E0(int i) {
        this.a.N1();
    }

    @Override // defpackage.i8l
    public final void F(int i) {
        this.a.N1();
    }

    @Override // defpackage.i8l
    public final void F0() {
        this.a.F0();
    }

    @Override // defpackage.i8l
    public final void G(int i, int i2, List list) {
        list.getClass();
        this.a.G(i, i2, list);
    }

    @Override // defpackage.i8l
    public final void G0() {
        this.a.G0();
    }

    @Override // defpackage.i8l
    public final void H(w0t w0tVar) {
        w0tVar.getClass();
        this.a.H(w0tVar);
    }

    @Override // defpackage.i8l
    public final hoh H0() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.O;
    }

    @Override // defpackage.i8l
    public final void I(int i) {
        this.a.I(i);
    }

    @Override // defpackage.i8l
    public final void I0(List list) {
        list.getClass();
        this.a.I0(list);
    }

    @Override // defpackage.i8l
    public final void J(int i, int i2) {
        this.a.J(i, i2);
    }

    @Override // defpackage.i8l
    public final long J0() {
        return this.a.J0();
    }

    @Override // defpackage.i8l
    public final void K() {
        this.a.K();
    }

    @Override // defpackage.i8l
    public final void K0(List list, int i) {
        list.getClass();
        this.a.K0(list, i);
    }

    @Override // defpackage.i8l
    public final void L(boolean z) {
        this.a.L(z);
    }

    @Override // defpackage.i8l
    public final long L0() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.v;
    }

    @Override // defpackage.i8l
    public final void M() {
        this.a.M();
    }

    @Override // defpackage.i8l
    public final onh M0() {
        return this.a.M0();
    }

    @Override // defpackage.i8l
    public final void N(int i) {
        this.a.N1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void N0(int i) {
        this.a.N0(i);
    }

    @Override // defpackage.i8l
    public final e3t O() {
        return this.a.O();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void O0(boolean z) {
        this.a.O0(z);
    }

    @Override // defpackage.i8l
    public final void P(dv1 dv1Var, boolean z) {
        this.a.P(dv1Var, z);
    }

    @Override // defpackage.i8l
    public final boolean P0() {
        return this.a.W0();
    }

    @Override // defpackage.i8l
    public final void Q(hoh hohVar) {
        this.a.Q(hohVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void Q0(hap hapVar) {
        this.a.Q0(hapVar);
    }

    @Override // defpackage.i8l
    public final int R() {
        return this.a.R();
    }

    @Override // defpackage.i8l
    public final int R0() {
        return this.a.v0();
    }

    @Override // defpackage.i8l
    public final void S(boolean z) {
        this.a.N1();
    }

    @Override // defpackage.i8l
    public final Object S0() {
        return this.a.S0();
    }

    @Override // defpackage.i8l
    public final void T(onh onhVar) {
        onhVar.getClass();
        wvh d = this.d.d(onhVar);
        d.getClass();
        U0(d);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void T0(wvh wvhVar) {
        wvhVar.getClass();
        this.a.T0(i1(wvhVar, null));
    }

    @Override // defpackage.i8l
    public final int U() {
        return this.a.U();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void U0(wvh wvhVar) {
        wvhVar.getClass();
        this.a.U0(i1(wvhVar, null));
    }

    @Override // defpackage.i8l
    public final sis V() {
        return this.a.V();
    }

    @Override // defpackage.i8l
    public final boolean V0(int i) {
        return this.a.V0(i);
    }

    @Override // defpackage.i8l
    public final void W(int i, onh onhVar) {
        onhVar.getClass();
        this.a.W(i, onhVar);
    }

    @Override // defpackage.i8l
    public final boolean W0() {
        return this.a.W0();
    }

    @Override // defpackage.i8l
    public final Looper X() {
        return this.a.t;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void X0(wvh wvhVar, long j) {
        wvhVar.getClass();
        this.a.X0(i1(wvhVar, Long.valueOf(j)), j);
    }

    @Override // defpackage.i8l
    public final void Y() {
        this.a.N1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final q0t Y0() {
        return this.a.Y0();
    }

    @Override // defpackage.i8l
    public final w0t Z() {
        return this.a.Z();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int Z0(int i) {
        return this.a.Z0(i);
    }

    @Override // defpackage.i8l
    public final void a() {
        this.g.invoke();
        this.a.a();
    }

    @Override // defpackage.i8l
    public final void a0(int i, long j, List list) {
        list.getClass();
        this.a.a0(i, j, list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void a1(ssm ssmVar) {
        this.a.a1(ssmVar);
    }

    @Override // defpackage.i8l
    public final void b() {
        this.a.L(false);
    }

    @Override // defpackage.i8l
    public final void b0() {
        this.a.b0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void b1(d80 d80Var) {
        d80Var.getClass();
        this.a.b1(d80Var);
    }

    @Override // defpackage.i8l
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.i8l
    public final int c0() {
        this.a.N1();
        return 0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void c1(d80 d80Var) {
        d80Var.getClass();
        this.a.c1(d80Var);
    }

    @Override // defpackage.i8l
    public final void d() {
        this.a.L(true);
    }

    @Override // defpackage.i8l
    public final long d0() {
        return this.a.d0();
    }

    @Override // defpackage.i8l
    public final boolean d1() {
        return this.a.d1();
    }

    @Override // defpackage.i8l
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.i8l
    public final void e0(int i, long j) {
        this.a.C1(i, j, false);
    }

    @Override // defpackage.i8l
    public final boolean e1() {
        return this.a.h1();
    }

    @Override // defpackage.i8l
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.i8l
    public final d8l f0() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.N;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final uj7 f1() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.s;
    }

    @Override // defpackage.i8l
    public final int g() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.F;
    }

    @Override // defpackage.i8l
    public final boolean g0() {
        return this.a.g0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int g1() {
        return this.a.g1();
    }

    @Override // defpackage.i8l
    public final long getDuration() {
        return this.a.getDuration();
    }

    @Override // defpackage.i8l
    public final float getVolume() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.Z;
    }

    @Override // defpackage.i8l
    public final void h(Surface surface) {
        this.a.h(surface);
    }

    @Override // defpackage.i8l
    public final void h0(boolean z) {
        this.a.h0(z);
    }

    @Override // defpackage.i8l
    public final boolean h1() {
        return this.a.h1();
    }

    @Override // defpackage.i8l
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.i8l
    public final long i0() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x00a8, code lost:
    
        if (r0 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzm i1(wvh wvhVar, Long l) {
        String uri;
        Uri uri2;
        String str;
        it7 it7Var;
        HashSet u0;
        HashSet u02;
        HashSet u03;
        Object t7oVar;
        Object t7oVar2;
        Object t7oVar3;
        Uri uri3;
        String scheme;
        Uri uri4;
        Bundle bundle;
        wvhVar.b(this.c, new vlr(this));
        apo apoVar = this.b;
        onh f = wvhVar.f();
        f.getClass();
        boolean g0 = this.a.g0();
        int c = this.a.c();
        ((ive) apoVar.b).f.set(false);
        PlaybackParameters e = a4g.e(c != 1 && g0, new zbg(l, 1));
        var varVar = (var) ((uar) apoVar.c);
        varVar.getClass();
        xar xarVar = varVar.a;
        if (!xarVar.e.f) {
            gnh gnhVar = f.b;
            if (gnhVar == null || (uri3 = gnhVar.a) == null || (scheme = uri3.getScheme()) == null || !StringsKt.M(scheme, "http", false)) {
                if (xarVar.f != null) {
                    Bundle bundle2 = f.d.I;
                    uri = bundle2 != null ? bundle2.getString("episodeIdTest") : null;
                }
                gnh gnhVar2 = f.b;
                uri = (gnhVar2 == null || (uri2 = gnhVar2.a) == null) ? null : uri2.toString();
                if (uri == null) {
                    uri = "";
                }
                str = uri;
                it7Var = null;
            } else {
                String string = (xarVar.f == null || (bundle = f.d.I) == null) ? null : bundle.getString("episodeIdTest");
                gnh gnhVar3 = f.b;
                String uri5 = (gnhVar3 == null || (uri4 = gnhVar3.a) == null) ? null : uri4.toString();
                if (uri5 == null) {
                    uri5 = "";
                }
                str = string;
                it7Var = new it7(uri5);
            }
            f46 a = xarVar.e.a(new eom(str, it7Var, e));
            Long startPosition = e.getStartPosition();
            boolean autoPlay = e.getAutoPlay();
            String str2 = str;
            PreparingParams g = s7g.g(xarVar.o == null, autoPlay, a.b, xarVar.k, new ak0(str2, it7Var, startPosition, xarVar.c.k(xarVar.a, it7Var == null ? new it7("") : it7Var, str2, startPosition != null ? startPosition.longValue() : -9223372036854775807L, autoPlay, a.b, false), 23));
            xarVar.n = g;
            xarVar.o = g.getVideoData();
            xarVar.e.e = false;
            yjj yjjVar = xarVar.i;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((ove) next).F(g, null);
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
            yjj yjjVar2 = xarVar.h;
            synchronized (yjjVar2.a) {
                u02 = CollectionsKt.u0(yjjVar2.a);
            }
            Iterator it2 = u02.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                try {
                    r7o r7oVar3 = z7o.b;
                    ((u9l) next2).j(g);
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
            yjj yjjVar3 = xarVar.g;
            synchronized (yjjVar3.a) {
                u03 = CollectionsKt.u0(yjjVar3.a);
            }
            Iterator it3 = u03.iterator();
            while (it3.hasNext()) {
                Object next3 = it3.next();
                try {
                    r7o r7oVar5 = z7o.b;
                    ((rgl) next3).n(autoPlay);
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
        }
        wvhVar.f().getClass();
        return new zzm(wvhVar, this.e, this.f);
    }

    @Override // defpackage.i8l
    public final void j(SurfaceView surfaceView) {
        this.a.j(surfaceView);
    }

    @Override // defpackage.i8l
    public final void j0(f8l f8lVar) {
        f8lVar.getClass();
        this.a.m.a(f8lVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, defpackage.i8l
    public final pqb k() {
        return this.a.k();
    }

    @Override // defpackage.i8l
    public final int k0() {
        return this.a.k0();
    }

    @Override // defpackage.i8l
    public final sv6 l() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.b0;
    }

    @Override // defpackage.i8l
    public final tcu l0() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.j0;
    }

    @Override // defpackage.i8l
    public final p0l m() {
        return this.a.m();
    }

    @Override // defpackage.i8l
    public final dv1 m0() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.Y;
    }

    @Override // defpackage.i8l
    public final void n(TextureView textureView) {
        this.a.n(textureView);
    }

    @Override // defpackage.i8l
    public final p08 n0() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.i0;
    }

    @Override // defpackage.i8l
    public final long o() {
        return this.a.o();
    }

    @Override // defpackage.i8l
    public final void o0(int i, int i2) {
        this.a.N1();
    }

    @Override // defpackage.i8l
    public final void p(TextureView textureView) {
        this.a.p(textureView);
    }

    @Override // defpackage.i8l
    public final int p0() {
        return this.a.p0();
    }

    @Override // defpackage.i8l
    public final void q() {
        this.a.q();
    }

    @Override // defpackage.i8l
    public final void q0(int i) {
        this.a.q0(i);
    }

    @Override // defpackage.i8l
    public final void r(p0l p0lVar) {
        this.a.r(p0lVar);
    }

    @Override // defpackage.i8l
    public final long r0() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.w;
    }

    @Override // defpackage.i8l
    public final void s(long j) {
        this.a.s(j);
    }

    @Override // defpackage.i8l
    public final long s0() {
        return this.a.s0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        this.a.setImageOutput(imageOutput);
    }

    @Override // defpackage.i8l
    public final void stop() {
        ((var) ((uar) this.b.c)).onStop(false);
        this.a.stop();
    }

    @Override // defpackage.i8l
    public final void t(float f) {
        this.a.t(f);
    }

    @Override // defpackage.i8l
    public final long t0() {
        return this.a.t0();
    }

    @Override // defpackage.i8l
    public final void u(float f) {
        this.a.u(f);
    }

    @Override // defpackage.i8l
    public final hoh u0() {
        xrb xrbVar = this.a;
        xrbVar.N1();
        return xrbVar.P;
    }

    @Override // defpackage.i8l
    public final void v(SurfaceView surfaceView) {
        this.a.v(surfaceView);
    }

    @Override // defpackage.i8l
    public final int v0() {
        return this.a.v0();
    }

    @Override // defpackage.i8l
    public final long w() {
        return this.a.w();
    }

    @Override // defpackage.i8l
    public final void w0(int i) {
        this.a.w0(i);
    }

    @Override // defpackage.i8l
    public final void x(onh onhVar, long j) {
        onhVar.getClass();
        wvh d = this.d.d(onhVar);
        d.getClass();
        X0(d, j);
    }

    @Override // defpackage.i8l
    public final void x0(f8l f8lVar) {
        f8lVar.getClass();
        this.a.x0(f8lVar);
    }

    @Override // defpackage.i8l
    public final void y() {
        this.a.y();
    }

    @Override // defpackage.i8l
    public final void y0(int i, int i2) {
        this.a.y0(i, i2);
    }

    @Override // defpackage.i8l
    public final void z(Surface surface) {
        this.a.z(surface);
    }

    @Override // defpackage.i8l
    public final void z0(int i, int i2, int i3) {
        this.a.z0(i, i2, i3);
    }

    @Override // defpackage.i8l
    public final hzk k() {
        return this.a.k();
    }
}
