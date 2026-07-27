package U5;

import D4.e;
import com.onesignal.common.d;
import com.onesignal.core.internal.config.c;
import com.onesignal.core.internal.startup.b;
import kotlin.jvm.internal.h;
import t4.f;

/* loaded from: classes2.dex */
public final class a implements b, K5.a {
    private final f _applicationService;
    private final c _configModelStore;
    private final Q5.b _identityModelStore;
    private final D4.f _operationRepo;
    private final K5.b _sessionService;

    public a(f _applicationService, K5.b _sessionService, D4.f _operationRepo, c _configModelStore, Q5.b _identityModelStore) {
        h.e(_applicationService, "_applicationService");
        h.e(_sessionService, "_sessionService");
        h.e(_operationRepo, "_operationRepo");
        h.e(_configModelStore, "_configModelStore");
        h.e(_identityModelStore, "_identityModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._operationRepo = _operationRepo;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
    }

    private final void refreshUser() {
        if (d.INSTANCE.isLocalId(((Q5.a) this._identityModelStore.getModel()).getOnesignalId()) || !this._applicationService.isInForeground()) {
            return;
        }
        e.enqueue$default(this._operationRepo, new R5.h(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((Q5.a) this._identityModelStore.getModel()).getOnesignalId(), ((Q5.a) this._identityModelStore.getModel()).getExternalId()), false, 2, null);
    }

    @Override // K5.a
    public void onSessionStarted() {
        refreshUser();
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._sessionService.subscribe(this);
    }

    @Override // K5.a
    public void onSessionActive() {
    }

    @Override // K5.a
    public void onSessionEnded(long j9) {
    }
}
