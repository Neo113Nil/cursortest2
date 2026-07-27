package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1660dn implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C06484x A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{39, 42, 46, 43, 42, 61};
    }

    public ViewOnClickListenerC1660dn(C06484x c06484x) {
        this.A00 = c06484x;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1552c3 abstractC1552c3;
        AbstractC1552c3 abstractC1552c32;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1552c3 = this.A00.A00;
            if (abstractC1552c3 != null) {
                abstractC1552c32 = this.A00.A00;
                abstractC1552c32.A1B(A00(0, 6, 53));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
