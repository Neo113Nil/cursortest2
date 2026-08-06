package io.appmetrica.analytics.coreutils.internal.services;

import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class UtilityServiceConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final long f3863a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3864b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = utilityServiceConfiguration.f3863a;
        }
        if ((i2 & 2) != 0) {
            j3 = utilityServiceConfiguration.f3864b;
        }
        return utilityServiceConfiguration.copy(j2, j3);
    }

    public final long component1() {
        return this.f3863a;
    }

    public final long component2() {
        return this.f3864b;
    }

    public final UtilityServiceConfiguration copy(long j2, long j3) {
        return new UtilityServiceConfiguration(j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) obj;
        return this.f3863a == utilityServiceConfiguration.f3863a && this.f3864b == utilityServiceConfiguration.f3864b;
    }

    public final long getInitialConfigTime() {
        return this.f3863a;
    }

    public final long getLastUpdateConfigTime() {
        return this.f3864b;
    }

    public int hashCode() {
        return Long.hashCode(this.f3864b) + (Long.hashCode(this.f3863a) * 31);
    }

    public String toString() {
        return "UtilityServiceConfiguration(initialConfigTime=" + this.f3863a + ", lastUpdateConfigTime=" + this.f3864b + ')';
    }

    public UtilityServiceConfiguration(long j2, long j3) {
        this.f3863a = j2;
        this.f3864b = j3;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j2, long j3, int i2, e eVar) {
        this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? 0L : j3);
    }
}
