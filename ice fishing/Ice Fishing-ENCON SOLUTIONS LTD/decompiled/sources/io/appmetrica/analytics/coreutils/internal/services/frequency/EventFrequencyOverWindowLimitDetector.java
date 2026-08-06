package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a, reason: collision with root package name */
    private long f3875a;

    /* renamed from: b, reason: collision with root package name */
    private int f3876b;

    /* renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f3877c;

    /* renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f3878d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j2, int i2, EventFrequencyStorage eventFrequencyStorage) {
        this.f3875a = j2;
        this.f3876b = i2;
        this.f3877c = eventFrequencyStorage;
    }

    public final boolean detect(String str) {
        long longValue;
        long uptimeMillis = this.f3878d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f3877c;
        Long windowStart = eventFrequencyStorage.getWindowStart(str);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(str, uptimeMillis);
            longValue = uptimeMillis;
        } else {
            longValue = windowStart.longValue();
        }
        long j2 = uptimeMillis - longValue;
        if (j2 < 0 || j2 > this.f3875a) {
            this.f3877c.putWindowStart(str, uptimeMillis);
            this.f3877c.putWindowOccurrencesCount(str, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f3877c.getWindowOccurrencesCount(str);
        int intValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f3877c.putWindowOccurrencesCount(str, intValue);
        return intValue > this.f3876b;
    }

    public final synchronized void updateParameters(long j2, int i2) {
        this.f3875a = j2;
        this.f3876b = i2;
    }
}
