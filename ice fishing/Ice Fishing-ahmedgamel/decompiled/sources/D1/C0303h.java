package D1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import u1.InterfaceC5066e;
import x1.InterfaceC5183a;

/* renamed from: D1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303h extends AbstractC0300e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f545b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC5066e.f41005a);

    @Override // u1.InterfaceC5066e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f545b);
    }

    @Override // D1.AbstractC0300e
    public final Bitmap c(InterfaceC5183a interfaceC5183a, Bitmap bitmap, int i, int i4) {
        float width;
        float height;
        Paint paint = B.f517a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i4) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f2 = 0.0f;
        if (bitmap.getWidth() * i4 > bitmap.getHeight() * i) {
            width = i4 / bitmap.getHeight();
            f2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i4 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f2 + 0.5f), (int) (height + 0.5f));
        Bitmap d9 = interfaceC5183a.d(i, i4, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        d9.setHasAlpha(bitmap.hasAlpha());
        B.a(bitmap, d9, matrix);
        return d9;
    }

    @Override // u1.InterfaceC5066e
    public final boolean equals(Object obj) {
        return obj instanceof C0303h;
    }

    @Override // u1.InterfaceC5066e
    public final int hashCode() {
        return -599754482;
    }
}
