package q1;

import com.google.android.gms.internal.ads.C3816r5;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class d implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final FileInputStream f40001n;

    /* renamed from: u, reason: collision with root package name */
    public final Charset f40002u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f40003v;

    /* renamed from: w, reason: collision with root package name */
    public int f40004w;

    /* renamed from: x, reason: collision with root package name */
    public int f40005x;

    public d(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(e.f40006a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f40001n = fileInputStream;
        this.f40002u = charset;
        this.f40003v = new byte[8192];
    }

    public final String b() {
        int i;
        synchronized (this.f40001n) {
            try {
                byte[] bArr = this.f40003v;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f40004w >= this.f40005x) {
                    int read = this.f40001n.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f40004w = 0;
                    this.f40005x = read;
                }
                for (int i6 = this.f40004w; i6 != this.f40005x; i6++) {
                    byte[] bArr2 = this.f40003v;
                    if (bArr2[i6] == 10) {
                        int i9 = this.f40004w;
                        if (i6 != i9) {
                            i = i6 - 1;
                            if (bArr2[i] == 13) {
                                String str = new String(bArr2, i9, i - i9, this.f40002u.name());
                                this.f40004w = i6 + 1;
                                return str;
                            }
                        }
                        i = i6;
                        String str2 = new String(bArr2, i9, i - i9, this.f40002u.name());
                        this.f40004w = i6 + 1;
                        return str2;
                    }
                }
                C3816r5 c3816r5 = new C3816r5(this, (this.f40005x - this.f40004w) + 80);
                while (true) {
                    byte[] bArr3 = this.f40003v;
                    int i10 = this.f40004w;
                    c3816r5.write(bArr3, i10, this.f40005x - i10);
                    this.f40005x = -1;
                    byte[] bArr4 = this.f40003v;
                    int read2 = this.f40001n.read(bArr4, 0, bArr4.length);
                    if (read2 == -1) {
                        throw new EOFException();
                    }
                    this.f40004w = 0;
                    this.f40005x = read2;
                    for (int i11 = 0; i11 != this.f40005x; i11++) {
                        byte[] bArr5 = this.f40003v;
                        if (bArr5[i11] == 10) {
                            int i12 = this.f40004w;
                            if (i11 != i12) {
                                c3816r5.write(bArr5, i12, i11 - i12);
                            }
                            this.f40004w = i11 + 1;
                            return c3816r5.toString();
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
        synchronized (this.f40001n) {
            try {
                if (this.f40003v != null) {
                    this.f40003v = null;
                    this.f40001n.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
