package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class I1 implements InterfaceC1498aq {
    public static byte[] A01;
    public static String[] A02 = {"BeK4HZWWIRhrC207wWuIOn", "ZxUaKMHZMCvHIxTDkc1UvZSYXikI2iYM", "xy0Ab8m7NOX4ZRxTfyGPwRY1TRrgVPC4", "ij8auLNb9rfA8yI55JUjNirWgnYpCp0M", "e9T4yeifuMgQg3dKDn6E2LsVBs4fgiHR", "ibrxpSG6qut0wBAmR6wSiB8exNotCqiu", "LMYPYXdb4SaVI93FsN1uYFih9", "8N3vGs6nddgUWUG"};
    public final /* synthetic */ C5F A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A02[2] = "F3dYTVgRpzEGoEWMN2T8FFCtbrhRHRBi";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 99);
            i9++;
        }
    }

    public static void A01() {
        A01 = new byte[]{21, 19, 5, 18, c.f17105c, 14, 1, 22, 9, 7, 1, 20, 9, 15, 14, c.f17105c, 9, 1, 2};
    }

    static {
        A01();
    }

    public I1(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AF7(String str) {
        C1489ah c1489ah;
        C1489ah c1489ah2;
        this.A00.A0Q = false;
        c1489ah = this.A00.A0F;
        c1489ah.setProgress(100);
        c1489ah2 = this.A00.A0F;
        YB.A0O(c1489ah2, 8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AF9(String str) {
        C1489ah c1489ah;
        M6 m62;
        boolean z6;
        int i;
        this.A00.A0Q = true;
        c1489ah = this.A00.A0F;
        YB.A0O(c1489ah, 0);
        m62 = this.A00.A0E;
        m62.setUrl(str);
        z6 = this.A00.A0P;
        if (!z6) {
            C5F c5f = this.A00;
            if (A02[5].charAt(30) != 'i') {
                throw new RuntimeException();
            }
            A02[7] = "LFtEVX0D7i5Pos5vlgnVVb1H7Q5y";
            i = c5f.A02;
            if (i > 1) {
                this.A00.A0P = true;
                this.A00.A0i(A00(0, 19, 3));
            }
        }
        C5F.A05(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AFY(int i) {
        boolean z6;
        C1489ah c1489ah;
        z6 = this.A00.A0Q;
        if (z6) {
            c1489ah = this.A00.A0F;
            c1489ah.setProgress(i);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AFb(String str) {
        M6 m62;
        m62 = this.A00.A0E;
        m62.setTitle(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AFe() {
        ((AbstractC0999Ij) this.A00).A0B.ADJ(14);
    }
}
