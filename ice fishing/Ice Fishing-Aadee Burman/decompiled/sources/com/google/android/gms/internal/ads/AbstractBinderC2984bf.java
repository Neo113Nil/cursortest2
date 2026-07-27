package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.bf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2984bf extends AbstractBinderC3336i8 implements InterfaceC3037cf {
    public AbstractBinderC2984bf() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                z3(w02);
                break;
            case 2:
                W2.b.w0(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC3388j8.f(parcel);
                b3();
                break;
            case 3:
                W2.a w03 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                L2(w03);
                break;
            case 4:
                W2.a w04 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                Y(w04);
                break;
            case 5:
                W2.a w05 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                O1(w05);
                break;
            case 6:
                W2.a w06 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                T1(w06);
                break;
            case 7:
                W2.a w07 = W2.b.w0(parcel.readStrongBinder());
                C3091df c3091df = (C3091df) AbstractC3388j8.b(parcel, C3091df.CREATOR);
                AbstractC3388j8.f(parcel);
                u1(w07, c3091df);
                break;
            case 8:
                W2.a w08 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                W0(w08);
                break;
            case 9:
                W2.a w09 = W2.b.w0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC3388j8.f(parcel);
                q0(w09, readInt);
                break;
            case 10:
                W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                D1();
                break;
            case 11:
                W2.a w010 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                v3(w010);
                break;
            case 12:
                AbstractC3388j8.f(parcel);
                break;
            case 13:
                W2.a w011 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                X2(w011);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
