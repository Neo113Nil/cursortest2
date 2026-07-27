package O2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class C extends u {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f2351g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0369f f2352h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(AbstractC0369f abstractC0369f, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC0369f, i, bundle);
        Objects.requireNonNull(abstractC0369f);
        this.f2352h = abstractC0369f;
        this.f2351g = iBinder;
    }

    @Override // O2.u
    public final boolean a() {
        IBinder iBinder = this.f2351g;
        try {
            w.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0369f abstractC0369f = this.f2352h;
            if (!abstractC0369f.v().equals(interfaceDescriptor)) {
                String v6 = abstractC0369f.v();
                Log.w("GmsClient", com.anythink.basead.b.c.i.q(new StringBuilder(v6.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", v6, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface p6 = abstractC0369f.p(iBinder);
            if (p6 == null || !(abstractC0369f.y(2, 4, p6) || abstractC0369f.y(3, 4, p6))) {
                return false;
            }
            abstractC0369f.f2398R = null;
            InterfaceC0365b interfaceC0365b = abstractC0369f.f2393M;
            if (interfaceC0365b == null) {
                return true;
            }
            interfaceC0365b.j();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // O2.u
    public final void b(L2.b bVar) {
        AbstractC0369f abstractC0369f = this.f2352h;
        InterfaceC0366c interfaceC0366c = abstractC0369f.f2394N;
        if (interfaceC0366c != null) {
            interfaceC0366c.onConnectionFailed(bVar);
        }
        abstractC0369f.f2405w = bVar.f1712u;
        abstractC0369f.f2406x = System.currentTimeMillis();
    }
}
