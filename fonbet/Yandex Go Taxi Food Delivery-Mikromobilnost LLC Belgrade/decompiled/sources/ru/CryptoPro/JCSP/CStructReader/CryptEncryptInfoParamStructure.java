package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class CryptEncryptInfoParamStructure extends CryptPinInfoSourceStructure {
    private boolean a = false;
    private boolean b = false;
    public CPseudoArray content;

    public CryptEncryptInfoParamStructure(int i) {
        this.content = new CPseudoArray(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.content.clear();
        this.b = false;
        this.a = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.content.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure
    public byte getUnionType() {
        return (byte) 1;
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
        this.content.read(inputStream);
        try {
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
        this.content.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.a) {
            this.content.write(outputStream);
        }
    }
}
