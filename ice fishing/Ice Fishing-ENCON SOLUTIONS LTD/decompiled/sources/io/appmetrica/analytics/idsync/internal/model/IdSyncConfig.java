package io.appmetrica.analytics.idsync.internal.model;

import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class IdSyncConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4079a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4080b;

    /* renamed from: c, reason: collision with root package name */
    private final List f4081c;

    public IdSyncConfig(boolean z2, long j2, List<RequestConfig> list) {
        this.f4079a = z2;
        this.f4080b = j2;
        this.f4081c = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!IdSyncConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.IdSyncConfig");
        }
        IdSyncConfig idSyncConfig = (IdSyncConfig) obj;
        return this.f4079a == idSyncConfig.f4079a && this.f4080b == idSyncConfig.f4080b && i.a(this.f4081c, idSyncConfig.f4081c);
    }

    public final boolean getEnabled() {
        return this.f4079a;
    }

    public final long getLaunchDelay() {
        return this.f4080b;
    }

    public final List<RequestConfig> getRequests() {
        return this.f4081c;
    }

    public int hashCode() {
        return this.f4081c.hashCode() + ((Long.hashCode(this.f4080b) + (Boolean.hashCode(this.f4079a) * 31)) * 31);
    }

    public String toString() {
        return "IdSyncConfig(enabled=" + this.f4079a + ", launchDelay=" + this.f4080b + ", requests=" + this.f4081c + ')';
    }
}
