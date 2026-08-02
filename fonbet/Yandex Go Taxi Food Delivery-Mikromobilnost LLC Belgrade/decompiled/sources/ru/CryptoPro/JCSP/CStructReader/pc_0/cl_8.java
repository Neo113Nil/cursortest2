package ru.CryptoPro.JCSP.CStructReader.pc_0;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import ru.CryptoPro.JCSP.CStructReader.StructReaderInterface;

/* loaded from: classes4.dex */
public class cl_8 implements StructReaderInterface {
    Object a;
    private boolean b;
    private boolean c;

    public cl_8() {
        this.a = null;
        this.b = false;
        this.c = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.a = null;
        this.c = false;
        this.b = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return 0;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int length() {
        return ifInit() ? 0 : -1;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        try {
            if (inputStream.available() == 0) {
                this.c = true;
            }
            this.b = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
    }

    public cl_8(Object obj) {
        this.a = obj;
        this.c = true;
        this.b = true;
    }
}
