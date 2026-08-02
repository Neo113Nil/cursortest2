package t2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import java.util.ArrayList;

/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5033b extends AbstractBinderC3359i8 implements InterfaceC5034c {
    public static InterfaceC5034c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
        return queryLocalInterface instanceof InterfaceC5034c ? (InterfaceC5034c) queryLocalInterface : new C5032a(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper", 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        g fVar;
        e eVar = null;
        g gVar = null;
        if (i == 1) {
            Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
                eVar = queryLocalInterface instanceof e ? (e) queryLocalInterface : new C5035d(readStrongBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback", 1);
            }
            AbstractC3411j8.f(parcel);
            prewarm(t02, createTypedArrayList, eVar);
        } else if (i == 2) {
            Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
            String readString = parcel.readString();
            AbstractC3411j8.f(parcel);
            endSession(t03, readString);
        } else {
            if (i != 3) {
                return false;
            }
            Y2.a t04 = Y2.b.t0(parcel.readStrongBinder());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
            boolean z6 = parcel.readInt() != 0;
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
                if (queryLocalInterface2 instanceof g) {
                    gVar = (g) queryLocalInterface2;
                } else {
                    fVar = new f(readStrongBinder2, "com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback", 1);
                    AbstractC3411j8.f(parcel);
                    open(t04, readString2, readString3, bundle, z6, fVar);
                }
            }
            fVar = gVar;
            AbstractC3411j8.f(parcel);
            open(t04, readString2, readString3, bundle, z6, fVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
