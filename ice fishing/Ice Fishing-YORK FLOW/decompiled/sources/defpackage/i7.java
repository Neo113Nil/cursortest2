package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class i7 implements defpackage.k7 {
    public final /* synthetic */ int WDYagTQQm9ns;

    public /* synthetic */ i7(int i) {
        this.WDYagTQQm9ns = i;
    }

    @Override // defpackage.k7
    public final void JhCgjQRTAOCT(defpackage.hp hpVar, int i, int[] iArr, defpackage.sc0 sc0Var, int[] iArr2) {
        int i2 = 0;
        switch (this.WDYagTQQm9ns) {
            case 0:
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
                break;
            case 1:
                int i6 = 0;
                for (int i7 : iArr) {
                    i6 += i7;
                }
                int length2 = iArr.length;
                int i8 = i - i6;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i9] = i8;
                    i8 += i10;
                    i2++;
                    i9++;
                }
                break;
            default:
                if (sc0Var == defpackage.sc0.WDYagTQQm9ns) {
                    int length3 = iArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i2 < length3) {
                        int i13 = iArr[i2];
                        iArr2[i11] = i12;
                        i12 += i13;
                        i2++;
                        i11++;
                    }
                    break;
                } else {
                    int length4 = iArr.length;
                    int i14 = 0;
                    while (i2 < length4) {
                        i14 += iArr[i2];
                        i2++;
                    }
                    int i15 = i - i14;
                    int length5 = iArr.length;
                    while (true) {
                        length5--;
                        if (-1 >= length5) {
                            break;
                        } else {
                            int i16 = iArr[length5];
                            iArr2[length5] = i15;
                            i15 += i16;
                        }
                    }
                }
        }
    }

    public final java.lang.String toString() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            default:
                return "Arrangement#Start";
        }
    }
}
