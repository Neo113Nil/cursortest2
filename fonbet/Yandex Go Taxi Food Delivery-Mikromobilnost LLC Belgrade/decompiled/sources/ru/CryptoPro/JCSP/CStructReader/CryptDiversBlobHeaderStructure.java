package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import defpackage.oyr;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public class CryptDiversBlobHeaderStructure extends AbstractStructReader {
    private static final int a = 827738436;
    public CIntReader aiDiversAlgId;
    private boolean b;
    public BlobHeaderStructure blobHeader;
    private boolean c;
    public CIntReader cbDiversDataLen;
    public CIntReader magic;

    public CryptDiversBlobHeaderStructure(int i, int i2, int i3) {
        this.b = false;
        this.c = false;
        this.blobHeader = new BlobHeaderStructure(Alerts.alert_unrecognized_name, (short) 0, 26142, 0);
        this.aiDiversAlgId = new CIntLEReader(i);
        this.magic = new CIntLEReader(i3);
        this.cbDiversDataLen = new CIntLEReader(i2);
        this.c = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.blobHeader.clear();
        this.aiDiversAlgId.clear();
        this.magic.clear();
        this.cbDiversDataLen.clear();
        this.b = false;
        this.c = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.magic.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        this.blobHeader.read(inputStream);
        BlobHeaderStructure blobHeaderStructure = this.blobHeader;
        if (blobHeaderStructure.bType.value != 112 || blobHeaderStructure.aiKeyAlg.value != 26142) {
            throw new StructException("Wrong blob header type or key algorithm!");
        }
        this.aiDiversAlgId.read(inputStream);
        int i = this.aiDiversAlgId.value;
        if (i != 26150 && i != 26157) {
            throw new StructException(oyr.m(this.aiDiversAlgId.value, "!", new StringBuilder("Wrong divers algorithm identifier ")));
        }
        this.magic.read(inputStream);
        if (this.aiDiversAlgId.value == 26150 && this.magic.value != 827738436) {
            throw new StructException("Wrong magic!");
        }
        this.cbDiversDataLen.read(inputStream);
        try {
            if (inputStream.available() == 0) {
                this.b = true;
            }
            this.c = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.blobHeader.setAligned(i);
        this.aiDiversAlgId.setAligned(i);
        this.magic.setAligned(i);
        this.cbDiversDataLen.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.c) {
            this.blobHeader.write(outputStream);
            this.aiDiversAlgId.write(outputStream);
            this.magic.write(outputStream);
            this.cbDiversDataLen.write(outputStream);
        }
    }

    public CryptDiversBlobHeaderStructure() {
        this.b = false;
        this.c = false;
        this.blobHeader = new BlobHeaderStructure();
        this.magic = new CIntLEReader();
        this.aiDiversAlgId = new CIntLEReader();
        this.cbDiversDataLen = new CIntLEReader();
    }
}
