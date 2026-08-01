package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.qd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3788qd extends AbstractBinderC3336i8 implements InterfaceC3841rd {
    public AbstractBinderC3788qd() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC3841rd U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof InterfaceC3841rd ? (InterfaceC3841rd) queryLocalInterface : new C3734pd(iBinder);
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
                int readInt = parcel.readInt();
                AbstractC3388j8.f(parcel);
                j0(readInt);
                break;
            case 4:
                g();
                break;
            case 5:
                n();
                break;
            case 6:
                j();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                AbstractC3388j8.f(parcel);
                break;
            case 8:
                k();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC3388j8.f(parcel);
                p3(readString, readString2);
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    boolean z3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd") instanceof InterfaceC2515Db;
                }
                parcel.readString();
                AbstractC3388j8.f(parcel);
                break;
            case 11:
                p();
                break;
            case 12:
                parcel.readString();
                AbstractC3388j8.f(parcel);
                break;
            case 13:
                E();
                break;
            case 14:
                C3091df c3091df = (C3091df) AbstractC3388j8.b(parcel, C3091df.CREATOR);
                AbstractC3388j8.f(parcel);
                o3(c3091df);
                break;
            case 15:
                m();
                break;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    c3144ef = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c3144ef = queryLocalInterface instanceof InterfaceC3198ff ? (InterfaceC3198ff) queryLocalInterface : new C3144ef(readStrongBinder3);
                }
                AbstractC3388j8.f(parcel);
                x0(c3144ef);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                AbstractC3388j8.f(parcel);
                T(readInt2);
                break;
            case 18:
                p2();
                break;
            case 19:
                AbstractC3388j8.f(parcel);
                break;
            case 20:
                y();
                break;
            case 21:
                String readString3 = parcel.readString();
                AbstractC3388j8.f(parcel);
                U(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                AbstractC3388j8.f(parcel);
                O3(readInt3, readString4);
                break;
            case 23:
                C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
                AbstractC3388j8.f(parcel);
                n3(c4920z0);
                break;
            case 24:
                C4920z0 c4920z02 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
                AbstractC3388j8.f(parcel);
                b1(c4920z02);
                break;
            case 25:
                u();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
