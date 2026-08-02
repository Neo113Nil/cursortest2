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
    private static final int f7424n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f7425o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f7426p = 2;

    /* renamed from: A, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> f7427A;

    /* renamed from: B, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.e f7428B;

    /* renamed from: C, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.h f7429C;

    /* renamed from: D, reason: collision with root package name */
    private com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> f7430D;

    /* renamed from: E, reason: collision with root package name */
    private com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> f7431E;

    /* renamed from: F, reason: collision with root package name */
    private int f7432F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f7433G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f7434H;

    /* renamed from: I, reason: collision with root package name */
    private long f7435I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f7436K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f7437L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f7438M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f7439N;

    /* renamed from: q, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.i> f7440q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f7441r;

    /* renamed from: s, reason: collision with root package name */
    private final g.a f7442s;

    /* renamed from: t, reason: collision with root package name */
    private final h f7443t;

    /* renamed from: u, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.n f7444u;

    /* renamed from: v, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.c.e f7445v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.d f7446w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.basead.exoplayer.m f7447x;

    /* renamed from: y, reason: collision with root package name */
    private int f7448y;

    /* renamed from: z, reason: collision with root package name */
    private int f7449z;

    public final class a implements h.c {
        private a() {
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a(int i) {
            r.this.f7442s.a(i);
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
            r.this.f7442s.a(i, j6, j9);
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
        com.anythink.basead.exoplayer.m mVar = this.f7447x;
        return com.anythink.basead.exoplayer.m.a((String) null, com.anythink.basead.exoplayer.k.o.f9251w, (String) null, -1, mVar.f9463u, mVar.f9464v, 2, (List<byte[]>) null, (com.anythink.basead.exoplayer.d.e) null, (String) null);
    }

    private boolean C() {
        if (this.f7429C == null) {
            com.anythink.basead.exoplayer.c.h c9 = this.f7427A.c();
            this.f7429C = c9;
            if (c9 == null) {
                return false;
            }
            this.f7446w.f7521f += c9.f7532b;
        }
        if (this.f7429C.c()) {
            if (this.f7432F == 2) {
                H();
                G();
                this.f7434H = true;
            } else {
                this.f7429C.e();
                this.f7429C = null;
                E();
            }
            return false;
        }
        if (this.f7434H) {
            com.anythink.basead.exoplayer.m mVar = this.f7447x;
            com.anythink.basead.exoplayer.m a9 = com.anythink.basead.exoplayer.m.a((String) null, com.anythink.basead.exoplayer.k.o.f9251w, (String) null, -1, mVar.f9463u, mVar.f9464v, 2, (List<byte[]>) null, (com.anythink.basead.exoplayer.d.e) null, (String) null);
            this.f7443t.a(a9.f9465w, a9.f9463u, a9.f9464v, null, this.f7448y, this.f7449z);
            this.f7434H = false;
        }
        h hVar = this.f7443t;
        com.anythink.basead.exoplayer.c.h hVar2 = this.f7429C;
        if (!hVar.a(hVar2.f7546c, ((com.anythink.basead.exoplayer.c.f) hVar2).f7531a)) {
            return false;
        }
        this.f7446w.f7520e++;
        this.f7429C.e();
        this.f7429C = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean D() {
        boolean z6;
        com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> gVar = this.f7427A;
        if (gVar == null || this.f7432F == 2 || this.f7437L) {
            return false;
        }
        if (this.f7428B == null) {
            com.anythink.basead.exoplayer.c.e b9 = gVar.b();
            this.f7428B = b9;
            if (b9 == null) {
                return false;
            }
        }
        if (this.f7432F == 1) {
            this.f7428B.a(4);
            this.f7427A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f7428B);
            this.f7428B = null;
            this.f7432F = 2;
            return false;
        }
        int a9 = this.f7439N ? -4 : a(this.f7444u, this.f7428B, false);
        if (a9 == -3) {
            return false;
        }
        if (a9 == -5) {
            b(this.f7444u.f9469a);
            return true;
        }
        if (this.f7428B.c()) {
            this.f7437L = true;
            this.f7427A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f7428B);
            this.f7428B = null;
            return false;
        }
        boolean g9 = this.f7428B.g();
        com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f7430D;
        if (fVar != null && (g9 || !this.f7441r)) {
            int e9 = fVar.e();
            if (e9 == 1) {
                throw com.anythink.basead.exoplayer.g.a(this.f7430D.f(), s());
            }
            if (e9 != 4) {
                z6 = true;
                this.f7439N = z6;
                if (!z6) {
                    return false;
                }
                this.f7428B.h();
                com.anythink.basead.exoplayer.c.e eVar = this.f7428B;
                if (this.J && !eVar.b()) {
                    if (Math.abs(eVar.f7529f - this.f7435I) > 500000) {
                        this.f7435I = eVar.f7529f;
                    }
                    this.J = false;
                }
                this.f7427A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f7428B);
                this.f7433G = true;
                this.f7446w.f7518c++;
                this.f7428B = null;
                return true;
            }
        }
        z6 = false;
        this.f7439N = z6;
        if (!z6) {
        }
    }

    private void E() {
        this.f7438M = true;
        try {
            this.f7443t.c();
        } catch (h.d e9) {
            throw com.anythink.basead.exoplayer.g.a(e9, s());
        }
    }

    private void F() {
        this.f7439N = false;
        if (this.f7432F != 0) {
            H();
            G();
            return;
        }
        this.f7428B = null;
        com.anythink.basead.exoplayer.c.h hVar = this.f7429C;
        if (hVar != null) {
            hVar.e();
            this.f7429C = null;
        }
        this.f7427A.d();
        this.f7433G = false;
    }

    private void G() {
        if (this.f7427A != null) {
            return;
        }
        com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f7431E;
        this.f7430D = fVar;
        if (fVar != null && fVar.g() == null && this.f7430D.f() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ad.a("createAudioDecoder");
            this.f7427A = x();
            ad.a();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f7442s.a(this.f7427A.a(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.f7446w.f7516a++;
        } catch (e e9) {
            throw com.anythink.basead.exoplayer.g.a(e9, s());
        }
    }

    private void H() {
        com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> gVar = this.f7427A;
        if (gVar == null) {
            return;
        }
        this.f7428B = null;
        this.f7429C = null;
        gVar.e();
        this.f7427A = null;
        this.f7446w.f7517b++;
        this.f7432F = 0;
        this.f7433G = false;
    }

    private void I() {
        long a9 = this.f7443t.a(v());
        if (a9 != Long.MIN_VALUE) {
            if (!this.f7436K) {
                a9 = Math.max(this.f7435I, a9);
            }
            this.f7435I = a9;
            this.f7436K = false;
        }
    }

    public static /* synthetic */ boolean b(r rVar) {
        rVar.f7436K = true;
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
        return this.f7435I;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v e() {
        return this.f7443t.f();
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void n() {
        this.f7443t.a();
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void o() {
        I();
        this.f7443t.h();
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void p() {
        this.f7447x = null;
        this.f7434H = true;
        this.f7439N = false;
        try {
            H();
            this.f7443t.j();
            try {
                com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f7430D;
                if (fVar != null) {
                    this.f7440q.a(fVar);
                }
                try {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar2 = this.f7431E;
                    if (fVar2 != null && fVar2 != this.f7430D) {
                        this.f7440q.a(fVar2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar3 = this.f7431E;
                    if (fVar3 != null && fVar3 != this.f7430D) {
                        this.f7440q.a(fVar3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar4 = this.f7430D;
                if (fVar4 != null) {
                    this.f7440q.a(fVar4);
                }
                try {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar5 = this.f7431E;
                    if (fVar5 != null && fVar5 != this.f7430D) {
                        this.f7440q.a(fVar5);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar6 = this.f7431E;
                    if (fVar6 != null && fVar6 != this.f7430D) {
                        this.f7440q.a(fVar6);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean u() {
        if (this.f7443t.e()) {
            return true;
        }
        if (this.f7447x == null || this.f7439N) {
            return false;
        }
        return t() || this.f7429C != null;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean v() {
        return this.f7438M && this.f7443t.d();
    }

    public abstract int w();

    public abstract com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> x();

    private r(Handler handler, g gVar, f... fVarArr) {
        this(handler, gVar, null, null, fVarArr);
    }

    private boolean b(int i) {
        return this.f7443t.a(i);
    }

    @Override // com.anythink.basead.exoplayer.z
    public final int a(com.anythink.basead.exoplayer.m mVar) {
        int w3 = w();
        if (w3 <= 2) {
            return w3;
        }
        return w3 | (af.f9132a >= 21 ? 32 : 0) | 8;
    }

    private r(Handler handler, g gVar, c cVar) {
        this(handler, gVar, cVar, null, new f[0]);
    }

    private boolean b(boolean z6) {
        com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f7430D;
        if (fVar == null || (!z6 && this.f7441r)) {
            return false;
        }
        int e9 = fVar.e();
        if (e9 != 1) {
            return e9 != 4;
        }
        throw com.anythink.basead.exoplayer.g.a(this.f7430D.f(), s());
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
        boolean z6;
        if (this.f7438M) {
            try {
                this.f7443t.c();
                return;
            } catch (h.d e9) {
                throw com.anythink.basead.exoplayer.g.a(e9, s());
            }
        }
        if (this.f7447x == null) {
            this.f7445v.a();
            int a9 = a(this.f7444u, this.f7445v, true);
            if (a9 != -5) {
                if (a9 == -4) {
                    com.anythink.basead.exoplayer.k.a.b(this.f7445v.c());
                    this.f7437L = true;
                    E();
                    return;
                }
                return;
            }
            b(this.f7444u.f9469a);
        }
        G();
        if (this.f7427A != null) {
            try {
                ad.a("drainAndFeed");
                while (true) {
                    if (this.f7429C == null) {
                        com.anythink.basead.exoplayer.c.h c9 = this.f7427A.c();
                        this.f7429C = c9;
                        if (c9 == null) {
                            break;
                        }
                        this.f7446w.f7521f += c9.f7532b;
                    }
                    if (this.f7429C.c()) {
                        if (this.f7432F == 2) {
                            H();
                            G();
                            this.f7434H = true;
                        } else {
                            this.f7429C.e();
                            this.f7429C = null;
                            E();
                        }
                    } else {
                        if (this.f7434H) {
                            com.anythink.basead.exoplayer.m mVar = this.f7447x;
                            com.anythink.basead.exoplayer.m a10 = com.anythink.basead.exoplayer.m.a((String) null, com.anythink.basead.exoplayer.k.o.f9251w, (String) null, -1, mVar.f9463u, mVar.f9464v, 2, (List<byte[]>) null, (com.anythink.basead.exoplayer.d.e) null, (String) null);
                            this.f7443t.a(a10.f9465w, a10.f9463u, a10.f9464v, null, this.f7448y, this.f7449z);
                            this.f7434H = false;
                        }
                        h hVar = this.f7443t;
                        com.anythink.basead.exoplayer.c.h hVar2 = this.f7429C;
                        if (!hVar.a(hVar2.f7546c, ((com.anythink.basead.exoplayer.c.f) hVar2).f7531a)) {
                            break;
                        }
                        this.f7446w.f7520e++;
                        this.f7429C.e();
                        this.f7429C = null;
                    }
                }
                while (true) {
                    com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> gVar = this.f7427A;
                    if (gVar != null && this.f7432F != 2 && !this.f7437L) {
                        if (this.f7428B == null) {
                            com.anythink.basead.exoplayer.c.e b9 = gVar.b();
                            this.f7428B = b9;
                            if (b9 == null) {
                                break;
                            }
                        }
                        if (this.f7432F == 1) {
                            this.f7428B.a(4);
                            this.f7427A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f7428B);
                            this.f7428B = null;
                            this.f7432F = 2;
                            break;
                        }
                        int a11 = this.f7439N ? -4 : a(this.f7444u, this.f7428B, false);
                        if (a11 == -3) {
                            break;
                        }
                        if (a11 == -5) {
                            b(this.f7444u.f9469a);
                        } else {
                            if (this.f7428B.c()) {
                                this.f7437L = true;
                                this.f7427A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f7428B);
                                this.f7428B = null;
                                break;
                            }
                            boolean g9 = this.f7428B.g();
                            com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f7430D;
                            if (fVar != null && (g9 || !this.f7441r)) {
                                int e10 = fVar.e();
                                if (e10 == 1) {
                                    throw com.anythink.basead.exoplayer.g.a(this.f7430D.f(), s());
                                }
                                if (e10 != 4) {
                                    z6 = true;
                                    this.f7439N = z6;
                                    if (!z6) {
                                        break;
                                    }
                                    this.f7428B.h();
                                    com.anythink.basead.exoplayer.c.e eVar = this.f7428B;
                                    if (this.J && !eVar.b()) {
                                        if (Math.abs(eVar.f7529f - this.f7435I) > 500000) {
                                            this.f7435I = eVar.f7529f;
                                        }
                                        this.J = false;
                                    }
                                    this.f7427A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f7428B);
                                    this.f7433G = true;
                                    this.f7446w.f7518c++;
                                    this.f7428B = null;
                                }
                            }
                            z6 = false;
                            this.f7439N = z6;
                            if (!z6) {
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
        this.f7440q = gVar2;
        this.f7441r = false;
        this.f7442s = new g.a(handler, gVar);
        this.f7443t = hVar;
        hVar.a(new a(this, (byte) 0));
        this.f7444u = new com.anythink.basead.exoplayer.n();
        this.f7445v = com.anythink.basead.exoplayer.c.e.e();
        this.f7432F = 0;
        this.f7434H = true;
    }

    private void b(com.anythink.basead.exoplayer.m mVar) {
        com.anythink.basead.exoplayer.m mVar2 = this.f7447x;
        this.f7447x = mVar;
        if (!af.a(mVar.f9453k, mVar2 == null ? null : mVar2.f9453k)) {
            if (this.f7447x.f9453k != null) {
                com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.i> gVar = this.f7440q;
                if (gVar != null) {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> a9 = gVar.a(Looper.myLooper(), this.f7447x.f9453k);
                    this.f7431E = a9;
                    if (a9 == this.f7430D) {
                        this.f7440q.a(a9);
                    }
                } else {
                    throw com.anythink.basead.exoplayer.g.a(new IllegalStateException("Media requires a DrmSessionManager"), s());
                }
            } else {
                this.f7431E = null;
            }
        }
        if (this.f7433G) {
            this.f7432F = 1;
        } else {
            H();
            G();
            this.f7434H = true;
        }
        this.f7448y = mVar.f9466x;
        this.f7449z = mVar.f9467y;
        this.f7442s.a(mVar);
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v a(v vVar) {
        return this.f7443t.a(vVar);
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(boolean z6) {
        com.anythink.basead.exoplayer.c.d dVar = new com.anythink.basead.exoplayer.c.d();
        this.f7446w = dVar;
        this.f7442s.a(dVar);
        int i = r().f7096b;
        if (i != 0) {
            this.f7443t.c(i);
        } else {
            this.f7443t.g();
        }
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(long j6, boolean z6) {
        this.f7443t.i();
        this.f7435I = j6;
        this.J = true;
        this.f7436K = true;
        this.f7437L = false;
        this.f7438M = false;
        if (this.f7427A != null) {
            this.f7439N = false;
            if (this.f7432F != 0) {
                H();
                G();
                return;
            }
            this.f7428B = null;
            com.anythink.basead.exoplayer.c.h hVar = this.f7429C;
            if (hVar != null) {
                hVar.e();
                this.f7429C = null;
            }
            this.f7427A.d();
            this.f7433G = false;
        }
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.x.b
    public final void a(int i, Object obj) {
        if (i == 2) {
            this.f7443t.a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.a(i, obj);
        } else {
            this.f7443t.a((com.anythink.basead.exoplayer.b.b) obj);
        }
    }

    private void a(com.anythink.basead.exoplayer.c.e eVar) {
        if (!this.J || eVar.b()) {
            return;
        }
        if (Math.abs(eVar.f7529f - this.f7435I) > 500000) {
            this.f7435I = eVar.f7529f;
        }
        this.J = false;
    }
}
