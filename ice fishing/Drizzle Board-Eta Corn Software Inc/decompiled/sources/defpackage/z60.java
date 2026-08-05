package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class z60 extends b70 {
    public static final RectF Qr9iLBAD = new RectF();
    public final float MdtA4re8;
    public final float NCTxEWno;
    public float P7K7Inc8;
    public final float VgvYg0wo;
    public float b2ZJblxo;
    public final float wxUZMvaN;

    public z60(float f, float f2, float f3, float f4) {
        this.NCTxEWno = f;
        this.MdtA4re8 = f2;
        this.wxUZMvaN = f3;
        this.VgvYg0wo = f4;
    }

    @Override // defpackage.b70
    public final void qoPGr6Ce(Matrix matrix, Path path) {
        Matrix matrix2 = this.qoPGr6Ce;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.wxUZMvaN;
        float f2 = this.VgvYg0wo;
        RectF rectF = Qr9iLBAD;
        rectF.set(this.NCTxEWno, this.MdtA4re8, f, f2);
        path.arcTo(rectF, this.P7K7Inc8, this.b2ZJblxo, false);
        path.transform(matrix);
    }
}
