package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Hr;

/* loaded from: classes4.dex */
public class UserProfileUpdate<T extends Hr> {
    private final Hr a;

    public UserProfileUpdate(Hr hr) {
        this.a = hr;
    }

    public T getUserProfileUpdatePatcher() {
        return (T) this.a;
    }
}
