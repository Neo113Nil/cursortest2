package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import defpackage.w511;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class CHandleReader implements StructReaderInterface {
    public static final int LEN4 = 4;
    public static final int LEN8 = 8;
    private boolean a;
    private boolean b;
    public CPseudoArray value;

    public CHandleReader(byte[] bArr) {
        this.a = false;
        this.b = false;
        if (bArr.length != 4 && bArr.length != 8) {
            w511.q();
            throw null;
        }
        this.value = new CPseudoArray(bArr);
        this.a = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.value.clear();
        this.b = false;
        this.a = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.value.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int length() {
        return this.value.length();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        this.value.read(inputStream);
        try {
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
        this.value.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (ifInit()) {
            this.value.write(outputStream);
        }
    }

    public CHandleReader(int i) {
        this.a = false;
        this.b = false;
        if (i == 4 || i == 8) {
            this.value = new CPseudoArray(i);
        } else {
            w511.q();
            throw null;
        }
    }
}
