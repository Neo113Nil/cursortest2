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
    private static final String f7548d = "ChunkSampleStream";

    /* renamed from: a, reason: collision with root package name */
    public final int f7549a;

    /* renamed from: b, reason: collision with root package name */
    long f7550b;

    /* renamed from: c, reason: collision with root package name */
    boolean f7551c;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f7552e;

    /* renamed from: f, reason: collision with root package name */
    private final m[] f7553f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f7554g;

    /* renamed from: h, reason: collision with root package name */
    private final T f7555h;
    private final z.a<f<T>> i;

    /* renamed from: j, reason: collision with root package name */
    private final t.a f7556j;

    /* renamed from: k, reason: collision with root package name */
    private final int f7557k;

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.t f7558l = new com.anythink.basead.exoplayer.j.t("Loader:ChunkSampleStream");

    /* renamed from: m, reason: collision with root package name */
    private final e f7559m = new e();

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList<com.anythink.basead.exoplayer.h.b.a> f7560n;

    /* renamed from: o, reason: collision with root package name */
    private final List<com.anythink.basead.exoplayer.h.b.a> f7561o;

    /* renamed from: p, reason: collision with root package name */
    private final x f7562p;

    /* renamed from: q, reason: collision with root package name */
    private final x[] f7563q;

    /* renamed from: r, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.h.b.b f7564r;

    /* renamed from: s, reason: collision with root package name */
    private m f7565s;

    /* renamed from: t, reason: collision with root package name */
    private b<T> f7566t;

    /* renamed from: u, reason: collision with root package name */
    private long f7567u;

    /* renamed from: v, reason: collision with root package name */
    private long f7568v;

    public interface b<T extends g> {
        void a();
    }

    private f(int i, int[] iArr, m[] mVarArr, T t6, z.a<f<T>> aVar, com.anythink.basead.exoplayer.j.b bVar, long j6, int i6, t.a aVar2) {
        this.f7549a = i;
        this.f7552e = iArr;
        this.f7553f = mVarArr;
        this.f7555h = t6;
        this.i = aVar;
        this.f7556j = aVar2;
        this.f7557k = i6;
        ArrayList<com.anythink.basead.exoplayer.h.b.a> arrayList = new ArrayList<>();
        this.f7560n = arrayList;
        this.f7561o = Collections.unmodifiableList(arrayList);
        int i9 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.f7563q = new x[length];
        this.f7554g = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        x[] xVarArr = new x[i10];
        x xVar = new x(bVar);
        this.f7562p = xVar;
        iArr2[0] = i;
        xVarArr[0] = xVar;
        while (i9 < length) {
            x xVar2 = new x(bVar);
            this.f7563q[i9] = xVar2;
            int i11 = i9 + 1;
            xVarArr[i11] = xVar2;
            iArr2[i11] = iArr[i9];
            i9 = i11;
        }
        this.f7564r = new com.anythink.basead.exoplayer.h.b.b(iArr2, xVarArr);
        this.f7567u = j6;
        this.f7568v = j6;
    }

    private T f() {
        return this.f7555h;
    }

    private long h() {
        return this.f7555h.a();
    }

    private void i() {
        this.f7566t = null;
        this.f7562p.j();
        for (x xVar : this.f7563q) {
            xVar.j();
        }
        this.f7558l.a(this);
    }

    private com.anythink.basead.exoplayer.h.b.a j() {
        return this.f7560n.get(r0.size() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[RETURN] */
    @Override // com.anythink.basead.exoplayer.j.t.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ int a(c cVar, long j6, long j9, IOException iOException) {
        boolean z3;
        c cVar2 = cVar;
        long d2 = cVar2.d();
        boolean z6 = cVar2 instanceof com.anythink.basead.exoplayer.h.b.a;
        int size = this.f7560n.size() - 1;
        boolean z9 = (d2 != 0 && z6 && a(size)) ? false : true;
        if (this.f7555h.f()) {
            if (z9) {
                if (z6) {
                    com.anythink.basead.exoplayer.k.a.b(d(size) == cVar2);
                    if (this.f7560n.isEmpty()) {
                        this.f7567u = this.f7568v;
                    }
                }
                z3 = true;
                this.f7556j.a(cVar2.f7526b, cVar2.f7527c, this.f7549a, cVar2.f7528d, cVar2.f7529e, cVar2.f7530f, cVar2.f7531g, cVar2.f7532h, j6, j9, d2, iOException, z3);
                if (z3) {
                    return 0;
                }
                this.i.a(this);
                return 2;
            }
            Log.w(f7548d, "Ignoring attempt to cancel non-cancelable load.");
        }
        z3 = false;
        this.f7556j.a(cVar2.f7526b, cVar2.f7527c, this.f7549a, cVar2.f7528d, cVar2.f7529e, cVar2.f7530f, cVar2.f7531g, cVar2.f7532h, j6, j9, d2, iOException, z3);
        if (z3) {
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
        int size;
        int c9;
        if (this.f7558l.a() || a() || (size = this.f7560n.size()) <= (c9 = this.f7555h.c())) {
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
        long j9 = j().f7532h;
        com.anythink.basead.exoplayer.h.b.a d2 = d(c9);
        if (this.f7560n.isEmpty()) {
            this.f7567u = this.f7568v;
        }
        this.f7551c = false;
        this.f7556j.a(this.f7549a, d2.f7531g, j9);
    }

    @Override // com.anythink.basead.exoplayer.j.t.d
    public final void g() {
        this.f7562p.a();
        for (x xVar : this.f7563q) {
            xVar.a();
        }
    }

    private void b(long j6) {
        com.anythink.basead.exoplayer.h.b.a aVar;
        boolean z3;
        this.f7568v = j6;
        this.f7562p.i();
        if (a()) {
            z3 = false;
        } else {
            for (int i = 0; i < this.f7560n.size(); i++) {
                aVar = this.f7560n.get(i);
                long j9 = aVar.f7531g;
                if (j9 == j6 && aVar.f7520a == com.anythink.basead.exoplayer.b.f6382b) {
                    break;
                } else {
                    if (j9 > j6) {
                        break;
                    }
                }
            }
            aVar = null;
            if (aVar != null) {
                z3 = this.f7562p.b(aVar.a(0));
                this.f7550b = Long.MIN_VALUE;
            } else {
                z3 = this.f7562p.a(j6, (j6 > e() ? 1 : (j6 == e() ? 0 : -1)) < 0) != -1;
                this.f7550b = this.f7568v;
            }
        }
        if (z3) {
            for (x xVar : this.f7563q) {
                xVar.i();
                xVar.a(j6, false);
            }
            return;
        }
        this.f7567u = j6;
        this.f7551c = false;
        this.f7560n.clear();
        if (this.f7558l.a()) {
            this.f7558l.b();
            return;
        }
        this.f7562p.a();
        for (x xVar2 : this.f7563q) {
            xVar2.a();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.y
    public final void c() {
        this.f7558l.c();
        this.f7558l.a();
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long d() {
        if (this.f7551c) {
            return Long.MIN_VALUE;
        }
        if (a()) {
            return this.f7567u;
        }
        long j6 = this.f7568v;
        com.anythink.basead.exoplayer.h.b.a j9 = j();
        if (!j9.f()) {
            if (this.f7560n.size() > 1) {
                j9 = this.f7560n.get(r2.size() - 2);
            } else {
                j9 = null;
            }
        }
        if (j9 != null) {
            j6 = Math.max(j6, j9.f7532h);
        }
        return Math.max(j6, this.f7562p.g());
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long e() {
        if (a()) {
            return this.f7567u;
        }
        if (this.f7551c) {
            return Long.MIN_VALUE;
        }
        return j().f7532h;
    }

    public final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final f<T> f7569a;

        /* renamed from: c, reason: collision with root package name */
        private final x f7571c;

        /* renamed from: d, reason: collision with root package name */
        private final int f7572d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f7573e;

        public a(f<T> fVar, x xVar, int i) {
            this.f7569a = fVar;
            this.f7571c = xVar;
            this.f7572d = i;
        }

        private void d() {
            if (this.f7573e) {
                return;
            }
            f.this.f7556j.a(f.this.f7552e[this.f7572d], f.this.f7553f[this.f7572d], 0, (Object) null, f.this.f7568v);
            this.f7573e = true;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(long j6) {
            int a9;
            if (!f.this.f7551c || j6 <= this.f7571c.g()) {
                a9 = this.f7571c.a(j6, true);
                if (a9 == -1) {
                    a9 = 0;
                }
            } else {
                a9 = this.f7571c.k();
            }
            if (a9 > 0) {
                d();
            }
            return a9;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final boolean b() {
            f fVar = f.this;
            if (fVar.f7551c) {
                return true;
            }
            return !fVar.a() && this.f7571c.c();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final void c() {
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z3) {
            if (f.this.a()) {
                return -3;
            }
            x xVar = this.f7571c;
            f fVar = f.this;
            int a9 = xVar.a(nVar, eVar, z3, fVar.f7551c, fVar.f7550b);
            if (a9 == -4) {
                d();
            }
            return a9;
        }

        private void a() {
            com.anythink.basead.exoplayer.k.a.b(f.this.f7554g[this.f7572d]);
            f.this.f7554g[this.f7572d] = false;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        if (this.f7551c || this.f7558l.a()) {
            return false;
        }
        boolean a9 = a();
        if (!a9) {
            j();
        }
        e eVar = this.f7559m;
        boolean z3 = eVar.f7547b;
        c cVar = eVar.f7546a;
        eVar.f7546a = null;
        eVar.f7547b = false;
        if (z3) {
            this.f7567u = com.anythink.basead.exoplayer.b.f6382b;
            this.f7551c = true;
            return true;
        }
        if (cVar == null) {
            return false;
        }
        if (cVar instanceof com.anythink.basead.exoplayer.h.b.a) {
            com.anythink.basead.exoplayer.h.b.a aVar = (com.anythink.basead.exoplayer.h.b.a) cVar;
            if (a9) {
                long j9 = aVar.f7531g;
                long j10 = this.f7567u;
                if (j9 == j10) {
                    j10 = Long.MIN_VALUE;
                }
                this.f7550b = j10;
                this.f7567u = com.anythink.basead.exoplayer.b.f6382b;
            }
            aVar.a(this.f7564r);
            this.f7560n.add(aVar);
        }
        this.f7556j.a(cVar.f7526b, cVar.f7527c, this.f7549a, cVar.f7528d, cVar.f7529e, cVar.f7530f, cVar.f7531g, cVar.f7532h, this.f7558l.a(cVar, this, this.f7557k));
        return true;
    }

    private com.anythink.basead.exoplayer.h.b.a d(int i) {
        com.anythink.basead.exoplayer.h.b.a aVar = this.f7560n.get(i);
        ArrayList<com.anythink.basead.exoplayer.h.b.a> arrayList = this.f7560n;
        af.a((List) arrayList, i, arrayList.size());
        int i6 = 0;
        this.f7562p.a(aVar.a(0));
        while (true) {
            x[] xVarArr = this.f7563q;
            if (i6 >= xVarArr.length) {
                return aVar;
            }
            x xVar = xVarArr[i6];
            i6++;
            xVar.a(aVar.a(i6));
        }
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(c cVar, long j6, long j9) {
        c cVar2 = cVar;
        this.f7556j.a(cVar2.f7526b, cVar2.f7527c, this.f7549a, cVar2.f7528d, cVar2.f7529e, cVar2.f7530f, cVar2.f7531g, cVar2.f7532h, j6, j9, cVar2.d());
        this.i.a(this);
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(c cVar, long j6, long j9, boolean z3) {
        c cVar2 = cVar;
        this.f7556j.b(cVar2.f7526b, cVar2.f7527c, this.f7549a, cVar2.f7528d, cVar2.f7529e, cVar2.f7530f, cVar2.f7531g, cVar2.f7532h, j6, j9, cVar2.d());
        if (z3) {
            return;
        }
        this.f7562p.a();
        for (x xVar : this.f7563q) {
            xVar.a();
        }
        this.i.a(this);
    }

    private void c(int i) {
        com.anythink.basead.exoplayer.h.b.a aVar = this.f7560n.get(i);
        m mVar = aVar.f7528d;
        if (!mVar.equals(this.f7565s)) {
            this.f7556j.a(this.f7549a, mVar, aVar.f7529e, aVar.f7530f, aVar.f7531g);
        }
        this.f7565s = mVar;
    }

    @Override // com.anythink.basead.exoplayer.h.y
    public final boolean b() {
        if (this.f7551c) {
            return true;
        }
        return !a() && this.f7562p.c();
    }

    private void a(long j6, boolean z3) {
        int d2 = this.f7562p.d();
        this.f7562p.a(j6, z3, true);
        int d9 = this.f7562p.d();
        if (d9 > d2) {
            long h9 = this.f7562p.h();
            int i = 0;
            while (true) {
                x[] xVarArr = this.f7563q;
                if (i >= xVarArr.length) {
                    break;
                }
                xVarArr[i].a(h9, z3, this.f7554g[i]);
                i++;
            }
            int b9 = b(d9, 0);
            if (b9 > 0) {
                af.a((List) this.f7560n, 0, b9);
            }
        }
    }

    private void b(int i) {
        int b9 = b(i, 0);
        if (b9 > 0) {
            af.a((List) this.f7560n, 0, b9);
        }
    }

    private int b(int i, int i6) {
        do {
            i6++;
            if (i6 >= this.f7560n.size()) {
                return this.f7560n.size() - 1;
            }
        } while (this.f7560n.get(i6).a(0) <= i);
        return i6 - 1;
    }

    private f<T>.a a(long j6, int i) {
        for (int i6 = 0; i6 < this.f7563q.length; i6++) {
            if (this.f7552e[i6] == i) {
                com.anythink.basead.exoplayer.k.a.b(!this.f7554g[i6]);
                this.f7554g[i6] = true;
                this.f7563q[i6].i();
                this.f7563q[i6].a(j6, true);
                return new a(this, this.f7563q[i6], i6);
            }
        }
        throw new IllegalStateException();
    }

    private void a(b<T> bVar) {
        this.f7566t = bVar;
        this.f7562p.j();
        for (x xVar : this.f7563q) {
            xVar.j();
        }
        this.f7558l.a(this);
    }

    @Override // com.anythink.basead.exoplayer.h.y
    public final int a(n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z3) {
        if (a()) {
            return -3;
        }
        int a9 = this.f7562p.a(nVar, eVar, z3, this.f7551c, this.f7550b);
        if (a9 == -4) {
            a(this.f7562p.e(), 1);
        }
        return a9;
    }

    @Override // com.anythink.basead.exoplayer.h.y
    public final int a(long j6) {
        int i = 0;
        if (a()) {
            return 0;
        }
        if (this.f7551c && j6 > this.f7562p.g()) {
            i = this.f7562p.k();
        } else {
            int a9 = this.f7562p.a(j6, true);
            if (a9 != -1) {
                i = a9;
            }
        }
        if (i > 0) {
            a(this.f7562p.e(), i);
        }
        return i;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(c cVar, long j6, long j9) {
        this.f7556j.a(cVar.f7526b, cVar.f7527c, this.f7549a, cVar.f7528d, cVar.f7529e, cVar.f7530f, cVar.f7531g, cVar.f7532h, j6, j9, cVar.d());
        this.i.a(this);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(c cVar, long j6, long j9, boolean z3) {
        this.f7556j.b(cVar.f7526b, cVar.f7527c, this.f7549a, cVar.f7528d, cVar.f7529e, cVar.f7530f, cVar.f7531g, cVar.f7532h, j6, j9, cVar.d());
        if (z3) {
            return;
        }
        this.f7562p.a();
        for (x xVar : this.f7563q) {
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
        boolean z3;
        long d2 = cVar.d();
        boolean z6 = cVar instanceof com.anythink.basead.exoplayer.h.b.a;
        int size = this.f7560n.size() - 1;
        boolean z9 = (d2 != 0 && z6 && a(size)) ? false : true;
        if (this.f7555h.f()) {
            if (!z9) {
                Log.w(f7548d, "Ignoring attempt to cancel non-cancelable load.");
            } else {
                if (z6) {
                    com.anythink.basead.exoplayer.k.a.b(d(size) == cVar);
                    if (this.f7560n.isEmpty()) {
                        this.f7567u = this.f7568v;
                    }
                }
                z3 = true;
                this.f7556j.a(cVar.f7526b, cVar.f7527c, this.f7549a, cVar.f7528d, cVar.f7529e, cVar.f7530f, cVar.f7531g, cVar.f7532h, j6, j9, d2, iOException, z3);
                if (z3) {
                    return 0;
                }
                this.i.a(this);
                return 2;
            }
        }
        z3 = false;
        this.f7556j.a(cVar.f7526b, cVar.f7527c, this.f7549a, cVar.f7528d, cVar.f7529e, cVar.f7530f, cVar.f7531g, cVar.f7532h, j6, j9, d2, iOException, z3);
        if (z3) {
        }
    }

    private static boolean a(c cVar) {
        return cVar instanceof com.anythink.basead.exoplayer.h.b.a;
    }

    private boolean a(int i) {
        int e9;
        com.anythink.basead.exoplayer.h.b.a aVar = this.f7560n.get(i);
        if (this.f7562p.e() > aVar.a(0)) {
            return true;
        }
        int i6 = 0;
        do {
            x[] xVarArr = this.f7563q;
            if (i6 >= xVarArr.length) {
                return false;
            }
            e9 = xVarArr[i6].e();
            i6++;
        } while (e9 <= aVar.a(i6));
        return true;
    }

    public final boolean a() {
        return this.f7567u != com.anythink.basead.exoplayer.b.f6382b;
    }

    private void a(int i, int i6) {
        int b9 = b(i - i6, 0);
        int b10 = i6 == 1 ? b9 : b(i - 1, b9);
        while (b9 <= b10) {
            c(b9);
            b9++;
        }
    }
}
