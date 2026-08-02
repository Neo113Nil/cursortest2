package com.google.crypto.tink.internal;

import com.google.crypto.tink.Parameters;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class MutableParametersRegistry {
    public static final MutableParametersRegistry globalInstance = new MutableParametersRegistry();
    public final HashMap parametersMap = new HashMap();

    public final synchronized void put(String str, Parameters parameters) {
        try {
            boolean containsKey = this.parametersMap.containsKey(str);
            HashMap hashMap = this.parametersMap;
            if (!containsKey) {
                hashMap.put(str, parameters);
                return;
            }
            if (((Parameters) hashMap.get(str)).equals(parameters)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.parametersMap.get(str) + "), cannot insert " + parameters);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put((String) entry.getKey(), (Parameters) entry.getValue());
        }
    }
}
