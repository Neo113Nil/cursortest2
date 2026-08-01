package L2;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.anythink.basead.c.b;
import com.google.android.gms.internal.ads.LD;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1645n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f1646u;

    public /* synthetic */ j(k kVar, int i) {
        this.f1645n = i;
        this.f1646u = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1645n) {
            case 0:
                break;
            case 1:
                k kVar = this.f1646u;
                synchronized (kVar) {
                    if (kVar.f1647n == 1) {
                        kVar.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.f1646u.a("Service disconnected");
                return;
        }
        while (true) {
            k kVar2 = this.f1646u;
            synchronized (kVar2) {
                try {
                    if (kVar2.f1647n != 2) {
                        return;
                    }
                    if (kVar2.f1650w.isEmpty()) {
                        kVar2.c();
                        return;
                    }
                    l lVar = (l) kVar2.f1650w.poll();
                    kVar2.f1651x.put(lVar.f1653a, lVar);
                    ((ScheduledExecutorService) kVar2.f1652y.f1661c).schedule(new LD(14, kVar2, lVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(lVar)));
                    }
                    n nVar = kVar2.f1652y;
                    Messenger messenger = kVar2.f1648u;
                    int i = lVar.f1655c;
                    Context context = (Context) nVar.f1660b;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = lVar.f1653a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", lVar.a());
                    bundle.putString(b.a.f6071A, context.getPackageName());
                    bundle.putBundle("data", lVar.f1656d);
                    obtain.setData(bundle);
                    try {
                        S0.l lVar2 = kVar2.f1649v;
                        Messenger messenger2 = (Messenger) lVar2.f2797u;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            g gVar = (g) lVar2.f2798v;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.f1636n;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e9) {
                        kVar2.a(e9.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
