package defpackage;

/* loaded from: classes.dex */
public final class kx0 implements ox0 {
    public final /* synthetic */ int a;

    public /* synthetic */ kx0(int i) {
        this.a = i;
    }

    @Override // defpackage.ox0
    public final void a(jx7 jx7Var, int i, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 0:
                qx0.c(i, iArr, iArr2, false);
                break;
            case 1:
                qx0.b(iArr, iArr2, false);
                break;
            default:
                jx7Var.getClass();
                float S = (i - xz0.S(iArr)) * 0.6f;
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = iArr[i2];
                    iArr2[i3] = eeh.b(S);
                    S += i4;
                    i2++;
                    i3++;
                }
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Bottom";
            case 1:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
