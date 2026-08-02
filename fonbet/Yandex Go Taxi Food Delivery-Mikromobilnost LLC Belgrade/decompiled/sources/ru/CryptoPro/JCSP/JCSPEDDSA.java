package ru.CryptoPro.JCSP;

import java.util.Map;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigEDDSA;

/* loaded from: classes4.dex */
public class JCSPEDDSA extends JCSP {
    public static final String INFO = "CryptoPro Java CSP EdDSA Provider (Ed25519)";
    public static final String PROVIDER_NAME = "JCSPEDDSA";

    public JCSPEDDSA() {
        super("JCSPEDDSA", JCSP.getJarVersion().getProductVersion().doubleValue(), INFO, 32);
    }

    @Override // ru.CryptoPro.JCSP.JCSP
    public String ProviderName() {
        return "JCSPEDDSA";
    }

    @Override // ru.CryptoPro.JCSP.JCSP
    public KeyStoreConfigBase a() {
        return KeyStoreConfigEDDSA.getInstance();
    }

    @Override // ru.CryptoPro.JCSP.JCSP
    public void c(Map map) {
        map.put("Signature.Ed25519 implementedIn", "Software");
        map.put("Signature.Ed25519", "ru.CryptoPro.JCSP.Sign.eddsa.JCSPEDDSASign");
        map.put("Signature.CP_Ed25519 implementedIn", "Software");
        map.put("Signature.CP_Ed25519", "ru.CryptoPro.JCSP.Sign.eddsa.JCSPEDDSASign");
        map.put("Alg.Alias.Signature.OID.1.3.101.112", "CP_Ed25519");
        map.put("Alg.Alias.Signature.1.3.101.112", "CP_Ed25519");
        map.put("KeyPairGenerator.Ed25519 implementedIn", "Software");
        map.put("AlgorithmParameters.Ed25519 implementedIn", "Software");
        map.put("KeyPairGenerator.Ed25519", "ru.CryptoPro.JCSP.Key.eddsa.JCSPEDDSAKeyPairGenerator");
        map.put("KeyPairGenerator.CP_Ed25519 implementedIn", "Software");
        map.put("AlgorithmParameters.CP_Ed25519 implementedIn", "Software");
        map.put("KeyPairGenerator.CP_Ed25519", "ru.CryptoPro.JCSP.Key.eddsa.JCSPEDDSAKeyPairGenerator");
        StringBuilder sb = new StringBuilder("Alg.Alias.KeyPairGenerator.");
        OID oid = AlgIdSpecForeign.OID_EDDSA;
        sb.append(oid);
        map.put(sb.toString(), "CP_Ed25519");
        map.put("Alg.Alias.KeyPairGenerator.OID." + oid, "CP_Ed25519");
        map.put("KeyFactory.CP_Ed25519 implementedIn", "Software");
        map.put("Alg.Alias.KeyFactory." + oid, "CP_Ed25519");
        map.put("Alg.Alias.KeyFactory.OID." + oid, "CP_Ed25519");
        map.put("KeyFactory.CP_Ed25519", "ru.CryptoPro.JCSP.Key.eddsa.JCSPEDDSAKeyFactory");
    }
}
