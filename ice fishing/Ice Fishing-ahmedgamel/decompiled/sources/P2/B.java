package P2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class B implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final int f2421n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC0376f f2422u;

    public B(AbstractC0376f abstractC0376f, int i) {
        Objects.requireNonNull(abstractC0376f);
        this.f2422u = abstractC0376f;
        this.f2421n = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i6;
        AbstractC0376f abstractC0376f = this.f2422u;
        if (iBinder == null) {
            synchronized (abstractC0376f.f2458E) {
                i = abstractC0376f.f2464L;
            }
            if (i == 3) {
                abstractC0376f.f2471S = true;
                i6 = 5;
            } else {
                i6 = 4;
            }
            z zVar = abstractC0376f.f2457D;
            zVar.sendMessage(zVar.obtainMessage(i6, abstractC0376f.f2473U.get(), 16));
            return;
        }
        synchronized (abstractC0376f.f2459F) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0376f.f2460G = (queryLocalInterface == null || !(queryLocalInterface instanceof v)) ? new v(iBinder) : (v) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0376f abstractC0376f2 = this.f2422u;
        int i9 = this.f2421n;
        abstractC0376f2.getClass();
        D d2 = new D(abstractC0376f2, 0, null);
        z zVar2 = abstractC0376f2.f2457D;
        zVar2.sendMessage(zVar2.obtainMessage(7, i9, -1, d2));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0376f abstractC0376f = this.f2422u;
        synchronized (abstractC0376f.f2459F) {
            abstractC0376f.f2460G = null;
        }
        AbstractC0376f abstractC0376f2 = this.f2422u;
        int i = this.f2421n;
        z zVar = abstractC0376f2.f2457D;
        zVar.sendMessage(zVar.obtainMessage(6, i, 1));
    }
}
