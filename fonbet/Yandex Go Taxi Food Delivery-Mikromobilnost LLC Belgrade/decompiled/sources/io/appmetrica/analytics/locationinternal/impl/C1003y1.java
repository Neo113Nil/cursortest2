package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1003y1 implements HostRetryInfoProvider {
    public final ModulePreferences a;

    public C1003y1(ModulePreferences modulePreferences) {
        this.a = modulePreferences;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.a.getLong("last_request_attempt_time", 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.a.getInt("next_request_attempt", 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j) {
        this.a.putLong("last_request_attempt_time", j);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i) {
        this.a.putInt("next_request_attempt", i);
    }
}
