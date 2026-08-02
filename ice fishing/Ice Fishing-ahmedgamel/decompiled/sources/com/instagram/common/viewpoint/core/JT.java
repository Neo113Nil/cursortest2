package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public class JT implements InterfaceC1635d3 {
    public static byte[] A01;
    public static String[] A02 = {"6Ak70sx20HAu1BK2okLsJl8UIfFL7Thw", "WSdr2bwsModx8vqlXsCh2pEoV44R6fWS", "6pV", "IuCwGgbRSGcwid05Jmd", "uJw8pmawU", "I8uJtZilJAfxYDsx8vrQS9VBJj4oHqwc", "yyzynLMQXuMe1chn921CH2O0saed", "KEJISc72f74GCBhZaRDCVEoQGHcnATpn"};
    public final /* synthetic */ AnonymousClass66 A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "LF603a9wKS17yr1vDnM";
            strArr2[4] = "LZWmWJ2r4";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 113);
            i9++;
        }
    }

    public static void A01() {
        byte[] bArr = {92, c.f17104b, 77, 85};
        String[] strArr = A02;
        if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
            throw new RuntimeException();
        }
        A02[5] = "ka1vQ6UiXKbqG0foqwxWJkzjeHAuiIwi";
        A01 = bArr;
    }

    static {
        A01();
    }

    public JT(AnonymousClass66 anonymousClass66) {
        this.A00 = anonymousClass66;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1635d3
    public final void AGR(String str, JSONObject jSONObject) {
        C1644dC c1644dC;
        C1860gi c1860gi;
        C1860gi c1860gi2;
        if (str.equals(A00(0, 4, 93))) {
            this.A00.AKD();
            c1860gi = this.A00.A07;
            if (C1310Up.A1z(c1860gi)) {
                c1860gi2 = this.A00.A07;
                c1860gi2.A0B().ADb();
            }
        }
        c1644dC = this.A00.A0F;
        if (A02[5].charAt(30) != 'w') {
            throw new RuntimeException();
        }
        A02[5] = "i1qJJe2Rv2sTY7cj85c4P5DDFviddUwN";
        c1644dC.A0h(str, jSONObject);
    }
}
