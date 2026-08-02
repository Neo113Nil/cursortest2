package defpackage;

/* loaded from: classes.dex */
public final class mw6 extends lg3 {
    public double y;
    public double[] z;

    @Override // defpackage.lg3
    public final double h0(double d) {
        return this.z[0];
    }

    @Override // defpackage.lg3
    public final void i0(double d, double[] dArr) {
        double[] dArr2 = this.z;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // defpackage.lg3
    public final void j0(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.z;
            if (i >= dArr.length) {
                return;
            }
            fArr[i] = (float) dArr[i];
            i++;
        }
    }

    @Override // defpackage.lg3
    public final void k0(double d, double[] dArr) {
        for (int i = 0; i < this.z.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // defpackage.lg3
    public final double[] l0() {
        return new double[]{this.y};
    }
}
