package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1661dn implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C06494x A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{39, 42, 46, 43, 42, 61};
    }

    public ViewOnClickListenerC1661dn(C06494x c06494x) {
        this.A00 = c06494x;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1553c3 abstractC1553c3;
        AbstractC1553c3 abstractC1553c32;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1553c3 = this.A00.A00;
            if (abstractC1553c3 != null) {
                abstractC1553c32 = this.A00.A00;
                abstractC1553c32.A1B(A00(0, 6, 53));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
