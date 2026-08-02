package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class nzb extends ByteArrayOutputStream {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nzb(int i) {
        super(i);
        this.a = 0;
    }

    public static void b() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException();
        }
    }

    public byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public byte[] g() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        bArr.getClass();
        return bArr;
    }

    public byte[] o() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        bArr.getClass();
        return bArr;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 2:
                bArr.getClass();
                b();
                super.write(bArr, i, i2);
                break;
            default:
                super.write(bArr, i, i2);
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream
    public void writeTo(OutputStream outputStream) {
        switch (this.a) {
            case 2:
                outputStream.getClass();
                b();
                super.writeTo(outputStream);
                break;
            default:
                super.writeTo(outputStream);
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(int i) {
        switch (this.a) {
            case 2:
                b();
                super.write(i);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.a) {
            case 2:
                b();
                super.write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }
}
