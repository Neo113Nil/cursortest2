package com.anythink.basead.exoplayer.h.b;

import android.util.Log;
import com.anythink.basead.exoplayer.h.b.g;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.h.x;
import com.anythink.basead.exoplayer.h.y;
import com.anythink.basead.exoplayer.h.z;
import com.anythink.basead.exoplayer.j.t;
import com.anythink.basead.exoplayer.k.C0544a;
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
    private static final String f7705d = "ChunkSampleStream";

    /* renamed from: a, reason: collision with root package name */
    public final int f7706a;

    /* renamed from: b, reason: collision with root package name */
    long f7707b;

    /* renamed from: c, reason: collision with root package name */
    boolean f7708c;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f7709e;

    /* renamed from: f, reason: collision with root package name */
    private final m[] f7710f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f7711g;

    /* renamed from: h, reason: collision with root package name */
    private final T f7712h;
    private final z.a<f<T>> i;

    /* renamed from: j, reason: collision with root package name */
    private final t.a f7713j;

    /* renamed from: k, reason: collision with root package name */
    private final int f7714k;

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.t f7715l = new com.anythink.basead.exoplayer.j.t("Loader:ChunkSampleStream");

    /* renamed from: m, reason: collision with root package name */
    private final e f7716m = new e();

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList<com.anythink.basead.exoplayer.h.b.a> f7717n;

    /* renamed from: o, reason: collision with root package name */
    private final List<com.anythink.basead.exoplayer.h.b.a> f7718o;

    /* renamed from: p, reason: collision with root package name */
    private final x f7719p;

    /* renamed from: q, reason: collision with root package name */
    private final x[] f7720q;

    /* renamed from: r, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.h.b.b f7721r;

    /* renamed from: s, reason: collision with root package name */
    private m f7722s;

    /* renamed from: t, reason: collision with root package name */
    private b<T> f7723t;

    /* renamed from: u, reason: collision with root package name */
    private long f7724u;

    /* renamed from: v, reason: collision with root package name */
    private long f7725v;

    public interface b<T extends g> {
        void a();
    }

    private f(int i, int[] iArr, m[] mVarArr, T t9, z.a<f<T>> aVar, com.anythink.basead.exoplayer.j.b bVar, long j9, int i4, t.a aVar2) {
        this.f7706a = i;
        this.f7709e = iArr;
        this.f7710f = mVarArr;
        this.f7712h = t9;
        this.i = aVar;
        this.f7713j = aVar2;
        this.f7714k = i4;
        ArrayList<com.anythink.basead.exoplayer.h.b.a> arrayList = new ArrayList<>();
        this.f7717n = arrayList;
        this.f7718o = Collections.unmodifiableList(arrayList);
        int i9 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.f7720q = new x[length];
        this.f7711g = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        x[] xVarArr = new x[i10];
        x xVar = new x(bVar);
        this.f7719p = xVar;
        iArr2[0] = i;
        xVarArr[0] = xVar;
        while (i9 < length) {
            x xVar2 = new x(bVar);
            this.f7720q[i9] = xVar2;
            int i11 = i9 + 1;
            xVarArr[i11] = xVar2;
            iArr2[i11] = iArr[i9];
            i9 = i11;
        }
        this.f7721r = new com.anythink.basead.exoplayer.h.b.b(iArr2, xVarArr);
        this.f7724u = j9;
        this.f7725v = j9;
    }

    private T f() {
        return this.f7712h;
    }

    private long h() {
        return this.f7712h.a();
    }

    private void i() {
        this.f7723t = null;
        this.f7719p.j();
        for (x xVar : this.f7720q) {
            xVar.j();
        }
        this.f7715l.a(this);
    }

    private com.anythink.basead.exoplayer.h.b.a j() {
        return this.f7717n.get(r0.size() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[RETURN] */
    @Override // com.anythink.basead.exoplayer.j.t.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ int a(c cVar, long j9, long j10, IOException iOException) {
        boolean z8;
        c cVar2 = cVar;
        long d2 = cVar2.d();
        boolean z9 = cVar2 instanceof com.anythink.basead.exoplayer.h.b.a;
        int size = this.f7717n.size() - 1;
        boolean z10 = (d2 != 0 && z9 && a(size)) ? false : true;
        if (this.f7712h.f()) {
            if (z10) {
                if (z9) {
                    C0544a.b(d(size) == cVar2);
                    if (this.f7717n.isEmpty()) {
                        this.f7724u = this.f7725v;
                    }
                }
                z8 = true;
                this.f7713j.a(cVar2.f7683b, cVar2.f7684c, this.f7706a, cVar2.f7685d, cVar2.f7686e, cVar2.f7687f, cVar2.f7688g, cVar2.f7689h, j9, j10, d2, iOException, z8);
                if (z8) {
                    return 0;
                }
                this.i.a(this);
                return 2;
            }
            Log.w(f7705d, "Ignoring attempt to cancel non-cancelable load.");
        }
        z8 = false;
        this.f7713j.a(cVar2.f7683b, cVar2.f7684c, this.f7706a, cVar2.f7685d, cVar2.f7686e, cVar2.f7687f, cVar2.f7688g, cVar2.f7689h, j9, j10, d2, iOException, z8);
        if (z8) {
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final void a_(long j9) {
        int size;
        int c4;
        if (this.f7715l.a() || a() || (size = this.f7717n.size()) <= (c4 = this.f7712h.c())) {
            return;
        }
        while (true) {
            if (c4 >= size) {
                c4 = size;
                break;
            } else if (!a(c4)) {
                break;
            } else {
                c4++;
            }
        }
        if (c4 == size) {
            return;
        }
        long j10 = j().f7689h;
        com.anythink.basead.exoplayer.h.b.a d2 = d(c4);
        if (this.f7717n.isEmpty()) {
            this.f7724u = this.f7725v;
        }
        this.f7708c = false;
        this.f7713j.a(this.f7706a, d2.f7688g, j10);
    }

    @Override // com.anythink.basead.exoplayer.j.t.d
    public final void g() {
        this.f7719p.a();
        for (x xVar : this.f7720q) {
            xVar.a();
        }
    }

    private void b(long j9) {
        com.anythink.basead.exoplayer.h.b.a aVar;
        boolean z8;
        this.f7725v = j9;
        this.f7719p.i();
        if (a()) {
            z8 = false;
        } else {
            for (int i = 0; i < this.f7717n.size(); i++) {
                aVar = this.f7717n.get(i);
                long j10 = aVar.f7688g;
                if (j10 == j9 && aVar.f7677a == com.anythink.basead.exoplayer.b.f6539b) {
                    break;
                } else {
                    if (j10 > j9) {
                        break;
                    }
                }
            }
            aVar = null;
            if (aVar != null) {
                z8 = this.f7719p.b(aVar.a(0));
                this.f7707b = Long.MIN_VALUE;
            } else {
                z8 = this.f7719p.a(j9, (j9 > e() ? 1 : (j9 == e() ? 0 : -1)) < 0) != -1;
                this.f7707b = this.f7725v;
            }
        }
        if (z8) {
            for (x xVar : this.f7720q) {
                xVar.i();
                xVar.a(j9, false);
            }
            return;
        }
        this.f7724u = j9;
        this.f7708c = false;
        this.f7717n.clear();
        if (this.f7715l.a()) {
            this.f7715l.b();
            return;
        }
        this.f7719p.a();
        for (x xVar2 : this.f7720q) {
            xVar2.a();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.y
    public final void c() {
        this.f7715l.c();
        this.f7715l.a();
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long d() {
        if (this.f7708c) {
            return Long.MIN_VALUE;
        }
        if (a()) {
            return this.f7724u;
        }
        long j9 = this.f7725v;
        com.anythink.basead.exoplayer.h.b.a j10 = j();
        if (!j10.f()) {
            if (this.f7717n.size() > 1) {
                j10 = this.f7717n.get(r2.size() - 2);
            } else {
                j10 = null;
            }
        }
        if (j10 != null) {
            j9 = Math.max(j9, j10.f7689h);
        }
        return Math.max(j9, this.f7719p.g());
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long e() {
        if (a()) {
            return this.f7724u;
        }
        if (this.f7708c) {
            return Long.MIN_VALUE;
        }
        return j().f7689h;
    }

    public final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final f<T> f7726a;

        /* renamed from: c, reason: collision with root package name */
        private final x f7728c;

        /* renamed from: d, reason: collision with root package name */
        private final int f7729d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f7730e;

        public a(f<T> fVar, x xVar, int i) {
            this.f7726a = fVar;
            this.f7728c = xVar;
            this.f7729d = i;
        }

        private void d() {
            if (this.f7730e) {
                return;
            }
            f.this.f7713j.a(f.this.f7709e[this.f7729d], f.this.f7710f[this.f7729d], 0, (Object) null, f.this.f7725v);
            this.f7730e = true;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(long j9) {
            int a9;
            if (!f.this.f7708c || j9 <= this.f7728c.g()) {
                a9 = this.f7728c.a(j9, true);
                if (a9 == -1) {
                    a9 = 0;
                }
            } else {
                a9 = this.f7728c.k();
            }
            if (a9 > 0) {
                d();
            }
            return a9;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final boolean b() {
            f fVar = f.this;
            if (fVar.f7708c) {
                return true;
            }
            return !fVar.a() && this.f7728c.c();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final void c() {
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z8) {
            if (f.this.a()) {
                return -3;
            }
            x xVar = this.f7728c;
            f fVar = f.this;
            int a9 = xVar.a(nVar, eVar, z8, fVar.f7708c, fVar.f7707b);
            if (a9 == -4) {
                d();
            }
            return a9;
        }

        private void a() {
            C0544a.b(f.this.f7711g[this.f7729d]);
            f.this.f7711g[this.f7729d] = false;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final boolean c(long j9) {
        if (this.f7708c || this.f7715l.a()) {
            return false;
        }
        boolean a9 = a();
        if (!a9) {
            j();
        }
        e eVar = this.f7716m;
        boolean z8 = eVar.f7704b;
        c cVar = eVar.f7703a;
        eVar.f7703a = null;
        eVar.f7704b = false;
        if (z8) {
            this.f7724u = com.anythink.basead.exoplayer.b.f6539b;
            this.f7708c = true;
            return true;
        }
        if (cVar == null) {
            return false;
        }
        if (cVar instanceof com.anythink.basead.exoplayer.h.b.a) {
            com.anythink.basead.exoplayer.h.b.a aVar = (com.anythink.basead.exoplayer.h.b.a) cVar;
            if (a9) {
                long j10 = aVar.f7688g;
                long j11 = this.f7724u;
                if (j10 == j11) {
                    j11 = Long.MIN_VALUE;
                }
                this.f7707b = j11;
                this.f7724u = com.anythink.basead.exoplayer.b.f6539b;
            }
            aVar.a(this.f7721r);
            this.f7717n.add(aVar);
        }
        this.f7713j.a(cVar.f7683b, cVar.f7684c, this.f7706a, cVar.f7685d, cVar.f7686e, cVar.f7687f, cVar.f7688g, cVar.f7689h, this.f7715l.a(cVar, this, this.f7714k));
        return true;
    }

    private com.anythink.basead.exoplayer.h.b.a d(int i) {
        com.anythink.basead.exoplayer.h.b.a aVar = this.f7717n.get(i);
        ArrayList<com.anythink.basead.exoplayer.h.b.a> arrayList = this.f7717n;
        af.a((List) arrayList, i, arrayList.size());
        int i4 = 0;
        this.f7719p.a(aVar.a(0));
        while (true) {
            x[] xVarArr = this.f7720q;
            if (i4 >= xVarArr.length) {
                return aVar;
            }
            x xVar = xVarArr[i4];
            i4++;
            xVar.a(aVar.a(i4));
        }
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(c cVar, long j9, long j10) {
        c cVar2 = cVar;
        this.f7713j.a(cVar2.f7683b, cVar2.f7684c, this.f7706a, cVar2.f7685d, cVar2.f7686e, cVar2.f7687f, cVar2.f7688g, cVar2.f7689h, j9, j10, cVar2.d());
        this.i.a(this);
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(c cVar, long j9, long j10, boolean z8) {
        c cVar2 = cVar;
        this.f7713j.b(cVar2.f7683b, cVar2.f7684c, this.f7706a, cVar2.f7685d, cVar2.f7686e, cVar2.f7687f, cVar2.f7688g, cVar2.f7689h, j9, j10, cVar2.d());
        if (z8) {
            return;
        }
        this.f7719p.a();
        for (x xVar : this.f7720q) {
            xVar.a();
        }
        this.i.a(this);
    }

    private void c(int i) {
        com.anythink.basead.exoplayer.h.b.a aVar = this.f7717n.get(i);
        m mVar = aVar.f7685d;
        if (!mVar.equals(this.f7722s)) {
            this.f7713j.a(this.f7706a, mVar, aVar.f7686e, aVar.f7687f, aVar.f7688g);
        }
        this.f7722s = mVar;
    }

    @Override // com.anythink.basead.exoplayer.h.y
    public final boolean b() {
        if (this.f7708c) {
            return true;
        }
        return !a() && this.f7719p.c();
    }

    private void a(long j9, boolean z8) {
        int d2 = this.f7719p.d();
        this.f7719p.a(j9, z8, true);
        int d3 = this.f7719p.d();
        if (d3 > d2) {
            long h9 = this.f7719p.h();
            int i = 0;
            while (true) {
                x[] xVarArr = this.f7720q;
                if (i >= xVarArr.length) {
                    break;
                }
                xVarArr[i].a(h9, z8, this.f7711g[i]);
                i++;
            }
            int b9 = b(d3, 0);
            if (b9 > 0) {
                af.a((List) this.f7717n, 0, b9);
            }
        }
    }

    private void b(int i) {
        int b9 = b(i, 0);
        if (b9 > 0) {
            af.a((List) this.f7717n, 0, b9);
        }
    }

    private int b(int i, int i4) {
        do {
            i4++;
            if (i4 >= this.f7717n.size()) {
                return this.f7717n.size() - 1;
            }
        } while (this.f7717n.get(i4).a(0) <= i);
        return i4 - 1;
    }

    private f<T>.a a(long j9, int i) {
        for (int i4 = 0; i4 < this.f7720q.length; i4++) {
            if (this.f7709e[i4] == i) {
                C0544a.b(!this.f7711g[i4]);
                this.f7711g[i4] = true;
                this.f7720q[i4].i();
                this.f7720q[i4].a(j9, true);
                return new a(this, this.f7720q[i4], i4);
            }
        }
        throw new IllegalStateException();
    }

    private void a(b<T> bVar) {
        this.f7723t = bVar;
        this.f7719p.j();
        for (x xVar : this.f7720q) {
            xVar.j();
        }
        this.f7715l.a(this);
    }

    @Override // com.anythink.basead.exoplayer.h.y
    public final int a(n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z8) {
        if (a()) {
            return -3;
        }
        int a9 = this.f7719p.a(nVar, eVar, z8, this.f7708c, this.f7707b);
        if (a9 == -4) {
            a(this.f7719p.e(), 1);
        }
        return a9;
    }

    @Override // com.anythink.basead.exoplayer.h.y
    public final int a(long j9) {
        int i = 0;
        if (a()) {
            return 0;
        }
        if (this.f7708c && j9 > this.f7719p.g()) {
            i = this.f7719p.k();
        } else {
            int a9 = this.f7719p.a(j9, true);
            if (a9 != -1) {
                i = a9;
            }
        }
        if (i > 0) {
            a(this.f7719p.e(), i);
        }
        return i;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(c cVar, long j9, long j10) {
        this.f7713j.a(cVar.f7683b, cVar.f7684c, this.f7706a, cVar.f7685d, cVar.f7686e, cVar.f7687f, cVar.f7688g, cVar.f7689h, j9, j10, cVar.d());
        this.i.a(this);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(c cVar, long j9, long j10, boolean z8) {
        this.f7713j.b(cVar.f7683b, cVar.f7684c, this.f7706a, cVar.f7685d, cVar.f7686e, cVar.f7687f, cVar.f7688g, cVar.f7689h, j9, j10, cVar.d());
        if (z8) {
            return;
        }
        this.f7719p.a();
        for (x xVar : this.f7720q) {
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
    private int a2(c cVar, long j9, long j10, IOException iOException) {
        boolean z8;
        long d2 = cVar.d();
        boolean z9 = cVar instanceof com.anythink.basead.exoplayer.h.b.a;
        int size = this.f7717n.size() - 1;
        boolean z10 = (d2 != 0 && z9 && a(size)) ? false : true;
        if (this.f7712h.f()) {
            if (!z10) {
                Log.w(f7705d, "Ignoring attempt to cancel non-cancelable load.");
            } else {
                if (z9) {
                    C0544a.b(d(size) == cVar);
                    if (this.f7717n.isEmpty()) {
                        this.f7724u = this.f7725v;
                    }
                }
                z8 = true;
                this.f7713j.a(cVar.f7683b, cVar.f7684c, this.f7706a, cVar.f7685d, cVar.f7686e, cVar.f7687f, cVar.f7688g, cVar.f7689h, j9, j10, d2, iOException, z8);
                if (z8) {
                    return 0;
                }
                this.i.a(this);
                return 2;
            }
        }
        z8 = false;
        this.f7713j.a(cVar.f7683b, cVar.f7684c, this.f7706a, cVar.f7685d, cVar.f7686e, cVar.f7687f, cVar.f7688g, cVar.f7689h, j9, j10, d2, iOException, z8);
        if (z8) {
        }
    }

    private static boolean a(c cVar) {
        return cVar instanceof com.anythink.basead.exoplayer.h.b.a;
    }

    private boolean a(int i) {
        int e6;
        com.anythink.basead.exoplayer.h.b.a aVar = this.f7717n.get(i);
        if (this.f7719p.e() > aVar.a(0)) {
            return true;
        }
        int i4 = 0;
        do {
            x[] xVarArr = this.f7720q;
            if (i4 >= xVarArr.length) {
                return false;
            }
            e6 = xVarArr[i4].e();
            i4++;
        } while (e6 <= aVar.a(i4));
        return true;
    }

    public final boolean a() {
        return this.f7724u != com.anythink.basead.exoplayer.b.f6539b;
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
