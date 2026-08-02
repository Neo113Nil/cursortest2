package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class PinParamStructure extends AbstractStructReader {
    private boolean a;
    private boolean b;
    public CByteReader type;
    public CryptPinSourceStructure value;

    public PinParamStructure(byte b, long j) {
        CByteReader cByteReader;
        this.a = false;
        this.b = false;
        if (b == 1) {
            this.value = new CryptPinSourceProvStructure(j);
            cByteReader = new CByteReader(b);
        } else if (b == 0) {
            this.value = new CryptPinSourcePasswStructure(j);
            cByteReader = new CByteReader(b);
        } else {
            if (b == 2) {
                return;
            }
            this.value = new CryptPinSourcePasswStructure(0L);
            cByteReader = new CByteReader(b);
        }
        this.type = cByteReader;
        this.a = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.type.clear();
        CryptPinSourceStructure cryptPinSourceStructure = this.value;
        if (cryptPinSourceStructure != null) {
            cryptPinSourceStructure.clear();
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
            this.value = b != 1 ? b != 2 ? new CryptPinSourcePasswStructure() : new CryptPinSourceNKHandlesStructure() : new CryptPinSourceProvStructure();
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

    public PinParamStructure() {
        this.a = false;
        this.b = false;
        this.type = new CByteReader();
        this.value = null;
    }

    public PinParamStructure(short s, short s2, long j) {
        this.a = false;
        this.b = false;
        CryptPinSourceNKHandlesStructure cryptPinSourceNKHandlesStructure = new CryptPinSourceNKHandlesStructure(s, s2, j);
        this.value = cryptPinSourceNKHandlesStructure;
        this.type = new CByteReader(cryptPinSourceNKHandlesStructure.getUnionType());
        this.a = true;
    }
}
