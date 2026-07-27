package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ye, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2874Ye extends AbstractBinderC3186f8 implements InterfaceC2891Ze {
    public AbstractBinderC2874Ye() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                h2(u02);
                break;
            case 2:
                V2.a u03 = V2.b.u0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC3241g8.f(parcel);
                k0(u03, readInt);
                break;
            case 3:
                V2.a u04 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                V(u04);
                break;
            case 4:
                V2.a u05 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                Q(u05);
                break;
            case 5:
                V2.a u06 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                z0(u06);
                break;
            case 6:
                V2.a u07 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                s3(u07);
                break;
            case 7:
                V2.a u08 = V2.b.u0(parcel.readStrongBinder());
                C2938af c2938af = (C2938af) AbstractC3241g8.b(parcel, C2938af.CREATOR);
                AbstractC3241g8.f(parcel);
                V1(u08, c2938af);
                break;
            case 8:
                V2.a u09 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                L2(u09);
                break;
            case 9:
                V2.a u010 = V2.b.u0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                S2(u010, readInt2);
                break;
            case 10:
                V2.a u011 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                F(u011);
                break;
            case 11:
                V2.a u012 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                B1(u012);
                break;
            case 12:
                AbstractC3241g8.f(parcel);
                break;
            case 13:
                V2.a u013 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                e1(u013);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
