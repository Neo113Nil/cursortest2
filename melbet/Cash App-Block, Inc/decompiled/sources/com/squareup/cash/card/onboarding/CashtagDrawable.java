package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.core.content.res.ResourcesCompat;
import com.squareup.cash.R;

/* loaded from: classes6.dex */
public final class CashtagDrawable extends Drawable {
    public final String cashtag;
    public final ParcelableSnapshotMutableState cashtagPath$delegate;
    public final boolean isPortrait;
    public final TextPaint textPaint;

    public CashtagDrawable(Context context, String str, boolean z) {
        context.getClass();
        str.getClass();
        this.cashtag = str;
        this.isPortrait = z;
        this.cashtagPath$delegate = Updater.mutableStateOf$default(new Path());
        TextPaint textPaint = new TextPaint();
        Typeface font = ResourcesCompat.getFont(context, R.font.sqmarket_regular);
        font.getClass();
        textPaint.setTypeface(font);
        textPaint.setTextAlign(Paint.Align.RIGHT);
        textPaint.setLetterSpacing(0.02165f);
        this.textPaint = textPaint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        float f = getBounds().left;
        float width = getBounds().width();
        boolean z = this.isPortrait;
        float f2 = ((z ? 0.8479624f : 0.9406822f) * width) + f;
        float height = ((z ? 0.9406822f : 0.15203762f) * getBounds().height()) + getBounds().top;
        TextPaint textPaint = this.textPaint;
        String str = this.cashtag;
        if (!z) {
            canvas.drawText(str, f2, height, textPaint);
            return;
        }
        canvas.save();
        canvas.rotate(90.0f, f2, height);
        canvas.drawText(str, f2, height, textPaint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.textPaint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.textPaint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.textPaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.cashtagPath$delegate;
        String str = this.cashtag;
        boolean z = this.isPortrait;
        TextPaint textPaint = this.textPaint;
        if (z) {
            textPaint.setTextSize((i3 - i) * 0.07445141f);
            float measureText = textPaint.measureText(str);
            float width = ((z ? 0.8479624f : 0.9406822f) * getBounds().width()) + getBounds().left;
            float height = ((z ? 0.9406822f : 0.15203762f) * getBounds().height()) + getBounds().top;
            textPaint.getTextBounds(str, 0, str.length(), new Rect());
            Path path = new Path();
            float width2 = (int) (getBounds().width() * 0.01f);
            RectF rectF = new RectF((width - r13.bottom) - width2, (height - measureText) - width2, (width - r13.top) + width2, height + width2);
            float f = width2 * 3.0f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            parcelableSnapshotMutableState.setValue(path);
            return;
        }
        textPaint.setTextSize((i4 - i2) * 0.07445141f);
        int width3 = ((int) (((z ? 0.8479624f : 0.9406822f) * getBounds().width()) + getBounds().left)) - ((int) textPaint.measureText(str));
        int height2 = (int) (((z ? 0.9406822f : 0.15203762f) * getBounds().height()) + getBounds().top);
        int height3 = (int) (getBounds().height() * 0.01f);
        Path path2 = new Path();
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        rect.offset(width3, height2);
        int i5 = -height3;
        rect.inset(i5, i5);
        float f2 = height3 * 3.0f;
        path2.addRoundRect(new RectF(rect), f2, f2, Path.Direction.CW);
        parcelableSnapshotMutableState.setValue(path2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.textPaint.setColorFilter(colorFilter);
    }
}
