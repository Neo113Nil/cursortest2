package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class KA implements InterfaceC1478aq {
    public static byte[] A01;
    public static String[] A02 = {"Lf", "nmAxyBcQYqE4UmHMsUF1rAa8zTrMAPgx", "yXHjwHYuNIdrzaXYLvaZZ8rDuk", "9P19JGz6dEYaA5InwGx6w36V1Sjc1fgT", "Uaeemoya7byMjdbMYqkdDOMCW0kva5u1", "a9sExJmhm07IJOfFlJQHVREgKDfvTtqT", "zS9IM7X0AIqJ7SZD2m", "JScTq5ptQGF6W5ukeGazDvn9iL3"};
    public final /* synthetic */ C1003Ji A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
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

    public KA(C1003Ji c1003Ji) {
        this.A00 = c1003Ji;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1478aq
    public final void AF7(String str) {
        C1469ah c1469ah;
        C1469ah c1469ah2;
        AbstractC2005jd abstractC2005jd;
        M3 m32;
        AbstractC2005jd abstractC2005jd2;
        M3 m33;
        C1469ah c1469ah3;
        this.A00.A0K = false;
        c1469ah = this.A00.A07;
        if (c1469ah != null) {
            c1469ah3 = this.A00.A07;
            c1469ah3.setProgress(100);
        }
        c1469ah2 = this.A00.A07;
        YB.A0O(c1469ah2, 8);
        abstractC2005jd = this.A00.A0X;
        if (abstractC2005jd.A1l()) {
            m32 = this.A00.A08;
            if (m32 != null) {
                abstractC2005jd2 = this.A00.A0X;
                String A14 = abstractC2005jd2.A14();
                if (!TextUtils.isEmpty(A14)) {
                    m33 = this.A00.A08;
                    m33.loadUrl(A14);
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1478aq
    public final void AF9(String str) {
        C1469ah c1469ah;
        M8 m82;
        boolean z3;
        int i;
        M8 m83;
        this.A00.A0K = true;
        c1469ah = this.A00.A07;
        YB.A0O(c1469ah, 0);
        m82 = this.A00.A06;
        if (m82 != null) {
            m83 = this.A00.A06;
            m83.setUrl(str);
        }
        C1003Ji c1003Ji = this.A00;
        String[] strArr = A02;
        if (strArr[4].charAt(17) != strArr[5].charAt(17)) {
            A02[2] = "wX256yuF2";
            z3 = c1003Ji.A0I;
            if (!z3) {
                i = this.A00.A00;
                if (i > 1) {
                    this.A00.A0I = true;
                    this.A00.A0o(A00(0, 19, 95));
                }
            }
            C1003Ji.A02(this.A00);
            if (A02[2].length() != 27) {
                A02[6] = "lsrcQj4qqEXeVsDQCf";
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1478aq
    public final void AFY(int i) {
        boolean z3;
        C1469ah c1469ah;
        C1469ah c1469ah2;
        z3 = this.A00.A0K;
        if (z3) {
            c1469ah = this.A00.A07;
            if (c1469ah != null) {
                c1469ah2 = this.A00.A07;
                c1469ah2.setProgress(i);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1478aq
    public final void AFb(String str) {
        M8 m82;
        M8 m83;
        m82 = this.A00.A06;
        if (m82 != null) {
            m83 = this.A00.A06;
            m83.setTitle(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1478aq
    public final void AFe() {
        C1557c7 c1557c7;
        c1557c7 = this.A00.A0b;
        c1557c7.A0C().ADJ(14);
    }
}
