package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class CryptKdfTreeDiversBlobStructure extends AbstractStructReader {
    public CryptKdfTreeDiversInfoStructure KdfTreeDiversInfo;
    private boolean a;
    private boolean b;
    public CPseudoArray diversData;
    public CryptKdfTreeDiversBlobHeaderStructure header;

    public CryptKdfTreeDiversBlobStructure(int i, int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr) {
        this.a = false;
        this.b = false;
        this.header = new CryptKdfTreeDiversBlobHeaderStructure(i, i2, i3);
        this.KdfTreeDiversInfo = new CryptKdfTreeDiversInfoStructure(i4, i5, i6, i7);
        this.diversData = new CPseudoArray(bArr);
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.header.clear();
        this.KdfTreeDiversInfo.clear();
        this.diversData.clear();
        this.a = false;
        this.b = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.header.getAlign();
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
        this.header.read(inputStream);
        this.KdfTreeDiversInfo.read(inputStream);
        this.diversData.read(inputStream);
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
        this.header.setAligned(i);
        this.KdfTreeDiversInfo.setAligned(i);
        this.diversData.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.header.write(outputStream);
            this.KdfTreeDiversInfo.write(outputStream);
            this.diversData.write(outputStream);
        }
    }

    public CryptKdfTreeDiversBlobStructure() {
        this.a = false;
        this.b = false;
        this.header = new CryptKdfTreeDiversBlobHeaderStructure();
        this.KdfTreeDiversInfo = new CryptKdfTreeDiversInfoStructure();
        this.diversData = new CPseudoArray();
    }
}
