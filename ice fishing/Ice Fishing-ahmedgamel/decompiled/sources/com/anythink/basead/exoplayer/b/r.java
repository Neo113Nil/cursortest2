package com.anythink.basead.exoplayer.b;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.anythink.basead.exoplayer.b.g;
import com.anythink.basead.exoplayer.b.h;
import com.anythink.basead.exoplayer.k.ad;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r extends com.anythink.basead.exoplayer.a implements com.anythink.basead.exoplayer.k.n {

    /* renamed from: n, reason: collision with root package name */
    private static final int f6638n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f6639o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f6640p = 2;

    /* renamed from: A, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> f6641A;

    /* renamed from: B, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.e f6642B;

    /* renamed from: C, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.h f6643C;

    /* renamed from: D, reason: collision with root package name */
    private com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> f6644D;

    /* renamed from: E, reason: collision with root package name */
    private com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> f6645E;

    /* renamed from: F, reason: collision with root package name */
    private int f6646F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f6647G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f6648H;

    /* renamed from: I, reason: collision with root package name */
    private long f6649I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f6650K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f6651L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f6652M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f6653N;

    /* renamed from: q, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.i> f6654q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f6655r;

    /* renamed from: s, reason: collision with root package name */
    private final g.a f6656s;

    /* renamed from: t, reason: collision with root package name */
    private final h f6657t;

    /* renamed from: u, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.n f6658u;

    /* renamed from: v, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.c.e f6659v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.d f6660w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.basead.exoplayer.m f6661x;

    /* renamed from: y, reason: collision with root package name */
    private int f6662y;

    /* renamed from: z, reason: collision with root package name */
    private int f6663z;

    public final class a implements h.c {
        private a() {
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a(int i) {
            r.this.f6656s.a(i);
        }

        public /* synthetic */ a(r rVar, byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a() {
            r.b(r.this);
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a(int i, long j6, long j9) {
            r.this.f6656s.a(i, j6, j9);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public r() {
        this((Handler) null, (g) null, new f[0]);
    }

    private static void A() {
    }

    private com.anythink.basead.exoplayer.m B() {
        com.anythink.basead.exoplayer.m mVar = this.f6661x;
        return com.anythink.basead.exoplayer.m.a((String) null, com.anythink.basead.exoplayer.k.o.f8465w, (String) null, -1, mVar.f8677u, mVar.f8678v, 2, (List<byte[]>) null, (com.anythink.basead.exoplayer.d.e) null, (String) null);
    }

    private boolean C() {
        if (this.f6643C == null) {
            com.anythink.basead.exoplayer.c.h c9 = this.f6641A.c();
            this.f6643C = c9;
            if (c9 == null) {
                return false;
            }
            this.f6660w.f6735f += c9.f6746b;
        }
        if (this.f6643C.c()) {
            if (this.f6646F == 2) {
                H();
                G();
                this.f6648H = true;
            } else {
                this.f6643C.e();
                this.f6643C = null;
                E();
            }
            return false;
        }
        if (this.f6648H) {
            com.anythink.basead.exoplayer.m mVar = this.f6661x;
            com.anythink.basead.exoplayer.m a9 = com.anythink.basead.exoplayer.m.a((String) null, com.anythink.basead.exoplayer.k.o.f8465w, (String) null, -1, mVar.f8677u, mVar.f8678v, 2, (List<byte[]>) null, (com.anythink.basead.exoplayer.d.e) null, (String) null);
            this.f6657t.a(a9.f8679w, a9.f8677u, a9.f8678v, null, this.f6662y, this.f6663z);
            this.f6648H = false;
        }
        h hVar = this.f6657t;
        com.anythink.basead.exoplayer.c.h hVar2 = this.f6643C;
        if (!hVar.a(hVar2.f6760c, ((com.anythink.basead.exoplayer.c.f) hVar2).f6745a)) {
            return false;
        }
        this.f6660w.f6734e++;
        this.f6643C.e();
        this.f6643C = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean D() {
        boolean z3;
        com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> gVar = this.f6641A;
        if (gVar == null || this.f6646F == 2 || this.f6651L) {
            return false;
        }
        if (this.f6642B == null) {
            com.anythink.basead.exoplayer.c.e b9 = gVar.b();
            this.f6642B = b9;
            if (b9 == null) {
                return false;
            }
        }
        if (this.f6646F == 1) {
            this.f6642B.a(4);
            this.f6641A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f6642B);
            this.f6642B = null;
            this.f6646F = 2;
            return false;
        }
        int a9 = this.f6653N ? -4 : a(this.f6658u, this.f6642B, false);
        if (a9 == -3) {
            return false;
        }
        if (a9 == -5) {
            b(this.f6658u.f8683a);
            return true;
        }
        if (this.f6642B.c()) {
            this.f6651L = true;
            this.f6641A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f6642B);
            this.f6642B = null;
            return false;
        }
        boolean g4 = this.f6642B.g();
        com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f6644D;
        if (fVar != null && (g4 || !this.f6655r)) {
            int e9 = fVar.e();
            if (e9 == 1) {
                throw com.anythink.basead.exoplayer.g.a(this.f6644D.f(), s());
            }
            if (e9 != 4) {
                z3 = true;
                this.f6653N = z3;
                if (!z3) {
                    return false;
                }
                this.f6642B.h();
                com.anythink.basead.exoplayer.c.e eVar = this.f6642B;
                if (this.J && !eVar.b()) {
                    if (Math.abs(eVar.f6743f - this.f6649I) > 500000) {
                        this.f6649I = eVar.f6743f;
                    }
                    this.J = false;
                }
                this.f6641A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f6642B);
                this.f6647G = true;
                this.f6660w.f6732c++;
                this.f6642B = null;
                return true;
            }
        }
        z3 = false;
        this.f6653N = z3;
        if (!z3) {
        }
    }

    private void E() {
        this.f6652M = true;
        try {
            this.f6657t.c();
        } catch (h.d e9) {
            throw com.anythink.basead.exoplayer.g.a(e9, s());
        }
    }

    private void F() {
        this.f6653N = false;
        if (this.f6646F != 0) {
            H();
            G();
            return;
        }
        this.f6642B = null;
        com.anythink.basead.exoplayer.c.h hVar = this.f6643C;
        if (hVar != null) {
            hVar.e();
            this.f6643C = null;
        }
        this.f6641A.d();
        this.f6647G = false;
    }

    private void G() {
        if (this.f6641A != null) {
            return;
        }
        com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f6645E;
        this.f6644D = fVar;
        if (fVar != null && fVar.g() == null && this.f6644D.f() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ad.a("createAudioDecoder");
            this.f6641A = x();
            ad.a();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f6656s.a(this.f6641A.a(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.f6660w.f6730a++;
        } catch (e e9) {
            throw com.anythink.basead.exoplayer.g.a(e9, s());
        }
    }

    private void H() {
        com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> gVar = this.f6641A;
        if (gVar == null) {
            return;
        }
        this.f6642B = null;
        this.f6643C = null;
        gVar.e();
        this.f6641A = null;
        this.f6660w.f6731b++;
        this.f6646F = 0;
        this.f6647G = false;
    }

    private void I() {
        long a9 = this.f6657t.a(v());
        if (a9 != Long.MIN_VALUE) {
            if (!this.f6650K) {
                a9 = Math.max(this.f6649I, a9);
            }
            this.f6649I = a9;
            this.f6650K = false;
        }
    }

    public static /* synthetic */ boolean b(r rVar) {
        rVar.f6650K = true;
        return true;
    }

    private static void y() {
    }

    private static void z() {
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.y
    public final com.anythink.basead.exoplayer.k.n c() {
        return this;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final long d() {
        if (a_() == 2) {
            I();
        }
        return this.f6649I;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v e() {
        return this.f6657t.f();
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void n() {
        this.f6657t.a();
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void o() {
        I();
        this.f6657t.h();
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void p() {
        this.f6661x = null;
        this.f6648H = true;
        this.f6653N = false;
        try {
            H();
            this.f6657t.j();
            try {
                com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f6644D;
                if (fVar != null) {
                    this.f6654q.a(fVar);
                }
                try {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar2 = this.f6645E;
                    if (fVar2 != null && fVar2 != this.f6644D) {
                        this.f6654q.a(fVar2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar3 = this.f6645E;
                    if (fVar3 != null && fVar3 != this.f6644D) {
                        this.f6654q.a(fVar3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar4 = this.f6644D;
                if (fVar4 != null) {
                    this.f6654q.a(fVar4);
                }
                try {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar5 = this.f6645E;
                    if (fVar5 != null && fVar5 != this.f6644D) {
                        this.f6654q.a(fVar5);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar6 = this.f6645E;
                    if (fVar6 != null && fVar6 != this.f6644D) {
                        this.f6654q.a(fVar6);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean u() {
        if (this.f6657t.e()) {
            return true;
        }
        if (this.f6661x == null || this.f6653N) {
            return false;
        }
        return t() || this.f6643C != null;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean v() {
        return this.f6652M && this.f6657t.d();
    }

    public abstract int w();

    public abstract com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> x();

    private r(Handler handler, g gVar, f... fVarArr) {
        this(handler, gVar, null, null, fVarArr);
    }

    private boolean b(int i) {
        return this.f6657t.a(i);
    }

    @Override // com.anythink.basead.exoplayer.z
    public final int a(com.anythink.basead.exoplayer.m mVar) {
        int w6 = w();
        if (w6 <= 2) {
            return w6;
        }
        return w6 | (af.f8346a >= 21 ? 32 : 0) | 8;
    }

    private r(Handler handler, g gVar, c cVar) {
        this(handler, gVar, cVar, null, new f[0]);
    }

    private boolean b(boolean z3) {
        com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f6644D;
        if (fVar == null || (!z3 && this.f6655r)) {
            return false;
        }
        int e9 = fVar.e();
        if (e9 != 1) {
            return e9 != 4;
        }
        throw com.anythink.basead.exoplayer.g.a(this.f6644D.f(), s());
    }

    private r(Handler handler, g gVar, c cVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.i> gVar2, f... fVarArr) {
        this(handler, gVar, gVar2, new l(cVar, fVarArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0179 A[Catch: d -> 0x006e, b -> 0x0071, a -> 0x0074, e -> 0x0077, TryCatch #3 {e -> 0x0077, a -> 0x0074, b -> 0x0071, d -> 0x006e, blocks: (B:16:0x004c, B:17:0x0051, B:19:0x0058, B:21:0x0064, B:24:0x00e3, B:26:0x00e7, B:28:0x00eb, B:30:0x00f1, B:32:0x00f5, B:38:0x00ff, B:87:0x0104, B:40:0x0116, B:81:0x012b, B:47:0x0133, B:79:0x013b, B:49:0x0148, B:52:0x0154, B:55:0x0159, B:59:0x0174, B:61:0x0179, B:63:0x0184, B:65:0x018a, B:67:0x019a, B:68:0x019e, B:69:0x01a0, B:75:0x0165, B:76:0x0173, B:85:0x011c, B:36:0x01b4, B:92:0x007a, B:102:0x0082, B:104:0x0086, B:105:0x008f, B:94:0x009a, B:96:0x009e, B:97:0x00c5, B:99:0x00d3), top: B:15:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178 A[SYNTHETIC] */
    @Override // com.anythink.basead.exoplayer.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j6, long j9) {
        boolean z3;
        if (this.f6652M) {
            try {
                this.f6657t.c();
                return;
            } catch (h.d e9) {
                throw com.anythink.basead.exoplayer.g.a(e9, s());
            }
        }
        if (this.f6661x == null) {
            this.f6659v.a();
            int a9 = a(this.f6658u, this.f6659v, true);
            if (a9 != -5) {
                if (a9 == -4) {
                    com.anythink.basead.exoplayer.k.a.b(this.f6659v.c());
                    this.f6651L = true;
                    E();
                    return;
                }
                return;
            }
            b(this.f6658u.f8683a);
        }
        G();
        if (this.f6641A != null) {
            try {
                ad.a("drainAndFeed");
                while (true) {
                    if (this.f6643C == null) {
                        com.anythink.basead.exoplayer.c.h c9 = this.f6641A.c();
                        this.f6643C = c9;
                        if (c9 == null) {
                            break;
                        }
                        this.f6660w.f6735f += c9.f6746b;
                    }
                    if (this.f6643C.c()) {
                        if (this.f6646F == 2) {
                            H();
                            G();
                            this.f6648H = true;
                        } else {
                            this.f6643C.e();
                            this.f6643C = null;
                            E();
                        }
                    } else {
                        if (this.f6648H) {
                            com.anythink.basead.exoplayer.m mVar = this.f6661x;
                            com.anythink.basead.exoplayer.m a10 = com.anythink.basead.exoplayer.m.a((String) null, com.anythink.basead.exoplayer.k.o.f8465w, (String) null, -1, mVar.f8677u, mVar.f8678v, 2, (List<byte[]>) null, (com.anythink.basead.exoplayer.d.e) null, (String) null);
                            this.f6657t.a(a10.f8679w, a10.f8677u, a10.f8678v, null, this.f6662y, this.f6663z);
                            this.f6648H = false;
                        }
                        h hVar = this.f6657t;
                        com.anythink.basead.exoplayer.c.h hVar2 = this.f6643C;
                        if (!hVar.a(hVar2.f6760c, ((com.anythink.basead.exoplayer.c.f) hVar2).f6745a)) {
                            break;
                        }
                        this.f6660w.f6734e++;
                        this.f6643C.e();
                        this.f6643C = null;
                    }
                }
                while (true) {
                    com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> gVar = this.f6641A;
                    if (gVar != null && this.f6646F != 2 && !this.f6651L) {
                        if (this.f6642B == null) {
                            com.anythink.basead.exoplayer.c.e b9 = gVar.b();
                            this.f6642B = b9;
                            if (b9 == null) {
                                break;
                            }
                        }
                        if (this.f6646F == 1) {
                            this.f6642B.a(4);
                            this.f6641A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f6642B);
                            this.f6642B = null;
                            this.f6646F = 2;
                            break;
                        }
                        int a11 = this.f6653N ? -4 : a(this.f6658u, this.f6642B, false);
                        if (a11 == -3) {
                            break;
                        }
                        if (a11 == -5) {
                            b(this.f6658u.f8683a);
                        } else {
                            if (this.f6642B.c()) {
                                this.f6651L = true;
                                this.f6641A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f6642B);
                                this.f6642B = null;
                                break;
                            }
                            boolean g4 = this.f6642B.g();
                            com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f6644D;
                            if (fVar != null && (g4 || !this.f6655r)) {
                                int e10 = fVar.e();
                                if (e10 == 1) {
                                    throw com.anythink.basead.exoplayer.g.a(this.f6644D.f(), s());
                                }
                                if (e10 != 4) {
                                    z3 = true;
                                    this.f6653N = z3;
                                    if (!z3) {
                                        break;
                                    }
                                    this.f6642B.h();
                                    com.anythink.basead.exoplayer.c.e eVar = this.f6642B;
                                    if (this.J && !eVar.b()) {
                                        if (Math.abs(eVar.f6743f - this.f6649I) > 500000) {
                                            this.f6649I = eVar.f6743f;
                                        }
                                        this.J = false;
                                    }
                                    this.f6641A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f6642B);
                                    this.f6647G = true;
                                    this.f6660w.f6732c++;
                                    this.f6642B = null;
                                }
                            }
                            z3 = false;
                            this.f6653N = z3;
                            if (!z3) {
                            }
                        }
                    } else {
                        break;
                    }
                }
                ad.a();
            } catch (e e11) {
                e = e11;
                throw com.anythink.basead.exoplayer.g.a(e, s());
            } catch (h.a e12) {
                e = e12;
                throw com.anythink.basead.exoplayer.g.a(e, s());
            } catch (h.b e13) {
                e = e13;
                throw com.anythink.basead.exoplayer.g.a(e, s());
            } catch (h.d e14) {
                e = e14;
                throw com.anythink.basead.exoplayer.g.a(e, s());
            }
        }
    }

    private r(Handler handler, g gVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.i> gVar2, h hVar) {
        super(1);
        this.f6654q = gVar2;
        this.f6655r = false;
        this.f6656s = new g.a(handler, gVar);
        this.f6657t = hVar;
        hVar.a(new a(this, (byte) 0));
        this.f6658u = new com.anythink.basead.exoplayer.n();
        this.f6659v = com.anythink.basead.exoplayer.c.e.e();
        this.f6646F = 0;
        this.f6648H = true;
    }

    private void b(com.anythink.basead.exoplayer.m mVar) {
        com.anythink.basead.exoplayer.m mVar2 = this.f6661x;
        this.f6661x = mVar;
        if (!af.a(mVar.f8667k, mVar2 == null ? null : mVar2.f8667k)) {
            if (this.f6661x.f8667k != null) {
                com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.i> gVar = this.f6654q;
                if (gVar != null) {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> a9 = gVar.a(Looper.myLooper(), this.f6661x.f8667k);
                    this.f6645E = a9;
                    if (a9 == this.f6644D) {
                        this.f6654q.a(a9);
                    }
                } else {
                    throw com.anythink.basead.exoplayer.g.a(new IllegalStateException("Media requires a DrmSessionManager"), s());
                }
            } else {
                this.f6645E = null;
            }
        }
        if (this.f6647G) {
            this.f6646F = 1;
        } else {
            H();
            G();
            this.f6648H = true;
        }
        this.f6662y = mVar.f8680x;
        this.f6663z = mVar.f8681y;
        this.f6656s.a(mVar);
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v a(v vVar) {
        return this.f6657t.a(vVar);
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(boolean z3) {
        com.anythink.basead.exoplayer.c.d dVar = new com.anythink.basead.exoplayer.c.d();
        this.f6660w = dVar;
        this.f6656s.a(dVar);
        int i = r().f6310b;
        if (i != 0) {
            this.f6657t.c(i);
        } else {
            this.f6657t.g();
        }
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(long j6, boolean z3) {
        this.f6657t.i();
        this.f6649I = j6;
        this.J = true;
        this.f6650K = true;
        this.f6651L = false;
        this.f6652M = false;
        if (this.f6641A != null) {
            this.f6653N = false;
            if (this.f6646F != 0) {
                H();
                G();
                return;
            }
            this.f6642B = null;
            com.anythink.basead.exoplayer.c.h hVar = this.f6643C;
            if (hVar != null) {
                hVar.e();
                this.f6643C = null;
            }
            this.f6641A.d();
            this.f6647G = false;
        }
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.x.b
    public final void a(int i, Object obj) {
        if (i == 2) {
            this.f6657t.a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.a(i, obj);
        } else {
            this.f6657t.a((com.anythink.basead.exoplayer.b.b) obj);
        }
    }

    private void a(com.anythink.basead.exoplayer.c.e eVar) {
        if (!this.J || eVar.b()) {
            return;
        }
        if (Math.abs(eVar.f6743f - this.f6649I) > 500000) {
            this.f6649I = eVar.f6743f;
        }
        this.J = false;
    }
}
