package defpackage;

/* loaded from: classes.dex */
public final class lx0 implements mx0, ox0 {
    public final /* synthetic */ int a;
    public final float b;

    public lx0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = 0;
                break;
            case 2:
                this.b = 0;
                break;
            case 3:
                this.b = 0;
                break;
            case 4:
                this.b = 0;
                break;
            default:
                this.b = 0;
                break;
        }
    }

    @Override // defpackage.ox0
    public final void a(jx7 jx7Var, int i, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 0:
                qx0.a(i, iArr, iArr2, false);
                break;
            case 1:
                qx0.d(i, iArr, iArr2, false);
                break;
            case 2:
                qx0.e(i, iArr, iArr2, false);
                break;
            case 3:
                qx0.f(i, iArr, iArr2, false);
                break;
            default:
                jx7Var.getClass();
                if (iArr.length != 0) {
                    int L = jx7Var.L(this.b);
                    int length = iArr.length;
                    int i2 = length - 1;
                    int i3 = 0;
                    if ((L * i2) + xz0.S(iArr) < i && length > 1) {
                        int i4 = 0;
                        while (i3 < i2) {
                            iArr2[i3] = i4;
                            i4 += iArr[i3] + L;
                            i3++;
                        }
                        iArr2[i2] = i - iArr[i2];
                        break;
                    } else {
                        int length2 = iArr.length;
                        int i5 = 0;
                        while (i3 < length2) {
                            iArr2[i3] = i5;
                            i5 += iArr[i3] + L;
                            i3++;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.mx0, defpackage.ox0
    public final float o() {
        switch (this.a) {
        }
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            case 3:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mx0
    public void w(jx7 jx7Var, int i, int[] iArr, xof xofVar, int[] iArr2) {
        switch (this.a) {
            case 0:
                if (xofVar != xof.a) {
                    qx0.a(i, iArr, iArr2, true);
                    break;
                } else {
                    qx0.a(i, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (xofVar != xof.a) {
                    qx0.d(i, iArr, iArr2, true);
                    break;
                } else {
                    qx0.d(i, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (xofVar != xof.a) {
                    qx0.e(i, iArr, iArr2, true);
                    break;
                } else {
                    qx0.e(i, iArr, iArr2, false);
                    break;
                }
            default:
                if (xofVar != xof.a) {
                    qx0.f(i, iArr, iArr2, true);
                    break;
                } else {
                    qx0.f(i, iArr, iArr2, false);
                    break;
                }
        }
    }
}
