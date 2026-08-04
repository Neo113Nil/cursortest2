package com.appsflyer.internal;

import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i2.f0;
import com.gamericefishpro.space.t.d0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int d;

    public /* synthetic */ s(int i) {
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFj1sSDK.AFAdRevenueData();
                return;
            case 1:
                d0 d0Var = com.gamericefishpro.space.i2.t.f1;
                synchronized (d0Var) {
                    try {
                        int i = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = d0Var.a;
                            int i2 = d0Var.b;
                            while (i < i2) {
                                com.gamericefishpro.space.i2.t tVar = (com.gamericefishpro.space.i2.t) objArr[i];
                                boolean showLayoutBounds = tVar.getShowLayoutBounds();
                                Class cls = com.gamericefishpro.space.i2.t.c1;
                                tVar.setShowLayoutBounds(f0.j());
                                if (showLayoutBounds != tVar.getShowLayoutBounds()) {
                                    com.gamericefishpro.space.i2.t.o(tVar.getRoot());
                                }
                                i++;
                            }
                        } else {
                            Object[] objArr2 = d0Var.a;
                            int i3 = d0Var.b;
                            while (i < i3) {
                                com.gamericefishpro.space.i2.t.o(((com.gamericefishpro.space.i2.t) objArr2[i]).getRoot());
                                i++;
                            }
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                int i4 = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
        }
    }
}
