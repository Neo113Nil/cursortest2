package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class j7 implements defpackage.m7 {
    public final /* synthetic */ int WDYagTQQm9ns = 1;

    @Override // defpackage.m7
    public final void WDYagTQQm9ns(int i, defpackage.xk0 xk0Var, int[] iArr, int[] iArr2) {
        int i2 = 0;
        switch (this.WDYagTQQm9ns) {
            case 0:
                int i3 = 0;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int i5 = i - i3;
                int length = iArr.length;
                int i6 = 0;
                while (i2 < length) {
                    int i7 = iArr[i2];
                    iArr2[i6] = i5;
                    i5 += i7;
                    i2++;
                    i6++;
                }
                break;
            default:
                int length2 = iArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i8] = i9;
                    i9 += i10;
                    i2++;
                    i8++;
                }
                break;
        }
    }

    public final java.lang.String toString() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
