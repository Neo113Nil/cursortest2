package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.Xg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2859Xg extends AbstractC2791Tg implements InterfaceC4019ug {

    /* renamed from: A, reason: collision with root package name */
    public C2638Kg f28661A;

    /* renamed from: B, reason: collision with root package name */
    public long f28662B;

    /* renamed from: C, reason: collision with root package name */
    public long f28663C;

    /* renamed from: w, reason: collision with root package name */
    public C3267gh f28664w;

    /* renamed from: x, reason: collision with root package name */
    public String f28665x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28666y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f28667z;

    public static final String o(String str) {
        return "cache:".concat(String.valueOf(u2.d.d(str, "MD5")));
    }

    public static String p(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        AbstractC5051n.j(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4019ug
    public final void T(int i) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final void a() {
        C3267gh c3267gh = this.f28664w;
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
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final boolean b(String str) {
        return c(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16, types: [long] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v22 */
    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final boolean c(String str, String[] strArr) {
        String str2;
        boolean z8;
        C2859Xg c2859Xg;
        String str3;
        String str4;
        String str5;
        long j9;
        long j10;
        ?? r42;
        ?? r22;
        long j11;
        long j12;
        long j13;
        long j14;
        int i;
        int i4;
        Z2.e eVar;
        long j15;
        C2859Xg c2859Xg2 = this;
        String str6 = str;
        c2859Xg2.f28665x = str6;
        String o9 = o(str6);
        String str7 = " ms";
        String str8 = "Timeout reached. Limit: ";
        boolean z9 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i9 = 0; i9 < strArr.length; i9++) {
                uriArr[i9] = Uri.parse(strArr[i9]);
            }
            C3267gh c3267gh = c2859Xg2.f28664w;
            c3267gh.getClass();
            c3267gh.u(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) c2859Xg2.f27799v.get();
            if (interfaceC3858rh != null) {
                interfaceC3858rh.B0(o9, c2859Xg2);
            }
            p2.j.f39798C.f39810k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            C3151ea c3151ea = AbstractC3368ia.f31688i0;
            q2.r rVar = q2.r.f40116e;
            long longValue = ((Long) rVar.f40119c.a(c3151ea)).longValue();
            long longValue2 = ((Long) rVar.f40119c.a(AbstractC3368ia.f31679h0)).longValue() * 1000;
            long intValue = ((Integer) rVar.f40119c.a(AbstractC3368ia.f31391A)).intValue();
            boolean booleanValue = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue();
            long j16 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - currentTimeMillis > longValue2) {
                            String str9 = str8;
                            long j17 = longValue2;
                            StringBuilder sb = new StringBuilder(String.valueOf(j17).length() + 27);
                            sb.append(str9);
                            sb.append(j17);
                            sb.append(str7);
                            throw new IOException(sb.toString());
                        }
                        if (c2859Xg2.f28666y) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (c2859Xg2.f28667z) {
                            return true;
                        }
                        IO io = c2859Xg2.f28664w.f31054z;
                        if (!(io != null ? true : z9)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long w12 = io.w1();
                        if (w12 > 0) {
                            long z12 = c2859Xg2.f28664w.f31054z.z1();
                            if (z12 != j16) {
                                boolean z10 = z12 > 0 ? true : z9;
                                if (booleanValue) {
                                    try {
                                        C3267gh c3267gh2 = c2859Xg2.f28664w;
                                        j14 = (c3267gh2.f31046L == null || !c3267gh2.f31046L.f29542I) ? c3267gh2.f31039D : 0L;
                                    } catch (Throwable th) {
                                        th = th;
                                        str3 = o9;
                                        z8 = false;
                                        o9 = str6;
                                        c2859Xg = c2859Xg2;
                                        str2 = str3;
                                        throw th;
                                    }
                                } else {
                                    j14 = -1;
                                }
                                long p6 = booleanValue ? c2859Xg2.f28664w.p() : -1L;
                                long r9 = booleanValue ? c2859Xg2.f28664w.r() : -1L;
                                try {
                                    i = C3267gh.f31034N.get();
                                    i4 = C3267gh.f31035O.get();
                                    eVar = u2.d.f41224b;
                                    str4 = str7;
                                    str5 = str8;
                                    j12 = longValue;
                                    j9 = longValue2;
                                    j15 = p6;
                                    z8 = false;
                                    j10 = intValue;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z8 = false;
                                    c2859Xg = this;
                                    str2 = o9;
                                    o9 = str;
                                    throw th;
                                }
                                try {
                                    RunnableC2706Og runnableC2706Og = new RunnableC2706Og(c2859Xg2, str6, o9, z12, w12, j14, j15, r9, z10, i, i4);
                                    j13 = z12;
                                    r42 = w12;
                                    eVar.post(runnableC2706Og);
                                    j16 = j13;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c2859Xg = this;
                                    str2 = o9;
                                    o9 = str;
                                    throw th;
                                }
                            } else {
                                str4 = str7;
                                str5 = str8;
                                j12 = longValue;
                                j10 = intValue;
                                r42 = w12;
                                j13 = z12;
                                z8 = z9;
                                j9 = longValue2;
                            }
                            r22 = (j13 > r42 ? 1 : (j13 == r42 ? 0 : -1));
                            if (r22 >= 0) {
                                c2859Xg2 = this;
                                str6 = str;
                                try {
                                    u2.d.f41224b.post(new RunnableC2757Rg(c2859Xg2, str6, o9, (long) r42));
                                    return true;
                                } catch (Throwable th4) {
                                    th = th4;
                                    str3 = o9;
                                    o9 = str6;
                                    c2859Xg = c2859Xg2;
                                    str2 = str3;
                                    throw th;
                                }
                            }
                            try {
                                C2859Xg c2859Xg3 = this;
                                r42 = o9;
                                o9 = str;
                                if (c2859Xg3.f28664w.f31039D >= j10 && j13 > 0) {
                                    return true;
                                }
                                j11 = j12;
                                r22 = c2859Xg3;
                            } catch (Throwable th5) {
                                th = th5;
                                c2859Xg = r22;
                                str2 = r42;
                            }
                        } else {
                            str4 = str7;
                            str5 = str8;
                            z8 = z9;
                            j9 = longValue2;
                            j10 = intValue;
                            r42 = o9;
                            o9 = str6;
                            r22 = c2859Xg2;
                            j11 = longValue;
                        }
                        try {
                            r22.wait(j11);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = o9;
                        z8 = z9;
                    }
                }
                try {
                    throw th;
                } catch (Exception e6) {
                    e = e6;
                    String message = e.getMessage();
                    String q6 = com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(o9).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", o9, " Exception: ", message);
                    int i10 = t2.C.f40822b;
                    u2.i.f(q6);
                    p2.j.f39798C.f39808h.e("VideoStreamExoPlayerCache.preload", e);
                    c2859Xg.a();
                    c2859Xg.m(o9, str2, "error", p("error", e));
                    return z8;
                }
                longValue = j11;
                c2859Xg2 = r22;
                str6 = o9;
                o9 = r42;
                z9 = z8;
                longValue2 = j9;
                intValue = j10;
                str7 = str4;
                str8 = str5;
            }
        } catch (Exception e9) {
            e = e9;
            str2 = o9;
            z8 = z9;
            o9 = str6;
            c2859Xg = c2859Xg2;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final boolean d(String str, String[] strArr, C2638Kg c2638Kg) {
        this.f28665x = str;
        this.f28661A = c2638Kg;
        String o9 = o(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            C3267gh c3267gh = this.f28664w;
            c3267gh.getClass();
            c3267gh.u(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f27799v.get();
            if (interfaceC3858rh != null) {
                interfaceC3858rh.B0(o9, this);
            }
            p2.j.f39798C.f39810k.getClass();
            this.f28662B = System.currentTimeMillis();
            this.f28663C = -1L;
            t2.G.f40858l.postDelayed(new RunnableC3068d(21, this), 0L);
            return true;
        } catch (Exception e6) {
            String message = e6.getMessage();
            String q6 = com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i4 = t2.C.f40822b;
            u2.i.f(q6);
            p2.j.f39798C.f39808h.e("VideoStreamExoPlayerCache.preload", e6);
            a();
            m(str, o9, "error", p("error", e6));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final void f(int i) {
        C2940ah c2940ah = this.f28664w.f31049u;
        synchronized (c2940ah) {
            c2940ah.f29257c = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final void h(int i) {
        C2940ah c2940ah = this.f28664w.f31049u;
        synchronized (c2940ah) {
            c2940ah.f29256b = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final void i(int i) {
        C2940ah c2940ah = this.f28664w.f31049u;
        synchronized (c2940ah) {
            c2940ah.f29258d = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final void j(int i) {
        C2940ah c2940ah = this.f28664w.f31049u;
        synchronized (c2940ah) {
            c2940ah.f29259e = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final void l() {
        synchronized (this) {
            this.f28666y = true;
            notify();
            a();
        }
        String str = this.f28665x;
        if (str != null) {
            m(this.f28665x, o(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4019ug
    public final void s() {
        int i = t2.C.f40822b;
        u2.i.f("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4019ug
    public final void t(long j9, boolean z8) {
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f27799v.get();
        if (interfaceC3858rh != null) {
            AbstractC3212fg.f30743f.execute(new RunnableC2536Eg(interfaceC3858rh, z8, j9, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4019ug
    public final void u(int i, int i4) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4019ug
    public final void v(String str, Exception exc) {
        int i = t2.C.f40822b;
        u2.i.g("Precache error", exc);
        p2.j.f39798C.f39808h.e("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4019ug
    public final void w(IOException iOException) {
        int i = t2.C.f40822b;
        u2.i.g("Precache exception", iOException);
        p2.j.f39798C.f39808h.e("VideoStreamExoPlayerCache.onException", iOException);
    }
}
