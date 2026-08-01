package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1690eH implements View.OnTouchListener {
    public final /* synthetic */ C1691eI A00;

    public ViewOnTouchListenerC1690eH(C1691eI c1691eI) {
        this.A00 = c1691eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VA va;
        AbstractC2005jd abstractC2005jd;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C1691eI.A00(this.A00);
            va = this.A00.A06;
            abstractC2005jd = this.A00.A03;
            va.ABp(abstractC2005jd.A2E(), new C1497b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
