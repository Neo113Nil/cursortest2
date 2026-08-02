package s2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC3755pb;

/* loaded from: classes.dex */
public final class N0 implements m2.o {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3755pb f40367a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.v f40368b = new m2.v();

    public N0(InterfaceC3755pb interfaceC3755pb) {
        this.f40367a = interfaceC3755pb;
    }

    public final m2.v a() {
        m2.v vVar = this.f40368b;
        try {
            InterfaceC3755pb interfaceC3755pb = this.f40367a;
            if (interfaceC3755pb.j() != null) {
                vVar.b(interfaceC3755pb.j());
                return vVar;
            }
        } catch (RemoteException e9) {
            x2.i.d("Exception occurred while getting video controller", e9);
        }
        return vVar;
    }

    public final boolean b() {
        try {
            return this.f40367a.k();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
            return false;
        }
    }
}
