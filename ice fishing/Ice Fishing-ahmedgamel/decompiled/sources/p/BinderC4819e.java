package p;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import b.InterfaceC0511a;
import com.google.android.gms.internal.ads.RunnableC3214fP;

/* renamed from: p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4819e extends Binder implements InterfaceC0511a {

    /* renamed from: n, reason: collision with root package name */
    public final Handler f39795n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC4815a f39796u;

    public BinderC4819e(AbstractC4815a abstractC4815a) {
        this.f39796u = abstractC4815a;
        attachInterface(this, InterfaceC0511a.f5368d0);
        this.f39795n = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i4) {
        String str = InterfaceC0511a.f5368d0;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f39795n;
        AbstractC4815a abstractC4815a = this.f39796u;
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) Z2.d.d(parcel, Bundle.CREATOR);
                if (abstractC4815a != null) {
                    handler.post(new M0.i(this, readInt, bundle, 3));
                    return true;
                }
                return true;
            case 3:
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) Z2.d.d(parcel, Bundle.CREATOR);
                if (abstractC4815a != null) {
                    handler.post(new RunnableC4817c(this, readString, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) Z2.d.d(parcel, Bundle.CREATOR);
                if (abstractC4815a != null) {
                    handler.post(new RunnableC3214fP(this, bundle3, 16, false));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String readString2 = parcel.readString();
                Bundle bundle4 = (Bundle) Z2.d.d(parcel, Bundle.CREATOR);
                if (abstractC4815a != null) {
                    handler.post(new RunnableC4817c(this, readString2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int readInt2 = parcel.readInt();
                Uri uri = (Uri) Z2.d.d(parcel, Uri.CREATOR);
                boolean z6 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) Z2.d.d(parcel, Bundle.CREATOR);
                if (abstractC4815a != null) {
                    handler.post(new RunnableC4818d(this, readInt2, uri, z6, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle b9 = abstractC4815a == null ? null : abstractC4815a.b(parcel.readString(), (Bundle) Z2.d.d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (b9 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                b9.writeToParcel(parcel2, 1);
                return true;
            case 8:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                Bundle bundle6 = (Bundle) Z2.d.d(parcel, Bundle.CREATOR);
                if (abstractC4815a != null) {
                    handler.post(new R0.b(this, readInt3, readInt4, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) Z2.d.d(parcel, Bundle.CREATOR);
                if (abstractC4815a != null) {
                    handler.post(new RunnableC4816b(this, bundle7, 1));
                    return true;
                }
                return true;
            case 10:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Bundle bundle8 = (Bundle) Z2.d.d(parcel, Bundle.CREATOR);
                if (abstractC4815a != null) {
                    handler.post(new RunnableC4816b(this, readInt5, readInt6, readInt7, readInt8, readInt9, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) Z2.d.d(parcel, Bundle.CREATOR);
                if (abstractC4815a != null) {
                    handler.post(new RunnableC4816b(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) Z2.d.d(parcel, Bundle.CREATOR);
                if (abstractC4815a != null) {
                    handler.post(new RunnableC4816b(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i4);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
