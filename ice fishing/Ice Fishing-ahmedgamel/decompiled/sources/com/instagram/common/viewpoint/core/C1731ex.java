package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.ads.redexgen.X.ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1731ex extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC2336pF A02;
    public final Uri A03;
    public final C5Y A04;
    public final C1836ge A05;
    public final String A06;

    public C1731ex(C1836ge c1836ge, Uri uri, C5Y c5y) throws IOException {
        this.A05 = c1836ge;
        this.A04 = c5y;
        this.A03 = uri;
        this.A06 = C1771fb.A09(this.A05, this.A03);
        A00(0);
    }

    private void A00(int i) throws IOException {
        if (this.A02 != null) {
            this.A02.close();
        }
        this.A02 = this.A04.A5I();
        this.A01 = (int) this.A02.AGi(new C06605i(this.A03, i, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b9 = new byte[1];
        return read(b9);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i6) throws IOException {
        int read = this.A02.read(bArr, i, i6);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j6) throws IOException {
        long j9 = this.A01 - this.A00;
        if (j9 <= 0) {
            return 0L;
        }
        if (j6 > j9) {
            j6 = j9;
        }
        this.A00 = (int) (this.A00 + j6);
        A00(this.A00);
        return j6;
    }
}
