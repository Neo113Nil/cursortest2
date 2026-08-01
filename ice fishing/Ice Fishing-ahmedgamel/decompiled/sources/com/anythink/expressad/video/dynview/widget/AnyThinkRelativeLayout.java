package com.anythink.expressad.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class AnyThinkRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f21398a;

    /* renamed from: b, reason: collision with root package name */
    private AnimatorSet f21399b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21400c;

    public AnyThinkRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f21399b;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f21398a) {
            this.f21398a = true;
        }
        AnimatorSet animatorSet = this.f21399b;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f21399b = animatorSet;
    }

    public AnyThinkRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
