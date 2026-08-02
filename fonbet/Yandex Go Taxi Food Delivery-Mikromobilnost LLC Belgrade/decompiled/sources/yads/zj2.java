package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RatingBar;
import defpackage.kp81;

/* loaded from: classes15.dex */
public class zj2 extends RatingBar implements kp81 {
    public zj2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return isClickable() && motionEvent.getAction() == 0;
    }

    @Override // android.widget.RatingBar, defpackage.kp81
    public void setRating(float f) {
        super.setRating(f);
    }

    public zj2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public zj2(Context context) {
        super(context);
    }
}
