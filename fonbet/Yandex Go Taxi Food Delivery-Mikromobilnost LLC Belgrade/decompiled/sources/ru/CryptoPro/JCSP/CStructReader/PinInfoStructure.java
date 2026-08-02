package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class PinInfoStructure extends AbstractStructReader {
    private boolean a;
    private boolean b;
    public CByteReader type;
    public CryptPinInfoSourceStructure value;

    public PinInfoStructure(int i) {
        this.a = false;
        this.b = false;
        CryptEncryptInfoParamStructure cryptEncryptInfoParamStructure = new CryptEncryptInfoParamStructure(i);
        this.value = cryptEncryptInfoParamStructure;
        this.type = new CByteReader(cryptEncryptInfoParamStructure.getUnionType());
        this.a = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.type.clear();
        CryptPinInfoSourceStructure cryptPinInfoSourceStructure = this.value;
        if (cryptPinInfoSourceStructure != null) {
            cryptPinInfoSourceStructure.clear();
        }
        this.b = false;
        this.a = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.type.getAlign();
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
            this.type.read(inputStream);
            byte b = this.type.value;
            this.value = b != 1 ? b != 2 ? new CryptPasswdInfoParamStructure() : new CryptNKInfoParamStructure() : new CryptEncryptInfoParamStructure(1);
            this.value.read(inputStream);
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
        this.type.setAligned(i);
        this.value.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.a) {
            this.type.write(outputStream);
            this.value.write(outputStream);
        }
    }

    public PinInfoStructure() {
        this.a = false;
        this.b = false;
        this.type = new CByteReader();
        this.value = null;
    }

    public PinInfoStructure(int i, int i2, int i3) {
        this.a = false;
        this.b = false;
        CryptPasswdInfoParamStructure cryptPasswdInfoParamStructure = new CryptPasswdInfoParamStructure(i, i2, i3);
        this.value = cryptPasswdInfoParamStructure;
        this.type = new CByteReader(cryptPasswdInfoParamStructure.getUnionType());
        this.a = true;
    }

    public PinInfoStructure(CryptPinInfoSourceStructure cryptPinInfoSourceStructure) {
        this.a = false;
        this.b = false;
        this.value = cryptPinInfoSourceStructure;
        this.type = new CByteReader(cryptPinInfoSourceStructure.getUnionType());
        this.a = true;
    }

    public PinInfoStructure(short s, String[] strArr) {
        this.a = false;
        this.b = false;
        CryptNKInfoParamStructure cryptNKInfoParamStructure = new CryptNKInfoParamStructure(s, strArr);
        this.value = cryptNKInfoParamStructure;
        this.type = new CByteReader(cryptNKInfoParamStructure.getUnionType());
        this.a = true;
    }
}
