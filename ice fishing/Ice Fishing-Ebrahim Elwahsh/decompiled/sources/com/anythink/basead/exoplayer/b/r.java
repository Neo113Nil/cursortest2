package com.anythink.basead.exoplayer.b;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.anythink.basead.exoplayer.b.g;
import com.anythink.basead.exoplayer.b.h;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.ad;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r extends com.anythink.basead.exoplayer.a implements com.anythink.basead.exoplayer.k.n {

    /* renamed from: n, reason: collision with root package name */
    private static final int f6795n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f6796o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f6797p = 2;

    /* renamed from: A, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> f6798A;

    /* renamed from: B, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.e f6799B;

    /* renamed from: C, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.h f6800C;

    /* renamed from: D, reason: collision with root package name */
    private com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> f6801D;

    /* renamed from: E, reason: collision with root package name */
    private com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> f6802E;

    /* renamed from: F, reason: collision with root package name */
    private int f6803F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f6804G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f6805H;

    /* renamed from: I, reason: collision with root package name */
    private long f6806I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f6807K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f6808L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f6809M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f6810N;

    /* renamed from: q, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.i> f6811q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f6812r;

    /* renamed from: s, reason: collision with root package name */
    private final g.a f6813s;

    /* renamed from: t, reason: collision with root package name */
    private final h f6814t;

    /* renamed from: u, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.n f6815u;

    /* renamed from: v, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.c.e f6816v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.d f6817w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.basead.exoplayer.m f6818x;

    /* renamed from: y, reason: collision with root package name */
    private int f6819y;

    /* renamed from: z, reason: collision with root package name */
    private int f6820z;

    public final class a implements h.c {
        private a() {
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a(int i) {
            r.this.f6813s.a(i);
        }

        public /* synthetic */ a(r rVar, byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a() {
            r.b(r.this);
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a(int i, long j9, long j10) {
            r.this.f6813s.a(i, j9, j10);
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
        com.anythink.basead.exoplayer.m mVar = this.f6818x;
        return com.anythink.basead.exoplayer.m.a((String) null, com.anythink.basead.exoplayer.k.o.f8622w, (String) null, -1, mVar.f8834u, mVar.f8835v, 2, (List<byte[]>) null, (com.anythink.basead.exoplayer.d.e) null, (String) null);
    }

    private boolean C() {
        if (this.f6800C == null) {
            com.anythink.basead.exoplayer.c.h c4 = this.f6798A.c();
            this.f6800C = c4;
            if (c4 == null) {
                return false;
            }
            this.f6817w.f6892f += c4.f6903b;
        }
        if (this.f6800C.c()) {
            if (this.f6803F == 2) {
                H();
                G();
                this.f6805H = true;
            } else {
                this.f6800C.e();
                this.f6800C = null;
                E();
            }
            return false;
        }
        if (this.f6805H) {
            com.anythink.basead.exoplayer.m mVar = this.f6818x;
            com.anythink.basead.exoplayer.m a9 = com.anythink.basead.exoplayer.m.a((String) null, com.anythink.basead.exoplayer.k.o.f8622w, (String) null, -1, mVar.f8834u, mVar.f8835v, 2, (List<byte[]>) null, (com.anythink.basead.exoplayer.d.e) null, (String) null);
            this.f6814t.a(a9.f8836w, a9.f8834u, a9.f8835v, null, this.f6819y, this.f6820z);
            this.f6805H = false;
        }
        h hVar = this.f6814t;
        com.anythink.basead.exoplayer.c.h hVar2 = this.f6800C;
        if (!hVar.a(hVar2.f6917c, ((com.anythink.basead.exoplayer.c.f) hVar2).f6902a)) {
            return false;
        }
        this.f6817w.f6891e++;
        this.f6800C.e();
        this.f6800C = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean D() {
        boolean z8;
        com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> gVar = this.f6798A;
        if (gVar == null || this.f6803F == 2 || this.f6808L) {
            return false;
        }
        if (this.f6799B == null) {
            com.anythink.basead.exoplayer.c.e b9 = gVar.b();
            this.f6799B = b9;
            if (b9 == null) {
                return false;
            }
        }
        if (this.f6803F == 1) {
            this.f6799B.a(4);
            this.f6798A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f6799B);
            this.f6799B = null;
            this.f6803F = 2;
            return false;
        }
        int a9 = this.f6810N ? -4 : a(this.f6815u, this.f6799B, false);
        if (a9 == -3) {
            return false;
        }
        if (a9 == -5) {
            b(this.f6815u.f8840a);
            return true;
        }
        if (this.f6799B.c()) {
            this.f6808L = true;
            this.f6798A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f6799B);
            this.f6799B = null;
            return false;
        }
        boolean g9 = this.f6799B.g();
        com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f6801D;
        if (fVar != null && (g9 || !this.f6812r)) {
            int e6 = fVar.e();
            if (e6 == 1) {
                throw com.anythink.basead.exoplayer.g.a(this.f6801D.f(), s());
            }
            if (e6 != 4) {
                z8 = true;
                this.f6810N = z8;
                if (!z8) {
                    return false;
                }
                this.f6799B.h();
                com.anythink.basead.exoplayer.c.e eVar = this.f6799B;
                if (this.J && !eVar.b()) {
                    if (Math.abs(eVar.f6900f - this.f6806I) > 500000) {
                        this.f6806I = eVar.f6900f;
                    }
                    this.J = false;
                }
                this.f6798A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f6799B);
                this.f6804G = true;
                this.f6817w.f6889c++;
                this.f6799B = null;
                return true;
            }
        }
        z8 = false;
        this.f6810N = z8;
        if (!z8) {
        }
    }

    private void E() {
        this.f6809M = true;
        try {
            this.f6814t.c();
        } catch (h.d e6) {
            throw com.anythink.basead.exoplayer.g.a(e6, s());
        }
    }

    private void F() {
        this.f6810N = false;
        if (this.f6803F != 0) {
            H();
            G();
            return;
        }
        this.f6799B = null;
        com.anythink.basead.exoplayer.c.h hVar = this.f6800C;
        if (hVar != null) {
            hVar.e();
            this.f6800C = null;
        }
        this.f6798A.d();
        this.f6804G = false;
    }

    private void G() {
        if (this.f6798A != null) {
            return;
        }
        com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f6802E;
        this.f6801D = fVar;
        if (fVar != null && fVar.g() == null && this.f6801D.f() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ad.a("createAudioDecoder");
            this.f6798A = x();
            ad.a();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f6813s.a(this.f6798A.a(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.f6817w.f6887a++;
        } catch (e e6) {
            throw com.anythink.basead.exoplayer.g.a(e6, s());
        }
    }

    private void H() {
        com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> gVar = this.f6798A;
        if (gVar == null) {
            return;
        }
        this.f6799B = null;
        this.f6800C = null;
        gVar.e();
        this.f6798A = null;
        this.f6817w.f6888b++;
        this.f6803F = 0;
        this.f6804G = false;
    }

    private void I() {
        long a9 = this.f6814t.a(v());
        if (a9 != Long.MIN_VALUE) {
            if (!this.f6807K) {
                a9 = Math.max(this.f6806I, a9);
            }
            this.f6806I = a9;
            this.f6807K = false;
        }
    }

    public static /* synthetic */ boolean b(r rVar) {
        rVar.f6807K = true;
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
        return this.f6806I;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v e() {
        return this.f6814t.f();
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void n() {
        this.f6814t.a();
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void o() {
        I();
        this.f6814t.h();
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void p() {
        this.f6818x = null;
        this.f6805H = true;
        this.f6810N = false;
        try {
            H();
            this.f6814t.j();
            try {
                com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f6801D;
                if (fVar != null) {
                    this.f6811q.a(fVar);
                }
                try {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar2 = this.f6802E;
                    if (fVar2 != null && fVar2 != this.f6801D) {
                        this.f6811q.a(fVar2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar3 = this.f6802E;
                    if (fVar3 != null && fVar3 != this.f6801D) {
                        this.f6811q.a(fVar3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar4 = this.f6801D;
                if (fVar4 != null) {
                    this.f6811q.a(fVar4);
                }
                try {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar5 = this.f6802E;
                    if (fVar5 != null && fVar5 != this.f6801D) {
                        this.f6811q.a(fVar5);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar6 = this.f6802E;
                    if (fVar6 != null && fVar6 != this.f6801D) {
                        this.f6811q.a(fVar6);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean u() {
        if (this.f6814t.e()) {
            return true;
        }
        if (this.f6818x == null || this.f6810N) {
            return false;
        }
        return t() || this.f6800C != null;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean v() {
        return this.f6809M && this.f6814t.d();
    }

    public abstract int w();

    public abstract com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> x();

    private r(Handler handler, g gVar, f... fVarArr) {
        this(handler, gVar, null, null, fVarArr);
    }

    private boolean b(int i) {
        return this.f6814t.a(i);
    }

    @Override // com.anythink.basead.exoplayer.z
    public final int a(com.anythink.basead.exoplayer.m mVar) {
        int w9 = w();
        if (w9 <= 2) {
            return w9;
        }
        return w9 | (af.f8503a >= 21 ? 32 : 0) | 8;
    }

    private r(Handler handler, g gVar, c cVar) {
        this(handler, gVar, cVar, null, new f[0]);
    }

    private boolean b(boolean z8) {
        com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f6801D;
        if (fVar == null || (!z8 && this.f6812r)) {
            return false;
        }
        int e6 = fVar.e();
        if (e6 != 1) {
            return e6 != 4;
        }
        throw com.anythink.basead.exoplayer.g.a(this.f6801D.f(), s());
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
    public final void a(long j9, long j10) {
        boolean z8;
        if (this.f6809M) {
            try {
                this.f6814t.c();
                return;
            } catch (h.d e6) {
                throw com.anythink.basead.exoplayer.g.a(e6, s());
            }
        }
        if (this.f6818x == null) {
            this.f6816v.a();
            int a9 = a(this.f6815u, this.f6816v, true);
            if (a9 != -5) {
                if (a9 == -4) {
                    C0544a.b(this.f6816v.c());
                    this.f6808L = true;
                    E();
                    return;
                }
                return;
            }
            b(this.f6815u.f8840a);
        }
        G();
        if (this.f6798A != null) {
            try {
                ad.a("drainAndFeed");
                while (true) {
                    if (this.f6800C == null) {
                        com.anythink.basead.exoplayer.c.h c4 = this.f6798A.c();
                        this.f6800C = c4;
                        if (c4 == null) {
                            break;
                        }
                        this.f6817w.f6892f += c4.f6903b;
                    }
                    if (this.f6800C.c()) {
                        if (this.f6803F == 2) {
                            H();
                            G();
                            this.f6805H = true;
                        } else {
                            this.f6800C.e();
                            this.f6800C = null;
                            E();
                        }
                    } else {
                        if (this.f6805H) {
                            com.anythink.basead.exoplayer.m mVar = this.f6818x;
                            com.anythink.basead.exoplayer.m a10 = com.anythink.basead.exoplayer.m.a((String) null, com.anythink.basead.exoplayer.k.o.f8622w, (String) null, -1, mVar.f8834u, mVar.f8835v, 2, (List<byte[]>) null, (com.anythink.basead.exoplayer.d.e) null, (String) null);
                            this.f6814t.a(a10.f8836w, a10.f8834u, a10.f8835v, null, this.f6819y, this.f6820z);
                            this.f6805H = false;
                        }
                        h hVar = this.f6814t;
                        com.anythink.basead.exoplayer.c.h hVar2 = this.f6800C;
                        if (!hVar.a(hVar2.f6917c, ((com.anythink.basead.exoplayer.c.f) hVar2).f6902a)) {
                            break;
                        }
                        this.f6817w.f6891e++;
                        this.f6800C.e();
                        this.f6800C = null;
                    }
                }
                while (true) {
                    com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e> gVar = this.f6798A;
                    if (gVar != null && this.f6803F != 2 && !this.f6808L) {
                        if (this.f6799B == null) {
                            com.anythink.basead.exoplayer.c.e b9 = gVar.b();
                            this.f6799B = b9;
                            if (b9 == null) {
                                break;
                            }
                        }
                        if (this.f6803F == 1) {
                            this.f6799B.a(4);
                            this.f6798A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f6799B);
                            this.f6799B = null;
                            this.f6803F = 2;
                            break;
                        }
                        int a11 = this.f6810N ? -4 : a(this.f6815u, this.f6799B, false);
                        if (a11 == -3) {
                            break;
                        }
                        if (a11 == -5) {
                            b(this.f6815u.f8840a);
                        } else {
                            if (this.f6799B.c()) {
                                this.f6808L = true;
                                this.f6798A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f6799B);
                                this.f6799B = null;
                                break;
                            }
                            boolean g9 = this.f6799B.g();
                            com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> fVar = this.f6801D;
                            if (fVar != null && (g9 || !this.f6812r)) {
                                int e9 = fVar.e();
                                if (e9 == 1) {
                                    throw com.anythink.basead.exoplayer.g.a(this.f6801D.f(), s());
                                }
                                if (e9 != 4) {
                                    z8 = true;
                                    this.f6810N = z8;
                                    if (!z8) {
                                        break;
                                    }
                                    this.f6799B.h();
                                    com.anythink.basead.exoplayer.c.e eVar = this.f6799B;
                                    if (this.J && !eVar.b()) {
                                        if (Math.abs(eVar.f6900f - this.f6806I) > 500000) {
                                            this.f6806I = eVar.f6900f;
                                        }
                                        this.J = false;
                                    }
                                    this.f6798A.a((com.anythink.basead.exoplayer.c.g<com.anythink.basead.exoplayer.c.e, ? extends com.anythink.basead.exoplayer.c.h, ? extends e>) this.f6799B);
                                    this.f6804G = true;
                                    this.f6817w.f6889c++;
                                    this.f6799B = null;
                                }
                            }
                            z8 = false;
                            this.f6810N = z8;
                            if (!z8) {
                            }
                        }
                    } else {
                        break;
                    }
                }
                ad.a();
            } catch (e e10) {
                e = e10;
                throw com.anythink.basead.exoplayer.g.a(e, s());
            } catch (h.a e11) {
                e = e11;
                throw com.anythink.basead.exoplayer.g.a(e, s());
            } catch (h.b e12) {
                e = e12;
                throw com.anythink.basead.exoplayer.g.a(e, s());
            } catch (h.d e13) {
                e = e13;
                throw com.anythink.basead.exoplayer.g.a(e, s());
            }
        }
    }

    private r(Handler handler, g gVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.i> gVar2, h hVar) {
        super(1);
        this.f6811q = gVar2;
        this.f6812r = false;
        this.f6813s = new g.a(handler, gVar);
        this.f6814t = hVar;
        hVar.a(new a(this, (byte) 0));
        this.f6815u = new com.anythink.basead.exoplayer.n();
        this.f6816v = com.anythink.basead.exoplayer.c.e.e();
        this.f6803F = 0;
        this.f6805H = true;
    }

    private void b(com.anythink.basead.exoplayer.m mVar) {
        com.anythink.basead.exoplayer.m mVar2 = this.f6818x;
        this.f6818x = mVar;
        if (!af.a(mVar.f8824k, mVar2 == null ? null : mVar2.f8824k)) {
            if (this.f6818x.f8824k != null) {
                com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.i> gVar = this.f6811q;
                if (gVar != null) {
                    com.anythink.basead.exoplayer.d.f<com.anythink.basead.exoplayer.d.i> a9 = gVar.a(Looper.myLooper(), this.f6818x.f8824k);
                    this.f6802E = a9;
                    if (a9 == this.f6801D) {
                        this.f6811q.a(a9);
                    }
                } else {
                    throw com.anythink.basead.exoplayer.g.a(new IllegalStateException("Media requires a DrmSessionManager"), s());
                }
            } else {
                this.f6802E = null;
            }
        }
        if (this.f6804G) {
            this.f6803F = 1;
        } else {
            H();
            G();
            this.f6805H = true;
        }
        this.f6819y = mVar.f8837x;
        this.f6820z = mVar.f8838y;
        this.f6813s.a(mVar);
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v a(v vVar) {
        return this.f6814t.a(vVar);
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(boolean z8) {
        com.anythink.basead.exoplayer.c.d dVar = new com.anythink.basead.exoplayer.c.d();
        this.f6817w = dVar;
        this.f6813s.a(dVar);
        int i = r().f6467b;
        if (i != 0) {
            this.f6814t.c(i);
        } else {
            this.f6814t.g();
        }
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(long j9, boolean z8) {
        this.f6814t.i();
        this.f6806I = j9;
        this.J = true;
        this.f6807K = true;
        this.f6808L = false;
        this.f6809M = false;
        if (this.f6798A != null) {
            this.f6810N = false;
            if (this.f6803F != 0) {
                H();
                G();
                return;
            }
            this.f6799B = null;
            com.anythink.basead.exoplayer.c.h hVar = this.f6800C;
            if (hVar != null) {
                hVar.e();
                this.f6800C = null;
            }
            this.f6798A.d();
            this.f6804G = false;
        }
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.x.b
    public final void a(int i, Object obj) {
        if (i == 2) {
            this.f6814t.a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.a(i, obj);
        } else {
            this.f6814t.a((com.anythink.basead.exoplayer.b.b) obj);
        }
    }

    private void a(com.anythink.basead.exoplayer.c.e eVar) {
        if (!this.J || eVar.b()) {
            return;
        }
        if (Math.abs(eVar.f6900f - this.f6806I) > 500000) {
            this.f6806I = eVar.f6900f;
        }
        this.J = false;
    }
}
