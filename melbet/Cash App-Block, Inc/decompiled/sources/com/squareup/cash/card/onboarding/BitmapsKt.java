package com.squareup.cash.card.onboarding;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes6.dex */
public abstract class BitmapsKt {
    public static final Paint CLEAR_PAINT;
    public static final Paint DARKEN_PAINT;
    public static final int TOUCH_HEAT_START = Color.argb(50, 0, 0, 255);

    static {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        CLEAR_PAINT = paint;
        Paint paint2 = new Paint();
        paint2.setAlpha(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        DARKEN_PAINT = paint2;
    }

    public static final void applyHeat(Bitmap bitmap, float f, float f2) {
        bitmap.getClass();
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setShader(new RadialGradient(f, f2, canvas.getWidth() * 0.2f, new int[]{TOUCH_HEAT_START, 0}, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawPaint(paint);
    }

    public static final Bitmap coolHeat(Bitmap bitmap) {
        bitmap.getClass();
        Bitmap.Config config = bitmap.getConfig();
        config.getClass();
        Bitmap copy = bitmap.copy(config, true);
        Canvas canvas = new Canvas(copy);
        canvas.drawPaint(CLEAR_PAINT);
        canvas.drawBitmap(bitmap, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, DARKEN_PAINT);
        return copy;
    }
}
