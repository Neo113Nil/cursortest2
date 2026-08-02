package io.appmetrica.analytics.impl;

import defpackage.b64;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* renamed from: io.appmetrica.analytics.impl.tj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0742tj implements RemoteConfigMetaInfo {
    public final long a;
    public final long b;

    public C0742tj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static C0742tj a(C0742tj c0742tj, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c0742tj.a;
        }
        if ((i & 2) != 0) {
            j2 = c0742tj.b;
        }
        c0742tj.getClass();
        return new C0742tj(j, j2);
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0742tj)) {
            return false;
        }
        C0742tj c0742tj = (C0742tj) obj;
        return this.a == c0742tj.a && this.b == c0742tj.b;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfigMetaInfoModel(firstSendTime=");
        sb.append(this.a);
        sb.append(", lastUpdateTime=");
        return b64.o(sb, this.b, ')');
    }

    public final C0742tj a(long j, long j2) {
        return new C0742tj(j, j2);
    }

    public final long a() {
        return this.a;
    }
}
