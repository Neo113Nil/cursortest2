package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.qd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3811qd extends AbstractBinderC3359i8 implements InterfaceC3864rd {
    public AbstractBinderC3811qd() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC3864rd U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof InterfaceC3864rd ? (InterfaceC3864rd) queryLocalInterface : new C3757pd(iBinder);
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
                int readInt = parcel.readInt();
                AbstractC3411j8.f(parcel);
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
                AbstractC3411j8.f(parcel);
                break;
            case 8:
                k();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC3411j8.f(parcel);
                k3(readString, readString2);
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    boolean z6 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd") instanceof InterfaceC2535Db;
                }
                parcel.readString();
                AbstractC3411j8.f(parcel);
                break;
            case 11:
                p();
                break;
            case 12:
                parcel.readString();
                AbstractC3411j8.f(parcel);
                break;
            case 13:
                E();
                break;
            case 14:
                C3114df c3114df = (C3114df) AbstractC3411j8.b(parcel, C3114df.CREATOR);
                AbstractC3411j8.f(parcel);
                h3(c3114df);
                break;
            case 15:
                m();
                break;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    c3167ef = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c3167ef = queryLocalInterface instanceof InterfaceC3221ff ? (InterfaceC3221ff) queryLocalInterface : new C3167ef(readStrongBinder3);
                }
                AbstractC3411j8.f(parcel);
                u0(c3167ef);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                T(readInt2);
                break;
            case 18:
                i2();
                break;
            case 19:
                AbstractC3411j8.f(parcel);
                break;
            case 20:
                y();
                break;
            case 21:
                String readString3 = parcel.readString();
                AbstractC3411j8.f(parcel);
                U(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                AbstractC3411j8.f(parcel);
                N3(readInt3, readString4);
                break;
            case 23:
                C4969z0 c4969z0 = (C4969z0) AbstractC3411j8.b(parcel, C4969z0.CREATOR);
                AbstractC3411j8.f(parcel);
                r0(c4969z0);
                break;
            case 24:
                C4969z0 c4969z02 = (C4969z0) AbstractC3411j8.b(parcel, C4969z0.CREATOR);
                AbstractC3411j8.f(parcel);
                N1(c4969z02);
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
