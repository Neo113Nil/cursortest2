package com.instagram.common.viewpoint.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class NA extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC2056k8 A00;
    public N9 A01;
    public C1860gi A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 66, 78, 76, 15, 71, c.f17104b, 66, 68, 67, 78, 78, 74, 15, c.f17104b, 69, 82, 15, 67, c.f17104b, 79, 79, 68, 83, 15, 66, 77, 72, 66, 74, 68, 69};
    }

    public NA(C1860gi c1860gi, String str, InterfaceC2056k8 interfaceC2056k8, N9 n9) {
        this.A02 = c1860gi;
        this.A03 = str;
        this.A01 = n9;
        this.A00 = interfaceC2056k8;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        P2.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        P2.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 83);
        String[] parts = action.split(intentAction);
        String str = parts[0];
        if (str == null) {
            return;
        }
        String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ADC(this.A00);
        }
    }
}
