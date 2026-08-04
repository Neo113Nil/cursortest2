package com.gamericefishpro.space.l6;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final UUID a;
    public final com.gamericefishpro.space.u6.p b;
    public final Set c;

    public s(UUID id, com.gamericefishpro.space.u6.p workSpec, LinkedHashSet tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.a = id;
        this.b = workSpec;
        this.c = tags;
    }
}
