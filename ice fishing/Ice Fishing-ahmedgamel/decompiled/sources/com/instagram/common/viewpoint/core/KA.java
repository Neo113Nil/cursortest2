package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class KA implements InterfaceC1498aq {
    public static byte[] A01;
    public static String[] A02 = {"Lf", "nmAxyBcQYqE4UmHMsUF1rAa8zTrMAPgx", "yXHjwHYuNIdrzaXYLvaZZ8rDuk", "9P19JGz6dEYaA5InwGx6w36V1Sjc1fgT", "Uaeemoya7byMjdbMYqkdDOMCW0kva5u1", "a9sExJmhm07IJOfFlJQHVREgKDfvTtqT", "zS9IM7X0AIqJ7SZD2m", "JScTq5ptQGF6W5ukeGazDvn9iL3"};
    public final /* synthetic */ C1023Ji A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -31, -45, -32, -51, -36, -49, -28, -41, -43, -49, -30, -41, -35, -36, -51, -41, -49, -48};
    }

    static {
        A01();
    }

    public KA(C1023Ji c1023Ji) {
        this.A00 = c1023Ji;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AF7(String str) {
        C1489ah c1489ah;
        C1489ah c1489ah2;
        AbstractC2025jd abstractC2025jd;
        M3 m32;
        AbstractC2025jd abstractC2025jd2;
        M3 m33;
        C1489ah c1489ah3;
        this.A00.A0K = false;
        c1489ah = this.A00.A07;
        if (c1489ah != null) {
            c1489ah3 = this.A00.A07;
            c1489ah3.setProgress(100);
        }
        c1489ah2 = this.A00.A07;
        YB.A0O(c1489ah2, 8);
        abstractC2025jd = this.A00.A0X;
        if (abstractC2025jd.A1l()) {
            m32 = this.A00.A08;
            if (m32 != null) {
                abstractC2025jd2 = this.A00.A0X;
                String A14 = abstractC2025jd2.A14();
                if (!TextUtils.isEmpty(A14)) {
                    m33 = this.A00.A08;
                    m33.loadUrl(A14);
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AF9(String str) {
        C1489ah c1489ah;
        M8 m82;
        boolean z6;
        int i;
        M8 m83;
        this.A00.A0K = true;
        c1489ah = this.A00.A07;
        YB.A0O(c1489ah, 0);
        m82 = this.A00.A06;
        if (m82 != null) {
            m83 = this.A00.A06;
            m83.setUrl(str);
        }
        C1023Ji c1023Ji = this.A00;
        String[] strArr = A02;
        if (strArr[4].charAt(17) != strArr[5].charAt(17)) {
            A02[2] = "wX256yuF2";
            z6 = c1023Ji.A0I;
            if (!z6) {
                i = this.A00.A00;
                if (i > 1) {
                    this.A00.A0I = true;
                    this.A00.A0o(A00(0, 19, 95));
                }
            }
            C1023Ji.A02(this.A00);
            if (A02[2].length() != 27) {
                A02[6] = "lsrcQj4qqEXeVsDQCf";
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AFY(int i) {
        boolean z6;
        C1489ah c1489ah;
        C1489ah c1489ah2;
        z6 = this.A00.A0K;
        if (z6) {
            c1489ah = this.A00.A07;
            if (c1489ah != null) {
                c1489ah2 = this.A00.A07;
                c1489ah2.setProgress(i);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AFb(String str) {
        M8 m82;
        M8 m83;
        m82 = this.A00.A06;
        if (m82 != null) {
            m83 = this.A00.A06;
            m83.setTitle(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AFe() {
        C1577c7 c1577c7;
        c1577c7 = this.A00.A0b;
        c1577c7.A0C().ADJ(14);
    }
}
