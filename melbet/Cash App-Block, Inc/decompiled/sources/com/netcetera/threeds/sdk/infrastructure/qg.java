package com.netcetera.threeds.sdk.infrastructure;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Map;

/* loaded from: classes5.dex */
public class qg extends qo {
    private String getSDKInfo;

    public qg(Map<String, Object> map, String str) {
        super(map, str);
        String ThreeDS2Service = qh.ThreeDS2Service(map, "crv", true);
        this.getSDKInfo = ThreeDS2Service;
        ECParameterSpec warnings = rc.getWarnings(ThreeDS2Service);
        BigInteger initialize = initialize(map, "x", true);
        BigInteger initialize2 = initialize(map, "y", true);
        re reVar = new re(str, null);
        this.getWarnings = reVar.get(initialize, initialize2, warnings);
        onError();
        if (map.containsKey("d")) {
            ((qo) this).initialize = reVar.getWarnings(initialize(map, "d", false), warnings);
        }
        ThreeDS2Service("crv", "x", "y", "d");
    }

    private int addParam() {
        return (int) Math.ceil(rc.getWarnings(initialize()).getCurve().getField().getFieldSize() / 8.0d);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qh
    public String ThreeDS2Service() {
        return "EC";
    }

    public ECPublicKey ThreeDS2ServiceInstance() {
        return (ECPublicKey) this.getWarnings;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qo
    public void get(Map<String, Object> map) {
        ECPoint w = ThreeDS2ServiceInstance().getW();
        int addParam = addParam();
        get(map, "x", w.getAffineX(), addParam);
        get(map, "y", w.getAffineY(), addParam);
        map.put("crv", initialize());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qo
    public void getWarnings(Map<String, Object> map) {
        ECPrivateKey eCPrivateKey = get();
        if (eCPrivateKey != null) {
            get(map, "d", eCPrivateKey.getS(), addParam());
        }
    }

    public String initialize() {
        return this.getSDKInfo;
    }

    public ECPrivateKey get() {
        return (ECPrivateKey) ((qo) this).initialize;
    }

    public qg(Map<String, Object> map) {
        this(map, null);
    }

    public qg(ECPublicKey eCPublicKey) {
        super(eCPublicKey);
        this.getSDKInfo = rc.getWarnings(eCPublicKey.getParams().getCurve());
    }
}
