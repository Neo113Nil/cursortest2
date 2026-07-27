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
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.Fg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC2553Fg extends AbstractC3804qg implements TextureView.SurfaceTextureListener, InterfaceC4019ug {

    /* renamed from: A, reason: collision with root package name */
    public Surface f24975A;

    /* renamed from: B, reason: collision with root package name */
    public C3267gh f24976B;

    /* renamed from: C, reason: collision with root package name */
    public String f24977C;

    /* renamed from: D, reason: collision with root package name */
    public String[] f24978D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f24979E;

    /* renamed from: F, reason: collision with root package name */
    public int f24980F;

    /* renamed from: G, reason: collision with root package name */
    public C4181xg f24981G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f24982H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f24983I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public int f24984K;

    /* renamed from: L, reason: collision with root package name */
    public int f24985L;

    /* renamed from: M, reason: collision with root package name */
    public float f24986M;

    /* renamed from: v, reason: collision with root package name */
    public final C2486Bh f24987v;

    /* renamed from: w, reason: collision with root package name */
    public final C4289zg f24988w;

    /* renamed from: x, reason: collision with root package name */
    public final C4235yg f24989x;

    /* renamed from: y, reason: collision with root package name */
    public final C3165eo f24990y;

    /* renamed from: z, reason: collision with root package name */
    public C3965tg f24991z;

    public TextureViewSurfaceTextureListenerC2553Fg(Context context, C4289zg c4289zg, C2486Bh c2486Bh, boolean z8, C4235yg c4235yg, C3165eo c3165eo) {
        super(context);
        this.f24980F = 1;
        this.f24987v = c2486Bh;
        this.f24988w = c4289zg;
        this.f24982H = z8;
        this.f24989x = c4235yg;
        c4289zg.a(this);
        this.f24990y = c3165eo;
    }

    public static String J(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        AbstractC5051n.j(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void A(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f24978D = new String[]{str};
        } else {
            this.f24978D = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f24977C;
        boolean z8 = false;
        if (this.f24989x.f35372k && str2 != null && !str.equals(str2) && this.f24980F == 4) {
            z8 = true;
        }
        this.f24977C = str;
        F(z8, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void B(int i) {
        C3267gh c3267gh = this.f24976B;
        if (c3267gh != null) {
            C2940ah c2940ah = c3267gh.f31049u;
            synchronized (c2940ah) {
                c2940ah.f29256b = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void C(int i) {
        C3267gh c3267gh = this.f24976B;
        if (c3267gh != null) {
            C2940ah c2940ah = c3267gh.f31049u;
            synchronized (c2940ah) {
                c2940ah.f29257c = i * 1000;
            }
        }
    }

    public final boolean D() {
        C3267gh c3267gh = this.f24976B;
        return (c3267gh == null || c3267gh.f31054z == null || this.f24979E) ? false : true;
    }

    public final boolean E() {
        return D() && this.f24980F != 1;
    }

    public final void F(boolean z8, Integer num) {
        AbstractC2791Tg abstractC2791Tg;
        C3267gh c3267gh = this.f24976B;
        if (c3267gh != null && !z8) {
            c3267gh.J = num;
            return;
        }
        if (this.f24977C == null || this.f24975A == null) {
            return;
        }
        if (z8) {
            if (!D()) {
                int i = t2.C.f40822b;
                u2.i.f("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                IO io = c3267gh.f31054z;
                io.f25557w.b();
                io.f25556v.q();
                G();
            }
        }
        if (this.f24977C.startsWith("cache:")) {
            C2486Bh c2486Bh = this.f24987v;
            String str = this.f24977C;
            ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = c2486Bh.f24059n;
            synchronized (viewTreeObserverOnGlobalLayoutListenerC2520Dh) {
                HashMap hashMap = viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24469E0;
                abstractC2791Tg = hashMap == null ? null : (AbstractC2791Tg) hashMap.get(str);
            }
            if (abstractC2791Tg instanceof C2859Xg) {
                C2859Xg c2859Xg = (C2859Xg) abstractC2791Tg;
                synchronized (c2859Xg) {
                    c2859Xg.f28667z = true;
                    c2859Xg.notify();
                }
                C3267gh c3267gh2 = c2859Xg.f28664w;
                c3267gh2.f31038C = null;
                c2859Xg.f28664w = null;
                this.f24976B = c3267gh2;
                c3267gh2.J = num;
                if (c3267gh2.f31054z == null) {
                    int i4 = t2.C.f40822b;
                    u2.i.f("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(abstractC2791Tg instanceof C2842Wg)) {
                    String valueOf = String.valueOf(this.f24977C);
                    int i9 = t2.C.f40822b;
                    u2.i.f("Stream cache miss: ".concat(valueOf));
                    return;
                }
                C2842Wg c2842Wg = (C2842Wg) abstractC2791Tg;
                t2.G g9 = p2.j.f39798C.f39803c;
                C2486Bh c2486Bh2 = this.f24987v;
                g9.E(c2486Bh2.getContext(), c2486Bh2.f24059n.f24504x.f41217n);
                synchronized (c2842Wg.f28432D) {
                    try {
                        ByteBuffer byteBuffer = c2842Wg.f28430B;
                        if (byteBuffer != null && !c2842Wg.f28431C) {
                            byteBuffer.flip();
                            c2842Wg.f28431C = true;
                        }
                        c2842Wg.f28438y = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ByteBuffer byteBuffer2 = c2842Wg.f28430B;
                boolean z9 = c2842Wg.f28435G;
                String str2 = c2842Wg.f28436w;
                if (str2 == null) {
                    int i10 = t2.C.f40822b;
                    u2.i.f("Stream cache URL is null.");
                    return;
                }
                C2486Bh c2486Bh3 = this.f24987v;
                C3267gh c3267gh3 = new C3267gh(c2486Bh3.getContext(), this.f24989x, c2486Bh3, num);
                int i11 = t2.C.f40822b;
                u2.i.e("ExoPlayerAdapter initialized.");
                this.f24976B = c3267gh3;
                c3267gh3.u(new Uri[]{Uri.parse(str2)}, byteBuffer2, z9);
            }
        } else {
            C2486Bh c2486Bh4 = this.f24987v;
            C3267gh c3267gh4 = new C3267gh(c2486Bh4.getContext(), this.f24989x, c2486Bh4, num);
            int i12 = t2.C.f40822b;
            u2.i.e("ExoPlayerAdapter initialized.");
            this.f24976B = c3267gh4;
            t2.G g10 = p2.j.f39798C.f39803c;
            C2486Bh c2486Bh5 = this.f24987v;
            g10.E(c2486Bh5.getContext(), c2486Bh5.f24059n.f24504x.f41217n);
            Uri[] uriArr = new Uri[this.f24978D.length];
            int i13 = 0;
            while (true) {
                String[] strArr = this.f24978D;
                if (i13 >= strArr.length) {
                    break;
                }
                uriArr[i13] = Uri.parse(strArr[i13]);
                i13++;
            }
            C3267gh c3267gh5 = this.f24976B;
            c3267gh5.getClass();
            c3267gh5.u(uriArr, ByteBuffer.allocate(0), false);
        }
        this.f24976B.f31038C = this;
        H(this.f24975A);
        IO io2 = this.f24976B.f31054z;
        if (io2 != null) {
            int m12 = io2.m1();
            this.f24980F = m12;
            if (m12 == 3) {
                I();
            }
        }
    }

    public final void G() {
        if (this.f24976B != null) {
            H(null);
            C3267gh c3267gh = this.f24976B;
            if (c3267gh != null) {
                c3267gh.f31038C = null;
                IO io = c3267gh.f31054z;
                if (io != null) {
                    io.f25557w.b();
                    io.f25556v.x1(c3267gh);
                    IO io2 = c3267gh.f31054z;
                    io2.f25557w.b();
                    io2.f25556v.z1();
                    c3267gh.f31054z = null;
                    C3267gh.f31035O.decrementAndGet();
                }
                this.f24976B = null;
            }
            this.f24980F = 1;
            this.f24979E = false;
            this.f24983I = false;
            this.J = false;
        }
    }

    public final void H(Surface surface) {
        C3267gh c3267gh = this.f24976B;
        if (c3267gh == null) {
            int i = t2.C.f40822b;
            u2.i.f("Trying to set surface before player is initialized.");
            return;
        }
        try {
            IO io = c3267gh.f31054z;
            if (io != null) {
                io.f25557w.b();
                C3093dO c3093dO = io.f25556v;
                c3093dO.P0();
                c3093dO.J1(surface);
                int i4 = surface == null ? 0 : -1;
                c3093dO.L1(i4, i4);
            }
        } catch (IOException e6) {
            int i9 = t2.C.f40822b;
            u2.i.g("", e6);
        }
    }

    public final void I() {
        if (this.f24983I) {
            return;
        }
        this.f24983I = true;
        t2.G.f40858l.post(new RunnableC2502Cg(this, 0));
        n();
        C4289zg c4289zg = this.f24988w;
        if (c4289zg.i && !c4289zg.f35591j) {
            AbstractC2655Lg.j(c4289zg.f35587e, c4289zg.f35586d, "vfr2");
            c4289zg.f35591j = true;
        }
        if (this.J) {
            h();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4019ug
    public final void T(int i) {
        C3267gh c3267gh;
        if (this.f24980F != i) {
            this.f24980F = i;
            if (i == 3) {
                I();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.f24989x.f35363a && (c3267gh = this.f24976B) != null) {
                c3267gh.s(false);
            }
            this.f24988w.f35594m = false;
            C2485Bg c2485Bg = this.f33738u;
            c2485Bg.f24056d = false;
            c2485Bg.a();
            t2.G.f40858l.post(new RunnableC2502Cg(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void a(int i) {
        C3267gh c3267gh = this.f24976B;
        if (c3267gh != null) {
            C2940ah c2940ah = c3267gh.f31049u;
            synchronized (c2940ah) {
                c2940ah.f29258d = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void b(int i) {
        C3267gh c3267gh = this.f24976B;
        if (c3267gh != null) {
            C2940ah c2940ah = c3267gh.f31049u;
            synchronized (c2940ah) {
                c2940ah.f29259e = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void c(int i) {
        C3267gh c3267gh = this.f24976B;
        if (c3267gh != null) {
            Iterator it = c3267gh.f31047M.iterator();
            while (it.hasNext()) {
                C2893Zg c2893Zg = (C2893Zg) ((WeakReference) it.next()).get();
                if (c2893Zg != null) {
                    c2893Zg.f29039K = i;
                    Iterator it2 = c2893Zg.f29040L.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(c2893Zg.f29039K);
                            } catch (SocketException e6) {
                                int i4 = t2.C.f40822b;
                                u2.i.g("Failed to update receive buffer size.", e6);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final String d() {
        return "ExoPlayer/2".concat(true != this.f24982H ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void e(C3965tg c3965tg) {
        this.f24991z = c3965tg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void f(String str) {
        if (str != null) {
            A(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void g() {
        if (D()) {
            IO io = this.f24976B.f31054z;
            io.f25557w.b();
            io.f25556v.q();
            G();
        }
        C4289zg c4289zg = this.f24988w;
        c4289zg.f35594m = false;
        C2485Bg c2485Bg = this.f33738u;
        c2485Bg.f24056d = false;
        c2485Bg.a();
        c4289zg.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void h() {
        C3267gh c3267gh;
        if (!E()) {
            this.J = true;
            return;
        }
        if (this.f24989x.f35363a && (c3267gh = this.f24976B) != null) {
            c3267gh.s(true);
        }
        IO io = this.f24976B.f31054z;
        io.f25557w.b();
        io.f25556v.N1(true);
        this.f24988w.d();
        C2485Bg c2485Bg = this.f33738u;
        c2485Bg.f24056d = true;
        c2485Bg.a();
        this.f33737n.f34832c = true;
        t2.G.f40858l.post(new RunnableC2502Cg(this, 3));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void i() {
        C3267gh c3267gh;
        if (E()) {
            if (this.f24989x.f35363a && (c3267gh = this.f24976B) != null) {
                c3267gh.s(false);
            }
            IO io = this.f24976B.f31054z;
            io.f25557w.b();
            io.f25556v.N1(false);
            this.f24988w.f35594m = false;
            C2485Bg c2485Bg = this.f33738u;
            c2485Bg.f24056d = false;
            c2485Bg.a();
            t2.G.f40858l.post(new RunnableC2502Cg(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int j() {
        if (E()) {
            return (int) this.f24976B.f31054z.w1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int k() {
        if (E()) {
            return (int) this.f24976B.f31054z.x1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void l(int i) {
        if (E()) {
            long j9 = i;
            IO io = this.f24976B.f31054z;
            io.T(io.t1(), j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void m(float f6, float f9) {
        C4181xg c4181xg = this.f24981G;
        if (c4181xg != null) {
            c4181xg.c(f6, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2468Ag
    public final void n() {
        t2.G.f40858l.post(new RunnableC2502Cg(this, 7));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int o() {
        return this.f24984K;
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
        float f6 = this.f24986M;
        if (f6 != 0.0f && this.f24981G == null) {
            float f9 = measuredWidth;
            float f10 = f9 / measuredHeight;
            if (f6 > f10) {
                measuredHeight = (int) (f9 / f6);
            }
            if (f6 < f10) {
                measuredWidth = (int) (measuredHeight * f6);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        C4181xg c4181xg = this.f24981G;
        if (c4181xg != null) {
            c4181xg.a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i4) {
        C3267gh c3267gh;
        float f6;
        int i9;
        SurfaceTexture surfaceTexture2;
        C3165eo c3165eo;
        if (this.f24982H) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ke)).booleanValue() && (c3165eo = this.f24990y) != null) {
                C2593Hm a9 = c3165eo.a();
                a9.r(NativeAdvancedJsUtils.f18064p, "svp_aepv");
                a9.s();
            }
            C4181xg c4181xg = new C4181xg(getContext());
            this.f24981G = c4181xg;
            c4181xg.f35200F = i;
            c4181xg.f35199E = i4;
            c4181xg.f35202H = surfaceTexture;
            c4181xg.start();
            if (c4181xg.f35202H == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    c4181xg.f35206M.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = c4181xg.f35201G;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f24981G.b();
                this.f24981G = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f24975A = surface;
        if (this.f24976B == null) {
            F(false, null);
        } else {
            H(surface);
            if (!this.f24989x.f35363a && (c3267gh = this.f24976B) != null) {
                c3267gh.s(true);
            }
        }
        int i10 = this.f24984K;
        if (i10 == 0 || (i9 = this.f24985L) == 0) {
            f6 = i4 > 0 ? i / i4 : 1.0f;
            if (this.f24986M != f6) {
                this.f24986M = f6;
                requestLayout();
            }
        } else {
            f6 = i9 > 0 ? i10 / i9 : 1.0f;
            if (this.f24986M != f6) {
                this.f24986M = f6;
                requestLayout();
            }
        }
        t2.G.f40858l.post(new RunnableC2502Cg(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i();
        C4181xg c4181xg = this.f24981G;
        if (c4181xg != null) {
            c4181xg.b();
            this.f24981G = null;
        }
        C3267gh c3267gh = this.f24976B;
        if (c3267gh != null) {
            if (c3267gh != null) {
                c3267gh.s(false);
            }
            Surface surface = this.f24975A;
            if (surface != null) {
                surface.release();
            }
            this.f24975A = null;
            H(null);
        }
        t2.G.f40858l.post(new RunnableC2502Cg(this, 6));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i4) {
        C4181xg c4181xg = this.f24981G;
        if (c4181xg != null) {
            c4181xg.a(i, i4);
        }
        t2.G.f40858l.post(new RunnableC3642ng(this, i, i4, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f24988w.c(this);
        this.f33737n.a(surfaceTexture, this.f24991z);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        t2.C.k(sb.toString());
        t2.G.f40858l.post(new L.a(this, i, 8));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int p() {
        return this.f24985L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final long q() {
        C3267gh c3267gh = this.f24976B;
        if (c3267gh == null) {
            return -1L;
        }
        if (c3267gh.f31046L == null || !c3267gh.f31046L.f29542I) {
            return c3267gh.f31039D;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final long r() {
        C3267gh c3267gh = this.f24976B;
        if (c3267gh != null) {
            return c3267gh.p();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4019ug
    public final void s() {
        t2.G.f40858l.post(new RunnableC2502Cg(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4019ug
    public final void t(long j9, boolean z8) {
        if (this.f24987v != null) {
            AbstractC3212fg.f30743f.execute(new RunnableC2536Eg(this, z8, j9, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4019ug
    public final void u(int i, int i4) {
        this.f24984K = i;
        this.f24985L = i4;
        float f6 = i4 > 0 ? i / i4 : 1.0f;
        if (this.f24986M != f6) {
            this.f24986M = f6;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4019ug
    public final void v(String str, Exception exc) {
        C3267gh c3267gh;
        String J = J(str, exc);
        String concat = "ExoPlayerAdapter error: ".concat(J);
        int i = t2.C.f40822b;
        u2.i.f(concat);
        int i4 = 1;
        this.f24979E = true;
        if (this.f24989x.f35363a && (c3267gh = this.f24976B) != null) {
            c3267gh.s(false);
        }
        t2.G.f40858l.post(new RunnableC2519Dg(this, J, i4));
        p2.j.f39798C.f39808h.e("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4019ug
    public final void w(IOException iOException) {
        String J = J("onLoadException", iOException);
        String concat = "ExoPlayerAdapter exception: ".concat(J);
        int i = t2.C.f40822b;
        u2.i.f(concat);
        p2.j.f39798C.f39808h.e("AdExoPlayerView.onException", iOException);
        t2.G.f40858l.post(new RunnableC2519Dg(this, J, 0));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final long x() {
        C3267gh c3267gh = this.f24976B;
        if (c3267gh != null) {
            return c3267gh.r();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int y() {
        C3267gh c3267gh = this.f24976B;
        if (c3267gh != null) {
            return c3267gh.f31040E;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final Integer z() {
        C3267gh c3267gh = this.f24976B;
        if (c3267gh != null) {
            return c3267gh.J;
        }
        return null;
    }
}
