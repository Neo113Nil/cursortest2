package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.qh;
import com.netcetera.threeds.sdk.infrastructure.qo;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class qz {
    private String ThreeDS2ServiceInstance;
    private String getWarnings;
    protected oq get = new oq();
    private Map<String, Object> initialize = new LinkedHashMap();

    public void ThreeDS2Service(String str, Object obj) {
        this.initialize.put(str, obj);
        this.ThreeDS2ServiceInstance = null;
        this.getWarnings = null;
    }

    public qo ThreeDS2ServiceInstance(String str, String str2) {
        return qo.getWarnings.ThreeDS2Service((Map) initialize(str), str2);
    }

    public Long get(String str) {
        return rl.ThreeDS2ServiceInstance(this.initialize, str);
    }

    public String getWarnings() {
        if (this.getWarnings == null) {
            this.getWarnings = this.get.get(initialize());
        }
        return this.getWarnings;
    }

    public String initialize() {
        if (this.ThreeDS2ServiceInstance == null) {
            this.ThreeDS2ServiceInstance = ou.get((Map<String, ?>) this.initialize);
        }
        return this.ThreeDS2ServiceInstance;
    }

    public void ThreeDS2Service(String str, String str2) {
        ThreeDS2Service(str, (Object) str2);
    }

    public String ThreeDS2ServiceInstance(String str) {
        return rl.get(this.initialize, str);
    }

    public void ThreeDS2ServiceInstance(String str, qh qhVar) {
        ThreeDS2Service(str, qhVar.get(qh.initialize.PUBLIC_ONLY));
    }

    public Object initialize(String str) {
        return this.initialize.get(str);
    }

    public void getWarnings(String str) {
        this.getWarnings = str;
        String ThreeDS2ServiceInstance = this.get.ThreeDS2ServiceInstance(str);
        this.ThreeDS2ServiceInstance = ThreeDS2ServiceInstance;
        this.initialize = ou.get(ThreeDS2ServiceInstance);
    }
}
