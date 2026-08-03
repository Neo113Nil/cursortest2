package m0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r {
    public int A;
    public int B;
    public boolean C;
    public final q D;
    public final ArrayList E;
    public boolean F;
    public i2 G;
    public j2 H;
    public m2 I;
    public boolean J;
    public r1 K;
    public n0.a L;
    public final n0.b M;
    public a N;
    public n0.c O;
    public d6.f P;
    public final x0.b Q;
    public final fc.i R;
    public boolean S;
    public long T;
    public x U;

    /* renamed from: a, reason: collision with root package name */
    public final a5.c f4721a;

    /* renamed from: b, reason: collision with root package name */
    public final v f4722b;

    /* renamed from: c, reason: collision with root package name */
    public final j2 f4723c;

    /* renamed from: d, reason: collision with root package name */
    public final s.j0 f4724d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.a f4725e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.a f4726f;

    /* renamed from: g, reason: collision with root package name */
    public final f8.c f4727g;

    /* renamed from: h, reason: collision with root package name */
    public final y f4728h;

    /* renamed from: j, reason: collision with root package name */
    public q1 f4730j;

    /* renamed from: k, reason: collision with root package name */
    public int f4731k;

    /* renamed from: l, reason: collision with root package name */
    public int f4732l;

    /* renamed from: m, reason: collision with root package name */
    public int f4733m;

    /* renamed from: o, reason: collision with root package name */
    public int[] f4735o;

    /* renamed from: p, reason: collision with root package name */
    public s.s f4736p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4737q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4738r;

    /* renamed from: v, reason: collision with root package name */
    public s.u f4742v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4743w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4745y;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4729i = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final r0 f4734n = new r0();

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f4739s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final r0 f4740t = new r0();

    /* renamed from: u, reason: collision with root package name */
    public r1 f4741u = u0.i.f6678j;

    /* renamed from: x, reason: collision with root package name */
    public final r0 f4744x = new r0();

    /* renamed from: z, reason: collision with root package name */
    public int f4746z = -1;

    public r(a5.c cVar, v vVar, j2 j2Var, s.j0 j0Var, n0.a aVar, n0.a aVar2, f8.c cVar2, y yVar) {
        this.f4721a = cVar;
        this.f4722b = vVar;
        this.f4723c = j2Var;
        this.f4724d = j0Var;
        this.f4725e = aVar;
        this.f4726f = aVar2;
        this.f4727g = cVar2;
        this.f4728h = yVar;
        this.C = vVar.e() || vVar.c();
        this.D = new q(0, this);
        this.E = new ArrayList();
        i2 c3 = j2Var.c();
        c3.c();
        this.G = c3;
        j2 j2Var2 = new j2();
        if (vVar.e()) {
            j2Var2.b();
        }
        if (vVar.c()) {
            j2Var2.f4641q = new s.u();
        }
        this.H = j2Var2;
        m2 d10 = j2Var2.d();
        d10.e(true);
        this.I = d10;
        this.M = new n0.b(this, aVar);
        i2 c7 = this.H.c();
        try {
            a a6 = c7.a(0);
            c7.c();
            this.N = a6;
            this.O = new n0.c();
            this.Q = new x0.b(this);
            fc.i i10 = vVar.i();
            fc.i A = A();
            this.R = i10.d(A == null ? fc.j.f2348g : A);
        } catch (Throwable th) {
            c7.c();
            throw th;
        }
    }

    public static final int O(r rVar, int i10, boolean z10, int i11) {
        i2 i2Var = rVar.G;
        if (i2Var.j(i10)) {
            int i12 = i2Var.i(i10);
            Object p8 = i2Var.p(i2Var.f4615b, i10);
            if (i12 == 206 && pc.j.a(p8, t.f4761e)) {
                Object h10 = i2Var.h(i10, 0);
                o oVar = h10 instanceof o ? (o) h10 : null;
                if (oVar != null) {
                    for (r rVar2 : oVar.f4688g.f4701e) {
                        j2 j2Var = rVar2.f4723c;
                        if (j2Var.f4632h > 0 && (j2Var.f4631g[1] & 67108864) != 0) {
                            y yVar = rVar2.f4728h;
                            synchronized (yVar.f4816j) {
                                yVar.o();
                                s.g0 g0Var = yVar.f4826t;
                                yVar.f4826t = v6.a.p();
                                try {
                                    yVar.f4832z.e0(g0Var);
                                } finally {
                                }
                            }
                            n0.a aVar = new n0.a();
                            rVar2.L = aVar;
                            i2 c3 = rVar2.f4723c.c();
                            try {
                                rVar2.G = c3;
                                n0.b bVar = rVar2.M;
                                n0.a aVar2 = bVar.f4981b;
                                try {
                                    bVar.f4981b = aVar;
                                    rVar2.N(0);
                                    n0.b bVar2 = rVar2.M;
                                    bVar2.b();
                                    if (bVar2.f4982c) {
                                        bVar2.f4981b.f4978d.N(n0.b0.f4992c);
                                        if (bVar2.f4982c) {
                                            bVar2.d(false);
                                            bVar2.d(false);
                                            bVar2.f4981b.f4978d.N(n0.m.f5022c);
                                            bVar2.f4982c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                c3.c();
                            }
                        }
                        rVar.f4722b.n(rVar2.f4728h);
                    }
                }
                return i2Var.o(i10);
            }
            if (!i2Var.l(i10)) {
                return i2Var.o(i10);
            }
        } else if (i2Var.d(i10)) {
            int i13 = i2Var.f4615b[(i10 * 5) + 3] + i10;
            int i14 = 0;
            for (int i15 = i10 + 1; i15 < i13; i15 += i2Var.f4615b[(i15 * 5) + 3]) {
                boolean l10 = i2Var.l(i15);
                if (l10) {
                    rVar.M.c();
                    n0.b bVar3 = rVar.M;
                    Object n7 = i2Var.n(i15);
                    bVar3.c();
                    bVar3.f4987h.add(n7);
                }
                i14 += O(rVar, i15, l10 || z10, l10 ? 0 : i11 + i14);
                if (l10) {
                    rVar.M.c();
                    rVar.M.a();
                }
            }
            if (!i2Var.l(i10)) {
                return i14;
            }
        } else if (!i2Var.l(i10)) {
            return i2Var.o(i10);
        }
        return 1;
    }

    public final x0.b A() {
        if (this.C) {
            return this.Q;
        }
        return null;
    }

    public final boolean B() {
        x1 y10;
        return (this.S || this.f4745y || this.f4743w || (y10 = y()) == null || (y10.f4807b & 8) != 0) ? false : true;
    }

    public final void C(ArrayList arrayList) {
        n0.a aVar = this.f4726f;
        n0.b bVar = this.M;
        n0.a aVar2 = bVar.f4981b;
        try {
            bVar.f4981b = aVar;
            aVar.f4978d.N(n0.z.f5039c);
            if (arrayList.size() <= 0) {
                bVar.f4981b.f4978d.N(n0.n.f5023c);
                bVar.f4985f = 0;
            } else {
                ac.i iVar = (ac.i) arrayList.get(0);
                c1 c1Var = (c1) iVar.f270g;
                c1Var.getClass();
                throw null;
            }
        } finally {
            bVar.f4981b = aVar2;
        }
    }

    public final void D(r1 r1Var, Object obj) {
        T(126665345, 0, null, null);
        E();
        j0(obj);
        long j3 = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                m2.y(this.I);
            }
            boolean z10 = (this.S || pc.j.a(this.G.f(), r1Var)) ? false : true;
            if (z10) {
                K(r1Var);
            }
            T(202, 0, t.f4759c, r1Var);
            this.K = null;
            boolean z11 = this.f4743w;
            this.f4743w = z10;
            u0.e.d(this, new u0.d(316014703, new hd.m(1, obj), true));
            this.f4743w = z11;
        } finally {
        }
    }

    public final Object E() {
        boolean z10 = this.S;
        z0 z0Var = l.f4646a;
        if (!z10) {
            Object m10 = this.G.m();
            if (!this.f4745y || (m10 instanceof o)) {
                return m10;
            }
        } else if (this.f4738r) {
            t.c("A call to createNode(), emitNode() or useNode() expected");
            return z0Var;
        }
        return z0Var;
    }

    public final List F() {
        v vVar = this.f4722b;
        u g8 = vVar.g();
        y yVar = g8 != null ? (y) g8 : null;
        if (yVar != null) {
            j2 j2Var = yVar.f4818l;
            i2 c3 = j2Var.c();
            try {
                Integer l10 = u2.b.l(c3, vVar, 0, c3.f4616c);
                if (l10 != null) {
                    try {
                        return u2.b.o(j2Var.c(), l10.intValue(), 0);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return bc.v.f1067g;
    }

    public final int G(int i10) {
        int q10 = this.G.q(i10) + 1;
        int i11 = 0;
        while (q10 < i10) {
            if (!this.G.k(q10)) {
                i11++;
            }
            q10 += l2.a(this.G.f4615b, q10);
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(y yVar, y yVar2, Integer num, List list, oc.a aVar) {
        Object invoke;
        boolean z10 = this.F;
        int i10 = this.f4731k;
        try {
            this.F = true;
            this.f4731k = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                ac.i iVar = (ac.i) list.get(i11);
                x1 x1Var = (x1) iVar.f270g;
                Object obj = iVar.f271h;
                if (obj != null) {
                    d0(x1Var, obj);
                } else {
                    d0(x1Var, null);
                }
            }
            if (yVar != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (yVar2 == null || yVar2.equals(yVar) || intValue < 0) {
                    invoke = aVar.invoke();
                } else {
                    yVar.f4828v = yVar2;
                    yVar.f4829w = intValue;
                    try {
                        invoke = aVar.invoke();
                        yVar.f4828v = null;
                        yVar.f4829w = 0;
                    } catch (Throwable th) {
                        yVar.f4828v = null;
                        yVar.f4829w = 0;
                        throw th;
                    }
                }
            }
            invoke = aVar.invoke();
            this.F = z10;
            this.f4731k = i10;
            return invoke;
        } catch (Throwable th2) {
            this.F = z10;
            this.f4731k = i10;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.f4753b < r5) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        s0 s0Var;
        int i10;
        int i11;
        long j3;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        long j6;
        s.z zVar;
        int i17;
        int e10;
        s0 s0Var2;
        int i18;
        long j10;
        long j11;
        int hashCode;
        Object b2;
        boolean z11 = this.F;
        boolean z12 = true;
        this.F = true;
        i2 i2Var = this.G;
        int i19 = i2Var.f4622i;
        int i20 = (i19 * 5) + 3;
        int i21 = i2Var.f4615b[i20] + i19;
        int i22 = this.f4731k;
        long j12 = this.T;
        int i23 = this.f4732l;
        int i24 = this.f4733m;
        int i25 = i2Var.f4620g;
        ArrayList arrayList = this.f4739s;
        int e11 = t.e(i25, arrayList);
        if (e11 < 0) {
            e11 = -(e11 + 1);
        }
        if (e11 < arrayList.size()) {
            s0Var = (s0) arrayList.get(e11);
        }
        s0Var = null;
        boolean z13 = false;
        int i26 = i19;
        while (s0Var != null) {
            boolean z14 = z12;
            x1 x1Var = s0Var.f4752a;
            int i27 = s0Var.f4753b;
            int e12 = t.e(i27, arrayList);
            if (e12 >= 0) {
            }
            Object obj = s0Var.f4754c;
            if (obj == null) {
                x1Var.getClass();
                i10 = i20;
            } else {
                int i28 = 8;
                s.g0 g0Var = x1Var.f4812g;
                if (g0Var == null) {
                    i10 = i20;
                } else {
                    i10 = i20;
                    if (obj instanceof i0) {
                        z10 = x1.a((i0) obj, g0Var);
                        i11 = i22;
                        j3 = j12;
                        i12 = i23;
                        i13 = i24;
                    } else if (obj instanceof s.h0) {
                        s.h0 h0Var = (s.h0) obj;
                        if (h0Var.h()) {
                            Object[] objArr = h0Var.f6275b;
                            long[] jArr = h0Var.f6274a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                i12 = i23;
                                i13 = i24;
                                int i29 = 0;
                                while (true) {
                                    long j13 = jArr[i29];
                                    i11 = i22;
                                    j3 = j12;
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i30 = 8 - ((~(i29 - length)) >>> 31);
                                        int i31 = 0;
                                        while (i31 < i30) {
                                            if ((j13 & 255) < 128) {
                                                Object obj2 = objArr[(i29 << 3) + i31];
                                                i14 = i31;
                                                if (!(obj2 instanceof i0) || x1.a((i0) obj2, g0Var)) {
                                                    break;
                                                }
                                            } else {
                                                i14 = i31;
                                            }
                                            j13 >>= i28;
                                            i31 = i14 + 1;
                                        }
                                        if (i30 != i28) {
                                            break;
                                        }
                                    }
                                    if (i29 == length) {
                                        break;
                                    }
                                    i29++;
                                    i22 = i11;
                                    j12 = j3;
                                    i28 = 8;
                                }
                                z10 = z14 ? 1 : 0;
                            }
                        }
                        i11 = i22;
                        j3 = j12;
                        i12 = i23;
                        i13 = i24;
                        z10 = false;
                    }
                    if (z10) {
                        long j14 = j3;
                        ArrayList arrayList2 = this.E;
                        arrayList2.add(x1Var);
                        this.f4727g.n();
                        y yVar = x1Var.f4806a;
                        if (yVar == null || (zVar = x1Var.f4811f) == null) {
                            i15 = i19;
                            i16 = i21;
                            j6 = j14;
                        } else {
                            x1Var.e(z14);
                            try {
                                Object[] objArr2 = zVar.f6363b;
                                int[] iArr = zVar.f6364c;
                                long[] jArr2 = zVar.f6362a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    j6 = j14;
                                    int i32 = 0;
                                    while (true) {
                                        long j15 = jArr2[i32];
                                        i15 = i19;
                                        i16 = i21;
                                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i33 = 8 - ((~(i32 - length2)) >>> 31);
                                            for (int i34 = 0; i34 < i33; i34 = i17 + 1) {
                                                if ((j15 & 255) < 128) {
                                                    int i35 = (i32 << 3) + i34;
                                                    i17 = i34;
                                                    Object obj3 = objArr2[i35];
                                                    int i36 = iArr[i35];
                                                    yVar.y(obj3);
                                                } else {
                                                    i17 = i34;
                                                }
                                                j15 >>= 8;
                                            }
                                            if (i33 != 8) {
                                                break;
                                            }
                                        }
                                        if (i32 == length2) {
                                            break;
                                        }
                                        i32++;
                                        i19 = i15;
                                        i21 = i16;
                                    }
                                } else {
                                    i15 = i19;
                                    i16 = i21;
                                    j6 = j14;
                                }
                                x1Var.e(false);
                            } catch (Throwable th) {
                                x1Var.e(false);
                                throw th;
                            }
                        }
                        z14 = true;
                        arrayList2.remove(arrayList2.size() - 1);
                    } else {
                        this.G.r(i27);
                        int i37 = this.G.f4620g;
                        L(i26, i37, i19);
                        int q10 = this.G.q(i37);
                        while (q10 != i19 && !this.G.l(q10)) {
                            q10 = this.G.q(q10);
                        }
                        int i38 = this.G.l(q10) ? 0 : i11;
                        if (q10 != i37) {
                            int k02 = (k0(q10) - this.G.o(i37)) + i38;
                            while (i38 < k02 && q10 != i27) {
                                q10++;
                                while (q10 < i27) {
                                    i2 i2Var2 = this.G;
                                    int i39 = i2Var2.f4615b[(q10 * 5) + 3] + q10;
                                    if (i27 >= i39) {
                                        i38 += i2Var2.l(q10) ? z14 ? 1 : 0 : k0(q10);
                                        q10 = i39;
                                    }
                                }
                                break;
                            }
                        }
                        this.f4731k = i38;
                        this.f4733m = G(i37);
                        int q11 = this.G.q(i37);
                        long j16 = 0;
                        int i40 = 3;
                        int i41 = 0;
                        while (true) {
                            if (q11 < 0) {
                                i18 = i37;
                                j10 = j3;
                                break;
                            }
                            if (q11 == i19) {
                                j10 = j3;
                                j16 ^= Long.rotateLeft(j10, i41);
                                i18 = i37;
                                break;
                            }
                            j10 = j3;
                            i2 i2Var3 = this.G;
                            boolean k3 = i2Var3.k(q11);
                            i18 = i37;
                            int[] iArr2 = i2Var3.f4615b;
                            if (k3) {
                                Object p8 = i2Var3.p(iArr2, q11);
                                if (p8 != null) {
                                    hashCode = p8 instanceof Enum ? ((Enum) p8).ordinal() : p8.hashCode();
                                    j11 = j16;
                                } else {
                                    j11 = j16;
                                    hashCode = 0;
                                }
                            } else {
                                int i42 = i2Var3.i(q11);
                                j11 = j16;
                                hashCode = (i42 != 207 || (b2 = i2Var3.b(iArr2, q11)) == null || b2.equals(l.f4646a)) ? i42 : b2.hashCode();
                            }
                            if (hashCode == 126665345) {
                                j16 = j11 ^ Long.rotateLeft(hashCode, i41);
                                break;
                            }
                            j16 = Long.rotateLeft(this.G.k(q11) ? 0 : G(q11), i41) ^ (j11 ^ Long.rotateLeft(hashCode, i40));
                            i40 = (i40 + 6) % 64;
                            i41 = (i41 + 6) % 64;
                            q11 = this.G.q(q11);
                            j3 = j10;
                            i37 = i18;
                        }
                        this.T = j16;
                        this.K = null;
                        oc.e eVar = x1Var.f4809d;
                        if (eVar == null) {
                            throw new IllegalStateException("Invalid restart scope");
                        }
                        eVar.invoke(this, Integer.valueOf(z14 ? 1 : 0));
                        this.K = null;
                        i2 i2Var4 = this.G;
                        int i43 = i2Var4.f4615b[i10] + i19;
                        int i44 = i2Var4.f4620g;
                        if (!((i44 < i19 || i44 > i43) ? false : z14 ? 1 : 0)) {
                            t.c("Index " + i19 + " is not a parent of " + i44);
                        }
                        i2Var4.f4622i = i19;
                        i2Var4.f4621h = i43;
                        i2Var4.f4625l = 0;
                        i2Var4.f4626m = 0;
                        i15 = i19;
                        i16 = i21;
                        j6 = j10;
                        i26 = i18;
                        z13 = z14 ? 1 : 0;
                    }
                    e10 = t.e(this.G.f4620g, arrayList);
                    if (e10 < 0) {
                        e10 = -(e10 + 1);
                    }
                    if (e10 >= arrayList.size()) {
                        s0Var2 = (s0) arrayList.get(e10);
                        i21 = i16;
                        if (s0Var2.f4753b < i21) {
                            s0Var = s0Var2;
                            z12 = z14;
                            i20 = i10;
                            i19 = i15;
                            i23 = i12;
                            i24 = i13;
                            i22 = i11;
                            j12 = j6;
                        }
                    } else {
                        i21 = i16;
                    }
                    s0Var2 = null;
                    s0Var = s0Var2;
                    z12 = z14;
                    i20 = i10;
                    i19 = i15;
                    i23 = i12;
                    i24 = i13;
                    i22 = i11;
                    j12 = j6;
                }
            }
            i11 = i22;
            j3 = j12;
            i12 = i23;
            i13 = i24;
            z10 = z14 ? 1 : 0;
            if (z10) {
            }
            e10 = t.e(this.G.f4620g, arrayList);
            if (e10 < 0) {
            }
            if (e10 >= arrayList.size()) {
            }
            s0Var2 = null;
            s0Var = s0Var2;
            z12 = z14;
            i20 = i10;
            i19 = i15;
            i23 = i12;
            i24 = i13;
            i22 = i11;
            j12 = j6;
        }
        int i45 = i19;
        int i46 = i22;
        long j17 = j12;
        int i47 = i23;
        int i48 = i24;
        if (z13) {
            L(i26, i45, i45);
            this.G.t();
            int k03 = k0(i45);
            this.f4731k = i46 + k03;
            this.f4732l = i47 + k03;
            this.f4733m = i48;
        } else {
            R();
        }
        this.T = j17;
        this.F = z11;
    }

    public final void J() {
        int i10;
        N(this.G.f4620g);
        n0.b bVar = this.M;
        bVar.d(false);
        r0 r0Var = bVar.f4983d;
        r rVar = bVar.f4980a;
        i2 i2Var = rVar.G;
        if (i2Var.f4616c > 0 && r0Var.a(-2) != (i10 = i2Var.f4622i)) {
            if (!bVar.f4982c && bVar.f4984e) {
                bVar.d(false);
                bVar.f4981b.f4978d.N(n0.q.f5026c);
                bVar.f4982c = true;
            }
            if (i10 > 0) {
                a a6 = i2Var.a(i10);
                r0Var.c(i10);
                bVar.d(false);
                n0.l0 l0Var = bVar.f4981b.f4978d;
                l0Var.N(n0.p.f5025c);
                a.a.J(l0Var, 0, a6);
                bVar.f4982c = true;
            }
        }
        bVar.f4981b.f4978d.N(n0.x.f5037c);
        int i11 = bVar.f4985f;
        i2 i2Var2 = rVar.G;
        bVar.f4985f = i2Var2.f4615b[(i2Var2.f4620g * 5) + 3] + i11;
    }

    public final void K(r1 r1Var) {
        s.u uVar = this.f4742v;
        if (uVar == null) {
            uVar = new s.u();
            this.f4742v = uVar;
        }
        uVar.h(this.G.f4620g, r1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(int i10, int i11, int i12) {
        i2 i2Var = this.G;
        if (i10 != i11) {
            if (i10 != i12 && i11 != i12) {
                if (i2Var.q(i10) == i11) {
                    i12 = i11;
                } else if (i2Var.q(i11) != i10) {
                    if (i2Var.q(i10) == i2Var.q(i11)) {
                        i12 = i2Var.q(i10);
                    } else {
                        int i13 = i10;
                        int i14 = 0;
                        while (i13 > 0 && i13 != i12) {
                            i13 = i2Var.q(i13);
                            i14++;
                        }
                        int i15 = i11;
                        int i16 = 0;
                        while (i15 > 0 && i15 != i12) {
                            i15 = i2Var.q(i15);
                            i16++;
                        }
                        int i17 = i14 - i16;
                        int i18 = i10;
                        for (int i19 = 0; i19 < i17; i19++) {
                            i18 = i2Var.q(i18);
                        }
                        int i20 = i16 - i14;
                        int i21 = i11;
                        for (int i22 = 0; i22 < i20; i22++) {
                            i21 = i2Var.q(i21);
                        }
                        i12 = i18;
                        for (int i23 = i21; i12 != i23; i23 = i2Var.q(i23)) {
                            i12 = i2Var.q(i12);
                        }
                    }
                }
            }
            while (i10 > 0 && i10 != i12) {
                if (!i2Var.l(i10)) {
                    this.M.a();
                }
                i10 = i2Var.q(i10);
            }
            p(i11, i12);
        }
        i12 = i10;
        while (i10 > 0) {
            if (!i2Var.l(i10)) {
            }
            i10 = i2Var.q(i10);
        }
        p(i11, i12);
    }

    public final Object M() {
        boolean z10 = this.S;
        z0 z0Var = l.f4646a;
        if (!z10) {
            Object m10 = this.G.m();
            if (!this.f4745y || (m10 instanceof o)) {
                return m10 instanceof f2 ? ((f2) m10).f4585a : m10;
            }
        } else if (this.f4738r) {
            t.c("A call to createNode(), emitNode() or useNode() expected");
            return z0Var;
        }
        return z0Var;
    }

    public final void N(int i10) {
        boolean l10 = this.G.l(i10);
        n0.b bVar = this.M;
        if (l10) {
            bVar.c();
            Object n7 = this.G.n(i10);
            bVar.c();
            bVar.f4987h.add(n7);
        }
        O(this, i10, l10, 0);
        bVar.c();
        if (l10) {
            bVar.a();
        }
    }

    public final boolean P(int i10, boolean z10) {
        if ((i10 & 1) == 0 && (this.S || this.f4745y)) {
            if (this.P != null) {
                y();
                return true;
            }
        } else if (!z10 && B()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        int i10;
        long rotateLeft;
        long j3;
        if (this.f4739s.isEmpty()) {
            this.f4732l = this.G.s() + this.f4732l;
            return;
        }
        i2 i2Var = this.G;
        int g8 = i2Var.g();
        int[] iArr = i2Var.f4615b;
        int i11 = i2Var.f4620g;
        Object p8 = i11 < i2Var.f4621h ? i2Var.p(iArr, i11) : null;
        Object f10 = i2Var.f();
        int i12 = this.f4733m;
        z0 z0Var = l.f4646a;
        if (p8 != null) {
            if (p8 instanceof Enum) {
                rotateLeft = Long.rotateLeft(((Enum) p8).ordinal() ^ Long.rotateLeft(this.T, 3), 3);
                i10 = 0;
            } else {
                i10 = 0;
                rotateLeft = Long.rotateLeft(p8.hashCode() ^ Long.rotateLeft(this.T, 3), 3);
            }
            j3 = rotateLeft ^ i10;
        } else {
            if (f10 != null && g8 == 207 && !f10.equals(z0Var)) {
                this.T = Long.rotateLeft(f10.hashCode() ^ Long.rotateLeft(this.T, 3), 3) ^ i12;
                W(null, (iArr[(i2Var.f4620g * 5) + 1] & 1073741824) != 0);
                I();
                i2Var.e();
                if (p8 == null) {
                    if (p8 instanceof Enum) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T ^ 0, 3) ^ ((Enum) p8).ordinal(), 3);
                        return;
                    } else {
                        this.T = Long.rotateRight(Long.rotateRight(this.T ^ 0, 3) ^ p8.hashCode(), 3);
                        return;
                    }
                }
                if (f10 == null || g8 != 207 || f10.equals(z0Var)) {
                    this.T = Long.rotateRight(g8 ^ Long.rotateRight(this.T ^ i12, 3), 3);
                    return;
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ i12, 3) ^ f10.hashCode(), 3);
                    return;
                }
            }
            j3 = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ g8, 3) ^ i12;
        }
        this.T = j3;
        W(null, (iArr[(i2Var.f4620g * 5) + 1] & 1073741824) != 0);
        I();
        i2Var.e();
        if (p8 == null) {
        }
    }

    public final void R() {
        i2 i2Var = this.G;
        int i10 = i2Var.f4622i;
        this.f4732l = i10 >= 0 ? i2Var.f4615b[(i10 * 5) + 1] & 67108863 : 0;
        i2Var.t();
    }

    public final void S() {
        if (this.f4732l != 0) {
            t.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        x1 y10 = y();
        if (y10 != null) {
            int i10 = y10.f4807b;
            if ((i10 & 128) == 0) {
                y10.f4807b = i10 | 16;
            }
        }
        if (this.f4739s.isEmpty()) {
            R();
        } else {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i10, int i11, Object obj, Object obj2) {
        long rotateLeft;
        long j3;
        boolean z10;
        q1 q1Var;
        q1 q1Var2;
        int i12;
        int i13;
        Object[] objArr;
        Object[] objArr2;
        int i14;
        int i15;
        int i16;
        boolean z11;
        int i17;
        Object obj3 = obj;
        if (this.f4738r) {
            t.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i18 = this.f4733m;
        Object obj4 = l.f4646a;
        if (obj3 != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()), 3);
            j3 = 0;
        } else {
            if (obj2 != null && i10 == 207 && !obj2.equals(obj4)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ obj2.hashCode(), 3) ^ i18;
                if (obj3 == null) {
                    this.f4733m++;
                }
                boolean z12 = i11 == 0;
                if (!this.S) {
                    this.G.f4624k++;
                    m2 m2Var = this.I;
                    int i19 = m2Var.f4677t;
                    if (z12) {
                        m2Var.P(i10, obj4, obj4, true);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        m2Var.P(i10, obj3, obj2, false);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        m2Var.P(i10, obj3, obj4, false);
                    }
                    q1 q1Var3 = this.f4730j;
                    if (q1Var3 != null) {
                        int i20 = (-2) - i19;
                        v0 v0Var = new v0(-1, i10, i20, -1);
                        q1Var3.f4718e.h(i20, new o0(-1, this.f4731k - q1Var3.f4715b, 0));
                        q1Var3.f4717d.add(v0Var);
                    }
                    w(z12, null);
                    return;
                }
                boolean z13 = i11 == 1 && this.f4745y;
                if (this.f4730j == null) {
                    int g8 = this.G.g();
                    if (!z13 && g8 == i10) {
                        i2 i2Var = this.G;
                        int i21 = i2Var.f4620g;
                        if (pc.j.a(obj3, i21 < i2Var.f4621h ? i2Var.p(i2Var.f4615b, i21) : null)) {
                            W(obj2, z12);
                        }
                    }
                    i2 i2Var2 = this.G;
                    int[] iArr = i2Var2.f4615b;
                    ArrayList arrayList = new ArrayList();
                    if (i2Var2.f4624k <= 0) {
                        int i22 = i2Var2.f4620g;
                        while (i22 < i2Var2.f4621h) {
                            int i23 = i22 * 5;
                            int i24 = iArr[i23];
                            Object p8 = i2Var2.p(iArr, i22);
                            int i25 = iArr[i23 + 1];
                            if ((i25 & 1073741824) != 0) {
                                z11 = z13;
                                i17 = 1;
                            } else {
                                z11 = z13;
                                i17 = i25 & 67108863;
                            }
                            arrayList.add(new v0(p8, i24, i22, i17));
                            i22 += iArr[i23 + 3];
                            z13 = z11;
                        }
                    }
                    z10 = z13;
                    this.f4730j = new q1(this.f4731k, arrayList);
                    q1Var = this.f4730j;
                    if (q1Var != null) {
                        ArrayList arrayList2 = q1Var.f4717d;
                        s.u uVar = q1Var.f4718e;
                        int i26 = q1Var.f4715b;
                        Object u0Var = obj3 != null ? new u0(Integer.valueOf(i10), obj3) : Integer.valueOf(i10);
                        s.g0 g0Var = ((o0.a) q1Var.f4719f.getValue()).f5127a;
                        Object g10 = g0Var.g(u0Var);
                        if (g10 == null) {
                            g10 = null;
                        } else if (g10 instanceof s.a0) {
                            s.a0 a0Var = (s.a0) g10;
                            Object j6 = a0Var.j(0);
                            if (a0Var.g()) {
                                g0Var.k(u0Var);
                            }
                            if (a0Var.f6220b == 1) {
                                g0Var.m(u0Var, a0Var.d());
                            }
                            g10 = j6;
                        } else {
                            g0Var.k(u0Var);
                        }
                        v0 v0Var2 = (v0) g10;
                        if (z10 || v0Var2 == null) {
                            this.G.f4624k++;
                            this.S = true;
                            this.K = null;
                            if (this.I.f4680w) {
                                m2 d10 = this.H.d();
                                this.I = d10;
                                d10.L();
                                this.J = false;
                                this.K = null;
                            }
                            this.I.d();
                            m2 m2Var2 = this.I;
                            int i27 = m2Var2.f4677t;
                            if (z12) {
                                m2Var2.P(i10, obj4, obj4, true);
                                i12 = 0;
                            } else if (obj2 != null) {
                                if (obj != null) {
                                    obj4 = obj;
                                }
                                i12 = 0;
                                m2Var2.P(i10, obj4, obj2, false);
                            } else {
                                i12 = 0;
                                m2Var2.P(i10, obj == null ? obj4 : obj, obj4, false);
                            }
                            this.N = this.I.b(i27);
                            int i28 = (-2) - i27;
                            v0 v0Var3 = new v0(-1, i10, i28, -1);
                            uVar.h(i28, new o0(-1, this.f4731k - i26, i12));
                            arrayList2.add(v0Var3);
                            q1Var2 = new q1(z12 ? i12 : this.f4731k, new ArrayList());
                            w(z12, q1Var2);
                            return;
                        }
                        int i29 = v0Var2.f4782c;
                        arrayList2.add(v0Var2);
                        o0 o0Var = (o0) uVar.b(i29);
                        this.f4731k = (o0Var != null ? o0Var.f4690b : -1) + i26;
                        o0 o0Var2 = (o0) uVar.b(i29);
                        int i30 = o0Var2 != null ? o0Var2.f4689a : -1;
                        int i31 = q1Var.f4716c;
                        int i32 = i30 - i31;
                        int i33 = 8;
                        if (i30 > i31) {
                            Object[] objArr3 = uVar.f6297c;
                            long[] jArr = uVar.f6295a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i34 = 0;
                                while (true) {
                                    long j10 = jArr[i34];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i35 = 8 - ((~(i34 - length)) >>> 31);
                                        int i36 = 0;
                                        while (i36 < i35) {
                                            if ((j10 & 255) < 128) {
                                                i16 = i33;
                                                o0 o0Var3 = (o0) objArr3[(i34 << 3) + i36];
                                                i15 = i32;
                                                int i37 = o0Var3.f4689a;
                                                if (i37 == i30) {
                                                    o0Var3.f4689a = i31;
                                                } else if (i31 <= i37 && i37 < i30) {
                                                    o0Var3.f4689a = i37 + 1;
                                                }
                                            } else {
                                                i15 = i32;
                                                i16 = i33;
                                            }
                                            j10 >>= i16;
                                            i36++;
                                            i32 = i15;
                                            i33 = i16;
                                        }
                                        i13 = i32;
                                        if (i35 != i33) {
                                            break;
                                        }
                                    } else {
                                        i13 = i32;
                                    }
                                    if (i34 == length) {
                                        break;
                                    }
                                    i34++;
                                    i32 = i13;
                                    i33 = 8;
                                }
                            } else {
                                i13 = i32;
                            }
                        } else {
                            i13 = i32;
                            if (i31 > i30) {
                                Object[] objArr4 = uVar.f6297c;
                                long[] jArr2 = uVar.f6295a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i38 = 0;
                                    while (true) {
                                        long j11 = jArr2[i38];
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i39 = 8 - ((~(i38 - length2)) >>> 31);
                                            int i40 = 0;
                                            while (i40 < i39) {
                                                if ((j11 & 255) < 128) {
                                                    o0 o0Var4 = (o0) objArr4[(i38 << 3) + i40];
                                                    int i41 = o0Var4.f4689a;
                                                    if (i41 == i30) {
                                                        o0Var4.f4689a = i31;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i30 + 1 <= i41 && i41 < i31) {
                                                            o0Var4.f4689a = i41 - 1;
                                                        }
                                                        j11 >>= 8;
                                                        i40++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j11 >>= 8;
                                                i40++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i39 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i38 == length2) {
                                            break;
                                        }
                                        i38++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        n0.b bVar = this.M;
                        int i42 = bVar.f4985f;
                        r rVar = bVar.f4980a;
                        bVar.f4985f = (i29 - rVar.G.f4620g) + i42;
                        this.G.r(i29);
                        if (i13 > 0) {
                            bVar.d(false);
                            r0 r0Var = bVar.f4983d;
                            i2 i2Var3 = rVar.G;
                            if (i2Var3.f4616c > 0 && r0Var.a(-2) != (i14 = i2Var3.f4622i)) {
                                if (!bVar.f4982c && bVar.f4984e) {
                                    bVar.d(false);
                                    bVar.f4981b.f4978d.N(n0.q.f5026c);
                                    bVar.f4982c = true;
                                }
                                if (i14 > 0) {
                                    a a6 = i2Var3.a(i14);
                                    r0Var.c(i14);
                                    bVar.d(false);
                                    n0.l0 l0Var = bVar.f4981b.f4978d;
                                    l0Var.N(n0.p.f5025c);
                                    a.a.J(l0Var, 0, a6);
                                    bVar.f4982c = true;
                                }
                            }
                            n0.l0 l0Var2 = bVar.f4981b.f4978d;
                            l0Var2.N(n0.u.f5034c);
                            l0Var2.f5018f[l0Var2.f5019g - l0Var2.f5016d[l0Var2.f5017e - 1].f5007a] = i13;
                        }
                        W(obj2, z12);
                    }
                    q1Var2 = null;
                    w(z12, q1Var2);
                    return;
                }
                z10 = z13;
                q1Var = this.f4730j;
                if (q1Var != null) {
                }
                q1Var2 = null;
                w(z12, q1Var2);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i10, 3);
            j3 = i18;
        }
        this.T = rotateLeft ^ j3;
        if (obj3 == null) {
        }
        if (i11 == 0) {
        }
        if (!this.S) {
        }
    }

    public final void U() {
        T(-127, 0, null, null);
    }

    public final void V(int i10, f1 f1Var) {
        T(i10, 0, f1Var, null);
    }

    public final void W(Object obj, boolean z10) {
        if (z10) {
            i2 i2Var = this.G;
            if (i2Var.f4624k <= 0) {
                if ((i2Var.f4615b[(i2Var.f4620g * 5) + 1] & 1073741824) == 0) {
                    s1.a("Expected a node group");
                }
                i2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            n0.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            n0.l0 l0Var = bVar.f4981b.f4978d;
            l0Var.N(n0.e0.f4999c);
            a.a.J(l0Var, 0, obj);
        }
        this.G.u();
    }

    public final void X(int i10) {
        int i11;
        int i12;
        if (this.f4730j != null) {
            T(i10, 0, null, null);
            return;
        }
        if (this.f4738r) {
            t.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i10, 3) ^ this.f4733m;
        this.f4733m++;
        i2 i2Var = this.G;
        boolean z10 = this.S;
        z0 z0Var = l.f4646a;
        if (z10) {
            i2Var.f4624k++;
            this.I.P(i10, z0Var, z0Var, false);
            w(false, null);
            return;
        }
        if (i2Var.g() == i10 && ((i12 = i2Var.f4620g) >= i2Var.f4621h || (i2Var.f4615b[(i12 * 5) + 1] & 536870912) == 0)) {
            i2Var.u();
            w(false, null);
            return;
        }
        if (i2Var.f4624k <= 0 && (i11 = i2Var.f4620g) != i2Var.f4621h) {
            int i13 = this.f4731k;
            J();
            this.M.e(i13, i2Var.s());
            t.a(this.f4739s, i11, i2Var.f4620g);
        }
        i2Var.f4624k++;
        this.S = true;
        this.K = null;
        if (this.I.f4680w) {
            m2 d10 = this.H.d();
            this.I = d10;
            d10.L();
            this.J = false;
            this.K = null;
        }
        m2 m2Var = this.I;
        m2Var.d();
        int i14 = m2Var.f4677t;
        m2Var.P(i10, z0Var, z0Var, false);
        this.N = m2Var.b(i14);
        w(false, null);
    }

    public final void Y(int i10) {
        T(i10, 0, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r Z(int i10) {
        x1 x1Var;
        boolean z10;
        int i11;
        X(i10);
        boolean z11 = this.S;
        f8.c cVar = this.f4727g;
        ArrayList arrayList = this.E;
        y yVar = this.f4728h;
        if (z11) {
            x1 x1Var2 = new x1(yVar);
            arrayList.add(x1Var2);
            j0(x1Var2);
            x1Var2.f4810e = this.B;
            x1Var2.f4807b &= -17;
            cVar.n();
            return this;
        }
        int i12 = this.G.f4622i;
        ArrayList arrayList2 = this.f4739s;
        int e10 = t.e(i12, arrayList2);
        s0 s0Var = e10 >= 0 ? (s0) arrayList2.remove(e10) : null;
        Object m10 = this.G.m();
        if (pc.j.a(m10, l.f4646a)) {
            x1Var = new x1(yVar);
            j0(x1Var);
        } else {
            pc.j.c(m10, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            x1Var = (x1) m10;
        }
        if (s0Var == null) {
            int i13 = x1Var.f4807b;
            boolean z12 = (i13 & 64) != 0;
            if (z12) {
                x1Var.f4807b = i13 & (-65);
            }
            if (!z12) {
                z10 = false;
                int i14 = x1Var.f4807b;
                x1Var.f4807b = !z10 ? i14 | 8 : i14 & (-9);
                arrayList.add(x1Var);
                x1Var.f4810e = this.B;
                x1Var.f4807b &= -17;
                cVar.n();
                i11 = x1Var.f4807b;
                if ((i11 & 256) != 0) {
                    x1Var.f4807b = (i11 & (-257)) | 512;
                    n0.l0 l0Var = this.M.f4981b.f4978d;
                    l0Var.N(n0.c0.f4995c);
                    a.a.J(l0Var, 0, x1Var);
                    if (!this.f4745y) {
                        int i15 = x1Var.f4807b;
                        if ((i15 & 128) != 0) {
                            this.f4745y = true;
                            x1Var.f4807b = i15 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z10 = true;
        int i142 = x1Var.f4807b;
        x1Var.f4807b = !z10 ? i142 | 8 : i142 & (-9);
        arrayList.add(x1Var);
        x1Var.f4810e = this.B;
        x1Var.f4807b &= -17;
        cVar.n();
        i11 = x1Var.f4807b;
        if ((i11 & 256) != 0) {
        }
        return this;
    }

    public final void a() {
        i();
        this.f4729i.clear();
        this.f4734n.f4748b = 0;
        this.f4740t.f4748b = 0;
        this.f4744x.f4748b = 0;
        this.f4742v = null;
        n0.c cVar = this.O;
        cVar.f4994e.J();
        cVar.f4993d.J();
        this.T = 0;
        this.A = 0;
        this.f4738r = false;
        this.S = false;
        this.f4745y = false;
        this.F = false;
        this.f4746z = -1;
        i2 i2Var = this.G;
        if (!i2Var.f4619f) {
            i2Var.c();
        }
        if (this.I.f4680w) {
            return;
        }
        x();
    }

    public final void a0(Object obj) {
        if (!this.S && this.G.g() == 207 && !pc.j.a(this.G.f(), obj) && this.f4746z < 0) {
            this.f4746z = this.G.f4620g;
            this.f4745y = true;
        }
        T(207, 0, null, obj);
    }

    public final void b(Object obj, oc.e eVar) {
        if (this.S) {
            n0.l0 l0Var = this.O.f4993d;
            l0Var.N(n0.f0.f5001c);
            a.a.J(l0Var, 0, obj);
            pc.j.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            pc.v.c(2, eVar);
            a.a.J(l0Var, 1, eVar);
            return;
        }
        n0.b bVar = this.M;
        bVar.b();
        n0.l0 l0Var2 = bVar.f4981b.f4978d;
        l0Var2.N(n0.f0.f5001c);
        pc.j.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        pc.v.c(2, eVar);
        a.a.K(l0Var2, 0, obj, 1, eVar);
    }

    public final void b0() {
        T(125, 2, null, null);
        this.f4738r = true;
    }

    public final boolean c(float f10) {
        Object E = E();
        if ((E instanceof Float) && f10 == ((Number) E).floatValue()) {
            return false;
        }
        j0(Float.valueOf(f10));
        return true;
    }

    public final void c0() {
        this.f4733m = 0;
        this.G = this.f4723c.c();
        T(100, 0, null, null);
        v vVar = this.f4722b;
        vVar.o();
        r1 h10 = vVar.h();
        this.f4744x.c(this.f4743w ? 1 : 0);
        this.f4743w = f(h10);
        this.K = null;
        if (!this.f4737q) {
            this.f4737q = vVar.d();
        }
        if (!this.C) {
            this.C = vVar.e();
        }
        if (this.C) {
            x2 x2Var = x0.c.f7964a;
            pc.j.c(x2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            h10 = ((u0.i) h10).b(x2Var, new y2(A()));
        }
        this.f4741u = h10;
        Set set = (Set) z.t(h10, x0.e.f7966a);
        if (set != null) {
            x xVar = this.U;
            if (xVar == null) {
                xVar = new x(this.f4728h);
                this.U = xVar;
            }
            set.add(xVar);
            vVar.l(set);
        }
        T(Long.hashCode(vVar.f()), 0, null, null);
    }

    public final boolean d(int i10) {
        Object E = E();
        if ((E instanceof Integer) && i10 == ((Number) E).intValue()) {
            return false;
        }
        j0(Integer.valueOf(i10));
        return true;
    }

    public final boolean d0(x1 x1Var, Object obj) {
        a aVar = x1Var.f4808c;
        if (aVar == null) {
            return false;
        }
        int a6 = this.G.f4614a.a(aVar);
        if (!this.F || a6 < this.G.f4620g) {
            return false;
        }
        ArrayList arrayList = this.f4739s;
        int e10 = t.e(a6, arrayList);
        if (e10 < 0) {
            int i10 = -(e10 + 1);
            if (!(obj instanceof i0)) {
                obj = null;
            }
            arrayList.add(i10, new s0(x1Var, a6, obj));
            return true;
        }
        s0 s0Var = (s0) arrayList.get(e10);
        if (!(obj instanceof i0)) {
            s0Var.f4754c = null;
            return true;
        }
        Object obj2 = s0Var.f4754c;
        if (obj2 == null) {
            s0Var.f4754c = obj;
            return true;
        }
        if (obj2 instanceof s.h0) {
            ((s.h0) obj2).a(obj);
            return true;
        }
        int i11 = s.p0.f6316a;
        s.h0 h0Var = new s.h0(2);
        h0Var.i(obj2);
        h0Var.i(obj);
        s0Var.f4754c = h0Var;
        return true;
    }

    public final boolean e(long j3) {
        Object E = E();
        if ((E instanceof Long) && j3 == ((Number) E).longValue()) {
            return false;
        }
        j0(Long.valueOf(j3));
        return true;
    }

    public final void e0(s.g0 g0Var) {
        ArrayList arrayList = this.f4739s;
        for (int K = bc.n.K(arrayList); -1 < K; K--) {
            s0 s0Var = (s0) arrayList.get(K);
            a aVar = s0Var.f4752a.f4808c;
            if (aVar == null || !aVar.a()) {
                arrayList.remove(K);
            } else {
                int i10 = s0Var.f4753b;
                int i11 = aVar.f4509a;
                if (i10 != i11) {
                    s0Var.f4753b = i11;
                }
            }
        }
        Object[] objArr = g0Var.f6267b;
        Object[] objArr2 = g0Var.f6268c;
        long[] jArr = g0Var.f6266a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j3 = jArr[i12];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j3) < 128) {
                            int i15 = (i12 << 3) + i14;
                            Object obj = objArr[i15];
                            Object obj2 = objArr2[i15];
                            pc.j.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            x1 x1Var = (x1) obj;
                            a aVar2 = x1Var.f4808c;
                            if (aVar2 != null) {
                                int i16 = aVar2.f4509a;
                                if (obj2 == z0.f4843k) {
                                    obj2 = null;
                                }
                                arrayList.add(new s0(x1Var, i16, obj2));
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        bc.r.P(arrayList, t.f4762f);
    }

    public final boolean f(Object obj) {
        if (pc.j.a(E(), obj)) {
            return false;
        }
        j0(obj);
        return true;
    }

    public final void f0(int i10, int i11) {
        if (k0(i10) != i11) {
            if (i10 < 0) {
                s.s sVar = this.f4736p;
                if (sVar == null) {
                    sVar = new s.s();
                    this.f4736p = sVar;
                }
                sVar.f(i10, i11);
                return;
            }
            int[] iArr = this.f4735o;
            if (iArr == null) {
                int i12 = this.G.f4616c;
                int[] iArr2 = new int[i12];
                Arrays.fill(iArr2, 0, i12, -1);
                this.f4735o = iArr2;
                iArr = iArr2;
            }
            iArr[i10] = i11;
        }
    }

    public final boolean g(boolean z10) {
        Object E = E();
        if ((E instanceof Boolean) && z10 == ((Boolean) E).booleanValue()) {
            return false;
        }
        j0(Boolean.valueOf(z10));
        return true;
    }

    public final void g0(int i10, int i11) {
        int k02 = k0(i10);
        if (k02 != i11) {
            int i12 = i11 - k02;
            ArrayList arrayList = this.f4729i;
            int size = arrayList.size() - 1;
            while (i10 != -1) {
                int k03 = k0(i10) + i12;
                f0(i10, k03);
                int i13 = size;
                while (true) {
                    if (-1 < i13) {
                        q1 q1Var = (q1) arrayList.get(i13);
                        if (q1Var != null && q1Var.a(i10, k03)) {
                            size = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.G.f4622i;
                } else if (this.G.l(i10)) {
                    return;
                } else {
                    i10 = this.G.q(i10);
                }
            }
        }
    }

    public final boolean h(Object obj) {
        if (E() == obj) {
            return false;
        }
        j0(obj);
        return true;
    }

    public final u0.i h0(r1 r1Var, u0.i iVar) {
        u0.i iVar2 = (u0.i) r1Var;
        iVar2.getClass();
        u0.h hVar = new u0.h(iVar2);
        hVar.putAll(iVar);
        u0.i a6 = hVar.a();
        V(204, t.f4760d);
        E();
        j0(a6);
        E();
        j0(iVar);
        q(false);
        return a6;
    }

    public final void i() {
        this.f4730j = null;
        this.f4731k = 0;
        this.f4732l = 0;
        this.T = 0L;
        this.f4738r = false;
        n0.b bVar = this.M;
        bVar.f4982c = false;
        bVar.f4983d.f4748b = 0;
        bVar.f4985f = 0;
        bVar.f4984e = true;
        bVar.f4986g = 0;
        bVar.f4987h.clear();
        bVar.f4988i = -1;
        bVar.f4989j = -1;
        bVar.f4990k = -1;
        bVar.f4991l = 0;
        this.E.clear();
        this.f4735o = null;
        this.f4736p = null;
    }

    public final void i0(Object obj) {
        int i10;
        i2 i2Var;
        int i11;
        m2 m2Var;
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            a aVar = null;
            if (this.S) {
                m2 m2Var2 = this.I;
                int i12 = m2Var2.f4677t;
                if (i12 > m2Var2.f4679v + 1) {
                    int i13 = i12 - 1;
                    int D = m2Var2.D(m2Var2.f4659b, i13);
                    while (true) {
                        i11 = i13;
                        i13 = D;
                        m2Var = this.I;
                        if (i13 == m2Var.f4679v || i13 < 0) {
                            break;
                        } else {
                            D = m2Var.D(m2Var.f4659b, i13);
                        }
                    }
                    aVar = m2Var.b(i11);
                }
            } else {
                i2 i2Var2 = this.G;
                int i14 = i2Var2.f4620g;
                if (i14 > i2Var2.f4622i + 1) {
                    int i15 = i14 - 1;
                    int q10 = i2Var2.q(i15);
                    while (true) {
                        i10 = i15;
                        i15 = q10;
                        i2Var = this.G;
                        if (i15 == i2Var.f4622i || i15 < 0) {
                            break;
                        } else {
                            q10 = i2Var.q(i15);
                        }
                    }
                    aVar = i2Var.a(i10);
                }
            }
            f2 f2Var = new f2(e2Var, aVar);
            if (this.S) {
                n0.l0 l0Var = this.M.f4981b.f4978d;
                l0Var.N(n0.w.f5036c);
                a.a.J(l0Var, 0, f2Var);
            }
            this.f4724d.add(obj);
            obj = f2Var;
        }
        j0(obj);
    }

    public final Object j(u1 u1Var) {
        return z.t(l(), u1Var);
    }

    public final void j0(Object obj) {
        if (this.S) {
            m2 m2Var = this.I;
            if (m2Var.f4671n <= 0 || m2Var.f4666i == m2Var.f4668k) {
                m2Var.E(obj);
                return;
            }
            s.u uVar = m2Var.f4676s;
            if (uVar == null) {
                uVar = new s.u();
            }
            m2Var.f4676s = uVar;
            int i10 = m2Var.f4679v;
            Object b2 = uVar.b(i10);
            if (b2 == null) {
                b2 = new s.a0();
                uVar.h(i10, b2);
            }
            ((s.a0) b2).a(obj);
            return;
        }
        i2 i2Var = this.G;
        boolean z10 = i2Var.f4627n;
        n0.b bVar = this.M;
        if (!z10) {
            a a6 = i2Var.a(i2Var.f4622i);
            n0.l0 l0Var = bVar.f4981b.f4978d;
            l0Var.N(n0.e.f4998c);
            a.a.K(l0Var, 0, a6, 1, obj);
            return;
        }
        int c3 = (i2Var.f4625l - l2.c(i2Var.f4615b, i2Var.f4622i)) - 1;
        if (bVar.f4980a.G.f4622i - bVar.f4985f >= 0) {
            bVar.d(true);
            n0.l0 l0Var2 = bVar.f4981b.f4978d;
            l0Var2.N(n0.r.f5030g);
            a.a.J(l0Var2, 0, obj);
            l0Var2.f5018f[l0Var2.f5019g - l0Var2.f5016d[l0Var2.f5017e - 1].f5007a] = c3;
            return;
        }
        i2 i2Var2 = this.G;
        a a8 = i2Var2.a(i2Var2.f4622i);
        n0.l0 l0Var3 = bVar.f4981b.f4978d;
        l0Var3.N(n0.r.f5029f);
        a.a.K(l0Var3, 0, obj, 1, a8);
        l0Var3.f5018f[l0Var3.f5019g - l0Var3.f5016d[l0Var3.f5017e - 1].f5007a] = c3;
    }

    public final void k(oc.a aVar) {
        if (!this.f4738r) {
            t.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f4738r = false;
        if (!this.S) {
            t.c("createNode() can only be called when inserting");
        }
        r0 r0Var = this.f4734n;
        int i10 = r0Var.f4747a[r0Var.f4748b - 1];
        m2 m2Var = this.I;
        a b2 = m2Var.b(m2Var.f4679v);
        this.f4732l++;
        n0.c cVar = this.O;
        n0.l0 l0Var = cVar.f4993d;
        l0Var.N(n0.r.f5027d);
        a.a.J(l0Var, 0, aVar);
        l0Var.f5018f[l0Var.f5019g - l0Var.f5016d[l0Var.f5017e - 1].f5007a] = i10;
        a.a.J(l0Var, 1, b2);
        n0.l0 l0Var2 = cVar.f4994e;
        l0Var2.N(n0.r.f5028e);
        l0Var2.f5018f[l0Var2.f5019g - l0Var2.f5016d[l0Var2.f5017e - 1].f5007a] = i10;
        a.a.J(l0Var2, 0, b2);
    }

    public final int k0(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f4735o;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.G.o(i10) : i11;
        }
        s.s sVar = this.f4736p;
        if (sVar == null || sVar.c(i10) < 0) {
            return 0;
        }
        int c3 = sVar.c(i10);
        if (c3 >= 0) {
            return sVar.f6335c[c3];
        }
        t.a.e("Cannot find value for key " + i10);
        throw null;
    }

    public final r1 l() {
        r1 r1Var;
        r1 r1Var2 = this.K;
        if (r1Var2 != null) {
            return r1Var2;
        }
        int i10 = this.G.f4622i;
        boolean z10 = this.S;
        f1 f1Var = t.f4759c;
        if (z10 && this.J) {
            int i11 = this.I.f4679v;
            while (i11 > 0) {
                m2 m2Var = this.I;
                if (m2Var.f4659b[m2Var.r(i11) * 5] == 202 && pc.j.a(this.I.s(i11), f1Var)) {
                    Object q10 = this.I.q(i11);
                    pc.j.c(q10, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    r1 r1Var3 = (r1) q10;
                    this.K = r1Var3;
                    return r1Var3;
                }
                m2 m2Var2 = this.I;
                i11 = m2Var2.D(m2Var2.f4659b, i11);
            }
        }
        if (this.G.f4616c > 0) {
            while (i10 > 0) {
                if (this.G.i(i10) == 202) {
                    i2 i2Var = this.G;
                    if (pc.j.a(i2Var.p(i2Var.f4615b, i10), f1Var)) {
                        s.u uVar = this.f4742v;
                        if (uVar == null || (r1Var = (r1) uVar.b(i10)) == null) {
                            i2 i2Var2 = this.G;
                            Object b2 = i2Var2.b(i2Var2.f4615b, i10);
                            pc.j.c(b2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            r1Var = (r1) b2;
                        }
                        this.K = r1Var;
                        return r1Var;
                    }
                }
                i10 = this.G.q(i10);
            }
        }
        r1 r1Var4 = this.f4741u;
        this.K = r1Var4;
        return r1Var4;
    }

    public final void l0() {
        if (!this.f4738r) {
            t.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f4738r = false;
        if (this.S) {
            t.c("useNode() called while inserting");
        }
        i2 i2Var = this.G;
        Object n7 = i2Var.n(i2Var.f4622i);
        n0.b bVar = this.M;
        bVar.c();
        bVar.f4987h.add(n7);
        if (this.f4745y && (n7 instanceof j)) {
            bVar.b();
            bVar.f4981b.f4978d.N(n0.h0.f5005c);
        }
    }

    public final List m() {
        boolean z10 = this.C;
        List list = bc.v.f1067g;
        if (!z10) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        m2 m2Var = this.I;
        arrayList.addAll(u2.b.h(m2Var, null, m2Var.f4677t, null));
        i2 i2Var = this.G;
        if (!i2Var.f4619f && i2Var.f4616c != 0) {
            x0.h hVar = new x0.h(i2Var);
            int i10 = i2Var.f4622i;
            Object valueOf = Integer.valueOf(i2Var.f4625l - l2.c(i2Var.f4615b, i10));
            while (i10 >= 0) {
                hVar.c(i2Var.f4614a.f(i10), valueOf);
                valueOf = i2Var.a(i10);
                i10 = i2Var.q(i10);
            }
            list = (ArrayList) hVar.f1234a;
        }
        arrayList.addAll(list);
        arrayList.addAll(F());
        return arrayList;
    }

    public final void n(boolean z10) {
        if (this.f4732l != 0) {
            t.c("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.S) {
            return;
        }
        if (!z10) {
            R();
            return;
        }
        i2 i2Var = this.G;
        int i10 = i2Var.f4620g;
        int i11 = i2Var.f4621h;
        n0.b bVar = this.M;
        bVar.getClass();
        bVar.d(false);
        bVar.f4981b.f4978d.N(n0.i.f5006c);
        t.a(this.f4739s, i10, i11);
        this.G.t();
    }

    public final void o(s.g0 g0Var, oc.e eVar) {
        ArrayList arrayList = this.f4739s;
        if (this.F) {
            t.c("Reentrant composition is not supported");
        }
        this.f4727g.n();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(w0.m.k().g());
            this.f4742v = null;
            e0(g0Var);
            this.f4731k = 0;
            this.F = true;
            try {
                c0();
                Object E = E();
                if (E != eVar && eVar != null) {
                    j0(eVar);
                }
                q qVar = this.D;
                o0.e m10 = z.m();
                try {
                    m10.b(qVar);
                    f1 f1Var = t.f4757a;
                    if (eVar != null) {
                        V(200, f1Var);
                        u0.e.d(this, eVar);
                        q(false);
                    } else if (!this.f4743w || E == null || E.equals(l.f4646a)) {
                        Q();
                    } else {
                        V(200, f1Var);
                        pc.v.c(2, E);
                        u0.e.d(this, (oc.e) E);
                        q(false);
                    }
                    m10.k(m10.f5136i - 1);
                    v();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f4680w) {
                        t.c("Check failed");
                    }
                    x();
                } catch (Throwable th) {
                    m10.k(m10.f5136i - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void p(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        p(this.G.q(i10), i11);
        if (this.G.l(i10)) {
            Object n7 = this.G.n(i10);
            n0.b bVar = this.M;
            bVar.c();
            bVar.f4987h.add(n7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05c0  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z10) {
        long rotateRight;
        r0 r0Var;
        ArrayList arrayList;
        int i10;
        boolean z11;
        int i11;
        i2 i2Var;
        q1 q1Var;
        ?? r32;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        r0 r0Var2;
        int i17;
        int i18;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet;
        int i19;
        int i20;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i21;
        q1 q1Var2;
        int i22;
        Object[] objArr;
        long[] jArr;
        int i23;
        Object[] objArr2;
        long[] jArr2;
        int i24;
        Object[] objArr3;
        long[] jArr3;
        int i25;
        Object[] objArr4;
        long[] jArr4;
        long rotateRight2;
        r0 r0Var3 = this.f4734n;
        int i26 = r0Var3.f4747a[r0Var3.f4748b - 2] - 1;
        boolean z12 = this.S;
        z0 z0Var = l.f4646a;
        if (z12) {
            m2 m2Var = this.I;
            int i27 = m2Var.f4679v;
            int i28 = m2Var.f4659b[m2Var.r(i27) * 5];
            Object s10 = this.I.s(i27);
            Object q10 = this.I.q(i27);
            if (s10 != null) {
                rotateRight2 = Long.rotateRight(this.T ^ 0, 3) ^ (s10 instanceof Enum ? ((Enum) s10).ordinal() : s10.hashCode());
            } else if (q10 == null || i28 != 207 || q10.equals(z0Var)) {
                rotateRight2 = Long.rotateRight(this.T ^ i26, 3) ^ i28;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i26, 3) ^ q10.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight2, 3);
        } else {
            i2 i2Var2 = this.G;
            int i29 = i2Var2.f4622i;
            int i30 = i2Var2.i(i29);
            i2 i2Var3 = this.G;
            Object p8 = i2Var3.p(i2Var3.f4615b, i29);
            i2 i2Var4 = this.G;
            Object b2 = i2Var4.b(i2Var4.f4615b, i29);
            if (p8 != null) {
                rotateRight = Long.rotateRight(this.T ^ 0, 3) ^ (p8 instanceof Enum ? ((Enum) p8).ordinal() : p8.hashCode());
            } else if (b2 == null || i30 != 207 || b2.equals(z0Var)) {
                rotateRight = Long.rotateRight(this.T ^ i26, 3) ^ i30;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i26, 3) ^ b2.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight, 3);
        }
        int i31 = this.f4732l;
        q1 q1Var3 = this.f4730j;
        ArrayList arrayList5 = this.f4739s;
        n0.b bVar = this.M;
        if (q1Var3 != null) {
            s.u uVar = q1Var3.f4718e;
            int i32 = q1Var3.f4715b;
            ArrayList arrayList6 = q1Var3.f4714a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = q1Var3.f4717d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i33 = 0; i33 < size; i33++) {
                    hashSet2.add(arrayList7.get(i33));
                }
                i10 = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                while (i34 < size3) {
                    v0 v0Var = (v0) arrayList6.get(i34);
                    if (hashSet2.contains(v0Var)) {
                        r0Var2 = r0Var3;
                        i17 = i34;
                        if (!linkedHashSet2.contains(v0Var)) {
                            int i37 = i35;
                            if (i37 < size2) {
                                v0 v0Var2 = (v0) arrayList7.get(i37);
                                if (v0Var2 != v0Var) {
                                    o0 o0Var = (o0) uVar.b(v0Var2.f4782c);
                                    int i38 = o0Var != null ? o0Var.f4690b : -1;
                                    linkedHashSet2.add(v0Var2);
                                    i18 = i37;
                                    i21 = i36;
                                    q1Var2 = q1Var3;
                                    if (i38 != i21) {
                                        o0 o0Var2 = (o0) uVar.b(v0Var2.f4782c);
                                        int i39 = o0Var2 != null ? o0Var2.f4691c : v0Var2.f4783d;
                                        linkedHashSet = linkedHashSet2;
                                        int i40 = i38 + i32;
                                        i19 = size2;
                                        int i41 = i21 + i32;
                                        if (i39 > 0) {
                                            i20 = i32;
                                            int i42 = bVar.f4991l;
                                            if (i42 > 0) {
                                                arrayList3 = arrayList6;
                                                if (bVar.f4989j == i40 - i42 && bVar.f4990k == i41 - i42) {
                                                    bVar.f4991l = i42 + i39;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            bVar.c();
                                            bVar.f4989j = i40;
                                            bVar.f4990k = i41;
                                            bVar.f4991l = i39;
                                        } else {
                                            i20 = i32;
                                            arrayList3 = arrayList6;
                                            bVar.getClass();
                                        }
                                        if (i38 > i21) {
                                            Object[] objArr5 = uVar.f6297c;
                                            long[] jArr5 = uVar.f6295a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i43 = 0;
                                                while (true) {
                                                    long j3 = jArr5[i43];
                                                    int i44 = i39;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i45 = 8 - ((~(i43 - length)) >>> 31);
                                                        int i46 = 0;
                                                        while (i46 < i45) {
                                                            if ((j3 & 255) < 128) {
                                                                i25 = i46;
                                                                o0 o0Var3 = (o0) objArr5[(i43 << 3) + i46];
                                                                objArr4 = objArr5;
                                                                int i47 = o0Var3.f4690b;
                                                                jArr4 = jArr5;
                                                                if (i38 <= i47 && i47 < i38 + i44) {
                                                                    o0Var3.f4690b = (i47 - i38) + i21;
                                                                } else if (i21 <= i47 && i47 < i38) {
                                                                    o0Var3.f4690b = i47 + i44;
                                                                }
                                                            } else {
                                                                i25 = i46;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j3 >>= 8;
                                                            i46 = i25 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i45 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i43 == length) {
                                                        break;
                                                    }
                                                    i43++;
                                                    arrayList5 = arrayList2;
                                                    i39 = i44;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i48 = i39;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i21 > i38) {
                                                Object[] objArr6 = uVar.f6297c;
                                                long[] jArr6 = uVar.f6295a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i49 = 0;
                                                    while (true) {
                                                        long j6 = jArr6[i49];
                                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i50 = 8 - ((~(i49 - length2)) >>> 31);
                                                            int i51 = 0;
                                                            while (i51 < i50) {
                                                                if ((j6 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    o0 o0Var4 = (o0) objArr6[(i49 << 3) + i51];
                                                                    jArr2 = jArr6;
                                                                    int i52 = o0Var4.f4690b;
                                                                    i24 = i38;
                                                                    if (i38 <= i52 && i52 < i24 + i48) {
                                                                        o0Var4.f4690b = (i52 - i24) + i21;
                                                                    } else if (i24 + 1 <= i52 && i52 < i21) {
                                                                        o0Var4.f4690b = i52 - i48;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i24 = i38;
                                                                }
                                                                j6 >>= 8;
                                                                i51++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i38 = i24;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i23 = i38;
                                                            if (i50 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i23 = i38;
                                                        }
                                                        if (i49 == length2) {
                                                            break;
                                                        }
                                                        i49++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i38 = i23;
                                                    }
                                                }
                                            }
                                        }
                                        i22 = i17;
                                    } else {
                                        arrayList2 = arrayList5;
                                        linkedHashSet = linkedHashSet2;
                                        i19 = size2;
                                        i20 = i32;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i22 = i17;
                                } else {
                                    i18 = i37;
                                    arrayList2 = arrayList5;
                                    linkedHashSet = linkedHashSet2;
                                    i19 = size2;
                                    i20 = i32;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i21 = i36;
                                    q1Var2 = q1Var3;
                                    i22 = i17 + 1;
                                }
                                i35 = i18 + 1;
                                o0 o0Var5 = (o0) uVar.b(v0Var2.f4782c);
                                int i53 = i21 + (o0Var5 != null ? o0Var5.f4691c : v0Var2.f4783d);
                                i34 = i22;
                                q1Var3 = q1Var2;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i19;
                                i32 = i20;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i36 = i53;
                                r0Var3 = r0Var2;
                            } else {
                                i35 = i37;
                                r0Var3 = r0Var2;
                                i34 = i17;
                            }
                        }
                    } else {
                        r0Var2 = r0Var3;
                        o0 o0Var6 = (o0) uVar.b(v0Var.f4782c);
                        int i54 = o0Var6 != null ? o0Var6.f4690b : -1;
                        int i55 = v0Var.f4782c;
                        i17 = i34;
                        bVar.e(i54 + i32, v0Var.f4783d);
                        q1Var3.a(i55, 0);
                        bVar.f4985f = (i55 - bVar.f4980a.G.f4620g) + bVar.f4985f;
                        this.G.r(i55);
                        J();
                        this.G.s();
                        t.a(arrayList5, i55, this.G.f4615b[(i55 * 5) + 3] + i55);
                    }
                    i34 = i17 + 1;
                    r0Var3 = r0Var2;
                }
                r0Var = r0Var3;
                arrayList = arrayList5;
                bVar.c();
                if (arrayList6.size() > 0) {
                    i2 i2Var5 = this.G;
                    bVar.f4985f = (i2Var5.f4621h - bVar.f4980a.G.f4620g) + bVar.f4985f;
                    i2Var5.t();
                }
                z11 = this.S;
                if (!z11) {
                    i2 i2Var6 = this.G;
                    int i56 = i2Var6.f4626m - i2Var6.f4625l;
                    if (i56 > 0) {
                        if (i56 > 0) {
                            bVar.d(false);
                            r0 r0Var4 = bVar.f4983d;
                            i2 i2Var7 = bVar.f4980a.G;
                            if (i2Var7.f4616c > 0 && r0Var4.a(-2) != (i16 = i2Var7.f4622i)) {
                                if (!bVar.f4982c && bVar.f4984e) {
                                    bVar.d(false);
                                    bVar.f4981b.f4978d.N(n0.q.f5026c);
                                    bVar.f4982c = true;
                                }
                                if (i16 > 0) {
                                    a a6 = i2Var7.a(i16);
                                    r0Var4.c(i16);
                                    bVar.d(false);
                                    n0.l0 l0Var = bVar.f4981b.f4978d;
                                    l0Var.N(n0.p.f5025c);
                                    a.a.J(l0Var, 0, a6);
                                    bVar.f4982c = true;
                                }
                            }
                            n0.l0 l0Var2 = bVar.f4981b.f4978d;
                            l0Var2.N(n0.d0.f4997c);
                            l0Var2.f5018f[l0Var2.f5019g - l0Var2.f5016d[l0Var2.f5017e - 1].f5007a] = i56;
                        } else {
                            bVar.getClass();
                        }
                    }
                }
                i11 = this.f4731k;
                while (true) {
                    i2Var = this.G;
                    if (i2Var.f4624k > 0 && (i15 = i2Var.f4620g) != i2Var.f4621h) {
                        J();
                        bVar.e(i11, this.G.s());
                        t.a(arrayList, i15, this.G.f4620g);
                    }
                }
                if (z11) {
                    if (z10) {
                        bVar.a();
                    }
                    int i57 = bVar.f4980a.G.f4622i;
                    r0 r0Var5 = bVar.f4983d;
                    int i58 = i10;
                    if (r0Var5.a(i58) > i57) {
                        t.c("Missed recording an endGroup");
                    }
                    if (r0Var5.a(i58) == i57) {
                        bVar.d(false);
                        r0Var5.b();
                        bVar.f4981b.f4978d.N(n0.m.f5022c);
                    }
                    int i59 = this.G.f4622i;
                    if (i31 != k0(i59)) {
                        g0(i59, i31);
                    }
                    if (z10) {
                        i31 = 1;
                    }
                    this.G.e();
                    bVar.c();
                } else {
                    if (z10) {
                        n0.c cVar = this.O;
                        n0.l0 l0Var3 = cVar.f4994e;
                        if (!l0Var3.M()) {
                            t.c("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        n0.l0 l0Var4 = cVar.f4993d;
                        n0.i0[] i0VarArr = l0Var3.f5016d;
                        int i60 = l0Var3.f5017e - 1;
                        l0Var3.f5017e = i60;
                        n0.i0 i0Var = i0VarArr[i60];
                        i0VarArr[i60] = null;
                        l0Var4.N(i0Var);
                        Object[] objArr7 = l0Var3.f5020h;
                        Object[] objArr8 = l0Var4.f5020h;
                        int i61 = l0Var4.f5021i;
                        int i62 = i0Var.f5008b;
                        int i63 = l0Var3.f5021i;
                        int i64 = i63 - i62;
                        System.arraycopy(objArr7, i64, objArr8, i61 - i62, i63 - i64);
                        Object[] objArr9 = l0Var3.f5020h;
                        int i65 = l0Var3.f5021i;
                        Arrays.fill(objArr9, i65 - i62, i65, (Object) null);
                        int[] iArr = l0Var3.f5018f;
                        int[] iArr2 = l0Var4.f5018f;
                        int i66 = l0Var4.f5019g;
                        int i67 = i0Var.f5007a;
                        int i68 = l0Var3.f5019g;
                        bc.l.P(i66 - i67, i68 - i67, i68, iArr, iArr2);
                        l0Var3.f5021i -= i62;
                        l0Var3.f5019g -= i67;
                        i31 = 1;
                    }
                    if (this.G.f4624k <= 0) {
                        s1.a("Unbalanced begin/end empty");
                    }
                    r4.f4624k--;
                    m2 m2Var2 = this.I;
                    int i69 = m2Var2.f4679v;
                    m2Var2.j();
                    if (this.G.f4624k <= 0) {
                        int i70 = (-2) - i69;
                        this.I.k();
                        this.I.e(true);
                        a aVar = this.N;
                        if (this.O.f4993d.L()) {
                            j2 j2Var = this.H;
                            bVar.b();
                            bVar.d(false);
                            r0 r0Var6 = bVar.f4983d;
                            i2 i2Var8 = bVar.f4980a.G;
                            if (i2Var8.f4616c > 0 && r0Var6.a(-2) != (i14 = i2Var8.f4622i)) {
                                if (!bVar.f4982c && bVar.f4984e) {
                                    bVar.d(false);
                                    bVar.f4981b.f4978d.N(n0.q.f5026c);
                                    bVar.f4982c = true;
                                }
                                if (i14 > 0) {
                                    a a8 = i2Var8.a(i14);
                                    r0Var6.c(i14);
                                    bVar.d(false);
                                    n0.l0 l0Var5 = bVar.f4981b.f4978d;
                                    l0Var5.N(n0.p.f5025c);
                                    a.a.J(l0Var5, 0, a8);
                                    i13 = 1;
                                    bVar.f4982c = true;
                                    bVar.c();
                                    n0.l0 l0Var6 = bVar.f4981b.f4978d;
                                    l0Var6.N(n0.s.f5032c);
                                    a.a.K(l0Var6, 0, aVar, i13, j2Var);
                                    r32 = 0;
                                }
                            }
                            i13 = 1;
                            bVar.c();
                            n0.l0 l0Var62 = bVar.f4981b.f4978d;
                            l0Var62.N(n0.s.f5032c);
                            a.a.K(l0Var62, 0, aVar, i13, j2Var);
                            r32 = 0;
                        } else {
                            j2 j2Var2 = this.H;
                            n0.c cVar2 = this.O;
                            bVar.b();
                            bVar.d(false);
                            r0 r0Var7 = bVar.f4983d;
                            i2 i2Var9 = bVar.f4980a.G;
                            if (i2Var9.f4616c > 0 && r0Var7.a(-2) != (i12 = i2Var9.f4622i)) {
                                if (!bVar.f4982c && bVar.f4984e) {
                                    bVar.d(false);
                                    bVar.f4981b.f4978d.N(n0.q.f5026c);
                                    bVar.f4982c = true;
                                }
                                if (i12 > 0) {
                                    a a10 = i2Var9.a(i12);
                                    r0Var7.c(i12);
                                    bVar.d(false);
                                    n0.l0 l0Var7 = bVar.f4981b.f4978d;
                                    l0Var7.N(n0.p.f5025c);
                                    a.a.J(l0Var7, 0, a10);
                                    bVar.f4982c = true;
                                }
                            }
                            bVar.c();
                            n0.l0 l0Var8 = bVar.f4981b.f4978d;
                            l0Var8.N(n0.t.f5033c);
                            int i71 = l0Var8.f5021i - l0Var8.f5016d[l0Var8.f5017e - 1].f5008b;
                            Object[] objArr10 = l0Var8.f5020h;
                            objArr10[i71] = aVar;
                            objArr10[i71 + 1] = j2Var2;
                            objArr10[i71 + 2] = cVar2;
                            this.O = new n0.c();
                            r32 = 0;
                        }
                        this.S = r32;
                        if (this.f4723c.f4632h != 0) {
                            f0(i70, r32);
                            g0(i70, i31);
                        }
                    }
                }
                q1Var = (q1) this.f4729i.remove(r3.size() - 1);
                if (q1Var != null && !z11) {
                    q1Var.f4716c++;
                }
                this.f4730j = q1Var;
                this.f4731k = r0Var.b() + i31;
                this.f4733m = r0Var.b();
                this.f4732l = r0Var.b() + i31;
            }
        }
        r0Var = r0Var3;
        arrayList = arrayList5;
        i10 = -1;
        z11 = this.S;
        if (!z11) {
        }
        i11 = this.f4731k;
        while (true) {
            i2Var = this.G;
            if (i2Var.f4624k > 0) {
                break;
            }
            J();
            bVar.e(i11, this.G.s());
            t.a(arrayList, i15, this.G.f4620g);
        }
        if (z11) {
        }
        q1Var = (q1) this.f4729i.remove(r3.size() - 1);
        if (q1Var != null) {
            q1Var.f4716c++;
        }
        this.f4730j = q1Var;
        this.f4731k = r0Var.b() + i31;
        this.f4733m = r0Var.b();
        this.f4732l = r0Var.b() + i31;
    }

    public final void r() {
        q(false);
        x1 y10 = y();
        if (y10 != null) {
            int i10 = y10.f4807b;
            if ((i10 & 1) != 0) {
                y10.f4807b = i10 | 2;
            }
        }
    }

    public final x1 s() {
        x1 x1Var;
        a a6;
        w1 w1Var;
        ArrayList arrayList = this.E;
        x1 x1Var2 = !arrayList.isEmpty() ? (x1) arrayList.remove(arrayList.size() - 1) : null;
        if (x1Var2 != null) {
            x1Var2.f4807b &= -9;
            this.f4727g.n();
            int i10 = this.B;
            s.z zVar = x1Var2.f4811f;
            if (zVar != null && (x1Var2.f4807b & 16) == 0) {
                Object[] objArr = zVar.f6363b;
                int[] iArr = zVar.f6364c;
                long[] jArr = zVar.f6362a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    loop0: while (true) {
                        long j3 = jArr[i11];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j3 & 255) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    Object obj = objArr[i14];
                                    if (iArr[i14] != i10) {
                                        w1Var = new w1(i10, 0, x1Var2, zVar);
                                        break loop0;
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
                        }
                        i11++;
                    }
                }
            }
            w1Var = null;
            n0.b bVar = this.M;
            if (w1Var != null) {
                n0.l0 l0Var = bVar.f4981b.f4978d;
                l0Var.N(n0.l.f5015c);
                a.a.K(l0Var, 0, w1Var, 1, this.f4728h);
            }
            int i15 = x1Var2.f4807b;
            if ((i15 & 512) != 0) {
                x1Var2.f4807b = i15 & (-513);
                n0.l0 l0Var2 = bVar.f4981b.f4978d;
                l0Var2.N(n0.o.f5024c);
                a.a.J(l0Var2, 0, x1Var2);
                int i16 = x1Var2.f4807b;
                x1Var2.f4807b = i16 & (-129);
                if ((i16 & 1024) != 0) {
                    x1Var2.f4807b = i16 & (-1153);
                    this.f4745y = false;
                }
            }
        }
        if (x1Var2 != null) {
            int i17 = x1Var2.f4807b;
            if ((i17 & 16) == 0 && ((i17 & 1) != 0 || this.f4737q)) {
                if (x1Var2.f4808c == null) {
                    if (this.S) {
                        m2 m2Var = this.I;
                        a6 = m2Var.b(m2Var.f4679v);
                    } else {
                        i2 i2Var = this.G;
                        a6 = i2Var.a(i2Var.f4622i);
                    }
                    x1Var2.f4808c = a6;
                }
                x1Var2.f4807b &= -5;
                x1Var = x1Var2;
                q(false);
                return x1Var;
            }
        }
        x1Var = null;
        q(false);
        return x1Var;
    }

    public final void t() {
        if (this.f4745y && this.G.f4622i == this.f4746z) {
            this.f4746z = -1;
            this.f4745y = false;
        }
        q(false);
    }

    public final void u() {
        if (this.F || this.f4746z != 100) {
            s1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f4746z = -1;
        this.f4745y = false;
    }

    public final void v() {
        q(false);
        this.f4722b.b();
        q(false);
        n0.b bVar = this.M;
        if (bVar.f4982c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f4981b.f4978d.N(n0.m.f5022c);
            bVar.f4982c = false;
        }
        bVar.b();
        if (bVar.f4983d.f4748b != 0) {
            t.c("Missed recording an endGroup()");
        }
        if (!this.f4729i.isEmpty()) {
            t.c("Start/end imbalance");
        }
        i();
        this.G.c();
        this.f4743w = this.f4744x.b() != 0;
    }

    public final void w(boolean z10, q1 q1Var) {
        this.f4729i.add(this.f4730j);
        this.f4730j = q1Var;
        int i10 = this.f4732l;
        r0 r0Var = this.f4734n;
        r0Var.c(i10);
        r0Var.c(this.f4733m);
        r0Var.c(this.f4731k);
        if (z10) {
            this.f4731k = 0;
        }
        this.f4732l = 0;
        this.f4733m = 0;
    }

    public final void x() {
        j2 j2Var = new j2();
        if (this.C) {
            j2Var.b();
        }
        if (this.f4722b.c()) {
            j2Var.f4641q = new s.u();
        }
        this.H = j2Var;
        m2 d10 = j2Var.d();
        d10.e(true);
        this.I = d10;
    }

    public final x1 y() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (x1) arrayList.get(arrayList.size() - 1);
    }

    public final boolean z() {
        if (!B() || this.f4743w) {
            return true;
        }
        x1 y10 = y();
        return (y10 == null || (y10.f4807b & 4) == 0) ? false : true;
    }
}
