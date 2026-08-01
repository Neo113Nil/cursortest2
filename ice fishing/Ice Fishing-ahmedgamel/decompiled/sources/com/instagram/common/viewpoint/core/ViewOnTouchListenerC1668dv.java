package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.dv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1668dv implements View.OnTouchListener {
    public final /* synthetic */ C4V A00;

    public ViewOnTouchListenerC1668dv(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        AbstractC1553c3 abstractC1553c3;
        AbstractC1553c3 abstractC1553c32;
        float x9 = motionEvent.getX();
        view2 = this.A00.A0H;
        if (x9 >= view2.getX()) {
            float x10 = motionEvent.getX();
            view3 = this.A00.A0H;
            float x11 = view3.getX();
            view4 = this.A00.A0H;
            if (x10 <= x11 + view4.getWidth()) {
                float y7 = motionEvent.getY();
                view5 = this.A00.A0H;
                if (y7 >= view5.getY()) {
                    float y9 = motionEvent.getY();
                    view6 = this.A00.A0H;
                    float y10 = view6.getY();
                    view7 = this.A00.A0H;
                    if (y9 <= y10 + view7.getHeight()) {
                        abstractC1553c3 = this.A00.A02;
                        if (abstractC1553c3 != null) {
                            abstractC1553c32 = this.A00.A02;
                            abstractC1553c32.dispatchTouchEvent(motionEvent);
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
