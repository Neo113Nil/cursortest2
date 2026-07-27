package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1697eP implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1700eS A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{4, 15, 5, 2, 0, 19, 5, 18};
    }

    public ViewOnClickListenerC1697eP(C1700eS c1700eS) {
        this.A00 = c1700eS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC1037Kr viewOnClickListenerC1037Kr;
        ViewOnClickListenerC1037Kr viewOnClickListenerC1037Kr2;
        if (WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC1037Kr = this.A00.A0l;
            if (viewOnClickListenerC1037Kr == null) {
                return;
            }
            viewOnClickListenerC1037Kr2 = this.A00.A0l;
            viewOnClickListenerC1037Kr2.A0E(A00(0, 8, 44));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
