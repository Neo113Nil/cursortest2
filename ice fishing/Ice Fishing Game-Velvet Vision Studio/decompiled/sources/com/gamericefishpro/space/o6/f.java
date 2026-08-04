package com.gamericefishpro.space.o6;

import android.os.Handler;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.u6.j;
import com.gamericefishpro.space.v6.s;
import com.gamericefishpro.space.v6.t;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ g e;

    public /* synthetic */ f(g gVar, int i) {
        this.d = i;
        this.e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g.a(this.e);
                return;
            default:
                g gVar = this.e;
                if (gVar.z != 0) {
                    q qVarC = q.c();
                    Objects.toString(gVar.i);
                    qVarC.getClass();
                    return;
                }
                gVar.z = 1;
                q qVarC2 = q.c();
                Objects.toString(gVar.i);
                qVarC2.getClass();
                if (!gVar.v.v.h(gVar.E, null)) {
                    gVar.b();
                    return;
                }
                t tVar = gVar.v.i;
                j jVar = gVar.i;
                synchronized (tVar.d) {
                    q qVarC3 = q.c();
                    Objects.toString(jVar);
                    qVarC3.getClass();
                    tVar.a(jVar);
                    s sVar = new s(tVar, jVar);
                    tVar.b.put(jVar, sVar);
                    tVar.c.put(jVar, gVar);
                    ((Handler) tVar.a.e).postDelayed(sVar, 600000L);
                    break;
                }
                return;
        }
    }
}
