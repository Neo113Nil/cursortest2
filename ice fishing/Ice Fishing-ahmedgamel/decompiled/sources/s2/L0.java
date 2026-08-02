package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;

/* loaded from: classes.dex */
public final class L0 extends AbstractBinderC3359i8 implements InterfaceC4942l0 {

    /* renamed from: n, reason: collision with root package name */
    public final String f40362n;

    /* renamed from: u, reason: collision with root package name */
    public final String f40363u;

    public L0(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f40362n = str;
        this.f40363u = str2;
    }

    public static InterfaceC4942l0 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof InterfaceC4942l0 ? (InterfaceC4942l0) queryLocalInterface : new C4940k0(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f40362n);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.f40363u);
        return true;
    }

    @Override // s2.InterfaceC4942l0
    public final String d() {
        return this.f40362n;
    }

    @Override // s2.InterfaceC4942l0
    public final String e() {
        return this.f40363u;
    }
}
