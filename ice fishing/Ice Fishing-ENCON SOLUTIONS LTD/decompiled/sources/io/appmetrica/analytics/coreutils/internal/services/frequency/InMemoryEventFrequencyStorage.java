package io.appmetrica.analytics.coreutils.internal.services.frequency;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class InMemoryEventFrequencyStorage implements EventFrequencyStorage {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f3879a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f3880b = new LinkedHashMap();

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public Integer getWindowOccurrencesCount(String str) {
        return (Integer) this.f3880b.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public Long getWindowStart(String str) {
        return (Long) this.f3879a.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowOccurrencesCount(String str, int i2) {
        this.f3880b.put(str, Integer.valueOf(i2));
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowStart(String str, long j2) {
        this.f3879a.put(str, Long.valueOf(j2));
    }
}
