package defpackage;

import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.u;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes10.dex */
public final class wr10 implements xe10, we10 {
    public yzz0 A;
    public xe10[] B;
    public fsd C;
    public final xe10[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final z8h w;
    public final ArrayList x = new ArrayList();
    public final HashMap y = new HashMap();
    public we10 z;

    public wr10(z8h z8hVar, long[] jArr, xe10... xe10VarArr) {
        this.w = z8hVar;
        this.a = xe10VarArr;
        z8hVar.getClass();
        this.C = new fsd(ImmutableList.p(), ImmutableList.p());
        this.c = new IdentityHashMap();
        this.B = new xe10[0];
        this.b = new boolean[xe10VarArr.length];
        for (int i = 0; i < xe10VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new p6z0(xe10VarArr[i], j);
            }
        }
    }

    @Override // defpackage.xe10
    public final long c(long j, g7q0 g7q0Var) {
        xe10[] xe10VarArr = this.B;
        return (xe10VarArr.length > 0 ? xe10VarArr[0] : this.a[0]).c(j, g7q0Var);
    }

    @Override // defpackage.xe10
    public final long e(long j) {
        long e = this.B[0].e(j);
        int i = 1;
        while (true) {
            xe10[] xe10VarArr = this.B;
            if (i >= xe10VarArr.length) {
                return e;
            }
            if (xe10VarArr[i].e(e) != e) {
                ny61.r("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // defpackage.xe10
    public final long f() {
        long j;
        xe10 xe10Var;
        xe10[] xe10VarArr = this.B;
        int length = xe10VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            xe10 xe10Var2 = xe10VarArr[i];
            long f = xe10Var2.f();
            if (f == j2) {
                j = j2;
                if (j3 != j && xe10Var2.e(j3) != j3) {
                    ny61.r("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                xe10[] xe10VarArr2 = this.B;
                int length2 = xe10VarArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (xe10Var = xe10VarArr2[i2]) == xe10Var2) {
                        break;
                    }
                    if (xe10Var.e(f) != f) {
                        ny61.r("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = f;
            } else {
                j = j2;
                if (f != j3) {
                    ny61.r("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // defpackage.urq0
    public final long g() {
        return this.C.g();
    }

    @Override // defpackage.xe10
    public final yzz0 getTrackGroups() {
        yzz0 yzz0Var = this.A;
        yzz0Var.getClass();
        return yzz0Var;
    }

    @Override // defpackage.urq0
    public final void h(long j) {
        this.C.h(j);
    }

    @Override // defpackage.urq0
    public final long i() {
        return this.C.i();
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        return this.C.isLoading();
    }

    @Override // defpackage.xe10
    public final void j() {
        for (xe10 xe10Var : this.a) {
            xe10Var.j();
        }
    }

    @Override // defpackage.xe10
    public final long k(loo[] looVarArr, boolean[] zArr, xyl0[] xyl0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[looVarArr.length];
        int[] iArr3 = new int[looVarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = looVarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            xyl0 xyl0Var = xyl0VarArr[i2];
            Integer num = xyl0Var == null ? null : (Integer) identityHashMap.get(xyl0Var);
            iArr2[i2] = num == null ? -1 : num.intValue();
            loo looVar = looVarArr[i2];
            if (looVar != null) {
                String str = looVar.getTrackGroup().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = looVarArr.length;
        xyl0[] xyl0VarArr2 = new xyl0[length2];
        xyl0[] xyl0VarArr3 = new xyl0[looVarArr.length];
        loo[] looVarArr2 = new loo[looVarArr.length];
        xe10[] xe10VarArr = this.a;
        ArrayList arrayList = new ArrayList(xe10VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < xe10VarArr.length) {
            int i4 = i;
            while (i4 < looVarArr.length) {
                xyl0VarArr3[i4] = iArr2[i4] == i3 ? xyl0VarArr[i4] : null;
                if (iArr3[i4] == i3) {
                    loo looVar2 = looVarArr[i4];
                    looVar2.getClass();
                    iArr = iArr2;
                    xzz0 xzz0Var = (xzz0) this.y.get(looVar2.getTrackGroup());
                    xzz0Var.getClass();
                    looVarArr2[i4] = new vr10(looVar2, xzz0Var);
                } else {
                    iArr = iArr2;
                    looVarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            xe10[] xe10VarArr2 = xe10VarArr;
            int i5 = i3;
            long k = xe10VarArr2[i3].k(looVarArr2, zArr, xyl0VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = k;
            } else if (k != j2) {
                ny61.r("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < looVarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    xyl0 xyl0Var2 = xyl0VarArr3[i6];
                    xyl0Var2.getClass();
                    xyl0VarArr2[i6] = xyl0VarArr3[i6];
                    identityHashMap.put(xyl0Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    d6z.x(xyl0VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(xe10VarArr2[i5]);
            }
            i3 = i5 + 1;
            xe10VarArr = xe10VarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(xyl0VarArr2, i7, xyl0VarArr, i7, length2);
        this.B = (xe10[]) arrayList.toArray(new xe10[i7]);
        AbstractList b = u.b(arrayList, new ak00(8));
        this.w.getClass();
        this.C = new fsd(arrayList, b);
        return j2;
    }

    @Override // defpackage.xe10
    public final void l(we10 we10Var, long j) {
        this.z = we10Var;
        ArrayList arrayList = this.x;
        xe10[] xe10VarArr = this.a;
        Collections.addAll(arrayList, xe10VarArr);
        for (xe10 xe10Var : xe10VarArr) {
            xe10Var.l(this, j);
        }
    }

    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        ArrayList arrayList = this.x;
        if (arrayList.isEmpty()) {
            return this.C.n(xzyVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((xe10) arrayList.get(i)).n(xzyVar);
        }
        return false;
    }

    @Override // defpackage.trq0
    public final void onContinueLoadingRequested(urq0 urq0Var) {
        we10 we10Var = this.z;
        we10Var.getClass();
        we10Var.onContinueLoadingRequested(this);
    }

    @Override // defpackage.we10
    public final void onPrepared(xe10 xe10Var) {
        ArrayList arrayList = this.x;
        arrayList.remove(xe10Var);
        if (arrayList.isEmpty()) {
            xe10[] xe10VarArr = this.a;
            int i = 0;
            for (xe10 xe10Var2 : xe10VarArr) {
                i += xe10Var2.getTrackGroups().a;
            }
            xzz0[] xzz0VarArr = new xzz0[i];
            int i2 = 0;
            for (int i3 = 0; i3 < xe10VarArr.length; i3++) {
                yzz0 trackGroups = xe10VarArr[i3].getTrackGroups();
                int i4 = trackGroups.a;
                int i5 = 0;
                while (i5 < i4) {
                    xzz0 a = trackGroups.a(i5);
                    a[] aVarArr = new a[a.a];
                    for (int i6 = 0; i6 < a.a; i6++) {
                        a aVar = a.d[i6];
                        f7s a2 = aVar.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = aVar.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        a2.a = sb.toString();
                        aVarArr[i6] = new a(a2);
                    }
                    xzz0 xzz0Var = new xzz0(i3 + ":" + a.b, aVarArr);
                    this.y.put(xzz0Var, a);
                    xzz0VarArr[i2] = xzz0Var;
                    i5++;
                    i2++;
                }
            }
            this.A = new yzz0(xzz0VarArr);
            we10 we10Var = this.z;
            we10Var.getClass();
            we10Var.onPrepared(this);
        }
    }

    @Override // defpackage.xe10
    public final void s(long j, boolean z) {
        for (xe10 xe10Var : this.B) {
            xe10Var.s(j, z);
        }
    }
}
