package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class PinNKParamStructure extends AbstractStructReader {
    private boolean a;
    private boolean b;
    public CShortReader k;
    public CShortReader n;
    public CLongPtrReader parts;

    public PinNKParamStructure(short s, short s2, long j) {
        this.a = false;
        this.b = false;
        this.n = new CShortLEReader(s);
        this.k = new CShortLEReader(s2);
        this.parts = new CLongPtrReader(j);
        this.a = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.n.clear();
        this.k.clear();
        this.parts.clear();
        this.b = false;
        this.a = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.n.getAlign();
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
            this.n.read(inputStream);
            this.k.read(inputStream);
            this.parts.read(inputStream);
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
        this.n.setAligned(i);
        this.k.setAligned(i);
        this.parts.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.a) {
            this.n.write(outputStream);
            this.k.write(outputStream);
            this.parts.write(outputStream);
        }
    }

    public PinNKParamStructure() {
        this.a = false;
        this.b = false;
        this.n = new CShortLEReader();
        this.k = new CShortLEReader();
        this.parts = new CLongPtrReader();
    }
}
