package ru.CryptoPro.JCSP.Key;

import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1DerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import defpackage.ny61;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_ParamSet;
import ru.CryptoPro.JCP.ASN.GostR3410_2001_PKISyntax.GostR3410_2001_PublicKeyParameters;
import ru.CryptoPro.JCP.ASN.GostR3410_2012_PKISyntax.GostR3410_2012_PublicKeyParameters;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.RsaPubKey;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CStructReader.PubKeyBlobStructure;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;

/* loaded from: classes4.dex */
public class PublicKeyBlob {
    public static final String WRONG_OPEN_KEY_BLOB = "Wrong OpenKeyBlob: ";
    private PubKeyBlobStructure a;
    private boolean b;
    private final AlgorithmGroups.KeyAlgorithmGroup c;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        if (r5 != 41984) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.objsys.asn1j.runtime.Asn1ObjectIdentifier] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.objsys.asn1j.runtime.Asn1ObjectIdentifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PublicKeyBlob(byte[] bArr, AlgIdInterface algIdInterface, AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup) throws InvalidKeyException {
        int i;
        Gost28147_89_ParamSet gost28147_89_ParamSet;
        Asn1ObjectIdentifier asn1ObjectIdentifier;
        PubKeyBlobStructure pubKeyBlobStructure;
        this.a = null;
        this.b = false;
        this.c = keyAlgorithmGroup;
        if (algIdInterface.getOID().equals(AlgIdSpec.OID_19) || algIdInterface.getOID().equals(AlgIdSpec.OID_98)) {
            i = 11811;
        } else if (algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_256)) {
            i = 11849;
        } else if (algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_512)) {
            i = 11837;
        } else {
            int i2 = cl_4.a[keyAlgorithmGroup.ordinal()];
            if (i2 == 1) {
                i = 8707;
            } else if (i2 == 2) {
                i = 8736;
            } else {
                if (i2 != 3) {
                    throw new InvalidKeyException("Wrong OpenKeyBlob: ".concat("Wrong Algorithm!"));
                }
                i = 41984;
            }
        }
        if (keyAlgorithmGroup == AlgorithmGroups.KeyAlgorithmGroup.GOST) {
            ?? asn1ObjectIdentifier2 = new Asn1ObjectIdentifier(algIdInterface.getSignParams().getOID().value);
            asn1ObjectIdentifier = algIdInterface.getDigestParams() != null ? new Asn1ObjectIdentifier(algIdInterface.getDigestParams().getOID().value) : null;
            r3 = asn1ObjectIdentifier2;
            gost28147_89_ParamSet = algIdInterface.getCryptParams() != null ? new Gost28147_89_ParamSet(algIdInterface.getCryptParams().getOID().value) : null;
        } else if (keyAlgorithmGroup == AlgorithmGroups.KeyAlgorithmGroup.ECDSA) {
            asn1ObjectIdentifier = null;
            r3 = new Asn1ObjectIdentifier(algIdInterface.getSignParams().getOID().value);
            gost28147_89_ParamSet = null;
        } else {
            gost28147_89_ParamSet = null;
            asn1ObjectIdentifier = null;
        }
        try {
            if (i == 8707) {
                pubKeyBlobStructure = new PubKeyBlobStructure(i, r3, bArr);
            } else {
                if (i != 8736) {
                    if (i != 9216) {
                        if (i == 11806 || i == 11811) {
                            pubKeyBlobStructure = new PubKeyBlobStructure(i, new GostR3410_2001_PublicKeyParameters(r3, asn1ObjectIdentifier, gost28147_89_ParamSet), bArr);
                        } else if (i == 11837 || i == 11849) {
                            pubKeyBlobStructure = new PubKeyBlobStructure(i, new GostR3410_2012_PublicKeyParameters(r3, asn1ObjectIdentifier, gost28147_89_ParamSet), bArr);
                        }
                    }
                    try {
                        Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(bArr);
                        RsaPubKey rsaPubKey = new RsaPubKey();
                        rsaPubKey.decode(asn1DerDecodeBuffer);
                        this.a = new PubKeyBlobStructure(i, rsaPubKey);
                        this.a.write(new ByteArrayOutputStream(0));
                        this.b = true;
                        return;
                    } catch (Exception unused) {
                        throw new InvalidKeyException("Wrong OpenKeyBlob: ".concat("Wrong RSA parameters!"));
                    }
                }
                pubKeyBlobStructure = new PubKeyBlobStructure(i, bArr);
            }
            this.a.write(new ByteArrayOutputStream(0));
            this.b = true;
            return;
        } catch (StructException unused2) {
            throw new InvalidKeyException("Wrong OpenKeyBlob: ".concat("Wrong Parameters!"));
        }
        this.a = pubKeyBlobStructure;
    }

    private AlgIdInterface a(OID oid, OID oid2, OID oid3) {
        if (!this.b) {
            return null;
        }
        if (this.a.ifInit()) {
            int i = this.a.header.blobHeader.aiKeyAlg.value;
        }
        return AlgorithmGroups.a(this.a.ifInit() ? this.a.header.blobHeader.aiKeyAlg.value : 0, oid3, oid, oid2);
    }

    public void clear() {
        this.a.clear();
        this.b = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PublicKeyBlob) {
            return Array.compare(((PublicKeyBlob) obj).getBlob(), getBlob());
        }
        return false;
    }

    public byte[] getBlob() {
        if (this.b) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(0);
            try {
                this.a.write(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (StructException unused) {
            }
        }
        return null;
    }

    public byte[] getKey() {
        if (!this.b || !this.a.ifInit()) {
            return null;
        }
        PubKeyBlobStructure pubKeyBlobStructure = this.a;
        int i = pubKeyBlobStructure.header.blobHeader.aiKeyAlg.value;
        if (i != 41984 && i != 9216) {
            return pubKeyBlobStructure.openKey.value;
        }
        Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
        try {
            this.a.rsaPubKey.encode(asn1DerEncodeBuffer);
            return asn1DerEncodeBuffer.getMsgCopy();
        } catch (Asn1Exception unused) {
            ny61.g("Wrong OpenKeyBlob: ".concat("Wrong RSA blob structure!"));
            return null;
        }
    }

    public AlgorithmGroups.KeyAlgorithmGroup getKeyAlgorithmGroup() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r2 != 43525) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AlgIdInterface getParams() {
        OID oid;
        OID oid2;
        OID oid3;
        OID oid4 = null;
        if (!this.b) {
            return null;
        }
        PubKeyBlobStructure pubKeyBlobStructure = this.a;
        int i = pubKeyBlobStructure.header.blobHeader.aiKeyAlg.value;
        if (i != 8707) {
            if (i == 11806 || i == 11811) {
                Asn1ObjectIdentifier asn1ObjectIdentifier = pubKeyBlobStructure.params01.digestParamSet;
                oid3 = asn1ObjectIdentifier != null ? new OID(asn1ObjectIdentifier.value) : null;
                Gost28147_89_ParamSet gost28147_89_ParamSet = this.a.params01.encryptionParamSet;
                oid2 = gost28147_89_ParamSet != null ? new OID(gost28147_89_ParamSet.value) : null;
                Asn1ObjectIdentifier asn1ObjectIdentifier2 = this.a.params01.publicKeyParamSet;
                if (asn1ObjectIdentifier2 != null) {
                    oid4 = new OID(asn1ObjectIdentifier2.value);
                }
            } else if (i == 11837 || i == 11849) {
                Asn1ObjectIdentifier asn1ObjectIdentifier3 = pubKeyBlobStructure.params12.digestParamSet;
                oid3 = asn1ObjectIdentifier3 != null ? new OID(asn1ObjectIdentifier3.value) : null;
                Asn1ObjectIdentifier asn1ObjectIdentifier4 = this.a.params12.encryptionParamSet;
                oid2 = asn1ObjectIdentifier4 != null ? new OID(asn1ObjectIdentifier4.value) : null;
                Asn1ObjectIdentifier asn1ObjectIdentifier5 = this.a.params12.publicKeyParamSet;
                if (asn1ObjectIdentifier5 != null) {
                    oid4 = new OID(asn1ObjectIdentifier5.value);
                }
            }
            OID oid5 = oid3;
            oid = oid4;
            oid4 = oid5;
            return a(oid4, oid2, oid);
        }
        Asn1ObjectIdentifier asn1ObjectIdentifier6 = pubKeyBlobStructure.ecdsaOID;
        if (asn1ObjectIdentifier6 != null) {
            oid = new OID(asn1ObjectIdentifier6.value);
            oid2 = null;
            return a(oid4, oid2, oid);
        }
        oid = null;
        oid2 = null;
        return a(oid4, oid2, oid);
    }

    public boolean ifSignature() {
        return true;
    }

    @Deprecated
    public boolean isRSA() {
        return this.c == AlgorithmGroups.KeyAlgorithmGroup.RSA;
    }

    public String toString() {
        if (this.b) {
            return "reserved: ".concat(Short.toString(this.a.ifInit() ? this.a.header.blobHeader.reserved.value : (short) 0)).concat("\n").concat("algorithm: ".concat(Integer.toString(this.a.ifInit() ? this.a.header.blobHeader.aiKeyAlg.value : 0)).concat("\n")).concat("key length: ".concat(Integer.toString(this.a.header.keyParam.bitLen.value)).concat("\n")).concat("encodedOpenKey: ".concat(Array.toHexString(getKey())).concat("\n")).concat(getParams().toString());
        }
        return "Must be generated first!";
    }

    public PublicKeyBlob(PubKeyBlobStructure pubKeyBlobStructure) throws InvalidKeyException {
        this.b = false;
        this.a = pubKeyBlobStructure;
        if (!pubKeyBlobStructure.ifComplete()) {
            throw new InvalidKeyException("Wrong OpenKeyBlob: ".concat("Wrong key length!"));
        }
        this.b = true;
        this.c = AlgorithmGroups.a(this.a.header.blobHeader.aiKeyAlg.value);
    }

    public PublicKeyBlob(byte[] bArr, boolean z) throws InvalidKeyException {
        this.a = null;
        this.b = false;
        this.a = new PubKeyBlobStructure();
        try {
            this.a.read(new ByteArrayInputStream(bArr));
            if (!this.a.ifComplete()) {
                throw new InvalidKeyException("Wrong OpenKeyBlob: ".concat("Wrong key length!"));
            }
            this.b = true;
            this.c = AlgorithmGroups.a(this.a.header.blobHeader.aiKeyAlg.value);
        } catch (StructException unused) {
            throw new InvalidKeyException("Wrong OpenKeyBlob: ".concat("Wrong key length!"));
        }
    }
}
