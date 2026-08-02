package N2;

import S0.s;
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
public final /* synthetic */ class k implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1935n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f1936u;

    public /* synthetic */ k(l lVar, int i) {
        this.f1935n = i;
        this.f1936u = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1935n) {
            case 0:
                break;
            case 1:
                l lVar = this.f1936u;
                synchronized (lVar) {
                    if (lVar.f1937n == 1) {
                        lVar.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.f1936u.a("Service disconnected");
                return;
        }
        while (true) {
            l lVar2 = this.f1936u;
            synchronized (lVar2) {
                try {
                    if (lVar2.f1937n != 2) {
                        return;
                    }
                    if (lVar2.f1940w.isEmpty()) {
                        lVar2.c();
                        return;
                    }
                    m mVar = (m) lVar2.f1940w.poll();
                    lVar2.f1941x.put(mVar.f1943a, mVar);
                    ((ScheduledExecutorService) lVar2.f1942y.f1951c).schedule(new LD(14, lVar2, mVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(mVar)));
                    }
                    o oVar = lVar2.f1942y;
                    Messenger messenger = lVar2.f1938u;
                    int i = mVar.f1945c;
                    Context context = (Context) oVar.f1950b;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = mVar.f1943a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", mVar.a());
                    bundle.putString(b.a.f6857A, context.getPackageName());
                    bundle.putBundle("data", mVar.f1946d);
                    obtain.setData(bundle);
                    try {
                        s sVar = lVar2.f1939v;
                        Messenger messenger2 = (Messenger) sVar.f2969u;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            g gVar = (g) sVar.f2970v;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.f1925n;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e9) {
                        lVar2.a(e9.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
