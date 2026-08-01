package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class VT implements View.OnTouchListener {
    public final /* synthetic */ C1324Vz A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public VT(C1324Vz c1324Vz, boolean z3, boolean z6) {
        this.A00 = c1324Vz;
        this.A02 = z3;
        this.A01 = z6;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1840gi c1840gi;
        if (this.A02) {
            return false;
        }
        if (!this.A01) {
            return true;
        }
        c1840gi = this.A00.A04;
        if (C1290Up.A1X(c1840gi)) {
            return false;
        }
        return true;
    }
}
