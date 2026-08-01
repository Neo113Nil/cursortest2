package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1500bC {
    public static void A00(View view, boolean z3, View.OnClickListener onClickListener) {
        if (!z3) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z3) {
                return;
            }
            ViewOnClickListenerC1499bB viewOnClickListenerC1499bB = new ViewOnClickListenerC1499bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1499bB);
            view.setOnTouchListener(new ViewOnTouchListenerC1498bA(viewOnClickListenerC1499bB));
        }
    }
}
