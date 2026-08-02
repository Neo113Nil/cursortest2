package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class ugp extends View {
    public final Paint a;
    public final Rect b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;

    public ugp(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setColor(0);
        this.a = paint;
        this.b = new Rect();
        this.d = true;
        this.f = 17;
    }

    public final int getDividerColor() {
        return this.a.getColor();
    }

    public final int getDividerGravity() {
        return this.f;
    }

    public final int getDividerThickness() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.a;
        if (Color.alpha(paint.getColor()) > 0) {
            boolean z = this.c;
            Rect rect = this.b;
            if (z) {
                int paddingTop = this.d ? getPaddingTop() : getPaddingLeft();
                int paddingBottom = this.d ? getPaddingBottom() : getPaddingRight();
                int height = this.d ? getHeight() : getWidth();
                int i = (height - paddingTop) - paddingBottom;
                int i2 = this.f;
                if (i2 == 17) {
                    paddingTop = ouj.b(i, this.e, 2, paddingTop);
                } else if (i2 != 8388611) {
                    paddingTop = i2 != 8388613 ? 0 : (height - paddingBottom) - this.e;
                }
                if (this.d) {
                    rect.top = paddingTop;
                    rect.bottom = Math.min(i, this.e) + paddingTop;
                    rect.left = getPaddingLeft();
                    rect.right = getWidth() - getPaddingRight();
                } else {
                    rect.left = paddingTop;
                    rect.right = Math.min(i, this.e) + paddingTop;
                    rect.top = getPaddingTop();
                    rect.bottom = getHeight() - getPaddingBottom();
                }
                this.c = false;
            }
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        boolean z = this.d;
        int i3 = this.e;
        if (z) {
            paddingBottom += i3;
        } else {
            paddingRight += i3;
        }
        int max = Math.max(paddingRight, getSuggestedMinimumWidth());
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            max = Math.min(max, size);
        } else if (mode == 1073741824) {
            max = size;
        }
        int max2 = Math.max(paddingBottom, getSuggestedMinimumHeight());
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            max2 = Math.min(max2, size2);
        } else if (mode2 == 1073741824) {
            max2 = size2;
        }
        setMeasuredDimension(max, max2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c = true;
    }

    public final void setDividerColor(int i) {
        Paint paint = this.a;
        if (paint.getColor() != i) {
            paint.setColor(i);
            invalidate();
        }
    }

    public final void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public final void setDividerGravity(int i) {
        if (this.f != i) {
            this.f = i;
            this.c = true;
            invalidate();
        }
    }

    public final void setDividerHeightResource(int i) {
        setDividerThickness(getResources().getDimensionPixelSize(i));
    }

    public final void setDividerThickness(int i) {
        if (this.e != i) {
            this.e = i;
            this.c = true;
            requestLayout();
        }
    }

    public final void setHorizontal(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.c = true;
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.c = true;
    }

    public static /* synthetic */ void getDividerGravity$annotations() {
    }

    public ugp(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ugp(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ugp(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
