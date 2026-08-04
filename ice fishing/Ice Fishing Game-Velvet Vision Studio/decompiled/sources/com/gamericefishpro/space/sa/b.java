package com.gamericefishpro.space.sa;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object i;

    public /* synthetic */ b(int i, Object obj) {
        this.e = i;
        this.i = obj;
    }

    @Override // com.gamericefishpro.space.sa.p
    public final void b() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d dVar = ((c) this.i).d;
                dVar.b.a("unlinkToDeath", new Object[0]);
                ((l) dVar.n).d.unlinkToDeath(dVar.k, 0);
                dVar.n = null;
                dVar.g = false;
                return;
            default:
                synchronized (((d) this.i).f) {
                    try {
                        if (((d) this.i).l.get() > 0 && ((d) this.i).l.decrementAndGet() > 0) {
                            ((d) this.i).b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        d dVar2 = (d) this.i;
                        if (dVar2.n != null) {
                            dVar2.b.a("Unbind from service.", new Object[0]);
                            d dVar3 = (d) this.i;
                            dVar3.a.unbindService(dVar3.m);
                            d dVar4 = (d) this.i;
                            dVar4.g = false;
                            dVar4.n = null;
                            dVar4.m = null;
                        }
                        ((d) this.i).c();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
