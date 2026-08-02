package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class DL {
    public static String[] A07 = {"1TUPUvqjuckMieKxy618dXqeho2I2nXO", "1tw", "Rv8BHxt03y9lIrpcW4kHhbfWsqmFKBVK", "r8Px", "D2vXeeTjlCXB4Odv", "hN", "uuD40", "TpLNmCJV5wG1YwTXf3toM93vl9iWeWk7"};
    public long A00;
    public C2262ni A01;
    public C2262ni A02;
    public C2262ni A03;
    public final int A04;
    public final C06674v A05 = new C06674v(32);
    public final F0 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2262ni A04(C2262ni c2262ni, C2341p0 c2341p0, DN dn, C06674v c06674v) {
        int i;
        long j6 = dn.A01;
        c06674v.A0d(1);
        C2262ni A03 = A03(c2262ni, j6, c06674v.A0l(), 1);
        long j9 = j6 + 1;
        byte b9 = c06674v.A0l()[0];
        boolean z6 = (b9 & c.f17103a) != 0;
        int i4 = b9 & Byte.MAX_VALUE;
        C06975z c06975z = c2341p0.A05;
        if (c06975z.A04 == null) {
            c06975z.A04 = new byte[16];
        } else {
            Arrays.fill(c06975z.A04, (byte) 0);
        }
        C2262ni A032 = A03(A03, j9, c06975z.A04, i4);
        long j10 = j9 + i4;
        if (z6) {
            c06674v.A0d(2);
            A032 = A03(A032, j10, c06674v.A0l(), 2);
            j10 += 2;
            i = c06674v.A0M();
        } else {
            i = 1;
            if (A07[7].charAt(5) == 'i') {
                throw new RuntimeException();
            }
            A07[7] = "Hpyz1f8ALnZx1iP9R6alck8MxH3P54oK";
        }
        int[] iArr = c06975z.A06;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = c06975z.A07;
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
        }
        if (z6) {
            int i6 = i * 6;
            c06674v.A0d(i6);
            A032 = A03(A032, j10, c06674v.A0l(), i6);
            j10 += i6;
            c06674v.A0f(0);
            for (int i9 = 0; i9 < i; i9++) {
                iArr[i9] = c06674v.A0M();
                iArr2[i9] = c06674v.A0L();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = dn.A00 - ((int) (j10 - dn.A01));
        }
        C0965Hb c0965Hb = (C0965Hb) C5C.A0f(dn.A02);
        c06975z.A02(i, iArr, iArr2, c0965Hb.A03, c06975z.A04, c0965Hb.A01, c0965Hb.A02, c0965Hb.A00);
        int i10 = (int) (j10 - dn.A01);
        dn.A01 += i10;
        if (A07[0].charAt(1) == 'T') {
            A07[0] = "nTpP9ibfF3cbwjVbkTA4UIhNPpZui5fl";
            dn.A00 -= i10;
            return A032;
        }
        String[] strArr = A07;
        strArr[3] = "b8i1";
        strArr[6] = "bRWrT";
        dn.A00 -= i10;
        return A032;
    }

    public DL(F0 f02) {
        this.A06 = f02;
        this.A04 = f02.A8I();
        this.A01 = new C2262ni(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
    }

    private int A00(int i) {
        if (this.A03.A03 == null) {
            this.A03.A03(this.A06.A49(), new C2262ni(this.A03.A00, this.A04));
        }
        return Math.min(i, (int) (this.A03.A00 - this.A00));
    }

    public static C2262ni A01(C2262ni c2262ni, long j6) {
        while (j6 >= c2262ni.A00) {
            c2262ni = c2262ni.A02;
        }
        return c2262ni;
    }

    public static C2262ni A02(C2262ni c2262ni, long j6, ByteBuffer byteBuffer, int i) {
        C2262ni A01 = A01(c2262ni, j6);
        while (i > 0) {
            int remaining = (int) (A01.A00 - j6);
            int min = Math.min(i, remaining);
            byte[] bArr = A01.A03.A01;
            int remaining2 = A01.A00(j6);
            byteBuffer.put(bArr, remaining2, min);
            i -= min;
            j6 += min;
            if (j6 == A01.A00) {
                A01 = A01.A02;
            }
        }
        return A01;
    }

    public static C2262ni A03(C2262ni c2262ni, long j6, byte[] bArr, int i) {
        C2262ni A01 = A01(c2262ni, j6);
        int i4 = i;
        while (i4 > 0) {
            int min = Math.min(i4, (int) (A01.A00 - j6));
            byte[] bArr2 = A01.A03.A01;
            int toCopy = A01.A00(j6);
            int remaining = i - i4;
            System.arraycopy(bArr2, toCopy, bArr, remaining, min);
            i4 -= min;
            j6 += min;
            if (j6 == A01.A00) {
                A01 = A01.A02;
            }
        }
        return A01;
    }

    public static C2262ni A05(C2262ni c2262ni, C2341p0 c2341p0, DN dn, C06674v c06674v) {
        if (c2341p0.A0E()) {
            c2262ni = A04(c2262ni, c2341p0, dn, c06674v);
        }
        if (c2341p0.A03()) {
            c06674v.A0d(4);
            C2262ni A03 = A03(c2262ni, dn.A01, c06674v.A0l(), 4);
            int A0L = c06674v.A0L();
            dn.A01 += 4;
            dn.A00 -= 4;
            c2341p0.A0C(A0L);
            C2262ni A02 = A02(A03, dn.A01, c2341p0.A02, A0L);
            dn.A01 += A0L;
            dn.A00 -= A0L;
            c2341p0.A0D(dn.A00);
            return A02(A02, dn.A01, c2341p0.A03, dn.A00);
        }
        c2341p0.A0C(dn.A00);
        return A02(c2262ni, dn.A01, c2341p0.A02, dn.A00);
    }

    private void A06(int i) {
        this.A00 += i;
        if (this.A00 == this.A03.A00) {
            this.A03 = this.A03.A02;
        }
    }

    private void A07(C2262ni c2262ni) {
        if (c2262ni.A03 == null) {
            return;
        }
        this.A06.AHe(c2262ni);
        c2262ni.A01();
    }

    public final int A08(InterfaceC06002c interfaceC06002c, int i, boolean z6) throws IOException {
        int read = interfaceC06002c.read(this.A03.A03.A01, this.A03.A00(this.A00), A00(i));
        if (read == -1) {
            if (z6) {
                return -1;
            }
            throw new EOFException();
        }
        A06(read);
        return read;
    }

    public final long A09() {
        return this.A00;
    }

    public final void A0A() {
        A07(this.A01);
        this.A01.A02(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
        this.A00 = 0L;
        this.A06.AKT();
    }

    public final void A0B() {
        this.A02 = this.A01;
    }

    public final void A0C(long j6) {
        if (j6 == -1) {
            return;
        }
        while (j6 >= this.A01.A00) {
            this.A06.AHd(this.A01.A03);
            this.A01 = this.A01.A01();
        }
        long j9 = this.A02.A01;
        long j10 = this.A01.A01;
        String[] strArr = A07;
        if (strArr[3].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[3] = "kTcq";
        strArr2[6] = "Dj6YZ";
        if (j9 < j10) {
            this.A02 = this.A01;
        }
    }

    public final void A0D(C06674v c06674v, int i) {
        while (i > 0) {
            int A00 = A00(i);
            byte[] bArr = this.A03.A03.A01;
            int bytesAppended = this.A03.A00(this.A00);
            c06674v.A0k(bArr, bytesAppended, A00);
            i -= A00;
            A06(A00);
        }
    }

    public final void A0E(C2341p0 c2341p0, DN dn) {
        A05(this.A02, c2341p0, dn, this.A05);
    }

    public final void A0F(C2341p0 c2341p0, DN dn) {
        this.A02 = A05(this.A02, c2341p0, dn, this.A05);
    }
}
