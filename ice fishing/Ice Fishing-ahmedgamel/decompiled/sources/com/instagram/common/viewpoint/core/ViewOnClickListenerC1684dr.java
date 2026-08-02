package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1684dr implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C4V A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{89, 84, 80, 85, 84, 67};
    }

    public ViewOnClickListenerC1684dr(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1573c3 abstractC1573c3;
        AbstractC1573c3 abstractC1573c32;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1573c3 = this.A00.A02;
            if (abstractC1573c3 != null) {
                abstractC1573c32 = this.A00.A02;
                abstractC1573c32.A1B(A00(0, 6, 24));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
