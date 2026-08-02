package com.anythink.basead.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.anythink.core.common.v.am;

/* loaded from: classes.dex */
public class RoundFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    int f11453a;

    public RoundFrameLayout(Context context) {
        super(context);
        this.f11453a = dip2px(getContext(), 10.0f);
    }

    public static int dip2px(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        am.a(canvas, getWidth(), getHeight(), this.f11453a);
        canvas.restoreToCount(saveLayer);
    }

    public void setRadius(int i) {
        this.f11453a = dip2px(getContext(), i);
        postInvalidate();
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11453a = dip2px(getContext(), 10.0f);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11453a = dip2px(getContext(), 10.0f);
    }
}
