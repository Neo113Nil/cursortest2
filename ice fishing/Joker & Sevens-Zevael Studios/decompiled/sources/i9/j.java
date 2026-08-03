package i9;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface j {
    /* renamed from: addClickListener */
    void mo13addClickListener(c cVar);

    /* renamed from: addLifecycleListener */
    void mo14addLifecycleListener(g gVar);

    /* renamed from: addTrigger */
    void mo15addTrigger(String str, String str2);

    /* renamed from: addTriggers */
    void mo16addTriggers(Map<String, String> map);

    /* renamed from: clearTriggers */
    void mo17clearTriggers();

    boolean getPaused();

    /* renamed from: removeClickListener */
    void mo18removeClickListener(c cVar);

    /* renamed from: removeLifecycleListener */
    void mo19removeLifecycleListener(g gVar);

    /* renamed from: removeTrigger */
    void mo20removeTrigger(String str);

    /* renamed from: removeTriggers */
    void mo21removeTriggers(Collection<String> collection);

    void setPaused(boolean z10);
}
