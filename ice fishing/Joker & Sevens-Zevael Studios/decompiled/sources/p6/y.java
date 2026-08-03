package p6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y extends r {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f5651g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f5652h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.google.android.gms.common.internal.a aVar, int i10, IBinder iBinder, Bundle bundle) {
        super(aVar, i10, bundle);
        this.f5652h = aVar;
        this.f5651g = iBinder;
    }

    @Override // p6.r
    public final void a(m6.b bVar) {
        com.google.android.gms.common.internal.a aVar = this.f5652h;
        m7.g gVar = aVar.f1444t;
        if (gVar != null) {
            ((n6.g) gVar.f4957h).onConnectionFailed(bVar);
        }
        aVar.f1428d = bVar.f4903h;
        aVar.f1429e = System.currentTimeMillis();
    }

    @Override // p6.r
    public final boolean b() {
        IBinder iBinder = this.f5651g;
        try {
            u.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f5652h;
            if (!aVar.s().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.s() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface o7 = aVar.o(iBinder);
            if (o7 == null || !(com.google.android.gms.common.internal.a.v(aVar, 2, 4, o7) || com.google.android.gms.common.internal.a.v(aVar, 3, 4, o7))) {
                return false;
            }
            aVar.f1448x = null;
            m7.g gVar = aVar.f1443s;
            if (gVar == null) {
                return true;
            }
            ((n6.f) gVar.f4957h).onConnected(null);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
