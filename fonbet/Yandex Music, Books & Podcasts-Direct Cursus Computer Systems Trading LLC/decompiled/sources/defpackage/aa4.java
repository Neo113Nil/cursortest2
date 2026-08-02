package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class aa4 extends u33 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(daf.a);

    @Override // defpackage.daf
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.u33
    public final Bitmap c(r33 r33Var, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = i7t.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
        Bitmap t = r33Var.t(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        t.setHasAlpha(bitmap.hasAlpha());
        i7t.a(bitmap, t, matrix);
        return t;
    }

    @Override // defpackage.daf
    public final boolean equals(Object obj) {
        return obj instanceof aa4;
    }

    @Override // defpackage.daf
    public final int hashCode() {
        return -599754482;
    }
}
