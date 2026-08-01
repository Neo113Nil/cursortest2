package E3;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f822b;

    /* renamed from: c, reason: collision with root package name */
    public float f823c;

    @Override // E3.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f824a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f822b, this.f823c);
        path.transform(matrix);
    }
}
