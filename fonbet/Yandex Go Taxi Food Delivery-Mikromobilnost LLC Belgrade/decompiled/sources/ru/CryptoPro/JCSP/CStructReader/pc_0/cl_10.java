package ru.CryptoPro.JCSP.CStructReader.pc_0;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import ru.CryptoPro.JCSP.CStructReader.StructReaderInterface;

/* loaded from: classes4.dex */
public abstract class cl_10 implements StructReaderInterface {
    private boolean a;
    public String b;
    private boolean c;

    public cl_10() {
        this.b = null;
        this.a = false;
        this.c = false;
    }

    public void a(InputStream inputStream, int i) throws StructException {
        try {
            cl_5 cl_5Var = new cl_5();
            cl_5Var.read(inputStream);
            cl_0 cl_0Var = new cl_0(cl_5Var.value);
            cl_0Var.read(inputStream);
            this.b = CPString.getString(cl_0Var.value, i);
            if (inputStream.available() == 0) {
                this.c = true;
            }
            this.a = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.b = null;
        this.c = false;
        this.a = false;
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
        return this.a;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int length() {
        if (!ifInit()) {
            return -1;
        }
        return new cl_5(-1).length() + CPString.getArray(this.b).length;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void read(InputStream inputStream) throws StructException;

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public abstract /* synthetic */ void write(OutputStream outputStream) throws StructException;

    public cl_10(String str) {
        this.b = str;
        this.c = true;
        this.a = true;
    }

    public void a(OutputStream outputStream, int i) throws StructException {
        if (this.a) {
            String str = this.b;
            byte[] array = str == null ? new byte[0] : CPString.getArray(str, i);
            cl_5 cl_5Var = new cl_5(array.length);
            cl_0 cl_0Var = new cl_0(array);
            cl_5Var.write(outputStream);
            cl_0Var.write(outputStream);
        }
    }
}
