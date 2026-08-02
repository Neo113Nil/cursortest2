package org.brotli.dec;

import defpackage.e6w;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class a {
    public InputStream d;
    public boolean e;
    public long f;
    public int g;
    public int h;
    public final byte[] a = new byte[4160];
    public final int[] b = new int[1040];
    public final e6w c = new e6w();
    public int i = 0;

    public static void a(a aVar, boolean z) {
        if (aVar.e) {
            int i = ((aVar.h << 2) + ((aVar.g + 7) >> 3)) - 8;
            int i2 = aVar.i;
            if (i > i2) {
                d.a("Read after end");
            } else {
                if (!z || i == i2) {
                    return;
                }
                d.a("Unused bytes after end");
            }
        }
    }

    public static void b(a aVar) {
        int i = aVar.g;
        if (i >= 32) {
            int[] iArr = aVar.b;
            aVar.h = aVar.h + 1;
            aVar.f = (iArr[r3] << 32) | (aVar.f >>> 32);
            aVar.g = i - 32;
        }
    }

    public static int c(a aVar) {
        return (aVar.e ? (aVar.i + 3) >> 2 : 1024) - aVar.h;
    }

    public static int d(a aVar, int i) {
        b(aVar);
        long j = aVar.f;
        int i2 = aVar.g;
        int i3 = ((int) (j >>> i2)) & ((1 << i) - 1);
        aVar.g = i2 + i;
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r7.e = true;
        r7.i = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        r2 = r2 + 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(a aVar) {
        int i = aVar.h;
        byte[] bArr = aVar.a;
        if (i <= 1015) {
            return;
        }
        if (aVar.e) {
            if (c(aVar) >= -2) {
                return;
            }
            d.a("No more input");
            return;
        }
        int i2 = i << 2;
        int i3 = 4096 - i2;
        System.arraycopy(bArr, i2, bArr, 0, i3);
        aVar.h = 0;
        while (true) {
            if (i3 >= 4096) {
                break;
            }
            try {
                int read = aVar.d.read(bArr, i3, 4096 - i3);
                if (read <= 0) {
                    break;
                } else {
                    i3 += read;
                }
            } catch (IOException e) {
                throw new BrotliRuntimeException("Failed to read input", e);
            }
        }
        e6w e6wVar = aVar.c;
        int i4 = i3 >> 2;
        for (int i5 = 0; i5 < i4; i5++) {
            int[] iArr = e6wVar.b;
            byte[] bArr2 = e6wVar.a;
            int i6 = i5 * 4;
            iArr[i5] = ((bArr2[i6 + 3] & 255) << 24) | (bArr2[i6] & 255) | ((bArr2[i6 + 1] & 255) << 8) | ((bArr2[i6 + 2] & 255) << 16);
        }
    }
}
