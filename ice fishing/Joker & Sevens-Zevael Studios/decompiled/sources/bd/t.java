package bd;

import java.util.Arrays;
import yc.b1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class t extends cd.b implements e, f, cd.s {

    /* renamed from: k, reason: collision with root package name */
    public final int f1146k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1147l;

    /* renamed from: m, reason: collision with root package name */
    public final ad.a f1148m;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f1149n;

    /* renamed from: o, reason: collision with root package name */
    public long f1150o;

    /* renamed from: p, reason: collision with root package name */
    public long f1151p;

    /* renamed from: q, reason: collision with root package name */
    public int f1152q;

    /* renamed from: r, reason: collision with root package name */
    public int f1153r;

    public t(int i10, int i11, ad.a aVar) {
        this.f1146k = i10;
        this.f1147l = i11;
        this.f1148m = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0077, B:21:0x0081, B:30:0x0094, B:33:0x009b, B:34:0x009f, B:36:0x00a0, B:42:0x0049), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [cd.b] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [bd.t] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [bd.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [cd.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [bd.v] */
    /* JADX WARN: Type inference failed for: r9v8, types: [bd.v] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ae -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(t tVar, f fVar, fc.d dVar) {
        s sVar;
        int i10;
        ?? r42;
        f fVar2;
        b1 b1Var;
        b1 b1Var2;
        f fVar3;
        Object t3;
        dd.w wVar;
        gc.a aVar;
        v vVar;
        try {
            try {
                if (dVar instanceof s) {
                    sVar = (s) dVar;
                    int i11 = sVar.f1145m;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        sVar.f1145m = i11 - Integer.MIN_VALUE;
                        Object obj = sVar.f1143k;
                        i10 = sVar.f1145m;
                        if (i10 != 0) {
                            v6.a.W(obj);
                            fVar2 = fVar;
                            fVar = (v) tVar.b();
                        } else {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    b1Var2 = sVar.f1142j;
                                    v vVar2 = sVar.f1141i;
                                    fVar3 = sVar.f1140h;
                                    t tVar2 = sVar.f1139g;
                                    v6.a.W(obj);
                                    r42 = tVar2;
                                    fVar = vVar2;
                                    do {
                                        t3 = r42.t(fVar);
                                        wVar = u.f1154a;
                                        aVar = gc.a.f2559g;
                                        if (t3 == wVar) {
                                        }
                                    } while (r42.h(fVar, sVar) != aVar);
                                    return;
                                }
                                if (i10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b1Var2 = sVar.f1142j;
                                v vVar3 = sVar.f1141i;
                                fVar3 = sVar.f1140h;
                                t tVar3 = sVar.f1139g;
                                v6.a.W(obj);
                                t tVar4 = tVar3;
                                v vVar4 = vVar3;
                                fVar2 = fVar3;
                                b1Var = b1Var2;
                                tVar = tVar4;
                                vVar = vVar4;
                                r42 = tVar;
                                b1Var2 = b1Var;
                                fVar3 = fVar2;
                                fVar = vVar;
                                do {
                                    t3 = r42.t(fVar);
                                    wVar = u.f1154a;
                                    aVar = gc.a.f2559g;
                                    if (t3 == wVar) {
                                        if (b1Var2 != null && !b1Var2.b()) {
                                            throw b1Var2.m();
                                        }
                                        sVar.f1139g = r42;
                                        sVar.f1140h = fVar3;
                                        sVar.f1141i = fVar;
                                        sVar.f1142j = b1Var2;
                                        sVar.f1145m = 3;
                                        tVar4 = r42;
                                        vVar4 = fVar;
                                        if (fVar3.a(t3, sVar) == aVar) {
                                            return;
                                        }
                                        fVar2 = fVar3;
                                        b1Var = b1Var2;
                                        tVar = tVar4;
                                        vVar = vVar4;
                                        r42 = tVar;
                                        b1Var2 = b1Var;
                                        fVar3 = fVar2;
                                        fVar = vVar;
                                        t3 = r42.t(fVar);
                                        wVar = u.f1154a;
                                        aVar = gc.a.f2559g;
                                        if (t3 == wVar) {
                                            sVar.f1139g = r42;
                                            sVar.f1140h = fVar3;
                                            sVar.f1141i = fVar;
                                            sVar.f1142j = b1Var2;
                                            sVar.f1145m = 2;
                                        }
                                    }
                                } while (r42.h(fVar, sVar) != aVar);
                                return;
                            }
                            fVar = sVar.f1141i;
                            f fVar4 = sVar.f1140h;
                            t tVar5 = sVar.f1139g;
                            try {
                                v6.a.W(obj);
                                fVar2 = fVar4;
                                tVar = tVar5;
                                fVar = fVar;
                            } catch (Throwable th) {
                                th = th;
                                r42 = tVar5;
                                r42.f(fVar);
                                throw th;
                            }
                        }
                        b1Var = (b1) sVar.getContext().v(yc.v.f8910h);
                        vVar = fVar;
                        r42 = tVar;
                        b1Var2 = b1Var;
                        fVar3 = fVar2;
                        fVar = vVar;
                        do {
                            t3 = r42.t(fVar);
                            wVar = u.f1154a;
                            aVar = gc.a.f2559g;
                            if (t3 == wVar) {
                            }
                        } while (r42.h(fVar, sVar) != aVar);
                        return;
                    }
                }
                b1Var = (b1) sVar.getContext().v(yc.v.f8910h);
                vVar = fVar;
                r42 = tVar;
                b1Var2 = b1Var;
                fVar3 = fVar2;
                fVar = vVar;
                do {
                    t3 = r42.t(fVar);
                    wVar = u.f1154a;
                    aVar = gc.a.f2559g;
                    if (t3 == wVar) {
                    }
                } while (r42.h(fVar, sVar) != aVar);
                return;
            } catch (Throwable th2) {
                r42 = tVar;
                th = th2;
                r42.f(fVar);
                throw th;
            }
            if (i10 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        sVar = new s(tVar, dVar);
        Object obj2 = sVar.f1143k;
        i10 = sVar.f1145m;
    }

    @Override // bd.f
    public final Object a(Object obj, fc.d dVar) {
        Throwable th;
        fc.d[] n7;
        r rVar;
        if (q(obj)) {
            return ac.o.f277a;
        }
        yc.g gVar = new yc.g(1, bc.a0.w(dVar));
        gVar.q();
        fc.d[] dVarArr = cd.c.f1341a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        gVar.resumeWith(ac.o.f277a);
                        n7 = n(dVarArr);
                        rVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        r rVar2 = new r(this, o() + this.f1152q + this.f1153r, obj, gVar);
                        m(rVar2);
                        this.f1153r++;
                        if (this.f1147l == 0) {
                            dVarArr = n(dVarArr);
                        }
                        n7 = dVarArr;
                        rVar = rVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (rVar != null) {
                    gVar.t(new yc.e(2, rVar));
                }
                for (fc.d dVar2 : n7) {
                    if (dVar2 != null) {
                        dVar2.resumeWith(ac.o.f277a);
                    }
                }
                Object p8 = gVar.p();
                gc.a aVar = gc.a.f2559g;
                if (p8 != aVar) {
                    p8 = ac.o.f277a;
                }
                return p8 == aVar ? p8 : ac.o.f277a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // bd.e
    public final Object c(f fVar, fc.d dVar) {
        j(this, fVar, dVar);
        return gc.a.f2559g;
    }

    @Override // cd.b
    public final cd.d d() {
        v vVar = new v();
        vVar.f1157a = -1L;
        return vVar;
    }

    @Override // cd.b
    public final cd.d[] e() {
        return new v[2];
    }

    public final Object h(v vVar, s sVar) {
        yc.g gVar = new yc.g(1, bc.a0.w(sVar));
        gVar.q();
        synchronized (this) {
            try {
                if (s(vVar) < 0) {
                    vVar.f1158b = gVar;
                } else {
                    gVar.resumeWith(ac.o.f277a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object p8 = gVar.p();
        return p8 == gc.a.f2559g ? p8 : ac.o.f277a;
    }

    public final void i() {
        if (this.f1147l != 0 || this.f1153r > 1) {
            Object[] objArr = this.f1149n;
            pc.j.b(objArr);
            while (this.f1153r > 0) {
                long o7 = o();
                int i10 = this.f1152q;
                int i11 = this.f1153r;
                if (objArr[((int) ((o7 + (i10 + i11)) - 1)) & (objArr.length - 1)] != u.f1154a) {
                    return;
                }
                this.f1153r = i11 - 1;
                u.b(objArr, o() + this.f1152q + this.f1153r, null);
            }
        }
    }

    public final void k() {
        cd.d[] dVarArr;
        Object[] objArr = this.f1149n;
        pc.j.b(objArr);
        u.b(objArr, o(), null);
        this.f1152q--;
        long o7 = o() + 1;
        if (this.f1150o < o7) {
            this.f1150o = o7;
        }
        if (this.f1151p < o7) {
            if (this.f1338h != 0 && (dVarArr = this.f1337g) != null) {
                for (cd.d dVar : dVarArr) {
                    if (dVar != null) {
                        v vVar = (v) dVar;
                        long j3 = vVar.f1157a;
                        if (j3 >= 0 && j3 < o7) {
                            vVar.f1157a = o7;
                        }
                    }
                }
            }
            this.f1151p = o7;
        }
    }

    @Override // cd.s
    public final e l(fc.i iVar, int i10, ad.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == ad.a.f280g) ? this : new cd.g(this, iVar, i10, aVar);
    }

    public final void m(Object obj) {
        int i10 = this.f1152q + this.f1153r;
        Object[] objArr = this.f1149n;
        if (objArr == null) {
            objArr = p(null, 0, 2);
        } else if (i10 >= objArr.length) {
            objArr = p(objArr, i10, objArr.length * 2);
        }
        u.b(objArr, o() + i10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final fc.d[] n(fc.d[] dVarArr) {
        cd.d[] dVarArr2;
        v vVar;
        yc.g gVar;
        int length = dVarArr.length;
        if (this.f1338h != 0 && (dVarArr2 = this.f1337g) != null) {
            int length2 = dVarArr2.length;
            int i10 = 0;
            dVarArr = dVarArr;
            while (i10 < length2) {
                cd.d dVar = dVarArr2[i10];
                if (dVar != null && (gVar = (vVar = (v) dVar).f1158b) != null && s(vVar) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        pc.j.d(copyOf, "copyOf(...)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = gVar;
                    vVar.f1158b = null;
                    length++;
                }
                i10++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long o() {
        return Math.min(this.f1151p, this.f1150o);
    }

    public final Object[] p(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f1149n = objArr2;
        if (objArr != null) {
            long o7 = o();
            for (int i12 = 0; i12 < i10; i12++) {
                long j3 = i12 + o7;
                u.b(objArr2, j3, objArr[((int) j3) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i10;
        boolean z10;
        fc.d[] dVarArr = cd.c.f1341a;
        synchronized (this) {
            if (r(obj)) {
                dVarArr = n(dVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (fc.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(ac.o.f277a);
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r1 != 2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(Object obj) {
        int i10 = this.f1338h;
        int i11 = this.f1146k;
        if (i10 != 0) {
            int i12 = this.f1152q;
            int i13 = this.f1147l;
            if (i12 >= i13 && this.f1151p <= this.f1150o) {
                int ordinal = this.f1148m.ordinal();
                if (ordinal == 0) {
                    return false;
                }
            }
            m(obj);
            int i14 = this.f1152q + 1;
            this.f1152q = i14;
            if (i14 > i13) {
                k();
            }
            long o7 = o() + this.f1152q;
            long j3 = this.f1150o;
            if (((int) (o7 - j3)) > i11) {
                u(1 + j3, this.f1151p, o() + this.f1152q, o() + this.f1152q + this.f1153r);
            }
        } else if (i11 != 0) {
            m(obj);
            int i15 = this.f1152q + 1;
            this.f1152q = i15;
            if (i15 > i11) {
                k();
            }
            this.f1151p = o() + this.f1152q;
            return true;
        }
        return true;
    }

    public final long s(v vVar) {
        long j3 = vVar.f1157a;
        if (j3 < o() + this.f1152q) {
            return j3;
        }
        if (this.f1147l <= 0 && j3 <= o() && this.f1153r != 0) {
            return j3;
        }
        return -1L;
    }

    public final Object t(v vVar) {
        Object obj;
        fc.d[] dVarArr = cd.c.f1341a;
        synchronized (this) {
            try {
                long s10 = s(vVar);
                if (s10 < 0) {
                    obj = u.f1154a;
                } else {
                    long j3 = vVar.f1157a;
                    Object[] objArr = this.f1149n;
                    pc.j.b(objArr);
                    Object obj2 = objArr[((int) s10) & (objArr.length - 1)];
                    if (obj2 instanceof r) {
                        obj2 = ((r) obj2).f1137i;
                    }
                    vVar.f1157a = s10 + 1;
                    Object obj3 = obj2;
                    dVarArr = v(j3);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (fc.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(ac.o.f277a);
            }
        }
        return obj;
    }

    public final void u(long j3, long j6, long j10, long j11) {
        long min = Math.min(j6, j3);
        for (long o7 = o(); o7 < min; o7++) {
            Object[] objArr = this.f1149n;
            pc.j.b(objArr);
            u.b(objArr, o7, null);
        }
        this.f1150o = j3;
        this.f1151p = j6;
        this.f1152q = (int) (j10 - min);
        this.f1153r = (int) (j11 - j10);
    }

    public final fc.d[] v(long j3) {
        long j6;
        long j10;
        long j11;
        fc.d[] dVarArr;
        fc.d[] dVarArr2;
        cd.d[] dVarArr3;
        dd.w wVar = u.f1154a;
        fc.d[] dVarArr4 = cd.c.f1341a;
        if (j3 <= this.f1151p) {
            long o7 = o();
            long j12 = this.f1152q + o7;
            int i10 = this.f1147l;
            if (i10 == 0 && this.f1153r > 0) {
                j12++;
            }
            int i11 = 0;
            if (this.f1338h != 0 && (dVarArr3 = this.f1337g) != null) {
                for (cd.d dVar : dVarArr3) {
                    if (dVar != null) {
                        long j13 = ((v) dVar).f1157a;
                        if (j13 >= 0 && j13 < j12) {
                            j12 = j13;
                        }
                    }
                }
            }
            if (j12 > this.f1151p) {
                long o10 = o() + this.f1152q;
                int min = this.f1338h > 0 ? Math.min(this.f1153r, i10 - ((int) (o10 - j12))) : this.f1153r;
                long j14 = this.f1153r + o10;
                if (min > 0) {
                    j11 = 1;
                    Object[] objArr = this.f1149n;
                    pc.j.b(objArr);
                    j6 = o7;
                    fc.d[] dVarArr5 = new fc.d[min];
                    long j15 = o10;
                    while (true) {
                        if (o10 >= j14) {
                            dVarArr2 = dVarArr5;
                            j10 = j12;
                            break;
                        }
                        dVarArr2 = dVarArr5;
                        Object obj = objArr[(objArr.length - 1) & ((int) o10)];
                        if (obj != wVar) {
                            pc.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            r rVar = (r) obj;
                            int i12 = i11 + 1;
                            j10 = j12;
                            dVarArr2[i11] = rVar.f1138j;
                            u.b(objArr, o10, wVar);
                            u.b(objArr, j15, rVar.f1137i);
                            j15++;
                            if (i12 >= min) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            j10 = j12;
                        }
                        o10++;
                        dVarArr5 = dVarArr2;
                        j12 = j10;
                    }
                    o10 = j15;
                    dVarArr = dVarArr2;
                } else {
                    j6 = o7;
                    j10 = j12;
                    j11 = 1;
                    dVarArr = dVarArr4;
                }
                int i13 = (int) (o10 - j6);
                long j16 = this.f1338h == 0 ? o10 : j10;
                long max = Math.max(this.f1150o, o10 - Math.min(this.f1146k, i13));
                if (i10 == 0 && max < j14) {
                    Object[] objArr2 = this.f1149n;
                    pc.j.b(objArr2);
                    if (pc.j.a(objArr2[((int) max) & (objArr2.length - 1)], wVar)) {
                        o10 += j11;
                        max += j11;
                    }
                }
                u(max, j16, o10, j14);
                i();
                return dVarArr.length == 0 ? dVarArr : n(dVarArr);
            }
        }
        return dVarArr4;
    }
}
