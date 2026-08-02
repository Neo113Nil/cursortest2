package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import r2.C4906k;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.bh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3009bh extends AbstractC2862Wg implements InterfaceC4191xg {

    /* renamed from: A, reason: collision with root package name */
    public C2727Og f30091A;

    /* renamed from: B, reason: collision with root package name */
    public long f30092B;

    /* renamed from: C, reason: collision with root package name */
    public long f30093C;

    /* renamed from: w, reason: collision with root package name */
    public C3437jh f30094w;

    /* renamed from: x, reason: collision with root package name */
    public String f30095x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f30096y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f30097z;

    public static final String o(String str) {
        return "cache:".concat(String.valueOf(x2.d.d(str, "MD5")));
    }

    public static String p(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        AbstractC5128c.h(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4191xg
    public final void T(int i) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final void a() {
        C3437jh c3437jh = this.f30094w;
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
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final boolean b(String str) {
        return d(str, new String[]{str});
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
    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final boolean d(String str, String[] strArr) {
        String str2;
        boolean z6;
        C3009bh c3009bh;
        String str3;
        String str4;
        String str5;
        long j6;
        long j9;
        ?? r42;
        ?? r22;
        long j10;
        long j11;
        long j12;
        long j13;
        int i;
        int i4;
        c3.e eVar;
        long j14;
        C3009bh c3009bh2 = this;
        String str6 = str;
        c3009bh2.f30095x = str6;
        String o4 = o(str6);
        String str7 = " ms";
        String str8 = "Timeout reached. Limit: ";
        boolean z9 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i6 = 0; i6 < strArr.length; i6++) {
                uriArr[i6] = Uri.parse(strArr[i6]);
            }
            C3437jh c3437jh = c3009bh2.f30094w;
            c3437jh.getClass();
            c3437jh.u(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) c3009bh2.f29168v.get();
            if (interfaceC4084vh != null) {
                interfaceC4084vh.s0(o4, c3009bh2);
            }
            C4906k.f40186C.f40198k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            C3324ha c3324ha = AbstractC3592ma.f33049i0;
            s2.r rVar = s2.r.f40506e;
            long longValue = ((Long) rVar.f40509c.a(c3324ha)).longValue();
            long longValue2 = ((Long) rVar.f40509c.a(AbstractC3592ma.f33041h0)).longValue() * 1000;
            long intValue = ((Integer) rVar.f40509c.a(AbstractC3592ma.f32749A)).intValue();
            boolean booleanValue = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue();
            long j15 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - currentTimeMillis > longValue2) {
                            String str9 = str8;
                            long j16 = longValue2;
                            StringBuilder sb = new StringBuilder(String.valueOf(j16).length() + 27);
                            sb.append(str9);
                            sb.append(j16);
                            sb.append(str7);
                            throw new IOException(sb.toString());
                        }
                        if (c3009bh2.f30096y) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (c3009bh2.f30097z) {
                            return true;
                        }
                        C4074vO c4074vO = c3009bh2.f30094w.f32083z;
                        if (!(c4074vO != null ? true : z9)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long T12 = c4074vO.T1();
                        if (T12 > 0) {
                            long V12 = c3009bh2.f30094w.f32083z.V1();
                            if (V12 != j15) {
                                boolean z10 = V12 > 0 ? true : z9;
                                if (booleanValue) {
                                    try {
                                        C3437jh c3437jh2 = c3009bh2.f30094w;
                                        j13 = (c3437jh2.f32075L == null || !c3437jh2.f32075L.f31083I) ? c3437jh2.f32068D : 0L;
                                    } catch (Throwable th) {
                                        th = th;
                                        str3 = o4;
                                        z6 = false;
                                        o4 = str6;
                                        c3009bh = c3009bh2;
                                        str2 = str3;
                                        throw th;
                                    }
                                } else {
                                    j13 = -1;
                                }
                                long p9 = booleanValue ? c3009bh2.f30094w.p() : -1L;
                                long q8 = booleanValue ? c3009bh2.f30094w.q() : -1L;
                                try {
                                    i = C3437jh.f32063N.get();
                                    i4 = C3437jh.f32064O.get();
                                    eVar = x2.d.f41852b;
                                    str4 = str7;
                                    str5 = str8;
                                    j11 = longValue;
                                    j6 = longValue2;
                                    j14 = p9;
                                    z6 = false;
                                    j9 = intValue;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z6 = false;
                                    c3009bh = this;
                                    str2 = o4;
                                    o4 = str;
                                    throw th;
                                }
                                try {
                                    RunnableC2778Rg runnableC2778Rg = new RunnableC2778Rg(c3009bh2, str6, o4, V12, T12, j13, j14, q8, z10, i, i4);
                                    j12 = V12;
                                    r42 = T12;
                                    eVar.post(runnableC2778Rg);
                                    j15 = j12;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c3009bh = this;
                                    str2 = o4;
                                    o4 = str;
                                    throw th;
                                }
                            } else {
                                str4 = str7;
                                str5 = str8;
                                j11 = longValue;
                                j9 = intValue;
                                r42 = T12;
                                j12 = V12;
                                z6 = z9;
                                j6 = longValue2;
                            }
                            r22 = (j12 > r42 ? 1 : (j12 == r42 ? 0 : -1));
                            if (r22 >= 0) {
                                c3009bh2 = this;
                                str6 = str;
                                try {
                                    x2.d.f41852b.post(new RunnableC2829Ug(c3009bh2, str6, o4, (long) r42));
                                    return true;
                                } catch (Throwable th4) {
                                    th = th4;
                                    str3 = o4;
                                    o4 = str6;
                                    c3009bh = c3009bh2;
                                    str2 = str3;
                                    throw th;
                                }
                            }
                            try {
                                C3009bh c3009bh3 = this;
                                r42 = o4;
                                o4 = str;
                                if (c3009bh3.f30094w.f32068D >= j9 && j12 > 0) {
                                    return true;
                                }
                                j10 = j11;
                                r22 = c3009bh3;
                            } catch (Throwable th5) {
                                th = th5;
                                c3009bh = r22;
                                str2 = r42;
                            }
                        } else {
                            str4 = str7;
                            str5 = str8;
                            z6 = z9;
                            j6 = longValue2;
                            j9 = intValue;
                            r42 = o4;
                            o4 = str6;
                            r22 = c3009bh2;
                            j10 = longValue;
                        }
                        try {
                            r22.wait(j10);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = o4;
                        z6 = z9;
                    }
                }
                try {
                    throw th;
                } catch (Exception e9) {
                    e = e9;
                    String message = e.getMessage();
                    String r9 = com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(o4).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", o4, " Exception: ", message);
                    int i9 = w2.z.f41712b;
                    x2.i.f(r9);
                    C4906k.f40186C.f40196h.e("VideoStreamExoPlayerCache.preload", e);
                    c3009bh.a();
                    c3009bh.m(o4, str2, "error", p("error", e));
                    return z6;
                }
                longValue = j10;
                c3009bh2 = r22;
                str6 = o4;
                o4 = r42;
                z9 = z6;
                longValue2 = j6;
                intValue = j9;
                str7 = str4;
                str8 = str5;
            }
        } catch (Exception e10) {
            e = e10;
            str2 = o4;
            z6 = z9;
            o4 = str6;
            c3009bh = c3009bh2;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final boolean f(String str, String[] strArr, C2727Og c2727Og) {
        this.f30095x = str;
        this.f30091A = c2727Og;
        String o4 = o(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            C3437jh c3437jh = this.f30094w;
            c3437jh.getClass();
            c3437jh.u(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f29168v.get();
            if (interfaceC4084vh != null) {
                interfaceC4084vh.s0(o4, this);
            }
            C4906k.f40186C.f40198k.getClass();
            this.f30092B = System.currentTimeMillis();
            this.f30093C = -1L;
            w2.D.f41627l.postDelayed(new RunnableC3134e(21, this), 0L);
            return true;
        } catch (Exception e9) {
            String message = e9.getMessage();
            String r9 = com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i4 = w2.z.f41712b;
            x2.i.f(r9);
            C4906k.f40186C.f40196h.e("VideoStreamExoPlayerCache.preload", e9);
            a();
            m(str, o4, "error", p("error", e9));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final void g(int i) {
        C3169eh c3169eh = this.f30094w.f32078u;
        synchronized (c3169eh) {
            c3169eh.f30751c = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final void h(int i) {
        C3169eh c3169eh = this.f30094w.f32078u;
        synchronized (c3169eh) {
            c3169eh.f30750b = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final void i(int i) {
        C3169eh c3169eh = this.f30094w.f32078u;
        synchronized (c3169eh) {
            c3169eh.f30752d = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final void j(int i) {
        C3169eh c3169eh = this.f30094w.f32078u;
        synchronized (c3169eh) {
            c3169eh.f30753e = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final void k() {
        synchronized (this) {
            this.f30096y = true;
            notify();
            a();
        }
        String str = this.f30095x;
        if (str != null) {
            m(this.f30095x, o(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4191xg
    public final void q() {
        int i = w2.z.f41712b;
        x2.i.f("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4191xg
    public final void r(long j6, boolean z6) {
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f29168v.get();
        if (interfaceC4084vh != null) {
            AbstractC3436jg.f32060f.execute(new RunnableC2608Hg(interfaceC4084vh, z6, j6, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4191xg
    public final void s(int i, int i4) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4191xg
    public final void t(String str, Exception exc) {
        int i = w2.z.f41712b;
        x2.i.g("Precache error", exc);
        C4906k.f40186C.f40196h.e("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4191xg
    public final void u(IOException iOException) {
        int i = w2.z.f41712b;
        x2.i.g("Precache exception", iOException);
        C4906k.f40186C.f40196h.e("VideoStreamExoPlayerCache.onException", iOException);
    }
}
