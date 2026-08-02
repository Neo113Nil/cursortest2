package ru.CryptoPro.ssl;

import defpackage.kbs;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import javax.crypto.BadPaddingException;
import javax.net.ssl.SSLException;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
final class cl_29 extends cl_69 {
    public static final ByteBuffer E = ByteBuffer.allocate(0);
    public SSLEngineImpl C;
    public boolean D;

    public final int I(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 5) {
            return -1;
        }
        int position = byteBuffer.position();
        byte b = byteBuffer.get(position);
        if (this.c || b == 22 || b == 21) {
            cl_69.v(cl_84.a(byteBuffer.get(position + 1), byteBuffer.get(position + 2)), false);
            this.c = true;
            return ((byteBuffer.get(position + 3) & 255) << 8) + (byteBuffer.get(position + 4) & 255) + 5;
        }
        boolean z = (b & DerValue.TAG_CONTEXT) != 0;
        if (z) {
            int i = position + 2;
            if (byteBuffer.get(i) == 1 || byteBuffer.get(i) == 4) {
                cl_69.v(cl_84.a(byteBuffer.get(position + 3), byteBuffer.get(position + 4)), true);
                return (((z ? Byte.MAX_VALUE : (byte) 63) & b) << 8) + (byteBuffer.get(position + 1) & 255) + (z ? 2 : 3);
            }
        }
        throw new SSLException("Unrecognized SSL message, plaintext connection?");
    }

    public final ByteBuffer P(cl_80 cl_80Var, cl_7 cl_7Var, cl_5 cl_5Var, ByteBuffer byteBuffer) {
        BadPaddingException badPaddingException;
        ByteBuffer byteBuffer2;
        if (this.D) {
            o(cl_80Var, cl_7Var, cl_5Var);
            return E;
        }
        int i = cl_80Var.a;
        int remaining = byteBuffer.remaining();
        if (cl_7Var.a != null) {
            if (remaining < i) {
                throw new BadPaddingException("ciphertext sanity check failed");
            }
            try {
                cl_7Var.c(byteBuffer);
            } catch (BadPaddingException e) {
                badPaddingException = e;
            } finally {
                byteBuffer.rewind();
            }
        }
        badPaddingException = null;
        if (i != 0) {
            int limit = byteBuffer.limit() - i;
            if (byteBuffer.remaining() < i) {
                if (badPaddingException == null) {
                    badPaddingException = new BadPaddingException("bad record");
                }
                limit = remaining - i;
                byteBuffer.limit(remaining);
            }
            byte a = a();
            int position = byteBuffer.position();
            int i2 = cl_80Var.a;
            int limit2 = byteBuffer.limit();
            int i3 = limit2 - i2;
            byteBuffer.limit(i3);
            byteBuffer2 = byteBuffer;
            byte[] a2 = cl_80Var.a(a, byteBuffer2, null, 0, byteBuffer.remaining());
            if (a2 == null || i2 != a2.length) {
                kbs.g("Internal MAC error");
                return null;
            }
            if (i2 != 0) {
                cl_5Var.a();
            }
            byteBuffer2.position(i3);
            byteBuffer2.limit(limit2);
            try {
                int[] iArr = {0, 0};
                for (byte b : a2) {
                    if (byteBuffer2.get() != b) {
                        iArr[0] = iArr[0] + 1;
                    } else {
                        iArr[1] = iArr[1] + 1;
                    }
                }
                if ((iArr[0] != 0) && badPaddingException == null) {
                    badPaddingException = new BadPaddingException("bad record MAC");
                }
                byteBuffer2.limit(limit);
            } finally {
                byteBuffer2.position(position);
                byteBuffer2.limit(i3);
            }
        } else {
            byteBuffer2 = byteBuffer;
        }
        if (badPaddingException == null) {
            return byteBuffer2.slice();
        }
        throw badPaddingException;
    }

    public final ByteBuffer R(ByteBuffer byteBuffer) {
        if (!this.c || byteBuffer.get(byteBuffer.position()) != 23) {
            this.D = true;
            k(new ByteBufferInputStream(byteBuffer), null);
            return E;
        }
        this.D = false;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        cl_69.v(cl_84.a(byteBuffer.get(position + 1), byteBuffer.get(position + 2)), false);
        int I = I(byteBuffer);
        if (SSLLogger.isAllEnabled()) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.limit(position + I);
            SSLLogger.dump("[Raw read (bb)]: length = ", duplicate);
        }
        byteBuffer.position(position + 5);
        byteBuffer.limit(position + I);
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(byteBuffer.limit());
        byteBuffer.limit(limit);
        return slice;
    }

    @Override // ru.CryptoPro.ssl.cl_69
    public final byte a() {
        if (this.D) {
            return ((ByteArrayInputStream) this).buf[0];
        }
        return (byte) 23;
    }

    @Override // ru.CryptoPro.ssl.cl_69
    public final void w(byte[] bArr, OutputStream outputStream) {
        ByteBuffer flip = ByteBuffer.allocate(5).put(bArr, 0, 5).flip();
        cl_31 cl_31Var = this.C.c;
        synchronized (cl_31Var) {
            if (cl_31Var.b) {
                throw new IOException("Write side already closed");
            }
            cl_31Var.a.addLast(flip);
        }
    }
}
