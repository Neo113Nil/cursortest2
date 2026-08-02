package ru.CryptoPro.JCSP.CStructReader;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class AbstractStructReader implements StructReaderInterface {
    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void clear();

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ int getAlign();

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ boolean ifComplete();

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ boolean ifInit();

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int length() {
        if (!ifInit()) {
            return -1;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(0);
        try {
            write(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray().length;
        } catch (StructException unused) {
            return -1;
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void read(InputStream inputStream) throws StructException;

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void setAligned(int i);

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void write(OutputStream outputStream) throws StructException;
}
