package com.yandex.passport.internal.provider.communication;

import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import defpackage.izf;
import defpackage.tt1;

/* loaded from: classes4.dex */
public final class HostCommunicationService extends izf {
    public static final /* synthetic */ int c = 0;
    public Messenger b;

    @Override // defpackage.izf, android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        super.onBind(intent);
        Messenger messenger = this.b;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // defpackage.izf, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b = new Messenger(new tt1(this, Looper.getMainLooper(), 17));
    }

    @Override // defpackage.izf, android.app.Service
    public final void onDestroy() {
        this.b = null;
        super.onDestroy();
    }
}
