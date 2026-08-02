package com.anythink.basead.exoplayer.h;

import android.net.Uri;
import android.os.Handler;
import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.h.x;
import com.anythink.basead.exoplayer.j.t;
import com.google.android.gms.internal.ads.Wv;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class n implements com.anythink.basead.exoplayer.e.g, r, x.b, t.a<a>, t.d {

    /* renamed from: a, reason: collision with root package name */
    private static final long f8470a = 10000;

    /* renamed from: A, reason: collision with root package name */
    private af f8471A;

    /* renamed from: C, reason: collision with root package name */
    private boolean[] f8473C;

    /* renamed from: D, reason: collision with root package name */
    private boolean[] f8474D;

    /* renamed from: E, reason: collision with root package name */
    private boolean[] f8475E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f8476F;

    /* renamed from: H, reason: collision with root package name */
    private long f8478H;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f8480K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f8481L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f8482M;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f8483b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.h f8484c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8485d;

    /* renamed from: e, reason: collision with root package name */
    private final t.a f8486e;

    /* renamed from: f, reason: collision with root package name */
    private final c f8487f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.b f8488g;

    /* renamed from: h, reason: collision with root package name */
    private final String f8489h;
    private final long i;

    /* renamed from: k, reason: collision with root package name */
    private final b f8491k;

    /* renamed from: p, reason: collision with root package name */
    private r.a f8496p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.k f8497q;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8500t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f8501u;

    /* renamed from: v, reason: collision with root package name */
    private int f8502v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f8503w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f8504x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f8505y;

    /* renamed from: z, reason: collision with root package name */
    private int f8506z;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.t f8490j = new com.anythink.basead.exoplayer.j.t("Loader:ExtractorMediaPeriod");

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.f f8492l = new com.anythink.basead.exoplayer.k.f();

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f8493m = new Runnable() { // from class: com.anythink.basead.exoplayer.h.n.1
        @Override // java.lang.Runnable
        public final void run() {
            n.a(n.this);
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f8494n = new Runnable() { // from class: com.anythink.basead.exoplayer.h.n.2
        @Override // java.lang.Runnable
        public final void run() {
            if (n.this.f8482M) {
                return;
            }
            n.this.f8496p.a((r.a) n.this);
        }
    };

    /* renamed from: o, reason: collision with root package name */
    private final Handler f8495o = new Handler();

    /* renamed from: s, reason: collision with root package name */
    private int[] f8499s = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private x[] f8498r = new x[0];

    /* renamed from: I, reason: collision with root package name */
    private long f8479I = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: G, reason: collision with root package name */
    private long f8477G = -1;

    /* renamed from: B, reason: collision with root package name */
    private long f8472B = com.anythink.basead.exoplayer.b.f7168b;

    public final class a implements t.c {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f8510b;

        /* renamed from: c, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.j.h f8511c;

        /* renamed from: d, reason: collision with root package name */
        private final b f8512d;

        /* renamed from: e, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.k.f f8513e;

        /* renamed from: g, reason: collision with root package name */
        private volatile boolean f8515g;
        private long i;

        /* renamed from: j, reason: collision with root package name */
        private com.anythink.basead.exoplayer.j.k f8517j;

        /* renamed from: l, reason: collision with root package name */
        private long f8519l;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.e.j f8514f = new com.anythink.basead.exoplayer.e.j();

        /* renamed from: h, reason: collision with root package name */
        private boolean f8516h = true;

        /* renamed from: k, reason: collision with root package name */
        private long f8518k = -1;

        public a(Uri uri, com.anythink.basead.exoplayer.j.h hVar, b bVar, com.anythink.basead.exoplayer.k.f fVar) {
            this.f8510b = (Uri) com.anythink.basead.exoplayer.k.a.a(uri);
            this.f8511c = (com.anythink.basead.exoplayer.j.h) com.anythink.basead.exoplayer.k.a.a(hVar);
            this.f8512d = (b) com.anythink.basead.exoplayer.k.a.a(bVar);
            this.f8513e = fVar;
        }

        public final void a(long j6, long j9) {
            this.f8514f.f7961a = j6;
            this.i = j9;
            this.f8516h = true;
        }

        @Override // com.anythink.basead.exoplayer.j.t.c
        public final void b() {
            int i = 0;
            while (i == 0 && !this.f8515g) {
                com.anythink.basead.exoplayer.e.b bVar = null;
                try {
                    long j6 = this.f8514f.f7961a;
                    com.anythink.basead.exoplayer.j.k kVar = new com.anythink.basead.exoplayer.j.k(this.f8510b, j6, n.this.f8489h);
                    this.f8517j = kVar;
                    long a9 = this.f8511c.a(kVar);
                    this.f8518k = a9;
                    if (a9 != -1) {
                        this.f8518k = a9 + j6;
                    }
                    com.anythink.basead.exoplayer.e.b bVar2 = new com.anythink.basead.exoplayer.e.b(this.f8511c, j6, this.f8518k);
                    try {
                        com.anythink.basead.exoplayer.e.e a10 = this.f8512d.a(bVar2, this.f8511c.a());
                        if (this.f8516h) {
                            a10.a(j6, this.i);
                            this.f8516h = false;
                        }
                        while (i == 0 && !this.f8515g) {
                            this.f8513e.c();
                            i = a10.a(bVar2, this.f8514f);
                            if (bVar2.c() > n.this.i + j6) {
                                j6 = bVar2.c();
                                this.f8513e.b();
                                n.this.f8495o.post(n.this.f8494n);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.f8514f.f7961a = bVar2.c();
                            this.f8519l = this.f8514f.f7961a - this.f8517j.f8925e;
                        }
                        com.anythink.basead.exoplayer.k.af.a(this.f8511c);
                    } catch (Throwable th) {
                        th = th;
                        bVar = bVar2;
                        if (i != 1 && bVar != null) {
                            this.f8514f.f7961a = bVar.c();
                            this.f8519l = this.f8514f.f7961a - this.f8517j.f8925e;
                        }
                        com.anythink.basead.exoplayer.k.af.a(this.f8511c);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @Override // com.anythink.basead.exoplayer.j.t.c
        public final void a() {
            this.f8515g = true;
        }
    }

    public interface c {
        void a(long j6, boolean z6);
    }

    public final class d implements y {

        /* renamed from: b, reason: collision with root package name */
        private final int f8524b;

        public d(int i) {
            this.f8524b = i;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final boolean b() {
            return n.this.a(this.f8524b);
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final void c() {
            n.this.h();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z6) {
            return n.this.a(this.f8524b, nVar, eVar, z6);
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(long j6) {
            return n.this.a(this.f8524b, j6);
        }
    }

    public n(Uri uri, com.anythink.basead.exoplayer.j.h hVar, com.anythink.basead.exoplayer.e.e[] eVarArr, int i, t.a aVar, c cVar, com.anythink.basead.exoplayer.j.b bVar, String str, int i4) {
        this.f8483b = uri;
        this.f8484c = hVar;
        this.f8485d = i;
        this.f8486e = aVar;
        this.f8487f = cVar;
        this.f8488g = bVar;
        this.f8489h = str;
        this.i = i4;
        this.f8491k = new b(eVarArr, this);
        this.f8502v = i == -1 ? 3 : i;
        aVar.a();
    }

    private boolean j() {
        return this.f8504x || o();
    }

    private void k() {
        if (this.f8482M || this.f8501u || this.f8497q == null || !this.f8500t) {
            return;
        }
        for (x xVar : this.f8498r) {
            if (xVar.f() == null) {
                return;
            }
        }
        this.f8492l.b();
        int length = this.f8498r.length;
        ae[] aeVarArr = new ae[length];
        this.f8474D = new boolean[length];
        this.f8473C = new boolean[length];
        this.f8475E = new boolean[length];
        this.f8472B = this.f8497q.b();
        int i = 0;
        while (true) {
            boolean z6 = true;
            if (i >= length) {
                break;
            }
            com.anythink.basead.exoplayer.m f2 = this.f8498r[i].f();
            aeVarArr[i] = new ae(f2);
            String str = f2.f9451h;
            if (!com.anythink.basead.exoplayer.k.o.b(str) && !com.anythink.basead.exoplayer.k.o.a(str)) {
                z6 = false;
            }
            this.f8474D[i] = z6;
            this.f8476F = z6 | this.f8476F;
            i++;
        }
        this.f8471A = new af(aeVarArr);
        if (this.f8485d == -1 && this.f8477G == -1 && this.f8497q.b() == com.anythink.basead.exoplayer.b.f7168b) {
            this.f8502v = 6;
        }
        this.f8501u = true;
        this.f8487f.a(this.f8472B, this.f8497q.a());
        this.f8496p.a((r) this);
    }

    private void l() {
        a aVar = new a(this.f8483b, this.f8484c, this.f8491k, this.f8492l);
        if (this.f8501u) {
            com.anythink.basead.exoplayer.k.a.b(o());
            long j6 = this.f8472B;
            if (j6 != com.anythink.basead.exoplayer.b.f7168b && this.f8479I >= j6) {
                this.f8481L = true;
                this.f8479I = com.anythink.basead.exoplayer.b.f7168b;
                return;
            } else {
                aVar.a(this.f8497q.a(this.f8479I).f7962a.f7968c, this.f8479I);
                this.f8479I = com.anythink.basead.exoplayer.b.f7168b;
            }
        }
        this.f8480K = m();
        this.f8486e.a(aVar.f8517j, 1, -1, null, 0, null, aVar.i, this.f8472B, this.f8490j.a(aVar, this, this.f8502v));
    }

    private int m() {
        int i = 0;
        for (x xVar : this.f8498r) {
            i += xVar.b();
        }
        return i;
    }

    private long n() {
        long j6 = Long.MIN_VALUE;
        for (x xVar : this.f8498r) {
            j6 = Math.max(j6, xVar.g());
        }
        return j6;
    }

    private boolean o() {
        return this.f8479I != com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ int a(a aVar, long j6, long j9, IOException iOException) {
        com.anythink.basead.exoplayer.e.k kVar;
        a aVar2 = aVar;
        boolean z6 = iOException instanceof ag;
        this.f8486e.a(aVar2.f8517j, 1, -1, null, 0, null, aVar2.i, this.f8472B, j6, j9, aVar2.f8519l, iOException, z6);
        a(aVar2);
        if (z6) {
            return 3;
        }
        int m9 = m();
        boolean z9 = m9 > this.f8480K;
        if (this.f8477G == -1 && ((kVar = this.f8497q) == null || kVar.b() == com.anythink.basead.exoplayer.b.f7168b)) {
            if (this.f8501u && !j()) {
                this.J = true;
                return 2;
            }
            this.f8504x = this.f8501u;
            this.f8478H = 0L;
            this.f8480K = 0;
            for (x xVar : this.f8498r) {
                xVar.a();
            }
            aVar2.a(0L, 0L);
        } else {
            this.f8480K = m9;
        }
        return z9 ? 1 : 0;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final void c_() {
        this.f8500t = true;
        this.f8495o.post(this.f8493m);
    }

    public final void h() {
        this.f8490j.a(this.f8502v);
    }

    @Override // com.anythink.basead.exoplayer.h.x.b
    public final void i() {
        this.f8495o.post(this.f8493m);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f8471A;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        if (this.f8481L || this.J) {
            return false;
        }
        if (this.f8501u && this.f8506z == 0) {
            return false;
        }
        boolean a9 = this.f8492l.a();
        if (this.f8490j.a()) {
            return a9;
        }
        l();
        return true;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        long n9;
        if (this.f8481L) {
            return Long.MIN_VALUE;
        }
        if (o()) {
            return this.f8479I;
        }
        if (this.f8476F) {
            int length = this.f8498r.length;
            n9 = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (this.f8474D[i]) {
                    n9 = Math.min(n9, this.f8498r[i].g());
                }
            }
        } else {
            n9 = n();
        }
        return n9 == Long.MIN_VALUE ? this.f8478H : n9;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        if (this.f8506z == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    public final void f() {
        if (this.f8501u) {
            for (x xVar : this.f8498r) {
                xVar.j();
            }
        }
        this.f8490j.a(this);
        this.f8495o.removeCallbacksAndMessages(null);
        this.f8496p = null;
        this.f8482M = true;
        this.f8486e.b();
    }

    @Override // com.anythink.basead.exoplayer.j.t.d
    public final void g() {
        for (x xVar : this.f8498r) {
            xVar.a();
        }
        this.f8491k.a();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j6) {
        if (!this.f8497q.a()) {
            j6 = 0;
        }
        this.f8478H = j6;
        this.f8504x = false;
        if (o() || !d(j6)) {
            this.J = false;
            this.f8479I = j6;
            this.f8481L = false;
            if (this.f8490j.a()) {
                this.f8490j.b();
                return j6;
            }
            for (x xVar : this.f8498r) {
                xVar.a();
            }
        }
        return j6;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        if (!this.f8505y) {
            this.f8486e.c();
            this.f8505y = true;
        }
        if (!this.f8504x) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        if (!this.f8481L && m() <= this.f8480K) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        this.f8504x = false;
        return this.f8478H;
    }

    private void c(int i) {
        if (this.J && this.f8474D[i] && !this.f8498r[i].c()) {
            this.f8479I = 0L;
            this.J = false;
            this.f8504x = true;
            this.f8478H = 0L;
            this.f8480K = 0;
            for (x xVar : this.f8498r) {
                xVar.a();
            }
            this.f8496p.a((r.a) this);
        }
    }

    private boolean d(long j6) {
        int length = this.f8498r.length;
        for (int i = 0; i < length; i++) {
            x xVar = this.f8498r[i];
            xVar.i();
            if (xVar.a(j6, false) == -1 && (this.f8474D[i] || !this.f8476F)) {
                return false;
            }
        }
        return true;
    }

    private void b(int i) {
        if (this.f8475E[i]) {
            return;
        }
        com.anythink.basead.exoplayer.m a9 = this.f8471A.a(i).a(0);
        this.f8486e.a(com.anythink.basead.exoplayer.k.o.d(a9.f9451h), a9, 0, (Object) null, this.f8478H);
        this.f8475E[i] = true;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.e.e[] f8520a;

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.e.g f8521b;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.basead.exoplayer.e.e f8522c;

        public b(com.anythink.basead.exoplayer.e.e[] eVarArr, com.anythink.basead.exoplayer.e.g gVar) {
            this.f8520a = eVarArr;
            this.f8521b = gVar;
        }

        public final com.anythink.basead.exoplayer.e.e a(com.anythink.basead.exoplayer.e.f fVar, Uri uri) {
            com.anythink.basead.exoplayer.e.e eVar = this.f8522c;
            if (eVar != null) {
                return eVar;
            }
            com.anythink.basead.exoplayer.e.e[] eVarArr = this.f8520a;
            int length = eVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                com.anythink.basead.exoplayer.e.e eVar2 = eVarArr[i];
                try {
                    if (eVar2.a(fVar)) {
                        this.f8522c = eVar2;
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
            com.anythink.basead.exoplayer.e.e eVar3 = this.f8522c;
            if (eVar3 == null) {
                throw new ag(Wv.i(new StringBuilder("None of the available extractors ("), com.anythink.basead.exoplayer.k.af.a(this.f8520a), ") could read the stream."), uri);
            }
            eVar3.a(this.f8521b);
            return this.f8522c;
        }

        public final void a() {
            if (this.f8522c != null) {
                this.f8522c = null;
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(a aVar, long j6, long j9) {
        a aVar2 = aVar;
        if (this.f8472B == com.anythink.basead.exoplayer.b.f7168b) {
            long n9 = n();
            long j10 = n9 == Long.MIN_VALUE ? 0L : n9 + f8470a;
            this.f8472B = j10;
            this.f8487f.a(j10, this.f8497q.a());
        }
        this.f8486e.a(aVar2.f8517j, 1, -1, null, 0, null, aVar2.i, this.f8472B, j6, j9, aVar2.f8519l);
        a(aVar2);
        this.f8481L = true;
        this.f8496p.a((r.a) this);
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(a aVar, long j6, long j9, boolean z6) {
        a aVar2 = aVar;
        this.f8486e.b(aVar2.f8517j, 1, -1, null, 0, null, aVar2.i, this.f8472B, j6, j9, aVar2.f8519l);
        if (z6) {
            return;
        }
        a(aVar2);
        for (x xVar : this.f8498r) {
            xVar.a();
        }
        if (this.f8506z > 0) {
            this.f8496p.a((r.a) this);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j6) {
        this.f8496p = aVar;
        this.f8492l.a();
        l();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
        h();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j6) {
        com.anythink.basead.exoplayer.i.f fVar;
        com.anythink.basead.exoplayer.k.a.b(this.f8501u);
        int i = this.f8506z;
        int i4 = 0;
        for (int i6 = 0; i6 < fVarArr.length; i6++) {
            y yVar = yVarArr[i6];
            if (yVar != null && (fVarArr[i6] == null || !zArr[i6])) {
                int i9 = ((d) yVar).f8524b;
                com.anythink.basead.exoplayer.k.a.b(this.f8473C[i9]);
                this.f8506z--;
                this.f8473C[i9] = false;
                yVarArr[i6] = null;
            }
        }
        boolean z6 = !this.f8503w ? j6 == 0 : i != 0;
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            if (yVarArr[i10] == null && (fVar = fVarArr[i10]) != null) {
                com.anythink.basead.exoplayer.k.a.b(fVar.g() == 1);
                com.anythink.basead.exoplayer.k.a.b(fVar.b(0) == 0);
                int a9 = this.f8471A.a(fVar.f());
                com.anythink.basead.exoplayer.k.a.b(!this.f8473C[a9]);
                this.f8506z++;
                this.f8473C[a9] = true;
                yVarArr[i10] = new d(a9);
                zArr2[i10] = true;
                if (!z6) {
                    x xVar = this.f8498r[a9];
                    xVar.i();
                    z6 = xVar.a(j6, true) == -1 && xVar.e() != 0;
                }
            }
        }
        if (this.f8506z == 0) {
            this.J = false;
            this.f8504x = false;
            if (this.f8490j.a()) {
                x[] xVarArr = this.f8498r;
                int length = xVarArr.length;
                while (i4 < length) {
                    xVarArr[i4].j();
                    i4++;
                }
                this.f8490j.b();
            } else {
                x[] xVarArr2 = this.f8498r;
                int length2 = xVarArr2.length;
                while (i4 < length2) {
                    xVarArr2[i4].a();
                    i4++;
                }
            }
        } else if (z6) {
            j6 = b(j6);
            while (i4 < yVarArr.length) {
                if (yVarArr[i4] != null) {
                    zArr2[i4] = true;
                }
                i4++;
            }
        }
        this.f8503w = true;
        return j6;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j6, boolean z6) {
        int length = this.f8498r.length;
        for (int i = 0; i < length; i++) {
            this.f8498r[i].a(j6, z6, this.f8473C[i]);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j6, com.anythink.basead.exoplayer.ac acVar) {
        if (!this.f8497q.a()) {
            return 0L;
        }
        k.a a9 = this.f8497q.a(j6);
        return com.anythink.basead.exoplayer.k.af.a(j6, acVar, a9.f7962a.f7967b, a9.f7963b.f7967b);
    }

    public final boolean a(int i) {
        if (j()) {
            return false;
        }
        return this.f8481L || this.f8498r[i].c();
    }

    public final int a(int i, com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z6) {
        if (j()) {
            return -3;
        }
        int a9 = this.f8498r[i].a(nVar, eVar, z6, this.f8481L, this.f8478H);
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
        int i4 = 0;
        if (j()) {
            return 0;
        }
        x xVar = this.f8498r[i];
        if (this.f8481L && j6 > xVar.g()) {
            i4 = xVar.k();
        } else {
            int a9 = xVar.a(j6, true);
            if (a9 != -1) {
                i4 = a9;
            }
        }
        if (i4 > 0) {
            b(i);
            return i4;
        }
        c(i);
        return i4;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(a aVar, long j6, long j9) {
        if (this.f8472B == com.anythink.basead.exoplayer.b.f7168b) {
            long n9 = n();
            long j10 = n9 == Long.MIN_VALUE ? 0L : n9 + f8470a;
            this.f8472B = j10;
            this.f8487f.a(j10, this.f8497q.a());
        }
        this.f8486e.a(aVar.f8517j, 1, -1, null, 0, null, aVar.i, this.f8472B, j6, j9, aVar.f8519l);
        a(aVar);
        this.f8481L = true;
        this.f8496p.a((r.a) this);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(a aVar, long j6, long j9, boolean z6) {
        this.f8486e.b(aVar.f8517j, 1, -1, null, 0, null, aVar.i, this.f8472B, j6, j9, aVar.f8519l);
        if (z6) {
            return;
        }
        a(aVar);
        for (x xVar : this.f8498r) {
            xVar.a();
        }
        if (this.f8506z > 0) {
            this.f8496p.a((r.a) this);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final com.anythink.basead.exoplayer.e.m a(int i, int i4) {
        int length = this.f8498r.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (this.f8499s[i6] == i) {
                return this.f8498r[i6];
            }
        }
        x xVar = new x(this.f8488g);
        xVar.a(this);
        int i9 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f8499s, i9);
        this.f8499s = copyOf;
        copyOf[length] = i;
        x[] xVarArr = (x[]) Arrays.copyOf(this.f8498r, i9);
        this.f8498r = xVarArr;
        xVarArr[length] = xVar;
        return xVar;
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final void a(com.anythink.basead.exoplayer.e.k kVar) {
        this.f8497q = kVar;
        this.f8495o.post(this.f8493m);
    }

    private void a(a aVar) {
        if (this.f8477G == -1) {
            this.f8477G = aVar.f8518k;
        }
    }

    private boolean a(a aVar, int i) {
        com.anythink.basead.exoplayer.e.k kVar;
        if (this.f8477G == -1 && ((kVar = this.f8497q) == null || kVar.b() == com.anythink.basead.exoplayer.b.f7168b)) {
            if (this.f8501u && !j()) {
                this.J = true;
                return false;
            }
            this.f8504x = this.f8501u;
            this.f8478H = 0L;
            this.f8480K = 0;
            for (x xVar : this.f8498r) {
                xVar.a();
            }
            aVar.a(0L, 0L);
            return true;
        }
        this.f8480K = i;
        return true;
    }

    private static boolean a(IOException iOException) {
        return iOException instanceof ag;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private int a2(a aVar, long j6, long j9, IOException iOException) {
        com.anythink.basead.exoplayer.e.k kVar;
        boolean z6 = iOException instanceof ag;
        this.f8486e.a(aVar.f8517j, 1, -1, null, 0, null, aVar.i, this.f8472B, j6, j9, aVar.f8519l, iOException, z6);
        a(aVar);
        if (z6) {
            return 3;
        }
        int m9 = m();
        boolean z9 = m9 > this.f8480K;
        if (this.f8477G == -1 && ((kVar = this.f8497q) == null || kVar.b() == com.anythink.basead.exoplayer.b.f7168b)) {
            if (this.f8501u && !j()) {
                this.J = true;
                return 2;
            }
            this.f8504x = this.f8501u;
            this.f8478H = 0L;
            this.f8480K = 0;
            for (x xVar : this.f8498r) {
                xVar.a();
            }
            aVar.a(0L, 0L);
        } else {
            this.f8480K = m9;
        }
        return z9 ? 1 : 0;
    }

    public static /* synthetic */ void a(n nVar) {
        if (nVar.f8482M || nVar.f8501u || nVar.f8497q == null || !nVar.f8500t) {
            return;
        }
        for (x xVar : nVar.f8498r) {
            if (xVar.f() == null) {
                return;
            }
        }
        nVar.f8492l.b();
        int length = nVar.f8498r.length;
        ae[] aeVarArr = new ae[length];
        nVar.f8474D = new boolean[length];
        nVar.f8473C = new boolean[length];
        nVar.f8475E = new boolean[length];
        nVar.f8472B = nVar.f8497q.b();
        int i = 0;
        while (true) {
            boolean z6 = true;
            if (i >= length) {
                break;
            }
            com.anythink.basead.exoplayer.m f2 = nVar.f8498r[i].f();
            aeVarArr[i] = new ae(f2);
            String str = f2.f9451h;
            if (!com.anythink.basead.exoplayer.k.o.b(str) && !com.anythink.basead.exoplayer.k.o.a(str)) {
                z6 = false;
            }
            nVar.f8474D[i] = z6;
            nVar.f8476F = z6 | nVar.f8476F;
            i++;
        }
        nVar.f8471A = new af(aeVarArr);
        if (nVar.f8485d == -1 && nVar.f8477G == -1 && nVar.f8497q.b() == com.anythink.basead.exoplayer.b.f7168b) {
            nVar.f8502v = 6;
        }
        nVar.f8501u = true;
        nVar.f8487f.a(nVar.f8472B, nVar.f8497q.a());
        nVar.f8496p.a((r) nVar);
    }
}
