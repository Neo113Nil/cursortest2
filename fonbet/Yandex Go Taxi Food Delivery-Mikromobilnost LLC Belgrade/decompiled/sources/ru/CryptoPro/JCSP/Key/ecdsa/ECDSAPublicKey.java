package ru.CryptoPro.JCSP.Key.ecdsa;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1Exception;
import defpackage.oyr;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.InvalidKeySpecException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.ECDSAParams;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.Key.GostPublicKey;
import ru.CryptoPro.JCSP.Key.PublicKeySpec;

/* loaded from: classes4.dex */
public class ECDSAPublicKey extends GostPublicKey {
    public ECDSAPublicKey(PublicKeyInterface publicKeyInterface) throws InvalidKeySpecException {
        super(publicKeyInterface);
        calculateKeySize();
    }

    public void calculateKeySize() {
        if (this.keyAlgorithm.equalsIgnoreCase(JCP.ECDSA_NAME) || this.keyAlgorithm.equalsIgnoreCase(JCP.CP_ECDSA_NAME) || this.keyAlgorithm.equalsIgnoreCase(JCP.ECDH_NAME) || this.keyAlgorithm.equalsIgnoreCase(JCP.CP_ECDH_NAME)) {
            try {
                this.keySize = ECDSAParams.getKeyLenFromBits(((PublicKeySpec) this.spec).getKeyLength());
            } catch (InvalidAlgorithmParameterException unused) {
                this.keySize = 0;
            }
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.GostPublicKey, ru.CryptoPro.JCP.Key.InternalGostPublicKey
    public void decode(byte[] bArr, boolean z) throws InvalidKeySpecException {
        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(bArr);
        SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
        try {
            subjectPublicKeyInfo.decode(asn1BerDecodeBuffer);
            asn1BerDecodeBuffer.reset();
            AlgIdSpecForeign algIdSpecForeign = new AlgIdSpecForeign(subjectPublicKeyInfo.algorithm);
            try {
                this.spec = new PublicKeySpec(subjectPublicKeyInfo.subjectPublicKey.value, algIdSpecForeign, z, AlgorithmGroups.KeyAlgorithmGroup.ECDSA);
            } catch (InvalidAlgorithmParameterException e) {
                InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
                invalidKeySpecException.initCause(e);
                throw invalidKeySpecException;
            }
        } catch (Asn1Exception e2) {
            InvalidKeySpecException invalidKeySpecException2 = new InvalidKeySpecException();
            invalidKeySpecException2.initCause(e2);
            throw invalidKeySpecException2;
        } catch (IOException e3) {
            InvalidKeySpecException invalidKeySpecException3 = new InvalidKeySpecException();
            invalidKeySpecException3.initCause(e3);
            throw invalidKeySpecException3;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.InternalGostPublicKey
    public Object getDecoded() {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        byte[] encode = this.spec.encode();
        int length = encode.length + 1;
        byte[] bArr = new byte[length];
        bArr[0] = 4;
        int length2 = encode.length / 2;
        byte[] bArr2 = new byte[length2];
        int length3 = encode.length / 2;
        byte[] bArr3 = new byte[length3];
        Array.copy(encode, 0, bArr2, 0, length2);
        Array.copy(encode, length2, bArr3, 0, length3);
        Array.invByteOrder(bArr2);
        Array.invByteOrder(bArr3);
        Array.copy(bArr2, 0, bArr, 1, length2);
        Array.copy(bArr3, 0, bArr, length2 + 1, length3);
        Asn1BitString asn1BitString = new Asn1BitString();
        asn1BitString.numbits = length << 3;
        asn1BitString.value = bArr;
        asn1BerEncodeBuffer.reset();
        return new SubjectPublicKeyInfo((AlgorithmIdentifier) ((AlgIdInterface) this.spec.getParams()).getDecoded(), asn1BitString);
    }

    @Override // ru.CryptoPro.JCP.Key.InternalGostPublicKey
    public void resolveAlgorithm(PublicKeyInterface publicKeyInterface) {
        this.keyAlgorithm = publicKeyInterface.getParams().getOID().equals(AlgIdSpecForeign.OID_ECDH) ? JCP.ECDH_NAME : JCP.ECDSA_NAME;
    }

    @Override // ru.CryptoPro.JCSP.Key.GostPublicKey
    public String toString() {
        StringBuilder sb = new StringBuilder("CryptoPro ECDSA PublicKey ");
        sb.append(this.keyAlgorithm);
        sb.append(" public key, ");
        return oyr.m(this.keySize, " size", sb);
    }

    public ECDSAPublicKey(byte[] bArr, boolean z) throws InvalidKeySpecException {
        super(bArr, z);
        calculateKeySize();
    }
}
