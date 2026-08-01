package P2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class C extends u {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f2423g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0376f f2424h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(AbstractC0376f abstractC0376f, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC0376f, i, bundle);
        Objects.requireNonNull(abstractC0376f);
        this.f2424h = abstractC0376f;
        this.f2423g = iBinder;
    }

    @Override // P2.u
    public final boolean a() {
        IBinder iBinder = this.f2423g;
        try {
            w.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0376f abstractC0376f = this.f2424h;
            if (!abstractC0376f.v().equals(interfaceDescriptor)) {
                String v9 = abstractC0376f.v();
                Log.w("GmsClient", com.anythink.basead.exoplayer.f.f.o(new StringBuilder(v9.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", v9, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface p9 = abstractC0376f.p(iBinder);
            if (p9 == null || !(abstractC0376f.y(2, 4, p9) || abstractC0376f.y(3, 4, p9))) {
                return false;
            }
            abstractC0376f.f2470R = null;
            InterfaceC0372b interfaceC0372b = abstractC0376f.f2465M;
            if (interfaceC0372b == null) {
                return true;
            }
            interfaceC0372b.r();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // P2.u
    public final void b(M2.b bVar) {
        AbstractC0376f abstractC0376f = this.f2424h;
        InterfaceC0373c interfaceC0373c = abstractC0376f.f2466N;
        if (interfaceC0373c != null) {
            interfaceC0373c.onConnectionFailed(bVar);
        }
        abstractC0376f.f2477w = bVar.f1830u;
        abstractC0376f.f2478x = System.currentTimeMillis();
    }
}
