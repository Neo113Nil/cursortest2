package B1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import s1.InterfaceC4970e;
import v1.InterfaceC5104a;

/* renamed from: B1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266h extends AbstractC0263e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f131b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC4970e.f40448a);

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f131b);
    }

    @Override // B1.AbstractC0263e
    public final Bitmap c(InterfaceC5104a interfaceC5104a, Bitmap bitmap, int i, int i6) {
        float width;
        float height;
        Paint paint = C.f103a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i6) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i6 > bitmap.getHeight() * i) {
            width = i6 / bitmap.getHeight();
            f3 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i6 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f3 + 0.5f), (int) (height + 0.5f));
        Bitmap n9 = interfaceC5104a.n(i, i6, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        n9.setHasAlpha(bitmap.hasAlpha());
        C.a(bitmap, n9, matrix);
        return n9;
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        return obj instanceof C0266h;
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        return -599754482;
    }
}
