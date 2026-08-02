package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class CPseudoArray implements StructReaderInterface {
    private boolean a;
    private boolean b;
    public byte[] value;

    public CPseudoArray(byte[] bArr) {
        this.value = null;
        this.a = false;
        this.b = false;
        byte[] bArr2 = new byte[bArr.length];
        this.value = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.b = true;
        this.a = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        byte[] bArr = this.value;
        if (bArr != null) {
            Array.clear(bArr);
        }
        this.value = null;
        this.b = false;
        this.a = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return 0;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.a;
    }

    public void inverse() {
        Array.invByteOrder(this.value);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int length() {
        if (ifInit()) {
            return this.value.length;
        }
        return -1;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        try {
            if (this.value == null) {
                this.value = new byte[inputStream.available()];
            }
            if (inputStream.read(this.value) == -1) {
                throw new StructException("Not enough data!");
            }
            if (inputStream.available() == 0) {
                this.b = true;
            }
            this.a = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
    }

    public void setLength(int i) {
        if (this.a) {
            return;
        }
        this.value = new byte[i];
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        try {
            if (this.a) {
                outputStream.write(this.value);
            }
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    public CPseudoArray(int i) {
        this.value = null;
        this.a = false;
        this.b = false;
        if (i > 0) {
            this.value = new byte[i];
        }
    }

    public CPseudoArray() {
        this(0);
    }
}
