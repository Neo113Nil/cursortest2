package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Zg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2887Zg extends AbstractC2839Wg implements InterfaceC3727pN {

    /* renamed from: H, reason: collision with root package name */
    public static final AtomicInteger f28922H = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    public final U0 f28923A;

    /* renamed from: B, reason: collision with root package name */
    public ByteBuffer f28924B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f28925C;

    /* renamed from: D, reason: collision with root package name */
    public final Object f28926D;

    /* renamed from: E, reason: collision with root package name */
    public final String f28927E;

    /* renamed from: F, reason: collision with root package name */
    public final int f28928F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f28929G;

    /* renamed from: w, reason: collision with root package name */
    public String f28930w;

    /* renamed from: x, reason: collision with root package name */
    public final C2486Bg f28931x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28932y;

    /* renamed from: z, reason: collision with root package name */
    public final C3381j1 f28933z;

    public C2887Zg(InterfaceC4061vh interfaceC4061vh, C2486Bg c2486Bg) {
        super(interfaceC4061vh);
        this.f28931x = c2486Bg;
        this.f28933z = new C3381j1(3);
        this.f28923A = new U0();
        this.f28926D = new Object();
        String p9 = interfaceC4061vh.p();
        this.f28927E = (String) (p9 == null ? NA.f26470n : new C2909aB(p9)).a();
        this.f28928F = interfaceC4061vh.r();
        f28922H.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final void a() {
        f28922H.decrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.google.android.gms.internal.ads.Jg] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.google.android.gms.internal.ads.Wg, com.google.android.gms.internal.ads.Zg, com.google.android.gms.internal.ads.pN] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final boolean b(String str) {
        String str2;
        ?? r62;
        C3939tK c3939tK;
        long j6;
        String str3 = str;
        this.f28930w = str3;
        String str4 = "error";
        String concat = "cache:".concat(String.valueOf(v2.d.d(str3, "MD5")));
        try {
            S0.l lVar = new S0.l(21);
            String str5 = this.f28368u;
            C2486Bg c2486Bg = this.f28931x;
            C3939tK c3939tK2 = new C3939tK(str5, c2486Bg.f23922d, c2486Bg.f23923e, true, lVar);
            c3939tK2.k(this);
            if (c2486Bg.i) {
                c3939tK2 = new C2622Jg(this.f28367n, c3939tK2, this.f28927E, this.f28928F);
            }
            c3939tK2.g(new C2971bJ(Uri.parse(str3), 0L, -1L));
            InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f28369v.get();
            if (interfaceC4061vh != null) {
                interfaceC4061vh.u0(concat, this);
            }
            C4835j.f39730C.f39742k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            C3301ha c3301ha = AbstractC3569ma.f32269i0;
            q2.r rVar = q2.r.f40204e;
            long longValue = ((Long) rVar.f40207c.a(c3301ha)).longValue();
            long longValue2 = ((Long) rVar.f40207c.a(AbstractC3569ma.f32260h0)).longValue();
            this.f28924B = ByteBuffer.allocate(c2486Bg.f23921c);
            byte[] bArr = new byte[8192];
            long j9 = currentTimeMillis;
            while (true) {
                try {
                    int m4 = c3939tK2.m(bArr, 0, Math.min(this.f28924B.remaining(), 8192));
                    if (m4 == -1) {
                        this.f28929G = true;
                        str3 = str;
                        v2.d.f41395b.post(new RunnableC2807Ug((AbstractC2839Wg) this, str3, concat, (int) this.f28923A.b(this.f28924B)));
                        return true;
                    }
                    str3 = str;
                    str2 = str4;
                    try {
                        synchronized (this.f28926D) {
                            c3939tK = c3939tK2;
                            try {
                                if (this.f28932y) {
                                    j6 = currentTimeMillis;
                                } else {
                                    j6 = currentTimeMillis;
                                    this.f28924B.put(bArr, 0, m4);
                                }
                            } finally {
                            }
                        }
                        if (this.f28924B.remaining() <= 0) {
                            o();
                            return true;
                        }
                        r62 = this.f28932y;
                        try {
                            if (r62 != 0) {
                                int limit = this.f28924B.limit();
                                StringBuilder sb = new StringBuilder(String.valueOf(limit).length() + 24);
                                sb.append("Precache abort at ");
                                sb.append(limit);
                                sb.append(" bytes");
                                throw new IOException(sb.toString());
                            }
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (currentTimeMillis2 - j9 >= longValue) {
                                o();
                                j9 = currentTimeMillis2;
                            }
                            if (currentTimeMillis2 - j6 > 1000 * longValue2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(longValue2).length() + 29);
                                sb2.append("Timeout exceeded. Limit: ");
                                sb2.append(longValue2);
                                sb2.append(" sec");
                                throw new IOException(sb2.toString());
                            }
                            str4 = str2;
                            c3939tK2 = c3939tK;
                            currentTimeMillis = j6;
                        } catch (Exception e9) {
                            e = e9;
                            String canonicalName = e.getClass().getCanonicalName();
                            String message = e.getMessage();
                            String s9 = D.y.s(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                            String o6 = com.anythink.basead.exoplayer.f.f.o(new StringBuilder(s9.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", s9);
                            int i = u2.z.f41319b;
                            v2.i.f(o6);
                            m(str3, concat, r62, s9);
                            return false;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        r62 = str2;
                        String canonicalName2 = e.getClass().getCanonicalName();
                        String message2 = e.getMessage();
                        String s92 = D.y.s(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, ":", message2);
                        String o62 = com.anythink.basead.exoplayer.f.f.o(new StringBuilder(s92.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", s92);
                        int i6 = u2.z.f41319b;
                        v2.i.f(o62);
                        m(str3, concat, r62, s92);
                        return false;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str3 = str;
                    str2 = str4;
                    r62 = str2;
                    String canonicalName22 = e.getClass().getCanonicalName();
                    String message22 = e.getMessage();
                    String s922 = D.y.s(new StringBuilder(String.valueOf(canonicalName22).length() + 1 + String.valueOf(message22).length()), canonicalName22, ":", message22);
                    String o622 = com.anythink.basead.exoplayer.f.f.o(new StringBuilder(s922.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", s922);
                    int i62 = u2.z.f41319b;
                    v2.i.f(o622);
                    m(str3, concat, r62, s922);
                    return false;
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3727pN
    public final void c(AbstractC3557mF abstractC3557mF, C2971bJ c2971bJ, boolean z3) {
        if (abstractC3557mF instanceof C3939tK) {
            ((ArrayList) this.f28933z.f31157v).add((C3939tK) abstractC3557mF);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final void k() {
        this.f28932y = true;
    }

    public final void o() {
        C3381j1 c3381j1 = this.f28933z;
        Iterator it = ((ArrayList) c3381j1.f31157v).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((C3939tK) it.next()).j().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        c3381j1.f31156u = Math.max(c3381j1.f31156u, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) c3381j1.f31156u;
        int b9 = (int) this.f28923A.b(this.f28924B);
        int position = this.f28924B.position();
        int round = Math.round((position / i) * b9);
        int i6 = C3414jh.f31276N.get();
        int i9 = C3414jh.f31277O.get();
        String str = this.f28930w;
        v2.d.f41395b.post(new RunnableC2775Sg(this, str, "cache:".concat(String.valueOf(v2.d.d(str, "MD5"))), position, i, round, b9, round > 0, i6, i9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3727pN
    public final void e(C2971bJ c2971bJ, boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3727pN
    public final void l(C2971bJ c2971bJ, boolean z3, int i) {
    }
}
