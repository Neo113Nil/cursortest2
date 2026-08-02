package ru.CryptoPro.JCSP.Key;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.InternalGostPublicKey;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;

/* loaded from: classes4.dex */
public class GostPublicKey extends InternalGostPublicKey implements PublicKey, JCSPSpecKey {
    public GostPublicKey(PublicKeyInterface publicKeyInterface) throws InvalidKeySpecException {
        super(publicKeyInterface);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public void clear() {
        PublicKeyInterface publicKeyInterface = this.spec;
        if (publicKeyInterface != null) {
            publicKeyInterface.clear();
        }
    }

    @Override // ru.CryptoPro.JCP.Key.InternalGostPublicKey
    public void decode(byte[] bArr, boolean z) throws InvalidKeySpecException {
        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(bArr);
        SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
        try {
            subjectPublicKeyInfo.decode(asn1BerDecodeBuffer);
            asn1BerDecodeBuffer.reset();
            AlgIdSpec algIdSpec = new AlgIdSpec(subjectPublicKeyInfo.algorithm);
            Asn1BerDecodeBuffer asn1BerDecodeBuffer2 = new Asn1BerDecodeBuffer(subjectPublicKeyInfo.subjectPublicKey.value);
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            try {
                asn1OctetString.decode(asn1BerDecodeBuffer2);
                asn1BerDecodeBuffer2.reset();
                byte[] bArr2 = asn1OctetString.value;
                if (!(algIdSpec.getSignParams() instanceof EllipticParamsInterface)) {
                    throw new InvalidKeySpecException(InternalGostPrivateKey.resource.getString(InternalGostPrivateKey.NOT_GOST));
                }
                try {
                    this.spec = new PublicKeySpec(bArr2, algIdSpec, z, AlgorithmGroups.KeyAlgorithmGroup.GOST);
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
        } catch (Asn1Exception e4) {
            InvalidKeySpecException invalidKeySpecException4 = new InvalidKeySpecException();
            invalidKeySpecException4.initCause(e4);
            throw invalidKeySpecException4;
        } catch (IOException e5) {
            InvalidKeySpecException invalidKeySpecException5 = new InvalidKeySpecException();
            invalidKeySpecException5.initCause(e5);
            throw invalidKeySpecException5;
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        PublicKeyInterface publicKeyInterface = this.spec;
        if (publicKeyInterface != null) {
            publicKeyInterface.destroy();
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public int getKeySize() {
        return this.keySize;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        PublicKeyInterface publicKeyInterface = this.spec;
        if (publicKeyInterface != null) {
            return publicKeyInterface.isDestroyed();
        }
        return true;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey
    public boolean isFromPfx() {
        return false;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey
    public void setFromPfx() {
    }

    public String toString() {
        return this.spec.getParams().getOID().toString();
    }

    public GostPublicKey(byte[] bArr, boolean z) throws InvalidKeySpecException {
        super(bArr, z);
    }
}
