package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class MF implements InterfaceC1425Zf {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ AbstractC1423Zd A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, 13, 15, 76, 4, 3, 1, 7, 0, 13, 13, 9, 76, 3, 6, 17, 76, 3, 6, 16, 7, 18, 13, 16, 22, 11, 12, 5, 76, 36, 43, 44, 43, 49, 42, 61, 35, 38, 61, 48, 39, 50, 45, 48, 54, 43, 44, 37, 61, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public MF(AbstractC1423Zd abstractC1423Zd) {
        this.A00 = abstractC1423Zd;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1425Zf
    public final void A53() {
        InterfaceC1401Yh interfaceC1401Yh;
        InterfaceC1401Yh interfaceC1401Yh2;
        interfaceC1401Yh = this.A00.A09;
        if (interfaceC1401Yh == null) {
            return;
        }
        interfaceC1401Yh2 = this.A00.A09;
        interfaceC1401Yh2.A4j(A00(0, 53, 115));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1425Zf
    public final void A54() {
        InterfaceC1402Yi interfaceC1402Yi;
        InterfaceC1422Zc interfaceC1422Zc;
        InterfaceC1422Zc interfaceC1422Zc2;
        InterfaceC1402Yi interfaceC1402Yi2;
        this.A00.A0P();
        interfaceC1402Yi = this.A00.A0A;
        if (interfaceC1402Yi != null) {
            interfaceC1402Yi2 = this.A00.A0A;
            interfaceC1402Yi2.AFi(true);
        }
        interfaceC1422Zc = this.A00.A05;
        if (interfaceC1422Zc != null) {
            interfaceC1422Zc2 = this.A00.A05;
            interfaceC1422Zc2.ACr();
        }
        this.A00.A0E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1425Zf
    public final void A9c() {
        C1154Ok c1154Ok;
        C1154Ok c1154Ok2;
        C1154Ok c1154Ok3;
        C1860gi c1860gi;
        c1154Ok = this.A00.A04;
        if (c1154Ok == null) {
            A54();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        AbstractC1423Zd.A03(this.A00);
        c1154Ok2 = this.A00.A04;
        if (c1154Ok2.A02() != null) {
            AbstractC1423Zd abstractC1423Zd = this.A00;
            c1154Ok3 = this.A00.A04;
            abstractC1423Zd.A0H(c1154Ok3.A02());
        } else {
            this.A00.A0F();
        }
        c1860gi = this.A00.A07;
        if (C1310Up.A2Z(c1860gi)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1425Zf
    public final void AAp() {
        C1150Og c1150Og;
        C1153Oj c1153Oj;
        C1860gi c1860gi;
        C1150Og c1150Og2;
        String str;
        c1150Og = this.A00.A06;
        if (!TextUtils.isEmpty(c1150Og.A0I())) {
            X6 x62 = new X6();
            c1860gi = this.A00.A07;
            c1150Og2 = this.A00.A06;
            Uri A00 = XB.A00(c1150Og2.A0I());
            str = this.A00.A0B;
            X6.A0O(x62, c1860gi, A00, str);
        }
        c1153Oj = this.A00.A03;
        c1153Oj.A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1425Zf
    public final void AAq() {
        InterfaceC1402Yi interfaceC1402Yi;
        C1150Og c1150Og;
        C1153Oj c1153Oj;
        C1860gi c1860gi;
        C1150Og c1150Og2;
        String str;
        InterfaceC1402Yi interfaceC1402Yi2;
        this.A00.A0P();
        interfaceC1402Yi = this.A00.A0A;
        if (interfaceC1402Yi != null) {
            interfaceC1402Yi2 = this.A00.A0A;
            interfaceC1402Yi2.AFi(true);
        }
        c1150Og = this.A00.A06;
        if (!TextUtils.isEmpty(c1150Og.A0C())) {
            X6 x62 = new X6();
            c1860gi = this.A00.A07;
            c1150Og2 = this.A00.A06;
            Uri A00 = XB.A00(c1150Og2.A0C());
            str = this.A00.A0B;
            X6.A0O(x62, c1860gi, A00, str);
        }
        c1153Oj = this.A00.A03;
        c1153Oj.A06();
        this.A00.A0E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1425Zf
    public final void AEr(EnumC1152Oi enumC1152Oi) {
        EnumC1152Oi enumC1152Oi2;
        C1150Og c1150Og;
        C1154Ok A0B;
        C1150Og c1150Og2;
        C1150Og c1150Og3;
        AbstractC1423Zd.A02(this.A00);
        this.A00.A02 = enumC1152Oi;
        enumC1152Oi2 = this.A00.A02;
        if (enumC1152Oi2 != EnumC1152Oi.A04) {
            AbstractC1423Zd abstractC1423Zd = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c1150Og2 = abstractC1423Zd.A06;
                A0B = c1150Og2.A0B();
            } else {
                c1150Og = abstractC1423Zd.A06;
                A0B = c1150Og.A0B();
            }
        } else {
            c1150Og3 = this.A00.A06;
            A0B = c1150Og3.A0A();
        }
        AbstractC1423Zd abstractC1423Zd2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        abstractC1423Zd2.A0H(A0B);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1425Zf
    public final void AF4(C1154Ok c1154Ok) {
        C1153Oj c1153Oj;
        AbstractC1423Zd.A02(this.A00);
        c1153Oj = this.A00.A03;
        c1153Oj.A07(c1154Ok.A01());
        if (!c1154Ok.A05().isEmpty()) {
            AbstractC1423Zd abstractC1423Zd = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
            strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
            abstractC1423Zd.A0H(c1154Ok);
            return;
        }
        this.A00.A0G(c1154Ok);
    }
}
