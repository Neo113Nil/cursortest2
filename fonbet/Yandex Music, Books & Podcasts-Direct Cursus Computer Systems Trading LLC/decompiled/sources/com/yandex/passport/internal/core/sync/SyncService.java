package com.yandex.passport.internal.core.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes4.dex */
public final class SyncService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        try {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onBind: intent=" + intent, 8);
            }
            return com.yandex.passport.internal.di.a.a().getSyncAdapter().getSyncAdapterBinder();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onCreate", 8);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onDestroy", 8);
        }
    }
}
