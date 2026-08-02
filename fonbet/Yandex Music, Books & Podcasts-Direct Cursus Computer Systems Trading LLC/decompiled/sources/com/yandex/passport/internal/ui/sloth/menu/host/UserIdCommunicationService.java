package com.yandex.passport.internal.ui.sloth.menu.host;

import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import defpackage.gm5;
import defpackage.izf;
import defpackage.t8a;
import defpackage.tt1;

/* loaded from: classes4.dex */
public final class UserIdCommunicationService extends izf {
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
        gm5 gm5Var = d.a;
        a aVar = new a();
        aVar.a = t8a.b(c.a);
        gm5Var.U(aVar);
        this.b = new Messenger(new tt1(this, Looper.getMainLooper(), 18));
    }

    @Override // defpackage.izf, android.app.Service
    public final void onDestroy() {
        gm5 gm5Var = d.a;
        gm5Var.g(null);
        gm5Var.U(null);
        this.b = null;
        super.onDestroy();
    }
}
