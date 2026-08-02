package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import defpackage.d971;

/* loaded from: classes7.dex */
public abstract class dh2 extends RelativeLayout {
    private final d971 a;

    public dh2(Context context) {
        super(context);
        this.a = new d971(context);
    }

    public final d971 a() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.a.b.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public dh2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new d971(context);
    }

    public dh2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new d971(context);
    }
}
