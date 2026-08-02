package ru.CryptoPro.JCP.Key;

import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import java.io.NotSerializableException;
import java.io.ObjectStreamException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class InternalGostPublicKey implements PublicKey {
    protected String keyAlgorithm;
    protected int keySize;
    protected PublicKeyInterface spec;

    public InternalGostPublicKey(PublicKeyInterface publicKeyInterface) throws InvalidKeySpecException {
        this.spec = null;
        this.keyAlgorithm = null;
        this.keySize = 0;
        if (publicKeyInterface.encode() == null || publicKeyInterface.getParams() == null) {
            throw new InvalidKeySpecException(InternalGostPrivateKey.resource.getString(InternalGostPrivateKey.NULL_PARAM));
        }
        this.spec = publicKeyInterface;
        resolveAlgorithm(publicKeyInterface);
    }

    public static Object readResolve() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public static Object writeReplace() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public void decode(byte[] bArr, boolean z) throws InvalidKeySpecException {
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InternalGostPublicKey)) {
            return false;
        }
        InternalGostPublicKey internalGostPublicKey = (InternalGostPublicKey) obj;
        return Arrays.equals(internalGostPublicKey.spec.encode(), this.spec.encode()) && internalGostPublicKey.spec.getParams().getOID().equals(this.spec.getParams().getOID());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.keyAlgorithm;
    }

    public Object getDecoded() {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        try {
            new Asn1OctetString(this.spec.encode()).encode(asn1BerEncodeBuffer);
        } catch (Asn1Exception e) {
            JCPLogger.thrown(e);
        }
        byte[] msgCopy = asn1BerEncodeBuffer.getMsgCopy();
        Asn1BitString asn1BitString = new Asn1BitString();
        asn1BitString.numbits = msgCopy.length << 3;
        asn1BitString.value = msgCopy;
        asn1BerEncodeBuffer.reset();
        return new SubjectPublicKeyInfo((AlgorithmIdentifier) ((AlgIdInterface) this.spec.getParams()).getDecoded(), asn1BitString);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] bArr = null;
        try {
            Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
            ((SubjectPublicKeyInfo) getDecoded()).encode(asn1BerEncodeBuffer);
            bArr = asn1BerEncodeBuffer.getMsgCopy();
            asn1BerEncodeBuffer.reset();
            return bArr;
        } catch (Asn1Exception e) {
            JCPLogger.thrown(e);
            return bArr;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return JCP.CERTIFICATE_FACTORY_NAME;
    }

    public KeyInterface getSpec() {
        return this.spec;
    }

    public int hashCode() {
        byte[] encode = this.spec.encode();
        OID oid = this.spec.getParams().getOID();
        return oid.hashCode() + (Arrays.hashCode(encode) * 31);
    }

    public void resolveAlgorithm(PublicKeyInterface publicKeyInterface) {
        if (publicKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_256)) {
            this.keyAlgorithm = JCP.GOST_EL_2012_256_NAME;
            this.keySize = 512;
        } else if (publicKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_512)) {
            this.keyAlgorithm = JCP.GOST_EL_2012_512_NAME;
            this.keySize = 1024;
        } else {
            this.keyAlgorithm = JCP.GOST_EL_DEGREE_NAME;
            this.keySize = 512;
        }
    }

    public InternalGostPublicKey(byte[] bArr, boolean z) throws InvalidKeySpecException {
        this.spec = null;
        this.keyAlgorithm = null;
        this.keySize = 0;
        decode(bArr, z);
        resolveAlgorithm(this.spec);
    }
}
