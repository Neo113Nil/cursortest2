package p0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: p0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025v extends AbstractC1018o {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f8414g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8415h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1025v(com.google.android.gms.common.internal.a aVar, int i2, IBinder iBinder, Bundle bundle) {
        super(aVar, i2, bundle);
        this.f8415h = aVar;
        this.f8414g = iBinder;
    }

    @Override // p0.AbstractC1018o
    public final void a(m0.b bVar) {
        C1010g c1010g = this.f8415h.f2699o;
        if (c1010g != null) {
            ((n0.h) c1010g.f8376a).b(bVar);
        }
        System.currentTimeMillis();
    }

    @Override // p0.AbstractC1018o
    public final boolean b() {
        IBinder iBinder = this.f8414g;
        try {
            AbstractC1021r.c(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f8415h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.r() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface n2 = aVar.n(iBinder);
            if (n2 == null || !(com.google.android.gms.common.internal.a.u(aVar, 2, 4, n2) || com.google.android.gms.common.internal.a.u(aVar, 3, 4, n2))) {
                return false;
            }
            aVar.f2703s = null;
            C1010g c1010g = aVar.f2698n;
            if (c1010g == null) {
                return true;
            }
            ((n0.g) c1010g.f8376a).c();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
