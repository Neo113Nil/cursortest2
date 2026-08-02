package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Zg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2910Zg extends AbstractC2862Wg implements InterfaceC3750pN {

    /* renamed from: H, reason: collision with root package name */
    public static final AtomicInteger f29699H = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    public final U0 f29700A;

    /* renamed from: B, reason: collision with root package name */
    public ByteBuffer f29701B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f29702C;

    /* renamed from: D, reason: collision with root package name */
    public final Object f29703D;

    /* renamed from: E, reason: collision with root package name */
    public final String f29704E;

    /* renamed from: F, reason: collision with root package name */
    public final int f29705F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f29706G;

    /* renamed from: w, reason: collision with root package name */
    public String f29707w;

    /* renamed from: x, reason: collision with root package name */
    public final C2506Bg f29708x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29709y;

    /* renamed from: z, reason: collision with root package name */
    public final C3404j1 f29710z;

    public C2910Zg(InterfaceC4084vh interfaceC4084vh, C2506Bg c2506Bg) {
        super(interfaceC4084vh);
        this.f29708x = c2506Bg;
        this.f29710z = new C3404j1(3);
        this.f29700A = new U0();
        this.f29703D = new Object();
        String p9 = interfaceC4084vh.p();
        this.f29704E = (String) (p9 == null ? NA.f27254n : new C2932aB(p9)).a();
        this.f29705F = interfaceC4084vh.r();
        f29699H.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final void a() {
        f29699H.decrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.google.android.gms.internal.ads.Jg] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.google.android.gms.internal.ads.Wg, com.google.android.gms.internal.ads.Zg, com.google.android.gms.internal.ads.pN] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final boolean b(String str) {
        String str2;
        ?? r62;
        C3962tK c3962tK;
        String str3 = str;
        this.f29707w = str3;
        String str4 = "error";
        String concat = "cache:".concat(String.valueOf(x2.d.d(str3, "MD5")));
        try {
            S0.l lVar = new S0.l(24);
            String str5 = this.f29167u;
            C2506Bg c2506Bg = this.f29708x;
            C3962tK c3962tK2 = new C3962tK(str5, c2506Bg.f24695d, c2506Bg.f24696e, true, lVar);
            c3962tK2.m(this);
            if (c2506Bg.i) {
                c3962tK2 = new C2642Jg(this.f29166n, c3962tK2, this.f29704E, this.f29705F);
            }
            c3962tK2.b(new C2994bJ(Uri.parse(str3), 0L, -1L));
            InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f29168v.get();
            if (interfaceC4084vh != null) {
                interfaceC4084vh.s0(concat, this);
            }
            C4906k.f40186C.f40198k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            C3324ha c3324ha = AbstractC3592ma.f33049i0;
            s2.r rVar = s2.r.f40506e;
            long longValue = ((Long) rVar.f40509c.a(c3324ha)).longValue();
            long longValue2 = ((Long) rVar.f40509c.a(AbstractC3592ma.f33041h0)).longValue();
            this.f29701B = ByteBuffer.allocate(c2506Bg.f24694c);
            int i = 8192;
            byte[] bArr = new byte[8192];
            long j6 = currentTimeMillis;
            while (true) {
                try {
                    int r9 = c3962tK2.r(bArr, 0, Math.min(this.f29701B.remaining(), i));
                    if (r9 == -1) {
                        this.f29706G = true;
                        str3 = str;
                        x2.d.f41852b.post(new RunnableC2829Ug((AbstractC2862Wg) this, str3, concat, (int) this.f29700A.b(this.f29701B)));
                        return true;
                    }
                    str3 = str;
                    str2 = str4;
                    try {
                        r62 = this.f29703D;
                        synchronized (r62) {
                            try {
                                if (this.f29709y) {
                                    c3962tK = c3962tK2;
                                } else {
                                    c3962tK = c3962tK2;
                                    this.f29701B.put(bArr, 0, r9);
                                }
                            } finally {
                            }
                        }
                        if (this.f29701B.remaining() <= 0) {
                            o();
                            return true;
                        }
                        try {
                            if (this.f29709y) {
                                int limit = this.f29701B.limit();
                                StringBuilder sb = new StringBuilder(String.valueOf(limit).length() + 24);
                                sb.append("Precache abort at ");
                                sb.append(limit);
                                sb.append(" bytes");
                                throw new IOException(sb.toString());
                            }
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (currentTimeMillis2 - j6 >= longValue) {
                                o();
                                j6 = currentTimeMillis2;
                            }
                            if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(longValue2).length() + 29);
                                sb2.append("Timeout exceeded. Limit: ");
                                sb2.append(longValue2);
                                sb2.append(" sec");
                                throw new IOException(sb2.toString());
                            }
                            str4 = str2;
                            c3962tK2 = c3962tK;
                            i = 8192;
                        } catch (Exception e9) {
                            e = e9;
                            String canonicalName = e.getClass().getCanonicalName();
                            String message = e.getMessage();
                            String p9 = D.x.p(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                            String r10 = com.IceFishing.LiveIceFishing.k.r(new StringBuilder(p9.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", p9);
                            int i4 = w2.z.f41712b;
                            x2.i.f(r10);
                            m(str3, concat, r62, p9);
                            return false;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        r62 = str2;
                        String canonicalName2 = e.getClass().getCanonicalName();
                        String message2 = e.getMessage();
                        String p92 = D.x.p(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, ":", message2);
                        String r102 = com.IceFishing.LiveIceFishing.k.r(new StringBuilder(p92.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", p92);
                        int i42 = w2.z.f41712b;
                        x2.i.f(r102);
                        m(str3, concat, r62, p92);
                        return false;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str3 = str;
                    str2 = str4;
                    r62 = str2;
                    String canonicalName22 = e.getClass().getCanonicalName();
                    String message22 = e.getMessage();
                    String p922 = D.x.p(new StringBuilder(String.valueOf(canonicalName22).length() + 1 + String.valueOf(message22).length()), canonicalName22, ":", message22);
                    String r1022 = com.IceFishing.LiveIceFishing.k.r(new StringBuilder(p922.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", p922);
                    int i422 = w2.z.f41712b;
                    x2.i.f(r1022);
                    m(str3, concat, r62, p922);
                    return false;
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3750pN
    public final void c(AbstractC3580mF abstractC3580mF, C2994bJ c2994bJ, boolean z6) {
        if (abstractC3580mF instanceof C3962tK) {
            ((ArrayList) this.f29710z.f31944v).add((C3962tK) abstractC3580mF);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final void k() {
        this.f29709y = true;
    }

    public final void o() {
        C3404j1 c3404j1 = this.f29710z;
        Iterator it = ((ArrayList) c3404j1.f31944v).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((C3962tK) it.next()).j().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        c3404j1.f31943u = Math.max(c3404j1.f31943u, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) c3404j1.f31943u;
        int b9 = (int) this.f29700A.b(this.f29701B);
        int position = this.f29701B.position();
        int round = Math.round((position / i) * b9);
        int i4 = C3437jh.f32063N.get();
        int i6 = C3437jh.f32064O.get();
        String str = this.f29707w;
        x2.d.f41852b.post(new RunnableC2795Sg(this, str, "cache:".concat(String.valueOf(x2.d.d(str, "MD5"))), position, i, round, b9, round > 0, i4, i6));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3750pN
    public final void e(C2994bJ c2994bJ, boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3750pN
    public final void l(C2994bJ c2994bJ, boolean z6, int i) {
    }
}
