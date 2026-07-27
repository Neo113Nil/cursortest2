package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.io.Writer;

/* renamed from: com.facebook.ads.redexgen.X.Xs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1366Xs extends Writer {
    public static String[] A03 = {"sr30eG8QqeA9PTnBv5Bt4hnZqAQxDLuJ", "ps2O52LB4Fk5tPEI", "b0E7ZBCk8ZgliqiBFiLr9fpcu", "ecf9I9JqHAeutuSgOmpZliCU4Q5JYn9j", "xrLrW173V2mkM", "oulCgqQ5su5pKYGJ0eYJOoBckMcEv73q", "45k95lrmWFpsS3hCtOsWilPKXmnWWUvV", "gCGLfpIuPcjj9nzv"};
    public int A00;
    public char[] A01 = new char[1024];
    public final InterfaceC1365Xr A02;

    public C1366Xs(InterfaceC1365Xr interfaceC1365Xr) {
        this.A02 = interfaceC1365Xr;
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
    public final void write(char[] cArr, int i, int i6) throws IOException {
        int i9 = i;
        while (true) {
            int i10 = i + i6;
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[4];
            int length = str.length();
            int i11 = str2.length();
            if (length == i11) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[2] = "vRRDkAC7ww5dnR4MiguJ90FB5";
            strArr2[4] = "BIleT5EfDSeSU";
            if (i9 < i10) {
                if (cArr[i9] != '\n') {
                    int i12 = this.A00;
                    int i13 = this.A01.length;
                    if (i12 != i13) {
                        this.A01[this.A00] = cArr[i9];
                        int i14 = this.A00;
                        this.A00 = i14 + 1;
                        i9++;
                    }
                }
                A00();
                i9++;
            } else {
                return;
            }
        }
    }
}
