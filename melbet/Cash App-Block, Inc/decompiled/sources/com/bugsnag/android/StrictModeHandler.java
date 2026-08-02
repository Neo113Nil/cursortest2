package com.bugsnag.android;

import java.util.HashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class StrictModeHandler {
    public static final HashMap POLICY_CODE_MAP;

    static {
        HashMap hashMap = new HashMap();
        POLICY_CODE_MAP = hashMap;
        hashMap.put(1, "DiskWrite");
        hashMap.put(2, "DiskRead");
        hashMap.put(4, "NetworkOperation");
        hashMap.put(8, "CustomSlowCall");
        hashMap.put(16, "ResourceMismatch");
        hashMap.put(256, "CursorLeak");
        hashMap.put(512, "CloseableLeak");
        hashMap.put(1024, "ActivityLeak");
        hashMap.put(2048, "InstanceLeak");
        hashMap.put(4096, "RegistrationLeak");
        hashMap.put(Integer.valueOf(PKIFailureInfo.certRevoked), "FileUriLeak");
        hashMap.put(16384, "CleartextNetwork");
    }
}
