package ru.CryptoPro.JCP.Sign;

import java.security.AlgorithmParameters;
import java.security.Signature;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.JCP.Digest.AbstractGostDigest;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.ParamsInterface;

/* loaded from: classes4.dex */
public abstract class AbstractSignature extends Signature {
    protected static final Map genOid;
    protected static final Map lenOid;
    protected static final Map rawOid;
    protected AbstractGostDigest dataHash;
    protected String digestType;
    protected AlgorithmParameterSpec initParams;
    protected final boolean isGen;
    protected final boolean isGost;
    protected ParamsInterface signParams;

    static {
        HashMap hashMap = new HashMap();
        genOid = hashMap;
        HashMap hashMap2 = new HashMap();
        rawOid = hashMap2;
        HashMap hashMap3 = new HashMap();
        lenOid = hashMap3;
        hashMap.put("1.2.643.2.2.19", "GenGOST");
        hashMap.put("1.2.643.2.2.98", "GenGOST");
        hashMap.put("1.2.643.7.1.1.1.1", "GenGOST_2012_256");
        hashMap.put("1.2.643.7.1.1.6.1", "GenGOST_2012_256");
        hashMap.put("1.2.643.7.1.1.1.2", "GenGOST_2012_512");
        hashMap.put("1.2.643.7.1.1.6.2", "GenGOST_2012_512");
        hashMap2.put("1.2.643.2.2.19", "RawGOST");
        hashMap2.put("1.2.643.2.2.98", "RawGOST");
        hashMap2.put("1.2.643.7.1.1.1.1", "RawGOST_2012_256");
        hashMap2.put("1.2.643.7.1.1.6.1", "RawGOST_2012_256");
        hashMap2.put("1.2.643.7.1.1.1.2", "RawGOST_2012_512");
        hashMap2.put("1.2.643.7.1.1.6.2", "RawGOST_2012_512");
        hashMap3.put("1.2.643.2.2.19", 64);
        hashMap3.put("1.2.643.2.2.98", 64);
        hashMap3.put("1.2.643.7.1.1.1.1", 64);
        hashMap3.put("1.2.643.7.1.1.6.1", 64);
        hashMap3.put("1.2.643.7.1.1.1.2", 128);
        hashMap3.put("1.2.643.7.1.1.6.2", 128);
    }

    public AbstractSignature(String str, String str2) {
        super(str);
        this.initParams = null;
        this.signParams = null;
        this.dataHash = null;
        this.digestType = str2;
        this.isGost = str2.contains("GOST");
        this.isGen = str2.contains("Gen");
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    public abstract AbstractGostDigest getDigestObject();

    public abstract AbstractGostDigest getDigestObject(KeyInterface keyInterface, boolean z);

    public String getDigestType() {
        String str = this.digestType;
        if (this.isGost) {
            String str2 = (String) (this.isGen ? genOid : rawOid).get(((AlgIdInterface) this.initParams).getOID().toString());
            if (str2 != null && !str2.equals(this.digestType)) {
                return str2;
            }
        }
        return str;
    }

    public int getSignatureLength(int i) {
        if (!this.isGost) {
            return i;
        }
        int intValue = ((Integer) lenOid.get(((AlgIdInterface) this.initParams).getOID().toString())).intValue();
        if (intValue == 0) {
            return 64;
        }
        return intValue;
    }

    public boolean validateAlgorithms(String str, String str2) {
        if ((str.equalsIgnoreCase("GOST3411withGOST3410EL") || str.equalsIgnoreCase(JCP.GOST_DHEL_SIGN_NAME) || str.equalsIgnoreCase("1.2.643.2.2.3") || str.equalsIgnoreCase(JCP.GOST_EL_SIGN_OID_WITH) || str.equalsIgnoreCase(JCP.GOST_DH_SIGN_OID_WITH) || str.equalsIgnoreCase(JCP.RAW_GOST_EL_SIGN_NAME) || str.equalsIgnoreCase(JCP.CRYPTOPRO_SIGN_NAME) || str.equalsIgnoreCase(JCP.RAW_CRYPTOPRO_SIGN_NAME)) && (str2.equalsIgnoreCase(JCP.GOST_EL_DEGREE_NAME) || str2.equalsIgnoreCase("GOST3410DHEL") || str2.equalsIgnoreCase("1.2.643.2.2.19") || str2.equalsIgnoreCase("1.2.643.2.2.98"))) {
            return true;
        }
        if ((str.equalsIgnoreCase(JCP.GOST_SIGN_2012_256_NAME) || str.equalsIgnoreCase(JCP.GOST_SIGN_DH_2012_256_NAME) || str.equalsIgnoreCase("1.2.643.7.1.1.3.2") || str.equalsIgnoreCase(JCP.GOST_EL_SIGN_2012_256_OID_WITH) || str.equalsIgnoreCase(JCP.RAW_GOST_SIGN_2012_256_NAME) || str.equalsIgnoreCase(JCP.CRYPTOPRO_SIGN_2012_256_NAME) || str.equalsIgnoreCase(JCP.RAW_CRYPTOPRO_SIGN_2012_256_NAME)) && (str2.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || str2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME) || str2.equalsIgnoreCase("1.2.643.7.1.1.1.1") || str2.equalsIgnoreCase("1.2.643.7.1.1.6.1"))) {
            return true;
        }
        return ((str.equalsIgnoreCase(JCP.GOST_SIGN_2012_512_NAME) || str.equalsIgnoreCase(JCP.GOST_SIGN_DH_2012_512_NAME) || str.equalsIgnoreCase("1.2.643.7.1.1.3.3") || str.equalsIgnoreCase(JCP.GOST_EL_SIGN_2012_512_OID_WITH) || str.equalsIgnoreCase(JCP.RAW_GOST_SIGN_2012_512_NAME) || str.equalsIgnoreCase(JCP.CRYPTOPRO_SIGN_2012_512_NAME) || str.equalsIgnoreCase(JCP.RAW_CRYPTOPRO_SIGN_2012_512_NAME)) && (str2.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || str2.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME) || str2.equalsIgnoreCase("1.2.643.7.1.1.1.2") || str2.equalsIgnoreCase("1.2.643.7.1.1.6.2"))) || validateExtraAlgorithms(str, str2);
    }

    public boolean validateExtraAlgorithms(String str, String str2) {
        return false;
    }

    public boolean validateSignDigestAlgorithms(String str, String str2) {
        if ((str.equalsIgnoreCase("GOST3411withGOST3410EL") || str.equalsIgnoreCase(JCP.GOST_DHEL_SIGN_NAME) || str.equalsIgnoreCase("1.2.643.2.2.3") || str.equalsIgnoreCase(JCP.GOST_EL_SIGN_OID_WITH) || str.equalsIgnoreCase(JCP.GOST_DH_SIGN_OID_WITH) || str.equalsIgnoreCase(JCP.CRYPTOPRO_SIGN_NAME)) && str2.equalsIgnoreCase(JCP.GOST_DIGEST_NAME)) {
            return true;
        }
        if ((str.equalsIgnoreCase(JCP.GOST_SIGN_2012_256_NAME) || str.equalsIgnoreCase(JCP.GOST_SIGN_DH_2012_256_NAME) || str.equalsIgnoreCase("1.2.643.7.1.1.3.2") || str.equalsIgnoreCase(JCP.GOST_EL_SIGN_2012_256_OID_WITH) || str.equalsIgnoreCase(JCP.CRYPTOPRO_SIGN_2012_256_NAME)) && str2.equalsIgnoreCase(JCP.GOST_DIGEST_2012_256_NAME)) {
            return true;
        }
        return (str.equalsIgnoreCase(JCP.GOST_SIGN_2012_512_NAME) || str.equalsIgnoreCase(JCP.GOST_SIGN_DH_2012_512_NAME) || str.equalsIgnoreCase("1.2.643.7.1.1.3.3") || str.equalsIgnoreCase(JCP.GOST_EL_SIGN_2012_512_OID_WITH) || str.equalsIgnoreCase(JCP.CRYPTOPRO_SIGN_2012_512_NAME)) && str2.equalsIgnoreCase(JCP.GOST_DIGEST_2012_512_NAME);
    }
}
