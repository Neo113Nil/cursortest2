package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;

/* loaded from: classes.dex */
public final class L0 extends AbstractBinderC3336i8 implements InterfaceC4893l0 {

    /* renamed from: n, reason: collision with root package name */
    public final String f40063n;

    /* renamed from: u, reason: collision with root package name */
    public final String f40064u;

    public L0(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f40063n = str;
        this.f40064u = str2;
    }

    public static InterfaceC4893l0 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof InterfaceC4893l0 ? (InterfaceC4893l0) queryLocalInterface : new C4891k0(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f40063n);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.f40064u);
        return true;
    }

    @Override // q2.InterfaceC4893l0
    public final String d() {
        return this.f40063n;
    }

    @Override // q2.InterfaceC4893l0
    public final String e() {
        return this.f40064u;
    }
}
