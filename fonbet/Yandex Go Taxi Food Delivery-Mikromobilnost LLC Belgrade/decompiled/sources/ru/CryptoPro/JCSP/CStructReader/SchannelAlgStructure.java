package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class SchannelAlgStructure extends AbstractStructReader {
    public CIntLEReader Algid;
    private boolean a;
    private boolean b;
    public CIntLEReader cBits;
    public CIntLEReader dwFlags;
    public CIntLEReader dwReserved;
    public CIntLEReader dwUse;

    public SchannelAlgStructure(int i, int i2, int i3) {
        this.a = false;
        this.b = false;
        this.dwUse = new CIntLEReader(i);
        this.Algid = new CIntLEReader(i2);
        this.cBits = new CIntLEReader(0);
        this.dwFlags = new CIntLEReader(0);
        this.dwReserved = new CIntLEReader(i3);
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.dwUse.clear();
        this.Algid.clear();
        this.a = false;
        this.b = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.dwUse.getAlign();
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
        this.dwUse.read(inputStream);
        this.Algid.read(inputStream);
        try {
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
        this.dwUse.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.dwUse.write(outputStream);
            this.Algid.write(outputStream);
            this.cBits.write(outputStream);
            this.dwFlags.write(outputStream);
            this.dwReserved.write(outputStream);
        }
    }

    public SchannelAlgStructure() {
        this.a = false;
        this.b = false;
        this.dwUse = new CIntLEReader();
        this.Algid = new CIntLEReader();
        this.cBits = new CIntLEReader();
        this.dwFlags = new CIntLEReader();
        this.dwReserved = new CIntLEReader();
    }
}
