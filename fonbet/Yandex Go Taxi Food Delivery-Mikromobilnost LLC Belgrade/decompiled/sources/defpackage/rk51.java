package defpackage;

import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.x;
import com.google.common.collect.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes10.dex */
public class rk51 implements koo {
    private final int minDurationForQualityIncreaseMs = 10000;
    private final int maxDurationForQualityDecreaseMs = 25000;
    private final int minDurationToRetainAfterDiscardMs = 25000;
    private final int maxWidthToDiscard = sk51.DEFAULT_MAX_WIDTH_TO_DISCARD;
    private final int maxHeightToDiscard = sk51.DEFAULT_MAX_HEIGHT_TO_DISCARD;
    private final float bandwidthFraction = 0.7f;
    private final float bufferedFractionToLiveEdgeForQualityIncrease = 0.75f;
    private final y3c clock = y3c.a;

    public sk51 createAdaptiveTrackSelection(xzz0 xzz0Var, int[] iArr, int i, ip4 ip4Var, ImmutableList immutableList) {
        return new sk51(xzz0Var, iArr, 0, ip4Var, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.maxWidthToDiscard, this.maxHeightToDiscard, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, immutableList, this.clock);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.koo
    public final loo[] createTrackSelections(joo[] jooVarArr, ip4 ip4Var, sf10 sf10Var, a9z0 a9z0Var) {
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        long j2;
        loo createAdaptiveTrackSelection;
        ImmutableList l;
        rk51 rk51Var = this;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 1;
            if (i6 >= jooVarArr.length) {
                break;
            }
            joo jooVar = jooVarArr[i6];
            if (jooVar == null || jooVar.b.length <= 1) {
                arrayList.add(null);
            } else {
                piv pivVar = ImmutableList.b;
                ImmutableList.a aVar = new ImmutableList.a();
                aVar.a(new qk51(0L, 0L));
                arrayList.add(aVar);
            }
            i6++;
        }
        int length = jooVarArr.length;
        long[][] jArr = new long[length][];
        int i7 = 0;
        while (true) {
            j = -1;
            if (i7 >= jooVarArr.length) {
                break;
            }
            joo jooVar2 = jooVarArr[i7];
            if (jooVar2 == null) {
                jArr[i7] = new long[0];
            } else {
                int[] iArr = jooVar2.b;
                jArr[i7] = new long[iArr.length];
                for (int i8 = 0; i8 < iArr.length; i8++) {
                    long j3 = jooVar2.a.d[iArr[i8]].j;
                    long[] jArr2 = jArr[i7];
                    if (j3 == -1) {
                        j3 = 0;
                    }
                    jArr2[i8] = j3;
                }
                Arrays.sort(jArr[i7]);
            }
            i7++;
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i9 = 0; i9 < length; i9++) {
            long[] jArr4 = jArr[i9];
            jArr3[i9] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        int b = z60.b(jooVarArr, 2);
        int b2 = z60.b(jooVarArr, 1);
        if (b == -1 || b2 == -1) {
            z60.a(jArr3, arrayList);
            x xVar = new x();
            y5e.i(2, "expectedValuesPerKey");
            zsy a = new y(xVar).a();
            int i10 = 0;
            while (i10 < length) {
                long[] jArr5 = jArr[i10];
                if (jArr5.length <= i) {
                    i4 = i5;
                    j2 = j;
                } else {
                    int length2 = jArr5.length;
                    double[] dArr = new double[length2];
                    i4 = i5;
                    int i11 = i4;
                    while (true) {
                        long[] jArr6 = jArr[i10];
                        j2 = j;
                        double d = 0.0d;
                        if (i11 >= jArr6.length) {
                            break;
                        }
                        long j4 = jArr6[i11];
                        if (j4 != j2) {
                            d = Math.log(j4);
                        }
                        dArr[i11] = d;
                        i11++;
                        j = j2;
                    }
                    int i12 = length2 - 1;
                    double d2 = dArr[i12] - dArr[i4];
                    int i13 = i4;
                    while (i13 < i12) {
                        double d3 = dArr[i13];
                        i13++;
                        a.put(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i13]) * 0.5d) - dArr[i4]) / d2), Integer.valueOf(i10));
                        i = i;
                    }
                }
                i10++;
                i5 = i4;
                i = i;
                j = j2;
            }
            i2 = i5;
            i3 = i;
            ImmutableList l2 = ImmutableList.l(a.values());
            while (i5 < l2.size()) {
                int intValue = ((Integer) l2.get(i5)).intValue();
                int i14 = iArr2[intValue] + 1;
                iArr2[intValue] = i14;
                jArr3[intValue] = jArr[intValue][i14];
                z60.a(jArr3, arrayList);
                i5++;
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            xzz0 xzz0Var = jooVarArr[b].a;
            for (int i15 = 0; i15 < xzz0Var.a; i15++) {
                arrayList2.add(xzz0Var.d[i15]);
            }
            Collections.sort(arrayList2, new y60(0));
            for (int i16 = 0; i16 < jArr[b].length; i16++) {
                jArr3[b] = ((a) arrayList2.get(i16)).j;
                if (i16 != 0) {
                    long[] jArr7 = jArr[b2];
                    jArr3[b2] = jArr7[jArr7.length - 1];
                    z60.a(jArr3, arrayList);
                } else {
                    int i17 = 0;
                    while (true) {
                        long[] jArr8 = jArr[b2];
                        if (i17 < jArr8.length) {
                            jArr3[b2] = jArr8[i17];
                            z60.a(jArr3, arrayList);
                            i17++;
                        }
                    }
                }
            }
            i2 = 0;
            i3 = 1;
        }
        for (int i18 = i2; i18 < jooVarArr.length; i18++) {
            if (arrayList.get(i18) != null) {
                jArr3[i18] = jArr3[i18] * 2;
            }
        }
        z60.a(jArr3, arrayList);
        piv pivVar2 = ImmutableList.b;
        ImmutableList.a aVar2 = new ImmutableList.a();
        int i19 = i2;
        while (i19 < arrayList.size()) {
            ImmutableList.a aVar3 = (ImmutableList.a) arrayList.get(i19);
            if (aVar3 == null) {
                l = ImmutableList.p();
            } else {
                ArrayList arrayList3 = new ArrayList(aVar3.g());
                Collections.sort(arrayList3, new y60(i3));
                l = ImmutableList.l(arrayList3);
            }
            if (aVar3 == null) {
                l = ImmutableList.p();
            }
            aVar2.a(l);
            i19++;
            i3 = 1;
        }
        ImmutableList g = aVar2.g();
        loo[] looVarArr = new loo[jooVarArr.length];
        int i20 = i2;
        while (i20 < jooVarArr.length) {
            joo jooVar3 = jooVarArr[i20];
            if (jooVar3 != null) {
                int[] iArr3 = jooVar3.b;
                if (iArr3.length != 0) {
                    int length3 = iArr3.length;
                    xzz0 xzz0Var2 = jooVar3.a;
                    if (length3 == 1) {
                        createAdaptiveTrackSelection = new d7m(xzz0Var2, iArr3[i2]);
                    } else {
                        ImmutableList immutableList = (ImmutableList) g.get(i20);
                        createAdaptiveTrackSelection = (xzz0Var2.a < 1 || eh20.i(xzz0Var2.d[i2].n) != 1) ? rk51Var.createAdaptiveTrackSelection(xzz0Var2, iArr3, 0, ip4Var, immutableList) : new sk51(xzz0Var2, iArr3, 0, ip4Var, rk51Var.minDurationForQualityIncreaseMs, rk51Var.maxDurationForQualityDecreaseMs, rk51Var.minDurationToRetainAfterDiscardMs, rk51Var.maxWidthToDiscard, rk51Var.maxHeightToDiscard, rk51Var.bandwidthFraction, rk51Var.bufferedFractionToLiveEdgeForQualityIncrease, immutableList, rk51Var.clock);
                    }
                    looVarArr[i20] = createAdaptiveTrackSelection;
                    i20++;
                    rk51Var = this;
                }
            }
            i20++;
            rk51Var = this;
        }
        return looVarArr;
    }
}
