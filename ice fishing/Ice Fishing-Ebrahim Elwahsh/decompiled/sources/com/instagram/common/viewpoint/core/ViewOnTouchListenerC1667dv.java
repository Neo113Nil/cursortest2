package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.dv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1667dv implements View.OnTouchListener {
    public final /* synthetic */ C4V A00;

    public ViewOnTouchListenerC1667dv(C4V c4v) {
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
        AbstractC1552c3 abstractC1552c3;
        AbstractC1552c3 abstractC1552c32;
        float x3 = motionEvent.getX();
        view2 = this.A00.A0H;
        if (x3 >= view2.getX()) {
            float x9 = motionEvent.getX();
            view3 = this.A00.A0H;
            float x10 = view3.getX();
            view4 = this.A00.A0H;
            if (x9 <= x10 + view4.getWidth()) {
                float y6 = motionEvent.getY();
                view5 = this.A00.A0H;
                if (y6 >= view5.getY()) {
                    float y8 = motionEvent.getY();
                    view6 = this.A00.A0H;
                    float y9 = view6.getY();
                    view7 = this.A00.A0H;
                    if (y8 <= y9 + view7.getHeight()) {
                        abstractC1552c3 = this.A00.A02;
                        if (abstractC1552c3 != null) {
                            abstractC1552c32 = this.A00.A02;
                            abstractC1552c32.dispatchTouchEvent(motionEvent);
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
