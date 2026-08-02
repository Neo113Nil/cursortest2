package io.appmetrica.analytics.blecollecting.internal.config;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import io.appmetrica.analytics.blecollecting.impl.C0148c;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lio/appmetrica/analytics/blecollecting/internal/config/RemoteBleCollectingConfig;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Z", "getEnabled$ble_collecting_release", "()Z", BackendConfig.Restrictions.ENABLED, "Lio/appmetrica/analytics/blecollecting/impl/c;", "b", "Lio/appmetrica/analytics/blecollecting/impl/c;", "getConfig$ble_collecting_release", "()Lio/appmetrica/analytics/blecollecting/impl/c;", ConfigConstants.CONFIG, "<init>", "(ZLio/appmetrica/analytics/blecollecting/impl/c;)V", "ble-collecting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class RemoteBleCollectingConfig {

    /* renamed from: a, reason: from kotlin metadata */
    private final boolean enabled;

    /* renamed from: b, reason: from kotlin metadata */
    private final C0148c config;

    public RemoteBleCollectingConfig(boolean z, C0148c c0148c) {
        this.enabled = z;
        this.config = c0148c;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!RemoteBleCollectingConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        RemoteBleCollectingConfig remoteBleCollectingConfig = (RemoteBleCollectingConfig) other;
        return this.enabled == remoteBleCollectingConfig.enabled && jl40.l(this.config, remoteBleCollectingConfig.config);
    }

    /* renamed from: getConfig$ble_collecting_release, reason: from getter */
    public final C0148c getConfig() {
        return this.config;
    }

    /* renamed from: getEnabled$ble_collecting_release, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return this.config.hashCode() + (Boolean.hashCode(this.enabled) * 31);
    }

    public String toString() {
        return "RemoteBleCollectingConfig(enabled=" + this.enabled + ", config=" + this.config + ')';
    }
}
