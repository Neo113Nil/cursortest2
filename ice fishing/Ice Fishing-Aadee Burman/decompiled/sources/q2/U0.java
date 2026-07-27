package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* loaded from: classes.dex */
public final class U0 extends AbstractBinderC3336i8 implements InterfaceC4904r0 {

    /* renamed from: n, reason: collision with root package name */
    public final k2.p f40073n;

    public U0(k2.p pVar) {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        this.f40073n = pVar;
    }

    public static InterfaceC4904r0 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof InterfaceC4904r0 ? (InterfaceC4904r0) queryLocalInterface : new C4903q0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            g1 g1Var = (g1) AbstractC3388j8.b(parcel, g1.CREATOR);
            AbstractC3388j8.f(parcel);
            p1(g1Var);
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            return false;
        }
        boolean e9 = e();
        parcel2.writeNoException();
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        parcel2.writeInt(e9 ? 1 : 0);
        return true;
    }

    @Override // q2.InterfaceC4904r0
    public final boolean e() {
        return this.f40073n == null;
    }

    @Override // q2.InterfaceC4904r0
    public final void p1(g1 g1Var) {
        k2.p pVar = this.f40073n;
        if (pVar != null) {
            pVar.onPaidEvent(new k2.i(g1Var.f40152u, g1Var.f40154w, g1Var.f40153v));
        }
    }
}
