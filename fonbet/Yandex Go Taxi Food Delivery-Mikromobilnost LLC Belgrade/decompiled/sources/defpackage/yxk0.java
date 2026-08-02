package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.yandex.messaging.views.RoundRectDrawableWithShadow;
import com.yandex.messaging.views.ShadowBackgroundLayout;

/* loaded from: classes15.dex */
public final class yxk0 {
    public final Paint a;
    public final RectF b;
    public final RoundRectDrawableWithShadow c;
    public final ShadowBackgroundLayout d;
    public final agr0 e;
    public final int f;
    public final int g;
    public int h;
    public Bitmap i;

    public yxk0(ShadowBackgroundLayout shadowBackgroundLayout, int i, int i2, int i3, agr0 agr0Var) {
        Paint paint = new Paint();
        this.a = paint;
        this.b = new RectF();
        this.d = shadowBackgroundLayout;
        this.e = agr0Var;
        this.c = new RoundRectDrawableWithShadow(shadowBackgroundLayout.getContext().getResources(), null, i2, agr0Var);
        this.f = i;
        this.g = i2;
        shadowBackgroundLayout.setWillNotDraw(false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i3);
    }
}
