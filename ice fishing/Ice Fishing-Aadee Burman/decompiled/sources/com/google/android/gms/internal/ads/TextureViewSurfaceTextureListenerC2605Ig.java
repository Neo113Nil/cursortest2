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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Ig, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC2605Ig extends AbstractC3952tg implements TextureView.SurfaceTextureListener, InterfaceC4168xg {

    /* renamed from: A, reason: collision with root package name */
    public Surface f25527A;

    /* renamed from: B, reason: collision with root package name */
    public C3414jh f25528B;

    /* renamed from: C, reason: collision with root package name */
    public String f25529C;

    /* renamed from: D, reason: collision with root package name */
    public String[] f25530D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f25531E;

    /* renamed from: F, reason: collision with root package name */
    public int f25532F;

    /* renamed from: G, reason: collision with root package name */
    public C2469Ag f25533G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f25534H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f25535I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public int f25536K;

    /* renamed from: L, reason: collision with root package name */
    public int f25537L;

    /* renamed from: M, reason: collision with root package name */
    public float f25538M;

    /* renamed from: v, reason: collision with root package name */
    public final C2555Fh f25539v;

    /* renamed from: w, reason: collision with root package name */
    public final C2503Cg f25540w;

    /* renamed from: x, reason: collision with root package name */
    public final C2486Bg f25541x;

    /* renamed from: y, reason: collision with root package name */
    public final C3153eo f25542y;

    /* renamed from: z, reason: collision with root package name */
    public C4114wg f25543z;

    public TextureViewSurfaceTextureListenerC2605Ig(Context context, C2503Cg c2503Cg, C2555Fh c2555Fh, boolean z3, C2486Bg c2486Bg, C3153eo c3153eo) {
        super(context);
        this.f25532F = 1;
        this.f25539v = c2555Fh;
        this.f25540w = c2503Cg;
        this.f25534H = z3;
        this.f25541x = c2486Bg;
        c2503Cg.a(this);
        this.f25542y = c3153eo;
    }

    public static String J(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        u1.h.i(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void A(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f25530D = new String[]{str};
        } else {
            this.f25530D = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f25529C;
        boolean z3 = false;
        if (this.f25541x.f23928k && str2 != null && !str.equals(str2) && this.f25532F == 4) {
            z3 = true;
        }
        this.f25529C = str;
        F(z3, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void B(int i) {
        C3414jh c3414jh = this.f25528B;
        if (c3414jh != null) {
            C3146eh c3146eh = c3414jh.f31291u;
            synchronized (c3146eh) {
                c3146eh.f29959b = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void C(int i) {
        C3414jh c3414jh = this.f25528B;
        if (c3414jh != null) {
            C3146eh c3146eh = c3414jh.f31291u;
            synchronized (c3146eh) {
                c3146eh.f29960c = i * 1000;
            }
        }
    }

    public final boolean D() {
        C3414jh c3414jh = this.f25528B;
        return (c3414jh == null || c3414jh.f31296z == null || this.f25531E) ? false : true;
    }

    public final boolean E() {
        return D() && this.f25532F != 1;
    }

    public final void F(boolean z3, Integer num) {
        AbstractC2839Wg abstractC2839Wg;
        C3414jh c3414jh = this.f25528B;
        if (c3414jh != null && !z3) {
            c3414jh.J = num;
            return;
        }
        if (this.f25529C == null || this.f25527A == null) {
            return;
        }
        if (z3) {
            if (!D()) {
                int i = u2.z.f41319b;
                v2.i.f("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                C4051vO c4051vO = c3414jh.f31296z;
                c4051vO.f34696w.b();
                c4051vO.f34695v.j2();
                G();
            }
        }
        if (this.f25529C.startsWith("cache:")) {
            C2555Fh c2555Fh = this.f25539v;
            String str = this.f25529C;
            ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = c2555Fh.f24817n;
            synchronized (viewTreeObserverOnGlobalLayoutListenerC2572Gh) {
                HashMap hashMap = viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25058E0;
                abstractC2839Wg = hashMap == null ? null : (AbstractC2839Wg) hashMap.get(str);
            }
            if (abstractC2839Wg instanceof C2986bh) {
                C2986bh c2986bh = (C2986bh) abstractC2839Wg;
                synchronized (c2986bh) {
                    c2986bh.f29308z = true;
                    c2986bh.notify();
                }
                C3414jh c3414jh2 = c2986bh.f29305w;
                c3414jh2.f31280C = null;
                c2986bh.f29305w = null;
                this.f25528B = c3414jh2;
                c3414jh2.J = num;
                if (c3414jh2.f31296z == null) {
                    int i6 = u2.z.f41319b;
                    v2.i.f("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(abstractC2839Wg instanceof C2887Zg)) {
                    String valueOf = String.valueOf(this.f25529C);
                    int i9 = u2.z.f41319b;
                    v2.i.f("Stream cache miss: ".concat(valueOf));
                    return;
                }
                C2887Zg c2887Zg = (C2887Zg) abstractC2839Wg;
                u2.D d2 = C4835j.f39730C.f39735c;
                C2555Fh c2555Fh2 = this.f25539v;
                d2.E(c2555Fh2.getContext(), c2555Fh2.f24817n.f25093x.f41388n);
                synchronized (c2887Zg.f28926D) {
                    try {
                        ByteBuffer byteBuffer = c2887Zg.f28924B;
                        if (byteBuffer != null && !c2887Zg.f28925C) {
                            byteBuffer.flip();
                            c2887Zg.f28925C = true;
                        }
                        c2887Zg.f28932y = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ByteBuffer byteBuffer2 = c2887Zg.f28924B;
                boolean z6 = c2887Zg.f28929G;
                String str2 = c2887Zg.f28930w;
                if (str2 == null) {
                    int i10 = u2.z.f41319b;
                    v2.i.f("Stream cache URL is null.");
                    return;
                }
                C2555Fh c2555Fh3 = this.f25539v;
                C3414jh c3414jh3 = new C3414jh(c2555Fh3.getContext(), this.f25541x, c2555Fh3, num);
                int i11 = u2.z.f41319b;
                v2.i.e("ExoPlayerAdapter initialized.");
                this.f25528B = c3414jh3;
                c3414jh3.u(new Uri[]{Uri.parse(str2)}, byteBuffer2, z6);
            }
        } else {
            C2555Fh c2555Fh4 = this.f25539v;
            C3414jh c3414jh4 = new C3414jh(c2555Fh4.getContext(), this.f25541x, c2555Fh4, num);
            int i12 = u2.z.f41319b;
            v2.i.e("ExoPlayerAdapter initialized.");
            this.f25528B = c3414jh4;
            u2.D d9 = C4835j.f39730C.f39735c;
            C2555Fh c2555Fh5 = this.f25539v;
            d9.E(c2555Fh5.getContext(), c2555Fh5.f24817n.f25093x.f41388n);
            Uri[] uriArr = new Uri[this.f25530D.length];
            int i13 = 0;
            while (true) {
                String[] strArr = this.f25530D;
                if (i13 >= strArr.length) {
                    break;
                }
                uriArr[i13] = Uri.parse(strArr[i13]);
                i13++;
            }
            C3414jh c3414jh5 = this.f25528B;
            c3414jh5.getClass();
            c3414jh5.u(uriArr, ByteBuffer.allocate(0), false);
        }
        this.f25528B.f31280C = this;
        H(this.f25527A);
        C4051vO c4051vO2 = this.f25528B.f31296z;
        if (c4051vO2 != null) {
            int u12 = c4051vO2.u1();
            this.f25532F = u12;
            if (u12 == 3) {
                I();
            }
        }
    }

    public final void G() {
        if (this.f25528B != null) {
            H(null);
            C3414jh c3414jh = this.f25528B;
            if (c3414jh != null) {
                c3414jh.f31280C = null;
                C4051vO c4051vO = c3414jh.f31296z;
                if (c4051vO != null) {
                    c4051vO.f34696w.b();
                    c4051vO.f34695v.U1(c3414jh);
                    C4051vO c4051vO2 = c3414jh.f31296z;
                    c4051vO2.f34696w.b();
                    c4051vO2.f34695v.V1();
                    c3414jh.f31296z = null;
                    C3414jh.f31277O.decrementAndGet();
                }
                this.f25528B = null;
            }
            this.f25532F = 1;
            this.f25531E = false;
            this.f25535I = false;
            this.J = false;
        }
    }

    public final void H(Surface surface) {
        C3414jh c3414jh = this.f25528B;
        if (c3414jh == null) {
            int i = u2.z.f41319b;
            v2.i.f("Trying to set surface before player is initialized.");
            return;
        }
        try {
            C4051vO c4051vO = c3414jh.f31296z;
            if (c4051vO != null) {
                c4051vO.f34696w.b();
                PN pn = c4051vO.f34695v;
                pn.P0();
                pn.f2(surface);
                int i6 = surface == null ? 0 : -1;
                pn.g2(i6, i6);
            }
        } catch (IOException e9) {
            int i9 = u2.z.f41319b;
            v2.i.g("", e9);
        }
    }

    public final void I() {
        if (this.f25535I) {
            return;
        }
        this.f25535I = true;
        u2.D.f41234l.post(new RunnableC2554Fg(this, 0));
        m();
        C2503Cg c2503Cg = this.f25540w;
        if (c2503Cg.i && !c2503Cg.f24192j) {
            AbstractC2968bG.j(c2503Cg.f24188e, c2503Cg.f24187d, "vfr2");
            c2503Cg.f24192j = true;
        }
        if (this.J) {
            h();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4168xg
    public final void T(int i) {
        C3414jh c3414jh;
        if (this.f25532F != i) {
            this.f25532F = i;
            if (i == 3) {
                I();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.f25541x.f23919a && (c3414jh = this.f25528B) != null) {
                c3414jh.r(false);
            }
            this.f25540w.f24195m = false;
            C2537Eg c2537Eg = this.f34329u;
            c2537Eg.f24640d = false;
            c2537Eg.a();
            u2.D.f41234l.post(new RunnableC2554Fg(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void a(int i) {
        C3414jh c3414jh = this.f25528B;
        if (c3414jh != null) {
            C3146eh c3146eh = c3414jh.f31291u;
            synchronized (c3146eh) {
                c3146eh.f29961d = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void b(int i) {
        C3414jh c3414jh = this.f25528B;
        if (c3414jh != null) {
            C3146eh c3146eh = c3414jh.f31291u;
            synchronized (c3146eh) {
                c3146eh.f29962e = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void c(int i) {
        C3414jh c3414jh = this.f25528B;
        if (c3414jh != null) {
            Iterator it = c3414jh.f31289M.iterator();
            while (it.hasNext()) {
                C3093dh c3093dh = (C3093dh) ((WeakReference) it.next()).get();
                if (c3093dh != null) {
                    c3093dh.f29816K = i;
                    Iterator it2 = c3093dh.f29817L.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(c3093dh.f29816K);
                            } catch (SocketException e9) {
                                int i6 = u2.z.f41319b;
                                v2.i.g("Failed to update receive buffer size.", e9);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final String d() {
        return "ExoPlayer/2".concat(true != this.f25534H ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void e(C4114wg c4114wg) {
        this.f25543z = c4114wg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void f(String str) {
        if (str != null) {
            A(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void g() {
        if (D()) {
            C4051vO c4051vO = this.f25528B.f31296z;
            c4051vO.f34696w.b();
            c4051vO.f34695v.j2();
            G();
        }
        C2503Cg c2503Cg = this.f25540w;
        c2503Cg.f24195m = false;
        C2537Eg c2537Eg = this.f34329u;
        c2537Eg.f24640d = false;
        c2537Eg.a();
        c2503Cg.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void h() {
        C3414jh c3414jh;
        if (!E()) {
            this.J = true;
            return;
        }
        if (this.f25541x.f23919a && (c3414jh = this.f25528B) != null) {
            c3414jh.r(true);
        }
        C4051vO c4051vO = this.f25528B.f31296z;
        c4051vO.f34696w.b();
        c4051vO.f34695v.i2(true);
        this.f25540w.d();
        C2537Eg c2537Eg = this.f34329u;
        c2537Eg.f24640d = true;
        c2537Eg.a();
        this.f34328n.f35193c = true;
        u2.D.f41234l.post(new RunnableC2554Fg(this, 3));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void i() {
        C3414jh c3414jh;
        if (E()) {
            if (this.f25541x.f23919a && (c3414jh = this.f25528B) != null) {
                c3414jh.r(false);
            }
            C4051vO c4051vO = this.f25528B.f31296z;
            c4051vO.f34696w.b();
            c4051vO.f34695v.i2(false);
            this.f25540w.f24195m = false;
            C2537Eg c2537Eg = this.f34329u;
            c2537Eg.f24640d = false;
            c2537Eg.a();
            u2.D.f41234l.post(new RunnableC2554Fg(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int j() {
        if (E()) {
            return (int) this.f25528B.f31296z.T1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int k() {
        if (E()) {
            return (int) this.f25528B.f31296z.U1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void l(int i) {
        if (E()) {
            long j6 = i;
            C4051vO c4051vO = this.f25528B.f31296z;
            c4051vO.c0(c4051vO.J1(), j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2520Dg
    public final void m() {
        u2.D.f41234l.post(new RunnableC2554Fg(this, 7));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void n(float f3, float f9) {
        C2469Ag c2469Ag = this.f25533G;
        if (c2469Ag != null) {
            c2469Ag.c(f3, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int o() {
        return this.f25536K;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = this.f25538M;
        if (f3 != 0.0f && this.f25533G == null) {
            float f9 = measuredWidth;
            float f10 = f9 / measuredHeight;
            if (f3 > f10) {
                measuredHeight = (int) (f9 / f3);
            }
            if (f3 < f10) {
                measuredWidth = (int) (measuredHeight * f3);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        C2469Ag c2469Ag = this.f25533G;
        if (c2469Ag != null) {
            c2469Ag.a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i6) {
        C3414jh c3414jh;
        float f3;
        int i9;
        SurfaceTexture surfaceTexture2;
        C3153eo c3153eo;
        if (this.f25534H) {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Qe)).booleanValue() && (c3153eo = this.f25542y) != null) {
                S0.e a9 = c3153eo.a();
                a9.v(NativeAdvancedJsUtils.f17906p, "svp_aepv");
                a9.y();
            }
            C2469Ag c2469Ag = new C2469Ag(getContext());
            this.f25533G = c2469Ag;
            c2469Ag.f23694F = i;
            c2469Ag.f23693E = i6;
            c2469Ag.f23696H = surfaceTexture;
            c2469Ag.start();
            if (c2469Ag.f23696H == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    c2469Ag.f23700M.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = c2469Ag.f23695G;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f25533G.b();
                this.f25533G = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f25527A = surface;
        if (this.f25528B == null) {
            F(false, null);
        } else {
            H(surface);
            if (!this.f25541x.f23919a && (c3414jh = this.f25528B) != null) {
                c3414jh.r(true);
            }
        }
        int i10 = this.f25536K;
        if (i10 == 0 || (i9 = this.f25537L) == 0) {
            f3 = i6 > 0 ? i / i6 : 1.0f;
            if (this.f25538M != f3) {
                this.f25538M = f3;
                requestLayout();
            }
        } else {
            f3 = i9 > 0 ? i10 / i9 : 1.0f;
            if (this.f25538M != f3) {
                this.f25538M = f3;
                requestLayout();
            }
        }
        u2.D.f41234l.post(new RunnableC2554Fg(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i();
        C2469Ag c2469Ag = this.f25533G;
        if (c2469Ag != null) {
            c2469Ag.b();
            this.f25533G = null;
        }
        C3414jh c3414jh = this.f25528B;
        if (c3414jh != null) {
            if (c3414jh != null) {
                c3414jh.r(false);
            }
            Surface surface = this.f25527A;
            if (surface != null) {
                surface.release();
            }
            this.f25527A = null;
            H(null);
        }
        u2.D.f41234l.post(new RunnableC2554Fg(this, 6));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i6) {
        C2469Ag c2469Ag = this.f25533G;
        if (c2469Ag != null) {
            c2469Ag.a(i, i6);
        }
        u2.D.f41234l.post(new RunnableC3844rg(this, i, i6, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f25540w.c(this);
        this.f34328n.a(surfaceTexture, this.f25543z);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        u2.z.k(sb.toString());
        u2.D.f41234l.post(new L.a(this, i, 8));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int p() {
        return this.f25537L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4168xg
    public final void q() {
        u2.D.f41234l.post(new RunnableC2554Fg(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4168xg
    public final void r(long j6, boolean z3) {
        if (this.f25539v != null) {
            AbstractC3413jg.f31273f.execute(new RunnableC2588Hg(this, z3, j6, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4168xg
    public final void s(int i, int i6) {
        this.f25536K = i;
        this.f25537L = i6;
        float f3 = i6 > 0 ? i / i6 : 1.0f;
        if (this.f25538M != f3) {
            this.f25538M = f3;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4168xg
    public final void t(String str, Exception exc) {
        C3414jh c3414jh;
        String J = J(str, exc);
        String concat = "ExoPlayerAdapter error: ".concat(J);
        int i = u2.z.f41319b;
        v2.i.f(concat);
        int i6 = 1;
        this.f25531E = true;
        if (this.f25541x.f23919a && (c3414jh = this.f25528B) != null) {
            c3414jh.r(false);
        }
        u2.D.f41234l.post(new RunnableC2571Gg(this, J, i6));
        C4835j.f39730C.f39740h.e("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4168xg
    public final void u(IOException iOException) {
        String J = J("onLoadException", iOException);
        String concat = "ExoPlayerAdapter exception: ".concat(J);
        int i = u2.z.f41319b;
        v2.i.f(concat);
        C4835j.f39730C.f39740h.e("AdExoPlayerView.onException", iOException);
        u2.D.f41234l.post(new RunnableC2571Gg(this, J, 0));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final long v() {
        C3414jh c3414jh = this.f25528B;
        if (c3414jh == null) {
            return -1L;
        }
        if (c3414jh.f31288L == null || !c3414jh.f31288L.f30295I) {
            return c3414jh.f31281D;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final long w() {
        C3414jh c3414jh = this.f25528B;
        if (c3414jh != null) {
            return c3414jh.p();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final long x() {
        C3414jh c3414jh = this.f25528B;
        if (c3414jh != null) {
            return c3414jh.q();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int y() {
        C3414jh c3414jh = this.f25528B;
        if (c3414jh != null) {
            return c3414jh.f31282E;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final Integer z() {
        C3414jh c3414jh = this.f25528B;
        if (c3414jh != null) {
            return c3414jh.J;
        }
        return null;
    }
}
