package ru.CryptoPro.JCSP.CStructReader.pc_0;

import java.io.InputStream;
import java.io.OutputStream;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCSP.CStructReader.StructException;

/* loaded from: classes4.dex */
public class cl_4 extends cl_10 {
    public static final int a = 1;

    public cl_4() {
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.pc_0.cl_10, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int length() {
        if (!ifInit()) {
            return -1;
        }
        return new cl_5(-1).length() + CPString.getArray(this.b, 1).length;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.pc_0.cl_10, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        super.a(inputStream, 1);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.pc_0.cl_10, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        super.a(outputStream, 1);
    }

    public cl_4(String str) {
        super(str);
    }
}
