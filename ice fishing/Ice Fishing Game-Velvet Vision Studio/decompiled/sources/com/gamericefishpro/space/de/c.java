package com.gamericefishpro.space.de;

import com.gamericefishpro.space.ve.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.ce.a {
    private final com.gamericefishpro.space.ke.a _locationManager;
    private final n _notificationsManager;

    public c(n _notificationsManager, com.gamericefishpro.space.ke.a _locationManager) {
        Intrinsics.checkNotNullParameter(_notificationsManager, "_notificationsManager");
        Intrinsics.checkNotNullParameter(_locationManager, "_locationManager");
        this._notificationsManager = _notificationsManager;
        this._locationManager = _locationManager;
    }

    @Override // com.gamericefishpro.space.ce.a
    public b createPrompt(String promptType) {
        Intrinsics.checkNotNullParameter(promptType, "promptType");
        if (Intrinsics.a(promptType, "push")) {
            return new d(this._notificationsManager);
        }
        if (Intrinsics.a(promptType, "location")) {
            return new a(this._locationManager);
        }
        return null;
    }
}
