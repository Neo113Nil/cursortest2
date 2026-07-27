package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Wg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2842Wg extends AbstractC2791Tg implements DN {

    /* renamed from: H, reason: collision with root package name */
    public static final AtomicInteger f28428H = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    public final S0 f28429A;

    /* renamed from: B, reason: collision with root package name */
    public ByteBuffer f28430B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f28431C;

    /* renamed from: D, reason: collision with root package name */
    public final Object f28432D;

    /* renamed from: E, reason: collision with root package name */
    public final String f28433E;

    /* renamed from: F, reason: collision with root package name */
    public final int f28434F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f28435G;

    /* renamed from: w, reason: collision with root package name */
    public String f28436w;

    /* renamed from: x, reason: collision with root package name */
    public final C4235yg f28437x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28438y;

    /* renamed from: z, reason: collision with root package name */
    public final C3288h1 f28439z;

    public C2842Wg(InterfaceC3858rh interfaceC3858rh, C4235yg c4235yg) {
        super(interfaceC3858rh);
        this.f28437x = c4235yg;
        this.f28439z = new C3288h1(3);
        this.f28429A = new S0();
        this.f28432D = new Object();
        String p6 = interfaceC3858rh.p();
        this.f28433E = (String) (p6 == null ? QA.f27125n : new C3080dB(p6)).a();
        this.f28434F = interfaceC3858rh.r();
        f28428H.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final void a() {
        f28428H.decrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.google.android.gms.internal.ads.Gg] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.google.android.gms.internal.ads.DN, com.google.android.gms.internal.ads.Tg, com.google.android.gms.internal.ads.Wg] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final boolean b(String str) {
        String str2;
        ?? r62;
        AK ak;
        long j9;
        String str3 = str;
        this.f28436w = str3;
        String str4 = "error";
        String concat = "cache:".concat(String.valueOf(u2.d.d(str3, "MD5")));
        try {
            C4164xG c4164xG = new C4164xG(4);
            String str5 = this.f27798u;
            C4235yg c4235yg = this.f28437x;
            AK ak2 = new AK(str5, c4235yg.f35366d, c4235yg.f35367e, true, c4164xG);
            ak2.a(this);
            if (c4235yg.i) {
                ak2 = new C2570Gg(this.f27797n, ak2, this.f28433E, this.f28434F);
            }
            ak2.F(new C3197fJ(Uri.parse(str3), 0L, -1L));
            InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f27799v.get();
            if (interfaceC3858rh != null) {
                interfaceC3858rh.B0(concat, this);
            }
            p2.j.f39798C.f39810k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            C3151ea c3151ea = AbstractC3368ia.f31688i0;
            q2.r rVar = q2.r.f40116e;
            long longValue = ((Long) rVar.f40119c.a(c3151ea)).longValue();
            long longValue2 = ((Long) rVar.f40119c.a(AbstractC3368ia.f31679h0)).longValue();
            this.f28430B = ByteBuffer.allocate(c4235yg.f35365c);
            byte[] bArr = new byte[8192];
            long j10 = currentTimeMillis;
            while (true) {
                try {
                    int z8 = ak2.z(bArr, 0, Math.min(this.f28430B.remaining(), 8192));
                    if (z8 == -1) {
                        this.f28435G = true;
                        str3 = str;
                        u2.d.f41224b.post(new RunnableC2757Rg((AbstractC2791Tg) this, str3, concat, (int) this.f28429A.a(this.f28430B)));
                        return true;
                    }
                    str3 = str;
                    str2 = str4;
                    try {
                        synchronized (this.f28432D) {
                            ak = ak2;
                            try {
                                if (this.f28438y) {
                                    j9 = currentTimeMillis;
                                } else {
                                    j9 = currentTimeMillis;
                                    this.f28430B.put(bArr, 0, z8);
                                }
                            } finally {
                            }
                        }
                        if (this.f28430B.remaining() <= 0) {
                            o();
                            return true;
                        }
                        r62 = this.f28438y;
                        try {
                            if (r62 != 0) {
                                int limit = this.f28430B.limit();
                                StringBuilder sb = new StringBuilder(String.valueOf(limit).length() + 24);
                                sb.append("Precache abort at ");
                                sb.append(limit);
                                sb.append(" bytes");
                                throw new IOException(sb.toString());
                            }
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (currentTimeMillis2 - j10 >= longValue) {
                                o();
                                j10 = currentTimeMillis2;
                            }
                            if (currentTimeMillis2 - j9 > 1000 * longValue2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(longValue2).length() + 29);
                                sb2.append("Timeout exceeded. Limit: ");
                                sb2.append(longValue2);
                                sb2.append(" sec");
                                throw new IOException(sb2.toString());
                            }
                            str4 = str2;
                            ak2 = ak;
                            currentTimeMillis = j9;
                        } catch (Exception e6) {
                            e = e6;
                            String canonicalName = e.getClass().getCanonicalName();
                            String message = e.getMessage();
                            String o9 = D.y.o(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                            String q6 = com.anythink.basead.b.c.i.q(new StringBuilder(o9.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", o9);
                            int i = t2.C.f40822b;
                            u2.i.f(q6);
                            m(str3, concat, r62, o9);
                            return false;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        r62 = str2;
                        String canonicalName2 = e.getClass().getCanonicalName();
                        String message2 = e.getMessage();
                        String o92 = D.y.o(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, ":", message2);
                        String q62 = com.anythink.basead.b.c.i.q(new StringBuilder(o92.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", o92);
                        int i4 = t2.C.f40822b;
                        u2.i.f(q62);
                        m(str3, concat, r62, o92);
                        return false;
                    }
                } catch (Exception e10) {
                    e = e10;
                    str3 = str;
                    str2 = str4;
                    r62 = str2;
                    String canonicalName22 = e.getClass().getCanonicalName();
                    String message22 = e.getMessage();
                    String o922 = D.y.o(new StringBuilder(String.valueOf(canonicalName22).length() + 1 + String.valueOf(message22).length()), canonicalName22, ":", message22);
                    String q622 = com.anythink.basead.b.c.i.q(new StringBuilder(o922.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", o922);
                    int i42 = t2.C.f40822b;
                    u2.i.f(q622);
                    m(str3, concat, r62, o922);
                    return false;
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.ads.DN
    public final void e(AbstractC3624nF abstractC3624nF, C3197fJ c3197fJ, boolean z8) {
        if (abstractC3624nF instanceof AK) {
            ((ArrayList) this.f28439z.f31134v).add((AK) abstractC3624nF);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final void l() {
        this.f28438y = true;
    }

    public final void o() {
        C3288h1 c3288h1 = this.f28439z;
        Iterator it = ((ArrayList) c3288h1.f31134v).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((AK) it.next()).h().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        c3288h1.f31133u = Math.max(c3288h1.f31133u, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) c3288h1.f31133u;
        int a9 = (int) this.f28429A.a(this.f28430B);
        int position = this.f28430B.position();
        int round = Math.round((position / i) * a9);
        int i4 = C3267gh.f31034N.get();
        int i9 = C3267gh.f31035O.get();
        String str = this.f28436w;
        u2.d.f41224b.post(new RunnableC2723Pg(this, str, "cache:".concat(String.valueOf(u2.d.d(str, "MD5"))), position, i, round, a9, round > 0, i4, i9));
    }

    @Override // com.google.android.gms.internal.ads.DN
    public final void k(C3197fJ c3197fJ, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.DN
    public final void g(C3197fJ c3197fJ, boolean z8, int i) {
    }
}
