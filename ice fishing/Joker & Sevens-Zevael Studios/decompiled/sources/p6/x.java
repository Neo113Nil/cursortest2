package p6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f5649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f5650b;

    public x(com.google.android.gms.common.internal.a aVar, int i10) {
        this.f5650b = aVar;
        this.f5649a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i10;
        int i11;
        com.google.android.gms.common.internal.a aVar = this.f5650b;
        if (iBinder == null) {
            synchronized (aVar.f1435k) {
                i10 = aVar.f1442r;
            }
            if (i10 == 3) {
                aVar.f1449y = true;
                i11 = 5;
            } else {
                i11 = 4;
            }
            v vVar = aVar.f1434j;
            vVar.sendMessage(vVar.obtainMessage(i11, aVar.A.get(), 16));
            return;
        }
        synchronized (aVar.f1436l) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f5650b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f1437m = (queryLocalInterface == null || !(queryLocalInterface instanceof t)) ? new t(iBinder) : (t) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f5650b;
        int i12 = this.f5649a;
        z zVar = new z(aVar3, 0);
        v vVar2 = aVar3.f1434j;
        vVar2.sendMessage(vVar2.obtainMessage(7, i12, -1, zVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f5650b.f1436l) {
            aVar = this.f5650b;
            aVar.f1437m = null;
        }
        int i10 = this.f5649a;
        v vVar = aVar.f1434j;
        vVar.sendMessage(vVar.obtainMessage(6, i10, 1));
    }
}
