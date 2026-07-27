package K2;

import B2.RunnableC0272f;
import S0.s;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.anythink.basead.c.b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1590n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f1591u;

    public /* synthetic */ j(k kVar, int i) {
        this.f1590n = i;
        this.f1591u = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1590n) {
            case 0:
                break;
            case 1:
                k kVar = this.f1591u;
                synchronized (kVar) {
                    if (kVar.f1592n == 1) {
                        kVar.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.f1591u.a("Service disconnected");
                return;
        }
        while (true) {
            k kVar2 = this.f1591u;
            synchronized (kVar2) {
                try {
                    if (kVar2.f1592n != 2) {
                        return;
                    }
                    if (kVar2.f1595w.isEmpty()) {
                        kVar2.c();
                        return;
                    }
                    l lVar = (l) kVar2.f1595w.poll();
                    kVar2.f1596x.put(lVar.f1598a, lVar);
                    ((ScheduledExecutorService) kVar2.f1597y.f1606c).schedule(new RunnableC0272f(10, kVar2, lVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(lVar)));
                    }
                    n nVar = kVar2.f1597y;
                    Messenger messenger = kVar2.f1593u;
                    int i = lVar.f1600c;
                    Context context = (Context) nVar.f1605b;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = lVar.f1598a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", lVar.a());
                    bundle.putString(b.a.f6228A, context.getPackageName());
                    bundle.putBundle("data", lVar.f1601d);
                    obtain.setData(bundle);
                    try {
                        s sVar = kVar2.f1594v;
                        Messenger messenger2 = (Messenger) sVar.f2952u;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            g gVar = (g) sVar.f2953v;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.f1581n;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e6) {
                        kVar2.a(e6.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
