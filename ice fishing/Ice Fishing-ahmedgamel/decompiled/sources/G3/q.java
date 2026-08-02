package G3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class q extends s {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f1157h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f1158b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1159c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1160d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1161e;

    /* renamed from: f, reason: collision with root package name */
    public float f1162f;

    /* renamed from: g, reason: collision with root package name */
    public float f1163g;

    public q(float f2, float f9, float f10, float f11) {
        this.f1158b = f2;
        this.f1159c = f9;
        this.f1160d = f10;
        this.f1161e = f11;
    }

    @Override // G3.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1166a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f1157h;
        rectF.set(this.f1158b, this.f1159c, this.f1160d, this.f1161e);
        path.arcTo(rectF, this.f1162f, this.f1163g, false);
        path.transform(matrix);
    }
}
