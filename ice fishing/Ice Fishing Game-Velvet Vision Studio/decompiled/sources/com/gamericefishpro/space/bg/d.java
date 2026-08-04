package com.gamericefishpro.space.bg;

import com.gamericefishpro.space.jh.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private final f status;
    private final String token;

    public d(String str, f status) {
        Intrinsics.checkNotNullParameter(status, "status");
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
