package ru.CryptoPro.JCSP.CStructReader;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class OpaqueBlobStructure extends AbstractStructReader {
    public static final int CHAIN_BLOCK_LEN = 8;
    public static final int OTHER_LENGTH = 4;
    public static final String WRONG_OPAQUE_KEY_BLOB = "Wrong OpaqueKeyBlob: ";
    boolean a;
    boolean b;
    public SimpleBlobHeaderStructure header;

    public OpaqueBlobStructure(int i, int i2) {
        this.a = false;
        this.b = false;
        this.header = new SimpleBlobHeaderStructure((byte) 9, (short) 0, i, i2);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.header.clear();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.header.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ boolean ifComplete();

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ boolean ifInit();

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        this.header.read(inputStream);
        if (this.header.blobHeader.bType.value != 9) {
            throw new StructException(WRONG_OPAQUE_KEY_BLOB.concat("Wrong type"));
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.header.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (ifInit()) {
            this.header.write(outputStream);
        }
    }

    public OpaqueBlobStructure() {
        this.a = false;
        this.b = false;
        this.header = new SimpleBlobHeaderStructure();
    }
}
