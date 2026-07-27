package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class VT implements View.OnTouchListener {
    public final /* synthetic */ C1323Vz A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public VT(C1323Vz c1323Vz, boolean z8, boolean z9) {
        this.A00 = c1323Vz;
        this.A02 = z8;
        this.A01 = z9;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1839gi c1839gi;
        if (this.A02) {
            return false;
        }
        if (!this.A01) {
            return true;
        }
        c1839gi = this.A00.A04;
        if (C1289Up.A1X(c1839gi)) {
            return false;
        }
        return true;
    }
}
