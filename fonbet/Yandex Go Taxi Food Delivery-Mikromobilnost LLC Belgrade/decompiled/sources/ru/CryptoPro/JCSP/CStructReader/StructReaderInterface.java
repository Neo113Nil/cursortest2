package ru.CryptoPro.JCSP.CStructReader;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public interface StructReaderInterface {
    void clear();

    int getAlign();

    boolean ifComplete();

    boolean ifInit();

    int length();

    void read(InputStream inputStream) throws StructException;

    void setAligned(int i);

    void write(OutputStream outputStream) throws StructException;
}
