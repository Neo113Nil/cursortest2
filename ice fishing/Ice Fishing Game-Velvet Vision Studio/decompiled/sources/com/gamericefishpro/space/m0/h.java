package com.gamericefishpro.space.m0;

import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f2.k0;
import com.gamericefishpro.space.f2.m0;
import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.h1.l;
import com.gamericefishpro.space.h2.h0;
import com.gamericefishpro.space.h2.k;
import com.gamericefishpro.space.h2.n0;
import com.gamericefishpro.space.h2.v;
import com.gamericefishpro.space.h2.x1;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.o1.j0;
import com.gamericefishpro.space.o1.q;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.o2.u;
import com.gamericefishpro.space.o2.w;
import com.gamericefishpro.space.ph.c0;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.r2.b0;
import com.gamericefishpro.space.r2.e0;
import com.gamericefishpro.space.r2.f0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.r2.m;
import com.gamericefishpro.space.r2.n;
import com.gamericefishpro.space.r2.o;
import com.gamericefishpro.space.s2.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends l implements v, com.gamericefishpro.space.h2.l, x1 {
    public String H;
    public i0 I;
    public com.gamericefishpro.space.u2.d J;
    public int K;
    public boolean L;
    public int M;
    public int N;
    public HashMap O;
    public d P;
    public f Q;
    public g R;

    public final d A0() {
        if (this.P == null) {
            this.P = new d(this.H, this.I, this.J, this.K, this.L, this.M, this.N);
        }
        d dVar = this.P;
        Intrinsics.b(dVar);
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // com.gamericefishpro.space.h2.v
    public final int C(n0 n0Var, k0 k0Var, int i) {
        d dVarA0;
        g gVar = this.R;
        if (gVar == null) {
            dVarA0 = A0();
        } else {
            if (!gVar.c) {
                gVar = null;
            }
            if (gVar == null || (dVarA0 = gVar.d) == null) {
                dVarA0 = A0();
            }
        }
        dVarA0.d(n0Var);
        return dVarA0.a(i, n0Var.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0038, B:20:0x0044, B:23:0x004e, B:24:0x0075, B:12:0x0015), top: B:29:0x0005 }] */
    @Override // com.gamericefishpro.space.h2.v
    public final m0 F(com.gamericefishpro.space.f2.n0 n0Var, k0 k0Var, long j) {
        d dVarA0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            g gVar = this.R;
            if (gVar == null) {
                dVarA0 = A0();
            } else {
                if (!gVar.c) {
                    gVar = null;
                }
                if (gVar == null || (dVarA0 = gVar.d) == null) {
                    dVarA0 = A0();
                }
            }
            dVarA0.d(n0Var);
            boolean zB = dVarA0.b(j, n0Var.getLayoutDirection());
            o oVar = dVarA0.n;
            if (oVar != null) {
                oVar.c();
            }
            Unit unit = Unit.a;
            com.gamericefishpro.space.r2.a aVar = dVarA0.j;
            Intrinsics.b(aVar);
            i iVar = aVar.d;
            long j2 = dVarA0.l;
            if (zB) {
                k.q(this, 2).R0();
                HashMap map = this.O;
                if (map == null) {
                    map = new HashMap(2);
                    this.O = map;
                }
                map.put(com.gamericefishpro.space.f2.d.a, Integer.valueOf(Math.round(iVar.c(0))));
                map.put(com.gamericefishpro.space.f2.d.b, Integer.valueOf(Math.round(iVar.c(iVar.f - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            u0 u0VarE = k0Var.e(d5.y(i, i, i2, i2));
            HashMap map2 = this.O;
            Intrinsics.b(map2);
            return n0Var.y(i, i2, map2, new com.gamericefishpro.space.d0.k(u0VarE, 4));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.gamericefishpro.space.oh.d] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.gamericefishpro.space.m0.f] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // com.gamericefishpro.space.h2.x1
    public final void L(w wVar) {
        f fVar = this.Q;
        ?? r0 = fVar;
        if (fVar == null) {
            final int i = 0;
            ?? r1 = new Function1(this) { // from class: com.gamericefishpro.space.m0.f
                public final /* synthetic */ h e;

                {
                    this.e = this;
                }

                /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
                /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    com.gamericefishpro.space.c3.c cVar;
                    f0 f0Var;
                    com.gamericefishpro.space.f1.k kVar;
                    int i2;
                    com.gamericefishpro.space.f1.k kVar2;
                    int iG;
                    f0 f0Var2;
                    boolean z;
                    switch (i) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            List list = (List) obj;
                            h hVar = this.e;
                            d dVarA0 = hVar.A0();
                            i0 i0VarB = i0.b(hVar.I, s.g, 0L, null, 0L, 0, 0L, 16777214);
                            com.gamericefishpro.space.c3.l lVar = dVarA0.o;
                            if (lVar == null || (cVar = dVarA0.i) == null) {
                                f0Var = null;
                            } else {
                                com.gamericefishpro.space.r2.e eVar = new com.gamericefishpro.space.r2.e(dVarA0.a);
                                if (dVarA0.j == null || dVarA0.n == null) {
                                    f0Var = null;
                                } else {
                                    long j = dVarA0.p & (-8589934589L);
                                    g0 g0Var = g0.d;
                                    int i3 = dVarA0.f;
                                    boolean z2 = dVarA0.e;
                                    int i4 = dVarA0.d;
                                    com.gamericefishpro.space.u2.d dVar = dVarA0.c;
                                    e0 e0Var = new e0(eVar, i0VarB, g0Var, i3, z2, i4, cVar, lVar, dVar, j);
                                    com.gamericefishpro.space.b1.d dVar2 = new com.gamericefishpro.space.b1.d(eVar, i0VarB, g0Var, cVar, dVar);
                                    int i5 = dVarA0.f;
                                    int i6 = dVarA0.d;
                                    com.gamericefishpro.space.f1.k kVar3 = new com.gamericefishpro.space.f1.k();
                                    kVar3.c = dVar2;
                                    kVar3.a = i5;
                                    if (com.gamericefishpro.space.c3.a.j(j) != 0 || com.gamericefishpro.space.c3.a.i(j) != 0) {
                                        com.gamericefishpro.space.w2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = (ArrayList) dVar2.w;
                                    int size = arrayList2.size();
                                    float f = 0.0f;
                                    int i7 = 0;
                                    int i8 = 0;
                                    while (true) {
                                        if (i7 < size) {
                                            n nVar = (n) arrayList2.get(i7);
                                            com.gamericefishpro.space.y2.c cVar2 = nVar.a;
                                            int iH = com.gamericefishpro.space.c3.a.h(j);
                                            if (com.gamericefishpro.space.c3.a.c(j)) {
                                                kVar2 = kVar3;
                                                iG = com.gamericefishpro.space.c3.a.g(j) - ((int) Math.ceil(f));
                                                if (iG < 0) {
                                                    iG = 0;
                                                }
                                            } else {
                                                kVar2 = kVar3;
                                                iG = com.gamericefishpro.space.c3.a.g(j);
                                            }
                                            long jB = com.gamericefishpro.space.c3.b.b(iH, iG, 5);
                                            com.gamericefishpro.space.f1.k kVar4 = kVar2;
                                            float f2 = f;
                                            kVar = kVar4;
                                            int i9 = i7;
                                            com.gamericefishpro.space.r2.a aVar = new com.gamericefishpro.space.r2.a(cVar2, kVar4.a - i8, i6, jB);
                                            float fB = aVar.b() + f2;
                                            i iVar = aVar.d;
                                            int i10 = i8 + iVar.f;
                                            i2 = i10;
                                            arrayList.add(new m(aVar, nVar.b, nVar.c, i8, i10, f2, fB));
                                            if (!iVar.d && (i2 != kVar.a || i9 == x.e((ArrayList) ((com.gamericefishpro.space.b1.d) kVar.c).w))) {
                                                i7 = i9 + 1;
                                                i8 = i2;
                                                f = fB;
                                                kVar3 = kVar;
                                            }
                                        } else {
                                            kVar = kVar3;
                                            i2 = i8;
                                        }
                                    }
                                    kVar.b = i2;
                                    kVar.e = arrayList;
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size2 = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        m mVar = (m) arrayList.get(i11);
                                        ?? r11 = mVar.a.f;
                                        ArrayList arrayList4 = new ArrayList(r11.size());
                                        int size3 = r11.size();
                                        int i12 = 0;
                                        while (i12 < size3) {
                                            com.gamericefishpro.space.n1.c cVar3 = (com.gamericefishpro.space.n1.c) r11.get(i12);
                                            arrayList4.add(cVar3 != null ? cVar3.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(mVar.f)) & 4294967295L)) : null);
                                            i12++;
                                            size2 = size2;
                                            i11 = i11;
                                        }
                                        c0.l(arrayList3, arrayList4);
                                        i11++;
                                    }
                                    if (arrayList3.size() < ((List) ((com.gamericefishpro.space.b1.d) kVar.c).i).size()) {
                                        int size4 = ((List) ((com.gamericefishpro.space.b1.d) kVar.c).i).size() - arrayList3.size();
                                        ArrayList arrayList5 = new ArrayList(size4);
                                        for (int i13 = 0; i13 < size4; i13++) {
                                            arrayList5.add(null);
                                        }
                                        arrayList3 = CollectionsKt.F(arrayList3, arrayList5);
                                    }
                                    kVar.d = arrayList3;
                                    f0Var = new f0(e0Var, kVar, dVarA0.l);
                                }
                            }
                            if (f0Var != null) {
                                list.add(f0Var);
                                f0Var2 = f0Var;
                            } else {
                                f0Var2 = null;
                            }
                            return Boolean.valueOf(f0Var2 != null);
                        case 1:
                            String str = ((com.gamericefishpro.space.r2.e) obj).e;
                            h hVar2 = this.e;
                            g gVar = hVar2.R;
                            if (gVar == null) {
                                g gVar2 = new g(hVar2.H, str);
                                d dVar3 = new d(str, hVar2.I, hVar2.J, hVar2.K, hVar2.L, hVar2.M, hVar2.N);
                                dVar3.d(hVar2.A0().i);
                                gVar2.d = dVar3;
                                hVar2.R = gVar2;
                            } else if (!Intrinsics.a(str, gVar.b)) {
                                gVar.b = str;
                                d dVar4 = gVar.d;
                                if (dVar4 != null) {
                                    i0 i0Var = hVar2.I;
                                    com.gamericefishpro.space.u2.d dVar5 = hVar2.J;
                                    int i14 = hVar2.K;
                                    boolean z3 = hVar2.L;
                                    int i15 = hVar2.M;
                                    int i16 = hVar2.N;
                                    dVar4.a = str;
                                    dVar4.b = i0Var;
                                    dVar4.c = dVar5;
                                    dVar4.d = i14;
                                    dVar4.e = z3;
                                    dVar4.f = i15;
                                    dVar4.g = i16;
                                    dVar4.s = (dVar4.s << 2) | 2;
                                    dVar4.c();
                                }
                            }
                            k.l(hVar2);
                            k.k(hVar2);
                            k.j(hVar2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            h hVar3 = this.e;
                            g gVar3 = hVar3.R;
                            if (gVar3 == null) {
                                z = false;
                            } else {
                                gVar3.c = zBooleanValue;
                                k.l(hVar3);
                                k.k(hVar3);
                                k.j(hVar3);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.Q = r1;
            r0 = r1;
        }
        com.gamericefishpro.space.r2.e eVar = new com.gamericefishpro.space.r2.e(this.H);
        com.gamericefishpro.space.ki.d[] dVarArr = u.a;
        wVar.b(com.gamericefishpro.space.o2.s.A, com.gamericefishpro.space.ph.w.c(eVar));
        g gVar = this.R;
        if (gVar != null) {
            boolean z = gVar.c;
            com.gamericefishpro.space.o2.v vVar = com.gamericefishpro.space.o2.s.C;
            com.gamericefishpro.space.ki.d[] dVarArr2 = u.a;
            com.gamericefishpro.space.ki.d dVar = dVarArr2[17];
            wVar.b(vVar, Boolean.valueOf(z));
            com.gamericefishpro.space.r2.e eVar2 = new com.gamericefishpro.space.r2.e(gVar.b);
            com.gamericefishpro.space.o2.v vVar2 = com.gamericefishpro.space.o2.s.B;
            com.gamericefishpro.space.ki.d dVar2 = dVarArr2[16];
            wVar.b(vVar2, eVar2);
        }
        final int i2 = 1;
        wVar.b(com.gamericefishpro.space.o2.k.l, new com.gamericefishpro.space.o2.a(null, new Function1(this) { // from class: com.gamericefishpro.space.m0.f
            public final /* synthetic */ h e;

            {
                this.e = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.c3.c cVar;
                f0 f0Var;
                com.gamericefishpro.space.f1.k kVar;
                int i3;
                com.gamericefishpro.space.f1.k kVar2;
                int iG;
                f0 f0Var2;
                boolean z2;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        List list = (List) obj;
                        h hVar = this.e;
                        d dVarA0 = hVar.A0();
                        i0 i0VarB = i0.b(hVar.I, s.g, 0L, null, 0L, 0, 0L, 16777214);
                        com.gamericefishpro.space.c3.l lVar = dVarA0.o;
                        if (lVar == null || (cVar = dVarA0.i) == null) {
                            f0Var = null;
                        } else {
                            com.gamericefishpro.space.r2.e eVar3 = new com.gamericefishpro.space.r2.e(dVarA0.a);
                            if (dVarA0.j == null || dVarA0.n == null) {
                                f0Var = null;
                            } else {
                                long j = dVarA0.p & (-8589934589L);
                                g0 g0Var = g0.d;
                                int i4 = dVarA0.f;
                                boolean z3 = dVarA0.e;
                                int i5 = dVarA0.d;
                                com.gamericefishpro.space.u2.d dVar3 = dVarA0.c;
                                e0 e0Var = new e0(eVar3, i0VarB, g0Var, i4, z3, i5, cVar, lVar, dVar3, j);
                                com.gamericefishpro.space.b1.d dVar4 = new com.gamericefishpro.space.b1.d(eVar3, i0VarB, g0Var, cVar, dVar3);
                                int i6 = dVarA0.f;
                                int i7 = dVarA0.d;
                                com.gamericefishpro.space.f1.k kVar3 = new com.gamericefishpro.space.f1.k();
                                kVar3.c = dVar4;
                                kVar3.a = i6;
                                if (com.gamericefishpro.space.c3.a.j(j) != 0 || com.gamericefishpro.space.c3.a.i(j) != 0) {
                                    com.gamericefishpro.space.w2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = (ArrayList) dVar4.w;
                                int size = arrayList2.size();
                                float f = 0.0f;
                                int i8 = 0;
                                int i9 = 0;
                                while (true) {
                                    if (i8 < size) {
                                        n nVar = (n) arrayList2.get(i8);
                                        com.gamericefishpro.space.y2.c cVar2 = nVar.a;
                                        int iH = com.gamericefishpro.space.c3.a.h(j);
                                        if (com.gamericefishpro.space.c3.a.c(j)) {
                                            kVar2 = kVar3;
                                            iG = com.gamericefishpro.space.c3.a.g(j) - ((int) Math.ceil(f));
                                            if (iG < 0) {
                                                iG = 0;
                                            }
                                        } else {
                                            kVar2 = kVar3;
                                            iG = com.gamericefishpro.space.c3.a.g(j);
                                        }
                                        long jB = com.gamericefishpro.space.c3.b.b(iH, iG, 5);
                                        com.gamericefishpro.space.f1.k kVar4 = kVar2;
                                        float f2 = f;
                                        kVar = kVar4;
                                        int i10 = i8;
                                        com.gamericefishpro.space.r2.a aVar = new com.gamericefishpro.space.r2.a(cVar2, kVar4.a - i9, i7, jB);
                                        float fB = aVar.b() + f2;
                                        i iVar = aVar.d;
                                        int i11 = i9 + iVar.f;
                                        i3 = i11;
                                        arrayList.add(new m(aVar, nVar.b, nVar.c, i9, i11, f2, fB));
                                        if (!iVar.d && (i3 != kVar.a || i10 == x.e((ArrayList) ((com.gamericefishpro.space.b1.d) kVar.c).w))) {
                                            i8 = i10 + 1;
                                            i9 = i3;
                                            f = fB;
                                            kVar3 = kVar;
                                        }
                                    } else {
                                        kVar = kVar3;
                                        i3 = i9;
                                    }
                                }
                                kVar.b = i3;
                                kVar.e = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                int size2 = arrayList.size();
                                int i12 = 0;
                                while (i12 < size2) {
                                    m mVar = (m) arrayList.get(i12);
                                    ?? r11 = mVar.a.f;
                                    ArrayList arrayList4 = new ArrayList(r11.size());
                                    int size3 = r11.size();
                                    int i13 = 0;
                                    while (i13 < size3) {
                                        com.gamericefishpro.space.n1.c cVar3 = (com.gamericefishpro.space.n1.c) r11.get(i13);
                                        arrayList4.add(cVar3 != null ? cVar3.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(mVar.f)) & 4294967295L)) : null);
                                        i13++;
                                        size2 = size2;
                                        i12 = i12;
                                    }
                                    c0.l(arrayList3, arrayList4);
                                    i12++;
                                }
                                if (arrayList3.size() < ((List) ((com.gamericefishpro.space.b1.d) kVar.c).i).size()) {
                                    int size4 = ((List) ((com.gamericefishpro.space.b1.d) kVar.c).i).size() - arrayList3.size();
                                    ArrayList arrayList5 = new ArrayList(size4);
                                    for (int i14 = 0; i14 < size4; i14++) {
                                        arrayList5.add(null);
                                    }
                                    arrayList3 = CollectionsKt.F(arrayList3, arrayList5);
                                }
                                kVar.d = arrayList3;
                                f0Var = new f0(e0Var, kVar, dVarA0.l);
                            }
                        }
                        if (f0Var != null) {
                            list.add(f0Var);
                            f0Var2 = f0Var;
                        } else {
                            f0Var2 = null;
                        }
                        return Boolean.valueOf(f0Var2 != null);
                    case 1:
                        String str = ((com.gamericefishpro.space.r2.e) obj).e;
                        h hVar2 = this.e;
                        g gVar2 = hVar2.R;
                        if (gVar2 == null) {
                            g gVar3 = new g(hVar2.H, str);
                            d dVar5 = new d(str, hVar2.I, hVar2.J, hVar2.K, hVar2.L, hVar2.M, hVar2.N);
                            dVar5.d(hVar2.A0().i);
                            gVar3.d = dVar5;
                            hVar2.R = gVar3;
                        } else if (!Intrinsics.a(str, gVar2.b)) {
                            gVar2.b = str;
                            d dVar6 = gVar2.d;
                            if (dVar6 != null) {
                                i0 i0Var = hVar2.I;
                                com.gamericefishpro.space.u2.d dVar7 = hVar2.J;
                                int i15 = hVar2.K;
                                boolean z4 = hVar2.L;
                                int i16 = hVar2.M;
                                int i17 = hVar2.N;
                                dVar6.a = str;
                                dVar6.b = i0Var;
                                dVar6.c = dVar7;
                                dVar6.d = i15;
                                dVar6.e = z4;
                                dVar6.f = i16;
                                dVar6.g = i17;
                                dVar6.s = (dVar6.s << 2) | 2;
                                dVar6.c();
                            }
                        }
                        k.l(hVar2);
                        k.k(hVar2);
                        k.j(hVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar3 = this.e;
                        g gVar4 = hVar3.R;
                        if (gVar4 == null) {
                            z2 = false;
                        } else {
                            gVar4.c = zBooleanValue;
                            k.l(hVar3);
                            k.k(hVar3);
                            k.j(hVar3);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        wVar.b(com.gamericefishpro.space.o2.k.m, new com.gamericefishpro.space.o2.a(null, new Function1(this) { // from class: com.gamericefishpro.space.m0.f
            public final /* synthetic */ h e;

            {
                this.e = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.c3.c cVar;
                f0 f0Var;
                com.gamericefishpro.space.f1.k kVar;
                int i4;
                com.gamericefishpro.space.f1.k kVar2;
                int iG;
                f0 f0Var2;
                boolean z2;
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        List list = (List) obj;
                        h hVar = this.e;
                        d dVarA0 = hVar.A0();
                        i0 i0VarB = i0.b(hVar.I, s.g, 0L, null, 0L, 0, 0L, 16777214);
                        com.gamericefishpro.space.c3.l lVar = dVarA0.o;
                        if (lVar == null || (cVar = dVarA0.i) == null) {
                            f0Var = null;
                        } else {
                            com.gamericefishpro.space.r2.e eVar3 = new com.gamericefishpro.space.r2.e(dVarA0.a);
                            if (dVarA0.j == null || dVarA0.n == null) {
                                f0Var = null;
                            } else {
                                long j = dVarA0.p & (-8589934589L);
                                g0 g0Var = g0.d;
                                int i5 = dVarA0.f;
                                boolean z3 = dVarA0.e;
                                int i6 = dVarA0.d;
                                com.gamericefishpro.space.u2.d dVar3 = dVarA0.c;
                                e0 e0Var = new e0(eVar3, i0VarB, g0Var, i5, z3, i6, cVar, lVar, dVar3, j);
                                com.gamericefishpro.space.b1.d dVar4 = new com.gamericefishpro.space.b1.d(eVar3, i0VarB, g0Var, cVar, dVar3);
                                int i7 = dVarA0.f;
                                int i8 = dVarA0.d;
                                com.gamericefishpro.space.f1.k kVar3 = new com.gamericefishpro.space.f1.k();
                                kVar3.c = dVar4;
                                kVar3.a = i7;
                                if (com.gamericefishpro.space.c3.a.j(j) != 0 || com.gamericefishpro.space.c3.a.i(j) != 0) {
                                    com.gamericefishpro.space.w2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = (ArrayList) dVar4.w;
                                int size = arrayList2.size();
                                float f = 0.0f;
                                int i9 = 0;
                                int i10 = 0;
                                while (true) {
                                    if (i9 < size) {
                                        n nVar = (n) arrayList2.get(i9);
                                        com.gamericefishpro.space.y2.c cVar2 = nVar.a;
                                        int iH = com.gamericefishpro.space.c3.a.h(j);
                                        if (com.gamericefishpro.space.c3.a.c(j)) {
                                            kVar2 = kVar3;
                                            iG = com.gamericefishpro.space.c3.a.g(j) - ((int) Math.ceil(f));
                                            if (iG < 0) {
                                                iG = 0;
                                            }
                                        } else {
                                            kVar2 = kVar3;
                                            iG = com.gamericefishpro.space.c3.a.g(j);
                                        }
                                        long jB = com.gamericefishpro.space.c3.b.b(iH, iG, 5);
                                        com.gamericefishpro.space.f1.k kVar4 = kVar2;
                                        float f2 = f;
                                        kVar = kVar4;
                                        int i11 = i9;
                                        com.gamericefishpro.space.r2.a aVar = new com.gamericefishpro.space.r2.a(cVar2, kVar4.a - i10, i8, jB);
                                        float fB = aVar.b() + f2;
                                        i iVar = aVar.d;
                                        int i12 = i10 + iVar.f;
                                        i4 = i12;
                                        arrayList.add(new m(aVar, nVar.b, nVar.c, i10, i12, f2, fB));
                                        if (!iVar.d && (i4 != kVar.a || i11 == x.e((ArrayList) ((com.gamericefishpro.space.b1.d) kVar.c).w))) {
                                            i9 = i11 + 1;
                                            i10 = i4;
                                            f = fB;
                                            kVar3 = kVar;
                                        }
                                    } else {
                                        kVar = kVar3;
                                        i4 = i10;
                                    }
                                }
                                kVar.b = i4;
                                kVar.e = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                int size2 = arrayList.size();
                                int i13 = 0;
                                while (i13 < size2) {
                                    m mVar = (m) arrayList.get(i13);
                                    ?? r11 = mVar.a.f;
                                    ArrayList arrayList4 = new ArrayList(r11.size());
                                    int size3 = r11.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        com.gamericefishpro.space.n1.c cVar3 = (com.gamericefishpro.space.n1.c) r11.get(i14);
                                        arrayList4.add(cVar3 != null ? cVar3.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(mVar.f)) & 4294967295L)) : null);
                                        i14++;
                                        size2 = size2;
                                        i13 = i13;
                                    }
                                    c0.l(arrayList3, arrayList4);
                                    i13++;
                                }
                                if (arrayList3.size() < ((List) ((com.gamericefishpro.space.b1.d) kVar.c).i).size()) {
                                    int size4 = ((List) ((com.gamericefishpro.space.b1.d) kVar.c).i).size() - arrayList3.size();
                                    ArrayList arrayList5 = new ArrayList(size4);
                                    for (int i15 = 0; i15 < size4; i15++) {
                                        arrayList5.add(null);
                                    }
                                    arrayList3 = CollectionsKt.F(arrayList3, arrayList5);
                                }
                                kVar.d = arrayList3;
                                f0Var = new f0(e0Var, kVar, dVarA0.l);
                            }
                        }
                        if (f0Var != null) {
                            list.add(f0Var);
                            f0Var2 = f0Var;
                        } else {
                            f0Var2 = null;
                        }
                        return Boolean.valueOf(f0Var2 != null);
                    case 1:
                        String str = ((com.gamericefishpro.space.r2.e) obj).e;
                        h hVar2 = this.e;
                        g gVar2 = hVar2.R;
                        if (gVar2 == null) {
                            g gVar3 = new g(hVar2.H, str);
                            d dVar5 = new d(str, hVar2.I, hVar2.J, hVar2.K, hVar2.L, hVar2.M, hVar2.N);
                            dVar5.d(hVar2.A0().i);
                            gVar3.d = dVar5;
                            hVar2.R = gVar3;
                        } else if (!Intrinsics.a(str, gVar2.b)) {
                            gVar2.b = str;
                            d dVar6 = gVar2.d;
                            if (dVar6 != null) {
                                i0 i0Var = hVar2.I;
                                com.gamericefishpro.space.u2.d dVar7 = hVar2.J;
                                int i16 = hVar2.K;
                                boolean z4 = hVar2.L;
                                int i17 = hVar2.M;
                                int i18 = hVar2.N;
                                dVar6.a = str;
                                dVar6.b = i0Var;
                                dVar6.c = dVar7;
                                dVar6.d = i16;
                                dVar6.e = z4;
                                dVar6.f = i17;
                                dVar6.g = i18;
                                dVar6.s = (dVar6.s << 2) | 2;
                                dVar6.c();
                            }
                        }
                        k.l(hVar2);
                        k.k(hVar2);
                        k.j(hVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar3 = this.e;
                        g gVar4 = hVar3.R;
                        if (gVar4 == null) {
                            z2 = false;
                        } else {
                            gVar4.c = zBooleanValue;
                            k.l(hVar3);
                            k.k(hVar3);
                            k.j(hVar3);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        wVar.b(com.gamericefishpro.space.o2.k.n, new com.gamericefishpro.space.o2.a(null, new com.gamericefishpro.space.a3.b(13, this)));
        wVar.b(com.gamericefishpro.space.o2.k.a, new com.gamericefishpro.space.o2.a(null, r0));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // com.gamericefishpro.space.h2.v
    public final int N(n0 n0Var, k0 k0Var, int i) {
        d dVarA0;
        g gVar = this.R;
        if (gVar == null) {
            dVarA0 = A0();
        } else {
            if (!gVar.c) {
                gVar = null;
            }
            if (gVar == null || (dVarA0 = gVar.d) == null) {
                dVarA0 = A0();
            }
        }
        dVarA0.d(n0Var);
        return com.gamericefishpro.space.u6.f.m(dVarA0.e(n0Var.getLayoutDirection()).a());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // com.gamericefishpro.space.h2.v
    public final int Z(n0 n0Var, k0 k0Var, int i) {
        d dVarA0;
        g gVar = this.R;
        if (gVar == null) {
            dVarA0 = A0();
        } else {
            if (!gVar.c) {
                gVar = null;
            }
            if (gVar == null || (dVarA0 = gVar.d) == null) {
                dVarA0 = A0();
            }
        }
        dVarA0.d(n0Var);
        return dVarA0.a(i, n0Var.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0018  */
    @Override // com.gamericefishpro.space.h2.l
    public final void f(h0 h0Var) {
        d dVarA0;
        if (this.G) {
            g gVar = this.R;
            if (gVar == null) {
                dVarA0 = A0();
            } else {
                if (!gVar.c) {
                    gVar = null;
                }
                if (gVar == null || (dVarA0 = gVar.d) == null) {
                    dVarA0 = A0();
                }
            }
            com.gamericefishpro.space.r2.a aVar = dVarA0.j;
            if (aVar == null) {
                com.gamericefishpro.space.c0.a.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.P + ", textSubstitution=" + this.R + ')');
                throw new com.gamericefishpro.space.oh.e();
            }
            q qVarJ = h0Var.d.e.j();
            boolean z = dVarA0.k;
            if (z) {
                long j = dVarA0.l;
                qVarJ.k();
                qVarJ.f(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                b0 b0Var = this.I.a;
                com.gamericefishpro.space.b3.l lVar = b0Var.m;
                if (lVar == null) {
                    lVar = com.gamericefishpro.space.b3.l.b;
                }
                j0 j0Var = b0Var.n;
                if (j0Var == null) {
                    j0Var = j0.d;
                }
                com.gamericefishpro.space.q1.c cVar = b0Var.o;
                if (cVar == null) {
                    cVar = com.gamericefishpro.space.q1.f.b;
                }
                com.gamericefishpro.space.o1.o oVarC = b0Var.a.c();
                if (oVarC != null) {
                    float fA = this.I.a.a.a();
                    com.gamericefishpro.space.y2.e eVar = aVar.a.z;
                    int i = eVar.c;
                    eVar.c(oVarC, (((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.c())) << 32), fA);
                    eVar.f(j0Var);
                    eVar.g(lVar);
                    eVar.e(cVar);
                    eVar.b(3);
                    aVar.d(qVarJ);
                    eVar.b(i);
                } else {
                    long jA = s.g;
                    if (jA == 16) {
                        jA = this.I.a() != 16 ? this.I.a() : s.b;
                    }
                    com.gamericefishpro.space.y2.e eVar2 = aVar.a.z;
                    int i2 = eVar2.c;
                    eVar2.d(jA);
                    eVar2.f(j0Var);
                    eVar2.g(lVar);
                    eVar2.e(cVar);
                    eVar2.b(3);
                    aVar.d(qVarJ);
                    eVar2.b(i2);
                }
            } finally {
                if (z) {
                    qVarJ.i();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // com.gamericefishpro.space.h2.v
    public final int k0(n0 n0Var, k0 k0Var, int i) {
        d dVarA0;
        g gVar = this.R;
        if (gVar == null) {
            dVarA0 = A0();
        } else {
            if (!gVar.c) {
                gVar = null;
            }
            if (gVar == null || (dVarA0 = gVar.d) == null) {
                dVarA0 = A0();
            }
        }
        dVarA0.d(n0Var);
        return com.gamericefishpro.space.u6.f.m(dVarA0.e(n0Var.getLayoutDirection()).i());
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }
}
