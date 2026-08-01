package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class NP implements InterfaceC1689eG {
    public static byte[] A01;
    public static String[] A02 = {"BHXiYjXxfgjD7yDB", "kPfw5HKETqo8dV", "SlBKzsC69frNfTspgJs5v90302jxH173", "0t7u2eeKUCj5gcxeWZIOCTpidMAeGJtt", "hTXrvsDVbOi3Q9xrUBZOJj7T", "iLbLRTjnBQIJ87KFXaIFUijyWt7EPIGc", "0utayShxEdwMeaV3UZeoWviAuyaBWRmj", "gyVOCm6F1v6TZALkbG"};
    public final /* synthetic */ NO A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 58);
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC1689eG
    public final void ADX() {
        this.A00.A0W(true, A00(0, 9, 106));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1689eG
    public final void AEA() {
        boolean z3;
        AbstractC2005jd abstractC2005jd;
        InterfaceC1381Yh interfaceC1381Yh;
        ZU zu;
        VA va;
        AbstractC2005jd abstractC2005jd2;
        C1691eI c1691eI;
        C1691eI c1691eI2;
        C1840gi c1840gi;
        ZU zu2;
        AbstractC2005jd abstractC2005jd3;
        AbstractC2005jd abstractC2005jd4;
        C1840gi c1840gi2;
        AbstractC2005jd abstractC2005jd5;
        AbstractC2005jd abstractC2005jd6;
        C1840gi c1840gi3;
        C1112No c1112No;
        C1840gi c1840gi4;
        C1840gi c1840gi5;
        z3 = this.A00.A0f;
        if (!z3) {
            abstractC2005jd = this.A00.A0O;
            if (!TextUtils.isEmpty(abstractC2005jd.A2E())) {
                va = this.A00.A0S;
                abstractC2005jd2 = this.A00.A0O;
                String A2E = abstractC2005jd2.A2E();
                C1497b9 c1497b9 = new C1497b9();
                c1691eI = this.A00.A0B;
                C1497b9 A03 = c1497b9.A03(c1691eI.getViewabilityChecker());
                c1691eI2 = this.A00.A0B;
                va.ABJ(A2E, A03.A02(c1691eI2.getTouchDataRecorder()).A05());
                c1840gi = this.A00.A0R;
                C1336Wl A00 = C1336Wl.A00(c1840gi);
                zu2 = this.A00.A0X;
                String A8l = zu2.A8l();
                abstractC2005jd3 = this.A00.A0O;
                A00.A0E(A8l, abstractC2005jd3.A2E());
                abstractC2005jd4 = this.A00.A0O;
                C1104Ng A2A = abstractC2005jd4.A2A();
                c1840gi2 = this.A00.A0R;
                C1104Ng.A07(A2A, c1840gi2);
                abstractC2005jd5 = this.A00.A0O;
                String A0y = abstractC2005jd5.A0y();
                abstractC2005jd6 = this.A00.A0O;
                AbstractC1124Oa.A02(A0y, AbstractC1360Xm.A00(abstractC2005jd6.A10()));
                c1840gi3 = this.A00.A0R;
                c1840gi3.A0F().A3L();
                c1112No = this.A00.A0P;
                if (c1112No.A0c()) {
                    c1840gi4 = this.A00.A0R;
                    c1840gi4.A0F().AES();
                }
            }
            NO no = this.A00;
            String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            interfaceC1381Yh = no.A0W;
            zu = this.A00.A0X;
            interfaceC1381Yh.A4j(zu.A8G());
            return;
        }
        c1840gi5 = this.A00.A0R;
        c1840gi5.A0F().AET();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1689eG
    public final void AEh() {
        InterfaceC1381Yh interfaceC1381Yh;
        ZU zu;
        interfaceC1381Yh = this.A00.A0W;
        zu = this.A00.A0X;
        interfaceC1381Yh.A4j(zu.A81());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1689eG
    public final void AFQ() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1689eG
    public final void AGg() {
        InterfaceC1381Yh interfaceC1381Yh;
        interfaceC1381Yh = this.A00.A0W;
        interfaceC1381Yh.ADJ(15);
    }
}
