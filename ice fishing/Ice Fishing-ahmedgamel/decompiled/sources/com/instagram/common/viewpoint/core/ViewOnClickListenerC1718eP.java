package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1718eP implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1721eS A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{4, 15, 5, 2, 0, 19, 5, 18};
    }

    public ViewOnClickListenerC1718eP(C1721eS c1721eS) {
        this.A00 = c1721eS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC1058Kr viewOnClickListenerC1058Kr;
        ViewOnClickListenerC1058Kr viewOnClickListenerC1058Kr2;
        if (WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC1058Kr = this.A00.A0l;
            if (viewOnClickListenerC1058Kr == null) {
                return;
            }
            viewOnClickListenerC1058Kr2 = this.A00.A0l;
            viewOnClickListenerC1058Kr2.A0E(A00(0, 8, 44));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
