package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import r2.C4906k;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.Ig, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC2625Ig extends AbstractC3975tg implements TextureView.SurfaceTextureListener, InterfaceC4191xg {

    /* renamed from: A, reason: collision with root package name */
    public Surface f26276A;

    /* renamed from: B, reason: collision with root package name */
    public C3437jh f26277B;

    /* renamed from: C, reason: collision with root package name */
    public String f26278C;

    /* renamed from: D, reason: collision with root package name */
    public String[] f26279D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f26280E;

    /* renamed from: F, reason: collision with root package name */
    public int f26281F;

    /* renamed from: G, reason: collision with root package name */
    public C2489Ag f26282G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f26283H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f26284I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public int f26285K;

    /* renamed from: L, reason: collision with root package name */
    public int f26286L;

    /* renamed from: M, reason: collision with root package name */
    public float f26287M;

    /* renamed from: v, reason: collision with root package name */
    public final C2575Fh f26288v;

    /* renamed from: w, reason: collision with root package name */
    public final C2523Cg f26289w;

    /* renamed from: x, reason: collision with root package name */
    public final C2506Bg f26290x;

    /* renamed from: y, reason: collision with root package name */
    public final C3230fo f26291y;

    /* renamed from: z, reason: collision with root package name */
    public C4137wg f26292z;

    public TextureViewSurfaceTextureListenerC2625Ig(Context context, C2523Cg c2523Cg, C2575Fh c2575Fh, boolean z6, C2506Bg c2506Bg, C3230fo c3230fo) {
        super(context);
        this.f26281F = 1;
        this.f26288v = c2575Fh;
        this.f26289w = c2523Cg;
        this.f26283H = z6;
        this.f26290x = c2506Bg;
        c2523Cg.a(this);
        this.f26291y = c3230fo;
    }

    public static String J(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        AbstractC5128c.h(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void A(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f26279D = new String[]{str};
        } else {
            this.f26279D = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f26278C;
        boolean z6 = false;
        if (this.f26290x.f24701k && str2 != null && !str.equals(str2) && this.f26281F == 4) {
            z6 = true;
        }
        this.f26278C = str;
        F(z6, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void B(int i) {
        C3437jh c3437jh = this.f26277B;
        if (c3437jh != null) {
            C3169eh c3169eh = c3437jh.f32078u;
            synchronized (c3169eh) {
                c3169eh.f30750b = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void C(int i) {
        C3437jh c3437jh = this.f26277B;
        if (c3437jh != null) {
            C3169eh c3169eh = c3437jh.f32078u;
            synchronized (c3169eh) {
                c3169eh.f30751c = i * 1000;
            }
        }
    }

    public final boolean D() {
        C3437jh c3437jh = this.f26277B;
        return (c3437jh == null || c3437jh.f32083z == null || this.f26280E) ? false : true;
    }

    public final boolean E() {
        return D() && this.f26281F != 1;
    }

    public final void F(boolean z6, Integer num) {
        AbstractC2862Wg abstractC2862Wg;
        C3437jh c3437jh = this.f26277B;
        if (c3437jh != null && !z6) {
            c3437jh.J = num;
            return;
        }
        if (this.f26278C == null || this.f26276A == null) {
            return;
        }
        if (z6) {
            if (!D()) {
                int i = w2.z.f41712b;
                x2.i.f("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                C4074vO c4074vO = c3437jh.f32083z;
                c4074vO.f35459w.b();
                c4074vO.f35458v.j2();
                G();
            }
        }
        if (this.f26278C.startsWith("cache:")) {
            C2575Fh c2575Fh = this.f26288v;
            String str = this.f26278C;
            ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = c2575Fh.f25606n;
            synchronized (viewTreeObserverOnGlobalLayoutListenerC2592Gh) {
                HashMap hashMap = viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25885z0;
                abstractC2862Wg = hashMap == null ? null : (AbstractC2862Wg) hashMap.get(str);
            }
            if (abstractC2862Wg instanceof C3009bh) {
                C3009bh c3009bh = (C3009bh) abstractC2862Wg;
                synchronized (c3009bh) {
                    c3009bh.f30097z = true;
                    c3009bh.notify();
                }
                C3437jh c3437jh2 = c3009bh.f30094w;
                c3437jh2.f32067C = null;
                c3009bh.f30094w = null;
                this.f26277B = c3437jh2;
                c3437jh2.J = num;
                if (c3437jh2.f32083z == null) {
                    int i4 = w2.z.f41712b;
                    x2.i.f("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(abstractC2862Wg instanceof C2910Zg)) {
                    String valueOf = String.valueOf(this.f26278C);
                    int i6 = w2.z.f41712b;
                    x2.i.f("Stream cache miss: ".concat(valueOf));
                    return;
                }
                C2910Zg c2910Zg = (C2910Zg) abstractC2862Wg;
                w2.D d9 = C4906k.f40186C.f40191c;
                C2575Fh c2575Fh2 = this.f26288v;
                d9.E(c2575Fh2.getContext(), c2575Fh2.f25606n.f25880x.f41845n);
                synchronized (c2910Zg.f29703D) {
                    try {
                        ByteBuffer byteBuffer = c2910Zg.f29701B;
                        if (byteBuffer != null && !c2910Zg.f29702C) {
                            byteBuffer.flip();
                            c2910Zg.f29702C = true;
                        }
                        c2910Zg.f29709y = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ByteBuffer byteBuffer2 = c2910Zg.f29701B;
                boolean z9 = c2910Zg.f29706G;
                String str2 = c2910Zg.f29707w;
                if (str2 == null) {
                    int i9 = w2.z.f41712b;
                    x2.i.f("Stream cache URL is null.");
                    return;
                }
                C2575Fh c2575Fh3 = this.f26288v;
                C3437jh c3437jh3 = new C3437jh(c2575Fh3.getContext(), this.f26290x, c2575Fh3, num);
                int i10 = w2.z.f41712b;
                x2.i.e("ExoPlayerAdapter initialized.");
                this.f26277B = c3437jh3;
                c3437jh3.u(new Uri[]{Uri.parse(str2)}, byteBuffer2, z9);
            }
        } else {
            C2575Fh c2575Fh4 = this.f26288v;
            C3437jh c3437jh4 = new C3437jh(c2575Fh4.getContext(), this.f26290x, c2575Fh4, num);
            int i11 = w2.z.f41712b;
            x2.i.e("ExoPlayerAdapter initialized.");
            this.f26277B = c3437jh4;
            w2.D d10 = C4906k.f40186C.f40191c;
            C2575Fh c2575Fh5 = this.f26288v;
            d10.E(c2575Fh5.getContext(), c2575Fh5.f25606n.f25880x.f41845n);
            Uri[] uriArr = new Uri[this.f26279D.length];
            int i12 = 0;
            while (true) {
                String[] strArr = this.f26279D;
                if (i12 >= strArr.length) {
                    break;
                }
                uriArr[i12] = Uri.parse(strArr[i12]);
                i12++;
            }
            C3437jh c3437jh5 = this.f26277B;
            c3437jh5.getClass();
            c3437jh5.u(uriArr, ByteBuffer.allocate(0), false);
        }
        this.f26277B.f32067C = this;
        H(this.f26276A);
        C4074vO c4074vO2 = this.f26277B.f32083z;
        if (c4074vO2 != null) {
            int u12 = c4074vO2.u1();
            this.f26281F = u12;
            if (u12 == 3) {
                I();
            }
        }
    }

    public final void G() {
        if (this.f26277B != null) {
            H(null);
            C3437jh c3437jh = this.f26277B;
            if (c3437jh != null) {
                c3437jh.f32067C = null;
                C4074vO c4074vO = c3437jh.f32083z;
                if (c4074vO != null) {
                    c4074vO.f35459w.b();
                    c4074vO.f35458v.U1(c3437jh);
                    C4074vO c4074vO2 = c3437jh.f32083z;
                    c4074vO2.f35459w.b();
                    c4074vO2.f35458v.V1();
                    c3437jh.f32083z = null;
                    C3437jh.f32064O.decrementAndGet();
                }
                this.f26277B = null;
            }
            this.f26281F = 1;
            this.f26280E = false;
            this.f26284I = false;
            this.J = false;
        }
    }

    public final void H(Surface surface) {
        C3437jh c3437jh = this.f26277B;
        if (c3437jh == null) {
            int i = w2.z.f41712b;
            x2.i.f("Trying to set surface before player is initialized.");
            return;
        }
        try {
            C4074vO c4074vO = c3437jh.f32083z;
            if (c4074vO != null) {
                c4074vO.f35459w.b();
                PN pn = c4074vO.f35458v;
                pn.O0();
                pn.f2(surface);
                int i4 = surface == null ? 0 : -1;
                pn.g2(i4, i4);
            }
        } catch (IOException e9) {
            int i6 = w2.z.f41712b;
            x2.i.g("", e9);
        }
    }

    public final void I() {
        if (this.f26284I) {
            return;
        }
        this.f26284I = true;
        w2.D.f41627l.post(new RunnableC2574Fg(this, 0));
        m();
        C2523Cg c2523Cg = this.f26289w;
        if (c2523Cg.i && !c2523Cg.f24927j) {
            AbstractC2991bG.j(c2523Cg.f24923e, c2523Cg.f24922d, "vfr2");
            c2523Cg.f24927j = true;
        }
        if (this.J) {
            h();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4191xg
    public final void T(int i) {
        C3437jh c3437jh;
        if (this.f26281F != i) {
            this.f26281F = i;
            if (i == 3) {
                I();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.f26290x.f24692a && (c3437jh = this.f26277B) != null) {
                c3437jh.r(false);
            }
            this.f26289w.f24930m = false;
            C2557Eg c2557Eg = this.f35108u;
            c2557Eg.f25393d = false;
            c2557Eg.a();
            w2.D.f41627l.post(new RunnableC2574Fg(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void a(int i) {
        C3437jh c3437jh = this.f26277B;
        if (c3437jh != null) {
            C3169eh c3169eh = c3437jh.f32078u;
            synchronized (c3169eh) {
                c3169eh.f30752d = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void b(int i) {
        C3437jh c3437jh = this.f26277B;
        if (c3437jh != null) {
            C3169eh c3169eh = c3437jh.f32078u;
            synchronized (c3169eh) {
                c3169eh.f30753e = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void c(int i) {
        C3437jh c3437jh = this.f26277B;
        if (c3437jh != null) {
            Iterator it = c3437jh.f32076M.iterator();
            while (it.hasNext()) {
                C3116dh c3116dh = (C3116dh) ((WeakReference) it.next()).get();
                if (c3116dh != null) {
                    c3116dh.f30589K = i;
                    Iterator it2 = c3116dh.f30590L.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(c3116dh.f30589K);
                            } catch (SocketException e9) {
                                int i4 = w2.z.f41712b;
                                x2.i.g("Failed to update receive buffer size.", e9);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final String d() {
        return "ExoPlayer/2".concat(true != this.f26283H ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void e(C4137wg c4137wg) {
        this.f26292z = c4137wg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void f(String str) {
        if (str != null) {
            A(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void g() {
        if (D()) {
            C4074vO c4074vO = this.f26277B.f32083z;
            c4074vO.f35459w.b();
            c4074vO.f35458v.j2();
            G();
        }
        C2523Cg c2523Cg = this.f26289w;
        c2523Cg.f24930m = false;
        C2557Eg c2557Eg = this.f35108u;
        c2557Eg.f25393d = false;
        c2557Eg.a();
        c2523Cg.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void h() {
        C3437jh c3437jh;
        if (!E()) {
            this.J = true;
            return;
        }
        if (this.f26290x.f24692a && (c3437jh = this.f26277B) != null) {
            c3437jh.r(true);
        }
        C4074vO c4074vO = this.f26277B.f32083z;
        c4074vO.f35459w.b();
        c4074vO.f35458v.i2(true);
        this.f26289w.d();
        C2557Eg c2557Eg = this.f35108u;
        c2557Eg.f25393d = true;
        c2557Eg.a();
        this.f35107n.f35983c = true;
        w2.D.f41627l.post(new RunnableC2574Fg(this, 3));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void i() {
        C3437jh c3437jh;
        if (E()) {
            if (this.f26290x.f24692a && (c3437jh = this.f26277B) != null) {
                c3437jh.r(false);
            }
            C4074vO c4074vO = this.f26277B.f32083z;
            c4074vO.f35459w.b();
            c4074vO.f35458v.i2(false);
            this.f26289w.f24930m = false;
            C2557Eg c2557Eg = this.f35108u;
            c2557Eg.f25393d = false;
            c2557Eg.a();
            w2.D.f41627l.post(new RunnableC2574Fg(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int j() {
        if (E()) {
            return (int) this.f26277B.f32083z.T1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int k() {
        if (E()) {
            return (int) this.f26277B.f32083z.U1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void l(int i) {
        if (E()) {
            long j6 = i;
            C4074vO c4074vO = this.f26277B.f32083z;
            c4074vO.c0(c4074vO.K1(), j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540Dg
    public final void m() {
        w2.D.f41627l.post(new RunnableC2574Fg(this, 7));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void n(float f2, float f9) {
        C2489Ag c2489Ag = this.f26282G;
        if (c2489Ag != null) {
            c2489Ag.c(f2, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int o() {
        return this.f26285K;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = this.f26287M;
        if (f2 != 0.0f && this.f26282G == null) {
            float f9 = measuredWidth;
            float f10 = f9 / measuredHeight;
            if (f2 > f10) {
                measuredHeight = (int) (f9 / f2);
            }
            if (f2 < f10) {
                measuredWidth = (int) (measuredHeight * f2);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        C2489Ag c2489Ag = this.f26282G;
        if (c2489Ag != null) {
            c2489Ag.a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i4) {
        C3437jh c3437jh;
        float f2;
        int i6;
        SurfaceTexture surfaceTexture2;
        C3230fo c3230fo;
        if (this.f26283H) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Qe)).booleanValue() && (c3230fo = this.f26291y) != null) {
                S0.e a9 = c3230fo.a();
                a9.M(NativeAdvancedJsUtils.f18693p, "svp_aepv");
                a9.N();
            }
            C2489Ag c2489Ag = new C2489Ag(getContext());
            this.f26282G = c2489Ag;
            c2489Ag.f24476F = i;
            c2489Ag.f24475E = i4;
            c2489Ag.f24478H = surfaceTexture;
            c2489Ag.start();
            if (c2489Ag.f24478H == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    c2489Ag.f24482M.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = c2489Ag.f24477G;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f26282G.b();
                this.f26282G = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f26276A = surface;
        if (this.f26277B == null) {
            F(false, null);
        } else {
            H(surface);
            if (!this.f26290x.f24692a && (c3437jh = this.f26277B) != null) {
                c3437jh.r(true);
            }
        }
        int i9 = this.f26285K;
        if (i9 == 0 || (i6 = this.f26286L) == 0) {
            f2 = i4 > 0 ? i / i4 : 1.0f;
            if (this.f26287M != f2) {
                this.f26287M = f2;
                requestLayout();
            }
        } else {
            f2 = i6 > 0 ? i9 / i6 : 1.0f;
            if (this.f26287M != f2) {
                this.f26287M = f2;
                requestLayout();
            }
        }
        w2.D.f41627l.post(new RunnableC2574Fg(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i();
        C2489Ag c2489Ag = this.f26282G;
        if (c2489Ag != null) {
            c2489Ag.b();
            this.f26282G = null;
        }
        C3437jh c3437jh = this.f26277B;
        if (c3437jh != null) {
            if (c3437jh != null) {
                c3437jh.r(false);
            }
            Surface surface = this.f26276A;
            if (surface != null) {
                surface.release();
            }
            this.f26276A = null;
            H(null);
        }
        w2.D.f41627l.post(new RunnableC2574Fg(this, 6));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i4) {
        C2489Ag c2489Ag = this.f26282G;
        if (c2489Ag != null) {
            c2489Ag.a(i, i4);
        }
        w2.D.f41627l.post(new RunnableC3867rg(this, i, i4, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f26289w.c(this);
        this.f35107n.a(surfaceTexture, this.f26292z);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        w2.z.k(sb.toString());
        w2.D.f41627l.post(new L.a(this, i, 8));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int p() {
        return this.f26286L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4191xg
    public final void q() {
        w2.D.f41627l.post(new RunnableC2574Fg(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4191xg
    public final void r(long j6, boolean z6) {
        if (this.f26288v != null) {
            AbstractC3436jg.f32060f.execute(new RunnableC2608Hg(this, z6, j6, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4191xg
    public final void s(int i, int i4) {
        this.f26285K = i;
        this.f26286L = i4;
        float f2 = i4 > 0 ? i / i4 : 1.0f;
        if (this.f26287M != f2) {
            this.f26287M = f2;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4191xg
    public final void t(String str, Exception exc) {
        C3437jh c3437jh;
        String J = J(str, exc);
        String concat = "ExoPlayerAdapter error: ".concat(J);
        int i = w2.z.f41712b;
        x2.i.f(concat);
        int i4 = 1;
        this.f26280E = true;
        if (this.f26290x.f24692a && (c3437jh = this.f26277B) != null) {
            c3437jh.r(false);
        }
        w2.D.f41627l.post(new RunnableC2591Gg(this, J, i4));
        C4906k.f40186C.f40196h.e("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4191xg
    public final void u(IOException iOException) {
        String J = J("onLoadException", iOException);
        String concat = "ExoPlayerAdapter exception: ".concat(J);
        int i = w2.z.f41712b;
        x2.i.f(concat);
        C4906k.f40186C.f40196h.e("AdExoPlayerView.onException", iOException);
        w2.D.f41627l.post(new RunnableC2591Gg(this, J, 0));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final long v() {
        C3437jh c3437jh = this.f26277B;
        if (c3437jh == null) {
            return -1L;
        }
        if (c3437jh.f32075L == null || !c3437jh.f32075L.f31083I) {
            return c3437jh.f32068D;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final long w() {
        C3437jh c3437jh = this.f26277B;
        if (c3437jh != null) {
            return c3437jh.p();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final long x() {
        C3437jh c3437jh = this.f26277B;
        if (c3437jh != null) {
            return c3437jh.q();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int y() {
        C3437jh c3437jh = this.f26277B;
        if (c3437jh != null) {
            return c3437jh.f32069E;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final Integer z() {
        C3437jh c3437jh = this.f26277B;
        if (c3437jh != null) {
            return c3437jh.J;
        }
        return null;
    }
}
