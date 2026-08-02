package O4;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public interface j {
    /* renamed from: addClickListener */
    void mo20addClickListener(c cVar);

    /* renamed from: addLifecycleListener */
    void mo21addLifecycleListener(g gVar);

    /* renamed from: addTrigger */
    void mo22addTrigger(String str, String str2);

    /* renamed from: addTriggers */
    void mo23addTriggers(Map<String, String> map);

    /* renamed from: clearTriggers */
    void mo24clearTriggers();

    boolean getPaused();

    /* renamed from: removeClickListener */
    void mo25removeClickListener(c cVar);

    /* renamed from: removeLifecycleListener */
    void mo26removeLifecycleListener(g gVar);

    /* renamed from: removeTrigger */
    void mo27removeTrigger(String str);

    /* renamed from: removeTriggers */
    void mo28removeTriggers(Collection<String> collection);

    void setPaused(boolean z6);
}
