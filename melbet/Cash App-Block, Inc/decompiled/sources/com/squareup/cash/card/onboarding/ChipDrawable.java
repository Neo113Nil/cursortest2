package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;
import com.squareup.cash.R;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes6.dex */
public final class ChipDrawable extends Drawable {
    public final Drawable cardChip;
    public final float chipHeightPercent;
    public final float chipLeftPercent;
    public final float chipTopPercent;
    public final float chipWidthPercent;
    public final boolean isPortrait;

    public ChipDrawable(Context context, boolean z, boolean z2) {
        Drawable drawable;
        context.getClass();
        this.isPortrait = z2;
        this.chipWidthPercent = z2 ? ResourcesCompat.getFloat(context.getResources(), R.dimen.card_chip_height_percent) : ResourcesCompat.getFloat(context.getResources(), R.dimen.card_chip_width_percent);
        this.chipHeightPercent = z2 ? ResourcesCompat.getFloat(context.getResources(), R.dimen.card_chip_width_percent) : ResourcesCompat.getFloat(context.getResources(), R.dimen.card_chip_height_percent);
        this.chipLeftPercent = z2 ? ResourcesCompat.getFloat(context.getResources(), R.dimen.card_chip_left_offset_portrait) : ResourcesCompat.getFloat(context.getResources(), R.dimen.card_chip_left_offset);
        this.chipTopPercent = z2 ? ResourcesCompat.getFloat(context.getResources(), R.dimen.card_chip_top_offset_portrait) : ResourcesCompat.getFloat(context.getResources(), R.dimen.card_chip_top_offset);
        if (z) {
            drawable = ResourcesCompat.getDrawable(context.getResources(), R.drawable.card_chip_gold, null);
            drawable.getClass();
        } else {
            drawable = ResourcesCompat.getDrawable(context.getResources(), R.drawable.card_chip_silver, null);
            drawable.getClass();
        }
        this.cardChip = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        boolean z = this.isPortrait;
        Drawable drawable = this.cardChip;
        if (!z) {
            drawable.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            drawable.getBounds().getClass();
            canvas.rotate(90.0f, (r1.left + r1.right) / 2.0f, (r1.top + r1.bottom) / 2.0f);
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.cardChip.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.cardChip.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.cardChip.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = i3 - i;
        int i5 = (int) (this.chipLeftPercent * f);
        float f2 = i4 - i2;
        int i6 = (int) (this.chipTopPercent * f2);
        int i7 = (int) (this.chipWidthPercent * f);
        int i8 = (int) (this.chipHeightPercent * f2);
        boolean z = this.isPortrait;
        Drawable drawable = this.cardChip;
        if (!z) {
            drawable.setBounds(i5, i6, i7 + i5, i8 + i6);
            return;
        }
        float f3 = i7 / 2.0f;
        float f4 = i5 + f3;
        float f5 = i8 / 2.0f;
        float f6 = i6 + f5;
        drawable.setBounds(MathKt__MathJVMKt.roundToInt(f4 - f5), MathKt__MathJVMKt.roundToInt(f6 - f3), MathKt__MathJVMKt.roundToInt(f4 + f5), MathKt__MathJVMKt.roundToInt(f6 + f3));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.cardChip.setColorFilter(colorFilter);
    }
}
