package u;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements v1.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final m f6602a;

    public h(m mVar) {
        this.f6602a = mVar;
    }

    @Override // v1.e0
    public final v1.f0 a(x1.o0 o0Var, List list, long j3) {
        v1.j0 j0Var;
        v1.j0 j0Var2;
        int i10;
        int i11;
        int i12;
        int size = list.size();
        v1.j0[] j0VarArr = new v1.j0[size];
        int size2 = list.size();
        long j6 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            j0Var = null;
            if (i14 >= size2) {
                break;
            }
            v1.d0 d0Var = (v1.d0) list.get(i14);
            Object g8 = d0Var.g();
            j jVar = g8 instanceof j ? (j) g8 : null;
            if (jVar != null && ((Boolean) jVar.f6608a.getValue()).booleanValue()) {
                v1.j0 e10 = d0Var.e(j3);
                long e11 = i7.b.e(e10.f7085g, e10.f7086h);
                j0VarArr[i14] = e10;
                j6 = e11;
            }
            i14++;
        }
        int size3 = list.size();
        for (int i15 = 0; i15 < size3; i15++) {
            v1.d0 d0Var2 = (v1.d0) list.get(i15);
            if (j0VarArr[i15] == null) {
                j0VarArr[i15] = d0Var2.e(j3);
            }
        }
        if (o0Var.t()) {
            i11 = (int) (j6 >> 32);
        } else {
            if (size == 0) {
                j0Var2 = null;
            } else {
                j0Var2 = j0VarArr[0];
                int i16 = size - 1;
                if (i16 != 0) {
                    int i17 = j0Var2 != null ? j0Var2.f7085g : 0;
                    int i18 = new uc.d(1, i16, 1).f6736h;
                    boolean z10 = 1 <= i18;
                    int i19 = z10 ? 1 : i18;
                    while (z10) {
                        if (i19 != i18) {
                            i10 = i19 + 1;
                            z10 = z10;
                        } else {
                            if (!z10) {
                                throw new NoSuchElementException();
                            }
                            z10 = false;
                            i10 = i19;
                        }
                        v1.j0 j0Var3 = j0VarArr[i19];
                        int i20 = j0Var3 != null ? j0Var3.f7085g : 0;
                        if (i17 < i20) {
                            j0Var2 = j0Var3;
                            i19 = i10;
                            i17 = i20;
                        } else {
                            i19 = i10;
                        }
                    }
                }
            }
            i11 = j0Var2 != null ? j0Var2.f7085g : 0;
        }
        if (o0Var.t()) {
            i13 = (int) (4294967295L & j6);
        } else {
            if (size != 0) {
                j0Var = j0VarArr[0];
                int i21 = size - 1;
                if (i21 != 0) {
                    int i22 = j0Var != null ? j0Var.f7086h : 0;
                    int i23 = new uc.d(1, i21, 1).f6736h;
                    boolean z11 = 1 <= i23;
                    int i24 = z11 ? 1 : i23;
                    while (z11) {
                        if (i24 != i23) {
                            i12 = i24 + 1;
                            z11 = z11;
                        } else {
                            if (!z11) {
                                throw new NoSuchElementException();
                            }
                            z11 = false;
                            i12 = i24;
                        }
                        v1.j0 j0Var4 = j0VarArr[i24];
                        int i25 = j0Var4 != null ? j0Var4.f7086h : 0;
                        i24 = i12;
                        if (i22 < i25) {
                            j0Var = j0Var4;
                            i22 = i25;
                        }
                    }
                }
            }
            if (j0Var != null) {
                i13 = j0Var.f7086h;
            }
        }
        if (!o0Var.t()) {
            this.f6602a.f6618b.setValue(new s2.k(i7.b.e(i11, i13)));
        }
        return o0Var.H(i11, i13, bc.w.f1068g, new j0.y(j0VarArr, this, i11, i13));
    }
}
