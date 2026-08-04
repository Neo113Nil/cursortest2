package com.gamericefishpro.space.r8;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.u6.s;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ k e;

    public /* synthetic */ j(k kVar, int i) {
        this.d = i;
        this.e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                k kVar = this.e;
                synchronized (kVar) {
                    if (kVar.d == 1) {
                        kVar.a("Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.e.a("Service disconnected");
                return;
        }
        while (true) {
            k kVar2 = this.e;
            synchronized (kVar2) {
                try {
                    if (kVar2.d != 2) {
                        return;
                    }
                    if (kVar2.v.isEmpty()) {
                        kVar2.c();
                        return;
                    }
                    l lVar = (l) kVar2.v.poll();
                    kVar2.w.put(lVar.a, lVar);
                    ((ScheduledExecutorService) kVar2.y.c).schedule(new com.gamericefishpro.space.va.a(25, kVar2, lVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(lVar));
                    }
                    m mVar = kVar2.y;
                    Messenger messenger = kVar2.e;
                    int i = lVar.c;
                    Context context = (Context) mVar.b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = lVar.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", lVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", lVar.d);
                    messageObtain.setData(bundle);
                    try {
                        s sVar = kVar2.i;
                        Messenger messenger2 = (Messenger) sVar.e;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            g gVar = (g) sVar.i;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.d;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        kVar2.a(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
