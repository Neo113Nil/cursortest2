package com.netcetera.threeds.sdk.infrastructure;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Map;

/* loaded from: classes5.dex */
public class qm extends qo {
    public qm(Map<String, Object> map, String str) {
        super(map, str);
        BigInteger initialize = initialize(map, "n", true);
        BigInteger initialize2 = initialize(map, "e", true);
        rh rhVar = new rh(str, null);
        this.getWarnings = rhVar.get(initialize, initialize2);
        onError();
        if (map.containsKey("d")) {
            BigInteger initialize3 = initialize(map, "d", false);
            if (map.containsKey("p")) {
                ((qo) this).initialize = rhVar.initialize(initialize, initialize2, initialize3, initialize(map, "p", false), initialize(map, "q", false), initialize(map, "dp", false), initialize(map, "dq", false), initialize(map, "qi", false));
            } else {
                ((qo) this).initialize = rhVar.ThreeDS2ServiceInstance(initialize, initialize3);
            }
        }
        ThreeDS2Service("n", "e", "d", "p", "q", "dp", "dq", "qi");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qh
    public String ThreeDS2Service() {
        return "RSA";
    }

    public RSAPrivateKey ThreeDS2ServiceInstance() {
        return (RSAPrivateKey) ((qo) this).initialize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qo
    public void get(Map<String, Object> map) {
        RSAPublicKey initialize = initialize();
        ThreeDS2Service(map, "n", initialize.getModulus());
        ThreeDS2Service(map, "e", initialize.getPublicExponent());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qo
    public void getWarnings(Map<String, Object> map) {
        RSAPrivateKey ThreeDS2ServiceInstance = ThreeDS2ServiceInstance();
        if (ThreeDS2ServiceInstance != null) {
            ThreeDS2Service(map, "d", ThreeDS2ServiceInstance.getPrivateExponent());
            if (ThreeDS2ServiceInstance instanceof RSAPrivateCrtKey) {
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) ThreeDS2ServiceInstance;
                ThreeDS2Service(map, "p", rSAPrivateCrtKey.getPrimeP());
                ThreeDS2Service(map, "q", rSAPrivateCrtKey.getPrimeQ());
                ThreeDS2Service(map, "dp", rSAPrivateCrtKey.getPrimeExponentP());
                ThreeDS2Service(map, "dq", rSAPrivateCrtKey.getPrimeExponentQ());
                ThreeDS2Service(map, "qi", rSAPrivateCrtKey.getCrtCoefficient());
            }
        }
    }

    public RSAPublicKey initialize() {
        return (RSAPublicKey) this.getWarnings;
    }

    public qm(Map<String, Object> map) {
        this(map, null);
    }

    public qm(RSAPublicKey rSAPublicKey) {
        super(rSAPublicKey);
    }
}
