package ru.CryptoPro.JCSP.CStructReader.pc_0;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import ru.CryptoPro.JCSP.CStructReader.StructReaderInterface;

/* loaded from: classes4.dex */
public class cl_3 implements StructReaderInterface {
    public byte[] a;
    public byte b;
    private boolean c;
    private boolean d;

    public cl_3(byte[] bArr) {
        this.a = null;
        this.b = (byte) -1;
        this.c = false;
        this.d = false;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            this.b = (byte) 1;
        } else {
            this.b = (byte) 0;
        }
        this.d = true;
        this.c = true;
    }

    public void a(int i) {
        if (this.c) {
            return;
        }
        this.a = new byte[i];
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        byte[] bArr = this.a;
        if (bArr != null) {
            Array.clear(bArr);
        }
        this.b = (byte) -1;
        this.a = null;
        this.d = false;
        this.c = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return 0;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.d;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int length() {
        if (ifInit()) {
            return this.a.length + 1;
        }
        return -1;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                throw new StructException("Не хватает данных!");
            }
            byte b = (byte) (read & 255);
            this.b = b;
            if (b == 0) {
                this.a = null;
            } else {
                if (inputStream.read(this.a) == -1) {
                    throw new StructException("Не хватает данных!");
                }
                if (inputStream.available() == 0) {
                    this.d = true;
                }
            }
            this.c = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        try {
            if (this.c) {
                outputStream.write(this.b);
                if (this.b != 0) {
                    outputStream.write(this.a);
                }
            }
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    public cl_3(int i) {
        this.a = null;
        this.b = (byte) -1;
        this.c = false;
        this.d = false;
        if (i > 0) {
            this.a = new byte[i];
        }
    }

    public cl_3() {
        this(0);
    }
}
