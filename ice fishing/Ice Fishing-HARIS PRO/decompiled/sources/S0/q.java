package S0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f1129h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f1130b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1131c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1132d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public float f1133f;

    /* renamed from: g, reason: collision with root package name */
    public float f1134g;

    public q(float f2, float f3, float f4, float f5) {
        this.f1130b = f2;
        this.f1131c = f3;
        this.f1132d = f4;
        this.e = f5;
    }

    @Override // S0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1137a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f1129h;
        rectF.set(this.f1130b, this.f1131c, this.f1132d, this.e);
        path.arcTo(rectF, this.f1133f, this.f1134g, false);
        path.transform(matrix);
    }
}
