package com.gamericefishpro.space.ah;

import com.gamericefishpro.space.bd.e;
import com.gamericefishpro.space.bd.f;
import com.gamericefishpro.space.dh.l;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.zg.b {
    private final com.gamericefishpro.space.rc.b configModelStore;
    private final com.gamericefishpro.space.bh.b identityModelStore;
    private final f opRepo;
    private final com.gamericefishpro.space.kd.a time;

    public b(com.gamericefishpro.space.bh.b identityModelStore, com.gamericefishpro.space.rc.b configModelStore, com.gamericefishpro.space.kd.a time, f opRepo) {
        Intrinsics.checkNotNullParameter(identityModelStore, "identityModelStore");
        Intrinsics.checkNotNullParameter(configModelStore, "configModelStore");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        this.identityModelStore = identityModelStore;
        this.configModelStore = configModelStore;
        this.time = time;
        this.opRepo = opRepo;
    }

    @Override // com.gamericefishpro.space.zg.b
    public void sendCustomEvent(String name, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        e.enqueue$default(this.opRepo, new l(((com.gamericefishpro.space.rc.a) this.configModelStore.getModel()).getAppId(), ((com.gamericefishpro.space.bh.a) this.identityModelStore.getModel()).getOnesignalId(), ((com.gamericefishpro.space.bh.a) this.identityModelStore.getModel()).getExternalId(), this.time.getCurrentTimeMillis(), name, map != null ? com.gamericefishpro.space.yb.e.INSTANCE.mapToJson(map).toString() : null), false, 2, null);
    }
}
