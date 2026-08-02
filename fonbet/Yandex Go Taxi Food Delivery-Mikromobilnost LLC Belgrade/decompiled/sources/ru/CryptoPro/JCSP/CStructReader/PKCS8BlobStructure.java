package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class PKCS8BlobStructure extends AbstractStructReader {
    private boolean a;
    private boolean b;
    public CPseudoArray bPKCS8;
    public BlobHeaderStructure blobHeader;

    public PKCS8BlobStructure(byte[] bArr) {
        this.a = false;
        this.b = false;
        this.blobHeader = new BlobHeaderStructure((byte) 25, (short) 0, 0, 24);
        this.bPKCS8 = new CPseudoArray(bArr);
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.blobHeader.clear();
        this.bPKCS8.clear();
        this.a = false;
        this.b = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.blobHeader.getAlign();
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
        this.blobHeader.read(inputStream);
        if (this.blobHeader.bType.value != 25) {
            throw new StructException("Wrong blob header type!");
        }
        this.bPKCS8.read(inputStream);
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
        this.blobHeader.setAligned(i);
        this.bPKCS8.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.blobHeader.write(outputStream);
            this.bPKCS8.write(outputStream);
        }
    }

    public PKCS8BlobStructure() {
        this.a = false;
        this.b = false;
        this.blobHeader = new BlobHeaderStructure();
        this.bPKCS8 = new CPseudoArray();
    }
}
