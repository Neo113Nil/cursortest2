package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Vector;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public class ContainerExtensionStructure extends AbstractStructReader {
    private boolean a;
    private boolean b;
    public CIntReader bCritical;
    public CIntReader cbExtension;
    public CPseudoArray pbExtension;
    public CPseudoArray sOid;

    public ContainerExtensionStructure(boolean z, OID oid, byte[] bArr) {
        this.a = false;
        this.b = false;
        this.bCritical = z ? new CIntLEReader(-1) : new CIntLEReader(0);
        this.cbExtension = new CIntLEReader(bArr.length);
        this.pbExtension = new CPseudoArray(bArr);
        this.sOid = new CPseudoArray(oid.toByteZ());
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.bCritical.clear();
        this.cbExtension.clear();
        this.pbExtension.clear();
        this.sOid.clear();
        this.a = false;
        this.b = false;
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
        int read;
        this.bCritical.read(inputStream);
        this.cbExtension.read(inputStream);
        this.pbExtension.setLength(this.cbExtension.value);
        this.pbExtension.read(inputStream);
        int i = 0;
        Vector vector = new Vector(0);
        do {
            try {
                read = inputStream.read();
                if (read == -1) {
                    throw new StructException("Wrong structure length");
                }
                vector.add(new Byte((byte) read));
            } catch (IOException e) {
                dy31.o(e);
                return;
            }
        } while (read != 0);
        if (inputStream.available() == 0) {
            this.a = true;
        }
        byte[] bArr = new byte[vector.size()];
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            bArr[i] = ((Byte) it.next()).byteValue();
            i++;
        }
        this.sOid = new CPseudoArray(bArr);
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.bCritical.write(outputStream);
            this.cbExtension.write(outputStream);
            this.pbExtension.write(outputStream);
            this.sOid.write(outputStream);
        }
    }

    public ContainerExtensionStructure(boolean z, String str, byte[] bArr) {
        this(z, new OID(str), bArr);
    }

    public ContainerExtensionStructure() {
        this.a = false;
        this.b = false;
        this.bCritical = new CIntLEReader();
        this.cbExtension = new CIntLEReader();
        this.pbExtension = new CPseudoArray();
        this.sOid = new CPseudoArray();
    }
}
