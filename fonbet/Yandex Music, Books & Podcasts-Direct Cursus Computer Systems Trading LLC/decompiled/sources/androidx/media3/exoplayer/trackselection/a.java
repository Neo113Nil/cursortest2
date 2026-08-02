package androidx.media3.exoplayer.trackselection;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.yandex.pulse.metrics.c;
import defpackage.dvt;
import defpackage.rj7;
import defpackage.sk3;
import defpackage.us7;
import defpackage.v0t;
import defpackage.vs7;
import defpackage.w0t;
import defpackage.yvs;
import defpackage.zc4;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends w0t {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final String R0;
    public static final a y0 = new a(new us7());
    public static final String z0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final SparseArray w0;
    public final SparseBooleanArray x0;

    static {
        int i = dvt.a;
        z0 = Integer.toString(1000, 36);
        A0 = Integer.toString(c.FINITE_SUM_FIELD_NUMBER, 36);
        B0 = Integer.toString(1002, 36);
        C0 = Integer.toString(1003, 36);
        D0 = Integer.toString(1004, 36);
        E0 = Integer.toString(1005, 36);
        F0 = Integer.toString(1006, 36);
        G0 = Integer.toString(1007, 36);
        H0 = Integer.toString(1008, 36);
        I0 = Integer.toString(1009, 36);
        J0 = Integer.toString(1010, 36);
        K0 = Integer.toString(1011, 36);
        L0 = Integer.toString(1012, 36);
        M0 = Integer.toString(1013, 36);
        N0 = Integer.toString(1014, 36);
        O0 = Integer.toString(1015, 36);
        P0 = Integer.toString(1016, 36);
        Q0 = Integer.toString(1017, 36);
        R0 = Integer.toString(1018, 36);
    }

    public a(us7 us7Var) {
        super(us7Var);
        this.p0 = us7Var.F;
        this.q0 = us7Var.G;
        this.r0 = us7Var.H;
        this.s0 = us7Var.I;
        this.t0 = us7Var.J;
        this.u0 = us7Var.K;
        this.v0 = us7Var.L;
        this.w0 = us7Var.M;
        this.x0 = us7Var.N;
    }

    @Override // defpackage.w0t
    public final v0t a() {
        return new us7(this);
    }

    @Override // defpackage.w0t
    public final Bundle c() {
        Bundle c = super.c();
        c.putBoolean(z0, this.p0);
        c.putBoolean(A0, false);
        c.putBoolean(B0, this.q0);
        c.putBoolean(N0, false);
        c.putBoolean(C0, this.r0);
        c.putBoolean(D0, false);
        c.putBoolean(E0, false);
        c.putBoolean(F0, false);
        c.putBoolean(O0, false);
        c.putBoolean(R0, this.s0);
        c.putBoolean(P0, this.t0);
        c.putBoolean(G0, this.u0);
        c.putBoolean(H0, false);
        c.putBoolean(I0, this.v0);
        c.putBoolean(Q0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.w0;
            if (i >= sparseArray2.size()) {
                break;
            }
            int keyAt = sparseArray2.keyAt(i);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                vs7 vs7Var = (vs7) entry.getValue();
                if (vs7Var != null) {
                    sparseArray.put(arrayList2.size(), vs7Var);
                }
                arrayList2.add((yvs) entry.getKey());
                arrayList.add(Integer.valueOf(keyAt));
            }
            c.putIntArray(J0, zc4.Y(arrayList));
            c.putParcelableArrayList(K0, sk3.X(arrayList2, new rj7(9)));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int keyAt2 = sparseArray.keyAt(i2);
                vs7 vs7Var2 = (vs7) sparseArray.valueAt(i2);
                vs7Var2.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt(vs7.c, vs7Var2.a);
                bundle.putIntArray(vs7.d, vs7Var2.b);
                bundle.putInt(vs7.e, 0);
                sparseArray3.put(keyAt2, bundle);
            }
            c.putSparseParcelableArray(L0, sparseArray3);
            i++;
        }
        SparseBooleanArray sparseBooleanArray = this.x0;
        int[] iArr = new int[sparseBooleanArray.size()];
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            iArr[i3] = sparseBooleanArray.keyAt(i3);
        }
        c.putIntArray(M0, iArr);
        return c;
    }

    @Override // defpackage.w0t
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (super.equals(aVar) && this.p0 == aVar.p0 && this.q0 == aVar.q0 && this.r0 == aVar.r0 && this.s0 == aVar.s0 && this.t0 == aVar.t0 && this.u0 == aVar.u0 && this.v0 == aVar.v0) {
                SparseBooleanArray sparseBooleanArray = aVar.x0;
                SparseBooleanArray sparseBooleanArray2 = this.x0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = aVar.w0;
                            SparseArray sparseArray2 = this.w0;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i2);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                yvs yvsVar = (yvs) entry.getKey();
                                                if (map2.containsKey(yvsVar) && Objects.equals(entry.getValue(), map2.get(yvsVar))) {
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

    @Override // defpackage.w0t
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.p0 ? 1 : 0)) * 961) + (this.q0 ? 1 : 0)) * 961) + (this.r0 ? 1 : 0)) * 28629151) + (this.s0 ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 31) + (this.u0 ? 1 : 0)) * 961) + (this.v0 ? 1 : 0)) * 31;
    }
}
