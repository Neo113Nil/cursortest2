package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class HmacInfoStructure extends AbstractStructReader {
    public static final String WRONG_OPEN_HMAC_INFO = "Wrong HmacInfoStructure: ";
    private boolean a;
    public CIntLEReader aiHashAlgId;
    private boolean b;
    public CLongLEReader cbInnerString;
    public CLongLEReader cbOuterString;
    public CLongLEReader pbInnerString;
    public CLongLEReader pbOuterString;

    public HmacInfoStructure(int i) {
        this.a = false;
        this.b = false;
        this.aiHashAlgId = new CIntLEReader(i);
        this.pbInnerString = new CLongLEReader(0L);
        this.cbInnerString = new CLongLEReader(0L);
        this.pbOuterString = new CLongLEReader(0L);
        this.cbOuterString = new CLongLEReader(0L);
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.aiHashAlgId.clear();
        this.a = false;
        this.b = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.aiHashAlgId.getAlign();
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
        this.aiHashAlgId.read(inputStream);
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
        this.aiHashAlgId.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.aiHashAlgId.write(outputStream);
            this.pbInnerString.write(outputStream);
            this.cbInnerString.write(outputStream);
            this.pbOuterString.write(outputStream);
            this.cbOuterString.write(outputStream);
        }
    }

    public HmacInfoStructure() {
        this.a = false;
        this.b = false;
        this.aiHashAlgId = new CIntLEReader();
        this.pbInnerString = new CLongLEReader();
        this.cbInnerString = new CLongLEReader();
        this.pbOuterString = new CLongLEReader();
        this.cbOuterString = new CLongLEReader();
    }
}
