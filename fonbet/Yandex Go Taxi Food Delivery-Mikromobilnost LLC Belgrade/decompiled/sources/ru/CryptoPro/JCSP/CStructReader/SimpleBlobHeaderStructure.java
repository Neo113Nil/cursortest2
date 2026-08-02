package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class SimpleBlobHeaderStructure extends AbstractStructReader {
    public static final int SIMPLE_BLOB_HEADER_SIZE = 16;
    protected static final int a = 927617535;
    private static final int b = 927617533;
    public BlobHeaderStructure blobHeader;
    private boolean c;
    private boolean d;
    public CIntReader encryptKeyAlgId;
    public CIntReader magic;

    public SimpleBlobHeaderStructure(byte b2, byte b3, int i, short s, int i2, int i3) {
        this.c = false;
        this.d = false;
        this.blobHeader = new BlobHeaderStructure(b2, b3, s, i2, 0);
        this.magic = new CIntLEReader(i);
        this.encryptKeyAlgId = new CIntLEReader(i3);
        this.d = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.blobHeader.clear();
        this.magic.clear();
        this.encryptKeyAlgId.clear();
        this.c = false;
        this.d = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.magic.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.d;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        this.blobHeader.read(inputStream);
        this.magic.read(inputStream);
        this.encryptKeyAlgId.read(inputStream);
        try {
            if (inputStream.available() == 0) {
                this.c = true;
            }
            if (this.magic.value != b) {
                throw new StructException("Wrong magic!");
            }
            this.d = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.blobHeader.setAligned(i);
        this.magic.setAligned(i);
        this.encryptKeyAlgId.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.d) {
            this.blobHeader.write(outputStream);
            this.magic.write(outputStream);
            this.encryptKeyAlgId.write(outputStream);
        }
    }

    public SimpleBlobHeaderStructure() {
        this.c = false;
        this.d = false;
        this.blobHeader = new BlobHeaderStructure();
        this.magic = new CIntLEReader();
        this.encryptKeyAlgId = new CIntLEReader();
    }

    public SimpleBlobHeaderStructure(byte b2, short s, int i, int i2) {
        this(b2, (byte) 0, b, s, i, i2);
    }
}
