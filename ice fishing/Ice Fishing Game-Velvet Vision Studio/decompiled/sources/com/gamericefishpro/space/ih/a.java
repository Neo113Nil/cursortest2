package com.gamericefishpro.space.ih;

import com.gamericefishpro.space.bd.e;
import com.gamericefishpro.space.dh.h;
import com.gamericefishpro.space.jd.b;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.yb.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b, com.gamericefishpro.space.rg.a {
    private final f _applicationService;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final com.gamericefishpro.space.bd.f _operationRepo;
    private final com.gamericefishpro.space.rg.b _sessionService;

    public a(f _applicationService, com.gamericefishpro.space.rg.b _sessionService, com.gamericefishpro.space.bd.f _operationRepo, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.bh.b _identityModelStore) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_operationRepo, "_operationRepo");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._operationRepo = _operationRepo;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
    }

    private final void refreshUser() {
        if (c.INSTANCE.isLocalId(((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getOnesignalId()) || !this._applicationService.isInForeground()) {
            return;
        }
        e.enqueue$default(this._operationRepo, new h(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId(), ((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getOnesignalId()), false, 2, null);
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionStarted() {
        refreshUser();
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        this._sessionService.subscribe(this);
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionActive() {
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionEnded(long j) {
    }
}
