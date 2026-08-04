package com.gamericefishpro.space.pd;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface j {
    /* JADX INFO: renamed from: addClickListener */
    void mo16addClickListener(c cVar);

    /* JADX INFO: renamed from: addLifecycleListener */
    void mo17addLifecycleListener(g gVar);

    /* JADX INFO: renamed from: addTrigger */
    void mo18addTrigger(String str, String str2);

    /* JADX INFO: renamed from: addTriggers */
    void mo19addTriggers(Map<String, String> map);

    /* JADX INFO: renamed from: clearTriggers */
    void mo20clearTriggers();

    boolean getPaused();

    /* JADX INFO: renamed from: removeClickListener */
    void mo21removeClickListener(c cVar);

    /* JADX INFO: renamed from: removeLifecycleListener */
    void mo22removeLifecycleListener(g gVar);

    /* JADX INFO: renamed from: removeTrigger */
    void mo23removeTrigger(String str);

    /* JADX INFO: renamed from: removeTriggers */
    void mo24removeTriggers(Collection<String> collection);

    void setPaused(boolean z);
}
