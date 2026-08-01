package E3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class q extends s {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f815h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f816b;

    /* renamed from: c, reason: collision with root package name */
    public final float f817c;

    /* renamed from: d, reason: collision with root package name */
    public final float f818d;

    /* renamed from: e, reason: collision with root package name */
    public final float f819e;

    /* renamed from: f, reason: collision with root package name */
    public float f820f;

    /* renamed from: g, reason: collision with root package name */
    public float f821g;

    public q(float f3, float f9, float f10, float f11) {
        this.f816b = f3;
        this.f817c = f9;
        this.f818d = f10;
        this.f819e = f11;
    }

    @Override // E3.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f824a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f815h;
        rectF.set(this.f816b, this.f817c, this.f818d, this.f819e);
        path.arcTo(rectF, this.f820f, this.f821g, false);
        path.transform(matrix);
    }
}
