package ru.CryptoPro.ssl;

import defpackage.b64;
import defpackage.dy31;
import defpackage.kbs;
import defpackage.oyr;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import javax.crypto.BadPaddingException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLProtocolException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
class cl_69 extends ByteArrayInputStream implements cl_88 {
    public static final byte[] B = {DerValue.TAG_CONTEXT, 3, 0, 0, 1};
    public byte[] A;
    public cl_45 a;
    public int b;
    public boolean c;
    public boolean w;
    public boolean x;
    public cl_84 y;
    public int z;

    public cl_69() {
        super(new byte[cl_88.o]);
        this.c = true;
        this.y = cl_84.D;
        ((ByteArrayInputStream) this).pos = 5;
        ((ByteArrayInputStream) this).count = 5;
        this.b = 5;
        this.z = 0;
        this.A = null;
    }

    public static String B(int i) {
        switch (i) {
            case 20:
                return "Change Cipher Spec";
            case 21:
                return "Alert";
            case 22:
                return "Handshake";
            case 23:
                return "Application Data";
            default:
                return oyr.i(i, "contentType = ");
        }
    }

    public static void v(cl_84 cl_84Var, boolean z) {
        int i = cl_84Var.n;
        if (i < cl_84.A.n || (cl_84Var.o & 255) > (cl_84.B.o & 255)) {
            if (z && i == cl_84.c.n) {
                return;
            }
            throw new SSLException("Unsupported record version " + cl_84Var);
        }
    }

    public final void D(InputStream inputStream) {
        byte[] bArr = ((ByteArrayInputStream) this).buf;
        cl_84 a = cl_84.a(bArr[1], bArr[2]);
        v(a, false);
        byte[] bArr2 = ((ByteArrayInputStream) this).buf;
        int i = ((bArr2[3] & 255) << 8) + (bArr2[4] & 255);
        if (i < 0 || i > 33300) {
            StringBuilder t = b64.t(i, "Bad InputRecord size, count = ", ", buf.length = ");
            t.append(((ByteArrayInputStream) this).buf.length);
            throw new SSLProtocolException(t.toString());
        }
        if (i > bArr2.length - 5) {
            byte[] bArr3 = new byte[i + 5];
            System.arraycopy(bArr2, 0, bArr3, 0, 5);
            ((ByteArrayInputStream) this).buf = bArr3;
        }
        int i2 = this.z;
        int i3 = i + 5;
        if (i2 < i3 && c(inputStream, ((ByteArrayInputStream) this).buf, i2, i3 - i2) < 0) {
            throw new SSLException("SSL peer shut down incorrectly");
        }
        ((ByteArrayInputStream) this).count = i3;
        this.z = 0;
        if (i3 < 0 || i3 > 16916) {
            SSLLogger.finer(Thread.currentThread().getName() + ", Bad InputRecord size, count = " + ((ByteArrayInputStream) this).count);
        }
        SSLLogger.finer(Thread.currentThread().getName() + ", READ: " + a + " " + B(a()) + ", length = " + available());
    }

    public final void G() {
        int i = ((ByteArrayInputStream) this).pos;
        int i2 = this.b;
        int i3 = i - i2;
        if (i3 > 0) {
            e(i2, i3, ((ByteArrayInputStream) this).buf);
            this.b = ((ByteArrayInputStream) this).pos;
        }
    }

    public byte a() {
        return ((ByteArrayInputStream) this).buf[0];
    }

    public final int c(InputStream inputStream, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i + i3;
            int read = inputStream.read(bArr, i4, i2 - i3);
            if (read < 0) {
                return read;
            }
            if (SSLLogger.isAllEnabled()) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr, i4, read);
                SSLLogger.dump("[Raw read]: length = ", Integer.valueOf(wrap.remaining()), wrap);
            }
            i3 += read;
            this.z += read;
        }
        return i3;
    }

    @Override // java.io.ByteArrayInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.x = false;
        this.w = true;
        ((ByteArrayInputStream) this).mark = 0;
        ((ByteArrayInputStream) this).pos = 0;
        ((ByteArrayInputStream) this).count = 0;
    }

    public final void d(int i) {
        if (i > 0) {
            int i2 = ((ByteArrayInputStream) this).pos + i;
            ((ByteArrayInputStream) this).pos = i2;
            this.b = i2;
        }
    }

    public final void e(int i, int i2, byte[] bArr) {
        if (SSLLogger.isAllEnabled()) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(bArr, i, i2);
            SSLLogger.dump("[read] GOST hashes: len = ", Integer.valueOf(i2), ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
        }
        cl_45 cl_45Var = this.a;
        cl_45Var.b.write(bArr, i, i2);
        cl_45Var.d(i, i2, bArr);
    }

    public final void k(InputStream inputStream, OutputStream outputStream) {
        byte b;
        int i;
        byte[] bArr;
        int i2;
        if (this.w) {
            return;
        }
        int i3 = this.z;
        if (i3 < 5) {
            if (c(inputStream, ((ByteArrayInputStream) this).buf, i3, 5 - i3) < 0) {
                throw new EOFException("SSL peer shut down incorrectly");
            }
            ((ByteArrayInputStream) this).pos = 5;
            ((ByteArrayInputStream) this).count = 5;
            this.b = 5;
        }
        if (this.c) {
            D(inputStream);
            return;
        }
        byte b2 = 1;
        this.c = true;
        byte[] bArr2 = ((ByteArrayInputStream) this).buf;
        byte b3 = bArr2[0];
        if (b3 == 22 || b3 == 21) {
            D(inputStream);
            return;
        }
        int i4 = b3 & DerValue.TAG_CONTEXT;
        byte[] bArr3 = B;
        if (i4 == 0 || bArr2[2] != 1) {
            if (i4 != 0 && bArr2[2] == 4) {
                throw new SSLException("SSL V2.0 servers are not supported.");
            }
            for (int i5 = 0; i5 < 5; i5++) {
                if (((ByteArrayInputStream) this).buf[i5] != bArr3[i5]) {
                    throw new SSLException("Unrecognized SSL message, plaintext connection?");
                }
            }
            throw new SSLException("SSL V2.0 servers are not supported.");
        }
        cl_84 cl_84Var = this.y;
        cl_84 cl_84Var2 = cl_84.c;
        if (cl_84Var != cl_84Var2) {
            dy31.u("SSLv2Hello is disabled");
            return;
        }
        if (cl_84.a(bArr2[3], bArr2[4]) == cl_84Var2) {
            try {
                w(bArr3, outputStream);
            } catch (Exception unused) {
            }
            throw new SSLException("Unsupported SSL v2.0 ClientHello");
        }
        byte[] bArr4 = ((ByteArrayInputStream) this).buf;
        int i6 = ((bArr4[0] & HProv.PP_VERSION_TIMESTAMP) << 8) + (bArr4[1] & 255);
        int i7 = i6 - 3;
        if (this.A == null) {
            this.A = new byte[i7];
        }
        int i8 = this.z;
        int i9 = i6 + 2;
        if (i8 < i9 && c(inputStream, this.A, i8 - 5, i9 - i8) < 0) {
            throw new EOFException("SSL peer shut down incorrectly");
        }
        this.z = 0;
        e(2, 3, ((ByteArrayInputStream) this).buf);
        e(0, i7, this.A);
        byte[] bArr5 = this.A;
        byte[] bArr6 = ((ByteArrayInputStream) this).buf;
        bArr6[0] = 22;
        byte b4 = bArr6[3];
        bArr6[1] = b4;
        byte b5 = bArr6[4];
        bArr6[2] = b5;
        bArr6[5] = 1;
        bArr6[9] = b4;
        bArr6[10] = b5;
        ((ByteArrayInputStream) this).count = 11;
        int i10 = ((bArr5[0] & 255) << 8) + (bArr5[1] & 255);
        int i11 = ((bArr5[2] & 255) << 8) + (bArr5[3] & 255);
        int i12 = ((bArr5[4] & 255) << 8) + (bArr5[5] & 255);
        int i13 = i10 + 6 + i11;
        if (i12 < 32) {
            int i14 = 0;
            while (true) {
                int i15 = 32 - i12;
                bArr = ((ByteArrayInputStream) this).buf;
                b = b2;
                i2 = ((ByteArrayInputStream) this).count;
                if (i14 >= i15) {
                    break;
                }
                ((ByteArrayInputStream) this).count = i2 + 1;
                bArr[i2] = 0;
                i14++;
                b2 = b;
            }
            System.arraycopy(bArr5, i13, bArr, i2, i12);
            i = ((ByteArrayInputStream) this).count + i12;
        } else {
            b = 1;
            System.arraycopy(bArr5, (i12 - 32) + i13, bArr6, 11, 32);
            i = ((ByteArrayInputStream) this).count + 32;
        }
        ((ByteArrayInputStream) this).count = i;
        int i16 = i13 - i11;
        byte[] bArr7 = ((ByteArrayInputStream) this).buf;
        int i17 = ((ByteArrayInputStream) this).count;
        int i18 = i17 + 1;
        ((ByteArrayInputStream) this).count = i18;
        bArr7[i17] = (byte) i11;
        System.arraycopy(bArr5, i16, bArr7, i18, i11);
        int i19 = ((ByteArrayInputStream) this).count + i11;
        ((ByteArrayInputStream) this).count = i19;
        int i20 = i16 - i10;
        int i21 = i19 + 2;
        for (int i22 = 0; i22 < i10; i22 += 3) {
            int i23 = i20 + i22;
            if (bArr5[i23] == 0) {
                byte[] bArr8 = ((ByteArrayInputStream) this).buf;
                int i24 = i21 + 1;
                bArr8[i21] = bArr5[i23 + 1];
                i21 += 2;
                bArr8[i24] = bArr5[i23 + 2];
            }
        }
        int i25 = ((ByteArrayInputStream) this).count;
        int i26 = i25 + 2;
        int i27 = i21 - i26;
        byte[] bArr9 = ((ByteArrayInputStream) this).buf;
        int i28 = i25 + 1;
        ((ByteArrayInputStream) this).count = i28;
        bArr9[i25] = (byte) (i27 >>> 8);
        ((ByteArrayInputStream) this).count = i26;
        bArr9[i28] = (byte) i27;
        int i29 = i26 + i27;
        int i30 = i29 + 1;
        ((ByteArrayInputStream) this).count = i30;
        bArr9[i29] = b;
        int i31 = i29 + 2;
        ((ByteArrayInputStream) this).count = i31;
        bArr9[i30] = 0;
        int i32 = i29 - 3;
        bArr9[3] = (byte) i32;
        bArr9[4] = (byte) (i32 >>> 8);
        bArr9[6] = 0;
        int i33 = i29 - 7;
        bArr9[7] = (byte) (i33 >>> 8);
        bArr9[8] = (byte) i33;
        ((ByteArrayInputStream) this).pos = 5;
        this.A = null;
        this.b = i31;
        SSLLogger.finer(Thread.currentThread().getName() + ", READ: SSL v2, contentType = " + B(a()) + ", translated length = " + available());
    }

    public final void n(cl_69 cl_69Var) {
        G();
        int i = ((ByteArrayInputStream) this).pos;
        if (i > 5) {
            int i2 = ((ByteArrayInputStream) this).count - i;
            if (i2 != 0) {
                byte[] bArr = ((ByteArrayInputStream) this).buf;
                System.arraycopy(bArr, i, bArr, 5, i2);
            }
            ((ByteArrayInputStream) this).pos = 5;
            this.b = 5;
            ((ByteArrayInputStream) this).count = i2 + 5;
        }
        int available = cl_69Var.available();
        int i3 = ((ByteArrayInputStream) this).count;
        int i4 = available + i3;
        byte[] bArr2 = ((ByteArrayInputStream) this).buf;
        if (bArr2.length < i4) {
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i3);
            ((ByteArrayInputStream) this).buf = bArr3;
        }
        byte[] bArr4 = ((ByteArrayInputStream) cl_69Var).buf;
        int i5 = ((ByteArrayInputStream) cl_69Var).pos;
        byte[] bArr5 = ((ByteArrayInputStream) this).buf;
        int i6 = ((ByteArrayInputStream) this).count;
        System.arraycopy(bArr4, i5, bArr5, i6, i4 - i6);
        ((ByteArrayInputStream) this).count = i4;
        int i7 = cl_69Var.b - ((ByteArrayInputStream) cl_69Var).pos;
        if (((ByteArrayInputStream) this).pos != 5) {
            dy31.m("?? confused buffer hashing ??");
        } else {
            this.b += i7;
            ((ByteArrayInputStream) cl_69Var).pos = ((ByteArrayInputStream) cl_69Var).count;
        }
    }

    public final void o(cl_80 cl_80Var, cl_7 cl_7Var, cl_5 cl_5Var) {
        BadPaddingException badPaddingException;
        int i = cl_80Var.a;
        int i2 = ((ByteArrayInputStream) this).count;
        int i3 = i2 - 5;
        if (cl_7Var.a != null) {
            if (i3 < i) {
                throw new BadPaddingException("ciphertext sanity check failed");
            }
            try {
                ((ByteArrayInputStream) this).count = cl_7Var.a(i3, ((ByteArrayInputStream) this).buf) + 5;
            } catch (IOException e) {
                throw new BadPaddingException(e.getMessage());
            } catch (BadPaddingException e2) {
                badPaddingException = e2;
            }
        }
        badPaddingException = null;
        if (i != 0) {
            int i4 = (((ByteArrayInputStream) this).count - i) - 5;
            if (i4 < 0) {
                if (badPaddingException == null) {
                    badPaddingException = new BadPaddingException("bad record");
                }
                i4 = (i2 - i) - 5;
            }
            int i5 = i4;
            ((ByteArrayInputStream) this).count -= i;
            byte a = a();
            byte[] bArr = ((ByteArrayInputStream) this).buf;
            int i6 = cl_80Var.a;
            byte[] a2 = cl_80Var.a(a, null, bArr, 5, i5);
            if (a2 == null || i6 != a2.length) {
                kbs.g("Internal MAC error");
                return;
            }
            if (i6 != 0) {
                cl_5Var.a();
            }
            int i7 = 5 + i5;
            int[] iArr = {0, 0};
            for (int i8 = 0; i8 < a2.length; i8++) {
                if (bArr[i7 + i8] != a2[i8]) {
                    iArr[0] = iArr[0] + 1;
                } else {
                    iArr[1] = iArr[1] + 1;
                }
            }
            if (iArr[0] != 0 && badPaddingException == null) {
                badPaddingException = new BadPaddingException("bad record MAC");
            }
        }
        if (badPaddingException != null) {
            throw badPaddingException;
        }
    }

    public void w(byte[] bArr, OutputStream outputStream) {
        outputStream.write(bArr, 0, 5);
        outputStream.flush();
    }
}
