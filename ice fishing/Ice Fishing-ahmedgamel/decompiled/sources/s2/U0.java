package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC3411j8;

/* loaded from: classes.dex */
public final class U0 extends AbstractBinderC3359i8 implements InterfaceC4953r0 {

    /* renamed from: n, reason: collision with root package name */
    public final m2.p f40375n;

    public U0(m2.p pVar) {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        this.f40375n = pVar;
    }

    public static InterfaceC4953r0 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof InterfaceC4953r0 ? (InterfaceC4953r0) queryLocalInterface : new C4952q0(iBinder);
    }

    @Override // s2.InterfaceC4953r0
    public final void R3(g1 g1Var) {
        m2.p pVar = this.f40375n;
        if (pVar != null) {
            pVar.onPaidEvent(new m2.i(g1Var.f40454u, g1Var.f40456w, g1Var.f40455v));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            g1 g1Var = (g1) AbstractC3411j8.b(parcel, g1.CREATOR);
            AbstractC3411j8.f(parcel);
            R3(g1Var);
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            return false;
        }
        boolean e9 = e();
        parcel2.writeNoException();
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        parcel2.writeInt(e9 ? 1 : 0);
        return true;
    }

    @Override // s2.InterfaceC4953r0
    public final boolean e() {
        return this.f40375n == null;
    }
}
