package q1;

import com.google.android.gms.internal.ads.C3722p5;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class d implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final FileInputStream f39911n;

    /* renamed from: u, reason: collision with root package name */
    public final Charset f39912u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f39913v;

    /* renamed from: w, reason: collision with root package name */
    public int f39914w;

    /* renamed from: x, reason: collision with root package name */
    public int f39915x;

    public d(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(e.f39916a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f39911n = fileInputStream;
        this.f39912u = charset;
        this.f39913v = new byte[8192];
    }

    public final String b() {
        int i;
        synchronized (this.f39911n) {
            try {
                byte[] bArr = this.f39913v;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f39914w >= this.f39915x) {
                    int read = this.f39911n.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f39914w = 0;
                    this.f39915x = read;
                }
                for (int i4 = this.f39914w; i4 != this.f39915x; i4++) {
                    byte[] bArr2 = this.f39913v;
                    if (bArr2[i4] == 10) {
                        int i9 = this.f39914w;
                        if (i4 != i9) {
                            i = i4 - 1;
                            if (bArr2[i] == 13) {
                                String str = new String(bArr2, i9, i - i9, this.f39912u.name());
                                this.f39914w = i4 + 1;
                                return str;
                            }
                        }
                        i = i4;
                        String str2 = new String(bArr2, i9, i - i9, this.f39912u.name());
                        this.f39914w = i4 + 1;
                        return str2;
                    }
                }
                C3722p5 c3722p5 = new C3722p5(this, (this.f39915x - this.f39914w) + 80);
                while (true) {
                    byte[] bArr3 = this.f39913v;
                    int i10 = this.f39914w;
                    c3722p5.write(bArr3, i10, this.f39915x - i10);
                    this.f39915x = -1;
                    byte[] bArr4 = this.f39913v;
                    int read2 = this.f39911n.read(bArr4, 0, bArr4.length);
                    if (read2 == -1) {
                        throw new EOFException();
                    }
                    this.f39914w = 0;
                    this.f39915x = read2;
                    for (int i11 = 0; i11 != this.f39915x; i11++) {
                        byte[] bArr5 = this.f39913v;
                        if (bArr5[i11] == 10) {
                            int i12 = this.f39914w;
                            if (i11 != i12) {
                                c3722p5.write(bArr5, i12, i11 - i12);
                            }
                            this.f39914w = i11 + 1;
                            return c3722p5.toString();
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
        synchronized (this.f39911n) {
            try {
                if (this.f39913v != null) {
                    this.f39913v = null;
                    this.f39911n.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
