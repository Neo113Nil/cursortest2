package a0;

import b0.q0;
import j0.g0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import m0.d1;
import m0.i1;
import v1.f0;
import v1.t0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f88g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oc.a f89h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f90i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z.c0 f91j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f92k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f93l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f94m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f95n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b0 b0Var, z.c0 c0Var, j jVar, z.g gVar, boolean z10, yc.y yVar, f1.u uVar, y0.d dVar) {
        super(2);
        this.f92k = b0Var;
        this.f91j = c0Var;
        this.f89h = jVar;
        this.f93l = gVar;
        this.f90i = z10;
        this.f94m = yVar;
        this.f95n = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06f6 A[LOOP:15: B:245:0x06f4->B:246:0x06f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0736 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0881 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0281 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x026e A[LOOP:28: B:442:0x026e->B:444:0x0277, LOOP_START, PHI: r4
      0x026e: PHI (r4v9 int) = (r4v8 int), (r4v10 int) binds: [B:441:0x026c, B:444:0x0277] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x022c  */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v51, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // oc.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        b0.x xVar;
        long j3;
        int g8;
        b0.a0 a0Var;
        o0.e eVar;
        int i11;
        List list;
        int i12;
        List list2;
        uc.d dVar;
        int size;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        b0 b0Var;
        long j6;
        int i18;
        int i19;
        int i20;
        float f10;
        int i21;
        float f11;
        List list3;
        int i22;
        int i23;
        List list4;
        List list5;
        int i24;
        List list6;
        int size2;
        int i25;
        List list7;
        int size3;
        int i26;
        int f12;
        int e10;
        boolean z10;
        int i27;
        boolean z11;
        o oVar;
        ArrayList arrayList;
        androidx.compose.foundation.lazy.layout.a aVar;
        boolean z12;
        ArrayList arrayList2;
        s sVar;
        t tVar;
        float f13;
        float f14;
        t tVar2;
        t tVar3;
        int i28;
        Object obj3;
        int i29;
        int min;
        t tVar4;
        t tVar5;
        int i30;
        switch (this.f88g) {
            case 0:
                boolean a6 = s2.k.a(0L, 0L);
                b0.x xVar2 = (b0.x) obj;
                long j10 = ((s2.a) obj2).f6381a;
                z.g gVar = (z.g) this.f93l;
                b0 b0Var2 = (b0) this.f92k;
                b0Var2.f33r.getValue();
                boolean z13 = b0Var2.f17b || xVar2.f927h.t();
                x.e0 e0Var = x.e0.f7769g;
                ud.g.g(j10, e0Var);
                s2.l layoutDirection = xVar2.f927h.getLayoutDirection();
                z.c0 c0Var = this.f91j;
                int D = xVar2.f927h.D(c0Var.a(layoutDirection));
                int D2 = xVar2.f927h.D(c0Var.b(xVar2.f927h.getLayoutDirection()));
                int D3 = xVar2.f927h.D(c0Var.f8945b);
                float f15 = c0Var.f8947d;
                t0 t0Var = xVar2.f927h;
                int D4 = t0Var.D(f15) + D3;
                int i31 = D2 + D;
                int i32 = D4 - D3;
                long h10 = s2.b.h(-i31, -D4, j10);
                i iVar = (i) this.f89h.invoke();
                c cVar = iVar.f54c;
                q0 q0Var = iVar.f55d;
                int h11 = s2.a.h(h10);
                int g10 = s2.a.g(h10);
                cVar.f38a.h(h11);
                cVar.f39b.h(g10);
                if (gVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                int D5 = t0Var.D(gVar.a());
                int c3 = iVar.c();
                int g11 = s2.a.g(j10) - D4;
                o oVar2 = new o(h10, iVar, xVar2, c3, D5, (y0.d) this.f95n, D3, i32, x4.f.j(D, D3), (b0) this.f92k);
                w0.g d10 = w0.r.d();
                oc.c e11 = d10 != null ? d10.e() : null;
                w0.g g12 = w0.r.g(d10);
                try {
                    u uVar = b0Var2.f19d;
                    int g13 = ((i1) uVar.f136b).g();
                    int j11 = bc.a0.j(g13, iVar, uVar.f138d);
                    if (g13 != j11) {
                        i10 = D5;
                        ((i1) uVar.f136b).h(j11);
                        b0.y yVar = (b0.y) uVar.f139e;
                        xVar = xVar2;
                        if (g13 != yVar.f931h) {
                            yVar.f931h = g13;
                            int i33 = (g13 / 30) * 30;
                            j3 = h10;
                            yVar.f930g.setValue(uc.e.q(Math.max(i33 - 100, 0), i33 + 130));
                            g8 = ((i1) uVar.f137c).g();
                            w0.r.j(d10, g12, e11);
                            a0Var = b0Var2.f32q;
                            eVar = b0Var2.f29n.f839a;
                            i11 = eVar.f5136i;
                            list = bc.v.f1067g;
                            if (i11 == 0 && a0Var.f797g.isEmpty()) {
                                i12 = g8;
                                list2 = list;
                            } else {
                                ?? arrayList3 = new ArrayList();
                                if (eVar.f5136i == 0) {
                                    int i34 = eVar.f5136i;
                                    if (i34 == 0) {
                                        throw new NoSuchElementException("MutableVector is empty.");
                                    }
                                    Object[] objArr = eVar.f5134g;
                                    i12 = g8;
                                    int i35 = ((b0.i) objArr[0]).f831a;
                                    if (i34 > 0) {
                                        int i36 = 0;
                                        while (true) {
                                            list2 = list;
                                            int i37 = ((b0.i) objArr[i36]).f831a;
                                            if (i37 < i35) {
                                                i35 = i37;
                                            }
                                            int i38 = i36 + 1;
                                            if (i38 < i34) {
                                                i36 = i38;
                                                list = list2;
                                            }
                                        }
                                    } else {
                                        list2 = list;
                                    }
                                    if (i35 < 0) {
                                        throw new IllegalArgumentException("negative minIndex");
                                    }
                                    int i39 = eVar.f5136i;
                                    if (i39 == 0) {
                                        throw new NoSuchElementException("MutableVector is empty.");
                                    }
                                    Object[] objArr2 = eVar.f5134g;
                                    int i40 = ((b0.i) objArr2[0]).f832b;
                                    if (i39 > 0) {
                                        int i41 = i40;
                                        int i42 = 0;
                                        do {
                                            int i43 = ((b0.i) objArr2[i42]).f832b;
                                            if (i43 > i41) {
                                                i41 = i43;
                                            }
                                            i42++;
                                        } while (i42 < i39);
                                        i40 = i41;
                                    }
                                    dVar = new uc.d(i35, Math.min(i40, iVar.c() - 1), 1);
                                } else {
                                    i12 = g8;
                                    list2 = list;
                                    dVar = uc.d.f6742j;
                                }
                                size = a0Var.f797g.size();
                                for (i13 = 0; i13 < size; i13++) {
                                    b0.z zVar = (b0.z) a0Var.get(i13);
                                    int j12 = bc.a0.j(zVar.f934c.g(), iVar, zVar.f932a);
                                    int i44 = dVar.f6735g;
                                    if ((j12 > dVar.f6736h || i44 > j12) && j12 >= 0 && j12 < iVar.c()) {
                                        arrayList3.add(Integer.valueOf(j12));
                                    }
                                }
                                i14 = dVar.f6735g;
                                i15 = dVar.f6736h;
                                if (i14 <= i15) {
                                    while (true) {
                                        arrayList3.add(Integer.valueOf(i14));
                                        if (i14 != i15) {
                                            i14++;
                                        }
                                    }
                                }
                                list = arrayList3;
                            }
                            float floatValue = (t0Var.t() && z13) ? ((Number) b0Var2.f37v.f6857h.getValue()).floatValue() : b0Var2.f22g;
                            if (this.f90i) {
                                iVar.f53b.getClass();
                            }
                            androidx.compose.foundation.lazy.layout.a aVar2 = b0Var2.f28m;
                            boolean t3 = t0Var.t();
                            s sVar2 = b0Var2.f18c;
                            yc.y yVar2 = (yc.y) this.f94m;
                            d1 d1Var = b0Var2.f36u;
                            b0.x xVar3 = xVar;
                            n nVar = new n(xVar3, j10, i31, D4);
                            b0.x xVar4 = xVar3;
                            if (D3 < 0) {
                                throw new IllegalArgumentException("invalid beforeContentPadding");
                            }
                            if (i32 < 0) {
                                throw new IllegalArgumentException("invalid afterContentPadding");
                            }
                            if (c3 <= 0) {
                                int j13 = s2.a.j(j3);
                                int i45 = s2.a.i(j3);
                                long j14 = j3;
                                aVar2.b(j13, i45, new ArrayList(), q0Var, oVar2, t3, z13, 0, 0);
                                if (!t3) {
                                    aVar2.a();
                                    if (!a6) {
                                        j13 = s2.b.f((int) 0, j14);
                                        i45 = s2.b.e((int) 0, j14);
                                    }
                                }
                                sVar = new s(null, 0, false, 0.0f, (f0) nVar.b(Integer.valueOf(j13), Integer.valueOf(i45), q.f96h), 0.0f, false, yVar2, xVar4, oVar2.f79c, list2, -D3, g11 + i32, 0, e0Var, i32, i10);
                                b0Var = b0Var2;
                            } else {
                                long j15 = j3;
                                if (j11 >= c3) {
                                    i16 = c3 - 1;
                                    i17 = 0;
                                } else {
                                    i16 = j11;
                                    i17 = i12;
                                }
                                int round = Math.round(floatValue);
                                int i46 = i17 - round;
                                if (i16 == 0 && i46 < 0) {
                                    round += i46;
                                    i46 = 0;
                                }
                                bc.k kVar = new bc.k();
                                int i47 = i46;
                                int i48 = -D3;
                                int i49 = i48 + (i10 < 0 ? i10 : 0);
                                b0Var = b0Var2;
                                int i50 = i47 + i49;
                                int i51 = 0;
                                n nVar2 = nVar;
                                while (true) {
                                    j6 = oVar2.f79c;
                                    if (i50 < 0 && i16 > 0) {
                                        n nVar3 = nVar2;
                                        int i52 = i16 - 1;
                                        t a8 = oVar2.a(i52, j6);
                                        kVar.add(0, a8);
                                        i51 = Math.max(i51, a8.f132m);
                                        i50 += a8.f131l;
                                        i16 = i52;
                                        nVar2 = nVar3;
                                    }
                                }
                                n nVar4 = nVar2;
                                if (i50 < i49) {
                                    round += i50;
                                    i50 = i49;
                                }
                                int i53 = round;
                                int i54 = i50 - i49;
                                int i55 = g11 + i32;
                                int i56 = i51;
                                int i57 = i55 < 0 ? 0 : i55;
                                int i58 = -i54;
                                int i59 = i54;
                                int i60 = i16;
                                int i61 = 0;
                                boolean z14 = false;
                                while (i61 < kVar.f1063i) {
                                    if (i58 >= i57) {
                                        kVar.b(i61);
                                        z14 = true;
                                    } else {
                                        i60++;
                                        i58 += ((t) kVar.get(i61)).f131l;
                                        i61++;
                                    }
                                }
                                int i62 = i58;
                                int i63 = i56;
                                int i64 = i60;
                                while (i64 < c3 && (i62 < i57 || i62 <= 0 || kVar.isEmpty())) {
                                    int i65 = i57;
                                    t a10 = oVar2.a(i64, j6);
                                    b0.x xVar5 = xVar4;
                                    int i66 = a10.f131l;
                                    int i67 = i62 + i66;
                                    if (i67 <= i49) {
                                        i30 = i67;
                                        if (i64 != c3 - 1) {
                                            i59 -= i66;
                                            i16 = i64 + 1;
                                            z14 = true;
                                            i64++;
                                            i57 = i65;
                                            xVar4 = xVar5;
                                            i62 = i30;
                                        }
                                    } else {
                                        i30 = i67;
                                    }
                                    int max = Math.max(i63, a10.f132m);
                                    kVar.addLast(a10);
                                    i63 = max;
                                    i64++;
                                    i57 = i65;
                                    xVar4 = xVar5;
                                    i62 = i30;
                                }
                                b0.x xVar6 = xVar4;
                                if (i62 < g11) {
                                    int i68 = g11 - i62;
                                    int i69 = i62 + i68;
                                    i20 = i59 - i68;
                                    while (i20 < D3 && i16 > 0) {
                                        int i70 = i16 - 1;
                                        int i71 = i69;
                                        t a11 = oVar2.a(i70, j6);
                                        kVar.add(0, a11);
                                        i63 = Math.max(i63, a11.f132m);
                                        i20 += a11.f131l;
                                        i16 = i70;
                                        i69 = i71;
                                        i68 = i68;
                                    }
                                    int i72 = i69;
                                    i18 = i53 + i68;
                                    if (i20 < 0) {
                                        i18 += i20;
                                        i62 = i72 + i20;
                                        i19 = i16;
                                        i20 = 0;
                                    } else {
                                        i19 = i16;
                                        i62 = i72;
                                    }
                                } else {
                                    i18 = i53;
                                    i19 = i16;
                                    i20 = i59;
                                }
                                int i73 = i63;
                                float f16 = (Integer.signum(Math.round(floatValue)) != Integer.signum(i18) || Math.abs(Math.round(floatValue)) < Math.abs(i18)) ? floatValue : i18;
                                float f17 = floatValue - f16;
                                float f18 = (!t3 || i18 <= i53 || f17 > 0.0f) ? 0.0f : (i18 - i53) + f17;
                                if (i20 < 0) {
                                    throw new IllegalArgumentException("negative currentFirstItemScrollOffset");
                                }
                                int i74 = -i20;
                                t tVar6 = (t) kVar.first();
                                if (D3 > 0 || i10 < 0) {
                                    f10 = f16;
                                    int i75 = kVar.f1063i;
                                    t tVar7 = tVar6;
                                    int i76 = i20;
                                    int i77 = 0;
                                    while (i77 < i75) {
                                        int i78 = i75;
                                        int i79 = ((t) kVar.get(i77)).f131l;
                                        if (i76 != 0 && i79 <= i76 && i77 != bc.n.K(kVar)) {
                                            i76 -= i79;
                                            i77++;
                                            tVar7 = (t) kVar.get(i77);
                                            i75 = i78;
                                        }
                                        i21 = i76;
                                        tVar6 = tVar7;
                                    }
                                    i21 = i76;
                                    tVar6 = tVar7;
                                } else {
                                    f10 = f16;
                                    i21 = i20;
                                }
                                int max2 = Math.max(0, i19);
                                int i80 = i19 - 1;
                                if (max2 <= i80) {
                                    list3 = null;
                                    while (true) {
                                        if (list3 == null) {
                                            list3 = new ArrayList();
                                        }
                                        f11 = f18;
                                        list3.add(oVar2.a(i80, j6));
                                        if (i80 != max2) {
                                            i80--;
                                            f18 = f11;
                                        }
                                    }
                                } else {
                                    f11 = f18;
                                    list3 = null;
                                }
                                int size4 = list.size() - 1;
                                if (size4 >= 0) {
                                    while (true) {
                                        int i81 = size4 - 1;
                                        int intValue = ((Number) list.get(size4)).intValue();
                                        if (intValue < max2) {
                                            if (list3 == null) {
                                                list3 = new ArrayList();
                                            }
                                            list3.add(oVar2.a(intValue, j6));
                                        }
                                        if (i81 >= 0) {
                                            size4 = i81;
                                        }
                                    }
                                }
                                if (list3 == null) {
                                    list3 = list2;
                                }
                                int i82 = i73;
                                int i83 = 0;
                                for (int size5 = list3.size(); i83 < size5; size5 = size5) {
                                    i82 = Math.max(i82, ((t) list3.get(i83)).f132m);
                                    i83++;
                                }
                                int i84 = c3 - 1;
                                int min2 = Math.min(((t) bc.m.X(kVar)).f120a, i84);
                                int i85 = ((t) bc.m.X(kVar)).f120a + 1;
                                if (i85 <= min2) {
                                    List list8 = null;
                                    while (true) {
                                        if (list8 == null) {
                                            list8 = new ArrayList();
                                        }
                                        i22 = i82;
                                        i23 = i64;
                                        list4 = list8;
                                        list4.add(oVar2.a(i85, j6));
                                        if (i85 != min2) {
                                            i85++;
                                            list8 = list4;
                                            i82 = i22;
                                            i64 = i23;
                                        }
                                    }
                                } else {
                                    i22 = i82;
                                    i23 = i64;
                                    list4 = null;
                                }
                                if (t3 && sVar2 != null) {
                                    ?? r82 = sVar2.f112j;
                                    if (!r82.isEmpty()) {
                                        List list9 = list4;
                                        for (int size6 = r82.size() - 1; -1 < size6; size6--) {
                                            if (((t) r82.get(size6)).f120a > min2 && (size6 == 0 || ((t) r82.get(size6 - 1)).f120a <= min2)) {
                                                tVar = (t) r82.get(size6);
                                                t tVar8 = (t) bc.m.X(r82);
                                                if (tVar != null || (i29 = tVar.f120a) > (min = Math.min(tVar8.f120a, i84))) {
                                                    list5 = list3;
                                                    i24 = g11;
                                                    list6 = list9;
                                                } else {
                                                    int i86 = i29;
                                                    list6 = list9;
                                                    while (true) {
                                                        list5 = list3;
                                                        if (list6 != null) {
                                                            int size7 = list6.size();
                                                            i24 = g11;
                                                            int i87 = 0;
                                                            while (true) {
                                                                if (i87 < size7) {
                                                                    tVar5 = list6.get(i87);
                                                                    int i88 = size7;
                                                                    if (((t) tVar5).f120a != i86) {
                                                                        i87++;
                                                                        size7 = i88;
                                                                    }
                                                                } else {
                                                                    tVar5 = 0;
                                                                }
                                                            }
                                                            tVar4 = tVar5;
                                                        } else {
                                                            i24 = g11;
                                                            tVar4 = null;
                                                        }
                                                        if (tVar4 == null) {
                                                            if (list6 == null) {
                                                                list6 = new ArrayList();
                                                            }
                                                            list6.add(oVar2.a(i86, j6));
                                                        }
                                                        if (i86 != min) {
                                                            i86++;
                                                            list3 = list5;
                                                            g11 = i24;
                                                        }
                                                    }
                                                }
                                                f13 = ((sVar2.f114l - tVar8.f129j) - tVar8.f130k) - f10;
                                                if (f13 > 0.0f) {
                                                    int i89 = tVar8.f120a + 1;
                                                    List list10 = list6;
                                                    int i90 = 0;
                                                    while (i89 < c3 && i90 < f13) {
                                                        if (i89 <= min2) {
                                                            int a12 = kVar.a();
                                                            int i91 = 0;
                                                            while (true) {
                                                                if (i91 < a12) {
                                                                    obj3 = kVar.get(i91);
                                                                    f14 = f13;
                                                                    if (((t) obj3).f120a != i89) {
                                                                        i91++;
                                                                        f13 = f14;
                                                                    }
                                                                } else {
                                                                    f14 = f13;
                                                                    obj3 = null;
                                                                }
                                                            }
                                                            tVar2 = (t) obj3;
                                                        } else {
                                                            f14 = f13;
                                                            if (list10 != null) {
                                                                int size8 = list10.size();
                                                                int i92 = 0;
                                                                while (true) {
                                                                    if (i92 < size8) {
                                                                        tVar3 = list10.get(i92);
                                                                        if (((t) tVar3).f120a != i89) {
                                                                            i92++;
                                                                        }
                                                                    } else {
                                                                        tVar3 = 0;
                                                                    }
                                                                }
                                                                tVar2 = tVar3;
                                                            } else {
                                                                tVar2 = null;
                                                            }
                                                        }
                                                        if (tVar2 != null) {
                                                            i89++;
                                                            i28 = tVar2.f131l;
                                                        } else {
                                                            if (list10 == null) {
                                                                list10 = new ArrayList();
                                                            }
                                                            list10.add(oVar2.a(i89, j6));
                                                            i89++;
                                                            i28 = ((t) bc.m.X(list10)).f131l;
                                                        }
                                                        i90 += i28;
                                                        f13 = f14;
                                                    }
                                                    list6 = list10;
                                                }
                                                if (list6 != null && ((t) bc.m.X(list6)).f120a > min2) {
                                                    min2 = ((t) bc.m.X(list6)).f120a;
                                                }
                                                size2 = list.size();
                                                List list11 = list6;
                                                for (i25 = 0; i25 < size2; i25++) {
                                                    int intValue2 = ((Number) list.get(i25)).intValue();
                                                    if (intValue2 > min2) {
                                                        if (list11 == null) {
                                                            list11 = new ArrayList();
                                                        }
                                                        list11.add(oVar2.a(intValue2, j6));
                                                    }
                                                }
                                                list7 = list11 == null ? list2 : list11;
                                                size3 = list7.size();
                                                int i93 = i22;
                                                for (i26 = 0; i26 < size3; i26++) {
                                                    i93 = Math.max(i93, ((t) list7.get(i26)).f132m);
                                                }
                                                boolean z15 = !pc.j.a(tVar6, kVar.first()) && list5.isEmpty() && list7.isEmpty();
                                                f12 = s2.b.f(i93, j15);
                                                e10 = s2.b.e(i62, j15);
                                                int i94 = i24;
                                                z10 = i62 < Math.min(e10, i94);
                                                if (!z10 && i74 != 0) {
                                                    throw new IllegalStateException("non-zero itemsScrollOffset");
                                                }
                                                ArrayList arrayList4 = new ArrayList(list7.size() + list5.size() + kVar.a());
                                                if (!z10) {
                                                    i27 = i62;
                                                    int size9 = list5.size();
                                                    int i95 = i74;
                                                    int i96 = 0;
                                                    while (i96 < size9) {
                                                        List list12 = list5;
                                                        int i97 = size9;
                                                        t tVar9 = (t) list12.get(i96);
                                                        i95 -= tVar9.f131l;
                                                        tVar9.c(i95, f12, e10);
                                                        arrayList4.add(tVar9);
                                                        i96++;
                                                        size9 = i97;
                                                        z15 = z15;
                                                        list5 = list12;
                                                    }
                                                    z11 = z15;
                                                    int a13 = kVar.a();
                                                    int i98 = i74;
                                                    for (int i99 = 0; i99 < a13; i99++) {
                                                        t tVar10 = (t) kVar.get(i99);
                                                        tVar10.c(i98, f12, e10);
                                                        arrayList4.add(tVar10);
                                                        i98 += tVar10.f131l;
                                                    }
                                                    int size10 = list7.size();
                                                    for (int i100 = 0; i100 < size10; i100++) {
                                                        t tVar11 = (t) list7.get(i100);
                                                        tVar11.c(i98, f12, e10);
                                                        arrayList4.add(tVar11);
                                                        i98 += tVar11.f131l;
                                                    }
                                                } else {
                                                    if (!list5.isEmpty() || !list7.isEmpty()) {
                                                        throw new IllegalArgumentException("no extra items");
                                                    }
                                                    int a14 = kVar.a();
                                                    int[] iArr = new int[a14];
                                                    for (int i101 = 0; i101 < a14; i101++) {
                                                        iArr[i101] = ((t) kVar.get(i101)).f130k;
                                                    }
                                                    int[] iArr2 = new int[a14];
                                                    int i102 = 0;
                                                    while (i102 < a14) {
                                                        iArr2[i102] = 0;
                                                        i102++;
                                                        i62 = i62;
                                                    }
                                                    i27 = i62;
                                                    if (gVar == null) {
                                                        throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                                                    }
                                                    gVar.b(xVar6, e10, iArr, iArr2);
                                                    int i103 = new uc.d(0, a14 - 1, 1).f6736h;
                                                    if (i103 < 0) {
                                                        z11 = z15;
                                                        oVar = oVar2;
                                                        arrayList = arrayList4;
                                                        z12 = true;
                                                        aVar = aVar2;
                                                        int i104 = i27;
                                                        aVar.b(f12, e10, arrayList, q0Var, oVar, t3, z13, i21, i104);
                                                        int i105 = e10;
                                                        ArrayList arrayList5 = arrayList;
                                                        o oVar3 = oVar;
                                                        if (!t3) {
                                                            aVar.a();
                                                            if (!a6) {
                                                                f12 = s2.b.f(Math.max(f12, (int) 0), j15);
                                                                int e12 = s2.b.e(Math.max(i105, (int) 0), j15);
                                                                if (e12 != i105) {
                                                                    int size11 = arrayList5.size();
                                                                    for (int i106 = 0; i106 < size11; i106++) {
                                                                        ((t) arrayList5.get(i106)).f133n = e12;
                                                                    }
                                                                }
                                                                i105 = e12;
                                                            }
                                                        }
                                                        if (i23 >= c3 && i104 <= i94) {
                                                            z12 = false;
                                                        }
                                                        f0 f0Var = (f0) nVar4.b(Integer.valueOf(f12), Integer.valueOf(i105), new r(arrayList5, (t) null, t3, d1Var));
                                                        if (z11) {
                                                            ArrayList arrayList6 = new ArrayList(arrayList5.size());
                                                            int size12 = arrayList5.size();
                                                            for (int i107 = 0; i107 < size12; i107++) {
                                                                Object obj4 = arrayList5.get(i107);
                                                                t tVar12 = (t) obj4;
                                                                if (tVar12.f120a >= ((t) kVar.first()).f120a && tVar12.f120a <= ((t) kVar.last()).f120a) {
                                                                    arrayList6.add(obj4);
                                                                }
                                                            }
                                                            arrayList2 = arrayList6;
                                                        } else {
                                                            arrayList2 = arrayList5;
                                                        }
                                                        sVar = new s(tVar6, i21, z12, f10, f0Var, f11, z14, yVar2, xVar6, oVar3.f79c, arrayList2, i48, i55, c3, e0Var, i32, i10);
                                                    } else {
                                                        int i108 = 0;
                                                        while (true) {
                                                            int i109 = iArr2[i108];
                                                            t tVar13 = (t) kVar.get(i108);
                                                            tVar13.c(i109, f12, e10);
                                                            arrayList4.add(tVar13);
                                                            if (i108 != i103) {
                                                                i108++;
                                                            } else {
                                                                z11 = z15;
                                                            }
                                                        }
                                                    }
                                                }
                                                oVar = oVar2;
                                                arrayList = arrayList4;
                                                aVar = aVar2;
                                                z12 = true;
                                                int i1042 = i27;
                                                aVar.b(f12, e10, arrayList, q0Var, oVar, t3, z13, i21, i1042);
                                                int i1052 = e10;
                                                ArrayList arrayList52 = arrayList;
                                                o oVar32 = oVar;
                                                if (!t3) {
                                                }
                                                if (i23 >= c3) {
                                                    z12 = false;
                                                }
                                                f0 f0Var2 = (f0) nVar4.b(Integer.valueOf(f12), Integer.valueOf(i1052), new r(arrayList52, (t) null, t3, d1Var));
                                                if (z11) {
                                                }
                                                sVar = new s(tVar6, i21, z12, f10, f0Var2, f11, z14, yVar2, xVar6, oVar32.f79c, arrayList2, i48, i55, c3, e0Var, i32, i10);
                                            }
                                        }
                                        tVar = null;
                                        t tVar82 = (t) bc.m.X(r82);
                                        if (tVar != null) {
                                        }
                                        list5 = list3;
                                        i24 = g11;
                                        list6 = list9;
                                        f13 = ((sVar2.f114l - tVar82.f129j) - tVar82.f130k) - f10;
                                        if (f13 > 0.0f) {
                                        }
                                        if (list6 != null) {
                                            min2 = ((t) bc.m.X(list6)).f120a;
                                        }
                                        size2 = list.size();
                                        List list112 = list6;
                                        while (i25 < size2) {
                                        }
                                        if (list112 == null) {
                                        }
                                        size3 = list7.size();
                                        int i932 = i22;
                                        while (i26 < size3) {
                                        }
                                        if (pc.j.a(tVar6, kVar.first())) {
                                        }
                                        f12 = s2.b.f(i932, j15);
                                        e10 = s2.b.e(i62, j15);
                                        int i942 = i24;
                                        if (i62 < Math.min(e10, i942)) {
                                        }
                                        if (!z10) {
                                        }
                                        ArrayList arrayList42 = new ArrayList(list7.size() + list5.size() + kVar.a());
                                        if (!z10) {
                                        }
                                        oVar = oVar2;
                                        arrayList = arrayList42;
                                        aVar = aVar2;
                                        z12 = true;
                                        int i10422 = i27;
                                        aVar.b(f12, e10, arrayList, q0Var, oVar, t3, z13, i21, i10422);
                                        int i10522 = e10;
                                        ArrayList arrayList522 = arrayList;
                                        o oVar322 = oVar;
                                        if (!t3) {
                                        }
                                        if (i23 >= c3) {
                                        }
                                        f0 f0Var22 = (f0) nVar4.b(Integer.valueOf(f12), Integer.valueOf(i10522), new r(arrayList522, (t) null, t3, d1Var));
                                        if (z11) {
                                        }
                                        sVar = new s(tVar6, i21, z12, f10, f0Var22, f11, z14, yVar2, xVar6, oVar322.f79c, arrayList2, i48, i55, c3, e0Var, i32, i10);
                                    }
                                }
                                list5 = list3;
                                i24 = g11;
                                list6 = list4;
                                if (list6 != null) {
                                }
                                size2 = list.size();
                                List list1122 = list6;
                                while (i25 < size2) {
                                }
                                if (list1122 == null) {
                                }
                                size3 = list7.size();
                                int i9322 = i22;
                                while (i26 < size3) {
                                }
                                if (pc.j.a(tVar6, kVar.first())) {
                                }
                                f12 = s2.b.f(i9322, j15);
                                e10 = s2.b.e(i62, j15);
                                int i9422 = i24;
                                if (i62 < Math.min(e10, i9422)) {
                                }
                                if (!z10) {
                                }
                                ArrayList arrayList422 = new ArrayList(list7.size() + list5.size() + kVar.a());
                                if (!z10) {
                                }
                                oVar = oVar2;
                                arrayList = arrayList422;
                                aVar = aVar2;
                                z12 = true;
                                int i104222 = i27;
                                aVar.b(f12, e10, arrayList, q0Var, oVar, t3, z13, i21, i104222);
                                int i105222 = e10;
                                ArrayList arrayList5222 = arrayList;
                                o oVar3222 = oVar;
                                if (!t3) {
                                }
                                if (i23 >= c3) {
                                }
                                f0 f0Var222 = (f0) nVar4.b(Integer.valueOf(f12), Integer.valueOf(i105222), new r(arrayList5222, (t) null, t3, d1Var));
                                if (z11) {
                                }
                                sVar = new s(tVar6, i21, z12, f10, f0Var222, f11, z14, yVar2, xVar6, oVar3222.f79c, arrayList2, i48, i55, c3, e0Var, i32, i10);
                            }
                            b0Var.f(sVar, t0Var.t(), false);
                            return sVar;
                        }
                    } else {
                        i10 = D5;
                        xVar = xVar2;
                    }
                    j3 = h10;
                    g8 = ((i1) uVar.f137c).g();
                    w0.r.j(d10, g12, e11);
                    a0Var = b0Var2.f32q;
                    eVar = b0Var2.f29n.f839a;
                    i11 = eVar.f5136i;
                    list = bc.v.f1067g;
                    if (i11 == 0) {
                        i12 = g8;
                        list2 = list;
                        float floatValue2 = (t0Var.t() && z13) ? ((Number) b0Var2.f37v.f6857h.getValue()).floatValue() : b0Var2.f22g;
                        if (this.f90i) {
                        }
                        androidx.compose.foundation.lazy.layout.a aVar22 = b0Var2.f28m;
                        boolean t32 = t0Var.t();
                        s sVar22 = b0Var2.f18c;
                        yc.y yVar22 = (yc.y) this.f94m;
                        d1 d1Var2 = b0Var2.f36u;
                        b0.x xVar32 = xVar;
                        n nVar5 = new n(xVar32, j10, i31, D4);
                        b0.x xVar42 = xVar32;
                        if (D3 < 0) {
                        }
                    }
                    ?? arrayList32 = new ArrayList();
                    if (eVar.f5136i == 0) {
                    }
                    size = a0Var.f797g.size();
                    while (i13 < size) {
                    }
                    i14 = dVar.f6735g;
                    i15 = dVar.f6736h;
                    if (i14 <= i15) {
                    }
                    list = arrayList32;
                    float floatValue22 = (t0Var.t() && z13) ? ((Number) b0Var2.f37v.f6857h.getValue()).floatValue() : b0Var2.f22g;
                    if (this.f90i) {
                    }
                    androidx.compose.foundation.lazy.layout.a aVar222 = b0Var2.f28m;
                    boolean t322 = t0Var.t();
                    s sVar222 = b0Var2.f18c;
                    yc.y yVar222 = (yc.y) this.f94m;
                    d1 d1Var22 = b0Var2.f36u;
                    b0.x xVar322 = xVar;
                    n nVar52 = new n(xVar322, j10, i31, D4);
                    b0.x xVar422 = xVar322;
                    if (D3 < 0) {
                    }
                } catch (Throwable th) {
                    w0.r.j(d10, g12, e11);
                    throw th;
                }
                break;
            default:
                ((Number) obj2).intValue();
                g0.a(this.f89h, (y0.n) this.f92k, this.f90i, (f1.g0) this.f93l, (j0.a) this.f94m, null, this.f91j, (u0.d) this.f95n, (m0.r) obj, m0.z.y(818085889));
                return ac.o.f277a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(oc.a aVar, y0.n nVar, boolean z10, f1.g0 g0Var, j0.a aVar2, g0 g0Var2, z.c0 c0Var, u0.d dVar, int i10) {
        super(2);
        this.f89h = aVar;
        this.f92k = nVar;
        this.f90i = z10;
        this.f93l = g0Var;
        this.f94m = aVar2;
        this.f91j = c0Var;
        this.f95n = dVar;
    }
}
