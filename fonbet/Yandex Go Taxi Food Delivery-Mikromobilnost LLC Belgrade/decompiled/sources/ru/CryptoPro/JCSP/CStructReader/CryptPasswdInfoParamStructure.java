package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class CryptPasswdInfoParamStructure extends CryptPinInfoSourceStructure {
    private boolean a;
    private boolean b;
    public CIntReader pasLengthMax;
    public CIntReader pasLengthMin;
    public CIntReader passwdType;

    public CryptPasswdInfoParamStructure() {
        this.a = false;
        this.b = false;
        this.pasLengthMin = new CIntLEReader();
        this.pasLengthMax = new CIntLEReader();
        this.passwdType = new CIntLEReader();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.pasLengthMin.clear();
        this.pasLengthMax.clear();
        this.passwdType.clear();
        this.b = false;
        this.a = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.passwdType.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure
    public byte getUnionType() {
        return (byte) 0;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        try {
            this.pasLengthMin.read(inputStream);
            this.pasLengthMax.read(inputStream);
            this.passwdType.read(inputStream);
            if (inputStream.available() == 0) {
                this.b = true;
            }
            this.a = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.pasLengthMin.setAligned(i);
        this.pasLengthMax.setAligned(i);
        this.passwdType.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.a) {
            this.pasLengthMin.write(outputStream);
            this.pasLengthMax.write(outputStream);
            this.passwdType.write(outputStream);
        }
    }

    public CryptPasswdInfoParamStructure(int i, int i2, int i3) {
        this.a = false;
        this.b = false;
        this.pasLengthMin = new CIntLEReader(i);
        this.pasLengthMax = new CIntLEReader(i2);
        this.passwdType = new CIntLEReader(i3);
    }
}
