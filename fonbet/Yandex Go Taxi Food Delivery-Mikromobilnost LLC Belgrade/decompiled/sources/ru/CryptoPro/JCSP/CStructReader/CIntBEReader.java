package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class CIntBEReader extends CIntReader {
    private int a;
    private byte[] b;

    public CIntBEReader() {
        this.a = 4;
        this.b = new byte[0];
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntReader, ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        byte[] bArr = this.b;
        if (bArr.length == 0) {
            return 0;
        }
        return bArr.length + this.a;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntReader, ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int length() {
        return this.b.length + this.a;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntReader, ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        try {
            byte[] bArr = new byte[4];
            if (inputStream.read(bArr) < 4) {
                throw new StructException("Not enough data!");
            }
            Array.invByteOrder(bArr);
            a(Array.getInt(bArr, 0));
            byte[] bArr2 = this.b;
            if (bArr2.length != 0 && inputStream.read(bArr2) < this.b.length) {
                throw new StructException("Not enough data!");
            }
            if (inputStream.available() == 0) {
                b(true);
            }
            a(true);
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntReader, ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        if (i != 8 && i != 16) {
            return;
        }
        this.b = new byte[i - this.a];
        int i2 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i2 >= bArr.length) {
                return;
            }
            bArr[i2] = 0;
            i2++;
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntReader, ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        try {
            if (ifInit()) {
                byte[] byteArray = Array.toByteArray(this.value);
                Array.invByteOrder(byteArray);
                outputStream.write(byteArray);
                outputStream.write(this.b);
            }
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    public CIntBEReader(int i) {
        super(i);
        this.a = 4;
        this.b = new byte[0];
    }
}
