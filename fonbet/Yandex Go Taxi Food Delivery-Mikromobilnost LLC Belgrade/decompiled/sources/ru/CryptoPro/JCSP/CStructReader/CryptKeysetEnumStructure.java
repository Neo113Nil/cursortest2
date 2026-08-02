package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class CryptKeysetEnumStructure extends AbstractStructReader {
    private boolean a = false;
    private boolean b = false;
    public CIntLEReader count = new CIntLEReader();
    public CIntLEReader keySpec1 = new CIntLEReader();
    public CIntLEReader algId1 = new CIntLEReader();
    public CIntLEReader keySpec2 = new CIntLEReader();
    public CIntLEReader algId2 = new CIntLEReader();

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.count.clear();
        this.keySpec1.clear();
        this.algId1.clear();
        this.keySpec2.clear();
        this.algId2.clear();
        this.a = false;
        this.b = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.count.getAlign();
    }

    public int getCount() {
        return this.count.value;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        try {
            this.count.read(inputStream);
            this.keySpec1.read(inputStream);
            this.algId1.read(inputStream);
            this.keySpec2.read(inputStream);
            this.algId2.read(inputStream);
            if (inputStream.available() == 0) {
                this.a = true;
            }
            this.b = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.count.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.count.write(outputStream);
            this.keySpec1.write(outputStream);
            this.algId1.write(outputStream);
            this.keySpec2.write(outputStream);
            this.algId2.write(outputStream);
        }
    }
}
