package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class a70 extends b70 {
    public float MdtA4re8;
    public float NCTxEWno;

    @Override // defpackage.b70
    public final void qoPGr6Ce(Matrix matrix, Path path) {
        Matrix matrix2 = this.qoPGr6Ce;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.NCTxEWno, this.MdtA4re8);
        path.transform(matrix);
    }
}
