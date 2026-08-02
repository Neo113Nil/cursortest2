package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class CByteReader extends CIntegerReader {
    public static final int BYTE_MASK = 255;
    private static final int d = 1;
    private boolean a;
    private boolean b;
    private byte[] c;
    public byte value;

    public CByteReader(byte b) {
        this.c = new byte[0];
        this.value = b;
        this.b = true;
        this.a = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.value = (byte) 0;
        this.b = false;
        this.a = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        byte[] bArr = this.c;
        if (bArr.length == 0) {
            return 0;
        }
        return bArr.length + 1;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader
    public long getLongValue() {
        return this.value & 255;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int length() {
        return this.c.length + 1;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                throw new StructException("Not enough data!");
            }
            this.value = (byte) read;
            if (inputStream.read(this.c) < this.c.length) {
                throw new StructException("Not enough data!");
            }
            if (inputStream.available() == 0) {
                this.b = true;
            }
            this.a = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        if (i != 4 && i != 8 && i != 16) {
            return;
        }
        this.c = new byte[i - 1];
        int i2 = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i2 >= bArr.length) {
                return;
            }
            bArr[i2] = 0;
            i2++;
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader
    public void setValue(long j) {
        this.value = (byte) (j & 255);
        this.a = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        try {
            if (this.a) {
                outputStream.write(this.value);
                outputStream.write(this.c);
            }
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    public CByteReader() {
        this.value = (byte) 0;
        this.a = false;
        this.b = false;
        this.c = new byte[0];
    }
}
