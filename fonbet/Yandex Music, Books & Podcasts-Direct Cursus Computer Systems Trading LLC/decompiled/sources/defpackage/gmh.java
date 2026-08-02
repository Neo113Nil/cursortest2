package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public final class gmh extends Binder implements u8e {
    public final WeakReference a;

    public gmh(ulh ulhVar) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.a = new WeakReference(ulhVar);
    }

    public static u8e R(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof u8e)) {
            return (u8e) queryLocalInterface;
        }
        t8e t8eVar = new t8e();
        t8eVar.a = iBinder;
        return t8eVar;
    }

    @Override // defpackage.u8e
    public final void C0(int i, Bundle bundle) {
        if (bundle == null) {
            vq1.n0("MediaControllerStub", "Ignoring null Bundle for extras");
        } else {
            X(new emh(bundle));
        }
    }

    @Override // defpackage.u8e
    public final void D0(List list, int i) {
        if (list == null) {
            return;
        }
        try {
            int p0 = p0();
            if (p0 == -1) {
                return;
            }
            tde u = yde.u();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Bundle bundle = (Bundle) list.get(i2);
                bundle.getClass();
                u.a(tb5.d(p0, bundle));
            }
            X(new jrb(i, u.f(), 4));
        } catch (RuntimeException e) {
            vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e);
        }
    }

    @Override // defpackage.u8e
    public final void E0(int i, Bundle bundle, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(pdl.d, z);
        bundle2.putBoolean(pdl.e, true);
        h0(i, bundle, bundle2);
    }

    public final void L0(int i, Object obj) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ulh ulhVar = (ulh) this.a.get();
            if (ulhVar == null) {
                return;
            }
            ulhVar.b.e(i, obj);
            ulhVar.a.j1(new no0(ulhVar, i, 2));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // defpackage.u8e
    public final void S(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            L0(i, ump.a(bundle));
        } catch (RuntimeException e) {
            vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    public final void X(fmh fmhVar) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ulh ulhVar = (ulh) this.a.get();
            if (ulhVar == null) {
                return;
            }
            dvt.c0(ulhVar.a.e, new juc(17, ulhVar, fmhVar));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // defpackage.u8e
    public final void a(int i) {
        X(new dlh(2));
    }

    @Override // defpackage.u8e
    public final void d() {
        X(new dlh(3));
    }

    @Override // defpackage.u8e
    public final void d0(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            X(new cmh(d8l.b(bundle)));
        } catch (RuntimeException e) {
            vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // defpackage.u8e
    public final void e0(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            X(new uvg(7, tmp.b(bundle)));
        } catch (RuntimeException e) {
            vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // defpackage.u8e
    public final void f0(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            vq1.n0("MediaControllerStub", "Ignoring custom command with null args.");
            return;
        }
        try {
            X(new jrb(i, alp.a(bundle), bundle2));
        } catch (RuntimeException e) {
            vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.u8e
    public final void h(List list, int i) {
        if (list == null) {
            return;
        }
        try {
            int p0 = p0();
            if (p0 == -1) {
                return;
            }
            tde u = yde.u();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Bundle bundle = (Bundle) list.get(i2);
                bundle.getClass();
                u.a(tb5.d(p0, bundle));
            }
            X(new jrb(i, u.f(), 3));
        } catch (RuntimeException e) {
            vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e);
        }
    }

    @Override // defpackage.u8e
    public final void h0(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int p0 = p0();
            if (p0 == -1) {
                return;
            }
            try {
                X(new v13(24, rdl.r(p0, bundle), new pdl(bundle2.getBoolean(pdl.d, false), bundle2.getBoolean(pdl.e, false))));
            } catch (RuntimeException e) {
                vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (RuntimeException e2) {
            vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    @Override // defpackage.u8e
    public final void k(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            X(new uvg(9, p66.a(bundle)));
        } catch (RuntimeException e) {
            vq1.o0("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            d();
        }
    }

    @Override // defpackage.u8e
    public final void l0(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            try {
                X(new dmh(blp.a(bundle), d8l.b(bundle2)));
            } catch (RuntimeException e) {
                vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
            }
        } catch (RuntimeException e2) {
            vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e2);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int readInt;
        String str;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i == 4001) {
            parcel.readInt();
            String readString = parcel.readString();
            readInt = parcel.readInt();
            Bundle bundle = (Bundle) zc4.n(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(readString)) {
                vq1.n0("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
            } else if (readInt < 0) {
                str = "onChildrenChanged(): Ignoring negative itemCount: ";
            } else {
                if (bundle != null) {
                    try {
                        znh.a(bundle);
                    } catch (RuntimeException e) {
                        vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e);
                    }
                }
                X(new dlh(4));
            }
            return true;
        }
        if (i != 4002) {
            switch (i) {
                case 3001:
                    k(parcel.readInt(), (Bundle) zc4.n(parcel, Bundle.CREATOR));
                    return true;
                case 3002:
                    S(parcel.readInt(), (Bundle) zc4.n(parcel, Bundle.CREATOR));
                    return true;
                case 3003:
                    y(parcel.readInt(), (Bundle) zc4.n(parcel, Bundle.CREATOR));
                    return true;
                case 3004:
                    D0(parcel.createTypedArrayList(Bundle.CREATOR), parcel.readInt());
                    return true;
                case 3005:
                    int readInt2 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    f0(readInt2, (Bundle) zc4.n(parcel, creator), (Bundle) zc4.n(parcel, creator));
                    return true;
                case 3006:
                    parcel.readInt();
                    d();
                    return true;
                case 3007:
                    E0(parcel.readInt(), (Bundle) zc4.n(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case 3008:
                    e0(parcel.readInt(), (Bundle) zc4.n(parcel, Bundle.CREATOR));
                    return true;
                case 3009:
                    d0(parcel.readInt(), (Bundle) zc4.n(parcel, Bundle.CREATOR));
                    return true;
                case 3010:
                    int readInt3 = parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    l0(readInt3, (Bundle) zc4.n(parcel, creator2), (Bundle) zc4.n(parcel, creator2));
                    return true;
                case 3011:
                    a(parcel.readInt());
                    return true;
                case 3012:
                    C0(parcel.readInt(), (Bundle) zc4.n(parcel, Bundle.CREATOR));
                    return true;
                case 3013:
                    int readInt4 = parcel.readInt();
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    h0(readInt4, (Bundle) zc4.n(parcel, creator3), (Bundle) zc4.n(parcel, creator3));
                    return true;
                case 3014:
                    X(new uvg(parcel.readInt(), (PendingIntent) zc4.n(parcel, PendingIntent.CREATOR)));
                    return true;
                case 3015:
                    parcel.readInt();
                    try {
                        qlp.a((Bundle) zc4.n(parcel, Bundle.CREATOR));
                        X(new dlh(1));
                        break;
                    } catch (RuntimeException e2) {
                        vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e2);
                        break;
                    }
                case 3016:
                    h(parcel.createTypedArrayList(Bundle.CREATOR), parcel.readInt());
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel.readInt();
            String readString2 = parcel.readString();
            readInt = parcel.readInt();
            Bundle bundle2 = (Bundle) zc4.n(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(readString2)) {
                vq1.n0("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
            } else if (readInt < 0) {
                str = "onSearchResultChanged(): Ignoring negative itemCount: ";
            } else {
                if (bundle2 != null) {
                    try {
                        znh.a(bundle2);
                    } catch (RuntimeException e3) {
                        vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e3);
                    }
                }
                X(new dlh(4));
            }
        }
        return true;
        dfi.o(readInt, str, "MediaControllerStub");
        return true;
    }

    public final int p0() {
        bnp bnpVar;
        ulh ulhVar = (ulh) this.a.get();
        if (ulhVar == null || (bnpVar = ulhVar.l) == null) {
            return -1;
        }
        return bnpVar.a.v();
    }

    @Override // defpackage.u8e
    public final void y(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            L0(i, vxf.a(bundle));
        } catch (RuntimeException e) {
            vq1.o0("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
