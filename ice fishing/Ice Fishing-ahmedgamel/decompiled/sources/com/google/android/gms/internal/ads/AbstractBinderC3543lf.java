package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.lf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3543lf extends AbstractBinderC3359i8 implements InterfaceC3597mf {
    public AbstractBinderC3543lf() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3221ff c3167ef;
        switch (i) {
            case 1:
                d();
                break;
            case 2:
                e();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c3167ef = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c3167ef = queryLocalInterface instanceof InterfaceC3221ff ? (InterfaceC3221ff) queryLocalInterface : new C3167ef(readStrongBinder);
                }
                AbstractC3411j8.f(parcel);
                o1(c3167ef);
                break;
            case 4:
                int readInt = parcel.readInt();
                AbstractC3411j8.f(parcel);
                D(readInt);
                break;
            case 5:
                C4969z0 c4969z0 = (C4969z0) AbstractC3411j8.b(parcel, C4969z0.CREATOR);
                AbstractC3411j8.f(parcel);
                n1(c4969z0);
                break;
            case 6:
                j();
                break;
            case 7:
                k();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
