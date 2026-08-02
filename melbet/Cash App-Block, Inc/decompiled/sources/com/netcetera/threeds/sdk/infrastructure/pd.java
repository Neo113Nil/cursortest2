package com.netcetera.threeds.sdk.infrastructure;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.netcetera.threeds.sdk.infrastructure.pc;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class pd<A extends pc> {
    private String ThreeDS2Service;
    private final Logger get;
    private final Map<String, A> getWarnings = new LinkedHashMap();

    public pd(String str, Class<A> cls) {
        this.ThreeDS2Service = str;
        this.get = LoggerFactory.getLogger(getClass().getName() + "->" + cls.getSimpleName());
    }

    private boolean ThreeDS2Service(A a) {
        try {
            return a.initialize();
        } catch (Throwable th) {
            a.ThreeDS2ServiceInstance();
            ri.ThreeDS2Service(th);
            return false;
        }
    }

    public Set<String> ThreeDS2ServiceInstance() {
        return Collections.unmodifiableSet(this.getWarnings.keySet());
    }

    public A get(String str) {
        A a = this.getWarnings.get(str);
        if (a != null) {
            return a;
        }
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " is an unknown, unsupported or unavailable ");
        m108m.append(this.ThreeDS2Service);
        m108m.append(" algorithm (not one of ");
        m108m.append(ThreeDS2ServiceInstance());
        m108m.append(").");
        throw new rm(m108m.toString());
    }

    public void get(A a) {
        String ThreeDS2ServiceInstance = a.ThreeDS2ServiceInstance();
        if (ThreeDS2Service(a)) {
            this.getWarnings.put(ThreeDS2ServiceInstance, a);
        }
    }
}
