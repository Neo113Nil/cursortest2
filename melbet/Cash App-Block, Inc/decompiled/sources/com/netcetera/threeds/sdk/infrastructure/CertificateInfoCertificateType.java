package com.netcetera.threeds.sdk.infrastructure;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CertificateInfoCertificateType implements setAcsSignedContent {
    private final no getWarnings = (no) nu.initialize(new Object[]{CertificateInfoCertificateType.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private Map<Class, setAcsTransactionID> initialize = new HashMap();

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsSignedContent
    public final <T> T ThreeDS2ServiceInstance(Class<T> cls) {
        setAcsTransactionID setacstransactionid = this.initialize.get(cls);
        if (setacstransactionid != null) {
            return (T) setacstransactionid.ThreeDS2ServiceInstance();
        }
        cls.getSimpleName();
        return null;
    }

    public final <T> void get(Class<T> cls, setAcsTransactionID<? extends T> setacstransactionid) {
        this.initialize.put(cls, setacstransactionid);
    }
}
