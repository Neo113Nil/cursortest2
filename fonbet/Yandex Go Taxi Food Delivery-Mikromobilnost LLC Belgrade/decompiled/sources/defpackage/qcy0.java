package defpackage;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import javax.net.ssl.SSLException;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.MSCAPI.Sspi;
import ru.CryptoPro.ssl.SSLLogger;
import ru.CryptoPro.sspiSSL.SSLSocketImpl;

/* loaded from: classes4.dex */
public final class qcy0 extends OutputStream {
    public final /* synthetic */ int a = 1;
    public Closeable b;
    public Object c;

    public qcy0(OutputStream outputStream, OutputStream outputStream2) {
        this.b = outputStream;
        this.c = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.a) {
            case 0:
                ((OutputStream) this.b).close();
                ((OutputStream) this.c).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        switch (this.a) {
            case 0:
                ((OutputStream) this.b).flush();
                ((OutputStream) this.c).flush();
                break;
            default:
                super.flush();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        char c;
        switch (this.a) {
            case 0:
                ((OutputStream) this.b).write(bArr, i, i2);
                ((OutputStream) this.c).write(bArr, i, i2);
                return;
            default:
                byte[] bArr2 = (byte[]) this.c;
                SSLSocketImpl sSLSocketImpl = (SSLSocketImpl) this.b;
                bArr.getClass();
                if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
                    ny61.s();
                    return;
                }
                if (sSLSocketImpl.n() == 1) {
                    sSLSocketImpl.startHandshake();
                }
                int[] iArr = new int[1];
                int[] iArr2 = {i2};
                int[] iArr3 = {i};
                do {
                    try {
                        if (SSLLogger.isAllEnabled()) {
                            ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
                            SSLLogger.dump("[Raw write]: length = ", Integer.valueOf(wrap.remaining()), wrap);
                        }
                        Array.clear(bArr2);
                        iArr[0] = bArr2.length;
                        if (sSLSocketImpl.n() != 2) {
                            return;
                        }
                        sSLSocketImpl.getEngine().u();
                        sSLSocketImpl.getEngine().f.lock();
                        try {
                            int encryptMessage = Sspi.encryptMessage(sSLSocketImpl.getEngine().g, bArr, iArr3, iArr2, (byte[]) this.c, iArr);
                            sSLSocketImpl.getEngine().f.unlock();
                            sSLSocketImpl.getEngine().v();
                            if (encryptMessage != 0 && encryptMessage != 590615 && encryptMessage != -2146893033) {
                                throw new SSLException("Error due write 0x" + Integer.toHexString(encryptMessage));
                            }
                            int i3 = iArr[0];
                            if (i3 != 0) {
                                byte[] copy = Array.copy(bArr2, 0, i3);
                                if (SSLLogger.isAllEnabled()) {
                                    c = 0;
                                    SSLLogger.dump("[Raw write encrypted]: length = ", Integer.valueOf(copy.length), ByteBuffer.wrap(copy));
                                } else {
                                    c = 0;
                                }
                                sSLSocketImpl.getSockOutput().write(copy);
                                sSLSocketImpl.getSockOutput().flush();
                            } else {
                                c = 0;
                            }
                            if (encryptMessage == 590615 || encryptMessage == -2146893033) {
                                return;
                            }
                        } catch (Throwable th) {
                            sSLSocketImpl.getEngine().f.unlock();
                            sSLSocketImpl.getEngine().v();
                            throw th;
                        }
                    } catch (Exception e) {
                        sSLSocketImpl.c(e);
                        throw null;
                    }
                } while (iArr2[c] > 0);
                return;
        }
    }

    public /* synthetic */ qcy0() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.a) {
            case 0:
                ((OutputStream) this.b).write(bArr);
                ((OutputStream) this.c).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.a) {
            case 0:
                ((OutputStream) this.b).write(i);
                ((OutputStream) this.c).write(i);
                break;
            default:
                write(new byte[]{(byte) (i & 255)}, 0, 1);
                break;
        }
    }
}
