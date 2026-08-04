package com.gamericefishpro.space.tb;

import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements com.gamericefishpro.space.r9.a, com.gamericefishpro.space.kb.a, com.gamericefishpro.space.bb.e, com.gamericefishpro.space.w.s {
    public final /* synthetic */ int d;

    public /* synthetic */ j(int i) {
        this.d = i;
    }

    @Override // com.gamericefishpro.space.bb.e
    public Object a(com.gamericefishpro.space.b1.d dVar) {
        Set setH = dVar.h(com.gamericefishpro.space.bb.v.a(com.gamericefishpro.space.vb.a.class));
        com.gamericefishpro.space.vb.c cVar = com.gamericefishpro.space.vb.c.i;
        if (cVar == null) {
            synchronized (com.gamericefishpro.space.vb.c.class) {
                try {
                    cVar = com.gamericefishpro.space.vb.c.i;
                    if (cVar == null) {
                        cVar = new com.gamericefishpro.space.vb.c(0);
                        com.gamericefishpro.space.vb.c.i = cVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new com.gamericefishpro.space.vb.b(setH, cVar);
    }

    @Override // com.gamericefishpro.space.r9.a
    public Object e(Task task) throws IOException {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return -1;
            default:
                Bundle bundle = (Bundle) task.h();
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public /* synthetic */ j(com.gamericefishpro.space.c8.h hVar) {
        this.d = 2;
    }

    @Override // com.gamericefishpro.space.w.s
    public float b(float f) {
        return f;
    }
}
