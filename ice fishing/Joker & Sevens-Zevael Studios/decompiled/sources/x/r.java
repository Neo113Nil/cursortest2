package x;

import java.io.Serializable;
import y1.o1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r extends hc.i implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public Object f7873h;

    /* renamed from: i, reason: collision with root package name */
    public Serializable f7874i;

    /* renamed from: j, reason: collision with root package name */
    public r1.y f7875j;

    /* renamed from: k, reason: collision with root package name */
    public pc.r f7876k;

    /* renamed from: l, reason: collision with root package name */
    public i6.c f7877l;

    /* renamed from: m, reason: collision with root package name */
    public r1.n f7878m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7879n;

    /* renamed from: o, reason: collision with root package name */
    public float f7880o;

    /* renamed from: p, reason: collision with root package name */
    public int f7881p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f7882q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f7883r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e0 f7884s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v f7885t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a1.f f7886u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u f7887v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0.l0 f7888w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, e0 e0Var, v vVar, a1.f fVar, u uVar2, b0.l0 l0Var, fc.d dVar) {
        super(dVar);
        this.f7883r = uVar;
        this.f7884s = e0Var;
        this.f7885t = vVar;
        this.f7886u = fVar;
        this.f7887v = uVar2;
        this.f7888w = l0Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        r rVar = new r(this.f7883r, this.f7884s, this.f7885t, this.f7886u, this.f7887v, this.f7888w, dVar);
        rVar.f7882q = obj;
        return rVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((r1.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0305, code lost:
    
        if (x.s.a(r5.f6006l.f6012z, r1) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00d8, code lost:
    
        if (r6 == r13) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00b5, code lost:
    
        if (r4 == r13) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x032f, code lost:
    
        if (r8 != r13) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x03aa, code lost:
    
        if ((r2 != null ? r2 == x.e0.f7769g ? e1.b.e(r8) : e1.b.d(r8) : e1.b.c(r8)) == 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0142, code lost:
    
        if (r15 == r13) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:39:0x0369, B:51:0x038e], limit reached: 173 */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d6  */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v24, types: [oc.e] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x02a7 -> B:61:0x02a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x032f -> B:9:0x0332). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x00f7 -> B:74:0x00fb). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r1.y yVar;
        Object b2;
        r1.y yVar2;
        r1.n nVar;
        boolean booleanValue;
        Object b10;
        r1.n nVar2;
        pc.r rVar;
        r1.h hVar;
        e0 e0Var;
        pc.r rVar2;
        long j3;
        a1.f fVar;
        long j6;
        long j10;
        float b11;
        pc.r rVar3;
        i6.c cVar;
        pc.r rVar4;
        r1.n nVar3;
        r1.y yVar3;
        Object obj2;
        r1.n nVar4;
        r1.n nVar5;
        float abs;
        e1.b bVar;
        long h10;
        Object obj3;
        r1.n nVar6;
        a1.f fVar2;
        r1.n nVar7;
        Object obj4;
        int i10 = this.f7881p;
        r1.h hVar2 = r1.h.f5957h;
        e0 e0Var2 = this.f7884s;
        int i11 = 2;
        int i12 = 0;
        gc.a aVar = gc.a.f2559g;
        if (i10 == 0) {
            v6.a.W(obj);
            yVar = (r1.y) this.f7882q;
            this.f7882q = yVar;
            this.f7881p = 1;
            b2 = k1.b(yVar, false, r1.h.f5956g, this);
        } else if (i10 == 1) {
            yVar = (r1.y) this.f7882q;
            v6.a.W(obj);
            b2 = obj;
        } else if (i10 == 2) {
            booleanValue = this.f7879n;
            nVar = (r1.n) this.f7873h;
            yVar2 = (r1.y) this.f7882q;
            v6.a.W(obj);
            b10 = obj;
            nVar2 = (r1.n) b10;
            rVar = new pc.r();
            rVar.f5682g = 0L;
            if (!booleanValue) {
                hVar = hVar2;
                e0Var = e0Var2;
                rVar2 = rVar;
                j3 = 0;
                if (nVar != null) {
                }
                return ac.o.f277a;
            }
            j10 = nVar2.f5963a;
            int i13 = nVar2.f5971i;
            if (!s.a(yVar2.f6006l.f6012z, j10)) {
            }
        } else {
            if (i10 == 3) {
                b11 = this.f7880o;
                i6.c cVar2 = this.f7877l;
                pc.r rVar5 = this.f7876k;
                r1.y yVar4 = this.f7875j;
                pc.r rVar6 = (pc.r) this.f7874i;
                r1.n nVar8 = (r1.n) this.f7873h;
                r1.y yVar5 = (r1.y) this.f7882q;
                v6.a.W(obj);
                cVar = cVar2;
                rVar3 = rVar5;
                yVar2 = yVar4;
                yVar3 = yVar5;
                rVar4 = rVar6;
                nVar3 = nVar8;
                obj2 = obj;
                r1.g gVar = (r1.g) obj2;
                ?? r72 = gVar.f5954a;
                int size = r72.size();
                while (true) {
                    if (i12 >= size) {
                        hVar = hVar2;
                        e0Var = e0Var2;
                        nVar4 = null;
                        break;
                    }
                    ?? r16 = r72.get(i12);
                    int i14 = i12;
                    hVar = hVar2;
                    e0Var = e0Var2;
                    if (r1.m.a(((r1.n) r16).f5963a, rVar3.f5682g)) {
                        nVar4 = r16;
                        break;
                    }
                    i12 = i14 + 1;
                    e0Var2 = e0Var;
                    hVar2 = hVar;
                }
                nVar5 = nVar4;
                if (nVar5 != null && !nVar5.b()) {
                    if (r1.v.b(nVar5)) {
                        ?? r22 = gVar.f5954a;
                        int size2 = r22.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                obj3 = null;
                                break;
                            }
                            obj3 = r22.get(i15);
                            if (((r1.n) obj3).f5966d) {
                                break;
                            }
                            i15++;
                        }
                        r1.n nVar9 = (r1.n) obj3;
                        if (nVar9 != null) {
                            rVar3.f5682g = nVar9.f5963a;
                            rVar3 = rVar3;
                        }
                    } else {
                        cVar.getClass();
                        e0 e0Var3 = (e0) cVar.f3210h;
                        pc.r rVar7 = rVar3;
                        long g8 = e1.b.g(cVar.f3209g, e1.b.f(nVar5.f5965c, nVar5.f5969g));
                        cVar.f3209g = g8;
                        e0 e0Var4 = e0.f7770h;
                        if (e0Var3 != null) {
                            abs = Math.abs(e0Var3 == e0Var4 ? e1.b.d(g8) : e1.b.e(g8));
                        } else {
                            abs = e1.b.c(g8);
                        }
                        if (abs < b11) {
                            bVar = null;
                        } else {
                            if (e0Var3 == null) {
                                float c3 = e1.b.c(cVar.f3209g);
                                h10 = e1.b.f(cVar.f3209g, e1.b.h((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2 >> 32)) / c3) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2 & 4294967295L)) / c3) & 4294967295L), b11));
                            } else {
                                long j11 = cVar.f3209g;
                                float d10 = e0Var3 == e0Var4 ? e1.b.d(j11) : e1.b.e(j11);
                                long j12 = cVar.f3209g;
                                float signum = d10 - (Math.signum(e0Var3 == e0Var4 ? e1.b.d(j12) : e1.b.e(j12)) * b11);
                                long j13 = cVar.f3209g;
                                float e10 = e0Var3 == e0Var4 ? e1.b.e(j13) : e1.b.d(j13);
                                h10 = e0Var3 == e0Var4 ? v6.a.h(signum, e10) : v6.a.h(e10, signum);
                            }
                            bVar = new e1.b(h10);
                        }
                        if (bVar == null) {
                            this.f7882q = yVar3;
                            this.f7873h = nVar3;
                            this.f7874i = rVar4;
                            this.f7875j = yVar2;
                            this.f7876k = rVar7;
                            this.f7877l = cVar;
                            this.f7878m = nVar5;
                            this.f7880o = b11;
                            this.f7881p = 4;
                            if (yVar2.a(r1.h.f5958i, this) != aVar) {
                                rVar3 = rVar7;
                                if (nVar5.b()) {
                                }
                            }
                            return aVar;
                        }
                        long j14 = bVar.f1929a;
                        nVar5.a();
                        rVar4.f5682g = j14;
                        if (nVar5.b()) {
                            yVar2 = yVar3;
                            nVar2 = nVar3;
                            rVar = rVar4;
                            nVar = nVar5;
                            if (nVar != null) {
                            }
                            rVar2 = rVar;
                            j3 = rVar.f5682g;
                            if (nVar != null) {
                            }
                            return ac.o.f277a;
                        }
                        cVar.f3209g = 0L;
                        rVar3 = rVar7;
                    }
                    e0Var2 = e0Var;
                    hVar2 = hVar;
                    i12 = 0;
                    this.f7882q = yVar3;
                    this.f7873h = nVar3;
                    this.f7874i = rVar4;
                    this.f7875j = yVar2;
                    this.f7876k = rVar3;
                    this.f7877l = cVar;
                    this.f7878m = null;
                    this.f7880o = b11;
                    this.f7881p = 3;
                    obj2 = yVar2.a(hVar2, this);
                }
                yVar2 = yVar3;
                nVar2 = nVar3;
                rVar = rVar4;
                nVar = null;
                if (nVar != null) {
                }
                rVar2 = rVar;
                j3 = rVar.f5682g;
                if (nVar != null) {
                }
                return ac.o.f277a;
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pc.r rVar8 = this.f7876k;
                r1.y yVar6 = this.f7875j;
                e0 e0Var5 = (e0) this.f7874i;
                oc.e eVar = (oc.e) this.f7873h;
                r1.y yVar7 = (r1.y) this.f7882q;
                v6.a.W(obj);
                r1.h hVar3 = hVar2;
                e0 e0Var6 = e0Var5;
                Object a6 = obj;
                ?? r62 = eVar;
                r1.g gVar2 = (r1.g) a6;
                ?? r92 = gVar2.f5954a;
                int size3 = r92.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size3) {
                        hVar = hVar3;
                        nVar7 = null;
                        break;
                    }
                    ?? r12 = r92.get(i16);
                    hVar = hVar3;
                    if (r1.m.a(((r1.n) r12).f5963a, rVar8.f5682g)) {
                        nVar7 = r12;
                        break;
                    }
                    i16++;
                    hVar3 = hVar;
                }
                r1.n nVar10 = nVar7;
                if (nVar10 == null) {
                    nVar10 = null;
                } else if (r1.v.b(nVar10)) {
                    ?? r42 = gVar2.f5954a;
                    int size4 = r42.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size4) {
                            obj4 = null;
                            break;
                        }
                        obj4 = r42.get(i17);
                        if (((r1.n) obj4).f5966d) {
                            break;
                        }
                        i17++;
                    }
                    r1.n nVar11 = (r1.n) obj4;
                    if (nVar11 != null) {
                        rVar8.f5682g = nVar11.f5963a;
                        fVar2 = r62;
                        this.f7882q = yVar7;
                        this.f7873h = fVar2;
                        this.f7874i = e0Var6;
                        this.f7875j = yVar6;
                        this.f7876k = rVar8;
                        this.f7877l = null;
                        this.f7878m = null;
                        this.f7881p = 5;
                        hVar3 = hVar;
                        a6 = yVar6.a(hVar3, this);
                        r62 = fVar2;
                    }
                } else {
                    long c7 = r1.v.c(nVar10, true);
                    fVar2 = r62;
                }
                if (nVar10 != null && !nVar10.b()) {
                    if (r1.v.b(nVar10)) {
                        nVar6 = nVar10;
                        if (nVar6 != null) {
                            this.f7887v.invoke();
                        } else {
                            this.f7888w.invoke(nVar6);
                        }
                        return ac.o.f277a;
                    }
                    r62.invoke(nVar10, new e1.b(r1.v.c(nVar10, false)));
                    nVar10.a();
                    e0Var = e0Var6;
                    fVar = r62;
                    yVar2 = yVar7;
                    j6 = nVar10.f5963a;
                    pc.r rVar9 = new pc.r();
                    rVar9.f5682g = j6;
                    fVar2 = fVar;
                    rVar8 = rVar9;
                    yVar6 = yVar2;
                    yVar7 = yVar6;
                    e0Var6 = e0Var;
                    this.f7882q = yVar7;
                    this.f7873h = fVar2;
                    this.f7874i = e0Var6;
                    this.f7875j = yVar6;
                    this.f7876k = rVar8;
                    this.f7877l = null;
                    this.f7878m = null;
                    this.f7881p = 5;
                    hVar3 = hVar;
                    a6 = yVar6.a(hVar3, this);
                    r62 = fVar2;
                }
                nVar6 = null;
                if (nVar6 != null) {
                }
                return ac.o.f277a;
            }
            b11 = this.f7880o;
            nVar5 = this.f7878m;
            i6.c cVar3 = this.f7877l;
            rVar3 = this.f7876k;
            yVar2 = this.f7875j;
            pc.r rVar10 = (pc.r) this.f7874i;
            r1.n nVar12 = (r1.n) this.f7873h;
            r1.y yVar8 = (r1.y) this.f7882q;
            v6.a.W(obj);
            hVar = hVar2;
            e0Var = e0Var2;
            rVar4 = rVar10;
            yVar3 = yVar8;
            nVar3 = nVar12;
            cVar = cVar3;
            if (nVar5.b()) {
                yVar2 = yVar3;
                nVar2 = nVar3;
                rVar = rVar4;
                nVar = null;
                if (nVar != null || nVar.b()) {
                    rVar2 = rVar;
                    j3 = rVar.f5682g;
                    if (nVar != null) {
                        this.f7885t.invoke(nVar, new e1.b(j3));
                        long j15 = rVar2.f5682g;
                        fVar = this.f7886u;
                        a.a.i((s1.c) fVar.f166h, nVar);
                        ad.e eVar2 = ((s0) fVar.f167i).A;
                        if (eVar2 != null) {
                            eVar2.s(new n(j15));
                        }
                        j6 = nVar.f5963a;
                    }
                    return ac.o.f277a;
                }
                e0Var2 = e0Var;
                hVar2 = hVar;
                i11 = 2;
                i12 = 0;
                j10 = nVar2.f5963a;
                int i132 = nVar2.f5971i;
                if (!s.a(yVar2.f6006l.f6012z, j10)) {
                    hVar = hVar2;
                    e0Var = e0Var2;
                    nVar = null;
                    if (nVar != null) {
                    }
                    rVar2 = rVar;
                    j3 = rVar.f5682g;
                    if (nVar != null) {
                    }
                    return ac.o.f277a;
                }
                r1.z zVar = yVar2.f6006l;
                zVar.getClass();
                o1 o1Var = x1.f.v(zVar).D;
                if (i132 == i11) {
                    b11 = o1Var.b() * s.f7893a;
                    rVar3 = new pc.r();
                    rVar3.f5682g = j10;
                    cVar = new i6.c(e0Var2);
                    rVar4 = rVar;
                    nVar3 = nVar2;
                    yVar3 = yVar2;
                } else {
                    b11 = o1Var.b();
                    rVar3 = new pc.r();
                    rVar3.f5682g = j10;
                    cVar = new i6.c(e0Var2);
                    rVar4 = rVar;
                    nVar3 = nVar2;
                    yVar3 = yVar2;
                }
                this.f7882q = yVar3;
                this.f7873h = nVar3;
                this.f7874i = rVar4;
                this.f7875j = yVar2;
                this.f7876k = rVar3;
                this.f7877l = cVar;
                this.f7878m = null;
                this.f7880o = b11;
                this.f7881p = 3;
                obj2 = yVar2.a(hVar2, this);
            }
            e0Var2 = e0Var;
            hVar2 = hVar;
            i12 = 0;
            this.f7882q = yVar3;
            this.f7873h = nVar3;
            this.f7874i = rVar4;
            this.f7875j = yVar2;
            this.f7876k = rVar3;
            this.f7877l = cVar;
            this.f7878m = null;
            this.f7880o = b11;
            this.f7881p = 3;
            obj2 = yVar2.a(hVar2, this);
        }
        yVar2 = yVar;
        nVar = (r1.n) b2;
        booleanValue = ((Boolean) this.f7883r.invoke()).booleanValue();
        if (!booleanValue) {
            nVar.a();
        }
        this.f7882q = yVar2;
        this.f7873h = nVar;
        this.f7879n = booleanValue;
        this.f7881p = 2;
        b10 = k1.b(yVar2, (r3 & 1) != 0, r1.h.f5957h, this);
    }
}
