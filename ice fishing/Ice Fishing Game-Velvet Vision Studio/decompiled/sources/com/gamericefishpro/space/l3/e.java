package com.gamericefishpro.space.l3;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public com.gamericefishpro.space.k3.e a;
    public boolean b;
    public boolean c;
    public com.gamericefishpro.space.k3.e d;
    public ArrayList e;
    public com.gamericefishpro.space.n3.f f;
    public b g;
    public ArrayList h;

    public final void a(f fVar, int i, ArrayList arrayList, l lVar) {
        o oVar = fVar.d;
        l lVar2 = oVar.c;
        f fVar2 = oVar.i;
        f fVar3 = oVar.h;
        if (lVar2 == null) {
            com.gamericefishpro.space.k3.e eVar = this.a;
            if (oVar == eVar.d || oVar == eVar.e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.a = null;
                lVar.b = new ArrayList();
                lVar.a = oVar;
                arrayList.add(lVar);
            }
            oVar.c = lVar;
            lVar.b.add(oVar);
            ArrayList arrayList2 = fVar3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                d dVar = (d) obj;
                if (dVar instanceof f) {
                    a((f) dVar, i, arrayList, lVar);
                }
            }
            ArrayList arrayList3 = fVar2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof f) {
                    a((f) dVar2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (oVar instanceof m)) {
                ArrayList arrayList4 = ((m) oVar).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i, arrayList, lVar);
                    }
                }
            }
            ArrayList arrayList5 = fVar3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((f) obj4, i, arrayList, lVar);
            }
            ArrayList arrayList6 = fVar2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((f) obj5, i, arrayList, lVar);
            }
            if (i == 1 && (oVar instanceof m)) {
                ArrayList arrayList7 = ((m) oVar).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((f) obj6, i, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:114:0x0207  */
    /* JADX WARN: Code duplicated, block: B:116:0x020a  */
    /* JADX WARN: Code duplicated, block: B:117:0x021f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0224  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228  */
    /* JADX WARN: Code duplicated, block: B:126:0x025f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0269  */
    /* JADX WARN: Code duplicated, block: B:134:0x029a  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0306  */
    /* JADX WARN: Code duplicated, block: B:152:0x0311  */
    /* JADX WARN: Code duplicated, block: B:155:0x0324  */
    /* JADX WARN: Code duplicated, block: B:156:0x0337  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1 A[PHI: r0
      0x00d1: PHI (r0v22 int) = (r0v20 int), (r0v99 int) binds: [B:68:0x00c9, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x014b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x018c  */
    public final void b(com.gamericefishpro.space.k3.e eVar) {
        int i;
        int i2;
        int iN;
        int iK;
        int i3;
        int iK2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f;
        int i16;
        int i17;
        ArrayList arrayList = eVar.p0;
        int[] iArr = eVar.o0;
        int size = arrayList.size();
        char c = 0;
        int i18 = 0;
        while (i18 < size) {
            Object obj = arrayList.get(i18);
            i18++;
            com.gamericefishpro.space.k3.d dVar = (com.gamericefishpro.space.k3.d) obj;
            int[] iArr2 = dVar.o0;
            com.gamericefishpro.space.k3.c[] cVarArr = dVar.P;
            com.gamericefishpro.space.k3.c cVar = dVar.K;
            com.gamericefishpro.space.k3.c cVar2 = dVar.I;
            com.gamericefishpro.space.k3.c cVar3 = dVar.J;
            com.gamericefishpro.space.k3.c cVar4 = dVar.H;
            int i19 = iArr2[c];
            int i20 = iArr2[1];
            c = c;
            if (dVar.f0 == 8) {
                dVar.a = true;
            } else {
                float f2 = dVar.v;
                if (f2 < 1.0f && i19 == 3) {
                    dVar.q = 2;
                }
                float f3 = dVar.y;
                if (f3 < 1.0f && i20 == 3) {
                    dVar.r = 2;
                }
                if (dVar.V > 0.0f) {
                    if (i19 == 3) {
                        i17 = 2;
                        if (i20 == 2 || i20 == 1) {
                            i = 3;
                            dVar.q = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i17 = 2;
                    }
                    if (i20 == i && (i19 == i17 || i19 == 1)) {
                        dVar.r = i;
                    } else if (i19 == i && i20 == i) {
                        if (dVar.q == 0) {
                            dVar.q = i;
                        }
                        if (dVar.r == 0) {
                            dVar.r = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i19 == i && dVar.q == 1 && (cVar4.f == null || cVar3.f == null)) {
                    i19 = 2;
                }
                if (i20 == 3 && dVar.r == 1 && (cVar2.f == null || cVar.f == null)) {
                    i20 = 2;
                }
                k kVar = dVar.d;
                kVar.d = i19;
                int i21 = dVar.q;
                kVar.a = i21;
                m mVar = dVar.e;
                mVar.d = i20;
                ArrayList arrayList2 = arrayList;
                int i22 = dVar.r;
                mVar.a = i22;
                if (i19 == 4 || i19 == 1) {
                    if (i20 == 4) {
                        i2 = 1;
                    } else if (i20 != 1) {
                        i4 = 2;
                        if (i20 == 2) {
                            i2 = 1;
                        } else {
                            if (i19 != 3) {
                                i5 = i4;
                                i6 = i20;
                                i7 = 1;
                            } else if (i20 == i4 && i20 != 1) {
                                i5 = i4;
                                i8 = 3;
                                i6 = i20;
                                i7 = 1;
                                if (i6 != i8) {
                                    if (i19 == i5 && i19 != i7) {
                                        i12 = i8;
                                        i9 = i19;
                                        i10 = i5;
                                    } else if (i22 == i8) {
                                        if (i19 == i5) {
                                            f(i5, 0, i5, 0, dVar);
                                        }
                                        int iN2 = dVar.n();
                                        f = dVar.V;
                                        if (dVar.W == -1) {
                                            f = 1.0f / f;
                                        }
                                        f(i7, iN2, i7, (int) ((iN2 * f) + 0.5f), dVar);
                                        dVar.d.e.d(dVar.n());
                                        dVar.e.e.d(dVar.k());
                                        dVar.a = true;
                                    } else if (i22 == 1) {
                                        f(i19, 0, i5, 0, dVar);
                                        dVar.e.e.m = dVar.k();
                                    } else {
                                        i13 = i5;
                                        i14 = i19;
                                        if (i22 == 2) {
                                            i15 = iArr[1];
                                            if (i15 != i7 || i15 == 4) {
                                                f(i14, dVar.n(), i7, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                                dVar.d.e.d(dVar.n());
                                                dVar.e.e.d(dVar.k());
                                                dVar.a = true;
                                            } else {
                                                i9 = i14;
                                                i10 = i13;
                                                i12 = 3;
                                            }
                                        } else {
                                            i9 = i14;
                                            if (cVarArr[2].f != null || cVarArr[3].f == null) {
                                                f(i13, 0, i6, 0, dVar);
                                                dVar.d.e.d(dVar.n());
                                                dVar.e.e.d(dVar.k());
                                                dVar.a = true;
                                            } else {
                                                i10 = i13;
                                            }
                                        }
                                    }
                                    i7 = i7;
                                    i11 = 1;
                                    if (i9 == i12 && i6 == i12) {
                                        if (i21 != i11 || i22 == i11) {
                                            f(i10, 0, i10, 0, dVar);
                                            dVar.d.e.m = dVar.n();
                                            dVar.e.e.m = dVar.k();
                                        } else if (i22 == 2 && i21 == 2 && iArr[c] == i7 && iArr[i11] == i7) {
                                            f(i7, (int) ((f2 * eVar.n()) + 0.5f), i7, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                            dVar.d.e.d(dVar.n());
                                            dVar.e.e.d(dVar.k());
                                            dVar.a = true;
                                        }
                                    }
                                } else {
                                    i9 = i19;
                                    i10 = i5;
                                }
                                i11 = 1;
                                i12 = 3;
                                if (i9 == i12) {
                                    if (i21 != i11) {
                                        f(i10, 0, i10, 0, dVar);
                                        dVar.d.e.m = dVar.n();
                                        dVar.e.e.m = dVar.k();
                                    } else {
                                        f(i10, 0, i10, 0, dVar);
                                        dVar.d.e.m = dVar.n();
                                        dVar.e.e.m = dVar.k();
                                    }
                                }
                            } else if (i21 == 3) {
                                if (i20 == i4) {
                                    f(i4, 0, i4, 0, dVar);
                                }
                                int iK3 = dVar.k();
                                f(1, (int) ((iK3 * dVar.V) + 0.5f), 1, iK3, dVar);
                                dVar.d.e.d(dVar.n());
                                dVar.e.e.d(dVar.k());
                                dVar.a = true;
                            } else {
                                i5 = i4;
                                if (i21 == 1) {
                                    f(i5, 0, i20, 0, dVar);
                                    dVar.d.e.m = dVar.n();
                                } else if (i21 == 2) {
                                    i16 = iArr[c];
                                    if (i16 != 1 || i16 == 4) {
                                        f(1, (int) ((f2 * eVar.n()) + 0.5f), i20, dVar.k(), dVar);
                                        dVar.d.e.d(dVar.n());
                                        dVar.e.e.d(dVar.k());
                                        dVar.a = true;
                                    } else {
                                        i6 = i20;
                                        i7 = 1;
                                    }
                                } else {
                                    i6 = i20;
                                    i7 = 1;
                                    if (cVarArr[c].f != null || cVarArr[1].f == null) {
                                        f(i5, 0, i6, 0, dVar);
                                        dVar.d.e.d(dVar.n());
                                        dVar.e.e.d(dVar.k());
                                        dVar.a = true;
                                    }
                                }
                            }
                            i8 = 3;
                            if (i6 != i8) {
                                i9 = i19;
                                i10 = i5;
                            } else if (i19 == i5) {
                                if (i22 == i8) {
                                    if (i19 == i5) {
                                        f(i5, 0, i5, 0, dVar);
                                    }
                                    int iN3 = dVar.n();
                                    f = dVar.V;
                                    if (dVar.W == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(i7, iN3, i7, (int) ((iN3 * f) + 0.5f), dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                } else if (i22 == 1) {
                                    f(i19, 0, i5, 0, dVar);
                                    dVar.e.e.m = dVar.k();
                                } else {
                                    i13 = i5;
                                    i14 = i19;
                                    if (i22 == 2) {
                                        i15 = iArr[1];
                                        if (i15 != i7) {
                                        }
                                        f(i14, dVar.n(), i7, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                        dVar.d.e.d(dVar.n());
                                        dVar.e.e.d(dVar.k());
                                        dVar.a = true;
                                    } else {
                                        i9 = i14;
                                        if (cVarArr[2].f != null) {
                                        }
                                        f(i13, 0, i6, 0, dVar);
                                        dVar.d.e.d(dVar.n());
                                        dVar.e.e.d(dVar.k());
                                        dVar.a = true;
                                    }
                                }
                            } else if (i22 == i8) {
                                if (i19 == i5) {
                                    f(i5, 0, i5, 0, dVar);
                                }
                                int iN4 = dVar.n();
                                f = dVar.V;
                                if (dVar.W == -1) {
                                    f = 1.0f / f;
                                }
                                f(i7, iN4, i7, (int) ((iN4 * f) + 0.5f), dVar);
                                dVar.d.e.d(dVar.n());
                                dVar.e.e.d(dVar.k());
                                dVar.a = true;
                            } else if (i22 == 1) {
                                f(i19, 0, i5, 0, dVar);
                                dVar.e.e.m = dVar.k();
                            } else {
                                i13 = i5;
                                i14 = i19;
                                if (i22 == 2) {
                                    i15 = iArr[1];
                                    if (i15 != i7) {
                                    }
                                    f(i14, dVar.n(), i7, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                } else {
                                    i9 = i14;
                                    if (cVarArr[2].f != null) {
                                    }
                                    f(i13, 0, i6, 0, dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                }
                            }
                            i11 = 1;
                            i12 = 3;
                            if (i9 == i12) {
                                if (i21 != i11) {
                                    f(i10, 0, i10, 0, dVar);
                                    dVar.d.e.m = dVar.n();
                                    dVar.e.e.m = dVar.k();
                                } else {
                                    f(i10, 0, i10, 0, dVar);
                                    dVar.d.e.m = dVar.n();
                                    dVar.e.e.m = dVar.k();
                                }
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                    iN = dVar.n();
                    if (i19 == 4) {
                        iN = (eVar.n() - cVar4.g) - cVar3.g;
                        i19 = i2;
                    }
                    iK = dVar.k();
                    if (i20 == 4) {
                        i3 = i2;
                        iK2 = (eVar.k() - cVar2.g) - cVar.g;
                    } else {
                        i3 = i20;
                        iK2 = iK;
                    }
                    f(i19, iN, i3, iK2, dVar);
                    dVar.d.e.d(dVar.n());
                    dVar.e.e.d(dVar.k());
                    dVar.a = true;
                } else {
                    i4 = 2;
                    if (i19 == 2) {
                        if (i20 == 4) {
                            i2 = 1;
                        } else if (i20 != 1) {
                            i4 = 2;
                            if (i20 == 2) {
                                i2 = 1;
                            } else {
                                if (i19 != 3) {
                                    if (i20 == i4) {
                                    }
                                    if (i21 == 3) {
                                        if (i20 == i4) {
                                            f(i4, 0, i4, 0, dVar);
                                        }
                                        int iK4 = dVar.k();
                                        f(1, (int) ((iK4 * dVar.V) + 0.5f), 1, iK4, dVar);
                                        dVar.d.e.d(dVar.n());
                                        dVar.e.e.d(dVar.k());
                                        dVar.a = true;
                                    } else {
                                        i5 = i4;
                                        if (i21 == 1) {
                                            f(i5, 0, i20, 0, dVar);
                                            dVar.d.e.m = dVar.n();
                                        } else if (i21 == 2) {
                                            i16 = iArr[c];
                                            if (i16 != 1) {
                                            }
                                            f(1, (int) ((f2 * eVar.n()) + 0.5f), i20, dVar.k(), dVar);
                                            dVar.d.e.d(dVar.n());
                                            dVar.e.e.d(dVar.k());
                                            dVar.a = true;
                                        } else {
                                            i6 = i20;
                                            i7 = 1;
                                            if (cVarArr[c].f != null) {
                                            }
                                            f(i5, 0, i6, 0, dVar);
                                            dVar.d.e.d(dVar.n());
                                            dVar.e.e.d(dVar.k());
                                            dVar.a = true;
                                        }
                                    }
                                } else {
                                    i5 = i4;
                                    i6 = i20;
                                    i7 = 1;
                                }
                                i8 = 3;
                                if (i6 != i8) {
                                    i9 = i19;
                                    i10 = i5;
                                } else if (i19 == i5) {
                                    if (i22 == i8) {
                                        if (i19 == i5) {
                                            f(i5, 0, i5, 0, dVar);
                                        }
                                        int iN5 = dVar.n();
                                        f = dVar.V;
                                        if (dVar.W == -1) {
                                            f = 1.0f / f;
                                        }
                                        f(i7, iN5, i7, (int) ((iN5 * f) + 0.5f), dVar);
                                        dVar.d.e.d(dVar.n());
                                        dVar.e.e.d(dVar.k());
                                        dVar.a = true;
                                    } else if (i22 == 1) {
                                        f(i19, 0, i5, 0, dVar);
                                        dVar.e.e.m = dVar.k();
                                    } else {
                                        i13 = i5;
                                        i14 = i19;
                                        if (i22 == 2) {
                                            i15 = iArr[1];
                                            if (i15 != i7) {
                                            }
                                            f(i14, dVar.n(), i7, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                            dVar.d.e.d(dVar.n());
                                            dVar.e.e.d(dVar.k());
                                            dVar.a = true;
                                        } else {
                                            i9 = i14;
                                            if (cVarArr[2].f != null) {
                                            }
                                            f(i13, 0, i6, 0, dVar);
                                            dVar.d.e.d(dVar.n());
                                            dVar.e.e.d(dVar.k());
                                            dVar.a = true;
                                        }
                                    }
                                } else if (i22 == i8) {
                                    if (i19 == i5) {
                                        f(i5, 0, i5, 0, dVar);
                                    }
                                    int iN6 = dVar.n();
                                    f = dVar.V;
                                    if (dVar.W == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(i7, iN6, i7, (int) ((iN6 * f) + 0.5f), dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                } else if (i22 == 1) {
                                    f(i19, 0, i5, 0, dVar);
                                    dVar.e.e.m = dVar.k();
                                } else {
                                    i13 = i5;
                                    i14 = i19;
                                    if (i22 == 2) {
                                        i15 = iArr[1];
                                        if (i15 != i7) {
                                        }
                                        f(i14, dVar.n(), i7, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                        dVar.d.e.d(dVar.n());
                                        dVar.e.e.d(dVar.k());
                                        dVar.a = true;
                                    } else {
                                        i9 = i14;
                                        if (cVarArr[2].f != null) {
                                        }
                                        f(i13, 0, i6, 0, dVar);
                                        dVar.d.e.d(dVar.n());
                                        dVar.e.e.d(dVar.k());
                                        dVar.a = true;
                                    }
                                }
                                i11 = 1;
                                i12 = 3;
                                if (i9 == i12) {
                                    if (i21 != i11) {
                                        f(i10, 0, i10, 0, dVar);
                                        dVar.d.e.m = dVar.n();
                                        dVar.e.e.m = dVar.k();
                                    } else {
                                        f(i10, 0, i10, 0, dVar);
                                        dVar.d.e.m = dVar.n();
                                        dVar.e.e.m = dVar.k();
                                    }
                                }
                            }
                        } else {
                            i2 = 1;
                        }
                        iN = dVar.n();
                        if (i19 == 4) {
                            iN = (eVar.n() - cVar4.g) - cVar3.g;
                            i19 = i2;
                        }
                        iK = dVar.k();
                        if (i20 == 4) {
                            i3 = i2;
                            iK2 = (eVar.k() - cVar2.g) - cVar.g;
                        } else {
                            i3 = i20;
                            iK2 = iK;
                        }
                        f(i19, iN, i3, iK2, dVar);
                        dVar.d.e.d(dVar.n());
                        dVar.e.e.d(dVar.k());
                        dVar.a = true;
                    } else {
                        if (i19 != 3) {
                            if (i20 == i4) {
                            }
                            if (i21 == 3) {
                                if (i20 == i4) {
                                    f(i4, 0, i4, 0, dVar);
                                }
                                int iK5 = dVar.k();
                                f(1, (int) ((iK5 * dVar.V) + 0.5f), 1, iK5, dVar);
                                dVar.d.e.d(dVar.n());
                                dVar.e.e.d(dVar.k());
                                dVar.a = true;
                            } else {
                                i5 = i4;
                                if (i21 == 1) {
                                    f(i5, 0, i20, 0, dVar);
                                    dVar.d.e.m = dVar.n();
                                } else if (i21 == 2) {
                                    i16 = iArr[c];
                                    if (i16 != 1) {
                                    }
                                    f(1, (int) ((f2 * eVar.n()) + 0.5f), i20, dVar.k(), dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                } else {
                                    i6 = i20;
                                    i7 = 1;
                                    if (cVarArr[c].f != null) {
                                    }
                                    f(i5, 0, i6, 0, dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                }
                            }
                        } else {
                            i5 = i4;
                            i6 = i20;
                            i7 = 1;
                        }
                        i8 = 3;
                        if (i6 != i8) {
                            i9 = i19;
                            i10 = i5;
                        } else if (i19 == i5) {
                            if (i22 == i8) {
                                if (i19 == i5) {
                                    f(i5, 0, i5, 0, dVar);
                                }
                                int iN7 = dVar.n();
                                f = dVar.V;
                                if (dVar.W == -1) {
                                    f = 1.0f / f;
                                }
                                f(i7, iN7, i7, (int) ((iN7 * f) + 0.5f), dVar);
                                dVar.d.e.d(dVar.n());
                                dVar.e.e.d(dVar.k());
                                dVar.a = true;
                            } else if (i22 == 1) {
                                f(i19, 0, i5, 0, dVar);
                                dVar.e.e.m = dVar.k();
                            } else {
                                i13 = i5;
                                i14 = i19;
                                if (i22 == 2) {
                                    i15 = iArr[1];
                                    if (i15 != i7) {
                                    }
                                    f(i14, dVar.n(), i7, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                } else {
                                    i9 = i14;
                                    if (cVarArr[2].f != null) {
                                    }
                                    f(i13, 0, i6, 0, dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                }
                            }
                        } else if (i22 == i8) {
                            if (i19 == i5) {
                                f(i5, 0, i5, 0, dVar);
                            }
                            int iN8 = dVar.n();
                            f = dVar.V;
                            if (dVar.W == -1) {
                                f = 1.0f / f;
                            }
                            f(i7, iN8, i7, (int) ((iN8 * f) + 0.5f), dVar);
                            dVar.d.e.d(dVar.n());
                            dVar.e.e.d(dVar.k());
                            dVar.a = true;
                        } else if (i22 == 1) {
                            f(i19, 0, i5, 0, dVar);
                            dVar.e.e.m = dVar.k();
                        } else {
                            i13 = i5;
                            i14 = i19;
                            if (i22 == 2) {
                                i15 = iArr[1];
                                if (i15 != i7) {
                                }
                                f(i14, dVar.n(), i7, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                dVar.d.e.d(dVar.n());
                                dVar.e.e.d(dVar.k());
                                dVar.a = true;
                            } else {
                                i9 = i14;
                                if (cVarArr[2].f != null) {
                                }
                                f(i13, 0, i6, 0, dVar);
                                dVar.d.e.d(dVar.n());
                                dVar.e.e.d(dVar.k());
                                dVar.a = true;
                            }
                        }
                        i11 = 1;
                        i12 = 3;
                        if (i9 == i12) {
                            if (i21 != i11) {
                                f(i10, 0, i10, 0, dVar);
                                dVar.d.e.m = dVar.n();
                                dVar.e.e.m = dVar.k();
                            } else {
                                f(i10, 0, i10, 0, dVar);
                                dVar.d.e.m = dVar.n();
                                dVar.e.e.m = dVar.k();
                            }
                        }
                    }
                }
                arrayList = arrayList2;
            }
        }
    }

    public final void c() {
        com.gamericefishpro.space.k3.e eVar = this.a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        com.gamericefishpro.space.k3.e eVar2 = this.d;
        eVar2.d.f();
        eVar2.e.f();
        arrayList2.add(eVar2.d);
        arrayList2.add(eVar2.e);
        ArrayList arrayList3 = eVar2.p0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            com.gamericefishpro.space.k3.d dVar = (com.gamericefishpro.space.k3.d) obj;
            if (dVar instanceof com.gamericefishpro.space.k3.h) {
                i iVar = new i(dVar);
                dVar.d.f();
                dVar.e.f();
                iVar.f = ((com.gamericefishpro.space.k3.h) dVar).t0;
                arrayList2.add(iVar);
            } else {
                if (dVar.u()) {
                    if (dVar.b == null) {
                        dVar.b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.b);
                } else {
                    arrayList2.add(dVar.d);
                }
                if (dVar.v()) {
                    if (dVar.c == null) {
                        dVar.c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.c);
                } else {
                    arrayList2.add(dVar.e);
                }
                if (dVar instanceof com.gamericefishpro.space.k3.i) {
                    arrayList2.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            o oVar = (o) obj3;
            if (oVar.b != eVar2) {
                oVar.d();
            }
        }
        arrayList.clear();
        e(eVar.d, 0, arrayList);
        e(eVar.e, 1, arrayList);
        this.b = false;
    }

    public final int d(com.gamericefishpro.space.k3.e eVar, int i) {
        ArrayList arrayList;
        int i2;
        long j;
        float f;
        long j2;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            o oVar = ((l) arrayList2.get(i3)).a;
            if (!(oVar instanceof c) ? !(i != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f != i) {
                f fVar = (i == 0 ? eVar.d : eVar.e).h;
                f fVar2 = (i == 0 ? eVar.d : eVar.e).i;
                f fVar3 = oVar.h;
                f fVar4 = oVar.i;
                boolean zContains = fVar3.l.contains(fVar);
                boolean zContains2 = fVar4.l.contains(fVar2);
                long j4 = oVar.j();
                if (zContains && zContains2) {
                    long jB = l.b(fVar3, j3);
                    long jA = l.a(fVar4, j3);
                    long j5 = jB - j4;
                    int i4 = fVar4.f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j5 >= (-i4)) {
                        j5 += (long) i4;
                    }
                    long j6 = fVar3.f;
                    long j7 = ((-jA) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    com.gamericefishpro.space.k3.d dVar = oVar.b;
                    if (i == 0) {
                        f = dVar.c0;
                    } else if (i == 1) {
                        f = dVar.d0;
                    } else {
                        dVar.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j5 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) fVar3.f) + ((((long) ((f2 * f) + 0.5f)) + j4) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) fVar4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    if (zContains) {
                        j = Math.max(l.b(fVar3, fVar3.f), ((long) fVar3.f) + j4);
                    } else if (zContains2) {
                        j = Math.max(-l.a(fVar4, fVar4.f), ((long) (-fVar4.f)) + j4);
                    } else {
                        j = (oVar.j() + ((long) fVar3.f)) - ((long) fVar4.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                j = j3;
            }
            jMax = Math.max(jMax, j);
            i3++;
            arrayList2 = arrayList;
            size = i2;
            j3 = 0;
        }
        return (int) jMax;
    }

    public final void e(o oVar, int i, ArrayList arrayList) {
        f fVar = oVar.h;
        f fVar2 = oVar.i;
        ArrayList arrayList2 = fVar.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((m) oVar).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, com.gamericefishpro.space.k3.d dVar) {
        b bVar = this.g;
        bVar.a = i;
        bVar.b = i3;
        bVar.c = i2;
        bVar.d = i4;
        this.f.b(dVar, bVar);
        dVar.J(bVar.e);
        dVar.G(bVar.f);
        dVar.D = bVar.h;
        dVar.D(bVar.g);
    }

    public final void g() {
        a aVar;
        e eVar = this;
        ArrayList arrayList = eVar.a.p0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            com.gamericefishpro.space.k3.d dVar = (com.gamericefishpro.space.k3.d) arrayList.get(i);
            if (!dVar.a) {
                int[] iArr = dVar.o0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = dVar.q;
                int i6 = dVar.r;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                g gVar = dVar.d.e;
                boolean z3 = gVar.j;
                g gVar2 = dVar.e.e;
                boolean z4 = gVar2.j;
                boolean z5 = z;
                if (z3 && z4) {
                    eVar.f(1, gVar.g, 1, gVar2.g, dVar);
                    dVar.a = true;
                } else if (z3 && z2) {
                    f(1, gVar.g, 2, gVar2.g, dVar);
                    if (i4 == 3) {
                        dVar.e.e.m = dVar.k();
                    } else {
                        dVar.e.e.d(dVar.k());
                        dVar.a = true;
                    }
                } else if (z4 && z5) {
                    f(2, gVar.g, 1, gVar2.g, dVar);
                    if (i3 == 3) {
                        dVar.d.e.m = dVar.n();
                    } else {
                        dVar.d.e.d(dVar.n());
                        dVar.a = true;
                    }
                }
                if (dVar.a && (aVar = dVar.e.l) != null) {
                    aVar.d(dVar.Z);
                }
                eVar = this;
            }
            i = i2;
        }
    }
}
