package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1520bC {
    public static void A00(View view, boolean z6, View.OnClickListener onClickListener) {
        if (!z6) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z6) {
                return;
            }
            ViewOnClickListenerC1519bB viewOnClickListenerC1519bB = new ViewOnClickListenerC1519bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1519bB);
            view.setOnTouchListener(new ViewOnTouchListenerC1518bA(viewOnClickListenerC1519bB));
        }
    }
}
