package com.netcetera.threeds.sdk.infrastructure;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.netcetera.threeds.sdk.infrastructure.qh;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigInteger;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class qo extends qh {
    private String ThreeDS2ServiceInitializationCallback;
    protected boolean ThreeDS2ServiceInstance;
    private String createTransaction;
    protected String get;
    private String getSDKInfo;
    private List<X509Certificate> getSDKVersion;
    protected PrivateKey initialize;

    public qo(Map<String, Object> map, String str) {
        super(map);
        this.get = str;
        if (map.containsKey("x5c")) {
            List<String> warnings = rl.getWarnings(map, "x5c");
            this.getSDKVersion = new ArrayList(warnings.size());
            rj rjVar = rj.get(str);
            Iterator<String> it = warnings.iterator();
            while (it.hasNext()) {
                this.getSDKVersion.add(rjVar.initialize(it.next()));
            }
        }
        this.getSDKInfo = qh.ThreeDS2Service(map, "x5t");
        this.createTransaction = qh.ThreeDS2Service(map, "x5t#S256");
        this.ThreeDS2ServiceInitializationCallback = qh.ThreeDS2Service(map, "x5u");
        ThreeDS2Service("x5c", "x5t#S256", "x5t", "x5u");
    }

    public void ThreeDS2Service(Map<String, Object> map, String str, BigInteger bigInteger) {
        map.put(str, qy.ThreeDS2ServiceInstance(bigInteger));
    }

    public void ThreeDS2ServiceInstance(PrivateKey privateKey) {
        this.initialize = privateKey;
    }

    public abstract void get(Map<String, Object> map);

    @Override // com.netcetera.threeds.sdk.infrastructure.qh
    public void get(Map<String, Object> map, qh.initialize initializeVar) {
        get(map);
        if (this.getSDKVersion != null) {
            rj rjVar = new rj();
            ArrayList arrayList = new ArrayList(this.getSDKVersion.size());
            Iterator<X509Certificate> it = this.getSDKVersion.iterator();
            while (it.hasNext()) {
                arrayList.add(rjVar.initialize(it.next()));
            }
            map.put("x5c", arrayList);
        }
        getWarnings("x5t", this.getSDKInfo, map);
        getWarnings("x5t#S256", this.createTransaction, map);
        getWarnings("x5u", this.ThreeDS2ServiceInitializationCallback, map);
        if (this.ThreeDS2ServiceInstance || initializeVar == qh.initialize.INCLUDE_PRIVATE) {
            getWarnings(map);
        }
    }

    public X509Certificate getParamValue() {
        List<X509Certificate> list = this.getSDKVersion;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.getSDKVersion.get(0);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qh
    public PublicKey getWarnings() {
        return (PublicKey) this.getWarnings;
    }

    public abstract void getWarnings(Map<String, Object> map);

    public BigInteger initialize(Map<String, Object> map, String str, boolean z) {
        return qy.ThreeDS2ServiceInstance(qh.ThreeDS2Service(map, str, z));
    }

    public PrivateKey onCompleted() {
        return this.initialize;
    }

    public void onError() {
        X509Certificate paramValue = getParamValue();
        if (paramValue == null || paramValue.getPublicKey().equals(getWarnings())) {
            return;
        }
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("The key in the first certificate MUST match the bare public key represented by other members of the JWK. Public key = ", getWarnings(), " cert = ", paramValue);
    }

    public static class getWarnings {
        public static qo ThreeDS2Service(Map<String, Object> map, String str) {
            String warnings = qh.getWarnings(map, "kty");
            warnings.getClass();
            if (warnings.equals("EC")) {
                return new qg(map, str);
            }
            if (warnings.equals("RSA")) {
                return new qm(map, str);
            }
            throw new ro(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unknown key type (for public keys): '", warnings, "'"));
        }

        public static qo ThreeDS2ServiceInstance(String str, String str2) {
            return ThreeDS2Service(ou.get(str), str2);
        }

        public static qo getWarnings(String str) {
            return ThreeDS2ServiceInstance(str, null);
        }

        public static qo ThreeDS2ServiceInstance(Key key) {
            return (qo) qh.ThreeDS2ServiceInstance.initialize(key);
        }
    }

    public void get(Map<String, Object> map, String str, BigInteger bigInteger, int i) {
        map.put(str, qy.get(bigInteger, i));
    }

    public qo(PublicKey publicKey) {
        super(publicKey);
    }
}
