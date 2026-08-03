package l6;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4182g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f4183h;

    public /* synthetic */ h(j jVar, int i10) {
        this.f4182g = i10;
        this.f4183h = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4182g) {
            case 0:
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                j jVar = this.f4183h;
                synchronized (jVar) {
                    if (jVar.f4186a == 1) {
                        jVar.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.f4183h.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar2 = this.f4183h;
            synchronized (jVar2) {
                try {
                    if (jVar2.f4186a != 2) {
                        return;
                    }
                    if (jVar2.f4189d.isEmpty()) {
                        jVar2.c();
                        return;
                    }
                    k kVar = (k) jVar2.f4189d.poll();
                    jVar2.f4190e.put(kVar.f4192a, kVar);
                    ((ScheduledExecutorService) jVar2.f4191f.f4200c).schedule(new dd.i(11, jVar2, kVar, false), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                    }
                    l lVar = jVar2.f4191f;
                    Messenger messenger = jVar2.f4187b;
                    int i10 = kVar.f4194c;
                    Context context = (Context) lVar.f4199b;
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = kVar.f4192a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", kVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", kVar.f4195d);
                    obtain.setData(bundle);
                    try {
                        x4.c cVar = jVar2.f4188c;
                        Messenger messenger2 = (Messenger) cVar.f8290g;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            f fVar = (f) cVar.f8291h;
                            if (fVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = fVar.f4177g;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e10) {
                        jVar2.a(e10.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
