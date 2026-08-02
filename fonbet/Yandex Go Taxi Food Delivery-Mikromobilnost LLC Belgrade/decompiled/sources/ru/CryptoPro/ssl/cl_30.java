package ru.CryptoPro.ssl;

import defpackage.kbs;
import defpackage.oyr;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

/* loaded from: classes4.dex */
final class cl_30 extends cl_82 {
    public final SSLEngineImpl B;
    public final cl_31 C;
    public boolean D;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cl_30(byte b, SSLEngineImpl sSLEngineImpl) {
        super(b, r1);
        int i;
        switch (b) {
            case 20:
            case 21:
                i = cl_88.s;
                break;
            case 22:
                i = cl_88.o;
                break;
            case 23:
                i = 0;
                break;
            default:
                kbs.g(oyr.i(b, "Unknown record type: "));
                throw null;
        }
        this.D = false;
        this.B = sSLEngineImpl;
        this.C = sSLEngineImpl.c;
    }

    public final void D(EngineArgs engineArgs, cl_80 cl_80Var, cl_7 cl_7Var, cl_5 cl_5Var, int i) {
        boolean z;
        char c;
        ByteBuffer byteBuffer = engineArgs.netData;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = position + 5;
        byteBuffer.position(i2);
        engineArgs.gather(i);
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.position(i2);
        int i3 = cl_80Var.a;
        byte b = this.w;
        if (i3 != 0) {
            byte[] a = cl_80Var.a(b, byteBuffer, null, 0, byteBuffer.remaining());
            byteBuffer.limit(byteBuffer.limit() + a.length);
            byteBuffer.put(a);
            z = true;
        } else {
            z = false;
        }
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.position(i2);
        cl_7Var.getClass();
        int remaining = byteBuffer.remaining();
        Cipher cipher = cl_7Var.a;
        if (cipher == null) {
            byteBuffer.position(byteBuffer.limit());
        } else {
            try {
                int position2 = byteBuffer.position();
                SSLLogger.fine("Begin encrypt... ");
                if (SSLLogger.isAllEnabled()) {
                    c = 1;
                    SSLLogger.dump("Plaintext before ENCRYPTION: len = ", Integer.valueOf(remaining), byteBuffer);
                } else {
                    c = 1;
                }
                byteBuffer.position(position2);
                ByteBuffer duplicate = byteBuffer.duplicate();
                boolean[] zArr = cl_7Var.d;
                if (zArr[0] || zArr[c]) {
                    cl_7Var.b();
                }
                int update = cipher.update(duplicate, byteBuffer);
                SSLLogger.fine("Encrypted... ");
                if (byteBuffer.position() != duplicate.position()) {
                    throw new RuntimeException("bytebuffer padding error");
                }
                if (update != remaining) {
                    throw new RuntimeException("Cipher buffering error in JCE provider " + cipher.getProvider().getName());
                }
            } catch (ShortBufferException e) {
                RuntimeException runtimeException = new RuntimeException(e.toString());
                runtimeException.initCause(e);
                throw runtimeException;
            }
        }
        if (z) {
            cl_5Var.a();
        }
        if (b == 20) {
            SSLLogger.finer(Thread.currentThread().getName() + ", WRITE: " + this.x + " " + cl_69.B(b) + ", length = " + i);
        }
        int limit2 = byteBuffer.limit() - i2;
        byteBuffer.put(position, b);
        byteBuffer.put(position + 1, this.x.o);
        byteBuffer.put(position + 2, this.x.p);
        byteBuffer.put(position + 3, (byte) (limit2 >> 8));
        byteBuffer.put(position + 4, (byte) limit2);
        byteBuffer.limit(limit);
    }

    @Override // ru.CryptoPro.ssl.cl_82
    public final void d(OutputStream outputStream, byte[] bArr, int i, int i2) {
        this.C.a.addLast(ByteBuffer.allocate(i).put(bArr, 0, i).flip());
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.D = false;
    }
}
