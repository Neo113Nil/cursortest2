package com.anythink.core.common.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.anythink.core.common.res.image.RecycleImageView;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class RoundImageView extends RecycleImageView {

    /* renamed from: a, reason: collision with root package name */
    int f16551a;

    /* renamed from: b, reason: collision with root package name */
    boolean f16552b;

    public RoundImageView(Context context) {
        super(context);
        this.f16551a = q.a(getContext(), 5.0f);
    }

    @Override // com.anythink.core.common.res.image.RecycleImageView, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (this.f16552b) {
                canvas2 = canvas;
                try {
                    int saveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                    super.dispatchDraw(canvas2);
                    canvas2.translate(getPaddingLeft(), getPaddingTop());
                    am.a(canvas2, getWidth() - (getPaddingLeft() * 2), getHeight() - (getPaddingTop() * 2), this.f16551a);
                    canvas2.restoreToCount(saveLayer);
                    return;
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        canvas2 = canvas;
        super.dispatchDraw(canvas2);
    }

    @Override // com.anythink.core.common.res.image.RecycleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (this.f16552b) {
                canvas2 = canvas;
                try {
                    int saveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                    super.onDraw(canvas2);
                    canvas2.translate(getPaddingLeft(), getPaddingTop());
                    am.a(canvas2, getWidth() - (getPaddingLeft() * 2), getHeight() - (getPaddingTop() * 2), this.f16551a);
                    canvas2.restoreToCount(saveLayer);
                    return;
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        canvas2 = canvas;
        super.onDraw(canvas2);
    }

    public void setNeedRadiu(boolean z3) {
        this.f16552b = z3;
    }

    public void setRadiusInDip(int i) {
        this.f16551a = q.a(getContext(), i);
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16551a = q.a(getContext(), 5.0f);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16551a = q.a(getContext(), 5.0f);
    }
}
