package com.instagram.common.viewpoint.core;

import com.anythink.expressad.videocommon.e.b;
import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: com.facebook.ads.redexgen.X.Me, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1077Me {
    public static String[] A0A = {"Zahrr4TzPnlvzL1ryUDBJHiLrNQrc0do", "gdtiLcJnOI63VIDKC4FZh", "mcKRdr7QIVfArpWMDov87T9yp6nn6XkX", "hh9PATM4XXQMpkTMp0yEe4VjsJayobMb", "DHsdxhl2jOmdOKqNSGjxb8rQV1nmB92A", "YMP8jok2HwiV", b.f22396j, "S"};
    public long A00;
    public long A01;
    public long A02;
    public final C06605i A03;
    public final MP A04;
    public final C8B A05;
    public final InterfaceC1076Md A06;
    public final String A07;
    public final byte[] A08;
    public volatile boolean A09;

    public C1077Me(C8B c8b, C06605i c06605i, byte[] bArr, InterfaceC1076Md interfaceC1076Md) {
        this.A05 = c8b;
        this.A04 = c8b.A0E();
        this.A03 = c06605i;
        this.A08 = bArr == null ? new byte[131072] : bArr;
        this.A06 = interfaceC1076Md;
        this.A07 = c8b.A0F().A4l(c06605i);
        this.A02 = c06605i.A04;
    }

    private long A00() {
        if (this.A01 == -1) {
            return -1L;
        }
        return this.A01 - this.A03.A04;
    }

    private long A01(long j6, long j9) throws IOException {
        boolean z3 = j6 + j9 == this.A01 || j9 == -1;
        long j10 = -1;
        boolean z6 = false;
        if (j9 != -1) {
            try {
                j10 = this.A05.AGi(this.A03.A04().A04(j6).A03(j9).A09());
                z6 = true;
            } catch (IOException unused) {
                AbstractC06555d.A00(this.A05);
            }
        }
        if (!z6) {
            A02();
            try {
                j10 = this.A05.AGi(this.A03.A04().A04(j6).A03(-1L).A09());
            } catch (IOException e9) {
                AbstractC06555d.A00(this.A05);
                throw e9;
            }
        }
        int bytesRead = 0;
        if (A0A[3].charAt(20) != 'e') {
            throw new RuntimeException();
        }
        A0A[0] = "hZR9VwpKkwuUXqoAcu0MC0lnjZxabJfZ";
        if (z3 && j10 != -1) {
            try {
                A04(j6 + j10);
            } catch (IOException e10) {
                AbstractC06555d.A00(this.A05);
                throw e10;
            }
        }
        int i = 0;
        while (i != -1) {
            A02();
            i = this.A05.read(this.A08, 0, this.A08.length);
            if (i != -1) {
                A03(i);
                bytesRead += i;
            }
        }
        if (z3) {
            A04(bytesRead + j6);
        }
        this.A05.close();
        long j11 = bytesRead;
        String[] strArr = A0A;
        if (strArr[5].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[5] = "HblyszVHSCLV";
        strArr2[7] = "g";
        return j11;
    }

    private void A02() throws InterruptedIOException {
        if (!this.A09) {
        } else {
            throw new InterruptedIOException();
        }
    }

    private void A03(long j6) {
        this.A00 += j6;
        if (this.A06 != null) {
            this.A06.AFX(A00(), this.A00, j6);
        }
    }

    private void A04(long j6) {
        if (this.A01 == j6) {
            return;
        }
        this.A01 = j6;
        if (this.A06 != null) {
            this.A06.AFX(A00(), this.A00, 0L);
        }
    }

    public final void A05() throws IOException {
        long nextRequestLength;
        A02();
        this.A00 = this.A04.A7B(this.A07, this.A03.A04, this.A03.A03);
        if (this.A03.A03 != -1) {
            this.A01 = this.A03.A04 + this.A03.A03;
        } else {
            long A00 = AbstractC1082Mj.A00(this.A04.A7S(this.A07));
            if (A0A[3].charAt(20) == 'e') {
                String[] strArr = A0A;
                strArr[4] = "d2NeaqM7PiJwxNK1Ah3bQ5GZkUsby9uw";
                strArr[2] = "tLvOBlFvjcFhEySGIYecGT7qbHBlIMmD";
                if (A00 == -1) {
                    A00 = -1;
                }
                this.A01 = A00;
            }
            throw new RuntimeException();
        }
        if (this.A06 != null) {
            this.A06.AFX(A00(), this.A00, 0L);
        }
        while (true) {
            long j6 = this.A01;
            if (A0A[6].length() == 13) {
                break;
            }
            A0A[1] = "NGuGGBYtFkRF3XmDWlB70";
            if (j6 == -1 || this.A02 < this.A01) {
                A02();
                if (this.A01 == -1) {
                    nextRequestLength = Long.MAX_VALUE;
                } else {
                    long nextRequestLength2 = this.A01;
                    long blockLength = this.A02;
                    nextRequestLength = nextRequestLength2 - blockLength;
                }
                long A7C = this.A04.A7C(this.A07, this.A02, nextRequestLength);
                if (A7C > 0) {
                    long blockLength2 = this.A02;
                    this.A02 = blockLength2 + A7C;
                } else {
                    long nextRequestLength3 = -A7C;
                    if (nextRequestLength3 == Long.MAX_VALUE) {
                        nextRequestLength3 = -1;
                    }
                    long j9 = this.A02;
                    long blockLength3 = this.A02;
                    this.A02 = j9 + A01(blockLength3, nextRequestLength3);
                }
            } else {
                return;
            }
        }
    }

    public final void A06() {
        this.A09 = true;
    }
}
