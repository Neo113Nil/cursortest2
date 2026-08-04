package com.gamericefishpro.space.k3;

import com.gamericefishpro.space.l3.n;
import com.gamericefishpro.space.l3.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    public b[] A0;
    public b[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final com.gamericefishpro.space.l3.b K0;
    public ArrayList p0 = new ArrayList();
    public final com.gamericefishpro.space.a8.c q0 = new com.gamericefishpro.space.a8.c(this);
    public final com.gamericefishpro.space.l3.e r0;
    public int s0;
    public com.gamericefishpro.space.n3.f t0;
    public boolean u0;
    public final com.gamericefishpro.space.i3.c v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public e() {
        com.gamericefishpro.space.l3.e eVar = new com.gamericefishpro.space.l3.e();
        eVar.b = true;
        eVar.c = true;
        eVar.e = new ArrayList();
        new ArrayList();
        eVar.f = null;
        eVar.g = new com.gamericefishpro.space.l3.b();
        eVar.h = new ArrayList();
        eVar.a = this;
        eVar.d = this;
        this.r0 = eVar;
        this.t0 = null;
        this.u0 = false;
        this.v0 = new com.gamericefishpro.space.i3.c();
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = new b[4];
        this.B0 = new b[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new com.gamericefishpro.space.l3.b();
    }

    public static void Q(d dVar, com.gamericefishpro.space.n3.f fVar, com.gamericefishpro.space.l3.b bVar) {
        int i;
        int i2;
        if (fVar == null) {
            return;
        }
        int i3 = dVar.f0;
        int[] iArr = dVar.s;
        if (i3 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.e = 0;
            bVar.f = 0;
            return;
        }
        int[] iArr2 = dVar.o0;
        bVar.a = iArr2[0];
        bVar.b = iArr2[1];
        bVar.c = dVar.n();
        bVar.d = dVar.k();
        bVar.i = false;
        bVar.j = 0;
        boolean z = bVar.a == 3;
        boolean z2 = bVar.b == 3;
        boolean z3 = z && dVar.V > 0.0f;
        boolean z4 = z2 && dVar.V > 0.0f;
        if (z && dVar.q(0) && dVar.q == 0 && !z3) {
            bVar.a = 2;
            if (z2 && dVar.r == 0) {
                bVar.a = 1;
            }
            z = false;
        }
        if (z2 && dVar.q(1) && dVar.r == 0 && !z4) {
            bVar.b = 2;
            if (z && dVar.q == 0) {
                bVar.b = 1;
            }
            z2 = false;
        }
        if (dVar.x()) {
            bVar.a = 1;
            z = false;
        }
        if (dVar.y()) {
            bVar.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                bVar.a = 1;
            } else if (!z2) {
                if (bVar.b == 1) {
                    i2 = bVar.d;
                } else {
                    bVar.a = 2;
                    fVar.b(dVar, bVar);
                    i2 = bVar.f;
                }
                bVar.a = 1;
                bVar.c = (int) (dVar.V * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                bVar.b = 1;
            } else if (!z) {
                if (bVar.a == 1) {
                    i = bVar.c;
                } else {
                    bVar.b = 2;
                    fVar.b(dVar, bVar);
                    i = bVar.e;
                }
                bVar.b = 1;
                if (dVar.W == -1) {
                    bVar.d = (int) (i / dVar.V);
                } else {
                    bVar.d = (int) (dVar.V * i);
                }
            }
        }
        fVar.b(dVar, bVar);
        dVar.J(bVar.e);
        dVar.G(bVar.f);
        dVar.D = bVar.h;
        dVar.D(bVar.g);
        bVar.j = 0;
    }

    @Override // com.gamericefishpro.space.k3.d
    public final void C(com.gamericefishpro.space.a8.c cVar) {
        super.C(cVar);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.p0.get(i)).C(cVar);
        }
    }

    @Override // com.gamericefishpro.space.k3.d
    public final void K(boolean z, boolean z2) {
        super.K(z, z2);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.p0.get(i)).K(z, z2);
        }
    }

    public final void M(d dVar, int i) {
        if (i == 0) {
            int i2 = this.y0 + 1;
            b[] bVarArr = this.B0;
            if (i2 >= bVarArr.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.B0;
            int i3 = this.y0;
            bVarArr2[i3] = new b(dVar, 0, this.u0);
            this.y0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.z0 + 1;
            b[] bVarArr3 = this.A0;
            if (i4 >= bVarArr3.length) {
                this.A0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.A0;
            int i5 = this.z0;
            bVarArr4[i5] = new b(dVar, 1, this.u0);
            this.z0 = i5 + 1;
        }
    }

    public final void N(com.gamericefishpro.space.i3.c cVar) {
        e eVar;
        com.gamericefishpro.space.i3.c cVar2;
        boolean zR = R(64);
        b(cVar, zR);
        int size = this.p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.p0.get(i);
            boolean[] zArr = dVar.R;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                d dVar2 = (d) this.p0.get(i2);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i3 = 0; i3 < aVar.q0; i3++) {
                        d dVar3 = aVar.p0[i3];
                        if (aVar.s0 || dVar3.c()) {
                            int i4 = aVar.r0;
                            if (i4 == 0 || i4 == 1) {
                                dVar3.R[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                dVar3.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            d dVar4 = (d) this.p0.get(i5);
            dVar4.getClass();
            boolean z2 = dVar4 instanceof g;
            if (z2 || (dVar4 instanceof h)) {
                if (z2) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, zR);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                g gVar = (g) ((d) it.next());
                for (int i6 = 0; i6 < gVar.q0; i6++) {
                    if (hashSet.contains(gVar.p0[i6])) {
                        gVar.b(cVar, zR);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, zR);
                }
                hashSet.clear();
            }
        }
        if (com.gamericefishpro.space.i3.c.p) {
            HashSet<d> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar5 = (d) this.p0.get(i7);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.o0[0] == 2 ? 0 : 1, false);
            for (d dVar6 : hashSet2) {
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, zR);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i8 = 0; i8 < size; i8++) {
                d dVar7 = (d) eVar.p0.get(i8);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.o0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        dVar7.H(1);
                    }
                    if (i10 == 2) {
                        dVar7.I(1);
                    }
                    dVar7.b(cVar2, zR);
                    if (i9 == 2) {
                        dVar7.H(i9);
                    }
                    if (i10 == 2) {
                        dVar7.I(i10);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, zR);
                    }
                }
            }
        }
        if (eVar.y0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.z0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[PHI: r16
      0x00a4: PHI (r16v3 int) = (r16v0 int), (r16v4 int) binds: [B:32:0x00a1, B:27:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean O(int i, boolean z) {
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        com.gamericefishpro.space.l3.e eVar = this.r0;
        ArrayList arrayList = eVar.e;
        e eVar2 = eVar.a;
        int iJ = eVar2.j(0);
        int[] iArr = eVar2.o0;
        int iJ2 = eVar2.j(1);
        int iO = eVar2.o();
        int iP = eVar2.p();
        if (z && (iJ == 2 || iJ2 == 2)) {
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z3 = z;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                o oVar = (o) obj;
                if (oVar.f == i && !oVar.k()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && iJ == 2) {
                    eVar2.H(1);
                    eVar2.J(eVar.d(eVar2, 0));
                    eVar2.d.e.d(eVar2.n());
                }
            } else if (z3 && iJ2 == 2) {
                eVar2.I(1);
                eVar2.G(eVar.d(eVar2, 1));
                eVar2.e.e.d(eVar2.k());
            }
        }
        if (i == 0) {
            i2 = 0;
            int i5 = iArr[0];
            if (i5 == 1 || i5 == 4) {
                int iN = eVar2.n() + iO;
                eVar2.d.i.d(iN);
                eVar2.d.e.d(iN - iO);
                i3 = 1;
            } else {
                i3 = i2;
            }
        } else {
            i2 = 0;
            int i6 = iArr[1];
            if (i6 == 1 || i6 == 4) {
                int iK = eVar2.k() + iP;
                eVar2.e.i.d(iK);
                eVar2.e.e.d(iK - iP);
                i3 = 1;
            } else {
                i3 = i2;
            }
        }
        eVar.g();
        int size2 = arrayList.size();
        int i7 = i2;
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            o oVar2 = (o) obj2;
            if (oVar2.f == i && (oVar2.b != eVar2 || oVar2.g)) {
                oVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i8 = i2;
        while (i8 < size3) {
            Object obj3 = arrayList.get(i8);
            i8++;
            o oVar3 = (o) obj3;
            if (oVar3.f == i && (i3 != 0 || oVar3.b != eVar2)) {
                if (!oVar3.h.j || !oVar3.i.j || (!(oVar3 instanceof com.gamericefishpro.space.l3.c) && !oVar3.e.j)) {
                    z2 = i2;
                    eVar2.H(iJ);
                    eVar2.I(iJ2);
                    return z2;
                }
            }
        }
        z2 = 1;
        eVar2.H(iJ);
        eVar2.I(iJ2);
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:339:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:341:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:349:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:350:0x0602  */
    /* JADX WARN: Code duplicated, block: B:356:0x0616  */
    /* JADX WARN: Code duplicated, block: B:362:0x062f  */
    /* JADX WARN: Code duplicated, block: B:365:0x0635  */
    /* JADX WARN: Code duplicated, block: B:367:0x063d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:370:0x064b  */
    /* JADX WARN: Code duplicated, block: B:376:0x065b  */
    /* JADX WARN: Code duplicated, block: B:380:0x0666  */
    /* JADX WARN: Code duplicated, block: B:383:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:385:0x0677  */
    /* JADX WARN: Code duplicated, block: B:388:0x067f  */
    /* JADX WARN: Code duplicated, block: B:392:0x0686  */
    /* JADX WARN: Code duplicated, block: B:395:0x0690  */
    /* JADX WARN: Code duplicated, block: B:397:0x069c  */
    /* JADX WARN: Code duplicated, block: B:401:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:404:0x06bf A[Catch: Exception -> 0x06cd, LOOP:12: B:403:0x06bd->B:404:0x06bf, LOOP_END, TryCatch #3 {Exception -> 0x06cd, blocks: (B:402:0x06b1, B:404:0x06bf, B:407:0x06d6), top: B:538:0x06b1 }] */
    /* JADX WARN: Code duplicated, block: B:412:0x06e3 A[Catch: Exception -> 0x070c, TRY_LEAVE, TryCatch #4 {Exception -> 0x070c, blocks: (B:410:0x06dd, B:412:0x06e3), top: B:540:0x06dd }] */
    /* JADX WARN: Code duplicated, block: B:428:0x0710  */
    /* JADX WARN: Code duplicated, block: B:431:0x0718 A[Catch: Exception -> 0x0700, TryCatch #0 {Exception -> 0x0700, blocks: (B:417:0x06f9, B:429:0x0714, B:431:0x0718, B:433:0x071e, B:434:0x0738, B:436:0x073c, B:438:0x0742, B:442:0x0758, B:445:0x0763, B:447:0x0767, B:449:0x076d), top: B:532:0x06f9 }] */
    /* JADX WARN: Code duplicated, block: B:436:0x073c A[Catch: Exception -> 0x0700, TryCatch #0 {Exception -> 0x0700, blocks: (B:417:0x06f9, B:429:0x0714, B:431:0x0718, B:433:0x071e, B:434:0x0738, B:436:0x073c, B:438:0x0742, B:442:0x0758, B:445:0x0763, B:447:0x0767, B:449:0x076d), top: B:532:0x06f9 }] */
    /* JADX WARN: Code duplicated, block: B:447:0x0767 A[Catch: Exception -> 0x0700, TryCatch #0 {Exception -> 0x0700, blocks: (B:417:0x06f9, B:429:0x0714, B:431:0x0718, B:433:0x071e, B:434:0x0738, B:436:0x073c, B:438:0x0742, B:442:0x0758, B:445:0x0763, B:447:0x0767, B:449:0x076d), top: B:532:0x06f9 }] */
    /* JADX WARN: Code duplicated, block: B:461:0x0792  */
    /* JADX WARN: Code duplicated, block: B:469:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:471:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:473:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:475:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:478:0x0800  */
    /* JADX WARN: Code duplicated, block: B:480:0x0809 A[LOOP:15: B:479:0x0807->B:480:0x0809, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:484:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:489:0x082a A[LOOP:14: B:488:0x0828->B:489:0x082a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:492:0x085e  */
    /* JADX WARN: Code duplicated, block: B:496:0x0871  */
    /* JADX WARN: Code duplicated, block: B:501:0x0892  */
    /* JADX WARN: Code duplicated, block: B:502:0x089f  */
    /* JADX WARN: Code duplicated, block: B:505:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:506:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:508:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:510:0x08c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:513:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:516:0x08dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:522:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:524:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:525:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:529:0x090b  */
    /* JADX WARN: Code duplicated, block: B:540:0x06dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x06a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.gamericefishpro.space.k3.d, com.gamericefishpro.space.k3.e] */
    /* JADX WARN: Type inference failed for: r4v55, types: [int] */
    /* JADX WARN: Type inference failed for: r5v57, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v74, types: [int] */
    /* JADX WARN: Type inference failed for: r7v22, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    public final void P() {
        ?? r22;
        int i;
        int i2;
        int i3;
        int i4;
        c cVar;
        c cVar2;
        int i5;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i6;
        int i7;
        boolean zR;
        ?? r12;
        int i8;
        boolean z4;
        boolean z5;
        int i9;
        c cVar3;
        boolean z6;
        boolean z7;
        boolean[] zArr;
        boolean[] zArr2;
        int i10;
        boolean z8;
        int iMax;
        ?? r8;
        ?? r18;
        boolean z9;
        int iMax2;
        ?? r0;
        boolean z10;
        boolean z11;
        ?? r1;
        boolean z12;
        ?? r2;
        boolean z13;
        boolean z14;
        ?? r3;
        ?? r4;
        int i11;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zR2;
        int size;
        int i12;
        boolean z15;
        d dVar;
        boolean z16;
        int i13;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        c cVar4;
        d dVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        char c2;
        n nVar;
        n nVar2;
        int i18;
        int iN;
        int i19;
        int iK;
        int size2;
        int i20;
        int i21;
        n nVar3;
        int iB;
        int iB2;
        n nVar4;
        n nVar5;
        int i22;
        boolean z17;
        this.X = 0;
        this.Y = 0;
        this.D0 = false;
        this.E0 = false;
        int size3 = this.p0.size();
        int iMax7 = Math.max(0, n());
        int iMax8 = Math.max(0, k());
        int[] iArr = this.o0;
        int i23 = iArr[1];
        int i24 = iArr[0];
        int i25 = this.s0;
        c cVar5 = this.I;
        c cVar6 = this.H;
        if (i25 == 0 && j.c(this.C0, 1)) {
            com.gamericefishpro.space.n3.f fVar = this.t0;
            int i26 = iArr[0];
            int i27 = iArr[1];
            B();
            ArrayList arrayList = this.p0;
            int size4 = arrayList.size();
            for (int i28 = 0; i28 < size4; i28++) {
                ((d) arrayList.get(i28)).B();
            }
            boolean z18 = this.u0;
            if (i26 == 1) {
                E(0, n());
            } else {
                cVar6.l(0);
                this.X = 0;
            }
            int i29 = 0;
            boolean z19 = false;
            boolean z20 = false;
            while (i29 < size4) {
                int[] iArr2 = iArr;
                d dVar3 = (d) arrayList.get(i29);
                int i30 = i29;
                if (dVar3 instanceof h) {
                    h hVar = (h) dVar3;
                    z17 = z19;
                    if (hVar.t0 == 1) {
                        int i31 = hVar.q0;
                        if (i31 != -1) {
                            hVar.M(i31);
                        } else if (hVar.r0 != -1 && x()) {
                            hVar.M(n() - hVar.r0);
                        } else if (x()) {
                            hVar.M((int) ((hVar.p0 * n()) + 0.5f));
                        }
                        z17 = true;
                    }
                } else {
                    z17 = z19;
                    if ((dVar3 instanceof a) && ((a) dVar3).P() == 0) {
                        z19 = z17;
                        z20 = true;
                    }
                    i29 = i30 + 1;
                    iArr = iArr2;
                }
                z19 = z17;
                i29 = i30 + 1;
                iArr = iArr2;
            }
            r22 = iArr;
            if (z19) {
                for (int i32 = 0; i32 < size4; i32 = i22 + 1) {
                    d dVar4 = (d) arrayList.get(i32);
                    if (dVar4 instanceof h) {
                        h hVar2 = (h) dVar4;
                        i22 = i32;
                        if (hVar2.t0 == 1) {
                            com.gamericefishpro.space.l3.h.c(0, hVar2, fVar, z18);
                        }
                    } else {
                        i22 = i32;
                    }
                }
            }
            com.gamericefishpro.space.l3.h.c(0, this, fVar, z18);
            if (z20) {
                for (int i33 = 0; i33 < size4; i33++) {
                    d dVar5 = (d) arrayList.get(i33);
                    if (dVar5 instanceof a) {
                        a aVar = (a) dVar5;
                        if (aVar.P() == 0 && aVar.O()) {
                            com.gamericefishpro.space.l3.h.c(1, aVar, fVar, z18);
                        }
                    }
                }
            }
            if (i27 == 1) {
                F(0, k());
            } else {
                cVar5.l(0);
                this.Y = 0;
            }
            int i34 = 0;
            boolean z21 = false;
            boolean z22 = false;
            while (i34 < size4) {
                d dVar6 = (d) arrayList.get(i34);
                int i35 = i34;
                if (dVar6 instanceof h) {
                    h hVar3 = (h) dVar6;
                    if (hVar3.t0 == 0) {
                        int i36 = hVar3.q0;
                        if (i36 != -1) {
                            hVar3.M(i36);
                        } else if (hVar3.r0 != -1 && y()) {
                            hVar3.M(k() - hVar3.r0);
                        } else if (y()) {
                            hVar3.M((int) ((hVar3.p0 * k()) + 0.5f));
                        }
                        z21 = true;
                    }
                } else if ((dVar6 instanceof a) && ((a) dVar6).P() == 1) {
                    z22 = true;
                }
                i34 = i35 + 1;
            }
            if (z21) {
                for (int i37 = 0; i37 < size4; i37++) {
                    d dVar7 = (d) arrayList.get(i37);
                    if (dVar7 instanceof h) {
                        h hVar4 = (h) dVar7;
                        if (hVar4.t0 == 0) {
                            com.gamericefishpro.space.l3.h.i(1, hVar4, fVar);
                        }
                    }
                }
            }
            com.gamericefishpro.space.l3.h.i(0, this, fVar);
            if (z22) {
                for (int i38 = 0; i38 < size4; i38++) {
                    d dVar8 = (d) arrayList.get(i38);
                    if (dVar8 instanceof a) {
                        a aVar2 = (a) dVar8;
                        if (aVar2.P() == 1 && aVar2.O()) {
                            com.gamericefishpro.space.l3.h.i(1, aVar2, fVar);
                        }
                    }
                }
            }
            for (int i39 = 0; i39 < size4; i39++) {
                d dVar9 = (d) arrayList.get(i39);
                if (dVar9.w() && com.gamericefishpro.space.l3.h.a(dVar9)) {
                    Q(dVar9, fVar, com.gamericefishpro.space.l3.h.a);
                    if (!(dVar9 instanceof h)) {
                        com.gamericefishpro.space.l3.h.c(0, dVar9, fVar, z18);
                        com.gamericefishpro.space.l3.h.i(0, dVar9, fVar);
                    } else if (((h) dVar9).t0 == 0) {
                        com.gamericefishpro.space.l3.h.i(0, dVar9, fVar);
                    } else {
                        com.gamericefishpro.space.l3.h.c(0, dVar9, fVar, z18);
                    }
                }
            }
            for (int i40 = 0; i40 < size3; i40++) {
                d dVar10 = (d) this.p0.get(i40);
                if (dVar10.w() && !(dVar10 instanceof h) && !(dVar10 instanceof a) && !(dVar10 instanceof g) && !dVar10.E) {
                    int iJ = dVar10.j(0);
                    int iJ2 = dVar10.j(1);
                    if (iJ != 3 || dVar10.q == 1 || iJ2 != 3 || dVar10.r == 1) {
                        Q(dVar10, this.t0, new com.gamericefishpro.space.l3.b());
                    }
                }
            }
        } else {
            r22 = iArr;
        }
        com.gamericefishpro.space.i3.c cVar7 = this.v0;
        if (size3 <= 2 || !((i24 == 2 || i23 == 2) && j.c(this.C0, 1024))) {
            i = size3;
            i2 = iMax8;
            i3 = i23;
            i4 = i24;
            cVar = cVar5;
            cVar2 = cVar6;
            i5 = iMax7;
        } else {
            com.gamericefishpro.space.n3.f fVar2 = this.t0;
            ArrayList arrayList2 = this.p0;
            int size5 = arrayList2.size();
            int i41 = 0;
            while (true) {
                if (i41 < size5) {
                    d dVar11 = (d) arrayList2.get(i41);
                    ?? r5 = r22[0];
                    ?? r6 = r22[1];
                    int i42 = i41;
                    int[] iArr3 = dVar11.o0;
                    cVar2 = cVar6;
                    if (com.gamericefishpro.space.l3.h.h(r5, r6, iArr3[0], iArr3[1]) && !(dVar11 instanceof g)) {
                        i41 = i42 + 1;
                        cVar6 = cVar2;
                    } else {
                        i14 = iMax7;
                        i = size3;
                        i15 = iMax8;
                        i16 = i23;
                        i17 = i24;
                        cVar = cVar5;
                    }
                } else {
                    cVar2 = cVar6;
                    i = size3;
                    cVar = cVar5;
                    int i43 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i43 < size5) {
                        int i44 = i43;
                        d dVar12 = (d) arrayList2.get(i43);
                        int i45 = iMax8;
                        ?? r7 = r22[0];
                        int i46 = i23;
                        ?? r9 = r22[1];
                        int i47 = iMax7;
                        int[] iArr4 = dVar12.o0;
                        int i48 = i24;
                        if (!com.gamericefishpro.space.l3.h.h(r7, r9, iArr4[0], iArr4[1])) {
                            Q(dVar12, fVar2, this.K0);
                        }
                        boolean z23 = dVar12 instanceof h;
                        if (z23) {
                            h hVar5 = (h) dVar12;
                            if (hVar5.t0 == 0) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(hVar5);
                            }
                            if (hVar5.t0 == 1) {
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(hVar5);
                            }
                        }
                        if (dVar12 instanceof i) {
                            if (dVar12 instanceof a) {
                                a aVar3 = (a) dVar12;
                                if (aVar3.P() == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(aVar3);
                                }
                                if (aVar3.P() == 1) {
                                    if (arrayList8 == null) {
                                        arrayList8 = new ArrayList();
                                    }
                                    arrayList8.add(aVar3);
                                }
                            } else {
                                i iVar = (i) dVar12;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(iVar);
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(iVar);
                            }
                        }
                        if (dVar12.H.f == null && dVar12.J.f == null && !z23 && !(dVar12 instanceof a)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(dVar12);
                        }
                        if (dVar12.I.f == null && dVar12.K.f == null && dVar12.L.f == null && !z23 && !(dVar12 instanceof a)) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(dVar12);
                        }
                        i43 = i44 + 1;
                        iMax8 = i45;
                        i23 = i46;
                        iMax7 = i47;
                        i24 = i48;
                    }
                    i14 = iMax7;
                    i15 = iMax8;
                    i16 = i23;
                    i17 = i24;
                    ArrayList arrayList9 = new ArrayList();
                    if (arrayList4 != null) {
                        int size6 = arrayList4.size();
                        int i49 = 0;
                        while (i49 < size6) {
                            Object obj = arrayList4.get(i49);
                            i49++;
                            com.gamericefishpro.space.l3.h.b((h) obj, 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        int size7 = arrayList5.size();
                        int i50 = 0;
                        while (i50 < size7) {
                            Object obj2 = arrayList5.get(i50);
                            i50++;
                            i iVar2 = (i) obj2;
                            n nVarB = com.gamericefishpro.space.l3.h.b(iVar2, 0, arrayList9, null);
                            iVar2.M(0, nVarB, arrayList9);
                            nVarB.a(arrayList9);
                        }
                    }
                    HashSet hashSet = i(2).a;
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            com.gamericefishpro.space.l3.h.b(((c) it.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = i(4).a;
                    if (hashSet2 != null) {
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            com.gamericefishpro.space.l3.h.b(((c) it2.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = i(7).a;
                    if (hashSet3 != null) {
                        Iterator it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            com.gamericefishpro.space.l3.h.b(((c) it3.next()).d, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size8 = arrayList6.size();
                        int i51 = 0;
                        while (i51 < size8) {
                            Object obj3 = arrayList6.get(i51);
                            i51++;
                            com.gamericefishpro.space.l3.h.b((d) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size9 = arrayList7.size();
                        int i52 = 0;
                        while (i52 < size9) {
                            Object obj4 = arrayList7.get(i52);
                            i52++;
                            com.gamericefishpro.space.l3.h.b((h) obj4, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size10 = arrayList8.size();
                        int i53 = 0;
                        while (i53 < size10) {
                            Object obj5 = arrayList8.get(i53);
                            i53++;
                            i iVar3 = (i) obj5;
                            n nVarB2 = com.gamericefishpro.space.l3.h.b(iVar3, 1, arrayList9, null);
                            iVar3.M(1, nVarB2, arrayList9);
                            nVarB2.a(arrayList9);
                        }
                    }
                    HashSet hashSet4 = i(3).a;
                    if (hashSet4 != null) {
                        Iterator it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            com.gamericefishpro.space.l3.h.b(((c) it4.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = i(6).a;
                    if (hashSet5 != null) {
                        Iterator it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            com.gamericefishpro.space.l3.h.b(((c) it5.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = i(5).a;
                    if (hashSet6 != null) {
                        Iterator it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            com.gamericefishpro.space.l3.h.b(((c) it6.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = i(7).a;
                    if (hashSet7 != null) {
                        Iterator it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            com.gamericefishpro.space.l3.h.b(((c) it7.next()).d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList3 != null) {
                        int size11 = arrayList3.size();
                        int i54 = 0;
                        while (i54 < size11) {
                            Object obj6 = arrayList3.get(i54);
                            i54++;
                            com.gamericefishpro.space.l3.h.b((d) obj6, 1, arrayList9, null);
                        }
                    }
                    char c3 = 1;
                    int i55 = 0;
                    while (i55 < size5) {
                        d dVar13 = (d) arrayList2.get(i55);
                        int[] iArr5 = dVar13.o0;
                        if (iArr5[0] == 3 && iArr5[c3] == 3) {
                            int i56 = dVar13.m0;
                            int size12 = arrayList9.size();
                            int i57 = 0;
                            while (true) {
                                if (i57 >= size12) {
                                    nVar4 = null;
                                    break;
                                }
                                nVar4 = (n) arrayList9.get(i57);
                                if (i56 == nVar4.b) {
                                    break;
                                } else {
                                    i57++;
                                }
                            }
                            int i58 = dVar13.n0;
                            int size13 = arrayList9.size();
                            int i59 = 0;
                            while (true) {
                                if (i59 >= size13) {
                                    nVar5 = null;
                                    break;
                                }
                                nVar5 = (n) arrayList9.get(i59);
                                if (i58 == nVar5.b) {
                                    break;
                                } else {
                                    i59++;
                                }
                            }
                            if (nVar4 != null && nVar5 != null) {
                                nVar4.c(0, nVar5);
                                nVar5.c = 2;
                                arrayList9.remove(nVar4);
                            }
                        }
                        i55++;
                        c3 = 1;
                    }
                    if (arrayList9.size() > 1) {
                        if (r22[0] == 2) {
                            int size14 = arrayList9.size();
                            int i60 = 0;
                            int i61 = 0;
                            nVar = null;
                            while (i61 < size14) {
                                Object obj7 = arrayList9.get(i61);
                                i61++;
                                n nVar6 = (n) obj7;
                                if (nVar6.c != 1 && (iB2 = nVar6.b(cVar7, 0)) > i60) {
                                    nVar = nVar6;
                                    i60 = iB2;
                                }
                            }
                            c2 = 1;
                            if (nVar != null) {
                                H(1);
                                J(i60);
                            }
                            if (r22[c2] == 2) {
                                size2 = arrayList9.size();
                                i20 = 0;
                                i21 = 0;
                                nVar2 = null;
                                while (i21 < size2) {
                                    Object obj8 = arrayList9.get(i21);
                                    i21++;
                                    nVar3 = (n) obj8;
                                    if (nVar3.c != 0 && (iB = nVar3.b(cVar7, 1)) > i20) {
                                        nVar2 = nVar3;
                                        i20 = iB;
                                    }
                                }
                                if (nVar2 != null) {
                                    I(1);
                                    G(i20);
                                } else {
                                    nVar2 = null;
                                }
                            } else {
                                nVar2 = null;
                            }
                            if (nVar == null || nVar2 != null) {
                                i4 = i17;
                                if (i4 == 2) {
                                    i18 = i14;
                                    if (i18 < n() || i18 <= 0) {
                                        iN = n();
                                    } else {
                                        J(i18);
                                        this.D0 = true;
                                    }
                                    i3 = i16;
                                    if (i3 == 2) {
                                        i19 = i15;
                                        if (i19 < k() || i19 <= 0) {
                                            iK = k();
                                        } else {
                                            G(i19);
                                            this.E0 = true;
                                        }
                                        i2 = iK;
                                        i5 = iN;
                                        z = true;
                                    } else {
                                        i19 = i15;
                                    }
                                    iK = i19;
                                    i2 = iK;
                                    i5 = iN;
                                    z = true;
                                } else {
                                    i18 = i14;
                                }
                                iN = i18;
                                i3 = i16;
                                if (i3 == 2) {
                                    i19 = i15;
                                    if (i19 < k()) {
                                    }
                                    iK = k();
                                    i2 = iK;
                                    i5 = iN;
                                    z = true;
                                } else {
                                    i19 = i15;
                                }
                                iK = i19;
                                i2 = iK;
                                i5 = iN;
                                z = true;
                            }
                            if (!R(64) || R(128)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            cVar7.getClass();
                            cVar7.g = false;
                            if (this.C0 == 0 && z2) {
                                c = 1;
                                cVar7.g = true;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList10 = this.p0;
                            if (r22[0] != 2 || r22[c] == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.y0 = 0;
                            this.z0 = 0;
                            i6 = i;
                            for (i7 = 0; i7 < i6; i7++) {
                                dVar2 = (d) this.p0.get(i7);
                                if (dVar2 instanceof e) {
                                    ((e) dVar2).P();
                                }
                            }
                            zR = R(64);
                            r12 = z;
                            i8 = 0;
                            z4 = true;
                            while (z4) {
                                i9 = i8 + 1;
                                try {
                                    cVar7.t();
                                    this.y0 = 0;
                                    this.z0 = 0;
                                    g(cVar7);
                                    for (i13 = 0; i13 < i6; i13++) {
                                        ((d) this.p0.get(i13)).g(cVar7);
                                    }
                                    N(cVar7);
                                    try {
                                        weakReference = this.F0;
                                        if (weakReference != null) {
                                            try {
                                                if (weakReference.get() != null) {
                                                    cVar3 = cVar;
                                                    try {
                                                        try {
                                                            z6 = z3;
                                                            try {
                                                                cVar7.f(cVar7.k((c) this.F0.get()), cVar7.k(cVar3), 0, 5);
                                                                this.F0 = null;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                z16 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z7 = z16;
                                                                zArr = j.a;
                                                                if (z7) {
                                                                    zArr[2] = false;
                                                                    zR2 = R(64);
                                                                    L(cVar7, zR2);
                                                                    size = this.p0.size();
                                                                    i12 = 0;
                                                                    z15 = false;
                                                                    while (i12 < size) {
                                                                        dVar = (d) this.p0.get(i12);
                                                                        dVar.L(cVar7, zR2);
                                                                        boolean[] zArr3 = zArr;
                                                                        boolean z24 = zR2;
                                                                        if (dVar.h == -1) {
                                                                            z15 = true;
                                                                        } else {
                                                                            z15 = true;
                                                                        }
                                                                        i12++;
                                                                        zArr = zArr3;
                                                                        zR2 = z24;
                                                                        z15 = z15;
                                                                    }
                                                                    zArr2 = zArr;
                                                                    z8 = z15;
                                                                } else {
                                                                    zArr2 = zArr;
                                                                    L(cVar7, zR);
                                                                    for (i10 = 0; i10 < i6; i10++) {
                                                                        ((d) this.p0.get(i10)).L(cVar7, zR);
                                                                    }
                                                                    z8 = false;
                                                                }
                                                                if (z6) {
                                                                    iMax3 = 0;
                                                                    iMax4 = 0;
                                                                    for (i11 = 0; i11 < i6; i11++) {
                                                                        d dVar14 = (d) this.p0.get(i11);
                                                                        iMax3 = Math.max(iMax3, dVar14.n() + dVar14.X);
                                                                        iMax4 = Math.max(iMax4, dVar14.k() + dVar14.Y);
                                                                    }
                                                                    iMax5 = Math.max(this.a0, iMax3);
                                                                    iMax6 = Math.max(this.b0, iMax4);
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    if (i4 == 2) {
                                                                        z8 = z8;
                                                                        r12 = r12;
                                                                        J(iMax5);
                                                                        r22[0] = 2;
                                                                        z8 = true;
                                                                        r12 = 1;
                                                                    }
                                                                    if (i3 == 2) {
                                                                        G(iMax6);
                                                                        r22[1] = 2;
                                                                        z8 = true;
                                                                        r12 = 1;
                                                                    }
                                                                }
                                                                iMax = Math.max(this.a0, n());
                                                                if (iMax > n()) {
                                                                    J(iMax);
                                                                    r8 = 1;
                                                                    r22[0] = 1;
                                                                    z9 = true;
                                                                    r18 = 1;
                                                                } else {
                                                                    r8 = 1;
                                                                    r18 = r12;
                                                                    z9 = z8;
                                                                }
                                                                iMax2 = Math.max(this.b0, k());
                                                                if (iMax2 > k()) {
                                                                    G(iMax2);
                                                                    r22[r8] = r8;
                                                                    r4 = r8;
                                                                    z10 = r4 == true ? 1 : 0;
                                                                } else {
                                                                    r0 = r18;
                                                                }
                                                                if (r0 == 0) {
                                                                    z10 = z9;
                                                                    if (r22[0] == 2) {
                                                                        r3 = r0;
                                                                        z14 = z10;
                                                                        if (n() > i5) {
                                                                            this.D0 = r8;
                                                                            r22[0] = r8;
                                                                            J(i5);
                                                                            ?? r10 = r8;
                                                                            z14 = r10 == true ? 1 : 0;
                                                                            r3 = r10;
                                                                        }
                                                                    }
                                                                    r0 = r4;
                                                                    r3 = r0;
                                                                    r3 = r0;
                                                                    z14 = z10;
                                                                    z14 = z10;
                                                                    r1 = r3;
                                                                    r1 = r3;
                                                                    z11 = z14;
                                                                    z11 = z14;
                                                                    if (r22[r8] != 2) {
                                                                    }
                                                                    if (i9 > 8) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = z12;
                                                                    }
                                                                    r12 = r2;
                                                                    i8 = i9;
                                                                    z3 = z6;
                                                                    cVar = cVar3;
                                                                    z4 = z13;
                                                                } else {
                                                                    z10 = z9;
                                                                    r0 = r4;
                                                                    r1 = r0;
                                                                    z11 = z10;
                                                                }
                                                                r1 = r3;
                                                                z11 = z14;
                                                                z12 = z11;
                                                                r2 = r1;
                                                                if (i9 > 8) {
                                                                    z13 = false;
                                                                } else {
                                                                    z13 = z12;
                                                                }
                                                                r12 = r2;
                                                                i8 = i9;
                                                                z3 = z6;
                                                                cVar = cVar3;
                                                                z4 = z13;
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            z6 = z3;
                                                            z16 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z7 = z16;
                                                            zArr = j.a;
                                                            if (z7) {
                                                                zArr[2] = false;
                                                                zR2 = R(64);
                                                                L(cVar7, zR2);
                                                                size = this.p0.size();
                                                                i12 = 0;
                                                                z15 = false;
                                                                while (i12 < size) {
                                                                    dVar = (d) this.p0.get(i12);
                                                                    dVar.L(cVar7, zR2);
                                                                    boolean[] zArr4 = zArr;
                                                                    boolean z25 = zR2;
                                                                    if (dVar.h == -1) {
                                                                        z15 = true;
                                                                    } else {
                                                                        z15 = true;
                                                                    }
                                                                    i12++;
                                                                    zArr = zArr4;
                                                                    zR2 = z25;
                                                                    z15 = z15;
                                                                }
                                                                zArr2 = zArr;
                                                                z8 = z15;
                                                            } else {
                                                                zArr2 = zArr;
                                                                L(cVar7, zR);
                                                                while (i10 < i6) {
                                                                    ((d) this.p0.get(i10)).L(cVar7, zR);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z6) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i11 < i6) {
                                                                    d dVar15 = (d) this.p0.get(i11);
                                                                    iMax3 = Math.max(iMax3, dVar15.n() + dVar15.X);
                                                                    iMax4 = Math.max(iMax4, dVar15.k() + dVar15.Y);
                                                                }
                                                                iMax5 = Math.max(this.a0, iMax3);
                                                                iMax6 = Math.max(this.b0, iMax4);
                                                                z8 = z8;
                                                                r12 = r12;
                                                                if (i4 == 2) {
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    J(iMax5);
                                                                    r22[0] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i3 == 2) {
                                                                    G(iMax6);
                                                                    r22[1] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.a0, n());
                                                            if (iMax > n()) {
                                                                J(iMax);
                                                                r8 = 1;
                                                                r22[0] = 1;
                                                                z9 = true;
                                                                r18 = 1;
                                                            } else {
                                                                r8 = 1;
                                                                r18 = r12;
                                                                z9 = z8;
                                                            }
                                                            iMax2 = Math.max(this.b0, k());
                                                            if (iMax2 > k()) {
                                                                G(iMax2);
                                                                r22[r8] = r8;
                                                                r4 = r8;
                                                                z10 = r4 == true ? 1 : 0;
                                                            } else {
                                                                r0 = r18;
                                                            }
                                                            if (r0 == 0) {
                                                                z10 = z9;
                                                                if (r22[0] == 2) {
                                                                    r3 = r0;
                                                                    z14 = z10;
                                                                    if (n() > i5) {
                                                                        this.D0 = r8;
                                                                        r22[0] = r8;
                                                                        J(i5);
                                                                        ?? r11 = r8;
                                                                        z14 = r11 == true ? 1 : 0;
                                                                        r3 = r11;
                                                                    }
                                                                }
                                                                r0 = r4;
                                                                r3 = r0;
                                                                r3 = r0;
                                                                z14 = z10;
                                                                z14 = z10;
                                                                r1 = r3;
                                                                r1 = r3;
                                                                z11 = z14;
                                                                z11 = z14;
                                                                if (r22[r8] != 2) {
                                                                }
                                                                if (i9 > 8) {
                                                                    z13 = false;
                                                                } else {
                                                                    z13 = z12;
                                                                }
                                                                r12 = r2;
                                                                i8 = i9;
                                                                z3 = z6;
                                                                cVar = cVar3;
                                                                z4 = z13;
                                                            } else {
                                                                z10 = z9;
                                                                r0 = r4;
                                                                r1 = r0;
                                                                z11 = z10;
                                                            }
                                                            r1 = r3;
                                                            z11 = z14;
                                                            z12 = z11;
                                                            r2 = r1;
                                                            if (i9 > 8) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = z12;
                                                            }
                                                            r12 = r2;
                                                            i8 = i9;
                                                            z3 = z6;
                                                            cVar = cVar3;
                                                            z4 = z13;
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                    }
                                                } else {
                                                    cVar3 = cVar;
                                                    z6 = z3;
                                                }
                                                weakReference2 = this.H0;
                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                    cVar7.f(cVar7.k(this.K), cVar7.k((c) this.H0.get()), 0, 5);
                                                    this.H0 = null;
                                                }
                                                weakReference3 = this.G0;
                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                    cVar4 = cVar2;
                                                    try {
                                                        cVar2 = cVar4;
                                                        cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar4), 0, 5);
                                                        this.G0 = null;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        cVar2 = cVar4;
                                                        z16 = true;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        z7 = z16;
                                                        zArr = j.a;
                                                        if (z7) {
                                                            zArr[2] = false;
                                                            zR2 = R(64);
                                                            L(cVar7, zR2);
                                                            size = this.p0.size();
                                                            i12 = 0;
                                                            z15 = false;
                                                            while (i12 < size) {
                                                                dVar = (d) this.p0.get(i12);
                                                                dVar.L(cVar7, zR2);
                                                                boolean[] zArr5 = zArr;
                                                                boolean z26 = zR2;
                                                                if (dVar.h == -1) {
                                                                    z15 = true;
                                                                } else {
                                                                    z15 = true;
                                                                }
                                                                i12++;
                                                                zArr = zArr5;
                                                                zR2 = z26;
                                                                z15 = z15;
                                                            }
                                                            zArr2 = zArr;
                                                            z8 = z15;
                                                        } else {
                                                            zArr2 = zArr;
                                                            L(cVar7, zR);
                                                            while (i10 < i6) {
                                                                ((d) this.p0.get(i10)).L(cVar7, zR);
                                                            }
                                                            z8 = false;
                                                        }
                                                        if (z6) {
                                                            iMax3 = 0;
                                                            iMax4 = 0;
                                                            while (i11 < i6) {
                                                                d dVar16 = (d) this.p0.get(i11);
                                                                iMax3 = Math.max(iMax3, dVar16.n() + dVar16.X);
                                                                iMax4 = Math.max(iMax4, dVar16.k() + dVar16.Y);
                                                            }
                                                            iMax5 = Math.max(this.a0, iMax3);
                                                            iMax6 = Math.max(this.b0, iMax4);
                                                            z8 = z8;
                                                            r12 = r12;
                                                            if (i4 == 2) {
                                                                z8 = z8;
                                                                r12 = r12;
                                                                J(iMax5);
                                                                r22[0] = 2;
                                                                z8 = true;
                                                                r12 = 1;
                                                            }
                                                            if (i3 == 2) {
                                                                G(iMax6);
                                                                r22[1] = 2;
                                                                z8 = true;
                                                                r12 = 1;
                                                            }
                                                        }
                                                        iMax = Math.max(this.a0, n());
                                                        if (iMax > n()) {
                                                            J(iMax);
                                                            r8 = 1;
                                                            r22[0] = 1;
                                                            z9 = true;
                                                            r18 = 1;
                                                        } else {
                                                            r8 = 1;
                                                            r18 = r12;
                                                            z9 = z8;
                                                        }
                                                        iMax2 = Math.max(this.b0, k());
                                                        if (iMax2 > k()) {
                                                            G(iMax2);
                                                            r22[r8] = r8;
                                                            r4 = r8;
                                                            z10 = r4 == true ? 1 : 0;
                                                        } else {
                                                            r0 = r18;
                                                        }
                                                        if (r0 == 0) {
                                                            z10 = z9;
                                                            if (r22[0] == 2) {
                                                                r3 = r0;
                                                                z14 = z10;
                                                                if (n() > i5) {
                                                                    this.D0 = r8;
                                                                    r22[0] = r8;
                                                                    J(i5);
                                                                    ?? r13 = r8;
                                                                    z14 = r13 == true ? 1 : 0;
                                                                    r3 = r13;
                                                                }
                                                            }
                                                            r0 = r4;
                                                            r3 = r0;
                                                            r3 = r0;
                                                            z14 = z10;
                                                            z14 = z10;
                                                            r1 = r3;
                                                            r1 = r3;
                                                            z11 = z14;
                                                            z11 = z14;
                                                            if (r22[r8] != 2) {
                                                            }
                                                            if (i9 > 8) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = z12;
                                                            }
                                                            r12 = r2;
                                                            i8 = i9;
                                                            z3 = z6;
                                                            cVar = cVar3;
                                                            z4 = z13;
                                                        } else {
                                                            z10 = z9;
                                                            r0 = r4;
                                                            r1 = r0;
                                                            z11 = z10;
                                                        }
                                                        r1 = r3;
                                                        z11 = z14;
                                                        z12 = z11;
                                                        r2 = r1;
                                                        if (i9 > 8) {
                                                            z13 = false;
                                                        } else {
                                                            z13 = z12;
                                                        }
                                                        r12 = r2;
                                                        i8 = i9;
                                                        z3 = z6;
                                                        cVar = cVar3;
                                                        z4 = z13;
                                                    }
                                                }
                                                weakReference4 = this.I0;
                                                if (weakReference4 == null && weakReference4.get() != null) {
                                                    try {
                                                        try {
                                                            cVar7.f(cVar7.k(this.J), cVar7.k((c) this.I0.get()), 0, 5);
                                                            try {
                                                                this.I0 = null;
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                z16 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z7 = z16;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            z16 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z7 = z16;
                                                            zArr = j.a;
                                                            if (z7) {
                                                                zArr[2] = false;
                                                                zR2 = R(64);
                                                                L(cVar7, zR2);
                                                                size = this.p0.size();
                                                                i12 = 0;
                                                                z15 = false;
                                                                while (i12 < size) {
                                                                    dVar = (d) this.p0.get(i12);
                                                                    dVar.L(cVar7, zR2);
                                                                    boolean[] zArr6 = zArr;
                                                                    boolean z27 = zR2;
                                                                    if (dVar.h == -1) {
                                                                        z15 = true;
                                                                    } else {
                                                                        z15 = true;
                                                                    }
                                                                    i12++;
                                                                    zArr = zArr6;
                                                                    zR2 = z27;
                                                                    z15 = z15;
                                                                }
                                                                zArr2 = zArr;
                                                                z8 = z15;
                                                            } else {
                                                                zArr2 = zArr;
                                                                L(cVar7, zR);
                                                                while (i10 < i6) {
                                                                    ((d) this.p0.get(i10)).L(cVar7, zR);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z6) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i11 < i6) {
                                                                    d dVar17 = (d) this.p0.get(i11);
                                                                    iMax3 = Math.max(iMax3, dVar17.n() + dVar17.X);
                                                                    iMax4 = Math.max(iMax4, dVar17.k() + dVar17.Y);
                                                                }
                                                                iMax5 = Math.max(this.a0, iMax3);
                                                                iMax6 = Math.max(this.b0, iMax4);
                                                                z8 = z8;
                                                                r12 = r12;
                                                                if (i4 == 2) {
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    J(iMax5);
                                                                    r22[0] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i3 == 2) {
                                                                    G(iMax6);
                                                                    r22[1] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.a0, n());
                                                            if (iMax > n()) {
                                                                J(iMax);
                                                                r8 = 1;
                                                                r22[0] = 1;
                                                                z9 = true;
                                                                r18 = 1;
                                                            } else {
                                                                r8 = 1;
                                                                r18 = r12;
                                                                z9 = z8;
                                                            }
                                                            iMax2 = Math.max(this.b0, k());
                                                            if (iMax2 > k()) {
                                                                G(iMax2);
                                                                r22[r8] = r8;
                                                                r4 = r8;
                                                                z10 = r4 == true ? 1 : 0;
                                                            } else {
                                                                r0 = r18;
                                                            }
                                                            if (r0 == 0) {
                                                                z10 = z9;
                                                                if (r22[0] == 2) {
                                                                    r3 = r0;
                                                                    z14 = z10;
                                                                    if (n() > i5) {
                                                                        this.D0 = r8;
                                                                        r22[0] = r8;
                                                                        J(i5);
                                                                        ?? r14 = r8;
                                                                        z14 = r14 == true ? 1 : 0;
                                                                        r3 = r14;
                                                                    }
                                                                }
                                                                r0 = r4;
                                                                r3 = r0;
                                                                r3 = r0;
                                                                z14 = z10;
                                                                z14 = z10;
                                                                r1 = r3;
                                                                r1 = r3;
                                                                z11 = z14;
                                                                z11 = z14;
                                                                if (r22[r8] != 2) {
                                                                }
                                                                if (i9 > 8) {
                                                                    z13 = false;
                                                                } else {
                                                                    z13 = z12;
                                                                }
                                                                r12 = r2;
                                                                i8 = i9;
                                                                z3 = z6;
                                                                cVar = cVar3;
                                                                z4 = z13;
                                                            } else {
                                                                z10 = z9;
                                                                r0 = r4;
                                                                r1 = r0;
                                                                z11 = z10;
                                                            }
                                                            r1 = r3;
                                                            z11 = z14;
                                                            z12 = z11;
                                                            r2 = r1;
                                                            if (i9 > 8) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = z12;
                                                            }
                                                            r12 = r2;
                                                            i8 = i9;
                                                            z3 = z6;
                                                            cVar = cVar3;
                                                            z4 = z13;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                    }
                                                }
                                                cVar7.p();
                                                z7 = true;
                                            } catch (Exception e8) {
                                                e = e8;
                                                cVar3 = cVar;
                                            }
                                        } else {
                                            cVar3 = cVar;
                                            z6 = z3;
                                            weakReference2 = this.H0;
                                            if (weakReference2 != null) {
                                                cVar7.f(cVar7.k(this.K), cVar7.k((c) this.H0.get()), 0, 5);
                                                this.H0 = null;
                                            }
                                            weakReference3 = this.G0;
                                            if (weakReference3 != null) {
                                                cVar4 = cVar2;
                                                cVar2 = cVar4;
                                                cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar4), 0, 5);
                                                this.G0 = null;
                                            }
                                            weakReference4 = this.I0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar7.p();
                                            z7 = true;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        cVar3 = cVar;
                                        z6 = z3;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    cVar3 = cVar;
                                    z6 = z3;
                                    z16 = z4;
                                }
                                zArr = j.a;
                                if (z7) {
                                    zArr[2] = false;
                                    zR2 = R(64);
                                    L(cVar7, zR2);
                                    size = this.p0.size();
                                    i12 = 0;
                                    z15 = false;
                                    while (i12 < size) {
                                        dVar = (d) this.p0.get(i12);
                                        dVar.L(cVar7, zR2);
                                        boolean[] zArr7 = zArr;
                                        boolean z28 = zR2;
                                        if (dVar.h == -1 || dVar.i != -1) {
                                            z15 = true;
                                        }
                                        i12++;
                                        zArr = zArr7;
                                        zR2 = z28;
                                        z15 = z15;
                                    }
                                    zArr2 = zArr;
                                    z8 = z15;
                                } else {
                                    zArr2 = zArr;
                                    L(cVar7, zR);
                                    while (i10 < i6) {
                                        ((d) this.p0.get(i10)).L(cVar7, zR);
                                    }
                                    z8 = false;
                                }
                                if (z6 && i9 < 8 && zArr2[2]) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i11 < i6) {
                                        d dVar18 = (d) this.p0.get(i11);
                                        iMax3 = Math.max(iMax3, dVar18.n() + dVar18.X);
                                        iMax4 = Math.max(iMax4, dVar18.k() + dVar18.Y);
                                    }
                                    iMax5 = Math.max(this.a0, iMax3);
                                    iMax6 = Math.max(this.b0, iMax4);
                                    z8 = z8;
                                    r12 = r12;
                                    if (i4 == 2 && n() < iMax5) {
                                        z8 = z8;
                                        r12 = r12;
                                        J(iMax5);
                                        r22[0] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                    if (i3 == 2 && k() < iMax6) {
                                        G(iMax6);
                                        r22[1] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.a0, n());
                                if (iMax > n()) {
                                    J(iMax);
                                    r8 = 1;
                                    r22[0] = 1;
                                    z9 = true;
                                    r18 = 1;
                                } else {
                                    r8 = 1;
                                    r18 = r12;
                                    z9 = z8;
                                }
                                iMax2 = Math.max(this.b0, k());
                                if (iMax2 > k()) {
                                    G(iMax2);
                                    r22[r8] = r8;
                                    r4 = r8;
                                    z10 = r4 == true ? 1 : 0;
                                } else {
                                    r0 = r18;
                                }
                                if (r0 == 0) {
                                    z10 = z9;
                                    if (r22[0] == 2 && i5 > 0) {
                                        r3 = r0;
                                        z14 = z10;
                                        if (n() > i5) {
                                            this.D0 = r8;
                                            r22[0] = r8;
                                            J(i5);
                                            ?? r15 = r8;
                                            z14 = r15 == true ? 1 : 0;
                                            r3 = r15;
                                        }
                                    }
                                    r0 = r4;
                                    r3 = r0;
                                    r3 = r0;
                                    z14 = z10;
                                    z14 = z10;
                                    r1 = r3;
                                    r1 = r3;
                                    z11 = z14;
                                    z11 = z14;
                                    if (r22[r8] != 2 && i2 > 0 && k() > i2) {
                                        r1 = r3;
                                        z11 = z14;
                                        this.E0 = r8;
                                        r22[r8] = r8;
                                        G(i2);
                                        r2 = 1;
                                        z12 = true;
                                    }
                                    if (i9 > 8) {
                                        z13 = false;
                                    } else {
                                        z13 = z12;
                                    }
                                    r12 = r2;
                                    i8 = i9;
                                    z3 = z6;
                                    cVar = cVar3;
                                    z4 = z13;
                                } else {
                                    z10 = z9;
                                    r0 = r4;
                                    r1 = r0;
                                    z11 = z10;
                                }
                                r1 = r3;
                                z11 = z14;
                                z12 = z11;
                                r2 = r1;
                                if (i9 > 8) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                r12 = r2;
                                i8 = i9;
                                z3 = z6;
                                cVar = cVar3;
                                z4 = z13;
                            }
                            z5 = r12 == true ? 1 : 0;
                            this.p0 = arrayList10;
                            if (z5) {
                                r22[0] = i4;
                                r22[1] = i3;
                            }
                            C(cVar7.l);
                        }
                        c2 = 1;
                        nVar = null;
                        if (r22[c2] == 2) {
                            size2 = arrayList9.size();
                            i20 = 0;
                            i21 = 0;
                            nVar2 = null;
                            while (i21 < size2) {
                                Object obj9 = arrayList9.get(i21);
                                i21++;
                                nVar3 = (n) obj9;
                                if (nVar3.c != 0) {
                                    nVar2 = nVar3;
                                    i20 = iB;
                                }
                            }
                            if (nVar2 != null) {
                                I(1);
                                G(i20);
                            } else {
                                nVar2 = null;
                            }
                        } else {
                            nVar2 = null;
                        }
                        if (nVar == null) {
                        }
                        i4 = i17;
                        if (i4 == 2) {
                            i18 = i14;
                            if (i18 < n()) {
                            }
                            iN = n();
                            i3 = i16;
                            if (i3 == 2) {
                                i19 = i15;
                                if (i19 < k()) {
                                }
                                iK = k();
                                i2 = iK;
                                i5 = iN;
                                z = true;
                                if (R(64)) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                cVar7.getClass();
                                cVar7.g = false;
                                if (this.C0 == 0) {
                                    c = 1;
                                } else {
                                    c = 1;
                                }
                                ArrayList arrayList11 = this.p0;
                                if (r22[0] != 2) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                this.y0 = 0;
                                this.z0 = 0;
                                i6 = i;
                                while (i7 < i6) {
                                    dVar2 = (d) this.p0.get(i7);
                                    if (dVar2 instanceof e) {
                                        ((e) dVar2).P();
                                    }
                                }
                                zR = R(64);
                                r12 = z;
                                i8 = 0;
                                z4 = true;
                                while (z4) {
                                    i9 = i8 + 1;
                                    cVar7.t();
                                    this.y0 = 0;
                                    this.z0 = 0;
                                    g(cVar7);
                                    while (i13 < i6) {
                                        ((d) this.p0.get(i13)).g(cVar7);
                                    }
                                    N(cVar7);
                                    weakReference = this.F0;
                                    if (weakReference != null) {
                                        if (weakReference.get() != null) {
                                            cVar3 = cVar;
                                            z6 = z3;
                                            cVar7.f(cVar7.k((c) this.F0.get()), cVar7.k(cVar3), 0, 5);
                                            this.F0 = null;
                                        } else {
                                            cVar3 = cVar;
                                            z6 = z3;
                                        }
                                        weakReference2 = this.H0;
                                        if (weakReference2 != null) {
                                            cVar7.f(cVar7.k(this.K), cVar7.k((c) this.H0.get()), 0, 5);
                                            this.H0 = null;
                                        }
                                        weakReference3 = this.G0;
                                        if (weakReference3 != null) {
                                            cVar4 = cVar2;
                                            cVar2 = cVar4;
                                            cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar4), 0, 5);
                                            this.G0 = null;
                                        }
                                        weakReference4 = this.I0;
                                        if (weakReference4 == null) {
                                        }
                                        cVar7.p();
                                        z7 = true;
                                    } else {
                                        cVar3 = cVar;
                                        z6 = z3;
                                        weakReference2 = this.H0;
                                        if (weakReference2 != null) {
                                            cVar7.f(cVar7.k(this.K), cVar7.k((c) this.H0.get()), 0, 5);
                                            this.H0 = null;
                                        }
                                        weakReference3 = this.G0;
                                        if (weakReference3 != null) {
                                            cVar4 = cVar2;
                                            cVar2 = cVar4;
                                            cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar4), 0, 5);
                                            this.G0 = null;
                                        }
                                        weakReference4 = this.I0;
                                        if (weakReference4 == null) {
                                        }
                                        cVar7.p();
                                        z7 = true;
                                    }
                                    zArr = j.a;
                                    if (z7) {
                                        zArr[2] = false;
                                        zR2 = R(64);
                                        L(cVar7, zR2);
                                        size = this.p0.size();
                                        i12 = 0;
                                        z15 = false;
                                        while (i12 < size) {
                                            dVar = (d) this.p0.get(i12);
                                            dVar.L(cVar7, zR2);
                                            boolean[] zArr8 = zArr;
                                            boolean z29 = zR2;
                                            if (dVar.h == -1) {
                                                z15 = true;
                                            } else {
                                                z15 = true;
                                            }
                                            i12++;
                                            zArr = zArr8;
                                            zR2 = z29;
                                            z15 = z15;
                                        }
                                        zArr2 = zArr;
                                        z8 = z15;
                                    } else {
                                        zArr2 = zArr;
                                        L(cVar7, zR);
                                        while (i10 < i6) {
                                            ((d) this.p0.get(i10)).L(cVar7, zR);
                                        }
                                        z8 = false;
                                    }
                                    if (z6) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i11 < i6) {
                                            d dVar19 = (d) this.p0.get(i11);
                                            iMax3 = Math.max(iMax3, dVar19.n() + dVar19.X);
                                            iMax4 = Math.max(iMax4, dVar19.k() + dVar19.Y);
                                        }
                                        iMax5 = Math.max(this.a0, iMax3);
                                        iMax6 = Math.max(this.b0, iMax4);
                                        z8 = z8;
                                        r12 = r12;
                                        if (i4 == 2) {
                                            z8 = z8;
                                            r12 = r12;
                                            J(iMax5);
                                            r22[0] = 2;
                                            z8 = true;
                                            r12 = 1;
                                        }
                                        if (i3 == 2) {
                                            G(iMax6);
                                            r22[1] = 2;
                                            z8 = true;
                                            r12 = 1;
                                        }
                                    }
                                    iMax = Math.max(this.a0, n());
                                    if (iMax > n()) {
                                        J(iMax);
                                        r8 = 1;
                                        r22[0] = 1;
                                        z9 = true;
                                        r18 = 1;
                                    } else {
                                        r8 = 1;
                                        r18 = r12;
                                        z9 = z8;
                                    }
                                    iMax2 = Math.max(this.b0, k());
                                    if (iMax2 > k()) {
                                        G(iMax2);
                                        r22[r8] = r8;
                                        r4 = r8;
                                        z10 = r4 == true ? 1 : 0;
                                    } else {
                                        r0 = r18;
                                    }
                                    if (r0 == 0) {
                                        z10 = z9;
                                        if (r22[0] == 2) {
                                            r3 = r0;
                                            z14 = z10;
                                            if (n() > i5) {
                                                this.D0 = r8;
                                                r22[0] = r8;
                                                J(i5);
                                                ?? r16 = r8;
                                                z14 = r16 == true ? 1 : 0;
                                                r3 = r16;
                                            }
                                        }
                                        r0 = r4;
                                        r3 = r0;
                                        r3 = r0;
                                        z14 = z10;
                                        z14 = z10;
                                        r1 = r3;
                                        r1 = r3;
                                        z11 = z14;
                                        z11 = z14;
                                        if (r22[r8] != 2) {
                                        }
                                        if (i9 > 8) {
                                            z13 = false;
                                        } else {
                                            z13 = z12;
                                        }
                                        r12 = r2;
                                        i8 = i9;
                                        z3 = z6;
                                        cVar = cVar3;
                                        z4 = z13;
                                    } else {
                                        z10 = z9;
                                        r0 = r4;
                                        r1 = r0;
                                        z11 = z10;
                                    }
                                    r1 = r3;
                                    z11 = z14;
                                    z12 = z11;
                                    r2 = r1;
                                    if (i9 > 8) {
                                        z13 = false;
                                    } else {
                                        z13 = z12;
                                    }
                                    r12 = r2;
                                    i8 = i9;
                                    z3 = z6;
                                    cVar = cVar3;
                                    z4 = z13;
                                }
                                z5 = r12 == true ? 1 : 0;
                                this.p0 = arrayList11;
                                if (z5) {
                                    r22[0] = i4;
                                    r22[1] = i3;
                                }
                                C(cVar7.l);
                            }
                            i19 = i15;
                            iK = i19;
                            i2 = iK;
                            i5 = iN;
                            z = true;
                            if (R(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            cVar7.getClass();
                            cVar7.g = false;
                            if (this.C0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList12 = this.p0;
                            if (r22[0] != 2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.y0 = 0;
                            this.z0 = 0;
                            i6 = i;
                            while (i7 < i6) {
                                dVar2 = (d) this.p0.get(i7);
                                if (dVar2 instanceof e) {
                                    ((e) dVar2).P();
                                }
                            }
                            zR = R(64);
                            r12 = z;
                            i8 = 0;
                            z4 = true;
                            while (z4) {
                                i9 = i8 + 1;
                                cVar7.t();
                                this.y0 = 0;
                                this.z0 = 0;
                                g(cVar7);
                                while (i13 < i6) {
                                    ((d) this.p0.get(i13)).g(cVar7);
                                }
                                N(cVar7);
                                weakReference = this.F0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        cVar3 = cVar;
                                        z6 = z3;
                                        cVar7.f(cVar7.k((c) this.F0.get()), cVar7.k(cVar3), 0, 5);
                                        this.F0 = null;
                                    } else {
                                        cVar3 = cVar;
                                        z6 = z3;
                                    }
                                    weakReference2 = this.H0;
                                    if (weakReference2 != null) {
                                        cVar7.f(cVar7.k(this.K), cVar7.k((c) this.H0.get()), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference3 = this.G0;
                                    if (weakReference3 != null) {
                                        cVar4 = cVar2;
                                        cVar2 = cVar4;
                                        cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar4), 0, 5);
                                        this.G0 = null;
                                    }
                                    weakReference4 = this.I0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    z7 = true;
                                } else {
                                    cVar3 = cVar;
                                    z6 = z3;
                                    weakReference2 = this.H0;
                                    if (weakReference2 != null) {
                                        cVar7.f(cVar7.k(this.K), cVar7.k((c) this.H0.get()), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference3 = this.G0;
                                    if (weakReference3 != null) {
                                        cVar4 = cVar2;
                                        cVar2 = cVar4;
                                        cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar4), 0, 5);
                                        this.G0 = null;
                                    }
                                    weakReference4 = this.I0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    z7 = true;
                                }
                                zArr = j.a;
                                if (z7) {
                                    zArr[2] = false;
                                    zR2 = R(64);
                                    L(cVar7, zR2);
                                    size = this.p0.size();
                                    i12 = 0;
                                    z15 = false;
                                    while (i12 < size) {
                                        dVar = (d) this.p0.get(i12);
                                        dVar.L(cVar7, zR2);
                                        boolean[] zArr9 = zArr;
                                        boolean z210 = zR2;
                                        if (dVar.h == -1) {
                                            z15 = true;
                                        } else {
                                            z15 = true;
                                        }
                                        i12++;
                                        zArr = zArr9;
                                        zR2 = z210;
                                        z15 = z15;
                                    }
                                    zArr2 = zArr;
                                    z8 = z15;
                                } else {
                                    zArr2 = zArr;
                                    L(cVar7, zR);
                                    while (i10 < i6) {
                                        ((d) this.p0.get(i10)).L(cVar7, zR);
                                    }
                                    z8 = false;
                                }
                                if (z6) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i11 < i6) {
                                        d dVar110 = (d) this.p0.get(i11);
                                        iMax3 = Math.max(iMax3, dVar110.n() + dVar110.X);
                                        iMax4 = Math.max(iMax4, dVar110.k() + dVar110.Y);
                                    }
                                    iMax5 = Math.max(this.a0, iMax3);
                                    iMax6 = Math.max(this.b0, iMax4);
                                    z8 = z8;
                                    r12 = r12;
                                    if (i4 == 2) {
                                        z8 = z8;
                                        r12 = r12;
                                        J(iMax5);
                                        r22[0] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                    if (i3 == 2) {
                                        G(iMax6);
                                        r22[1] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.a0, n());
                                if (iMax > n()) {
                                    J(iMax);
                                    r8 = 1;
                                    r22[0] = 1;
                                    z9 = true;
                                    r18 = 1;
                                } else {
                                    r8 = 1;
                                    r18 = r12;
                                    z9 = z8;
                                }
                                iMax2 = Math.max(this.b0, k());
                                if (iMax2 > k()) {
                                    G(iMax2);
                                    r22[r8] = r8;
                                    r4 = r8;
                                    z10 = r4 == true ? 1 : 0;
                                } else {
                                    r0 = r18;
                                }
                                if (r0 == 0) {
                                    z10 = z9;
                                    if (r22[0] == 2) {
                                        r3 = r0;
                                        z14 = z10;
                                        if (n() > i5) {
                                            this.D0 = r8;
                                            r22[0] = r8;
                                            J(i5);
                                            ?? r17 = r8;
                                            z14 = r17 == true ? 1 : 0;
                                            r3 = r17;
                                        }
                                    }
                                    r0 = r4;
                                    r3 = r0;
                                    r3 = r0;
                                    z14 = z10;
                                    z14 = z10;
                                    r1 = r3;
                                    r1 = r3;
                                    z11 = z14;
                                    z11 = z14;
                                    if (r22[r8] != 2) {
                                    }
                                    if (i9 > 8) {
                                        z13 = false;
                                    } else {
                                        z13 = z12;
                                    }
                                    r12 = r2;
                                    i8 = i9;
                                    z3 = z6;
                                    cVar = cVar3;
                                    z4 = z13;
                                } else {
                                    z10 = z9;
                                    r0 = r4;
                                    r1 = r0;
                                    z11 = z10;
                                }
                                r1 = r3;
                                z11 = z14;
                                z12 = z11;
                                r2 = r1;
                                if (i9 > 8) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                r12 = r2;
                                i8 = i9;
                                z3 = z6;
                                cVar = cVar3;
                                z4 = z13;
                            }
                            z5 = r12 == true ? 1 : 0;
                            this.p0 = arrayList12;
                            if (z5) {
                                r22[0] = i4;
                                r22[1] = i3;
                            }
                            C(cVar7.l);
                        }
                        i18 = i14;
                        iN = i18;
                        i3 = i16;
                        if (i3 == 2) {
                            i19 = i15;
                            if (i19 < k()) {
                            }
                            iK = k();
                            i2 = iK;
                            i5 = iN;
                            z = true;
                            if (R(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            cVar7.getClass();
                            cVar7.g = false;
                            if (this.C0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList13 = this.p0;
                            if (r22[0] != 2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.y0 = 0;
                            this.z0 = 0;
                            i6 = i;
                            while (i7 < i6) {
                                dVar2 = (d) this.p0.get(i7);
                                if (dVar2 instanceof e) {
                                    ((e) dVar2).P();
                                }
                            }
                            zR = R(64);
                            r12 = z;
                            i8 = 0;
                            z4 = true;
                            while (z4) {
                                i9 = i8 + 1;
                                cVar7.t();
                                this.y0 = 0;
                                this.z0 = 0;
                                g(cVar7);
                                while (i13 < i6) {
                                    ((d) this.p0.get(i13)).g(cVar7);
                                }
                                N(cVar7);
                                weakReference = this.F0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        cVar3 = cVar;
                                        z6 = z3;
                                        cVar7.f(cVar7.k((c) this.F0.get()), cVar7.k(cVar3), 0, 5);
                                        this.F0 = null;
                                    } else {
                                        cVar3 = cVar;
                                        z6 = z3;
                                    }
                                    weakReference2 = this.H0;
                                    if (weakReference2 != null) {
                                        cVar7.f(cVar7.k(this.K), cVar7.k((c) this.H0.get()), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference3 = this.G0;
                                    if (weakReference3 != null) {
                                        cVar4 = cVar2;
                                        cVar2 = cVar4;
                                        cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar4), 0, 5);
                                        this.G0 = null;
                                    }
                                    weakReference4 = this.I0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    z7 = true;
                                } else {
                                    cVar3 = cVar;
                                    z6 = z3;
                                    weakReference2 = this.H0;
                                    if (weakReference2 != null) {
                                        cVar7.f(cVar7.k(this.K), cVar7.k((c) this.H0.get()), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference3 = this.G0;
                                    if (weakReference3 != null) {
                                        cVar4 = cVar2;
                                        cVar2 = cVar4;
                                        cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar4), 0, 5);
                                        this.G0 = null;
                                    }
                                    weakReference4 = this.I0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    z7 = true;
                                }
                                zArr = j.a;
                                if (z7) {
                                    zArr[2] = false;
                                    zR2 = R(64);
                                    L(cVar7, zR2);
                                    size = this.p0.size();
                                    i12 = 0;
                                    z15 = false;
                                    while (i12 < size) {
                                        dVar = (d) this.p0.get(i12);
                                        dVar.L(cVar7, zR2);
                                        boolean[] zArr10 = zArr;
                                        boolean z211 = zR2;
                                        if (dVar.h == -1) {
                                            z15 = true;
                                        } else {
                                            z15 = true;
                                        }
                                        i12++;
                                        zArr = zArr10;
                                        zR2 = z211;
                                        z15 = z15;
                                    }
                                    zArr2 = zArr;
                                    z8 = z15;
                                } else {
                                    zArr2 = zArr;
                                    L(cVar7, zR);
                                    while (i10 < i6) {
                                        ((d) this.p0.get(i10)).L(cVar7, zR);
                                    }
                                    z8 = false;
                                }
                                if (z6) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i11 < i6) {
                                        d dVar111 = (d) this.p0.get(i11);
                                        iMax3 = Math.max(iMax3, dVar111.n() + dVar111.X);
                                        iMax4 = Math.max(iMax4, dVar111.k() + dVar111.Y);
                                    }
                                    iMax5 = Math.max(this.a0, iMax3);
                                    iMax6 = Math.max(this.b0, iMax4);
                                    z8 = z8;
                                    r12 = r12;
                                    if (i4 == 2) {
                                        z8 = z8;
                                        r12 = r12;
                                        J(iMax5);
                                        r22[0] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                    if (i3 == 2) {
                                        G(iMax6);
                                        r22[1] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.a0, n());
                                if (iMax > n()) {
                                    J(iMax);
                                    r8 = 1;
                                    r22[0] = 1;
                                    z9 = true;
                                    r18 = 1;
                                } else {
                                    r8 = 1;
                                    r18 = r12;
                                    z9 = z8;
                                }
                                iMax2 = Math.max(this.b0, k());
                                if (iMax2 > k()) {
                                    G(iMax2);
                                    r22[r8] = r8;
                                    r4 = r8;
                                    z10 = r4 == true ? 1 : 0;
                                } else {
                                    r0 = r18;
                                }
                                if (r0 == 0) {
                                    z10 = z9;
                                    if (r22[0] == 2) {
                                        r3 = r0;
                                        z14 = z10;
                                        if (n() > i5) {
                                            this.D0 = r8;
                                            r22[0] = r8;
                                            J(i5);
                                            ?? r19 = r8;
                                            z14 = r19 == true ? 1 : 0;
                                            r3 = r19;
                                        }
                                    }
                                    r0 = r4;
                                    r3 = r0;
                                    r3 = r0;
                                    z14 = z10;
                                    z14 = z10;
                                    r1 = r3;
                                    r1 = r3;
                                    z11 = z14;
                                    z11 = z14;
                                    if (r22[r8] != 2) {
                                    }
                                    if (i9 > 8) {
                                        z13 = false;
                                    } else {
                                        z13 = z12;
                                    }
                                    r12 = r2;
                                    i8 = i9;
                                    z3 = z6;
                                    cVar = cVar3;
                                    z4 = z13;
                                } else {
                                    z10 = z9;
                                    r0 = r4;
                                    r1 = r0;
                                    z11 = z10;
                                }
                                r1 = r3;
                                z11 = z14;
                                z12 = z11;
                                r2 = r1;
                                if (i9 > 8) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                r12 = r2;
                                i8 = i9;
                                z3 = z6;
                                cVar = cVar3;
                                z4 = z13;
                            }
                            z5 = r12 == true ? 1 : 0;
                            this.p0 = arrayList13;
                            if (z5) {
                                r22[0] = i4;
                                r22[1] = i3;
                            }
                            C(cVar7.l);
                        }
                        i19 = i15;
                        iK = i19;
                        i2 = iK;
                        i5 = iN;
                        z = true;
                        if (R(64)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        cVar7.getClass();
                        cVar7.g = false;
                        if (this.C0 == 0) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        ArrayList arrayList14 = this.p0;
                        if (r22[0] != 2) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        this.y0 = 0;
                        this.z0 = 0;
                        i6 = i;
                        while (i7 < i6) {
                            dVar2 = (d) this.p0.get(i7);
                            if (dVar2 instanceof e) {
                                ((e) dVar2).P();
                            }
                        }
                        zR = R(64);
                        r12 = z;
                        i8 = 0;
                        z4 = true;
                        while (z4) {
                            i9 = i8 + 1;
                            cVar7.t();
                            this.y0 = 0;
                            this.z0 = 0;
                            g(cVar7);
                            while (i13 < i6) {
                                ((d) this.p0.get(i13)).g(cVar7);
                            }
                            N(cVar7);
                            weakReference = this.F0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    cVar3 = cVar;
                                    z6 = z3;
                                    cVar7.f(cVar7.k((c) this.F0.get()), cVar7.k(cVar3), 0, 5);
                                    this.F0 = null;
                                } else {
                                    cVar3 = cVar;
                                    z6 = z3;
                                }
                                weakReference2 = this.H0;
                                if (weakReference2 != null) {
                                    cVar7.f(cVar7.k(this.K), cVar7.k((c) this.H0.get()), 0, 5);
                                    this.H0 = null;
                                }
                                weakReference3 = this.G0;
                                if (weakReference3 != null) {
                                    cVar4 = cVar2;
                                    cVar2 = cVar4;
                                    cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar4), 0, 5);
                                    this.G0 = null;
                                }
                                weakReference4 = this.I0;
                                if (weakReference4 == null) {
                                }
                                cVar7.p();
                                z7 = true;
                            } else {
                                cVar3 = cVar;
                                z6 = z3;
                                weakReference2 = this.H0;
                                if (weakReference2 != null) {
                                    cVar7.f(cVar7.k(this.K), cVar7.k((c) this.H0.get()), 0, 5);
                                    this.H0 = null;
                                }
                                weakReference3 = this.G0;
                                if (weakReference3 != null) {
                                    cVar4 = cVar2;
                                    cVar2 = cVar4;
                                    cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar4), 0, 5);
                                    this.G0 = null;
                                }
                                weakReference4 = this.I0;
                                if (weakReference4 == null) {
                                }
                                cVar7.p();
                                z7 = true;
                            }
                            zArr = j.a;
                            if (z7) {
                                zArr[2] = false;
                                zR2 = R(64);
                                L(cVar7, zR2);
                                size = this.p0.size();
                                i12 = 0;
                                z15 = false;
                                while (i12 < size) {
                                    dVar = (d) this.p0.get(i12);
                                    dVar.L(cVar7, zR2);
                                    boolean[] zArr11 = zArr;
                                    boolean z212 = zR2;
                                    if (dVar.h == -1) {
                                        z15 = true;
                                    } else {
                                        z15 = true;
                                    }
                                    i12++;
                                    zArr = zArr11;
                                    zR2 = z212;
                                    z15 = z15;
                                }
                                zArr2 = zArr;
                                z8 = z15;
                            } else {
                                zArr2 = zArr;
                                L(cVar7, zR);
                                while (i10 < i6) {
                                    ((d) this.p0.get(i10)).L(cVar7, zR);
                                }
                                z8 = false;
                            }
                            if (z6) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i11 < i6) {
                                    d dVar112 = (d) this.p0.get(i11);
                                    iMax3 = Math.max(iMax3, dVar112.n() + dVar112.X);
                                    iMax4 = Math.max(iMax4, dVar112.k() + dVar112.Y);
                                }
                                iMax5 = Math.max(this.a0, iMax3);
                                iMax6 = Math.max(this.b0, iMax4);
                                z8 = z8;
                                r12 = r12;
                                if (i4 == 2) {
                                    z8 = z8;
                                    r12 = r12;
                                    J(iMax5);
                                    r22[0] = 2;
                                    z8 = true;
                                    r12 = 1;
                                }
                                if (i3 == 2) {
                                    G(iMax6);
                                    r22[1] = 2;
                                    z8 = true;
                                    r12 = 1;
                                }
                            }
                            iMax = Math.max(this.a0, n());
                            if (iMax > n()) {
                                J(iMax);
                                r8 = 1;
                                r22[0] = 1;
                                z9 = true;
                                r18 = 1;
                            } else {
                                r8 = 1;
                                r18 = r12;
                                z9 = z8;
                            }
                            iMax2 = Math.max(this.b0, k());
                            if (iMax2 > k()) {
                                G(iMax2);
                                r22[r8] = r8;
                                r4 = r8;
                                z10 = r4 == true ? 1 : 0;
                            } else {
                                r0 = r18;
                            }
                            if (r0 == 0) {
                                z10 = z9;
                                if (r22[0] == 2) {
                                    r3 = r0;
                                    z14 = z10;
                                    if (n() > i5) {
                                        this.D0 = r8;
                                        r22[0] = r8;
                                        J(i5);
                                        ?? r110 = r8;
                                        z14 = r110 == true ? 1 : 0;
                                        r3 = r110;
                                    }
                                }
                                r0 = r4;
                                r3 = r0;
                                r3 = r0;
                                z14 = z10;
                                z14 = z10;
                                r1 = r3;
                                r1 = r3;
                                z11 = z14;
                                z11 = z14;
                                if (r22[r8] != 2) {
                                }
                                if (i9 > 8) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                r12 = r2;
                                i8 = i9;
                                z3 = z6;
                                cVar = cVar3;
                                z4 = z13;
                            } else {
                                z10 = z9;
                                r0 = r4;
                                r1 = r0;
                                z11 = z10;
                            }
                            r1 = r3;
                            z11 = z14;
                            z12 = z11;
                            r2 = r1;
                            if (i9 > 8) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            r12 = r2;
                            i8 = i9;
                            z3 = z6;
                            cVar = cVar3;
                            z4 = z13;
                        }
                        z5 = r12 == true ? 1 : 0;
                        this.p0 = arrayList14;
                        if (z5) {
                            r22[0] = i4;
                            r22[1] = i3;
                        }
                        C(cVar7.l);
                    }
                }
                i2 = i15;
                i3 = i16;
                i5 = i14;
                i4 = i17;
            }
        }
        z = false;
        if (R(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        cVar7.getClass();
        cVar7.g = false;
        if (this.C0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList15 = this.p0;
        if (r22[0] != 2) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.y0 = 0;
        this.z0 = 0;
        i6 = i;
        while (i7 < i6) {
            dVar2 = (d) this.p0.get(i7);
            if (dVar2 instanceof e) {
                ((e) dVar2).P();
            }
        }
        zR = R(64);
        r12 = z;
        i8 = 0;
        z4 = true;
        while (z4) {
            i9 = i8 + 1;
            cVar7.t();
            this.y0 = 0;
            this.z0 = 0;
            g(cVar7);
            while (i13 < i6) {
                ((d) this.p0.get(i13)).g(cVar7);
            }
            N(cVar7);
            weakReference = this.F0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    cVar3 = cVar;
                    z6 = z3;
                    cVar7.f(cVar7.k((c) this.F0.get()), cVar7.k(cVar3), 0, 5);
                    this.F0 = null;
                } else {
                    cVar3 = cVar;
                    z6 = z3;
                }
                weakReference2 = this.H0;
                if (weakReference2 != null) {
                    cVar7.f(cVar7.k(this.K), cVar7.k((c) this.H0.get()), 0, 5);
                    this.H0 = null;
                }
                weakReference3 = this.G0;
                if (weakReference3 != null) {
                    cVar4 = cVar2;
                    cVar2 = cVar4;
                    cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar4), 0, 5);
                    this.G0 = null;
                }
                weakReference4 = this.I0;
                if (weakReference4 == null) {
                }
                cVar7.p();
                z7 = true;
            } else {
                cVar3 = cVar;
                z6 = z3;
                weakReference2 = this.H0;
                if (weakReference2 != null) {
                    cVar7.f(cVar7.k(this.K), cVar7.k((c) this.H0.get()), 0, 5);
                    this.H0 = null;
                }
                weakReference3 = this.G0;
                if (weakReference3 != null) {
                    cVar4 = cVar2;
                    cVar2 = cVar4;
                    cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar4), 0, 5);
                    this.G0 = null;
                }
                weakReference4 = this.I0;
                if (weakReference4 == null) {
                }
                cVar7.p();
                z7 = true;
            }
            zArr = j.a;
            if (z7) {
                zArr[2] = false;
                zR2 = R(64);
                L(cVar7, zR2);
                size = this.p0.size();
                i12 = 0;
                z15 = false;
                while (i12 < size) {
                    dVar = (d) this.p0.get(i12);
                    dVar.L(cVar7, zR2);
                    boolean[] zArr12 = zArr;
                    boolean z213 = zR2;
                    if (dVar.h == -1) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    i12++;
                    zArr = zArr12;
                    zR2 = z213;
                    z15 = z15;
                }
                zArr2 = zArr;
                z8 = z15;
            } else {
                zArr2 = zArr;
                L(cVar7, zR);
                while (i10 < i6) {
                    ((d) this.p0.get(i10)).L(cVar7, zR);
                }
                z8 = false;
            }
            if (z6) {
                iMax3 = 0;
                iMax4 = 0;
                while (i11 < i6) {
                    d dVar113 = (d) this.p0.get(i11);
                    iMax3 = Math.max(iMax3, dVar113.n() + dVar113.X);
                    iMax4 = Math.max(iMax4, dVar113.k() + dVar113.Y);
                }
                iMax5 = Math.max(this.a0, iMax3);
                iMax6 = Math.max(this.b0, iMax4);
                z8 = z8;
                r12 = r12;
                if (i4 == 2) {
                    z8 = z8;
                    r12 = r12;
                    J(iMax5);
                    r22[0] = 2;
                    z8 = true;
                    r12 = 1;
                }
                if (i3 == 2) {
                    G(iMax6);
                    r22[1] = 2;
                    z8 = true;
                    r12 = 1;
                }
            }
            iMax = Math.max(this.a0, n());
            if (iMax > n()) {
                J(iMax);
                r8 = 1;
                r22[0] = 1;
                z9 = true;
                r18 = 1;
            } else {
                r8 = 1;
                r18 = r12;
                z9 = z8;
            }
            iMax2 = Math.max(this.b0, k());
            if (iMax2 > k()) {
                G(iMax2);
                r22[r8] = r8;
                r4 = r8;
                z10 = r4 == true ? 1 : 0;
            } else {
                r0 = r18;
            }
            if (r0 == 0) {
                z10 = z9;
                if (r22[0] == 2) {
                    r3 = r0;
                    z14 = z10;
                    if (n() > i5) {
                        this.D0 = r8;
                        r22[0] = r8;
                        J(i5);
                        ?? r111 = r8;
                        z14 = r111 == true ? 1 : 0;
                        r3 = r111;
                    }
                }
                r0 = r4;
                r3 = r0;
                r3 = r0;
                z14 = z10;
                z14 = z10;
                r1 = r3;
                r1 = r3;
                z11 = z14;
                z11 = z14;
                if (r22[r8] != 2) {
                }
                if (i9 > 8) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                r12 = r2;
                i8 = i9;
                z3 = z6;
                cVar = cVar3;
                z4 = z13;
            } else {
                z10 = z9;
                r0 = r4;
                r1 = r0;
                z11 = z10;
            }
            r1 = r3;
            z11 = z14;
            z12 = z11;
            r2 = r1;
            if (i9 > 8) {
                z13 = false;
            } else {
                z13 = z12;
            }
            r12 = r2;
            i8 = i9;
            z3 = z6;
            cVar = cVar3;
            z4 = z13;
        }
        z5 = r12 == true ? 1 : 0;
        this.p0 = arrayList15;
        if (z5) {
            r22[0] = i4;
            r22[1] = i3;
        }
        C(cVar7.l);
    }

    public final boolean R(int i) {
        return (this.C0 & i) == i;
    }

    @Override // com.gamericefishpro.space.k3.d
    public final void z() {
        this.v0.t();
        this.w0 = 0;
        this.x0 = 0;
        this.p0.clear();
        super.z();
    }
}
