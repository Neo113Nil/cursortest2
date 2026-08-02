package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class mex implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wix b;

    public /* synthetic */ mex(wix wixVar, int i) {
        this.a = i;
        this.b = wixVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                wix wixVar = this.b;
                synchronized (wixVar) {
                    if (wixVar.a == 1) {
                        wixVar.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.b.a("Service disconnected");
                return;
        }
        while (true) {
            wix wixVar2 = this.b;
            synchronized (wixVar2) {
                try {
                    if (wixVar2.a != 2) {
                        return;
                    }
                    if (wixVar2.d.isEmpty()) {
                        wixVar2.c();
                        return;
                    }
                    lkx lkxVar = (lkx) wixVar2.d.poll();
                    wixVar2.e.put(lkxVar.a, lkxVar);
                    ((ScheduledExecutorService) wixVar2.f.c).schedule(new rxw(wixVar2, lkxVar, false, 16), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(lkxVar)));
                    }
                    anx anxVar = wixVar2.f;
                    Messenger messenger = wixVar2.b;
                    int i = lkxVar.c;
                    Context context = (Context) anxVar.b;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = lkxVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", lkxVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", lkxVar.d);
                    obtain.setData(bundle);
                    try {
                        apo apoVar = wixVar2.c;
                        Messenger messenger2 = (Messenger) apoVar.b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            g7x g7xVar = (g7x) apoVar.c;
                            if (g7xVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = g7xVar.a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e) {
                        wixVar2.a(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
