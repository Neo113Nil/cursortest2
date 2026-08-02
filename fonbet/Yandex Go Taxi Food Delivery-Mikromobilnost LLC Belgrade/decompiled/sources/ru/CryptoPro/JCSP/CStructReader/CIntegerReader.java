package ru.CryptoPro.JCSP.CStructReader;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class CIntegerReader implements StructReaderInterface {
    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void clear();

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ int getAlign();

    public abstract long getLongValue();

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ boolean ifComplete();

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ boolean ifInit();

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ int length();

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void read(InputStream inputStream) throws StructException;

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void setAligned(int i);

    public abstract void setValue(long j);

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void write(OutputStream outputStream) throws StructException;
}
