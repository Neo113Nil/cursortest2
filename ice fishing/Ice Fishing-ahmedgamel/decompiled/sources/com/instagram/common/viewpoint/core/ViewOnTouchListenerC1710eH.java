package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1710eH implements View.OnTouchListener {
    public final /* synthetic */ C1711eI A00;

    public ViewOnTouchListenerC1710eH(C1711eI c1711eI) {
        this.A00 = c1711eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VA va;
        AbstractC2025jd abstractC2025jd;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C1711eI.A00(this.A00);
            va = this.A00.A06;
            abstractC2025jd = this.A00.A03;
            va.ABp(abstractC2025jd.A2E(), new C1517b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
