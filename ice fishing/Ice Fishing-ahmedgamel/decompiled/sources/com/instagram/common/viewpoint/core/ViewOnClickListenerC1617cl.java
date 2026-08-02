package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1617cl implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1023Ji A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{18, 23, 23, 22, 7, 18, 26, 31, 0};
    }

    public ViewOnClickListenerC1617cl(C1023Ji c1023Ji) {
        this.A00 = c1023Ji;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1577c7 c1577c7;
        C1577c7 c1577c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0p(A00(0, 9, 105));
            c1577c7 = this.A00.A0b;
            if (c1577c7.A0D() != null) {
                c1577c72 = this.A00.A0b;
                c1577c72.A0D().ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
