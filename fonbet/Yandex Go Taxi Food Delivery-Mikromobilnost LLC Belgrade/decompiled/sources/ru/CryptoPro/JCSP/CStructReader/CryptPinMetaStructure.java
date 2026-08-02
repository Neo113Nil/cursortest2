package ru.CryptoPro.JCSP.CStructReader;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class CryptPinMetaStructure extends AbstractStructReader {
    public static final byte CRYPT_PIN_CLEAR = 5;
    public static final byte CRYPT_PIN_ENCRYPTION = 1;
    public static final byte CRYPT_PIN_HARDWARE_PROTECTION = 6;
    public static final byte CRYPT_PIN_NK = 2;
    public static final byte CRYPT_PIN_PASSWD = 0;
    public static final byte CRYPT_PIN_QUERY = 4;
    public static final byte CRYPT_PIN_UNKNOWN = 3;

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void clear();

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ int getAlign();

    public abstract byte getUnionType();

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ boolean ifComplete();

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ boolean ifInit();

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void read(InputStream inputStream) throws StructException;

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void setAligned(int i);

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void write(OutputStream outputStream) throws StructException;
}
