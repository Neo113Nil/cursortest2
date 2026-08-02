package ru.CryptoPro.ssl;

import defpackage.oyr;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.net.ssl.SSLException;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
class cl_82 extends ByteArrayOutputStream implements cl_88 {
    public cl_45 a;
    public int b;
    public boolean c;
    public final byte w;
    public cl_84 x;
    public cl_84 y;
    public static final int[] z = {-1, -1, -1, 2, 1, -1, 4, 5, -1, 6, 7};
    public static final int[] A = {-1, -1, -1, 128, 128, -1, 128, 128, -1, 64, 192};

    public cl_82(byte b, int i) {
        super(i);
        this.x = cl_84.C;
        this.y = cl_84.D;
        this.c = true;
        ((ByteArrayOutputStream) this).count = 5;
        this.w = b;
        this.b = 5;
    }

    public final int B() {
        return 16384 - (((ByteArrayOutputStream) this).count - 5);
    }

    public final int a(byte b, byte b2) {
        int i;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        int i2 = ((ByteArrayOutputStream) this).count;
        int i3 = i2 + 1;
        ((ByteArrayOutputStream) this).count = i3;
        bArr[i2] = 0;
        int i4 = i2 + 2;
        ((ByteArrayOutputStream) this).count = i4;
        bArr[i3] = b;
        int i5 = i2 + 3;
        ((ByteArrayOutputStream) this).count = i5;
        bArr[i4] = b2;
        if ((b2 & 255) > 10 || (i = z[b2]) == -1) {
            return 3;
        }
        int i6 = i2 + 4;
        ((ByteArrayOutputStream) this).count = i6;
        bArr[i5] = (byte) i;
        int i7 = i2 + 5;
        ((ByteArrayOutputStream) this).count = i7;
        bArr[i6] = 0;
        ((ByteArrayOutputStream) this).count = i2 + 6;
        bArr[i7] = (byte) A[b2];
        return 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(OutputStream outputStream, ByteArrayOutputStream byteArrayOutputStream) {
        int i;
        byte[] bArr;
        int i2 = ((ByteArrayOutputStream) this).count;
        char c = 5;
        if (i2 == 5) {
            return;
        }
        int i3 = i2 - 5;
        if (i3 < 0) {
            throw new SSLException(oyr.i(i3, "output record size too small: "));
        }
        byte b = this.w;
        if (b == 20) {
            SSLLogger.finer(Thread.currentThread().getName() + ", WRITE: " + this.x + " " + cl_69.B(b) + ", length = " + i3);
        }
        boolean z2 = this.c;
        int i4 = 0;
        if (z2 && z2 && this.y == cl_84.c && b == 22) {
            byte[] bArr2 = ((ByteArrayOutputStream) this).buf;
            if (bArr2[5] == 1 && bArr2[43] == 0) {
                char c2 = '\t';
                int i5 = i2 - 9;
                byte[] bArr3 = new byte[i5];
                System.arraycopy(bArr2, 9, bArr3, 0, i5);
                byte b2 = bArr3[34];
                int i6 = (((bArr3[35 + b2] & 255) << 8) + (bArr3[b2 + 36] & 255)) / 2;
                int i7 = b2 + 37;
                ((ByteArrayOutputStream) this).count = 11;
                int i8 = 0;
                boolean z3 = false;
                int i9 = 0;
                while (i8 < i6) {
                    int i10 = i7 + 1;
                    char c3 = c;
                    byte b3 = bArr3[i7];
                    i7 += 2;
                    char c4 = c2;
                    byte b4 = bArr3[i10];
                    i9 += a(b3, b4);
                    if (!z3 && b3 == 0 && b4 == -1) {
                        z3 = true;
                    }
                    i8++;
                    c = c3;
                    c2 = c4;
                }
                char c5 = c;
                char c6 = c2;
                if (!z3) {
                    i9 += a((byte) 0, (byte) -1);
                }
                byte[] bArr4 = ((ByteArrayOutputStream) this).buf;
                bArr4[2] = 1;
                bArr4[3] = bArr3[0];
                bArr4[4] = bArr3[1];
                bArr4[c5] = (byte) (i9 >>> 8);
                bArr4[6] = (byte) i9;
                bArr4[7] = 0;
                bArr4[8] = 0;
                bArr4[c6] = 0;
                bArr4[10] = BlobHeaderStructure.BLOB_VERSION;
                System.arraycopy(bArr3, 2, bArr4, ((ByteArrayOutputStream) this).count, 32);
                int i11 = ((ByteArrayOutputStream) this).count;
                int i12 = i11 + 30;
                ((ByteArrayOutputStream) this).count = i12;
                byte[] bArr5 = ((ByteArrayOutputStream) this).buf;
                byte b5 = (byte) (i12 >>> 8);
                bArr5[0] = b5;
                bArr5[0] = (byte) (b5 | DerValue.TAG_CONTEXT);
                bArr5[1] = (byte) i12;
                ((ByteArrayOutputStream) this).count = i11 + 32;
                this.a.a();
                this.b = 2;
                v();
                SSLLogger.finer(Thread.currentThread().getName() + ", WRITE: SSLv2 client hello message, length = " + (((ByteArrayOutputStream) this).count - 2));
                this.c = false;
                if (byteArrayOutputStream != null && byteArrayOutputStream.size() > 0) {
                    int size = byteArrayOutputStream.size();
                    i = ((ByteArrayOutputStream) this).count + size;
                    bArr = ((ByteArrayOutputStream) this).buf;
                    if (i > bArr.length) {
                        ((ByteArrayOutputStream) this).buf = Arrays.copyOf(bArr, i);
                    }
                    byte[] bArr6 = ((ByteArrayOutputStream) this).buf;
                    System.arraycopy(bArr6, 0, bArr6, size, ((ByteArrayOutputStream) this).count);
                    System.arraycopy(byteArrayOutputStream.toByteArray(), 0, ((ByteArrayOutputStream) this).buf, 0, size);
                    ((ByteArrayOutputStream) this).count += size;
                    byteArrayOutputStream.reset();
                    i4 = size;
                }
                d(outputStream, ((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, i4);
                reset();
            }
        }
        byte[] bArr7 = ((ByteArrayOutputStream) this).buf;
        bArr7[0] = b;
        cl_84 cl_84Var = this.x;
        bArr7[1] = cl_84Var.o;
        bArr7[2] = cl_84Var.p;
        bArr7[3] = (byte) (i3 >> 8);
        bArr7[4] = (byte) i3;
        this.c = false;
        if (byteArrayOutputStream != null) {
            int size2 = byteArrayOutputStream.size();
            i = ((ByteArrayOutputStream) this).count + size2;
            bArr = ((ByteArrayOutputStream) this).buf;
            if (i > bArr.length) {
            }
            byte[] bArr62 = ((ByteArrayOutputStream) this).buf;
            System.arraycopy(bArr62, 0, bArr62, size2, ((ByteArrayOutputStream) this).count);
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, ((ByteArrayOutputStream) this).buf, 0, size2);
            ((ByteArrayOutputStream) this).count += size2;
            byteArrayOutputStream.reset();
            i4 = size2;
        }
        d(outputStream, ((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, i4);
        reset();
    }

    public void d(OutputStream outputStream, byte[] bArr, int i, int i2) {
        outputStream.write(bArr, 0, i);
        outputStream.flush();
        if (SSLLogger.isAllEnabled()) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr, i2, i - i2);
            SSLLogger.dump("[Raw write]: length = ", Integer.valueOf(wrap.remaining()), wrap);
        }
    }

    public final void e(cl_7 cl_7Var) {
        int i = ((ByteArrayOutputStream) this).count - 5;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        Cipher cipher = cl_7Var.a;
        if (cipher != null) {
            try {
                boolean[] zArr = cl_7Var.d;
                if (zArr[0] || zArr[1]) {
                    cl_7Var.b();
                }
                SSLLogger.fine("Begin encrypt... ");
                if (SSLLogger.isAllEnabled()) {
                    SSLLogger.dump("Plaintext before ENCRYPTION: len = ", Integer.valueOf(i), ByteBuffer.wrap(bArr, 5, i));
                }
                int update = cl_7Var.a.update(bArr, 5, i, bArr, 5);
                SSLLogger.fine("Encrypted... ");
                if (update != i) {
                    throw new RuntimeException("Cipher buffering error in JCE provider " + cipher.getProvider().getName());
                }
                i = update;
            } catch (ShortBufferException e) {
                throw new ArrayIndexOutOfBoundsException(e.toString());
            }
        }
        ((ByteArrayOutputStream) this).count = i + 5;
    }

    public final synchronized void k(cl_84 cl_84Var) {
        this.x = cl_84Var;
    }

    public final boolean n() {
        return ((ByteArrayOutputStream) this).count > 6 && this.w == 21 && ((ByteArrayOutputStream) this).buf[6] == 0;
    }

    public final boolean o(cl_80 cl_80Var) {
        if (this.w == 22) {
            v();
        }
        if (cl_80Var.a == 0) {
            return false;
        }
        byte[] a = cl_80Var.a(this.w, null, ((ByteArrayOutputStream) this).buf, 5, ((ByteArrayOutputStream) this).count - 5);
        write(a);
        SSLLogger.fine("MAC computed: " + Array.toHexString(a));
        return true;
    }

    @Override // java.io.ByteArrayOutputStream
    public synchronized void reset() {
        super.reset();
        ((ByteArrayOutputStream) this).count = 5;
        this.b = 5;
    }

    public final void v() {
        int i = ((ByteArrayOutputStream) this).count - this.b;
        if (i > 0) {
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (SSLLogger.isAllEnabled()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(bArr, this.b, i);
                SSLLogger.dump("[write] GOST hashes: len = ", Integer.valueOf(i), ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
            }
            cl_45 cl_45Var = this.a;
            int i2 = this.b;
            cl_45Var.b.write(bArr, i2, i);
            cl_45Var.d(i2, i, bArr);
            this.b = ((ByteArrayOutputStream) this).count;
        }
    }

    public final boolean w() {
        return ((ByteArrayOutputStream) this).count == 5;
    }

    public cl_82(byte b) {
        this(b, (b == 20 || b == 21) ? cl_88.s : cl_88.o);
    }
}
