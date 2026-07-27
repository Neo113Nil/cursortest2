package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class MF implements InterfaceC1404Zf {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ AbstractC1402Zd A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, 13, 15, 76, 4, 3, 1, 7, 0, 13, 13, 9, 76, 3, 6, 17, 76, 3, 6, 16, 7, 18, 13, 16, 22, 11, 12, 5, 76, 36, 43, 44, 43, 49, 42, 61, 35, 38, 61, 48, 39, 50, 45, 48, 54, 43, 44, 37, 61, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public MF(AbstractC1402Zd abstractC1402Zd) {
        this.A00 = abstractC1402Zd;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1404Zf
    public final void A53() {
        InterfaceC1380Yh interfaceC1380Yh;
        InterfaceC1380Yh interfaceC1380Yh2;
        interfaceC1380Yh = this.A00.A09;
        if (interfaceC1380Yh == null) {
            return;
        }
        interfaceC1380Yh2 = this.A00.A09;
        interfaceC1380Yh2.A4j(A00(0, 53, 115));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1404Zf
    public final void A54() {
        InterfaceC1381Yi interfaceC1381Yi;
        InterfaceC1401Zc interfaceC1401Zc;
        InterfaceC1401Zc interfaceC1401Zc2;
        InterfaceC1381Yi interfaceC1381Yi2;
        this.A00.A0P();
        interfaceC1381Yi = this.A00.A0A;
        if (interfaceC1381Yi != null) {
            interfaceC1381Yi2 = this.A00.A0A;
            interfaceC1381Yi2.AFi(true);
        }
        interfaceC1401Zc = this.A00.A05;
        if (interfaceC1401Zc != null) {
            interfaceC1401Zc2 = this.A00.A05;
            interfaceC1401Zc2.ACr();
        }
        this.A00.A0E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1404Zf
    public final void A9c() {
        C1133Ok c1133Ok;
        C1133Ok c1133Ok2;
        C1133Ok c1133Ok3;
        C1839gi c1839gi;
        c1133Ok = this.A00.A04;
        if (c1133Ok == null) {
            A54();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        AbstractC1402Zd.A03(this.A00);
        c1133Ok2 = this.A00.A04;
        if (c1133Ok2.A02() != null) {
            AbstractC1402Zd abstractC1402Zd = this.A00;
            c1133Ok3 = this.A00.A04;
            abstractC1402Zd.A0H(c1133Ok3.A02());
        } else {
            this.A00.A0F();
        }
        c1839gi = this.A00.A07;
        if (C1289Up.A2Z(c1839gi)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1404Zf
    public final void AAp() {
        C1129Og c1129Og;
        C1132Oj c1132Oj;
        C1839gi c1839gi;
        C1129Og c1129Og2;
        String str;
        c1129Og = this.A00.A06;
        if (!TextUtils.isEmpty(c1129Og.A0I())) {
            X6 x62 = new X6();
            c1839gi = this.A00.A07;
            c1129Og2 = this.A00.A06;
            Uri A00 = XB.A00(c1129Og2.A0I());
            str = this.A00.A0B;
            X6.A0O(x62, c1839gi, A00, str);
        }
        c1132Oj = this.A00.A03;
        c1132Oj.A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1404Zf
    public final void AAq() {
        InterfaceC1381Yi interfaceC1381Yi;
        C1129Og c1129Og;
        C1132Oj c1132Oj;
        C1839gi c1839gi;
        C1129Og c1129Og2;
        String str;
        InterfaceC1381Yi interfaceC1381Yi2;
        this.A00.A0P();
        interfaceC1381Yi = this.A00.A0A;
        if (interfaceC1381Yi != null) {
            interfaceC1381Yi2 = this.A00.A0A;
            interfaceC1381Yi2.AFi(true);
        }
        c1129Og = this.A00.A06;
        if (!TextUtils.isEmpty(c1129Og.A0C())) {
            X6 x62 = new X6();
            c1839gi = this.A00.A07;
            c1129Og2 = this.A00.A06;
            Uri A00 = XB.A00(c1129Og2.A0C());
            str = this.A00.A0B;
            X6.A0O(x62, c1839gi, A00, str);
        }
        c1132Oj = this.A00.A03;
        c1132Oj.A06();
        this.A00.A0E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1404Zf
    public final void AEr(EnumC1131Oi enumC1131Oi) {
        EnumC1131Oi enumC1131Oi2;
        C1129Og c1129Og;
        C1133Ok A0B;
        C1129Og c1129Og2;
        C1129Og c1129Og3;
        AbstractC1402Zd.A02(this.A00);
        this.A00.A02 = enumC1131Oi;
        enumC1131Oi2 = this.A00.A02;
        if (enumC1131Oi2 != EnumC1131Oi.A04) {
            AbstractC1402Zd abstractC1402Zd = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c1129Og2 = abstractC1402Zd.A06;
                A0B = c1129Og2.A0B();
            } else {
                c1129Og = abstractC1402Zd.A06;
                A0B = c1129Og.A0B();
            }
        } else {
            c1129Og3 = this.A00.A06;
            A0B = c1129Og3.A0A();
        }
        AbstractC1402Zd abstractC1402Zd2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        abstractC1402Zd2.A0H(A0B);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1404Zf
    public final void AF4(C1133Ok c1133Ok) {
        C1132Oj c1132Oj;
        AbstractC1402Zd.A02(this.A00);
        c1132Oj = this.A00.A03;
        c1132Oj.A07(c1133Ok.A01());
        if (!c1133Ok.A05().isEmpty()) {
            AbstractC1402Zd abstractC1402Zd = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
            strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
            abstractC1402Zd.A0H(c1133Ok);
            return;
        }
        this.A00.A0G(c1133Ok);
    }
}
