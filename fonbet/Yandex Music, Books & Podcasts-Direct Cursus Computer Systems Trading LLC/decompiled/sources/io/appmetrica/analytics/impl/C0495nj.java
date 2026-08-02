package io.appmetrica.analytics.impl;

import defpackage.eta;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.nj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0495nj implements RemoteConfigMetaInfo {
    public final long a;
    public final long b;

    public C0495nj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static C0495nj a(C0495nj c0495nj, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c0495nj.a;
        }
        if ((i & 2) != 0) {
            j2 = c0495nj.b;
        }
        c0495nj.getClass();
        return new C0495nj(j, j2);
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0495nj)) {
            return false;
        }
        C0495nj c0495nj = (C0495nj) obj;
        return this.a == c0495nj.a && this.b == c0495nj.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfigMetaInfoModel(firstSendTime=");
        sb.append(this.a);
        sb.append(", lastUpdateTime=");
        return eta.g(sb, this.b, ')');
    }

    public final long a() {
        return this.a;
    }

    @NotNull
    public final C0495nj a(long j, long j2) {
        return new C0495nj(j, j2);
    }
}
