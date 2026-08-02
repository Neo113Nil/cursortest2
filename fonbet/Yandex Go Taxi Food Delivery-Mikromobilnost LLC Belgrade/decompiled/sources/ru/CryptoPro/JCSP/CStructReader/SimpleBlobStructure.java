package ru.CryptoPro.JCSP.CStructReader;

import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import defpackage.dy31;
import defpackage.w511;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_BlobParameters;
import ru.CryptoPro.JCSP.JCSPLogger;

/* loaded from: classes4.dex */
public class SimpleBlobStructure extends AbstractStructReader {
    public static final String WRONG_SIMPLE_KEY_BLOB = "Wrong SimpleKeyBlob: ";
    private boolean a;
    private boolean b;
    public CPseudoArray bEncryptedKey;
    public Gost28147_89_BlobParameters bEncryptionParamSet;
    public CPseudoArray bMacKey;
    public CPseudoArray bSV;
    public SimpleBlobHeaderStructure header;

    public SimpleBlobStructure(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, Asn1ObjectIdentifier asn1ObjectIdentifier) {
        this.a = false;
        this.b = false;
        if (bArr.length != 8 || bArr2.length != 32 || bArr3.length != 4) {
            w511.q();
            throw null;
        }
        this.header = new SimpleBlobHeaderStructure((byte) 1, (short) 0, i, i2);
        this.bSV = new CPseudoArray(bArr);
        this.bEncryptedKey = new CPseudoArray(bArr2);
        this.bMacKey = new CPseudoArray(bArr3);
        this.bEncryptionParamSet = new Gost28147_89_BlobParameters(asn1ObjectIdentifier.value);
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.header.clear();
        this.bSV.clear();
        this.bEncryptedKey.clear();
        this.bMacKey.clear();
        this.bEncryptionParamSet = new Gost28147_89_BlobParameters();
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
        this.bSV.read(inputStream);
        this.bEncryptedKey.read(inputStream);
        this.bMacKey.read(inputStream);
        try {
            this.bEncryptionParamSet.decode(new Asn1DerDecodeBuffer(inputStream));
            if (inputStream.available() == 0) {
                this.a = true;
            }
        } catch (Asn1Exception unused) {
            JCSPLogger.finer("Simple blob does not contain encryption params.");
            this.bEncryptionParamSet = null;
        } catch (IOException e) {
            dy31.o(e);
            return;
        }
        if (this.header.blobHeader.bType.value != 1) {
            throw new StructException("Wrong SimpleKeyBlob: ".concat("Wrong type"));
        }
        this.b = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.header.setAligned(i);
        this.bSV.setAligned(i);
        this.bEncryptedKey.setAligned(i);
        this.bMacKey.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.header.write(outputStream);
            this.bSV.write(outputStream);
            this.bEncryptedKey.write(outputStream);
            this.bMacKey.write(outputStream);
            if (this.bEncryptionParamSet != null) {
                Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                try {
                    this.bEncryptionParamSet.encode(asn1BerEncodeBuffer);
                    asn1BerEncodeBuffer.write(outputStream);
                } catch (Asn1Exception e) {
                    dy31.o(e);
                } catch (IOException e2) {
                    dy31.o(e2);
                }
            }
        }
    }

    public SimpleBlobStructure() {
        this.a = false;
        this.b = false;
        this.header = new SimpleBlobHeaderStructure();
        this.bSV = new CPseudoArray(8);
        this.bEncryptedKey = new CPseudoArray(32);
        this.bMacKey = new CPseudoArray(4);
        this.bEncryptionParamSet = new Gost28147_89_BlobParameters();
    }
}
