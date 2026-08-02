package com.jakewharton.disklrucache;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.toolbox.HttpResponse;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class StrictLineReader implements Closeable {
    public final /* synthetic */ int $r8$classId;
    public byte[] buf;
    public final Charset charset;
    public int end;
    public final FileInputStream in;
    public int pos;

    public StrictLineReader(FileInputStream fileInputStream, Charset charset, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                if (charset == null) {
                    throw null;
                }
                if (!charset.equals(com.bumptech.glide.disklrucache.Util.US_ASCII)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Unsupported encoding");
                    throw null;
                }
                this.in = fileInputStream;
                this.charset = charset;
                this.buf = new byte[PKIFailureInfo.certRevoked];
                return;
            default:
                if (charset == null) {
                    throw null;
                }
                if (!charset.equals(Util.US_ASCII)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Unsupported encoding");
                    throw null;
                }
                this.in = fileInputStream;
                this.charset = charset;
                this.buf = new byte[PKIFailureInfo.certRevoked];
                return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.$r8$classId) {
            case 0:
                synchronized (this.in) {
                    try {
                        if (this.buf != null) {
                            this.buf = null;
                            this.in.close();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.in) {
                    try {
                        if (this.buf != null) {
                            this.buf = null;
                            this.in.close();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public final String readLine() {
        String anonymousClass1;
        int i;
        String anonymousClass12;
        int i2;
        int i3 = 0;
        switch (this.$r8$classId) {
            case 0:
                synchronized (this.in) {
                    try {
                        byte[] bArr = this.buf;
                        if (bArr == null) {
                            throw new IOException("LineReader is closed");
                        }
                        if (this.pos >= this.end) {
                            int read = this.in.read(bArr, 0, bArr.length);
                            if (read == -1) {
                                throw new EOFException();
                            }
                            this.pos = 0;
                            this.end = read;
                        }
                        int i4 = this.pos;
                        while (true) {
                            if (i4 != this.end) {
                                byte[] bArr2 = this.buf;
                                if (bArr2[i4] == 10) {
                                    int i5 = this.pos;
                                    if (i4 != i5) {
                                        i = i4 - 1;
                                        if (bArr2[i] == 13) {
                                            anonymousClass1 = new String(bArr2, i5, i - i5, this.charset.name());
                                            this.pos = i4 + 1;
                                        }
                                    }
                                    i = i4;
                                    anonymousClass1 = new String(bArr2, i5, i - i5, this.charset.name());
                                    this.pos = i4 + 1;
                                } else {
                                    i4++;
                                }
                            } else {
                                AnonymousClass1 anonymousClass13 = new AnonymousClass1(this, (this.end - this.pos) + 80, i3);
                                while (true) {
                                    byte[] bArr3 = this.buf;
                                    int i6 = this.pos;
                                    anonymousClass13.write(bArr3, i6, this.end - i6);
                                    this.end = -1;
                                    FileInputStream fileInputStream = this.in;
                                    byte[] bArr4 = this.buf;
                                    int read2 = fileInputStream.read(bArr4, 0, bArr4.length);
                                    if (read2 == -1) {
                                        throw new EOFException();
                                    }
                                    this.pos = 0;
                                    this.end = read2;
                                    for (int i7 = 0; i7 != this.end; i7++) {
                                        byte[] bArr5 = this.buf;
                                        if (bArr5[i7] == 10) {
                                            int i8 = this.pos;
                                            if (i7 != i8) {
                                                anonymousClass13.write(bArr5, i8, i7 - i8);
                                            }
                                            this.pos = i7 + 1;
                                            anonymousClass1 = anonymousClass13.toString();
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
                return anonymousClass1;
            default:
                synchronized (this.in) {
                    try {
                        byte[] bArr6 = this.buf;
                        if (bArr6 == null) {
                            throw new IOException("LineReader is closed");
                        }
                        if (this.pos >= this.end) {
                            int read3 = this.in.read(bArr6, 0, bArr6.length);
                            if (read3 == -1) {
                                throw new EOFException();
                            }
                            this.pos = 0;
                            this.end = read3;
                        }
                        int i9 = this.pos;
                        while (true) {
                            if (i9 != this.end) {
                                byte[] bArr7 = this.buf;
                                if (bArr7[i9] == 10) {
                                    int i10 = this.pos;
                                    if (i9 != i10) {
                                        i2 = i9 - 1;
                                        if (bArr7[i2] == 13) {
                                            anonymousClass12 = new String(bArr7, i10, i2 - i10, this.charset.name());
                                            this.pos = i9 + 1;
                                        }
                                    }
                                    i2 = i9;
                                    anonymousClass12 = new String(bArr7, i10, i2 - i10, this.charset.name());
                                    this.pos = i9 + 1;
                                } else {
                                    i9++;
                                }
                            } else {
                                AnonymousClass1 anonymousClass14 = new AnonymousClass1(this, (this.end - this.pos) + 80, 2);
                                while (true) {
                                    byte[] bArr8 = this.buf;
                                    int i11 = this.pos;
                                    anonymousClass14.write(bArr8, i11, this.end - i11);
                                    this.end = -1;
                                    FileInputStream fileInputStream2 = this.in;
                                    byte[] bArr9 = this.buf;
                                    int read4 = fileInputStream2.read(bArr9, 0, bArr9.length);
                                    if (read4 == -1) {
                                        throw new EOFException();
                                    }
                                    this.pos = 0;
                                    this.end = read4;
                                    for (int i12 = 0; i12 != this.end; i12++) {
                                        byte[] bArr10 = this.buf;
                                        if (bArr10[i12] == 10) {
                                            int i13 = this.pos;
                                            if (i12 != i13) {
                                                anonymousClass14.write(bArr10, i13, i12 - i13);
                                            }
                                            this.pos = i12 + 1;
                                            anonymousClass12 = anonymousClass14.toString();
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
                return anonymousClass12;
        }
    }

    /* renamed from: com.jakewharton.disklrucache.StrictLineReader$1, reason: invalid class name */
    public final class AnonymousClass1 extends ByteArrayOutputStream {
        public final /* synthetic */ int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(HttpResponse httpResponse, int i) {
            this.$r8$classId = 1;
            this.this$0 = httpResponse;
            ((ByteArrayOutputStream) this).buf = httpResponse.getBuf(Math.max(i, 256));
        }

        @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            switch (this.$r8$classId) {
                case 1:
                    ((HttpResponse) this.this$0).returnBuf(((ByteArrayOutputStream) this).buf);
                    ((ByteArrayOutputStream) this).buf = null;
                    super.close();
                    break;
                default:
                    super.close();
                    break;
            }
        }

        public void expand(int i) {
            HttpResponse httpResponse = (HttpResponse) this.this$0;
            int i2 = ((ByteArrayOutputStream) this).count;
            if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
                return;
            }
            byte[] buf = httpResponse.getBuf((i2 + i) * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, buf, 0, ((ByteArrayOutputStream) this).count);
            httpResponse.returnBuf(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = buf;
        }

        public void finalize() {
            switch (this.$r8$classId) {
                case 1:
                    ((HttpResponse) this.this$0).returnBuf(((ByteArrayOutputStream) this).buf);
                    break;
                default:
                    super.finalize();
                    break;
            }
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    int i2 = ((ByteArrayOutputStream) this).count;
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        if (((ByteArrayOutputStream) this).buf[i3] == 13) {
                            i2 = i3;
                        }
                    }
                    try {
                        return new String(((ByteArrayOutputStream) this).buf, 0, i2, ((StrictLineReader) obj).charset.name());
                    } catch (UnsupportedEncodingException e) {
                        a$$ExternalSyntheticBUOutline0.m$1(e);
                        return null;
                    }
                case 1:
                default:
                    return super.toString();
                case 2:
                    int i4 = ((ByteArrayOutputStream) this).count;
                    if (i4 > 0) {
                        int i5 = i4 - 1;
                        if (((ByteArrayOutputStream) this).buf[i5] == 13) {
                            i4 = i5;
                        }
                    }
                    try {
                        return new String(((ByteArrayOutputStream) this).buf, 0, i4, ((StrictLineReader) obj).charset.name());
                    } catch (UnsupportedEncodingException e2) {
                        a$$ExternalSyntheticBUOutline0.m$1(e2);
                        return null;
                    }
            }
        }

        @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    synchronized (this) {
                        expand(i2);
                        super.write(bArr, i, i2);
                    }
                    return;
                default:
                    super.write(bArr, i, i2);
                    return;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Closeable closeable, int i, int i2) {
            super(i);
            this.$r8$classId = i2;
            this.this$0 = closeable;
        }

        @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
        public synchronized void write(int i) {
            switch (this.$r8$classId) {
                case 1:
                    synchronized (this) {
                        expand(1);
                        super.write(i);
                    }
                    return;
                default:
                    super.write(i);
                    return;
            }
        }
    }
}
