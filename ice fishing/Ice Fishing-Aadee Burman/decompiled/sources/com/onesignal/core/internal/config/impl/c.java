package com.onesignal.core.internal.config.impl;

import D4.e;
import I7.l;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c implements com.onesignal.core.internal.startup.b, g {
    private final com.onesignal.core.internal.config.c configModelStore;
    private final e featureManager;
    private final Object handlerLock;
    private l onJwtConfigHydrated;

    public c(e featureManager, com.onesignal.core.internal.config.c configModelStore) {
        h.e(featureManager, "featureManager");
        h.e(configModelStore, "configModelStore");
        this.featureManager = featureManager;
        this.configModelStore = configModelStore;
        this.handlerLock = new Object();
    }

    public final boolean getIvBehaviorActive() {
        return ((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.REQUIRED;
    }

    public final boolean getNewCodePathsRun() {
        return this.featureManager.isEnabled(D4.b.SDK_IDENTITY_VERIFICATION) || getIvBehaviorActive();
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        h.e(args, "args");
        h.e(tag, "tag");
    }

    public final void setOnJwtConfigHydratedHandler(l lVar) {
        synchronized (this.handlerLock) {
            this.onJwtConfigHydrated = lVar;
        }
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this.configModelStore.subscribe((g) this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        l lVar;
        h.e(model, "model");
        h.e(tag, "tag");
        if (tag.equals("HYDRATE")) {
            synchronized (this.handlerLock) {
                lVar = this.onJwtConfigHydrated;
            }
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(model.getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.REQUIRED));
            }
        }
    }
}
