package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class mkh extends Binder implements x8e {
    public static final /* synthetic */ int h = 0;
    public final WeakReference a;

    public mkh(zlh zlhVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(zlhVar);
    }

    @Override // defpackage.x8e
    public final void B(int i) {
        zlh zlhVar = (zlh) this.a.get();
        if (zlhVar != null) {
            zlhVar.i(12, Integer.valueOf(i), null);
        }
    }

    @Override // defpackage.x8e
    public final void b(int i) {
        zlh zlhVar = (zlh) this.a.get();
        if (zlhVar != null) {
            zlhVar.i(9, Integer.valueOf(i), null);
        }
    }

    @Override // defpackage.x8e
    public final void f(i6l i6lVar) {
        zlh zlhVar = (zlh) this.a.get();
        if (zlhVar != null) {
            zlhVar.i(2, i6lVar, null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                String readString = parcel.readString();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                zlh zlhVar = (zlh) this.a.get();
                if (zlhVar != null) {
                    zlhVar.i(1, readString, bundle);
                }
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                wvs.b();
                return false;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                f(parcel.readInt() != 0 ? i6l.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    ioh.CREATOR.createFromParcel(parcel);
                }
                wvs.b();
                return false;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.createTypedArrayList(ksh.CREATOR);
                wvs.b();
                return false;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                }
                wvs.b();
                return false;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                }
                wvs.b();
                return false;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    y6k.CREATOR.createFromParcel(parcel);
                }
                wvs.b();
                return false;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                b(parcel.readInt());
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean z = parcel.readInt() != 0;
                zlh zlhVar2 = (zlh) this.a.get();
                if (zlhVar2 != null) {
                    zlhVar2.i(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                B(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                zlh zlhVar3 = (zlh) this.a.get();
                if (zlhVar3 != null) {
                    zlhVar3.i(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
