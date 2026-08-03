package com.onesignal.common;

import java.util.UUID;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {
    public static final e INSTANCE = new e();
    public static final String LOCAL_PREFIX = "local-";

    private e() {
    }

    public final String createLocalId() {
        return LOCAL_PREFIX + UUID.randomUUID();
    }

    public final boolean isLocalId(String str) {
        pc.j.e(str, "id");
        return xc.h.x(str, LOCAL_PREFIX);
    }
}
