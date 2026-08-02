package ru.CryptoPro.JCSP.Key.eddsa;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1Exception;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.InvalidKeySpecException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.Key.GostPublicKey;
import ru.CryptoPro.JCSP.Key.PublicKeySpec;

/* loaded from: classes4.dex */
public class EDDSAPublicKey extends GostPublicKey {
    public EDDSAPublicKey(PublicKeyInterface publicKeyInterface) throws InvalidKeySpecException {
        super(publicKeyInterface);
        calculateKeySize();
    }

    public void calculateKeySize() {
        this.keySize = ((PublicKeySpec) this.spec).getKeyLength();
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
                this.spec = new PublicKeySpec(subjectPublicKeyInfo.subjectPublicKey.value, algIdSpecForeign, z, AlgorithmGroups.KeyAlgorithmGroup.EDDSA);
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
        Asn1BitString asn1BitString = new Asn1BitString();
        asn1BitString.numbits = encode.length << 3;
        asn1BitString.value = encode;
        asn1BerEncodeBuffer.reset();
        return new SubjectPublicKeyInfo((AlgorithmIdentifier) ((AlgIdInterface) this.spec.getParams()).getDecoded(), asn1BitString);
    }

    @Override // ru.CryptoPro.JCP.Key.InternalGostPublicKey
    public void resolveAlgorithm(PublicKeyInterface publicKeyInterface) {
        this.keyAlgorithm = "Ed25519";
    }

    @Override // ru.CryptoPro.JCSP.Key.GostPublicKey
    public String toString() {
        return "CryptoPro EdDSA PublicKey";
    }

    public EDDSAPublicKey(byte[] bArr, boolean z) throws InvalidKeySpecException {
        super(bArr, z);
        calculateKeySize();
    }
}
