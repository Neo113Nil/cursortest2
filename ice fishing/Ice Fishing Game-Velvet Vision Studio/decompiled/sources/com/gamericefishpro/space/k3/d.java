package com.gamericefishpro.space.k3;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.l3.k;
import com.gamericefishpro.space.l3.m;
import com.gamericefishpro.space.t0.y0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public float A;
    public final int[] B;
    public float C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final c H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public d S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public com.gamericefishpro.space.l3.c b;
    public int b0;
    public com.gamericefishpro.space.l3.c c;
    public float c0;
    public float d0;
    public View e0;
    public int f0;
    public String g0;
    public int h0;
    public int i0;
    public boolean j;
    public final float[] j0;
    public boolean k;
    public final d[] k0;
    public boolean l;
    public final d[] l0;
    public boolean m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public final int[] o0;
    public int p;
    public int q;
    public int r;
    public final int[] s;
    public int t;
    public int u;
    public float v;
    public int w;
    public int x;
    public float y;
    public int z;
    public boolean a = false;
    public k d = null;
    public m e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public d() {
        new HashMap();
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = new int[2];
        this.t = 0;
        this.u = 0;
        this.v = 1.0f;
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.z = -1;
        this.A = 1.0f;
        this.B = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.C = 0.0f;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        c cVar = new c(this, 2);
        this.H = cVar;
        c cVar2 = new c(this, 3);
        this.I = cVar2;
        c cVar3 = new c(this, 4);
        this.J = cVar3;
        c cVar4 = new c(this, 5);
        this.K = cVar4;
        c cVar5 = new c(this, 6);
        this.L = cVar5;
        c cVar6 = new c(this, 8);
        this.M = cVar6;
        c cVar7 = new c(this, 9);
        this.N = cVar7;
        c cVar8 = new c(this, 7);
        this.O = cVar8;
        this.P = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[]{-1.0f, -1.0f};
        this.k0 = new d[]{null, null};
        this.l0 = new d[]{null, null};
        this.m0 = -1;
        this.n0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public final void A() {
        d dVar = this.S;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c) arrayList.get(i)).j();
        }
    }

    public final void B() {
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            cVar.c = false;
            cVar.b = 0;
        }
    }

    public void C(com.gamericefishpro.space.a8.c cVar) {
        this.H.k();
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.O.k();
        this.M.k();
        this.N.k();
    }

    public final void D(int i) {
        this.Z = i;
        this.D = i > 0;
    }

    public final void E(int i, int i2) {
        if (this.j) {
            return;
        }
        this.H.l(i);
        this.J.l(i2);
        this.X = i;
        this.T = i2 - i;
        this.j = true;
    }

    public final void F(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        if (this.D) {
            this.L.l(i + this.Z);
        }
        this.k = true;
    }

    public final void G(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public final void H(int i) {
        this.o0[0] = i;
    }

    public final void I(int i) {
        this.o0[1] = i;
    }

    public final void J(int i) {
        this.T = i;
        int i2 = this.a0;
        if (i < i2) {
            this.T = i2;
        }
    }

    public void K(boolean z, boolean z2) {
        int i;
        int i2;
        k kVar = this.d;
        boolean z3 = z & kVar.g;
        m mVar = this.e;
        boolean z4 = z2 & mVar.g;
        int i3 = kVar.h.g;
        int i4 = mVar.h.g;
        int i5 = kVar.i.g;
        int i6 = mVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.X = i3;
        }
        if (z4) {
            this.Y = i4;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.T)) {
                i8 = i2;
            }
            this.T = i8;
            int i10 = this.a0;
            if (i8 < i10) {
                this.T = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.U)) {
                i9 = i;
            }
            this.U = i9;
            int i11 = this.b0;
            if (i9 < i11) {
                this.U = i11;
            }
        }
    }

    public void L(com.gamericefishpro.space.i3.c cVar, boolean z) {
        int i;
        int i2;
        m mVar;
        k kVar;
        cVar.getClass();
        int iN = com.gamericefishpro.space.i3.c.n(this.H);
        int iN2 = com.gamericefishpro.space.i3.c.n(this.I);
        int iN3 = com.gamericefishpro.space.i3.c.n(this.J);
        int iN4 = com.gamericefishpro.space.i3.c.n(this.K);
        if (z && (kVar = this.d) != null) {
            com.gamericefishpro.space.l3.f fVar = kVar.h;
            if (fVar.j) {
                com.gamericefishpro.space.l3.f fVar2 = kVar.i;
                if (fVar2.j) {
                    iN = fVar.g;
                    iN3 = fVar2.g;
                }
            }
        }
        if (z && (mVar = this.e) != null) {
            com.gamericefishpro.space.l3.f fVar3 = mVar.h;
            if (fVar3.j) {
                com.gamericefishpro.space.l3.f fVar4 = mVar.i;
                if (fVar4.j) {
                    iN2 = fVar3.g;
                    iN4 = fVar4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.X = iN;
        this.Y = iN2;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.T)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.U)) {
            i5 = i;
        }
        this.T = i4;
        this.U = i5;
        int i7 = this.b0;
        if (i5 < i7) {
            this.U = i7;
        }
        int i8 = this.a0;
        if (i4 < i8) {
            this.T = i8;
        }
        int i9 = this.u;
        if (i9 > 0 && i6 == 3) {
            this.T = Math.min(this.T, i9);
        }
        int i10 = this.x;
        if (i10 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i10);
        }
        int i11 = this.T;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.U;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(e eVar, com.gamericefishpro.space.i3.c cVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, cVar, this);
            hashSet.remove(this);
            b(cVar, eVar.R(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.H.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).d.a(eVar, cVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.J.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).d.a(eVar, cVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).d.a(eVar, cVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.K.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).d.a(eVar, cVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.L.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).d.a(eVar, cVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0204  */
    /* JADX WARN: Code duplicated, block: B:125:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0215  */
    /* JADX WARN: Code duplicated, block: B:130:0x021b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0226  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:135:0x023b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0261  */
    /* JADX WARN: Code duplicated, block: B:157:0x028b  */
    /* JADX WARN: Code duplicated, block: B:161:0x029a  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:187:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x03c7 A[PHI: r13
      0x03c7: PHI (r13v37 int) = (r13v22 int), (r13v22 int), (r13v34 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int) binds: [B:257:0x03cf, B:258:0x03d1, B:252:0x03bb, B:239:0x0390, B:245:0x039e, B:247:0x03a2, B:248:0x03a4, B:244:0x039a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:257:0x03cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:272:0x040d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0412 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x0416  */
    /* JADX WARN: Code duplicated, block: B:279:0x041a  */
    /* JADX WARN: Code duplicated, block: B:284:0x0426  */
    /* JADX WARN: Code duplicated, block: B:287:0x042e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0434  */
    /* JADX WARN: Code duplicated, block: B:292:0x0437  */
    /* JADX WARN: Code duplicated, block: B:295:0x0453  */
    /* JADX WARN: Code duplicated, block: B:314:0x049a  */
    /* JADX WARN: Code duplicated, block: B:330:0x0537  */
    /* JADX WARN: Code duplicated, block: B:346:0x058a  */
    /* JADX WARN: Code duplicated, block: B:349:0x059c  */
    /* JADX WARN: Code duplicated, block: B:352:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:389:0x0661  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:391:0x0667  */
    /* JADX WARN: Code duplicated, block: B:393:0x066e  */
    /* JADX WARN: Code duplicated, block: B:394:0x0697  */
    /* JADX WARN: Code duplicated, block: B:397:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:400:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [com.gamericefishpro.space.k3.d] */
    public void b(com.gamericefishpro.space.i3.c cVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean[] zArr;
        int i5;
        int i6;
        boolean z2;
        HashSet hashSet;
        d dVar;
        e eVar;
        WeakReference weakReference;
        WeakReference weakReference2;
        d dVar2;
        e eVar2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        c cVar2;
        boolean[] zArr3;
        boolean z3;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        boolean z5;
        int i13;
        boolean z6;
        float f;
        int i14;
        int i15;
        c cVar3;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int i19;
        boolean z8;
        boolean z9;
        c cVar4;
        int i20;
        c cVar5;
        com.gamericefishpro.space.i3.f fVar;
        com.gamericefishpro.space.i3.f fVar2;
        com.gamericefishpro.space.i3.f fVar3;
        boolean z10;
        ?? r3;
        ?? r4;
        int i21;
        com.gamericefishpro.space.i3.f fVar4;
        com.gamericefishpro.space.i3.f fVar5;
        com.gamericefishpro.space.i3.f fVar6;
        int i22;
        int i23;
        boolean z11;
        int i24;
        com.gamericefishpro.space.i3.f fVar7;
        ?? r27;
        m mVar;
        boolean z12;
        k kVar;
        int i25;
        int i26;
        boolean zU;
        int i27;
        boolean zV;
        k kVar2;
        m mVar2;
        boolean z13;
        ArrayList arrayList;
        int size;
        int i28;
        HashSet hashSet2;
        com.gamericefishpro.space.i3.c cVar6 = cVar;
        c cVar7 = this.H;
        com.gamericefishpro.space.i3.f fVarK = cVar6.k(cVar7);
        c cVar8 = this.J;
        com.gamericefishpro.space.i3.f fVarK2 = cVar6.k(cVar8);
        c cVar9 = this.I;
        com.gamericefishpro.space.i3.f fVarK3 = cVar6.k(cVar9);
        c cVar10 = this.K;
        com.gamericefishpro.space.i3.f fVarK4 = cVar6.k(cVar10);
        c cVar11 = this.L;
        com.gamericefishpro.space.i3.f fVarK5 = cVar6.k(cVar11);
        d dVar3 = this.S;
        if (dVar3 != null) {
            int[] iArr2 = dVar3.o0;
            i = 0;
            i3 = iArr2[0] == 2 ? 1 : 0;
            int i29 = iArr2[1] == 2 ? 1 : 0;
            int i30 = this.p;
            if (i30 != 1) {
                if (i30 == 2) {
                    i3 = 0;
                } else if (i30 != 3) {
                }
                i2 = i29;
            } else {
                i2 = 0;
            }
            i4 = this.f0;
            zArr = this.R;
            i5 = i2;
            if (i4 == 8) {
                arrayList = this.Q;
                size = arrayList.size();
                i6 = i3;
                i28 = i;
                while (true) {
                    if (i28 < size) {
                        if (!zArr[i] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i31 = size;
                    hashSet2 = ((c) arrayList.get(i28)).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i28++;
                    size = i31;
                }
            } else {
                i6 = i3;
            }
            z2 = this.j;
            if (z2 || this.k) {
                if (z2) {
                    cVar6.d(fVarK, this.X);
                    cVar6.d(fVarK2, this.X + this.T);
                    if (i6 != 0 && (dVar2 = this.S) != null) {
                        eVar2 = (e) dVar2;
                        weakReference3 = eVar2.G0;
                        if (weakReference3 != null || weakReference3.get() == null || cVar7.d() > ((c) eVar2.G0.get()).d()) {
                            eVar2.G0 = new WeakReference(cVar7);
                        }
                        weakReference4 = eVar2.I0;
                        if (weakReference4 != null || weakReference4.get() == null || cVar8.d() > ((c) eVar2.I0.get()).d()) {
                            eVar2.I0 = new WeakReference(cVar8);
                        }
                    }
                }
                if (this.k) {
                    cVar6.d(fVarK3, this.Y);
                    cVar6.d(fVarK4, this.Y + this.U);
                    hashSet = cVar11.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        cVar6.d(fVarK5, this.Y + this.Z);
                    }
                    if (i5 != 0 && (dVar = this.S) != null) {
                        eVar = (e) dVar;
                        weakReference = eVar.F0;
                        if (weakReference != null || weakReference.get() == null || cVar9.d() > ((c) eVar.F0.get()).d()) {
                            eVar.F0 = new WeakReference(cVar9);
                        }
                        weakReference2 = eVar.H0;
                        if (weakReference2 != null || weakReference2.get() == null || cVar10.d() > ((c) eVar.H0.get()).d()) {
                            eVar.H0 = new WeakReference(cVar10);
                        }
                    }
                }
                if (this.j && this.k) {
                    ?? r12 = i;
                    this.j = r12;
                    this.k = r12;
                    return;
                }
            }
            zArr2 = this.f;
            if (z || (kVar2 = this.d) == null || (mVar2 = this.e) == null) {
                cVar2 = cVar11;
                zArr3 = zArr2;
            } else {
                cVar2 = cVar11;
                com.gamericefishpro.space.l3.f fVar8 = kVar2.h;
                zArr3 = zArr2;
                if (fVar8.j && kVar2.i.j && mVar2.h.j && mVar2.i.j) {
                    cVar6.d(fVarK, fVar8.g);
                    cVar6.d(fVarK2, this.d.i.g);
                    cVar6.d(fVarK3, this.e.h.g);
                    cVar6.d(fVarK4, this.e.i.g);
                    cVar6.d(fVarK5, this.e.k.g);
                    if (this.S == null) {
                        z13 = false;
                    } else {
                        if (i6 != 0 && zArr3[0] && !u()) {
                            cVar6.f(cVar6.k(this.S.J), fVarK2, 0, 8);
                        }
                        if (i5 == 0 || !zArr3[1] || v()) {
                            z13 = false;
                        } else {
                            z13 = false;
                            cVar6.f(cVar6.k(this.S.K), fVarK4, 0, 8);
                        }
                    }
                    this.j = z13;
                    this.k = z13;
                    return;
                }
            }
            if (this.S != null) {
                if (t(0)) {
                    ((e) this.S).M(this, 0);
                    zU = true;
                    i27 = 1;
                } else {
                    zU = u();
                    i27 = 1;
                }
                if (t(i27)) {
                    ((e) this.S).M(this, i27);
                    zV = true;
                } else {
                    zV = v();
                }
                if (zU && i6 != 0 && this.f0 != 8 && cVar7.f == null && cVar8.f == null) {
                    cVar6.f(cVar6.k(this.S.J), fVarK2, 0, 1);
                }
                if (!zV && i5 != 0 && this.f0 != 8 && cVar9.f == null && cVar10.f == null && cVar2 == null) {
                    cVar6.f(cVar6.k(this.S.K), fVarK4, 0, 1);
                }
                z4 = zV;
                z3 = zU;
            } else {
                cVar7 = cVar7;
                z3 = false;
                z4 = false;
            }
            i7 = this.T;
            i8 = this.a0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.U;
            i10 = this.b0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            iArr = this.o0;
            i12 = iArr[0];
            if (i12 != 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            i13 = iArr[1];
            if (i13 != 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i32 = this.W;
            this.z = i32;
            f = this.V;
            this.A = f;
            i14 = this.q;
            i15 = this.r;
            if (f > 0.0f) {
                cVar3 = cVar10;
                if (this.f0 != 8) {
                    if (i12 == 3 || i14 != 0) {
                        i17 = i14;
                    } else {
                        i17 = 3;
                    }
                    if (i13 == 3 || i15 != 0) {
                        i26 = i15;
                    } else {
                        i26 = 3;
                    }
                    if (i12 == 3 || i13 != 3 || i17 != 3 || i26 != 3) {
                        if (i12 != 3 && i17 == 3) {
                            this.z = 0;
                            i8 = (int) (f * i9);
                            if (i13 != 3) {
                                cVar2 = cVar2;
                                i16 = i11;
                                i17 = 4;
                                z7 = false;
                            }
                            i18 = i26;
                            int[] iArr3 = this.s;
                            iArr3[0] = i17;
                            iArr3[1] = i18;
                            if (z7) {
                                int i33 = this.z;
                                i19 = -1;
                                if (i33 != 0) {
                                }
                                if (z7) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (iArr[0] == 2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    i8 = 0;
                                }
                                cVar4 = this.O;
                                boolean z14 = !cVar4.h();
                                char c = '\b';
                                boolean z15 = zArr[0];
                                boolean z16 = zArr[1];
                                i20 = this.n;
                                int[] iArr4 = this.B;
                                if (i20 != 2) {
                                    cVar5 = cVar2;
                                    fVar = fVarK;
                                    fVar2 = fVarK2;
                                    fVar3 = fVarK5;
                                    z10 = z3;
                                    r3 = i6;
                                    r4 = i5;
                                    i21 = i17;
                                } else {
                                    cVar5 = cVar2;
                                    fVar = fVarK;
                                    fVar2 = fVarK2;
                                    fVar3 = fVarK5;
                                    z10 = z3;
                                    r3 = i6;
                                    r4 = i5;
                                    i21 = i17;
                                }
                                if (z) {
                                    fVar4 = r33;
                                    fVar5 = fVarK4;
                                    fVar6 = fVar3;
                                    i22 = 0;
                                    i23 = 8;
                                    z11 = true;
                                    i24 = 1;
                                } else {
                                    fVar4 = r33;
                                    fVar5 = fVarK4;
                                    fVar6 = fVar3;
                                    i22 = 0;
                                    i23 = 8;
                                    z11 = true;
                                    i24 = 1;
                                }
                                if (this.o == 2) {
                                    i24 = i22;
                                }
                                if (i24 != 0) {
                                    fVar7 = fVar4;
                                } else {
                                    fVar7 = fVar4;
                                }
                                if (z7) {
                                    if (this.z == 1) {
                                        float f2 = this.A;
                                        com.gamericefishpro.space.i3.b bVarL = cVar6.l();
                                        bVarL.d.g(fVar5, -1.0f);
                                        bVarL.d.g(fVar7, 1.0f);
                                        bVarL.d.g(fVar2, f2);
                                        bVarL.d.g(fVar, -f2);
                                        cVar6.c(bVarL);
                                    } else {
                                        float f3 = this.A;
                                        com.gamericefishpro.space.i3.b bVarL2 = cVar6.l();
                                        bVarL2.d.g(fVar2, -1.0f);
                                        bVarL2.d.g(fVar, 1.0f);
                                        bVarL2.d.g(fVar5, f3);
                                        bVarL2.d.g(fVar7, -f3);
                                        cVar6.c(bVarL2);
                                    }
                                }
                                if (cVar4.h()) {
                                    d dVar4 = cVar4.f.d;
                                    float radians = (float) Math.toRadians(this.C + 90.0f);
                                    int iE = cVar4.e();
                                    com.gamericefishpro.space.i3.f fVarK6 = cVar6.k(i(2));
                                    com.gamericefishpro.space.i3.f fVarK7 = cVar6.k(i(3));
                                    com.gamericefishpro.space.i3.f fVarK8 = cVar6.k(i(4));
                                    com.gamericefishpro.space.i3.f fVarK9 = cVar6.k(i(5));
                                    com.gamericefishpro.space.i3.f fVarK10 = cVar6.k(dVar4.i(2));
                                    com.gamericefishpro.space.i3.f fVarK11 = cVar6.k(dVar4.i(3));
                                    com.gamericefishpro.space.i3.f fVarK12 = cVar6.k(dVar4.i(4));
                                    com.gamericefishpro.space.i3.f fVarK13 = cVar6.k(dVar4.i(5));
                                    com.gamericefishpro.space.i3.b bVarL3 = cVar6.l();
                                    double d = radians;
                                    double dSin = Math.sin(d);
                                    double d2 = iE;
                                    bVarL3.d.g(fVarK11, 0.5f);
                                    bVarL3.d.g(fVarK13, 0.5f);
                                    bVarL3.d.g(fVarK7, -0.5f);
                                    bVarL3.d.g(fVarK9, -0.5f);
                                    bVarL3.b = -((float) (dSin * d2));
                                    cVar6.c(bVarL3);
                                    com.gamericefishpro.space.i3.b bVarL4 = cVar6.l();
                                    float fCos = (float) (Math.cos(d) * d2);
                                    bVarL4.d.g(fVarK10, 0.5f);
                                    bVarL4.d.g(fVarK12, 0.5f);
                                    bVarL4.d.g(fVarK6, -0.5f);
                                    bVarL4.d.g(fVarK8, -0.5f);
                                    bVarL4.b = -fCos;
                                    cVar6.c(bVarL4);
                                }
                                this.j = false;
                                this.k = false;
                            }
                            i19 = -1;
                            if (z7) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (iArr[0] == 2) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                i8 = 0;
                            }
                            cVar4 = this.O;
                            boolean z17 = !cVar4.h();
                            char c2 = '\b';
                            boolean z18 = zArr[0];
                            boolean z19 = zArr[1];
                            i20 = this.n;
                            int[] iArr5 = this.B;
                            if (i20 != 2) {
                                cVar5 = cVar2;
                                fVar = fVarK;
                                fVar2 = fVarK2;
                                fVar3 = fVarK5;
                                z10 = z3;
                                r3 = i6;
                                r4 = i5;
                                i21 = i17;
                            } else {
                                cVar5 = cVar2;
                                fVar = fVarK;
                                fVar2 = fVarK2;
                                fVar3 = fVarK5;
                                z10 = z3;
                                r3 = i6;
                                r4 = i5;
                                i21 = i17;
                            }
                            if (z) {
                                fVar4 = r33;
                                fVar5 = fVarK4;
                                fVar6 = fVar3;
                                i22 = 0;
                                i23 = 8;
                                z11 = true;
                                i24 = 1;
                            } else {
                                fVar4 = r33;
                                fVar5 = fVarK4;
                                fVar6 = fVar3;
                                i22 = 0;
                                i23 = 8;
                                z11 = true;
                                i24 = 1;
                            }
                            if (this.o == 2) {
                                i24 = i22;
                            }
                            if (i24 != 0) {
                                fVar7 = fVar4;
                            } else {
                                fVar7 = fVar4;
                            }
                            if (z7) {
                                if (this.z == 1) {
                                    float f4 = this.A;
                                    com.gamericefishpro.space.i3.b bVarL5 = cVar6.l();
                                    bVarL5.d.g(fVar5, -1.0f);
                                    bVarL5.d.g(fVar7, 1.0f);
                                    bVarL5.d.g(fVar2, f4);
                                    bVarL5.d.g(fVar, -f4);
                                    cVar6.c(bVarL5);
                                } else {
                                    float f5 = this.A;
                                    com.gamericefishpro.space.i3.b bVarL6 = cVar6.l();
                                    bVarL6.d.g(fVar2, -1.0f);
                                    bVarL6.d.g(fVar, 1.0f);
                                    bVarL6.d.g(fVar5, f5);
                                    bVarL6.d.g(fVar7, -f5);
                                    cVar6.c(bVarL6);
                                }
                            }
                            if (cVar4.h()) {
                                d dVar5 = cVar4.f.d;
                                float radians2 = (float) Math.toRadians(this.C + 90.0f);
                                int iE2 = cVar4.e();
                                com.gamericefishpro.space.i3.f fVarK14 = cVar6.k(i(2));
                                com.gamericefishpro.space.i3.f fVarK15 = cVar6.k(i(3));
                                com.gamericefishpro.space.i3.f fVarK16 = cVar6.k(i(4));
                                com.gamericefishpro.space.i3.f fVarK17 = cVar6.k(i(5));
                                com.gamericefishpro.space.i3.f fVarK18 = cVar6.k(dVar5.i(2));
                                com.gamericefishpro.space.i3.f fVarK19 = cVar6.k(dVar5.i(3));
                                com.gamericefishpro.space.i3.f fVarK110 = cVar6.k(dVar5.i(4));
                                com.gamericefishpro.space.i3.f fVarK111 = cVar6.k(dVar5.i(5));
                                com.gamericefishpro.space.i3.b bVarL7 = cVar6.l();
                                double d3 = radians2;
                                double dSin2 = Math.sin(d3);
                                double d4 = iE2;
                                bVarL7.d.g(fVarK19, 0.5f);
                                bVarL7.d.g(fVarK111, 0.5f);
                                bVarL7.d.g(fVarK15, -0.5f);
                                bVarL7.d.g(fVarK17, -0.5f);
                                bVarL7.b = -((float) (dSin2 * d4));
                                cVar6.c(bVarL7);
                                com.gamericefishpro.space.i3.b bVarL8 = cVar6.l();
                                float fCos2 = (float) (Math.cos(d3) * d4);
                                bVarL8.d.g(fVarK18, 0.5f);
                                bVarL8.d.g(fVarK110, 0.5f);
                                bVarL8.d.g(fVarK14, -0.5f);
                                bVarL8.d.g(fVarK16, -0.5f);
                                bVarL8.b = -fCos2;
                                cVar6.c(bVarL8);
                            }
                            this.j = false;
                            this.k = false;
                        }
                        if (i13 != 3 && i26 == 3) {
                            this.z = 1;
                            if (i32 == -1) {
                                this.A = 1.0f / f;
                            }
                            i16 = (int) (this.A * i7);
                            if (i12 != 3) {
                                i17 = i17;
                                i18 = 4;
                            }
                        }
                        z7 = true;
                        i18 = i26;
                        int[] iArr6 = this.s;
                        iArr6[0] = i17;
                        iArr6[1] = i18;
                        if (z7) {
                            int i34 = this.z;
                            i19 = -1;
                            boolean z20 = i34 != 0 || i34 == -1;
                            if (z7 || !((i25 = this.z) == 1 || i25 == i19)) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            if (iArr[0] == 2 || !(this instanceof e)) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (z9) {
                                i8 = 0;
                            }
                            cVar4 = this.O;
                            boolean z110 = !cVar4.h();
                            char c3 = '\b';
                            boolean z111 = zArr[0];
                            boolean z112 = zArr[1];
                            i20 = this.n;
                            int[] iArr7 = this.B;
                            if (i20 != 2 || this.j) {
                                cVar5 = cVar2;
                                fVar = fVarK;
                                fVar2 = fVarK2;
                                fVar3 = fVarK5;
                                z10 = z3;
                                r3 = i6;
                                r4 = i5;
                                i21 = i17;
                            } else {
                                if (z && (kVar = this.d) != null) {
                                    com.gamericefishpro.space.l3.f fVar9 = kVar.h;
                                    if (fVar9.j && kVar.i.j) {
                                        if (z) {
                                            cVar6.d(fVarK, fVar9.g);
                                            cVar6.d(fVarK2, this.d.i.g);
                                            if (this.S != null && i6 != 0 && zArr3[0] && !u()) {
                                                cVar6.f(cVar6.k(this.S.J), fVarK2, 0, 8);
                                            }
                                        }
                                        cVar5 = cVar2;
                                        fVar = fVarK;
                                        fVar2 = fVarK2;
                                        fVar3 = fVarK5;
                                        z10 = z3;
                                        r3 = i6;
                                        r4 = i5;
                                        i21 = i17;
                                    } else {
                                        c3 = '\b';
                                    }
                                }
                                d dVar6 = this.S;
                                com.gamericefishpro.space.i3.f fVarK20 = dVar6 != null ? cVar6.k(dVar6.J) : null;
                                d dVar7 = this.S;
                                com.gamericefishpro.space.i3.f fVarK21 = dVar7 != null ? cVar6.k(dVar7.H) : null;
                                ?? r5 = i6;
                                i21 = i17;
                                z10 = z3;
                                boolean z21 = z20;
                                fVar = fVarK;
                                ?? r6 = i5;
                                fVar2 = fVarK2;
                                cVar5 = cVar2;
                                fVar3 = fVarK5;
                                cVar6 = cVar;
                                d(cVar6, true, r5, r6, zArr3[0], fVarK21, fVarK20, iArr[0], z9, this.H, this.J, this.X, i8, this.a0, iArr7[0], this.c0, z21, iArr[1] == 3, z10, z4, z111, i21, i18, this.t, this.u, this.v, z110);
                                r3 = r5;
                                r4 = r6;
                            }
                            if (z || (mVar = this.e) == null) {
                                fVar4 = r33;
                                fVar5 = fVarK4;
                                fVar6 = fVar3;
                                i22 = 0;
                                i23 = 8;
                                z11 = true;
                                i24 = 1;
                            } else {
                                com.gamericefishpro.space.l3.f fVar10 = mVar.h;
                                if (fVar10.j && mVar.i.j) {
                                    int i35 = fVar10.g;
                                    fVar4 = fVarK3;
                                    cVar6.d(fVar4, i35);
                                    fVar5 = fVarK4;
                                    cVar6.d(fVar5, this.e.i.g);
                                    fVar6 = fVar3;
                                    cVar6.d(fVar6, this.e.k.g);
                                    d dVar8 = this.S;
                                    if (dVar8 == null || z4 || r4 == 0) {
                                        i22 = 0;
                                        i23 = 8;
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                        z12 = true;
                                        if (zArr3[1]) {
                                            i22 = 0;
                                            i23 = 8;
                                            cVar6.f(cVar6.k(dVar8.K), fVar5, 0, 8);
                                        } else {
                                            i22 = 0;
                                            i23 = 8;
                                        }
                                    }
                                    i24 = i22;
                                    z11 = z12;
                                } else {
                                    fVar4 = r33;
                                    fVar5 = fVarK4;
                                    fVar6 = fVar3;
                                    i22 = 0;
                                    i23 = 8;
                                    z11 = true;
                                    i24 = 1;
                                }
                            }
                            if (this.o == 2) {
                                i24 = i22;
                            }
                            if (i24 != 0 || this.k) {
                                fVar7 = fVar4;
                            } else {
                                int i36 = (iArr[z11 ? 1 : 0] == 2 && (this instanceof e)) ? z11 ? 1 : 0 : i22;
                                int i37 = i36 != 0 ? i22 : i16;
                                d dVar9 = this.S;
                                com.gamericefishpro.space.i3.f fVarK22 = dVar9 != null ? cVar6.k(dVar9.K) : null;
                                d dVar10 = this.S;
                                com.gamericefishpro.space.i3.f fVarK23 = dVar10 != null ? cVar6.k(dVar10.I) : null;
                                int i38 = this.Z;
                                if (i38 > 0 || this.f0 == i23) {
                                    r27 = z110;
                                    c cVar12 = cVar5;
                                    if (cVar12.f != null) {
                                        cVar6.e(fVar6, fVar4, i38, i23);
                                        cVar6.e(fVar6, cVar6.k(cVar12.f), cVar12.e(), i23);
                                        if (r4 != 0) {
                                            cVar6.f(fVarK22, cVar6.k(cVar3), i22, 5);
                                        }
                                        r27 = i22;
                                    } else if (this.f0 == i23) {
                                        cVar6.e(fVar6, fVar4, cVar12.e(), i23);
                                        r27 = z110;
                                    } else {
                                        cVar6.e(fVar6, fVar4, i38, i23);
                                        r27 = z110;
                                    }
                                }
                                r27 = z110;
                                boolean z22 = zArr3[z11 ? 1 : 0];
                                int i39 = i22;
                                int i40 = iArr[z11 ? 1 : 0];
                                int i41 = this.Y;
                                int i42 = this.b0;
                                int i43 = iArr7[z11 ? 1 : 0];
                                float f6 = this.d0;
                                int i44 = iArr[i39];
                                boolean z23 = z11 ? 1 : 0;
                                ?? r18 = z11;
                                if (i44 != 3) {
                                    r18 = i39;
                                }
                                fVar7 = fVar4;
                                cVar6 = cVar;
                                d(cVar6, false, r4, r3, z22, fVarK23, fVarK22, i40, i36, this.I, this.K, i41, i37, i42, i43, f6, z8, r18, z4, z10, z112, i18, i21, this.w, this.x, this.y, r27);
                            }
                            if (z7) {
                                if (this.z == 1) {
                                    float f7 = this.A;
                                    com.gamericefishpro.space.i3.b bVarL9 = cVar6.l();
                                    bVarL9.d.g(fVar5, -1.0f);
                                    bVarL9.d.g(fVar7, 1.0f);
                                    bVarL9.d.g(fVar2, f7);
                                    bVarL9.d.g(fVar, -f7);
                                    cVar6.c(bVarL9);
                                } else {
                                    float f8 = this.A;
                                    com.gamericefishpro.space.i3.b bVarL10 = cVar6.l();
                                    bVarL10.d.g(fVar2, -1.0f);
                                    bVarL10.d.g(fVar, 1.0f);
                                    bVarL10.d.g(fVar5, f8);
                                    bVarL10.d.g(fVar7, -f8);
                                    cVar6.c(bVarL10);
                                }
                            }
                            if (cVar4.h()) {
                                d dVar11 = cVar4.f.d;
                                float radians3 = (float) Math.toRadians(this.C + 90.0f);
                                int iE3 = cVar4.e();
                                com.gamericefishpro.space.i3.f fVarK112 = cVar6.k(i(2));
                                com.gamericefishpro.space.i3.f fVarK113 = cVar6.k(i(3));
                                com.gamericefishpro.space.i3.f fVarK114 = cVar6.k(i(4));
                                com.gamericefishpro.space.i3.f fVarK115 = cVar6.k(i(5));
                                com.gamericefishpro.space.i3.f fVarK116 = cVar6.k(dVar11.i(2));
                                com.gamericefishpro.space.i3.f fVarK117 = cVar6.k(dVar11.i(3));
                                com.gamericefishpro.space.i3.f fVarK118 = cVar6.k(dVar11.i(4));
                                com.gamericefishpro.space.i3.f fVarK119 = cVar6.k(dVar11.i(5));
                                com.gamericefishpro.space.i3.b bVarL11 = cVar6.l();
                                double d5 = radians3;
                                double dSin3 = Math.sin(d5);
                                double d6 = iE3;
                                bVarL11.d.g(fVarK117, 0.5f);
                                bVarL11.d.g(fVarK119, 0.5f);
                                bVarL11.d.g(fVarK113, -0.5f);
                                bVarL11.d.g(fVarK115, -0.5f);
                                bVarL11.b = -((float) (dSin3 * d6));
                                cVar6.c(bVarL11);
                                com.gamericefishpro.space.i3.b bVarL12 = cVar6.l();
                                float fCos3 = (float) (Math.cos(d5) * d6);
                                bVarL12.d.g(fVarK116, 0.5f);
                                bVarL12.d.g(fVarK118, 0.5f);
                                bVarL12.d.g(fVarK112, -0.5f);
                                bVarL12.d.g(fVarK114, -0.5f);
                                bVarL12.b = -fCos3;
                                cVar6.c(bVarL12);
                            }
                            this.j = false;
                            this.k = false;
                        }
                        i19 = -1;
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (iArr[0] == 2) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i8 = 0;
                        }
                        cVar4 = this.O;
                        boolean z113 = !cVar4.h();
                        char c4 = '\b';
                        boolean z114 = zArr[0];
                        boolean z115 = zArr[1];
                        i20 = this.n;
                        int[] iArr8 = this.B;
                        if (i20 != 2) {
                            cVar5 = cVar2;
                            fVar = fVarK;
                            fVar2 = fVarK2;
                            fVar3 = fVarK5;
                            z10 = z3;
                            r3 = i6;
                            r4 = i5;
                            i21 = i17;
                        } else {
                            cVar5 = cVar2;
                            fVar = fVarK;
                            fVar2 = fVarK2;
                            fVar3 = fVarK5;
                            z10 = z3;
                            r3 = i6;
                            r4 = i5;
                            i21 = i17;
                        }
                        if (z) {
                            fVar4 = r33;
                            fVar5 = fVarK4;
                            fVar6 = fVar3;
                            i22 = 0;
                            i23 = 8;
                            z11 = true;
                            i24 = 1;
                        } else {
                            fVar4 = r33;
                            fVar5 = fVarK4;
                            fVar6 = fVar3;
                            i22 = 0;
                            i23 = 8;
                            z11 = true;
                            i24 = 1;
                        }
                        if (this.o == 2) {
                            i24 = i22;
                        }
                        if (i24 != 0) {
                            fVar7 = fVar4;
                        } else {
                            fVar7 = fVar4;
                        }
                        if (z7) {
                            if (this.z == 1) {
                                float f9 = this.A;
                                com.gamericefishpro.space.i3.b bVarL13 = cVar6.l();
                                bVarL13.d.g(fVar5, -1.0f);
                                bVarL13.d.g(fVar7, 1.0f);
                                bVarL13.d.g(fVar2, f9);
                                bVarL13.d.g(fVar, -f9);
                                cVar6.c(bVarL13);
                            } else {
                                float f10 = this.A;
                                com.gamericefishpro.space.i3.b bVarL14 = cVar6.l();
                                bVarL14.d.g(fVar2, -1.0f);
                                bVarL14.d.g(fVar, 1.0f);
                                bVarL14.d.g(fVar5, f10);
                                bVarL14.d.g(fVar7, -f10);
                                cVar6.c(bVarL14);
                            }
                        }
                        if (cVar4.h()) {
                            d dVar12 = cVar4.f.d;
                            float radians4 = (float) Math.toRadians(this.C + 90.0f);
                            int iE4 = cVar4.e();
                            com.gamericefishpro.space.i3.f fVarK1110 = cVar6.k(i(2));
                            com.gamericefishpro.space.i3.f fVarK1111 = cVar6.k(i(3));
                            com.gamericefishpro.space.i3.f fVarK1112 = cVar6.k(i(4));
                            com.gamericefishpro.space.i3.f fVarK1113 = cVar6.k(i(5));
                            com.gamericefishpro.space.i3.f fVarK1114 = cVar6.k(dVar12.i(2));
                            com.gamericefishpro.space.i3.f fVarK1115 = cVar6.k(dVar12.i(3));
                            com.gamericefishpro.space.i3.f fVarK1116 = cVar6.k(dVar12.i(4));
                            com.gamericefishpro.space.i3.f fVarK1117 = cVar6.k(dVar12.i(5));
                            com.gamericefishpro.space.i3.b bVarL15 = cVar6.l();
                            double d7 = radians4;
                            double dSin4 = Math.sin(d7);
                            double d8 = iE4;
                            bVarL15.d.g(fVarK1115, 0.5f);
                            bVarL15.d.g(fVarK1117, 0.5f);
                            bVarL15.d.g(fVarK1111, -0.5f);
                            bVarL15.d.g(fVarK1113, -0.5f);
                            bVarL15.b = -((float) (dSin4 * d8));
                            cVar6.c(bVarL15);
                            com.gamericefishpro.space.i3.b bVarL16 = cVar6.l();
                            float fCos4 = (float) (Math.cos(d7) * d8);
                            bVarL16.d.g(fVarK1114, 0.5f);
                            bVarL16.d.g(fVarK1116, 0.5f);
                            bVarL16.d.g(fVarK1110, -0.5f);
                            bVarL16.d.g(fVarK1112, -0.5f);
                            bVarL16.b = -fCos4;
                            cVar6.c(bVarL16);
                        }
                        this.j = false;
                        this.k = false;
                    }
                    if (i32 == -1) {
                        if (z5 && !z6) {
                            this.z = 0;
                        } else if (!z5 && z6) {
                            this.z = 1;
                            if (i32 == -1) {
                                this.A = 1.0f / f;
                            }
                        }
                    }
                    if (this.z == 0 && (!cVar9.h() || !cVar3.h())) {
                        this.z = 1;
                    } else if (this.z == 1 && (!cVar7.h() || !cVar8.h())) {
                        this.z = 0;
                    }
                    if (this.z == -1 && (!cVar9.h() || !cVar3.h() || !cVar7.h() || !cVar8.h())) {
                        if (cVar9.h() && cVar3.h()) {
                            this.z = 0;
                        } else if (cVar7.h() && cVar8.h()) {
                            this.A = 1.0f / this.A;
                            this.z = 1;
                        }
                    }
                    if (this.z == -1) {
                        int i45 = this.t;
                        if (i45 > 0 && this.w == 0) {
                            this.z = 0;
                        } else if (i45 == 0 && this.w > 0) {
                            this.A = 1.0f / this.A;
                            this.z = 1;
                        }
                    }
                    i16 = i11;
                    z7 = true;
                    i18 = i26;
                    int[] iArr9 = this.s;
                    iArr9[0] = i17;
                    iArr9[1] = i18;
                    if (z7) {
                        int i310 = this.z;
                        i19 = -1;
                        if (i310 != 0) {
                        }
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (iArr[0] == 2) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i8 = 0;
                        }
                        cVar4 = this.O;
                        boolean z116 = !cVar4.h();
                        char c5 = '\b';
                        boolean z117 = zArr[0];
                        boolean z118 = zArr[1];
                        i20 = this.n;
                        int[] iArr10 = this.B;
                        if (i20 != 2) {
                            cVar5 = cVar2;
                            fVar = fVarK;
                            fVar2 = fVarK2;
                            fVar3 = fVarK5;
                            z10 = z3;
                            r3 = i6;
                            r4 = i5;
                            i21 = i17;
                        } else {
                            cVar5 = cVar2;
                            fVar = fVarK;
                            fVar2 = fVarK2;
                            fVar3 = fVarK5;
                            z10 = z3;
                            r3 = i6;
                            r4 = i5;
                            i21 = i17;
                        }
                        if (z) {
                            fVar4 = r33;
                            fVar5 = fVarK4;
                            fVar6 = fVar3;
                            i22 = 0;
                            i23 = 8;
                            z11 = true;
                            i24 = 1;
                        } else {
                            fVar4 = r33;
                            fVar5 = fVarK4;
                            fVar6 = fVar3;
                            i22 = 0;
                            i23 = 8;
                            z11 = true;
                            i24 = 1;
                        }
                        if (this.o == 2) {
                            i24 = i22;
                        }
                        if (i24 != 0) {
                            fVar7 = fVar4;
                        } else {
                            fVar7 = fVar4;
                        }
                        if (z7) {
                            if (this.z == 1) {
                                float f11 = this.A;
                                com.gamericefishpro.space.i3.b bVarL17 = cVar6.l();
                                bVarL17.d.g(fVar5, -1.0f);
                                bVarL17.d.g(fVar7, 1.0f);
                                bVarL17.d.g(fVar2, f11);
                                bVarL17.d.g(fVar, -f11);
                                cVar6.c(bVarL17);
                            } else {
                                float f12 = this.A;
                                com.gamericefishpro.space.i3.b bVarL18 = cVar6.l();
                                bVarL18.d.g(fVar2, -1.0f);
                                bVarL18.d.g(fVar, 1.0f);
                                bVarL18.d.g(fVar5, f12);
                                bVarL18.d.g(fVar7, -f12);
                                cVar6.c(bVarL18);
                            }
                        }
                        if (cVar4.h()) {
                            d dVar13 = cVar4.f.d;
                            float radians5 = (float) Math.toRadians(this.C + 90.0f);
                            int iE5 = cVar4.e();
                            com.gamericefishpro.space.i3.f fVarK1118 = cVar6.k(i(2));
                            com.gamericefishpro.space.i3.f fVarK1119 = cVar6.k(i(3));
                            com.gamericefishpro.space.i3.f fVarK11110 = cVar6.k(i(4));
                            com.gamericefishpro.space.i3.f fVarK11111 = cVar6.k(i(5));
                            com.gamericefishpro.space.i3.f fVarK11112 = cVar6.k(dVar13.i(2));
                            com.gamericefishpro.space.i3.f fVarK11113 = cVar6.k(dVar13.i(3));
                            com.gamericefishpro.space.i3.f fVarK11114 = cVar6.k(dVar13.i(4));
                            com.gamericefishpro.space.i3.f fVarK11115 = cVar6.k(dVar13.i(5));
                            com.gamericefishpro.space.i3.b bVarL19 = cVar6.l();
                            double d9 = radians5;
                            double dSin5 = Math.sin(d9);
                            double d10 = iE5;
                            bVarL19.d.g(fVarK11113, 0.5f);
                            bVarL19.d.g(fVarK11115, 0.5f);
                            bVarL19.d.g(fVarK1119, -0.5f);
                            bVarL19.d.g(fVarK11111, -0.5f);
                            bVarL19.b = -((float) (dSin5 * d10));
                            cVar6.c(bVarL19);
                            com.gamericefishpro.space.i3.b bVarL110 = cVar6.l();
                            float fCos5 = (float) (Math.cos(d9) * d10);
                            bVarL110.d.g(fVarK11112, 0.5f);
                            bVarL110.d.g(fVarK11114, 0.5f);
                            bVarL110.d.g(fVarK1118, -0.5f);
                            bVarL110.d.g(fVarK11110, -0.5f);
                            bVarL110.b = -fCos5;
                            cVar6.c(bVarL110);
                        }
                        this.j = false;
                        this.k = false;
                    }
                    i19 = -1;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (iArr[0] == 2) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    cVar4 = this.O;
                    boolean z119 = !cVar4.h();
                    char c6 = '\b';
                    boolean z1110 = zArr[0];
                    boolean z1111 = zArr[1];
                    i20 = this.n;
                    int[] iArr11 = this.B;
                    if (i20 != 2) {
                        cVar5 = cVar2;
                        fVar = fVarK;
                        fVar2 = fVarK2;
                        fVar3 = fVarK5;
                        z10 = z3;
                        r3 = i6;
                        r4 = i5;
                        i21 = i17;
                    } else {
                        cVar5 = cVar2;
                        fVar = fVarK;
                        fVar2 = fVarK2;
                        fVar3 = fVarK5;
                        z10 = z3;
                        r3 = i6;
                        r4 = i5;
                        i21 = i17;
                    }
                    if (z) {
                        fVar4 = r33;
                        fVar5 = fVarK4;
                        fVar6 = fVar3;
                        i22 = 0;
                        i23 = 8;
                        z11 = true;
                        i24 = 1;
                    } else {
                        fVar4 = r33;
                        fVar5 = fVarK4;
                        fVar6 = fVar3;
                        i22 = 0;
                        i23 = 8;
                        z11 = true;
                        i24 = 1;
                    }
                    if (this.o == 2) {
                        i24 = i22;
                    }
                    if (i24 != 0) {
                        fVar7 = fVar4;
                    } else {
                        fVar7 = fVar4;
                    }
                    if (z7) {
                        if (this.z == 1) {
                            float f13 = this.A;
                            com.gamericefishpro.space.i3.b bVarL111 = cVar6.l();
                            bVarL111.d.g(fVar5, -1.0f);
                            bVarL111.d.g(fVar7, 1.0f);
                            bVarL111.d.g(fVar2, f13);
                            bVarL111.d.g(fVar, -f13);
                            cVar6.c(bVarL111);
                        } else {
                            float f14 = this.A;
                            com.gamericefishpro.space.i3.b bVarL112 = cVar6.l();
                            bVarL112.d.g(fVar2, -1.0f);
                            bVarL112.d.g(fVar, 1.0f);
                            bVarL112.d.g(fVar5, f14);
                            bVarL112.d.g(fVar7, -f14);
                            cVar6.c(bVarL112);
                        }
                    }
                    if (cVar4.h()) {
                        d dVar14 = cVar4.f.d;
                        float radians6 = (float) Math.toRadians(this.C + 90.0f);
                        int iE6 = cVar4.e();
                        com.gamericefishpro.space.i3.f fVarK11116 = cVar6.k(i(2));
                        com.gamericefishpro.space.i3.f fVarK11117 = cVar6.k(i(3));
                        com.gamericefishpro.space.i3.f fVarK11118 = cVar6.k(i(4));
                        com.gamericefishpro.space.i3.f fVarK11119 = cVar6.k(i(5));
                        com.gamericefishpro.space.i3.f fVarK111110 = cVar6.k(dVar14.i(2));
                        com.gamericefishpro.space.i3.f fVarK111111 = cVar6.k(dVar14.i(3));
                        com.gamericefishpro.space.i3.f fVarK111112 = cVar6.k(dVar14.i(4));
                        com.gamericefishpro.space.i3.f fVarK111113 = cVar6.k(dVar14.i(5));
                        com.gamericefishpro.space.i3.b bVarL113 = cVar6.l();
                        double d11 = radians6;
                        double dSin6 = Math.sin(d11);
                        double d12 = iE6;
                        bVarL113.d.g(fVarK111111, 0.5f);
                        bVarL113.d.g(fVarK111113, 0.5f);
                        bVarL113.d.g(fVarK11117, -0.5f);
                        bVarL113.d.g(fVarK11119, -0.5f);
                        bVarL113.b = -((float) (dSin6 * d12));
                        cVar6.c(bVarL113);
                        com.gamericefishpro.space.i3.b bVarL114 = cVar6.l();
                        float fCos6 = (float) (Math.cos(d11) * d12);
                        bVarL114.d.g(fVarK111110, 0.5f);
                        bVarL114.d.g(fVarK111112, 0.5f);
                        bVarL114.d.g(fVarK11116, -0.5f);
                        bVarL114.d.g(fVarK11118, -0.5f);
                        bVarL114.b = -fCos6;
                        cVar6.c(bVarL114);
                    }
                    this.j = false;
                    this.k = false;
                }
                z7 = false;
                int[] iArr12 = this.s;
                iArr12[0] = i17;
                iArr12[1] = i18;
                if (z7) {
                    int i311 = this.z;
                    i19 = -1;
                    if (i311 != 0) {
                    }
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (iArr[0] == 2) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    cVar4 = this.O;
                    boolean z1112 = !cVar4.h();
                    char c7 = '\b';
                    boolean z1113 = zArr[0];
                    boolean z1114 = zArr[1];
                    i20 = this.n;
                    int[] iArr13 = this.B;
                    if (i20 != 2) {
                        cVar5 = cVar2;
                        fVar = fVarK;
                        fVar2 = fVarK2;
                        fVar3 = fVarK5;
                        z10 = z3;
                        r3 = i6;
                        r4 = i5;
                        i21 = i17;
                    } else {
                        cVar5 = cVar2;
                        fVar = fVarK;
                        fVar2 = fVarK2;
                        fVar3 = fVarK5;
                        z10 = z3;
                        r3 = i6;
                        r4 = i5;
                        i21 = i17;
                    }
                    if (z) {
                        fVar4 = r33;
                        fVar5 = fVarK4;
                        fVar6 = fVar3;
                        i22 = 0;
                        i23 = 8;
                        z11 = true;
                        i24 = 1;
                    } else {
                        fVar4 = r33;
                        fVar5 = fVarK4;
                        fVar6 = fVar3;
                        i22 = 0;
                        i23 = 8;
                        z11 = true;
                        i24 = 1;
                    }
                    if (this.o == 2) {
                        i24 = i22;
                    }
                    if (i24 != 0) {
                        fVar7 = fVar4;
                    } else {
                        fVar7 = fVar4;
                    }
                    if (z7) {
                        if (this.z == 1) {
                            float f15 = this.A;
                            com.gamericefishpro.space.i3.b bVarL115 = cVar6.l();
                            bVarL115.d.g(fVar5, -1.0f);
                            bVarL115.d.g(fVar7, 1.0f);
                            bVarL115.d.g(fVar2, f15);
                            bVarL115.d.g(fVar, -f15);
                            cVar6.c(bVarL115);
                        } else {
                            float f16 = this.A;
                            com.gamericefishpro.space.i3.b bVarL116 = cVar6.l();
                            bVarL116.d.g(fVar2, -1.0f);
                            bVarL116.d.g(fVar, 1.0f);
                            bVarL116.d.g(fVar5, f16);
                            bVarL116.d.g(fVar7, -f16);
                            cVar6.c(bVarL116);
                        }
                    }
                    if (cVar4.h()) {
                        d dVar15 = cVar4.f.d;
                        float radians7 = (float) Math.toRadians(this.C + 90.0f);
                        int iE7 = cVar4.e();
                        com.gamericefishpro.space.i3.f fVarK111114 = cVar6.k(i(2));
                        com.gamericefishpro.space.i3.f fVarK111115 = cVar6.k(i(3));
                        com.gamericefishpro.space.i3.f fVarK111116 = cVar6.k(i(4));
                        com.gamericefishpro.space.i3.f fVarK111117 = cVar6.k(i(5));
                        com.gamericefishpro.space.i3.f fVarK111118 = cVar6.k(dVar15.i(2));
                        com.gamericefishpro.space.i3.f fVarK111119 = cVar6.k(dVar15.i(3));
                        com.gamericefishpro.space.i3.f fVarK1111110 = cVar6.k(dVar15.i(4));
                        com.gamericefishpro.space.i3.f fVarK1111111 = cVar6.k(dVar15.i(5));
                        com.gamericefishpro.space.i3.b bVarL117 = cVar6.l();
                        double d13 = radians7;
                        double dSin7 = Math.sin(d13);
                        double d14 = iE7;
                        bVarL117.d.g(fVarK111119, 0.5f);
                        bVarL117.d.g(fVarK1111111, 0.5f);
                        bVarL117.d.g(fVarK111115, -0.5f);
                        bVarL117.d.g(fVarK111117, -0.5f);
                        bVarL117.b = -((float) (dSin7 * d14));
                        cVar6.c(bVarL117);
                        com.gamericefishpro.space.i3.b bVarL118 = cVar6.l();
                        float fCos7 = (float) (Math.cos(d13) * d14);
                        bVarL118.d.g(fVarK111118, 0.5f);
                        bVarL118.d.g(fVarK1111110, 0.5f);
                        bVarL118.d.g(fVarK111114, -0.5f);
                        bVarL118.d.g(fVarK111116, -0.5f);
                        bVarL118.b = -fCos7;
                        cVar6.c(bVarL118);
                    }
                    this.j = false;
                    this.k = false;
                }
                i19 = -1;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (iArr[0] == 2) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                cVar4 = this.O;
                boolean z1115 = !cVar4.h();
                char c8 = '\b';
                boolean z1116 = zArr[0];
                boolean z1117 = zArr[1];
                i20 = this.n;
                int[] iArr14 = this.B;
                if (i20 != 2) {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                } else {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                }
                if (z) {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                } else {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                }
                if (this.o == 2) {
                    i24 = i22;
                }
                if (i24 != 0) {
                    fVar7 = fVar4;
                } else {
                    fVar7 = fVar4;
                }
                if (z7) {
                    if (this.z == 1) {
                        float f17 = this.A;
                        com.gamericefishpro.space.i3.b bVarL119 = cVar6.l();
                        bVarL119.d.g(fVar5, -1.0f);
                        bVarL119.d.g(fVar7, 1.0f);
                        bVarL119.d.g(fVar2, f17);
                        bVarL119.d.g(fVar, -f17);
                        cVar6.c(bVarL119);
                    } else {
                        float f18 = this.A;
                        com.gamericefishpro.space.i3.b bVarL1110 = cVar6.l();
                        bVarL1110.d.g(fVar2, -1.0f);
                        bVarL1110.d.g(fVar, 1.0f);
                        bVarL1110.d.g(fVar5, f18);
                        bVarL1110.d.g(fVar7, -f18);
                        cVar6.c(bVarL1110);
                    }
                }
                if (cVar4.h()) {
                    d dVar16 = cVar4.f.d;
                    float radians8 = (float) Math.toRadians(this.C + 90.0f);
                    int iE8 = cVar4.e();
                    com.gamericefishpro.space.i3.f fVarK1111112 = cVar6.k(i(2));
                    com.gamericefishpro.space.i3.f fVarK1111113 = cVar6.k(i(3));
                    com.gamericefishpro.space.i3.f fVarK1111114 = cVar6.k(i(4));
                    com.gamericefishpro.space.i3.f fVarK1111115 = cVar6.k(i(5));
                    com.gamericefishpro.space.i3.f fVarK1111116 = cVar6.k(dVar16.i(2));
                    com.gamericefishpro.space.i3.f fVarK1111117 = cVar6.k(dVar16.i(3));
                    com.gamericefishpro.space.i3.f fVarK1111118 = cVar6.k(dVar16.i(4));
                    com.gamericefishpro.space.i3.f fVarK1111119 = cVar6.k(dVar16.i(5));
                    com.gamericefishpro.space.i3.b bVarL1111 = cVar6.l();
                    double d15 = radians8;
                    double dSin8 = Math.sin(d15);
                    double d16 = iE8;
                    bVarL1111.d.g(fVarK1111117, 0.5f);
                    bVarL1111.d.g(fVarK1111119, 0.5f);
                    bVarL1111.d.g(fVarK1111113, -0.5f);
                    bVarL1111.d.g(fVarK1111115, -0.5f);
                    bVarL1111.b = -((float) (dSin8 * d16));
                    cVar6.c(bVarL1111);
                    com.gamericefishpro.space.i3.b bVarL1112 = cVar6.l();
                    float fCos8 = (float) (Math.cos(d15) * d16);
                    bVarL1112.d.g(fVarK1111116, 0.5f);
                    bVarL1112.d.g(fVarK1111118, 0.5f);
                    bVarL1112.d.g(fVarK1111112, -0.5f);
                    bVarL1112.d.g(fVarK1111114, -0.5f);
                    bVarL1112.b = -fCos8;
                    cVar6.c(bVarL1112);
                }
                this.j = false;
                this.k = false;
            }
            cVar3 = cVar10;
            fVarK4 = fVarK4;
            i16 = i11;
            i17 = i14;
            i18 = i15;
            z7 = false;
            int[] iArr15 = this.s;
            iArr15[0] = i17;
            iArr15[1] = i18;
            if (z7) {
                int i312 = this.z;
                i19 = -1;
                if (i312 != 0) {
                }
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (iArr[0] == 2) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                cVar4 = this.O;
                boolean z1118 = !cVar4.h();
                char c9 = '\b';
                boolean z1119 = zArr[0];
                boolean z11110 = zArr[1];
                i20 = this.n;
                int[] iArr16 = this.B;
                if (i20 != 2) {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                } else {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                }
                if (z) {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                } else {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                }
                if (this.o == 2) {
                    i24 = i22;
                }
                if (i24 != 0) {
                    fVar7 = fVar4;
                } else {
                    fVar7 = fVar4;
                }
                if (z7) {
                    if (this.z == 1) {
                        float f19 = this.A;
                        com.gamericefishpro.space.i3.b bVarL1113 = cVar6.l();
                        bVarL1113.d.g(fVar5, -1.0f);
                        bVarL1113.d.g(fVar7, 1.0f);
                        bVarL1113.d.g(fVar2, f19);
                        bVarL1113.d.g(fVar, -f19);
                        cVar6.c(bVarL1113);
                    } else {
                        float f110 = this.A;
                        com.gamericefishpro.space.i3.b bVarL1114 = cVar6.l();
                        bVarL1114.d.g(fVar2, -1.0f);
                        bVarL1114.d.g(fVar, 1.0f);
                        bVarL1114.d.g(fVar5, f110);
                        bVarL1114.d.g(fVar7, -f110);
                        cVar6.c(bVarL1114);
                    }
                }
                if (cVar4.h()) {
                    d dVar17 = cVar4.f.d;
                    float radians9 = (float) Math.toRadians(this.C + 90.0f);
                    int iE9 = cVar4.e();
                    com.gamericefishpro.space.i3.f fVarK11111110 = cVar6.k(i(2));
                    com.gamericefishpro.space.i3.f fVarK11111111 = cVar6.k(i(3));
                    com.gamericefishpro.space.i3.f fVarK11111112 = cVar6.k(i(4));
                    com.gamericefishpro.space.i3.f fVarK11111113 = cVar6.k(i(5));
                    com.gamericefishpro.space.i3.f fVarK11111114 = cVar6.k(dVar17.i(2));
                    com.gamericefishpro.space.i3.f fVarK11111115 = cVar6.k(dVar17.i(3));
                    com.gamericefishpro.space.i3.f fVarK11111116 = cVar6.k(dVar17.i(4));
                    com.gamericefishpro.space.i3.f fVarK11111117 = cVar6.k(dVar17.i(5));
                    com.gamericefishpro.space.i3.b bVarL1115 = cVar6.l();
                    double d17 = radians9;
                    double dSin9 = Math.sin(d17);
                    double d18 = iE9;
                    bVarL1115.d.g(fVarK11111115, 0.5f);
                    bVarL1115.d.g(fVarK11111117, 0.5f);
                    bVarL1115.d.g(fVarK11111111, -0.5f);
                    bVarL1115.d.g(fVarK11111113, -0.5f);
                    bVarL1115.b = -((float) (dSin9 * d18));
                    cVar6.c(bVarL1115);
                    com.gamericefishpro.space.i3.b bVarL1116 = cVar6.l();
                    float fCos9 = (float) (Math.cos(d17) * d18);
                    bVarL1116.d.g(fVarK11111114, 0.5f);
                    bVarL1116.d.g(fVarK11111116, 0.5f);
                    bVarL1116.d.g(fVarK11111110, -0.5f);
                    bVarL1116.d.g(fVarK11111112, -0.5f);
                    bVarL1116.b = -fCos9;
                    cVar6.c(bVarL1116);
                }
                this.j = false;
                this.k = false;
            }
            i19 = -1;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (iArr[0] == 2) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            cVar4 = this.O;
            boolean z11111 = !cVar4.h();
            char c10 = '\b';
            boolean z11112 = zArr[0];
            boolean z11113 = zArr[1];
            i20 = this.n;
            int[] iArr17 = this.B;
            if (i20 != 2) {
                cVar5 = cVar2;
                fVar = fVarK;
                fVar2 = fVarK2;
                fVar3 = fVarK5;
                z10 = z3;
                r3 = i6;
                r4 = i5;
                i21 = i17;
            } else {
                cVar5 = cVar2;
                fVar = fVarK;
                fVar2 = fVarK2;
                fVar3 = fVarK5;
                z10 = z3;
                r3 = i6;
                r4 = i5;
                i21 = i17;
            }
            if (z) {
                fVar4 = r33;
                fVar5 = fVarK4;
                fVar6 = fVar3;
                i22 = 0;
                i23 = 8;
                z11 = true;
                i24 = 1;
            } else {
                fVar4 = r33;
                fVar5 = fVarK4;
                fVar6 = fVar3;
                i22 = 0;
                i23 = 8;
                z11 = true;
                i24 = 1;
            }
            if (this.o == 2) {
                i24 = i22;
            }
            if (i24 != 0) {
                fVar7 = fVar4;
            } else {
                fVar7 = fVar4;
            }
            if (z7) {
                if (this.z == 1) {
                    float f111 = this.A;
                    com.gamericefishpro.space.i3.b bVarL1117 = cVar6.l();
                    bVarL1117.d.g(fVar5, -1.0f);
                    bVarL1117.d.g(fVar7, 1.0f);
                    bVarL1117.d.g(fVar2, f111);
                    bVarL1117.d.g(fVar, -f111);
                    cVar6.c(bVarL1117);
                } else {
                    float f112 = this.A;
                    com.gamericefishpro.space.i3.b bVarL1118 = cVar6.l();
                    bVarL1118.d.g(fVar2, -1.0f);
                    bVarL1118.d.g(fVar, 1.0f);
                    bVarL1118.d.g(fVar5, f112);
                    bVarL1118.d.g(fVar7, -f112);
                    cVar6.c(bVarL1118);
                }
            }
            if (cVar4.h()) {
                d dVar18 = cVar4.f.d;
                float radians10 = (float) Math.toRadians(this.C + 90.0f);
                int iE10 = cVar4.e();
                com.gamericefishpro.space.i3.f fVarK11111118 = cVar6.k(i(2));
                com.gamericefishpro.space.i3.f fVarK11111119 = cVar6.k(i(3));
                com.gamericefishpro.space.i3.f fVarK111111110 = cVar6.k(i(4));
                com.gamericefishpro.space.i3.f fVarK111111111 = cVar6.k(i(5));
                com.gamericefishpro.space.i3.f fVarK111111112 = cVar6.k(dVar18.i(2));
                com.gamericefishpro.space.i3.f fVarK111111113 = cVar6.k(dVar18.i(3));
                com.gamericefishpro.space.i3.f fVarK111111114 = cVar6.k(dVar18.i(4));
                com.gamericefishpro.space.i3.f fVarK111111115 = cVar6.k(dVar18.i(5));
                com.gamericefishpro.space.i3.b bVarL1119 = cVar6.l();
                double d19 = radians10;
                double dSin10 = Math.sin(d19);
                double d110 = iE10;
                bVarL1119.d.g(fVarK111111113, 0.5f);
                bVarL1119.d.g(fVarK111111115, 0.5f);
                bVarL1119.d.g(fVarK11111119, -0.5f);
                bVarL1119.d.g(fVarK111111111, -0.5f);
                bVarL1119.b = -((float) (dSin10 * d110));
                cVar6.c(bVarL1119);
                com.gamericefishpro.space.i3.b bVarL11110 = cVar6.l();
                float fCos10 = (float) (Math.cos(d19) * d110);
                bVarL11110.d.g(fVarK111111112, 0.5f);
                bVarL11110.d.g(fVarK111111114, 0.5f);
                bVarL11110.d.g(fVarK11111118, -0.5f);
                bVarL11110.d.g(fVarK111111110, -0.5f);
                bVarL11110.b = -fCos10;
                cVar6.c(bVarL11110);
            }
            this.j = false;
            this.k = false;
        }
        i = 0;
        i2 = i;
        i3 = i2;
        i4 = this.f0;
        zArr = this.R;
        i5 = i2;
        if (i4 == 8) {
            arrayList = this.Q;
            size = arrayList.size();
            i6 = i3;
            i28 = i;
            while (true) {
                if (i28 < size) {
                    if (!zArr[i]) {
                        break;
                    } else {
                        return;
                    }
                }
                int i313 = size;
                hashSet2 = ((c) arrayList.get(i28)).a;
                if (hashSet2 != null) {
                    break;
                    break;
                }
                i28++;
                size = i313;
            }
        } else {
            i6 = i3;
        }
        z2 = this.j;
        if (z2) {
            if (z2) {
                cVar6.d(fVarK, this.X);
                cVar6.d(fVarK2, this.X + this.T);
                if (i6 != 0) {
                    eVar2 = (e) dVar2;
                    weakReference3 = eVar2.G0;
                    if (weakReference3 != null) {
                        eVar2.G0 = new WeakReference(cVar7);
                    } else {
                        eVar2.G0 = new WeakReference(cVar7);
                    }
                    weakReference4 = eVar2.I0;
                    if (weakReference4 != null) {
                        eVar2.I0 = new WeakReference(cVar8);
                    } else {
                        eVar2.I0 = new WeakReference(cVar8);
                    }
                }
            }
            if (this.k) {
                cVar6.d(fVarK3, this.Y);
                cVar6.d(fVarK4, this.Y + this.U);
                hashSet = cVar11.a;
                if (hashSet != null) {
                    cVar6.d(fVarK5, this.Y + this.Z);
                }
                if (i5 != 0) {
                    eVar = (e) dVar;
                    weakReference = eVar.F0;
                    if (weakReference != null) {
                        eVar.F0 = new WeakReference(cVar9);
                    } else {
                        eVar.F0 = new WeakReference(cVar9);
                    }
                    weakReference2 = eVar.H0;
                    if (weakReference2 != null) {
                        eVar.H0 = new WeakReference(cVar10);
                    } else {
                        eVar.H0 = new WeakReference(cVar10);
                    }
                }
            }
            if (this.j) {
                ?? r13 = i;
                this.j = r13;
                this.k = r13;
                return;
            }
        } else {
            if (z2) {
                cVar6.d(fVarK, this.X);
                cVar6.d(fVarK2, this.X + this.T);
                if (i6 != 0) {
                    eVar2 = (e) dVar2;
                    weakReference3 = eVar2.G0;
                    if (weakReference3 != null) {
                        eVar2.G0 = new WeakReference(cVar7);
                    } else {
                        eVar2.G0 = new WeakReference(cVar7);
                    }
                    weakReference4 = eVar2.I0;
                    if (weakReference4 != null) {
                        eVar2.I0 = new WeakReference(cVar8);
                    } else {
                        eVar2.I0 = new WeakReference(cVar8);
                    }
                }
            }
            if (this.k) {
                cVar6.d(fVarK3, this.Y);
                cVar6.d(fVarK4, this.Y + this.U);
                hashSet = cVar11.a;
                if (hashSet != null) {
                    cVar6.d(fVarK5, this.Y + this.Z);
                }
                if (i5 != 0) {
                    eVar = (e) dVar;
                    weakReference = eVar.F0;
                    if (weakReference != null) {
                        eVar.F0 = new WeakReference(cVar9);
                    } else {
                        eVar.F0 = new WeakReference(cVar9);
                    }
                    weakReference2 = eVar.H0;
                    if (weakReference2 != null) {
                        eVar.H0 = new WeakReference(cVar10);
                    } else {
                        eVar.H0 = new WeakReference(cVar10);
                    }
                }
            }
            if (this.j) {
                ?? r14 = i;
                this.j = r14;
                this.k = r14;
                return;
            }
        }
        zArr2 = this.f;
        if (z) {
            cVar2 = cVar11;
            zArr3 = zArr2;
        } else {
            cVar2 = cVar11;
            zArr3 = zArr2;
        }
        if (this.S != null) {
            if (t(0)) {
                ((e) this.S).M(this, 0);
                zU = true;
                i27 = 1;
            } else {
                zU = u();
                i27 = 1;
            }
            if (t(i27)) {
                ((e) this.S).M(this, i27);
                zV = true;
            } else {
                zV = v();
            }
            if (zU) {
            }
            if (!zV) {
                cVar6.f(cVar6.k(this.S.K), fVarK4, 0, 1);
            }
            z4 = zV;
            z3 = zU;
        } else {
            cVar7 = cVar7;
            z3 = false;
            z4 = false;
        }
        i7 = this.T;
        i8 = this.a0;
        if (i7 >= i8) {
            i8 = i7;
        }
        i9 = this.U;
        i10 = this.b0;
        if (i9 < i10) {
            i11 = i10;
        } else {
            i11 = i9;
        }
        iArr = this.o0;
        i12 = iArr[0];
        if (i12 != 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        i13 = iArr[1];
        if (i13 != 3) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i314 = this.W;
        this.z = i314;
        f = this.V;
        this.A = f;
        i14 = this.q;
        i15 = this.r;
        if (f > 0.0f) {
            cVar3 = cVar10;
            if (this.f0 != 8) {
                if (i12 == 3) {
                    i17 = i14;
                } else {
                    i17 = i14;
                }
                if (i13 == 3) {
                    i26 = i15;
                } else {
                    i26 = i15;
                }
                if (i12 == 3) {
                    if (i12 != 3) {
                        if (i13 != 3) {
                            i16 = i11;
                        } else {
                            i16 = i11;
                        }
                        z7 = true;
                    } else {
                        if (i13 != 3) {
                            i16 = i11;
                        } else {
                            i16 = i11;
                        }
                        z7 = true;
                    }
                } else if (i12 != 3) {
                    if (i13 != 3) {
                        i16 = i11;
                    } else {
                        i16 = i11;
                    }
                    z7 = true;
                } else {
                    if (i13 != 3) {
                        i16 = i11;
                    } else {
                        i16 = i11;
                    }
                    z7 = true;
                }
                i18 = i26;
                int[] iArr18 = this.s;
                iArr18[0] = i17;
                iArr18[1] = i18;
                if (z7) {
                    int i315 = this.z;
                    i19 = -1;
                    if (i315 != 0) {
                    }
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (iArr[0] == 2) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    cVar4 = this.O;
                    boolean z11114 = !cVar4.h();
                    char c11 = '\b';
                    boolean z11115 = zArr[0];
                    boolean z11116 = zArr[1];
                    i20 = this.n;
                    int[] iArr19 = this.B;
                    if (i20 != 2) {
                        cVar5 = cVar2;
                        fVar = fVarK;
                        fVar2 = fVarK2;
                        fVar3 = fVarK5;
                        z10 = z3;
                        r3 = i6;
                        r4 = i5;
                        i21 = i17;
                    } else {
                        cVar5 = cVar2;
                        fVar = fVarK;
                        fVar2 = fVarK2;
                        fVar3 = fVarK5;
                        z10 = z3;
                        r3 = i6;
                        r4 = i5;
                        i21 = i17;
                    }
                    if (z) {
                        fVar4 = r33;
                        fVar5 = fVarK4;
                        fVar6 = fVar3;
                        i22 = 0;
                        i23 = 8;
                        z11 = true;
                        i24 = 1;
                    } else {
                        fVar4 = r33;
                        fVar5 = fVarK4;
                        fVar6 = fVar3;
                        i22 = 0;
                        i23 = 8;
                        z11 = true;
                        i24 = 1;
                    }
                    if (this.o == 2) {
                        i24 = i22;
                    }
                    if (i24 != 0) {
                        fVar7 = fVar4;
                    } else {
                        fVar7 = fVar4;
                    }
                    if (z7) {
                        if (this.z == 1) {
                            float f113 = this.A;
                            com.gamericefishpro.space.i3.b bVarL11111 = cVar6.l();
                            bVarL11111.d.g(fVar5, -1.0f);
                            bVarL11111.d.g(fVar7, 1.0f);
                            bVarL11111.d.g(fVar2, f113);
                            bVarL11111.d.g(fVar, -f113);
                            cVar6.c(bVarL11111);
                        } else {
                            float f114 = this.A;
                            com.gamericefishpro.space.i3.b bVarL11112 = cVar6.l();
                            bVarL11112.d.g(fVar2, -1.0f);
                            bVarL11112.d.g(fVar, 1.0f);
                            bVarL11112.d.g(fVar5, f114);
                            bVarL11112.d.g(fVar7, -f114);
                            cVar6.c(bVarL11112);
                        }
                    }
                    if (cVar4.h()) {
                        d dVar19 = cVar4.f.d;
                        float radians11 = (float) Math.toRadians(this.C + 90.0f);
                        int iE11 = cVar4.e();
                        com.gamericefishpro.space.i3.f fVarK111111116 = cVar6.k(i(2));
                        com.gamericefishpro.space.i3.f fVarK111111117 = cVar6.k(i(3));
                        com.gamericefishpro.space.i3.f fVarK111111118 = cVar6.k(i(4));
                        com.gamericefishpro.space.i3.f fVarK111111119 = cVar6.k(i(5));
                        com.gamericefishpro.space.i3.f fVarK1111111110 = cVar6.k(dVar19.i(2));
                        com.gamericefishpro.space.i3.f fVarK1111111111 = cVar6.k(dVar19.i(3));
                        com.gamericefishpro.space.i3.f fVarK1111111112 = cVar6.k(dVar19.i(4));
                        com.gamericefishpro.space.i3.f fVarK1111111113 = cVar6.k(dVar19.i(5));
                        com.gamericefishpro.space.i3.b bVarL11113 = cVar6.l();
                        double d111 = radians11;
                        double dSin11 = Math.sin(d111);
                        double d112 = iE11;
                        bVarL11113.d.g(fVarK1111111111, 0.5f);
                        bVarL11113.d.g(fVarK1111111113, 0.5f);
                        bVarL11113.d.g(fVarK111111117, -0.5f);
                        bVarL11113.d.g(fVarK111111119, -0.5f);
                        bVarL11113.b = -((float) (dSin11 * d112));
                        cVar6.c(bVarL11113);
                        com.gamericefishpro.space.i3.b bVarL11114 = cVar6.l();
                        float fCos11 = (float) (Math.cos(d111) * d112);
                        bVarL11114.d.g(fVarK1111111110, 0.5f);
                        bVarL11114.d.g(fVarK1111111112, 0.5f);
                        bVarL11114.d.g(fVarK111111116, -0.5f);
                        bVarL11114.d.g(fVarK111111118, -0.5f);
                        bVarL11114.b = -fCos11;
                        cVar6.c(bVarL11114);
                    }
                    this.j = false;
                    this.k = false;
                }
                i19 = -1;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (iArr[0] == 2) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                cVar4 = this.O;
                boolean z11117 = !cVar4.h();
                char c12 = '\b';
                boolean z11118 = zArr[0];
                boolean z11119 = zArr[1];
                i20 = this.n;
                int[] iArr110 = this.B;
                if (i20 != 2) {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                } else {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                }
                if (z) {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                } else {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                }
                if (this.o == 2) {
                    i24 = i22;
                }
                if (i24 != 0) {
                    fVar7 = fVar4;
                } else {
                    fVar7 = fVar4;
                }
                if (z7) {
                    if (this.z == 1) {
                        float f115 = this.A;
                        com.gamericefishpro.space.i3.b bVarL11115 = cVar6.l();
                        bVarL11115.d.g(fVar5, -1.0f);
                        bVarL11115.d.g(fVar7, 1.0f);
                        bVarL11115.d.g(fVar2, f115);
                        bVarL11115.d.g(fVar, -f115);
                        cVar6.c(bVarL11115);
                    } else {
                        float f116 = this.A;
                        com.gamericefishpro.space.i3.b bVarL11116 = cVar6.l();
                        bVarL11116.d.g(fVar2, -1.0f);
                        bVarL11116.d.g(fVar, 1.0f);
                        bVarL11116.d.g(fVar5, f116);
                        bVarL11116.d.g(fVar7, -f116);
                        cVar6.c(bVarL11116);
                    }
                }
                if (cVar4.h()) {
                    d dVar110 = cVar4.f.d;
                    float radians12 = (float) Math.toRadians(this.C + 90.0f);
                    int iE12 = cVar4.e();
                    com.gamericefishpro.space.i3.f fVarK1111111114 = cVar6.k(i(2));
                    com.gamericefishpro.space.i3.f fVarK1111111115 = cVar6.k(i(3));
                    com.gamericefishpro.space.i3.f fVarK1111111116 = cVar6.k(i(4));
                    com.gamericefishpro.space.i3.f fVarK1111111117 = cVar6.k(i(5));
                    com.gamericefishpro.space.i3.f fVarK1111111118 = cVar6.k(dVar110.i(2));
                    com.gamericefishpro.space.i3.f fVarK1111111119 = cVar6.k(dVar110.i(3));
                    com.gamericefishpro.space.i3.f fVarK11111111110 = cVar6.k(dVar110.i(4));
                    com.gamericefishpro.space.i3.f fVarK11111111111 = cVar6.k(dVar110.i(5));
                    com.gamericefishpro.space.i3.b bVarL11117 = cVar6.l();
                    double d113 = radians12;
                    double dSin12 = Math.sin(d113);
                    double d114 = iE12;
                    bVarL11117.d.g(fVarK1111111119, 0.5f);
                    bVarL11117.d.g(fVarK11111111111, 0.5f);
                    bVarL11117.d.g(fVarK1111111115, -0.5f);
                    bVarL11117.d.g(fVarK1111111117, -0.5f);
                    bVarL11117.b = -((float) (dSin12 * d114));
                    cVar6.c(bVarL11117);
                    com.gamericefishpro.space.i3.b bVarL11118 = cVar6.l();
                    float fCos12 = (float) (Math.cos(d113) * d114);
                    bVarL11118.d.g(fVarK1111111118, 0.5f);
                    bVarL11118.d.g(fVarK11111111110, 0.5f);
                    bVarL11118.d.g(fVarK1111111114, -0.5f);
                    bVarL11118.d.g(fVarK1111111116, -0.5f);
                    bVarL11118.b = -fCos12;
                    cVar6.c(bVarL11118);
                }
                this.j = false;
                this.k = false;
            }
            z7 = false;
            int[] iArr111 = this.s;
            iArr111[0] = i17;
            iArr111[1] = i18;
            if (z7) {
                int i316 = this.z;
                i19 = -1;
                if (i316 != 0) {
                }
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (iArr[0] == 2) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                cVar4 = this.O;
                boolean z111110 = !cVar4.h();
                char c13 = '\b';
                boolean z111111 = zArr[0];
                boolean z111112 = zArr[1];
                i20 = this.n;
                int[] iArr112 = this.B;
                if (i20 != 2) {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                } else {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                }
                if (z) {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                } else {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                }
                if (this.o == 2) {
                    i24 = i22;
                }
                if (i24 != 0) {
                    fVar7 = fVar4;
                } else {
                    fVar7 = fVar4;
                }
                if (z7) {
                    if (this.z == 1) {
                        float f117 = this.A;
                        com.gamericefishpro.space.i3.b bVarL11119 = cVar6.l();
                        bVarL11119.d.g(fVar5, -1.0f);
                        bVarL11119.d.g(fVar7, 1.0f);
                        bVarL11119.d.g(fVar2, f117);
                        bVarL11119.d.g(fVar, -f117);
                        cVar6.c(bVarL11119);
                    } else {
                        float f118 = this.A;
                        com.gamericefishpro.space.i3.b bVarL111110 = cVar6.l();
                        bVarL111110.d.g(fVar2, -1.0f);
                        bVarL111110.d.g(fVar, 1.0f);
                        bVarL111110.d.g(fVar5, f118);
                        bVarL111110.d.g(fVar7, -f118);
                        cVar6.c(bVarL111110);
                    }
                }
                if (cVar4.h()) {
                    d dVar111 = cVar4.f.d;
                    float radians13 = (float) Math.toRadians(this.C + 90.0f);
                    int iE13 = cVar4.e();
                    com.gamericefishpro.space.i3.f fVarK11111111112 = cVar6.k(i(2));
                    com.gamericefishpro.space.i3.f fVarK11111111113 = cVar6.k(i(3));
                    com.gamericefishpro.space.i3.f fVarK11111111114 = cVar6.k(i(4));
                    com.gamericefishpro.space.i3.f fVarK11111111115 = cVar6.k(i(5));
                    com.gamericefishpro.space.i3.f fVarK11111111116 = cVar6.k(dVar111.i(2));
                    com.gamericefishpro.space.i3.f fVarK11111111117 = cVar6.k(dVar111.i(3));
                    com.gamericefishpro.space.i3.f fVarK11111111118 = cVar6.k(dVar111.i(4));
                    com.gamericefishpro.space.i3.f fVarK11111111119 = cVar6.k(dVar111.i(5));
                    com.gamericefishpro.space.i3.b bVarL111111 = cVar6.l();
                    double d115 = radians13;
                    double dSin13 = Math.sin(d115);
                    double d116 = iE13;
                    bVarL111111.d.g(fVarK11111111117, 0.5f);
                    bVarL111111.d.g(fVarK11111111119, 0.5f);
                    bVarL111111.d.g(fVarK11111111113, -0.5f);
                    bVarL111111.d.g(fVarK11111111115, -0.5f);
                    bVarL111111.b = -((float) (dSin13 * d116));
                    cVar6.c(bVarL111111);
                    com.gamericefishpro.space.i3.b bVarL111112 = cVar6.l();
                    float fCos13 = (float) (Math.cos(d115) * d116);
                    bVarL111112.d.g(fVarK11111111116, 0.5f);
                    bVarL111112.d.g(fVarK11111111118, 0.5f);
                    bVarL111112.d.g(fVarK11111111112, -0.5f);
                    bVarL111112.d.g(fVarK11111111114, -0.5f);
                    bVarL111112.b = -fCos13;
                    cVar6.c(bVarL111112);
                }
                this.j = false;
                this.k = false;
            }
            i19 = -1;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (iArr[0] == 2) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            cVar4 = this.O;
            boolean z111113 = !cVar4.h();
            char c14 = '\b';
            boolean z111114 = zArr[0];
            boolean z111115 = zArr[1];
            i20 = this.n;
            int[] iArr113 = this.B;
            if (i20 != 2) {
                cVar5 = cVar2;
                fVar = fVarK;
                fVar2 = fVarK2;
                fVar3 = fVarK5;
                z10 = z3;
                r3 = i6;
                r4 = i5;
                i21 = i17;
            } else {
                cVar5 = cVar2;
                fVar = fVarK;
                fVar2 = fVarK2;
                fVar3 = fVarK5;
                z10 = z3;
                r3 = i6;
                r4 = i5;
                i21 = i17;
            }
            if (z) {
                fVar4 = r33;
                fVar5 = fVarK4;
                fVar6 = fVar3;
                i22 = 0;
                i23 = 8;
                z11 = true;
                i24 = 1;
            } else {
                fVar4 = r33;
                fVar5 = fVarK4;
                fVar6 = fVar3;
                i22 = 0;
                i23 = 8;
                z11 = true;
                i24 = 1;
            }
            if (this.o == 2) {
                i24 = i22;
            }
            if (i24 != 0) {
                fVar7 = fVar4;
            } else {
                fVar7 = fVar4;
            }
            if (z7) {
                if (this.z == 1) {
                    float f119 = this.A;
                    com.gamericefishpro.space.i3.b bVarL111113 = cVar6.l();
                    bVarL111113.d.g(fVar5, -1.0f);
                    bVarL111113.d.g(fVar7, 1.0f);
                    bVarL111113.d.g(fVar2, f119);
                    bVarL111113.d.g(fVar, -f119);
                    cVar6.c(bVarL111113);
                } else {
                    float f1110 = this.A;
                    com.gamericefishpro.space.i3.b bVarL111114 = cVar6.l();
                    bVarL111114.d.g(fVar2, -1.0f);
                    bVarL111114.d.g(fVar, 1.0f);
                    bVarL111114.d.g(fVar5, f1110);
                    bVarL111114.d.g(fVar7, -f1110);
                    cVar6.c(bVarL111114);
                }
            }
            if (cVar4.h()) {
                d dVar112 = cVar4.f.d;
                float radians14 = (float) Math.toRadians(this.C + 90.0f);
                int iE14 = cVar4.e();
                com.gamericefishpro.space.i3.f fVarK111111111110 = cVar6.k(i(2));
                com.gamericefishpro.space.i3.f fVarK111111111111 = cVar6.k(i(3));
                com.gamericefishpro.space.i3.f fVarK111111111112 = cVar6.k(i(4));
                com.gamericefishpro.space.i3.f fVarK111111111113 = cVar6.k(i(5));
                com.gamericefishpro.space.i3.f fVarK111111111114 = cVar6.k(dVar112.i(2));
                com.gamericefishpro.space.i3.f fVarK111111111115 = cVar6.k(dVar112.i(3));
                com.gamericefishpro.space.i3.f fVarK111111111116 = cVar6.k(dVar112.i(4));
                com.gamericefishpro.space.i3.f fVarK111111111117 = cVar6.k(dVar112.i(5));
                com.gamericefishpro.space.i3.b bVarL111115 = cVar6.l();
                double d117 = radians14;
                double dSin14 = Math.sin(d117);
                double d118 = iE14;
                bVarL111115.d.g(fVarK111111111115, 0.5f);
                bVarL111115.d.g(fVarK111111111117, 0.5f);
                bVarL111115.d.g(fVarK111111111111, -0.5f);
                bVarL111115.d.g(fVarK111111111113, -0.5f);
                bVarL111115.b = -((float) (dSin14 * d118));
                cVar6.c(bVarL111115);
                com.gamericefishpro.space.i3.b bVarL111116 = cVar6.l();
                float fCos14 = (float) (Math.cos(d117) * d118);
                bVarL111116.d.g(fVarK111111111114, 0.5f);
                bVarL111116.d.g(fVarK111111111116, 0.5f);
                bVarL111116.d.g(fVarK111111111110, -0.5f);
                bVarL111116.d.g(fVarK111111111112, -0.5f);
                bVarL111116.b = -fCos14;
                cVar6.c(bVarL111116);
            }
            this.j = false;
            this.k = false;
        }
        cVar3 = cVar10;
        fVarK4 = fVarK4;
        i16 = i11;
        i17 = i14;
        i18 = i15;
        z7 = false;
        int[] iArr114 = this.s;
        iArr114[0] = i17;
        iArr114[1] = i18;
        if (z7) {
            int i317 = this.z;
            i19 = -1;
            if (i317 != 0) {
            }
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (iArr[0] == 2) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            cVar4 = this.O;
            boolean z111116 = !cVar4.h();
            char c15 = '\b';
            boolean z111117 = zArr[0];
            boolean z111118 = zArr[1];
            i20 = this.n;
            int[] iArr115 = this.B;
            if (i20 != 2) {
                cVar5 = cVar2;
                fVar = fVarK;
                fVar2 = fVarK2;
                fVar3 = fVarK5;
                z10 = z3;
                r3 = i6;
                r4 = i5;
                i21 = i17;
            } else {
                cVar5 = cVar2;
                fVar = fVarK;
                fVar2 = fVarK2;
                fVar3 = fVarK5;
                z10 = z3;
                r3 = i6;
                r4 = i5;
                i21 = i17;
            }
            if (z) {
                fVar4 = r33;
                fVar5 = fVarK4;
                fVar6 = fVar3;
                i22 = 0;
                i23 = 8;
                z11 = true;
                i24 = 1;
            } else {
                fVar4 = r33;
                fVar5 = fVarK4;
                fVar6 = fVar3;
                i22 = 0;
                i23 = 8;
                z11 = true;
                i24 = 1;
            }
            if (this.o == 2) {
                i24 = i22;
            }
            if (i24 != 0) {
                fVar7 = fVar4;
            } else {
                fVar7 = fVar4;
            }
            if (z7) {
                if (this.z == 1) {
                    float f1111 = this.A;
                    com.gamericefishpro.space.i3.b bVarL111117 = cVar6.l();
                    bVarL111117.d.g(fVar5, -1.0f);
                    bVarL111117.d.g(fVar7, 1.0f);
                    bVarL111117.d.g(fVar2, f1111);
                    bVarL111117.d.g(fVar, -f1111);
                    cVar6.c(bVarL111117);
                } else {
                    float f1112 = this.A;
                    com.gamericefishpro.space.i3.b bVarL111118 = cVar6.l();
                    bVarL111118.d.g(fVar2, -1.0f);
                    bVarL111118.d.g(fVar, 1.0f);
                    bVarL111118.d.g(fVar5, f1112);
                    bVarL111118.d.g(fVar7, -f1112);
                    cVar6.c(bVarL111118);
                }
            }
            if (cVar4.h()) {
                d dVar113 = cVar4.f.d;
                float radians15 = (float) Math.toRadians(this.C + 90.0f);
                int iE15 = cVar4.e();
                com.gamericefishpro.space.i3.f fVarK111111111118 = cVar6.k(i(2));
                com.gamericefishpro.space.i3.f fVarK111111111119 = cVar6.k(i(3));
                com.gamericefishpro.space.i3.f fVarK1111111111110 = cVar6.k(i(4));
                com.gamericefishpro.space.i3.f fVarK1111111111111 = cVar6.k(i(5));
                com.gamericefishpro.space.i3.f fVarK1111111111112 = cVar6.k(dVar113.i(2));
                com.gamericefishpro.space.i3.f fVarK1111111111113 = cVar6.k(dVar113.i(3));
                com.gamericefishpro.space.i3.f fVarK1111111111114 = cVar6.k(dVar113.i(4));
                com.gamericefishpro.space.i3.f fVarK1111111111115 = cVar6.k(dVar113.i(5));
                com.gamericefishpro.space.i3.b bVarL111119 = cVar6.l();
                double d119 = radians15;
                double dSin15 = Math.sin(d119);
                double d1110 = iE15;
                bVarL111119.d.g(fVarK1111111111113, 0.5f);
                bVarL111119.d.g(fVarK1111111111115, 0.5f);
                bVarL111119.d.g(fVarK111111111119, -0.5f);
                bVarL111119.d.g(fVarK1111111111111, -0.5f);
                bVarL111119.b = -((float) (dSin15 * d1110));
                cVar6.c(bVarL111119);
                com.gamericefishpro.space.i3.b bVarL1111110 = cVar6.l();
                float fCos15 = (float) (Math.cos(d119) * d1110);
                bVarL1111110.d.g(fVarK1111111111112, 0.5f);
                bVarL1111110.d.g(fVarK1111111111114, 0.5f);
                bVarL1111110.d.g(fVarK111111111118, -0.5f);
                bVarL1111110.d.g(fVarK1111111111110, -0.5f);
                bVarL1111110.b = -fCos15;
                cVar6.c(bVarL1111110);
            }
            this.j = false;
            this.k = false;
        }
        i19 = -1;
        if (z7) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (iArr[0] == 2) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (z9) {
            i8 = 0;
        }
        cVar4 = this.O;
        boolean z111119 = !cVar4.h();
        char c16 = '\b';
        boolean z1111110 = zArr[0];
        boolean z1111111 = zArr[1];
        i20 = this.n;
        int[] iArr116 = this.B;
        if (i20 != 2) {
            cVar5 = cVar2;
            fVar = fVarK;
            fVar2 = fVarK2;
            fVar3 = fVarK5;
            z10 = z3;
            r3 = i6;
            r4 = i5;
            i21 = i17;
        } else {
            cVar5 = cVar2;
            fVar = fVarK;
            fVar2 = fVarK2;
            fVar3 = fVarK5;
            z10 = z3;
            r3 = i6;
            r4 = i5;
            i21 = i17;
        }
        if (z) {
            fVar4 = r33;
            fVar5 = fVarK4;
            fVar6 = fVar3;
            i22 = 0;
            i23 = 8;
            z11 = true;
            i24 = 1;
        } else {
            fVar4 = r33;
            fVar5 = fVarK4;
            fVar6 = fVar3;
            i22 = 0;
            i23 = 8;
            z11 = true;
            i24 = 1;
        }
        if (this.o == 2) {
            i24 = i22;
        }
        if (i24 != 0) {
            fVar7 = fVar4;
        } else {
            fVar7 = fVar4;
        }
        if (z7) {
            if (this.z == 1) {
                float f1113 = this.A;
                com.gamericefishpro.space.i3.b bVarL1111111 = cVar6.l();
                bVarL1111111.d.g(fVar5, -1.0f);
                bVarL1111111.d.g(fVar7, 1.0f);
                bVarL1111111.d.g(fVar2, f1113);
                bVarL1111111.d.g(fVar, -f1113);
                cVar6.c(bVarL1111111);
            } else {
                float f1114 = this.A;
                com.gamericefishpro.space.i3.b bVarL1111112 = cVar6.l();
                bVarL1111112.d.g(fVar2, -1.0f);
                bVarL1111112.d.g(fVar, 1.0f);
                bVarL1111112.d.g(fVar5, f1114);
                bVarL1111112.d.g(fVar7, -f1114);
                cVar6.c(bVarL1111112);
            }
        }
        if (cVar4.h()) {
            d dVar114 = cVar4.f.d;
            float radians16 = (float) Math.toRadians(this.C + 90.0f);
            int iE16 = cVar4.e();
            com.gamericefishpro.space.i3.f fVarK1111111111116 = cVar6.k(i(2));
            com.gamericefishpro.space.i3.f fVarK1111111111117 = cVar6.k(i(3));
            com.gamericefishpro.space.i3.f fVarK1111111111118 = cVar6.k(i(4));
            com.gamericefishpro.space.i3.f fVarK1111111111119 = cVar6.k(i(5));
            com.gamericefishpro.space.i3.f fVarK11111111111110 = cVar6.k(dVar114.i(2));
            com.gamericefishpro.space.i3.f fVarK11111111111111 = cVar6.k(dVar114.i(3));
            com.gamericefishpro.space.i3.f fVarK11111111111112 = cVar6.k(dVar114.i(4));
            com.gamericefishpro.space.i3.f fVarK11111111111113 = cVar6.k(dVar114.i(5));
            com.gamericefishpro.space.i3.b bVarL1111113 = cVar6.l();
            double d1111 = radians16;
            double dSin16 = Math.sin(d1111);
            double d1112 = iE16;
            bVarL1111113.d.g(fVarK11111111111111, 0.5f);
            bVarL1111113.d.g(fVarK11111111111113, 0.5f);
            bVarL1111113.d.g(fVarK1111111111117, -0.5f);
            bVarL1111113.d.g(fVarK1111111111119, -0.5f);
            bVarL1111113.b = -((float) (dSin16 * d1112));
            cVar6.c(bVarL1111113);
            com.gamericefishpro.space.i3.b bVarL1111114 = cVar6.l();
            float fCos16 = (float) (Math.cos(d1111) * d1112);
            bVarL1111114.d.g(fVarK11111111111110, 0.5f);
            bVarL1111114.d.g(fVarK11111111111112, 0.5f);
            bVarL1111114.d.g(fVarK1111111111116, -0.5f);
            bVarL1111114.d.g(fVarK1111111111118, -0.5f);
            bVarL1111114.b = -fCos16;
            cVar6.c(bVarL1111114);
        }
        this.j = false;
        this.k = false;
    }

    public boolean c() {
        return this.f0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:229:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:231:0x0402  */
    /* JADX WARN: Code duplicated, block: B:240:0x041f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0452  */
    /* JADX WARN: Code duplicated, block: B:259:0x0458  */
    /* JADX WARN: Code duplicated, block: B:270:0x046d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0477  */
    /* JADX WARN: Code duplicated, block: B:277:0x047b  */
    /* JADX WARN: Code duplicated, block: B:278:0x047d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0485  */
    /* JADX WARN: Code duplicated, block: B:287:0x0493 A[PHI: r3
      0x0493: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:294:0x04af  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:337:0x0521  */
    public final void d(com.gamericefishpro.space.i3.c cVar, boolean z, boolean z2, boolean z3, boolean z4, com.gamericefishpro.space.i3.f fVar, com.gamericefishpro.space.i3.f fVar2, int i, boolean z5, c cVar2, c cVar3, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int iMin;
        boolean z14;
        int i10;
        int i11;
        boolean z15;
        com.gamericefishpro.space.i3.f fVarK;
        com.gamericefishpro.space.i3.f fVarK2;
        c cVar4;
        com.gamericefishpro.space.i3.f fVar3;
        int i12;
        int i13;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        d dVar;
        boolean z20;
        int iMin2;
        boolean z21;
        int i14;
        int iE;
        int i15;
        int i16;
        HashSet hashSet;
        boolean z22;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z23;
        boolean z24;
        int i22;
        cVar = cVar;
        int i23 = i8;
        int i24 = i9;
        com.gamericefishpro.space.i3.f fVarK3 = cVar.k(cVar2);
        com.gamericefishpro.space.i3.f fVarK4 = cVar.k(cVar3);
        com.gamericefishpro.space.i3.f fVarK5 = cVar.k(cVar2.f);
        com.gamericefishpro.space.i3.f fVarK6 = cVar.k(cVar3.f);
        boolean zH = cVar2.h();
        boolean zH2 = cVar3.h();
        boolean zH3 = this.O.h();
        int i25 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i25++;
        }
        int i26 = i25;
        int i27 = z6 ? 3 : i6;
        int iB = com.gamericefishpro.space.i3.e.b(i);
        boolean z25 = (iB == 0 || iB == 1 || iB != 2 || i27 == 4) ? false : true;
        int i28 = this.h;
        if (i28 == -1 || !z) {
            i28 = i3;
            z12 = z25;
        } else {
            this.h = -1;
            z12 = false;
        }
        int i29 = this.i;
        if (i29 == -1 || z) {
            z13 = z12;
        } else {
            this.i = -1;
            i28 = i29;
            z13 = false;
        }
        boolean z26 = z13;
        if (this.f0 == 8) {
            z14 = false;
            iMin = 0;
        } else {
            iMin = i28;
            z14 = z26;
        }
        if (z11) {
            if (!zH && !zH2 && !zH3) {
                cVar.d(fVarK3, i2);
            } else if (zH && !zH2) {
                i10 = 8;
                cVar.e(fVarK3, fVarK5, cVar2.e(), 8);
            }
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (z14 != 0) {
            if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (i24 == -2) {
                    i24 = iMin;
                }
                if (iMin > 0 && i27 != 1) {
                    iMin = 0;
                }
                if (i23 > 0) {
                    cVar.f(fVarK4, fVarK3, i23, 8);
                    iMin = Math.max(iMin, i23);
                }
                if (i24 > 0) {
                    if (!z2 || i27 != 1) {
                        cVar.g(fVarK4, fVarK3, i24, 8);
                    }
                    iMin = Math.min(iMin, i24);
                }
                if (i27 == 1) {
                    if (z2) {
                        cVar.e(fVarK4, fVarK3, iMin, 8);
                    } else if (z8) {
                        cVar.e(fVarK4, fVarK3, iMin, 5);
                        cVar.g(fVarK4, fVarK3, iMin, 8);
                    } else {
                        cVar.e(fVarK4, fVarK3, iMin, 5);
                        cVar.g(fVarK4, fVarK3, iMin, 8);
                    }
                } else if (i27 == 2) {
                    int i30 = cVar2.e;
                    if (i30 == 3 || i30 == 5) {
                        fVarK = cVar.k(this.S.i(3));
                        fVarK2 = cVar.k(this.S.i(5));
                    } else {
                        fVarK = cVar.k(this.S.i(2));
                        fVarK2 = cVar.k(this.S.i(4));
                    }
                    com.gamericefishpro.space.i3.b bVarL = cVar.l();
                    int i31 = i23;
                    bVarL.d.g(fVarK4, -1.0f);
                    bVarL.d.g(fVarK3, 1.0f);
                    bVarL.d.g(fVarK2, f2);
                    bVarL.d.g(fVarK, -f2);
                    cVar.c(bVarL);
                    if (z2) {
                        z14 = false;
                    }
                    z15 = z4;
                    i11 = i31;
                } else {
                    i11 = i23;
                    z15 = true;
                }
            } else {
                int iMax = Math.max(i23, iMin);
                if (i24 > 0) {
                    iMax = Math.min(i24, iMax);
                }
                cVar.e(fVarK4, fVarK3, iMax, 8);
                z15 = z4;
                i11 = i23;
                z14 = false;
            }
            if (z11 || z8) {
                boolean z27 = z15;
                if (i26 >= 2 && z2 && z27) {
                    cVar.f(fVarK3, fVar, 0, 8);
                    c cVar5 = this.L;
                    boolean z28 = z || cVar5.f == null;
                    if (!z && (cVar4 = cVar5.f) != null) {
                        d dVar2 = cVar4.d;
                        if (dVar2.V != 0.0f) {
                            int[] iArr = dVar2.o0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                        } else {
                            z28 = false;
                        }
                    }
                    if (z28) {
                        cVar.f(fVar2, fVarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zH || zH2 || zH3) {
                if (zH && !zH2) {
                    cVar3 = cVar3;
                    fVarK4 = fVarK4;
                    z15 = z15;
                    fVar3 = fVarK6;
                    z20 = z2;
                    i22 = (z2 && (cVar2.f.d instanceof a)) ? 8 : 5;
                } else if (zH || !zH2) {
                    fVar3 = fVarK6;
                    if (zH && zH2) {
                        d dVar3 = cVar2.f.d;
                        d dVar4 = cVar3.f.d;
                        z15 = z15;
                        d dVar5 = this.S;
                        int i32 = 6;
                        if (z14) {
                            if (i27 == 0) {
                                if (i24 != 0 || i11 != 0) {
                                    i20 = 5;
                                    i21 = 5;
                                    z23 = true;
                                    z24 = false;
                                    z17 = true;
                                } else if (fVarK5.y && fVar3.y) {
                                    cVar.e(fVarK3, fVarK5, cVar2.e(), 8);
                                    cVar.e(fVarK4, fVar3, -cVar3.e(), 8);
                                    return;
                                } else {
                                    i20 = 8;
                                    i21 = 8;
                                    z23 = false;
                                    z24 = true;
                                    z17 = false;
                                }
                                if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                    cVar = cVar;
                                    i27 = i27;
                                    fVarK3 = fVarK3;
                                    fVarK4 = fVarK4;
                                    z18 = z24;
                                    fVar2 = fVar2;
                                    i12 = i20;
                                    fVarK5 = fVarK5;
                                    i32 = 6;
                                    z16 = z23;
                                    i13 = 4;
                                } else {
                                    cVar = cVar;
                                    fVarK3 = fVarK3;
                                    fVarK4 = fVarK4;
                                    z18 = z24;
                                    i12 = i20;
                                    fVarK5 = fVarK5;
                                    i32 = 6;
                                    z16 = z23;
                                    i13 = i21;
                                    i27 = i27;
                                    fVar2 = fVar2;
                                }
                            } else {
                                if (i27 == 2) {
                                    if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                        i12 = 5;
                                    } else {
                                        cVar = cVar;
                                        i27 = i27;
                                        fVarK3 = fVarK3;
                                        fVarK4 = fVarK4;
                                        fVarK5 = fVarK5;
                                        i32 = 6;
                                        i12 = 5;
                                        i13 = 5;
                                    }
                                    z16 = true;
                                    z17 = true;
                                    z18 = false;
                                    fVar2 = fVar2;
                                } else if (i27 == 1) {
                                    i12 = 8;
                                } else if (i27 == 3) {
                                    i27 = i27;
                                    if (this.z != -1) {
                                        if (z6) {
                                            if (i7 == 2 || i7 == 1) {
                                                i18 = 5;
                                                i19 = 4;
                                            } else {
                                                i18 = 8;
                                                i19 = 5;
                                            }
                                            i13 = i19;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        } else {
                                            if (i24 > 0) {
                                                cVar = cVar;
                                                fVar2 = fVar2;
                                                fVarK3 = fVarK3;
                                                fVarK4 = fVarK4;
                                                fVarK5 = fVarK5;
                                                i32 = 6;
                                                i12 = 5;
                                            } else if (i24 != 0 || i11 != 0) {
                                                cVar = cVar;
                                                fVar2 = fVar2;
                                                fVarK3 = fVarK3;
                                                fVarK4 = fVarK4;
                                                fVarK5 = fVarK5;
                                                i32 = 6;
                                                i12 = 5;
                                                i13 = 4;
                                            } else if (z9) {
                                                i18 = (dVar3 == dVar5 || dVar4 == dVar5) ? 5 : 4;
                                                i13 = 4;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                            } else {
                                                cVar = cVar;
                                                fVar2 = fVar2;
                                                fVarK3 = fVarK3;
                                                fVarK4 = fVarK4;
                                                fVarK5 = fVarK5;
                                                i32 = 6;
                                                i12 = 5;
                                                i13 = 8;
                                            }
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        }
                                        i12 = i18;
                                        cVar = cVar;
                                    } else if (z9) {
                                        cVar = cVar;
                                        fVar2 = fVar2;
                                        fVarK3 = fVarK3;
                                        fVarK4 = fVarK4;
                                        fVarK5 = fVarK5;
                                        i12 = 8;
                                        i32 = z2 ? 5 : 4;
                                    } else {
                                        cVar = cVar;
                                        fVar2 = fVar2;
                                        fVarK3 = fVarK3;
                                        fVarK4 = fVarK4;
                                        fVarK5 = fVarK5;
                                        i12 = 8;
                                        i32 = 8;
                                    }
                                    i13 = 5;
                                    z16 = true;
                                    z17 = true;
                                    z18 = true;
                                } else {
                                    i12 = 5;
                                    i13 = 4;
                                    z16 = false;
                                    z17 = false;
                                }
                                i13 = 4;
                                z16 = true;
                                z17 = true;
                                z18 = false;
                                fVar2 = fVar2;
                            }
                            if (z17 || fVarK5 != fVar3 || dVar3 == dVar5) {
                                z19 = true;
                            } else {
                                z17 = false;
                                z19 = false;
                            }
                            if (z16) {
                                if (z14 && !z7 && !z9 && fVarK5 == fVar && fVar3 == fVar2) {
                                    i32 = 8;
                                    z20 = false;
                                    i17 = 8;
                                    z22 = false;
                                } else {
                                    z20 = z2;
                                    z22 = z19;
                                    i17 = i12;
                                }
                                com.gamericefishpro.space.i3.f fVar4 = fVarK5;
                                dVar = dVar4;
                                cVar.b(fVarK3, fVar4, cVar2.e(), f, fVar3, fVarK4, cVar3.e(), i32);
                                fVarK5 = fVar4;
                                i12 = i17;
                                z19 = z22;
                            } else {
                                dVar = dVar4;
                                z20 = z2;
                            }
                            if (this.f0 != 8 && ((hashSet = cVar3.a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z17) {
                                if (z20 && fVarK5 != fVar3 && !z14 && ((dVar3 instanceof a) || (dVar instanceof a))) {
                                    i12 = 6;
                                }
                                cVar.f(fVarK3, fVarK5, cVar2.e(), i12);
                                cVar.g(fVarK4, fVar3, -cVar3.e(), i12);
                            }
                            if (z20 || !z10 || (dVar3 instanceof a) || (dVar instanceof a) || dVar == dVar5) {
                                iMin2 = i13;
                                z21 = z19;
                            } else {
                                iMin2 = 6;
                                i12 = 6;
                                z21 = true;
                            }
                            if (z21) {
                                if (z18 && (!z9 || z3)) {
                                    if (dVar3 != dVar5 && dVar != dVar5) {
                                        i32 = iMin2;
                                    }
                                    if ((dVar3 instanceof h) || (dVar instanceof h)) {
                                        i32 = 5;
                                    }
                                    if ((dVar3 instanceof a) || (dVar instanceof a)) {
                                        i32 = 5;
                                    }
                                    if (z9) {
                                        i16 = 5;
                                    } else {
                                        i16 = i32;
                                    }
                                    iMin2 = Math.max(i16, iMin2);
                                }
                                if (z20) {
                                    iMin2 = Math.min(i12, iMin2);
                                    if (z6 || z9 || !(dVar3 == dVar5 || dVar == dVar5)) {
                                        i15 = iMin2;
                                    } else {
                                        i15 = 4;
                                    }
                                } else {
                                    i15 = iMin2;
                                }
                                cVar.e(fVarK3, fVarK5, cVar2.e(), i15);
                                cVar.e(fVarK4, fVar3, -cVar3.e(), i15);
                            }
                            if (z20) {
                                if (fVar == fVarK5) {
                                    iE = cVar2.e();
                                } else {
                                    iE = 0;
                                }
                                if (fVarK5 != fVar) {
                                    cVar.f(fVarK3, fVar, iE, 5);
                                }
                            }
                            if (z20 || !z14 || i4 != 0 || i11 != 0) {
                                i14 = 5;
                            } else if (z14 && i27 == 3) {
                                cVar.f(fVarK4, fVarK3, 0, 8);
                                i14 = 5;
                            } else {
                                i14 = 5;
                                cVar.f(fVarK4, fVarK3, 0, 5);
                            }
                        } else {
                            if (fVarK5.y && fVar3.y) {
                                cVar.b(fVarK3, fVarK5, cVar2.e(), f, fVar3, fVarK4, cVar3.e(), 8);
                                if (z2 && z15) {
                                    int iE2 = cVar3.f != null ? cVar3.e() : 0;
                                    if (fVar3 != fVar2) {
                                        cVar.f(fVar2, fVarK4, iE2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i12 = 5;
                            i13 = 4;
                            z16 = true;
                            z17 = true;
                        }
                        z18 = false;
                        if (z17) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z16) {
                            if (z14) {
                                z20 = z2;
                                z22 = z19;
                                i17 = i12;
                            } else {
                                z20 = z2;
                                z22 = z19;
                                i17 = i12;
                            }
                            com.gamericefishpro.space.i3.f fVar5 = fVarK5;
                            dVar = dVar4;
                            cVar.b(fVarK3, fVar5, cVar2.e(), f, fVar3, fVarK4, cVar3.e(), i32);
                            fVarK5 = fVar5;
                            i12 = i17;
                            z19 = z22;
                        } else {
                            dVar = dVar4;
                            z20 = z2;
                        }
                        if (this.f0 != 8) {
                        }
                        if (z17) {
                            if (z20) {
                                i12 = 6;
                            }
                            cVar.f(fVarK3, fVarK5, cVar2.e(), i12);
                            cVar.g(fVarK4, fVar3, -cVar3.e(), i12);
                        }
                        if (z20) {
                            iMin2 = i13;
                            z21 = z19;
                        } else {
                            iMin2 = i13;
                            z21 = z19;
                        }
                        if (z21) {
                            if (z18) {
                                if (dVar3 != dVar5) {
                                    i32 = iMin2;
                                }
                                if (dVar3 instanceof h) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (dVar3 instanceof a) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (z9) {
                                    i16 = 5;
                                } else {
                                    i16 = i32;
                                }
                                iMin2 = Math.max(i16, iMin2);
                            }
                            if (z20) {
                                iMin2 = Math.min(i12, iMin2);
                                if (z6) {
                                    i15 = iMin2;
                                } else {
                                    i15 = iMin2;
                                }
                            } else {
                                i15 = iMin2;
                            }
                            cVar.e(fVarK3, fVarK5, cVar2.e(), i15);
                            cVar.e(fVarK4, fVar3, -cVar3.e(), i15);
                        }
                        if (z20) {
                            if (fVar == fVarK5) {
                                iE = cVar2.e();
                            } else {
                                iE = 0;
                            }
                            if (fVarK5 != fVar) {
                                cVar.f(fVarK3, fVar, iE, 5);
                            }
                        }
                        if (z20) {
                            i14 = 5;
                        } else {
                            i14 = 5;
                        }
                    }
                    i22 = i14;
                } else {
                    fVar3 = fVarK6;
                    cVar.e(fVarK4, fVar3, -cVar3.e(), 8);
                    if (z2) {
                        cVar.f(fVarK3, fVar, 0, 5);
                        cVar3 = cVar3;
                        i14 = 5;
                        fVarK4 = fVarK4;
                        z15 = z15;
                    }
                    z20 = z2;
                    i22 = i14;
                }
                if (z20 || !z15) {
                    return;
                }
                int iE3 = cVar3.f != null ? cVar3.e() : 0;
                if (fVar3 != fVar2) {
                    cVar.f(fVar2, fVarK4, iE3, i22);
                    return;
                }
                return;
            }
            fVar3 = fVarK6;
            i14 = 5;
            z20 = z2;
            i22 = i14;
            if (z20) {
                return;
            } else {
                return;
            }
        }
        if (z5) {
            cVar.e(fVarK4, fVarK3, 0, 3);
            if (i4 > 0) {
                cVar.f(fVarK4, fVarK3, i4, i10);
            }
            if (i5 < Integer.MAX_VALUE) {
                cVar.g(fVarK4, fVarK3, i5, i10);
            }
        } else {
            cVar.e(fVarK4, fVarK3, iMin, i10);
        }
        z15 = z4;
        i11 = i23;
        if (z11) {
        }
        boolean z29 = z15;
        if (i26 >= 2) {
        }
    }

    public final void e(int i, d dVar, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, dVar, i2, 0);
                    e(4, dVar, i2, 0);
                    i(7).a(dVar.i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, dVar, i2, 0);
                        e(5, dVar, i2, 0);
                        i(7).a(dVar.i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            c cVarI = i(2);
            c cVarI2 = i(4);
            c cVarI3 = i(3);
            c cVarI4 = i(5);
            boolean z2 = true;
            if ((cVarI == null || !cVarI.h()) && (cVarI2 == null || !cVarI2.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((cVarI3 == null || !cVarI3.h()) && (cVarI4 == null || !cVarI4.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                i(7).a(dVar.i(7), 0);
                return;
            } else if (z) {
                i(8).a(dVar.i(8), 0);
                return;
            } else {
                if (z2) {
                    i(9).a(dVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            c cVarI5 = i(2);
            c cVarI6 = dVar.i(i2);
            c cVarI7 = i(4);
            cVarI5.a(cVarI6, 0);
            cVarI7.a(cVarI6, 0);
            i(8).a(cVarI6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            c cVarI8 = dVar.i(i2);
            i(3).a(cVarI8, 0);
            i(5).a(cVarI8, 0);
            i(9).a(cVarI8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i2), 0);
            return;
        }
        c cVarI9 = i(i);
        c cVarI10 = dVar.i(i2);
        if (cVarI9.i(cVarI10)) {
            if (i == 6) {
                c cVarI11 = i(3);
                c cVarI12 = i(5);
                if (cVarI11 != null) {
                    cVarI11.j();
                }
                if (cVarI12 != null) {
                    cVarI12.j();
                }
            } else if (i == 3 || i == 5) {
                c cVarI13 = i(6);
                if (cVarI13 != null) {
                    cVarI13.j();
                }
                c cVarI14 = i(7);
                if (cVarI14.f != cVarI10) {
                    cVarI14.j();
                }
                c cVarF = i(i).f();
                c cVarI15 = i(9);
                if (cVarI15.h()) {
                    cVarF.j();
                    cVarI15.j();
                }
            } else if (i == 2 || i == 4) {
                c cVarI16 = i(7);
                if (cVarI16.f != cVarI10) {
                    cVarI16.j();
                }
                c cVarF2 = i(i).f();
                c cVarI17 = i(8);
                if (cVarI17.h()) {
                    cVarF2.j();
                    cVarI17.j();
                }
            }
            cVarI9.a(cVarI10, i3);
        }
    }

    public final void f(c cVar, c cVar2, int i) {
        if (cVar.d == this) {
            e(cVar.e, cVar2.d, cVar2.e, i);
        }
    }

    public final void g(com.gamericefishpro.space.i3.c cVar) {
        cVar.k(this.H);
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        if (this.Z > 0) {
            cVar.k(this.L);
        }
    }

    public final void h() {
        if (this.d == null) {
            k kVar = new k(this);
            kVar.h.e = 4;
            kVar.i.e = 5;
            kVar.f = 0;
            this.d = kVar;
        }
        if (this.e == null) {
            m mVar = new m(this);
            com.gamericefishpro.space.l3.f fVar = new com.gamericefishpro.space.l3.f(mVar);
            mVar.k = fVar;
            mVar.l = null;
            mVar.h.e = 6;
            mVar.i.e = 7;
            fVar.e = 8;
            mVar.f = 1;
            this.e = mVar;
        }
    }

    public c i(int i) {
        switch (com.gamericefishpro.space.i3.e.b(i)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return null;
            case 1:
                return this.H;
            case 2:
                return this.I;
            case 3:
                return this.J;
            case 4:
                return this.K;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return this.L;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.O;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.M;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return this.N;
            default:
                throw new AssertionError(com.gamericefishpro.space.m5.a.w(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.o0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final d l(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.K).f) != null && cVar2.f == cVar) {
                return cVar2.d;
            }
            return null;
        }
        c cVar3 = this.J;
        c cVar4 = cVar3.f;
        if (cVar4 == null || cVar4.f != cVar3) {
            return null;
        }
        return cVar4.d;
    }

    public final d m(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.I).f) != null && cVar2.f == cVar) {
                return cVar2.d;
            }
            return null;
        }
        c cVar3 = this.H;
        c cVar4 = cVar3.f;
        if (cVar4 == null || cVar4.f != cVar3) {
            return null;
        }
        return cVar4.d;
    }

    public final int n() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.T;
    }

    public final int o() {
        d dVar = this.S;
        return (dVar == null || !(dVar instanceof e)) ? this.X : ((e) dVar).w0 + this.X;
    }

    public final int p() {
        d dVar = this.S;
        return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).x0 + this.Y;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean q(int i) {
        if (i == 0) {
            if ((this.H.f != null ? 1 : 0) + (this.J.f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final boolean r(int i, int i2) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i == 0) {
            c cVar5 = this.H;
            c cVar6 = cVar5.f;
            if (cVar6 == null || !cVar6.c || (cVar4 = (cVar3 = this.J).f) == null || !cVar4.c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f.d()) >= i2;
        }
        c cVar7 = this.I;
        c cVar8 = cVar7.f;
        if (cVar8 == null || !cVar8.c || (cVar2 = (cVar = this.K).f) == null || !cVar2.c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f.d()) >= i2;
    }

    public final void s(int i, int i2, int i3, int i4, d dVar) {
        i(i).b(dVar.i(i2), i3, i4, true);
    }

    public final boolean t(int i) {
        c cVar;
        c cVar2;
        int i2 = i * 2;
        c[] cVarArr = this.P;
        c cVar3 = cVarArr[i2];
        c cVar4 = cVar3.f;
        return (cVar4 == null || cVar4.f == cVar3 || (cVar2 = (cVar = cVarArr[i2 + 1]).f) == null || cVar2.f != cVar) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.g0 != null ? y0.j(new StringBuilder("id: "), this.g0, " ") : "");
        sb.append("(");
        sb.append(this.X);
        sb.append(", ");
        sb.append(this.Y);
        sb.append(") - (");
        sb.append(this.T);
        sb.append(" x ");
        sb.append(this.U);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        c cVar = this.H;
        c cVar2 = cVar.f;
        if (cVar2 != null && cVar2.f == cVar) {
            return true;
        }
        c cVar3 = this.J;
        c cVar4 = cVar3.f;
        return cVar4 != null && cVar4.f == cVar3;
    }

    public final boolean v() {
        c cVar = this.I;
        c cVar2 = cVar.f;
        if (cVar2 != null && cVar2.f == cVar) {
            return true;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f;
        return cVar4 != null && cVar4.f == cVar3;
    }

    public final boolean w() {
        return this.g && this.f0 != 8;
    }

    public boolean x() {
        if (this.j) {
            return true;
        }
        return this.H.c && this.J.c;
    }

    public boolean y() {
        if (this.k) {
            return true;
        }
        return this.I.c && this.K.c;
    }

    public void z() {
        this.H.j();
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.S = null;
        this.C = 0.0f;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        int[] iArr = this.o0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.e0 = null;
        this.f0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        float[] fArr = this.j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.n = -1;
        this.o = -1;
        int[] iArr2 = this.B;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.q = 0;
        this.r = 0;
        this.v = 1.0f;
        this.y = 1.0f;
        this.u = Integer.MAX_VALUE;
        this.x = Integer.MAX_VALUE;
        this.t = 0;
        this.w = 0;
        this.z = -1;
        this.A = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.E = false;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.s;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }
}
