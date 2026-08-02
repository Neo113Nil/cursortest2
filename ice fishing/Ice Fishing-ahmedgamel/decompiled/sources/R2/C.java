package R2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class C extends u {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f2744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0380f f2745h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(AbstractC0380f abstractC0380f, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC0380f, i, bundle);
        Objects.requireNonNull(abstractC0380f);
        this.f2745h = abstractC0380f;
        this.f2744g = iBinder;
    }

    @Override // R2.u
    public final boolean a() {
        IBinder iBinder = this.f2744g;
        try {
            w.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0380f abstractC0380f = this.f2745h;
            if (!abstractC0380f.v().equals(interfaceDescriptor)) {
                String v9 = abstractC0380f.v();
                Log.w("GmsClient", com.IceFishing.LiveIceFishing.k.r(new StringBuilder(v9.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", v9, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface p9 = abstractC0380f.p(iBinder);
            if (p9 == null || !(abstractC0380f.y(2, 4, p9) || abstractC0380f.y(3, 4, p9))) {
                return false;
            }
            abstractC0380f.f2791R = null;
            InterfaceC0376b interfaceC0376b = abstractC0380f.f2786M;
            if (interfaceC0376b == null) {
                return true;
            }
            interfaceC0376b.z();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // R2.u
    public final void b(O2.b bVar) {
        AbstractC0380f abstractC0380f = this.f2745h;
        InterfaceC0377c interfaceC0377c = abstractC0380f.f2787N;
        if (interfaceC0377c != null) {
            interfaceC0377c.onConnectionFailed(bVar);
        }
        abstractC0380f.f2798w = bVar.f2256u;
        abstractC0380f.f2799x = System.currentTimeMillis();
    }
}
