package com.anythink.basead.exoplayer.h.b;

import android.util.Log;
import com.anythink.basead.exoplayer.h.b.g;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.h.x;
import com.anythink.basead.exoplayer.h.y;
import com.anythink.basead.exoplayer.h.z;
import com.anythink.basead.exoplayer.j.t;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.m;
import com.anythink.basead.exoplayer.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f<T extends g> implements y, z, t.a<c>, t.d {

    /* renamed from: d, reason: collision with root package name */
    private static final String f8334d = "ChunkSampleStream";

    /* renamed from: a, reason: collision with root package name */
    public final int f8335a;

    /* renamed from: b, reason: collision with root package name */
    long f8336b;

    /* renamed from: c, reason: collision with root package name */
    boolean f8337c;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f8338e;

    /* renamed from: f, reason: collision with root package name */
    private final m[] f8339f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f8340g;

    /* renamed from: h, reason: collision with root package name */
    private final T f8341h;
    private final z.a<f<T>> i;

    /* renamed from: j, reason: collision with root package name */
    private final t.a f8342j;

    /* renamed from: k, reason: collision with root package name */
    private final int f8343k;

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.t f8344l = new com.anythink.basead.exoplayer.j.t("Loader:ChunkSampleStream");

    /* renamed from: m, reason: collision with root package name */
    private final e f8345m = new e();

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList<com.anythink.basead.exoplayer.h.b.a> f8346n;

    /* renamed from: o, reason: collision with root package name */
    private final List<com.anythink.basead.exoplayer.h.b.a> f8347o;

    /* renamed from: p, reason: collision with root package name */
    private final x f8348p;

    /* renamed from: q, reason: collision with root package name */
    private final x[] f8349q;

    /* renamed from: r, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.h.b.b f8350r;

    /* renamed from: s, reason: collision with root package name */
    private m f8351s;

    /* renamed from: t, reason: collision with root package name */
    private b<T> f8352t;

    /* renamed from: u, reason: collision with root package name */
    private long f8353u;

    /* renamed from: v, reason: collision with root package name */
    private long f8354v;

    public interface b<T extends g> {
        void a();
    }

    private f(int i, int[] iArr, m[] mVarArr, T t6, z.a<f<T>> aVar, com.anythink.basead.exoplayer.j.b bVar, long j6, int i4, t.a aVar2) {
        this.f8335a = i;
        this.f8338e = iArr;
        this.f8339f = mVarArr;
        this.f8341h = t6;
        this.i = aVar;
        this.f8342j = aVar2;
        this.f8343k = i4;
        ArrayList<com.anythink.basead.exoplayer.h.b.a> arrayList = new ArrayList<>();
        this.f8346n = arrayList;
        this.f8347o = Collections.unmodifiableList(arrayList);
        int i6 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.f8349q = new x[length];
        this.f8340g = new boolean[length];
        int i9 = length + 1;
        int[] iArr2 = new int[i9];
        x[] xVarArr = new x[i9];
        x xVar = new x(bVar);
        this.f8348p = xVar;
        iArr2[0] = i;
        xVarArr[0] = xVar;
        while (i6 < length) {
            x xVar2 = new x(bVar);
            this.f8349q[i6] = xVar2;
            int i10 = i6 + 1;
            xVarArr[i10] = xVar2;
            iArr2[i10] = iArr[i6];
            i6 = i10;
        }
        this.f8350r = new com.anythink.basead.exoplayer.h.b.b(iArr2, xVarArr);
        this.f8353u = j6;
        this.f8354v = j6;
    }

    private T f() {
        return this.f8341h;
    }

    private long h() {
        return this.f8341h.a();
    }

    private void i() {
        this.f8352t = null;
        this.f8348p.j();
        for (x xVar : this.f8349q) {
            xVar.j();
        }
        this.f8344l.a(this);
    }

    private com.anythink.basead.exoplayer.h.b.a j() {
        return this.f8346n.get(r0.size() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[RETURN] */
    @Override // com.anythink.basead.exoplayer.j.t.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ int a(c cVar, long j6, long j9, IOException iOException) {
        boolean z6;
        c cVar2 = cVar;
        long d9 = cVar2.d();
        boolean z9 = cVar2 instanceof com.anythink.basead.exoplayer.h.b.a;
        int size = this.f8346n.size() - 1;
        boolean z10 = (d9 != 0 && z9 && a(size)) ? false : true;
        if (this.f8341h.f()) {
            if (z10) {
                if (z9) {
                    com.anythink.basead.exoplayer.k.a.b(d(size) == cVar2);
                    if (this.f8346n.isEmpty()) {
                        this.f8353u = this.f8354v;
                    }
                }
                z6 = true;
                this.f8342j.a(cVar2.f8312b, cVar2.f8313c, this.f8335a, cVar2.f8314d, cVar2.f8315e, cVar2.f8316f, cVar2.f8317g, cVar2.f8318h, j6, j9, d9, iOException, z6);
                if (z6) {
                    return 0;
                }
                this.i.a(this);
                return 2;
            }
            Log.w(f8334d, "Ignoring attempt to cancel non-cancelable load.");
        }
        z6 = false;
        this.f8342j.a(cVar2.f8312b, cVar2.f8313c, this.f8335a, cVar2.f8314d, cVar2.f8315e, cVar2.f8316f, cVar2.f8317g, cVar2.f8318h, j6, j9, d9, iOException, z6);
        if (z6) {
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
        int size;
        int c9;
        if (this.f8344l.a() || a() || (size = this.f8346n.size()) <= (c9 = this.f8341h.c())) {
            return;
        }
        while (true) {
            if (c9 >= size) {
                c9 = size;
                break;
            } else if (!a(c9)) {
                break;
            } else {
                c9++;
            }
        }
        if (c9 == size) {
            return;
        }
        long j9 = j().f8318h;
        com.anythink.basead.exoplayer.h.b.a d9 = d(c9);
        if (this.f8346n.isEmpty()) {
            this.f8353u = this.f8354v;
        }
        this.f8337c = false;
        this.f8342j.a(this.f8335a, d9.f8317g, j9);
    }

    @Override // com.anythink.basead.exoplayer.j.t.d
    public final void g() {
        this.f8348p.a();
        for (x xVar : this.f8349q) {
            xVar.a();
        }
    }

    private void b(long j6) {
        com.anythink.basead.exoplayer.h.b.a aVar;
        boolean z6;
        this.f8354v = j6;
        this.f8348p.i();
        if (a()) {
            z6 = false;
        } else {
            for (int i = 0; i < this.f8346n.size(); i++) {
                aVar = this.f8346n.get(i);
                long j9 = aVar.f8317g;
                if (j9 == j6 && aVar.f8306a == com.anythink.basead.exoplayer.b.f7168b) {
                    break;
                } else {
                    if (j9 > j6) {
                        break;
                    }
                }
            }
            aVar = null;
            if (aVar != null) {
                z6 = this.f8348p.b(aVar.a(0));
                this.f8336b = Long.MIN_VALUE;
            } else {
                z6 = this.f8348p.a(j6, (j6 > e() ? 1 : (j6 == e() ? 0 : -1)) < 0) != -1;
                this.f8336b = this.f8354v;
            }
        }
        if (z6) {
            for (x xVar : this.f8349q) {
                xVar.i();
                xVar.a(j6, false);
            }
            return;
        }
        this.f8353u = j6;
        this.f8337c = false;
        this.f8346n.clear();
        if (this.f8344l.a()) {
            this.f8344l.b();
            return;
        }
        this.f8348p.a();
        for (x xVar2 : this.f8349q) {
            xVar2.a();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.y
    public final void c() {
        this.f8344l.c();
        this.f8344l.a();
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long d() {
        if (this.f8337c) {
            return Long.MIN_VALUE;
        }
        if (a()) {
            return this.f8353u;
        }
        long j6 = this.f8354v;
        com.anythink.basead.exoplayer.h.b.a j9 = j();
        if (!j9.f()) {
            if (this.f8346n.size() > 1) {
                j9 = this.f8346n.get(r2.size() - 2);
            } else {
                j9 = null;
            }
        }
        if (j9 != null) {
            j6 = Math.max(j6, j9.f8318h);
        }
        return Math.max(j6, this.f8348p.g());
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long e() {
        if (a()) {
            return this.f8353u;
        }
        if (this.f8337c) {
            return Long.MIN_VALUE;
        }
        return j().f8318h;
    }

    public final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final f<T> f8355a;

        /* renamed from: c, reason: collision with root package name */
        private final x f8357c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8358d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8359e;

        public a(f<T> fVar, x xVar, int i) {
            this.f8355a = fVar;
            this.f8357c = xVar;
            this.f8358d = i;
        }

        private void d() {
            if (this.f8359e) {
                return;
            }
            f.this.f8342j.a(f.this.f8338e[this.f8358d], f.this.f8339f[this.f8358d], 0, (Object) null, f.this.f8354v);
            this.f8359e = true;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(long j6) {
            int a9;
            if (!f.this.f8337c || j6 <= this.f8357c.g()) {
                a9 = this.f8357c.a(j6, true);
                if (a9 == -1) {
                    a9 = 0;
                }
            } else {
                a9 = this.f8357c.k();
            }
            if (a9 > 0) {
                d();
            }
            return a9;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final boolean b() {
            f fVar = f.this;
            if (fVar.f8337c) {
                return true;
            }
            return !fVar.a() && this.f8357c.c();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final void c() {
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z6) {
            if (f.this.a()) {
                return -3;
            }
            x xVar = this.f8357c;
            f fVar = f.this;
            int a9 = xVar.a(nVar, eVar, z6, fVar.f8337c, fVar.f8336b);
            if (a9 == -4) {
                d();
            }
            return a9;
        }

        private void a() {
            com.anythink.basead.exoplayer.k.a.b(f.this.f8340g[this.f8358d]);
            f.this.f8340g[this.f8358d] = false;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        if (this.f8337c || this.f8344l.a()) {
            return false;
        }
        boolean a9 = a();
        if (!a9) {
            j();
        }
        e eVar = this.f8345m;
        boolean z6 = eVar.f8333b;
        c cVar = eVar.f8332a;
        eVar.f8332a = null;
        eVar.f8333b = false;
        if (z6) {
            this.f8353u = com.anythink.basead.exoplayer.b.f7168b;
            this.f8337c = true;
            return true;
        }
        if (cVar == null) {
            return false;
        }
        if (cVar instanceof com.anythink.basead.exoplayer.h.b.a) {
            com.anythink.basead.exoplayer.h.b.a aVar = (com.anythink.basead.exoplayer.h.b.a) cVar;
            if (a9) {
                long j9 = aVar.f8317g;
                long j10 = this.f8353u;
                if (j9 == j10) {
                    j10 = Long.MIN_VALUE;
                }
                this.f8336b = j10;
                this.f8353u = com.anythink.basead.exoplayer.b.f7168b;
            }
            aVar.a(this.f8350r);
            this.f8346n.add(aVar);
        }
        this.f8342j.a(cVar.f8312b, cVar.f8313c, this.f8335a, cVar.f8314d, cVar.f8315e, cVar.f8316f, cVar.f8317g, cVar.f8318h, this.f8344l.a(cVar, this, this.f8343k));
        return true;
    }

    private com.anythink.basead.exoplayer.h.b.a d(int i) {
        com.anythink.basead.exoplayer.h.b.a aVar = this.f8346n.get(i);
        ArrayList<com.anythink.basead.exoplayer.h.b.a> arrayList = this.f8346n;
        af.a((List) arrayList, i, arrayList.size());
        int i4 = 0;
        this.f8348p.a(aVar.a(0));
        while (true) {
            x[] xVarArr = this.f8349q;
            if (i4 >= xVarArr.length) {
                return aVar;
            }
            x xVar = xVarArr[i4];
            i4++;
            xVar.a(aVar.a(i4));
        }
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(c cVar, long j6, long j9) {
        c cVar2 = cVar;
        this.f8342j.a(cVar2.f8312b, cVar2.f8313c, this.f8335a, cVar2.f8314d, cVar2.f8315e, cVar2.f8316f, cVar2.f8317g, cVar2.f8318h, j6, j9, cVar2.d());
        this.i.a(this);
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(c cVar, long j6, long j9, boolean z6) {
        c cVar2 = cVar;
        this.f8342j.b(cVar2.f8312b, cVar2.f8313c, this.f8335a, cVar2.f8314d, cVar2.f8315e, cVar2.f8316f, cVar2.f8317g, cVar2.f8318h, j6, j9, cVar2.d());
        if (z6) {
            return;
        }
        this.f8348p.a();
        for (x xVar : this.f8349q) {
            xVar.a();
        }
        this.i.a(this);
    }

    private void c(int i) {
        com.anythink.basead.exoplayer.h.b.a aVar = this.f8346n.get(i);
        m mVar = aVar.f8314d;
        if (!mVar.equals(this.f8351s)) {
            this.f8342j.a(this.f8335a, mVar, aVar.f8315e, aVar.f8316f, aVar.f8317g);
        }
        this.f8351s = mVar;
    }

    @Override // com.anythink.basead.exoplayer.h.y
    public final boolean b() {
        if (this.f8337c) {
            return true;
        }
        return !a() && this.f8348p.c();
    }

    private void a(long j6, boolean z6) {
        int d9 = this.f8348p.d();
        this.f8348p.a(j6, z6, true);
        int d10 = this.f8348p.d();
        if (d10 > d9) {
            long h3 = this.f8348p.h();
            int i = 0;
            while (true) {
                x[] xVarArr = this.f8349q;
                if (i >= xVarArr.length) {
                    break;
                }
                xVarArr[i].a(h3, z6, this.f8340g[i]);
                i++;
            }
            int b9 = b(d10, 0);
            if (b9 > 0) {
                af.a((List) this.f8346n, 0, b9);
            }
        }
    }

    private void b(int i) {
        int b9 = b(i, 0);
        if (b9 > 0) {
            af.a((List) this.f8346n, 0, b9);
        }
    }

    private int b(int i, int i4) {
        do {
            i4++;
            if (i4 >= this.f8346n.size()) {
                return this.f8346n.size() - 1;
            }
        } while (this.f8346n.get(i4).a(0) <= i);
        return i4 - 1;
    }

    private f<T>.a a(long j6, int i) {
        for (int i4 = 0; i4 < this.f8349q.length; i4++) {
            if (this.f8338e[i4] == i) {
                com.anythink.basead.exoplayer.k.a.b(!this.f8340g[i4]);
                this.f8340g[i4] = true;
                this.f8349q[i4].i();
                this.f8349q[i4].a(j6, true);
                return new a(this, this.f8349q[i4], i4);
            }
        }
        throw new IllegalStateException();
    }

    private void a(b<T> bVar) {
        this.f8352t = bVar;
        this.f8348p.j();
        for (x xVar : this.f8349q) {
            xVar.j();
        }
        this.f8344l.a(this);
    }

    @Override // com.anythink.basead.exoplayer.h.y
    public final int a(n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z6) {
        if (a()) {
            return -3;
        }
        int a9 = this.f8348p.a(nVar, eVar, z6, this.f8337c, this.f8336b);
        if (a9 == -4) {
            a(this.f8348p.e(), 1);
        }
        return a9;
    }

    @Override // com.anythink.basead.exoplayer.h.y
    public final int a(long j6) {
        int i = 0;
        if (a()) {
            return 0;
        }
        if (this.f8337c && j6 > this.f8348p.g()) {
            i = this.f8348p.k();
        } else {
            int a9 = this.f8348p.a(j6, true);
            if (a9 != -1) {
                i = a9;
            }
        }
        if (i > 0) {
            a(this.f8348p.e(), i);
        }
        return i;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(c cVar, long j6, long j9) {
        this.f8342j.a(cVar.f8312b, cVar.f8313c, this.f8335a, cVar.f8314d, cVar.f8315e, cVar.f8316f, cVar.f8317g, cVar.f8318h, j6, j9, cVar.d());
        this.i.a(this);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(c cVar, long j6, long j9, boolean z6) {
        this.f8342j.b(cVar.f8312b, cVar.f8313c, this.f8335a, cVar.f8314d, cVar.f8315e, cVar.f8316f, cVar.f8317g, cVar.f8318h, j6, j9, cVar.d());
        if (z6) {
            return;
        }
        this.f8348p.a();
        for (x xVar : this.f8349q) {
            xVar.a();
        }
        this.i.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[RETURN] */
    /* renamed from: a, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int a2(c cVar, long j6, long j9, IOException iOException) {
        boolean z6;
        long d9 = cVar.d();
        boolean z9 = cVar instanceof com.anythink.basead.exoplayer.h.b.a;
        int size = this.f8346n.size() - 1;
        boolean z10 = (d9 != 0 && z9 && a(size)) ? false : true;
        if (this.f8341h.f()) {
            if (!z10) {
                Log.w(f8334d, "Ignoring attempt to cancel non-cancelable load.");
            } else {
                if (z9) {
                    com.anythink.basead.exoplayer.k.a.b(d(size) == cVar);
                    if (this.f8346n.isEmpty()) {
                        this.f8353u = this.f8354v;
                    }
                }
                z6 = true;
                this.f8342j.a(cVar.f8312b, cVar.f8313c, this.f8335a, cVar.f8314d, cVar.f8315e, cVar.f8316f, cVar.f8317g, cVar.f8318h, j6, j9, d9, iOException, z6);
                if (z6) {
                    return 0;
                }
                this.i.a(this);
                return 2;
            }
        }
        z6 = false;
        this.f8342j.a(cVar.f8312b, cVar.f8313c, this.f8335a, cVar.f8314d, cVar.f8315e, cVar.f8316f, cVar.f8317g, cVar.f8318h, j6, j9, d9, iOException, z6);
        if (z6) {
        }
    }

    private static boolean a(c cVar) {
        return cVar instanceof com.anythink.basead.exoplayer.h.b.a;
    }

    private boolean a(int i) {
        int e9;
        com.anythink.basead.exoplayer.h.b.a aVar = this.f8346n.get(i);
        if (this.f8348p.e() > aVar.a(0)) {
            return true;
        }
        int i4 = 0;
        do {
            x[] xVarArr = this.f8349q;
            if (i4 >= xVarArr.length) {
                return false;
            }
            e9 = xVarArr[i4].e();
            i4++;
        } while (e9 <= aVar.a(i4));
        return true;
    }

    public final boolean a() {
        return this.f8353u != com.anythink.basead.exoplayer.b.f7168b;
    }

    private void a(int i, int i4) {
        int b9 = b(i - i4, 0);
        int b10 = i4 == 1 ? b9 : b(i - 1, b9);
        while (b9 <= b10) {
            c(b9);
            b9++;
        }
    }
}
