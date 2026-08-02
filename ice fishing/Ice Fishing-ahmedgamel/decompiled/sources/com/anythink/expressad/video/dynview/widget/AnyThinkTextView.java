package com.anythink.expressad.video.dynview.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class AnyThinkTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private ObjectAnimator f22200a;

    public AnyThinkTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f22200a;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f22200a;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f22200a = objectAnimator;
    }

    public AnyThinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
