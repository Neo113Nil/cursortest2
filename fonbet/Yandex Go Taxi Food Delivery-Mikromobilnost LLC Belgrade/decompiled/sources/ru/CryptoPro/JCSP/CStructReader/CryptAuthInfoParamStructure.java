package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class CryptAuthInfoParamStructure extends AbstractStructReader {
    private boolean a;
    public CByteReader auth_alg;
    public CByteReader auth_type;
    private boolean b;
    public CIntReader max_length;
    public CIntReader min_length;

    public CryptAuthInfoParamStructure() {
        this.a = false;
        this.b = false;
        this.auth_type = new CByteReader();
        this.auth_alg = new CByteReader();
        this.min_length = new CIntLEReader();
        this.max_length = new CIntLEReader();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.auth_type.clear();
        this.auth_alg.clear();
        this.min_length.clear();
        this.max_length.clear();
        this.b = false;
        this.a = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.max_length.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        try {
            this.auth_type.read(inputStream);
            this.auth_alg.read(inputStream);
            this.min_length.read(inputStream);
            this.max_length.read(inputStream);
            if (inputStream.available() == 0) {
                this.b = true;
            }
            this.a = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.auth_type.setAligned(i);
        this.auth_alg.setAligned(i);
        this.min_length.setAligned(i);
        this.max_length.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.a) {
            this.auth_type.write(outputStream);
            this.auth_alg.write(outputStream);
            this.min_length.write(outputStream);
            this.max_length.write(outputStream);
        }
    }

    public CryptAuthInfoParamStructure(byte b, byte b2, int i, int i2) {
        this.a = false;
        this.b = false;
        this.auth_type = new CByteReader(b);
        this.auth_alg = new CByteReader(b2);
        this.min_length = new CIntLEReader(i);
        this.max_length = new CIntLEReader(i2);
    }
}
