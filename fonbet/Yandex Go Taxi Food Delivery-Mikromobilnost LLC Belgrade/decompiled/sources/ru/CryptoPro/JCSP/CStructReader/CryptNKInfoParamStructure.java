package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ru.CryptoPro.JCP.tools.CPString;

/* loaded from: classes4.dex */
public class CryptNKInfoParamStructure extends CryptPinInfoSourceStructure {
    private boolean a;
    private boolean b;
    public CShortReader k;
    public CShortReader n;
    public String[] parts;

    public CryptNKInfoParamStructure(short s, String[] strArr) {
        this.a = false;
        this.b = false;
        this.n = new CShortLEReader((short) strArr.length);
        this.k = new CShortLEReader(s);
        this.parts = strArr;
        this.a = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.n.clear();
        this.k.clear();
        this.parts = null;
        this.b = false;
        this.a = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.n.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure
    public byte getUnionType() {
        return (byte) 2;
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
            this.n.read(inputStream);
            this.k.read(inputStream);
            this.parts = new String[this.n.value];
            for (int i = 0; i < this.parts.length; i++) {
                if (inputStream.available() == 0) {
                    throw new StructException("Wrong structure length");
                }
                this.parts[i] = CPString.getString(inputStream);
            }
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
        this.n.setAligned(i);
        this.k.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinInfoSourceStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.a) {
            this.n.write(outputStream);
            this.k.write(outputStream);
            try {
                outputStream.write(CPString.getArray(this.parts));
            } catch (IOException e) {
                dy31.o(e);
            }
        }
    }

    public CryptNKInfoParamStructure() {
        this.a = false;
        this.b = false;
        this.n = new CShortLEReader();
        this.k = new CShortLEReader();
    }
}
