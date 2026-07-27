package com.instagram.common.viewpoint.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1626dF extends InputStream {
    public static byte[] A04;
    public MessageDigest A00;
    public final C1835ge A01;
    public final InterfaceC1625dE A02;
    public final FileInputStream A03;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-52, -61, -76, -23, -8, -15};
    }

    public C1626dF(C1835ge c1835ge, FileInputStream fileInputStream, InterfaceC1625dE interfaceC1625dE) {
        this.A03 = fileInputStream;
        this.A02 = interfaceC1625dE;
        this.A01 = c1835ge;
        try {
            this.A00 = MessageDigest.getInstance(A00(0, 3, 84));
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b9 = new byte[1];
        return read(b9);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int read = this.A03.read(bArr, i, i4);
        if (this.A00 != null) {
            try {
                if (read > 0) {
                    this.A00.update(bArr, i, read);
                } else if (read == -1) {
                    this.A02.A9s(C1347Xa.A05(this.A00.digest()));
                    this.A00 = null;
                }
            } catch (Exception e6) {
                this.A00 = null;
                this.A01.A08().ABz(A00(3, 3, 90), AbstractC1251Td.A13, new C1252Te(e6));
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j9) throws IOException {
        int actuallyRead = (int) j9;
        byte[] bArr = new byte[1024];
        long j10 = 0;
        while (actuallyRead > 0) {
            int bytesToRead = read(bArr, 0, Math.min(actuallyRead, 1024));
            if (bytesToRead <= 0) {
                break;
            }
            actuallyRead -= bytesToRead;
            j10 += bytesToRead;
        }
        return j10;
    }
}
