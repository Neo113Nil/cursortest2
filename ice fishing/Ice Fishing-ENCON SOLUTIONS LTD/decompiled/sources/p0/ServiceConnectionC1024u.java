package p0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: p0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1024u implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f8412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8413b;

    public ServiceConnectionC1024u(com.google.android.gms.common.internal.a aVar, int i2) {
        this.f8413b = aVar;
        this.f8412a = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i2;
        int i3;
        com.google.android.gms.common.internal.a aVar = this.f8413b;
        if (iBinder == null) {
            synchronized (aVar.f2690f) {
                i2 = aVar.f2697m;
            }
            if (i2 == 3) {
                aVar.t = true;
                i3 = 5;
            } else {
                i3 = 4;
            }
            HandlerC1022s handlerC1022s = aVar.f2689e;
            handlerC1022s.sendMessage(handlerC1022s.obtainMessage(i3, aVar.f2705v.get(), 16));
            return;
        }
        synchronized (aVar.f2691g) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f8413b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f2692h = (queryLocalInterface == null || !(queryLocalInterface instanceof C1020q)) ? new C1020q(iBinder) : (C1020q) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f8413b;
        int i4 = this.f8412a;
        aVar3.getClass();
        C1026w c1026w = new C1026w(aVar3, 0);
        HandlerC1022s handlerC1022s2 = aVar3.f2689e;
        handlerC1022s2.sendMessage(handlerC1022s2.obtainMessage(7, i4, -1, c1026w));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f8413b.f2691g) {
            aVar = this.f8413b;
            aVar.f2692h = null;
        }
        int i2 = this.f8412a;
        HandlerC1022s handlerC1022s = aVar.f2689e;
        handlerC1022s.sendMessage(handlerC1022s.obtainMessage(6, i2, 1));
    }
}
