package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ma, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2193ma extends AbstractC0984Hu {
    public static byte[] A06;
    public static String[] A07 = {"k0wYTkKie1JHeFYg", "DKl7H6qsoN4MQmGVFxhVfc9YoKR", "eOp5RF4DxMr8YboQGZKTl4GQk1b", "2gSlciuhxyUpZq2z", "EzoVAngWIMXE2t797gVmsxYwwugMTqE8", "YSwU3mnkrzPmwh4w8hA9Gpc9iPzLacTq", "wmfh6", "T9R7fvqNl5WyvyD6SUGUJNeU84vDYmq7"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final C06674v A04;
    public final C06674v A05;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{68, 123, 118, 119, 125, 50, 116, 125, 96, Byte.MAX_VALUE, 115, 102, 50, 124, 125, 102, 50, 97, 103, 98, 98, 125, 96, 102, 119, 118, 40, 50, 43, 52, 57, 56, 50, 114, 60, 43, 62};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC0984Hu
    public final boolean A0C(C06674v c06674v, long j6) throws C3K {
        int A0I = c06674v.A0I();
        long A0D = j6 + (c06674v.A0D() * 1000);
        if (A0I == 0 && !this.A02) {
            C06674v c06674v2 = new C06674v(new byte[c06674v.A07()]);
            c06674v.A0k(c06674v2.A0l(), 0, c06674v.A07());
            C0959Gv A00 = C0959Gv.A00(c06674v2);
            this.A01 = A00.A02;
            super.A00.A6e(new C06112p().A11(A00(28, 9, 29)).A0w(A00.A04).A0r(A00.A03).A0f(A00.A01).A0Y(A00.A00).A12(A00.A05).A14());
            this.A02 = true;
            return false;
        }
        if (A0I != 1 || !this.A02) {
            return false;
        }
        int i = this.A00;
        if (A07[1].length() != 27) {
            throw new RuntimeException();
        }
        A07[5] = "ywa4QqUhdtSZ68DIQ13xWUOznnvwilgI";
        boolean z6 = i == 1;
        if (A07[2].length() == 28) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[6] = "IIAwH";
        strArr[0] = "qu1M6PwQ9kLePSP6";
        if (!this.A03 && !z6) {
            return false;
        }
        byte[] A0l = this.A04.A0l();
        A0l[0] = 0;
        A0l[1] = 0;
        A0l[2] = 0;
        int i4 = 4 - this.A01;
        int i6 = 0;
        while (c06674v.A07() > 0) {
            c06674v.A0k(this.A04.A0l(), i4, this.A01);
            this.A04.A0f(0);
            int A0L = this.A04.A0L();
            this.A05.A0f(0);
            super.A00.AIr(this.A05, 4);
            super.A00.AIr(c06674v, A0L);
            i6 = i6 + 4 + A0L;
        }
        super.A00.AIu(A0D, z6 ? 1 : 0, i6, 0, null);
        this.A03 = true;
        return true;
    }

    static {
        A01();
    }

    public C2193ma(InterfaceC0967Hd interfaceC0967Hd) {
        super(interfaceC0967Hd);
        this.A05 = new C06674v(HS.A03);
        this.A04 = new C06674v(4);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0984Hu
    public final boolean A0B(C06674v c06674v) throws C2194mb {
        int A0I = c06674v.A0I();
        int header = A0I >> 4;
        int frameType = header & 15;
        int i = A0I & 15;
        if (i == 7) {
            this.A00 = frameType;
            return frameType != 5;
        }
        throw new C2194mb(A00(0, 28, 82) + i);
    }
}
