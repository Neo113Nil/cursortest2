package w0;

import java.util.ArrayList;
import java.util.HashMap;
import m0.s1;
import s.h0;
import s.p0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class c extends g {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f7543n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final oc.c f7544e;

    /* renamed from: f, reason: collision with root package name */
    public final oc.c f7545f;

    /* renamed from: g, reason: collision with root package name */
    public int f7546g;

    /* renamed from: h, reason: collision with root package name */
    public h0 f7547h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f7548i;

    /* renamed from: j, reason: collision with root package name */
    public k f7549j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f7550k;

    /* renamed from: l, reason: collision with root package name */
    public int f7551l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7552m;

    public c(long j3, k kVar, oc.c cVar, oc.c cVar2) {
        super(j3, kVar);
        this.f7544e = cVar;
        this.f7545f = cVar2;
        this.f7549j = k.f7570k;
        this.f7550k = f7543n;
        this.f7551l = 1;
    }

    public final void A(long j3) {
        synchronized (m.f7580c) {
            this.f7549j = this.f7549j.e(j3);
        }
    }

    public void B(h0 h0Var) {
        this.f7547h = h0Var;
    }

    public c C(oc.c cVar, oc.c cVar2) {
        if (this.f7561c) {
            s1.a("Cannot use a disposed snapshot");
        }
        if (this.f7552m && this.f7562d < 0) {
            s1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = m.f7580c;
        synchronized (obj) {
            try {
                long j3 = m.f7582e;
                long j6 = 1;
                m.f7582e = j3 + j6;
                m.f7581d = m.f7581d.e(j3);
                k d10 = d();
                r(d10.e(j3));
                try {
                    d dVar = new d(j3, m.e(d10, g() + j6, j3), m.l(cVar, e(), true), m.b(cVar2, i()), this);
                    if (this.f7552m || this.f7561c) {
                        return dVar;
                    }
                    long g8 = g();
                    synchronized (obj) {
                        long j10 = m.f7582e;
                        m.f7582e = j10 + j6;
                        s(j10);
                        m.f7581d = m.f7581d.e(g());
                    }
                    r(m.e(d(), g8 + j6, g()));
                    return dVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // w0.g
    public final void b() {
        m.f7581d = m.f7581d.b(g()).a(this.f7549j);
    }

    @Override // w0.g
    public void c() {
        if (this.f7561c) {
            return;
        }
        this.f7561c = true;
        synchronized (m.f7580c) {
            o();
        }
        l();
    }

    @Override // w0.g
    public boolean f() {
        return false;
    }

    @Override // w0.g
    public int h() {
        return this.f7546g;
    }

    @Override // w0.g
    public oc.c i() {
        return this.f7545f;
    }

    @Override // w0.g
    public void k() {
        this.f7551l++;
    }

    @Override // w0.g
    public void l() {
        if (this.f7551l <= 0) {
            s1.a("no pending nested snapshots");
        }
        int i10 = this.f7551l - 1;
        this.f7551l = i10;
        if (i10 != 0 || this.f7552m) {
            return;
        }
        h0 x10 = x();
        if (x10 != null) {
            if (this.f7552m) {
                s1.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long g8 = g();
            Object[] objArr = x10.f6275b;
            long[] jArr = x10.f6274a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j3 = jArr[i11];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j3) < 128) {
                                for (x a6 = ((v) objArr[(i11 << 3) + i13]).a(); a6 != null; a6 = a6.f7621b) {
                                    long j6 = a6.f7620a;
                                    if (j6 == g8 || bc.m.R(this.f7549j, Long.valueOf(j6))) {
                                        nd.d dVar = m.f7578a;
                                        a6.f7620a = 0L;
                                    }
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        a();
    }

    @Override // w0.g
    public void m() {
        if (this.f7552m || this.f7561c) {
            return;
        }
        v();
    }

    @Override // w0.g
    public void n(v vVar) {
        h0 x10 = x();
        if (x10 == null) {
            int i10 = p0.f6316a;
            x10 = new h0();
            B(x10);
        }
        x10.a(vVar);
    }

    @Override // w0.g
    public final void p() {
        int length = this.f7550k.length;
        for (int i10 = 0; i10 < length; i10++) {
            m.u(this.f7550k[i10]);
        }
        o();
    }

    @Override // w0.g
    public void t(int i10) {
        this.f7546g = i10;
    }

    @Override // w0.g
    public g u(oc.c cVar) {
        if (this.f7561c) {
            s1.a("Cannot use a disposed snapshot");
        }
        if (this.f7552m && this.f7562d < 0) {
            s1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g8 = g();
        A(g());
        Object obj = m.f7580c;
        synchronized (obj) {
            try {
                long j3 = m.f7582e;
                long j6 = 1;
                m.f7582e = j3 + j6;
                m.f7581d = m.f7581d.e(j3);
                try {
                    e eVar = new e(j3, m.e(d(), g8 + j6, j3), m.l(cVar, e(), true), this);
                    if (this.f7552m || this.f7561c) {
                        return eVar;
                    }
                    long g10 = g();
                    synchronized (obj) {
                        long j10 = m.f7582e;
                        m.f7582e = j10 + j6;
                        s(j10);
                        m.f7581d = m.f7581d.e(g());
                    }
                    r(m.e(d(), g10 + j6, g()));
                    return eVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j3;
        A(g());
        if (this.f7552m || this.f7561c) {
            return;
        }
        long g8 = g();
        synchronized (m.f7580c) {
            long j6 = m.f7582e;
            j3 = 1;
            m.f7582e = j6 + j3;
            s(j6);
            m.f7581d = m.f7581d.e(g());
        }
        r(m.e(d(), g8 + j3, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r w() {
        HashMap hashMap;
        bc.v vVar;
        h0 h0Var;
        long j3;
        long j6;
        ArrayList arrayList;
        int size;
        int i10;
        h0 x10 = x();
        if (x10 != null) {
            long j10 = m.f7587j.f7560b;
            hashMap = m.c(j10, this, m.f7581d.b(j10));
        } else {
            hashMap = null;
        }
        bc.v vVar2 = bc.v.f1067g;
        synchronized (m.f7580c) {
            try {
                m.d(this);
                if (x10 != null && x10.f6277d != 0) {
                    b bVar = m.f7587j;
                    r z10 = z(m.f7582e, x10, hashMap, m.f7581d.b(bVar.f7560b));
                    if (!z10.equals(i.f7563b)) {
                        return z10;
                    }
                    b();
                    h0Var = bVar.f7547h;
                    m.v(bVar, m.f7578a);
                    B(null);
                    bVar.f7547h = null;
                    vVar = m.f7585h;
                    this.f7552m = true;
                    if (h0Var != null) {
                        o0.h hVar = new o0.h(h0Var);
                        if (!h0Var.g()) {
                            int size2 = vVar.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                ((oc.e) vVar.get(i11)).invoke(hVar, this);
                            }
                        }
                    }
                    if (x10 != null && x10.h()) {
                        o0.h hVar2 = new o0.h(x10);
                        size = vVar.size();
                        for (i10 = 0; i10 < size; i10++) {
                            ((oc.e) vVar.get(i10)).invoke(hVar2, this);
                        }
                    }
                    synchronized (m.f7580c) {
                        try {
                            p();
                            m.g();
                            if (h0Var != null) {
                                Object[] objArr = h0Var.f6275b;
                                long[] jArr = h0Var.f6274a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    j3 = 128;
                                    while (true) {
                                        long j11 = jArr[i12];
                                        j6 = 255;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                                            for (int i14 = 0; i14 < i13; i14++) {
                                                if ((j11 & 255) < 128) {
                                                    m.q((v) objArr[(i12 << 3) + i14]);
                                                }
                                                j11 >>= 8;
                                            }
                                            if (i13 != 8) {
                                                break;
                                            }
                                        }
                                        if (i12 == length) {
                                            break;
                                        }
                                        i12++;
                                    }
                                    if (x10 != null) {
                                        Object[] objArr2 = x10.f6275b;
                                        long[] jArr2 = x10.f6274a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i15 = 0;
                                            while (true) {
                                                long j12 = jArr2[i15];
                                                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                    for (int i17 = 0; i17 < i16; i17++) {
                                                        if ((j12 & j6) < j3) {
                                                            m.q((v) objArr2[(i15 << 3) + i17]);
                                                        }
                                                        j12 >>= 8;
                                                    }
                                                    if (i16 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i15 == length2) {
                                                    break;
                                                }
                                                i15++;
                                            }
                                        }
                                    }
                                    arrayList = this.f7548i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i18 = 0; i18 < size3; i18++) {
                                            m.q((v) arrayList.get(i18));
                                        }
                                    }
                                    this.f7548i = null;
                                }
                            }
                            j3 = 128;
                            j6 = 255;
                            if (x10 != null) {
                            }
                            arrayList = this.f7548i;
                            if (arrayList != null) {
                            }
                            this.f7548i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return i.f7563b;
                }
                b();
                b bVar2 = m.f7587j;
                h0 h0Var2 = bVar2.f7547h;
                m.v(bVar2, m.f7578a);
                if (h0Var2 == null || !h0Var2.h()) {
                    vVar = vVar2;
                    h0Var = null;
                } else {
                    vVar = m.f7585h;
                    h0Var = h0Var2;
                }
                this.f7552m = true;
                if (h0Var != null) {
                }
                if (x10 != null) {
                    o0.h hVar22 = new o0.h(x10);
                    size = vVar.size();
                    while (i10 < size) {
                    }
                }
                synchronized (m.f7580c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public h0 x() {
        return this.f7547h;
    }

    @Override // w0.g
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public oc.c e() {
        return this.f7544e;
    }

    public final r z(long j3, h0 h0Var, HashMap hashMap, k kVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        k kVar2;
        Object[] objArr;
        long[] jArr;
        k kVar3;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        long j6;
        ArrayList arrayList4;
        x b2;
        k d10 = d().e(g()).d(this.f7549j);
        Object[] objArr3 = h0Var.f6275b;
        long[] jArr3 = h0Var.f6274a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j10 & 255) < 128) {
                            objArr2 = objArr3;
                            v vVar = (v) objArr3[(i11 << 3) + i13];
                            jArr2 = jArr3;
                            x a6 = vVar.a();
                            i10 = i13;
                            ArrayList arrayList5 = arrayList3;
                            x s10 = m.s(a6, j3, kVar);
                            if (s10 == null) {
                                kVar3 = d10;
                                arrayList4 = arrayList2;
                                j6 = j10;
                            } else {
                                arrayList4 = arrayList2;
                                j6 = j10;
                                x s11 = m.s(a6, g(), d10);
                                if (s11 == null) {
                                    kVar3 = d10;
                                } else {
                                    kVar3 = d10;
                                    if (s11.f7620a != 1 && !s10.equals(s11)) {
                                        x s12 = m.s(a6, g(), d());
                                        if (s12 == null) {
                                            m.r();
                                            throw null;
                                        }
                                        if (hashMap == null || (b2 = (x) hashMap.get(s10)) == null) {
                                            b2 = vVar.b(s11, s10, s12);
                                        }
                                        if (b2 == null) {
                                            return new h();
                                        }
                                        if (!b2.equals(s12)) {
                                            if (b2.equals(s10)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new ac.i(vVar, s10.b(g())));
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(vVar);
                                                arrayList3 = arrayList6;
                                            } else {
                                                arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList3.add(!b2.equals(s11) ? new ac.i(vVar, b2) : new ac.i(vVar, s11.b(g())));
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            kVar3 = d10;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i13;
                            j6 = j10;
                        }
                        j10 = j6 >> 8;
                        i13 = i10 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        d10 = kVar3;
                    }
                    kVar2 = d10;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    kVar2 = d10;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i11 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i11++;
                jArr3 = jArr;
                objArr3 = objArr;
                d10 = kVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i14 = 0; i14 < size; i14++) {
                ac.i iVar = (ac.i) arrayList3.get(i14);
                v vVar2 = (v) iVar.f270g;
                x xVar = (x) iVar.f271h;
                xVar.f7620a = j3;
                synchronized (m.f7580c) {
                    xVar.f7621b = vVar2.a();
                    vVar2.c(xVar);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                h0Var.k((v) arrayList2.get(i15));
            }
            ArrayList arrayList7 = this.f7548i;
            if (arrayList7 != null) {
                arrayList2 = bc.m.a0(arrayList7, arrayList2);
            }
            this.f7548i = arrayList2;
        }
        return i.f7563b;
    }
}
