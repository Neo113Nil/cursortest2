package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.os.Build;

/* loaded from: classes3.dex */
public abstract class er2 extends n7w {
    @Override // defpackage.n7w
    public final void W(p9 p9Var) {
        if (p9Var instanceof bq8) {
            i0(((bq8) p9Var).b, (t33) p9Var.a);
        } else if (p9Var instanceof cq8) {
            h0(((cq8) p9Var).b, (t33) p9Var.a);
        }
    }

    @Override // defpackage.n7w
    public void X(qq3 qq3Var) {
        i0(qq3Var.a, qq3Var.c);
    }

    public void h0(Drawable drawable, t33 t33Var) {
        if (drawable instanceof BitmapDrawable) {
            i0(((BitmapDrawable) drawable).getBitmap(), t33Var);
            return;
        }
        if (drawable instanceof PictureDrawable) {
            k0((PictureDrawable) drawable, t33Var);
        } else if (Build.VERSION.SDK_INT < 28 || !xq0.u(drawable)) {
            j0(drawable, t33Var);
        } else {
            j0(b6e.e(drawable), t33Var);
        }
    }

    public abstract void i0(Bitmap bitmap, t33 t33Var);

    public abstract void j0(Drawable drawable, t33 t33Var);

    public void k0(PictureDrawable pictureDrawable, t33 t33Var) {
        pictureDrawable.getClass();
        j0(pictureDrawable, t33Var);
    }
}
