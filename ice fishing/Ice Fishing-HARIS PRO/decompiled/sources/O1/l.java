package O1;

import L1.A;
import L1.C0003d;
import L1.C0016q;
import L1.K;
import L1.T;
import Q1.u;
import java.util.Arrays;
import u.AbstractC0357e;

/* loaded from: classes.dex */
public class l extends P1.a implements e, f {

    /* renamed from: d, reason: collision with root package name */
    public final int f861d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f862f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f863g;

    /* renamed from: h, reason: collision with root package name */
    public long f864h;
    public long i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f865k;

    public l(int i, int i2, int i3) {
        this.f861d = i;
        this.e = i2;
        this.f862f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x007a, B:20:0x0082, B:28:0x0095, B:31:0x009c, B:32:0x00a2, B:34:0x00a3, B:40:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [P1.a] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [O1.l] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [O1.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [P1.c] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [O1.n] */
    /* JADX WARN: Type inference failed for: r9v8, types: [O1.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b1 -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(l lVar, f fVar, x1.c cVar) {
        k kVar;
        w1.a aVar;
        int i;
        ?? r5;
        f fVar2;
        K k2;
        K k3;
        f fVar3;
        Object q2;
        n nVar;
        try {
            try {
                if (cVar instanceof k) {
                    kVar = (k) cVar;
                    int i2 = kVar.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        kVar.j = i2 - Integer.MIN_VALUE;
                        Object obj = kVar.f860h;
                        aVar = w1.a.f4662a;
                        i = kVar.j;
                        if (i != 0) {
                            h0.f.D(obj);
                            fVar2 = fVar;
                            fVar = (n) lVar.b();
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    k3 = kVar.f859g;
                                    n nVar2 = kVar.f858f;
                                    fVar3 = kVar.e;
                                    l lVar2 = kVar.f857d;
                                    h0.f.D(obj);
                                    r5 = lVar2;
                                    fVar = nVar2;
                                    do {
                                        q2 = r5.q(fVar);
                                        if (q2 == m.f866a) {
                                        }
                                    } while (r5.f(fVar, kVar) != aVar);
                                    return;
                                }
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                k3 = kVar.f859g;
                                n nVar3 = kVar.f858f;
                                fVar3 = kVar.e;
                                l lVar3 = kVar.f857d;
                                h0.f.D(obj);
                                l lVar4 = lVar3;
                                n nVar4 = nVar3;
                                fVar2 = fVar3;
                                k2 = k3;
                                lVar = lVar4;
                                nVar = nVar4;
                                r5 = lVar;
                                k3 = k2;
                                fVar3 = fVar2;
                                fVar = nVar;
                                do {
                                    q2 = r5.q(fVar);
                                    if (q2 == m.f866a) {
                                        if (k3 != null && !k3.a()) {
                                            throw ((T) k3).n();
                                        }
                                        kVar.f857d = r5;
                                        kVar.e = fVar3;
                                        kVar.f858f = fVar;
                                        kVar.f859g = k3;
                                        kVar.j = 3;
                                        lVar4 = r5;
                                        nVar4 = fVar;
                                        if (fVar3.a(q2, kVar) == aVar) {
                                            return;
                                        }
                                        fVar2 = fVar3;
                                        k2 = k3;
                                        lVar = lVar4;
                                        nVar = nVar4;
                                        r5 = lVar;
                                        k3 = k2;
                                        fVar3 = fVar2;
                                        fVar = nVar;
                                        q2 = r5.q(fVar);
                                        if (q2 == m.f866a) {
                                            kVar.f857d = r5;
                                            kVar.e = fVar3;
                                            kVar.f858f = fVar;
                                            kVar.f859g = k3;
                                            kVar.j = 2;
                                        }
                                    }
                                } while (r5.f(fVar, kVar) != aVar);
                                return;
                            }
                            fVar = kVar.f858f;
                            f fVar4 = kVar.e;
                            l lVar5 = kVar.f857d;
                            try {
                                h0.f.D(obj);
                                fVar2 = fVar4;
                                lVar = lVar5;
                                fVar = fVar;
                            } catch (Throwable th) {
                                th = th;
                                r5 = lVar5;
                                r5.e(fVar);
                                throw th;
                            }
                        }
                        v1.i iVar = kVar.f4760b;
                        D1.i.b(iVar);
                        k2 = (K) iVar.e(C0016q.f576b);
                        nVar = fVar;
                        r5 = lVar;
                        k3 = k2;
                        fVar3 = fVar2;
                        fVar = nVar;
                        do {
                            q2 = r5.q(fVar);
                            if (q2 == m.f866a) {
                            }
                        } while (r5.f(fVar, kVar) != aVar);
                        return;
                    }
                }
                v1.i iVar2 = kVar.f4760b;
                D1.i.b(iVar2);
                k2 = (K) iVar2.e(C0016q.f576b);
                nVar = fVar;
                r5 = lVar;
                k3 = k2;
                fVar3 = fVar2;
                fVar = nVar;
                do {
                    q2 = r5.q(fVar);
                    if (q2 == m.f866a) {
                    }
                } while (r5.f(fVar, kVar) != aVar);
                return;
            } catch (Throwable th2) {
                r5 = lVar;
                th = th2;
                r5.e(fVar);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        kVar = new k(lVar, cVar);
        Object obj2 = kVar.f860h;
        aVar = w1.a.f4662a;
        i = kVar.j;
    }

    @Override // O1.f
    public final Object a(Object obj, v1.d dVar) {
        v1.d[] dVarArr;
        j jVar;
        if (n(obj)) {
            return t1.i.f4388c;
        }
        C0003d c0003d = new C0003d(h0.f.p(dVar), 1);
        c0003d.r();
        v1.d[] dVarArr2 = P1.b.f914a;
        synchronized (this) {
            try {
                if (o(obj)) {
                    c0003d.b(t1.i.f4388c);
                    dVarArr = k(dVarArr2);
                    jVar = null;
                } else {
                    j jVar2 = new j(this, this.j + this.f865k + l(), obj, c0003d);
                    j(jVar2);
                    this.f865k++;
                    if (this.e == 0) {
                        dVarArr2 = k(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    jVar = jVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar != null) {
            c0003d.t(new A(jVar));
        }
        for (v1.d dVar2 : dVarArr) {
            if (dVar2 != null) {
                dVar2.b(t1.i.f4388c);
            }
        }
        Object q2 = c0003d.q();
        w1.a aVar = w1.a.f4662a;
        if (q2 != aVar) {
            q2 = t1.i.f4388c;
        }
        return q2 == aVar ? q2 : t1.i.f4388c;
    }

    @Override // P1.a
    public final P1.c c() {
        n nVar = new n();
        nVar.f869a = -1L;
        return nVar;
    }

    @Override // P1.a
    public final P1.c[] d() {
        return new n[2];
    }

    public final Object f(n nVar, k kVar) {
        C0003d c0003d = new C0003d(h0.f.p(kVar), 1);
        c0003d.r();
        synchronized (this) {
            if (p(nVar) < 0) {
                nVar.f870b = c0003d;
            } else {
                c0003d.b(t1.i.f4388c);
            }
        }
        Object q2 = c0003d.q();
        return q2 == w1.a.f4662a ? q2 : t1.i.f4388c;
    }

    public final void g() {
        if (this.e != 0 || this.f865k > 1) {
            Object[] objArr = this.f863g;
            D1.i.b(objArr);
            while (this.f865k > 0) {
                long l2 = l();
                int i = this.j;
                int i2 = this.f865k;
                if (objArr[((int) ((l2 + (i + i2)) - 1)) & (objArr.length - 1)] != m.f866a) {
                    return;
                }
                this.f865k = i2 - 1;
                m.a(objArr, l() + this.j + this.f865k, null);
            }
        }
    }

    public final void i() {
        P1.c[] cVarArr;
        Object[] objArr = this.f863g;
        D1.i.b(objArr);
        m.a(objArr, l(), null);
        this.j--;
        long l2 = l() + 1;
        if (this.f864h < l2) {
            this.f864h = l2;
        }
        if (this.i < l2) {
            if (this.f912b != 0 && (cVarArr = this.f911a) != null) {
                for (P1.c cVar : cVarArr) {
                    if (cVar != null) {
                        n nVar = (n) cVar;
                        long j = nVar.f869a;
                        if (j >= 0 && j < l2) {
                            nVar.f869a = l2;
                        }
                    }
                }
            }
            this.i = l2;
        }
    }

    public final void j(Object obj) {
        int i = this.j + this.f865k;
        Object[] objArr = this.f863g;
        if (objArr == null) {
            objArr = m(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = m(objArr, i, objArr.length * 2);
        }
        m.a(objArr, l() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final v1.d[] k(v1.d[] dVarArr) {
        P1.c[] cVarArr;
        n nVar;
        C0003d c0003d;
        int length = dVarArr.length;
        if (this.f912b != 0 && (cVarArr = this.f911a) != null) {
            int length2 = cVarArr.length;
            int i = 0;
            dVarArr = dVarArr;
            while (i < length2) {
                P1.c cVar = cVarArr[i];
                if (cVar != null && (c0003d = (nVar = (n) cVar).f870b) != null && p(nVar) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        D1.i.d(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = c0003d;
                    nVar.f870b = null;
                    length++;
                }
                i++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long l() {
        return Math.min(this.i, this.f864h);
    }

    public final Object[] m(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.f863g = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long l2 = l();
        for (int i3 = 0; i3 < i; i3++) {
            long j = i3 + l2;
            m.a(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean n(Object obj) {
        int i;
        boolean z2;
        v1.d[] dVarArr = P1.b.f914a;
        synchronized (this) {
            if (o(obj)) {
                dVarArr = k(dVarArr);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        for (v1.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.b(t1.i.f4388c);
            }
        }
        return z2;
    }

    public final boolean o(Object obj) {
        int i = this.f912b;
        int i2 = this.f861d;
        if (i == 0) {
            if (i2 != 0) {
                j(obj);
                int i3 = this.j + 1;
                this.j = i3;
                if (i3 > i2) {
                    i();
                }
                this.i = l() + this.j;
            }
            return true;
        }
        int i4 = this.j;
        int i5 = this.e;
        if (i4 >= i5 && this.i <= this.f864h) {
            int a2 = AbstractC0357e.a(this.f862f);
            if (a2 == 0) {
                return false;
            }
            if (a2 == 2) {
                return true;
            }
        }
        j(obj);
        int i6 = this.j + 1;
        this.j = i6;
        if (i6 > i5) {
            i();
        }
        long l2 = l() + this.j;
        long j = this.f864h;
        if (((int) (l2 - j)) > i2) {
            r(j + 1, this.i, l() + this.j, l() + this.j + this.f865k);
        }
        return true;
    }

    public final long p(n nVar) {
        long j = nVar.f869a;
        if (j < l() + this.j) {
            return j;
        }
        if (this.e <= 0 && j <= l() && this.f865k != 0) {
            return j;
        }
        return -1L;
    }

    public final Object q(n nVar) {
        Object obj;
        v1.d[] dVarArr = P1.b.f914a;
        synchronized (this) {
            try {
                long p2 = p(nVar);
                if (p2 < 0) {
                    obj = m.f866a;
                } else {
                    long j = nVar.f869a;
                    Object[] objArr = this.f863g;
                    D1.i.b(objArr);
                    Object obj2 = objArr[((int) p2) & (objArr.length - 1)];
                    if (obj2 instanceof j) {
                        obj2 = ((j) obj2).f855c;
                    }
                    nVar.f869a = p2 + 1;
                    Object obj3 = obj2;
                    dVarArr = s(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (v1.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.b(t1.i.f4388c);
            }
        }
        return obj;
    }

    public final void r(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long l2 = l(); l2 < min; l2++) {
            Object[] objArr = this.f863g;
            D1.i.b(objArr);
            m.a(objArr, l2, null);
        }
        this.f864h = j;
        this.i = j2;
        this.j = (int) (j3 - min);
        this.f865k = (int) (j4 - j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v1.d[] s(long j) {
        long j2;
        long j3;
        v1.d[] dVarArr;
        long max;
        Object[] objArr;
        long j4;
        P1.c[] cVarArr;
        long j5 = this.i;
        v1.d[] dVarArr2 = P1.b.f914a;
        if (j > j5) {
            return dVarArr2;
        }
        long l2 = l();
        long j6 = this.j + l2;
        int i = this.e;
        if (i == 0 && this.f865k > 0) {
            j6++;
        }
        if (this.f912b != 0 && (cVarArr = this.f911a) != null) {
            for (P1.c cVar : cVarArr) {
                if (cVar != null) {
                    long j7 = ((n) cVar).f869a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.i) {
            return dVarArr2;
        }
        long l3 = l() + this.j;
        int min = this.f912b > 0 ? Math.min(this.f865k, i - ((int) (l3 - j6))) : this.f865k;
        long j8 = this.f865k + l3;
        u uVar = m.f866a;
        if (min > 0) {
            dVarArr2 = new v1.d[min];
            Object[] objArr2 = this.f863g;
            D1.i.b(objArr2);
            j2 = j6;
            long j9 = l3;
            long j10 = j9;
            int i2 = 0;
            while (j10 < j8) {
                j3 = j8;
                Object obj = objArr2[((int) j10) & (objArr2.length - 1)];
                if (obj != uVar) {
                    D1.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    j jVar = (j) obj;
                    int i3 = i2 + 1;
                    dVarArr2[i2] = jVar.f856d;
                    m.a(objArr2, j10, uVar);
                    m.a(objArr2, j9, jVar.f855c);
                    j4 = 1;
                    l3 = j9 + 1;
                    if (i3 < min) {
                        j9 = l3;
                        i2 = i3;
                    }
                } else {
                    j4 = 1;
                }
                j10 += j4;
                j8 = j3;
            }
            j3 = j8;
            dVarArr = dVarArr2;
            l3 = j9;
            int i4 = (int) (l3 - l2);
            long j11 = this.f912b != 0 ? l3 : j2;
            max = Math.max(this.f864h, l3 - Math.min(this.f861d, i4));
            if (i == 0 && max < j3) {
                objArr = this.f863g;
                D1.i.b(objArr);
                if (D1.i.a(objArr[((int) max) & (objArr.length - 1)], uVar)) {
                    l3++;
                    max++;
                }
            }
            r(max, j11, l3, j3);
            g();
            return dVarArr.length != 0 ? dVarArr : k(dVarArr);
        }
        j2 = j6;
        j3 = j8;
        dVarArr = dVarArr2;
        int i42 = (int) (l3 - l2);
        if (this.f912b != 0) {
        }
        max = Math.max(this.f864h, l3 - Math.min(this.f861d, i42));
        if (i == 0) {
            objArr = this.f863g;
            D1.i.b(objArr);
            if (D1.i.a(objArr[((int) max) & (objArr.length - 1)], uVar)) {
            }
        }
        r(max, j11, l3, j3);
        g();
        if (dVarArr.length != 0) {
        }
    }

    @Override // O1.e
    public final Object w(f fVar, v1.d dVar) {
        h(this, fVar, (x1.c) dVar);
        return w1.a.f4662a;
    }
}
