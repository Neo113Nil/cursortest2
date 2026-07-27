package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import com.anythink.core.common.s.a.c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class L6 {
    public static byte[] A08;
    public static String[] A09 = {"voRQ6Eoiy", "dM5sUr3BWW4nkGo5nRVfbphD0FkiLgeI", "t4ngtozvUcRON5qFCPMw9NZHviWOcz8N", "2o", "HR4o0SgaegzvmEvMyBsSV3cy", "Fxd3YqblXENYapC", "iFe6DhKEBr1iW4qwRCto7Lk6hMgexe67", "drzzj9o5hc6Li6ZR2JGiBSJ"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass53 A07 = new AnonymousClass53(0);
    public long A01 = b.f6382b;
    public long A02 = b.f6382b;
    public long A00 = b.f6382b;
    public final C06474v A06 = new C06474v();

    public static String A08(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{-19, -33, 20, 50, 40, 45, 38, -33, 19, 8, 12, 4, 30, 20, 13, 18, 4, 19, -33, 40, 45, 50, 51, 36, 32, 35, -19, 18, 55, c.f16318c, 42, 53, 50, 45, -23, 45, 62, 59, 42, 61, 50, 56, 55, 3, -23, 22, 57, 10, 59, 56, 39, 58, 47, 53, 52, 24, 43, 39, 42, 43, 56};
    }

    static {
        A09();
    }

    private int A00(InterfaceC2191ms interfaceC2191ms) {
        this.A06.A0i(C5C.A07);
        this.A03 = true;
        interfaceC2191ms.AIl();
        return 0;
    }

    private int A01(InterfaceC2191ms interfaceC2191ms, HV hv) throws IOException {
        int min = (int) Math.min(20000L, interfaceC2191ms.A8O());
        if (interfaceC2191ms.A8n() != 0) {
            hv.A00 = 0;
            return 1;
        }
        C06474v c06474v = this.A06;
        int bytesToSearch = A09[6].length();
        if (bytesToSearch == 30) {
            throw new RuntimeException();
        }
        A09[6] = "JjjcAHcIe3bphcpehmdhx0lOvmd2";
        c06474v.A0d(min);
        interfaceC2191ms.AIl();
        interfaceC2191ms.AGt(this.A06.A0l(), 0, min);
        this.A01 = A04(this.A06);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC2191ms interfaceC2191ms, HV hv) throws IOException {
        long A8O = interfaceC2191ms.A8O();
        int min = (int) Math.min(20000L, A8O);
        long j6 = A8O - min;
        long searchStartPosition = interfaceC2191ms.A8n();
        if (searchStartPosition != j6) {
            hv.A00 = j6;
            return 1;
        }
        this.A06.A0d(min);
        interfaceC2191ms.AIl();
        interfaceC2191ms.AGt(this.A06.A0l(), 0, min);
        long inputLength = A05(this.A06);
        this.A02 = inputLength;
        this.A05 = true;
        return 0;
    }

    private int A03(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long A04(C06474v c06474v) {
        int A0A = c06474v.A0A();
        for (int A092 = c06474v.A09(); A092 < searchStartPosition; A092++) {
            int searchEndPosition = A03(c06474v.A0l(), A092);
            if (searchEndPosition == 442) {
                int searchStartPosition = A092 + 4;
                c06474v.A0f(searchStartPosition);
                long A06 = A06(c06474v);
                if (A06 != b.f6382b) {
                    return A06;
                }
            }
        }
        return b.f6382b;
    }

    private long A05(C06474v c06474v) {
        int A092 = c06474v.A09();
        int searchStartPosition = c06474v.A0A();
        for (int nextStartCode = searchStartPosition - 4; nextStartCode >= A092; nextStartCode--) {
            int searchEndPosition = A03(c06474v.A0l(), nextStartCode);
            if (searchEndPosition == 442) {
                int searchStartPosition2 = nextStartCode + 4;
                c06474v.A0f(searchStartPosition2);
                long A06 = A06(c06474v);
                int searchEndPosition2 = A09[1].charAt(26);
                if (searchEndPosition2 != 107) {
                    throw new RuntimeException();
                }
                A09[6] = "fZ";
                if (A06 != b.f6382b) {
                    return A06;
                }
            }
        }
        return b.f6382b;
    }

    public static long A06(C06474v c06474v) {
        int A092 = c06474v.A09();
        if (c06474v.A07() < 9) {
            return b.f6382b;
        }
        byte[] bArr = new byte[9];
        int originalPosition = bArr.length;
        c06474v.A0k(bArr, 0, originalPosition);
        c06474v.A0f(A092);
        return !A0A(bArr) ? b.f6382b : A07(bArr);
    }

    public static long A07(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public static boolean A0A(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public final int A0B(InterfaceC2191ms interfaceC2191ms, HV hv) throws IOException {
        if (!this.A05) {
            return A02(interfaceC2191ms, hv);
        }
        if (this.A02 == b.f6382b) {
            return A00(interfaceC2191ms);
        }
        if (!this.A04) {
            return A01(interfaceC2191ms, hv);
        }
        if (this.A01 == b.f6382b) {
            return A00(interfaceC2191ms);
        }
        this.A00 = this.A07.A06(this.A02) - this.A07.A06(this.A01);
        if (this.A00 < 0) {
            AbstractC06324g.A07(A08(45, 16, 119), A08(27, 18, 122) + this.A00 + A08(0, 27, 112));
            this.A00 = b.f6382b;
        }
        return A00(interfaceC2191ms);
    }

    public final long A0C() {
        return this.A00;
    }

    public final AnonymousClass53 A0D() {
        return this.A07;
    }

    public final boolean A0E() {
        return this.A03;
    }
}
