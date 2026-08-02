package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class sav implements e7t {
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    public sav(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        StringBuilder l = dfi.l("ResizeAndTintTransformation:", i, i2, StringUtils.PROCESS_POSTFIX_DELIMITER, StringUtils.PROCESS_POSTFIX_DELIMITER);
        l.append(i3);
        this.d = l.toString();
    }

    @Override // defpackage.e7t
    public final String a() {
        return this.d;
    }

    @Override // defpackage.e7t
    public final Bitmap b(Bitmap bitmap) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.a, this.b, true);
        createScaledBitmap.getClass();
        Canvas canvas = new Canvas(createScaledBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(this.c, PorterDuff.Mode.SRC_OUT));
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, paint);
        return createScaledBitmap;
    }
}
