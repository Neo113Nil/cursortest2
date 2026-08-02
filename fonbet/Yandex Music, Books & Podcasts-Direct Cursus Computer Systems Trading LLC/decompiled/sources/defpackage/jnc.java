package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public abstract class jnc {
    public static final fu6 a = new fu6(b2c.k);

    public static final hho a(ffh ffhVar) {
        ffhVar.getClass();
        Object n = ffhVar.n();
        if (n instanceof hho) {
            return (hho) n;
        }
        return null;
    }

    public static final float b(hho hhoVar) {
        return 0.0f;
    }

    public static final long c(List list, pyc pycVar, pyc pycVar2, int i, int i2, int i3, wmc wmcVar) {
        boolean z;
        long a2 = qpe.a(0, 0);
        if (list.isEmpty()) {
            return a2;
        }
        nmc nmcVar = new nmc(wmcVar, ia6.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
        ffh ffhVar = (ffh) CollectionsKt.S(list, 0);
        int intValue = ffhVar != null ? ((Number) pycVar2.invoke(ffhVar, 0, Integer.valueOf(i))).intValue() : 0;
        int intValue2 = ffhVar != null ? ((Number) pycVar.invoke(ffhVar, 0, Integer.valueOf(intValue))).intValue() : 0;
        boolean z2 = true;
        int i4 = 0;
        int i5 = 0;
        if (nmcVar.b(list.size() > 1, 0, qpe.a(i, Integer.MAX_VALUE), ffhVar == null ? null : new qpe(qpe.a(intValue2, intValue)), 0, 0, 0, false, false).b) {
            rmc rmcVar = rmc.a;
            return a2;
        }
        int size = list.size();
        int i6 = i;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            }
            int i11 = i6 - intValue2;
            int i12 = i8 + 1;
            int max = Math.max(i7, intValue);
            ffh ffhVar2 = (ffh) CollectionsKt.S(list, i12);
            intValue = ffhVar2 != null ? ((Number) pycVar2.invoke(ffhVar2, Integer.valueOf(i12), Integer.valueOf(i))).intValue() : 0;
            int intValue3 = ffhVar2 != null ? ((Number) pycVar.invoke(ffhVar2, Integer.valueOf(i12), Integer.valueOf(intValue))).intValue() + i2 : 0;
            if (i8 + 2 < list.size()) {
                i8 = i12;
                z = z2;
            } else {
                i8 = i12;
                z = false;
            }
            lu6 b = nmcVar.b(z, i8 - i10, qpe.a(i11, Integer.MAX_VALUE), ffhVar2 == null ? null : new qpe(qpe.a(intValue3, intValue)), i4, i5, max, false, false);
            if (b.a) {
                i5 = max + i3 + i5;
                boolean z3 = b.b;
                if (z3) {
                    rmc rmcVar2 = rmc.a;
                }
                intValue3 -= i2;
                i4++;
                if (z3) {
                    i9 = i8;
                    break;
                }
                i6 = i;
                i10 = i8;
                i7 = 0;
            } else {
                i6 = i11;
                i7 = max;
            }
            intValue2 = intValue3;
            i9 = i8;
            z2 = true;
        }
        return qpe.a(i5 - i3, i9);
    }
}
