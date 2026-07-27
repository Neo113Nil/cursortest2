package com.anythink.basead.exoplayer.h;

import android.net.Uri;
import android.os.Handler;
import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.h.x;
import com.anythink.basead.exoplayer.j.t;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class n implements com.anythink.basead.exoplayer.e.g, r, x.b, t.a<a>, t.d {

    /* renamed from: a, reason: collision with root package name */
    private static final long f7684a = 10000;

    /* renamed from: A, reason: collision with root package name */
    private af f7685A;

    /* renamed from: C, reason: collision with root package name */
    private boolean[] f7687C;

    /* renamed from: D, reason: collision with root package name */
    private boolean[] f7688D;

    /* renamed from: E, reason: collision with root package name */
    private boolean[] f7689E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f7690F;

    /* renamed from: H, reason: collision with root package name */
    private long f7692H;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f7694K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f7695L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f7696M;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f7697b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.h f7698c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7699d;

    /* renamed from: e, reason: collision with root package name */
    private final t.a f7700e;

    /* renamed from: f, reason: collision with root package name */
    private final c f7701f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.b f7702g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7703h;
    private final long i;

    /* renamed from: k, reason: collision with root package name */
    private final b f7705k;

    /* renamed from: p, reason: collision with root package name */
    private r.a f7710p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.k f7711q;

    /* renamed from: t, reason: collision with root package name */
    private boolean f7714t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7715u;

    /* renamed from: v, reason: collision with root package name */
    private int f7716v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f7717w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f7718x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f7719y;

    /* renamed from: z, reason: collision with root package name */
    private int f7720z;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.t f7704j = new com.anythink.basead.exoplayer.j.t("Loader:ExtractorMediaPeriod");

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.f f7706l = new com.anythink.basead.exoplayer.k.f();

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f7707m = new Runnable() { // from class: com.anythink.basead.exoplayer.h.n.1
        @Override // java.lang.Runnable
        public final void run() {
            n.a(n.this);
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f7708n = new Runnable() { // from class: com.anythink.basead.exoplayer.h.n.2
        @Override // java.lang.Runnable
        public final void run() {
            if (n.this.f7696M) {
                return;
            }
            n.this.f7710p.a((r.a) n.this);
        }
    };

    /* renamed from: o, reason: collision with root package name */
    private final Handler f7709o = new Handler();

    /* renamed from: s, reason: collision with root package name */
    private int[] f7713s = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private x[] f7712r = new x[0];

    /* renamed from: I, reason: collision with root package name */
    private long f7693I = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: G, reason: collision with root package name */
    private long f7691G = -1;

    /* renamed from: B, reason: collision with root package name */
    private long f7686B = com.anythink.basead.exoplayer.b.f6382b;

    public final class a implements t.c {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f7724b;

        /* renamed from: c, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.j.h f7725c;

        /* renamed from: d, reason: collision with root package name */
        private final b f7726d;

        /* renamed from: e, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.k.f f7727e;

        /* renamed from: g, reason: collision with root package name */
        private volatile boolean f7729g;
        private long i;

        /* renamed from: j, reason: collision with root package name */
        private com.anythink.basead.exoplayer.j.k f7731j;

        /* renamed from: l, reason: collision with root package name */
        private long f7733l;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.e.j f7728f = new com.anythink.basead.exoplayer.e.j();

        /* renamed from: h, reason: collision with root package name */
        private boolean f7730h = true;

        /* renamed from: k, reason: collision with root package name */
        private long f7732k = -1;

        public a(Uri uri, com.anythink.basead.exoplayer.j.h hVar, b bVar, com.anythink.basead.exoplayer.k.f fVar) {
            this.f7724b = (Uri) com.anythink.basead.exoplayer.k.a.a(uri);
            this.f7725c = (com.anythink.basead.exoplayer.j.h) com.anythink.basead.exoplayer.k.a.a(hVar);
            this.f7726d = (b) com.anythink.basead.exoplayer.k.a.a(bVar);
            this.f7727e = fVar;
        }

        public final void a(long j6, long j9) {
            this.f7728f.f7175a = j6;
            this.i = j9;
            this.f7730h = true;
        }

        @Override // com.anythink.basead.exoplayer.j.t.c
        public final void b() {
            int i = 0;
            while (i == 0 && !this.f7729g) {
                com.anythink.basead.exoplayer.e.b bVar = null;
                try {
                    long j6 = this.f7728f.f7175a;
                    com.anythink.basead.exoplayer.j.k kVar = new com.anythink.basead.exoplayer.j.k(this.f7724b, j6, n.this.f7703h);
                    this.f7731j = kVar;
                    long a9 = this.f7725c.a(kVar);
                    this.f7732k = a9;
                    if (a9 != -1) {
                        this.f7732k = a9 + j6;
                    }
                    com.anythink.basead.exoplayer.e.b bVar2 = new com.anythink.basead.exoplayer.e.b(this.f7725c, j6, this.f7732k);
                    try {
                        com.anythink.basead.exoplayer.e.e a10 = this.f7726d.a(bVar2, this.f7725c.a());
                        if (this.f7730h) {
                            a10.a(j6, this.i);
                            this.f7730h = false;
                        }
                        while (i == 0 && !this.f7729g) {
                            this.f7727e.c();
                            i = a10.a(bVar2, this.f7728f);
                            if (bVar2.c() > n.this.i + j6) {
                                j6 = bVar2.c();
                                this.f7727e.b();
                                n.this.f7709o.post(n.this.f7708n);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.f7728f.f7175a = bVar2.c();
                            this.f7733l = this.f7728f.f7175a - this.f7731j.f8139e;
                        }
                        com.anythink.basead.exoplayer.k.af.a(this.f7725c);
                    } catch (Throwable th) {
                        th = th;
                        bVar = bVar2;
                        if (i != 1 && bVar != null) {
                            this.f7728f.f7175a = bVar.c();
                            this.f7733l = this.f7728f.f7175a - this.f7731j.f8139e;
                        }
                        com.anythink.basead.exoplayer.k.af.a(this.f7725c);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @Override // com.anythink.basead.exoplayer.j.t.c
        public final void a() {
            this.f7729g = true;
        }
    }

    public interface c {
        void a(long j6, boolean z3);
    }

    public final class d implements y {

        /* renamed from: b, reason: collision with root package name */
        private final int f7738b;

        public d(int i) {
            this.f7738b = i;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final boolean b() {
            return n.this.a(this.f7738b);
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final void c() {
            n.this.h();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z3) {
            return n.this.a(this.f7738b, nVar, eVar, z3);
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(long j6) {
            return n.this.a(this.f7738b, j6);
        }
    }

    public n(Uri uri, com.anythink.basead.exoplayer.j.h hVar, com.anythink.basead.exoplayer.e.e[] eVarArr, int i, t.a aVar, c cVar, com.anythink.basead.exoplayer.j.b bVar, String str, int i6) {
        this.f7697b = uri;
        this.f7698c = hVar;
        this.f7699d = i;
        this.f7700e = aVar;
        this.f7701f = cVar;
        this.f7702g = bVar;
        this.f7703h = str;
        this.i = i6;
        this.f7705k = new b(eVarArr, this);
        this.f7716v = i == -1 ? 3 : i;
        aVar.a();
    }

    private boolean j() {
        return this.f7718x || o();
    }

    private void k() {
        if (this.f7696M || this.f7715u || this.f7711q == null || !this.f7714t) {
            return;
        }
        for (x xVar : this.f7712r) {
            if (xVar.f() == null) {
                return;
            }
        }
        this.f7706l.b();
        int length = this.f7712r.length;
        ae[] aeVarArr = new ae[length];
        this.f7688D = new boolean[length];
        this.f7687C = new boolean[length];
        this.f7689E = new boolean[length];
        this.f7686B = this.f7711q.b();
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= length) {
                break;
            }
            com.anythink.basead.exoplayer.m f3 = this.f7712r[i].f();
            aeVarArr[i] = new ae(f3);
            String str = f3.f8665h;
            if (!com.anythink.basead.exoplayer.k.o.b(str) && !com.anythink.basead.exoplayer.k.o.a(str)) {
                z3 = false;
            }
            this.f7688D[i] = z3;
            this.f7690F = z3 | this.f7690F;
            i++;
        }
        this.f7685A = new af(aeVarArr);
        if (this.f7699d == -1 && this.f7691G == -1 && this.f7711q.b() == com.anythink.basead.exoplayer.b.f6382b) {
            this.f7716v = 6;
        }
        this.f7715u = true;
        this.f7701f.a(this.f7686B, this.f7711q.a());
        this.f7710p.a((r) this);
    }

    private void l() {
        a aVar = new a(this.f7697b, this.f7698c, this.f7705k, this.f7706l);
        if (this.f7715u) {
            com.anythink.basead.exoplayer.k.a.b(o());
            long j6 = this.f7686B;
            if (j6 != com.anythink.basead.exoplayer.b.f6382b && this.f7693I >= j6) {
                this.f7695L = true;
                this.f7693I = com.anythink.basead.exoplayer.b.f6382b;
                return;
            } else {
                aVar.a(this.f7711q.a(this.f7693I).f7176a.f7182c, this.f7693I);
                this.f7693I = com.anythink.basead.exoplayer.b.f6382b;
            }
        }
        this.f7694K = m();
        this.f7700e.a(aVar.f7731j, 1, -1, null, 0, null, aVar.i, this.f7686B, this.f7704j.a(aVar, this, this.f7716v));
    }

    private int m() {
        int i = 0;
        for (x xVar : this.f7712r) {
            i += xVar.b();
        }
        return i;
    }

    private long n() {
        long j6 = Long.MIN_VALUE;
        for (x xVar : this.f7712r) {
            j6 = Math.max(j6, xVar.g());
        }
        return j6;
    }

    private boolean o() {
        return this.f7693I != com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ int a(a aVar, long j6, long j9, IOException iOException) {
        com.anythink.basead.exoplayer.e.k kVar;
        a aVar2 = aVar;
        boolean z3 = iOException instanceof ag;
        this.f7700e.a(aVar2.f7731j, 1, -1, null, 0, null, aVar2.i, this.f7686B, j6, j9, aVar2.f7733l, iOException, z3);
        a(aVar2);
        if (z3) {
            return 3;
        }
        int m4 = m();
        boolean z6 = m4 > this.f7694K;
        if (this.f7691G == -1 && ((kVar = this.f7711q) == null || kVar.b() == com.anythink.basead.exoplayer.b.f6382b)) {
            if (this.f7715u && !j()) {
                this.J = true;
                return 2;
            }
            this.f7718x = this.f7715u;
            this.f7692H = 0L;
            this.f7694K = 0;
            for (x xVar : this.f7712r) {
                xVar.a();
            }
            aVar2.a(0L, 0L);
        } else {
            this.f7694K = m4;
        }
        return z6 ? 1 : 0;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final void c_() {
        this.f7714t = true;
        this.f7709o.post(this.f7707m);
    }

    public final void h() {
        this.f7704j.a(this.f7716v);
    }

    @Override // com.anythink.basead.exoplayer.h.x.b
    public final void i() {
        this.f7709o.post(this.f7707m);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f7685A;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        if (this.f7695L || this.J) {
            return false;
        }
        if (this.f7715u && this.f7720z == 0) {
            return false;
        }
        boolean a9 = this.f7706l.a();
        if (this.f7704j.a()) {
            return a9;
        }
        l();
        return true;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        long n9;
        if (this.f7695L) {
            return Long.MIN_VALUE;
        }
        if (o()) {
            return this.f7693I;
        }
        if (this.f7690F) {
            int length = this.f7712r.length;
            n9 = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (this.f7688D[i]) {
                    n9 = Math.min(n9, this.f7712r[i].g());
                }
            }
        } else {
            n9 = n();
        }
        return n9 == Long.MIN_VALUE ? this.f7692H : n9;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        if (this.f7720z == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    public final void f() {
        if (this.f7715u) {
            for (x xVar : this.f7712r) {
                xVar.j();
            }
        }
        this.f7704j.a(this);
        this.f7709o.removeCallbacksAndMessages(null);
        this.f7710p = null;
        this.f7696M = true;
        this.f7700e.b();
    }

    @Override // com.anythink.basead.exoplayer.j.t.d
    public final void g() {
        for (x xVar : this.f7712r) {
            xVar.a();
        }
        this.f7705k.a();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j6) {
        if (!this.f7711q.a()) {
            j6 = 0;
        }
        this.f7692H = j6;
        this.f7718x = false;
        if (o() || !d(j6)) {
            this.J = false;
            this.f7693I = j6;
            this.f7695L = false;
            if (this.f7704j.a()) {
                this.f7704j.b();
                return j6;
            }
            for (x xVar : this.f7712r) {
                xVar.a();
            }
        }
        return j6;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        if (!this.f7719y) {
            this.f7700e.c();
            this.f7719y = true;
        }
        if (!this.f7718x) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        if (!this.f7695L && m() <= this.f7694K) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        this.f7718x = false;
        return this.f7692H;
    }

    private void c(int i) {
        if (this.J && this.f7688D[i] && !this.f7712r[i].c()) {
            this.f7693I = 0L;
            this.J = false;
            this.f7718x = true;
            this.f7692H = 0L;
            this.f7694K = 0;
            for (x xVar : this.f7712r) {
                xVar.a();
            }
            this.f7710p.a((r.a) this);
        }
    }

    private boolean d(long j6) {
        int length = this.f7712r.length;
        for (int i = 0; i < length; i++) {
            x xVar = this.f7712r[i];
            xVar.i();
            if (xVar.a(j6, false) == -1 && (this.f7688D[i] || !this.f7690F)) {
                return false;
            }
        }
        return true;
    }

    private void b(int i) {
        if (this.f7689E[i]) {
            return;
        }
        com.anythink.basead.exoplayer.m a9 = this.f7685A.a(i).a(0);
        this.f7700e.a(com.anythink.basead.exoplayer.k.o.d(a9.f8665h), a9, 0, (Object) null, this.f7692H);
        this.f7689E[i] = true;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.e.e[] f7734a;

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.e.g f7735b;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.basead.exoplayer.e.e f7736c;

        public b(com.anythink.basead.exoplayer.e.e[] eVarArr, com.anythink.basead.exoplayer.e.g gVar) {
            this.f7734a = eVarArr;
            this.f7735b = gVar;
        }

        public final com.anythink.basead.exoplayer.e.e a(com.anythink.basead.exoplayer.e.f fVar, Uri uri) {
            com.anythink.basead.exoplayer.e.e eVar = this.f7736c;
            if (eVar != null) {
                return eVar;
            }
            com.anythink.basead.exoplayer.e.e[] eVarArr = this.f7734a;
            int length = eVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                com.anythink.basead.exoplayer.e.e eVar2 = eVarArr[i];
                try {
                    if (eVar2.a(fVar)) {
                        this.f7736c = eVar2;
                        fVar.a();
                        break;
                    }
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    fVar.a();
                    throw th;
                }
                fVar.a();
                i++;
            }
            com.anythink.basead.exoplayer.e.e eVar3 = this.f7736c;
            if (eVar3 == null) {
                throw new ag(u1.h.g(new StringBuilder("None of the available extractors ("), com.anythink.basead.exoplayer.k.af.a(this.f7734a), ") could read the stream."), uri);
            }
            eVar3.a(this.f7735b);
            return this.f7736c;
        }

        public final void a() {
            if (this.f7736c != null) {
                this.f7736c = null;
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(a aVar, long j6, long j9) {
        a aVar2 = aVar;
        if (this.f7686B == com.anythink.basead.exoplayer.b.f6382b) {
            long n9 = n();
            long j10 = n9 == Long.MIN_VALUE ? 0L : n9 + f7684a;
            this.f7686B = j10;
            this.f7701f.a(j10, this.f7711q.a());
        }
        this.f7700e.a(aVar2.f7731j, 1, -1, null, 0, null, aVar2.i, this.f7686B, j6, j9, aVar2.f7733l);
        a(aVar2);
        this.f7695L = true;
        this.f7710p.a((r.a) this);
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(a aVar, long j6, long j9, boolean z3) {
        a aVar2 = aVar;
        this.f7700e.b(aVar2.f7731j, 1, -1, null, 0, null, aVar2.i, this.f7686B, j6, j9, aVar2.f7733l);
        if (z3) {
            return;
        }
        a(aVar2);
        for (x xVar : this.f7712r) {
            xVar.a();
        }
        if (this.f7720z > 0) {
            this.f7710p.a((r.a) this);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j6) {
        this.f7710p = aVar;
        this.f7706l.a();
        l();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
        h();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j6) {
        com.anythink.basead.exoplayer.i.f fVar;
        com.anythink.basead.exoplayer.k.a.b(this.f7715u);
        int i = this.f7720z;
        int i6 = 0;
        for (int i9 = 0; i9 < fVarArr.length; i9++) {
            y yVar = yVarArr[i9];
            if (yVar != null && (fVarArr[i9] == null || !zArr[i9])) {
                int i10 = ((d) yVar).f7738b;
                com.anythink.basead.exoplayer.k.a.b(this.f7687C[i10]);
                this.f7720z--;
                this.f7687C[i10] = false;
                yVarArr[i9] = null;
            }
        }
        boolean z3 = !this.f7717w ? j6 == 0 : i != 0;
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            if (yVarArr[i11] == null && (fVar = fVarArr[i11]) != null) {
                com.anythink.basead.exoplayer.k.a.b(fVar.g() == 1);
                com.anythink.basead.exoplayer.k.a.b(fVar.b(0) == 0);
                int a9 = this.f7685A.a(fVar.f());
                com.anythink.basead.exoplayer.k.a.b(!this.f7687C[a9]);
                this.f7720z++;
                this.f7687C[a9] = true;
                yVarArr[i11] = new d(a9);
                zArr2[i11] = true;
                if (!z3) {
                    x xVar = this.f7712r[a9];
                    xVar.i();
                    z3 = xVar.a(j6, true) == -1 && xVar.e() != 0;
                }
            }
        }
        if (this.f7720z == 0) {
            this.J = false;
            this.f7718x = false;
            if (this.f7704j.a()) {
                x[] xVarArr = this.f7712r;
                int length = xVarArr.length;
                while (i6 < length) {
                    xVarArr[i6].j();
                    i6++;
                }
                this.f7704j.b();
            } else {
                x[] xVarArr2 = this.f7712r;
                int length2 = xVarArr2.length;
                while (i6 < length2) {
                    xVarArr2[i6].a();
                    i6++;
                }
            }
        } else if (z3) {
            j6 = b(j6);
            while (i6 < yVarArr.length) {
                if (yVarArr[i6] != null) {
                    zArr2[i6] = true;
                }
                i6++;
            }
        }
        this.f7717w = true;
        return j6;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j6, boolean z3) {
        int length = this.f7712r.length;
        for (int i = 0; i < length; i++) {
            this.f7712r[i].a(j6, z3, this.f7687C[i]);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j6, com.anythink.basead.exoplayer.ac acVar) {
        if (!this.f7711q.a()) {
            return 0L;
        }
        k.a a9 = this.f7711q.a(j6);
        return com.anythink.basead.exoplayer.k.af.a(j6, acVar, a9.f7176a.f7181b, a9.f7177b.f7181b);
    }

    public final boolean a(int i) {
        if (j()) {
            return false;
        }
        return this.f7695L || this.f7712r[i].c();
    }

    public final int a(int i, com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z3) {
        if (j()) {
            return -3;
        }
        int a9 = this.f7712r[i].a(nVar, eVar, z3, this.f7695L, this.f7692H);
        if (a9 == -4) {
            b(i);
            return a9;
        }
        if (a9 == -3) {
            c(i);
        }
        return a9;
    }

    public final int a(int i, long j6) {
        int i6 = 0;
        if (j()) {
            return 0;
        }
        x xVar = this.f7712r[i];
        if (this.f7695L && j6 > xVar.g()) {
            i6 = xVar.k();
        } else {
            int a9 = xVar.a(j6, true);
            if (a9 != -1) {
                i6 = a9;
            }
        }
        if (i6 > 0) {
            b(i);
            return i6;
        }
        c(i);
        return i6;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(a aVar, long j6, long j9) {
        if (this.f7686B == com.anythink.basead.exoplayer.b.f6382b) {
            long n9 = n();
            long j10 = n9 == Long.MIN_VALUE ? 0L : n9 + f7684a;
            this.f7686B = j10;
            this.f7701f.a(j10, this.f7711q.a());
        }
        this.f7700e.a(aVar.f7731j, 1, -1, null, 0, null, aVar.i, this.f7686B, j6, j9, aVar.f7733l);
        a(aVar);
        this.f7695L = true;
        this.f7710p.a((r.a) this);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(a aVar, long j6, long j9, boolean z3) {
        this.f7700e.b(aVar.f7731j, 1, -1, null, 0, null, aVar.i, this.f7686B, j6, j9, aVar.f7733l);
        if (z3) {
            return;
        }
        a(aVar);
        for (x xVar : this.f7712r) {
            xVar.a();
        }
        if (this.f7720z > 0) {
            this.f7710p.a((r.a) this);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final com.anythink.basead.exoplayer.e.m a(int i, int i6) {
        int length = this.f7712r.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (this.f7713s[i9] == i) {
                return this.f7712r[i9];
            }
        }
        x xVar = new x(this.f7702g);
        xVar.a(this);
        int i10 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f7713s, i10);
        this.f7713s = copyOf;
        copyOf[length] = i;
        x[] xVarArr = (x[]) Arrays.copyOf(this.f7712r, i10);
        this.f7712r = xVarArr;
        xVarArr[length] = xVar;
        return xVar;
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final void a(com.anythink.basead.exoplayer.e.k kVar) {
        this.f7711q = kVar;
        this.f7709o.post(this.f7707m);
    }

    private void a(a aVar) {
        if (this.f7691G == -1) {
            this.f7691G = aVar.f7732k;
        }
    }

    private boolean a(a aVar, int i) {
        com.anythink.basead.exoplayer.e.k kVar;
        if (this.f7691G == -1 && ((kVar = this.f7711q) == null || kVar.b() == com.anythink.basead.exoplayer.b.f6382b)) {
            if (this.f7715u && !j()) {
                this.J = true;
                return false;
            }
            this.f7718x = this.f7715u;
            this.f7692H = 0L;
            this.f7694K = 0;
            for (x xVar : this.f7712r) {
                xVar.a();
            }
            aVar.a(0L, 0L);
            return true;
        }
        this.f7694K = i;
        return true;
    }

    private static boolean a(IOException iOException) {
        return iOException instanceof ag;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private int a2(a aVar, long j6, long j9, IOException iOException) {
        com.anythink.basead.exoplayer.e.k kVar;
        boolean z3 = iOException instanceof ag;
        this.f7700e.a(aVar.f7731j, 1, -1, null, 0, null, aVar.i, this.f7686B, j6, j9, aVar.f7733l, iOException, z3);
        a(aVar);
        if (z3) {
            return 3;
        }
        int m4 = m();
        boolean z6 = m4 > this.f7694K;
        if (this.f7691G == -1 && ((kVar = this.f7711q) == null || kVar.b() == com.anythink.basead.exoplayer.b.f6382b)) {
            if (this.f7715u && !j()) {
                this.J = true;
                return 2;
            }
            this.f7718x = this.f7715u;
            this.f7692H = 0L;
            this.f7694K = 0;
            for (x xVar : this.f7712r) {
                xVar.a();
            }
            aVar.a(0L, 0L);
        } else {
            this.f7694K = m4;
        }
        return z6 ? 1 : 0;
    }

    public static /* synthetic */ void a(n nVar) {
        if (nVar.f7696M || nVar.f7715u || nVar.f7711q == null || !nVar.f7714t) {
            return;
        }
        for (x xVar : nVar.f7712r) {
            if (xVar.f() == null) {
                return;
            }
        }
        nVar.f7706l.b();
        int length = nVar.f7712r.length;
        ae[] aeVarArr = new ae[length];
        nVar.f7688D = new boolean[length];
        nVar.f7687C = new boolean[length];
        nVar.f7689E = new boolean[length];
        nVar.f7686B = nVar.f7711q.b();
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= length) {
                break;
            }
            com.anythink.basead.exoplayer.m f3 = nVar.f7712r[i].f();
            aeVarArr[i] = new ae(f3);
            String str = f3.f8665h;
            if (!com.anythink.basead.exoplayer.k.o.b(str) && !com.anythink.basead.exoplayer.k.o.a(str)) {
                z3 = false;
            }
            nVar.f7688D[i] = z3;
            nVar.f7690F = z3 | nVar.f7690F;
            i++;
        }
        nVar.f7685A = new af(aeVarArr);
        if (nVar.f7699d == -1 && nVar.f7691G == -1 && nVar.f7711q.b() == com.anythink.basead.exoplayer.b.f6382b) {
            nVar.f7716v = 6;
        }
        nVar.f7715u = true;
        nVar.f7701f.a(nVar.f7686B, nVar.f7711q.a());
        nVar.f7710p.a((r) nVar);
    }
}
