package com.netcetera.threeds.sdk.infrastructure;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.security.Key;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class qh implements Serializable {
    protected Map<String, Object> ThreeDS2Service;
    private List<String> ThreeDS2ServiceInitializationCallback;
    private String ThreeDS2ServiceInstance;
    private String get;
    protected Key getWarnings;
    private String initialize;

    public enum initialize {
        INCLUDE_PRIVATE,
        INCLUDE_SYMMETRIC,
        PUBLIC_ONLY
    }

    public qh(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.ThreeDS2Service = linkedHashMap;
        linkedHashMap.putAll(map);
        ThreeDS2Service("kty", "use", "kid", "alg", "key_ops");
        ThreeDS2ServiceInstance(ThreeDS2Service(map, "use"));
        initialize(ThreeDS2Service(map, "kid"));
        getWarnings(ThreeDS2Service(map, "alg"));
        if (map.containsKey("key_ops")) {
            this.ThreeDS2ServiceInitializationCallback = rl.getWarnings(map, "key_ops");
        }
    }

    public static String ThreeDS2Service(Map<String, Object> map, String str, boolean z) {
        String ThreeDS2Service = ThreeDS2Service(map, str);
        if (ThreeDS2Service == null && z) {
            throw new ro(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Missing required '", str, "' parameter."));
        }
        return ThreeDS2Service;
    }

    public abstract String ThreeDS2Service();

    public Key ThreeDS2ServiceInitializationCallback() {
        return this.getWarnings;
    }

    public void ThreeDS2ServiceInstance(String str) {
        this.ThreeDS2ServiceInstance = str;
    }

    public String cleanup() {
        return this.ThreeDS2ServiceInstance;
    }

    public String createTransaction() {
        return getWarnings(initialize.INCLUDE_SYMMETRIC);
    }

    public Map<String, Object> get(initialize initializeVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("kty", ThreeDS2Service());
        getWarnings("kid", getSDKVersion(), linkedHashMap);
        getWarnings("use", cleanup(), linkedHashMap);
        getWarnings("key_ops", this.ThreeDS2ServiceInitializationCallback, linkedHashMap);
        getWarnings("alg", getSDKInfo(), linkedHashMap);
        get(linkedHashMap, initializeVar);
        linkedHashMap.putAll(this.ThreeDS2Service);
        return linkedHashMap;
    }

    public abstract void get(Map<String, Object> map, initialize initializeVar);

    public String getSDKInfo() {
        return this.initialize;
    }

    public String getSDKVersion() {
        return this.get;
    }

    public String getWarnings(initialize initializeVar) {
        return ou.get((Map<String, ?>) get(initializeVar));
    }

    public void initialize(String str) {
        this.get = str;
    }

    public String toString() {
        return getClass().getName() + get(initialize.PUBLIC_ONLY);
    }

    public void getWarnings(String str) {
        this.initialize = str;
    }

    public PublicKey getWarnings() {
        try {
            return (PublicKey) this.getWarnings;
        } catch (Exception unused) {
            return null;
        }
    }

    public void getWarnings(String str, Object obj, Map<String, Object> map) {
        if (obj != null) {
            map.put(str, obj);
        }
    }

    public static String getWarnings(Map<String, Object> map, String str) {
        return ThreeDS2Service(map, str, true);
    }

    public void ThreeDS2Service(String... strArr) {
        for (String str : strArr) {
            this.ThreeDS2Service.remove(str);
        }
    }

    public static String ThreeDS2Service(Map<String, Object> map, String str) {
        return rl.initialize(map, str);
    }

    public qh(Key key) {
        this.ThreeDS2Service = new LinkedHashMap();
        this.getWarnings = key;
    }

    public static class ThreeDS2ServiceInstance {
        public static qh initialize(Map<String, Object> map) {
            String warnings;
            warnings = qh.getWarnings(map, "kty");
            warnings.getClass();
            switch (warnings) {
                case "EC":
                    return new qg(map);
                case "RSA":
                    return new qm(map);
                case "oct":
                    return new qi(map);
                default:
                    throw new ro(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unknown key type algorithm: '", warnings, "'"));
            }
        }

        public static qh initialize(Key key) {
            if (RSAPublicKey.class.isInstance(key)) {
                return new qm((RSAPublicKey) key);
            }
            if (ECPublicKey.class.isInstance(key)) {
                return new qg((ECPublicKey) key);
            }
            if (!PublicKey.class.isInstance(key)) {
                return new qi(key);
            }
            throw new ro("Unsupported or unknown public key " + key);
        }

        public static qh initialize(String str) {
            return initialize(ou.get(str));
        }
    }
}
