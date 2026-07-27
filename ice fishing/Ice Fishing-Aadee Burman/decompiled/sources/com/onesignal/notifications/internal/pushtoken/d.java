package com.onesignal.notifications.internal.pushtoken;

import Z5.f;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class d {
    private final f status;
    private final String token;

    public d(String str, f status) {
        h.e(status, "status");
        this.token = str;
        this.status = status;
    }

    public final f getStatus() {
        return this.status;
    }

    public final String getToken() {
        return this.token;
    }
}
