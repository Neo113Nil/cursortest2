package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.db, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1669db implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass55 A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{115, 104, 104, 107, 101, 102, 117};
    }

    public ViewOnClickListenerC1669db(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z6;
        InterfaceC1680dm interfaceC1680dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            z6 = this.A00.A0D;
            if (!z6) {
                this.A00.A0t(A00(0, 7, 8));
                interfaceC1680dm = this.A00.A0Z;
                interfaceC1680dm.ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
