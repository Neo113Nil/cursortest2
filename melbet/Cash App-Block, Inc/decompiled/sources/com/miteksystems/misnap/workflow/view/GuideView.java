package com.miteksystems.misnap.workflow.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.DimensionKt;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.workflow.R$styleable;
import com.squareup.cash.R;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt__MathJVMKt;
import okhttp3.internal.connection.RetryTlsHandshakeKt;

/* loaded from: classes4.dex */
public final class GuideView extends View {
    public float a;
    public Drawable c;
    public boolean d;
    public final Paint f;
    public final RectF g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.a = ResourcesCompat.getFloat(getResources(), R.dimen.misnapWorkflowGuideViewDefaultScale);
        this.d = getResources().getBoolean(R.bool.misnapWorkflowGuideViewDefaultShowVignette);
        context.getColor(R.color.colorGuideViewVignette);
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        this.f = paint;
        this.g = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.GuideView, i, i2);
        try {
            setShowVignette(obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getResources().getBoolean(R.bool.misnapWorkflowGuideViewDefaultShowVignette)));
            setVignetteColor(obtainStyledAttributes.getColor(3, context.getColor(R.color.colorGuideViewVignette)));
            setScale(obtainStyledAttributes.getFloat(1, ResourcesCompat.getFloat(obtainStyledAttributes.getResources(), R.dimen.misnapWorkflowGuideViewDefaultScale)));
            setDrawableId(obtainStyledAttributes.getResourceId(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        Drawable drawable = this.c;
        RectF rectF = this.g;
        Bitmap drawableToBitmap = drawable != null ? RetryTlsHandshakeKt.drawableToBitmap(drawable, (int) (rectF.right - rectF.left), (int) (rectF.bottom - rectF.top)) : null;
        if (drawableToBitmap != null) {
            canvas.drawBitmap(drawableToBitmap, rectF.left, rectF.top, (Paint) null);
        }
        if (this.d) {
            Paint paint = this.f;
            canvas.drawRect(getPaddingStart() + RecyclerView.DECELERATION_RATE, getPaddingTop() + RecyclerView.DECELERATION_RATE, rectF.left, getHeight() - getPaddingBottom(), paint);
            canvas.drawRect(rectF.left, getPaddingTop() + RecyclerView.DECELERATION_RATE, rectF.right, rectF.top, paint);
            canvas.drawRect(rectF.right, getPaddingTop() + RecyclerView.DECELERATION_RATE, getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom(), paint);
            canvas.drawRect(rectF.left, rectF.bottom, rectF.right, getHeight() - getPaddingBottom(), paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        int intrinsicWidth;
        int intrinsicWidth2;
        int intrinsicHeight;
        super.onSizeChanged(i, i2, i3, i4);
        int paddingStart = (i - getPaddingStart()) - getPaddingEnd();
        int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
        Drawable drawable = this.c;
        int i5 = 0;
        if (drawable != null) {
            if (drawable == null) {
                intrinsicWidth2 = 0;
            } else if (drawable.getIntrinsicWidth() == -1) {
                intrinsicWidth2 = paddingStart;
            } else {
                Drawable drawable2 = this.c;
                drawable2.getClass();
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
            float f2 = intrinsicWidth2;
            Drawable drawable3 = this.c;
            if (drawable3 == null) {
                intrinsicHeight = 0;
            } else if (drawable3.getIntrinsicHeight() == -1) {
                intrinsicHeight = paddingTop;
            } else {
                Drawable drawable4 = this.c;
                drawable4.getClass();
                intrinsicHeight = drawable4.getIntrinsicHeight();
            }
            float f3 = intrinsicHeight;
            float f4 = paddingStart;
            if (f4 != f2) {
                float f5 = paddingTop;
                if (f5 != f3) {
                    f = Math.min(f4 / f2, f5 / f3);
                }
            }
            if (f4 == f2) {
                float f6 = paddingTop;
                f = f6 == f3 ? 1.0f : f3 / f6;
            } else {
                f = f2 / f4;
            }
        } else {
            f = RecyclerView.DECELERATION_RATE;
        }
        Drawable drawable5 = this.c;
        if (drawable5 == null) {
            intrinsicWidth = 0;
        } else if (drawable5.getIntrinsicWidth() == -1) {
            intrinsicWidth = paddingStart;
        } else {
            Drawable drawable6 = this.c;
            drawable6.getClass();
            intrinsicWidth = drawable6.getIntrinsicWidth();
        }
        float f7 = intrinsicWidth * f * this.a;
        Drawable drawable7 = this.c;
        if (drawable7 != null) {
            if (drawable7.getIntrinsicHeight() == -1) {
                i5 = paddingTop;
            } else {
                Drawable drawable8 = this.c;
                drawable8.getClass();
                i5 = drawable8.getIntrinsicHeight();
            }
        }
        float f8 = i5 * f * this.a;
        float roundToInt = MathKt__MathJVMKt.roundToInt(((paddingStart - f7) / 2.0f) + getPaddingStart());
        RectF rectF = this.g;
        rectF.left = roundToInt;
        rectF.top = MathKt__MathJVMKt.roundToInt(((paddingTop - f8) / 2.0f) + getPaddingTop());
        rectF.right = MathKt__MathJVMKt.roundToInt(rectF.left + f7);
        rectF.bottom = MathKt__MathJVMKt.roundToInt(rectF.top + f8);
    }

    public final void setDrawable(Drawable drawable) {
        this.c = drawable;
        postInvalidate();
    }

    public final void setDrawableId(int i) {
        setDrawable(i != 0 ? DimensionKt.getDrawable(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        Integer valueOf = Integer.valueOf(android.R.attr.state_enabled);
        super.setEnabled(z);
        Drawable drawable = this.c;
        if (drawable != null) {
            int[] state = drawable.getState();
            state.getClass();
            ArrayList arrayList = new ArrayList(state.length);
            for (int i : state) {
                arrayList.add(Integer.valueOf(i));
            }
            if (!z) {
                arrayList.remove(valueOf);
            } else if (!arrayList.contains(valueOf)) {
                arrayList.add(valueOf);
            }
            drawable.setState(CollectionsKt.toIntArray(arrayList));
        }
    }

    public final void setScale(float f) {
        if (RecyclerView.DECELERATION_RATE > f || 1.0f < f) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("scale expected value in range 0.0 - 1.0, found ", f);
        } else {
            this.a = f;
            postInvalidate();
        }
    }

    public final void setShowVignette(boolean z) {
        this.d = z;
        postInvalidate();
    }

    public final void setVignetteColor(int i) {
        this.f.setColor(i);
        postInvalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuideView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuideView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ GuideView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
