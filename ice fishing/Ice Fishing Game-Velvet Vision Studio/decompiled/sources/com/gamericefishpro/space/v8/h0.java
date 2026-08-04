package com.gamericefishpro.space.v8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements ServiceConnection {
    public final int d;
    public final /* synthetic */ f e;

    public h0(f fVar, int i) {
        this.e = fVar;
        this.d = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        f fVar = this.e;
        if (iBinder == null) {
            synchronized (fVar.E) {
                i = fVar.L;
            }
            if (i == 3) {
                fVar.S = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            f0 f0Var = fVar.D;
            f0Var.sendMessage(f0Var.obtainMessage(i2, fVar.U.get(), 16));
            return;
        }
        synchronized (fVar.F) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar.G = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof y)) ? new y(iBinder) : (y) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = this.e;
        int i3 = this.d;
        fVar2.getClass();
        j0 j0Var = new j0(fVar2, 0, null);
        f0 f0Var2 = fVar2.D;
        f0Var2.sendMessage(f0Var2.obtainMessage(7, i3, -1, j0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f fVar = this.e;
        synchronized (fVar.F) {
            fVar.G = null;
        }
        f fVar2 = this.e;
        int i = this.d;
        f0 f0Var = fVar2.D;
        f0Var.sendMessage(f0Var.obtainMessage(6, i, 1));
    }
}
