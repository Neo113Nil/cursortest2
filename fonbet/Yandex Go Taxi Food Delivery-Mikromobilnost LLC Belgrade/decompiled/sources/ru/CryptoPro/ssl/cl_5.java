package ru.CryptoPro.ssl;

import defpackage.w511;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
final class cl_5 {
    public final AtomicLong a = new AtomicLong(0);
    public byte[] b = new byte[0];
    public final byte[] c = new byte[13];

    public void a() {
        this.a.incrementAndGet();
        synchronized (this) {
            byte[] bArr = this.b;
            for (int length = bArr.length - 1; length >= 0; length--) {
                byte b = (byte) (bArr[length] + 1);
                bArr[length] = b;
                if (b != 0) {
                    break;
                }
            }
        }
        synchronized (this) {
            byte[] bArr2 = this.c;
            for (int i = 7; i >= 0; i--) {
                byte b2 = (byte) (bArr2[i] + 1);
                bArr2[i] = b2;
                if (b2 != 0) {
                    break;
                }
            }
        }
    }

    public long b() {
        return this.a.get();
    }

    public synchronized byte[] c() {
        byte[] bArr;
        bArr = this.b;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public void a(cl_84 cl_84Var) {
        byte b = cl_84Var.o;
        byte[] bArr = this.c;
        bArr[9] = b;
        bArr[10] = cl_84Var.p;
    }

    public void a(byte[] bArr) {
        if (bArr.length != 8 && bArr.length != 4) {
            w511.d(bArr.length, "Invalid IV length = ");
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public synchronized byte[] a(byte b, int i) {
        byte[] bArr;
        bArr = (byte[]) this.c.clone();
        bArr[8] = b;
        bArr[11] = (byte) (i >> 8);
        bArr[12] = (byte) i;
        return bArr;
    }
}
