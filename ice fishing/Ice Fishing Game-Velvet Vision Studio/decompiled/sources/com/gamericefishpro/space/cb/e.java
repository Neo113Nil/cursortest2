package com.gamericefishpro.space.cb;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ g e;
    public final /* synthetic */ Runnable i;
    public final /* synthetic */ com.gamericefishpro.space.vb.c v;

    public /* synthetic */ e(g gVar, Runnable runnable, com.gamericefishpro.space.vb.c cVar, int i) {
        this.d = i;
        this.e = gVar;
        this.i = runnable;
        this.v = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ExecutorService executorService = this.e.d;
                final int i = 0;
                final Runnable runnable = this.i;
                final com.gamericefishpro.space.vb.c cVar = this.v;
                executorService.execute(new Runnable() { // from class: com.gamericefishpro.space.cb.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) cVar.e).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((i) cVar.e).k(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) cVar.e;
                                try {
                                    runnable2.run();
                                    iVar.j(null);
                                    return;
                                } catch (Exception e3) {
                                    iVar.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.e.d;
                final int i2 = 2;
                final Runnable runnable2 = this.i;
                final com.gamericefishpro.space.vb.c cVar2 = this.v;
                executorService2.execute(new Runnable() { // from class: com.gamericefishpro.space.cb.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) cVar2.e).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((i) cVar2.e).k(e2);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                i iVar = (i) cVar2.e;
                                try {
                                    runnable3.run();
                                    iVar.j(null);
                                    return;
                                } catch (Exception e3) {
                                    iVar.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.e.d;
                final int i3 = 1;
                final Runnable runnable3 = this.i;
                final com.gamericefishpro.space.vb.c cVar3 = this.v;
                executorService3.execute(new Runnable() { // from class: com.gamericefishpro.space.cb.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) cVar3.e).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((i) cVar3.e).k(e2);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                i iVar = (i) cVar3.e;
                                try {
                                    runnable4.run();
                                    iVar.j(null);
                                    return;
                                } catch (Exception e3) {
                                    iVar.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
