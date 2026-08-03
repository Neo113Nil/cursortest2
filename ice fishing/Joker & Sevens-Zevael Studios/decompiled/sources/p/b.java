package p;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import com.onesignal.core.activities.PermissionsActivity;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends Binder implements b.a {

    /* renamed from: d, reason: collision with root package name */
    public final Handler f5396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m6.i f5397e;

    public b(m6.i iVar) {
        this.f5397e = iVar;
        attachInterface(this, b.a.f792a);
        this.f5396d = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = b.a.f792a;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f5396d;
        m6.i iVar = this.f5397e;
        switch (i10) {
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) v6.a.k(parcel, Bundle.CREATOR);
                if (iVar != null) {
                    handler.post(new a(this, readInt, bundle));
                    return true;
                }
                return true;
            case 3:
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) v6.a.k(parcel, Bundle.CREATOR);
                if (iVar != null) {
                    handler.post(new a(this, readString, bundle2, 2));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) v6.a.k(parcel, Bundle.CREATOR);
                if (iVar != null) {
                    handler.post(new a(this, bundle3, 3));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String readString2 = parcel.readString();
                Bundle bundle4 = (Bundle) v6.a.k(parcel, Bundle.CREATOR);
                if (iVar != null) {
                    handler.post(new a(this, readString2, bundle4, 4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int readInt2 = parcel.readInt();
                Uri uri = (Uri) v6.a.k(parcel, Uri.CREATOR);
                boolean z10 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) v6.a.k(parcel, Bundle.CREATOR);
                if (iVar != null) {
                    handler.post(new a(this, readInt2, uri, z10, bundle5));
                    return true;
                }
                return true;
            case 7:
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 8:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                Bundle bundle6 = (Bundle) v6.a.k(parcel, Bundle.CREATOR);
                if (iVar != null) {
                    handler.post(new a(this, readInt3, readInt4, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) v6.a.k(parcel, Bundle.CREATOR);
                if (iVar != null) {
                    handler.post(new a(this, bundle7, 7));
                    return true;
                }
                return true;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Bundle bundle8 = (Bundle) v6.a.k(parcel, Bundle.CREATOR);
                if (iVar != null) {
                    handler.post(new a(this, readInt5, readInt6, readInt7, readInt8, readInt9, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) v6.a.k(parcel, Bundle.CREATOR);
                if (iVar != null) {
                    handler.post(new a(this, bundle9, 9));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) v6.a.k(parcel, Bundle.CREATOR);
                if (iVar != null) {
                    handler.post(new a(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
