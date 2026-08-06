package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* loaded from: classes.dex */
public final class Kg implements RemoteConfigMetaInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f4637a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4638b;

    public Kg(long j2, long j3) {
        this.f4637a = j2;
        this.f4638b = j3;
    }

    public final Kg a(long j2, long j3) {
        return new Kg(j2, j3);
    }

    public final long b() {
        return this.f4638b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kg)) {
            return false;
        }
        Kg kg = (Kg) obj;
        return this.f4637a == kg.f4637a && this.f4638b == kg.f4638b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f4637a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f4638b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4638b) + (Long.hashCode(this.f4637a) * 31);
    }

    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f4637a + ", lastUpdateTime=" + this.f4638b + ')';
    }

    public final long a() {
        return this.f4637a;
    }

    public static Kg a(Kg kg, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = kg.f4637a;
        }
        if ((i2 & 2) != 0) {
            j3 = kg.f4638b;
        }
        kg.getClass();
        return new Kg(j2, j3);
    }
}
