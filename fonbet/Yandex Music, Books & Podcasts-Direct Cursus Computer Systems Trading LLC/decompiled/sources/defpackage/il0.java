package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class il0 implements kfh {
    public final bm0 a;
    public boolean b;

    public il0(bm0 bm0Var) {
        this.a = bm0Var;
    }

    @Override // defpackage.kfh
    public final int a(fxe fxeVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int J = ((ffh) list.get(0)).J(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int J2 = ((ffh) list.get(i2)).J(i);
                if (J2 > J) {
                    J = J2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return J;
    }

    @Override // defpackage.kfh
    public final lfh b(mfh mfhVar, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ksk M = ((ffh) list.get(i3)).M(j);
            i = Math.max(i, M.a);
            i2 = Math.max(i2, M.b);
            arrayList.add(M);
        }
        boolean F = mfhVar.F();
        bm0 bm0Var = this.a;
        if (F) {
            this.b = true;
            bm0Var.b.setValue(new hqe((4294967295L & i2) | (i << 32)));
        } else if (!this.b) {
            bm0Var.b.setValue(new hqe((4294967295L & i2) | (i << 32)));
        }
        return mfh.m0(mfhVar, i, i2, new vv(arrayList, 4));
    }

    @Override // defpackage.kfh
    public final int c(fxe fxeVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int G = ((ffh) list.get(0)).G(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int G2 = ((ffh) list.get(i2)).G(i);
                if (G2 > G) {
                    G = G2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return G;
    }

    @Override // defpackage.kfh
    public final int d(fxe fxeVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int a = ((ffh) list.get(0)).a(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int a2 = ((ffh) list.get(i2)).a(i);
                if (a2 > a) {
                    a = a2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return a;
    }

    @Override // defpackage.kfh
    public final int e(fxe fxeVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int z = ((ffh) list.get(0)).z(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int z2 = ((ffh) list.get(i2)).z(i);
                if (z2 > z) {
                    z = z2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return z;
    }
}
