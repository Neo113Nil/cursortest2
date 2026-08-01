package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.bh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2986bh extends AbstractC2839Wg implements InterfaceC4168xg {

    /* renamed from: A, reason: collision with root package name */
    public C2707Og f29302A;

    /* renamed from: B, reason: collision with root package name */
    public long f29303B;

    /* renamed from: C, reason: collision with root package name */
    public long f29304C;

    /* renamed from: w, reason: collision with root package name */
    public C3414jh f29305w;

    /* renamed from: x, reason: collision with root package name */
    public String f29306x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29307y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f29308z;

    public static final String o(String str) {
        return "cache:".concat(String.valueOf(v2.d.d(str, "MD5")));
    }

    public static String p(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        u1.h.i(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4168xg
    public final void T(int i) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final void a() {
        C3414jh c3414jh = this.f29305w;
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
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
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
    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final boolean d(String str, String[] strArr) {
        String str2;
        boolean z3;
        C2986bh c2986bh;
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
        int i6;
        a3.e eVar;
        long j14;
        C2986bh c2986bh2 = this;
        String str6 = str;
        c2986bh2.f29306x = str6;
        String o6 = o(str6);
        String str7 = " ms";
        String str8 = "Timeout reached. Limit: ";
        boolean z6 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i9 = 0; i9 < strArr.length; i9++) {
                uriArr[i9] = Uri.parse(strArr[i9]);
            }
            C3414jh c3414jh = c2986bh2.f29305w;
            c3414jh.getClass();
            c3414jh.u(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) c2986bh2.f28369v.get();
            if (interfaceC4061vh != null) {
                interfaceC4061vh.u0(o6, c2986bh2);
            }
            C4835j.f39733C.f39745k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            C3301ha c3301ha = AbstractC3569ma.f32269i0;
            q2.r rVar = q2.r.f40207e;
            long longValue = ((Long) rVar.f40210c.a(c3301ha)).longValue();
            long longValue2 = ((Long) rVar.f40210c.a(AbstractC3569ma.f32260h0)).longValue() * 1000;
            long intValue = ((Integer) rVar.f40210c.a(AbstractC3569ma.f31968A)).intValue();
            boolean booleanValue = ((Boolean) rVar.f40210c.a(AbstractC3569ma.f32409x2)).booleanValue();
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
                        if (c2986bh2.f29307y) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (c2986bh2.f29308z) {
                            return true;
                        }
                        C4051vO c4051vO = c2986bh2.f29305w.f31296z;
                        if (!(c4051vO != null ? true : z6)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long T12 = c4051vO.T1();
                        if (T12 > 0) {
                            long V12 = c2986bh2.f29305w.f31296z.V1();
                            if (V12 != j15) {
                                boolean z9 = V12 > 0 ? true : z6;
                                if (booleanValue) {
                                    try {
                                        C3414jh c3414jh2 = c2986bh2.f29305w;
                                        j13 = (c3414jh2.f31288L == null || !c3414jh2.f31288L.f30295I) ? c3414jh2.f31281D : 0L;
                                    } catch (Throwable th) {
                                        th = th;
                                        str3 = o6;
                                        z3 = false;
                                        o6 = str6;
                                        c2986bh = c2986bh2;
                                        str2 = str3;
                                        throw th;
                                    }
                                } else {
                                    j13 = -1;
                                }
                                long p9 = booleanValue ? c2986bh2.f29305w.p() : -1L;
                                long q8 = booleanValue ? c2986bh2.f29305w.q() : -1L;
                                try {
                                    i = C3414jh.f31276N.get();
                                    i6 = C3414jh.f31277O.get();
                                    eVar = v2.d.f41398b;
                                    str4 = str7;
                                    str5 = str8;
                                    j11 = longValue;
                                    j6 = longValue2;
                                    j14 = p9;
                                    z3 = false;
                                    j9 = intValue;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z3 = false;
                                    c2986bh = this;
                                    str2 = o6;
                                    o6 = str;
                                    throw th;
                                }
                                try {
                                    RunnableC2758Rg runnableC2758Rg = new RunnableC2758Rg(c2986bh2, str6, o6, V12, T12, j13, j14, q8, z9, i, i6);
                                    j12 = V12;
                                    r42 = T12;
                                    eVar.post(runnableC2758Rg);
                                    j15 = j12;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c2986bh = this;
                                    str2 = o6;
                                    o6 = str;
                                    throw th;
                                }
                            } else {
                                str4 = str7;
                                str5 = str8;
                                j11 = longValue;
                                j9 = intValue;
                                r42 = T12;
                                j12 = V12;
                                z3 = z6;
                                j6 = longValue2;
                            }
                            r22 = (j12 > r42 ? 1 : (j12 == r42 ? 0 : -1));
                            if (r22 >= 0) {
                                c2986bh2 = this;
                                str6 = str;
                                try {
                                    v2.d.f41398b.post(new RunnableC2807Ug(c2986bh2, str6, o6, (long) r42));
                                    return true;
                                } catch (Throwable th4) {
                                    th = th4;
                                    str3 = o6;
                                    o6 = str6;
                                    c2986bh = c2986bh2;
                                    str2 = str3;
                                    throw th;
                                }
                            }
                            try {
                                C2986bh c2986bh3 = this;
                                r42 = o6;
                                o6 = str;
                                if (c2986bh3.f29305w.f31281D >= j9 && j12 > 0) {
                                    return true;
                                }
                                j10 = j11;
                                r22 = c2986bh3;
                            } catch (Throwable th5) {
                                th = th5;
                                c2986bh = r22;
                                str2 = r42;
                            }
                        } else {
                            str4 = str7;
                            str5 = str8;
                            z3 = z6;
                            j6 = longValue2;
                            j9 = intValue;
                            r42 = o6;
                            o6 = str6;
                            r22 = c2986bh2;
                            j10 = longValue;
                        }
                        try {
                            r22.wait(j10);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = o6;
                        z3 = z6;
                    }
                }
                try {
                    throw th;
                } catch (Exception e9) {
                    e = e9;
                    String message = e.getMessage();
                    String o9 = com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(o6).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", o6, " Exception: ", message);
                    int i10 = u2.z.f41322b;
                    v2.i.f(o9);
                    C4835j.f39733C.f39743h.e("VideoStreamExoPlayerCache.preload", e);
                    c2986bh.a();
                    c2986bh.m(o6, str2, "error", p("error", e));
                    return z3;
                }
                longValue = j10;
                c2986bh2 = r22;
                str6 = o6;
                o6 = r42;
                z6 = z3;
                longValue2 = j6;
                intValue = j9;
                str7 = str4;
                str8 = str5;
            }
        } catch (Exception e10) {
            e = e10;
            str2 = o6;
            z3 = z6;
            o6 = str6;
            c2986bh = c2986bh2;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final boolean f(String str, String[] strArr, C2707Og c2707Og) {
        this.f29306x = str;
        this.f29302A = c2707Og;
        String o6 = o(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            C3414jh c3414jh = this.f29305w;
            c3414jh.getClass();
            c3414jh.u(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f28369v.get();
            if (interfaceC4061vh != null) {
                interfaceC4061vh.u0(o6, this);
            }
            C4835j.f39733C.f39745k.getClass();
            this.f29303B = System.currentTimeMillis();
            this.f29304C = -1L;
            u2.D.f41237l.postDelayed(new RunnableC3111e(21, this), 0L);
            return true;
        } catch (Exception e9) {
            String message = e9.getMessage();
            String o9 = com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i6 = u2.z.f41322b;
            v2.i.f(o9);
            C4835j.f39733C.f39743h.e("VideoStreamExoPlayerCache.preload", e9);
            a();
            m(str, o6, "error", p("error", e9));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final void g(int i) {
        C3146eh c3146eh = this.f29305w.f31291u;
        synchronized (c3146eh) {
            c3146eh.f29960c = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final void h(int i) {
        C3146eh c3146eh = this.f29305w.f31291u;
        synchronized (c3146eh) {
            c3146eh.f29959b = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final void i(int i) {
        C3146eh c3146eh = this.f29305w.f31291u;
        synchronized (c3146eh) {
            c3146eh.f29961d = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final void j(int i) {
        C3146eh c3146eh = this.f29305w.f31291u;
        synchronized (c3146eh) {
            c3146eh.f29962e = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final void k() {
        synchronized (this) {
            this.f29307y = true;
            notify();
            a();
        }
        String str = this.f29306x;
        if (str != null) {
            m(this.f29306x, o(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4168xg
    public final void q() {
        int i = u2.z.f41322b;
        v2.i.f("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4168xg
    public final void r(long j6, boolean z3) {
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f28369v.get();
        if (interfaceC4061vh != null) {
            AbstractC3413jg.f31273f.execute(new RunnableC2588Hg(interfaceC4061vh, z3, j6, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4168xg
    public final void s(int i, int i6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4168xg
    public final void t(String str, Exception exc) {
        int i = u2.z.f41322b;
        v2.i.g("Precache error", exc);
        C4835j.f39733C.f39743h.e("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4168xg
    public final void u(IOException iOException) {
        int i = u2.z.f41322b;
        v2.i.g("Precache exception", iOException);
        C4835j.f39733C.f39743h.e("VideoStreamExoPlayerCache.onException", iOException);
    }
}
