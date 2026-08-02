package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* loaded from: classes.dex */
public abstract class u33 implements d7t {
    @Override // defpackage.d7t
    public final k2o a(Context context, k2o k2oVar, int i, int i2) {
        if (!xut.j(i, i2)) {
            xq0.x(dfi.f("Cannot apply transformation on width: ", i, i2, " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
            return null;
        }
        r33 r33Var = a.a(context).a;
        Bitmap bitmap = (Bitmap) k2oVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap c = c(r33Var, bitmap, i, i2);
        return bitmap.equals(c) ? k2oVar : s33.b(r33Var, c);
    }

    public abstract Bitmap c(r33 r33Var, Bitmap bitmap, int i, int i2);
}
