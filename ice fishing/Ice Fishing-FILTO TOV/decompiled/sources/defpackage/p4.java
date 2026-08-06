package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class p4 implements t4 {
    public final /* synthetic */ int OOA6hdeuvCS = 1;

    @Override // defpackage.t4
    public final void encWxUiV2(int i, dd0 dd0Var, int[] iArr, int[] iArr2) {
        int i2 = 0;
        switch (this.OOA6hdeuvCS) {
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

    public final String toString() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
