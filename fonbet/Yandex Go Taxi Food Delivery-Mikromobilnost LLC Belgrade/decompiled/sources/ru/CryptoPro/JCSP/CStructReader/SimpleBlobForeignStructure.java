package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class SimpleBlobForeignStructure extends AbstractStructReader {
    private boolean a;
    public CIntReader algId;
    private boolean b;
    public BlobHeaderStructure blobHeader;
    public CPseudoArray encryptedKey;

    public SimpleBlobForeignStructure(int i, int i2, byte[] bArr) {
        this.a = false;
        this.b = false;
        this.blobHeader = new BlobHeaderStructure((byte) 1, (short) 0, i, 24);
        this.algId = new CIntLEReader(i2);
        this.encryptedKey = new CPseudoArray(bArr);
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.blobHeader.clear();
        this.algId.clear();
        this.encryptedKey.clear();
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
        this.algId.read(inputStream);
        this.encryptedKey.read(inputStream);
        try {
            if (inputStream.available() == 0) {
                this.a = true;
            }
            if (this.blobHeader.bType.value != 1) {
                throw new StructException("Wrong type.");
            }
            this.b = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.blobHeader.setAligned(i);
        this.algId.setAligned(i);
        this.encryptedKey.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.blobHeader.write(outputStream);
            this.algId.write(outputStream);
            this.encryptedKey.write(outputStream);
        }
    }

    public SimpleBlobForeignStructure() {
        this.a = false;
        this.b = false;
        this.blobHeader = new BlobHeaderStructure();
        this.algId = new CIntLEReader();
        this.encryptedKey = new CPseudoArray();
    }
}
