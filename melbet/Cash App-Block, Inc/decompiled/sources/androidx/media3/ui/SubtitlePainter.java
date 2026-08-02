package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class SubtitlePainter {
    public int backgroundColor;
    public final Paint bitmapPaint;
    public Rect bitmapRect;
    public float bottomPaddingFraction;
    public Bitmap cueBitmap;
    public float cueBitmapHeight;
    public float cueLine;
    public int cueLineAnchor;
    public int cueLineType;
    public float cuePosition;
    public int cuePositionAnchor;
    public float cueSize;
    public CharSequence cueText;
    public Layout.Alignment cueTextAlignment;
    public float cueTextSizePx;
    public float defaultTextSizePx;
    public int edgeColor;
    public StaticLayout edgeLayout;
    public int edgeType;
    public int foregroundColor;
    public final float outlineWidth;
    public int parentBottom;
    public int parentLeft;
    public int parentRight;
    public int parentTop;
    public final float shadowOffset;
    public final float shadowRadius;
    public final float spacingAdd;
    public final float spacingMult;
    public StaticLayout textLayout;
    public int textLeft;
    public int textPaddingX;
    public final TextPaint textPaint;
    public int textTop;
    public int windowColor;
    public final Paint windowPaint;

    public SubtitlePainter(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = round;
        this.shadowRadius = round;
        this.shadowOffset = round;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void drawLayout(Canvas canvas, boolean z) {
        Canvas canvas2;
        if (!z) {
            this.bitmapRect.getClass();
            this.cueBitmap.getClass();
            canvas.drawBitmap(this.cueBitmap, (Rect) null, this.bitmapRect, this.bitmapPaint);
            return;
        }
        StaticLayout staticLayout = this.textLayout;
        StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (Color.alpha(this.windowColor) > 0) {
            int i = this.windowColor;
            Paint paint = this.windowPaint;
            paint.setColor(i);
            canvas2 = canvas;
            canvas2.drawRect(-this.textPaddingX, RecyclerView.DECELERATION_RATE, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i2 = this.edgeType;
        TextPaint textPaint = this.textPaint;
        if (i2 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.outlineWidth);
            textPaint.setColor(this.edgeColor);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f = this.shadowRadius;
            if (i2 == 2) {
                float f2 = this.shadowOffset;
                textPaint.setShadowLayer(f, f2, f2, this.edgeColor);
            } else if (i2 == 3 || i2 == 4) {
                boolean z2 = i2 == 3;
                int i3 = z2 ? -1 : this.edgeColor;
                int i4 = z2 ? this.edgeColor : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.foregroundColor);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i3);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f, f3, f3, i4);
            }
        }
        textPaint.setColor(this.foregroundColor);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0);
        canvas2.restoreToCount(save);
    }
}
