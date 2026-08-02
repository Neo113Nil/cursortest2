package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1139Nv implements XN {
    public static byte[] A01;
    public static String[] A02 = {"RKj", "", "UN15gotjq8", "ajoBiEUEQKFJNLqm", "ifgUnXqkKiJSPGKzKRtyUVwCV1ynqJ", "MgNPOwYKG3krpOkrgoqalUsb7GIlLECG", "4d5pH5OlBXd1RidH0kkNXmSukCNaNWUQ", "ZdfTYbLhRFsUmKvgir0oysIbzYx0fUOP"};
    public final /* synthetic */ NO A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -7, -21, -23, -7, -29};
    }

    static {
        A01();
    }

    public C1139Nv(NO no) {
        this.A00 = no;
    }

    public /* synthetic */ C1139Nv(NO no, OV ov) {
        this(no);
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        boolean z6;
        boolean A0X;
        this.A00.A0g.setToolbarActionMessage(A00(0, 0, 19));
        this.A00.A0I();
        z6 = this.A00.A0d;
        if (z6) {
            A0X = this.A00.A0X();
            String[] strArr = A02;
            if (strArr[5].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            A02[4] = "QDC88FCswtzFK8CArK72WEL9jXMBl5";
            if (A0X) {
                this.A00.A0g.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0g.setToolbarActionMode(0);
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f2) {
        boolean z6;
        C1132No c1132No;
        boolean z9;
        AbstractC2025jd abstractC2025jd;
        float A04;
        AbstractC2025jd abstractC2025jd2;
        AbstractC2025jd abstractC2025jd3;
        boolean z10;
        AbstractC2025jd abstractC2025jd4;
        boolean z11;
        AbstractC2025jd abstractC2025jd5;
        this.A00.A0Q((int) f2);
        z6 = this.A00.A0e;
        if (!z6) {
            c1132No = this.A00.A0P;
            this.A00.A0g.setProgress(100.0f * (1.0f - (f2 / c1132No.A0C())));
            return;
        }
        z9 = this.A00.A0J;
        if (z9) {
            abstractC2025jd4 = this.A00.A0O;
            if (A02[6].charAt(27) != 'a') {
                throw new RuntimeException();
            }
            A02[4] = "3MuDy2E798EtOoHK0e0a3SiH1QgAy5";
            A04 = 1.0f - (f2 / abstractC2025jd4.A29().A0H().A03());
            z11 = this.A00.A0M;
            if (z11 || A04 < 1.0f) {
                this.A00.A0M = false;
                abstractC2025jd5 = this.A00.A0O;
                this.A00.A0g.setToolbarActionMessage(abstractC2025jd5.A2D().A06().replace(A00(0, 6, 117), String.valueOf((int) f2)));
            } else {
                this.A00.A0M = true;
                AbstractC1395Yb abstractC1395Yb = this.A00.A0g;
                String A00 = A00(0, 0, 19);
                if (A02[3].length() != 16) {
                    abstractC1395Yb.setToolbarActionMessage(A00);
                } else {
                    String[] strArr = A02;
                    strArr[5] = "wpbUz5ctYXHuYyRf6fVCU3uRzsMt7dE8";
                    strArr[7] = "BBfRd69Z77LUH69GeqVAIKhho7h2fuMA";
                    abstractC1395Yb.setToolbarActionMessage(A00);
                }
            }
        } else {
            abstractC2025jd = this.A00.A0O;
            A04 = 1.0f - (f2 / abstractC2025jd.A29().A0H().A04());
        }
        this.A00.A0g.setProgress(100.0f * A04);
        abstractC2025jd2 = this.A00.A0O;
        float A03 = abstractC2025jd2.A29().A0H().A03() - f2;
        abstractC2025jd3 = this.A00.A0O;
        float percentageOfReward = abstractC2025jd3.A29().A0H().A04();
        boolean z12 = A03 >= percentageOfReward;
        z10 = this.A00.A0M;
        if (!z10 && z12) {
            this.A00.A0g.setToolbarActionMode(1);
        }
    }
}
