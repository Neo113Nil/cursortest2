package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1681dn implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C06694x A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{39, 42, 46, 43, 42, 61};
    }

    public ViewOnClickListenerC1681dn(C06694x c06694x) {
        this.A00 = c06694x;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1573c3 abstractC1573c3;
        AbstractC1573c3 abstractC1573c32;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1573c3 = this.A00.A00;
            if (abstractC1573c3 != null) {
                abstractC1573c32 = this.A00.A00;
                abstractC1573c32.A1B(A00(0, 6, 53));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
