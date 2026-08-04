package com.gamericefishpro.space.yb;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();
    public static final String LOCAL_PREFIX = "local-";

    private c() {
    }

    public final String createLocalId() {
        return LOCAL_PREFIX + UUID.randomUUID();
    }

    public final boolean isLocalId(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return kotlin.text.d.j(id, LOCAL_PREFIX);
    }
}
