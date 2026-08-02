package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class PrivateKeyBlobStructure extends AbstractStructReader {
    public static final String WRONG_PRIVATE_KEY_BLOB = "Wrong PrivateKeyBlob: ";
    private boolean a;
    private boolean b;
    public CPseudoArray exported;
    public PubKeyInfoHeaderStructure header;

    public PrivateKeyBlobStructure(byte[] bArr, int i, int i2) {
        this.header = null;
        this.exported = null;
        this.a = false;
        this.b = false;
        this.header = new PubKeyInfoHeaderStructure((byte) 7, (short) 0, i, i2, 0);
        this.exported = new CPseudoArray(bArr);
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.header.clear();
        this.exported.clear();
        this.a = false;
        this.b = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.header.getAlign();
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
        this.header.read(inputStream);
        this.exported.read(inputStream);
        try {
            if (inputStream.available() == 0) {
                this.a = true;
            }
            if (this.header.blobHeader.bType.value != 7) {
                throw new StructException("Wrong PrivateKeyBlob: ".concat("Wrong type"));
            }
            this.b = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.header.setAligned(i);
        this.exported.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.header.write(outputStream);
            this.exported.write(outputStream);
        }
    }

    public PrivateKeyBlobStructure() {
        this.header = null;
        this.exported = null;
        this.a = false;
        this.b = false;
        this.header = new PubKeyInfoHeaderStructure();
        this.exported = new CPseudoArray();
    }
}
