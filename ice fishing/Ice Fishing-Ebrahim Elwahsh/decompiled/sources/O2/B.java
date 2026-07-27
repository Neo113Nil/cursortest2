package O2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class B implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final int f2349n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC0369f f2350u;

    public B(AbstractC0369f abstractC0369f, int i) {
        Objects.requireNonNull(abstractC0369f);
        this.f2350u = abstractC0369f;
        this.f2349n = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i4;
        AbstractC0369f abstractC0369f = this.f2350u;
        if (iBinder == null) {
            synchronized (abstractC0369f.f2386E) {
                i = abstractC0369f.f2392L;
            }
            if (i == 3) {
                abstractC0369f.f2399S = true;
                i4 = 5;
            } else {
                i4 = 4;
            }
            z zVar = abstractC0369f.f2385D;
            zVar.sendMessage(zVar.obtainMessage(i4, abstractC0369f.f2401U.get(), 16));
            return;
        }
        synchronized (abstractC0369f.f2387F) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0369f.f2388G = (queryLocalInterface == null || !(queryLocalInterface instanceof v)) ? new v(iBinder) : (v) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0369f abstractC0369f2 = this.f2350u;
        int i9 = this.f2349n;
        abstractC0369f2.getClass();
        D d2 = new D(abstractC0369f2, 0, null);
        z zVar2 = abstractC0369f2.f2385D;
        zVar2.sendMessage(zVar2.obtainMessage(7, i9, -1, d2));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0369f abstractC0369f = this.f2350u;
        synchronized (abstractC0369f.f2387F) {
            abstractC0369f.f2388G = null;
        }
        AbstractC0369f abstractC0369f2 = this.f2350u;
        int i = this.f2349n;
        z zVar = abstractC0369f2.f2385D;
        zVar.sendMessage(zVar.obtainMessage(6, i, 1));
    }
}
