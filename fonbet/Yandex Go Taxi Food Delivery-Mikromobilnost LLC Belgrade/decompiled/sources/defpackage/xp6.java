package defpackage;

import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;

/* loaded from: classes4.dex */
public final class xp6 extends OutputStream {
    public final /* synthetic */ int a;
    public Object b;

    public xp6(yp6 yp6Var) {
        this.a = 0;
        this.b = yp6Var;
    }

    private final void a() {
    }

    private final void c() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.a) {
            case 0:
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
                break;
            default:
                super.flush();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((yp6) this.b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.a) {
            case 0:
                ((yp6) this.b).e0(i);
                break;
            case 1:
                ((MessageDigest) this.b).update((byte) i);
                break;
            default:
                try {
                    ((Signature) this.b).update((byte) i);
                    break;
                } catch (SignatureException e) {
                    dac.g(e.getMessage(), e);
                    return;
                }
        }
    }

    public /* synthetic */ xp6(int i) {
        this.a = i;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.a) {
            case 1:
                ((MessageDigest) this.b).update(bArr);
                break;
            case 2:
                try {
                    ((Signature) this.b).update(bArr);
                    break;
                } catch (SignatureException e) {
                    dac.g(e.getMessage(), e);
                    return;
                }
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                ((yp6) this.b).write(bArr, i, i2);
                break;
            case 1:
                ((MessageDigest) this.b).update(bArr, i, i2);
                break;
            default:
                try {
                    ((Signature) this.b).update(bArr, i, i2);
                    break;
                } catch (SignatureException e) {
                    dac.g(e.getMessage(), e);
                    return;
                }
        }
    }
}
