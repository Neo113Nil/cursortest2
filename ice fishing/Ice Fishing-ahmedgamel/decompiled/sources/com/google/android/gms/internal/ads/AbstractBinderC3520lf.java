package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.lf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3520lf extends AbstractBinderC3336i8 implements InterfaceC3574mf {
    public AbstractBinderC3520lf() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3198ff c3144ef;
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
                    c3144ef = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c3144ef = queryLocalInterface instanceof InterfaceC3198ff ? (InterfaceC3198ff) queryLocalInterface : new C3144ef(readStrongBinder);
                }
                AbstractC3388j8.f(parcel);
                o1(c3144ef);
                break;
            case 4:
                int readInt = parcel.readInt();
                AbstractC3388j8.f(parcel);
                D(readInt);
                break;
            case 5:
                C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
                AbstractC3388j8.f(parcel);
                K0(c4920z0);
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
