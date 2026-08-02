package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.WindowManager;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.n2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2220n2 implements G5 {
    public static byte[] A01;
    public final WindowManager A00;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-7, -21, -16, -26, -15, -7};
    }

    public C2220n2(WindowManager windowManager) {
        this.A00 = windowManager;
    }

    public static C2220n2 A00(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(A01(0, 6, 15));
        if (windowManager != null) {
            return new C2220n2(windowManager);
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.G5
    public final void AHX(G4 g42) {
        g42.ADd(this.A00.getDefaultDisplay());
    }

    @Override // com.instagram.common.viewpoint.core.G5
    public final void AKW() {
    }
}
