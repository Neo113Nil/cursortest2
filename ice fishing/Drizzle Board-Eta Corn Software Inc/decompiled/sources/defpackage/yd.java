package defpackage;

import android.graphics.Matrix;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class yd {
    public final float[] qoPGr6Ce = new float[2];
    public final float[] NCTxEWno = {1.0f, 0.0f};
    public final Matrix MdtA4re8 = new Matrix();

    public final void MdtA4re8(float f) {
        Matrix matrix = this.MdtA4re8;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints(this.qoPGr6Ce);
        matrix.mapPoints(this.NCTxEWno);
    }

    public final void NCTxEWno() {
        Arrays.fill(this.qoPGr6Ce, 0.0f);
        float[] fArr = this.NCTxEWno;
        Arrays.fill(fArr, 0.0f);
        fArr[0] = 1.0f;
        this.MdtA4re8.reset();
    }

    public final void qoPGr6Ce(float f) {
        float[] fArr = this.NCTxEWno;
        float atan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
        float[] fArr2 = this.qoPGr6Ce;
        double d = f;
        double d2 = atan2;
        fArr2[0] = (float) ((Math.cos(d2) * d) + fArr2[0]);
        fArr2[1] = (float) ((Math.sin(d2) * d) + fArr2[1]);
    }
}
