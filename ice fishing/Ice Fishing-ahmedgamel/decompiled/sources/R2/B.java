package R2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class B implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final int f2742n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC0380f f2743u;

    public B(AbstractC0380f abstractC0380f, int i) {
        Objects.requireNonNull(abstractC0380f);
        this.f2743u = abstractC0380f;
        this.f2742n = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i4;
        AbstractC0380f abstractC0380f = this.f2743u;
        if (iBinder == null) {
            synchronized (abstractC0380f.f2779E) {
                i = abstractC0380f.f2785L;
            }
            if (i == 3) {
                abstractC0380f.f2792S = true;
                i4 = 5;
            } else {
                i4 = 4;
            }
            z zVar = abstractC0380f.f2778D;
            zVar.sendMessage(zVar.obtainMessage(i4, abstractC0380f.f2794U.get(), 16));
            return;
        }
        synchronized (abstractC0380f.f2780F) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0380f.f2781G = (queryLocalInterface == null || !(queryLocalInterface instanceof v)) ? new v(iBinder) : (v) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0380f abstractC0380f2 = this.f2743u;
        int i6 = this.f2742n;
        abstractC0380f2.getClass();
        D d9 = new D(abstractC0380f2, 0, null);
        z zVar2 = abstractC0380f2.f2778D;
        zVar2.sendMessage(zVar2.obtainMessage(7, i6, -1, d9));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0380f abstractC0380f = this.f2743u;
        synchronized (abstractC0380f.f2780F) {
            abstractC0380f.f2781G = null;
        }
        AbstractC0380f abstractC0380f2 = this.f2743u;
        int i = this.f2742n;
        z zVar = abstractC0380f2.f2778D;
        zVar.sendMessage(zVar.obtainMessage(6, i, 1));
    }
}
