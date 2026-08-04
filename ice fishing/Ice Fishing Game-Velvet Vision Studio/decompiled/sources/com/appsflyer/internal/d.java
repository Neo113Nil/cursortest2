package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.d5;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    public /* synthetic */ d(com.gamericefishpro.space.h8.b bVar, com.gamericefishpro.space.c8.j jVar, com.gamericefishpro.space.bb.s sVar, com.gamericefishpro.space.c8.i iVar) {
        this.d = 3;
        this.e = bVar;
        this.i = jVar;
        this.v = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((AFa1ySDK) this.e).e_((Context) this.i, (Intent) this.v);
                return;
            case 1:
                AFd1wSDK.getCurrencyIso4217Code((AFd1wSDK) this.e, (Throwable) this.i, (String) this.v);
                return;
            case 2:
                ((AFj1sSDK) this.e).getMediationNetwork((AFi1aSDK) this.i, (Runnable) this.v);
                return;
            case 3:
                com.gamericefishpro.space.h8.b bVar = (com.gamericefishpro.space.h8.b) this.e;
                com.gamericefishpro.space.c8.j jVar = (com.gamericefishpro.space.c8.j) this.i;
                String str = jVar.a;
                com.gamericefishpro.space.c8.i iVar = (com.gamericefishpro.space.c8.i) this.v;
                bVar.getClass();
                Logger logger = com.gamericefishpro.space.h8.b.f;
                try {
                    com.gamericefishpro.space.d8.e eVarA = bVar.c.a(str);
                    if (eVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((com.gamericefishpro.space.j8.i) bVar.e).o(new com.gamericefishpro.space.h8.a(bVar, jVar, ((com.gamericefishpro.space.a8.e) eVarA).a(iVar), 0));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 4:
                PermissionsActivity.onRequestPermissionsResult$lambda$0((PermissionsActivity) this.e, (String[]) this.i, (int[]) this.v);
                return;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.mc.a.decorViewReady$lambda$1((com.gamericefishpro.space.mc.a) this.e, (Runnable) this.i, (com.gamericefishpro.space.mc.a) this.v);
                return;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.b9.b bVar2 = (com.gamericefishpro.space.b9.b) this.e;
                d5 d5Var = (d5) this.i;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.v;
                try {
                    com.gamericefishpro.space.s4.r rVarP = com.gamericefishpro.space.i.a.p(bVar2.a);
                    if (rVarP == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    com.gamericefishpro.space.s4.q qVar = (com.gamericefishpro.space.s4.q) ((com.gamericefishpro.space.s4.j) rVarP.b);
                    synchronized (qVar.d) {
                        qVar.f = threadPoolExecutor;
                        break;
                    }
                    ((com.gamericefishpro.space.s4.j) rVarP.b).b(new com.gamericefishpro.space.s4.m(d5Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    d5Var.O(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                com.gamericefishpro.space.tb.g gVar = (com.gamericefishpro.space.tb.g) this.e;
                Intent intent = (Intent) this.v;
                com.gamericefishpro.space.r9.h hVar = (com.gamericefishpro.space.r9.h) this.i;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    hVar.a(null);
                }
        }
    }

    public /* synthetic */ d(com.gamericefishpro.space.tb.g gVar, Intent intent, com.gamericefishpro.space.r9.h hVar) {
        this.d = 7;
        this.e = gVar;
        this.v = intent;
        this.i = hVar;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
    }
}
