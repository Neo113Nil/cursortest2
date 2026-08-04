package com.gamericefishpro.space.z4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x extends Service implements u {
    public final com.gamericefishpro.space.r5.b d = new com.gamericefishpro.space.r5.b(this);

    @Override // com.gamericefishpro.space.z4.u
    public final w g() {
        return (w) this.d.e;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        com.gamericefishpro.space.r5.b bVar = this.d;
        bVar.getClass();
        bVar.n(o.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.gamericefishpro.space.r5.b bVar = this.d;
        bVar.getClass();
        bVar.n(o.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.gamericefishpro.space.r5.b bVar = this.d;
        bVar.getClass();
        bVar.n(o.ON_STOP);
        bVar.n(o.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        com.gamericefishpro.space.r5.b bVar = this.d;
        bVar.getClass();
        bVar.n(o.ON_START);
        super.onStart(intent, i);
    }
}
