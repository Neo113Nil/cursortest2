package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.x;
import com.google.common.collect.y;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class q80 implements koo {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.koo
    public final loo[] createTrackSelections(joo[] jooVarArr, ip4 ip4Var, sf10 sf10Var, a9z0 a9z0Var) {
        long j;
        int i;
        long j2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (joo jooVar : jooVarArr) {
            if (jooVar == null || jooVar.b.length <= 1) {
                arrayList.add(null);
            } else {
                piv pivVar = ImmutableList.b;
                ImmutableList.a aVar = new ImmutableList.a();
                aVar.a(new p80(0L, 0L));
                arrayList.add(aVar);
            }
        }
        int length = jooVarArr.length;
        long[][] jArr = new long[length][];
        int i3 = 0;
        while (true) {
            j = -1;
            if (i3 >= jooVarArr.length) {
                break;
            }
            joo jooVar2 = jooVarArr[i3];
            if (jooVar2 == null) {
                jArr[i3] = new long[0];
            } else {
                int[] iArr = jooVar2.b;
                jArr[i3] = new long[iArr.length];
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    long j3 = jooVar2.a.d[iArr[i4]].j;
                    long[] jArr2 = jArr[i3];
                    if (j3 == -1) {
                        j3 = 0;
                    }
                    jArr2[i4] = j3;
                }
                Arrays.sort(jArr[i3]);
            }
            i3++;
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i5 = 0; i5 < length; i5++) {
            long[] jArr4 = jArr[i5];
            jArr3[i5] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        r80.a(jArr3, arrayList);
        x xVar = new x();
        y5e.i(2, "expectedValuesPerKey");
        zsy a = new y(xVar).a();
        int i6 = 0;
        while (i6 < length) {
            long[] jArr5 = jArr[i6];
            if (jArr5.length <= 1) {
                i = i2;
                j2 = j;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i7 = i2;
                while (true) {
                    long[] jArr6 = jArr[i6];
                    i = i2;
                    double d = 0.0d;
                    if (i7 >= jArr6.length) {
                        break;
                    }
                    long j4 = j;
                    long j5 = jArr6[i7];
                    if (j5 != j4) {
                        d = Math.log(j5);
                    }
                    dArr[i7] = d;
                    i7++;
                    i2 = i;
                    j = j4;
                }
                j2 = j;
                int i8 = length2 - 1;
                double d2 = dArr[i8] - dArr[i];
                int i9 = i;
                while (i9 < i8) {
                    double d3 = dArr[i9];
                    i9++;
                    a.put(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i9]) * 0.5d) - dArr[i]) / d2), Integer.valueOf(i6));
                }
            }
            i6++;
            i2 = i;
            j = j2;
        }
        int i10 = i2;
        ImmutableList l = ImmutableList.l(a.values());
        for (int i11 = i10; i11 < l.size(); i11++) {
            int intValue = ((Integer) l.get(i11)).intValue();
            int i12 = iArr2[intValue] + 1;
            iArr2[intValue] = i12;
            jArr3[intValue] = jArr[intValue][i12];
            r80.a(jArr3, arrayList);
        }
        for (int i13 = i10; i13 < jooVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr3[i13] = jArr3[i13] * 2;
            }
        }
        r80.a(jArr3, arrayList);
        ImmutableList.a aVar2 = new ImmutableList.a();
        for (int i14 = i10; i14 < arrayList.size(); i14++) {
            ImmutableList.a aVar3 = (ImmutableList.a) arrayList.get(i14);
            aVar2.a(aVar3 == null ? ImmutableList.p() : aVar3.g());
        }
        ImmutableList g = aVar2.g();
        loo[] looVarArr = new loo[jooVarArr.length];
        for (int i15 = i10; i15 < jooVarArr.length; i15++) {
            joo jooVar3 = jooVarArr[i15];
            if (jooVar3 != null) {
                int[] iArr3 = jooVar3.b;
                if (iArr3.length != 0) {
                    int length3 = iArr3.length;
                    xzz0 xzz0Var = jooVar3.a;
                    looVarArr[i15] = length3 == 1 ? new d7m(xzz0Var, iArr3[i10]) : new r80(xzz0Var, iArr3, ip4Var, 10000L, 25000L, 25000L, (ImmutableList) g.get(i15));
                }
            }
        }
        return looVarArr;
    }
}
