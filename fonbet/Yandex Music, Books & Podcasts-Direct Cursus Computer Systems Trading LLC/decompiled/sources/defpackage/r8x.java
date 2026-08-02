package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class r8x implements ServiceConnection {
    public final int a;
    public final /* synthetic */ a b;

    public r8x(a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        a aVar = this.b;
        if (iBinder == null) {
            synchronized (aVar.l) {
                i = aVar.s;
            }
            if (i == 3) {
                aVar.z = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            f3x f3xVar = aVar.k;
            f3xVar.sendMessage(f3xVar.obtainMessage(i2, aVar.B.get(), 16));
            return;
        }
        synchronized (aVar.m) {
            try {
                a aVar2 = this.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.n = (queryLocalInterface == null || !(queryLocalInterface instanceof m0x)) ? new m0x(iBinder) : (m0x) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        a aVar3 = this.b;
        int i3 = this.a;
        wax waxVar = new wax(aVar3, 0);
        f3x f3xVar2 = aVar3.k;
        f3xVar2.sendMessage(f3xVar2.obtainMessage(7, i3, -1, waxVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar;
        synchronized (this.b.m) {
            aVar = this.b;
            aVar.n = null;
        }
        int i = this.a;
        f3x f3xVar = aVar.k;
        f3xVar.sendMessage(f3xVar.obtainMessage(6, i, 1));
    }
}
