package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class NP implements InterfaceC1709eG {
    public static byte[] A01;
    public static String[] A02 = {"BHXiYjXxfgjD7yDB", "kPfw5HKETqo8dV", "SlBKzsC69frNfTspgJs5v90302jxH173", "0t7u2eeKUCj5gcxeWZIOCTpidMAeGJtt", "hTXrvsDVbOi3Q9xrUBZOJj7T", "iLbLRTjnBQIJ87KFXaIFUijyWt7EPIGc", "0utayShxEdwMeaV3UZeoWviAuyaBWRmj", "gyVOCm6F1v6TZALkbG"};
    public final /* synthetic */ NO A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    static {
        A01();
    }

    public NP(NO no) {
        this.A00 = no;
    }

    public /* synthetic */ NP(NO no, OV ov) {
        this(no);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1709eG
    public final void ADX() {
        this.A00.A0W(true, A00(0, 9, 106));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1709eG
    public final void AEA() {
        boolean z6;
        AbstractC2025jd abstractC2025jd;
        InterfaceC1401Yh interfaceC1401Yh;
        ZU zu;
        VA va;
        AbstractC2025jd abstractC2025jd2;
        C1711eI c1711eI;
        C1711eI c1711eI2;
        C1860gi c1860gi;
        ZU zu2;
        AbstractC2025jd abstractC2025jd3;
        AbstractC2025jd abstractC2025jd4;
        C1860gi c1860gi2;
        AbstractC2025jd abstractC2025jd5;
        AbstractC2025jd abstractC2025jd6;
        C1860gi c1860gi3;
        C1132No c1132No;
        C1860gi c1860gi4;
        C1860gi c1860gi5;
        z6 = this.A00.A0f;
        if (!z6) {
            abstractC2025jd = this.A00.A0O;
            if (!TextUtils.isEmpty(abstractC2025jd.A2E())) {
                va = this.A00.A0S;
                abstractC2025jd2 = this.A00.A0O;
                String A2E = abstractC2025jd2.A2E();
                C1517b9 c1517b9 = new C1517b9();
                c1711eI = this.A00.A0B;
                C1517b9 A03 = c1517b9.A03(c1711eI.getViewabilityChecker());
                c1711eI2 = this.A00.A0B;
                va.ABJ(A2E, A03.A02(c1711eI2.getTouchDataRecorder()).A05());
                c1860gi = this.A00.A0R;
                C1356Wl A00 = C1356Wl.A00(c1860gi);
                zu2 = this.A00.A0X;
                String A8l = zu2.A8l();
                abstractC2025jd3 = this.A00.A0O;
                A00.A0E(A8l, abstractC2025jd3.A2E());
                abstractC2025jd4 = this.A00.A0O;
                C1124Ng A2A = abstractC2025jd4.A2A();
                c1860gi2 = this.A00.A0R;
                C1124Ng.A07(A2A, c1860gi2);
                abstractC2025jd5 = this.A00.A0O;
                String A0y = abstractC2025jd5.A0y();
                abstractC2025jd6 = this.A00.A0O;
                AbstractC1144Oa.A02(A0y, AbstractC1380Xm.A00(abstractC2025jd6.A10()));
                c1860gi3 = this.A00.A0R;
                c1860gi3.A0F().A3L();
                c1132No = this.A00.A0P;
                if (c1132No.A0c()) {
                    c1860gi4 = this.A00.A0R;
                    c1860gi4.A0F().AES();
                }
            }
            NO no = this.A00;
            String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            interfaceC1401Yh = no.A0W;
            zu = this.A00.A0X;
            interfaceC1401Yh.A4j(zu.A8G());
            return;
        }
        c1860gi5 = this.A00.A0R;
        c1860gi5.A0F().AET();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1709eG
    public final void AEh() {
        InterfaceC1401Yh interfaceC1401Yh;
        ZU zu;
        interfaceC1401Yh = this.A00.A0W;
        zu = this.A00.A0X;
        interfaceC1401Yh.A4j(zu.A81());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1709eG
    public final void AFQ() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1709eG
    public final void AGg() {
        InterfaceC1401Yh interfaceC1401Yh;
        interfaceC1401Yh = this.A00.A0W;
        interfaceC1401Yh.ADJ(15);
    }
}
