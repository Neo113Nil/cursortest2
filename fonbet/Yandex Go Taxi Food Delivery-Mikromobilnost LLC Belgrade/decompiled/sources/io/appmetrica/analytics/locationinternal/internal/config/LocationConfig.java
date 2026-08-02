package io.appmetrica.analytics.locationinternal.internal.config;

import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.locationinternal.impl.C0951h;
import io.appmetrica.analytics.locationinternal.impl.X;
import io.appmetrica.analytics.locationinternal.impl.p2;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B=\b\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010$\u001a\u00020\u001f¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lio/appmetrica/analytics/locationinternal/internal/config/LocationConfig;", "", "", "toString", "other", "", "equals", "", "hashCode", "", "Lio/appmetrica/analytics/locationinternal/impl/X;", "a", "Ljava/util/List;", "getConditionalArgumentsList$location_yandex_release", "()Ljava/util/List;", "conditionalArgumentsList", "Lio/appmetrica/analytics/networktasks/internal/RetryPolicyConfig;", "b", "Lio/appmetrica/analytics/networktasks/internal/RetryPolicyConfig;", "getRetryPolicyConfig$location_yandex_release", "()Lio/appmetrica/analytics/networktasks/internal/RetryPolicyConfig;", "retryPolicyConfig", "c", "getHosts$location_yandex_release", "hosts", "Lio/appmetrica/analytics/locationinternal/impl/p2;", "d", "Lio/appmetrica/analytics/locationinternal/impl/p2;", "getThrottlingConfig$location_yandex_release", "()Lio/appmetrica/analytics/locationinternal/impl/p2;", "throttlingConfig", "Lio/appmetrica/analytics/locationinternal/impl/h;", "e", "Lio/appmetrica/analytics/locationinternal/impl/h;", "getCacheControl$location_yandex_release", "()Lio/appmetrica/analytics/locationinternal/impl/h;", "cacheControl", "<init>", "(Ljava/util/List;Lio/appmetrica/analytics/networktasks/internal/RetryPolicyConfig;Ljava/util/List;Lio/appmetrica/analytics/locationinternal/impl/p2;Lio/appmetrica/analytics/locationinternal/impl/h;)V", "location-yandex_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class LocationConfig {

    /* renamed from: a, reason: from kotlin metadata */
    private final List conditionalArgumentsList;

    /* renamed from: b, reason: from kotlin metadata */
    private final RetryPolicyConfig retryPolicyConfig;

    /* renamed from: c, reason: from kotlin metadata */
    private final List hosts;

    /* renamed from: d, reason: from kotlin metadata */
    private final p2 throttlingConfig;

    /* renamed from: e, reason: from kotlin metadata */
    private final C0951h cacheControl;

    public LocationConfig(List<X> list, RetryPolicyConfig retryPolicyConfig, List<String> list2, p2 p2Var, C0951h c0951h) {
        this.conditionalArgumentsList = list;
        this.retryPolicyConfig = retryPolicyConfig;
        this.hosts = list2;
        this.throttlingConfig = p2Var;
        this.cacheControl = c0951h;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!LocationConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        LocationConfig locationConfig = (LocationConfig) other;
        return jl40.l(this.conditionalArgumentsList, locationConfig.conditionalArgumentsList) && jl40.l(this.retryPolicyConfig, locationConfig.retryPolicyConfig) && jl40.l(this.hosts, locationConfig.hosts) && jl40.l(this.throttlingConfig, locationConfig.throttlingConfig) && jl40.l(this.cacheControl, locationConfig.cacheControl);
    }

    /* renamed from: getCacheControl$location_yandex_release, reason: from getter */
    public final C0951h getCacheControl() {
        return this.cacheControl;
    }

    public final List<X> getConditionalArgumentsList$location_yandex_release() {
        return this.conditionalArgumentsList;
    }

    public final List<String> getHosts$location_yandex_release() {
        return this.hosts;
    }

    /* renamed from: getRetryPolicyConfig$location_yandex_release, reason: from getter */
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return this.retryPolicyConfig;
    }

    /* renamed from: getThrottlingConfig$location_yandex_release, reason: from getter */
    public final p2 getThrottlingConfig() {
        return this.throttlingConfig;
    }

    public int hashCode() {
        return this.cacheControl.hashCode() + ((this.throttlingConfig.hashCode() + unr0.c((this.retryPolicyConfig.hashCode() + (this.conditionalArgumentsList.hashCode() * 31)) * 31, 31, this.hosts)) * 31);
    }

    public String toString() {
        return "LocationConfig(conditionalArgumentsList=" + this.conditionalArgumentsList + ", retryPolicyConfig=" + this.retryPolicyConfig + ", hosts=" + this.hosts + ", throttlingConfig=" + this.throttlingConfig + ", cacheControl=" + this.cacheControl + ')';
    }
}
