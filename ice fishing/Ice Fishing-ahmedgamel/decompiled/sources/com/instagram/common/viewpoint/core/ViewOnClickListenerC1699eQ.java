package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1699eQ implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1701eS A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 22, 18, 21, 22, 35};
    }

    public ViewOnClickListenerC1699eQ(C1701eS c1701eS) {
        this.A00 = c1701eS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr;
        ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr2;
        if (WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC1038Kr = this.A00.A0l;
            if (viewOnClickListenerC1038Kr == null) {
                return;
            }
            viewOnClickListenerC1038Kr2 = this.A00.A0l;
            viewOnClickListenerC1038Kr2.A0E(A00(0, 6, 115));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
