package ru.CryptoPro.JCSP.CStructReader;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class CLongPtrReader extends CIntegerReader {
    public static final int PTR_SIZE = 4;
    public CIntegerReader value;

    public CLongPtrReader(long j) {
        this.value = new CIntLEReader((int) ((j << 32) >>> 32));
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        setValue(0L);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.value.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader
    public long getLongValue() {
        return this.value.getLongValue();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.value.ifComplete();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.value.ifInit();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int length() {
        return 4;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        this.value.read(inputStream);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.value.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader
    public void setValue(long j) {
        this.value.setValue(j);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        this.value.write(outputStream);
    }

    public CLongPtrReader(int i) {
        this.value = new CIntLEReader(i);
    }

    public CLongPtrReader() {
        this.value = new CIntLEReader();
    }
}
