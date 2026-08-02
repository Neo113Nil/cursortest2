package ru.CryptoPro.JCSP.CStructReader;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class CIntReader extends CIntegerReader {
    public int value = 0;
    private boolean a = false;
    private boolean b = false;

    public CIntReader(int i) {
        a(i);
        b(true);
        a(true);
    }

    public final void a(int i) {
        this.value = i;
    }

    public final void b(boolean z) {
        this.b = z;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        a(0);
        b(false);
        a(false);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ int getAlign();

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader
    public long getLongValue() {
        return (this.value << 32) >>> 32;
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
        return 4;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void read(InputStream inputStream) throws StructException;

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void setAligned(int i);

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader
    public void setValue(long j) {
        this.value = (int) ((j << 32) >>> 32);
        a(true);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CIntegerReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void write(OutputStream outputStream) throws StructException;

    public final void a(boolean z) {
        this.a = z;
    }

    public CIntReader() {
    }
}
