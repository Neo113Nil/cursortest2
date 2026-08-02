package ru.CryptoPro.JCSP.CStructReader;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import defpackage.dy31;
import defpackage.w511;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class OpaqueBlob1Structure extends OpaqueBlobStructure {
    public CPseudoArray bAccCiphertextLen;
    public CPseudoArray bAlgId;
    public CPseudoArray bChainBlock;
    public CPseudoArray bCheckSum;
    public CPseudoArray bCipherMode;
    public CPseudoArray bCommonFlags;
    public CPseudoArray bCurrentIV;
    public CPseudoArray bEncryptedInitKey;
    public CPseudoArray bEncryptedKey;
    public Asn1ObjectIdentifier bEncryptionParamSet;
    public CPseudoArray bFlags;
    public CPseudoArray bMacInitKey;
    public CPseudoArray bMacKey;
    public CPseudoArray bMixMode;
    public CPseudoArray bPaddingMode;
    public CPseudoArray bSV;
    private boolean c;
    private boolean d;

    public OpaqueBlob1Structure(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12, byte[] bArr13, byte[] bArr14, byte[] bArr15, Asn1ObjectIdentifier asn1ObjectIdentifier) {
        super(i, i2);
        this.c = false;
        this.d = false;
        if (bArr.length != 8 || bArr2.length != 32 || bArr3.length != 4 || bArr4.length != 32 || bArr5.length != 4 || bArr6.length != 8 || bArr7.length != 8 || bArr8.length != 4 || bArr9.length != 4 || bArr10.length != 4 || bArr11.length != 4 || bArr12.length != 4 || bArr13.length != 4 || bArr14.length != 4 || bArr15.length != 4) {
            w511.q();
            throw null;
        }
        this.bSV = new CPseudoArray(bArr);
        this.bEncryptedKey = new CPseudoArray(bArr2);
        this.bMacKey = new CPseudoArray(bArr3);
        this.bEncryptedInitKey = new CPseudoArray(bArr4);
        this.bMacInitKey = new CPseudoArray(bArr5);
        this.bCurrentIV = new CPseudoArray(bArr6);
        this.bChainBlock = new CPseudoArray(bArr7);
        this.bAccCiphertextLen = new CPseudoArray(bArr8);
        this.bCipherMode = new CPseudoArray(bArr9);
        this.bMixMode = new CPseudoArray(bArr10);
        this.bFlags = new CPseudoArray(bArr11);
        this.bPaddingMode = new CPseudoArray(bArr12);
        this.bAlgId = new CPseudoArray(bArr13);
        this.bCommonFlags = new CPseudoArray(bArr14);
        this.bCheckSum = new CPseudoArray(bArr15);
        this.bEncryptionParamSet = asn1ObjectIdentifier;
        this.d = true;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.OpaqueBlobStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        super.clear();
        this.bSV.clear();
        this.bEncryptedKey.clear();
        this.bMacKey.clear();
        this.bEncryptedInitKey.clear();
        this.bMacInitKey.clear();
        this.bCurrentIV.clear();
        this.bChainBlock.clear();
        this.bAccCiphertextLen.clear();
        this.bCipherMode.clear();
        this.bMixMode.clear();
        this.bFlags.clear();
        this.bPaddingMode.clear();
        this.bAlgId.clear();
        this.bCommonFlags.clear();
        this.bCheckSum.clear();
        this.bEncryptionParamSet = new Asn1ObjectIdentifier();
        this.c = false;
        this.d = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.OpaqueBlobStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.bCheckSum.getAlign();
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
        this.bSV.read(inputStream);
        this.bEncryptedKey.read(inputStream);
        this.bMacKey.read(inputStream);
        this.bEncryptedInitKey.read(inputStream);
        this.bMacInitKey.read(inputStream);
        this.bCurrentIV.read(inputStream);
        this.bChainBlock.read(inputStream);
        this.bAccCiphertextLen.read(inputStream);
        this.bCipherMode.read(inputStream);
        this.bMixMode.read(inputStream);
        this.bFlags.read(inputStream);
        this.bPaddingMode.read(inputStream);
        this.bAlgId.read(inputStream);
        this.bCommonFlags.read(inputStream);
        this.bCheckSum.read(inputStream);
        try {
            this.bEncryptionParamSet.decode(new Asn1BerDecodeBuffer(inputStream));
            if (inputStream.available() == 0) {
                this.c = true;
            }
            this.d = true;
        } catch (Asn1Exception e) {
            dy31.o(e);
        } catch (IOException e2) {
            dy31.o(e2);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.OpaqueBlobStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        super.setAligned(i);
        this.bSV.setAligned(i);
        this.bEncryptedKey.setAligned(i);
        this.bMacKey.setAligned(i);
        this.bEncryptedInitKey.setAligned(i);
        this.bMacInitKey.setAligned(i);
        this.bCurrentIV.setAligned(i);
        this.bChainBlock.setAligned(i);
        this.bAccCiphertextLen.setAligned(i);
        this.bCipherMode.setAligned(i);
        this.bMixMode.setAligned(i);
        this.bFlags.setAligned(i);
        this.bPaddingMode.setAligned(i);
        this.bAlgId.setAligned(i);
        this.bCommonFlags.setAligned(i);
        this.bCheckSum.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.OpaqueBlobStructure, ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.d) {
            super.write(outputStream);
            this.bSV.write(outputStream);
            this.bEncryptedKey.write(outputStream);
            this.bMacKey.write(outputStream);
            this.bEncryptedInitKey.write(outputStream);
            this.bMacInitKey.write(outputStream);
            this.bCurrentIV.write(outputStream);
            this.bChainBlock.write(outputStream);
            this.bAccCiphertextLen.write(outputStream);
            this.bCipherMode.write(outputStream);
            this.bMixMode.write(outputStream);
            this.bFlags.write(outputStream);
            this.bPaddingMode.write(outputStream);
            this.bAlgId.write(outputStream);
            this.bCommonFlags.write(outputStream);
            this.bCheckSum.write(outputStream);
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

    public OpaqueBlob1Structure() {
        this.c = false;
        this.d = false;
        this.bSV = new CPseudoArray(8);
        this.bEncryptedKey = new CPseudoArray(32);
        this.bMacKey = new CPseudoArray(4);
        this.bEncryptedInitKey = new CPseudoArray(32);
        this.bMacInitKey = new CPseudoArray(4);
        this.bCurrentIV = new CPseudoArray(8);
        this.bChainBlock = new CPseudoArray(8);
        this.bAccCiphertextLen = new CPseudoArray(4);
        this.bCipherMode = new CPseudoArray(4);
        this.bMixMode = new CPseudoArray(4);
        this.bFlags = new CPseudoArray(4);
        this.bPaddingMode = new CPseudoArray(4);
        this.bAlgId = new CPseudoArray(4);
        this.bCommonFlags = new CPseudoArray(4);
        this.bCheckSum = new CPseudoArray(4);
        this.bEncryptionParamSet = new Asn1ObjectIdentifier();
    }
}
