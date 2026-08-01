package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1715eh implements View.OnTouchListener {
    public final /* synthetic */ C0877Ek A00;

    public ViewOnTouchListenerC1715eh(C0877Ek c0877Ek) {
        this.A00 = c0877Ek;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        UM um;
        um = this.A00.A0C;
        um.A02(new C0861Du(view, motionEvent));
        return false;
    }
}
