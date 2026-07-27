package O4;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public interface j {
    /* renamed from: addClickListener */
    void mo21addClickListener(c cVar);

    /* renamed from: addLifecycleListener */
    void mo22addLifecycleListener(g gVar);

    /* renamed from: addTrigger */
    void mo23addTrigger(String str, String str2);

    /* renamed from: addTriggers */
    void mo24addTriggers(Map<String, String> map);

    /* renamed from: clearTriggers */
    void mo25clearTriggers();

    boolean getPaused();

    /* renamed from: removeClickListener */
    void mo26removeClickListener(c cVar);

    /* renamed from: removeLifecycleListener */
    void mo27removeLifecycleListener(g gVar);

    /* renamed from: removeTrigger */
    void mo28removeTrigger(String str);

    /* renamed from: removeTriggers */
    void mo29removeTriggers(Collection<String> collection);

    void setPaused(boolean z3);
}
