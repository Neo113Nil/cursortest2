package ru.CryptoPro.JCSP.CStructReader;

import defpackage.w511;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class OpaqueBlob2Structure extends OpaqueBlobStructure {
    public CPseudoArray bCheckSum;
    private boolean c;
    private boolean d;
    public CHandleReader handle;

    public OpaqueBlob2Structure(int i, int i2, byte[] bArr, byte[] bArr2) {
        super(i, i2);
        this.c = false;
        this.d = false;
        if (bArr2.length != 4) {
            w511.q();
            throw null;
        }
        this.handle = new CHandleReader(bArr);
        this.bCheckSum = new CPseudoArray(bArr2);
        this.d = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.OpaqueBlobStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        super.clear();
        this.bCheckSum.clear();
        this.c = false;
        this.d = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.OpaqueBlobStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.handle.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.OpaqueBlobStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.OpaqueBlobStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.d;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.OpaqueBlobStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        super.read(inputStream);
        this.handle.read(inputStream);
        this.bCheckSum.read(inputStream);
        this.d = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.OpaqueBlobStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        super.setAligned(i);
        this.handle.setAligned(i);
        this.bCheckSum.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.OpaqueBlobStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.d) {
            super.write(outputStream);
            this.handle.write(outputStream);
            this.bCheckSum.write(outputStream);
        }
    }

    public OpaqueBlob2Structure() {
        this.c = false;
        this.d = false;
        this.handle = new CHandleReader(4);
        this.bCheckSum = new CPseudoArray(4);
    }
}
