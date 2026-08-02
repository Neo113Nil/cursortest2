package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class BlobHeaderStructure extends AbstractStructReader {
    public static final byte BLOB_VERSION = 32;
    public static final byte CUR_BLOB_VERSION = 2;
    public static final byte KEXP15_BLOB_VERSION = 33;
    private boolean a;
    public CIntLEReader aiKeyAlg;
    private boolean b;
    public CByteReader bType;
    public CByteReader bVersion;
    public CShortLEReader reserved;

    public BlobHeaderStructure(byte b, byte b2, short s, int i, int i2) {
        CByteReader cByteReader;
        this.a = false;
        this.b = false;
        this.bType = new CByteReader(b);
        if (b2 != 0) {
            cByteReader = new CByteReader(b2);
        } else {
            cByteReader = new CByteReader(i2 == 24 ? (byte) 2 : BLOB_VERSION);
        }
        this.bVersion = cByteReader;
        this.reserved = new CShortLEReader(s);
        this.aiKeyAlg = new CIntLEReader(i);
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.bType.clear();
        this.bVersion.clear();
        this.reserved.clear();
        this.aiKeyAlg.clear();
        this.a = false;
        this.b = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.bType.getAlign();
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
        this.bType.read(inputStream);
        this.bVersion.read(inputStream);
        this.reserved.read(inputStream);
        this.aiKeyAlg.read(inputStream);
        if (this.aiKeyAlg.value == 9216) {
            this.aiKeyAlg = new CIntLEReader(HProv.CALG_RSA_KEYX);
        }
        try {
            if (inputStream.available() == 0) {
                this.a = true;
            }
            byte b = this.bVersion.value;
            if (b != 32 && b != 2) {
                throw new StructException("Invalid structure");
            }
            this.b = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.bType.setAligned(i);
        this.bVersion.setAligned(i);
        this.reserved.setAligned(i);
        this.aiKeyAlg.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.bType.write(outputStream);
            this.bVersion.write(outputStream);
            this.reserved.write(outputStream);
            this.aiKeyAlg.write(outputStream);
        }
    }

    public BlobHeaderStructure() {
        this.a = false;
        this.b = false;
        this.bType = new CByteReader();
        this.bVersion = new CByteReader();
        this.reserved = new CShortLEReader();
        this.aiKeyAlg = new CIntLEReader();
    }

    public BlobHeaderStructure(byte b, short s, int i, int i2) {
        this(b, (byte) 0, s, i, i2);
    }
}
