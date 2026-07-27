package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.C2941aq;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: n, reason: collision with root package name */
    public final FileOutputStream f23418n;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f23419u;

    /* renamed from: v, reason: collision with root package name */
    public final C2941aq f23420v;

    /* renamed from: w, reason: collision with root package name */
    public int f23421w;

    public b(FileOutputStream fileOutputStream, C2941aq c2941aq) {
        this.f23418n = fileOutputStream;
        this.f23420v = c2941aq;
        this.f23419u = (byte[]) c2941aq.f(com.anythink.basead.exoplayer.b.aX, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.f23418n;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f23419u;
            if (bArr != null) {
                this.f23420v.k(bArr);
                this.f23419u = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i = this.f23421w;
        FileOutputStream fileOutputStream = this.f23418n;
        if (i > 0) {
            fileOutputStream.write(this.f23419u, 0, i);
            this.f23421w = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.f23419u;
        int i6 = this.f23421w;
        int i9 = i6 + 1;
        this.f23421w = i9;
        bArr[i6] = (byte) i;
        if (i9 != bArr.length || i9 <= 0) {
            return;
        }
        this.f23418n.write(bArr, 0, i9);
        this.f23421w = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i6) {
        int i9 = 0;
        do {
            int i10 = i6 - i9;
            int i11 = i + i9;
            int i12 = this.f23421w;
            FileOutputStream fileOutputStream = this.f23418n;
            if (i12 == 0 && i10 >= this.f23419u.length) {
                fileOutputStream.write(bArr, i11, i10);
                return;
            }
            int min = Math.min(i10, this.f23419u.length - i12);
            System.arraycopy(bArr, i11, this.f23419u, this.f23421w, min);
            int i13 = this.f23421w + min;
            this.f23421w = i13;
            i9 += min;
            byte[] bArr2 = this.f23419u;
            if (i13 == bArr2.length && i13 > 0) {
                fileOutputStream.write(bArr2, 0, i13);
                this.f23421w = 0;
            }
        } while (i9 < i6);
    }
}
