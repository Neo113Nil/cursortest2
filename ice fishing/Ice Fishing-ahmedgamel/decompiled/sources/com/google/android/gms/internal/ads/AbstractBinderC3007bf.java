package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.bf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3007bf extends AbstractBinderC3359i8 implements InterfaceC3060cf {
    public AbstractBinderC3007bf() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                s3(t02);
                break;
            case 2:
                Y2.b.t0(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC3411j8.f(parcel);
                V2();
                break;
            case 3:
                Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                D2(t03);
                break;
            case 4:
                Y2.a t04 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                f0(t04);
                break;
            case 5:
                Y2.a t05 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                t1(t05);
                break;
            case 6:
                Y2.a t06 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                Z1(t06);
                break;
            case 7:
                Y2.a t07 = Y2.b.t0(parcel.readStrongBinder());
                C3114df c3114df = (C3114df) AbstractC3411j8.b(parcel, C3114df.CREATOR);
                AbstractC3411j8.f(parcel);
                F1(t07, c3114df);
                break;
            case 8:
                Y2.a t08 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                Y0(t08);
                break;
            case 9:
                Y2.a t09 = Y2.b.t0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC3411j8.f(parcel);
                L1(t09, readInt);
                break;
            case 10:
                Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                v1();
                break;
            case 11:
                Y2.a t010 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                p2(t010);
                break;
            case 12:
                AbstractC3411j8.f(parcel);
                break;
            case 13:
                Y2.a t011 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                J2(t011);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
