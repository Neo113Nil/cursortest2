package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1518bA implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC1519bB A00;

    public ViewOnTouchListenerC1518bA(ViewOnClickListenerC1519bB viewOnClickListenerC1519bB) {
        this.A00 = viewOnClickListenerC1519bB;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
