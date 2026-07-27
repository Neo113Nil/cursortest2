package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class KA implements InterfaceC1477aq {
    public static byte[] A01;
    public static String[] A02 = {"Lf", "nmAxyBcQYqE4UmHMsUF1rAa8zTrMAPgx", "yXHjwHYuNIdrzaXYLvaZZ8rDuk", "9P19JGz6dEYaA5InwGx6w36V1Sjc1fgT", "Uaeemoya7byMjdbMYqkdDOMCW0kva5u1", "a9sExJmhm07IJOfFlJQHVREgKDfvTtqT", "zS9IM7X0AIqJ7SZD2m", "JScTq5ptQGF6W5ukeGazDvn9iL3"};
    public final /* synthetic */ C1002Ji A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -31, -45, -32, -51, -36, -49, -28, -41, -43, -49, -30, -41, -35, -36, -51, -41, -49, -48};
    }

    static {
        A01();
    }

    public KA(C1002Ji c1002Ji) {
        this.A00 = c1002Ji;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1477aq
    public final void AF7(String str) {
        C1468ah c1468ah;
        C1468ah c1468ah2;
        AbstractC2004jd abstractC2004jd;
        M3 m32;
        AbstractC2004jd abstractC2004jd2;
        M3 m33;
        C1468ah c1468ah3;
        this.A00.A0K = false;
        c1468ah = this.A00.A07;
        if (c1468ah != null) {
            c1468ah3 = this.A00.A07;
            c1468ah3.setProgress(100);
        }
        c1468ah2 = this.A00.A07;
        YB.A0O(c1468ah2, 8);
        abstractC2004jd = this.A00.A0X;
        if (abstractC2004jd.A1l()) {
            m32 = this.A00.A08;
            if (m32 != null) {
                abstractC2004jd2 = this.A00.A0X;
                String A14 = abstractC2004jd2.A14();
                if (!TextUtils.isEmpty(A14)) {
                    m33 = this.A00.A08;
                    m33.loadUrl(A14);
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1477aq
    public final void AF9(String str) {
        C1468ah c1468ah;
        M8 m8;
        boolean z8;
        int i;
        M8 m82;
        this.A00.A0K = true;
        c1468ah = this.A00.A07;
        YB.A0O(c1468ah, 0);
        m8 = this.A00.A06;
        if (m8 != null) {
            m82 = this.A00.A06;
            m82.setUrl(str);
        }
        C1002Ji c1002Ji = this.A00;
        String[] strArr = A02;
        if (strArr[4].charAt(17) != strArr[5].charAt(17)) {
            A02[2] = "wX256yuF2";
            z8 = c1002Ji.A0I;
            if (!z8) {
                i = this.A00.A00;
                if (i > 1) {
                    this.A00.A0I = true;
                    this.A00.A0o(A00(0, 19, 95));
                }
            }
            C1002Ji.A02(this.A00);
            if (A02[2].length() != 27) {
                A02[6] = "lsrcQj4qqEXeVsDQCf";
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1477aq
    public final void AFY(int i) {
        boolean z8;
        C1468ah c1468ah;
        C1468ah c1468ah2;
        z8 = this.A00.A0K;
        if (z8) {
            c1468ah = this.A00.A07;
            if (c1468ah != null) {
                c1468ah2 = this.A00.A07;
                c1468ah2.setProgress(i);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1477aq
    public final void AFb(String str) {
        M8 m8;
        M8 m82;
        m8 = this.A00.A06;
        if (m8 != null) {
            m82 = this.A00.A06;
            m82.setTitle(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1477aq
    public final void AFe() {
        C1556c7 c1556c7;
        c1556c7 = this.A00.A0b;
        c1556c7.A0C().ADJ(14);
    }
}
