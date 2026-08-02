package com.yandex.plus.home.animation;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.ocg;
import defpackage.pjt;
import defpackage.tf6;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class f extends View {
    public final com.yandex.plus.home.feature.panel.internalapi.c a;
    public final float b;
    public final e c;
    public final RectF d;
    public final tf6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, @NotNull com.yandex.plus.home.feature.panel.internalapi.c cVar, @NotNull kotlinx.coroutines.a aVar) {
        super(context);
        context.getClass();
        cVar.getClass();
        aVar.getClass();
        this.a = cVar;
        this.d = new RectF();
        this.e = r1.f(this, aVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, com.yandex.plus.home.core.design.a.b, R.attr.plus_sdk_shimmerViewStyle, R.style.PlusSDK_Widget_ShimmerView);
        obtainStyledAttributes.getClass();
        ocg.s(obtainStyledAttributes, 0);
        this.b = obtainStyledAttributes.getDimension(0, 0.0f);
        ocg.s(obtainStyledAttributes, 2);
        int color = obtainStyledAttributes.getColor(2, 0);
        ocg.s(obtainStyledAttributes, 1);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        context.getTheme().getClass();
        this.c = new e(TypedValue.complexToDimensionPixelSize(com.yandex.plus.bdui.plus.analytics.b.v(R.attr.plus_sdk_shimmerWidth, r4).data, context.getTheme().getResources().getDisplayMetrics()), color, color2, r1.q(this));
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.yandex.plus.bdui.flex.ui.a.j(((s) this.a).y(this, false), this.e, new pjt(this, null, 26));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        e eVar = this.c;
        ValueAnimator valueAnimator = eVar.c;
        if (valueAnimator.getValues() != null) {
            PropertyValuesHolder[] values = valueAnimator.getValues();
            values.getClass();
            if (values.length != 0) {
                valueAnimator.setCurrentPlayTime(AnimationUtils.currentAnimationTimeMillis() - eVar.e);
            }
        }
        postInvalidateOnAnimation();
        RectF rectF = this.d;
        float f = this.b;
        canvas.drawRoundRect(rectF, f, f, eVar);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.c.a(this);
        this.d.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
    }
}
