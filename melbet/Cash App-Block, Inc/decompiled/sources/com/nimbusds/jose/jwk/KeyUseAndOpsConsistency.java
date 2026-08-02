package com.nimbusds.jose.jwk;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class KeyUseAndOpsConsistency {
    public static final Map MAP;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(KeyUse.SIGNATURE, new HashSet(Arrays.asList(KeyOperation.SIGN, KeyOperation.VERIFY)));
        hashMap.put(KeyUse.ENCRYPTION, new HashSet(Arrays.asList(KeyOperation.ENCRYPT, KeyOperation.DECRYPT, KeyOperation.WRAP_KEY, KeyOperation.UNWRAP_KEY)));
        MAP = Collections.unmodifiableMap(hashMap);
    }
}
