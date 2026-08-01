package p;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import b.InterfaceC0507a;
import com.google.android.gms.internal.ads.RunnableC3191fP;

/* renamed from: p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4815e extends Binder implements InterfaceC0507a {

    /* renamed from: n, reason: collision with root package name */
    public final Handler f39687n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC4811a f39688u;

    public BinderC4815e(AbstractC4811a abstractC4811a) {
        this.f39688u = abstractC4811a;
        attachInterface(this, InterfaceC0507a.f5403i0);
        this.f39687n = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i6) {
        String str = InterfaceC0507a.f5403i0;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f39687n;
        AbstractC4811a abstractC4811a = this.f39688u;
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) V2.a.a(parcel, Bundle.CREATOR);
                if (abstractC4811a != null) {
                    handler.post(new M0.i(this, readInt, bundle, 3));
                    return true;
                }
                return true;
            case 3:
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) V2.a.a(parcel, Bundle.CREATOR);
                if (abstractC4811a != null) {
                    handler.post(new RunnableC4813c(this, readString, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) V2.a.a(parcel, Bundle.CREATOR);
                if (abstractC4811a != null) {
                    handler.post(new RunnableC3191fP(this, bundle3, 17, false));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String readString2 = parcel.readString();
                Bundle bundle4 = (Bundle) V2.a.a(parcel, Bundle.CREATOR);
                if (abstractC4811a != null) {
                    handler.post(new RunnableC4813c(this, readString2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int readInt2 = parcel.readInt();
                Uri uri = (Uri) V2.a.a(parcel, Uri.CREATOR);
                boolean z3 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) V2.a.a(parcel, Bundle.CREATOR);
                if (abstractC4811a != null) {
                    handler.post(new RunnableC4814d(this, readInt2, uri, z3, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle b9 = abstractC4811a == null ? null : abstractC4811a.b(parcel.readString(), (Bundle) V2.a.a(parcel, Bundle.CREATOR));
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
                Bundle bundle6 = (Bundle) V2.a.a(parcel, Bundle.CREATOR);
                if (abstractC4811a != null) {
                    handler.post(new R0.b(this, readInt3, readInt4, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) V2.a.a(parcel, Bundle.CREATOR);
                if (abstractC4811a != null) {
                    handler.post(new RunnableC4812b(this, bundle7, 1));
                    return true;
                }
                return true;
            case 10:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Bundle bundle8 = (Bundle) V2.a.a(parcel, Bundle.CREATOR);
                if (abstractC4811a != null) {
                    handler.post(new RunnableC4812b(this, readInt5, readInt6, readInt7, readInt8, readInt9, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) V2.a.a(parcel, Bundle.CREATOR);
                if (abstractC4811a != null) {
                    handler.post(new RunnableC4812b(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) V2.a.a(parcel, Bundle.CREATOR);
                if (abstractC4811a != null) {
                    handler.post(new RunnableC4812b(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i6);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
