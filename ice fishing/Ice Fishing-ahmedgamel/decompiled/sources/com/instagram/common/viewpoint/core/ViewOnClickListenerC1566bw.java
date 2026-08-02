package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1566bw implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1043Kc A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 5);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{66, 70, 74, 76, 78};
    }

    public ViewOnClickListenerC1566bw(C1043Kc c1043Kc) {
        this.A00 = c1043Kc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 46));
            if (((AbstractC1573c3) this.A00).A07.A0D() != null) {
                ((AbstractC1573c3) this.A00).A07.A0D().ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
