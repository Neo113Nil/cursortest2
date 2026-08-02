package G3;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f1164b;

    /* renamed from: c, reason: collision with root package name */
    public float f1165c;

    @Override // G3.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1166a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1164b, this.f1165c);
        path.transform(matrix);
    }
}
