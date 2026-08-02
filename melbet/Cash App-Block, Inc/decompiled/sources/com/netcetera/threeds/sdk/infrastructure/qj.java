package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.qo;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.ECParameterSpec;

/* loaded from: classes5.dex */
public class qj {
    public static qg getWarnings(ECParameterSpec eCParameterSpec) {
        return initialize(eCParameterSpec, null, null);
    }

    public static qg initialize(ECParameterSpec eCParameterSpec, String str, SecureRandom secureRandom) {
        KeyPair ThreeDS2Service = new re(str, secureRandom).ThreeDS2Service(eCParameterSpec);
        qg qgVar = (qg) qo.getWarnings.ThreeDS2ServiceInstance(ThreeDS2Service.getPublic());
        qgVar.ThreeDS2ServiceInstance(ThreeDS2Service.getPrivate());
        return qgVar;
    }
}
