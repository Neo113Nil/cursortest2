package ru.CryptoPro.JCSP.CStructReader;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class CryptPinSourcePasswStructure extends CryptPinSourceStructure {
    public CLongPtrReader value;

    public CryptPinSourcePasswStructure() {
        this.value = new CLongPtrReader();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.value.setValue(0L);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.value.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure
    public byte getUnionType() {
        return (byte) 0;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.value.ifComplete();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.value.ifInit();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        this.value.read(inputStream);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.value.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        this.value.write(outputStream);
    }

    public CryptPinSourcePasswStructure(long j) {
        this.value = new CLongPtrReader(j);
    }
}
