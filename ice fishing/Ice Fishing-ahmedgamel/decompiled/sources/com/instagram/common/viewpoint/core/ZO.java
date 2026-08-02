package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class ZO implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"Rngvbb3vMR3b56rBexb50Rjom5JamLMR", "BOyMrOLOVyOlAA7tdLfD", "PSvH7Ca0GqwbJXrw1OxZU20X4aHcam0S", "dzm7VVMnrqblx5opBv2tkfICkL24O513", "rKXY71", "THxRt8Yss0BlXBXFFRIVlNUaizFLAmop", "EnNQl89tpWVbcex4LtQ2YfadlOVOSM9k", "1aWdi1c8aZwiTk2zvtk8Xc2vTbtrER0G"};
    public final /* synthetic */ MI A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{0, 21, 2, 22, 31, 2, 29, 51, 4, 17, 51, 28, 25, 19, 27};
    }

    static {
        A01();
    }

    public ZO(MI mi) {
        this.A00 = mi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1401Yh interfaceC1401Yh;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1401Yh = this.A00.A06;
            interfaceC1401Yh.A4j(A00(0, 15, 86));
        } catch (Throwable th) {
            WU.A00(th, this);
            String[] strArr = A02;
            if (strArr[7].charAt(31) == strArr[5].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "qnEa0qqxoU4sFli1HS9Y3SbmuU3eBkbM";
            strArr2[0] = "NnijgEsxsjK8xKe1vFUOE7dsdCVZHTLh";
        }
    }
}
