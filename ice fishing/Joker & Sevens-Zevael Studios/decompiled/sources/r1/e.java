package r1;

import java.util.ArrayList;
import java.util.List;
import s.a0;
import x1.f1;
import x1.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public final y0.m f5944c;

    /* renamed from: d, reason: collision with root package name */
    public final e3.j f5945d;

    /* renamed from: e, reason: collision with root package name */
    public final s.o f5946e;

    /* renamed from: f, reason: collision with root package name */
    public f1 f5947f;

    /* renamed from: g, reason: collision with root package name */
    public g f5948g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5949h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5950i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5951j;

    public e(y0.m mVar) {
        this.f5944c = mVar;
        e3.j jVar = new e3.j(3);
        jVar.f2092c = new long[2];
        this.f5945d = jVar;
        this.f5946e = new s.o(2);
        this.f5950i = true;
        this.f5951j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r5v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // r1.f
    public final boolean a(s.o oVar, v1.p pVar, x4.c cVar, boolean z10) {
        s.o oVar2;
        e3.j jVar;
        Object obj;
        boolean z11;
        boolean z12;
        g gVar;
        int i10;
        int i11;
        boolean z13;
        int i12;
        boolean z14;
        int i13;
        List list;
        n nVar;
        v1.p pVar2 = pVar;
        boolean a6 = super.a(oVar, pVar, cVar, z10);
        x1.m mVar = this.f5944c;
        boolean z15 = true;
        if (mVar.f8456t) {
            ?? r82 = 0;
            while (mVar != 0) {
                if (mVar instanceof r1) {
                    this.f5947f = x1.f.t((r1) mVar, 16);
                } else if ((mVar.f8445i & 16) != 0 && (mVar instanceof x1.m)) {
                    y0.m mVar2 = mVar.f8110v;
                    int i14 = 0;
                    mVar = mVar;
                    r82 = r82;
                    while (mVar2 != null) {
                        if ((mVar2.f8445i & 16) != 0) {
                            i14++;
                            r82 = r82;
                            if (i14 == 1) {
                                mVar = mVar2;
                            } else {
                                if (r82 == 0) {
                                    r82 = new o0.e(new y0.m[16]);
                                }
                                if (mVar != 0) {
                                    r82.b(mVar);
                                    mVar = 0;
                                }
                                r82.b(mVar2);
                            }
                        }
                        mVar2 = mVar2.f8448l;
                        mVar = mVar;
                        r82 = r82;
                    }
                    if (i14 == 1) {
                    }
                }
                mVar = x1.f.f(r82);
            }
            if (this.f5947f != null) {
                int d10 = oVar.d();
                int i15 = 0;
                while (true) {
                    oVar2 = this.f5946e;
                    jVar = this.f5945d;
                    if (i15 >= d10) {
                        break;
                    }
                    long a8 = oVar.a(i15);
                    n nVar2 = (n) oVar.e(i15);
                    if (jVar.c(a8)) {
                        boolean z16 = z15;
                        long j3 = nVar2.f5969g;
                        List list2 = nVar2.f5973k;
                        long j6 = nVar2.f5965c;
                        if ((((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j6 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z14 = z16;
                            List list3 = bc.v.f1067g;
                            z13 = a6;
                            ArrayList arrayList = new ArrayList((list2 == null ? list3 : list2).size());
                            if (list2 == null) {
                                list2 = list3;
                            }
                            int size = list2.size();
                            i12 = d10;
                            int i16 = 0;
                            while (i16 < size) {
                                int i17 = size;
                                b bVar = (b) list2.get(i16);
                                long j10 = a8;
                                List list4 = list2;
                                long j11 = bVar.f5928b;
                                if ((((j11 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    list = list4;
                                    nVar = nVar2;
                                    long j12 = bVar.f5927a;
                                    i13 = i16;
                                    f1 f1Var = this.f5947f;
                                    pc.j.b(f1Var);
                                    arrayList.add(new b(j12, f1Var.K0(pVar2, j11), bVar.f5929c));
                                } else {
                                    i13 = i16;
                                    list = list4;
                                    nVar = nVar2;
                                }
                                i16 = i13 + 1;
                                list2 = list;
                                size = i17;
                                a8 = j10;
                                nVar2 = nVar;
                            }
                            long j13 = a8;
                            f1 f1Var2 = this.f5947f;
                            pc.j.b(f1Var2);
                            long K0 = f1Var2.K0(pVar2, j3);
                            f1 f1Var3 = this.f5947f;
                            pc.j.b(f1Var3);
                            n nVar3 = new n(nVar2.f5963a, nVar2.f5964b, f1Var3.K0(pVar2, j6), nVar2.f5966d, nVar2.f5967e, nVar2.f5968f, K0, nVar2.f5970h, nVar2.f5971i, arrayList, nVar2.f5972j, nVar2.f5974l);
                            n nVar4 = nVar2.f5977o;
                            if (nVar4 == null) {
                                nVar4 = nVar2;
                            }
                            nVar3.f5977o = nVar4;
                            n nVar5 = nVar2.f5977o;
                            if (nVar5 != null) {
                                nVar2 = nVar5;
                            }
                            nVar3.f5977o = nVar2;
                            oVar2.b(j13, nVar3);
                        } else {
                            z13 = a6;
                            i12 = d10;
                            z14 = z16;
                        }
                    } else {
                        z13 = a6;
                        i12 = d10;
                        z14 = z15;
                    }
                    i15++;
                    pVar2 = pVar;
                    z15 = z14;
                    d10 = i12;
                    a6 = z13;
                }
                boolean z17 = a6;
                boolean z18 = z15;
                if (oVar2.d() == 0) {
                    jVar.f2091b = 0;
                    this.f5952a.g();
                    return z18;
                }
                int i18 = jVar.f2091b;
                while (true) {
                    i18--;
                    if (-1 >= i18) {
                        break;
                    }
                    long j14 = ((long[]) jVar.f2092c)[i18];
                    if (oVar.f6308g) {
                        int i19 = oVar.f6311j;
                        long[] jArr = oVar.f6309h;
                        Object[] objArr = oVar.f6310i;
                        int i20 = 0;
                        for (int i21 = 0; i21 < i19; i21++) {
                            Object obj2 = objArr[i21];
                            if (obj2 != s.p.f6313a) {
                                if (i21 != i20) {
                                    jArr[i20] = jArr[i21];
                                    objArr[i20] = obj2;
                                    objArr[i21] = null;
                                }
                                i20++;
                            }
                        }
                        oVar.f6308g = false;
                        oVar.f6311j = i20;
                    }
                    if (t.a.b(oVar.f6309h, oVar.f6311j, j14) < 0 && i18 < (i11 = jVar.f2091b)) {
                        int i22 = i11 - 1;
                        int i23 = i18;
                        while (i23 < i22) {
                            long[] jArr2 = (long[]) jVar.f2092c;
                            int i24 = i23 + 1;
                            jArr2[i23] = jArr2[i24];
                            i23 = i24;
                        }
                        jVar.f2091b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(oVar2.d());
                int d11 = oVar2.d();
                for (int i25 = 0; i25 < d11; i25++) {
                    arrayList2.add(oVar2.e(i25));
                }
                g gVar2 = new g(arrayList2, cVar);
                int size2 = arrayList2.size();
                int i26 = 0;
                while (true) {
                    if (i26 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i26);
                    if (cVar.b(((n) obj).f5963a)) {
                        break;
                    }
                    i26++;
                }
                n nVar6 = (n) obj;
                if (nVar6 != null) {
                    boolean z19 = nVar6.f5966d;
                    if (z10) {
                        z11 = false;
                        if (!this.f5950i && (z19 || nVar6.f5970h)) {
                            f1 f1Var4 = this.f5947f;
                            pc.j.b(f1Var4);
                            long j15 = f1Var4.f7087i;
                            long j16 = nVar6.f5965c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j16 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j16 & 4294967295L));
                            int i27 = (int) (j15 >> 32);
                            this.f5950i = !((intBitsToFloat2 > ((float) ((int) (j15 & 4294967295L))) ? z18 : false) | (intBitsToFloat2 < 0.0f ? z18 : false) | (intBitsToFloat > ((float) i27) ? z18 : false) | (intBitsToFloat < 0.0f ? z18 : false));
                        }
                    } else {
                        z11 = false;
                        this.f5950i = false;
                    }
                    boolean z20 = this.f5950i;
                    boolean z21 = this.f5949h;
                    if (z20 == z21 || !((i10 = gVar2.f5955b) == 3 || i10 == 4 || i10 == 5)) {
                        int i28 = gVar2.f5955b;
                        if (i28 == 4 && z21 && !this.f5951j) {
                            gVar2.f5955b = 3;
                        } else if (i28 == 5 && z20 && z19) {
                            gVar2.f5955b = 3;
                        }
                    } else {
                        gVar2.f5955b = z20 ? 4 : 5;
                    }
                } else {
                    z11 = false;
                }
                if (!z17 && gVar2.f5955b == 3 && (gVar = this.f5948g) != null) {
                    ?? r12 = gVar.f5954a;
                    int size3 = r12.size();
                    ?? r42 = gVar2.f5954a;
                    if (size3 == r42.size()) {
                        int size4 = r42.size();
                        for (?? r5 = z11; r5 < size4; r5++) {
                            if (e1.b.b(((n) r12.get(r5)).f5965c, ((n) r42.get(r5)).f5965c)) {
                            }
                        }
                        z12 = z11;
                        this.f5948g = gVar2;
                        return z12;
                    }
                }
                z12 = z18;
                this.f5948g = gVar2;
                return z12;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // r1.f
    public final void b(x4.c cVar) {
        super.b(cVar);
        g gVar = this.f5948g;
        if (gVar == null) {
            return;
        }
        this.f5949h = this.f5950i;
        ?? r12 = gVar.f5954a;
        int size = r12.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) r12.get(i10);
            boolean z10 = nVar.f5966d;
            long j3 = nVar.f5963a;
            boolean b2 = cVar.b(j3);
            boolean z11 = this.f5950i;
            if ((!z10 && !b2) || (!z10 && !z11)) {
                this.f5945d.e(j3);
            }
        }
        this.f5950i = false;
        this.f5951j = gVar.f5955b == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [o0.e] */
    public final void c() {
        o0.e eVar = this.f5952a;
        Object[] objArr = eVar.f5134g;
        int i10 = eVar.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            ((e) objArr[i11]).c();
        }
        x1.m mVar = this.f5944c;
        ?? r32 = 0;
        while (mVar != 0) {
            if (mVar instanceof r1) {
                ((r1) mVar).P();
            } else if ((mVar.f8445i & 16) != 0 && (mVar instanceof x1.m)) {
                y0.m mVar2 = mVar.f8110v;
                int i12 = 0;
                mVar = mVar;
                r32 = r32;
                while (mVar2 != null) {
                    if ((mVar2.f8445i & 16) != 0) {
                        i12++;
                        r32 = r32;
                        if (i12 == 1) {
                            mVar = mVar2;
                        } else {
                            if (r32 == 0) {
                                r32 = new o0.e(new y0.m[16]);
                            }
                            if (mVar != 0) {
                                r32.b(mVar);
                                mVar = 0;
                            }
                            r32.b(mVar2);
                        }
                    }
                    mVar2 = mVar2.f8448l;
                    mVar = mVar;
                    r32 = r32;
                }
                if (i12 == 1) {
                }
            }
            mVar = x1.f.f(r32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008d A[LOOP:0: B:5:0x008b->B:6:0x008d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(x4.c cVar) {
        boolean z10;
        int i10;
        int i11;
        s.o oVar = this.f5946e;
        if (oVar.d() != 0) {
            y0.m mVar = this.f5944c;
            if (mVar.f8456t) {
                g gVar = this.f5948g;
                pc.j.b(gVar);
                f1 f1Var = this.f5947f;
                pc.j.b(f1Var);
                long j3 = f1Var.f7087i;
                x1.m mVar2 = mVar;
                ?? r82 = 0;
                while (true) {
                    z10 = true;
                    if (mVar2 == 0) {
                        break;
                    }
                    if (mVar2 instanceof r1) {
                        ((r1) mVar2).z(gVar, h.f5958i, j3);
                    } else if ((mVar2.f8445i & 16) != 0 && (mVar2 instanceof x1.m)) {
                        y0.m mVar3 = mVar2.f8110v;
                        int i12 = 0;
                        mVar2 = mVar2;
                        r82 = r82;
                        while (mVar3 != null) {
                            if ((mVar3.f8445i & 16) != 0) {
                                i12++;
                                r82 = r82;
                                if (i12 == 1) {
                                    mVar2 = mVar3;
                                } else {
                                    if (r82 == 0) {
                                        r82 = new o0.e(new y0.m[16]);
                                    }
                                    if (mVar2 != 0) {
                                        r82.b(mVar2);
                                        mVar2 = 0;
                                    }
                                    r82.b(mVar3);
                                }
                            }
                            mVar3 = mVar3.f8448l;
                            mVar2 = mVar2;
                            r82 = r82;
                        }
                        if (i12 == 1) {
                        }
                    }
                    mVar2 = x1.f.f(r82);
                }
                if (mVar.f8456t) {
                    o0.e eVar = this.f5952a;
                    Object[] objArr = eVar.f5134g;
                    int i13 = eVar.f5136i;
                    for (int i14 = 0; i14 < i13; i14++) {
                        ((e) objArr[i14]).d(cVar);
                    }
                }
                b(cVar);
                i10 = oVar.f6311j;
                Object[] objArr2 = oVar.f6310i;
                for (i11 = 0; i11 < i10; i11++) {
                    objArr2[i11] = null;
                }
                oVar.f6311j = 0;
                oVar.f6308g = false;
                this.f5947f = null;
                return z10;
            }
        }
        z10 = false;
        b(cVar);
        i10 = oVar.f6311j;
        Object[] objArr22 = oVar.f6310i;
        while (i11 < i10) {
        }
        oVar.f6311j = 0;
        oVar.f6308g = false;
        this.f5947f = null;
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r0v3, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(x4.c cVar, boolean z10) {
        if (this.f5946e.d() == 0) {
            return false;
        }
        x1.m mVar = this.f5944c;
        if (!mVar.f8456t) {
            return false;
        }
        g gVar = this.f5948g;
        pc.j.b(gVar);
        f1 f1Var = this.f5947f;
        pc.j.b(f1Var);
        long j3 = f1Var.f7087i;
        x1.m mVar2 = mVar;
        ?? r72 = 0;
        while (mVar2 != 0) {
            if (mVar2 instanceof r1) {
                ((r1) mVar2).z(gVar, h.f5956g, j3);
            } else if ((mVar2.f8445i & 16) != 0 && (mVar2 instanceof x1.m)) {
                y0.m mVar3 = mVar2.f8110v;
                int i10 = 0;
                mVar2 = mVar2;
                r72 = r72;
                while (mVar3 != null) {
                    if ((mVar3.f8445i & 16) != 0) {
                        i10++;
                        r72 = r72;
                        if (i10 == 1) {
                            mVar2 = mVar3;
                        } else {
                            if (r72 == 0) {
                                r72 = new o0.e(new y0.m[16]);
                            }
                            if (mVar2 != 0) {
                                r72.b(mVar2);
                                mVar2 = 0;
                            }
                            r72.b(mVar3);
                        }
                    }
                    mVar3 = mVar3.f8448l;
                    mVar2 = mVar2;
                    r72 = r72;
                }
                if (i10 == 1) {
                }
            }
            mVar2 = x1.f.f(r72);
        }
        if (mVar.f8456t) {
            o0.e eVar = this.f5952a;
            Object[] objArr = eVar.f5134g;
            int i11 = eVar.f5136i;
            for (int i12 = 0; i12 < i11; i12++) {
                e eVar2 = (e) objArr[i12];
                pc.j.b(this.f5947f);
                eVar2.e(cVar, z10);
            }
        }
        if (mVar.f8456t) {
            ?? r14 = 0;
            while (mVar != 0) {
                if (mVar instanceof r1) {
                    ((r1) mVar).z(gVar, h.f5957h, j3);
                } else if ((mVar.f8445i & 16) != 0 && (mVar instanceof x1.m)) {
                    y0.m mVar4 = mVar.f8110v;
                    int i13 = 0;
                    mVar = mVar;
                    r14 = r14;
                    while (mVar4 != null) {
                        if ((mVar4.f8445i & 16) != 0) {
                            i13++;
                            r14 = r14;
                            if (i13 == 1) {
                                mVar = mVar4;
                            } else {
                                if (r14 == 0) {
                                    r14 = new o0.e(new y0.m[16]);
                                }
                                if (mVar != 0) {
                                    r14.b(mVar);
                                    mVar = 0;
                                }
                                r14.b(mVar4);
                            }
                        }
                        mVar4 = mVar4.f8448l;
                        mVar = mVar;
                        r14 = r14;
                    }
                    if (i13 == 1) {
                    }
                }
                mVar = x1.f.f(r14);
            }
        }
        return true;
    }

    public final void f(long j3, a0 a0Var) {
        e3.j jVar = this.f5945d;
        if (jVar.c(j3) && a0Var.f(this) < 0) {
            jVar.e(j3);
            this.f5946e.c(j3);
        }
        o0.e eVar = this.f5952a;
        Object[] objArr = eVar.f5134g;
        int i10 = eVar.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            ((e) objArr[i11]).f(j3, a0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f5944c + ", children=" + this.f5952a + ", pointerIds=" + this.f5945d + ')';
    }
}
