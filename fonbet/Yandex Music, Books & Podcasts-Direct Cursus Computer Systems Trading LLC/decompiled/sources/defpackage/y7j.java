package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class y7j extends k8j {
    public final xci c;
    public final nug d;
    public final ovg e;
    public f8j f;
    public ffm g;
    public boolean h;
    public boolean i;
    public boolean j;

    public y7j(xci xciVar) {
        this.c = xciVar;
        nug nugVar = new nug(1, (byte) 0);
        nugVar.c = new long[2];
        this.d = nugVar;
        this.e = new ovg(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [xci] */
    /* JADX WARN: Type inference failed for: r5v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43, types: [xci] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [eqi] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [eqi] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // defpackage.k8j
    public final boolean a(ovg ovgVar, wof wofVar, fmq fmqVar, boolean z) {
        nug nugVar;
        ovg ovgVar2;
        Object obj;
        boolean z2;
        boolean z3;
        ffm ffmVar;
        int i;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        int i5;
        lfm lfmVar;
        boolean a = super.a(ovgVar, wofVar, fmqVar, z);
        cw7 cw7Var = this.c;
        boolean z6 = true;
        if (cw7Var.n) {
            ?? r8 = 0;
            while (cw7Var != 0) {
                if (cw7Var instanceof ofm) {
                    this.f = bcx.D((ofm) cw7Var, 16);
                } else if ((cw7Var.c & 16) != 0 && (cw7Var instanceof cw7)) {
                    xci xciVar = cw7Var.p;
                    int i6 = 0;
                    cw7Var = cw7Var;
                    r8 = r8;
                    while (xciVar != null) {
                        if ((xciVar.c & 16) != 0) {
                            i6++;
                            r8 = r8;
                            if (i6 == 1) {
                                cw7Var = xciVar;
                            } else {
                                if (r8 == 0) {
                                    r8 = new eqi(new xci[16]);
                                }
                                if (cw7Var != 0) {
                                    r8.d(cw7Var);
                                    cw7Var = 0;
                                }
                                r8.d(xciVar);
                            }
                        }
                        xciVar = xciVar.f;
                        cw7Var = cw7Var;
                        r8 = r8;
                    }
                    if (i6 == 1) {
                    }
                }
                cw7Var = bcx.p(r8);
            }
            if (this.f != null) {
                int h = ovgVar.h();
                int i7 = 0;
                while (true) {
                    nugVar = this.d;
                    ovgVar2 = this.e;
                    if (i7 >= h) {
                        break;
                    }
                    long e = ovgVar.e(i7);
                    lfm lfmVar2 = (lfm) ovgVar.i(i7);
                    if (nugVar.c(e)) {
                        boolean z7 = z6;
                        long j = lfmVar2.g;
                        ArrayList arrayList = lfmVar2.k;
                        long j2 = lfmVar2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            z4 = a;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? c5b.a : arrayList).size());
                            List list = arrayList == null ? c5b.a : arrayList;
                            i3 = h;
                            int size = list.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list2 = list;
                                zyd zydVar = (zyd) list.get(i8);
                                ovg ovgVar3 = ovgVar2;
                                long j3 = e;
                                long j4 = zydVar.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    lfmVar = lfmVar2;
                                    long j5 = zydVar.a;
                                    i5 = size;
                                    f8j f8jVar = this.f;
                                    f8jVar.getClass();
                                    arrayList2.add(new zyd(j5, f8jVar.k1(wofVar, j4), zydVar.c));
                                } else {
                                    i5 = size;
                                    lfmVar = lfmVar2;
                                }
                                i8++;
                                size = i5;
                                list = list2;
                                ovgVar2 = ovgVar3;
                                e = j3;
                                lfmVar2 = lfmVar;
                            }
                            ovg ovgVar4 = ovgVar2;
                            long j6 = e;
                            f8j f8jVar2 = this.f;
                            f8jVar2.getClass();
                            long k1 = f8jVar2.k1(wofVar, j);
                            f8j f8jVar3 = this.f;
                            f8jVar3.getClass();
                            lfm lfmVar3 = new lfm(lfmVar2.a, lfmVar2.b, f8jVar3.k1(wofVar, j2), lfmVar2.d, lfmVar2.e, lfmVar2.f, k1, lfmVar2.h, lfmVar2.i, arrayList2, lfmVar2.j, lfmVar2.l);
                            lfm lfmVar4 = lfmVar2.o;
                            if (lfmVar4 == null) {
                                lfmVar4 = lfmVar2;
                            }
                            lfmVar3.o = lfmVar4;
                            lfm lfmVar5 = lfmVar2.o;
                            if (lfmVar5 != null) {
                                lfmVar2 = lfmVar5;
                            }
                            lfmVar3.o = lfmVar2;
                            ovgVar4.f(j6, lfmVar3);
                        } else {
                            z4 = a;
                            i3 = h;
                            i4 = i7;
                            z5 = z7;
                        }
                    } else {
                        z4 = a;
                        i3 = h;
                        z5 = z6;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    z6 = z5;
                    h = i3;
                    a = z4;
                }
                boolean z8 = a;
                boolean z9 = z6;
                if (ovgVar2.h() == 0) {
                    nugVar.b = 0;
                    this.a.i();
                    return z9;
                }
                int i9 = nugVar.b;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    if (ovgVar.d(nugVar.c[i9]) < 0 && i9 < (i2 = nugVar.b)) {
                        int i10 = i2 - 1;
                        int i11 = i9;
                        while (i11 < i10) {
                            long[] jArr = nugVar.c;
                            int i12 = i11 + 1;
                            jArr[i11] = jArr[i12];
                            i11 = i12;
                        }
                        nugVar.b--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(ovgVar2.h());
                int h2 = ovgVar2.h();
                for (int i13 = 0; i13 < h2; i13++) {
                    arrayList3.add(ovgVar2.i(i13));
                }
                ffm ffmVar2 = new ffm(arrayList3, fmqVar);
                int size2 = arrayList3.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i14);
                    if (fmqVar.u(((lfm) obj).a)) {
                        break;
                    }
                    i14++;
                }
                lfm lfmVar6 = (lfm) obj;
                if (lfmVar6 != null) {
                    boolean z10 = lfmVar6.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z10 || lfmVar6.h)) {
                            f8j f8jVar4 = this.f;
                            f8jVar4.getClass();
                            long j7 = f8jVar4.c;
                            long j8 = lfmVar6.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i15 = (int) (j7 >> 32);
                            this.i = !((intBitsToFloat2 > ((float) ((int) (j7 & 4294967295L))) ? z9 : false) | (intBitsToFloat > ((float) i15) ? z9 : false) | (intBitsToFloat < 0.0f ? z9 : false) | (intBitsToFloat2 < 0.0f ? z9 : false));
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z11 = this.i;
                    boolean z12 = this.h;
                    if (z11 == z12 || !((i = ffmVar2.d) == 3 || i == 4 || i == 5)) {
                        int i16 = ffmVar2.d;
                        if (i16 == 4 && z12 && !this.j) {
                            ffmVar2.d = 3;
                        } else if (i16 == 5 && z11 && z10) {
                            ffmVar2.d = 3;
                        }
                    } else {
                        ffmVar2.d = z11 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z8 && ffmVar2.d == 3 && (ffmVar = this.g) != null) {
                    ?? r1 = ffmVar.a;
                    int size3 = r1.size();
                    ?? r5 = ffmVar2.a;
                    if (size3 == r5.size()) {
                        int size4 = r5.size();
                        for (?? r6 = z2; r6 < size4; r6++) {
                            if (enj.c(((lfm) r1.get(r6)).c, ((lfm) r5.get(r6)).c)) {
                            }
                        }
                        z3 = z2;
                        this.g = ffmVar2;
                        return z3;
                    }
                }
                z3 = z9;
                this.g = ffmVar2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.k8j
    public final void b(fmq fmqVar) {
        super.b(fmqVar);
        ffm ffmVar = this.g;
        if (ffmVar == null) {
            return;
        }
        this.h = this.i;
        List list = ffmVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lfm lfmVar = (lfm) list.get(i);
            boolean z = lfmVar.d;
            long j = lfmVar.a;
            boolean u = fmqVar.u(j);
            boolean z2 = this.i;
            if ((!z && !u) || (!z && !z2)) {
                this.d.e(j);
            }
        }
        this.i = false;
        this.j = ffmVar.d == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [xci] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [xci] */
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
    /* JADX WARN: Type inference failed for: r3v5, types: [eqi] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [eqi] */
    public final void c() {
        eqi eqiVar = this.a;
        Object[] objArr = eqiVar.a;
        int i = eqiVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((y7j) objArr[i2]).c();
        }
        cw7 cw7Var = this.c;
        ?? r3 = 0;
        while (cw7Var != 0) {
            if (cw7Var instanceof ofm) {
                ((ofm) cw7Var).Z();
            } else if ((cw7Var.c & 16) != 0 && (cw7Var instanceof cw7)) {
                xci xciVar = cw7Var.p;
                int i3 = 0;
                cw7Var = cw7Var;
                r3 = r3;
                while (xciVar != null) {
                    if ((xciVar.c & 16) != 0) {
                        i3++;
                        r3 = r3;
                        if (i3 == 1) {
                            cw7Var = xciVar;
                        } else {
                            if (r3 == 0) {
                                r3 = new eqi(new xci[16]);
                            }
                            if (cw7Var != 0) {
                                r3.d(cw7Var);
                                cw7Var = 0;
                            }
                            r3.d(xciVar);
                        }
                    }
                    xciVar = xciVar.f;
                    cw7Var = cw7Var;
                    r3 = r3;
                }
                if (i3 == 1) {
                }
            }
            cw7Var = bcx.p(r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [xci] */
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
    /* JADX WARN: Type inference failed for: r8v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(fmq fmqVar) {
        ovg ovgVar = this.e;
        boolean z = false;
        z = false;
        if (ovgVar.h() != 0) {
            xci xciVar = this.c;
            if (xciVar.n) {
                ffm ffmVar = this.g;
                ffmVar.getClass();
                f8j f8jVar = this.f;
                f8jVar.getClass();
                long j = f8jVar.c;
                cw7 cw7Var = xciVar;
                ?? r8 = 0;
                while (cw7Var != 0) {
                    if (cw7Var instanceof ofm) {
                        ((ofm) cw7Var).o(ffmVar, gfm.c, j);
                    } else if ((cw7Var.c & 16) != 0 && (cw7Var instanceof cw7)) {
                        xci xciVar2 = cw7Var.p;
                        int i = 0;
                        cw7Var = cw7Var;
                        r8 = r8;
                        while (xciVar2 != null) {
                            if ((xciVar2.c & 16) != 0) {
                                i++;
                                r8 = r8;
                                if (i == 1) {
                                    cw7Var = xciVar2;
                                } else {
                                    if (r8 == 0) {
                                        r8 = new eqi(new xci[16]);
                                    }
                                    if (cw7Var != 0) {
                                        r8.d(cw7Var);
                                        cw7Var = 0;
                                    }
                                    r8.d(xciVar2);
                                }
                            }
                            xciVar2 = xciVar2.f;
                            cw7Var = cw7Var;
                            r8 = r8;
                        }
                        if (i == 1) {
                        }
                    }
                    cw7Var = bcx.p(r8);
                }
                if (xciVar.n) {
                    eqi eqiVar = this.a;
                    Object[] objArr = eqiVar.a;
                    int i2 = eqiVar.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((y7j) objArr[i3]).d(fmqVar);
                    }
                }
                z = true;
            }
        }
        b(fmqVar);
        ovgVar.b();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [xci] */
    /* JADX WARN: Type inference failed for: r0v3, types: [xci] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [xci] */
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
    /* JADX WARN: Type inference failed for: r14v5, types: [eqi] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [eqi] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [xci] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [eqi] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [eqi] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(fmq fmqVar, boolean z) {
        if (this.e.h() == 0) {
            return false;
        }
        cw7 cw7Var = this.c;
        if (!cw7Var.n) {
            return false;
        }
        ffm ffmVar = this.g;
        ffmVar.getClass();
        f8j f8jVar = this.f;
        f8jVar.getClass();
        long j = f8jVar.c;
        cw7 cw7Var2 = cw7Var;
        ?? r7 = 0;
        while (cw7Var2 != 0) {
            if (cw7Var2 instanceof ofm) {
                ((ofm) cw7Var2).o(ffmVar, gfm.a, j);
            } else if ((cw7Var2.c & 16) != 0 && (cw7Var2 instanceof cw7)) {
                xci xciVar = cw7Var2.p;
                int i = 0;
                cw7Var2 = cw7Var2;
                r7 = r7;
                while (xciVar != null) {
                    if ((xciVar.c & 16) != 0) {
                        i++;
                        r7 = r7;
                        if (i == 1) {
                            cw7Var2 = xciVar;
                        } else {
                            if (r7 == 0) {
                                r7 = new eqi(new xci[16]);
                            }
                            if (cw7Var2 != 0) {
                                r7.d(cw7Var2);
                                cw7Var2 = 0;
                            }
                            r7.d(xciVar);
                        }
                    }
                    xciVar = xciVar.f;
                    cw7Var2 = cw7Var2;
                    r7 = r7;
                }
                if (i == 1) {
                }
            }
            cw7Var2 = bcx.p(r7);
        }
        if (cw7Var.n) {
            eqi eqiVar = this.a;
            Object[] objArr = eqiVar.a;
            int i2 = eqiVar.c;
            for (int i3 = 0; i3 < i2; i3++) {
                y7j y7jVar = (y7j) objArr[i3];
                this.f.getClass();
                y7jVar.e(fmqVar, z);
            }
        }
        if (cw7Var.n) {
            ?? r14 = 0;
            while (cw7Var != 0) {
                if (cw7Var instanceof ofm) {
                    ((ofm) cw7Var).o(ffmVar, gfm.b, j);
                } else if ((cw7Var.c & 16) != 0 && (cw7Var instanceof cw7)) {
                    xci xciVar2 = cw7Var.p;
                    int i4 = 0;
                    cw7Var = cw7Var;
                    r14 = r14;
                    while (xciVar2 != null) {
                        if ((xciVar2.c & 16) != 0) {
                            i4++;
                            r14 = r14;
                            if (i4 == 1) {
                                cw7Var = xciVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new eqi(new xci[16]);
                                }
                                if (cw7Var != 0) {
                                    r14.d(cw7Var);
                                    cw7Var = 0;
                                }
                                r14.d(xciVar2);
                            }
                        }
                        xciVar2 = xciVar2.f;
                        cw7Var = cw7Var;
                        r14 = r14;
                    }
                    if (i4 == 1) {
                    }
                }
                cw7Var = bcx.p(r14);
            }
        }
        return true;
    }

    public final void f(long j, gpi gpiVar) {
        nug nugVar = this.d;
        if (nugVar.c(j) && gpiVar.f(this) < 0) {
            nugVar.e(j);
            this.e.g(j);
        }
        eqi eqiVar = this.a;
        Object[] objArr = eqiVar.a;
        int i = eqiVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((y7j) objArr[i2]).f(j, gpiVar);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
