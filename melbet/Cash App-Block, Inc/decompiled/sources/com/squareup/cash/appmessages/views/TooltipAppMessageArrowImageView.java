package com.squareup.cash.appmessages.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.util.android.Views;

/* loaded from: classes.dex */
public final class TooltipAppMessageArrowImageView extends AppCompatImageView {
    public final float arrowHeight;
    public final float arrowPointRadius;
    public final float arrowWidth;
    public final ColorPalette darkModeColorPalette;
    public final ColorPalette lightModeColorPalette;
    public final Paint paint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipAppMessageArrowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ColorPalette colorPalette = Trace.moonCakeLight(context).colorPalette;
        this.lightModeColorPalette = colorPalette;
        ColorPalette colorPalette2 = Trace.moonCakeDark(context).colorPalette;
        this.darkModeColorPalette = colorPalette2;
        Paint paint = new Paint(1);
        paint.setColor(ThemeHelpersKt.themeInfo(this).theme == Theme.MooncakeLight ? colorPalette2.background : colorPalette.background);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        this.arrowPointRadius = Views.dip((View) this, 2);
        this.arrowWidth = Views.dip((View) this, 18);
        this.arrowHeight = Views.dip((View) this, 10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        PointF pointF = new PointF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        float f = this.arrowWidth;
        float f2 = f / 2.0f;
        float pow = (float) Math.pow(f2, 2.0d);
        float f3 = this.arrowHeight;
        float sin = (float) Math.sin((((float) Math.asin(f2 / ((float) Math.sqrt(pow + ((float) Math.pow(f3, 2.0d)))))) * 2.0f) / 2.0f);
        float f4 = this.arrowPointRadius;
        float f5 = f3 - ((f4 / sin) - f4);
        RectF rectF = new RectF(f2 - f4, f5 - (2.0f * f4), f2 + f4, f5);
        PointF pointF2 = new PointF(f, RecyclerView.DECELERATION_RATE);
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        path.addArc(rectF, 135.0f, -90.0f);
        path.lineTo(pointF2.x, pointF2.y);
        path.lineTo(pointF.x, pointF.y);
        path.close();
        canvas.drawPath(path, this.paint);
    }

    public final void setTheme(Theme theme) {
        theme.getClass();
        this.paint.setColor(theme == Theme.MooncakeLight ? this.darkModeColorPalette.background : this.lightModeColorPalette.background);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TooltipAppMessageArrowImageView(Context context) {
        this(context, null);
        context.getClass();
    }
}
