package ru.CryptoPro.JCSP.Sign;

import ru.CryptoPro.JCP.Digest.AbstractGostDigest;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Digest.BaseGostDigest;
import ru.CryptoPro.JCSP.Digest.JCSPGostDigest;
import ru.CryptoPro.JCSP.Digest.JCSPGostDigest2012_256;
import ru.CryptoPro.JCSP.Digest.JCSPGostDigest2012_512;
import ru.CryptoPro.JCSP.Digest.cl_3;
import ru.CryptoPro.JCSP.Digest.rsa.keccak.JCSPKeccak224Digest;
import ru.CryptoPro.JCSP.Digest.rsa.keccak.JCSPKeccak256Digest;
import ru.CryptoPro.JCSP.Digest.rsa.keccak.JCSPKeccak384Digest;
import ru.CryptoPro.JCSP.Digest.rsa.keccak.JCSPKeccak512Digest;
import ru.CryptoPro.JCSP.Digest.rsa.sha.JCSPSHA1Digest;
import ru.CryptoPro.JCSP.Digest.rsa.sha.JCSPSHA224Digest;
import ru.CryptoPro.JCSP.Digest.rsa.sha.JCSPSHA256Digest;
import ru.CryptoPro.JCSP.Digest.rsa.sha.JCSPSHA384Digest;
import ru.CryptoPro.JCSP.Digest.rsa.sha.JCSPSHA512Digest;
import ru.CryptoPro.JCSP.Digest.rsa.sha3.JCSPSHA3_224Digest;
import ru.CryptoPro.JCSP.Digest.rsa.sha3.JCSPSHA3_256Digest;
import ru.CryptoPro.JCSP.Digest.rsa.sha3.JCSPSHA3_384Digest;
import ru.CryptoPro.JCSP.Digest.rsa.sha3.JCSPSHA3_512Digest;
import ru.CryptoPro.JCSP.Sign.rsa.NoneDigestRSA;

/* loaded from: classes4.dex */
public class JCSPCryptoProSign extends CryptoProSign {
    public JCSPCryptoProSign() {
        this("GOST3411withGOST3410EL");
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature
    public AbstractGostDigest getDigestObject(KeyInterface keyInterface, boolean z) {
        String digestType = getDigestType();
        AbstractGostDigest jCSPGostDigest2012_256 = digestType.equals("GenGOST_2012_256") ? new JCSPGostDigest2012_256(keyInterface) : digestType.equals("GenGOST_2012_512") ? new JCSPGostDigest2012_512(keyInterface) : digestType.equals("RawGOST") ? new JCSPPrimitiveGostDigest() : digestType.equals("RawGOST_2012_256") ? new JCSPPrimitiveGostDigest2012_256() : digestType.equals("RawGOST_2012_512") ? new JCSPPrimitiveGostDigest2012_512() : digestType.equals("GenSHA1RSA") ? new JCSPSHA1Digest(keyInterface) : digestType.equals("GenSHA224RSA") ? new JCSPSHA224Digest(keyInterface) : digestType.equals("GenSHA256RSA") ? new JCSPSHA256Digest(keyInterface) : digestType.equals("GenSHA384RSA") ? new JCSPSHA384Digest(keyInterface) : digestType.equals("GenSHA512RSA") ? new JCSPSHA512Digest(keyInterface) : digestType.equals("GenSHA3-224RSA") ? new JCSPSHA3_224Digest(keyInterface) : digestType.equals("GenSHA3-256RSA") ? new JCSPSHA3_256Digest(keyInterface) : digestType.equals("GenSHA3-384RSA") ? new JCSPSHA3_384Digest(keyInterface) : digestType.equals("GenSHA3-512RSA") ? new JCSPSHA3_512Digest(keyInterface) : digestType.equals("GenKECCAK-224RSA") ? new JCSPKeccak224Digest(keyInterface) : digestType.equals("GenKECCAK-256RSA") ? new JCSPKeccak256Digest(keyInterface) : digestType.equals("GenKECCAK-384RSA") ? new JCSPKeccak384Digest(keyInterface) : digestType.equals("GenKECCAK-512RSA") ? new JCSPKeccak512Digest(keyInterface) : digestType.equals("GenSHA1ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha.JCSPSHA1Digest(keyInterface) : digestType.equals("GenSHA224ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha.JCSPSHA224Digest(keyInterface) : digestType.equals("GenSHA256ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha.JCSPSHA256Digest(keyInterface) : digestType.equals("GenSHA384ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha.JCSPSHA384Digest(keyInterface) : digestType.equals("GenSHA512ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha.JCSPSHA512Digest(keyInterface) : digestType.equals("GenSHA3-224ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha3.JCSPSHA3_224Digest(keyInterface) : digestType.equals("GenSHA3-256ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha3.JCSPSHA3_256Digest(keyInterface) : digestType.equals("GenSHA3-384ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha3.JCSPSHA3_384Digest(keyInterface) : digestType.equals("GenSHA3-512ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha3.JCSPSHA3_512Digest(keyInterface) : digestType.equals("GenKECCAK-224ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.keccak.JCSPKeccak224Digest(keyInterface) : digestType.equals("GenKECCAK-256ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.keccak.JCSPKeccak256Digest(keyInterface) : digestType.equals("GenKECCAK-384ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.keccak.JCSPKeccak384Digest(keyInterface) : digestType.equals("GenKECCAK-512ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.keccak.JCSPKeccak512Digest(keyInterface) : digestType.equals("GenNoHash") ? new cl_3(keyInterface) : digestType.equals("None") ? new NoneDigestRSA() : new JCSPGostDigest(keyInterface);
        if ((jCSPGostDigest2012_256 instanceof BaseGostDigest) && z) {
            ((BaseGostDigest) jCSPGostDigest2012_256).setUseKeyLocalContextForHash();
        }
        return jCSPGostDigest2012_256;
    }

    public JCSPCryptoProSign(String str) {
        this(str, "GenGOST");
    }

    public JCSPCryptoProSign(String str, String str2) {
        super(str, str2);
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature
    public AbstractGostDigest getDigestObject() {
        String digestType = getDigestType();
        return digestType.equals("GenGOST_2012_256") ? new JCSPGostDigest2012_256() : digestType.equals("GenGOST_2012_512") ? new JCSPGostDigest2012_512() : digestType.equals("RawGOST") ? new JCSPPrimitiveGostDigest() : digestType.equals("RawGOST_2012_256") ? new JCSPPrimitiveGostDigest2012_256() : digestType.equals("RawGOST_2012_512") ? new JCSPPrimitiveGostDigest2012_512() : digestType.equals("GenSHA1RSA") ? new JCSPSHA1Digest() : digestType.equals("GenSHA224RSA") ? new JCSPSHA224Digest() : digestType.equals("GenSHA256RSA") ? new JCSPSHA256Digest() : digestType.equals("GenSHA384RSA") ? new JCSPSHA384Digest() : digestType.equals("GenSHA512RSA") ? new JCSPSHA512Digest() : digestType.equals("GenSHA3-224RSA") ? new JCSPSHA3_224Digest() : digestType.equals("GenSHA3-256RSA") ? new JCSPSHA3_256Digest() : digestType.equals("GenSHA3-384RSA") ? new JCSPSHA3_384Digest() : digestType.equals("GenSHA3-512RSA") ? new JCSPSHA3_512Digest() : digestType.equals("GenKECCAK-224RSA") ? new JCSPKeccak224Digest() : digestType.equals("GenKECCAK-256RSA") ? new JCSPKeccak256Digest() : digestType.equals("GenKECCAK-384RSA") ? new JCSPKeccak384Digest() : digestType.equals("GenKECCAK-512RSA") ? new JCSPKeccak512Digest() : digestType.equals("GenSHA1ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha.JCSPSHA1Digest() : digestType.equals("GenSHA224ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha.JCSPSHA224Digest() : digestType.equals("GenSHA256ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha.JCSPSHA256Digest() : digestType.equals("GenSHA384ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha.JCSPSHA384Digest() : digestType.equals("GenSHA512ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha.JCSPSHA512Digest() : digestType.equals("GenSHA3-224ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha3.JCSPSHA3_224Digest() : digestType.equals("GenSHA3-256ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha3.JCSPSHA3_256Digest() : digestType.equals("GenSHA3-384ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha3.JCSPSHA3_384Digest() : digestType.equals("GenSHA3-512ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.sha3.JCSPSHA3_512Digest() : digestType.equals("GenKECCAK-224ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.keccak.JCSPKeccak224Digest() : digestType.equals("GenKECCAK-256ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.keccak.JCSPKeccak256Digest() : digestType.equals("GenKECCAK-384ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.keccak.JCSPKeccak384Digest() : digestType.equals("GenKECCAK-512ECDSA") ? new ru.CryptoPro.JCSP.Digest.ecdsa.keccak.JCSPKeccak512Digest() : digestType.equals("GenNoHash") ? new cl_3() : digestType.equals("None") ? new NoneDigestRSA() : new JCSPGostDigest();
    }
}
