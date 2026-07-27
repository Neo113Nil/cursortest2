package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;

/* loaded from: classes.dex */
public final class L0 extends AbstractBinderC3186f8 implements InterfaceC4900l0 {

    /* renamed from: n, reason: collision with root package name */
    public final String f39970n;

    /* renamed from: u, reason: collision with root package name */
    public final String f39971u;

    public L0(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f39970n = str;
        this.f39971u = str2;
    }

    public static InterfaceC4900l0 G3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof InterfaceC4900l0 ? (InterfaceC4900l0) queryLocalInterface : new C4898k0(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f39970n);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.f39971u);
        return true;
    }

    @Override // q2.InterfaceC4900l0
    public final String c() {
        return this.f39970n;
    }

    @Override // q2.InterfaceC4900l0
    public final String f() {
        return this.f39971u;
    }
}
