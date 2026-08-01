package com.onesignal.common;

import Q7.q;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class d {
    public static final d INSTANCE = new d();
    public static final String LOCAL_PREFIX = "local-";

    private d() {
    }

    public final String createLocalId() {
        return LOCAL_PREFIX + UUID.randomUUID();
    }

    public final boolean isLocalId(String id) {
        kotlin.jvm.internal.h.e(id, "id");
        return q.R(id, LOCAL_PREFIX);
    }
}
