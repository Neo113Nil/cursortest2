package ru.CryptoPro.JCSP.CStructReader;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class GostKExp15BlobStructure extends AbstractStructReader {
    public static final String WRONG_SIMPLE_KEY_BLOB = "Wrong SimpleKeyBlob: ";
    private boolean a = false;
    private boolean b;
    public CPseudoArray bEncryptedKey;
    public SimpleBlobHeaderStructure header;

    public GostKExp15BlobStructure(int i, int i2, byte[] bArr) {
        this.b = false;
        this.header = new SimpleBlobHeaderStructure((byte) 1, BlobHeaderStructure.KEXP15_BLOB_VERSION, 927617535, (short) 0, i, i2);
        this.bEncryptedKey = new CPseudoArray(bArr);
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.header.clear();
        this.bEncryptedKey.clear();
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
        this.bEncryptedKey.read(inputStream);
        if (this.header.blobHeader.bType.value != 1) {
            throw new StructException("Wrong SimpleKeyBlob: ".concat("Wrong type"));
        }
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.header.setAligned(i);
        this.bEncryptedKey.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.header.write(outputStream);
            this.bEncryptedKey.write(outputStream);
        }
    }
}
