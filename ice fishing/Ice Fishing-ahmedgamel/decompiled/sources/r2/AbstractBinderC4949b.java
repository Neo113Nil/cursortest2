package r2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import java.util.ArrayList;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4949b extends AbstractBinderC3336i8 implements InterfaceC4950c {
    public static InterfaceC4950c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
        return queryLocalInterface instanceof InterfaceC4950c ? (InterfaceC4950c) queryLocalInterface : new C4948a(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper", 2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        g fVar;
        e eVar = null;
        g gVar = null;
        if (i == 1) {
            W2.a w02 = W2.b.w0(parcel.readStrongBinder());
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
                eVar = queryLocalInterface instanceof e ? (e) queryLocalInterface : new C4951d(readStrongBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback", 2);
            }
            AbstractC3388j8.f(parcel);
            prewarm(w02, createTypedArrayList, eVar);
        } else if (i == 2) {
            W2.a w03 = W2.b.w0(parcel.readStrongBinder());
            String readString = parcel.readString();
            AbstractC3388j8.f(parcel);
            endSession(w03, readString);
        } else {
            if (i != 3) {
                return false;
            }
            W2.a w04 = W2.b.w0(parcel.readStrongBinder());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
            boolean z3 = parcel.readInt() != 0;
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
                if (queryLocalInterface2 instanceof g) {
                    gVar = (g) queryLocalInterface2;
                } else {
                    fVar = new f(readStrongBinder2, "com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback", 2);
                    AbstractC3388j8.f(parcel);
                    open(w04, readString2, readString3, bundle, z3, fVar);
                }
            }
            fVar = gVar;
            AbstractC3388j8.f(parcel);
            open(w04, readString2, readString3, bundle, z3, fVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
