package com.netcetera.threeds.sdk.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public abstract class pl implements pc {
    private rd ThreeDS2Service;
    private String ThreeDS2ServiceInstance;
    private String get;
    public final Logger getWarnings = LoggerFactory.getLogger(getClass());
    private String initialize;

    public void ThreeDS2Service(String str) {
        this.initialize = str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.pc
    public String ThreeDS2ServiceInstance() {
        return this.ThreeDS2ServiceInstance;
    }

    public String get() {
        return this.get;
    }

    public void getWarnings(String str) {
        this.ThreeDS2ServiceInstance = str;
    }

    public void initialize(String str) {
        this.get = str;
    }

    public void get(rd rdVar) {
        this.ThreeDS2Service = rdVar;
    }
}
