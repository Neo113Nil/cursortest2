package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class kkh implements i8l {
    public final ris a;
    public boolean b;
    public final jkh c;
    public final ikh d;
    public final Handler e;
    public final long f;
    public boolean g;
    public final ykh h;

    public kkh(Context context, bnp bnpVar, Bundle bundle, ikh ikhVar, Looper looper, ykh ykhVar, qne qneVar) {
        kkh kkhVar;
        jkh ulhVar;
        vq1.y(bnpVar, "token must not be null");
        vq1.Y("MediaController", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.1] [" + dvt.b + "]");
        this.a = new ris();
        this.f = -9223372036854775807L;
        this.d = ikhVar;
        this.e = new Handler(looper);
        this.h = ykhVar;
        if (bnpVar.a.y()) {
            qneVar.getClass();
            ulhVar = new bmh(context, this, bnpVar, bundle, looper, qneVar);
            kkhVar = this;
        } else {
            kkhVar = this;
            ulhVar = new ulh(context, kkhVar, bnpVar, bundle, looper);
        }
        kkhVar.c = ulhVar;
        ulhVar.connect();
    }

    @Override // defpackage.i8l
    public final int A() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.A();
        }
        return 0;
    }

    @Override // defpackage.i8l
    public final void A0(List list) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.A0(list);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // defpackage.i8l
    public final void B() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.B();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    @Override // defpackage.i8l
    public final boolean B0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.B0();
        }
        return false;
    }

    @Override // defpackage.i8l
    public final void C() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.C();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.i8l
    public final boolean C0() {
        l1();
        jkh jkhVar = this.c;
        return jkhVar.isConnected() && jkhVar.C0();
    }

    @Override // defpackage.i8l
    public final void D(int i, boolean z) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.D(i, z);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // defpackage.i8l
    public final long D0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.D0();
        }
        return 0L;
    }

    @Override // defpackage.i8l
    public final void E() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.E();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // defpackage.i8l
    public final void E0(int i) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.E0(i);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // defpackage.i8l
    public final void F(int i) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.F(i);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // defpackage.i8l
    public final void F0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.F0();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override // defpackage.i8l
    public final void G(int i, int i2, List list) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.G(i, i2, list);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring replaceMediaItems().");
        }
    }

    @Override // defpackage.i8l
    public final void G0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.G0();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override // defpackage.i8l
    public final void H(w0t w0tVar) {
        l1();
        jkh jkhVar = this.c;
        if (!jkhVar.isConnected()) {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        jkhVar.H(w0tVar);
    }

    @Override // defpackage.i8l
    public final hoh H0() {
        l1();
        jkh jkhVar = this.c;
        return jkhVar.isConnected() ? jkhVar.H0() : hoh.K;
    }

    @Override // defpackage.i8l
    public final void I(int i) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.I(i);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    @Override // defpackage.i8l
    public final void I0(List list) {
        l1();
        vq1.y(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            vq1.u("items must not contain null, index=" + i, list.get(i) != null);
        }
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.I0(list);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.i8l
    public final void J(int i, int i2) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.J(i, i2);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring removeMediaItems().");
        }
    }

    @Override // defpackage.i8l
    public final long J0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.J0();
        }
        return 0L;
    }

    @Override // defpackage.i8l
    public final void K() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.K();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override // defpackage.i8l
    public final void K0(List list, int i) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.K0(list, i);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // defpackage.i8l
    public final void L(boolean z) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.L(z);
        }
    }

    @Override // defpackage.i8l
    public final long L0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.L0();
        }
        return 0L;
    }

    @Override // defpackage.i8l
    public final void M() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.M();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    @Override // defpackage.i8l
    public final onh M0() {
        sis V = V();
        if (V.p()) {
            return null;
        }
        return V.m(v0(), this.a, 0L).c;
    }

    @Override // defpackage.i8l
    public final void N(int i) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.N(i);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // defpackage.i8l
    public final e3t O() {
        l1();
        jkh jkhVar = this.c;
        return jkhVar.isConnected() ? jkhVar.O() : e3t.b;
    }

    @Override // defpackage.i8l
    public final void P(dv1 dv1Var, boolean z) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.P(dv1Var, z);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override // defpackage.i8l
    public final void Q(hoh hohVar) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.Q(hohVar);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    @Override // defpackage.i8l
    public final int R() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.R();
        }
        return -1;
    }

    @Override // defpackage.i8l
    public final void S(boolean z) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.S(z);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // defpackage.i8l
    public final void T(onh onhVar) {
        l1();
        vq1.y(onhVar, "mediaItems must not be null");
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.T(onhVar);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.i8l
    public final int U() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.U();
        }
        return 0;
    }

    @Override // defpackage.i8l
    public final sis V() {
        l1();
        jkh jkhVar = this.c;
        return jkhVar.isConnected() ? jkhVar.V() : sis.a;
    }

    @Override // defpackage.i8l
    public final boolean V0(int i) {
        return f0().a(i);
    }

    @Override // defpackage.i8l
    public final void W(int i, onh onhVar) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.W(i, onhVar);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring replaceMediaItem().");
        }
    }

    @Override // defpackage.i8l
    public final boolean W0() {
        l1();
        sis V = V();
        return !V.p() && V.m(v0(), this.a, 0L).i;
    }

    @Override // defpackage.i8l
    public final Looper X() {
        return this.e.getLooper();
    }

    @Override // defpackage.i8l
    public final void Y() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.Y();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // defpackage.i8l
    public final w0t Z() {
        l1();
        jkh jkhVar = this.c;
        return !jkhVar.isConnected() ? w0t.F : jkhVar.Z();
    }

    @Override // defpackage.i8l
    public final void a() {
        String str;
        Handler handler = this.e;
        l1();
        if (this.b) {
            return;
        }
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.6.1] [");
        sb.append(dvt.b);
        sb.append("] [");
        HashSet hashSet = ynh.a;
        synchronized (ynh.class) {
            str = ynh.b;
        }
        sb.append(str);
        sb.append("]");
        vq1.Y("MediaController", sb.toString());
        this.b = true;
        handler.removeCallbacksAndMessages(null);
        try {
            this.c.a();
        } catch (Exception e) {
            vq1.I("MediaController", "Exception while releasing impl", e);
        }
        if (this.g) {
            vq1.A(Looper.myLooper() == handler.getLooper());
            this.d.g(this);
        } else {
            this.g = true;
            ykh ykhVar = this.h;
            ykhVar.getClass();
            ykhVar.m(new SecurityException("Session rejected the connection request."));
        }
    }

    @Override // defpackage.i8l
    public final void a0(int i, long j, List list) {
        l1();
        vq1.y(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            vq1.u("items must not contain null, index=" + i2, list.get(i2) != null);
        }
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.a0(i, j, list);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.i8l
    public final void b() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.b();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring pause().");
        }
    }

    @Override // defpackage.i8l
    public final void b0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.b0();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring seekToNext().");
        }
    }

    @Override // defpackage.i8l
    public final int c() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.c();
        }
        return 1;
    }

    @Override // defpackage.i8l
    public final int c0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.c0();
        }
        return 0;
    }

    @Override // defpackage.i8l
    public final void d() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.d();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring play().");
        }
    }

    @Override // defpackage.i8l
    public final long d0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.d0();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.i8l
    public final boolean d1() {
        l1();
        sis V = V();
        return !V.p() && V.m(v0(), this.a, 0L).h;
    }

    @Override // defpackage.i8l
    public final boolean e() {
        l1();
        jkh jkhVar = this.c;
        return jkhVar.isConnected() && jkhVar.e();
    }

    @Override // defpackage.i8l
    public final void e0(int i, long j) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.e0(i, j);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.i8l
    public final boolean f() {
        l1();
        jkh jkhVar = this.c;
        return jkhVar.isConnected() && jkhVar.f();
    }

    @Override // defpackage.i8l
    public final d8l f0() {
        l1();
        jkh jkhVar = this.c;
        return !jkhVar.isConnected() ? d8l.b : jkhVar.f0();
    }

    @Override // defpackage.i8l
    public final int g() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.g();
        }
        return 0;
    }

    @Override // defpackage.i8l
    public final boolean g0() {
        l1();
        jkh jkhVar = this.c;
        return jkhVar.isConnected() && jkhVar.g0();
    }

    @Override // defpackage.i8l
    public final long getDuration() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.i8l
    public final float getVolume() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.getVolume();
        }
        return 1.0f;
    }

    @Override // defpackage.i8l
    public final void h(Surface surface) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.h(surface);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setVideoSurface().");
        }
    }

    @Override // defpackage.i8l
    public final void h0(boolean z) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.h0(z);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    @Override // defpackage.i8l
    public final boolean h1() {
        l1();
        sis V = V();
        return !V.p() && V.m(v0(), this.a, 0L).a();
    }

    @Override // defpackage.i8l
    public final boolean i() {
        l1();
        jkh jkhVar = this.c;
        return jkhVar.isConnected() && jkhVar.i();
    }

    @Override // defpackage.i8l
    public final long i0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.i0();
        }
        return 0L;
    }

    public final void i1() {
        vq1.A(Looper.myLooper() == this.e.getLooper());
        vq1.A(!this.g);
        this.g = true;
        ykh ykhVar = this.h;
        ykhVar.j = true;
        kkh kkhVar = ykhVar.i;
        if (kkhVar != null) {
            ykhVar.l(kkhVar);
        }
    }

    @Override // defpackage.i8l
    public final void j(SurfaceView surfaceView) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.j(surfaceView);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setVideoSurfaceView().");
        }
    }

    @Override // defpackage.i8l
    public final void j0(f8l f8lVar) {
        vq1.y(f8lVar, "listener must not be null");
        this.c.j0(f8lVar);
    }

    public final void j1(Runnable runnable) {
        dvt.c0(this.e, runnable);
    }

    @Override // defpackage.i8l
    public final hzk k() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.k();
        }
        return null;
    }

    @Override // defpackage.i8l
    public final int k0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.k0();
        }
        return -1;
    }

    public final lcg k1(alp alpVar) {
        Bundle bundle = Bundle.EMPTY;
        l1();
        vq1.u("command must be a custom command", alpVar.a == 0);
        jkh jkhVar = this.c;
        return jkhVar.isConnected() ? jkhVar.P0(alpVar) : leu.S(new ump(-100));
    }

    @Override // defpackage.i8l
    public final sv6 l() {
        l1();
        jkh jkhVar = this.c;
        return jkhVar.isConnected() ? jkhVar.l() : sv6.c;
    }

    @Override // defpackage.i8l
    public final tcu l0() {
        l1();
        jkh jkhVar = this.c;
        return jkhVar.isConnected() ? jkhVar.l0() : tcu.d;
    }

    public final void l1() {
        vq1.z("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.e.getLooper());
    }

    @Override // defpackage.i8l
    public final p0l m() {
        l1();
        jkh jkhVar = this.c;
        return jkhVar.isConnected() ? jkhVar.m() : p0l.d;
    }

    @Override // defpackage.i8l
    public final dv1 m0() {
        l1();
        jkh jkhVar = this.c;
        return !jkhVar.isConnected() ? dv1.g : jkhVar.m0();
    }

    @Override // defpackage.i8l
    public final void n(TextureView textureView) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.n(textureView);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setVideoTextureView().");
        }
    }

    @Override // defpackage.i8l
    public final p08 n0() {
        l1();
        jkh jkhVar = this.c;
        return !jkhVar.isConnected() ? p08.e : jkhVar.n0();
    }

    @Override // defpackage.i8l
    public final long o() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.o();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.i8l
    public final void o0(int i, int i2) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.o0(i, i2);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // defpackage.i8l
    public final void p(TextureView textureView) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.p(textureView);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring clearVideoTextureView().");
        }
    }

    @Override // defpackage.i8l
    public final int p0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.p0();
        }
        return -1;
    }

    @Override // defpackage.i8l
    public final void q() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.q();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring prepare().");
        }
    }

    @Override // defpackage.i8l
    public final void q0(int i) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.q0(i);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.i8l
    public final void r(p0l p0lVar) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.r(p0lVar);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override // defpackage.i8l
    public final long r0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.r0();
        }
        return 0L;
    }

    @Override // defpackage.i8l
    public final void s(long j) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.s(j);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.i8l
    public final long s0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.s0();
        }
        return 0L;
    }

    @Override // defpackage.i8l
    public final void stop() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.stop();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring stop().");
        }
    }

    @Override // defpackage.i8l
    public final void t(float f) {
        l1();
        vq1.u("volume must be between 0 and 1", f >= 0.0f && f <= 1.0f);
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.t(f);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override // defpackage.i8l
    public final long t0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.t0();
        }
        return 0L;
    }

    @Override // defpackage.i8l
    public final void u(float f) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.u(f);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override // defpackage.i8l
    public final hoh u0() {
        l1();
        jkh jkhVar = this.c;
        return jkhVar.isConnected() ? jkhVar.u0() : hoh.K;
    }

    @Override // defpackage.i8l
    public final void v(SurfaceView surfaceView) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.v(surfaceView);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring clearVideoSurfaceView().");
        }
    }

    @Override // defpackage.i8l
    public final int v0() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.v0();
        }
        return -1;
    }

    @Override // defpackage.i8l
    public final long w() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            return jkhVar.w();
        }
        return 0L;
    }

    @Override // defpackage.i8l
    public final void w0(int i) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.w0(i);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override // defpackage.i8l
    public final void x(onh onhVar, long j) {
        l1();
        vq1.y(onhVar, "mediaItems must not be null");
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.x(onhVar, j);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // defpackage.i8l
    public final void x0(f8l f8lVar) {
        l1();
        vq1.y(f8lVar, "listener must not be null");
        this.c.x0(f8lVar);
    }

    @Override // defpackage.i8l
    public final void y() {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.y();
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring clearMediaItems().");
        }
    }

    @Override // defpackage.i8l
    public final void y0(int i, int i2) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.y0(i, i2);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring moveMediaItem().");
        }
    }

    @Override // defpackage.i8l
    public final void z0(int i, int i2, int i3) {
        l1();
        jkh jkhVar = this.c;
        if (jkhVar.isConnected()) {
            jkhVar.z0(i, i2, i3);
        } else {
            vq1.n0("MediaController", "The controller is not connected. Ignoring moveMediaItems().");
        }
    }
}
