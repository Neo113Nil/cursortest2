package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class PubKeyParamStructure extends AbstractStructReader {
    private static final int c = 826753357;
    private static final int d = 826364754;
    private static final int e = 927617536;
    private boolean a;
    private boolean b;
    public CIntLEReader bitLen;
    public CIntLEReader magic;

    public PubKeyParamStructure(int i, int i2) {
        this.a = false;
        this.b = false;
        this.magic = i2 == 24 ? new CIntLEReader(d) : i2 == 32 ? new CIntLEReader(e) : new CIntLEReader(c);
        this.bitLen = new CIntLEReader(i);
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.magic.clear();
        this.bitLen.clear();
        this.a = false;
        this.b = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.bitLen.getAlign();
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
        this.magic.read(inputStream);
        this.bitLen.read(inputStream);
        try {
            if (inputStream.available() == 0) {
                this.a = true;
            }
            int i = this.magic.value;
            if (i != c && i != d && i != e) {
                throw new StructException("Invalid structure version");
            }
            this.b = true;
        } catch (IOException e2) {
            dy31.o(e2);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.magic.setAligned(i);
        this.bitLen.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.magic.write(outputStream);
            this.bitLen.write(outputStream);
        }
    }

    public PubKeyParamStructure() {
        this.a = false;
        this.b = false;
        this.magic = new CIntLEReader();
        this.bitLen = new CIntLEReader();
    }
}
