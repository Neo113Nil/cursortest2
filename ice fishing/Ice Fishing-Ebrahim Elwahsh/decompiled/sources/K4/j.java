package K4;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public interface j {
    /* renamed from: addClickListener */
    void mo16addClickListener(c cVar);

    /* renamed from: addLifecycleListener */
    void mo17addLifecycleListener(g gVar);

    /* renamed from: addTrigger */
    void mo18addTrigger(String str, String str2);

    /* renamed from: addTriggers */
    void mo19addTriggers(Map<String, String> map);

    /* renamed from: clearTriggers */
    void mo20clearTriggers();

    boolean getPaused();

    /* renamed from: removeClickListener */
    void mo21removeClickListener(c cVar);

    /* renamed from: removeLifecycleListener */
    void mo22removeLifecycleListener(g gVar);

    /* renamed from: removeTrigger */
    void mo23removeTrigger(String str);

    /* renamed from: removeTriggers */
    void mo24removeTriggers(Collection<String> collection);

    void setPaused(boolean z8);
}
