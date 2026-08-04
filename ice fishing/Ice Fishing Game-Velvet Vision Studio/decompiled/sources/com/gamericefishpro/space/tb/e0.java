package com.gamericefishpro.space.tb;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Binder {
    public final com.gamericefishpro.space.m.d d;

    public e0(com.gamericefishpro.space.m.d dVar) {
        this.d = dVar;
    }

    public final void a(f0 f0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        g.access$000((g) this.d.e, f0Var.a).b(new com.gamericefishpro.space.o.a(1), new com.gamericefishpro.space.a8.b(13, f0Var));
    }
}
