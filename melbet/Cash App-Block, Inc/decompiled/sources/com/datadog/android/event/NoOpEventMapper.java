package com.datadog.android.event;

/* loaded from: classes4.dex */
public final class NoOpEventMapper implements EventMapper {
    public final boolean equals(Object obj) {
        return obj instanceof NoOpEventMapper;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.datadog.android.event.EventMapper
    public final Object map(Object obj) {
        obj.getClass();
        return obj;
    }
}
