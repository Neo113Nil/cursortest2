package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.io.Writer;

/* renamed from: com.facebook.ads.redexgen.X.Xs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1386Xs extends Writer {
    public static String[] A03 = {"sr30eG8QqeA9PTnBv5Bt4hnZqAQxDLuJ", "ps2O52LB4Fk5tPEI", "b0E7ZBCk8ZgliqiBFiLr9fpcu", "ecf9I9JqHAeutuSgOmpZliCU4Q5JYn9j", "xrLrW173V2mkM", "oulCgqQ5su5pKYGJ0eYJOoBckMcEv73q", "45k95lrmWFpsS3hCtOsWilPKXmnWWUvV", "gCGLfpIuPcjj9nzv"};
    public int A00;
    public char[] A01 = new char[1024];
    public final InterfaceC1385Xr A02;

    public C1386Xs(InterfaceC1385Xr interfaceC1385Xr) {
        this.A02 = interfaceC1385Xr;
    }

    private void A00() {
        this.A02.AH8(new String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i4) throws IOException {
        int i6 = i;
        while (true) {
            int i9 = i + i4;
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[4];
            int length = str.length();
            int i10 = str2.length();
            if (length == i10) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[2] = "vRRDkAC7ww5dnR4MiguJ90FB5";
            strArr2[4] = "BIleT5EfDSeSU";
            if (i6 < i9) {
                if (cArr[i6] != '\n') {
                    int i11 = this.A00;
                    int i12 = this.A01.length;
                    if (i11 != i12) {
                        this.A01[this.A00] = cArr[i6];
                        int i13 = this.A00;
                        this.A00 = i13 + 1;
                        i6++;
                    }
                }
                A00();
                i6++;
            } else {
                return;
            }
        }
    }
}
