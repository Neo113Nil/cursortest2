package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class ProvVersionExStructure extends AbstractStructReader {
    private boolean a = false;
    private boolean b = false;
    public CIntLEReader dwPKZIBuild = new CIntLEReader();
    public CIntLEReader dwSKZIBuild = new CIntLEReader();
    public CIntLEReader dwTypeDebRel = new CIntLEReader();
    public CIntLEReader dwArchitecture = new CIntLEReader();
    public CIntLEReader dwOS = new CIntLEReader();

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.dwPKZIBuild.clear();
        this.dwSKZIBuild.clear();
        this.dwTypeDebRel.clear();
        this.dwArchitecture.clear();
        this.dwOS.clear();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return 0;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        this.dwPKZIBuild.read(inputStream);
        this.dwSKZIBuild.read(inputStream);
        this.dwTypeDebRel.read(inputStream);
        this.dwArchitecture.read(inputStream);
        this.dwOS.read(inputStream);
        try {
            if (inputStream.available() == 0) {
                this.a = true;
            }
            this.b = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.dwPKZIBuild.setAligned(i);
        this.dwSKZIBuild.setAligned(i);
        this.dwTypeDebRel.setAligned(i);
        this.dwArchitecture.setAligned(i);
        this.dwOS.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        throw new StructException("Unsupported operation.");
    }
}
