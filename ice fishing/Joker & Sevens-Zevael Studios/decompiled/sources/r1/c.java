package r1;

import java.util.List;
import s.a0;
import s.o0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final v1.p f5930a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5931b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5932c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5933d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5934e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f5935f = new a0();

    /* renamed from: g, reason: collision with root package name */
    public final f f5936g = new f();

    /* renamed from: h, reason: collision with root package name */
    public final s.x f5937h;

    public c(v1.p pVar) {
        this.f5930a = pVar;
        s.x xVar = new s.x();
        xVar.f6351a = o0.f6312a;
        xVar.f6352b = s.n.f6306a;
        xVar.f6353c = t.a.f6509c;
        xVar.c(o0.d(10));
        this.f5937h = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object[]] */
    public final void a(long j3, List list, boolean z10) {
        long j6;
        long j10;
        int i10;
        char c3;
        long j11;
        e eVar;
        e eVar2;
        s.x xVar = this.f5937h;
        xVar.f6355e = 0;
        long[] jArr = xVar.f6351a;
        char c7 = 7;
        if (jArr != o0.f6312a) {
            bc.l.W(jArr, -9187201950435737472L);
            long[] jArr2 = xVar.f6351a;
            int i11 = xVar.f6354d;
            int i12 = i11 >> 3;
            j6 = -9187201950435737472L;
            long j12 = 255 << ((i11 & 7) << 3);
            j10 = 255;
            jArr2[i12] = ((~j12) & jArr2[i12]) | j12;
        } else {
            j6 = -9187201950435737472L;
            j10 = 255;
        }
        bc.l.V(0, xVar.f6354d, null, xVar.f6353c);
        xVar.f6356f = o0.a(xVar.f6354d) - xVar.f6355e;
        int size = list.size();
        f fVar = this.f5936g;
        int i13 = 0;
        boolean z11 = true;
        f fVar2 = fVar;
        while (i13 < size) {
            y0.m mVar = (y0.m) list.get(i13);
            if (mVar.f8456t) {
                mVar.f8455s = new c1.b(5, this, mVar);
                if (z11) {
                    o0.e eVar3 = fVar2.f5952a;
                    ?? r72 = eVar3.f5134g;
                    int i14 = eVar3.f5136i;
                    c3 = c7;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i14) {
                            j11 = j6;
                            eVar2 = 0;
                            break;
                        }
                        eVar2 = r72[i15];
                        j11 = j6;
                        if (pc.j.a(((e) eVar2).f5944c, mVar)) {
                            break;
                        }
                        i15++;
                        j6 = j11;
                    }
                    eVar = eVar2;
                    if (eVar != null) {
                        eVar.f5950i = true;
                        eVar.f5945d.a(j3);
                        Object b2 = xVar.b(j3);
                        Object obj = b2;
                        if (b2 == null) {
                            a0 a0Var = new a0();
                            xVar.d(j3, a0Var);
                            obj = a0Var;
                        }
                        ((a0) obj).a(eVar);
                        fVar2 = eVar;
                    } else {
                        z11 = false;
                    }
                } else {
                    c3 = c7;
                    j11 = j6;
                }
                eVar = new e(mVar);
                eVar.f5945d.a(j3);
                Object b10 = xVar.b(j3);
                Object obj2 = b10;
                if (b10 == null) {
                    a0 a0Var2 = new a0();
                    xVar.d(j3, a0Var2);
                    obj2 = a0Var2;
                }
                ((a0) obj2).a(eVar);
                fVar2.f5952a.b(eVar);
                fVar2 = eVar;
            } else {
                c3 = c7;
                j11 = j6;
            }
            i13++;
            c7 = c3;
            j6 = j11;
        }
        char c10 = c7;
        long j13 = j6;
        if (!z10) {
            return;
        }
        long[] jArr3 = xVar.f6352b;
        Object[] objArr = xVar.f6353c;
        long[] jArr4 = xVar.f6351a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j14 = jArr4[i16];
            if ((((~j14) << c10) & j14 & j13) != j13) {
                int i17 = 8;
                int i18 = 8 - ((~(i16 - length)) >>> 31);
                int i19 = 0;
                while (i19 < i18) {
                    if ((j14 & j10) < 128) {
                        int i20 = (i16 << 3) + i19;
                        long j15 = jArr3[i20];
                        a0 a0Var3 = (a0) objArr[i20];
                        o0.e eVar4 = fVar.f5952a;
                        i10 = i17;
                        Object[] objArr2 = eVar4.f5134g;
                        int i21 = eVar4.f5136i;
                        for (int i22 = 0; i22 < i21; i22++) {
                            ((e) objArr2[i22]).f(j15, a0Var3);
                        }
                    } else {
                        i10 = i17;
                    }
                    j14 >>= i10;
                    i19++;
                    i17 = i10;
                }
                if (i18 != i17) {
                    return;
                }
            }
            if (i16 == length) {
                return;
            } else {
                i16++;
            }
        }
    }

    public final boolean b(x4.c cVar, boolean z10) {
        s.o oVar = (s.o) cVar.f8290g;
        v1.p pVar = this.f5930a;
        f fVar = this.f5936g;
        boolean a6 = fVar.a(oVar, pVar, cVar, z10);
        o0.e eVar = fVar.f5952a;
        if (!a6) {
            return false;
        }
        boolean z11 = true;
        this.f5931b = true;
        Object[] objArr = eVar.f5134g;
        int i10 = eVar.f5136i;
        boolean z12 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z12 = ((e) objArr[i11]).e(cVar, z10) || z12;
        }
        Object[] objArr2 = eVar.f5134g;
        int i12 = eVar.f5136i;
        boolean z13 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            z13 = ((e) objArr2[i13]).d(cVar) || z13;
        }
        fVar.b(cVar);
        if (!z13 && !z12) {
            z11 = false;
        }
        this.f5931b = false;
        if (this.f5934e) {
            this.f5934e = false;
            a0 a0Var = this.f5935f;
            int i14 = a0Var.f6220b;
            for (int i15 = 0; i15 < i14; i15++) {
                d((y0.m) a0Var.e(i15));
            }
            a0Var.c();
        }
        if (this.f5932c) {
            this.f5932c = false;
            c();
        }
        if (this.f5933d) {
            this.f5933d = false;
            fVar.f5952a.g();
        }
        return z11;
    }

    public final void c() {
        if (this.f5931b) {
            this.f5932c = true;
            return;
        }
        f fVar = this.f5936g;
        o0.e eVar = fVar.f5952a;
        Object[] objArr = eVar.f5134g;
        int i10 = eVar.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            ((e) objArr[i11]).c();
        }
        if (this.f5933d) {
            this.f5933d = true;
        } else {
            fVar.f5952a.g();
        }
    }

    public final void d(y0.m mVar) {
        if (this.f5931b) {
            this.f5934e = true;
            this.f5935f.a(mVar);
            return;
        }
        f fVar = this.f5936g;
        a0 a0Var = fVar.f5953b;
        a0Var.c();
        a0Var.a(fVar);
        while (a0Var.h()) {
            f fVar2 = (f) a0Var.j(a0Var.f6220b - 1);
            int i10 = 0;
            while (true) {
                o0.e eVar = fVar2.f5952a;
                if (i10 < eVar.f5136i) {
                    e eVar2 = (e) eVar.f5134g[i10];
                    if (pc.j.a(eVar2.f5944c, mVar)) {
                        fVar2.f5952a.j(eVar2);
                        eVar2.c();
                    } else {
                        a0Var.a(eVar2);
                        i10++;
                    }
                }
            }
        }
    }
}
