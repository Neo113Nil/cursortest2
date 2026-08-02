package ru.yandex.music.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.zdn;

/* loaded from: classes6.dex */
public class CropImageView extends AppCompatImageView {
    public int a;
    public int b;

    public CropImageView(Context context) {
        super(context);
        this.a = -1;
        this.b = 0;
        c(context, null, 0);
    }

    public final void c(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zdn.c, i, 0);
        this.a = obtainStyledAttributes.getInt(1, this.a);
        this.b = obtainStyledAttributes.getInt(0, this.b);
        obtainStyledAttributes.recycle();
        setCropType(this.a);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        float f3;
        Drawable drawable = getDrawable();
        if (drawable instanceof ColorDrawable) {
            super.onMeasure(i, i2);
            return;
        }
        if (drawable == null || this.a <= -1) {
            super.onMeasure(i, i2);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float f4 = 0.0f;
        int i8 = 0;
        if (this.a <= 1) {
            i3 = View.MeasureSpec.getSize(i);
            if (getLayoutParams().width == -2 && intrinsicWidth < i3) {
                i3 = intrinsicWidth;
            }
            f = i3 / intrinsicWidth;
            i4 = (int) (intrinsicHeight * f);
        } else {
            f = 0.0f;
            i3 = 0;
            i4 = 0;
        }
        if (this.a >= 1) {
            int size = View.MeasureSpec.getSize(i2);
            if (getLayoutParams().height == -2 && intrinsicHeight < size) {
                size = intrinsicHeight;
            }
            float f5 = size / intrinsicHeight;
            i6 = (int) (intrinsicWidth * f5);
            int i9 = size;
            f4 = f5;
            i5 = i9;
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (f > f4) {
            int maxHeight = getMaxHeight();
            int i10 = getLayoutParams().height;
            if (i10 >= -1) {
                if (i10 == -1) {
                    i10 = View.MeasureSpec.getSize(i2);
                }
                if (i10 < maxHeight) {
                    maxHeight = i10;
                }
            }
            i5 = i4 > maxHeight ? maxHeight : i4;
            int i11 = this.b;
            if (i11 >= 2) {
                f3 = (i5 - i4) * 0.5f;
            } else {
                if (i11 == 1) {
                    f3 = (i5 - i4) * 1.0f;
                }
                i7 = 0;
            }
            i7 = (int) (f3 + 0.5f);
        } else {
            i3 = getMaxWidth();
            int i12 = getLayoutParams().width;
            if (i12 >= -1) {
                if (i12 == -1) {
                    i12 = View.MeasureSpec.getSize(i);
                }
                if (i12 < i3) {
                    i3 = i12;
                }
            }
            if (i6 <= i3) {
                i3 = i6;
            }
            int i13 = this.b;
            if (i13 <= 2) {
                f2 = (i3 - i6) * 0.5f;
            } else if (i13 == 4) {
                f2 = (i3 - i6) * 1.0f;
            } else {
                f = f4;
                i7 = 0;
            }
            i8 = (int) (f2 + 0.5f);
            i7 = 0;
            f = f4;
        }
        Matrix imageMatrix = getImageMatrix();
        imageMatrix.setScale(f, f);
        imageMatrix.postTranslate(i8, i7);
        setImageMatrix(imageMatrix);
        setMeasuredDimension(i3, i5);
    }

    public void setCropAlign(int i) {
        this.b = i;
    }

    public void setCropType(int i) {
        this.a = i;
        if (i > -1) {
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = 0;
        c(context, attributeSet, 0);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1;
        this.b = 0;
        c(context, attributeSet, i);
    }
}
