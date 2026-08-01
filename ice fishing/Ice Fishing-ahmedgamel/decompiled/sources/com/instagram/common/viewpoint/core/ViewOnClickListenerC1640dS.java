package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1640dS implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"aSVeS7GSTPGzGlwxFERzGOUaCHJkzI2z", "LLGylRAhThVIhIHAbih9tPBDCPjYJ3wk", "dAcv7uC7M3KkKHminzJu7oFLvmyzwOeo", "9GvayoE6VvkK0xgQDuyzQgqlx5rjdrnu", "wDDK", "nNoIeo5hKMcMuIwTTSmTqlLWYr2HGCGs", "Kjjrp4DquliSLC6MHV0dGTx7o2b6nbq3", "WO7dkLjdWbLrsRFVrNnfWInSuw6lOMDM"};
    public final /* synthetic */ C5F A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[0].charAt(19) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "ZS6NMOZ5iivoiIhrEAHYVVuLQariJbL8";
            strArr[5] = "6wgrAttfPWhTSI4WoHgDbqlH426fwJ7f";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 70);
            i10++;
        }
    }

    public static void A01() {
        byte[] bArr = {-54, -59, -59, -62, -72, -73, -56};
        if (A02[0].charAt(19) != 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "vsVzmfSe1AoNrvloOTDnivjLsCV7rctR";
        strArr[7] = "zSqcVhdNlZdzdn2RltwvtxLuLIPpuSoH";
        A01 = bArr;
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1640dS(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z3;
        C1589cd c1589cd;
        InterfaceC1660dm interfaceC1660dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            z3 = this.A00.A0K;
            if (!z3) {
                c1589cd = this.A00.A0H;
                c1589cd.A02(A00(0, 7, 16));
                interfaceC1660dm = this.A00.A0Z;
                interfaceC1660dm.ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
