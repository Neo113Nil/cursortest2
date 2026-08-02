package ru.CryptoPro.JCSP.CStructReader.pc_0;

import java.io.InputStream;
import java.io.OutputStream;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCSP.CStructReader.StructException;

/* loaded from: classes4.dex */
public class cl_11 extends cl_10 {
    public static final int a = 2;

    public cl_11() {
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.pc_0.cl_10, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int length() {
        if (!ifInit()) {
            return -1;
        }
        return new cl_5(-1).length() + CPString.getArray(this.b, 2).length;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.pc_0.cl_10, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        super.a(inputStream, 2);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.pc_0.cl_10, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        super.a(outputStream, 2);
    }

    public cl_11(String str) {
        super(str);
    }
}
