package q2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC3732pb;

/* loaded from: classes.dex */
public final class N0 implements k2.o {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3732pb f40065a;

    /* renamed from: b, reason: collision with root package name */
    public final k2.v f40066b = new k2.v();

    public N0(InterfaceC3732pb interfaceC3732pb) {
        this.f40065a = interfaceC3732pb;
    }

    public final k2.v a() {
        k2.v vVar = this.f40066b;
        try {
            InterfaceC3732pb interfaceC3732pb = this.f40065a;
            if (interfaceC3732pb.j() != null) {
                vVar.b(interfaceC3732pb.j());
                return vVar;
            }
        } catch (RemoteException e9) {
            v2.i.d("Exception occurred while getting video controller", e9);
        }
        return vVar;
    }

    public final boolean b() {
        try {
            return this.f40065a.k();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            return false;
        }
    }
}
