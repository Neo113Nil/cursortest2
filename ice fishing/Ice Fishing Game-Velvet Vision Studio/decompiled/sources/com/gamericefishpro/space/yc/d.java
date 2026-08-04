package com.gamericefishpro.space.yc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private final String cacheKey;
    private final Integer retryCount;
    private final String rywToken;
    private final Long sessionDuration;

    public d() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ d copy$default(d dVar, String str, String str2, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.cacheKey;
        }
        if ((i & 2) != 0) {
            str2 = dVar.rywToken;
        }
        if ((i & 4) != 0) {
            num = dVar.retryCount;
        }
        if ((i & 8) != 0) {
            l = dVar.sessionDuration;
        }
        return dVar.copy(str, str2, num, l);
    }

    public final String component1() {
        return this.cacheKey;
    }

    public final String component2() {
        return this.rywToken;
    }

    public final Integer component3() {
        return this.retryCount;
    }

    public final Long component4() {
        return this.sessionDuration;
    }

    public final d copy(String str, String str2, Integer num, Long l) {
        return new d(str, str2, num, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.cacheKey, dVar.cacheKey) && Intrinsics.a(this.rywToken, dVar.rywToken) && Intrinsics.a(this.retryCount, dVar.retryCount) && Intrinsics.a(this.sessionDuration, dVar.sessionDuration);
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final Integer getRetryCount() {
        return this.retryCount;
    }

    public final String getRywToken() {
        return this.rywToken;
    }

    public final Long getSessionDuration() {
        return this.sessionDuration;
    }

    public int hashCode() {
        String str = this.cacheKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rywToken;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.retryCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.sessionDuration;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "OptionalHeaders(cacheKey=" + this.cacheKey + ", rywToken=" + this.rywToken + ", retryCount=" + this.retryCount + ", sessionDuration=" + this.sessionDuration + ')';
    }

    public d(String str, String str2, Integer num, Long l) {
        this.cacheKey = str;
        this.rywToken = str2;
        this.retryCount = num;
        this.sessionDuration = l;
    }

    public /* synthetic */ d(String str, String str2, Integer num, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l);
    }
}
