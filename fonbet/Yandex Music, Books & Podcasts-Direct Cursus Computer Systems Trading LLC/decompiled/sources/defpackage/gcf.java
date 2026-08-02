package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gcf implements osa {
    public final fcf a;

    public gcf(fcf fcfVar) {
        this.a = fcfVar;
    }

    @Override // defpackage.osa, defpackage.tm0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final xzt a(oct octVar) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        fcf fcfVar = this.a;
        soi soiVar = fcfVar.b;
        roi roiVar = new roi(soiVar.e + 2);
        soi soiVar2 = new soi(soiVar.e);
        int[] iArr3 = soiVar.b;
        Object[] objArr3 = soiVar.c;
        long[] jArr = soiVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            i = i3;
                            ecf ecfVar = (ecf) objArr3[i6];
                            roiVar.a(i7);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            soiVar2.h(i7, new wzt((cn0) octVar.a.invoke(ecfVar.a), ecfVar.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        iArr3 = iArr2;
                        i3 = i;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!soiVar.a(0)) {
            int i8 = roiVar.b;
            if (i8 < 0) {
                e7o.o("Index must be between 0 and size");
                return null;
            }
            roiVar.b(i8 + 1);
            int[] iArr4 = roiVar.a;
            int i9 = roiVar.b;
            if (i9 != 0) {
                uz0.e(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            roiVar.b++;
        }
        if (!soiVar.a(fcfVar.a)) {
            roiVar.a(fcfVar.a);
        }
        int i10 = roiVar.b;
        if (i10 != 0) {
            int[] iArr5 = roiVar.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new xzt(roiVar, soiVar2, fcfVar.a, nya.d);
    }
}
