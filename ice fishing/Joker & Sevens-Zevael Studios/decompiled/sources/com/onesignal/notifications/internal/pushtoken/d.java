package com.onesignal.notifications.internal.pushtoken;

import ob.f;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {
    private final f status;
    private final String token;

    public d(String str, f fVar) {
        j.e(fVar, "status");
        this.token = str;
        this.status = fVar;
    }

    public final f getStatus() {
        return this.status;
    }

    public final String getToken() {
        return this.token;
    }
}
