package com.gamericefishpro.space.sa;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ServiceConnection {
    public final /* synthetic */ d d;

    public /* synthetic */ c(d dVar) {
        this.d = dVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d dVar = this.d;
        dVar.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        dVar.a().post(new a(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.d;
        dVar.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        dVar.a().post(new b(0, this));
    }
}
