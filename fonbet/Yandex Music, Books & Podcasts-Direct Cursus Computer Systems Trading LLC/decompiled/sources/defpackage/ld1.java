package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;

/* loaded from: classes3.dex */
public final class ld1 {
    public final List a;
    public final Context b;
    public final cce c;
    public final x6k d;
    public final x6k e;

    public ld1(List list, Context context, cce cceVar, mm6 mm6Var) {
        context.getClass();
        mm6Var.getClass();
        this.a = list;
        this.b = context;
        this.c = cceVar;
        xr1 xr1Var = xr1.a;
        this.d = szf.g0(xr1Var);
        this.e = szf.g0(xr1Var);
        x97.y(mm6Var, null, null, new hl(this, null, 10), 3);
    }

    public static w4k a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            bitmap.getClass();
            return new q33(new yg0(bitmap));
        }
        if (drawable instanceof ColorDrawable) {
            return new w85(c3x.f(((ColorDrawable) drawable).getColor()));
        }
        Drawable mutate = drawable.mutate();
        mutate.getClass();
        return new opa(mutate);
    }
}
