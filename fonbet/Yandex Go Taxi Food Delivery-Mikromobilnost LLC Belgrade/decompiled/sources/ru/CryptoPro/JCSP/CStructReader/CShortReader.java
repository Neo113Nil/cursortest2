package ru.CryptoPro.JCSP.CStructReader;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class CShortReader extends CIntegerReader {
    public static final int SHORT_MASK = 65535;
    public short value = 0;
    private boolean a = false;
    private boolean b = false;

    public CShortReader(short s) {
        a(s);
        b(true);
        a(true);
    }

    public final void a(short s) {
        this.value = s;
    }

    public final void b(boolean z) {
        this.b = z;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        a((short) 0);
        b(false);
        a(false);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ int getAlign();

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader
    public long getLongValue() {
        return this.value & 65535;
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
        return 2;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void read(InputStream inputStream) throws StructException;

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void setAligned(int i);

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader
    public void setValue(long j) {
        this.value = (short) (j & 65535);
        a(true);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void write(OutputStream outputStream) throws StructException;

    public final void a(boolean z) {
        this.a = z;
    }

    public CShortReader() {
    }
}
