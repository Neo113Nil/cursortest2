package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.kU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2056kU implements C5W {
    public static byte[] A0A;
    public static String[] A0B = {"ZvdLZTVfwuIBTQP4GzYBT5X", "wbAZGHQ6rgrE49QWGCHGfuBznSfuy1uN", "V6XwnsY6foGeZeUf6zKrOXNqPWCT5H6x", "YVOcTVGnehAK6q3v9MTNJvITraIKZiNA", "KHrBPZHANML419JBBjaM9uFMM5JItkLu", "1WIXy5Awt7B4E86DpiV0tl9iGx9sIFx0", "LtMYCkXqs5nSRMey4EGdy6S", "9S3XCAL9m1K226khzcMpmZ28hR6Taq7A"};
    public long A00;
    public long A01;
    public long A02;
    public C06595i A03;
    public C1086Mo A04;
    public File A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final MP A09;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{86, 116, 118, 125, 112, 81, 116, 97, 116, 70, 124, 123, 126, 32, 52, 39, 33, 43, 35, 40, 50, 21, 47, 60, 35, 102, 47, 53, 102, 36, 35, 42, 41, 49, 102, 50, 46, 35, 102, 43, 47, 40, 47, 43, 51, 43, 102, 52, 35, 37, 41, 43, 43, 35, 40, 34, 35, 34, 102, 48, 39, 42, 51, 35, 102, 41, 32, 102, 116, 118, Byte.MAX_VALUE, 113, 119, 115, 116, 104, 102, 18, 46, 47, 53, 102, 43, 39, c.f16476c, 102, 37, 39, 51, 53, 35, 102, 54, 41, 41, 52, 102, 37, 39, 37, 46, 35, 102, 54, 35, 52, 32, 41, 52, 43, 39, 40, 37, 35, 104, 35, 55, 36, 34, 40, 32, 43, 49, 22, 44, c.f16476c, 32, 101, 40, 48, 54, 49, 101, 39, 32, 101, 53, 42, 54, 44, 49, 44, 51, 32, 101, 42, 55, 101, 6, 107, 9, 0, 11, 2, 17, 13, 26, 16, 11, 22, 0, 17, 107};
    }

    static {
        A02();
    }

    public C2056kU(MP mp, long j9, int i) {
        AbstractC06233y.A0A(j9 > 0 || j9 == -1, A00(115, 48, 72));
        if (j9 != -1 && j9 < com.anythink.basead.exoplayer.j.a.c.f8189a) {
            AbstractC06314g.A07(A00(0, 13, 24), A00(13, 102, 75));
        }
        this.A09 = (MP) AbstractC06233y.A01(mp);
        this.A08 = j9 == -1 ? Long.MAX_VALUE : j9;
        this.A07 = i;
    }

    /* JADX WARN: Finally extract failed */
    private void A01() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.flush();
            C5C.A10(this.A06);
            this.A06 = null;
            File file = (File) C5C.A0f(this.A05);
            this.A05 = null;
            String[] strArr = A0B;
            if (strArr[7].charAt(29) == strArr[2].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "UqCq1nJSNUsM2UdGgnorxCQ";
            strArr2[6] = "6grM2eqzP4bpAc7X7xQexiC";
            if (1 != 0) {
                this.A09.A55(file, this.A02);
            } else {
                file.delete();
            }
        } catch (Throwable th) {
            C5C.A10(this.A06);
            this.A06 = null;
            File fileToCommit = (File) C5C.A0f(this.A05);
            this.A05 = null;
            if (0 != 0) {
                this.A09.A55(fileToCommit, this.A02);
            } else {
                fileToCommit.delete();
            }
            throw th;
        }
    }

    private void A03(C06595i c06595i) throws IOException {
        this.A05 = this.A09.AK8((String) C5C.A0f(c06595i.A08), c06595i.A04 + this.A00, c06595i.A03 != -1 ? Math.min(c06595i.A03 - this.A00, this.A01) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.A05);
        if (this.A07 > 0) {
            if (this.A04 == null) {
                this.A04 = new C1086Mo(fileOutputStream, this.A07);
            } else {
                this.A04.A00(fileOutputStream);
            }
            this.A06 = this.A04;
        } else {
            this.A06 = fileOutputStream;
        }
        this.A02 = 0L;
    }

    @Override // com.instagram.common.viewpoint.core.C5W
    public final void AGk(C06595i c06595i) throws C2058kW {
        AbstractC06233y.A01(c06595i.A08);
        if (c06595i.A03 == -1 && c06595i.A06(2)) {
            this.A03 = null;
            return;
        }
        this.A03 = c06595i;
        this.A01 = c06595i.A06(4) ? this.A08 : Long.MAX_VALUE;
        this.A00 = 0L;
        try {
            A03(c06595i);
        } catch (IOException e6) {
            throw new C2058kW(e6);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C5W
    public final void close() throws C2058kW {
        if (this.A03 == null) {
            return;
        }
        try {
            A01();
        } catch (IOException e6) {
            throw new C2058kW(e6);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C5W
    public final void write(byte[] bArr, int i, int i4) throws C2058kW {
        C06595i c06595i = this.A03;
        if (c06595i == null) {
            return;
        }
        int i9 = 0;
        while (i9 < i4) {
            try {
                if (this.A02 == this.A01) {
                    A01();
                    A03(c06595i);
                }
                int min = (int) Math.min(i4 - i9, this.A01 - this.A02);
                ((OutputStream) C5C.A0f(this.A06)).write(bArr, i + i9, min);
                i9 += min;
                this.A02 += min;
                this.A00 += min;
            } catch (IOException e6) {
                throw new C2058kW(e6);
            }
        }
    }
}
