package C3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class q extends s {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f462h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f463b;

    /* renamed from: c, reason: collision with root package name */
    public final float f464c;

    /* renamed from: d, reason: collision with root package name */
    public final float f465d;

    /* renamed from: e, reason: collision with root package name */
    public final float f466e;

    /* renamed from: f, reason: collision with root package name */
    public float f467f;

    /* renamed from: g, reason: collision with root package name */
    public float f468g;

    public q(float f6, float f9, float f10, float f11) {
        this.f463b = f6;
        this.f464c = f9;
        this.f465d = f10;
        this.f466e = f11;
    }

    @Override // C3.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f471a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f462h;
        rectF.set(this.f463b, this.f464c, this.f465d, this.f466e);
        path.arcTo(rectF, this.f467f, this.f468g, false);
        path.transform(matrix);
    }
}
