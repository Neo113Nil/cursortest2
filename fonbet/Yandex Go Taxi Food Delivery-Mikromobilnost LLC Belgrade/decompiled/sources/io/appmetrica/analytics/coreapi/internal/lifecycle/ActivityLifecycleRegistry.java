package io.appmetrica.analytics.coreapi.internal.lifecycle;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H'¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H'¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/lifecycle/ActivityLifecycleRegistry;", "", "Lio/appmetrica/analytics/coreapi/internal/lifecycle/ActivityLifecycleListener;", "listener", "", "Lio/appmetrica/analytics/coreapi/internal/lifecycle/ActivityEvent;", "events", "Lzy11;", "registerListener", "(Lio/appmetrica/analytics/coreapi/internal/lifecycle/ActivityLifecycleListener;[Lio/appmetrica/analytics/coreapi/internal/lifecycle/ActivityEvent;)V", "unregisterListener", "core-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface ActivityLifecycleRegistry {
    void registerListener(ActivityLifecycleListener listener, ActivityEvent... events);

    void unregisterListener(ActivityLifecycleListener listener, ActivityEvent... events);
}
