package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class bo6 {
    public final String a;
    public final d85 b;
    public final Context c;
    public final cce d;
    public final x6k e;
    public final x6k f;
    public final rar g;

    public bo6(String str, d85 d85Var, Context context, cce cceVar, mm6 mm6Var) {
        str.getClass();
        context.getClass();
        mm6Var.getClass();
        this.a = str;
        this.b = d85Var;
        this.c = context;
        this.d = cceVar;
        this.e = szf.g0(xr1.a);
        this.f = szf.g0(d85Var == null ? xn6.a : new yn6(d85Var.a));
        this.g = x97.y(mm6Var, null, null, new ao6(this, null, 1), 3);
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
