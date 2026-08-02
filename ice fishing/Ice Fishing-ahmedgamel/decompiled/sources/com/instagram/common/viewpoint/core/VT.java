package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class VT implements View.OnTouchListener {
    public final /* synthetic */ C1344Vz A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public VT(C1344Vz c1344Vz, boolean z6, boolean z9) {
        this.A00 = c1344Vz;
        this.A02 = z6;
        this.A01 = z9;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1860gi c1860gi;
        if (this.A02) {
            return false;
        }
        if (!this.A01) {
            return true;
        }
        c1860gi = this.A00.A04;
        if (C1310Up.A1X(c1860gi)) {
            return false;
        }
        return true;
    }
}
