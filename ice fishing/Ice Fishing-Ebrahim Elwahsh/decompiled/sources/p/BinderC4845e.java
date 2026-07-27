package p;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import b.InterfaceC0517a;
import h3.l;

/* renamed from: p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4845e extends Binder implements InterfaceC0517a {

    /* renamed from: n, reason: collision with root package name */
    public final Handler f39752n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC4841a f39753u;

    public BinderC4845e(AbstractC4841a abstractC4841a) {
        this.f39753u = abstractC4841a;
        attachInterface(this, InterfaceC0517a.f5515i0);
        this.f39752n = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i4) {
        String str = InterfaceC0517a.f5515i0;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f39752n;
        AbstractC4841a abstractC4841a = this.f39753u;
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) com.bumptech.glide.d.a(parcel, Bundle.CREATOR);
                if (abstractC4841a != null) {
                    handler.post(new M0.i(this, readInt, bundle, 4));
                    return true;
                }
                return true;
            case 3:
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) com.bumptech.glide.d.a(parcel, Bundle.CREATOR);
                if (abstractC4841a != null) {
                    handler.post(new RunnableC4843c(this, readString, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) com.bumptech.glide.d.a(parcel, Bundle.CREATOR);
                if (abstractC4841a != null) {
                    handler.post(new l(7, this, bundle3));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String readString2 = parcel.readString();
                Bundle bundle4 = (Bundle) com.bumptech.glide.d.a(parcel, Bundle.CREATOR);
                if (abstractC4841a != null) {
                    handler.post(new RunnableC4843c(this, readString2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int readInt2 = parcel.readInt();
                Uri uri = (Uri) com.bumptech.glide.d.a(parcel, Uri.CREATOR);
                boolean z8 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) com.bumptech.glide.d.a(parcel, Bundle.CREATOR);
                if (abstractC4841a != null) {
                    handler.post(new RunnableC4844d(this, readInt2, uri, z8, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle b9 = abstractC4841a == null ? null : abstractC4841a.b(parcel.readString(), (Bundle) com.bumptech.glide.d.a(parcel, Bundle.CREATOR));
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
                Bundle bundle6 = (Bundle) com.bumptech.glide.d.a(parcel, Bundle.CREATOR);
                if (abstractC4841a != null) {
                    handler.post(new R0.b(this, readInt3, readInt4, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) com.bumptech.glide.d.a(parcel, Bundle.CREATOR);
                if (abstractC4841a != null) {
                    handler.post(new RunnableC4842b(this, bundle7, 1));
                    return true;
                }
                return true;
            case 10:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Bundle bundle8 = (Bundle) com.bumptech.glide.d.a(parcel, Bundle.CREATOR);
                if (abstractC4841a != null) {
                    handler.post(new RunnableC4842b(this, readInt5, readInt6, readInt7, readInt8, readInt9, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) com.bumptech.glide.d.a(parcel, Bundle.CREATOR);
                if (abstractC4841a != null) {
                    handler.post(new RunnableC4842b(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) com.bumptech.glide.d.a(parcel, Bundle.CREATOR);
                if (abstractC4841a != null) {
                    handler.post(new RunnableC4842b(this, bundle10, 0));
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
