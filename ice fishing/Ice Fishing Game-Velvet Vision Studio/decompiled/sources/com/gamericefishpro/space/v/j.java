package com.gamericefishpro.space.v;

import com.gamericefishpro.space.f2.u0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements com.gamericefishpro.space.f2.l0 {
    public final q a;

    public j(q qVar) {
        this.a = qVar;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final com.gamericefishpro.space.f2.m0 a(com.gamericefishpro.space.f2.n0 n0Var, List list, long j) {
        u0 u0Var;
        int i;
        u0 u0Var2;
        int i2;
        int i3;
        int size = list.size();
        u0[] u0VarArr = new u0[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            u0Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            com.gamericefishpro.space.f2.k0 k0Var = (com.gamericefishpro.space.f2.k0) list.get(i4);
            Object objI = k0Var.i();
            l lVar = objI instanceof l ? (l) objI : null;
            if (lVar != null && ((Boolean) lVar.a.getValue()).booleanValue()) {
                u0 u0VarE = k0Var.e(j);
                long j3 = (((long) u0VarE.e) & 4294967295L) | (((long) u0VarE.d) << 32);
                Unit unit = Unit.a;
                u0VarArr[i4] = u0VarE;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            com.gamericefishpro.space.f2.k0 k0Var2 = (com.gamericefishpro.space.f2.k0) list.get(i5);
            if (u0VarArr[i5] == null) {
                u0VarArr[i5] = k0Var2.e(j);
            }
        }
        if (n0Var.n()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size != 0) {
                u0Var2 = u0VarArr[0];
                Intrinsics.checkNotNullParameter(u0VarArr, "<this>");
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = u0Var2 != null ? u0Var2.d : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            u0 u0Var3 = u0VarArr[i8];
                            int i9 = u0Var3 != null ? u0Var3.d : 0;
                            if (i7 < i9) {
                                u0Var2 = u0Var3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            } else {
                u0Var2 = null;
            }
            i2 = u0Var2 != null ? u0Var2.d : 0;
        }
        if (n0Var.n()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                u0Var = u0VarArr[0];
                Intrinsics.checkNotNullParameter(u0VarArr, "<this>");
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = u0Var != null ? u0Var.e : 0;
                    if (1 <= i10) {
                        while (true) {
                            u0 u0Var4 = u0VarArr[i];
                            int i12 = u0Var4 != null ? u0Var4.e : 0;
                            if (i11 < i12) {
                                u0Var = u0Var4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = u0Var != null ? u0Var.e : 0;
        }
        if (!n0Var.n()) {
            this.a.c.setValue(new com.gamericefishpro.space.c3.k((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return n0Var.y(i2, i3, com.gamericefishpro.space.ph.m0.c(), new i(u0VarArr, this, i2, i3));
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int c(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((com.gamericefishpro.space.f2.k0) list.get(0)).R(i));
            int iE = com.gamericefishpro.space.ph.x.e(list);
            int i2 = 1;
            if (1 <= iE) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((com.gamericefishpro.space.f2.k0) list.get(i2)).R(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int d(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((com.gamericefishpro.space.f2.k0) list.get(0)).L(i));
            int iE = com.gamericefishpro.space.ph.x.e(list);
            int i2 = 1;
            if (1 <= iE) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((com.gamericefishpro.space.f2.k0) list.get(i2)).L(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int e(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((com.gamericefishpro.space.f2.k0) list.get(0)).U(i));
            int iE = com.gamericefishpro.space.ph.x.e(list);
            int i2 = 1;
            if (1 <= iE) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((com.gamericefishpro.space.f2.k0) list.get(i2)).U(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int i(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((com.gamericefishpro.space.f2.k0) list.get(0)).f(i));
            int iE = com.gamericefishpro.space.ph.x.e(list);
            int i2 = 1;
            if (1 <= iE) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((com.gamericefishpro.space.f2.k0) list.get(i2)).f(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
