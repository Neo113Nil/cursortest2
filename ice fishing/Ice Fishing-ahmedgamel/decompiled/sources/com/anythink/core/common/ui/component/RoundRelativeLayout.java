package com.anythink.core.common.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.anythink.core.common.v.am;

/* loaded from: classes.dex */
public class RoundRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    int f17340a;

    public RoundRelativeLayout(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.f17340a = dip2px(context, 4.0f);
    }

    public static int dip2px(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.draw(canvas);
        am.a(canvas, getWidth(), getHeight(), this.f17340a);
        canvas.restoreToCount(saveLayer);
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17340a = dip2px(context, 4.0f);
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        this(context);
    }
}
