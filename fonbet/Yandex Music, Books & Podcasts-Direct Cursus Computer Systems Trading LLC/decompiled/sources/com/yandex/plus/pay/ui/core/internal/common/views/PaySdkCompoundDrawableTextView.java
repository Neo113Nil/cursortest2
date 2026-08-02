package com.yandex.plus.pay.ui.core.internal.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.plus.pay.ui.core.tarifficator.mobile.a;
import defpackage.xz0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class PaySdkCompoundDrawableTextView extends AppCompatTextView {
    public final int h;
    public final int i;
    public final boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaySdkCompoundDrawableTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, i, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.j = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        p();
    }

    public final void p() {
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        compoundDrawablesRelative.getClass();
        for (Drawable drawable : xz0.w(compoundDrawablesRelative)) {
            Rect bounds = drawable.getBounds();
            bounds.getClass();
            int width = bounds.width();
            int height = bounds.height();
            int i = this.h;
            if (i <= 0) {
                i = width;
            }
            int i2 = this.i;
            if (i2 <= 0) {
                i2 = height;
            }
            if (this.j && height > 0) {
                double d = width / height;
                if (i > i2) {
                    i2 = (int) (i / d);
                } else {
                    i = (int) (i2 * d);
                }
            }
            bounds.right = bounds.left + i;
            bounds.bottom = bounds.top + i2;
            drawable.setBounds(bounds);
        }
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public final void setDrawableEnd(int i) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
        p();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaySdkCompoundDrawableTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ PaySdkCompoundDrawableTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaySdkCompoundDrawableTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
