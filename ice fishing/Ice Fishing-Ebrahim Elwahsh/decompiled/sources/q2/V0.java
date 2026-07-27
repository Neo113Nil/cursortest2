package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import k2.C4638i;

/* loaded from: classes.dex */
public final class V0 extends AbstractBinderC3186f8 implements InterfaceC4911r0 {

    /* renamed from: n, reason: collision with root package name */
    public final k2.p f39985n;

    public V0(k2.p pVar) {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        this.f39985n = pVar;
    }

    public static InterfaceC4911r0 G3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof InterfaceC4911r0 ? (InterfaceC4911r0) queryLocalInterface : new C4910q0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            h1 h1Var = (h1) AbstractC3241g8.b(parcel, h1.CREATOR);
            AbstractC3241g8.f(parcel);
            v1(h1Var);
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            return false;
        }
        boolean f6 = f();
        parcel2.writeNoException();
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        parcel2.writeInt(f6 ? 1 : 0);
        return true;
    }

    @Override // q2.InterfaceC4911r0
    public final boolean f() {
        return this.f39985n == null;
    }

    @Override // q2.InterfaceC4911r0
    public final void v1(h1 h1Var) {
        k2.p pVar = this.f39985n;
        if (pVar != null) {
            pVar.onPaidEvent(new C4638i(h1Var.f40069u, h1Var.f40071w, h1Var.f40070v));
        }
    }
}
