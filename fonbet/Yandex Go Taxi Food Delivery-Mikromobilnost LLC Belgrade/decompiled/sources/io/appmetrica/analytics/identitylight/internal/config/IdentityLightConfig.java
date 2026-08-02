package io.appmetrica.analytics.identitylight.internal.config;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.b64;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lio/appmetrica/analytics/identitylight/internal/config/IdentityLightConfig;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Z", "getEnabled", "()Z", BackendConfig.Restrictions.ENABLED, "", "b", "J", "getMinInterval", "()J", "minInterval", "<init>", "(ZJ)V", "identity-light_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class IdentityLightConfig {

    /* renamed from: a, reason: from kotlin metadata */
    private final boolean enabled;

    /* renamed from: b, reason: from kotlin metadata */
    private final long minInterval;

    public IdentityLightConfig(boolean z, long j) {
        this.enabled = z;
        this.minInterval = j;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!IdentityLightConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        IdentityLightConfig identityLightConfig = (IdentityLightConfig) other;
        return this.enabled == identityLightConfig.enabled && this.minInterval == identityLightConfig.minInterval;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getMinInterval() {
        return this.minInterval;
    }

    public int hashCode() {
        return Long.hashCode(this.minInterval) + (Boolean.hashCode(this.enabled) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdentityLightConfig(enabled=");
        sb.append(this.enabled);
        sb.append(", minInterval=");
        return b64.o(sb, this.minInterval, ')');
    }
}
