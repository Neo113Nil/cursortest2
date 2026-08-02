package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.d971;

/* loaded from: classes7.dex */
public abstract class bh2 extends FrameLayout {
    public final d971 a;

    public bh2(Context context) {
        super(context);
        this.a = new d971(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.a.b.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public d971 getTouchRecorder() {
        return this.a;
    }

    public bh2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new d971(context);
    }

    public bh2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new d971(context);
    }

    public bh2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new d971(context);
    }
}
