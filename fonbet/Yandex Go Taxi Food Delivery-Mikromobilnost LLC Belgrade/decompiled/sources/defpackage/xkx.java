package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class xkx implements f3n {
    public final wkx a;

    public xkx(wkx wkxVar) {
        this.a = wkxVar;
    }

    @Override // defpackage.f3n, defpackage.jj2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final l531 a(gl11 gl11Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        wkx wkxVar = this.a;
        wx40 wx40Var = wkxVar.b;
        vx40 vx40Var = new vx40(wx40Var.e + 2);
        wx40 wx40Var2 = new wx40(wx40Var.e);
        int[] iArr3 = wx40Var.b;
        Object[] objArr3 = wx40Var.c;
        long[] jArr = wx40Var.a;
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
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            vkx vkxVar = (vkx) objArr3[i6];
                            vx40Var.c(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            wx40Var2.i(i7, new k531((sj2) gl11Var.a.invoke(vkxVar.a), vkxVar.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
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
        if (!wx40Var.a(0)) {
            int i8 = vx40Var.b;
            if (i8 < 0) {
                xva1.d("Index must be between 0 and size");
                throw null;
            }
            vx40Var.d(i8 + 1);
            int[] iArr4 = vx40Var.a;
            int i9 = vx40Var.b;
            if (i9 != 0) {
                f73.d(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            vx40Var.b++;
        }
        if (!wx40Var.a(wkxVar.a)) {
            vx40Var.c(wkxVar.a);
        }
        int i10 = vx40Var.b;
        if (i10 != 0) {
            Arrays.sort(vx40Var.a, 0, i10);
        }
        return new l531(vx40Var, wx40Var2, wkxVar.a, ubn.d);
    }
}
