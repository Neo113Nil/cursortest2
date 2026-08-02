package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1659dR implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C5F A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{20, 23, 23, 24, 39, 20, 28, 31, 38};
    }

    public ViewOnClickListenerC1659dR(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z6;
        C1609cd c1609cd;
        InterfaceC1680dm interfaceC1680dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            z6 = this.A00.A0K;
            if (!z6) {
                c1609cd = this.A00.A0H;
                c1609cd.A02(A00(0, 9, 103));
                interfaceC1680dm = this.A00.A0Z;
                interfaceC1680dm.ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
