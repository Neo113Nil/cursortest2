package nb;

import com.onesignal.common.e;
import d9.b;
import kb.h;
import pc.j;
import q8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements b, eb.a {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final jb.b _identityModelStore;
    private final z8.f _operationRepo;
    private final eb.b _sessionService;

    public a(f fVar, eb.b bVar, z8.f fVar2, com.onesignal.core.internal.config.b bVar2, jb.b bVar3) {
        j.e(fVar, "_applicationService");
        j.e(bVar, "_sessionService");
        j.e(fVar2, "_operationRepo");
        j.e(bVar2, "_configModelStore");
        j.e(bVar3, "_identityModelStore");
        this._applicationService = fVar;
        this._sessionService = bVar;
        this._operationRepo = fVar2;
        this._configModelStore = bVar2;
        this._identityModelStore = bVar3;
    }

    private final void refreshUser() {
        if (e.INSTANCE.isLocalId(((jb.a) this._identityModelStore.getModel()).getOnesignalId()) || !this._applicationService.isInForeground()) {
            return;
        }
        z8.e.enqueue$default(this._operationRepo, new h(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((jb.a) this._identityModelStore.getModel()).getOnesignalId()), false, 2, null);
    }

    @Override // eb.a
    public void onSessionStarted() {
        refreshUser();
    }

    @Override // d9.b
    public void start() {
        this._sessionService.subscribe(this);
    }

    @Override // eb.a
    public void onSessionActive() {
    }

    @Override // eb.a
    public void onSessionEnded(long j3) {
    }
}
