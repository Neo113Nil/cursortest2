package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes3.dex */
public final class uup extends vup {
    public float b;
    public float c;

    @Override // defpackage.vup
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
