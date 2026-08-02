package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* loaded from: classes7.dex */
public final class zu81 extends ao81 {
    public static final /* synthetic */ int k0 = 0;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final boolean Z;
    public final boolean a0;
    public final boolean b0;
    public final boolean c0;
    public final boolean d0;
    public final boolean e0;
    public final boolean f0;
    public final boolean g0;
    public final boolean h0;
    public final SparseArray i0;
    public final SparseBooleanArray j0;

    static {
        new zu81(new hs81());
    }

    public zu81(hs81 hs81Var) {
        super(hs81Var);
        this.T = hs81Var.w;
        this.U = hs81Var.x;
        this.V = hs81Var.y;
        this.W = hs81Var.z;
        this.Z = hs81Var.A;
        this.a0 = hs81Var.B;
        this.b0 = hs81Var.C;
        this.c0 = hs81Var.D;
        this.d0 = hs81Var.E;
        this.e0 = hs81Var.F;
        this.f0 = hs81Var.G;
        this.g0 = hs81Var.H;
        this.h0 = hs81Var.I;
        this.i0 = hs81Var.J;
        this.j0 = hs81Var.K;
    }

    @Override // defpackage.ao81
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zu81.class == obj.getClass()) {
            zu81 zu81Var = (zu81) obj;
            if (super.equals(zu81Var) && this.T == zu81Var.T && this.U == zu81Var.U && this.V == zu81Var.V && this.W == zu81Var.W && this.Z == zu81Var.Z && this.a0 == zu81Var.a0 && this.b0 == zu81Var.b0 && this.c0 == zu81Var.c0 && this.d0 == zu81Var.d0 && this.e0 == zu81Var.e0 && this.f0 == zu81Var.f0 && this.g0 == zu81Var.g0 && this.h0 == zu81Var.h0) {
                SparseBooleanArray sparseBooleanArray = zu81Var.j0;
                SparseBooleanArray sparseBooleanArray2 = this.j0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = zu81Var.i0;
                            SparseArray sparseArray2 = this.i0;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i2);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                wx71 wx71Var = (wx71) entry.getKey();
                                                if (map2.containsKey(wx71Var) && rf71.o(entry.getValue(), map2.get(wx71Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ao81
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0)) * 31) + (this.W ? 1 : 0)) * 31) + (this.Z ? 1 : 0)) * 31) + (this.a0 ? 1 : 0)) * 31) + (this.b0 ? 1 : 0)) * 31) + (this.c0 ? 1 : 0)) * 31) + (this.d0 ? 1 : 0)) * 31) + (this.e0 ? 1 : 0)) * 31) + (this.f0 ? 1 : 0)) * 31) + (this.g0 ? 1 : 0)) * 31) + (this.h0 ? 1 : 0);
    }
}
