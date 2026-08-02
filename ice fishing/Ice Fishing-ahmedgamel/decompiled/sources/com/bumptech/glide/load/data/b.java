package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.C2964aq;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: n, reason: collision with root package name */
    public final FileOutputStream f24205n;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f24206u;

    /* renamed from: v, reason: collision with root package name */
    public final C2964aq f24207v;

    /* renamed from: w, reason: collision with root package name */
    public int f24208w;

    public b(FileOutputStream fileOutputStream, C2964aq c2964aq) {
        this.f24205n = fileOutputStream;
        this.f24207v = c2964aq;
        this.f24206u = (byte[]) c2964aq.f(com.anythink.basead.exoplayer.b.aX, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.f24205n;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f24206u;
            if (bArr != null) {
                this.f24207v.k(bArr);
                this.f24206u = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i = this.f24208w;
        FileOutputStream fileOutputStream = this.f24205n;
        if (i > 0) {
            fileOutputStream.write(this.f24206u, 0, i);
            this.f24208w = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.f24206u;
        int i4 = this.f24208w;
        int i6 = i4 + 1;
        this.f24208w = i6;
        bArr[i4] = (byte) i;
        if (i6 != bArr.length || i6 <= 0) {
            return;
        }
        this.f24205n.write(bArr, 0, i6);
        this.f24208w = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i4) {
        int i6 = 0;
        do {
            int i9 = i4 - i6;
            int i10 = i + i6;
            int i11 = this.f24208w;
            FileOutputStream fileOutputStream = this.f24205n;
            if (i11 == 0 && i9 >= this.f24206u.length) {
                fileOutputStream.write(bArr, i10, i9);
                return;
            }
            int min = Math.min(i9, this.f24206u.length - i11);
            System.arraycopy(bArr, i10, this.f24206u, this.f24208w, min);
            int i12 = this.f24208w + min;
            this.f24208w = i12;
            i6 += min;
            byte[] bArr2 = this.f24206u;
            if (i12 == bArr2.length && i12 > 0) {
                fileOutputStream.write(bArr2, 0, i12);
                this.f24208w = 0;
            }
        } while (i6 < i4);
    }
}
