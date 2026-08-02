package s1;

import com.google.android.gms.internal.ads.C3839r5;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class d implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final FileInputStream f40303n;

    /* renamed from: u, reason: collision with root package name */
    public final Charset f40304u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f40305v;

    /* renamed from: w, reason: collision with root package name */
    public int f40306w;

    /* renamed from: x, reason: collision with root package name */
    public int f40307x;

    public d(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(e.f40308a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f40303n = fileInputStream;
        this.f40304u = charset;
        this.f40305v = new byte[8192];
    }

    public final String b() {
        int i;
        synchronized (this.f40303n) {
            try {
                byte[] bArr = this.f40305v;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f40306w >= this.f40307x) {
                    int read = this.f40303n.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f40306w = 0;
                    this.f40307x = read;
                }
                for (int i4 = this.f40306w; i4 != this.f40307x; i4++) {
                    byte[] bArr2 = this.f40305v;
                    if (bArr2[i4] == 10) {
                        int i6 = this.f40306w;
                        if (i4 != i6) {
                            i = i4 - 1;
                            if (bArr2[i] == 13) {
                                String str = new String(bArr2, i6, i - i6, this.f40304u.name());
                                this.f40306w = i4 + 1;
                                return str;
                            }
                        }
                        i = i4;
                        String str2 = new String(bArr2, i6, i - i6, this.f40304u.name());
                        this.f40306w = i4 + 1;
                        return str2;
                    }
                }
                C3839r5 c3839r5 = new C3839r5(this, (this.f40307x - this.f40306w) + 80);
                while (true) {
                    byte[] bArr3 = this.f40305v;
                    int i9 = this.f40306w;
                    c3839r5.write(bArr3, i9, this.f40307x - i9);
                    this.f40307x = -1;
                    byte[] bArr4 = this.f40305v;
                    int read2 = this.f40303n.read(bArr4, 0, bArr4.length);
                    if (read2 == -1) {
                        throw new EOFException();
                    }
                    this.f40306w = 0;
                    this.f40307x = read2;
                    for (int i10 = 0; i10 != this.f40307x; i10++) {
                        byte[] bArr5 = this.f40305v;
                        if (bArr5[i10] == 10) {
                            int i11 = this.f40306w;
                            if (i10 != i11) {
                                c3839r5.write(bArr5, i11, i10 - i11);
                            }
                            this.f40306w = i10 + 1;
                            return c3839r5.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f40303n) {
            try {
                if (this.f40305v != null) {
                    this.f40305v = null;
                    this.f40303n.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
