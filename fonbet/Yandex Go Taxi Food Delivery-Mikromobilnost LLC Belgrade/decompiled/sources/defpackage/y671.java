package defpackage;

import android.graphics.Matrix;
import android.view.TextureView;
import yads.gh3;
import yads.ih3;

/* loaded from: classes7.dex */
public final class y671 implements ub81 {
    public final g281 a = new g281();
    public vn61 b;
    public vn61 c;
    public TextureView w;
    public ih3 x;

    public final void a() {
        Matrix matrix;
        vn61 vn61Var = this.c;
        ih3 ih3Var = this.x;
        vn61 vn61Var2 = this.b;
        TextureView textureView = this.w;
        if (vn61Var2 != null) {
            int i = vn61Var2.b;
            int i2 = vn61Var2.a;
            if (vn61Var != null) {
                int i3 = vn61Var.b;
                int i4 = vn61Var.a;
                if (ih3Var == null || textureView == null) {
                    return;
                }
                ji41 ji41Var = new ji41(25, vn61Var);
                if (i2 <= 0 || i <= 0 || i4 <= 0 || i3 <= 0) {
                    matrix = null;
                } else {
                    int ordinal = ih3Var.ordinal();
                    if (ordinal == 0) {
                        matrix = ji41Var.L(1.0f, 1.0f, gh3.b);
                    } else if (ordinal == 1) {
                        float f = i4 / i2;
                        float f2 = i3 / i;
                        float min = Math.min(f, f2);
                        matrix = ji41Var.L(min / f, min / f2, gh3.c);
                    } else {
                        if (ordinal != 2) {
                            w511.b();
                            return;
                        }
                        float f3 = i4 / i2;
                        float f4 = i3 / i;
                        float max = Math.max(f3, f4);
                        matrix = ji41Var.L(max / f3, max / f4, gh3.c);
                    }
                }
                if (matrix != null) {
                    textureView.setTransform(matrix);
                }
            }
        }
    }

    public final void c() {
        TextureView textureView = this.w;
        if (this.x == null || textureView == null) {
            return;
        }
        this.a.getClass();
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
    }

    @Override // defpackage.ub81
    public final void i(ty71 ty71Var) {
        int i = ty71Var.a;
        float f = ty71Var.w;
        if (f > 0.0f) {
            i = m810.b(i * f);
        }
        this.b = new vn61(i, ty71Var.b);
        a();
    }

    @Override // defpackage.ub81
    public final void onSurfaceSizeChanged(int i, int i2) {
        this.c = new vn61(i, i2);
        a();
    }
}
